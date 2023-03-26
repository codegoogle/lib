package com.facebook.ads.redexgen.X;

import android.os.Process;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p7700g.p99005.bx;
import java.lang.Thread;
import java.util.Arrays;
import java.util.Map;
import org.xbill.DNS.Flags;

/* renamed from: com.facebook.ads.redexgen.X.8Y  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C8Y implements Thread.UncaughtExceptionHandler {
    public static byte[] A04;
    public final C1081Wi A00;
    public final InterfaceC04818f A01;
    public final Thread.UncaughtExceptionHandler A02;
    public final Map<String, String> A03;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 65);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{bx.W5, 28, 94, 122, 96, 96, 122, 125, 116, 51, 80, 124, 125, 103, 118, 107, 103, Flags.CD, 7, 5, 70, 14, 9, Flags.CD, 13, 10, 7, 7, 3, 70, 9, 12, 27, 71, 86, 69, 87, 76, 20, 18, 5, 19, 30, 23, 2, 80, 86, 65, 87, 90, 83, 70, 124, 64, 76, 71, 70};
    }

    public C8Y(@Nullable Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C1081Wi c1081Wi, C8X c8x) {
        this(uncaughtExceptionHandler, c1081Wi, c8x, C04828g.A00());
    }

    public C8Y(@Nullable Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C1081Wi c1081Wi, C8X c8x, InterfaceC04818f interfaceC04818f) {
        this.A02 = uncaughtExceptionHandler;
        if (c1081Wi != null) {
            this.A00 = c1081Wi;
            this.A03 = c8x.A6y(c1081Wi);
            this.A01 = interfaceC04818f;
            return;
        }
        throw new IllegalArgumentException(A00(2, 15, 82));
    }

    public static void A02() {
        try {
            Process.killProcess(Process.myPid());
        } catch (Throwable unused) {
        }
        try {
            System.exit(10);
        } catch (Throwable unused2) {
        }
    }

    private void A03(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.A02;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        } else {
            A02();
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            String A03 = LN.A03(this.A00, th);
            if (!TextUtils.isEmpty(A03) && A03.contains(A00(17, 16, 41))) {
                Map<String, String> A02 = new C8W(A03, this.A03).A02();
                A02.put(A00(38, 7, 38), A00(33, 5, 101));
                Throwable A00 = KP.A00();
                String A002 = A00(45, 12, 98);
                if (A00 != th) {
                    A02.put(A002, A00(0, 1, 91));
                } else {
                    A02.put(A002, A00(1, 1, 108));
                }
                this.A01.ADw(new C04888m(this.A00.A05().A01(), this.A00.A05().A02(), A02), this.A00);
                if (J8.A19(this.A00)) {
                    J8.A0a(this.A00);
                }
            }
        } catch (Exception unused) {
        }
        A03(thread, th);
    }
}