package com.chernowii.camcontrol.camera.goproAPI.model

import com.google.gson.annotations.SerializedName

data class GPStatusResponse  (
        @SerializedName("status") val status: Status,
        @SerializedName("settings") val settings: Settings
) {
    override fun toString(): String {
        return "GPStatusResponse(status=$status, settings=$settings)"
    }
}

/*
 * TODO: status.39 is unclear as it has 2 descritpions:
 *  https://github.com/watchingJu/goprowifihack/blob/master/HERO4/CameraStatus.md
 * Ms == multishot
 */
    data class Status(
            @SerializedName("1") val intBatteryAvailable: Int,
            @SerializedName("2") val intBatteryLevel: Int,
            @SerializedName("3") val externalBatteryPresent: Int,
            @SerializedName("4") val externalBatteryLevel: Int,
            @SerializedName("6") val systemHot: Int,
            @SerializedName("8") val recordingStatus: Int,
            @SerializedName("9") val quickCaptureActive: Int,
            @SerializedName("10") val encodingActive: Int,
            @SerializedName("11") val lcdLockActive: Int,
            @SerializedName("13") val currentRecordingVideoDuration: Int,
            @SerializedName("14") val broadcstProgressCounter: Int,
            @SerializedName("15") val broadcastViewersCounter: Int,
            @SerializedName("16") val broadcastBStatus: Int,
            @SerializedName("17") val wirelessEnabled: Int,
            @SerializedName("19") val wirelessState: Int,
            @SerializedName("20") val wirelessType: Int,
            @SerializedName("21") val wirelessPairTime: Int,
            @SerializedName("22") val wirelessScanState: Int,
            @SerializedName("23") val wirelessScanTime: Int,
            @SerializedName("24") val wirelessProvisionStatus: Int,
            @SerializedName("26") val wirelessRemoteControlVersion: Int,
            @SerializedName("27") val wirelessRemoteControlConnected: Int,
            @SerializedName("28") val wirelessPairing: Int,
            @SerializedName("29") val wirelessWlanSsid: String,
            @SerializedName("30") val wirelessApSsid: String,
            @SerializedName("31") val numberOfClientsConnected: Int,
            @SerializedName("32") val streamingFeedStatus: Int,
            @SerializedName("33") val sdCardInserted: Int,
            @SerializedName("34") val remainingPhotos: Int,
            @SerializedName("35") val remainingVideoTime: Int,
            @SerializedName("36") val numberOfBatchPhotosTaken: Int,
            @SerializedName("37") val numberOfVideosShot: Int,
            @SerializedName("38") val numberOfAllPhotosTaken: Int,
            @SerializedName("39") val numberOfAllVideosTaken: Int,
            @SerializedName("40") val dateTimeHex: String,
            @SerializedName("41") val fwupdateOtaStatus: Int,
            @SerializedName("42") val fwupdateDlCancelPending: Int,
            @SerializedName("43") val currentMode: Int,
            @SerializedName("44") val currentSubMode: Int,
            @SerializedName("45") val cameraLockActive: Int,
            @SerializedName("46") val videoProtuneDefault: Int,
            @SerializedName("47") val photoProtuneDefault: Int,
            @SerializedName("48") val msProtuneDefault: Int,
            @SerializedName("49") val multiShotCountdown: Int,
            @SerializedName("54") val remainingFreeSpace: Int,
            @SerializedName("55") val streamSupported: Int,
            @SerializedName("56") val wirelessWifiBars: Int,
            @SerializedName("57") val currentTimeMs: Int,
            @SerializedName("58") val storageNumHighlights: Int,
            @SerializedName("59") val storageLastHighlightTimeMs: Int
    ) {
    override fun toString(): String {
        return "Status(intBatteryAvailable=$intBatteryAvailable, intBatteryLevel=$intBatteryLevel, externalBatteryPresent=$externalBatteryPresent, externalBatteryLevel=$externalBatteryLevel, systemHot=$systemHot, recordingStatus=$recordingStatus, quickCaptureActive=$quickCaptureActive, encodingActive=$encodingActive, lcdLockActive=$lcdLockActive, currentRecordingVideoDuration=$currentRecordingVideoDuration, broadcstProgressCounter=$broadcstProgressCounter, broadcastViewersCounter=$broadcastViewersCounter, broadcastBStatus=$broadcastBStatus, wirelessEnabled=$wirelessEnabled, wirelessState=$wirelessState, wirelessType=$wirelessType, wirelessPairTime=$wirelessPairTime, wirelessScanState=$wirelessScanState, wirelessScanTime=$wirelessScanTime, wirelessProvisionStatus=$wirelessProvisionStatus, wirelessRemoteControlVersion=$wirelessRemoteControlVersion, wirelessRemoteControlConnected=$wirelessRemoteControlConnected, wirelessPairing=$wirelessPairing, wirelessWlanSsid='$wirelessWlanSsid', wirelessApSsid='$wirelessApSsid', numberOfClientsConnected=$numberOfClientsConnected, streamingFeedStatus=$streamingFeedStatus, sdCardInserted=$sdCardInserted, remainingPhotos=$remainingPhotos, remainingVideoTime=$remainingVideoTime, numberOfBatchPhotosTaken=$numberOfBatchPhotosTaken, numberOfVideosShot=$numberOfVideosShot, numberOfAllPhotosTaken=$numberOfAllPhotosTaken, numberOfAllVideosTaken=$numberOfAllVideosTaken, dateTimeHex='$dateTimeHex', fwupdateOtaStatus=$fwupdateOtaStatus, fwupdateDlCancelPending=$fwupdateDlCancelPending, currentMode=$currentMode, currentSubMode=$currentSubMode, cameraLockActive=$cameraLockActive, videoProtuneDefault=$videoProtuneDefault, photoProtuneDefault=$photoProtuneDefault, msProtuneDefault=$msProtuneDefault, multiShotCountdown=$multiShotCountdown, remainingFreeSpace=$remainingFreeSpace, streamSupported=$streamSupported, wirelessWifiBars=$wirelessWifiBars, currentTimeMs=$currentTimeMs, storageNumHighlights=$storageNumHighlights, storageLastHighlightTimeMs=$storageLastHighlightTimeMs)"
    }
}

