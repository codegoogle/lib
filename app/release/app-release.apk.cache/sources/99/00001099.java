package com.facebook.ads.redexgen.X;

import android.graphics.PointF;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public final class ET extends AbstractC0982Sn {
    public static String[] A02;
    @Nullable
    public AbstractC03813z A00;
    @Nullable
    public AbstractC03813z A01;

    static {
        A05();
    }

    public static void A05() {
        A02 = new String[]{"C44Ajl3kvJruV1G0pt7gVRuztfjSJyFq", "J5x5lFquh7whloqA7FngbvBzLsCb", "NWBvU5bW0Pue", "3", "BTAVkHunqM91yRRN2KcoYuZCergWfboL", "2NY5ANPTvwBPWrnTgdotgLNYCmp8", "bg7eF9CjngMlwdFplTojabi", "lLeEucKPPYu6Z0yxrpg2o1MG4v3W39r2"};
    }

    private int A00(@NonNull C4F c4f, @NonNull View view, AbstractC03813z abstractC03813z) {
        int A06;
        int A0F = abstractC03813z.A0F(view) + (abstractC03813z.A0D(view) / 2);
        if (c4f.A1Y()) {
            A06 = abstractC03813z.A0A() + (abstractC03813z.A0B() / 2);
        } else {
            A06 = abstractC03813z.A06() / 2;
        }
        return A0F - A06;
    }

    @Nullable
    private View A01(C4F c4f, AbstractC03813z abstractC03813z) {
        int A06;
        int absClosest = c4f.A0X();
        if (absClosest == 0) {
            return null;
        }
        View child = null;
        if (c4f.A1Y()) {
            int A0A = abstractC03813z.A0A();
            int A0B = abstractC03813z.A0B();
            if (A02[3].length() != 1) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[4] = "QSrTWOl4jyYASaYHeqwJw7nAVlZS9nVf";
            strArr[4] = "QSrTWOl4jyYASaYHeqwJw7nAVlZS9nVf";
            A06 = A0A + (A0B / 2);
        } else {
            A06 = abstractC03813z.A06() / 2;
        }
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < absClosest; i2++) {
            View A0u = c4f.A0u(i2);
            int A0F = abstractC03813z.A0F(A0u);
            int i3 = abstractC03813z.A0D(A0u);
            int childCenter = Math.abs((A0F + (i3 / 2)) - A06);
            if (childCenter < i) {
                i = childCenter;
                child = A0u;
            }
        }
        return child;
    }

    @Nullable
    private View A02(C4F c4f, AbstractC03813z abstractC03813z) {
        int i = c4f.A0X();
        if (i == 0) {
            return null;
        }
        View view = null;
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < i; i3++) {
            View A0u = c4f.A0u(i3);
            int A0F = abstractC03813z.A0F(A0u);
            if (A0F < i2) {
                i2 = A0F;
                int childStart = A02[3].length();
                if (childStart != 1) {
                    throw new RuntimeException();
                }
                String[] strArr = A02;
                strArr[3] = "0";
                strArr[3] = "0";
                view = A0u;
            }
        }
        return view;
    }

    @NonNull
    private AbstractC03813z A03(@NonNull C4F c4f) {
        AbstractC03813z abstractC03813z = this.A00;
        if (abstractC03813z == null || abstractC03813z.A02 != c4f) {
            this.A00 = AbstractC03813z.A00(c4f);
        }
        return this.A00;
    }

    @NonNull
    private AbstractC03813z A04(@NonNull C4F c4f) {
        AbstractC03813z abstractC03813z = this.A01;
        if (abstractC03813z == null || abstractC03813z.A02 != c4f) {
            this.A01 = AbstractC03813z.A01(c4f);
        }
        return this.A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007d, code lost:
        if (r4 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
        if (r4.x < 0.0f) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008a, code lost:
        if (r4.y >= 0.0f) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008c, code lost:
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008d, code lost:
        r5 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a6, code lost:
        if (r4 != null) goto L23;
     */
    @Override // com.facebook.ads.redexgen.X.AbstractC0982Sn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int A0E(C4F c4f, int i, int centerPosition) {
        int A0q;
        boolean z;
        int A0a = c4f.A0a();
        if (A0a == 0) {
            return -1;
        }
        View view = null;
        if (c4f.A26()) {
            view = A02(c4f, A04(c4f));
        } else if (c4f.A25()) {
            AbstractC03813z A03 = A03(c4f);
            if (A02[3].length() != 1) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[4] = "gb7KateBwDTMhlVKT6fWGE4qrSBelOuo";
            strArr[4] = "gb7KateBwDTMhlVKT6fWGE4qrSBelOuo";
            view = A02(c4f, A03);
        }
        if (view == null || (A0q = c4f.A0q(view)) == -1) {
            return -1;
        }
        boolean z2 = false;
        if (c4f.A25()) {
            z = i > 0;
        } else {
            z = centerPosition > 0;
        }
        boolean z3 = false;
        if (c4f instanceof C4R) {
            PointF A45 = ((C4R) c4f).A45(A0a - 1);
            if (A02[3].length() != 1) {
                String[] strArr2 = A02;
                strArr2[6] = "yuw4mNpzW34AqVSRehlxNeo";
                strArr2[2] = "wkUUhZpWZ02e";
            } else {
                String[] strArr3 = A02;
                strArr3[0] = "mSLQWLSJnMsLfeZB8hd0gvJZQvTgwPgU";
                strArr3[0] = "mSLQWLSJnMsLfeZB8hd0gvJZQvTgwPgU";
            }
        }
        return z3 ? z ? A0q - 1 : A0q : z ? A0q + 1 : A0q;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0982Sn
    @Nullable
    public final View A0F(C4F c4f) {
        if (c4f.A26()) {
            return A01(c4f, A04(c4f));
        }
        if (c4f.A25()) {
            return A01(c4f, A03(c4f));
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0982Sn
    public final SX A0G(C4F c4f) {
        if (!(c4f instanceof C4R)) {
            return null;
        }
        return new EU(this, super.A00.getContext());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0982Sn
    @Nullable
    public final int[] A0J(@NonNull C4F c4f, @NonNull View view) {
        int[] iArr = new int[2];
        if (c4f.A25()) {
            iArr[0] = A00(c4f, view, A03(c4f));
        } else {
            iArr[0] = 0;
        }
        boolean A26 = c4f.A26();
        String[] strArr = A02;
        if (strArr[1].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[0] = "E62MX6H1I4NpqQbgkpQnwXfK7jhgOp7C";
        strArr2[0] = "E62MX6H1I4NpqQbgkpQnwXfK7jhgOp7C";
        if (A26) {
            iArr[1] = A00(c4f, view, A04(c4f));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }
}