package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64OutputStream;
import androidx.annotation.Nullable;
import com.anythink.expressad.video.dynview.a.a;
import com.facebook.ads.internal.settings.AdSharedPreferences;
import com.p7700g.p99005.ax5;
import com.p7700g.p99005.bx;
import com.p7700g.p99005.g15;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.DeflaterOutputStream;
import org.json.JSONObject;
import org.xbill.DNS.Flags;

/* loaded from: assets/audience_network.dex */
public final class XJ implements C9B {
    @Nullable
    public static String A03;
    public static byte[] A04;
    public static String[] A05;
    public static final L5 A06;
    public static final AtomicBoolean A07;
    public static final AtomicInteger A08;
    public final C04265t A00;
    public final C8H A01;
    public final C04948s A02;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A05[6].length() == 9) {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[1] = "AJGqtkftO03LFXDJsHlFXR4ujVWNfKsn";
            strArr[7] = "0weTThgY8dzMPuXGgH30KJvXs1017h9U";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 73);
            i4++;
        }
    }

    public static void A06() {
        A04 = new byte[]{40, 96, 98, 98, 100, 114, 114, 104, 99, 104, 109, 104, 117, 120, 126, 100, 111, 96, 99, 109, 100, 101, 21, 18, 4, 41, 46, 56, 83, 45, 34, 45, 32, 35, 43, 98, 115, 115, 124, 110, 106, 109, 124, 112, 103, 104, 124, 117, 102, 113, 112, 106, 108, 109, 85, 71, 92, 85, 71, 78, 92, 70, 75, 44, 57, 57, ax5.a, 36, 47, 56, 57, 36, 34, 35, 50, 36, 41, 85, 94, 83, 83, 82, 69, 72, 67, 88, 92, 82, 89, 72, 82, 79, 67, 69, 86, 68, 106, 125, 102, 108, 100, 109, ax5.a, 61, 44, 44, 57, 56, 35, 53, 56, 47, 79, 77, 94, 94, 69, 73, 94, 18, 23, 2, 23, 9, 6, 4, 25, 21, 19, 5, 5, 31, 24, 17, 9, 25, 6, 2, 31, 25, 24, 5, 67, 70, 83, 70, 88, 87, 85, 72, 68, 66, 84, 84, 78, 73, 64, 88, 72, 87, 83, 78, 72, 73, 84, 88, 68, 72, 82, 73, 83, 85, 94, 92, 89, 76, 89, 71, 72, 74, 87, 91, 93, 75, 75, 81, 86, 95, 71, 87, 72, 76, 81, 87, 86, 75, 71, 75, 76, 89, 76, 93, 111, 110, 101, 120, 98, g15.c, 114, 30, 57, 49, 52, 61, 60, 120, 44, 55, 120, 58, 45, 49, 52, 60, 120, 45, 43, 61, bx.W5, 120, 44, 55, 51, 61, 54, 3, 10, 24, 20, 14, 19, 4, 27, 7, 10, 18, 14, 25, ax5.a, 50, 48, 55, 17, 28, 7, 27, 25, 27, 16, 29, 7, 12, Flags.CD, 7, 21, Flags.CD, 94, 83, 72, 68, 88, 66, 69, 84, 82, 52, 51, 46, 41, 60, 49, 49, 56, 47, 53, 54, 58, 56, 53, 60, 33, 45, 39, 41, 43, 35, 34, 47, 39, 50, 47, 41, 40, 57, 53, 35, 52, 48, 47, 37, 35, 73, 66, 83, 80, 72, 85, 76, 88, 83, 94, 87, 66, 114, 111, 111, 116, 101, 100, 27, Flags.CD, 26, 13, 13, 6, 23, 0, 13, 1, 15, 0, 28, 85, 69, 84, 67, 67, 72, 89, 81, 79, 66, 82, 78, 92, 75, 68, 80, 76, 78, 95, 78, 77, 70, 67, 70, 91, 86, 14, 24, 14, 14, 20, 18, 19, 2, 9, 20, 16, 24, 103, 124, 123, 102, 107, 103, 97, 119, 96, 109, 115, 117, 119, 124, 102, 58, 45, 32, 60, 45, 62, 45, 33, ax5.a, 75, 73, 66, 73, 94, 69, 79, 8, 19, 10, 10};
    }

    public static void A07() {
        A05 = new String[]{"rjWu3o3XUIKJimpXtRLH", "N3hUjd9gC1zTrolrzHWDwio6K0KaeF7v", "V8BOZxTrBek9nlJry76rEN1tEiA1lgnf", "2kaCuDD1e44XjFqxj97oS3bW7Y4jUXps", "VcJxC1jbHxk7XwGyeCWvHwY9E4qRcx1x", "dO6RHNbAuKw0kDbwpnJR", "8jPNINbp0cYAxxIn", "ugIdyp1aSJPFHYCiUHctz2XPYC5YD6Ud"};
    }

    static {
        A07();
        A06();
        A07 = new AtomicBoolean();
        A08 = new AtomicInteger(0);
        A03 = null;
        A06 = L6.A00();
    }

    public XJ(C8H c8h, boolean z, C04265t c04265t) {
        this.A01 = c8h;
        this.A02 = new C04948s(c8h);
        this.A00 = c04265t;
        A08(c8h, z);
    }

    public static /* synthetic */ String A00() {
        return A03;
    }

    @Nullable
    @SuppressLint({"CatchGeneralException"})
    public static String A02(C8H c8h, String str) {
        try {
            return LB.A02(c8h.getPackageManager().getApplicationInfo(str, 0).sourceDir);
        } catch (Exception e) {
            if (A07.compareAndSet(false, true)) {
                c8h.A04().A82(A01(a.t, 7, 101), C04848i.A17, new C04858j(e));
                return null;
            }
            return null;
        }
    }

    public static /* synthetic */ String A03(C8H c8h, String str) {
        return A02(c8h, str);
    }

    public static /* synthetic */ String A04(String str) {
        A03 = str;
        return str;
    }

    public static /* synthetic */ AtomicInteger A05() {
        return A08;
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A08(final C8H c8h, boolean z) {
        if (!A08.compareAndSet(0, 1)) {
            return;
        }
        try {
            final SharedPreferences sharedPreferences = AdSharedPreferences.getSharedPreferences(c8h);
            C04948s c04948s = new C04948s(c8h);
            final String str = A01(25, 4, 33) + c04948s.A06();
            A03 = sharedPreferences.getString(str, null);
            FutureTask futureTask = new FutureTask(new Callable<Boolean>() { // from class: com.facebook.ads.redexgen.X.9D
                /* JADX INFO: Access modifiers changed from: private */
                @Override // java.util.concurrent.Callable
                /* renamed from: A00 */
                public final Boolean call() throws Exception {
                    C8H c8h2 = C8H.this;
                    XJ.A04(XJ.A03(c8h2, c8h2.getPackageName()));
                    sharedPreferences.edit().putString(str, XJ.A00()).apply();
                    XJ.A05().set(2);
                    return true;
                }
            });
            Executors.newSingleThreadExecutor().submit(futureTask);
            if (z) {
                futureTask.get();
            }
        } catch (Exception unused) {
            AtomicInteger atomicInteger = A08;
            if (A05[2].charAt(4) == '1') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[0] = "BG3uZRuA0Chr9fB7D4fD";
            strArr[5] = "ED3rHXlImwDD4lq5TiwH";
            atomicInteger.set(0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x01b4, code lost:
        if (r3 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01b6, code lost:
        r0 = A01(54, 5, 93);
        r4.put(r0, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01c2, code lost:
        r3 = java.lang.String.valueOf(com.facebook.ads.redexgen.X.LA.A05(r8.A01));
        r0 = A01(380, 5, 123);
        r4.put(r0, r3);
        r3 = com.facebook.ads.internal.settings.AdInternalSettings.getMediationService();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01dc, code lost:
        if (r3 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01de, code lost:
        r0 = A01(294, 17, 47);
        r4.put(r0, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01eb, code lost:
        r3 = java.lang.String.valueOf(r8.A02.A0C());
        r0 = A01(1, 21, 104);
        r4.put(r0, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0208, code lost:
        if (r8.A02.A03() == (-1)) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x020a, code lost:
        r3 = java.lang.String.valueOf(r8.A02.A03());
        r0 = A01(35, 19, 106);
        r4.put(r0, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0221, code lost:
        r3 = com.facebook.ads.redexgen.X.AnonymousClass96.A05(r8.A01);
        r0 = A01(395, 9, 37);
        r4.put(r0, r3);
        r3 = com.facebook.ads.redexgen.X.LD.A01(com.facebook.ads.redexgen.X.C04938r.A02());
        r0 = A01(29, 6, 37);
        r4.put(r0, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x024e, code lost:
        if (com.facebook.ads.redexgen.X.J7.A06(r8.A01) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0250, code lost:
        r3 = com.facebook.ads.internal.bridge.fbsdk.FBLoginASID.getFBLoginASID();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0254, code lost:
        if (r3 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0256, code lost:
        r0 = A01(59, 4, 70);
        r4.put(r0, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0262, code lost:
        r7 = com.facebook.ads.redexgen.X.XG.A02().A0B(r8.A01).A5y();
        r5 = A01(173, 29, 81);
        r6 = A01(org.xbill.DNS.WKSRecord.Service.BL_IDM, 31, 78);
        r3 = A01(119, 23, 31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x028e, code lost:
        if (r7 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0290, code lost:
        r4.put(r3, r7.A09());
        r4.put(r6, java.lang.String.valueOf(r7.A06()));
        r4.put(r5, java.lang.String.valueOf(r7.A07()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x02ad, code lost:
        r4.put(A01(102, 10, 53), com.facebook.ads.redexgen.X.C03010u.A00());
        r3 = r8.A00.A03(r8.A01);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x02c6, code lost:
        if (r3 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x02cc, code lost:
        if (android.text.TextUtils.isEmpty(r3) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x02ce, code lost:
        r4.put(A01(77, 19, 94), r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x02db, code lost:
        r4.put(A01(235, 13, 2), java.lang.String.valueOf(com.facebook.ads.redexgen.X.GC.A0A()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x02ef, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x02f0, code lost:
        r0 = A01(411, 4, 47);
        r4.put(r3, r0);
        r4.put(r6, r0);
        r4.put(r5, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x030f, code lost:
        if (r3 != null) goto L12;
     */
    @Override // com.facebook.ads.redexgen.X.C9B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map<String, String> A69() {
        A08(this.A01, false);
        C04938r.A0B(this.A01);
        C04938r.A08(this.A01);
        HashMap hashMap = new HashMap();
        AnonymousClass98.A02(this.A01, hashMap);
        hashMap.put(A01(284, 6, 48), Locale.getDefault().toString());
        float f = C0795Le.A01;
        int i = this.A01.getResources().getDisplayMetrics().widthPixels;
        int i2 = this.A01.getResources().getDisplayMetrics().heightPixels;
        hashMap.put(A01(a.n, 7, 98), String.valueOf(f));
        int screenHeight = (int) (i / f);
        hashMap.put(A01(342, 12, 79), String.valueOf(screenHeight));
        int screenHeight2 = (int) (i2 / f);
        hashMap.put(A01(329, 13, 1), String.valueOf(screenHeight2));
        hashMap.put(A01(63, 14, 36), C04135f.A03());
        hashMap.put(A01(266, 9, 94), C04135f.A00().A02().name());
        hashMap.put(A01(252, 14, 17), String.valueOf(C04135f.A00().A01()));
        hashMap.put(A01(96, 6, 97), C9G.A03(this.A01, this.A02));
        hashMap.put(A01(112, 7, 69), this.A02.A08());
        hashMap.put(A01(290, 4, 37), this.A02.A09());
        int screenHeight3 = A06.A00;
        hashMap.put(A01(323, 6, 105), String.valueOf(screenHeight3));
        hashMap.put(A01(275, 9, 52), this.A02.A0B());
        hashMap.put(A01(354, 14, 70), EnumC0789Ky.A01());
        int screenHeight4 = LU.A00(this.A01).A00;
        hashMap.put(A01(311, 12, 78), String.valueOf(screenHeight4));
        hashMap.put(A01(368, 12, 20), LW.A02(this.A01.A05().A01()));
        String str = A03;
        if (str != null) {
            String A01 = A01(22, 3, 29);
            String[] strArr = A05;
            String str2 = strArr[1];
            String str3 = strArr[7];
            int charAt = str2.charAt(17);
            int screenHeight5 = str3.charAt(17);
            if (charAt != screenHeight5) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[1] = "AqiFfSJaVcvWeekshHh0ldvtL31lvyuj";
            strArr2[7] = "9HeqxNTbWRKyR8KfBHSSaEFZWfPVqzw4";
            hashMap.put(A01, str);
        }
        String A02 = L6.A02(this.A01);
        String[] strArr3 = A05;
        String str4 = strArr3[0];
        String str5 = strArr3[5];
        int length = str4.length();
        int screenHeight6 = str5.length();
        if (length == screenHeight6) {
            String[] strArr4 = A05;
            strArr4[1] = "BCkwQrwTZAh8DbNWYHcyNfiOEn9j0AAp";
            strArr4[7] = "Pk3Ope4wXmj489nPkHNYEkNTYlpVjL8G";
        }
    }

    @Override // com.facebook.ads.redexgen.X.C9B
    public final String A72() {
        return A73(C9A.A00());
    }

    @Override // com.facebook.ads.redexgen.X.C9B
    public final String A73(AnonymousClass99 anonymousClass99) {
        A08(this.A01, true);
        ByteArrayOutputStream byteArrayOutputStream = null;
        Base64OutputStream base64OutputStream = null;
        DeflaterOutputStream deflaterOutputStream = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 0);
                deflaterOutputStream = new DeflaterOutputStream(base64OutputStream);
                Map<String, String> A69 = A69();
                if (TextUtils.isEmpty(C04135f.A00().A03())) {
                    C04135f.A08(this.A01);
                }
                A69.put(A01(248, 4, 63), C04135f.A00().A03());
                A69.put(A01(385, 10, 123), C9G.A06(this.A02, this.A01, false));
                Iterator<Map.Entry<String, String>> it = A69.entrySet().iterator();
                while (it.hasNext()) {
                    if (!anonymousClass99.A2O(it.next().getKey())) {
                        it.remove();
                    }
                }
                deflaterOutputStream.write(new JSONObject(A69).toString().getBytes());
                deflaterOutputStream.close();
                String replaceAll = byteArrayOutputStream.toString().replaceAll(A01(0, 1, 107), A01(0, 0, 37));
                try {
                    deflaterOutputStream.close();
                    base64OutputStream.close();
                    byteArrayOutputStream.close();
                } catch (IOException unused) {
                }
                return replaceAll;
            } catch (Throwable e) {
                if (deflaterOutputStream != null) {
                    try {
                        deflaterOutputStream.close();
                    } catch (IOException unused2) {
                        throw e;
                    }
                }
                if (base64OutputStream != null) {
                    base64OutputStream.close();
                }
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.close();
                }
                throw e;
            }
        } catch (IOException e2) {
            throw new RuntimeException(A01(209, 26, 17), e2);
        }
    }
}