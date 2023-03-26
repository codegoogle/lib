package com.facebook.ads.redexgen.X;

import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* renamed from: com.facebook.ads.redexgen.X.al  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1220al implements InterfaceC0698He {
    public static String[] A03;
    public HY<? extends HZ> A00;
    public IOException A01;
    public final ExecutorService A02;

    static {
        A04();
    }

    public static void A04() {
        A03 = new String[]{"zA1HDLVhPd9PsL9PenCbpcrAKXxlN0d6", "FLS1DqH1RbizqOpj", "1z8O9NEtb5xyjYGA", "8w8GUSv0BTEQmaLhHrYTkFjQIFXWxu0p", "o1jGjvwpoOOHSDmJh0w1BZ4ZQReO8O7V", "", "IXAYHKYtOagUrLCRc2OBPi2ErH2JE5Q2", "ufrZt7t49gDVq6vRzV1VlqPqnp3Kfu3W"};
    }

    public C1220al(String str) {
        this.A02 = C0726Ig.A0T(str);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HX != com.facebook.ads.internal.exoplayer2.upstream.Loader$Callback<T extends com.facebook.ads.redexgen.X.HZ> */
    public final <T extends HZ> long A05(T loadable, HX<T> hx, int i) {
        Looper myLooper = Looper.myLooper();
        I1.A04(myLooper != null);
        this.A01 = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new HY(this, myLooper, loadable, hx, i, elapsedRealtime).A06(0L);
        return elapsedRealtime;
    }

    public final void A06() {
        this.A00.A07(false);
    }

    public final void A07(int i) throws IOException {
        IOException iOException = this.A01;
        if (iOException == null) {
            HY<? extends HZ> hy = this.A00;
            if (hy != null) {
                if (A03[0].charAt(1) != 'f') {
                    String[] strArr = A03;
                    strArr[2] = "ShO16ogjgPVIHMzl";
                    strArr[1] = "8gZONBnlwtDMou1V";
                    if (i == Integer.MIN_VALUE) {
                        i = hy.A03;
                    }
                    hy.A05(i);
                    return;
                }
                throw new RuntimeException();
            }
            return;
        }
        throw iOException;
    }

    public final void A08(@Nullable InterfaceC0694Ha interfaceC0694Ha) {
        HY<? extends HZ> hy = this.A00;
        if (hy != null) {
            hy.A07(true);
        }
        if (interfaceC0694Ha != null) {
            this.A02.execute(new RunnableC0695Hb(interfaceC0694Ha));
        }
        this.A02.shutdown();
    }

    public final boolean A09() {
        return this.A00 != null;
    }
}