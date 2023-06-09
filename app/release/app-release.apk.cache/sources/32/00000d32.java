package com.facebook.ads.internal.protocol;

import com.facebook.ads.AdError;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.p7700g.p99005.aa;
import com.p7700g.p99005.bx;
import java.util.Arrays;
import org.xbill.DNS.Flags;

/* loaded from: assets/audience_network.dex */
public enum AdErrorType {
    UNKNOWN_ERROR(-1, A00(2455, 13, 86), false),
    NETWORK_ERROR(1000, A00(2011, 13, 83), true),
    NO_FILL(1001, A00(2024, 7, 107), true),
    LOAD_TOO_FREQUENTLY(1002, A00(236, 31, 114), true),
    DISABLED_APP(1005, A00(343, 39, 28), true),
    SERVER_ERROR(2000, A00(2130, 12, 66), true),
    INTERNAL_ERROR(2001, A00(1589, 14, 25), true),
    CACHE_FAILURE_ERROR(2002, A00(2045, 19, 102), true),
    START_BEFORE_INIT(IronSourceConstants.IS_INSTANCE_OPENED, A00(2419, 36, 33), true),
    REMOTE_ADS_SERVICE_ERROR(AdError.REMOTE_ADS_SERVICE_ERROR, A00(aa.a.s, 25, 15), true),
    INTERSTITIAL_AD_TIMEOUT(AdError.INTERSTITIAL_AD_TIMEOUT, A00(2142, 31, 115), true),
    RV_AD_TIMEOUT(2010, A00(2173, 33, 94), true),
    AD_PRESENTATION_ERROR(AdError.AD_PRESENTATION_ERROR.getErrorCode(), AdError.AD_PRESENTATION_ERROR.getErrorMessage(), true),
    BROKEN_MEDIA_ERROR(2100, A00(995, 34, 85), true),
    AD_REQUEST_FAILED(IronSourceConstants.RV_CALLBACK_AVAILABILITY_TRUE, A00(598, 39, 14), false),
    AD_REQUEST_TIMEOUT(IronSourceConstants.RV_CALLBACK_AVAILABILITY_FALSE, A00(637, 42, 71), false),
    PARSER_FAILURE(IronSourceConstants.RV_INSTANCE_SHOW, A00(IronSourceError.ERROR_RV_LOAD_SUCCESS_WRONG_AUCTION_ID, 50, 41), false),
    UNKNOWN_RESPONSE(IronSourceConstants.RV_INSTANCE_SHOW_FAILED, A00(2264, 47, 79), false),
    ERROR_MESSAGE(IronSourceConstants.RV_INSTANCE_CLOSED, A00(550, 48, 89), true),
    NO_AD_PLACEMENT(IronSourceConstants.RV_AUCTION_SUCCESS, A00(679, 42, 56), false),
    MEDIATION_ERROR(3001, A00(1848, 15, 107), true),
    BID_IMPRESSION_MISMATCH(4001, A00(440, 36, 95), true),
    BID_PAYLOAD_ERROR(4002, A00(1642, 19, 14), false),
    NO_ADAPTER_ON_LOAD(IronSourceConstants.errorCode_biddingDataException, A00(267, 25, 74), false),
    NO_ADAPTER_ON_START(IronSourceConstants.errorCode_isReadyException, A00(292, 26, 116), false),
    INTERSTITIAL_CONTROLLER_IS_NULL(IronSourceConstants.errorCode_loadInProgress, A00(1603, 39, 50), false),
    WEB_VIEW_FAILED_TO_LOAD(IronSourceConstants.errorCode_showInProgress, A00(2334, 22, 51), false),
    NO_MEDIAVIEW_IN_NATIVEAD(AdError.MEDIAVIEW_MISSING_ERROR_CODE, A00(1816, 32, 67), true),
    NO_ICONVIEW_IN_NATIVEBANNERAD(AdError.ICONVIEW_MISSING_ERROR_CODE, A00(IronSourceConstants.RV_INSTANCE_SHOW_CHANCE, 37, 118), true),
    UNSUPPORTED_AD_ASSET_NATIVEAD(AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE, A00(2468, 29, 116), true),
    AD_ALREADY_STARTED(AdError.SHOW_CALLED_BEFORE_LOAD_ERROR_CODE, A00(91, 18, 46), true),
    LOAD_CALLED_WHILE_SHOWING_AD(AdError.LOAD_CALLED_WHILE_SHOWING_AD, A00(109, 41, 86), true),
    CLEAR_TEXT_SUPPORT_NOT_ALLOWED(AdError.CLEAR_TEXT_SUPPORT_NOT_ALLOWED, A00(1246, 343, 42), true),
    INCORRECT_STATE_ERROR(AdError.INCORRECT_STATE_ERROR, A00(2383, 36, 118), true),
    MISSING_DEPENDENCIES_ERROR(AdError.MISSING_DEPENDENCIES_ERROR, A00(721, 178, 45), true),
    API_NOT_SUPPORTED(AdError.API_NOT_SUPPORTED, A00(899, 75, 100), true),
    NATIVE_AD_IS_NOT_LOADED(AdError.NATIVE_AD_IS_NOT_LOADED, A00(IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, 86, 118), true),
    INCORRECT_API_CALL_ERROR(7008, A00(2356, 27, 18), true),
    IMAGE_CACHE_ERROR(8001, A00(974, 21, 25), false),
    LOAD_AD_CALLED_MORE_THAN_ONCE(8002, A00(1737, 38, 81), true);
    
