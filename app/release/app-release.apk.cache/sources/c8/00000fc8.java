package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.Al  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0538Al {
    public static String[] A06;
    public C0539Am A01;
    public C0539Am A02;
    public boolean A03;
    public final ArrayList<C0539Am> A05 = new ArrayList<>();
    public final C0534Ah A04 = new C0534Ah();
    public AbstractC0536Aj A00 = AbstractC0536Aj.A01;

    static {
        A03();
    }

    public static void A03() {
        A06 = new String[]{"KiEP2P9b6TLdkEYwaN5ndNVtk9NQ5Y9p", "yrQkoPMIPCp0FUw5bDslSTdDJuyK", "OV0qCkDU4pR0s48LAW0LoXOWDo4ZunO9", "CNzCLbPvty9jTQMUswZxpqZWQtb7JEv9", "Vf", "ol3MR5ayifXszMqJK7WjfrE4Lr8bJhi8", "Hh8EscwfVF04VFT3j4sJSJqD2SmetI3K", "DN3PdRai96zSFxDytd4qNigxYecPuw8S"};
    }

    private C0539Am A00(C0539Am c0539Am, AbstractC0536Aj abstractC0536Aj) {
        if (abstractC0536Aj.A0F() || this.A00.A0F()) {
            return c0539Am;
        }
        int A05 = abstractC0536Aj.A05(this.A00.A0B(c0539Am.A01.A02, this.A04, true).A03);
        if (A05 == -1) {
            return c0539Am;
        }
        return new C0539Am(abstractC0536Aj.A0A(A05, this.A04).A00, c0539Am.A01.A01(A05));
    }

    private void A02() {
        if (!this.A05.isEmpty()) {
            this.A01 = this.A05.get(0);
        }
    }

    @Nullable
    public final C0539Am A04() {
        return this.A01;
    }

    @Nullable
    public final C0539Am A05() {
        if (this.A05.isEmpty()) {
            return null;
        }
        ArrayList<C0539Am> arrayList = this.A05;
        return arrayList.get(arrayList.size() - 1);
    }

    @Nullable
    public final C0539Am A06() {
        if (this.A05.isEmpty() || this.A00.A0F() || this.A03) {
            return null;
        }
        return this.A05.get(0);
    }

    @Nullable
    public final C0539Am A07() {
        return this.A02;
    }

    @Nullable
    public final FG A08(int timelinePeriodCount) {
        FG fg = null;
        AbstractC0536Aj abstractC0536Aj = this.A00;
        if (abstractC0536Aj != null) {
            int periodIndex = abstractC0536Aj.A01();
            for (int i = 0; i < this.A05.size(); i++) {
                C0539Am c0539Am = this.A05.get(i);
                int i2 = c0539Am.A01.A02;
                if (i2 < periodIndex && this.A00.A0A(i2, this.A04).A00 == timelinePeriodCount) {
                    if (fg != null) {
                        return null;
                    }
                    fg = c0539Am.A01;
                }
            }
        }
        return fg;
    }

    public final void A09() {
        this.A03 = false;
        A02();
    }

    public final void A0A() {
        this.A03 = true;
    }

    public final void A0B(int i) {
        A02();
    }

    public final void A0C(int i, FG fg) {
        this.A05.add(new C0539Am(i, fg));
        if (this.A05.size() == 1) {
            boolean A0F = this.A00.A0F();
            if (A06[0].charAt(21) == 'U') {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[0] = "SFS5Xb2c2LrmqtbhPrHYALinOi1MehvJ";
            strArr[0] = "SFS5Xb2c2LrmqtbhPrHYALinOi1MehvJ";
            if (!A0F) {
                A02();
            }
        }
    }

    public final void A0D(int i, FG fg) {
        C0539Am c0539Am = new C0539Am(i, fg);
        this.A05.remove(c0539Am);
        if (!c0539Am.equals(this.A02)) {
            return;
        }
        this.A02 = this.A05.isEmpty() ? null : this.A05.get(0);
    }

    public final void A0E(int i, FG fg) {
        this.A02 = new C0539Am(i, fg);
    }

    public final void A0F(AbstractC0536Aj abstractC0536Aj) {
        for (int i = 0; i < this.A05.size(); i++) {
            ArrayList<C0539Am> arrayList = this.A05;
            arrayList.set(i, A00(arrayList.get(i), abstractC0536Aj));
        }
        C0539Am c0539Am = this.A02;
        if (A06[0].charAt(21) == 'U') {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[1] = "OE27bQwCbSc4SHZoCTNTYydrCDTv";
        strArr[1] = "OE27bQwCbSc4SHZoCTNTYydrCDTv";
        if (c0539Am != null) {
            this.A02 = A00(c0539Am, abstractC0536Aj);
        }
        this.A00 = abstractC0536Aj;
        A02();
    }

    public final boolean A0G() {
        return this.A03;
    }
}