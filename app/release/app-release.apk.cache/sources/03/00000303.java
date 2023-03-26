package com.anchorfree.hdr;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class AFHydra {
    public static final String CODE_KICKED = "191";
    public static final String ERROR_DICONNECTED = "DUMMY_ERROR_BROKEN";
    public static final String EV_BYTECOUNT = "B";
    public static final String EV_ERROR = "E";
    public static final String EV_PTM = "PTM";
    public static final String EV_STATE = "S";
    public static final String EV_URC = "URC";
    public static final int INFO_TYPE_FAIL = 2;
    public static final int INFO_TYPE_SUCCESS = 1;
    public static final String LIB_HYDRA = "hydra";
    public static final String STATUS_CONNECTED = "C1";
    public static final String STATUS_CONNECTING = "C0";
    public static final String STATUS_DISCONNECTING = "D0";
    public static final String STATUS_IDLE = "I";

    public static native boolean NativeA(HydraHeaderListener hydraHeaderListener, String str, boolean z, boolean z2, boolean z3, String str2, String str3);

    public static native int NativeB();

    public static native int NativeCC();

    public static native int NativeCCL(String str);

    public static native int NativeCCR();

    public static native int NativeCCS();

    public static native ArrayList<HydraConnInfo> NativeCI(int i);

    public static native void NativeCLB(String str);

    @Deprecated
    public static native void NativeCLC();

    public static native String NativeCLG();

    public static native void NativeCustomCategoryRulesApply(String[] strArr, int i, int i2, String str);

    public static native int NativeE();

    public static native byte[] NativeEC(String str);

    public static native String NativeED(byte[] bArr);

    public static native void NativeEG(String str);

    public static native int NativeI();

    public static native void NativeNW(int i);

    public static native void NativeT(int i);

    public static native void NativeUpRu(String str);

    public static native void NativeX();

    public static native String getBuildTarget();

    public static native String getVersion();
}