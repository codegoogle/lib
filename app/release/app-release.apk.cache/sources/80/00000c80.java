package com.facebook.ads;

import android.content.Context;
import androidx.annotation.Keep;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.util.common.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

@Keep
/* loaded from: classes2.dex */
public final class AudienceNetworkAds {
    private static final String ADNW_PROCESS_NAME = ":adnw";
    public static final String TAG = "FBAudienceNetwork";

    @Keep
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface AdFormat {
        public static final int BANNER = 1;
        @Deprecated
        public static final int INSTREAM_VIDEO_MOBILE = 3;
        public static final int INTERSTITIAL = 2;
        public static final int NATIVE = 4;
        public static final int NATIVE_BANNER = 5;
        public static final int REWARDED_VIDEO = 6;
        public static final int UNKNOWN = 0;
    }

    @Keep
    /* loaded from: classes2.dex */
    public interface InitListener {
        void onInitialized(InitResult initResult);
    }

    @Keep
    /* loaded from: classes2.dex */
    public interface InitResult {
        String getMessage();

        boolean isSuccess();
    }

    @Keep
    /* loaded from: classes2.dex */
    public interface InitSettingsBuilder {
        void initialize();

        InitSettingsBuilder withInitListener(InitListener initListener);

        InitSettingsBuilder withMediationService(String str);

        InitSettingsBuilder withPlacementIds(List<String> list);
    }

    private AudienceNetworkAds() {
    }

    public static InitSettingsBuilder buildInitSettings(Context context) {
        return new com.facebook.ads.internal.api.InitSettingsBuilder(context);
    }

    public static int getAdFormatForPlacement(Context context, String str) {
        return DynamicLoaderFactory.makeLoader(context).createAudienceNetworkAdsApi().getAdFormatForPlacement(str);
    }

    @Deprecated
    public static String getAdsProcessName(Context context) {
        return ADNW_PROCESS_NAME;
    }

    public static void initialize(Context context) {
        Preconditions.checkNotNull(context, "Context can not be null.");
        DynamicLoaderFactory.initialize(context, null, null, false);
    }

    @Deprecated
    public static boolean isInAdsProcess(Context context) {
        return false;
    }

    public static boolean isInitialized(Context context) {
        if (DynamicLoaderFactory.getDynamicLoader() == null) {
            return false;
        }
        return DynamicLoaderFactory.makeLoader(context).createAudienceNetworkAdsApi().isInitialized();
    }
}