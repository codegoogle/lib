package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.7L  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C7L {
    public static byte[] A00;

    static {
        A04();
    }

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 86);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{92, 88, 84, 82, 80};
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x000f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int A00(BitmapFactory.Options options, int width, int inSampleSize) {
        int i = options.outHeight;
        int i2 = options.outWidth;
        int height = 1;
        if (i > inSampleSize || i2 > width) {
            int i3 = i / 2;
            int halfHeight = i2 / 2;
            while (halfWidth >= inSampleSize) {
                int halfWidth = halfHeight / height;
                if (halfWidth < width) {
                    break;
                }
                height *= 2;
            }
        }
        return height;
    }

    @Nullable
    public static Bitmap A01(InputStream inputStream, int i, int i2) throws IOException {
        if (Build.VERSION.SDK_INT < 19) {
            return BitmapFactory.decodeStream(inputStream);
        }
        C0O c0o = new C0O(inputStream);
        c0o.mark(8192);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(c0o, null, options);
        c0o.reset();
        if (!c0o.A01()) {
            options.inSampleSize = A00(options, i2, i);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeStream(c0o, null, options);
        }
        return BitmapFactory.decodeStream(c0o);
    }

    @Nullable
    @SuppressLint({"CatchGeneralException"})
    public static Bitmap A02(String str, int i, int i2, C8H c8h) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            options.inSampleSize = A00(options, i2, i);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeFile(str, options);
        } catch (Throwable th) {
            c8h.A04().A82(A03(0, 5, 99), C04848i.A1N, new C04858j(th));
            return null;
        }
    }
}