package com.facebook.ads.redexgen.X;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.4h */
/* loaded from: assets/audience_network.dex */
public final class C03894h extends Thread {
    public static byte[] A07;
    public static String[] A08;
    public static final String A09;
    public final int A00;
    public final Handler A01;
    public final C03914j A02;
    public final C1080Wh A03;
    public final Runnable A04;
    public volatile long A05;
    public volatile boolean A06;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 116);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A07 = new byte[]{97, 101, 10, 102, 105, 117, 10, 99, 66, 83, 66, 68, 83, 72, 85, 103, 101, 110, 101, 114, 105, 99};
    }

    public static void A03() {
        A08 = new String[]{"22scehDHoaCOvZMprlsBZA8XDImDmfKB", "weKghC0VptQmI5ngiGaEXX", "Hf9H6", "FJiPG4ANJnN6", "MZm2fX9OE1lWAQp9g7i9e16yKVjr6LaO", "qv5p39sFFmKE2Upe5HhwzyNbLjT31UC6", "BSHanWyHkNGNXcGKwO9o06mFf", "6OihQTIk4xH7HyNYKpu4LMiaEL1fh7ec"};
    }

    static {
        A03();
        A02();
        A09 = C03894h.class.getName();
    }

    public C03894h(C1080Wh c1080Wh, C03914j c03914j) {
        this(c1080Wh, c03914j, J8.A06(c1080Wh));
    }

    public C03894h(C1080Wh c1080Wh, C03914j c03914j, int i) {
        this.A01 = new Handler(Looper.getMainLooper());
        this.A04 = new Runnable() { // from class: com.facebook.ads.redexgen.X.4g
            @Override // java.lang.Runnable
            public final void run() {
                if (KU.A02(this)) {
                    return;
                }
                try {
                    C03894h.A00(C03894h.this, 0L);
                    C03894h.A04(C03894h.this, false);
                } catch (Throwable th) {
                    KU.A00(th, this);
                }
            }
        };
        this.A05 = 0L;
        this.A06 = false;
        setName(A01(0, 15, 83));
        this.A00 = i;
        this.A03 = c1080Wh;
        this.A02 = c03914j;
    }

    public static /* synthetic */ long A00(C03894h c03894h, long j) {
        c03894h.A05 = j;
        return j;
    }

    public static /* synthetic */ boolean A04(C03894h c03894h, boolean z) {
        c03894h.A06 = z;
        return z;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (KU.A02(this)) {
            return;
        }
        try {
            long j = this.A00;
            while (!isInterrupted()) {
                long j2 = this.A05;
                String[] strArr = A08;
                if (strArr[1].length() != strArr[2].length()) {
                    String[] strArr2 = A08;
                    strArr2[3] = "QDJRY7exkP3l";
                    strArr2[6] = "zyOVtGNErBmKt3HrtbWcAlOC0";
                    boolean needPost = j2 == 0;
                    this.A05 = j;
                    if (needPost) {
                        this.A01.post(this.A04);
                    }
                    try {
                        Thread.sleep(j);
                        if (this.A05 != 0) {
                            boolean needPost2 = this.A06;
                            if (!needPost2) {
                                boolean needPost3 = Debug.isDebuggerConnected();
                                if (!needPost3) {
                                    boolean needPost4 = this.A02.A05();
                                    if (needPost4) {
                                        this.A03.A04().A82(A01(15, 7, 116), C04848i.A0y, new C04858j(this.A02.A04()));
                                    }
                                    this.A06 = true;
                                }
                            }
                        }
                    } catch (InterruptedException unused) {
                        BuildConfigApi.isDebug();
                        return;
                    }
                } else {
                    throw new RuntimeException();
                }
            }
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }
}