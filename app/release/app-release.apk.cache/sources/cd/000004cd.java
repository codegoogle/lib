package com.anythink.basead.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.anythink.basead.c.f;
import com.anythink.basead.e.b;
import com.anythink.core.basead.a;
import com.anythink.core.common.b;
import com.anythink.core.common.b.m;
import com.anythink.core.common.e.i;
import com.anythink.core.common.e.j;
import com.anythink.core.common.e.k;
import com.anythink.core.common.e.v;
import com.anythink.core.common.j.e;
import com.anythink.core.common.j.h;

/* loaded from: classes2.dex */
public class BaseAdActivity extends Activity {
    public static final String a = BaseAdActivity.class.getSimpleName();
    public boolean b;
    public v c;
    public b.a d = new b.a() { // from class: com.anythink.basead.ui.BaseAdActivity.1
        @Override // com.anythink.core.common.b.a
        public final void a(Object obj) {
            if (!(obj instanceof v) || BaseAdActivity.this.g == null) {
                return;
            }
            v vVar = (v) obj;
            if (vVar.a().w().equals(BaseAdActivity.this.g.w())) {
                BaseAdActivity baseAdActivity = BaseAdActivity.this;
                if (baseAdActivity.b) {
                    vVar.a(baseAdActivity);
                } else {
                    baseAdActivity.c = vVar;
                }
            }
        }
    };
    private BaseScreenAdView e;
    private j f;
    private i g;
    private String h;
    private b.InterfaceC0030b i;
    private String j;
    private int k;
    private int l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        BaseScreenAdView fullScreenAdView;
        super.onCreate(bundle);
        if (m.a().e() == null) {
            m.a().a(getApplicationContext());
        }
        if (this instanceof AdLandscapeActivity) {
            this.l = 2;
        } else {
            this.l = 1;
        }
        Intent intent = getIntent();
        if (intent != null) {
            try {
                this.j = intent.getStringExtra("extra_scenario");
                this.k = intent.getIntExtra(a.C0037a.b, 1);
                this.g = (i) intent.getSerializableExtra(a.C0037a.c);
                this.f = (j) intent.getSerializableExtra(a.C0037a.e);
                this.h = intent.getStringExtra(a.C0037a.d);
                this.q = a(this.k, this.f);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.i = com.anythink.basead.e.b.a().a(this.h);
        j jVar = this.f;
        if (jVar != null && jVar.m != null) {
            if (this.g == null) {
                String str = a;
                try {
                    b.InterfaceC0030b interfaceC0030b = this.i;
                    if (interfaceC0030b != null) {
                        interfaceC0030b.a(f.a(f.k, str + " onCreate: OfferAd = null"));
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                finish();
                return;
            }
            com.anythink.core.common.b.a().a("1", this.d);
            if (bundle != null) {
                this.m = bundle.getBoolean(a.C0037a.f);
                this.n = bundle.getBoolean(a.C0037a.g);
                this.o = bundle.getBoolean(a.C0037a.h);
                this.p = bundle.getBoolean(a.C0037a.j);
            } else {
                j jVar2 = this.f;
                if (jVar2 != null) {
                    this.o = jVar2.m.v() == 0;
                }
            }
            if (this.k != 3) {
                fullScreenAdView = new FullScreenAdView(this, this.f, this.g, this.j, this.k, this.l);
            } else if (this.q) {
                fullScreenAdView = new HalfScreenAdView(this, this.f, this.g, this.j, this.k, this.l);
            } else {
                fullScreenAdView = new FullScreenAdView(this, this.f, this.g, this.j, this.k, this.l);
            }
            this.e = fullScreenAdView;
            setContentView(fullScreenAdView);
            this.e.setListener(new AnonymousClass2());
            this.e.setIsShowEndCard(this.m);
            this.e.setHideFeedbackButton(this.n);
            this.e.setVideoMute(this.o);
            this.e.setHasReward(this.p);
            try {
                this.e.init();
                return;
            } catch (Throwable th2) {
                th2.printStackTrace();
                finish();
                return;
            }
        }
        String str2 = a;
        try {
            b.InterfaceC0030b interfaceC0030b2 = this.i;
            if (interfaceC0030b2 != null) {
                interfaceC0030b2.a(f.a(f.k, str2 + "Start FullScreen Ad Error."));
            }
        } catch (Throwable th3) {
            th3.printStackTrace();
        }
        finish();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        this.c = null;
        com.anythink.core.common.b.a().b("1", this.d);
        BaseScreenAdView baseScreenAdView = this.e;
        if (baseScreenAdView != null) {
            baseScreenAdView.p();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (4 == i) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.b = false;
        BaseScreenAdView baseScreenAdView = this.e;
        if (baseScreenAdView != null) {
            baseScreenAdView.o();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        this.b = true;
        BaseScreenAdView baseScreenAdView = this.e;
        if (baseScreenAdView != null) {
            baseScreenAdView.n();
        }
        v vVar = this.c;
        if (vVar != null) {
            vVar.a(this);
            this.c = null;
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        BaseScreenAdView baseScreenAdView = this.e;
        if (baseScreenAdView != null) {
            if (baseScreenAdView.isShowEndCard()) {
                e.a(a, "onSaveInstanceState... ScreenAdView.isShowEndCard() - true");
                bundle.putBoolean(a.C0037a.f, true);
            }
            boolean needHideFeedbackButton = this.e.needHideFeedbackButton();
            String str = a;
            e.a(str, "onSaveInstanceState... ScreenAdView.needShowFeedbackButton() - ".concat(String.valueOf(needHideFeedbackButton)));
            bundle.putBoolean(a.C0037a.g, needHideFeedbackButton);
            boolean isVideoMute = this.e.isVideoMute();
            e.a(str, "onSaveInstanceState... ScreenAdView.isVideoMute() - ".concat(String.valueOf(isVideoMute)));
            bundle.putBoolean(a.C0037a.h, isVideoMute);
            boolean hasReward = this.e.hasReward();
            e.a(str, "onSaveInstanceState... ScreenAdView.hasReward() - ".concat(String.valueOf(isVideoMute)));
            bundle.putBoolean(a.C0037a.j, hasReward);
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        if (Build.VERSION.SDK_INT == 26) {
            super.setTheme(h.a(this, "myoffer_half_screen_fit_by_o", com.anythink.expressad.foundation.h.h.e));
        } else {
            super.setTheme(i);
        }
    }

    /* renamed from: com.anythink.basead.ui.BaseAdActivity$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 implements b.InterfaceC0030b {
        public AnonymousClass2() {
        }

        @Override // com.anythink.basead.e.b.InterfaceC0030b
        public final void a() {
            if (BaseAdActivity.this.i != null) {
                BaseAdActivity.this.i.a();
            }
        }

        @Override // com.anythink.basead.e.b.InterfaceC0030b
        public final void b() {
            if (BaseAdActivity.this.i != null) {
                BaseAdActivity.this.i.b();
            }
        }

        @Override // com.anythink.basead.e.b.InterfaceC0030b
        public final void c() {
            if (BaseAdActivity.this.i != null) {
                BaseAdActivity.this.i.c();
            }
        }

        @Override // com.anythink.basead.e.b.InterfaceC0030b
        public final void d() {
            if (BaseAdActivity.this.i != null) {
                BaseAdActivity.this.i.d();
            }
        }

        @Override // com.anythink.basead.e.b.InterfaceC0030b
        public final void e() {
            BaseAdActivity.this.finish();
            if (BaseAdActivity.this.q) {
                BaseAdActivity.this.overridePendingTransition(0, 0);
            }
            if (BaseAdActivity.this.i != null) {
                BaseAdActivity.this.i.e();
            }
        }

        @Override // com.anythink.basead.e.b.InterfaceC0030b
        public final void a(com.anythink.basead.c.e eVar) {
            if (BaseAdActivity.this.i != null) {
                BaseAdActivity.this.i.a(eVar);
            }
        }

        @Override // com.anythink.basead.e.b.InterfaceC0030b
        public final void a(int i) {
            if (BaseAdActivity.this.i != null) {
                BaseAdActivity.this.i.a(i);
            }
        }

        @Override // com.anythink.basead.e.b.InterfaceC0030b
        public final void a(boolean z) {
            if (BaseAdActivity.this.i != null) {
                BaseAdActivity.this.i.a(z);
            }
        }
    }

    public static void a(Context context, com.anythink.core.basead.b.a aVar) {
        Intent intent = new Intent();
        boolean a2 = a(aVar.a, aVar.h);
        if (aVar.e == 2) {
            if (a2) {
                intent.setClass(context, AdLandscapeTranslucentActivity.class);
            } else {
                intent.setClass(context, AdLandscapeActivity.class);
            }
        } else if (a2) {
            intent.setClass(context, AdPortraitTranslucentActivity.class);
        } else {
            intent.setClass(context, AdPortraitActivity.class);
        }
        intent.putExtra("extra_scenario", aVar.b);
        intent.putExtra(a.C0037a.b, aVar.a);
        intent.putExtra(a.C0037a.c, aVar.c);
        intent.putExtra(a.C0037a.d, aVar.d);
        intent.putExtra(a.C0037a.e, aVar.h);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    private BaseScreenAdView b() {
        if (this.k != 3) {
            return new FullScreenAdView(this, this.f, this.g, this.j, this.k, this.l);
        }
        if (this.q) {
            return new HalfScreenAdView(this, this.f, this.g, this.j, this.k, this.l);
        }
        return new FullScreenAdView(this, this.f, this.g, this.j, this.k, this.l);
    }

    private void c() {
        this.e.setListener(new AnonymousClass2());
        this.e.setIsShowEndCard(this.m);
        this.e.setHideFeedbackButton(this.n);
        this.e.setVideoMute(this.o);
        this.e.setHasReward(this.p);
        try {
            this.e.init();
        } catch (Throwable th) {
            th.printStackTrace();
            finish();
        }
    }

    private void a() {
        Intent intent = getIntent();
        if (intent != null) {
            try {
                this.j = intent.getStringExtra("extra_scenario");
                this.k = intent.getIntExtra(a.C0037a.b, 1);
                this.g = (i) intent.getSerializableExtra(a.C0037a.c);
                this.f = (j) intent.getSerializableExtra(a.C0037a.e);
                this.h = intent.getStringExtra(a.C0037a.d);
                this.q = a(this.k, this.f);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static boolean a(int i, j jVar) {
        k kVar;
        if (jVar == null || (kVar = jVar.m) == null || i != 3) {
            return false;
        }
        return TextUtils.equals("2", kVar.B());
    }

    private void a(Bundle bundle) {
        if (bundle != null) {
            this.m = bundle.getBoolean(a.C0037a.f);
            this.n = bundle.getBoolean(a.C0037a.g);
            this.o = bundle.getBoolean(a.C0037a.h);
            this.p = bundle.getBoolean(a.C0037a.j);
            return;
        }
        j jVar = this.f;
        if (jVar != null) {
            this.o = jVar.m.v() == 0;
        }
    }
}