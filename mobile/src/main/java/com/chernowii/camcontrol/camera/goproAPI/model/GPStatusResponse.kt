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
            @SerializedName("3") val unknown_03: Int,
            @SerializedName("4") val unknown_04: Int,
            @SerializedName("6") val unknown_06: Int,
            @SerializedName("8") val recordingStatus: Int,
            @SerializedName("9") val unknown_09: Int,
            @SerializedName("10") val unknown_10: Int,
            @SerializedName("11") val unknown_11: Int,
            @SerializedName("13") val currentRecordingVideoDuration: Int,
            @SerializedName("14") val unknown_14: Int,
            @SerializedName("15") val unknown_15: Int,
            @SerializedName("16") val unknown_16: Int,
            @SerializedName("17") val unknown_17: Int,
            @SerializedName("19") val unknown_19: Int,
            @SerializedName("20") val unknown_20: Int,
            @SerializedName("21") val unknown_21: Int,
            @SerializedName("22") val unknown_22: Int,
            @SerializedName("23") val unknown_23: Int,
            @SerializedName("24") val unknown_24: Int,
            @SerializedName("26") val unknown_26: Int,
            @SerializedName("27") val unknown_27: Int,
            @SerializedName("28") val unknown_28: Int,
            @SerializedName("29") val unknown_29: String,
            @SerializedName("30") val unknown_30: String,
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
            @SerializedName("41") val unknown_41: Int,
            @SerializedName("42") val unknown_42: Int,
            @SerializedName("43") val currentMode: Int,
            @SerializedName("44") val currentSubMode: Int,
            @SerializedName("45") val unknown_45: Int,
            @SerializedName("46") val unknown_46: Int,
            @SerializedName("47") val unknown_47: Int,
            @SerializedName("48") val unknown_48: Int,
            @SerializedName("49") val unknown_49: Int,
            @SerializedName("54") val remainingFreeSpace: Int,
            @SerializedName("55") val unknown_55: Int,
            @SerializedName("56") val unknown_56: Int,
            @SerializedName("57") val unknown_57: Int,
            @SerializedName("58") val unknown_58: Int,
            @SerializedName("59") val unknown_59: Int
    ) {
    override fun toString(): String {
        return "Status(intBatteryAvailable=$intBatteryAvailable, intBatteryLevel=$intBatteryLevel, unknown_03=$unknown_03, unknown_04=$unknown_04, unknown_06=$unknown_06, recordingStatus=$recordingStatus, unknown_09=$unknown_09, unknown_10=$unknown_10, unknown_11=$unknown_11, currentRecordingVideoDuration=$currentRecordingVideoDuration, unknown_14=$unknown_14, unknown_15=$unknown_15, unknown_16=$unknown_16, unknown_17=$unknown_17, unknown_19=$unknown_19, unknown_20=$unknown_20, unknown_21=$unknown_21, unknown_22=$unknown_22, unknown_23=$unknown_23, unknown_24=$unknown_24, unknown_26=$unknown_26, unknown_27=$unknown_27, unknown_28=$unknown_28, unknown_29='$unknown_29', unknown_30='$unknown_30', numberOfClientsConnected=$numberOfClientsConnected, streamingFeedStatus=$streamingFeedStatus, sdCardInserted=$sdCardInserted, remainingPhotos=$remainingPhotos, remainingVideoTime=$remainingVideoTime, numberOfBatchPhotosTaken=$numberOfBatchPhotosTaken, numberOfVideosShot=$numberOfVideosShot, numberOfAllPhotosTaken=$numberOfAllPhotosTaken, numberOfAllVideosTaken=$numberOfAllVideosTaken, dateTimeHex='$dateTimeHex', unknown_41=$unknown_41, unknown_42=$unknown_42, currentMode=$currentMode, currentSubMode=$currentSubMode, unknown_45=$unknown_45, unknown_46=$unknown_46, unknown_47=$unknown_47, unknown_48=$unknown_48, unknown_49=$unknown_49, remainingFreeSpace=$remainingFreeSpace, unknown_55=$unknown_55, unknown_56=$unknown_56, unknown_57=$unknown_57, unknown_58=$unknown_58, unknown_59=$unknown_59)"
    }
}

data class Settings (
            @SerializedName("1") val unknown_01: Int,
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
        return "Settings(unknown_01=$unknown_01, videoResolution=$videoResolution, frameRate=$frameRate, fovVideo=$fovVideo, timelapsVideoInterval=$timelapsVideoInterval, loopingVideoInterval=$loopingVideoInterval, photoVideoInterval=$photoVideoInterval, lowLight=$lowLight, spotMeterVideo=$spotMeterVideo, protuneVideo=$protuneVideo, whiteBalanceVideo=$whiteBalanceVideo, colorVideo=$colorVideo, isoLimitVideo=$isoLimitVideo, sharpnessVideo=$sharpnessVideo, evCompVideo=$evCompVideo, unknown_16=$unknown_16, megapixelsPhoto=$megapixelsPhoto, continousMode=$continousMode, shutter=$shutter, spotMeterPhoto=$spotMeterPhoto, protunePhoto=$protunePhoto, whiteBalancePhoto=$whiteBalancePhoto, colorPhoto=$colorPhoto, isoLimitPhoto=$isoLimitPhoto, sharpnessPhoto=$sharpnessPhoto, evCompPhoto=$evCompPhoto, defaultMultishotSubMode=$defaultMultishotSubMode, megapixelsMs=$megapixelsMs, burstRateMs=$burstRateMs, timelapsIntervalMs=$timelapsIntervalMs, nightShutterExposureMs=$nightShutterExposureMs, nightlapsIntervalMs=$nightlapsIntervalMs, spotMeterMs=$spotMeterMs, protuneMs=$protuneMs, whiteBalanceMs=$whiteBalanceMs, colorMs=$colorMs, isoLimitMs=$isoLimitMs, sharpnessMs=$sharpnessMs, evCompMs=$evCompMs, unknown_40=$unknown_40, unknown_41=$unknown_41, unknown_42=$unknown_42, unknown_43=$unknown_43, unknown_44=$unknown_44, unknown_45=$unknown_45, unknown_46=$unknown_46, unknown_47=$unknown_47, unknown_48=$unknown_48, lcdBrightness=$lcdBrightness, lcdLock=$lcdLock, lcdTimeoutSleep=$lcdTimeoutSleep, orientation=$orientation, defaultBootMode=$defaultBootMode, quickCapture=$quickCapture, ledStatus=$ledStatus, volumeBeeps=$volumeBeeps, videoFormat=$videoFormat, onScreenData=$onScreenData, autoPowerOff=$autoPowerOff, unknown_60=$unknown_60, unknown_61=$unknown_61, unknown_62=$unknown_62, unknown_63=$unknown_63, unknown_64=$unknown_64, unknown_65=$unknown_65, unknown_66=$unknown_66, unknown_67=$unknown_67, currentVideoSubMode=$currentVideoSubMode, photoSubMode=$photoSubMode, multishotSubMode=$multishotSubMode, unknown_71=$unknown_71, lcdDisplay=$lcdDisplay)"
    }
}