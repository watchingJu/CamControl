package com.chernowii.camcontrol.view

import android.app.Activity
import android.content.Context
import android.net.ConnectivityManager
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import com.chernowii.camcontrol.R
import com.chernowii.camcontrol.camera.goproAPI.ApiBase
import com.chernowii.camcontrol.camera.goproAPI.ApiClient
import com.chernowii.camcontrol.camera.goproAPI.model.GPStatusResponse
import com.luseen.spacenavigation.SpaceItem
import com.luseen.spacenavigation.SpaceNavigationView
import com.luseen.spacenavigation.SpaceOnClickListener
import kotlinx.android.synthetic.main.activity_camera.*
import retrofit2.Call
import retrofit2.Response


class CameraActivity : Activity() {

    val TAG = "CameraActivity"

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "view: CameraActivity")

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camera)

        // route requests to wifi and ignore mobile data
        // https://stackoverflow.com/questions/39793705/difference-between-using-java-to-connect-to-an-adhoc-wifi-or-do-it-manually/39962934#39962934
        val connMgr = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        for (network in connMgr.allNetworks) {
            if (connMgr.getNetworkInfo(network).typeName.equals("WIFI")) {
                connMgr.bindProcessToNetwork(network)
            }
        }

        // val cameraId = intent.getSerializableExtra("camera")
        val cameraImage:Int = intent.getLongExtra("cameraImage", 0).toInt()

        val spaceNavigationView = findViewById<View>(R.id.space) as SpaceNavigationView
        cameraimage.setImageResource(cameraImage)

        spaceNavigationView.initWithSaveInstanceState(savedInstanceState)
        spaceNavigationView.setCentreButtonIcon(R.drawable.ic_preview_btn)
        spaceNavigationView.addSpaceItem(SpaceItem("MEDIA", R.drawable.ic_mediabrowse))
        spaceNavigationView.addSpaceItem(SpaceItem("SETTINGS", R.drawable.ic_controlicon))
        spaceNavigationView.showIconOnly()
        spaceNavigationView.setSpaceItemIconSize(resources.getDimension(R.dimen.bottom_bar_ic).toInt())
        spaceNavigationView.setSpaceBackgroundColor(ContextCompat.getColor(this, R.color.colorPrimary))
        spaceNavigationView.setCentreButtonColor(ContextCompat.getColor(this, R.color.colorAccent))

        spaceNavigationView.setActiveSpaceItemColor(ContextCompat.getColor(this, R.color.space_white))
        spaceNavigationView.setInActiveSpaceItemColor(ContextCompat.getColor(this, R.color.space_white))
        spaceNavigationView.setSpaceOnClickListener(object : SpaceOnClickListener {
            override fun onCentreButtonClick() {
                Log.d(TAG, "onCentreButtonClick:")
                Toast.makeText(this@CameraActivity, "onCentreButtonClick", Toast.LENGTH_SHORT).show()
            }

            override fun onItemClick(itemIndex: Int, itemName: String) {
                Log.d(TAG, "onItemClick: itemIndex=$itemIndex, itemName=$itemName")
                Toast.makeText(this@CameraActivity, "$itemIndex $itemName", Toast.LENGTH_SHORT).show()
            }

            override fun onItemReselected(itemIndex: Int, itemName: String) {
                Log.d(TAG, "onItemReselected: itemIndex=$itemIndex, itemName=$itemName")
                Toast.makeText(this@CameraActivity, "$itemIndex $itemName", Toast.LENGTH_SHORT).show()

                // TODO: wrong place, wants to be moved
                if (itemName == "SETTINGS") {
                    Log.d(TAG, "SETTINGS found")
                    val GoProApi = ApiBase.mainClient.create(ApiClient::class.java)
                    val cameraStatus = GoProApi.getStatus()

                    cameraStatus.enqueue(object : retrofit2.Callback<GPStatusResponse> {

                        override fun onResponse(call: Call<GPStatusResponse>, response: Response<GPStatusResponse>) {
                            Log.d(TAG, response.toString())
                        }

                        override fun onFailure(call: Call<GPStatusResponse>, t: Throwable) {
                            Log.d(TAG, "camera is not reachable")
                            Toast.makeText(this@CameraActivity, "Camera is not reachable", Toast.LENGTH_SHORT).show()
                        }

                    })

                }
            }
        })
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        val spaceNavigationView = findViewById<View>(R.id.space) as SpaceNavigationView
        spaceNavigationView.onSaveInstanceState(outState)
    }
}