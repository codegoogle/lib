package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcelable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.androidx.support.v7.widget.LinearLayoutManager$SavedState;
import com.p7700g.p99005.dy;
import java.util.Arrays;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public class SW extends C4F implements C4R {
    public static byte[] A0F;
    public static String[] A0G;
    public int A00;
    public int A01;
    public int A02;
    public LinearLayoutManager$SavedState A03;
    public AbstractC03813z A04;
    public boolean A05;
    public int A06;
    public C03773u A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final C03753s A0D;
    public final C03763t A0E;

    static {
        A0X();
        A0W();
    }

    public static String A0U(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 118);
        }
        return new String(copyOfRange);
    }

    public static void A0W() {
        A0F = new byte[]{30, 25, 1, 22, 27, 30, 19, 87, 24, 5, 30, 18, 25, 3, 22, 3, 30, 24, 25, 77};
    }

    public static void A0X() {
        A0G = new String[]{"VKH6HNPW", "5SG7ZkmA1SrYT5HpW6e3lHPIEdQjCnoY", "GUFAcNFlkHbDslOxTlAKu2zM5da70L8W", "8EarDdUd0wjX", "ogiAdIZLqFL2ODTGKcli7xbzAuQZVFku", "k0c9canuweazyFazM74f3pFcokchiBr", "yJQv9VjGutzUoxdr6", "vBYUiSK7FkagYmvZS"};
    }

    public SW(Context context) {
        this(context, 1, false);
    }

    public SW(Context context, int i, boolean z) {
        this.A0A = false;
        this.A05 = false;
        this.A0C = false;
        this.A0B = true;
        this.A01 = -1;
        this.A02 = Integer.MIN_VALUE;
        this.A03 = null;
        this.A0D = new C03753s(this);
        this.A0E = new C03763t();
        this.A06 = 2;
        A2F(i);
        A0j(z);
        A1W(true);
    }

    private final int A05(int scrolled, C4N c4n, C4U c4u) {
        if (A0X() == 0 || scrolled == 0) {
            return 0;
        }
        this.A07.A0B = true;
        A2E();
        int i = scrolled > 0 ? 1 : -1;
        int abs = Math.abs(scrolled);
        A0a(i, abs, true, c4u);
        int A09 = this.A07.A07 + A09(c4n, this.A07, c4u, false);
        if (A09 < 0) {
            return 0;
        }
        int i2 = abs > A09 ? i * A09 : scrolled;
        this.A04.A0J(-i2);
        this.A07.A04 = i2;
        return i2;
    }

    private int A06(int fixOffset, C4N c4n, C4U c4u, boolean z) {
        int A07 = this.A04.A07() - fixOffset;
        if (A07 > 0) {
            int i = -A05(-A07, c4n, c4u);
            int fixOffset2 = fixOffset + i;
            if (z) {
                int A072 = this.A04.A07();
                if (A0G[0].length() == 7) {
                    throw new RuntimeException();
                }
                String[] strArr = A0G;
                strArr[0] = "DiKLRwr5Jced9h1IWYQQBSe";
                strArr[0] = "DiKLRwr5Jced9h1IWYQQBSe";
                int i2 = A072 - fixOffset2;
                if (i2 > 0) {
                    this.A04.A0J(i2);
                    return i2 + i;
                }
            }
            return i;
        }
        return 0;
    }

    private int A08(int fixOffset, C4N c4n, C4U c4u, boolean z) {
        int fixOffset2;
        int A0A = fixOffset - this.A04.A0A();
        if (A0A > 0) {
            int i = -A05(A0A, c4n, c4u);
            int fixOffset3 = fixOffset + i;
            if (z && (fixOffset2 = fixOffset3 - this.A04.A0A()) > 0) {
                this.A04.A0J(-fixOffset2);
                return i - fixOffset2;
            }
            return i;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
        return r7 - r11.A00;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int A09(C4N c4n, C03773u c03773u, C4U c4u, boolean z) {
        int i = c03773u.A00;
        if (c03773u.A07 != Integer.MIN_VALUE) {
            if (c03773u.A00 < 0) {
                c03773u.A07 += c03773u.A00;
            }
            A0g(c4n, c03773u);
        }
        int i2 = c03773u.A00 + c03773u.A02;
        C03763t c03763t = this.A0E;
        while (true) {
            if ((!c03773u.A09 && i2 <= 0) || !c03773u.A05(c4u)) {
                break;
            }
            c03763t.A00();
            A2I(c4n, c4u, c03773u, c03763t);
            if (c03763t.A01) {
                break;
            }
            c03773u.A06 += c03763t.A00 * c03773u.A05;
            if (!c03763t.A03 || this.A07.A08 != null || !c4u.A07()) {
                c03773u.A00 -= c03763t.A00;
                i2 -= c03763t.A00;
            }
            if (c03773u.A07 != Integer.MIN_VALUE) {
                c03773u.A07 += c03763t.A00;
                if (c03773u.A00 < 0) {
                    int i3 = c03773u.A07;
                    int i4 = c03773u.A00;
                    if (A0G[0].length() == 7) {
                        break;
                    }
                    String[] strArr = A0G;
                    strArr[5] = "4Yaap7YPoeEmBfNVznjneaOXF1T3Chf";
                    strArr[5] = "4Yaap7YPoeEmBfNVznjneaOXF1T3Chf";
                    c03773u.A07 = i3 + i4;
                }
                A0g(c4n, c03773u);
            }
            if (z) {
                boolean z2 = c03763t.A02;
                if (A0G[0].length() == 7) {
                    break;
                }
                String[] strArr2 = A0G;
                strArr2[1] = "BoRZmQ3r1kYFEVrzuprqJgVQBsgHE2ov";
                strArr2[1] = "BoRZmQ3r1kYFEVrzuprqJgVQBsgHE2ov";
                if (z2) {
                    break;
                }
            }
        }
        throw new RuntimeException();
    }

    private int A0A(C4U c4u) {
        if (A0X() != 0) {
            A2E();
            return C4Y.A00(c4u, this.A04, A0S(!this.A0B, true), A0R(!this.A0B, true), this, this.A0B);
        } else if (A0G[5].length() != 31) {
            throw new RuntimeException();
        } else {
            String[] strArr = A0G;
            strArr[5] = "JS1EmTokFkofHdCiZDqGUekHou375gK";
            strArr[5] = "JS1EmTokFkofHdCiZDqGUekHou375gK";
            return 0;
        }
    }

    private int A0B(C4U c4u) {
        if (A0X() == 0) {
            return 0;
        }
        A2E();
        return C4Y.A02(c4u, this.A04, A0S(!this.A0B, true), A0R(!this.A0B, true), this, this.A0B, this.A05);
    }

    private int A0C(C4U c4u) {
        if (A0X() != 0) {
            A2E();
            return C4Y.A01(c4u, this.A04, A0S(!this.A0B, true), A0R(!this.A0B, true), this, this.A0B);
        }
        String[] strArr = A0G;
        if (strArr[2].charAt(4) != strArr[4].charAt(4)) {
            String[] strArr2 = A0G;
            strArr2[2] = "SnDsIEYZVkVP365fclIsQ2wSHS1GnuqA";
            strArr2[4] = "cd1sjhoNq3y2dBxKlbos6To2J3BafTHs";
            return 0;
        }
        throw new RuntimeException();
    }

    private final int A0D(C4U c4u) {
        if (c4u.A06()) {
            return this.A04.A0B();
        }
        return 0;
    }

    private View A0E() {
        return A0u(this.A05 ? 0 : A0X() - 1);
    }

    private View A0F() {
        return A0u(this.A05 ? A0X() - 1 : 0);
    }

    private final View A0G(int preferredBoundsFlag, int acceptableBoundsFlag) {
        char c;
        int i;
        int i2;
        A2E();
        if (acceptableBoundsFlag > preferredBoundsFlag) {
            c = 1;
        } else {
            c = acceptableBoundsFlag < preferredBoundsFlag ? (char) 65535 : (char) 0;
        }
        if (c == 0) {
            View A0u = A0u(preferredBoundsFlag);
            String[] strArr = A0G;
            if (strArr[6].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0G;
            strArr2[5] = "tEP4S10y6AtQbDA9ff3H424KLTnX0k7";
            strArr2[5] = "tEP4S10y6AtQbDA9ff3H424KLTnX0k7";
            return A0u;
        }
        if (this.A04.A0F(A0u(preferredBoundsFlag)) < this.A04.A0A()) {
            i = 16644;
            i2 = 16388;
        } else {
            i = 4161;
            i2 = dy.p;
        }
        if (this.A00 == 0) {
            return super.A04.A00(preferredBoundsFlag, acceptableBoundsFlag, i, i2);
        }
        return super.A05.A00(preferredBoundsFlag, acceptableBoundsFlag, i, i2);
    }

    private final View A0H(int acceptableBoundsFlag, int i, boolean z, boolean z2) {
        int i2;
        A2E();
        int i3 = 0;
        if (z) {
            i2 = 24579;
        } else {
            i2 = 320;
        }
        if (z2) {
            i3 = 320;
        }
        int i4 = this.A00;
        if (A0G[1].charAt(30) != 'o') {
            throw new RuntimeException();
        }
        String[] strArr = A0G;
        strArr[2] = "NnwW0AnvRBQDKBAe7Vp9NN4SqY6y39Zg";
        strArr[4] = "snWQRfIRwdJNOSPMdDWVpUmegwlUrdsl";
        if (i4 == 0) {
            return super.A04.A00(acceptableBoundsFlag, i, i2, i3);
        }
        return super.A05.A00(acceptableBoundsFlag, i, i2, i3);
    }

    private View A0I(C4N c4n, C4U c4u) {
        return A0G(0, A0X());
    }

    private View A0K(C4N c4n, C4U c4u) {
        return A2D(c4n, c4u, 0, A0X(), c4u.A03());
    }

    private View A0L(C4N c4n, C4U c4u) {
        return A0G(A0X() - 1, -1);
    }

    private View A0M(C4N c4n, C4U c4u) {
        return A2D(c4n, c4u, A0X() - 1, -1, c4u.A03());
    }

    private View A0N(C4N c4n, C4U c4u) {
        return this.A05 ? A0I(c4n, c4u) : A0L(c4n, c4u);
    }

    private View A0O(C4N c4n, C4U c4u) {
        return this.A05 ? A0L(c4n, c4u) : A0I(c4n, c4u);
    }

    private View A0P(C4N c4n, C4U c4u) {
        return this.A05 ? A0K(c4n, c4u) : A0M(c4n, c4u);
    }

    private View A0Q(C4N c4n, C4U c4u) {
        return this.A05 ? A0M(c4n, c4u) : A0K(c4n, c4u);
    }

    private View A0R(boolean z, boolean z2) {
        if (this.A05) {
            return A0H(0, A0X(), z, z2);
        }
        return A0H(A0X() - 1, -1, z, z2);
    }

    private View A0S(boolean z, boolean z2) {
        if (this.A05) {
            return A0H(A0X() - 1, -1, z, z2);
        }
        return A0H(0, A0X(), z, z2);
    }

    private final C03773u A0T() {
        return new C03773u();
    }

    private void A0V() {
        if (this.A00 == 1 || !A2K()) {
            this.A05 = this.A0A;
            return;
        }
        boolean z = !this.A0A;
        String[] strArr = A0G;
        if (strArr[2].charAt(4) == strArr[4].charAt(4)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0G;
        strArr2[6] = "rvopS3hSB7itRsuyG";
        strArr2[7] = "9RTUShXs4ZXrU4n03";
        this.A05 = z;
    }

    private void A0Y(int i, int i2) {
        this.A07.A00 = this.A04.A07() - i2;
        this.A07.A03 = this.A05 ? -1 : 1;
        C03773u c03773u = this.A07;
        c03773u.A01 = i;
        c03773u.A05 = 1;
        c03773u.A06 = i2;
        c03773u.A07 = Integer.MIN_VALUE;
    }

    private void A0Z(int i, int i2) {
        this.A07.A00 = i2 - this.A04.A0A();
        C03773u c03773u = this.A07;
        c03773u.A01 = i;
        c03773u.A03 = this.A05 ? 1 : -1;
        C03773u c03773u2 = this.A07;
        c03773u2.A05 = -1;
        c03773u2.A06 = i2;
        c03773u2.A07 = Integer.MIN_VALUE;
    }

    private void A0a(int i, int i2, boolean z, C4U c4u) {
        int A0A;
        this.A07.A09 = A0k();
        this.A07.A02 = A0D(c4u);
        C03773u c03773u = this.A07;
        c03773u.A05 = i;
        if (i == 1) {
            c03773u.A02 += this.A04.A08();
            View A0E = A0E();
            C03773u c03773u2 = this.A07;
            if (!this.A05) {
                r4 = 1;
            }
            c03773u2.A03 = r4;
            this.A07.A01 = A0q(A0E) + this.A07.A03;
            this.A07.A06 = this.A04.A0C(A0E);
            A0A = this.A04.A0C(A0E) - this.A04.A07();
        } else {
            View A0F2 = A0F();
            this.A07.A02 += this.A04.A0A();
            this.A07.A03 = this.A05 ? 1 : -1;
            this.A07.A01 = A0q(A0F2) + this.A07.A03;
            this.A07.A06 = this.A04.A0F(A0F2);
            A0A = (-this.A04.A0F(A0F2)) + this.A04.A0A();
        }
        C03773u c03773u3 = this.A07;
        c03773u3.A00 = i2;
        if (z) {
            c03773u3.A00 -= A0A;
        }
        this.A07.A07 = A0A;
        if (A0G[0].length() == 7) {
            throw new RuntimeException();
        }
        String[] strArr = A0G;
        strArr[1] = "rmKnvh8FAT7bzRdUkYGsCRYa1fX1DRoz";
        strArr[1] = "rmKnvh8FAT7bzRdUkYGsCRYa1fX1DRoz";
    }

    private void A0b(C03753s c03753s) {
        A0Y(c03753s.A01, c03753s.A00);
    }

    private void A0c(C03753s c03753s) {
        A0Z(c03753s.A01, c03753s.A00);
    }

    private void A0d(C4N c4n, int i) {
        int A0X = A0X();
        if (i < 0) {
            return;
        }
        int A06 = this.A04.A06() - i;
        if (this.A05) {
            for (int i2 = 0; i2 < A0X; i2++) {
                View A0u = A0u(i2);
                if (this.A04.A0F(A0u) < A06 || this.A04.A0H(A0u) < A06) {
                    A0f(c4n, 0, i2);
                    return;
                }
            }
            return;
        }
        for (int i3 = A0X - 1; i3 >= 0; i3--) {
            View A0u2 = A0u(i3);
            if (this.A04.A0F(A0u2) < A06 || this.A04.A0H(A0u2) < A06) {
                A0f(c4n, A0X - 1, i3);
                return;
            }
        }
    }

    private void A0e(C4N c4n, int i) {
        if (i < 0) {
            return;
        }
        String[] strArr = A0G;
        if (strArr[2].charAt(4) == strArr[4].charAt(4)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0G;
        strArr2[0] = "66";
        strArr2[0] = "66";
        int A0X = A0X();
        if (this.A05) {
            for (int i2 = A0X - 1; i2 >= 0; i2--) {
                View A0u = A0u(i2);
                if (this.A04.A0C(A0u) <= i) {
                    AbstractC03813z abstractC03813z = this.A04;
                    String[] strArr3 = A0G;
                    if (strArr3[6].length() != strArr3[7].length()) {
                        if (abstractC03813z.A0G(A0u) <= i) {
                        }
                    } else {
                        String[] strArr4 = A0G;
                        strArr4[3] = "uDZbJl3GZvnd0";
                        strArr4[3] = "uDZbJl3GZvnd0";
                        if (abstractC03813z.A0G(A0u) <= i) {
                        }
                    }
                }
                A0f(c4n, A0X - 1, i2);
                return;
            }
            return;
        }
        for (int i3 = 0; i3 < A0X; i3++) {
            View A0u2 = A0u(i3);
            int A0C = this.A04.A0C(A0u2);
            if (A0G[3].length() == 28) {
                throw new RuntimeException();
            }
            String[] strArr5 = A0G;
            strArr5[1] = "ET87P0AumYMcjI6vylu4qFXoEmTHeXod";
            strArr5[1] = "ET87P0AumYMcjI6vylu4qFXoEmTHeXod";
            if (A0C > i || this.A04.A0G(A0u2) > i) {
                A0f(c4n, 0, i3);
                return;
            }
        }
    }

    private void A0f(C4N c4n, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 > i) {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                A15(i3, c4n);
            }
            return;
        }
        while (i > i2) {
            A15(i, c4n);
            i--;
        }
    }

    private void A0g(C4N c4n, C03773u c03773u) {
        if (!c03773u.A0B || c03773u.A09) {
            return;
        }
        int i = c03773u.A05;
        String[] strArr = A0G;
        if (strArr[6].length() == strArr[7].length()) {
            String[] strArr2 = A0G;
            strArr2[2] = "M7iaeQoExhHh03f7x1XNzmreS2Lq1zJK";
            strArr2[4] = "3weclwG7n9RXAySrMV3Jn51LrKgutG4n";
            if (i == -1) {
                int i2 = c03773u.A07;
                if (A0G[1].charAt(30) == 'o') {
                    String[] strArr3 = A0G;
                    strArr3[3] = "CiNTyTfZO3PW6tP";
                    strArr3[3] = "CiNTyTfZO3PW6tP";
                    A0d(c4n, i2);
                    return;
                }
            } else {
                A0e(c4n, c03773u.A07);
                return;
            }
        }
        throw new RuntimeException();
    }

    private void A0h(C4N c4n, C4U c4u, int scrapExtraEnd, int scrapExtraEnd2) {
        if (!c4u.A08() || A0X() == 0 || c4u.A07() || !A27()) {
            return;
        }
        int direction = 0;
        int i = 0;
        List<C4X> A0K = c4n.A0K();
        int size = A0K.size();
        int A0q = A0q(A0u(0));
        for (int i2 = 0; i2 < size; i2++) {
            C4X c4x = A0K.get(i2);
            if (!c4x.A0d()) {
                int position = c4x.A0J();
                if (((position < A0q) != this.A05 ? (char) 65535 : (char) 1) == 65535) {
                    int position2 = this.A04.A0D(c4x.A0H);
                    direction += position2;
                } else {
                    int position3 = this.A04.A0D(c4x.A0H);
                    i += position3;
                }
            }
        }
        this.A07.A08 = A0K;
        if (direction > 0) {
            View anchor = A0F();
            A0Z(A0q(anchor), scrapExtraEnd);
            C03773u c03773u = this.A07;
            c03773u.A02 = direction;
            c03773u.A00 = 0;
            c03773u.A04();
            A09(c4n, this.A07, c4u, false);
        }
        if (i > 0) {
            View anchor2 = A0E();
            A0Y(A0q(anchor2), scrapExtraEnd2);
            C03773u c03773u2 = this.A07;
            c03773u2.A02 = i;
            c03773u2.A00 = 0;
            c03773u2.A04();
            A09(c4n, this.A07, c4u, false);
        }
        this.A07.A08 = null;
    }

    private void A0i(C4N c4n, C4U c4u, C03753s c03753s) {
        if (A0m(c4u, c03753s)) {
            return;
        }
        boolean A0l = A0l(c4n, c4u, c03753s);
        String[] strArr = A0G;
        if (strArr[2].charAt(4) == strArr[4].charAt(4)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0G;
        strArr2[3] = "XDJ2jDWhUW9a7iN";
        strArr2[3] = "XDJ2jDWhUW9a7iN";
        if (A0l) {
            return;
        }
        c03753s.A02();
        c03753s.A01 = this.A0C ? c4u.A03() - 1 : 0;
    }

    private final void A0j(boolean z) {
        A23(null);
        if (z == this.A0A) {
            return;
        }
        this.A0A = z;
        A0z();
    }

    private final boolean A0k() {
        return this.A04.A09() == 0 && this.A04.A06() == 0;
    }

    private boolean A0l(C4N c4n, C4U c4u, C03753s c03753s) {
        View A0Q;
        int A0A;
        boolean z = false;
        if (A0X() == 0) {
            return false;
        }
        View A0t = A0t();
        if (A0t != null && c03753s.A06(A0t, c4u)) {
            c03753s.A05(A0t);
            return true;
        } else if (this.A08 != this.A0C) {
            return false;
        } else {
            if (c03753s.A02) {
                A0Q = A0P(c4n, c4u);
            } else {
                A0Q = A0Q(c4n, c4u);
            }
            if (A0Q != null) {
                c03753s.A04(A0Q);
                if (!c4u.A07() && A27()) {
                    if ((this.A04.A0F(A0Q) >= this.A04.A07() || this.A04.A0C(A0Q) < this.A04.A0A()) ? true : true) {
                        if (c03753s.A02) {
                            A0A = this.A04.A07();
                        } else {
                            A0A = this.A04.A0A();
                        }
                        c03753s.A00 = A0A;
                    }
                }
                return true;
            }
            return false;
        }
    }

    private boolean A0m(C4U c4u, C03753s c03753s) {
        int i;
        int A0F2;
        if (c4u.A07() || (i = this.A01) == -1) {
            return false;
        }
        if (i < 0 || i >= c4u.A03()) {
            this.A01 = -1;
            this.A02 = Integer.MIN_VALUE;
            return false;
        }
        c03753s.A01 = this.A01;
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.A03;
        if (linearLayoutManager$SavedState == null || !linearLayoutManager$SavedState.A01()) {
            if (this.A02 == Integer.MIN_VALUE) {
                View A1r = A1r(this.A01);
                if (A1r != null) {
                    int A0D = this.A04.A0D(A1r);
                    int childSize = this.A04.A0B();
                    if (A0D > childSize) {
                        c03753s.A02();
                        return true;
                    }
                    int A0F3 = this.A04.A0F(A1r);
                    int childSize2 = this.A04.A0A();
                    if (A0F3 - childSize2 < 0) {
                        int childSize3 = this.A04.A0A();
                        c03753s.A00 = childSize3;
                        c03753s.A02 = false;
                        return true;
                    }
                    int A07 = this.A04.A07();
                    int childSize4 = this.A04.A0C(A1r);
                    if (A07 - childSize4 < 0) {
                        int childSize5 = this.A04.A07();
                        c03753s.A00 = childSize5;
                        c03753s.A02 = true;
                        return true;
                    }
                    if (c03753s.A02) {
                        int A0C = this.A04.A0C(A1r);
                        AbstractC03813z abstractC03813z = this.A04;
                        String[] strArr = A0G;
                        if (strArr[2].charAt(4) == strArr[4].charAt(4)) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A0G;
                        strArr2[3] = "ZbIhQvVoqDIGDPkO0OlvW9zioDplzu";
                        strArr2[3] = "ZbIhQvVoqDIGDPkO0OlvW9zioDplzu";
                        A0F2 = A0C + abstractC03813z.A05();
                    } else {
                        A0F2 = this.A04.A0F(A1r);
                    }
                    c03753s.A00 = A0F2;
                } else {
                    int childSize6 = A0X();
                    if (childSize6 > 0) {
                        int A0q = A0q(A0u(0));
                        int pos = this.A01;
                        boolean z = pos < A0q;
                        boolean z2 = this.A05;
                        if (A0G[1].charAt(30) != 'o') {
                            throw new RuntimeException();
                        }
                        String[] strArr3 = A0G;
                        strArr3[2] = "1tNDA9T9nSDYektAgKE77gOe81bMFJSk";
                        strArr3[4] = "TZYqXNdWGZVKxzfIQyf7YZEk7yb7IRTm";
                        c03753s.A02 = z == z2;
                    }
                    c03753s.A02();
                }
                return true;
            }
            boolean z3 = this.A05;
            c03753s.A02 = z3;
            if (z3) {
                c03753s.A00 = this.A04.A07() - this.A02;
            } else {
                c03753s.A00 = this.A04.A0A() + this.A02;
            }
            return true;
        }
        c03753s.A02 = this.A03.A02;
        if (c03753s.A02) {
            c03753s.A00 = this.A04.A07() - this.A03.A00;
        } else {
            c03753s.A00 = this.A04.A0A() + this.A03.A00;
        }
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.C4F
    public int A1i(int i, C4N c4n, C4U c4u) {
        if (this.A00 == 1) {
            return 0;
        }
        return A05(i, c4n, c4u);
    }

    @Override // com.facebook.ads.redexgen.X.C4F
    public int A1j(int i, C4N c4n, C4U c4u) {
        if (this.A00 == 0) {
            return 0;
        }
        int A05 = A05(i, c4n, c4u);
        String[] strArr = A0G;
        if (strArr[6].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0G;
        strArr2[3] = "CDnF1shpb";
        strArr2[3] = "CDnF1shpb";
        return A05;
    }

    @Override // com.facebook.ads.redexgen.X.C4F
    public final int A1k(C4U c4u) {
        return A0A(c4u);
    }

    @Override // com.facebook.ads.redexgen.X.C4F
    public final int A1l(C4U c4u) {
        return A0B(c4u);
    }

    @Override // com.facebook.ads.redexgen.X.C4F
    public final int A1m(C4U c4u) {
        return A0C(c4u);
    }

    @Override // com.facebook.ads.redexgen.X.C4F
    public final int A1n(C4U c4u) {
        return A0A(c4u);
    }

    @Override // com.facebook.ads.redexgen.X.C4F
    public final int A1o(C4U c4u) {
        return A0B(c4u);
    }

    @Override // com.facebook.ads.redexgen.X.C4F
    public final int A1p(C4U c4u) {
        return A0C(c4u);
    }

    @Override // com.facebook.ads.redexgen.X.C4F
    public final Parcelable A1q() {
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.A03;
        if (linearLayoutManager$SavedState != null) {
            return new LinearLayoutManager$SavedState(linearLayoutManager$SavedState);
        }
        LinearLayoutManager$SavedState linearLayoutManager$SavedState2 = new LinearLayoutManager$SavedState();
        if (A0X() > 0) {
            A2E();
            boolean didLayoutFromEnd = this.A08 ^ this.A05;
            linearLayoutManager$SavedState2.A02 = didLayoutFromEnd;
            if (didLayoutFromEnd) {
                View A0E = A0E();
                linearLayoutManager$SavedState2.A00 = this.A04.A07() - this.A04.A0C(A0E);
                linearLayoutManager$SavedState2.A01 = A0q(A0E);
            } else {
                View A0F2 = A0F();
                linearLayoutManager$SavedState2.A01 = A0q(A0F2);
                linearLayoutManager$SavedState2.A00 = this.A04.A0F(A0F2) - this.A04.A0A();
            }
        } else {
            linearLayoutManager$SavedState2.A00();
        }
        return linearLayoutManager$SavedState2;
    }

    @Override // com.facebook.ads.redexgen.X.C4F
    @Nullable
    public final View A1r(int firstChild) {
        int viewPosition = A0X();
        if (viewPosition == 0) {
            return null;
        }
        int A0q = firstChild - A0q(A0u(0));
        if (A0q >= 0 && A0q < viewPosition) {
            View A0u = A0u(A0q);
            if (A0q(A0u) == firstChild) {
                return A0u;
            }
        }
        View child = super.A1r(firstChild);
        return child;
    }

    @Override // com.facebook.ads.redexgen.X.C4F
    public View A1s(View view, int i, C4N c4n, C4U c4u) {
        int A2C;
        View A0N;
        View A0E;
        A0V();
        if (A0X() == 0 || (A2C = A2C(i)) == Integer.MIN_VALUE) {
            return null;
        }
        A2E();
        A2E();
        A0a(A2C, (int) (this.A04.A0B() * 0.33333334f), false, c4u);
        C03773u c03773u = this.A07;
        c03773u.A07 = Integer.MIN_VALUE;
        c03773u.A0B = false;
        A09(c4n, c03773u, c4u, true);
        if (A2C == -1) {
            A0N = A0O(c4n, c4u);
        } else {
            A0N = A0N(c4n, c4u);
        }
        if (A2C == -1) {
            A0E = A0F();
        } else {
            A0E = A0E();
        }
        boolean hasFocusable = A0E.hasFocusable();
        if (A0G[0].length() != 7) {
            String[] strArr = A0G;
            strArr[2] = "JGtMOr7ZHjmwUVfbInfaZmEhr0nxGN38";
            strArr[4] = "jCrgpf8bwQbyd1C9u6FfAt5OnK6gBhSa";
            if (hasFocusable) {
                if (A0N == null) {
                    return null;
                }
                return A0E;
            }
            return A0N;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.C4F
    public C4G A1t() {
        return new C4G(-2, -2);
    }

    @Override // com.facebook.ads.redexgen.X.C4F
    public void A1u(int i) {
        this.A01 = i;
        this.A02 = Integer.MIN_VALUE;
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.A03;
        if (linearLayoutManager$SavedState != null) {
            linearLayoutManager$SavedState.A00();
        }
        A0z();
    }

    @Override // com.facebook.ads.redexgen.X.C4F
    public final void A1v(int i, int i2, C4U c4u, C4D c4d) {
        if (this.A00 != 0) {
            i = i2;
        }
        if (A0X() == 0 || i == 0) {
            return;
        }
        A2E();
        A0a(i > 0 ? 1 : -1, Math.abs(i), true, c4u);
        A2J(c4u, this.A07, c4d);
    }

    /* JADX WARN: Incorrect condition in loop: B:10:0x0019 */
    @Override // com.facebook.ads.redexgen.X.C4F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A1w(int i, C4D c4d) {
        boolean z;
        int i2;
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.A03;
        if (linearLayoutManager$SavedState != null && linearLayoutManager$SavedState.A01()) {
            z = this.A03.A02;
            i2 = this.A03.A01;
        } else {
            A0V();
            z = this.A05;
            int i3 = this.A01;
            String[] strArr = A0G;
            if (strArr[6].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0G;
            strArr2[1] = "j12HxmlCdcFNOCf90EDMVBFIs8rsuaoM";
            strArr2[1] = "j12HxmlCdcFNOCf90EDMVBFIs8rsuaoM";
            if (i3 == -1) {
                i2 = z ? i - 1 : 0;
            } else {
                i2 = this.A01;
            }
        }
        int i4 = z ? -1 : 1;
        for (int i5 = 0; i5 < anchorPos && i2 >= 0 && i2 < i; i5++) {
            c4d.A3J(i2, 0);
            i2 += i4;
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4F
    public final void A1x(Parcelable parcelable) {
        if (parcelable instanceof LinearLayoutManager$SavedState) {
            this.A03 = (LinearLayoutManager$SavedState) parcelable;
            A0z();
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4F
    public final void A1y(AccessibilityEvent accessibilityEvent) {
        super.A1y(accessibilityEvent);
        if (A0X() > 0) {
            accessibilityEvent.setFromIndex(A29());
            int A2A = A2A();
            if (A0G[3].length() == 28) {
                throw new RuntimeException();
            }
            String[] strArr = A0G;
            strArr[3] = "9E5bhv9RVKulu";
            strArr[3] = "9E5bhv9RVKulu";
            accessibilityEvent.setToIndex(A2A);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ae, code lost:
        if (r8 != (-1)) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b4, code lost:
        if (r9.A02 == Integer.MIN_VALUE) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b6, code lost:
        r1 = A1r(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ba, code lost:
        if (r1 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00be, code lost:
        if (r9.A05 == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c0, code lost:
        r8 = r9.A04.A07() - r9.A04.A0C(r1);
        r5 = com.facebook.ads.redexgen.X.SW.A0G;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00de, code lost:
        if (r5[2].charAt(4) == r5[4].charAt(4)) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e0, code lost:
        r5 = com.facebook.ads.redexgen.X.SW.A0G;
        r5[5] = "r3FnQil1r32czyLALUutLd0XCkxYZ4G";
        r5[5] = "r3FnQil1r32czyLALUutLd0XCkxYZ4G";
        r0 = r9.A02;
        r8 = r8 - r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ef, code lost:
        if (r8 <= 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f1, code lost:
        r6 = r6 + r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0209, code lost:
        r7 = r7 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x020c, code lost:
        r5 = com.facebook.ads.redexgen.X.SW.A0G;
        r5[2] = "sdmiyO1ExKOYMO2wbr6XNnW0K6t4WoaH";
        r5[4] = "ty9AfnxQn4ghzZPCSImQPyrccPhuEwJu";
        r0 = r9.A02;
        r8 = r8 - r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x021d, code lost:
        r8 = r9.A02 - (r9.A04.A0F(r1) - r9.A04.A0A());
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x023b, code lost:
        if (r8 != (-1)) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x025f, code lost:
        if (r1 <= r0) goto L82;
     */
    @Override // com.facebook.ads.redexgen.X.C4F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void A1z(C4N c4n, C4U c4u) {
        int i;
        int i2;
        int i3;
        int i4 = -1;
        if ((this.A03 != null || this.A01 != -1) && c4u.A03() == 0) {
            A1J(c4n);
            return;
        }
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.A03;
        if (linearLayoutManager$SavedState != null && linearLayoutManager$SavedState.A01()) {
            this.A01 = this.A03.A01;
        }
        A2E();
        this.A07.A0B = false;
        A0V();
        View A0t = A0t();
        if (!this.A0D.A03 || this.A01 != -1 || this.A03 != null) {
            this.A0D.A03();
            C03753s c03753s = this.A0D;
            c03753s.A02 = this.A05 ^ this.A0C;
            A0i(c4n, c4u, c03753s);
            C03753s c03753s2 = this.A0D;
            if (A0G[3].length() == 28) {
                throw new RuntimeException();
            }
            String[] strArr = A0G;
            strArr[0] = "pP9DXN24lJAGcvrzmJLzNvbz";
            strArr[0] = "pP9DXN24lJAGcvrzmJLzNvbz";
            c03753s2.A03 = true;
        } else if (A0t != null) {
            int A0F2 = this.A04.A0F(A0t);
            int upcomingOffset = this.A04.A07();
            if (A0F2 < upcomingOffset) {
                int A0C = this.A04.A0C(A0t);
                int upcomingOffset2 = this.A04.A0A();
            }
            this.A0D.A05(A0t);
        }
        int A0D = A0D(c4u);
        int extra = this.A07.A04;
        if (extra >= 0) {
            i = 0;
        } else {
            i = A0D;
            A0D = 0;
        }
        int extraForStart = this.A04.A0A();
        int i5 = i + extraForStart;
        int extraForStart2 = this.A04.A08();
        int i6 = A0D + extraForStart2;
        if (c4u.A07()) {
            int i7 = this.A01;
            String[] strArr2 = A0G;
            String str = strArr2[6];
            String str2 = strArr2[7];
            int length = str.length();
            int extraForStart3 = str2.length();
            if (length != extraForStart3) {
                String[] strArr3 = A0G;
                strArr3[1] = "HnPzY03honFOjhYT25K5WFAFMhFIclok";
                strArr3[1] = "HnPzY03honFOjhYT25K5WFAFMhFIclok";
            } else {
                String[] strArr4 = A0G;
                strArr4[2] = "wwbDuuRcKwQkcLvBFtW9wuMbOUuGYFzY";
                strArr4[4] = "YequbpJjhMyIl9uyXvP2gytASLo9xZ7L";
            }
        }
        if (this.A0D.A02) {
            if (this.A05) {
                i4 = 1;
            }
        } else if (!this.A05) {
            i4 = 1;
        }
        A2H(c4n, c4u, this.A0D, i4);
        A1I(c4n);
        this.A07.A09 = A0k();
        this.A07.A0A = c4u.A07();
        if (this.A0D.A02) {
            A0c(this.A0D);
            C03773u c03773u = this.A07;
            c03773u.A02 = i5;
            A09(c4n, c03773u, c4u, false);
            i3 = this.A07.A06;
            int i8 = this.A07.A01;
            int firstElement = this.A07.A00;
            if (firstElement > 0) {
                int firstElement2 = this.A07.A00;
                i6 += firstElement2;
            }
            A0b(this.A0D);
            C03773u c03773u2 = this.A07;
            c03773u2.A02 = i6;
            int i9 = c03773u2.A01;
            int firstElement3 = this.A07.A03;
            c03773u2.A01 = i9 + firstElement3;
            A09(c4n, this.A07, c4u, false);
            i2 = this.A07.A06;
            int endOffset = this.A07.A00;
            if (endOffset > 0) {
                int i10 = this.A07.A00;
                A0Z(i8, i3);
                C03773u c03773u3 = this.A07;
                c03773u3.A02 = i10;
                A09(c4n, c03773u3, c4u, false);
                i3 = this.A07.A06;
            }
        } else {
            A0b(this.A0D);
            C03773u c03773u4 = this.A07;
            c03773u4.A02 = i6;
            A09(c4n, c03773u4, c4u, false);
            i2 = this.A07.A06;
            int i11 = this.A07.A01;
            int lastElement = this.A07.A00;
            if (lastElement > 0) {
                int lastElement2 = this.A07.A00;
                i5 += lastElement2;
            }
            A0c(this.A0D);
            C03773u c03773u5 = this.A07;
            c03773u5.A02 = i5;
            int i12 = c03773u5.A01;
            int lastElement3 = this.A07.A03;
            c03773u5.A01 = i12 + lastElement3;
            A09(c4n, this.A07, c4u, false);
            i3 = this.A07.A06;
            int startOffset = this.A07.A00;
            if (startOffset > 0) {
                int i13 = this.A07.A00;
                A0Y(i11, i2);
                C03773u c03773u6 = this.A07;
                c03773u6.A02 = i13;
                A09(c4n, c03773u6, c4u, false);
                i2 = this.A07.A06;
            }
        }
        int endOffset2 = A0X();
        if (endOffset2 > 0) {
            if (this.A05 ^ this.A0C) {
                int A06 = A06(i2, c4n, c4u, true);
                int i14 = i3 + A06;
                int i15 = i2 + A06;
                int A08 = A08(i14, c4n, c4u, false);
                i3 = i14 + A08;
                i2 = i15 + A08;
            } else {
                int A082 = A08(i3, c4n, c4u, true);
                int i16 = i3 + A082;
                int i17 = i2 + A082;
                int A062 = A06(i17, c4n, c4u, false);
                i3 = i16 + A062;
                i2 = i17 + A062;
            }
        }
        A0h(c4n, c4u, i3, i2);
        if (!c4u.A07()) {
            this.A04.A0I();
        } else {
            this.A0D.A03();
        }
        this.A08 = this.A0C;
    }

    @Override // com.facebook.ads.redexgen.X.C4F
    public void A20(C4U c4u) {
        super.A20(c4u);
        this.A03 = null;
        this.A01 = -1;
        this.A02 = Integer.MIN_VALUE;
        this.A0D.A03();
    }

    @Override // com.facebook.ads.redexgen.X.C4F
    public final void A21(ES es, C4N c4n) {
        super.A21(es, c4n);
        if (this.A09) {
            A1J(c4n);
            c4n.A0Q();
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4F
    public void A22(ES es, C4U c4u, int i) {
        SX sx = new SX(es.getContext());
        sx.A0B(i);
        A1M(sx);
    }

    @Override // com.facebook.ads.redexgen.X.C4F
    public final void A23(String str) {
        if (this.A03 == null) {
            super.A23(str);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4F
    public final boolean A24() {
        if (A0Z() != 1073741824 && A0j() != 1073741824) {
            boolean A1X = A1X();
            if (A0G[0].length() == 7) {
                throw new RuntimeException();
            }
            String[] strArr = A0G;
            strArr[0] = "ZYU5Lu8KJdo1W8";
            strArr[0] = "ZYU5Lu8KJdo1W8";
            if (A1X) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.C4F
    public final boolean A25() {
        return this.A00 == 0;
    }

    @Override // com.facebook.ads.redexgen.X.C4F
    public final boolean A26() {
        return this.A00 == 1;
    }

    @Override // com.facebook.ads.redexgen.X.C4F
    public boolean A27() {
        return this.A03 == null && this.A08 == this.A0C;
    }

    public final int A28() {
        View A0H = A0H(0, A0X(), true, false);
        if (A0H == null) {
            return -1;
        }
        return A0q(A0H);
    }

    public final int A29() {
        View A0H = A0H(0, A0X(), false, true);
        if (A0H == null) {
            return -1;
        }
        return A0q(A0H);
    }

    public final int A2A() {
        View A0H = A0H(A0X() - 1, -1, false, true);
        if (A0H == null) {
            return -1;
        }
        return A0q(A0H);
    }

    public final int A2B() {
        return this.A00;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e9 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int A2C(int i) {
        if (i != 1) {
            if (i != 2) {
                if (A0G[1].charAt(30) != 'o') {
                    throw new RuntimeException();
                }
                String[] strArr = A0G;
                strArr[3] = "6DQtaB3lJkGKNvmH8s9QQc68TsOBLDE";
                strArr[3] = "6DQtaB3lJkGKNvmH8s9QQc68TsOBLDE";
                if (i == 17) {
                    return this.A00 == 0 ? -1 : Integer.MIN_VALUE;
                } else if (i == 33) {
                    return this.A00 == 1 ? -1 : Integer.MIN_VALUE;
                } else if (i != 66) {
                    return (i == 130 && this.A00 == 1) ? 1 : Integer.MIN_VALUE;
                } else {
                    int i2 = this.A00;
                    String[] strArr2 = A0G;
                    if (strArr2[6].length() != strArr2[7].length()) {
                        String[] strArr3 = A0G;
                        strArr3[5] = "iK4U0ZRXzEtdW2fzfe8Bf3AGjQ0TqpV";
                        strArr3[5] = "iK4U0ZRXzEtdW2fzfe8Bf3AGjQ0TqpV";
                        if (i2 == 0) {
                            return 1;
                        }
                    } else {
                        String[] strArr4 = A0G;
                        strArr4[3] = "iGul3AgWfaQLWccPz7lC";
                        strArr4[3] = "iGul3AgWfaQLWccPz7lC";
                        if (i2 == 0) {
                            return 1;
                        }
                    }
                    return Integer.MIN_VALUE;
                }
            } else if (this.A00 == 1) {
                return 1;
            } else {
                boolean A2K = A2K();
                String[] strArr5 = A0G;
                if (strArr5[6].length() != strArr5[7].length()) {
                    return A2K ? -1 : 1;
                }
                String[] strArr6 = A0G;
                strArr6[2] = "RrOYqAD7qkiKfoMMpmv8yvTfnugso6lX";
                strArr6[4] = "bATvX0yF7VRTLnTu9UqtYEiONslIi7NA";
                if (A2K) {
                }
            }
        } else if (this.A00 == 1) {
            return -1;
        } else {
            boolean A2K2 = A2K();
            if (A0G[0].length() != 7) {
                String[] strArr7 = A0G;
                strArr7[0] = "oHMhsTCUvi8O8";
                strArr7[0] = "oHMhsTCUvi8O8";
                return A2K2 ? 1 : -1;
            }
            String[] strArr8 = A0G;
            strArr8[2] = "cASVkZ3y2DetEF9G8otARsSwnjimgRtg";
            strArr8[4] = "wDGntkgp6XogcOY7rYz8EKhCse1aHWOv";
            if (A2K2) {
            }
        }
    }

    public View A2D(C4N c4n, C4U c4u, int boundsEnd, int i, int i2) {
        A2E();
        View view = null;
        View view2 = null;
        int A0A = this.A04.A0A();
        int A07 = this.A04.A07();
        int i3 = i > boundsEnd ? 1 : -1;
        while (boundsEnd != i) {
            View A0u = A0u(boundsEnd);
            int A0q = A0q(A0u);
            if (A0q >= 0 && A0q < i2) {
                if (((C4G) A0u.getLayoutParams()).A02()) {
                    if (view == null) {
                        view = A0u;
                    }
                } else if (this.A04.A0F(A0u) >= A07 || this.A04.A0C(A0u) < A0A) {
                    if (view2 == null) {
                        view2 = A0u;
                    }
                } else {
                    return A0u;
                }
            }
            boundsEnd += i3;
        }
        return view2 != null ? view2 : view;
    }

    public final void A2E() {
        if (this.A07 == null) {
            this.A07 = A0T();
        }
        if (this.A04 == null) {
            this.A04 = AbstractC03813z.A02(this, this.A00);
        }
    }

    public final void A2F(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(A0U(0, 20, 1) + i);
        } else if (A0G[1].charAt(30) != 'o') {
            throw new RuntimeException();
        } else {
            String[] strArr = A0G;
            strArr[1] = "wMuOUB68W5cmyVCUMue198JFnL9Wkeot";
            strArr[1] = "wMuOUB68W5cmyVCUMue198JFnL9Wkeot";
            A23(null);
            if (i == this.A00) {
                return;
            }
            this.A00 = i;
            this.A04 = null;
            A0z();
        }
    }

    public final void A2G(int i, int i2) {
        this.A01 = i;
        this.A02 = i2;
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.A03;
        if (linearLayoutManager$SavedState != null) {
            linearLayoutManager$SavedState.A00();
        }
        A0z();
        if (A0G[1].charAt(30) != 'o') {
            throw new RuntimeException();
        }
        String[] strArr = A0G;
        strArr[3] = "tDl3kZGUKMTs";
        strArr[3] = "tDl3kZGUKMTs";
    }

    public void A2H(C4N c4n, C4U c4u, C03753s c03753s, int i) {
    }

    public void A2I(C4N c4n, C4U c4u, C03773u c03773u, C03763t c03763t) {
        int A0h;
        int A0E;
        int i;
        int i2;
        View A03 = c03773u.A03(c4n);
        if (A03 == null) {
            c03763t.A01 = true;
            return;
        }
        C4G c4g = (C4G) A03.getLayoutParams();
        if (c03773u.A08 == null) {
            boolean z = this.A05;
            int top = c03773u.A05 == -1 ? 1 : 0;
            if (z == top) {
                A18(A03);
            } else {
                A1A(A03, 0);
            }
        } else {
            boolean z2 = this.A05;
            int top2 = c03773u.A05;
            int top3 = top2 == -1 ? 1 : 0;
            if (z2 == top3) {
                A17(A03);
            } else {
                A19(A03, 0);
            }
        }
        A1B(A03, 0, 0);
        c03763t.A00 = this.A04.A0D(A03);
        if (this.A00 == 1) {
            if (A2K()) {
                i2 = A0i() - A0g();
                i = i2 - this.A04.A0E(A03);
            } else {
                i = A0f();
                i2 = this.A04.A0E(A03) + i;
            }
            if (c03773u.A05 == -1) {
                A0E = c03773u.A06;
                A0h = c03773u.A06 - c03763t.A00;
            } else {
                A0h = c03773u.A06;
                int i3 = c03773u.A06;
                int top4 = c03763t.A00;
                A0E = i3 + top4;
            }
        } else {
            A0h = A0h();
            A0E = this.A04.A0E(A03) + A0h;
            int top5 = c03773u.A05;
            if (top5 == -1) {
                i2 = c03773u.A06;
                int i4 = c03773u.A06;
                int top6 = c03763t.A00;
                i = i4 - top6;
            } else {
                i = c03773u.A06;
                int i5 = c03773u.A06;
                int top7 = c03763t.A00;
                i2 = i5 + top7;
            }
        }
        A1C(A03, i, A0h, i2, A0E);
        if (c4g.A02() || c4g.A01()) {
            c03763t.A03 = true;
        }
        c03763t.A02 = A03.hasFocusable();
    }

    public void A2J(C4U c4u, C03773u c03773u, C4D c4d) {
        int i = c03773u.A01;
        if (i >= 0 && i < c4u.A03()) {
            c4d.A3J(i, Math.max(0, c03773u.A07));
        }
    }

    public final boolean A2K() {
        return A0b() == 1;
    }

    @Override // com.facebook.ads.redexgen.X.C4R
    public final PointF A45(int firstChildPos) {
        if (A0X() == 0) {
            return null;
        }
        int i = (firstChildPos < A0q(A0u(0))) != this.A05 ? -1 : 1;
        int i2 = this.A00;
        if (A0G[0].length() != 7) {
            String[] strArr = A0G;
            strArr[5] = "5EjIyJt0kzQOvAP28HqeuGPqaebz9kN";
            strArr[5] = "5EjIyJt0kzQOvAP28HqeuGPqaebz9kN";
            if (i2 == 0) {
                return new PointF(i, 0.0f);
            }
            return new PointF(0.0f, i);
        }
        throw new RuntimeException();
    }
}