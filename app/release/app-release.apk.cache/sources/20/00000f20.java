package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.7w  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C7w extends K7 {
    public int A00;
    public boolean A01;
    public final C9K<C7v> A02;
    public final C9K<C04747t> A03;
    public final C9K<C0761Jt> A04;
    public final C9K<C04737s> A05;
    public final C9K<IW> A06;
    public final C9K<IO> A07;
    public final C9K<IN> A08;
    public final C9K<C0719Hz> A09;
    public final C9K<C0714Hu> A0A;
    public final C0792Lb A0B;
    public final JH A0C;
    public final I0 A0D;

    public C7w(C1080Wh c1080Wh, JE je, C0792Lb c0792Lb, String str) {
        this(c1080Wh, je, c0792Lb, new ArrayList(), str);
    }

    public C7w(C1080Wh c1080Wh, JE je, C0792Lb c0792Lb, String str, @Nullable Bundle bundle) {
        this(c1080Wh, je, c0792Lb, new ArrayList(), str, bundle, null);
    }

    public C7w(C1080Wh c1080Wh, JE je, C0792Lb c0792Lb, String str, @Nullable Map<String, String> extraParams) {
        this(c1080Wh, je, c0792Lb, new ArrayList(), str, null, extraParams);
    }

    public C7w(C1080Wh c1080Wh, JE je, C0792Lb c0792Lb, List<AnonymousClass20> list, String str) {
        super(c1080Wh, je, c0792Lb, list, str, !c0792Lb.A0e());
        this.A0D = new I0() { // from class: com.facebook.ads.redexgen.X.7z
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9K
            /* renamed from: A00 */
            public final void A04(IA ia) {
                C7w.this.A0a();
            }
        };
        this.A07 = new C0778Kk(this);
        this.A03 = new KY(this);
        this.A04 = new KX(this);
        this.A05 = new KV(this);
        this.A02 = new KR(this);
        this.A06 = new KO(this);
        this.A09 = new KM(this);
        this.A0A = new KK(this);
        this.A08 = new LY(this);
        this.A0C = new JH() { // from class: com.facebook.ads.redexgen.X.80
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9K
            /* renamed from: A00 */
            public final void A04(JJ jj) {
                C0792Lb c0792Lb2;
                C7w c7w = C7w.this;
                c0792Lb2 = c7w.A0B;
                c7w.A00 = c0792Lb2.getDuration();
            }
        };
        this.A01 = false;
        this.A0B = c0792Lb;
        this.A0B.getEventBus().A04(this.A0D, this.A05, this.A07, this.A04, this.A03, this.A02, this.A06, this.A09, this.A0A, this.A0C, this.A08);
    }

    public C7w(C1080Wh c1080Wh, JE je, C0792Lb c0792Lb, List<AnonymousClass20> list, String str, @Nullable Bundle bundle, @Nullable Map<String, String> map) {
        super(c1080Wh, je, c0792Lb, list, str, !c0792Lb.A0e(), bundle, map);
        this.A0D = new I0() { // from class: com.facebook.ads.redexgen.X.7z
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9K
            /* renamed from: A00 */
            public final void A04(IA ia) {
                C7w.this.A0a();
            }
        };
        this.A07 = new C0778Kk(this);
        this.A03 = new KY(this);
        this.A04 = new KX(this);
        this.A05 = new KV(this);
        this.A02 = new KR(this);
        this.A06 = new KO(this);
        this.A09 = new KM(this);
        this.A0A = new KK(this);
        this.A08 = new LY(this);
        this.A0C = new JH() { // from class: com.facebook.ads.redexgen.X.80
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9K
            /* renamed from: A00 */
            public final void A04(JJ jj) {
                C0792Lb c0792Lb2;
                C7w c7w = C7w.this;
                c0792Lb2 = c7w.A0B;
                c7w.A00 = c0792Lb2.getDuration();
            }
        };
        this.A01 = false;
        this.A0B = c0792Lb;
        this.A0B.getEventBus().A04(this.A0D, this.A05, this.A07, this.A04, this.A03, this.A02, this.A06, this.A09, this.A0A, this.A08);
    }

    public final void A0h() {
        this.A0B.getStateHandler().post(new L2(this));
    }
}