data class Settings (
            @SerializedName("1") val defaultVideoSubMode: Int,
            @SerializedName("2") val videoResolution: Int,
            @SerializedName("3") val frameRate: Int,
            @SerializedName("4") val fovVideo: Int,
            @SerializedName("5") val timelapsVideoInterval: Int,
            @SerializedName("6") val loopingVideoInterval: Int,
            @SerializedName("7") val photoVideoInterval: Int,
            @SerializedName("8") val lowLight: Int,
            @SerializedName("9") val spotMeterVideo: Int,
            @SerializedName("10") val protuneVideo: Int,
            @SerializedName("11") val whiteBalanceVideo: Int,
            @SerializedName("12") val colorVideo: Int,
            @SerializedName("13") val isoLimitVideo: Int,
            @SerializedName("14") val sharpnessVideo: Int,
            @SerializedName("15") val evCompVideo: Int,
            @SerializedName("16") val unknown_16: Int,
            @SerializedName("17") val megapixelsPhoto: Int,
            @SerializedName("18") val continousMode: Int,
            @SerializedName("19") val shutter: Int,
            @SerializedName("20") val spotMeterPhoto: Int,
            @SerializedName("21") val protunePhoto: Int,
            @SerializedName("22") val whiteBalancePhoto: Int,
            @SerializedName("23") val colorPhoto: Int,
            @SerializedName("24") val isoLimitPhoto: Int,
            @SerializedName("25") val sharpnessPhoto: Int,
            @SerializedName("26") val evCompPhoto: Int,
            @SerializedName("27") val defaultMultishotSubMode: Int,
            @SerializedName("28") val megapixelsMs: Int,
            @SerializedName("29") val burstRateMs: Int,
            @SerializedName("30") val timelapsIntervalMs: Int,
            @SerializedName("31") val nightShutterExposureMs: Int,
            @SerializedName("32") val nightlapsIntervalMs: Int,
            @SerializedName("33") val spotMeterMs: Int,
            @SerializedName("34") val protuneMs: Int,
            @SerializedName("35") val whiteBalanceMs: Int,
            @SerializedName("36") val colorMs: Int,
            @SerializedName("37") val isoLimitMs: Int,
            @SerializedName("38") val sharpnessMs: Int,
            @SerializedName("39") val evCompMs: Int,
            @SerializedName("40") val unknown_40: Int,
            @SerializedName("41") val unknown_41: Int,
            @SerializedName("42") val unknown_42: Int,
            @SerializedName("43") val unknown_43: Int,
            @SerializedName("44") val unknown_44: Int,
            @SerializedName("45") val unknown_45: Int,
            @SerializedName("46") val unknown_46: Int,
            @SerializedName("47") val unknown_47: Int,
            @SerializedName("48") val unknown_48: Int,
            @SerializedName("49") val lcdBrightness: Int,
            @SerializedName("50") val lcdLock: Int,
            @SerializedName("51") val lcdTimeoutSleep: Int,
            @SerializedName("52") val orientation: Int,
            @SerializedName("53") val defaultBootMode: Int,
            @SerializedName("54") val quickCapture: Int,
            @SerializedName("55") val ledStatus: Int,
            @SerializedName("56") val volumeBeeps: Int,
            @SerializedName("57") val videoFormat: Int,
            @SerializedName("58") val onScreenData: Int,
            @SerializedName("59") val autoPowerOff: Int,
            @SerializedName("60") val unknown_60: Int,
            @SerializedName("61") val unknown_61: Int,
            @SerializedName("62") val unknown_62: Int,
            @SerializedName("63") val unknown_63: Int,
            @SerializedName("64") val unknown_64: Int,
            @SerializedName("65") val unknown_65: Int,
            @SerializedName("66") val unknown_66: Int,
            @SerializedName("67") val unknown_67: Int,
            @SerializedName("68") val currentVideoSubMode: Int,
            @SerializedName("69") val photoSubMode: Int,
            @SerializedName("70") val multishotSubMode: Int,
            @SerializedName("71") val unknown_71: Int,
            @SerializedName("72") val lcdDisplay: Int
            // @SerializedName("73") val manualExposure: Int
            // @SerializedName("74") val isoMode: Int
            // @SerializedName("75") val isoMinPhoto: Int
            // @SerializedName("76") val isoMinMs: Int
    ) {
    override fun toString(): String {
        return "Settings(defaultVideoSubMode=$defaultVideoSubMode, videoResolution=$videoResolution, frameRate=$frameRate, fovVideo=$fovVideo, timelapsVideoInterval=$timelapsVideoInterval, loopingVideoInterval=$loopingVideoInterval, photoVideoInterval=$photoVideoInterval, lowLight=$lowLight, spotMeterVideo=$spotMeterVideo, protuneVideo=$protuneVideo, whiteBalanceVideo=$whiteBalanceVideo, colorVideo=$colorVideo, isoLimitVideo=$isoLimitVideo, sharpnessVideo=$sharpnessVideo, evCompVideo=$evCompVideo, unknown_16=$unknown_16, megapixelsPhoto=$megapixelsPhoto, continousMode=$continousMode, shutter=$shutter, spotMeterPhoto=$spotMeterPhoto, protunePhoto=$protunePhoto, whiteBalancePhoto=$whiteBalancePhoto, colorPhoto=$colorPhoto, isoLimitPhoto=$isoLimitPhoto, sharpnessPhoto=$sharpnessPhoto, evCompPhoto=$evCompPhoto, defaultMultishotSubMode=$defaultMultishotSubMode, megapixelsMs=$megapixelsMs, burstRateMs=$burstRateMs, timelapsIntervalMs=$timelapsIntervalMs, nightShutterExposureMs=$nightShutterExposureMs, nightlapsIntervalMs=$nightlapsIntervalMs, spotMeterMs=$spotMeterMs, protuneMs=$protuneMs, whiteBalanceMs=$whiteBalanceMs, colorMs=$colorMs, isoLimitMs=$isoLimitMs, sharpnessMs=$sharpnessMs, evCompMs=$evCompMs, unknown_40=$unknown_40, unknown_41=$unknown_41, unknown_42=$unknown_42, unknown_43=$unknown_43, unknown_44=$unknown_44, unknown_45=$unknown_45, unknown_46=$unknown_46, unknown_47=$unknown_47, unknown_48=$unknown_48, lcdBrightness=$lcdBrightness, lcdLock=$lcdLock, lcdTimeoutSleep=$lcdTimeoutSleep, orientation=$orientation, defaultBootMode=$defaultBootMode, quickCapture=$quickCapture, ledStatus=$ledStatus, volumeBeeps=$volumeBeeps, videoFormat=$videoFormat, onScreenData=$onScreenData, autoPowerOff=$autoPowerOff, unknown_60=$unknown_60, unknown_61=$unknown_61, unknown_62=$unknown_62, unknown_63=$unknown_63, unknown_64=$unknown_64, unknown_65=$unknown_65, unknown_66=$unknown_66, unknown_67=$unknown_67, currentVideoSubMode=$currentVideoSubMode, photoSubMode=$photoSubMode, multishotSubMode=$multishotSubMode, unknown_71=$unknown_71, lcdDisplay=$lcdDisplay)"
    }
}