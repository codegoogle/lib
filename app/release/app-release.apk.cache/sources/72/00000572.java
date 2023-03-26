package com.anythink.core.api;

import com.p7700g.p99005.gl4;

/* loaded from: classes2.dex */
public class ErrorCode {
    public static final String adSourceBidError = "4007";
    public static final String adSourceNotFilledError = "4008";
    public static final String adapterInnerError = "2006";
    public static final String adapterNotExistError = "2002";
    public static final String appIdError = "10003";
    public static final String appIdOrPlaceIdEmpty = "3002";
    public static final String appKeyError = "10001";
    public static final String c2sBiddingCacheError = "2012";
    public static final String contextDestoryError = "4002";
    public static final String dataLevelLowError = "9992";
    public static final String exception = "9999";
    public static final String filterSourceError = "2010";
    public static final String formatError = "3003";
    public static final String httpStatuException = "9990";
    public static final String inPacingError = "2004";
    public static final String inRequestFailPacing = "2007";
    public static final String loadCappingError = "2009";
    public static final String loadFailInPacingError = "2008";
    public static final String loadInShowingFilter = "2011";
    public static final String loadingError = "2005";
    public static final String networkError = "1001";
    public static final String networkFirmIdfilterSourceError = "2013";
    public static final String noADError = "4001";
    public static final String noAdsourceConfig = "4004";
    public static final String noAdsourceConfigInDebugerMode = "4009";
    public static final String noAvailableAdsource = "4005";
    public static final String outOfCapError = "2003";
    public static final String placeStrategyError = "3001";
    public static final String placementAdClose = "4003";
    public static final String placementIdError = "10004";
    public static final String rewardedVideoPlayError = "4006";
    public static final String serverError = "1002";
    public static final String statuError = "9991";
    public static final String timeOutError = "2001";
    public static final String unknown = "-9999";

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static AdError getErrorCode(String str, String str2, String str3) {
        String str4;
        String str5;
        Object obj;
        Object obj2;
        Object obj3;
        str.hashCode();
        int hashCode = str.hashCode();
        Object obj4 = inPacingError;
        Object obj5 = outOfCapError;
        Object obj6 = "2002";
        Object obj7 = timeOutError;
        Object obj8 = serverError;
        switch (hashCode) {
            case 1507424:
                str4 = networkError;
                str5 = inRequestFailPacing;
                obj = loadingError;
                obj2 = adapterInnerError;
                if (str.equals(str4)) {
                    r24 = 0;
                    break;
                }
                break;
            case 1507425:
                str5 = inRequestFailPacing;
                obj = loadingError;
                obj2 = adapterInnerError;
                r24 = str.equals(obj8) ? (char) 1 : (char) 65535;
                obj8 = obj8;
                str4 = networkError;
                break;
            case 1537215:
                str5 = inRequestFailPacing;
                obj = loadingError;
                obj2 = adapterInnerError;
                r24 = str.equals(obj7) ? (char) 2 : (char) 65535;
                obj7 = obj7;
                str4 = networkError;
                break;
            case 1537216:
                str5 = inRequestFailPacing;
                obj = loadingError;
                obj2 = adapterInnerError;
                r24 = str.equals(obj6) ? (char) 3 : (char) 65535;
                obj6 = obj6;
                str4 = networkError;
                break;
            case 1537217:
                str5 = inRequestFailPacing;
                obj = loadingError;
                obj2 = adapterInnerError;
                r24 = str.equals(obj5) ? (char) 4 : (char) 65535;
                obj5 = obj5;
                str4 = networkError;
                break;
            case 1537218:
                str5 = inRequestFailPacing;
                obj = loadingError;
                obj2 = adapterInnerError;
                r24 = str.equals(obj4) ? (char) 5 : (char) 65535;
                obj4 = obj4;
                str4 = networkError;
                break;
            case 1537219:
                obj3 = adapterInnerError;
                str5 = inRequestFailPacing;
                obj = loadingError;
                if (str.equals(obj)) {
                    r24 = 6;
                }
                obj2 = obj3;
                str4 = networkError;
                break;
            case 1537220:
                obj3 = adapterInnerError;
                r24 = str.equals(obj3) ? (char) 7 : (char) 65535;
                str5 = inRequestFailPacing;
                obj = loadingError;
                obj2 = obj3;
                str4 = networkError;
                break;
            case 1537221:
                if (str.equals(inRequestFailPacing)) {
                    r24 = '\b';
                }
                str4 = networkError;
                str5 = inRequestFailPacing;
                obj = loadingError;
                obj2 = adapterInnerError;
                break;
            case 1537222:
                if (str.equals(loadFailInPacingError)) {
                    r24 = '\t';
                }
                str4 = networkError;
                str5 = inRequestFailPacing;
                obj = loadingError;
                obj2 = adapterInnerError;
                break;
            case 1537223:
                if (str.equals(loadCappingError)) {
                    r24 = '\n';
                }
                str4 = networkError;
                str5 = inRequestFailPacing;
                obj = loadingError;
                obj2 = adapterInnerError;
                break;
            case 1537246:
                if (str.equals(loadInShowingFilter)) {
                    r24 = 11;
                }
                str4 = networkError;
                str5 = inRequestFailPacing;
                obj = loadingError;
                obj2 = adapterInnerError;
                break;
            case 1537247:
                if (str.equals(c2sBiddingCacheError)) {
                    r24 = '\f';
                }
                str4 = networkError;
                str5 = inRequestFailPacing;
                obj = loadingError;
                obj2 = adapterInnerError;
                break;
            case 1537248:
                if (str.equals(networkFirmIdfilterSourceError)) {
                    r24 = '\r';
                }
                str4 = networkError;
                str5 = inRequestFailPacing;
                obj = loadingError;
                obj2 = adapterInnerError;
                break;
            case 1567006:
                if (str.equals("3001")) {
                    r24 = 14;
                }
                str4 = networkError;
                str5 = inRequestFailPacing;
                obj = loadingError;
                obj2 = adapterInnerError;
                break;
            case 1567007:
                if (str.equals("3002")) {
                    r24 = 15;
                }
                str4 = networkError;
                str5 = inRequestFailPacing;
                obj = loadingError;
                obj2 = adapterInnerError;
                break;
            case 1567008:
                if (str.equals("3003")) {
                    r24 = 16;
                }
                str4 = networkError;
                str5 = inRequestFailPacing;
                obj = loadingError;
                obj2 = adapterInnerError;
                break;
            case 1596797:
                if (str.equals(noADError)) {
                    r24 = 17;
                }
                str4 = networkError;
                str5 = inRequestFailPacing;
                obj = loadingError;
                obj2 = adapterInnerError;
                break;
            case 1596798:
                if (str.equals(contextDestoryError)) {
                    r24 = 18;
                }
                str4 = networkError;
                str5 = inRequestFailPacing;
                obj = loadingError;
                obj2 = adapterInnerError;
                break;
            case 1596799:
                if (str.equals(placementAdClose)) {
                    r24 = 19;
                }
                str4 = networkError;
                str5 = inRequestFailPacing;
                obj = loadingError;
                obj2 = adapterInnerError;
                break;
            case 1596800:
                if (str.equals(noAdsourceConfig)) {
                    r24 = 20;
                }
                str4 = networkError;
                str5 = inRequestFailPacing;
                obj = loadingError;
                obj2 = adapterInnerError;
                break;
            case 1596801:
                if (str.equals(noAvailableAdsource)) {
                    r24 = 21;
                }
                str4 = networkError;
                str5 = inRequestFailPacing;
                obj = loadingError;
                obj2 = adapterInnerError;
                break;
            case 1596802:
                if (str.equals(rewardedVideoPlayError)) {
                    r24 = 22;
                }
                str4 = networkError;
                str5 = inRequestFailPacing;
                obj = loadingError;
                obj2 = adapterInnerError;
                break;
            case 1596803:
                if (str.equals(adSourceBidError)) {
                    r24 = 23;
                }
                str4 = networkError;
                str5 = inRequestFailPacing;
                obj = loadingError;
                obj2 = adapterInnerError;
                break;
            case 1596804:
                if (str.equals(adSourceNotFilledError)) {
                    r24 = 24;
                }
                str4 = networkError;
                str5 = inRequestFailPacing;
                obj = loadingError;
                obj2 = adapterInnerError;
                break;
            case 1596805:
                if (str.equals(noAdsourceConfigInDebugerMode)) {
                    r24 = 25;
                }
                str4 = networkError;
                str5 = inRequestFailPacing;
                obj = loadingError;
                obj2 = adapterInnerError;
                break;
            case 1754679:
                if (str.equals(httpStatuException)) {
                    r24 = 26;
                }
                str4 = networkError;
                str5 = inRequestFailPacing;
                obj = loadingError;
                obj2 = adapterInnerError;
                break;
            case 1754680:
                if (str.equals(statuError)) {
                    r24 = 27;
                }
                str4 = networkError;
                str5 = inRequestFailPacing;
                obj = loadingError;
                obj2 = adapterInnerError;
                break;
            case 1754681:
                if (str.equals(dataLevelLowError)) {
                    r24 = 28;
                }
                str4 = networkError;
                str5 = inRequestFailPacing;
                obj = loadingError;
                obj2 = adapterInnerError;
                break;
            case 1754688:
                if (str.equals(exception)) {
                    r24 = 29;
                }
                str4 = networkError;
                str5 = inRequestFailPacing;
                obj = loadingError;
                obj2 = adapterInnerError;
                break;
            case 46730162:
                if (str.equals("10001")) {
                    r24 = 30;
                }
                str4 = networkError;
                str5 = inRequestFailPacing;
                obj = loadingError;
                obj2 = adapterInnerError;
                break;
            case 46730164:
                if (str.equals(appIdError)) {
                    r24 = 31;
                }
                str4 = networkError;
                str5 = inRequestFailPacing;
                obj = loadingError;
                obj2 = adapterInnerError;
                break;
            case 46730165:
                if (str.equals(placementIdError)) {
                    r24 = gl4.R;
                }
                str4 = networkError;
                str5 = inRequestFailPacing;
                obj = loadingError;
                obj2 = adapterInnerError;
                break;
            default:
                str4 = networkError;
                str5 = inRequestFailPacing;
                obj = loadingError;
                obj2 = adapterInnerError;
                break;
        }
        switch (r24) {
            case 0:
                return new AdError(str4, "Network is unavailable.", str2, str3);
            case 1:
                return new AdError(obj8, "Server is unavailable.", str2, str3);
            case 2:
                return new AdError(obj7, "Ad load time out.", str2, str3);
            case 3:
                return new AdError(obj6, "Adapter does not exist.", str2, str3);
            case 4:
                return new AdError(obj5, "Not satisfy the Placement's Cap configuration.", str2, str3);
            case 5:
                return new AdError(obj4, "Not satisfy the Placement's Placing configuration.", str2, str3);
            case 6:
                return new AdError(obj, "Placement's Ad is loading.", str2, str3);
            case 7:
                return new AdError(obj2, "Please check if your network sdk version is correct and all the network plugin has been put in your package.", str2, str3);
            case '\b':
                return new AdError(str5, "Not satisfy the Fail-request's Placing configuration.", str2, str3);
            case '\t':
                return new AdError(loadFailInPacingError, "The placement load too frequent within the specified time period after the previous load failure.", str2, str3);
            case '\n':
                return new AdError(loadCappingError, "The placement load too many times within the specified time period.", str2, str3);
            case 11:
                return new AdError(loadInShowingFilter, "This unitgroup can't load on showing.", str2, str3);
            case '\f':
                return new AdError(c2sBiddingCacheError, "C2S Bidding Cache error.", str2, str3);
            case '\r':
                return new AdError(noAdsourceConfigInDebugerMode, "AdSource filter by network firm id.", str2, str3);
            case 14:
                return new AdError("3001", "Get placement strategy error, please check your network or your appid、appkey and placementid is availiable.", str2, str3);
            case 15:
                return new AdError("3002", "AppId or PlacementId is empty.", str2, str3);
            case 16:
                return new AdError("3003", "Mismatched ad placement and ad format", str2, str3);
            case 17:
                return new AdError(noADError, "Return Ad is empty.", str2, str3);
            case 18:
                return new AdError(contextDestoryError, "Context or activity has been destory.", str2, str3);
            case 19:
                return new AdError(placementAdClose, "Placement Ads switch is close.", str2, str3);
            case 20:
                return new AdError(noAdsourceConfig, "The placement strategy does not contain any ad sources, please check the mediation configuration in TopOn", str2, str3);
            case 21:
                return new AdError(noAvailableAdsource, "Ad sources are filtered, no ad source is currently available", str2, str3);
            case 22:
                return new AdError(rewardedVideoPlayError, "Video playback failed", str2, str3);
            case 23:
                return new AdError(adSourceBidError, "Bid error", str2, str3);
            case 24:
                return new AdError(adSourceNotFilledError, "Ad source not filled, cause by customize fillter.", str2, str3);
            case 25:
                return new AdError(noAdsourceConfigInDebugerMode, "The placement strategy does not contain any ad sources, please check the debugger configuration in ATSDK.setDebuggerConfig", str2, str3);
            case 26:
                return new AdError(httpStatuException, "Https status exception.", str2, str3);
            case 27:
                return new AdError(statuError, "Service status error.", str2, str3);
            case 28:
                return new AdError(dataLevelLowError, "Upload data level is FORBIDDEN, must called 'ATSDK.setGDPRUploadDataLevel' to set the level.", str2, str3);
            case 29:
                return new AdError(exception, "Exception in sdk.", str2, str3);
            case 30:
                return new AdError("10001", "Please check your appkey.", str2, str3);
            case 31:
                return new AdError(appIdError, "Please check your appid.", str2, str3);
            case ' ':
                return new AdError(placementIdError, "Please check your placementid.", str2, str3);
            default:
                return new AdError("-9999", "unknown", str2, str3);
        }
    }
}