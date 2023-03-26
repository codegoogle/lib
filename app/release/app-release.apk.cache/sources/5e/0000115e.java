package com.facebook.ads.redexgen.X;

import android.os.Handler;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Hi */
/* loaded from: assets/audience_network.dex */
public final class C0702Hi implements InterfaceC0887Ot {
    public static String[] A0C;
    @Nullable
    public C0792Lb A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final AbstractC0766Jy A07 = new AbstractC0766Jy() { // from class: com.facebook.ads.redexgen.X.7r
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.C9K
        /* renamed from: A00 */
        public final void A04(C04747t c04747t) {
            C0702Hi.A01(C0702Hi.this).removeCallbacksAndMessages(null);
            if (C0702Hi.A0B(C0702Hi.this, PD.A05)) {
                C0702Hi.A05(C0702Hi.this);
                C0702Hi.A06(C0702Hi.this, true, false);
            }
            C0702Hi.A0C(C0702Hi.this, true);
        }
    };
    public final K4 A06 = new K4() { // from class: com.facebook.ads.redexgen.X.7q
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.C9K
        /* renamed from: A00 */
        public final void A04(C7v c7v) {
            C0702Hi.A05(C0702Hi.this);
            C0702Hi.A06(C0702Hi.this, false, false);
            C0702Hi.A0C(C0702Hi.this, true);
        }
    };
    public final AbstractC0754Jk A08 = new C04717p(this);
    public final AbstractC0724Ie A09 = new AbstractC0724Ie() { // from class: com.facebook.ads.redexgen.X.7o
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.C9K
        /* renamed from: A00 */
        public final void A04(C04737s c04737s) {
            if (!C0702Hi.A09(C0702Hi.this) && C0702Hi.A0B(C0702Hi.this, PD.A05)) {
                C0702Hi.A05(C0702Hi.this);
                C0702Hi.A06(C0702Hi.this, true, false);
            }
        }
    };
    public final IC A0A = new C04697n(this);
    public final Handler A05 = new Handler();
    public final List<PE> A0B = new ArrayList();
    public int A00 = 2000;

    static {
        A04();
    }

    public static void A04() {
        A0C = new String[]{"ua4Z1F3Vn1tdURaP0tTj5Z", "VlqKJtfjGqtNso0qX2A6lmnvOZsZ2xTE", "1pb0xsuTqC4ySw1JjiCpjHk6a0KK", "HW9a8amQa56v9usqS4J3KzzxMBRp7oUY", "lzg290ZQq0ECc78zj7A2Pt", "9JBQniCNh78hbF6UnJo6", "DIRAqcjzgSQz4x9q8OrEXdtc6Zce0V5V", "FPN1H6gS7aT4O5CCkRk249I"};
    }

    public C0702Hi(boolean z) {
        this.A02 = z;
    }

    public static /* synthetic */ int A00(C0702Hi c0702Hi) {
        return c0702Hi.A00;
    }

    public static /* synthetic */ Handler A01(C0702Hi c0702Hi) {
        return c0702Hi.A05;
    }

    public void A03() {
        this.A05.removeCallbacksAndMessages(null);
        Iterator<PE> it = this.A0B.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A0C[2].length() != 28) {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[1] = "SzC94btdcN1119JNHgRanzsWdfoutew0";
            strArr[1] = "SzC94btdcN1119JNHgRanzsWdfoutew0";
            if (hasNext) {
                it.next().cancel();
            } else {
                return;
            }
        }
    }

    public static /* synthetic */ void A05(C0702Hi c0702Hi) {
        c0702Hi.A03();
    }

    public static /* synthetic */ void A06(C0702Hi c0702Hi, boolean z, boolean z2) {
        c0702Hi.A07(z, z2);
    }

    public void A07(boolean z, boolean z2) {
        for (PE pe : this.A0B) {
            if (A0C[2].length() != 28) {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[1] = "qWrr7wKcnD6M25Nm7U3j0NNRElcnIA4d";
            strArr[1] = "qWrr7wKcnD6M25Nm7U3j0NNRElcnIA4d";
            pe.A3O(z, z2);
        }
    }

    public static /* synthetic */ boolean A08(C0702Hi c0702Hi) {
        return c0702Hi.A03;
    }

    public static /* synthetic */ boolean A09(C0702Hi c0702Hi) {
        return c0702Hi.A02;
    }

    public static /* synthetic */ boolean A0A(C0702Hi c0702Hi) {
        return c0702Hi.A04;
    }

    public static /* synthetic */ boolean A0B(C0702Hi c0702Hi, PD pd) {
        return c0702Hi.A0E(pd);
    }

    public static /* synthetic */ boolean A0C(C0702Hi c0702Hi, boolean z) {
        c0702Hi.A03 = z;
        return z;
    }

    public static /* synthetic */ boolean A0D(C0702Hi c0702Hi, boolean z) {
        c0702Hi.A04 = z;
        return z;
    }

    public boolean A0E(PD pd) {
        for (PE pe : this.A0B) {
            if (pe.A71() != pd) {
                return false;
            }
        }
        return true;
    }

    public final void A0F() {
        this.A0B.clear();
    }

    public final void A0G() {
        if (this.A02) {
            this.A05.removeCallbacksAndMessages(null);
            this.A02 = false;
        }
    }

    public final void A0H() {
        this.A04 = true;
        this.A03 = true;
        A07(false, false);
    }

    public final void A0I(int i) {
        this.A00 = i;
    }

    public final void A0J(PE pe) {
        this.A0B.add(pe);
    }

    public final boolean A0K() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0887Ot
    public final void A7s(C0792Lb c0792Lb) {
        this.A01 = c0792Lb;
        c0792Lb.getEventBus().A04(this.A07, this.A0A, this.A08, this.A09, this.A06);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0887Ot
    public final void ADa(C0792Lb c0792Lb) {
        A03();
        c0792Lb.getEventBus().A05(this.A06, this.A0A, this.A08, this.A09, this.A07);
        this.A01 = null;
    }
}