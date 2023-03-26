package com.anythink.expressad.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.anythink.expressad.atsignalcommon.windvane.j;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.h.g;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.s;
import com.anythink.expressad.foundation.h.w;
import com.anythink.expressad.video.module.a.a;
import com.anythink.expressad.video.module.a.a.i;
import com.anythink.expressad.video.module.a.a.l;
import com.anythink.expressad.video.signal.e;
import com.anythink.expressad.video.signal.factory.b;
import com.anythink.expressad.video.signal.h;

/* loaded from: classes2.dex */
public class AnythinkContainerView extends AnythinkBaseView implements e, h {
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private int G;
    private boolean H;
    private int I;
    private int J;
    private int K;
    private int L;
    private int M;
    private String N;
    private b O;
    private boolean P;
    private boolean Q;
    private AnythinkPlayableView m;
    private AnythinkClickCTAView n;
    private AnythinkClickMiniCardView o;
    private AnythinkNativeEndCardView p;
    private AnythinkH5EndCardView q;
    private AnythinkVideoEndCoverView r;
    private AnythinkVastEndCardView s;
    private AnythinkLandingPageView t;
    private AnythinkAlertWebview u;
    private String v;
    private int w;
    private int x;
    private int y;
    private int z;

    /* renamed from: com.anythink.expressad.video.module.AnythinkContainerView$3  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass3 extends i {
        public AnonymousClass3(a aVar) {
            super(aVar);
        }

        @Override // com.anythink.expressad.video.module.a.a.i, com.anythink.expressad.video.module.a.a.f, com.anythink.expressad.video.module.a.a
        public final void a(int i, Object obj) {
            super.a(i, obj);
            if (i == 100) {
                AnythinkContainerView.this.webviewshow();
                AnythinkContainerView anythinkContainerView = AnythinkContainerView.this;
                anythinkContainerView.onConfigurationChanged(anythinkContainerView.getResources().getConfiguration());
            }
        }
    }

    public AnythinkContainerView(Context context) {
        super(context);
        this.x = 1;
        this.y = 1;
        this.z = 1;
        this.A = false;
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = true;
        this.F = false;
        this.H = false;
        this.P = false;
        this.Q = false;
    }

    private void b() {
        setWrapContent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(12, -1);
        }
    }

    private void e() {
        c cVar = this.b_;
        if (cVar != null) {
            boolean j = cVar.j();
            boolean f = s.f(this.b_.G());
            if (j && !f) {
                i();
                return;
            }
        }
        if (this.x == 2 && !this.H) {
            h();
        } else {
            i();
        }
    }

    private void f() {
        if (this.s == null) {
            a(this.O, (Integer) 3);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        addView(this.s, layoutParams);
        this.s.notifyShowListener();
    }

    private void g() {
        if (this.t == null) {
            a(this.O, (Integer) 4);
        }
        this.t.preLoadData(this.O);
        addView(this.t);
    }

    private void h() {
        if (this.q == null) {
            a(this.O, (Integer) 2);
        }
        AnythinkH5EndCardView anythinkH5EndCardView = this.q;
        if (anythinkH5EndCardView != null && anythinkH5EndCardView.isLoadSuccess()) {
            this.H = true;
            addView(this.q);
            webviewshow();
            onConfigurationChanged(getResources().getConfiguration());
            this.q.excuteTask();
            this.q.setNotchValue(this.N, this.I, this.J, this.K, this.L);
        } else {
            i();
            AnythinkH5EndCardView anythinkH5EndCardView2 = this.q;
            if (anythinkH5EndCardView2 != null) {
                anythinkH5EndCardView2.reportRenderResult("timeout", 3);
                this.q.setError(true);
            }
        }
        AnythinkH5EndCardView anythinkH5EndCardView3 = this.q;
        if (anythinkH5EndCardView3 != null) {
            anythinkH5EndCardView3.setUnitId(this.v);
        }
    }

    private void i() {
        this.x = 1;
        if (this.p == null) {
            a(this.O, (Integer) 2);
        }
        addView(this.p);
        onConfigurationChanged(getResources().getConfiguration());
        this.p.notifyShowListener();
        this.Q = true;
        bringToFront();
    }

    private void j() {
        AnythinkVideoEndCoverView anythinkVideoEndCoverView = this.r;
        if (anythinkVideoEndCoverView == null) {
            b bVar = this.O;
            this.O = bVar;
            if (anythinkVideoEndCoverView == null) {
                AnythinkVideoEndCoverView anythinkVideoEndCoverView2 = new AnythinkVideoEndCoverView(this.a_);
                this.r = anythinkVideoEndCoverView2;
                anythinkVideoEndCoverView2.setCampaign(this.b_);
                this.r.setNotifyListener(new i(this.e_));
                this.r.preLoadData(bVar);
            }
        }
        addView(this.r);
        onConfigurationChanged(getResources().getConfiguration());
        this.Q = true;
        bringToFront();
    }

    private void k() {
        if (this.m == null) {
            preLoadData(this.O);
        }
        addView(this.m);
        AnythinkPlayableView anythinkPlayableView = this.m;
        if (anythinkPlayableView != null) {
            anythinkPlayableView.setUnitId(this.v);
            c cVar = this.b_;
            if (cVar != null && cVar.F() && this.b_.H() == 2) {
                this.m.setCloseVisible(0);
            }
            this.m.setNotchValue(this.N, this.I, this.J, this.K, this.L);
        }
    }

    private void l() {
        if (this.n == null) {
            b(-1);
        }
        if (this.n != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(12, -1);
            addView(this.n, 0, layoutParams);
        }
    }

    private void m() {
        if (this.o == null) {
            b(-2);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        if (this.C && this.E) {
            this.E = false;
            layoutParams.width = 1;
            layoutParams.height = 1;
        }
        addView(this.o, layoutParams);
    }

    private void n() {
        if (this.u == null) {
            o();
        }
        AnythinkAlertWebview anythinkAlertWebview = this.u;
        if (anythinkAlertWebview != null && anythinkAlertWebview.getParent() != null) {
            removeView(this.u);
        }
        addView(this.u);
    }

    private void o() {
        if (this.u == null) {
            AnythinkAlertWebview anythinkAlertWebview = new AnythinkAlertWebview(this.a_);
            this.u = anythinkAlertWebview;
            anythinkAlertWebview.setUnitId(this.v);
            this.u.setCampaign(this.b_);
        }
        this.u.preLoadData(this.O);
    }

    private void p() {
        this.B = false;
        this.Q = false;
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            int i = 0;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof AnythinkContainerView) {
                    i++;
                } else {
                    viewGroup.bringChildToFront(childAt);
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (view != null) {
            a(view);
            super.addView(view);
            return;
        }
        n.d(AnythinkBaseView.TAG, "view is null");
    }

    public boolean canBackPress() {
        if (this.p != null) {
            return false;
        }
        AnythinkH5EndCardView anythinkH5EndCardView = this.q;
        if (anythinkH5EndCardView != null) {
            return anythinkH5EndCardView.canBackPress();
        }
        AnythinkLandingPageView anythinkLandingPageView = this.t;
        if (anythinkLandingPageView != null) {
            return anythinkLandingPageView.canBackPress();
        }
        AnythinkPlayableView anythinkPlayableView = this.m;
        if (anythinkPlayableView != null) {
            return anythinkPlayableView.canBackPress();
        }
        return false;
    }

    @Override // com.anythink.expressad.video.signal.e
    public void configurationChanged(int i, int i2, int i3) {
        AnythinkClickMiniCardView anythinkClickMiniCardView = this.o;
        if (anythinkClickMiniCardView == null || anythinkClickMiniCardView.getVisibility() != 0) {
            return;
        }
        this.o.resizeMiniCard(i, i2);
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void defaultShow() {
        super.defaultShow();
    }

    @Override // com.anythink.expressad.video.signal.e
    public boolean endCardShowing() {
        return this.A;
    }

    public boolean endcardIsPlayable() {
        AnythinkH5EndCardView anythinkH5EndCardView = this.q;
        return anythinkH5EndCardView != null && anythinkH5EndCardView.isPlayable();
    }

    public AnythinkH5EndCardView getH5EndCardView() {
        AnythinkH5EndCardView anythinkH5EndCardView = this.q;
        return anythinkH5EndCardView == null ? this.m : anythinkH5EndCardView;
    }

    public boolean getShowingTransparent() {
        return this.C;
    }

    public String getUnitID() {
        return this.v;
    }

    public int getVideoInteractiveType() {
        return this.w;
    }

    public int getVideoSkipTime() {
        return this.G;
    }

    @Override // com.anythink.expressad.video.signal.e, com.anythink.expressad.video.signal.h
    public void handlerPlayableException(String str) {
        AnythinkH5EndCardView anythinkH5EndCardView = this.q;
        if (anythinkH5EndCardView != null) {
            anythinkH5EndCardView.handlerPlayableException(str);
            if (!this.H) {
                return;
            }
        }
        e();
    }

    @Override // com.anythink.expressad.video.signal.e
    public void hideAlertWebview() {
        if (isLast()) {
            return;
        }
        if (this.P && !this.Q) {
            p();
            this.P = false;
        }
        AnythinkAlertWebview anythinkAlertWebview = this.u;
        if (anythinkAlertWebview == null || anythinkAlertWebview.getParent() == null) {
            return;
        }
        removeView(this.u);
        AnythinkClickCTAView anythinkClickCTAView = this.n;
        if (anythinkClickCTAView == null || anythinkClickCTAView.getParent() == null) {
            return;
        }
        setWrapContent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(12, -1);
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void init(Context context) {
        setVisibility(0);
    }

    @Override // com.anythink.expressad.video.signal.h
    public void install(c cVar) {
        this.e_.a(105, cVar);
    }

    public boolean isLast() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        return viewGroup != null && viewGroup.indexOfChild(this) == 0;
    }

    @Override // com.anythink.expressad.video.signal.e
    public void ivRewardAdsWithoutVideo(String str) {
        this.e_.a(103, str);
    }

    @Override // com.anythink.expressad.video.signal.e
    public boolean miniCardLoaded() {
        AnythinkClickMiniCardView anythinkClickMiniCardView = this.o;
        return anythinkClickMiniCardView != null && anythinkClickMiniCardView.isLoadSuccess();
    }

    @Override // com.anythink.expressad.video.signal.e
    public boolean miniCardShowing() {
        return this.B;
    }

    @Override // com.anythink.expressad.video.signal.h
    public void notifyCloseBtn(int i) {
        AnythinkPlayableView anythinkPlayableView = this.m;
        if (anythinkPlayableView != null) {
            anythinkPlayableView.notifyCloseBtn(i);
        }
        AnythinkH5EndCardView anythinkH5EndCardView = this.q;
        if (anythinkH5EndCardView != null) {
            anythinkH5EndCardView.notifyCloseBtn(i);
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AnythinkBaseView[] anythinkBaseViewArr = {this.m, this.n, this.o, this.p, this.q, this.s, this.t, this.r};
        for (int i = 0; i < 8; i++) {
            AnythinkBaseView anythinkBaseView = anythinkBaseViewArr[i];
            if (anythinkBaseView != null && (anythinkBaseView instanceof AnythinkClickMiniCardView)) {
                anythinkBaseView.onSelfConfigurationChanged(configuration);
            } else if (anythinkBaseView != null && anythinkBaseView.getVisibility() == 0 && anythinkBaseView.getParent() != null && !isLast()) {
                anythinkBaseView.onSelfConfigurationChanged(configuration);
            }
        }
    }

    public void onEndcardBackPress() {
        if (this.p == null && this.s == null) {
            if (this.t != null) {
                this.e_.a(103, "");
                return;
            }
            AnythinkH5EndCardView anythinkH5EndCardView = this.q;
            if (anythinkH5EndCardView != null) {
                anythinkH5EndCardView.onBackPress();
                return;
            }
            return;
        }
        this.e_.a(104, "");
    }

    public void onMiniEndcardBackPress() {
        if (this.B) {
            this.e_.a(107, "");
        }
    }

    public void onPlayableBackPress() {
        AnythinkPlayableView anythinkPlayableView = this.m;
        if (anythinkPlayableView != null) {
            anythinkPlayableView.onBackPress();
        }
    }

    @Override // com.anythink.expressad.video.signal.h
    public void orientation(Configuration configuration) {
        AnythinkH5EndCardView[] anythinkH5EndCardViewArr = {this.m, this.o, this.q, this.u};
        for (int i = 0; i < 4; i++) {
            AnythinkH5EndCardView anythinkH5EndCardView = anythinkH5EndCardViewArr[i];
            if (anythinkH5EndCardView != null && anythinkH5EndCardView.getVisibility() == 0) {
                anythinkH5EndCardView.orientation(getResources().getConfiguration());
            }
        }
    }

    @Override // com.anythink.expressad.video.signal.f
    public void preLoadData(final b bVar) {
        this.O = bVar;
        c cVar = this.b_;
        if (cVar != null) {
            if (cVar.H() == 2) {
                if (this.m == null) {
                    this.m = new AnythinkPlayableView(this.a_);
                }
                this.m.setCloseDelayShowTime(this.y);
                this.m.setPlayCloseBtnTm(this.z);
                this.m.setCampaign(this.b_);
                this.m.setNotifyListener(new AnonymousClass3(this.e_));
                this.m.preLoadData(bVar);
            } else {
                b(this.w);
                if (this.b_.j()) {
                    try {
                        a(bVar, Integer.valueOf(this.b_.D()));
                    } catch (Throwable th) {
                        n.d(AnythinkBaseView.TAG, th.getMessage());
                        new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new Runnable() { // from class: com.anythink.expressad.video.module.AnythinkContainerView.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                AnythinkContainerView anythinkContainerView = AnythinkContainerView.this;
                                anythinkContainerView.a(bVar, Integer.valueOf(anythinkContainerView.b_.D()));
                            }
                        });
                    }
                    s.f(this.b_.G());
                } else {
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.anythink.expressad.video.module.AnythinkContainerView.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            AnythinkContainerView anythinkContainerView = AnythinkContainerView.this;
                            anythinkContainerView.a(bVar, Integer.valueOf(anythinkContainerView.b_.D()));
                        }
                    }, getVideoSkipTime());
                }
            }
            o();
        }
    }

    @Override // com.anythink.expressad.video.signal.e, com.anythink.expressad.video.signal.h
    public void readyStatus(int i) {
        AnythinkH5EndCardView anythinkH5EndCardView = this.q;
        if (anythinkH5EndCardView != null) {
            anythinkH5EndCardView.readyStatus(i);
        }
    }

    public void release() {
        AnythinkH5EndCardView anythinkH5EndCardView = this.q;
        if (anythinkH5EndCardView != null) {
            anythinkH5EndCardView.release();
            this.q = null;
        }
        AnythinkPlayableView anythinkPlayableView = this.m;
        if (anythinkPlayableView != null) {
            anythinkPlayableView.release();
        }
        AnythinkLandingPageView anythinkLandingPageView = this.t;
        if (anythinkLandingPageView != null) {
            anythinkLandingPageView.release();
        }
        AnythinkNativeEndCardView anythinkNativeEndCardView = this.p;
        if (anythinkNativeEndCardView != null) {
            anythinkNativeEndCardView.clearMoreOfferBitmap();
        }
        if (this.e_ != null) {
            this.e_ = null;
        }
    }

    @Override // com.anythink.expressad.video.signal.e
    public void resizeMiniCard(int i, int i2, int i3) {
        AnythinkClickMiniCardView anythinkClickMiniCardView = this.o;
        if (anythinkClickMiniCardView != null) {
            anythinkClickMiniCardView.resizeMiniCard(i, i2);
            this.o.setRadius(i3);
            removeAllViews();
            setMatchParent();
            this.Q = true;
            bringToFront();
            m();
        }
    }

    public void setAnythinkClickMiniCardViewTransparent() {
        AnythinkClickMiniCardView anythinkClickMiniCardView = this.o;
        if (anythinkClickMiniCardView != null) {
            anythinkClickMiniCardView.setAnythinkClickMiniCardViewTransparent();
            this.o.setAnythinkClickMiniCardViewClickable(false);
        }
    }

    public void setCloseDelayTime(int i) {
        this.y = i;
    }

    public void setEndscreenType(int i) {
        this.x = i;
    }

    public void setJSFactory(b bVar) {
        this.O = bVar;
    }

    public void setNotchPadding(int i, int i2, int i3, int i4, int i5) {
        n.d(AnythinkBaseView.TAG, "NOTCH ContainerView " + String.format("%1s-%2s-%3s-%4s-%5s", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i)));
        this.M = i;
        this.I = i2;
        this.J = i3;
        this.K = i4;
        this.L = i5;
        this.N = g.a(i, i2, i3, i4, i5);
        AnythinkNativeEndCardView anythinkNativeEndCardView = this.p;
        if (anythinkNativeEndCardView != null) {
            anythinkNativeEndCardView.setNotchPadding(i2, i3, i4, i5);
        }
        AnythinkH5EndCardView anythinkH5EndCardView = this.q;
        if (anythinkH5EndCardView != null && anythinkH5EndCardView.r != null) {
            anythinkH5EndCardView.setNotchValue(this.N, i2, i3, i4, i5);
            j.a();
            j.a((WebView) this.q.r, "oncutoutfetched", Base64.encodeToString(this.N.getBytes(), 0));
        }
        AnythinkPlayableView anythinkPlayableView = this.m;
        if (anythinkPlayableView == null || anythinkPlayableView.r == null) {
            return;
        }
        anythinkPlayableView.setNotchValue(this.N, i2, i3, i4, i5);
        j.a();
        j.a((WebView) this.m.r, "oncutoutfetched", Base64.encodeToString(this.N.getBytes(), 0));
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void setNotifyListener(a aVar) {
        super.setNotifyListener(aVar);
        AnythinkBaseView[] anythinkBaseViewArr = {this.m, this.n, this.o, this.p, this.q, this.s, this.t, this.r};
        for (int i = 0; i < 8; i++) {
            AnythinkBaseView anythinkBaseView = anythinkBaseViewArr[i];
            if (anythinkBaseView != null) {
                if (anythinkBaseView instanceof AnythinkClickMiniCardView) {
                    anythinkBaseView.setNotifyListener(new com.anythink.expressad.video.module.a.a.g(this.o, aVar));
                } else {
                    anythinkBaseView.setNotifyListener(new i(aVar));
                }
            }
        }
    }

    public void setOnPause() {
        AnythinkNativeEndCardView anythinkNativeEndCardView = this.p;
        if (anythinkNativeEndCardView != null) {
            anythinkNativeEndCardView.setOnPause();
        }
    }

    public void setOnResume() {
        AnythinkNativeEndCardView anythinkNativeEndCardView = this.p;
        if (anythinkNativeEndCardView != null) {
            anythinkNativeEndCardView.setOnResume();
        }
    }

    public void setPlayCloseBtnTm(int i) {
        this.z = i;
    }

    public void setShowingTransparent(boolean z) {
        this.C = z;
    }

    public void setUnitID(String str) {
        this.v = str;
    }

    public void setVideoInteractiveType(int i) {
        c cVar = this.b_;
        if (cVar != null && cVar.j()) {
            int a = com.anythink.expressad.video.dynview.h.c.a(this.b_);
            if (a == 100) {
                this.w = i;
                return;
            } else {
                this.w = a;
                return;
            }
        }
        this.w = i;
    }

    public void setVideoSkipTime(int i) {
        this.G = i;
    }

    @Override // com.anythink.expressad.video.signal.e
    public boolean showAlertWebView() {
        AnythinkAlertWebview anythinkAlertWebview = this.u;
        if (anythinkAlertWebview == null || !anythinkAlertWebview.isLoadSuccess()) {
            return false;
        }
        setMatchParent();
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (!(viewGroup.indexOfChild(this) == viewGroup.getChildCount() - 1) && !this.Q) {
            removeAllViews();
            bringToFront();
            this.P = true;
        }
        AnythinkClickMiniCardView anythinkClickMiniCardView = this.o;
        if (anythinkClickMiniCardView == null || anythinkClickMiniCardView.getParent() == null) {
            if (this.u == null) {
                o();
            }
            AnythinkAlertWebview anythinkAlertWebview2 = this.u;
            if (anythinkAlertWebview2 != null && anythinkAlertWebview2.getParent() != null) {
                removeView(this.u);
            }
            addView(this.u);
            setBackgroundColor(0);
            this.u.webviewshow();
            return true;
        }
        return false;
    }

    @Override // com.anythink.expressad.video.signal.e
    public void showEndcard(int i) {
        c cVar = this.b_;
        if (cVar != null) {
            if (i == 1) {
                this.e_.a(104, "");
            } else if (i == 100) {
                if (cVar.H() == 2) {
                    this.D = true;
                }
                a(this.m);
                setMatchParent();
                i();
                n.a(AnythinkBaseView.TAG, "showEndcard addNativeEndcard");
            } else if (i == 3) {
                removeAllViews();
                setMatchParent();
                if (this.s == null) {
                    a(this.O, (Integer) 3);
                }
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(13, -1);
                addView(this.s, layoutParams);
                this.s.notifyShowListener();
                this.Q = true;
                bringToFront();
            } else if (i == 4) {
                this.e_.a(113, "");
                removeAllViews();
                setMatchParent();
                if (this.t == null) {
                    a(this.O, (Integer) 4);
                }
                this.t.preLoadData(this.O);
                addView(this.t);
                this.Q = true;
                bringToFront();
            } else if (i != 5) {
                removeAllViews();
                setMatchParent();
                this.Q = true;
                bringToFront();
                e();
                this.e_.a(117, "");
            } else {
                this.e_.a(106, "");
            }
        }
        this.A = true;
    }

    @Override // com.anythink.expressad.video.signal.e
    public void showMiniCard(int i, int i2, int i3, int i4, int i5) {
        AnythinkClickMiniCardView anythinkClickMiniCardView = this.o;
        if (anythinkClickMiniCardView != null) {
            anythinkClickMiniCardView.setMiniCardLocation(i, i2, i3, i4);
            this.o.setRadius(i5);
            this.o.setCloseVisible(8);
            this.o.setClickable(false);
            removeAllViews();
            setMatchParent();
            this.Q = true;
            bringToFront();
            m();
            if (this.F) {
                return;
            }
            this.F = true;
            this.e_.a(109, "");
            this.e_.a(117, "");
        }
    }

    @Override // com.anythink.expressad.video.signal.e
    public void showPlayableView() {
        if (this.b_ == null || this.D) {
            return;
        }
        removeAllViews();
        setMatchParent();
        if (this.m == null) {
            preLoadData(this.O);
        }
        addView(this.m);
        AnythinkPlayableView anythinkPlayableView = this.m;
        if (anythinkPlayableView != null) {
            anythinkPlayableView.setUnitId(this.v);
            c cVar = this.b_;
            if (cVar != null && cVar.F() && this.b_.H() == 2) {
                this.m.setCloseVisible(0);
            }
            this.m.setNotchValue(this.N, this.I, this.J, this.K, this.L);
        }
        this.Q = true;
        bringToFront();
    }

    @Override // com.anythink.expressad.video.signal.e
    public void showVideoClickView(int i) {
        if (this.b_ != null) {
            if (i == -1) {
                if (isLast() || endCardShowing()) {
                    return;
                }
                p();
            } else if (i == 1) {
                if (this.A) {
                    return;
                }
                AnythinkH5EndCardView anythinkH5EndCardView = this.q;
                if (anythinkH5EndCardView != null && anythinkH5EndCardView.getParent() != null) {
                    removeView(this.q);
                }
                AnythinkClickMiniCardView anythinkClickMiniCardView = this.o;
                if (anythinkClickMiniCardView != null && anythinkClickMiniCardView.getParent() != null) {
                    removeView(this.o);
                }
                AnythinkClickCTAView anythinkClickCTAView = this.n;
                if (anythinkClickCTAView == null || anythinkClickCTAView.getParent() == null) {
                    try {
                        c cVar = this.b_;
                        if (cVar != null && cVar.H() == 1) {
                            this.Q = true;
                            if (this.n == null) {
                                b(-1);
                            }
                            if (this.n != null) {
                                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                                layoutParams.addRule(12, -1);
                                addView(this.n, 0, layoutParams);
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (isLast()) {
                    bringToFront();
                }
            } else if (i != 2) {
            } else {
                AnythinkClickCTAView anythinkClickCTAView2 = this.n;
                if (anythinkClickCTAView2 != null && anythinkClickCTAView2.getParent() != null) {
                    removeView(this.n);
                }
                AnythinkAlertWebview anythinkAlertWebview = this.u;
                if (anythinkAlertWebview == null || anythinkAlertWebview.getParent() == null) {
                    AnythinkClickMiniCardView anythinkClickMiniCardView2 = this.o;
                    if (anythinkClickMiniCardView2 == null || anythinkClickMiniCardView2.getParent() == null) {
                        try {
                            c cVar2 = this.b_;
                            if (cVar2 != null && cVar2.H() == 1) {
                                setMatchParent();
                                m();
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                    if (miniCardLoaded()) {
                        AnythinkH5EndCardView anythinkH5EndCardView2 = this.q;
                        if (anythinkH5EndCardView2 != null && anythinkH5EndCardView2.getParent() != null) {
                            removeView(this.q);
                        }
                        this.e_.a(112, "");
                        c cVar3 = this.b_;
                        if (cVar3 != null && !cVar3.ay()) {
                            this.b_.az();
                            com.anythink.expressad.video.module.b.a.e(this.a_, this.b_);
                        }
                        if (this.C) {
                            this.e_.a(115, "");
                        } else {
                            this.Q = true;
                            bringToFront();
                            webviewshow();
                            onConfigurationChanged(getResources().getConfiguration());
                        }
                        this.B = true;
                        return;
                    }
                    p();
                }
            }
        }
    }

    @Override // com.anythink.expressad.video.signal.e
    public void showVideoEndCover() {
        removeAllViews();
        setMatchParent();
        AnythinkVideoEndCoverView anythinkVideoEndCoverView = this.r;
        if (anythinkVideoEndCoverView == null) {
            b bVar = this.O;
            this.O = bVar;
            if (anythinkVideoEndCoverView == null) {
                AnythinkVideoEndCoverView anythinkVideoEndCoverView2 = new AnythinkVideoEndCoverView(this.a_);
                this.r = anythinkVideoEndCoverView2;
                anythinkVideoEndCoverView2.setCampaign(this.b_);
                this.r.setNotifyListener(new i(this.e_));
                this.r.preLoadData(bVar);
            }
        }
        addView(this.r);
        onConfigurationChanged(getResources().getConfiguration());
        this.Q = true;
        bringToFront();
    }

    @Override // com.anythink.expressad.video.signal.h
    public void toggleCloseBtn(int i) {
        AnythinkPlayableView anythinkPlayableView = this.m;
        if (anythinkPlayableView != null) {
            anythinkPlayableView.toggleCloseBtn(i);
        }
        AnythinkH5EndCardView anythinkH5EndCardView = this.q;
        if (anythinkH5EndCardView != null) {
            anythinkH5EndCardView.toggleCloseBtn(i);
        }
    }

    public void triggerCloseBtn(String str) {
        if (this.b_ != null) {
            this.e_.a(122, "");
            this.e_.a(104, "");
        }
    }

    @Override // com.anythink.expressad.video.signal.h
    public void webviewshow() {
        AnythinkH5EndCardView[] anythinkH5EndCardViewArr = {this.m, this.o, this.q, this.u};
        for (int i = 0; i < 4; i++) {
            AnythinkH5EndCardView anythinkH5EndCardView = anythinkH5EndCardViewArr[i];
            if (anythinkH5EndCardView != null && anythinkH5EndCardView.getVisibility() == 0 && anythinkH5EndCardView.getParent() != null && !isLast()) {
                anythinkH5EndCardView.webviewshow();
            }
        }
    }

    private boolean a() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        return viewGroup.indexOfChild(this) == viewGroup.getChildCount() - 1;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (view != null) {
            a(view);
            super.addView(view, layoutParams);
            return;
        }
        n.d(AnythinkBaseView.TAG, "view is null");
    }

    private static void a(View view) {
        if (view != null) {
            try {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
            } catch (Throwable th) {
                n.b(AnythinkBaseView.TAG, th.getMessage(), th);
            }
        }
    }

    private void b(b bVar) {
        this.O = bVar;
        if (this.r == null) {
            AnythinkVideoEndCoverView anythinkVideoEndCoverView = new AnythinkVideoEndCoverView(this.a_);
            this.r = anythinkVideoEndCoverView;
            anythinkVideoEndCoverView.setCampaign(this.b_);
            this.r.setNotifyListener(new i(this.e_));
            this.r.preLoadData(bVar);
        }
    }

    private void a(b bVar) {
        if (this.m == null) {
            this.m = new AnythinkPlayableView(this.a_);
        }
        this.m.setCloseDelayShowTime(this.y);
        this.m.setPlayCloseBtnTm(this.z);
        this.m.setCampaign(this.b_);
        this.m.setNotifyListener(new AnonymousClass3(this.e_));
        this.m.preLoadData(bVar);
    }

    private void b(int i) {
        if (i != -3) {
            if (i != -2) {
                if (this.n == null) {
                    this.n = new AnythinkClickCTAView(this.a_);
                }
                this.n.setCampaign(this.b_);
                this.n.setUnitId(this.v);
                this.n.setNotifyListener(new i(this.e_));
                this.n.preLoadData(this.O);
                return;
            }
            c cVar = this.b_;
            if (cVar == null || cVar.D() != 2) {
                return;
            }
            if (this.o == null) {
                this.o = new AnythinkClickMiniCardView(this.a_);
            }
            this.o.setCampaign(this.b_);
            AnythinkClickMiniCardView anythinkClickMiniCardView = this.o;
            anythinkClickMiniCardView.setNotifyListener(new com.anythink.expressad.video.module.a.a.g(anythinkClickMiniCardView, this.e_));
            this.o.preLoadData(this.O);
            setMatchParent();
            m();
            p();
        }
    }

    public AnythinkContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.x = 1;
        this.y = 1;
        this.z = 1;
        this.A = false;
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = true;
        this.F = false;
        this.H = false;
        this.P = false;
        this.Q = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(b bVar, Integer num) {
        int parseInt;
        this.O = bVar;
        c cVar = this.b_;
        if (cVar != null) {
            if (num == null) {
                num = Integer.valueOf(cVar.D());
            }
            if (!isLast()) {
                p();
            }
            int intValue = num.intValue();
            if (intValue != 1) {
                if (intValue == 3) {
                    if (this.s == null) {
                        this.s = new AnythinkVastEndCardView(this.a_);
                    }
                    this.s.setCampaign(this.b_);
                    this.s.setNotifyListener(new l(this.e_));
                    this.s.preLoadData(bVar);
                } else if (intValue == 4) {
                    if (this.t == null) {
                        this.t = new AnythinkLandingPageView(this.a_);
                    }
                    this.t.setCampaign(this.b_);
                    this.t.setNotifyListener(new i(this.e_));
                } else if (intValue != 5) {
                    if (this.x == 2) {
                        boolean j = this.b_.j();
                        boolean f = s.f(this.b_.G());
                        c cVar2 = this.b_;
                        if ((cVar2 == null || !j || f) && cVar2.f() != 2) {
                            if (this.q == null) {
                                this.q = new AnythinkH5EndCardView(this.a_);
                            }
                            this.q.setCampaign(this.b_);
                            this.q.setCloseDelayShowTime(this.y);
                            this.q.setNotifyListener(new i(this.e_));
                            this.q.setUnitId(this.v);
                            this.q.setNotchValue(this.N, this.I, this.J, this.K, this.L);
                            this.q.preLoadData(bVar);
                            n.a(AnythinkBaseView.TAG, "preload H5Endcard");
                            if (this.C) {
                                return;
                            }
                            n.a(AnythinkBaseView.TAG, "showTransparent = " + this.C + " addview");
                            addView(this.q);
                            return;
                        }
                        return;
                    }
                    c cVar3 = this.b_;
                    int c = (cVar3 == null || cVar3.L() == null) ? 0 : this.b_.L().c();
                    if (this.p == null) {
                        if (this.b_.j()) {
                            String G = this.b_.G();
                            if (!TextUtils.isEmpty(G)) {
                                try {
                                    parseInt = Integer.parseInt(w.a(G, "ecid"));
                                } catch (Throwable th) {
                                    n.d(AnythinkBaseView.TAG, th.getMessage());
                                }
                                this.p = new AnythinkNativeEndCardView(this.a_, null, true, parseInt, this.b_.f() != 2, c);
                            }
                            parseInt = com.anythink.expressad.video.dynview.a.a.t;
                            this.p = new AnythinkNativeEndCardView(this.a_, null, true, parseInt, this.b_.f() != 2, c);
                        } else {
                            this.p = new AnythinkNativeEndCardView(this.a_, null, false, -1, this.b_.f() == 2, c);
                        }
                    }
                    this.p.setCampaign(this.b_);
                    this.p.setUnitId(this.v);
                    this.p.setCloseBtnDelay(this.y);
                    this.p.setNotifyListener(new i(this.e_));
                    this.p.preLoadData(bVar);
                    this.p.setNotchPadding(this.I, this.J, this.K, this.L);
                }
            }
        }
    }

    private void b(AnythinkH5EndCardView... anythinkH5EndCardViewArr) {
        for (int i = 0; i < 4; i++) {
            AnythinkH5EndCardView anythinkH5EndCardView = anythinkH5EndCardViewArr[i];
            if (anythinkH5EndCardView != null && anythinkH5EndCardView.getVisibility() == 0) {
                anythinkH5EndCardView.orientation(getResources().getConfiguration());
            }
        }
    }

    private void a(a aVar, AnythinkBaseView... anythinkBaseViewArr) {
        for (int i = 0; i < 8; i++) {
            AnythinkBaseView anythinkBaseView = anythinkBaseViewArr[i];
            if (anythinkBaseView != null) {
                if (anythinkBaseView instanceof AnythinkClickMiniCardView) {
                    anythinkBaseView.setNotifyListener(new com.anythink.expressad.video.module.a.a.g(this.o, aVar));
                } else {
                    anythinkBaseView.setNotifyListener(new i(aVar));
                }
            }
        }
    }

    private void a(Configuration configuration, AnythinkBaseView... anythinkBaseViewArr) {
        for (int i = 0; i < 8; i++) {
            AnythinkBaseView anythinkBaseView = anythinkBaseViewArr[i];
            if (anythinkBaseView != null && (anythinkBaseView instanceof AnythinkClickMiniCardView)) {
                anythinkBaseView.onSelfConfigurationChanged(configuration);
            } else if (anythinkBaseView != null && anythinkBaseView.getVisibility() == 0 && anythinkBaseView.getParent() != null && !isLast()) {
                anythinkBaseView.onSelfConfigurationChanged(configuration);
            }
        }
    }

    private void a(AnythinkH5EndCardView... anythinkH5EndCardViewArr) {
        for (int i = 0; i < 4; i++) {
            AnythinkH5EndCardView anythinkH5EndCardView = anythinkH5EndCardViewArr[i];
            if (anythinkH5EndCardView != null && anythinkH5EndCardView.getVisibility() == 0 && anythinkH5EndCardView.getParent() != null && !isLast()) {
                anythinkH5EndCardView.webviewshow();
            }
        }
    }
}