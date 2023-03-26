package com.facebook.ads.redexgen.X;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import androidx.annotation.Nullable;
import com.anythink.expressad.videocommon.e.b;
import com.p7700g.p99005.bx;
import com.p7700g.p99005.g15;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.4S  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C4S {
    public static byte[] A07;
    public static String[] A08;
    public View A01;
    public C4F A02;
    public ES A03;
    public boolean A04;
    public boolean A05;
    public int A00 = -1;
    public final C4Q A06 = new C4Q(0, 0);

    static {
        A04();
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 28);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        byte[] bArr = {78, 105, 113, 102, 107, 110, 99, 39, 115, 102, 117, 96, 98, 115, 39, 119, 104, 116, 110, 115, 110, 104, 105, 22, 39, 53, 53, 35, 34, 102, 41, 48, 35, 52, 102, 50, 39, 52, 33, 35, 50, 102, 54, 41, 53, 47, 50, 47, 41, 40, 102, 49, 46, 47, bx.W5, 35, 102, 53, 43, 41, 41, 50, 46, 102, 53, 37, 52, 41, bx.W5, bx.W5, 47, 40, 33, 104, 78, 121, g15.c, 101, g15.c, 112, 121, 110, 74, 117, 121, 107};
        String[] strArr = A08;
        if (strArr[4].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[7] = "8BqCBekg5p6xdwXQXpIxknueaPhzjw";
        strArr2[7] = "8BqCBekg5p6xdwXQXpIxknueaPhzjw";
        A07 = bArr;
    }

    public static void A04() {
        A08 = new String[]{"ffTcX10Z9", "veDPHJ", "R", "iWatF5LLo", "0slLts", "p92m", b.j, "eFvKPH9TFpfstHyCObyNN72zUjBGeH"};
    }

    public abstract void A0H();

    public abstract void A0I(int i, int i2, C4U c4u, C4Q c4q);

    public abstract void A0J(View view, C4U c4u, C4Q c4q);

    private final int A00(View view) {
        return this.A03.A1D(view);
    }

    private final View A01(int i) {
        return this.A03.A06.A1r(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05(int i, int i2) {
        ES es = this.A03;
        if (!this.A05 || this.A00 == -1 || es == null) {
            A0A();
        }
        this.A04 = false;
        View view = this.A01;
        if (view != null) {
            int A00 = A00(view);
            int i3 = this.A00;
            String[] strArr = A08;
            if (strArr[4].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[3] = "1zDtC4ICw";
            strArr2[0] = "WYaFIbeKL";
            if (A00 == i3) {
                A0J(this.A01, es.A0s, this.A06);
                C4Q c4q = this.A06;
                if (A08[5].length() != 9) {
                    String[] strArr3 = A08;
                    strArr3[6] = "M";
                    strArr3[2] = "Q";
                    c4q.A06(es);
                    A0A();
                } else {
                    String[] strArr4 = A08;
                    strArr4[5] = "sldJFA0K947j";
                    strArr4[5] = "sldJFA0K947j";
                    c4q.A06(es);
                    A0A();
                }
            } else {
                Log.e(A02(74, 12, 0), A02(23, 51, 90));
                this.A01 = null;
            }
        }
        if (this.A05) {
            A0I(i, i2, es.A0s, this.A06);
            boolean A072 = this.A06.A07();
            this.A06.A06(es);
            if (A072) {
                if (this.A05) {
                    this.A04 = true;
                    es.A08.A08();
                    return;
                }
                A0A();
            }
        }
    }

    public final int A07() {
        return this.A03.A06.A0X();
    }

    public final int A08() {
        return this.A00;
    }

    @Nullable
    public final C4F A09() {
        return this.A02;
    }

    public final void A0A() {
        if (!this.A05) {
            return;
        }
        A0H();
        this.A03.A0s.A0F = -1;
        this.A01 = null;
        this.A00 = -1;
        this.A04 = false;
        this.A05 = false;
        this.A02.A0N(this);
        this.A02 = null;
        this.A03 = null;
    }

    public final void A0B(int i) {
        this.A00 = i;
    }

    public final void A0C(PointF pointF) {
        float sqrt = (float) Math.sqrt((pointF.x * pointF.x) + (pointF.y * pointF.y));
        pointF.x /= sqrt;
        pointF.y /= sqrt;
    }

    public final void A0D(View view) {
        if (A00(view) == A08()) {
            this.A01 = view;
        }
    }

    public final void A0E(ES es, C4F c4f) {
        this.A03 = es;
        this.A02 = c4f;
        if (this.A00 != -1) {
            this.A03.A0s.A0F = this.A00;
            this.A05 = true;
            this.A04 = true;
            this.A01 = A01(A08());
            this.A03.A08.A08();
            return;
        }
        throw new IllegalArgumentException(A02(0, 23, 27));
    }

    public final boolean A0F() {
        return this.A04;
    }

    public final boolean A0G() {
        return this.A05;
    }
}