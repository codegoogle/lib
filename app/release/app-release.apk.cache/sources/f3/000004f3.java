package com.anythink.basead.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import com.anythink.core.common.e.i;
import com.anythink.core.common.e.j;
import com.anythink.core.common.e.x;
import com.anythink.core.common.j.h;

/* loaded from: classes2.dex */
public class FullScreenAdView extends BaseScreenAdView {
    public static final String TAG = FullScreenAdView.class.getSimpleName();

    public FullScreenAdView(Context context) {
        super(context);
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView
    public final void A() {
        RelativeLayout.LayoutParams layoutParams;
        FeedbackButton feedbackButton = this.H;
        if (feedbackButton == null || !feedbackButton.isShown() || (layoutParams = (RelativeLayout.LayoutParams) this.H.getLayoutParams()) == null) {
            return;
        }
        layoutParams.rightMargin = h.a(getContext(), 70.0f);
        this.H.setLayoutParams(layoutParams);
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView
    public final void B() {
        if (this.w == null || this.z == null) {
            return;
        }
        this.z.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        if (c(this.M)) {
            int i = this.M;
            if (i == 0) {
                this.y.updateForceShowDetailInfoIfExist(true);
            } else if (i == 1) {
                this.y.updateForceShowDetailInfoIfExist(true);
                this.w.setBackgroundColor(-1);
                int i2 = (int) (((this.C * 1.0f) / this.Q) * this.R);
                int i3 = this.D - i2;
                this.z.setLayoutParams(new RelativeLayout.LayoutParams(-1, i2));
                this.z.setNeedArc(true);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.y.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = this.C;
                    layoutParams.height = i3;
                    layoutParams.leftMargin = 0;
                    layoutParams.rightMargin = 0;
                    layoutParams.bottomMargin = 0;
                    layoutParams.topMargin = i2;
                    this.y.setLayoutParams(layoutParams);
                    this.y.removeAllViews();
                    this.y.setLayoutType(1);
                }
            } else if (i == 2) {
                this.y.updateForceShowDetailInfoIfExist(true);
                int i4 = (int) (((this.Q * 1.0f) / this.R) * this.D);
                int i5 = this.C - i4;
                this.z.setLayoutParams(new RelativeLayout.LayoutParams(i4, this.D));
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.y.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.width = i5;
                    layoutParams2.height = this.D;
                    layoutParams2.leftMargin = 0;
                    layoutParams2.rightMargin = 0;
                    layoutParams2.bottomMargin = 0;
                    layoutParams2.addRule(1, this.z.getId());
                    this.y.setLayoutParams(layoutParams2);
                    this.y.removeAllViews();
                    this.y.setLayoutType(2);
                }
            }
        }
        this.w.addView(this.z, 3);
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView
    public final void C() {
        PlayerView playerView = this.x;
        if (playerView != null) {
            this.w.removeView(playerView);
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
        this.K = this.C;
        this.L = this.D;
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView, com.anythink.basead.ui.BaseAdView
    public final void a() {
        LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_full_screen", "layout"), this);
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView
    public final boolean c(int i) {
        if (i != 0) {
            if (i != 1 && i != 2) {
                return true;
            }
        } else if (TextUtils.isEmpty(this.f.m())) {
            return false;
        } else {
            i iVar = this.f;
            if ((iVar instanceof x) && 2 == iVar.x()) {
                return 3 == ((x) this.f).R();
            }
        }
        i iVar2 = this.f;
        return (TextUtils.isEmpty(iVar2.o()) && TextUtils.isEmpty(iVar2.m()) && TextUtils.isEmpty(iVar2.n())) ? false : true;
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView
    public final int m() {
        return this.C < this.D ? this.Q >= this.R ? 1 : 0 : this.Q < this.R ? 2 : 0;
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView
    public final void q() {
        PanelView panelView = this.y;
        if (panelView != null) {
            this.M = 0;
            panelView.setLayoutType(0);
        }
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView
    public final void s() {
        if (this.c) {
            v();
        } else if (1 == ((BaseScreenAdView) this).a && !this.v) {
            double ceil = Math.ceil(this.e.m.e() / 1000.0d);
            PlayerView playerView = this.x;
            if (playerView != null) {
                double ceil2 = Math.ceil(playerView.getVideoLength() / 1000.0d);
                if (ceil > ceil2) {
                    ceil = ceil2;
                }
            }
            RewardExitConfirmDialogActivity.a(getContext(), String.valueOf((int) ceil), new Runnable() { // from class: com.anythink.basead.ui.FullScreenAdView.1
                @Override // java.lang.Runnable
                public final void run() {
                    FullScreenAdView.this.u();
                    FullScreenAdView.this.v();
                }
            });
        } else {
            u();
            d();
        }
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView
    public final void t() {
        CloseImageView closeImageView = this.G;
        if (closeImageView != null) {
            closeImageView.setType(0);
        }
    }

    @Override // com.anythink.basead.ui.BaseScreenAdView
    public final void w() {
        RelativeLayout.LayoutParams layoutParams;
        FeedbackButton feedbackButton = this.H;
        if (feedbackButton == null || this.J <= 0 || (layoutParams = (RelativeLayout.LayoutParams) feedbackButton.getLayoutParams()) == null) {
            return;
        }
        layoutParams.rightMargin = h.a(getContext(), 19.0f);
        this.H.setLayoutParams(layoutParams);
    }

    public FullScreenAdView(Context context, j jVar, i iVar, String str, int i, int i2) {
        super(context, jVar, iVar, str, i, i2);
        setId(h.a(getContext(), "myoffer_full_screen_view_id", "id"));
        this.E = 0;
    }
}