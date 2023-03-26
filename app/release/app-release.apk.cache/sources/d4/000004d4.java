package com.anythink.basead.ui;

import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;
import com.anythink.basead.a.a.e;
import com.anythink.basead.c;
import com.anythink.basead.c.f;
import com.anythink.basead.c.i;
import com.anythink.basead.c.j;
import com.anythink.basead.e.b;
import com.anythink.basead.ui.EndCardView;
import com.anythink.basead.ui.PanelView;
import com.anythink.basead.ui.PlayerView;
import com.anythink.core.common.e.k;
import com.anythink.core.common.e.x;
import com.anythink.core.common.e.z;
import com.anythink.core.common.j.e;
import com.anythink.core.common.j.h;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public abstract class BaseScreenAdView extends BaseAdView {
    public static final int FORMAT_INTERSTITIAL = 3;
    public static final int FORMAT_REWARD_VIDEO = 1;
    public static final String TAG = BaseScreenAdView.class.getSimpleName();
    public static final int TYPE_FULL_SCREEN = 0;
    public static final int TYPE_HALF_SCREEN = 1;
    public a A;
    public int B;
    public int C;
    public int D;
    public int E;
    public CountDownView F;
    public CloseImageView G;
    public FeedbackButton H;
    public MuteImageView I;
    public int J;
    public int K;
    public int L;
    public int M;
    public ConcurrentHashMap<Integer, Boolean> N;
    public int O;
    public int P;
    public int Q;
    public int R;
    private boolean S;
    private boolean T;
    private b.InterfaceC0030b U;
    private long V;
    private boolean W;
    public int a;
    private long aa;
    private c ab;
    private boolean ac;
    private float ad;
    public int b;
    public boolean c;
    public boolean v;
    public RelativeLayout w;
    public PlayerView x;
    public PanelView y;
    public EndCardView z;

    /* renamed from: com.anythink.basead.ui.BaseScreenAdView$4  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass4 implements c.a {
        public AnonymousClass4() {
        }

        @Override // com.anythink.basead.c.a
        public final void a() {
            BaseScreenAdView.h(BaseScreenAdView.this);
        }

        @Override // com.anythink.basead.c.a
        public final void b() {
            BaseScreenAdView.this.n();
            BaseScreenAdView.this.ab.b();
        }
    }

    /* renamed from: com.anythink.basead.ui.BaseScreenAdView$6  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass6 implements PanelView.a {
        public AnonymousClass6() {
        }

        @Override // com.anythink.basead.ui.PanelView.a
        public final void a() {
            BaseScreenAdView.this.b(1);
        }
    }

    /* renamed from: com.anythink.basead.ui.BaseScreenAdView$7  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass7 implements View.OnClickListener {
        public AnonymousClass7() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            BaseScreenAdView baseScreenAdView = BaseScreenAdView.this;
            PlayerView playerView = baseScreenAdView.x;
            if (playerView == null || baseScreenAdView.I == null) {
                return;
            }
            if (!playerView.isMute()) {
                BaseScreenAdView.this.ac = true;
                BaseScreenAdView.this.I.setMute(true);
                BaseScreenAdView.this.x.setMute(true);
                return;
            }
            BaseScreenAdView.this.ac = false;
            BaseScreenAdView.this.I.setMute(false);
            BaseScreenAdView.this.x.setMute(false);
        }
    }

    /* renamed from: com.anythink.basead.ui.BaseScreenAdView$8  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass8 implements View.OnClickListener {
        public AnonymousClass8() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            BaseScreenAdView.this.s();
        }
    }

    /* renamed from: com.anythink.basead.ui.BaseScreenAdView$9  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass9 implements View.OnClickListener {
        public AnonymousClass9() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            BaseScreenAdView.k(BaseScreenAdView.this);
        }
    }

    public BaseScreenAdView(Context context) {
        super(context);
        this.E = 0;
    }

    private void E() {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.C = displayMetrics.widthPixels;
        this.D = displayMetrics.heightPixels;
    }

    private void F() {
        this.x.setListener(new PlayerView.a() { // from class: com.anythink.basead.ui.BaseScreenAdView.1
            @Override // com.anythink.basead.ui.PlayerView.a
            public final void a() {
                e.a(BaseScreenAdView.TAG, "onVideoPlayStart...");
                BaseScreenAdView.this.x();
                BaseScreenAdView.this.aa = System.currentTimeMillis();
                BaseScreenAdView.super.h();
                BaseScreenAdView.b(BaseScreenAdView.this);
            }

            @Override // com.anythink.basead.ui.PlayerView.a
            public final void b() {
                e.a(BaseScreenAdView.TAG, "onVideoPlayEnd...");
            }

            @Override // com.anythink.basead.ui.PlayerView.a
            public final void c() {
                e.a(BaseScreenAdView.TAG, "onVideoPlayCompletion...");
                i i = BaseScreenAdView.this.i();
                com.anythink.basead.a.b.a(5, BaseScreenAdView.this.f, i);
                com.anythink.basead.a.b.a(31, BaseScreenAdView.this.f, i);
                if (BaseScreenAdView.this.U != null) {
                    BaseScreenAdView.this.U.c();
                }
                BaseScreenAdView baseScreenAdView = BaseScreenAdView.this;
                if (!baseScreenAdView.v) {
                    baseScreenAdView.v = true;
                    if (baseScreenAdView.U != null) {
                        BaseScreenAdView.this.U.d();
                    }
                }
                BaseScreenAdView.this.l();
                if (BaseScreenAdView.this.e.m.G() == 1) {
                    BaseScreenAdView.this.d();
                    return;
                }
                BaseScreenAdView baseScreenAdView2 = BaseScreenAdView.this;
                CloseImageView closeImageView = baseScreenAdView2.G;
                if (closeImageView != null) {
                    baseScreenAdView2.a(closeImageView);
                }
                BaseScreenAdView.this.v();
            }

            @Override // com.anythink.basead.ui.PlayerView.a
            public final void d() {
                if (BaseScreenAdView.this.W && BaseScreenAdView.this.V == -1) {
                    BaseScreenAdView.this.y();
                }
                i i = BaseScreenAdView.this.i();
                i.g = BaseScreenAdView.this.j();
                com.anythink.basead.a.b.a(14, BaseScreenAdView.this.f, i);
                k kVar = BaseScreenAdView.this.e.m;
                if (kVar == null || kVar.s() != 1) {
                    return;
                }
                BaseScreenAdView.this.b(1);
            }

            @Override // com.anythink.basead.ui.PlayerView.a
            public final void e() {
                e.a(BaseScreenAdView.TAG, "onVideoMute...");
                i i = BaseScreenAdView.this.i();
                i.g = BaseScreenAdView.this.j();
                com.anythink.basead.a.b.a(12, BaseScreenAdView.this.f, i);
            }

            @Override // com.anythink.basead.ui.PlayerView.a
            public final void f() {
                e.a(BaseScreenAdView.TAG, "onVideoNoMute...");
                i i = BaseScreenAdView.this.i();
                i.g = BaseScreenAdView.this.j();
                com.anythink.basead.a.b.a(13, BaseScreenAdView.this.f, i);
            }

            @Override // com.anythink.basead.ui.PlayerView.a
            public final void b(int i) {
                i i2 = BaseScreenAdView.this.i();
                if (i == 25) {
                    e.a(BaseScreenAdView.TAG, "onVideoProgress25.......");
                    com.anythink.basead.a.b.a(2, BaseScreenAdView.this.f, i2);
                } else if (i == 50) {
                    e.a(BaseScreenAdView.TAG, "onVideoProgress50.......");
                    com.anythink.basead.a.b.a(3, BaseScreenAdView.this.f, i2);
                } else if (i != 75) {
                } else {
                    e.a(BaseScreenAdView.TAG, "onVideoProgress75.......");
                    com.anythink.basead.a.b.a(4, BaseScreenAdView.this.f, i2);
                }
            }

            @Override // com.anythink.basead.ui.PlayerView.a
            public final void a(int i) {
                BaseScreenAdView.this.x();
                BaseScreenAdView.a(BaseScreenAdView.this, i);
                if (BaseScreenAdView.this.W && BaseScreenAdView.this.V >= 0 && i >= BaseScreenAdView.this.V) {
                    BaseScreenAdView.this.y();
                }
                CountDownView countDownView = BaseScreenAdView.this.F;
                if (countDownView != null && countDownView.isShown()) {
                    BaseScreenAdView.this.F.refresh(i);
                }
                BaseScreenAdView baseScreenAdView = BaseScreenAdView.this;
                int i2 = baseScreenAdView.J;
                if (i2 >= 0 && i >= i2) {
                    baseScreenAdView.z();
                }
                if (i >= BaseScreenAdView.this.e.m.e()) {
                    BaseScreenAdView baseScreenAdView2 = BaseScreenAdView.this;
                    if (baseScreenAdView2.v) {
                        return;
                    }
                    baseScreenAdView2.z();
                    BaseScreenAdView baseScreenAdView3 = BaseScreenAdView.this;
                    baseScreenAdView3.v = true;
                    if (baseScreenAdView3.U != null) {
                        BaseScreenAdView.this.U.d();
                    }
                }
            }

            @Override // com.anythink.basead.ui.PlayerView.a
            public final void c(int i) {
                BaseScreenAdView.b(BaseScreenAdView.this, i);
            }

            @Override // com.anythink.basead.ui.PlayerView.a
            public final void a(com.anythink.basead.c.e eVar) {
                BaseScreenAdView.this.d();
                i i = BaseScreenAdView.this.i();
                i.h = BaseScreenAdView.this.fillVideoEndRecord(false);
                com.anythink.basead.a.b.a(17, BaseScreenAdView.this.f, i);
                BaseScreenAdView.this.a(eVar);
                BaseScreenAdView baseScreenAdView = BaseScreenAdView.this;
                if (!baseScreenAdView.v && baseScreenAdView.e.m.f() == 1 && f.z.equals(eVar.b())) {
                    BaseScreenAdView baseScreenAdView2 = BaseScreenAdView.this;
                    baseScreenAdView2.v = true;
                    if (baseScreenAdView2.U != null) {
                        BaseScreenAdView.this.U.d();
                    }
                }
            }
        });
        this.x.initMuteStatus(this.ac);
        this.x.setVideoSize(this.K, this.L);
        this.x.load(this.f.s());
    }

    private static void G() {
    }

    private void H() {
        k kVar;
        int m = m();
        this.M = m;
        final boolean c = c(m);
        boolean z = !c;
        boolean z2 = (c || (kVar = this.e.m) == null || kVar.u() == 0) ? false : true;
        EndCardView endCardView = new EndCardView(getContext());
        this.z = endCardView;
        endCardView.setSize(this.C, this.D);
        this.z.init(this.f, this.e.m, z, z2, new EndCardView.a() { // from class: com.anythink.basead.ui.BaseScreenAdView.3
            @Override // com.anythink.basead.ui.EndCardView.a
            public final void a() {
                e.a(BaseScreenAdView.TAG, "EndCard onClick: ");
                BaseScreenAdView.this.b(1);
            }

            @Override // com.anythink.basead.ui.EndCardView.a
            public final void b() {
                BaseScreenAdView.this.C();
                if (c) {
                    BaseScreenAdView.this.y();
                }
            }
        });
        B();
        if (z2) {
            this.u = this.z.getLearnMoreButton();
        } else {
            PanelView panelView = this.y;
            if (panelView != null && panelView.getVisibility() == 0) {
                if (this.y.getCTAButton() != null && this.y.getCTAButton().getVisibility() == 0) {
                    this.u = this.y.getCTAButton();
                } else {
                    this.u = this.y;
                }
            }
        }
        this.z.load();
    }

    private void I() {
        o();
        if (this.ab == null) {
            this.ab = new c();
        }
        this.ab.a(getContext(), this.f, this.e, new AnonymousClass4());
    }

    private void J() {
        this.S = true;
        FeedbackButton feedbackButton = this.H;
        if (feedbackButton != null) {
            feedbackButton.setVisibility(4);
        }
    }

    private void K() {
        if (this.A == null) {
            this.A = new a(this.w);
        }
        this.A.a();
    }

    private void L() {
        a aVar = this.A;
        if (aVar != null) {
            aVar.b();
        }
    }

    private void M() {
        com.anythink.basead.a.b.a(1, this.f, i());
        b.InterfaceC0030b interfaceC0030b = this.U;
        if (interfaceC0030b != null) {
            interfaceC0030b.b();
        }
    }

    private void N() {
        String p = this.f.p();
        if (!TextUtils.isEmpty(p)) {
            com.anythink.basead.a.f.a();
            int[] a = com.anythink.core.common.j.b.a(com.anythink.basead.a.f.b(p));
            if (a != null) {
                this.Q = a[0];
                this.R = a[1];
            }
        }
        String s = this.f.s();
        if (!TextUtils.isEmpty(s)) {
            com.anythink.basead.a.f.a();
            e.a a2 = com.anythink.basead.a.a.e.a(com.anythink.basead.a.f.b(s));
            if (a2 != null) {
                this.O = a2.a;
                this.P = a2.b;
            }
        } else if (!TextUtils.isEmpty(p)) {
            this.O = this.Q;
            this.P = this.R;
        }
        String str = TAG;
        com.anythink.core.common.j.e.b(str, "mMaterialWidth: " + this.O + ", mMaterialHeight: " + this.P);
    }

    private void O() {
        PanelView panelView = this.y;
        if (panelView != null) {
            panelView.setVisibility(4);
            this.y.init(this.f, this.e, this.b, new AnonymousClass6());
        }
        q();
    }

    private void P() {
        CountDownView countDownView = this.F;
        if (countDownView != null) {
            countDownView.setVisibility(4);
        }
        r();
    }

    private void Q() {
        MuteImageView muteImageView = this.I;
        if (muteImageView == null) {
            return;
        }
        if (this.ac) {
            muteImageView.setMute(true);
        } else {
            muteImageView.setMute(false);
        }
        this.I.setVisibility(4);
        this.I.setOnClickListener(new AnonymousClass7());
    }

    private void R() {
        CloseImageView closeImageView = this.G;
        if (closeImageView != null) {
            closeImageView.setVisibility(4);
            this.G.setOnClickListener(new AnonymousClass8());
        }
        t();
    }

    private void S() {
        FeedbackButton feedbackButton = this.H;
        if (feedbackButton != null) {
            feedbackButton.setVisibility(4);
            this.H.setOnClickListener(new AnonymousClass9());
        }
        w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        FeedbackButton feedbackButton = this.H;
        if (feedbackButton == null || feedbackButton.isShown()) {
            return;
        }
        this.H.setVisibility(0);
    }

    public static /* synthetic */ void h(BaseScreenAdView baseScreenAdView) {
        baseScreenAdView.S = true;
        FeedbackButton feedbackButton = baseScreenAdView.H;
        if (feedbackButton != null) {
            feedbackButton.setVisibility(4);
        }
    }

    public static /* synthetic */ void j(BaseScreenAdView baseScreenAdView) {
        a aVar = baseScreenAdView.A;
        if (aVar != null) {
            aVar.b();
        }
    }

    public static /* synthetic */ void k(BaseScreenAdView baseScreenAdView) {
        baseScreenAdView.o();
        if (baseScreenAdView.ab == null) {
            baseScreenAdView.ab = new c();
        }
        baseScreenAdView.ab.a(baseScreenAdView.getContext(), baseScreenAdView.f, baseScreenAdView.e, new AnonymousClass4());
    }

    public abstract void A();

    public abstract void B();

    public abstract void C();

    public abstract void D();

    @Override // com.anythink.basead.ui.BaseAdView
    public void a() {
    }

    @Override // com.anythink.basead.ui.BaseAdView
    public final void b(int i) {
        String str = TAG;
        com.anythink.core.common.j.e.a(str, "click 。。。。。");
        if (this.T) {
            com.anythink.core.common.j.e.a(str, "during click 。。。。。");
        } else if (this.f == null) {
        } else {
            super.b(i);
        }
    }

    public abstract boolean c(int i);

    @Override // com.anythink.basead.ui.BaseAdView
    public void destroy() {
        super.destroy();
        this.U = null;
    }

    public j fillVideoEndRecord(boolean z) {
        j jVar = new j();
        jVar.l = this.b == 2 ? 4 : 1;
        jVar.r = 1;
        PlayerView playerView = this.x;
        jVar.a = playerView != null ? playerView.getVideoLength() / 1000 : 0;
        jVar.b = this.B / 1000;
        jVar.c = this.x.getCurrentPosition() / 1000;
        int i = this.B;
        jVar.d = i == 0 ? 1 : 0;
        jVar.o = i == 0 ? 1 : 2;
        jVar.e = this.x.getCurrentPosition() != this.x.getVideoLength() ? 0 : 1;
        jVar.u = z ? 0 : 2;
        jVar.f = this.aa;
        jVar.g = System.currentTimeMillis();
        jVar.h = this.x.getCurrentPosition();
        String str = TAG;
        com.anythink.core.common.j.e.b(str, "Video End Record:" + jVar.toString());
        return jVar;
    }

    public boolean hasReward() {
        return this.v;
    }

    public void init() {
        c();
        this.W = c(this.M);
        if (this.c) {
            D();
            d();
            return;
        }
        int i = this.a;
        if (1 == i) {
            if (this.f.z()) {
                D();
                F();
                return;
            }
            a(f.a(f.k, f.A));
        } else if (3 == i) {
            if (this.f.x() == 1 && this.f.z()) {
                D();
                F();
                return;
            }
            D();
            d();
            super.h();
        }
    }

    public boolean isShowEndCard() {
        return this.c;
    }

    public boolean isVideoMute() {
        return this.ac;
    }

    public abstract int m();

    public final void n() {
        PlayerView playerView;
        try {
            c cVar = this.ab;
            if ((cVar == null || !cVar.a()) && (playerView = this.x) != null && playerView.hasVideo() && !this.x.isPlaying()) {
                this.B = this.x.getCurrentPosition();
                this.x.start();
                this.aa = System.currentTimeMillis();
                if (this.B != 0) {
                    com.anythink.basead.a.b.a(15, this.f, i());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean needHideFeedbackButton() {
        return this.S;
    }

    public final void o() {
        PlayerView playerView = this.x;
        if (playerView == null || !playerView.isPlaying()) {
            return;
        }
        com.anythink.basead.a.b.a(11, this.f, i());
        this.x.pause();
    }

    public final void p() {
        destroy();
    }

    public abstract void q();

    public void r() {
    }

    public abstract void s();

    public void setHasReward(boolean z) {
        this.v = z;
    }

    public void setHideFeedbackButton(boolean z) {
        this.S = z;
    }

    public void setIsShowEndCard(boolean z) {
        this.c = z;
    }

    public void setListener(b.InterfaceC0030b interfaceC0030b) {
        this.U = interfaceC0030b;
    }

    public void setVideoMute(boolean z) {
        this.ac = z;
    }

    public abstract void t();

    public final void u() {
        PlayerView playerView = this.x;
        if (playerView == null || !playerView.isPlaying()) {
            return;
        }
        this.x.stop();
        this.x.removeAllViews();
        i i = i();
        i.g = j();
        com.anythink.basead.a.b.a(16, this.f, i);
    }

    public final void v() {
        com.anythink.core.common.j.e.a(TAG, "onCloseEndCard.......");
        i i = i();
        i.g = j();
        com.anythink.basead.a.b.a(7, this.f, i);
        b.InterfaceC0030b interfaceC0030b = this.U;
        if (interfaceC0030b != null) {
            interfaceC0030b.e();
        }
    }

    public abstract void w();

    public final void x() {
        FeedbackButton feedbackButton;
        CountDownView countDownView = this.F;
        if (countDownView != null && !countDownView.isShown()) {
            this.F.setVisibility(0);
        }
        MuteImageView muteImageView = this.I;
        if (muteImageView != null && !muteImageView.isShown()) {
            this.I.setVisibility(0);
        }
        if (this.S || (feedbackButton = this.H) == null || feedbackButton.isShown()) {
            return;
        }
        T();
    }

    public final void y() {
        this.y.setVisibility(0);
    }

    public final void z() {
        CloseImageView closeImageView = this.G;
        if (closeImageView != null && !closeImageView.isShown()) {
            this.G.setVisibility(0);
            this.G.setClickAreaScaleFactor(this.ad);
        }
        A();
    }

    private void e(int i) {
        CountDownView countDownView = this.F;
        if (countDownView != null) {
            countDownView.setDuration(i);
        }
    }

    public void c() {
        this.w = (RelativeLayout) findViewById(h.a(getContext(), "myoffer_rl_root", "id"));
        this.x = (PlayerView) findViewById(h.a(getContext(), "myoffer_player_view_id", "id"));
        this.y = (PanelView) findViewById(h.a(getContext(), "myoffer_banner_view_id", "id"));
        this.F = (CountDownView) findViewById(h.a(getContext(), "myoffer_count_down_view_id", "id"));
        this.I = (MuteImageView) findViewById(h.a(getContext(), "myoffer_btn_mute_id", "id"));
        this.G = (CloseImageView) findViewById(h.a(getContext(), "myoffer_btn_close_id", "id"));
        this.H = (FeedbackButton) findViewById(h.a(getContext(), "myoffer_feedback_view_id", "id"));
        CountDownView countDownView = this.F;
        if (countDownView != null) {
            countDownView.setVisibility(4);
        }
        r();
        MuteImageView muteImageView = this.I;
        if (muteImageView != null) {
            if (this.ac) {
                muteImageView.setMute(true);
            } else {
                muteImageView.setMute(false);
            }
            this.I.setVisibility(4);
            this.I.setOnClickListener(new AnonymousClass7());
        }
        CloseImageView closeImageView = this.G;
        if (closeImageView != null) {
            closeImageView.setVisibility(4);
            this.G.setOnClickListener(new AnonymousClass8());
        }
        t();
        FeedbackButton feedbackButton = this.H;
        if (feedbackButton != null) {
            feedbackButton.setVisibility(4);
            this.H.setOnClickListener(new AnonymousClass9());
        }
        w();
        PanelView panelView = this.y;
        if (panelView != null) {
            panelView.setVisibility(4);
            this.y.init(this.f, this.e, this.b, new AnonymousClass6());
        }
        q();
    }

    public final void d() {
        com.anythink.core.common.j.e.a(TAG, "showEndCard.......");
        this.c = true;
        H();
        EndCardView endCardView = this.z;
        if (endCardView != null) {
            endCardView.postDelayed(new Runnable() { // from class: com.anythink.basead.ui.BaseScreenAdView.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (!BaseScreenAdView.this.S) {
                        BaseScreenAdView.this.T();
                    }
                    BaseScreenAdView.this.z();
                }
            }, a(this.e.m));
        }
        com.anythink.basead.a.b.a(6, this.f, i());
    }

    @Override // com.anythink.basead.ui.BaseAdView
    public final void f() {
        this.T = true;
        if (this.A == null) {
            this.A = new a(this.w);
        }
        this.A.a();
    }

    @Override // com.anythink.basead.ui.BaseAdView
    public final void g() {
        this.T = false;
        post(new Runnable() { // from class: com.anythink.basead.ui.BaseScreenAdView.5
            @Override // java.lang.Runnable
            public final void run() {
                BaseScreenAdView.j(BaseScreenAdView.this);
            }
        });
    }

    @Override // com.anythink.basead.ui.BaseAdView
    public final i i() {
        i iVar = new i(this.e.d, this.s);
        iVar.e = getWidth();
        iVar.f = getHeight();
        PlayerView playerView = this.x;
        if (playerView != null && playerView.hasVideo()) {
            iVar.h = fillVideoEndRecord(true);
        }
        return iVar;
    }

    public BaseScreenAdView(Context context, com.anythink.core.common.e.j jVar, com.anythink.core.common.e.i iVar, String str, int i, int i2) {
        super(context, jVar, iVar, str);
        this.E = 0;
        this.a = i;
        this.b = i2;
        this.V = this.e.m.t() > 0 ? this.e.m.t() * 1000 : this.e.m.t();
        this.J = this.e.m.w() * 1000;
        this.ac = this.e.m.v() == 0;
        int g = this.e.m.g();
        if (g == 2) {
            this.ad = 1.5f;
        } else if (g == 3) {
            this.ad = 0.75f;
        } else if (g != 4) {
            this.ad = 1.0f;
        } else {
            this.ad = 0.5f;
        }
    }

    @Override // com.anythink.basead.ui.BaseAdView
    public void e() {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.C = displayMetrics.widthPixels;
        this.D = displayMetrics.heightPixels;
        String p = this.f.p();
        if (!TextUtils.isEmpty(p)) {
            com.anythink.basead.a.f.a();
            int[] a = com.anythink.core.common.j.b.a(com.anythink.basead.a.f.b(p));
            if (a != null) {
                this.Q = a[0];
                this.R = a[1];
            }
        }
        String s = this.f.s();
        if (!TextUtils.isEmpty(s)) {
            com.anythink.basead.a.f.a();
            e.a a2 = com.anythink.basead.a.a.e.a(com.anythink.basead.a.f.b(s));
            if (a2 != null) {
                this.O = a2.a;
                this.P = a2.b;
            }
        } else if (!TextUtils.isEmpty(p)) {
            this.O = this.Q;
            this.P = this.R;
        }
        String str = TAG;
        com.anythink.core.common.j.e.b(str, "mMaterialWidth: " + this.O + ", mMaterialHeight: " + this.P);
    }

    private static int a(k kVar) {
        int y;
        if (kVar == null || (y = (int) (kVar.y() / 100.0f)) == 0) {
            return 0;
        }
        Random random = new Random();
        if (random.nextInt(100) > y) {
            return 0;
        }
        int z = kVar.z();
        int A = kVar.A();
        if (A <= 0) {
            return 0;
        }
        if (z == A) {
            return z;
        }
        try {
            return random.nextInt(A - z) + z;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    @Override // com.anythink.basead.ui.BaseAdView
    public final void b() {
        com.anythink.basead.a.b.a(8, this.f, i());
        b.InterfaceC0030b interfaceC0030b = this.U;
        if (interfaceC0030b != null) {
            interfaceC0030b.a();
        }
    }

    public static /* synthetic */ void b(BaseScreenAdView baseScreenAdView) {
        com.anythink.basead.a.b.a(1, baseScreenAdView.f, baseScreenAdView.i());
        b.InterfaceC0030b interfaceC0030b = baseScreenAdView.U;
        if (interfaceC0030b != null) {
            interfaceC0030b.b();
        }
    }

    private void d(int i) {
        z Q;
        Map<Integer, String[]> y;
        com.anythink.core.common.e.i iVar = this.f;
        if (!(iVar instanceof x) || (Q = ((x) iVar).Q()) == null || (y = Q.y()) == null || y.size() <= 0) {
            return;
        }
        if (this.N == null) {
            this.N = new ConcurrentHashMap<>();
        }
        int i2 = i / 1000;
        for (Integer num : y.keySet()) {
            if (this.N.get(num) == null || !this.N.get(num).booleanValue()) {
                if (i2 >= num.intValue()) {
                    this.N.put(num, Boolean.TRUE);
                    i i3 = i();
                    i3.h.i = num.intValue();
                    com.anythink.basead.a.b.a(32, this.f, i3);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.anythink.basead.c.e eVar) {
        b.InterfaceC0030b interfaceC0030b = this.U;
        if (interfaceC0030b != null) {
            interfaceC0030b.a(eVar);
        }
        k();
    }

    public static /* synthetic */ void b(BaseScreenAdView baseScreenAdView, int i) {
        CountDownView countDownView = baseScreenAdView.F;
        if (countDownView != null) {
            countDownView.setDuration(i);
        }
    }

    @Override // com.anythink.basead.ui.BaseAdView
    public final void a(int i) {
        b.InterfaceC0030b interfaceC0030b = this.U;
        if (interfaceC0030b != null) {
            interfaceC0030b.a(i);
        }
    }

    @Override // com.anythink.basead.ui.BaseAdView
    public final void a(boolean z) {
        b.InterfaceC0030b interfaceC0030b = this.U;
        if (interfaceC0030b != null) {
            interfaceC0030b.a(z);
        }
    }

    public static /* synthetic */ void a(BaseScreenAdView baseScreenAdView, int i) {
        z Q;
        Map<Integer, String[]> y;
        com.anythink.core.common.e.i iVar = baseScreenAdView.f;
        if (!(iVar instanceof x) || (Q = ((x) iVar).Q()) == null || (y = Q.y()) == null || y.size() <= 0) {
            return;
        }
        if (baseScreenAdView.N == null) {
            baseScreenAdView.N = new ConcurrentHashMap<>();
        }
        int i2 = i / 1000;
        for (Integer num : y.keySet()) {
            if (baseScreenAdView.N.get(num) == null || !baseScreenAdView.N.get(num).booleanValue()) {
                if (i2 >= num.intValue()) {
                    baseScreenAdView.N.put(num, Boolean.TRUE);
                    i i3 = baseScreenAdView.i();
                    i3.h.i = num.intValue();
                    com.anythink.basead.a.b.a(32, baseScreenAdView.f, i3);
                }
            }
        }
    }
}