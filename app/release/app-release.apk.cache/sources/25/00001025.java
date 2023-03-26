package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.p7700g.p99005.ax5;
import com.p7700g.p99005.g15;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import org.xbill.DNS.WKSRecord;

/* loaded from: assets/audience_network.dex */
public final class CX implements Handler.Callback, InterfaceC1166Zt, HA, FH, A1, AY {
    public static byte[] A0V;
    public static String[] A0W;
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public AD A04;
    public AO A05;
    public FI A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public InterfaceC1104Xf[] A0C;
    public final long A0D;
    public final Handler A0E;
    public final HandlerThread A0F;
    public final XZ A0G;
    public final InterfaceC1102Xd A0H;
    public final AJ A0J;
    public final C0534Ah A0L;
    public final C0535Ai A0M;
    public final HB A0N;
    public final HC A0O;
    public final I4 A0P;
    public final IE A0Q;
    public final ArrayList<AB> A0R;
    public final boolean A0S;
    public final InterfaceC1104Xf[] A0T;
    public final InterfaceC0530Ac[] A0U;
    public final AM A0K = new AM();
    public C0533Af A06 = C0533Af.A03;
    public final AC A0I = new AC(null);

    static {
        A0L();
        A0K();
    }

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0V, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 98);
        }
        return new String(copyOfRange);
    }

    public static void A0K() {
        A0V = new byte[]{40, 21, 2, 61, 1, 12, 20, 8, 31, 36, 0, 29, 1, 36, 3, 25, 8, 31, 3, 12, 1, 40, 21, 2, 61, 1, 12, 20, 8, 31, 36, 0, 29, 1, 36, 3, 25, 8, 31, 3, 12, 1, 87, 37, 12, 3, 9, 1, 8, 31, 25, 55, 62, ax5.a, 34, 57, 62, 55, 112, 61, 53, 35, 35, 49, 55, 53, 35, 112, 35, 53, 62, 36, 112, 49, 54, 36, 53, 34, 112, 34, 53, 60, 53, 49, 35, 53, 126, 71, 96, 122, 107, 124, 96, 111, 98, 46, 124, 123, 96, 122, 103, 99, 107, 46, 107, 124, 124, 97, 124, 32, 50, 14, 3, 27, 0, 3, 1, 9, 66, 7, 16, 16, 13, 16, 76, 102, 90, 64, 71, 86, 80, 21, 80, 71, 71, 90, 71, 27, 74, 109, 118, 105, 57, g15.c, 120, 112, 117, 124, 125, 55, 119, 124, 64, 124, 126, 118, 68, 124, 97, 120};
    }

    public static void A0L() {
        A0W = new String[]{"86glHvEVsTHsOarjgO3yrK", "TuAJpp7uzbfmMtpdLTRiZnKK78MiZtWb", "2J1ujHTPZohQZteX1j6kCS7zhajZ8mZI", "eCxkC7v7XtRVNueTNXvbthBaIEqCwNNl", "l3Yyub2xLFiYeWCCac", "TG0XkoHYQCfebcNj4J", "6SVWI1Jvh0Z3jrcRBB9hLc8AjjQAtTry", "lVbeqNrXIfO7zu9EZv7JtI"};
    }

    public CX(InterfaceC1104Xf[] interfaceC1104XfArr, HB hb, HC hc, AJ aj, boolean z, int i, boolean z2, Handler handler, InterfaceC1102Xd interfaceC1102Xd, I4 i4) {
        this.A0T = interfaceC1104XfArr;
        this.A0N = hb;
        this.A0O = hc;
        this.A0J = aj;
        this.A08 = z;
        this.A02 = i;
        this.A0B = z2;
        this.A0E = handler;
        this.A0H = interfaceC1102Xd;
        this.A0P = i4;
        this.A0D = aj.A5R();
        this.A0S = aj.ACc();
        this.A05 = new AO(AbstractC0536Aj.A01, -9223372036854775807L, TrackGroupArray.A04, hc);
        this.A0U = new InterfaceC0530Ac[interfaceC1104XfArr.length];
        for (int i2 = 0; i2 < interfaceC1104XfArr.length; i2++) {
            interfaceC1104XfArr[i2].ACx(i2);
            this.A0U[i2] = interfaceC1104XfArr[i2].A5c();
        }
        this.A0G = new XZ(this, i4);
        this.A0R = new ArrayList<>();
        this.A0C = new InterfaceC1104Xf[0];
        this.A0M = new C0535Ai();
        this.A0L = new C0534Ah();
        hb.A00(this);
        this.A0F = new HandlerThread(A06(21, 29, 15), -16);
        this.A0F.start();
        this.A0Q = i4.A4I(this.A0F.getLooper(), this);
    }

    private int A00() {
        AbstractC0536Aj abstractC0536Aj = this.A05.A03;
        if (abstractC0536Aj.A0F()) {
            return 0;
        }
        return abstractC0536Aj.A0C(abstractC0536Aj.A06(this.A0B), this.A0M).A00;
    }

    private int A01(int i, AbstractC0536Aj abstractC0536Aj, AbstractC0536Aj abstractC0536Aj2) {
        int maxIterations = i;
        int i2 = -1;
        int A01 = abstractC0536Aj.A01();
        for (int i3 = 0; i3 < A01 && i2 == -1; i3++) {
            maxIterations = abstractC0536Aj.A04(maxIterations, this.A0L, this.A0M, this.A02, this.A0B);
            if (maxIterations == -1) {
                break;
            }
            i2 = abstractC0536Aj2.A05(abstractC0536Aj.A0B(maxIterations, this.A0L, true).A03);
        }
        return i2;
    }

    private long A02(FG fg, long j) throws A4 {
        return A03(fg, j, this.A0K.A0H() != this.A0K.A0I());
    }

    private long A03(FG fg, long j, boolean z) throws A4 {
        A0H();
        this.A09 = false;
        A0O(2);
        AK A0H = this.A0K.A0H();
        AK newPlayingPeriodHolder = A0H;
        while (true) {
            if (newPlayingPeriodHolder == null) {
                break;
            } else if (A0u(fg, j, newPlayingPeriodHolder)) {
                this.A0K.A0T(newPlayingPeriodHolder);
                break;
            } else {
                newPlayingPeriodHolder = this.A0K.A0D();
            }
        }
        if (A0H != newPlayingPeriodHolder || z) {
            InterfaceC1104Xf[] interfaceC1104XfArr = this.A0C;
            if (A0W[5].length() == 18) {
                String[] strArr = A0W;
                strArr[4] = "MfZ5b0v7S5HL";
                strArr[4] = "MfZ5b0v7S5HL";
                for (InterfaceC1104Xf interfaceC1104Xf : interfaceC1104XfArr) {
                    if (A0W[6].charAt(23) == 'j') {
                        break;
                    }
                    String[] strArr2 = A0W;
                    strArr2[4] = "gre2iAEzIfwakAGQE6Y0w4gvRDGAgj";
                    strArr2[4] = "gre2iAEzIfwakAGQE6Y0w4gvRDGAgj";
                    A0c(interfaceC1104Xf);
                }
                this.A0C = new InterfaceC1104Xf[0];
                A0H = null;
            }
            throw new RuntimeException();
        }
        if (newPlayingPeriodHolder != null) {
            A0W(A0H);
            boolean z2 = newPlayingPeriodHolder.A05;
            String[] strArr3 = A0W;
            if (strArr3[1].charAt(27) != strArr3[2].charAt(27)) {
                String[] strArr4 = A0W;
                strArr4[5] = "xpv6IUpjcorvZnU437";
                strArr4[5] = "xpv6IUpjcorvZnU437";
                if (z2) {
                    j = newPlayingPeriodHolder.A08.ACn(j);
                    newPlayingPeriodHolder.A08.A4m(j - this.A0D, this.A0S);
                }
                A0Q(j);
                A09();
            }
            throw new RuntimeException();
        }
        this.A0K.A0P(true);
        A0Q(j);
        this.A0Q.ACp(2);
        return j;
    }

    private Pair<Integer, Long> A04(AD ad, boolean z) {
        int A01;
        AbstractC0536Aj abstractC0536Aj = this.A05.A03;
        AbstractC0536Aj abstractC0536Aj2 = ad.A02;
        if (abstractC0536Aj.A0F()) {
            return null;
        }
        if (abstractC0536Aj2.A0F()) {
            abstractC0536Aj2 = abstractC0536Aj;
        }
        try {
            Pair<Integer, Long> A08 = abstractC0536Aj2.A08(this.A0M, this.A0L, ad.A00, ad.A01);
            if (abstractC0536Aj == abstractC0536Aj2) {
                return A08;
            }
            int A05 = abstractC0536Aj.A05(abstractC0536Aj2.A0B(((Integer) A08.first).intValue(), this.A0L, true).A03);
            if (A05 != -1) {
                Integer valueOf = Integer.valueOf(A05);
                Object obj = A08.second;
                if (A0W[5].length() != 18) {
                    throw new RuntimeException();
                }
                String[] strArr = A0W;
                strArr[4] = "NzmvKaw5D7qN";
                strArr[4] = "NzmvKaw5D7qN";
                return Pair.create(valueOf, obj);
            } else if (!z || (A01 = A01(((Integer) A08.first).intValue(), abstractC0536Aj2, abstractC0536Aj)) == -1) {
                return null;
            } else {
                int i = abstractC0536Aj.A0A(A01, this.A0L).A00;
                String[] strArr2 = A0W;
                if (strArr2[1].charAt(27) != strArr2[2].charAt(27)) {
                    String[] strArr3 = A0W;
                    strArr3[4] = "Yw40DLhiFndXC7wfBusX4OUMnHZHVu";
                    strArr3[4] = "Yw40DLhiFndXC7wfBusX4OUMnHZHVu";
                    return A05(abstractC0536Aj, i, -9223372036854775807L);
                }
                return A05(abstractC0536Aj, i, -9223372036854775807L);
            }
        } catch (IndexOutOfBoundsException unused) {
            throw new AI(abstractC0536Aj, ad.A00, ad.A01);
        }
    }

    private Pair<Integer, Long> A05(AbstractC0536Aj abstractC0536Aj, int i, long j) {
        return abstractC0536Aj.A08(this.A0M, this.A0L, i, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x01a6, code lost:
        if (r8 != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01ac, code lost:
        if (r16.A05.A00 == 3) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01b2, code lost:
        if (r16.A05.A00 != 2) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b4, code lost:
        A0S(r2, 10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b9, code lost:
        com.facebook.ads.redexgen.X.C0723Id.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01bc, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c0, code lost:
        if (r16.A0C.length == 0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c6, code lost:
        if (r16.A05.A00 == 4) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01c8, code lost:
        A0S(r2, 1000);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ce, code lost:
        r16.A0Q.ACN(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01e0, code lost:
        if (r8 != false) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0093 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A07() throws A4, IOException {
        String[] strArr;
        long ADf = this.A0P.ADf();
        A0I();
        if (!this.A0K.A0Q()) {
            A0B();
            A0S(ADf, 10L);
            return;
        }
        AK A0H = this.A0K.A0H();
        C0723Id.A02(A06(IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, 10, 113));
        A0J();
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        A0H.A08.A4m(this.A05.A0A - this.A0D, this.A0S);
        boolean z = true;
        boolean renderersReadyOrEnded = true;
        InterfaceC1104Xf[] interfaceC1104XfArr = this.A0C;
        int length = interfaceC1104XfArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                InterfaceC1104Xf interfaceC1104Xf = interfaceC1104XfArr[i];
                interfaceC1104Xf.ACQ(this.A03, elapsedRealtime);
                boolean z2 = true;
                if (z) {
                    boolean A7Z = interfaceC1104Xf.A7Z();
                    String[] strArr2 = A0W;
                    if (strArr2[0].length() != strArr2[7].length()) {
                        break;
                    }
                    String[] strArr3 = A0W;
                    strArr3[5] = "7MZ43Mfosz2cVY7YLE";
                    strArr3[5] = "7MZ43Mfosz2cVY7YLE";
                    if (A7Z) {
                        z = true;
                        if (A0W[5].length() == 18) {
                            throw new RuntimeException();
                        }
                        String[] strArr4 = A0W;
                        strArr4[1] = "fzNe8vrGdkAB7w8Spfiah9EVMBtgHYCD";
                        strArr4[2] = "yf8JTWMsX4Kj3fiI7V6gWL7AnmER89HT";
                        boolean rendererReadyOrEnded = interfaceC1104Xf.A7i() || interfaceC1104Xf.A7Z() || A0t(interfaceC1104Xf);
                        if (!rendererReadyOrEnded) {
                            interfaceC1104Xf.A8X();
                        }
                        if (!renderersReadyOrEnded || !rendererReadyOrEnded) {
                            z2 = false;
                        }
                        renderersReadyOrEnded = z2;
                        i++;
                    }
                }
                z = false;
                if (A0W[5].length() == 18) {
                }
            } else {
                if (!renderersReadyOrEnded) {
                    A0B();
                }
                long playingPeriodDurationUs = A0H.A02.A01;
                if (z && (playingPeriodDurationUs == -9223372036854775807L || playingPeriodDurationUs <= this.A05.A0A)) {
                    AL al = A0H.A02;
                    if (A0W[3].charAt(0) != 'c') {
                        String[] strArr5 = A0W;
                        strArr5[0] = "wV9HOTo1O64nuX5ISvKSbD";
                        strArr5[7] = "bxDx4NmgY0h2jOwlZLjnQH";
                        if (al.A05) {
                            A0O(4);
                            A0H();
                            AO ao = this.A05;
                            strArr = A0W;
                            if (strArr[1].charAt(27) != strArr[2].charAt(27)) {
                                throw new RuntimeException();
                            }
                            String[] strArr6 = A0W;
                            strArr6[4] = "xlSDIVprGLpZzqi21Os";
                            strArr6[4] = "xlSDIVprGLpZzqi21Os";
                            if (ao.A00 == 2) {
                                for (InterfaceC1104Xf interfaceC1104Xf2 : this.A0C) {
                                    interfaceC1104Xf2.A8X();
                                }
                            }
                            boolean z3 = this.A08;
                            String[] strArr7 = A0W;
                            if (strArr7[0].length() == strArr7[7].length()) {
                                String[] strArr8 = A0W;
                                strArr8[0] = "A8R7VCW6d20zhsH9TJ0X19";
                                strArr8[7] = "kPu9qHLeO477rnG8ZKl3CX";
                            }
                        }
                    }
                }
                if (this.A05.A00 == 2 && A0v(renderersReadyOrEnded)) {
                    A0O(3);
                    if (this.A08) {
                        A0G();
                    }
                } else if (this.A05.A00 == 3 && (this.A0C.length != 0 ? !renderersReadyOrEnded : !A0r())) {
                    this.A09 = this.A08;
                    if (A0W[4].length() == 29) {
                        throw new RuntimeException();
                    }
                    String[] strArr9 = A0W;
                    strArr9[5] = "etImyFrMwyU7Uaqc08";
                    strArr9[5] = "etImyFrMwyU7Uaqc08";
                    A0O(2);
                    A0H();
                }
                AO ao2 = this.A05;
                strArr = A0W;
                if (strArr[1].charAt(27) != strArr[2].charAt(27)) {
                }
            }
        }
        throw new RuntimeException();
    }

    private void A08() {
        A0O(4);
        A0p(false, true, false);
    }

    private void A09() {
        AK A0G = this.A0K.A0G();
        long A07 = A0G.A07();
        if (A07 == Long.MIN_VALUE) {
            A0l(false);
            return;
        }
        long bufferedDurationUs = A07 - A0G.A09(this.A03);
        boolean AD8 = this.A0J.AD8(bufferedDurationUs, this.A0G.A6l().A01);
        A0l(AD8);
        if (AD8) {
            long nextLoadPositionUs = this.A03;
            A0G.A0G(nextLoadPositionUs);
        }
    }

    private void A0A() {
        int i;
        if (this.A0I.A06(this.A05)) {
            Handler handler = this.A0E;
            int A00 = AC.A00(this.A0I);
            if (AC.A02(this.A0I)) {
                i = AC.A01(this.A0I);
            } else {
                i = -1;
            }
            handler.obtainMessage(0, A00, i, this.A05).sendToTarget();
            this.A0I.A05(this.A05);
        }
    }

    private void A0B() throws IOException {
        InterfaceC1104Xf[] interfaceC1104XfArr;
        AK A0G = this.A0K.A0G();
        AK A0I = this.A0K.A0I();
        if (A0G != null && !A0G.A06) {
            if (A0I != null) {
                AK readingPeriodHolder = A0I.A01;
                if (readingPeriodHolder != A0G) {
                    return;
                }
            }
            for (InterfaceC1104Xf renderer : this.A0C) {
                if (!renderer.A7K()) {
                    return;
                }
            }
            A0G.A08.A8V();
        }
    }

    private void A0C() throws IOException {
        this.A0K.A0N(this.A03);
        if (this.A0K.A0R()) {
            AL A0J = this.A0K.A0J(this.A03, this.A05);
            if (A0J == null) {
                this.A07.A8W();
                return;
            }
            this.A0K.A0L(this.A0U, this.A0N, this.A0J.A5M(), this.A07, this.A05.A03.A0B(A0J.A04.A02, this.A0L, true).A03, A0J).ABi(this, A0J.A03);
            A0l(true);
        }
    }

    private void A0D() {
        A0p(true, true, true);
        this.A0J.AAj();
        A0O(1);
        this.A0F.quit();
        synchronized (this) {
            this.A0A = true;
            notifyAll();
        }
    }

    private void A0E() throws A4 {
        if (!this.A0K.A0Q()) {
            return;
        }
        float f = this.A0G.A6l().A01;
        AK A0I = this.A0K.A0I();
        boolean z = true;
        for (AK A0H = this.A0K.A0H(); A0H != null; A0H = A0H.A01) {
            boolean selectionsChangedForReadPeriod = A0H.A06;
            if (!selectionsChangedForReadPeriod) {
                return;
            }
            if (!A0H.A0J(f)) {
                if (A0H == A0I) {
                    z = false;
                }
            } else {
                if (z) {
                    AK A0H2 = this.A0K.A0H();
                    boolean A0T = this.A0K.A0T(A0H2);
                    boolean[] zArr = new boolean[this.A0T.length];
                    long A0C = A0H2.A0C(this.A05.A0A, A0T, zArr);
                    A0j(A0H2.A03, A0H2.A04);
                    if (this.A05.A00 != 4 && A0C != this.A05.A0A) {
                        AO ao = this.A05;
                        this.A05 = ao.A04(ao.A04, A0C, this.A05.A01);
                        this.A0I.A04(4);
                        A0Q(A0C);
                    }
                    int i = 0;
                    int enabledRendererCount = this.A0T.length;
                    boolean[] zArr2 = new boolean[enabledRendererCount];
                    int i2 = 0;
                    while (true) {
                        InterfaceC1104Xf[] interfaceC1104XfArr = this.A0T;
                        if (i2 >= interfaceC1104XfArr.length) {
                            this.A05 = this.A05.A05(A0H2.A03, A0H2.A04);
                            A0q(zArr2, i);
                            break;
                        }
                        InterfaceC1104Xf interfaceC1104Xf = interfaceC1104XfArr[i2];
                        zArr2[i2] = interfaceC1104Xf.A70() != 0;
                        InterfaceC0647Fd interfaceC0647Fd = A0H2.A0A[i2];
                        if (interfaceC0647Fd != null) {
                            i++;
                        }
                        if (zArr2[i2]) {
                            InterfaceC0647Fd A75 = interfaceC1104Xf.A75();
                            int i3 = A0W[4].length();
                            if (i3 == 29) {
                                throw new RuntimeException();
                            }
                            String[] strArr = A0W;
                            strArr[4] = "CIOLNyaJNw";
                            strArr[4] = "CIOLNyaJNw";
                            if (interfaceC0647Fd != A75) {
                                A0c(interfaceC1104Xf);
                            } else if (zArr[i2]) {
                                interfaceC1104Xf.ACb(this.A03);
                            }
                        }
                        i2++;
                    }
                } else {
                    this.A0K.A0T(A0H);
                    if (A0H.A06) {
                        A0H.A0B(Math.max(A0H.A02.A03, A0H.A09(this.A03)), false);
                        A0j(A0H.A03, A0H.A04);
                    }
                }
                if (this.A05.A00 != 4) {
                    A09();
                    A0J();
                    this.A0Q.ACp(2);
                    return;
                }
                return;
            }
        }
    }

    private void A0F() {
        for (int size = this.A0R.size() - 1; size >= 0; size--) {
            if (!A0s(this.A0R.get(size))) {
                this.A0R.get(size).A03.A0A(false);
                this.A0R.remove(size);
            }
        }
        Collections.sort(this.A0R);
    }

    private void A0G() throws A4 {
        this.A09 = false;
        this.A0G.A05();
        for (InterfaceC1104Xf interfaceC1104Xf : this.A0C) {
            interfaceC1104Xf.start();
        }
    }

    private void A0H() throws A4 {
        this.A0G.A06();
        for (InterfaceC1104Xf interfaceC1104Xf : this.A0C) {
            A0d(interfaceC1104Xf);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01f1, code lost:
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01f9, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01ff, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0200, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ad, code lost:
        if (r4.A02.A05 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00af, code lost:
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b0, code lost:
        r2 = r1.A0T;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b3, code lost:
        if (r5 >= r2.length) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b5, code lost:
        r3 = r2[r5];
        r2 = r4.A0A[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bb, code lost:
        if (r2 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bd, code lost:
        r0 = r3.A75();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c1, code lost:
        if (r0 != r2) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c7, code lost:
        if (r3.A7K() == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c9, code lost:
        r3.ACv();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cc, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cf, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d2, code lost:
        if (r4.A01 == null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d8, code lost:
        if (r4.A01.A06 != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00da, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00db, code lost:
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00dc, code lost:
        r7 = r1.A0T;
        r6 = r7.length;
        r2 = com.facebook.ads.redexgen.X.CX.A0W[3].charAt(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00eb, code lost:
        if (r2 == 99) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ed, code lost:
        r3 = com.facebook.ads.redexgen.X.CX.A0W;
        r3[4] = "ghsgso7PHHKUfGJDBRDWa58h1rLx";
        r3[4] = "ghsgso7PHHKUfGJDBRDWa58h1rLx";
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f9, code lost:
        if (r5 >= r6) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00fb, code lost:
        r3 = r7[r5];
        r2 = r4.A0A[r5];
        r0 = r3.A75();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0105, code lost:
        if (r0 != r2) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0107, code lost:
        if (r2 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x010d, code lost:
        if (r3.A7K() != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x010f, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0110, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0113, code lost:
        r3 = com.facebook.ads.redexgen.X.CX.A0W;
        r3[1] = "W3Zxvi1uQeiwcOM1a3uIixoX4KFWrQEX";
        r3[2] = "hMjrL9hJ9zdobOz7Vqnbeo3Jken9e002";
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x011f, code lost:
        if (r5 >= r6) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0122, code lost:
        r8 = r4.A04;
        r7 = r1.A0K.A0E();
        r6 = r7.A04;
        r4 = (r7.A08.AC1() > (-9223372036854775807L) ? 1 : (r7.A08.AC1() == (-9223372036854775807L) ? 0 : -1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0144, code lost:
        if (com.facebook.ads.redexgen.X.CX.A0W[4].length() == 29) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0146, code lost:
        r3 = com.facebook.ads.redexgen.X.CX.A0W;
        r3[6] = "vjt4oSs9hMr9NwWN4mwojUjVUYrN8cQ6";
        r3[6] = "vjt4oSs9hMr9NwWN4mwojUjVUYrN8cQ6";
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0152, code lost:
        if (r4 == 0) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0154, code lost:
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0155, code lost:
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0156, code lost:
        r2 = r1.A0T;
        r0 = r2.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0159, code lost:
        if (r5 >= r0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x015b, code lost:
        r4 = r2[r5];
        r0 = r8.A00(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0161, code lost:
        if (r0 != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0163, code lost:
        r5 = r5 + 1;
        r1 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0167, code lost:
        if (r13 == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0169, code lost:
        r4.ACv();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0171, code lost:
        if (r4.A7W() != false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0173, code lost:
        r12 = r6.A01.A01(r5);
        r11 = r6.A00(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0186, code lost:
        if (r1.A0U[r5].A7A() != 5) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0188, code lost:
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0189, code lost:
        r3 = r8.A03[r5];
        r9 = r6.A03;
        r2 = com.facebook.ads.redexgen.X.CX.A0W;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a1, code lost:
        if (r2[1].charAt(27) == r2[2].charAt(27)) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01a3, code lost:
        r2 = com.facebook.ads.redexgen.X.CX.A0W;
        r2[5] = "Ap10Ra2l8gLZ0YRne2";
        r2[5] = "Ap10Ra2l8gLZ0YRne2";
        r0 = r9[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01b1, code lost:
        if (r11 == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01b7, code lost:
        if (r0.equals(r3) == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01b9, code lost:
        if (r10 != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01bb, code lost:
        r3 = A0w(r12);
        r9 = r7.A0A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01cd, code lost:
        if (com.facebook.ads.redexgen.X.CX.A0W[3].charAt(0) == 'c') goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01cf, code lost:
        r2 = com.facebook.ads.redexgen.X.CX.A0W;
        r2[5] = "P6QWonkpaKbLAx4pgk";
        r2[5] = "P6QWonkpaKbLAx4pgk";
        r4.ACS(r3, r9[r5], r7.A08());
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e6, code lost:
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e8, code lost:
        r4.ACv();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ed, code lost:
        if (r4 == 0) goto L120;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0I() throws A4, IOException {
        CX cx = this;
        FI fi = cx.A07;
        if (fi == null) {
            return;
        }
        if (cx.A01 > 0) {
            fi.A8W();
            return;
        }
        A0C();
        AK A0G = cx.A0K.A0G();
        if (A0G == null || A0G.A0I()) {
            cx.A0l(false);
        } else if (!cx.A05.A08) {
            A09();
        }
        if (!cx.A0K.A0Q()) {
            return;
        }
        AK A0H = cx.A0K.A0H();
        AK A0I = cx.A0K.A0I();
        boolean z = false;
        while (true) {
            boolean z2 = cx.A08;
            String[] strArr = A0W;
            if (strArr[1].charAt(27) == strArr[2].charAt(27)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0W;
            strArr2[6] = "0oLwhKi5Kra6RCRQth8cI0tAgv4BlfMk";
            strArr2[6] = "0oLwhKi5Kra6RCRQth8cI0tAgv4BlfMk";
            if (!z2 || A0H == A0I || cx.A03 < A0H.A01.A00) {
                break;
            }
            if (z) {
                A0A();
            }
            boolean advancedPlayingPeriod = A0H.A02.A06;
            int i = advancedPlayingPeriod ? 0 : 3;
            AK ak = A0H;
            A0H = cx.A0K.A0D();
            cx.A0W(ak);
            cx.A05 = cx.A05.A04(A0H.A02.A04, A0H.A02.A03, A0H.A02.A00);
            cx.A0I.A04(i);
            A0J();
            z = true;
        }
    }

    private void A0J() throws A4 {
        if (!this.A0K.A0Q()) {
            return;
        }
        AK A0H = this.A0K.A0H();
        long AC1 = A0H.A08.AC1();
        if (AC1 != -9223372036854775807L) {
            A0Q(AC1);
            long periodPositionUs = this.A05.A0A;
            if (AC1 != periodPositionUs) {
                AO ao = this.A05;
                this.A05 = ao.A04(ao.A04, AC1, this.A05.A01);
                this.A0I.A04(4);
            }
        } else {
            this.A03 = this.A0G.A04();
            long A09 = A0H.A09(this.A03);
            A0R(this.A05.A0A, A09);
            this.A05.A0A = A09;
        }
        this.A05.A09 = this.A0C.length == 0 ? A0H.A02.A01 : A0H.A0D(true);
    }

    private void A0M(float f) {
        H8[] A02;
        for (AK A0F = this.A0K.A0F(); A0F != null; A0F = A0F.A01) {
            if (A0F.A04 != null) {
                for (H8 trackSelection : A0F.A04.A01.A02()) {
                    if (trackSelection != null) {
                        trackSelection.AAU(f);
                    }
                }
            }
        }
    }

    private void A0N(int i) throws A4 {
        this.A02 = i;
        if (!this.A0K.A0S(i)) {
            A0k(true);
        }
    }

    private void A0O(int i) {
        if (this.A05.A00 != i) {
            this.A05 = this.A05.A02(i);
        }
    }

    private void A0P(int i, boolean z, int i2) throws A4 {
        AK A0H = this.A0K.A0H();
        InterfaceC1104Xf interfaceC1104Xf = this.A0T[i];
        this.A0C[i2] = interfaceC1104Xf;
        if (interfaceC1104Xf.A70() == 0) {
            C0531Ad c0531Ad = A0H.A04.A03[i];
            Format[] A0w = A0w(A0H.A04.A01.A01(i));
            boolean z2 = this.A08 && this.A05.A00 == 3;
            interfaceC1104Xf.A4t(c0531Ad, A0w, A0H.A0A[i], this.A03, !z && z2, A0H.A08());
            this.A0G.A09(interfaceC1104Xf);
            if (z2) {
                interfaceC1104Xf.start();
            }
        }
    }

    private void A0Q(long j) throws A4 {
        if (this.A0K.A0Q()) {
            AK A0H = this.A0K.A0H();
            if (A0W[4].length() == 29) {
                throw new RuntimeException();
            }
            String[] strArr = A0W;
            strArr[0] = "3Dp2X759xi1gKy2gc8ykMJ";
            strArr[7] = "GcHSrS1OF4oxjH6XmPjhKR";
            j = A0H.A0A(j);
        }
        this.A03 = j;
        this.A0G.A07(this.A03);
        for (InterfaceC1104Xf interfaceC1104Xf : this.A0C) {
            interfaceC1104Xf.ACb(this.A03);
        }
    }

    private void A0R(long j, long j2) throws A4 {
        AB ab;
        AB ab2;
        if (this.A0R.isEmpty() || this.A05.A04.A02()) {
            return;
        }
        if (this.A05.A02 == j) {
            j--;
        }
        int i = this.A05.A04.A02;
        int i2 = this.A00;
        if (i2 > 0) {
            ab = this.A0R.get(i2 - 1);
        } else {
            ab = null;
        }
        while (ab != null) {
            if (ab.A00 <= i) {
                int i3 = ab.A00;
                if (A0W[3].charAt(0) == 'c') {
                    throw new RuntimeException();
                }
                String[] strArr = A0W;
                strArr[0] = "ZbbXGQ7fBHqOH9bFx5EieA";
                strArr[7] = "wqQaVgv9yDX8FIaCovLxd4";
                if (i3 == i) {
                    if (ab.A01 <= j) {
                        break;
                    }
                } else {
                    break;
                }
            }
            this.A00--;
            int i4 = this.A00;
            ab = i4 > 0 ? this.A0R.get(i4 - 1) : null;
        }
        if (this.A00 < this.A0R.size()) {
            ab2 = this.A0R.get(this.A00);
        } else {
            ab2 = null;
        }
        while (ab2 != null && ab2.A02 != null && (ab2.A00 < i || (ab2.A00 == i && ab2.A01 <= j))) {
            this.A00++;
            ab2 = this.A00 < this.A0R.size() ? this.A0R.get(this.A00) : null;
        }
        while (ab2 != null && ab2.A02 != null && ab2.A00 == i && ab2.A01 > j && ab2.A01 <= j2) {
            A0a(ab2.A03);
            if (ab2.A03.A0B() || ab2.A03.A0D()) {
                this.A0R.remove(this.A00);
            } else {
                this.A00++;
            }
            ab2 = this.A00 < this.A0R.size() ? this.A0R.get(this.A00) : null;
        }
    }

    private void A0S(long j, long j2) {
        this.A0Q.ACN(2);
        this.A0Q.ACq(2, j + j2);
    }

    private void A0T(AA aa) throws A4 {
        Object playingPeriodUid;
        if (aa.A01 != this.A07) {
            return;
        }
        AbstractC0536Aj abstractC0536Aj = this.A05.A03;
        AbstractC0536Aj abstractC0536Aj2 = aa.A00;
        Object manifest = aa.A02;
        this.A0K.A0O(abstractC0536Aj2);
        this.A05 = this.A05.A03(abstractC0536Aj2, manifest);
        A0F();
        int i = this.A01;
        if (i > 0) {
            this.A0I.A03(i);
            this.A01 = 0;
            AD ad = this.A04;
            if (ad != null) {
                Pair<Integer, Long> A04 = A04(ad, true);
                this.A04 = null;
                if (A04 == null) {
                    A08();
                    return;
                }
                int intValue = ((Integer) A04.first).intValue();
                long longValue = ((Long) A04.second).longValue();
                FG A0M = this.A0K.A0M(intValue, longValue);
                this.A05 = this.A05.A04(A0M, A0M.A02() ? 0L : longValue, longValue);
                return;
            } else if (this.A05.A02 != -9223372036854775807L) {
                return;
            } else {
                boolean A0F = abstractC0536Aj2.A0F();
                String[] strArr = A0W;
                if (strArr[1].charAt(27) == strArr[2].charAt(27)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0W;
                strArr2[4] = "lH2oXw2RUPBHBuRA0";
                strArr2[4] = "lH2oXw2RUPBHBuRA0";
                if (A0F) {
                    A08();
                    return;
                }
                Pair<Integer, Long> A05 = A05(abstractC0536Aj2, abstractC0536Aj2.A06(this.A0B), -9223372036854775807L);
                int intValue2 = ((Integer) A05.first).intValue();
                long longValue2 = ((Long) A05.second).longValue();
                FG A0M2 = this.A0K.A0M(intValue2, longValue2);
                this.A05 = this.A05.A04(A0M2, A0M2.A02() ? 0L : longValue2, longValue2);
                return;
            }
        }
        int i2 = this.A05.A04.A02;
        long j = this.A05.A01;
        if (abstractC0536Aj.A0F()) {
            if (!abstractC0536Aj2.A0F()) {
                FG A0M3 = this.A0K.A0M(i2, j);
                this.A05 = this.A05.A04(A0M3, A0M3.A02() ? 0L : j, j);
                return;
            }
            return;
        }
        AK A0F2 = this.A0K.A0F();
        if (A0F2 == null) {
            C0534Ah c0534Ah = this.A0L;
            if (A0W[3].charAt(0) != 'c') {
                String[] strArr3 = A0W;
                strArr3[0] = "AIgzGczszMkheYOO0l2WDA";
                strArr3[7] = "AQm6fITMTu1q9a2hy8bL0W";
                playingPeriodUid = abstractC0536Aj.A0B(i2, c0534Ah, true).A03;
            } else {
                String[] strArr4 = A0W;
                strArr4[6] = "kxPd1uECtZJZCmNWUxsBgkB7loYAAl3C";
                strArr4[6] = "kxPd1uECtZJZCmNWUxsBgkB7loYAAl3C";
                playingPeriodUid = abstractC0536Aj.A0B(i2, c0534Ah, true).A03;
            }
        } else {
            playingPeriodUid = A0F2.A09;
        }
        int A052 = abstractC0536Aj2.A05(playingPeriodUid);
        if (A052 == -1) {
            int A01 = A01(i2, abstractC0536Aj, abstractC0536Aj2);
            if (A01 == -1) {
                A08();
                return;
            }
            Pair<Integer, Long> A053 = A05(abstractC0536Aj2, abstractC0536Aj2.A0A(A01, this.A0L).A00, -9223372036854775807L);
            int intValue3 = ((Integer) A053.first).intValue();
            long longValue3 = ((Long) A053.second).longValue();
            FG A0M4 = this.A0K.A0M(intValue3, longValue3);
            abstractC0536Aj2.A0B(intValue3, this.A0L, true);
            if (A0F2 != null) {
                Object obj = this.A0L.A03;
                A0F2.A02 = A0F2.A02.A00(-1);
                while (A0F2.A01 != null) {
                    A0F2 = A0F2.A01;
                    if (A0F2.A09.equals(obj)) {
                        A0F2.A02 = this.A0K.A0K(A0F2.A02, intValue3);
                    } else {
                        A0F2.A02 = A0F2.A02.A00(-1);
                    }
                }
            }
            this.A05 = this.A05.A04(A0M4, A02(A0M4, A0M4.A02() ? 0L : longValue3), longValue3);
            return;
        }
        if (A052 != i2) {
            AO A012 = this.A05.A01(A052);
            if (A0W[4].length() == 29) {
                throw new RuntimeException();
            }
            String[] strArr5 = A0W;
            strArr5[4] = "bxSLNYRWzgoGTszax8Z4I";
            strArr5[4] = "bxSLNYRWzgoGTszax8Z4I";
            this.A05 = A012;
        }
        FG fg = this.A05.A04;
        if (fg.A02()) {
            FG A0M5 = this.A0K.A0M(A052, j);
            if (!A0M5.equals(fg)) {
                this.A05 = this.A05.A04(A0M5, A02(A0M5, A0M5.A02() ? 0L : j), j);
                return;
            }
        }
        if (!this.A0K.A0V(fg, this.A03)) {
            A0k(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0U(AD ad) throws A4 {
        long longValue;
        FG A0M;
        long longValue2;
        boolean z;
        this.A0I.A03(1);
        Pair<Integer, Long> A04 = A04(ad, true);
        try {
            try {
                if (A04 == null) {
                    A0M = new FG(A00());
                    longValue2 = -9223372036854775807L;
                    longValue = -9223372036854775807L;
                    z = true;
                } else {
                    int intValue = ((Integer) A04.first).intValue();
                    longValue = ((Long) A04.second).longValue();
                    A0M = this.A0K.A0M(intValue, longValue);
                    if (A0M.A02()) {
                        longValue2 = 0;
                        String[] strArr = A0W;
                        if (strArr[0].length() == strArr[7].length()) {
                            String[] strArr2 = A0W;
                            strArr2[3] = "i2wx9svvSsraq7xK4Hb6P8jzWPWvECua";
                            strArr2[3] = "i2wx9svvSsraq7xK4Hb6P8jzWPWvECua";
                            z = true;
                        }
                        throw new RuntimeException();
                    }
                    longValue2 = ((Long) A04.second).longValue();
                    z = ad.A01 == -9223372036854775807L;
                }
                if (this.A07 != null && this.A01 <= 0) {
                    try {
                        if (longValue2 != -9223372036854775807L) {
                            long j = longValue2;
                            if (A0M.equals(this.A05.A04)) {
                                AK A0H = this.A0K.A0H();
                                String[] strArr3 = A0W;
                                if (strArr3[0].length() == strArr3[7].length()) {
                                    String[] strArr4 = A0W;
                                    strArr4[3] = "hQgZLd0P1yiuMRtM5yatEhywmfTa4Rur";
                                    strArr4[3] = "hQgZLd0P1yiuMRtM5yatEhywmfTa4Rur";
                                    if (A0H != null && j != 0) {
                                        j = A0H.A08.A5J(j, this.A06);
                                    }
                                    if (C05269y.A01(j) == C05269y.A01(this.A05.A0A)) {
                                        this.A05 = this.A05.A04(A0M, this.A05.A0A, longValue);
                                        if (z) {
                                            this.A0I.A04(2);
                                            return;
                                        }
                                        return;
                                    }
                                }
                                throw new RuntimeException();
                            }
                            long A02 = A02(A0M, j);
                            z |= longValue2 != A02;
                            longValue2 = A02;
                        } else {
                            A0O(4);
                            A0p(false, true, false);
                        }
                        this.A05 = this.A05.A04(A0M, longValue2, longValue);
                        if (!z) {
                            this.A0I.A04(2);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        this.A05 = this.A05.A04(A0M, longValue2, longValue);
                        if (z) {
                            this.A0I.A04(2);
                        }
                        throw th;
                    }
                }
                this.A04 = ad;
                this.A05 = this.A05.A04(A0M, longValue2, longValue);
                if (!z) {
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private void A0W(@Nullable AK ak) throws A4 {
        AK A0H = this.A0K.A0H();
        if (A0H == null || ak == A0H) {
            return;
        }
        int i = 0;
        boolean[] zArr = new boolean[this.A0T.length];
        int i2 = 0;
        while (true) {
            InterfaceC1104Xf[] interfaceC1104XfArr = this.A0T;
            if (i2 >= interfaceC1104XfArr.length) {
                break;
            }
            InterfaceC1104Xf interfaceC1104Xf = interfaceC1104XfArr[i2];
            zArr[i2] = interfaceC1104Xf.A70() != 0;
            if (A0H.A04.A00(i2)) {
                i++;
            }
            if (zArr[i2] && (!A0H.A04.A00(i2) || (interfaceC1104Xf.A7W() && interfaceC1104Xf.A75() == ak.A0A[i2]))) {
                A0c(interfaceC1104Xf);
            }
            i2++;
        }
        AO ao = this.A05;
        if (A0W[6].charAt(23) == 'j') {
            throw new RuntimeException();
        }
        String[] strArr = A0W;
        strArr[0] = "YeyTuc4hJN2cviDoFTSuVw";
        strArr[7] = "y3cCzPpceybwtUTWhAu8hu";
        this.A05 = ao.A05(A0H.A03, A0H.A04);
        A0q(zArr, i);
    }

    private void A0X(AP ap) {
        this.A0G.AD3(ap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0Y(C0528Aa c0528Aa) throws A4 {
        if (c0528Aa.A0D()) {
            return;
        }
        try {
            c0528Aa.A04().A7H(c0528Aa.A00(), c0528Aa.A09());
        } finally {
            c0528Aa.A0A(true);
        }
    }

    private void A0Z(C0528Aa c0528Aa) throws A4 {
        if (c0528Aa.A02() == -9223372036854775807L) {
            A0a(c0528Aa);
        } else if (this.A07 == null || this.A01 > 0) {
            this.A0R.add(new AB(c0528Aa));
        } else {
            AB ab = new AB(c0528Aa);
            if (A0s(ab)) {
                ArrayList<AB> arrayList = this.A0R;
                String[] strArr = A0W;
                if (strArr[0].length() != strArr[7].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0W;
                strArr2[6] = "bdowkwDe22b4JBVUMCxt2Emm6YTTpUJh";
                strArr2[6] = "bdowkwDe22b4JBVUMCxt2Emm6YTTpUJh";
                arrayList.add(ab);
                Collections.sort(this.A0R);
                return;
            }
            c0528Aa.A0A(false);
        }
    }

    private void A0a(C0528Aa c0528Aa) throws A4 {
        if (c0528Aa.A03().getLooper() == this.A0Q.A6U()) {
            A0Y(c0528Aa);
            if (this.A05.A00 == 3 || this.A05.A00 == 2) {
                this.A0Q.ACp(2);
                return;
            }
            return;
        }
        this.A0Q.A8e(15, c0528Aa).sendToTarget();
    }

    private void A0b(C0528Aa c0528Aa) {
        c0528Aa.A03().post(new A9(this, c0528Aa));
    }

    private void A0c(InterfaceC1104Xf interfaceC1104Xf) throws A4 {
        this.A0G.A08(interfaceC1104Xf);
        A0d(interfaceC1104Xf);
        interfaceC1104Xf.A4k();
    }

    private void A0d(InterfaceC1104Xf interfaceC1104Xf) throws A4 {
        if (interfaceC1104Xf.A70() == 2) {
            interfaceC1104Xf.stop();
        }
    }

    private void A0e(C0533Af c0533Af) {
        this.A06 = c0533Af;
    }

    private void A0f(InterfaceC1167Zu interfaceC1167Zu) {
        if (!this.A0K.A0U(interfaceC1167Zu)) {
            return;
        }
        this.A0K.A0N(this.A03);
        A09();
    }

    private void A0g(InterfaceC1167Zu interfaceC1167Zu) throws A4 {
        if (!this.A0K.A0U(interfaceC1167Zu)) {
            return;
        }
        AK A0G = this.A0K.A0G();
        A0G.A0F(this.A0G.A6l().A01);
        A0j(A0G.A03, A0G.A04);
        if (!this.A0K.A0Q()) {
            A0Q(this.A0K.A0D().A02.A03);
            A0W(null);
        }
        A09();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0648Fe
    /* renamed from: A0h */
    public final void A9F(InterfaceC1167Zu interfaceC1167Zu) {
        this.A0Q.A8e(10, interfaceC1167Zu).sendToTarget();
    }

    private void A0i(FI fi, boolean z, boolean z2) {
        this.A01++;
        A0p(true, z, z2);
        this.A0J.onPrepared();
        this.A07 = fi;
        A0O(2);
        fi.ABl(this.A0H, true, this);
        this.A0Q.ACp(2);
    }

    private void A0j(TrackGroupArray trackGroupArray, HC hc) {
        this.A0J.AB8(this.A0T, trackGroupArray, hc.A01);
    }

    private void A0k(boolean z) throws A4 {
        FG fg = this.A0K.A0H().A02.A04;
        long A03 = A03(fg, this.A05.A0A, true);
        long newPositionUs = this.A05.A0A;
        if (A03 != newPositionUs) {
            AO ao = this.A05;
            this.A05 = ao.A04(fg, A03, ao.A01);
            if (z) {
                this.A0I.A04(4);
            }
        }
    }

    private void A0l(boolean z) {
        if (this.A05.A08 != z) {
            this.A05 = this.A05.A06(z);
        }
    }

    private void A0m(boolean z) throws A4 {
        this.A09 = false;
        this.A08 = z;
        if (!z) {
            A0H();
            A0J();
        } else if (this.A05.A00 == 3) {
            A0G();
            if (A0W[4].length() == 29) {
                throw new RuntimeException();
            }
            String[] strArr = A0W;
            strArr[6] = "X2QfJ1e23pCpGilE5nvaFXYxLnWx3Vax";
            strArr[6] = "X2QfJ1e23pCpGilE5nvaFXYxLnWx3Vax";
            this.A0Q.ACp(2);
        } else if (this.A05.A00 != 2) {
        } else {
            this.A0Q.ACp(2);
        }
    }

    private void A0n(boolean z) throws A4 {
        this.A0B = z;
        if (!this.A0K.A0W(z)) {
            A0k(true);
        }
    }

    private void A0o(boolean z, boolean z2) {
        A0p(true, z, z);
        this.A0I.A03(this.A01 + (z2 ? 1 : 0));
        this.A01 = 0;
        this.A0J.AB2();
        A0O(1);
    }

    private void A0p(boolean z, boolean z2, boolean z3) {
        InterfaceC1104Xf[] interfaceC1104XfArr;
        Object obj;
        FG fg;
        TrackGroupArray trackGroupArray;
        HC hc;
        FI fi;
        this.A0Q.ACN(2);
        this.A09 = false;
        this.A0G.A06();
        this.A03 = 0L;
        for (InterfaceC1104Xf renderer : this.A0C) {
            try {
                A0c(renderer);
            } catch (A4 | RuntimeException e) {
                Log.e(A06(0, 21, 15), A06(WKSRecord.Service.NETBIOS_DGM, 12, 123), e);
            }
        }
        this.A0C = new InterfaceC1104Xf[0];
        AM am = this.A0K;
        String[] strArr = A0W;
        if (strArr[1].charAt(27) == strArr[2].charAt(27)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0W;
        strArr2[0] = "2WNzaDjkqcOaPFAy0QOPwI";
        strArr2[7] = "unAKX8spYNQMyMddShLfR5";
        am.A0P(!z2);
        A0l(false);
        if (z2) {
            this.A04 = null;
        }
        if (z3) {
            this.A0K.A0O(AbstractC0536Aj.A01);
            Iterator<AB> it = this.A0R.iterator();
            while (it.hasNext()) {
                AB next = it.next();
                if (A0W[5].length() != 18) {
                    throw new RuntimeException();
                }
                String[] strArr3 = A0W;
                strArr3[6] = "oYGfQB8mGDj6jmVX6XAe4nZE0DoRm7Og";
                strArr3[6] = "oYGfQB8mGDj6jmVX6XAe4nZE0DoRm7Og";
                next.A03.A0A(false);
            }
            this.A0R.clear();
            this.A00 = 0;
        }
        AbstractC0536Aj abstractC0536Aj = z3 ? AbstractC0536Aj.A01 : this.A05.A03;
        if (z3) {
            obj = null;
        } else {
            obj = this.A05.A07;
        }
        if (!z2) {
            fg = this.A05.A04;
        } else {
            fg = new FG(A00());
        }
        long j = z2 ? -9223372036854775807L : this.A05.A0A;
        long j2 = z2 ? -9223372036854775807L : this.A05.A01;
        int i = this.A05.A00;
        if (z3) {
            trackGroupArray = TrackGroupArray.A04;
        } else {
            AO ao = this.A05;
            if (A0W[5].length() != 18) {
                trackGroupArray = ao.A05;
            } else {
                String[] strArr4 = A0W;
                strArr4[1] = "udHBd6VluCWpjwypGpbQkm44C5lEXr7W";
                strArr4[2] = "ikIjUWR3chEMULYYaopllYxVSgtPleKx";
                trackGroupArray = ao.A05;
            }
        }
        if (z3) {
            hc = this.A0O;
        } else {
            hc = this.A05.A06;
        }
        this.A05 = new AO(abstractC0536Aj, obj, fg, j, j2, i, false, trackGroupArray, hc);
        if (z && (fi = this.A07) != null) {
            fi.ACK(this);
            this.A07 = null;
        }
    }

    private void A0q(boolean[] zArr, int i) throws A4 {
        this.A0C = new InterfaceC1104Xf[i];
        int enabledRendererCount = 0;
        AK A0H = this.A0K.A0H();
        for (int i2 = 0; i2 < this.A0T.length; i2++) {
            if (A0H.A04.A00(i2)) {
                A0P(i2, zArr[i2], enabledRendererCount);
                enabledRendererCount++;
            }
        }
    }

    private boolean A0r() {
        AK A0H = this.A0K.A0H();
        long j = A0H.A02.A01;
        return j == -9223372036854775807L || this.A05.A0A < j || (A0H.A01 != null && (A0H.A01.A06 || A0H.A01.A02.A04.A02()));
    }

    private boolean A0s(AB ab) {
        if (ab.A02 == null) {
            Pair<Integer, Long> A04 = A04(new AD(ab.A03.A08(), ab.A03.A01(), C05269y.A00(ab.A03.A02())), false);
            if (A04 == null) {
                return false;
            }
            ab.A01(((Integer) A04.first).intValue(), ((Long) A04.second).longValue(), this.A05.A03.A0B(((Integer) A04.first).intValue(), this.A0L, true).A03);
        } else {
            int A05 = this.A05.A03.A05(ab.A02);
            if (A05 == -1) {
                return false;
            }
            ab.A00 = A05;
        }
        return true;
    }

    private boolean A0t(InterfaceC1104Xf interfaceC1104Xf) {
        AK A0I = this.A0K.A0I();
        return A0I.A01 != null && A0I.A01.A06 && interfaceC1104Xf.A7K();
    }

    private boolean A0u(FG fg, long j, AK ak) {
        if (fg.equals(ak.A02.A04) && ak.A06) {
            this.A05.A03.A0A(ak.A02.A04.A02, this.A0L);
            int A04 = this.A0L.A04(j);
            if (A04 == -1 || this.A0L.A09(A04) == ak.A02.A02) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
        if (r3 != Long.MIN_VALUE) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
        r2 = r7.A0J;
        r0 = r7.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0086, code lost:
        if (r2.ADB(r3 - r5.A09(r0), r7.A0G.A6l().A01, r7.A09) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0088, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a3, code lost:
        if (r3 != Long.MIN_VALUE) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean A0v(boolean z) {
        long A0D;
        if (this.A0C.length == 0) {
            return A0r();
        }
        String[] strArr = A0W;
        if (strArr[0].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0W;
        strArr2[0] = "XitCw2lYTMNoWfZ3MNfhmS";
        strArr2[7] = "pjSmPGutCkFid20LDJR8Tk";
        if (!z) {
            return false;
        }
        if (!this.A05.A08) {
            return true;
        }
        AK A0G = this.A0K.A0G();
        String[] strArr3 = A0W;
        if (strArr3[1].charAt(27) != strArr3[2].charAt(27)) {
            String[] strArr4 = A0W;
            strArr4[5] = "c9QtbAseiMx42ehTAZ";
            strArr4[5] = "c9QtbAseiMx42ehTAZ";
            A0D = A0G.A0D(!A0G.A02.A05);
        } else {
            String[] strArr5 = A0W;
            strArr5[1] = "5BPuibQqZ5NKjWZyuTION1z1lHkA3o6b";
            strArr5[2] = "lue4BzZmQF8ChJf2GK4Pk4NwU097v1o6";
            A0D = A0G.A0D(!A0G.A02.A05);
        }
    }

    @NonNull
    public static Format[] A0w(H8 h8) {
        int length = h8 != null ? h8.length() : 0;
        Format[] formatArr = new Format[length];
        for (int i = 0; i < length; i++) {
            formatArr[i] = h8.A6J(i);
            if (A0W[3].charAt(0) == 'c') {
                throw new RuntimeException();
            }
            String[] strArr = A0W;
            strArr[1] = "cHoAaTwhCyKnC5gIlgOheFkD17ImOLE4";
            strArr[2] = "NdVO49IoL7wvUQC4on3mokgCd3AJvc50";
        }
        return formatArr;
    }

    public final Looper A0x() {
        return this.A0F.getLooper();
    }

    public final synchronized void A0y() {
        if (this.A0A) {
            return;
        }
        this.A0Q.ACp(7);
        boolean z = false;
        while (!this.A0A) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        if (A0W[3].charAt(0) == 'c') {
            throw new RuntimeException();
        }
        String[] strArr = A0W;
        strArr[5] = "ci8xVCbgf6WZorAiSg";
        strArr[5] = "ci8xVCbgf6WZorAiSg";
    }

    public final void A0z(AbstractC0536Aj abstractC0536Aj, int i, long j) {
        this.A0Q.A8e(3, new AD(abstractC0536Aj, i, j)).sendToTarget();
    }

    public final void A10(FI fi, boolean z, boolean z2) {
        this.A0Q.A8d(0, z ? 1 : 0, z2 ? 1 : 0, fi).sendToTarget();
    }

    public final void A11(boolean z) {
        this.A0Q.A8c(1, z ? 1 : 0, 0).sendToTarget();
    }

    public final void A12(boolean z) {
        this.A0Q.A8c(6, z ? 1 : 0, 0).sendToTarget();
    }

    @Override // com.facebook.ads.redexgen.X.A1
    public final void AAT(AP ap) {
        this.A0E.obtainMessage(1, ap).sendToTarget();
        A0M(ap.A01);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1166Zt
    public final void AAb(InterfaceC1167Zu interfaceC1167Zu) {
        this.A0Q.A8e(9, interfaceC1167Zu).sendToTarget();
    }

    @Override // com.facebook.ads.redexgen.X.FH
    public final void AAx(FI fi, AbstractC0536Aj abstractC0536Aj, Object obj) {
        this.A0Q.A8e(8, new AA(fi, abstractC0536Aj, obj)).sendToTarget();
    }

    @Override // com.facebook.ads.redexgen.X.AY
    public final synchronized void ACr(C0528Aa c0528Aa) {
        if (this.A0A) {
            Log.w(A06(0, 21, 15), A06(50, 37, 50));
            c0528Aa.A0A(false);
            return;
        }
        this.A0Q.A8e(14, c0528Aa).sendToTarget();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        String A06 = A06(0, 21, 15);
        try {
            switch (message.what) {
                case 0:
                    A0i((FI) message.obj, message.arg1 != 0, message.arg2 != 0);
                    break;
                case 1:
                    A0m(message.arg1 != 0);
                    break;
                case 2:
                    A07();
                    break;
                case 3:
                    A0U((AD) message.obj);
                    break;
                case 4:
                    A0X((AP) message.obj);
                    break;
                case 5:
                    A0e((C0533Af) message.obj);
                    break;
                case 6:
                    A0o(message.arg1 != 0, true);
                    break;
                case 7:
                    A0D();
                    return true;
                case 8:
                    A0T((AA) message.obj);
                    break;
                case 9:
                    A0g((InterfaceC1167Zu) message.obj);
                    break;
                case 10:
                    A0f((InterfaceC1167Zu) message.obj);
                    break;
                case 11:
                    A0E();
                    break;
                case 12:
                    A0N(message.arg1);
                    break;
                case 13:
                    A0n(message.arg1 != 0);
                    break;
                case 14:
                    A0Z((C0528Aa) message.obj);
                    break;
                case 15:
                    A0b((C0528Aa) message.obj);
                    break;
                default:
                    return false;
            }
            A0A();
        } catch (A4 e) {
            Log.e(A06, A06(110, 15, 0), e);
            A0o(false, false);
            this.A0E.obtainMessage(2, e).sendToTarget();
            A0A();
        } catch (IOException e2) {
            Log.e(A06, A06(125, 13, 87), e2);
            A0o(false, false);
            this.A0E.obtainMessage(2, A4.A00(e2)).sendToTarget();
            A0A();
        } catch (RuntimeException e3) {
            Log.e(A06, A06(87, 23, 108), e3);
            A0o(false, false);
            this.A0E.obtainMessage(2, A4.A02(e3)).sendToTarget();
            if (A0W[6].charAt(23) == 'j') {
                throw new RuntimeException();
            }
            String[] strArr = A0W;
            strArr[5] = "BLVAUEtDSJNWXrvjpr";
            strArr[5] = "BLVAUEtDSJNWXrvjpr";
            A0A();
        }
        return true;
    }
}