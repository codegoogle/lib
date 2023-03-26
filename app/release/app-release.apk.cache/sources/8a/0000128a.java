package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Mg  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0823Mg extends FrameLayout {
    public int A00;
    public AnonymousClass24 A01;
    public AnonymousClass25 A02;
    @Nullable
    public AnonymousClass26 A03;
    public final C1080Wh A04;
    public final JE A05;
    @Nullable
    public final M6 A06;
    @Nullable
    public final M7 A07;
    public final String A08;
    @Nullable
    public final C1Q A09;
    public final InterfaceC0825Mi A0A;

    public abstract void A0K();

    public abstract void A0L();

    public abstract void A0M(AnonymousClass26 anonymousClass26, AnonymousClass24 anonymousClass24);

    public abstract void A0N(AnonymousClass26 anonymousClass26, AnonymousClass24 anonymousClass24);

    public abstract boolean A0O();

    public AbstractC0823Mg(C1080Wh c1080Wh, JE je, String str) {
        this(c1080Wh, je, str, null, null, null);
    }

    public AbstractC0823Mg(C1080Wh c1080Wh, JE je, String str, @Nullable C1Q c1q, @Nullable M7 m7, @Nullable M6 m6) {
        super(c1080Wh);
        this.A00 = 0;
        this.A01 = AnonymousClass24.A04;
        this.A03 = null;
        this.A0A = new C1100Xb(this);
        this.A04 = c1080Wh;
        this.A05 = je;
        this.A07 = m7;
        this.A06 = m6;
        this.A08 = str;
        this.A09 = c1q;
    }

    public static /* synthetic */ int A00(AbstractC0823Mg abstractC0823Mg) {
        int i = abstractC0823Mg.A00;
        abstractC0823Mg.A00 = i + 1;
        return i;
    }

    public static /* synthetic */ int A01(AbstractC0823Mg abstractC0823Mg) {
        int i = abstractC0823Mg.A00;
        abstractC0823Mg.A00 = i - 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A() {
        if (this.A02.A0B()) {
            this.A05.A7v(this.A08, this.A02.A03());
            this.A02.A04();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0B() {
        this.A03 = null;
        this.A02.A06();
        A0K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(AnonymousClass26 anonymousClass26) {
        this.A02.A09(this.A01);
        A0M(anonymousClass26, this.A01);
        C03010u.A03();
        if (A0O()) {
            A0A();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(AnonymousClass26 anonymousClass26) {
        this.A03 = anonymousClass26;
        this.A02.A0A(this.A01, this.A00);
        A0N(anonymousClass26, this.A01);
    }

    public final void A0I() {
        A0A();
    }

    public final void A0J() {
        this.A02 = new AnonymousClass25(new JL(this.A08, this.A05));
        M7 m7 = this.A07;
        if (m7 != null) {
            m7.AAO(true);
        }
        A0B();
    }
}