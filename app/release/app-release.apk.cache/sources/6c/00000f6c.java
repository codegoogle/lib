package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.p7700g.p99005.ax5;
import com.p7700g.p99005.bx;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.xbill.DNS.WKSRecord;

/* renamed from: com.facebook.ads.redexgen.X.9G */
/* loaded from: assets/audience_network.dex */
public final class C9G {
    public static String A00;
    public static byte[] A01;
    public static String[] A02;
    public static final AtomicBoolean A03;
    public static final AtomicReference<String> A04;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 19);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A01 = new byte[]{76, 55, 71, 45, 2, 8, 30, 3, 5, 8, 44, 40, 43, 40, 69, 24, 28, 31, 16, 113, 31, 43, 58, 55, 59, 48, 61, 59, 16, 59, bx.W5, 41, 49, 44, 53, 24, 49, 44, 31, 48, 58, 44, 49, 55, 58, 101, 99, 103, 100, 115, 10, 32, 36, 36, 48, 73, 16, 20, 26, 21, 121, 72, 76, 93, 64, 33, 7, 3, 18, 23, 110, 26, 30, 10, 15, 115, 43, 50, 36, 53, 46, 55, 55, 7, 60, 57, 60, 61, 37, 60, 4, 48, 60, 62, 125, 53, 50, 48, 54, 49, 60, 60, 56, 125, 50, 55, 32, 125, 58, 61, 39, 54, 33, 61, 50, ax5.a, 125, 38, 50, 46, 44, 39, 44, 59, 32, bx.W5, 47, 51, 51, 55, 105, 38, 32, 34, 41, 51, 87, 81, 71, 80, 125, 67, 69, 71, 76, 86, 106, 108, 122, 109, 64, 126, 120, 122, 113, 107, 64, 115, 126, 108, 107, 64, 109, 122, 121, 109, 122, 108, 119, 120, 106, 109, 80, 121, 102, 106, 120};
    }

    public static void A09() {
        A02 = new String[]{"Qr1EFu0kx1tI01867m6ODqfSZ9SwtWDI", "3TYgkAWbIjP9kMvunjr7VwfmqgOZ7ZQ4", "kyx9q1x7DLL5BxK3faNs604Sw4dxbCMr", "cJW9lkVABx2P1Kp63XktrUnlRFV2zQAL", "nhxLXaLaMxGTsXNVJcvnwyCHZZV2RS3H", "y9xLyKazRl3zNBUnfIZmAOMjGK0AXhl4", "DTEqb4TbXnNBCaxA5atVnYK0pSb9DMUi", "fZvghiN"};
    }

    static {
        A09();
        A08();
        A00 = A00(83, 7, 65);
        A03 = new AtomicBoolean();
        A04 = new AtomicReference<>();
    }

    @TargetApi(17)
    @VisibleForTesting
    public static String A01(C8H c8h) {
        return WebSettings.getDefaultUserAgent(c8h);
    }

    @Nullable
    @SuppressLint({"CatchGeneralException"})
    public static String A02(final C8H c8h) {
        FutureTask futureTask = new FutureTask(new Callable<String>() { // from class: com.facebook.ads.redexgen.X.9F
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.concurrent.Callable
            /* renamed from: A00 */
            public final String call() {
                String str = (String) C9G.A07().get();
                if (str != null) {
                    return str;
                }
                WebView webView = new WebView(C8H.this.getApplicationContext());
                String userAgentString = webView.getSettings().getUserAgentString();
                webView.destroy();
                if (userAgentString != null) {
                    C9G.A07().set(userAgentString);
                }
                return userAgentString;
            }
        });
        for (int i = 0; i < 3; i++) {
            LZ.A00(futureTask);
            try {
                return (String) futureTask.get();
            } catch (Throwable t) {
                A0A(c8h, t);
                SystemClock.sleep(500L);
            }
        }
        return null;
    }

    public static String A03(C8H c8h, C04948s c04948s) {
        String A07 = c04948s.A07();
        if (TextUtils.isEmpty(A07)) {
            boolean andSet = A03.getAndSet(true);
            String[] strArr = A02;
            if (strArr[4].charAt(26) != strArr[3].charAt(26)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[1] = "SlGltdwaGCQXXY2U2bjZ1NfeES9SOW6r";
            strArr2[0] = "AnJMWH4pc3dV3Xqon1tLsffrk7nZCcYt";
            if (!andSet) {
                c8h.A04().A82(A00(119, 7, 90), C04848i.A1G, new C04858j(A00(76, 7, 104)));
            }
        }
        return A07;
    }

    @Nullable
    @SuppressLint({"CatchGeneralException"})
    public static String A04(C8H c8h, boolean z) {
        if (c8h == null) {
            return A00;
        }
        if (z) {
            return System.getProperty(A00(126, 10, 84));
        }
        String str = A04.get();
        if (str != null) {
            return str;
        }
        long A012 = J7.A01(c8h);
        String A002 = A00(146, 23, 12);
        String A003 = A00(WKSRecord.Service.PROFILE, 10, 49);
        String A004 = A00(91, 28, 64);
        if (A012 > 0) {
            SharedPreferences sharedPreferences = c8h.getSharedPreferences(ProcessUtils.getProcessSpecificName(A004, c8h), 0);
            String string = sharedPreferences.getString(A003, null);
            long j = sharedPreferences.getLong(A002, 0L);
            if (!TextUtils.isEmpty(string) && System.currentTimeMillis() - j < A012) {
                A04.set(string);
                return string;
            }
        }
        String str2 = null;
        if (Build.VERSION.SDK_INT >= 17) {
            try {
                str2 = A01(c8h);
                A04.set(str2);
            } catch (Throwable th) {
                A0A(c8h, th);
            }
        }
        if (str2 == null) {
            str2 = A02(c8h);
        }
        if (str2 == null) {
            String userAgentString = A00;
            return userAgentString;
        }
        int i = (A012 > 0L ? 1 : (A012 == 0L ? 0 : -1));
        String[] strArr = A02;
        if (strArr[4].charAt(26) != strArr[3].charAt(26)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[7] = "Kvz6zSF";
        strArr2[7] = "Kvz6zSF";
        if (i > 0) {
            String userAgentString2 = ProcessUtils.getProcessSpecificName(A004, c8h);
            SharedPreferences sharedPreferences2 = c8h.getSharedPreferences(userAgentString2, 0);
            SharedPreferences.Editor edit = sharedPreferences2.edit();
            String userAgentString3 = A04.get();
            edit.putString(A003, userAgentString3).apply();
            sharedPreferences2.edit().putLong(A002, System.currentTimeMillis()).apply();
        }
        return str2;
    }

    public static String A05(C04948s c04948s, C8H c8h) {
        if (J7.A05(c8h)) {
            StringBuilder sb = new StringBuilder();
            sb.append(A00(10, 5, 121));
            sb.append(A03(c8h, c04948s));
            String A002 = A00(2, 1, 111);
            sb.append(A002);
            sb.append(A00(46, 5, 54));
            sb.append(c04948s.A06());
            sb.append(A002);
            sb.append(A00(51, 5, 117));
            sb.append(c04948s.A04());
            sb.append(A002);
            return sb.toString();
        }
        return A00(0, 0, 40);
    }

    public static String A06(C04948s c04948s, C8H c8h, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(A04(c8h, z));
        sb.append(A00(0, 2, 127));
        sb.append(A00(15, 31, 77));
        sb.append(A00(61, 5, 29));
        sb.append(A00(3, 7, 127));
        String A002 = A00(2, 1, 111);
        sb.append(A002);
        sb.append(A00(66, 5, 82));
        sb.append(C04948s.A03);
        sb.append(A002);
        sb.append(A05(c04948s, c8h));
        sb.append(A00(71, 5, 79));
        sb.append(BuildConfigApi.getVersionName(c8h));
        sb.append(A002);
        sb.append(A00(56, 5, 69));
        sb.append(Locale.getDefault().toString());
        sb.append(A00(90, 1, 74));
        return sb.toString();
    }

    public static /* synthetic */ AtomicReference A07() {
        return A04;
    }

    public static void A0A(C8H c8h, Throwable th) {
        c8h.A04().A82(A00(169, 8, 28), C04848i.A2E, new C04858j(th));
    }
}