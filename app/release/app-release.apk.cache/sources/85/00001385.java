package com.facebook.ads.redexgen.X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.RelativeLayout;
import com.p7700g.p99005.sr;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Qk */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0930Qk extends AbstractC0856No {
    public RelativeLayout A00;
    public MR A01;
    public O2 A02;
    public C0890Ow A03;
    public OT A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Paint A08;
    public final Path A09;
    public final RectF A0A;
    public final C1080Wh A0B;
    public final K4 A0C;
    public final AbstractC0766Jy A0D;
    public final AbstractC0754Jk A0E;
    public final JH A0F;
    public final I0 A0G;
    public final String A0H;
    public static final int A0J = (int) (C0795Le.A01 * 1.0f);
    public static final int A0K = (int) (C0795Le.A01 * 4.0f);
    public static final int A0I = (int) (C0795Le.A01 * 6.0f);

    public abstract void A0h(C1080Wh c1080Wh);

    public AbstractC0930Qk(C0860Ns c0860Ns, boolean z, String str, C0890Ow c0890Ow) {
        super(c0860Ns, z);
        this.A09 = new Path();
        this.A0A = new RectF();
        this.A0G = new I0() { // from class: com.facebook.ads.redexgen.X.9H
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9K
            /* renamed from: A00 */
            public final void A04(IA ia) {
                C0890Ow c0890Ow2;
                c0890Ow2 = AbstractC0930Qk.this.A03;
                c0890Ow2.A0Z().setVolume(AbstractC0930Qk.this.getVideoView().getVolume());
            }
        };
        this.A0C = new K4() { // from class: com.facebook.ads.redexgen.X.8x
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9K
            /* renamed from: A00 */
            public final void A04(C7v c7v) {
                C0890Ow c0890Ow2;
                c0890Ow2 = AbstractC0930Qk.this.A03;
                c0890Ow2.A0X().ABE(((Integer) AbstractC0930Qk.this.getTag(-1593835536)).intValue());
            }
        };
        this.A0E = new AbstractC0754Jk() { // from class: com.facebook.ads.redexgen.X.8w
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9K
            /* renamed from: A00 */
            public final void A04(C0761Jt c0761Jt) {
                C0890Ow c0890Ow2;
                c0890Ow2 = AbstractC0930Qk.this.A03;
                c0890Ow2.A0Y().ABL(AbstractC0930Qk.this);
            }
        };
        this.A0D = new AbstractC0766Jy() { // from class: com.facebook.ads.redexgen.X.8v
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9K
            /* renamed from: A00 */
            public final void A04(C04747t c04747t) {
                C0890Ow c0890Ow2;
                c0890Ow2 = AbstractC0930Qk.this.A03;
                c0890Ow2.A0Y().ABK(AbstractC0930Qk.this);
            }
        };
        this.A0F = new JH() { // from class: com.facebook.ads.redexgen.X.8u
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9K
            /* renamed from: A00 */
            public final void A04(JJ jj) {
                AbstractC0930Qk.A04(AbstractC0930Qk.this, true);
                AbstractC0930Qk.A03(AbstractC0930Qk.this);
            }
        };
        this.A03 = c0890Ow;
        this.A0H = str;
        this.A0B = c0860Ns.A05();
        setGravity(17);
        int i = A0J;
        setPadding(i, 0, i, i);
        C0795Le.A0P(this, 0);
        setUpView(this.A0B);
        this.A08 = new Paint();
        this.A08.setColor(sr.t);
        this.A08.setStyle(Paint.Style.FILL);
        this.A08.setAlpha(16);
        this.A08.setAntiAlias(true);
        if (Build.VERSION.SDK_INT < 18) {
            setLayerType(1, null);
        }
    }

    public void A01() {
        if (this.A02 == null) {
            return;
        }
        if ((A0k() && this.A07) || (!A0k() && this.A06)) {
            this.A02.A8t();
        }
    }

    private void A02(View view) {
        view.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        C0795Le.A0N(view);
    }

    public static /* synthetic */ void A03(AbstractC0930Qk abstractC0930Qk) {
        abstractC0930Qk.A01();
    }

    public static /* synthetic */ boolean A04(AbstractC0930Qk abstractC0930Qk, boolean z) {
        abstractC0930Qk.A07 = z;
        return z;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0856No
    public boolean A0M() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0856No
    public final boolean A0c() {
        return false;
    }

    public final void A0e() {
        if (A0k()) {
            this.A04.A01();
        }
    }

    public final void A0f() {
        if (A0k()) {
            A0g();
            this.A04.A05(EnumC0886Os.A03);
        }
    }

    public final void A0g() {
        float volume = this.A03.A0Z().getVolume();
        if (A0k() && volume != this.A04.getVolume()) {
            this.A04.setVolume(volume);
        }
    }

    public final void A0i(Map<String, String> map) {
        this.A04.A02();
        if (A0k()) {
            this.A04.A04(getAdEventManager(), this.A0H, map);
        }
    }

    public final boolean A0j() {
        return A0k() && this.A04.A06();
    }

    public final boolean A0k() {
        return this.A05;
    }

    public final RelativeLayout getMediaContainer() {
        return this.A00;
    }

    public final OT getVideoView() {
        return this.A04;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.A09.reset();
        this.A0A.set(0.0f, 0.0f, getWidth(), getHeight());
        Path path = this.A09;
        RectF rectF = this.A0A;
        int i = A0I;
        path.addRoundRect(rectF, i, i, Path.Direction.CW);
        canvas.drawPath(this.A09, this.A08);
        this.A0A.set(A0J, 0.0f, getWidth() - A0J, getHeight() - A0J);
        Path path2 = this.A09;
        RectF rectF2 = this.A0A;
        int i2 = A0K;
        path2.addRoundRect(rectF2, i2, i2, Path.Direction.CW);
        canvas.clipPath(this.A09);
        super.onDraw(canvas);
    }

    public void setAdTitleAndDescription(String str, String str2) {
        getTitleDescContainer().A02(str, str2, null, true, false);
    }

    public void setCTAInfo(C1I c1i, Map<String, String> map) {
        getCtaButton().setCta(c1i, this.A0H, map);
    }

    public void setImageUrl(String str) {
        this.A01.setVisibility(0);
        this.A04.setVisibility(8);
        new AsyncTaskC1091Ws(this.A01, this.A0B).A05().A07(new C0931Ql(this)).A08(str);
    }

    public void setIsVideo(boolean z) {
        this.A05 = z;
    }

    public void setOnAssetsLoadedListener(O2 o2) {
        this.A02 = o2;
    }

    public void setUpImageView(C1080Wh c1080Wh) {
        this.A01 = new MR(c1080Wh);
        A02(this.A01);
    }

    public void setUpMediaContainer(C1080Wh c1080Wh) {
        this.A00 = new RelativeLayout(c1080Wh);
        A02(this.A00);
    }

    public void setUpVideoView(C1080Wh c1080Wh) {
        this.A04 = new OT(c1080Wh, new JL(this.A0H, getAdEventManager()));
        A02(this.A04);
    }

    private void setUpView(C1080Wh c1080Wh) {
        setUpImageView(c1080Wh);
        setUpVideoView(c1080Wh);
        setUpMediaContainer(c1080Wh);
        this.A00.addView(this.A01);
        this.A00.addView(this.A04);
        A0h(c1080Wh);
    }

    public void setVideoPlaceholderUrl(String str) {
        this.A04.setPlaceholderUrl(str);
    }

    public void setVideoUrl(String str) {
        this.A01.setVisibility(8);
        this.A04.setVisibility(0);
        this.A04.setVideoURI(str);
        this.A04.A03(this.A0G);
        this.A04.A03(this.A0C);
        this.A04.A03(this.A0E);
        this.A04.A03(this.A0D);
        this.A04.A03(this.A0F);
    }
}