    public static byte[] A03;
    public static String[] A04;
    public final int A00;
    public final String A01;
    public final boolean A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 66);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-94, -91, -64, -94, -83, -77, -90, -94, -91, -70, -64, -76, -75, -94, -77, -75, -90, -91, -20, -17, 10, -5, -3, -16, -2, -16, -7, -1, -20, -1, -12, -6, -7, 10, -16, -3, -3, -6, -3, -115, -112, -85, -98, -111, -99, -95, -111, -97, -96, -85, -110, -115, -107, -104, -111, -112, -109, -106, -79, -92, -105, -93, -89, -105, -91, -90, -79, -90, -101, -97, -105, -95, -89, -90, -75, -60, -67, -45, -62, -61, -56, -45, -57, -55, -60, -60, -61, -58, -56, -71, -72, -79, -44, -112, -47, -36, -30, -43, -47, -44, -23, -112, -29, -28, -47, -30, -28, -43, -44, bx.l7, -4, -72, -5, -7, 6, 6, 7, 12, -72, -6, -3, -72, 4, 7, -7, -4, -3, -4, -72, 15, 0, 1, 4, -3, -72, -6, -3, 1, 6, -1, -72, -4, 1, Flags.CD, 8, 4, -7, 17, -3, -4, -7, 28, -40, 33, 43, -40, 38, 39, 44, -40, 36, 39, 25, 28, 29, 28, -26, -40, 5, 25, 35, 29, -40, 43, 45, bx.W5, 29, -40, 44, 32, 25, 44, -40, 49, 39, 45, -40, 27, 25, 36, 36, -40, 36, 39, 25, 28, -7, 28, -32, bx.j7, -40, 26, 29, 30, 39, bx.W5, 29, -40, bx.W5, 29, 31, 33, 43, 44, 29, bx.W5, 14, 33, 29, 47, -2, 39, bx.W5, 1, 38, 44, 29, bx.W5, 25, 27, 44, 33, 39, 38, -32, bx.j7, -11, 24, -44, 43, 21, 39, -44, 38, 25, bx.j7, 32, 35, 21, 24, 25, 24, -44, 40, 35, 35, -44, 26, 38, 25, 37, 41, 25, 34, 40, 32, 45, -51, -16, -19, -4, 0, -15, -2, -84, -11, -1, -84, -6, 1, -8, -8, -84, -5, -6, -40, -5, -19, -16, -84, -51, -16, -9, 26, 23, 38, bx.W5, 27, 40, -42, 31, 41, -42, 36, 43, 34, 34, -42, 37, 36, 9, bx.W5, 23, 40, bx.W5, -42, -9, 26, -110, -75, -60, 113, -92, -74, -61, -57, -70, -76, -74, 113, -63, -61, -64, -76, -74, -60, -60, 113, -74, -61, -61, -64, -61, -97, -50, -50, 126, -57, -47, 126, -62, -57, -47, -65, -64, -54, -61, -62, 126, -60, -48, -51, -53, 126, -53, -65, -55, -57, -52, -59, 126, -65, -62, 126, -48, -61, -49, -45, -61, -47, -46, -47, -104, -97, -102, -75, -97, -93, -90, -88, -101, -87, -87, -97, -91, -92, -75, -93, -97, -87, -93, -105, -86, -103, -98, -72, -65, -70, -43, -58, -73, -49, -62, -59, -73, -70, -43, -69, -56, -56, -59, -56, -22, -6, -9, -13, -19, -10, 7, -11, -19, -20, -15, -23, 7, -19, -6, -6, -9, -6, -29, 10, 5, -63, 17, 2, 26, 13, 16, 2, 5, -63, 5, 16, 6, 20, -63, 15, 16, 21, -63, 14, 2, 21, 4, 9, -63, 17, 13, 2, 4, 6, 14, 6, 15, 21, -113, -115, -113, -108, -111, -85, -110, -115, -107, -104, -95, -98, -111, -85, -111, -98, -98, -101, -98, -24, -15, -22, -26, -9, 4, -7, -22, -3, -7, 4, -8, -6, -11, -11, -12, -9, -7, 4, -13, -12, -7, 4, -26, -15, -15, -12, -4, -22, -23, -11, -6, 4, -14, -13, -3, -10, -11, 16, -14, 1, 1, -65, -52, -52, -55, -52, bx.l7, -57, -65, -51, -51, -69, -63, -65, bx.j7, -4, -2, 0, -3, 10, 10, 6, -69, -36, -1, 14, -69, -18, -33, -26, -69, -1, 0, 7, 4, 17, 0, 13, 20, -69, 13, 0, 14, Flags.CD, 10, 9, 14, 0, -69, -32, 13, 13, 10, 13, -69, 8, 0, 14, 14, -4, 2, 0, -106, -79, -77, -75, -78, -65, -65, -69, 112, -111, -76, -61, 112, -93, -108, -101, 112, -62, -75, -63, -59, -75, -61, -60, 112, -74, -65, -62, 112, -79, -76, -61, 112, -74, -79, -71, -68, -75, -76, -49, -22, -20, -18, -21, -8, -8, -12, -87, -54, -19, -4, -87, -36, -51, -44, -87, -5, -18, -6, -2, -18, -4, -3, -87, -17, -8, -5, -87, -22, -19, -4, -87, -3, -14, -10, -18, -19, -87, -8, -2, -3, -64, -37, -35, -33, -36, -23, -23, -27, -102, -69, -34, -19, -102, -51, -66, -59, -102, -20, -33, -18, -17, -20, -24, -33, -34, -102, -24, -23, -102, -37, -34, -102, -22, -26, -37, -35, -33, -25, -33, -24, -18, -19, -75, -48, -46, -44, -47, -34, -34, -38, -113, -80, -28, -45, -40, -44, -35, -46, -44, -113, -67, -44, -29, -26, -34, bx.j7, -38, -113, -62, -77, -70, -113, -45, -34, -44, -30, -35, -106, -29, -113, -41, -48, -27, -44, -113, -48, -37, -37, -113, bx.j7, -44, -32, -28, -40, bx.j7, -44, -45, -113, -46, -37, -48, -30, -30, -44, -30, -99, -113, -65, -37, -44, -48, -30, -44, -101, -113, -46, -41, -44, -46, -38, -113, -69, -34, -42, -78, -48, -29, -113, -34, -28, -29, -33, -28, -29, -113, -43, -34, bx.j7, -113, -29, -48, -42, -113, -108, -30, -99, -113, -62, -44, -44, -113, -36, -34, bx.j7, -44, -87, -113, -41, -29, -29, -33, -30, -87, -98, -98, -45, -44, -27, -44, -37, -34, -33, -44, bx.j7, -30, -99, -43, -48, -46, -44, -47, -34, -34, -38, -99, -46, -34, -36, -98, -45, -34, -46, -30, -98, -48, -28, -45, -40, -44, -35, -46, -44, -100, -35, -44, -29, -26, -34, bx.j7, -38, -98, -48, -35, -45, bx.j7, -34, -40, -45, -98, -113, -20, 7, 9, Flags.CD, 8, 21, 21, 17, -58, -25, 27, 10, 15, Flags.CD, 20, 9, Flags.CD, -58, -12, Flags.CD, 26, 29, 21, 24, 17, -58, -7, -22, -15, -58, 10, 21, Flags.CD, 25, 20, -51, 26, -58, 25, 27, 22, 22, 21, 24, 26, -58, -25, 20, 10, 24, 21, 15, 10, -58, -11, -7, -58, 28, Flags.CD, 24, 25, 15, 21, 20, 25, -58, 8, Flags.CD, 18, 21, 29, -58, -38, -44, -40, -95, -68, -60, -57, -64, -65, 123, -49, -54, 123, -66, -68, -66, -61, -64, 123, -60, -56, -68, -62, -64, -35, -8, 0, 3, -4, 
        -5, -73, Flags.CD, 6, -73, 3, 6, -8, -5, -73, -28, -4, -5, 0, -8, -73, -3, 6, 9, -73, -27, -8, Flags.CD, 0, 13, -4, -73, -40, -5, -79, -52, -44, -41, -48, -49, -117, -33, -38, -117, -37, -52, -35, -34, -48, -117, -79, -52, -50, -48, -51, -38, -38, -42, -117, -84, -49, -34, -117, -66, -81, -74, -117, -49, -48, -41, -44, bx.j7, -48, -35, -28, -117, -35, -48, -34, -37, -38, bx.l7, -34, -48, -103, -99, -111, -105, -107, -81, -109, -111, -109, -104, -107, -81, -107, -94, -94, -97, -94, -93, -88, -99, -87, -84, -84, -97, -99, -82, -71, -101, -86, -93, -71, -99, -101, -90, -90, -71, -97, -84, -84, -87, -84, -43, -38, -49, -37, -34, -34, -47, -49, -32, -21, -33, -32, -51, -32, -47, -21, -47, -34, -34, -37, -34, -73, -68, -62, -77, -64, -68, -81, -70, -51, -77, -64, -64, -67, -64, -98, -93, -87, -102, -89, -88, -87, -98, -87, -98, -106, -95, -76, -106, -103, -76, -87, -98, -94, -102, -92, -86, -87, -110, -105, -99, -114, -101, -100, -99, -110, -99, -110, -118, -107, -88, -116, -104, -105, -99, -101, -104, -107, -107, -114, -101, -88, -110, -100, -88, -105, -98, -107, -107, 1, 27, 39, 38, 14, 33, 29, 47, -40, 33, 43, -40, 37, 33, 43, 43, 33, 38, 31, -40, 33, 38, -40, 6, 25, 44, 33, 46, 29, -6, 25, 38, 38, 29, bx.W5, -7, 28, -75, -38, -116, -37, -34, -48, -47, -34, -116, -32, -37, -116, bx.j7, -33, -47, -116, -49, -51, -49, -44, -47, -116, -43, -38, -116, -78, -51, -49, -47, -50, -37, -37, -41, -116, -83, bx.j7, -48, -43, -47, -38, -49, -47, -116, -70, -47, -32, -29, -37, -34, -41, -116, -65, -80, -73, -116, -27, -37, bx.j7, -116, -33, -44, -37, bx.j7, -40, -48, -116, -29, -44, -43, -32, -47, -40, -43, -33, -32, -116, -99, -98, -93, -102, -100, -102, -100, -102, -99, -116, -43, -38, -116, -27, -37, bx.j7, -34, -116, -70, -47, -32, -29, -37, -34, -41, -116, -65, -47, -49, bx.j7, -34, -43, -32, -27, -116, -81, -37, -38, -46, -43, -45, bx.j7, -34, -51, -32, -43, -37, -38, -90, 118, -88, -48, -37, bx.l7, -51, -43, -38, -103, -49, -37, -38, -46, -43, -45, -116, -49, -40, -47, -51, -34, -32, -47, -28, -32, -64, -34, -51, -46, -46, -43, -49, -68, -47, -34, bx.l7, -43, -32, -32, -47, -48, -87, -114, -32, -34, bx.j7, -47, -114, -86, 118, -116, -116, -116, -116, -88, -48, -37, bx.l7, -51, -43, -38, -116, -43, -38, -49, -40, bx.j7, -48, -47, -65, bx.j7, -50, -48, -37, bx.l7, -51, -43, -38, -33, -87, -114, -32, -34, bx.j7, -47, -114, -86, -99, -98, -93, -102, -100, -102, -100, -102, -99, -88, -101, -48, -37, bx.l7, -51, -43, -38, -86, 118, -88, -101, -48, -37, bx.l7, -51, -43, -38, -103, -49, -37, -38, -46, -43, -45, -86, 118, -65, -47, -47, -116, bx.l7, -37, -34, -47, -90, -116, -44, -32, -32, -36, -33, -90, -101, -101, -48, -47, -30, -47, -40, -37, -36, -47, -34, -33, -102, -46, -51, -49, -47, -50, -37, -37, -41, -102, -49, -37, bx.l7, -101, -48, -37, -49, -33, -101, -51, bx.j7, -48, -43, -47, -38, -49, -47, -103, -38, -47, -32, -29, -37, -34, -41, -101, -51, -38, -48, -34, -37, -43, -48, -103, -38, -47, -32, -29, -37, -34, -41, -103, -33, -47, -49, bx.j7, -34, -43, -32, -27, -103, -49, -37, -38, -46, -43, -45, -92, -55, -49, -64, -51, -55, -68, -57, 123, -96, -51, -51, -54, -51, -67, -30, -24, bx.l7, -26, -25, -24, -35, -24, -35, -43, -32, -108, -73, -29, -30, -24, -26, -29, -32, -32, bx.l7, -26, -108, -35, -25, -108, -30, -23, -32, -32, -108, -25, -36, -29, -21, -108, -75, -40, -103, -66, -58, -79, -68, -71, -76, 112, -78, -71, -76, 112, -64, -79, -55, -68, -65, -79, -76, -47, -44, -58, -55, -28, -58, -55, -28, -56, -58, -47, -47, -54, -55, -28, -46, -44, -41, -54, -28, bx.l7, -51, -58, -45, -28, -44, -45, -56, -54, -27, -24, -38, -35, -8, -36, -38, -27, -27, -34, -35, -8, -16, bx.j7, -30, -27, -34, -8, -20, bx.j7, -24, -16, -30, -25, -32, -8, -38, -35, 12, 15, 1, 4, 31, 20, 15, 15, 31, 6, 18, 5, 17, 21, 5, 14, 20, 12, 25, -33, 2, -12, -9, -44, -9, -77, -10, -12, 1, 1, 2, 7, -77, -11, -8, -77, -10, -12, -1, -1, -8, -9, -77, 0, 2, 5, -8, -77, 7, -5, -12, 1, -77, 2, 1, -10, -8, -89, -97, -98, -93, -101, -82, -93, -87, -88, -71, -97, -84, -84, -87, -84, -98, -102, -92, -92, -102, -97, -104, -80, -107, -106, -95, -106, -97, -107, -106, -97, -108, -102, -106, -92, -80, -106, -93, -93, -96, -93, -46, -22, -23, -18, -26, -37, -18, -22, -4, -91, -18, -8, -91, -14, -18, -8, -8, -18, -13, -20, -91, -18, -13, -91, -45, -26, -7, -18, -5, -22, -58, -23, -6, 18, 17, 22, 14, 33, 22, 28, 27, -51, -14, 31, 31, 28, 31, -101, -114, -95, -106, -93, -110, -84, -114, -111, -84, -106, -96, -84, -101, -100, -95, -84, -103, -100, -114, -111, -110, -111, -82, -91, -76, -73, -81, -78, -85, -65, -91, -78, -78, -81, -78, -90, -89, -73, -103, -100, -103, -88, -84, -99, -86, -73, -89, -90, -73, -92, -89, -103, -100, -12, -11, 5, -25, -22, -25, -10, -6, -21, -8, 5, -11, -12, 5, -7, -6, -25, -8, -6, -62, -61, -45, -75, -72, -45, -60, -64, -75, -73, -71, -63, -71, -62, -56, -75, -74, -58, -83, -80, -77, -77, -49, -48, -32, -54, -60, -48, -49, -41, -54, -58, -40, -32, -54, -49, -32, -49, -62, -43, -54, -41, -58, -61, -62, -49, -49, -58, -45, -62, -59, -61, -60, -44, -62, -70, -71, -66, -74, -53, -66, -70, -52, -44, 
        -66, -61, -44, -61, -74, -55, -66, -53, -70, -74, -71, -29, -6, 9, 12, 4, 7, 0, -75, -38, 7, 7, 4, 7, -5, 28, -51, -13, 22, 25, 25, -28, -43, -26, -25, bx.l7, -26, -13, -38, -43, -35, -32, -23, -26, bx.l7, -8, 26, 13, -56, -21, 9, Flags.CD, 16, 17, 22, 15, -56, 14, 9, 17, 20, 29, 26, 13, -107, -120, -112, -110, -105, -120, -94, -124, -121, -106, -94, -106, -120, -107, -103, -116, -122, -120, -94, -120, -107, -107, -110, -107, -70, -66, -57, -87, -84, -57, -68, -79, -75, -83, -73, -67, -68, -26, -40, -27, -23, -40, -27, -14, -40, -27, -27, -30, -27, -98, -97, -116, -99, -97, -86, -115, -112, -111, -102, -99, -112, -86, -108, -103, -108, -97, -41, -23, -10, -6, -23, -10, -92, -55, -10, -10, -13, -10, 9, 30, 34, 26, 36, bx.W5, 41, -43, 33, 36, 22, 25, 30, 35, 28, -43, -2, 35, 41, 26, 39, 40, 41, 30, 41, 30, 22, 33, -43, -10, 25, -12, 9, 13, 5, 15, 21, 20, -64, 12, 15, 1, 4, 9, 14, 7, -64, -14, 5, 23, 1, 18, 4, 5, 4, -64, -10, 9, 4, 5, 15, -64, bx.j7, 4, 15, 8, 5, 8, 9, 17, 8, 25, -1, 12, 12, 9, 12, 9, 2, -1, 2, 3, Flags.CD, 2, 19, 6, -7, 7, 4, 3, 2, 7, -7, -82, -89, -84, -82, -87, -87, -88, -85, -83, -98, -99, -72, -102, -99, -72, -102, -84, -84, -98, -83, -72, -89, -102, -83, -94, -81, -98, -102, -99, -26, -1, -4, -1, 0, 8, -1, -79, -41, -14, -12, -10, -13, 0, 0, -4, -79, -46, -11, 4, -79, -28, -43, -36, -79, -11, -10, -3, -6, 7, -10, 3, 10, -79, 3, -10, 4, 1, 0, -1, 4, -10, -79, 5, 10, 1, -10, -91, -109, -112, -83, -92, -105, -109, -91, -83, -108, -113, -105, -102, -109, -110, -83, -94, -99, -83, -102, -99, -113, -110, -52, -38, -41, -53, -34, -38, -20, -107, -37, -42, -34, bx.j7, -38, bx.l7, -107, -23, -28, -107, bx.j7, -28, -42, bx.l7, -83, -61, -55, 116, -73, -75, -62, 123, -56, 116, -73, -75, -64, -64, 116, 121, -57, 116, -70, -61, -58, 116, -75, -72, 116, 121, -57, 17, 39, 45, -40, 27, 25, 38, -33, 44, -40, 27, 25, 36, 36, -40, -35, 43, -40, 30, 39, bx.W5, -40, 25, 28, -40, 33, 38, -40, 43, 44, 25, 44, 29, -40, -35, 43, -52, -47, -52, -41, -92, -57, -125, -48, -40, -42, -41, -125, -59, -56, -125, -58, -60, -49, -49, -56, -57, -125, -59, -56, -55, -46, -43, -56, -125, -42, -41, -60, -43, -41, -92, -57, 13, 6, 3, 6, 7, 15, 6, -72, -3, 10, 10, 7, 10, 43, 36, 41, 43, 38, 38, 37, 40, bx.W5, 27, 26, -42, bx.W5, 47, 38, 27, -42, 37, 28, -42, 23, 26, -42, 23, 41, 41, 27, bx.W5, 41};
    }

    public static void A02() {
        A04 = new String[]{"ovPjjuFE9om7OIefNXRfQwFL9PUdOP68", "Xxl4rLnj16XDfkQUiM3437m5W6qonc5R", "UVmnaLPTsQqsAUFvP4l9eFVdZ5Bnbi11", "1ZhKvMy3c0pCt", "Rh7YRMmCfK6BaL93vKCO6WgzdB7W", "p5EAmOIUOepdn0Id4WtjwtBc6P8vGfuC", "JnlGisJqZLjO7zfwdKKMw91nRUtIhmzE", "W9Yqfcw4l1PfnAsasbj5MfnOF9oeiem1"};
    }

    static {
        A02();
        A01();
    }

    AdErrorType(int i, String str, boolean z) {
        this.A00 = i;
        this.A01 = str;
        this.A02 = z;
    }

    public static AdErrorType adErrorTypeFromCode(int i) {
        return adErrorTypeFromCode(i, UNKNOWN_ERROR);
    }

    public static AdErrorType adErrorTypeFromCode(int i, AdErrorType adErrorType) {
        AdErrorType[] valuesCustom;
        for (AdErrorType adErrorType2 : valuesCustom()) {
            if (adErrorType2.getErrorCode() == i) {
                return adErrorType2;
            }
        }
        return adErrorType;
    }

    public String getDefaultErrorMessage() {
        return this.A01;
    }

    public int getErrorCode() {
        return this.A00;
    }

    public boolean isPublicError() {
        return this.A02;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static AdErrorType[] valuesCustom() {
        AdErrorType[] adErrorTypeArr = (AdErrorType[]) values().clone();
        String[] strArr = A04;
        if (strArr[5].charAt(28) != strArr[2].charAt(28)) {
            String[] strArr2 = A04;
            strArr2[5] = "pBNFHLUpC4jWXgNLm8u027UOuLKmSmpd";
            strArr2[2] = "gG1ZcsHEHMfNZyb2FxMGGthk6GnsPN8K";
            return adErrorTypeArr;
        }
        throw new RuntimeException();
    }
}