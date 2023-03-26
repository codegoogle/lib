package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.internal.exoplayer2.offline.DownloadAction;
import com.p7700g.p99005.bx;
import java.io.File;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class PV {
    public static PV A09;
    public static byte[] A0A;
    public static final DownloadAction.Deserializer[] A0B;
    public C0628Ei A00;
    @Nullable
    public InterfaceC0705Hl A01;
    public File A02;
    public boolean A03;
    public final Context A04;
    public final Handler A05 = new Handler(Looper.getMainLooper());
    public final SparseArray<PT> A06 = new SparseArray<>();
    public final Runnable A08 = new PS(this);
    public final InterfaceC0621Eb A07 = new GD(this);

    public static String A07(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 103);
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A0A = new byte[]{-103, -69, -14, -19, -34, -20, -77, -103, -69, -3, 20, 15, 0, 14, -69, -24, 19, 27, 18, 16, 19, 5, 8, 9, 8, -46, -60, -9, 24, 5, 24, 9, -34, -60, 27, 72, 72, 69, 72, 4, -10, 41, 74, 55, 74, 59, 16, -10, -44, bx.j7, -13, -21, 33, 36, 46, 55, -19, 33, 35, 52, 41, 47, 46, 51, -40, -37, -27, -18, -92, -37, -26, -18, -27, -29, -26, -40, -37, -22, 33, 36, 51};
    }

    static {
        A0B();
        A0B = new DownloadAction.Deserializer[]{ZX.A03};
    }

    @VisibleForTesting
    public PV(Context context, @Nullable C0628Ei c0628Ei) {
        this.A04 = context;
        if (c0628Ei != null) {
            this.A00 = c0628Ei;
            c0628Ei.A0R(this.A07);
        }
        A01().A0Q();
    }

    private C0628Ei A01() {
        if (this.A00 == null) {
            C0633En downloaderConstructorHelper = new C0633En(A03(), A02());
            this.A00 = new C0628Ei(downloaderConstructorHelper, 10, 5, new File(A06(), A07(52, 12, 89)), A0B);
            this.A00.A0R(this.A07);
        }
        return this.A00;
    }

    private InterfaceC1216ah A02() {
        return new C2Z(A07(78, 3, 89), null);
    }

    private final synchronized InterfaceC0705Hl A03() {
        if (this.A01 == null) {
            this.A01 = new b1(new File(A06(), A07(64, 14, 16)), new A2(134217728L));
        }
        return this.A01;
    }

    public static C1232ax A04(C1210ab c1210ab, InterfaceC0705Hl interfaceC0705Hl) {
        return new C1232ax(interfaceC0705Hl, c1210ab, new C1214af(), null, 2, null);
    }

    public static PV A05(Context context) {
        if (A09 == null) {
            A09 = new PV(context.getApplicationContext(), null);
        }
        return A09;
    }

    private File A06() {
        if (this.A02 == null) {
            this.A02 = this.A04.getCacheDir();
        }
        return this.A02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08() {
        C0627Eh[] A0T;
        for (C0627Eh c0627Eh : A01().A0T()) {
            int state = c0627Eh.A02;
            PT pt = this.A06.get(state);
            if (pt != null) {
                int i = c0627Eh.A01;
                if (i == 2 || c0627Eh.A03 > pt.A00) {
                    String str = A07(15, 19, 61) + i + A07(0, 8, 18) + c0627Eh.A03;
                    pt.A01.A9N();
                    this.A06.remove(state);
                } else if (i == 4 || i == 3) {
                    String str2 = A07(34, 14, 111) + i;
                    pt.A01.A9W();
                    this.A06.remove(state);
                }
            }
            String str3 = A07(48, 4, 25) + state + A07(8, 7, 52) + c0627Eh.A03;
        }
    }

    private void A09() {
        if (!this.A03) {
            this.A03 = true;
            this.A05.post(this.A08);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A() {
        this.A05.removeCallbacks(this.A08);
        this.A03 = false;
    }

    public final HL A0E(Context context) {
        return A04(new C1210ab(context, (InterfaceC0701Hh<? super HM>) null, A02()), A03());
    }

    public final void A0F(Uri uri, PU pu, long j) {
        this.A06.put(A01().A0P(new ZX(uri, false, null, null)), new PT(pu, j, null));
        A09();
    }
}