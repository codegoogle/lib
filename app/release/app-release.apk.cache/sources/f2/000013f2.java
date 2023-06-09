package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.Nullable;
import com.p7700g.p99005.ax5;
import com.p7700g.p99005.bx;
import java.util.Arrays;
import org.xbill.DNS.Flags;

/* loaded from: assets/audience_network.dex */
public class SX extends C4S {
    public static byte[] A06;
    public static String[] A07;
    public PointF A02;
    public final float A03;
    public final LinearInterpolator A05 = new LinearInterpolator();
    public final DecelerateInterpolator A04 = new DecelerateInterpolator();
    public int A00 = 0;
    public int A01 = 0;

    static {
        A07();
        A05();
    }

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 35);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A06 = new byte[]{41, 12, Flags.CD, 0, 4, 23, 54, 8, 10, 10, 17, 13, 54, 6, 23, 10, 9, 9, 0, 23, 21, 35, 57, 108, ax5.a, 36, 35, 57, 32, 40, 108, 35, 58, 41, 62, 62, 37, 40, 41, 108, 47, 35, 33, 60, 57, 56, 41, 31, 47, 62, 35, 32, 32, 26, 41, 47, 56, 35, 62, 10, 35, 62, 28, 35, ax5.a, 37, 56, 37, 35, 34, 108, 59, 36, 41, 34, 108, 56, 36, 41, 108, 0, 45, 53, 35, 57, 56, 1, 45, 34, 45, 43, 41, 62, 108, 40, 35, 41, ax5.a, 108, 34, 35, 56, 108, 37, 33, 60, 32, 41, 33, 41, 34, 56, 108, bx.W5, 55, 56, 41, 121, 41, 43, 60, ax5.a, 60, 43, 60, 55, 58, 60, 121, bx.W5, 49, 54, 44, 53, 61, 121, 59, 60, 121, 54, 55, 60, 121, 54, ax5.a, 121, 45, 49, 60, 121, 58, 54, 55, bx.W5, 45, 56, 55, 45, bx.W5, 121, 61, 60, ax5.a, 48, 55, 60, 61, 121, 48, 55, 121, 10, 52, 54, 54, 45, 49, 10, 58, 43, 54, 53, 53, 60, 43, 117, 121, bx.W5, 45, 56, 43, 45, 48, 55, 62, 121, 46, 48, 45, 49, 121, 10, 23, 24, 9, 6};
    }

    public static void A07() {
        A07 = new String[]{"vpHxNEEeQqkPH9sKp8BAFlo", "ddQd8aXmX57TCv5syYSnMf6Vla22KopM", "0YXj", "UC9R5IJXbgu82zo5LhenPlKKwn23Fltm", "uFeOec4n0AGL9Kfrmk6ECW0KKbKvD", "RgZAHFrUyN4TqtmKiyvyL8Y", "g7LT7F9fn5p79lPzLzvRECTowfucfQY3", "UaBPk1errz52kF5dIu80Mei9ciV9Nkpb"};
    }

    public SX(Context context) {
        this.A03 = A0K(context.getResources().getDisplayMetrics());
    }

    private final int A00() {
        PointF pointF = this.A02;
        if (pointF == null || pointF.y == 0.0f) {
            return 0;
        }
        return this.A02.y > 0.0f ? 1 : -1;
    }

    private int A01(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    private final int A03(View view, int top) {
        C4F A09 = A09();
        if (A09 == null || !A09.A26()) {
            return 0;
        }
        C4G c4g = (C4G) view.getLayoutParams();
        int start = A09.A0p(view) - c4g.topMargin;
        int end = A09.A0k(view) + c4g.bottomMargin;
        return A0O(start, end, A09.A0h(), A09.A0Y() - A09.A0e(), top);
    }

    private final void A08(C4Q c4q) {
        PointF A0Q = A0Q(A08());
        if (A0Q == null || (A0Q.x == 0.0f && A0Q.y == 0.0f)) {
            c4q.A04(A08());
            A0A();
            return;
        }
        A0C(A0Q);
        this.A02 = A0Q;
        this.A00 = (int) (A0Q.x * 10000.0f);
        this.A01 = (int) (A0Q.y * 10000.0f);
        c4q.A05((int) (this.A00 * 1.2f), (int) (this.A01 * 1.2f), (int) (A0M(10000) * 1.2f), this.A05);
    }

    @Override // com.facebook.ads.redexgen.X.C4S
    public final void A0H() {
        this.A01 = 0;
        this.A00 = 0;
        this.A02 = null;
    }

    @Override // com.facebook.ads.redexgen.X.C4S
    public final void A0I(int i, int i2, C4U c4u, C4Q c4q) {
        if (A07() == 0) {
            A0A();
            return;
        }
        this.A00 = A01(this.A00, i);
        this.A01 = A01(this.A01, i2);
        if (this.A00 == 0 && this.A01 == 0) {
            A08(c4q);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4S
    public void A0J(View view, C4U c4u, C4Q c4q) {
        int A0P = A0P(view, A0L());
        int A03 = A03(view, A00());
        int A0N = A0N((int) Math.sqrt((A0P * A0P) + (A03 * A03)));
        if (A0N > 0) {
            c4q.A05(-A0P, -A03, A0N, this.A04);
        }
    }

    public float A0K(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int A0L() {
        PointF pointF = this.A02;
        if (pointF == null || pointF.x == 0.0f) {
            return 0;
        }
        return this.A02.x > 0.0f ? 1 : -1;
    }

    public int A0M(int i) {
        return (int) Math.ceil(Math.abs(i) * this.A03);
    }

    public final int A0N(int i) {
        return (int) Math.ceil(A0M(i) / 0.3356d);
    }

    public final int A0O(int i, int i2, int i3, int i4, int i5) {
        if (i5 != -1) {
            if (i5 != 0) {
                if (i5 == 1) {
                    return i4 - i2;
                }
                throw new IllegalArgumentException(A04(113, 93, 122));
            }
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            String[] strArr = A07;
            if (strArr[3].charAt(24) != strArr[6].charAt(24)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[7] = "99CH8cQKDxQi0SdQwcjuhFHBueIBqbiA";
            strArr2[4] = "Y2Wuw9nWVBLC0K9LHKlenTQ1gtNyD";
            return 0;
        }
        return i3 - i;
    }

    public int A0P(View view, int left) {
        C4F A09 = A09();
        if (A09 == null || !A09.A25()) {
            return 0;
        }
        C4G c4g = (C4G) view.getLayoutParams();
        int start = A09.A0l(view) - c4g.leftMargin;
        int end = A09.A0o(view) + c4g.rightMargin;
        return A0O(start, end, A09.A0f(), A09.A0i() - A09.A0g(), left);
    }

    @Nullable
    public PointF A0Q(int i) {
        C4F A09 = A09();
        if (A09 instanceof C4R) {
            return ((C4R) A09).A45(i);
        }
        Log.w(A04(0, 20, 70), A04(20, 93, 111) + C4R.class.getCanonicalName());
        return null;
    }
}