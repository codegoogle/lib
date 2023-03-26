package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.os.Environment;
import android.util.Log;
import androidx.annotation.Nullable;
import com.p7700g.p99005.bx;
import com.p7700g.p99005.g15;
import java.io.File;
import java.util.Arrays;
import org.xbill.DNS.WKSRecord;

/* renamed from: com.facebook.ads.redexgen.X.0B  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C0B {
    public static byte[] A00;
    public static String[] A01;
    public static final String A02;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = (byte) ((copyOfRange[i4] - i3) - 42);
            if (A01[2].charAt(7) == 'N') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[6] = "j2KSQpoHLCiJcwafhELrhzMFazuB99E5";
            strArr[7] = "yil6hBrwRD3U5d82pKPD9jkABJOmXKdj";
            copyOfRange[i4] = b;
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{-61, 17, -59, -66, 21, 7, 10, 10, -66, 0, 3, -66, 19, 17, 3, 2, -52, g15.b, -76, -78, -76, -71, -74, g15.b, -108, -55, -58, bx.l7, -58, -108, -55, -58, bx.l7, -58, -108, -30, 15, 5, 19, 16, 10, 5, g15.c, -99, -86, 99, -80, 92, -96, -95, -94, -91, -86, -95, 92, -81, -75, -81, -80, -95, -87, 92, -97, -99, -97, -92, -95, 92, -96, -91, -82, -95, -97, -80, -85, -82, -75, 93, 92, 99, -105, -80, -93, -92, -82, -89, 98, -74, -79, 98, -91, -76, -89, -93, -74, -89, 98, -89, -70, -74, -89, -76, -80, -93, -82, 98, -91, -93, -91, -86, -89, 98, -90, -85, -76, -89, -91, -74, -79, -76, -69, -17, -14, -4, 5, -69, -12, -9, -6, -13, -69, -15, -17, -15, -10, -13, -70, -72, -70, -65, -68, -4, -7, 12, -7, -86, -84, -78, -85, -79, -94, -95};
    }

    public static void A05() {
        A01 = new String[]{"D6HXNIO3o67WP6Lb9WeZ4uZB6vtWtdVu", "cjsE6VJpONlQ0Rz0EYuQMYTY7IBU", "NCxqzJ9XoyzJZwBaeLOgiQiCCHtLSMJc", "LKXEM", "cHYfBDGIswlwoHTG9sXOPVtnQq4RlSw", "XAdqAX6ybVrLNnFnWw3Xi2Wop2yzg6y", "bjQsnWBs6ncLG5xdfYwI325y2lxj13Ru", "y20EBjUW6EvufSuad4mnO0hpKR8Jq8vx"};
    }

    static {
        A05();
        A04();
        A02 = C0B.class.getSimpleName();
    }

    public static File A00(Context context) {
        File cacheDir = A02(context, true);
        return new File(cacheDir, A03(121, 15, 100));
    }

    @Nullable
    public static File A01(Context context) {
        File file = new File(new File(new File(new File(Environment.getExternalStorageDirectory(), A03(35, 7, 119)), A03(WKSRecord.Service.EMFIS_CNTL, 4, 110)), context.getPackageName()), A03(WKSRecord.Service.PROFILE, 5, 45));
        if (!file.exists() && !file.mkdirs()) {
            String str = A02;
            if (A01[2].charAt(7) != 'N') {
                String[] strArr = A01;
                strArr[1] = "AeJkRCXkXjDv9cPBWpKJYxCwPnU0";
                strArr[3] = "2aDrd";
                Log.w(str, A03(80, 41, 24));
                return null;
            }
            throw new RuntimeException();
        }
        return file;
    }

    public static File A02(Context context, boolean z) {
        String A03;
        File file = null;
        try {
            A03 = Environment.getExternalStorageState();
        } catch (NullPointerException unused) {
            A03 = A03(0, 0, 33);
        }
        if (z && A03(145, 7, 19).equals(A03)) {
            file = A01(context);
        }
        if (file == null) {
            file = context.getCacheDir();
        }
        if (file == null) {
            String str = A03(24, 11, 59) + context.getPackageName() + A03(17, 7, 39);
            String str2 = A02;
            StringBuilder sb = new StringBuilder();
            String cacheDirPath = A03(42, 38, 18);
            sb.append(cacheDirPath);
            sb.append(str);
            String cacheDirPath2 = A03(0, 17, 116);
            sb.append(cacheDirPath2);
            String cacheDirPath3 = sb.toString();
            Log.w(str2, cacheDirPath3);
            return new File(str);
        }
        return file;
    }
}