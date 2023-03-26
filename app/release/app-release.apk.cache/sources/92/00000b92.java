package com.anythink.network.admob;

import com.google.android.gms.ads.MobileAds;

/* loaded from: classes2.dex */
public class AdmobATConst {
    public static final int ADAPTIVE_ANCHORED = 0;
    public static final int ADAPTIVE_INLINE = 1;
    public static final String ADAPTIVE_ORIENTATION = "adaptive_orientation";
    public static final String ADAPTIVE_TYPE = "adaptive_type";
    public static final String ADAPTIVE_WIDTH = "adaptive_width";
    public static final int NETWORK_FIRM_ID = 2;
    public static final int ORIENTATION_CURRENT = 0;
    public static final int ORIENTATION_LANDSCAPE = 2;
    public static final int ORIENTATION_PORTRAIT = 1;

    /* loaded from: classes2.dex */
    public static class DEBUGGER_CONFIG {
        public static final int Admob_INTERSTITIAL_IMAGE = 1;
        public static final int Admob_INTERSTITIAL_VIDEO = 2;
        public static final int Admob_NATIVE_IMAGE = 1;
        public static final int Admob_NATIVE_VIDEO = 2;
        public static final int Admob_NETWORK = 2;
    }

    public static String getNetworkVersion() {
        try {
            return MobileAds.getVersion().toString();
        } catch (Throwable unused) {
            return "";
        }
    }
}