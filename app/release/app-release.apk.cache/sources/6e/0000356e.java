package com.ironsource.mediationsdk.utils;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.p7700g.p99005.wo1;

/* loaded from: classes3.dex */
public class ErrorBuilder {
    public static IronSourceError adContainerIsNull(String str) {
        return new IronSourceError(IronSourceError.ERROR_BN_BANNER_CONTAINER_IS_NULL, wo1.t(str, " banner container is null"));
    }

    public static IronSourceError buildCappedPerPlacementError(String str) {
        return new IronSourceError(IronSourceError.ERROR_REACHED_CAP_LIMIT_PER_PLACEMENT, str);
    }

    public static IronSourceError buildCappedPerSessionError(String str) {
        return new IronSourceError(IronSourceError.ERROR_CAPPED_PER_SESSION, wo1.t(str, " Show Fail - Networks have reached their cap per session"));
    }

    public static IronSourceError buildGenericError(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "An error occurred";
        }
        return new IronSourceError(510, str);
    }

    public static IronSourceError buildInitFailedError(String str, String str2) {
        return new IronSourceError(508, TextUtils.isEmpty(str) ? wo1.t(str2, " init failed due to an unknown error") : wo1.u(str2, " - ", str));
    }

    public static IronSourceError buildInvalidConfigurationError(String str) {
        return new IronSourceError(501, wo1.t(str, " Init Fail - Configurations from the server are not valid"));
    }

    public static IronSourceError buildInvalidCredentialsError(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder("Init Fail - ");
        sb.append(str);
        sb.append(" value ");
        sb.append(str2);
        sb.append(" is not valid");
        sb.append(!TextUtils.isEmpty(str3) ? wo1.s(" - ", str3) : "");
        return new IronSourceError(506, sb.toString());
    }

    public static IronSourceError buildInvalidKeyValueError(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return buildGenericError("Mediation - wrong configuration");
        }
        StringBuilder sb = new StringBuilder("Mediation - ");
        sb.append(str);
        sb.append(" value is not valid for ");
        sb.append(str2);
        sb.append(!TextUtils.isEmpty(str3) ? wo1.s(" - ", str3) : "");
        return new IronSourceError(506, sb.toString());
    }

    public static IronSourceError buildKeyNotSetError(String str, String str2, String str3) {
        return (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) ? buildGenericError("Mediation - wrong configuration") : new IronSourceError(505, wo1.w(str3, " Mediation - ", str, " is not set for ", str2));
    }

    public static IronSourceError buildLoadFailedError(String str) {
        return new IronSourceError(510, TextUtils.isEmpty(str) ? "Load failed due to an unknown error" : wo1.s("Load failed - ", str));
    }

    public static IronSourceError buildLoadFailedError(String str, String str2, String str3) {
        String C = wo1.C(wo1.L(str, " Load Fail"), !TextUtils.isEmpty(str2) ? wo1.s(" ", str2) : "", " - ");
        if (TextUtils.isEmpty(str3)) {
            str3 = "unknown error";
        }
        return new IronSourceError(510, wo1.t(C, str3));
    }

    public static IronSourceError buildNoAdsToShowError(String str) {
        return new IronSourceError(509, wo1.t(str, " Show Fail - No ads to show"));
    }

    public static IronSourceError buildNoConfigurationAvailableError(String str) {
        return new IronSourceError(501, wo1.t(str, " Init Fail - Unable to retrieve configurations from the server"));
    }

    public static IronSourceError buildNoInternetConnectionInitFailError(String str) {
        return new IronSourceError(IronSourceError.ERROR_NO_INTERNET_CONNECTION, wo1.t(str, " Init Fail - No Internet connection"));
    }

    public static IronSourceError buildNoInternetConnectionLoadFailError(String str) {
        return new IronSourceError(IronSourceError.ERROR_NO_INTERNET_CONNECTION, wo1.t(str, " Load Fail - No Internet connection"));
    }

    public static IronSourceError buildNoInternetConnectionShowFailError(String str) {
        return new IronSourceError(IronSourceError.ERROR_NO_INTERNET_CONNECTION, wo1.t(str, " Show Fail - No Internet connection"));
    }

    public static IronSourceError buildNonExistentInstanceError(String str) {
        return new IronSourceError(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, wo1.t(str, " The requested instance does not exist"));
    }

    public static IronSourceError buildShowFailedError(String str, String str2) {
        return new IronSourceError(509, wo1.u(str, " Show Fail - ", str2));
    }

    public static IronSourceError buildUsingCachedConfigurationError(String str, String str2) {
        return new IronSourceError(502, "Mediation - Unable to retrieve configurations from IronSource server, using cached configurations with appKey:" + str + " and userId:" + str2);
    }

    public static IronSourceError unsupportedBannerSize(String str) {
        return new IronSourceError(IronSourceError.ERROR_BN_UNSUPPORTED_SIZE, wo1.t(str, " unsupported banner size"));
    }
}