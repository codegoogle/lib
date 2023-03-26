package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.anythink.core.common.e.i;
import com.anythink.core.common.e.j;
import com.anythink.core.common.j.e;
import com.anythink.core.common.j.h;

/* loaded from: classes2.dex */
public class HalfScreenAdView extends BaseScreenAdView {
    public static final String TAG = HalfScreenAdView.class.getSimpleName();
    private int S;
    private RelativeLayout T;

    public HalfScreenAdView(Context context) {
        super(context);
    }

    private void E() {
        if (this.O <= this.P) {
            this.S = 3;
            e.b(TAG, "setLayoutType: vertical");
            return;
        }
        this.S = 4;
        e.b(TAG, "setLayoutType: horizontal");
    }

    private void F() {
        int i;
        int i2;
        int i3;
        int i4;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.y.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.w.getLayoutParams();
        int i5 = layoutParams2.leftMargin;
        int i6 = layoutParams2.rightMargin;
        int i7 = layoutParams2.topMargin;
        int i8 = layoutParams2.bottomMargin;
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.x.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.T.getLayoutParams();
        int b = h.b(getContext());
        if (b <= 0) {
            b = h.a(getContext(), 25.0f);
        }
        if (this.S == 3) {
            if (this.b == 1) {
                e.b(TAG, "onBeforeInitPlayer: vertical - portrait screen");
                i2 = (this.C - i5) - i6;
                i = (int) (i2 / 1.0766667f);
                this.L = i;
                int i9 = (int) (i * 0.5625f);
                this.K = i9;
                i4 = i2 - i9;
            } else {
                e.b(TAG, "onBeforeInitPlayer: vertical - landscape screen");
                if (i7 < b) {
                    i7 = (int) (b * 1.1f);
                    layoutParams2.topMargin = i7;
                }
                i = (((this.D - i7) - i8) - ((RelativeLayout.LayoutParams) this.G.getLayoutParams()).height) - layoutParams4.topMargin;
                int i10 = (int) (i * 1.0711864f);
                this.L = i;
                int i11 = (int) (i * 0.5625f);
                this.K = i11;
                i4 = i10 - i11;
                layoutParams2.width = i10;
                this.w.setLayoutParams(layoutParams2);
                i2 = i10;
            }
            i3 = i;
        } else {
            if (this.b == 1) {
                e.b(TAG, "onBeforeInitPlayer: horizontal - portrait screen");
                View findViewById = this.y.findViewById(h.a(getContext(), "myoffer_panel_view_blank", "id"));
                int i12 = findViewById != null ? ((RelativeLayout.LayoutParams) findViewById.getLayoutParams()).topMargin : 0;
                i2 = (this.C - i5) - i6;
                i = (int) (i2 / 0.8298429f);
                this.K = i2;
                int i13 = (int) (i2 / 1.7777778f);
                this.L = i13;
                i3 = (i - i13) + i12;
            } else {
                e.b(TAG, "onBeforeInitPlayer: horizontal - landscape screen");
                if (i7 < b) {
                    i7 = (int) (b * 1.1f);
                    layoutParams2.topMargin = i7;
                }
                i = (((this.D - i7) - i8) - ((RelativeLayout.LayoutParams) this.G.getLayoutParams()).height) - layoutParams4.topMargin;
                int i14 = (int) (i * 1.0336701f);
                this.K = i14;
                int i15 = (int) (i14 / 1.7777778f);
                this.L = i15;
                layoutParams2.width = i14;
                this.w.setLayoutParams(layoutParams2);
                i2 = i14;
                i3 = i - i15;
            }
            i4 = i2;
        }
        layoutParams4.width = i2;
        layoutParams4.height = i;
        this.T.setLayoutParams(layoutParams4);
        layoutParams3.width = this.K;
        layoutParams3.height = this.L;
        this.x.setLayoutParams(layoutParams3);
        layoutParams.width = i4;
        layoutParams.height = i3;
        this.y.setLayoutParams(layoutParams);
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView
    public final void A() {
        RelativeLayout.LayoutParams layoutParams;
        FeedbackButton feedbackButton = this.H;
        if (feedbackButton == null || !feedbackButton.isShown() || (layoutParams = (RelativeLayout.LayoutParams) this.H.getLayoutParams()) == null) {
            return;
        }
        layoutParams.rightMargin = h.a(getContext(), 40.0f);
        this.H.setLayoutParams(layoutParams);
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView
    public final void B() {
        if (this.T == null || this.z == null) {
            return;
        }
        if (this.S != 4) {
            this.T.addView(this.z, 2, this.x.getLayoutParams());
            return;
        }
        this.T.addView(this.z, 1, this.x.getLayoutParams());
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView
    public final void C() {
        PlayerView playerView = this.x;
        if (playerView != null) {
            this.T.removeView(playerView);
            this.x = null;
        }
        CountDownView countDownView = this.F;
        if (countDownView != null) {
            countDownView.setVisibility(4);
        }
        MuteImageView muteImageView = this.I;
        if (muteImageView != null) {
            muteImageView.setVisibility(4);
        }
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView
    public final void D() {
        int i;
        int i2;
        int i3;
        int i4;
        try {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.y.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.w.getLayoutParams();
            int i5 = layoutParams2.leftMargin;
            int i6 = layoutParams2.rightMargin;
            int i7 = layoutParams2.topMargin;
            int i8 = layoutParams2.bottomMargin;
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.x.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.T.getLayoutParams();
            int b = h.b(getContext());
            if (b <= 0) {
                b = h.a(getContext(), 25.0f);
            }
            if (this.S == 3) {
                if (this.b == 1) {
                    e.b(TAG, "onBeforeInitPlayer: vertical - portrait screen");
                    i2 = (this.C - i5) - i6;
                    i = (int) (i2 / 1.0766667f);
                    this.L = i;
                    int i9 = (int) (i * 0.5625f);
                    this.K = i9;
                    i4 = i2 - i9;
                } else {
                    e.b(TAG, "onBeforeInitPlayer: vertical - landscape screen");
                    if (i7 < b) {
                        i7 = (int) (b * 1.1f);
                        layoutParams2.topMargin = i7;
                    }
                    i = (((this.D - i7) - i8) - ((RelativeLayout.LayoutParams) this.G.getLayoutParams()).height) - layoutParams4.topMargin;
                    int i10 = (int) (i * 1.0711864f);
                    this.L = i;
                    int i11 = (int) (i * 0.5625f);
                    this.K = i11;
                    i4 = i10 - i11;
                    layoutParams2.width = i10;
                    this.w.setLayoutParams(layoutParams2);
                    i2 = i10;
                }
                i3 = i;
            } else {
                if (this.b == 1) {
                    e.b(TAG, "onBeforeInitPlayer: horizontal - portrait screen");
                    View findViewById = this.y.findViewById(h.a(getContext(), "myoffer_panel_view_blank", "id"));
                    int i12 = findViewById != null ? ((RelativeLayout.LayoutParams) findViewById.getLayoutParams()).topMargin : 0;
                    i2 = (this.C - i5) - i6;
                    i = (int) (i2 / 0.8298429f);
                    this.K = i2;
                    int i13 = (int) (i2 / 1.7777778f);
                    this.L = i13;
                    i3 = (i - i13) + i12;
                } else {
                    e.b(TAG, "onBeforeInitPlayer: horizontal - landscape screen");
                    if (i7 < b) {
                        i7 = (int) (b * 1.1f);
                        layoutParams2.topMargin = i7;
                    }
                    i = (((this.D - i7) - i8) - ((RelativeLayout.LayoutParams) this.G.getLayoutParams()).height) - layoutParams4.topMargin;
                    int i14 = (int) (i * 1.0336701f);
                    this.K = i14;
                    int i15 = (int) (i14 / 1.7777778f);
                    this.L = i15;
                    layoutParams2.width = i14;
                    this.w.setLayoutParams(layoutParams2);
                    i2 = i14;
                    i3 = i - i15;
                }
                i4 = i2;
            }
            layoutParams4.width = i2;
            layoutParams4.height = i;
            this.T.setLayoutParams(layoutParams4);
            layoutParams3.width = this.K;
            layoutParams3.height = this.L;
            this.x.setLayoutParams(layoutParams3);
            layoutParams.width = i4;
            layoutParams.height = i3;
            this.y.setLayoutParams(layoutParams);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView, com.anythink.basead.ui.BaseAdView
    public final void a() {
        if (this.S != 4) {
            LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_half_screen_vertical", "layout"), this);
        } else {
            LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_half_screen_horizontal", "layout"), this);
        }
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView
    public final void c() {
        super.c();
        this.T = (RelativeLayout) this.w.findViewById(h.a(getContext(), "myoffer_rl_container", "id"));
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView
    public final boolean c(int i) {
        return true;
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView, com.anythink.basead.ui.BaseAdView
    public final void e() {
        super.e();
        if (this.O <= this.P) {
            this.S = 3;
            e.b(TAG, "setLayoutType: vertical");
            return;
        }
        this.S = 4;
        e.b(TAG, "setLayoutType: horizontal");
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView
    public final int m() {
        return this.M;
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView
    public final void q() {
        PanelView panelView = this.y;
        if (panelView != null) {
            if (this.S == 3) {
                this.M = 3;
            } else {
                this.M = 4;
            }
            panelView.setForceShowDetailInfoIfExist(true);
            this.y.setLayoutType(this.M);
        }
        super.y();
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView
    public final void r() {
        CountDownView countDownView = this.F;
        if (countDownView != null) {
            countDownView.setBgColor(0);
            this.F.setUnderRingColor(Color.parseColor("#cdcdcd"));
            this.F.setThickInPx(h.a(getContext(), 1.0f));
        }
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView
    public final void s() {
        super.u();
        super.v();
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView
    public final void t() {
        CloseImageView closeImageView = this.G;
        if (closeImageView != null) {
            closeImageView.setType(1);
        }
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView
    public final void w() {
        RelativeLayout.LayoutParams layoutParams;
        FeedbackButton feedbackButton = this.H;
        if (feedbackButton != null) {
            feedbackButton.setType(1);
            if (this.J <= 0 || (layoutParams = (RelativeLayout.LayoutParams) this.H.getLayoutParams()) == null) {
                return;
            }
            layoutParams.rightMargin = 0;
            this.H.setLayoutParams(layoutParams);
        }
    }

    public HalfScreenAdView(Context context, j jVar, i iVar, String str, int i, int i2) {
        super(context, jVar, iVar, str, i, i2);
        setId(h.a(getContext(), "myoffer_half_screen_view_id", "id"));
        this.E = 1;
    }
}