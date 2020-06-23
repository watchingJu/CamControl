package com.chernowii.camcontrol.camera.goproAPI.model


import com.google.gson.annotations.SerializedName

/**
 * Data Entity for /gp/gpControl
 */

data class GpControlData(
    @SerializedName("commands")
    val commands: List<Command>,
    @SerializedName("display_hints")
    val displayHints: List<DisplayHint>,
    @SerializedName("filters")
    val filters: List<Filter>,
    @SerializedName("info")
    val info: Info,
    @SerializedName("modes")
    val modes: List<Mode>,
    @SerializedName("services")
    val services: Services,
    @SerializedName("status")
    val status: Status,
    @SerializedName("version")
    val version: Double
) {
    data class Command(
        @SerializedName("display_name")
        val displayName: String,
        @SerializedName("key")
        val key: String,
        @SerializedName("max_length")
        val maxLength: Int,
        @SerializedName("min_length")
        val minLength: Int,
        @SerializedName("regex")
        val regex: String,
        @SerializedName("url")
        val url: String,
        @SerializedName("widget_type")
        val widgetType: String
    )

    data class DisplayHint(
        @SerializedName("commands")
        val commands: List<Command>,
        @SerializedName("display_name")
        val displayName: String,
        @SerializedName("key")
        val key: String,
        @SerializedName("settings")
        val settings: List<Setting>
    ) {
        data class Command(
            @SerializedName("command_key")
            val commandKey: String,
            @SerializedName("precedence")
            val precedence: Int
        )

        data class Setting(
            @SerializedName("precedence")
            val precedence: Int,
            @SerializedName("setting_id")
            val settingId: Int,
            @SerializedName("widget_type")
            val widgetType: String
        )
    }

    data class Filter(
        @SerializedName("activated_by")
        val activatedBy: List<ActivatedBy>,
        @SerializedName("blacklist")
        val blacklist: Blacklist
    ) {
        data class ActivatedBy(
            @SerializedName("setting_id")
            val settingId: Int,
            @SerializedName("setting_value")
            val settingValue: Int
        )

        data class Blacklist(
            @SerializedName("setting_id")
            val settingId: Int,
            @SerializedName("values")
            val values: List<Int>
        )
    }

    data class Info(
        @SerializedName("ap_has_default_credentials")
        val apHasDefaultCredentials: String,
        @SerializedName("ap_mac")
        val apMac: String,
        @SerializedName("ap_ssid")
        val apSsid: String,
        @SerializedName("board_type")
        val boardType: String,
        @SerializedName("firmware_version")
        val firmwareVersion: String,
        @SerializedName("git_sha1")
        val gitSha1: String,
        @SerializedName("model_name")
        val modelName: String,
        @SerializedName("model_number")
        val modelNumber: Int,
        @SerializedName("serial_number")
        val serialNumber: String
    )

    data class Mode(
        @SerializedName("display_name")
        val displayName: String,
        @SerializedName("path_segment")
        val pathSegment: String,
        @SerializedName("settings")
        val settings: List<Setting>,
        @SerializedName("value")
        val value: Int
    ) {
        data class Setting(
            @SerializedName("display_name")
            val displayName: String,
            @SerializedName("id")
            val id: Int,
            @SerializedName("options")
            val options: List<Option>,
            @SerializedName("path_segment")
            val pathSegment: String
        ) {
            data class Option(
                @SerializedName("display_name")
                val displayName: String,
                @SerializedName("value")
                val value: Int
            )
        }
    }

    data class Services(
        @SerializedName("fw_update")
        val fwUpdate: FwUpdate,
        @SerializedName("live_stream_start")
        val liveStreamStart: LiveStreamStart,
        @SerializedName("live_stream_stop")
        val liveStreamStop: LiveStreamStop,
        @SerializedName("media_list")
        val mediaList: MediaList,
        @SerializedName("media_metadata")
        val mediaMetadata: MediaMetadata,
        @SerializedName("platform_auth")
        val platformAuth: PlatformAuth
    ) {
        data class FwUpdate(
            @SerializedName("description")
            val description: String,
            @SerializedName("url")
            val url: String,
            @SerializedName("version")
            val version: Int
        )

        data class LiveStreamStart(
            @SerializedName("description")
            val description: String,
            @SerializedName("url")
            val url: String,
            @SerializedName("version")
            val version: Int
        )

        data class LiveStreamStop(
            @SerializedName("description")
            val description: String,
            @SerializedName("url")
            val url: String,
            @SerializedName("version")
            val version: Int
        )

        data class MediaList(
            @SerializedName("description")
            val description: String,
            @SerializedName("url")
            val url: String,
            @SerializedName("version")
            val version: Int
        )

        data class MediaMetadata(
            @SerializedName("description")
            val description: String,
            @SerializedName("url")
            val url: String,
            @SerializedName("version")
            val version: Int
        )

        data class PlatformAuth(
            @SerializedName("description")
            val description: String,
            @SerializedName("url")
            val url: String,
            @SerializedName("version")
            val version: Int
        )
    }

    data class Status(
        @SerializedName("groups")
        val groups: List<Group>
    ) {
        data class Group(
            @SerializedName("fields")
            val fields: List<Field>,
            @SerializedName("group")
            val group: String
        ) {
            data class Field(
                @SerializedName("id")
                val id: Int,
                @SerializedName("levels")
                val levels: List<String>,
                @SerializedName("name")
                val name: String
            )
        }
    }
}