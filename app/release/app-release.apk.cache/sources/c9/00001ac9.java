package com.google.android.gms.common.util;

import android.util.Base64;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.p7700g.p99005.x1;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public final class Base64Utils {
    @x1
    @KeepForSdk
    public static byte[] decode(@x1 String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    @x1
    @KeepForSdk
    public static byte[] decodeUrlSafe(@x1 String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 10);
    }

    @x1
    @KeepForSdk
    public static byte[] decodeUrlSafeNoPadding(@x1 String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 11);
    }

    @x1
    @KeepForSdk
    public static String encode(@x1 byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 0);
    }

    @x1
    @KeepForSdk
    public static String encodeUrlSafe(@x1 byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 10);
    }

    @x1
    @KeepForSdk
    public static String encodeUrlSafeNoPadding(@x1 byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }
}