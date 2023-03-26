package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.2c  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03352c {
    public static String[] A05;
    public ViewParent A00;
    public ViewParent A01;
    public boolean A02;
    public int[] A03;
    public final View A04;

    static {
        A01();
    }

    public static void A01() {
        A05 = new String[]{"efs8eZdEWHsCfUb6qOzicmMnQm4SneBY", "GPD1kjm6fR3i7blABsL8PkfqVt5tQ0ec", "1ZMAOqgxiysbgCK2QhJ8YR6mzQdOOVTU", "tADzoHnDRwqyF4JfOWpRm", "", "2dCxtsKJi8key4A0", "YZUwpVg0T4azRRaUQd2X9mlkfrI9cQeh", "C6BrW2LKkOXM7XSn"};
    }

    public C03352c(@NonNull View view) {
        this.A04 = view;
    }

    private ViewParent A00(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return this.A00;
        }
        return this.A01;
    }

    private void A02(int i, ViewParent viewParent) {
        if (i == 0) {
            this.A01 = viewParent;
        } else if (i != 1) {
        } else {
            this.A00 = viewParent;
        }
    }

    public final void A03() {
        A04(0);
    }

    public final void A04(int i) {
        ViewParent A00 = A00(i);
        if (A00 != null) {
            C3A.A00(A00, this.A04, i);
            A02(i, null);
        }
    }

    public final void A05(boolean z) {
        if (this.A02) {
            C2u.A08(this.A04);
        }
        this.A02 = z;
    }

    public final boolean A06() {
        return A0A(0);
    }

    public final boolean A07() {
        return this.A02;
    }

    public final boolean A08(float f, float f2) {
        ViewParent A00;
        if (!A07() || (A00 = A00(0)) == null) {
            return false;
        }
        return C3A.A04(A00, this.A04, f, f2);
    }

    public final boolean A09(float f, float f2, boolean z) {
        ViewParent A00;
        if (!A07() || (A00 = A00(0)) == null) {
            return false;
        }
        return C3A.A05(A00, this.A04, f, f2, z);
    }

    public final boolean A0A(int i) {
        return A00(i) != null;
    }

    public final boolean A0B(int i) {
        return A0C(i, 0);
    }

    public final boolean A0C(int i, int i2) {
        if (A0A(i2)) {
            return true;
        }
        if (A07()) {
            if (A05[0].charAt(13) != 't') {
                String[] strArr = A05;
                strArr[6] = "WHooJguTbRSPJrOooyt3LEnarcCTCzBe";
                strArr[1] = "8Bjeqw0rr3DdKBFvYwfvH0FxnGa8049d";
                View view = this.A04;
                for (ViewParent parent = this.A04.getParent(); parent != null; parent = parent.getParent()) {
                    if (C3A.A06(parent, view, this.A04, i, i2)) {
                        A02(i2, parent);
                        C3A.A03(parent, view, this.A04, i, i2);
                        return true;
                    }
                    if (parent instanceof View) {
                        view = (View) parent;
                    }
                }
                return false;
            }
            throw new RuntimeException();
        }
        return false;
    }

    public final boolean A0D(int i, int i2, int i3, int i4, @Nullable int[] iArr) {
        return A0E(i, i2, i3, i4, iArr, 0);
    }

    public final boolean A0E(int i, int i2, int i3, int i4, @Nullable int[] iArr, int i5) {
        ViewParent A00;
        if (!A07() || (A00 = A00(i5)) == null) {
            return false;
        }
        if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
            int startY = 0;
            int i6 = 0;
            if (iArr != null) {
                this.A04.getLocationInWindow(iArr);
                startY = iArr[0];
                i6 = iArr[1];
            }
            C3A.A01(A00, this.A04, i, i2, i3, i4, i5);
            if (iArr != null) {
                this.A04.getLocationInWindow(iArr);
                iArr[0] = iArr[0] - startY;
                iArr[1] = iArr[1] - i6;
            }
            return true;
        }
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = 0;
        }
        return false;
    }

    public final boolean A0F(int i, int i2, @Nullable int[] iArr, @Nullable int[] iArr2) {
        return A0G(i, i2, iArr, iArr2, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
        if (r5 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
        r16.A03 = new int[2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
        r14 = r16.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a2, code lost:
        if (r5 == null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean A0G(int i, int i2, @Nullable int[] iArr, @Nullable int[] iArr2, int i3) {
        ViewParent A00;
        int[] iArr3 = iArr;
        if (!A07() || (A00 = A00(i3)) == null) {
            return false;
        }
        if (i != 0 || i2 != 0) {
            int startY = 0;
            int i4 = 0;
            if (A05[3].length() != 9) {
                String[] strArr = A05;
                strArr[0] = "3VbjZKhXDsexEmt2meqPVZABMNEQkFPW";
                strArr[0] = "3VbjZKhXDsexEmt2meqPVZABMNEQkFPW";
                if (iArr2 != null) {
                    this.A04.getLocationInWindow(iArr2);
                    startY = iArr2[0];
                    i4 = iArr2[1];
                }
                if (iArr3 == null) {
                    int[] iArr4 = this.A03;
                    String[] strArr2 = A05;
                    if (strArr2[5].length() != strArr2[7].length()) {
                        String[] strArr3 = A05;
                        strArr3[4] = "";
                        strArr3[4] = "";
                    } else {
                        String[] strArr4 = A05;
                        strArr4[5] = "gHL5QaZEq3qu3ZW6";
                        strArr4[7] = "on2hgQBHubksAtN0";
                    }
                }
                iArr3[0] = 0;
                iArr3[1] = 0;
                C3A.A02(A00, this.A04, i, i2, iArr3, i3);
                if (iArr2 != null) {
                    this.A04.getLocationInWindow(iArr2);
                    iArr2[0] = iArr2[0] - startY;
                    iArr2[1] = iArr2[1] - i4;
                }
                return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
            }
            throw new RuntimeException();
        }
        if (iArr2 != null) {
            iArr2[0] = 0;
            iArr2[1] = 0;
        }
        return false;
    }
}