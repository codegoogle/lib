package com.google.android.gms.common.util;

import android.database.CharArrayBuffer;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.io.ByteArrayOutputStream;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public final class DataUtils {
    @KeepForSdk
    public static void copyStringToBuffer(@z1 String str, @x1 CharArrayBuffer charArrayBuffer) {
        if (TextUtils.isEmpty(str)) {
            charArrayBuffer.sizeCopied = 0;
            return;
        }
        char[] cArr = charArrayBuffer.data;
        if (cArr != null && cArr.length >= str.length()) {
            str.getChars(0, str.length(), charArrayBuffer.data, 0);
        } else {
            charArrayBuffer.data = str.toCharArray();
        }
        charArrayBuffer.sizeCopied = str.length();
    }

    @x1
    @KeepForSdk
    public static byte[] loadImageBytes(@x1 Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}