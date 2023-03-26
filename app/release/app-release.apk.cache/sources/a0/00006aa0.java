package de.blinkt.openvpn.core;

import android.os.Build;
import java.security.InvalidKeyException;

/* loaded from: classes3.dex */
public class NativeUtils {
    public static final int[] a = {16, 64, 256, 1024, 8192, 16384};

    public static String a() {
        return b() ? "ROBO" : getJNIAPI();
    }

    public static boolean b() {
        return "robolectric".equals(Build.FINGERPRINT);
    }

    public static native String[] getIfconfig() throws IllegalArgumentException;

    private static native String getJNIAPI();

    public static native double[] getOpenSSLSpeed(String str, int i);

    public static native String getOpenVPN2GitVersion();

    public static native String getOpenVPN3GitVersion();

    public static native void jniclose(int i);

    public static native byte[] rsasign(byte[] bArr, int i, boolean z) throws InvalidKeyException;
}