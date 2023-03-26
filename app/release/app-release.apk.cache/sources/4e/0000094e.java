package com.anythink.expressad.splash.c;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.core.common.b.m;
import com.anythink.expressad.atsignalcommon.windvane.AbsFeedBackForH5;
import com.anythink.expressad.atsignalcommon.windvane.j;
import com.anythink.expressad.foundation.g.a.f;
import com.anythink.expressad.foundation.h.h;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.s;
import com.anythink.expressad.splash.js.SplashJSBridgeImpl;
import com.anythink.expressad.splash.js.SplashJsUtils;
import com.anythink.expressad.splash.view.ATSplashView;
import com.anythink.expressad.splash.view.ATSplashWebview;
import com.anythink.expressad.widget.FeedBackButton;
import com.p7700g.p99005.x1;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class d {
    private com.anythink.expressad.foundation.d.c d;
    private ATSplashView e;
    private com.anythink.expressad.splash.d.d f;
    private com.anythink.expressad.a.a g;
    private boolean h;
    private TextView i;
    private View j;
    private String k;
    private String l;
    private String n;
    private String o;
    private String p;
    private String q;
    private boolean r;
    private boolean s;
    private Context t;
    private String c = "SplashShowManager";
    private int m = 5;
    private View.OnClickListener u = new View.OnClickListener() { // from class: com.anythink.expressad.splash.c.d.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (d.this.h) {
                d.this.j();
                d.a(d.this, -1);
            }
        }
    };
    public Handler a = new Handler(Looper.getMainLooper()) { // from class: com.anythink.expressad.splash.c.d.2
        @Override // android.os.Handler
        public final void handleMessage(@x1 Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i != 1) {
                if (i == 2 && d.this.d != null && d.this.d.aA() && d.this.e != null) {
                    d.this.e.getSplashWebview();
                }
            } else if (d.this.m <= 0) {
                d.this.j();
            } else {
                d.d(d.this);
                d dVar = d.this;
                d.a(dVar, dVar.m);
                d.this.a.removeMessages(1);
                sendEmptyMessageDelayed(1, 1000L);
            }
        }
    };
    private com.anythink.expressad.splash.d.a v = new com.anythink.expressad.splash.d.a() { // from class: com.anythink.expressad.splash.c.d.3
        @Override // com.anythink.expressad.splash.d.a
        public final void a(int i) {
            if (d.this.e != null) {
                d.this.e.changeCloseBtnState(i);
            }
        }

        @Override // com.anythink.expressad.splash.d.a
        public final void b() {
        }

        @Override // com.anythink.expressad.splash.d.a
        public final void b(int i) {
            n.d(d.this.c, "resetCountdown".concat(String.valueOf(i)));
            d.this.m = i;
            d.this.a.removeMessages(1);
            d.this.a.sendEmptyMessageDelayed(1, 1000L);
        }

        @Override // com.anythink.expressad.splash.d.a
        public final void c() {
            d.this.j();
        }

        @Override // com.anythink.expressad.splash.d.a
        public final void a() {
            d.this.j();
        }

        @Override // com.anythink.expressad.splash.d.a
        public final void a(com.anythink.expressad.foundation.d.c cVar) {
            d.this.a(cVar);
        }

        @Override // com.anythink.expressad.splash.d.a
        public final void a(int i, int i2) {
            if (i == 1) {
                d.this.a.removeMessages(1);
            }
            if (i == 2) {
                d.this.m = i2;
                d.this.a.removeMessages(1);
                d.this.a.sendEmptyMessageDelayed(1, 1000L);
            }
        }

        @Override // com.anythink.expressad.splash.d.a
        public final void b(String str) {
            try {
                if (d.this.f != null) {
                    if (TextUtils.isEmpty(str)) {
                        d.this.f.a(d.this.d);
                        return;
                    }
                    com.anythink.expressad.foundation.d.c b = com.anythink.expressad.foundation.d.c.b(com.anythink.expressad.foundation.d.c.a(d.this.d));
                    b.n(str);
                    d.this.a(b);
                }
            } catch (Exception e) {
                n.d(d.this.c, e.getMessage());
            }
        }

        @Override // com.anythink.expressad.splash.d.a
        public final void a(String str) {
            d.a(d.this, str);
        }

        @Override // com.anythink.expressad.splash.d.a
        public final void a(boolean z) {
            if (z) {
                d.this.a.removeMessages(1);
            }
        }
    };
    public Rect b = new Rect();

    /* renamed from: com.anythink.expressad.splash.c.d$6  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass6 implements com.anythink.expressad.foundation.f.a {
        public AnonymousClass6() {
        }

        @Override // com.anythink.expressad.foundation.f.a
        public final void a() {
            String str;
            d.this.e();
            try {
                JSONObject jSONObject = new JSONObject();
                if (m.a().e() != null) {
                    jSONObject.put("status", 1);
                }
                str = jSONObject.toString();
            } catch (Throwable th) {
                n.b(d.this.c, th.getMessage(), th);
                str = "";
            }
            String encodeToString = Base64.encodeToString(str.getBytes(), 2);
            j.a();
            j.a((WebView) d.this.e.getSplashWebview(), AbsFeedBackForH5.m_, encodeToString);
        }

        @Override // com.anythink.expressad.foundation.f.a
        public final void b() {
            String str;
            d.this.d();
            try {
                JSONObject jSONObject = new JSONObject();
                if (m.a().e() != null) {
                    jSONObject.put("status", 2);
                }
                str = jSONObject.toString();
            } catch (Throwable th) {
                n.b(d.this.c, th.getMessage(), th);
                str = "";
            }
            String encodeToString = Base64.encodeToString(str.getBytes(), 2);
            j.a();
            j.a((WebView) d.this.e.getSplashWebview(), AbsFeedBackForH5.m_, encodeToString);
        }

        @Override // com.anythink.expressad.foundation.f.a
        public final void c() {
            String str;
            d.this.d();
            try {
                JSONObject jSONObject = new JSONObject();
                if (m.a().e() != null) {
                    jSONObject.put("status", 2);
                }
                str = jSONObject.toString();
            } catch (Throwable th) {
                n.b(d.this.c, th.getMessage(), th);
                str = "";
            }
            String encodeToString = Base64.encodeToString(str.getBytes(), 2);
            j.a();
            j.a((WebView) d.this.e.getSplashWebview(), AbsFeedBackForH5.m_, encodeToString);
        }
    }

    public d(Context context, String str, String str2) {
        this.n = "点击跳过|";
        this.o = "点击跳过|";
        this.p = "秒";
        this.q = "秒后自动关闭";
        this.k = str2;
        this.l = str;
        this.t = context;
        if (this.i == null) {
            TextView textView = new TextView(context);
            this.i = textView;
            textView.setGravity(1);
            this.i.setTextIsSelectable(false);
            this.i.setPadding(s.b(context, 5.0f), s.b(context, 5.0f), s.b(context, 5.0f), s.b(context, 5.0f));
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.i.getLayoutParams();
            this.i.setLayoutParams(layoutParams == null ? new RelativeLayout.LayoutParams(s.b(context, 100.0f), s.b(context, 50.0f)) : layoutParams);
            Context e = m.a().e();
            if (e != null) {
                String a = com.anythink.expressad.foundation.b.a.b().a();
                int identifier = e.getResources().getIdentifier("anythink_splash_count_time_can_skip", "string", a);
                int identifier2 = e.getResources().getIdentifier("anythink_splash_count_time_can_skip_not", "string", a);
                int identifier3 = e.getResources().getIdentifier("anythink_splash_count_time_can_skip_s", "string", a);
                this.o = e.getResources().getString(identifier);
                String string = e.getResources().getString(identifier2);
                this.q = string;
                this.n = string;
                this.p = e.getResources().getString(identifier3);
                this.i.setBackgroundResource(e.getResources().getIdentifier("anythink_splash_close_bg", h.c, com.anythink.expressad.foundation.b.a.b().a()));
                this.i.setTextColor(e.getResources().getColor(e.getResources().getIdentifier("anythink_splash_count_time_skip_text_color", "color", a)));
            }
        }
    }

    public static /* synthetic */ int d(d dVar) {
        int i = dVar.m;
        dVar.m = i - 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        com.anythink.expressad.splash.d.d dVar = this.f;
        if (dVar != null) {
            dVar.c();
            this.f = null;
        }
        this.s = false;
        ATSplashView aTSplashView = this.e;
        if (aTSplashView != null) {
            aTSplashView.getSplashWebview();
        }
        Handler handler = this.a;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    private void k() {
        ATSplashWebview splashWebview;
        Handler handler;
        this.r = false;
        if (this.m > 0 && (handler = this.a) != null) {
            handler.removeMessages(1);
            this.a.sendEmptyMessageDelayed(1, 1000L);
        }
        ATSplashView aTSplashView = this.e;
        if (aTSplashView == null || (splashWebview = aTSplashView.getSplashWebview()) == null || splashWebview.isDestroyed()) {
            return;
        }
        SplashJsUtils.sendEventToH5(splashWebview, "onInstallAlertHide", "");
    }

    private void l() {
        ATSplashWebview splashWebview;
        Handler handler;
        this.r = true;
        if (this.m > 0 && (handler = this.a) != null) {
            handler.removeMessages(1);
        }
        ATSplashView aTSplashView = this.e;
        if (aTSplashView == null || (splashWebview = aTSplashView.getSplashWebview()) == null || splashWebview.isDestroyed()) {
            return;
        }
        SplashJsUtils.sendEventToH5(splashWebview, "onInstallAlertShow", "");
    }

    private void c(com.anythink.expressad.foundation.d.c cVar) {
        b(cVar, m.a().e(), this.k);
        c(cVar, m.a().e(), this.k);
        a(cVar, m.a().e(), this.k);
        cVar.c(true);
        f.a(this.k, cVar, f.f);
    }

    private void d(com.anythink.expressad.foundation.d.c cVar) {
        com.anythink.expressad.splash.d.d dVar = this.f;
        if (dVar != null) {
            dVar.a(cVar);
            j();
        }
    }

    private void f() {
        Context e = m.a().e();
        if (e != null) {
            String a = com.anythink.expressad.foundation.b.a.b().a();
            int identifier = e.getResources().getIdentifier("anythink_splash_count_time_can_skip", "string", a);
            int identifier2 = e.getResources().getIdentifier("anythink_splash_count_time_can_skip_not", "string", a);
            int identifier3 = e.getResources().getIdentifier("anythink_splash_count_time_can_skip_s", "string", a);
            this.o = e.getResources().getString(identifier);
            String string = e.getResources().getString(identifier2);
            this.q = string;
            this.n = string;
            this.p = e.getResources().getString(identifier3);
            this.i.setBackgroundResource(e.getResources().getIdentifier("anythink_splash_close_bg", h.c, com.anythink.expressad.foundation.b.a.b().a()));
            this.i.setTextColor(e.getResources().getColor(e.getResources().getIdentifier("anythink_splash_count_time_skip_text_color", "color", a)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void g() {
        if (this.d != null && !this.s) {
            boolean z = true;
            this.s = true;
            if (this.f != null && this.e != null) {
                Context context = this.t;
                if (context != null && (context instanceof Activity) && ((Activity) context).isFinishing()) {
                    this.f.b();
                    return;
                }
                this.f.a();
            }
            if (!this.d.V()) {
                if (!this.e.isDynamicView()) {
                    com.anythink.expressad.foundation.d.c cVar = this.d;
                    if (cVar.r()) {
                        z = false;
                    } else {
                        c(cVar, m.a().e(), this.k);
                        cVar.c(true);
                        f.a(this.k, cVar, f.f);
                    }
                    if (z) {
                        b(cVar, m.a().e(), this.k);
                        a(cVar, m.a().e(), this.k);
                    }
                    return;
                }
                com.anythink.expressad.foundation.d.c cVar2 = this.d;
                b(cVar2, m.a().e(), this.k);
                c(cVar2, m.a().e(), this.k);
                a(cVar2, m.a().e(), this.k);
                cVar2.c(true);
                f.a(this.k, cVar2, f.f);
            }
        }
    }

    private void h() {
        if (com.anythink.expressad.foundation.f.b.a().b() && !this.e.isDynamicView()) {
            com.anythink.expressad.foundation.f.b.a().a(this.k, new AnonymousClass6());
            FeedBackButton b = com.anythink.expressad.foundation.f.b.a().b(this.k);
            if (b != null) {
                RelativeLayout.LayoutParams layoutParams = null;
                try {
                    layoutParams = (RelativeLayout.LayoutParams) b.getLayoutParams();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (layoutParams == null) {
                    layoutParams = new RelativeLayout.LayoutParams(com.anythink.expressad.foundation.f.b.a, com.anythink.expressad.foundation.f.b.b);
                }
                layoutParams.topMargin = s.b(m.a().e(), 10.0f);
                layoutParams.leftMargin = s.b(m.a().e(), 10.0f);
                ViewGroup viewGroup = (ViewGroup) b.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(b);
                }
                this.e.addView(b, layoutParams);
            }
            this.d.j(this.k);
            com.anythink.expressad.foundation.f.b.a().a(this.k, this.d);
        }
    }

    private void i() {
        String str;
        if (this.h) {
            str = this.o + this.m + this.p;
        } else {
            str = this.m + this.q;
        }
        this.i.setText(str);
    }

    public final void a(com.anythink.expressad.splash.d.d dVar) {
        this.f = dVar;
    }

    public final void e() {
        Handler handler;
        if (this.m > 0 && (handler = this.a) != null) {
            handler.removeMessages(1);
        }
        ATSplashView aTSplashView = this.e;
        if (aTSplashView != null) {
            aTSplashView.onPause();
            ATSplashWebview splashWebview = this.e.getSplashWebview();
            if (splashWebview == null || splashWebview.isDestroyed()) {
                return;
            }
            SplashJsUtils.sendEventToH5(splashWebview, SplashJsUtils.a, "");
        }
    }

    public final void a(int i) {
        this.m = i;
    }

    public final String b() {
        com.anythink.expressad.foundation.d.c cVar = this.d;
        return (cVar == null || cVar.aa() == null) ? "" : this.d.aa();
    }

    public final void a(ViewGroup viewGroup) {
        if (viewGroup != null) {
            viewGroup.setOnClickListener(this.u);
        }
        this.j = viewGroup;
    }

    private void b(com.anythink.expressad.foundation.d.c cVar) {
        boolean z = true;
        if (cVar.r()) {
            z = false;
        } else {
            c(cVar, m.a().e(), this.k);
            cVar.c(true);
            f.a(this.k, cVar, f.f);
        }
        if (z) {
            b(cVar, m.a().e(), this.k);
            a(cVar, m.a().e(), this.k);
        }
    }

    public final void d() {
        Handler handler;
        if (this.r || com.anythink.expressad.foundation.f.b.c) {
            return;
        }
        if (this.m > 0 && (handler = this.a) != null) {
            handler.removeMessages(1);
            this.a.sendEmptyMessageDelayed(1, 1000L);
        }
        ATSplashView aTSplashView = this.e;
        if (aTSplashView != null) {
            aTSplashView.onResume();
            ATSplashWebview splashWebview = this.e.getSplashWebview();
            if (splashWebview == null || splashWebview.isDestroyed()) {
                return;
            }
            SplashJsUtils.sendEventToH5(splashWebview, SplashJsUtils.b, "");
        }
    }

    public final com.anythink.expressad.splash.d.a a() {
        return this.v;
    }

    private static void c(com.anythink.expressad.foundation.d.c cVar, Context context, String str) {
        com.anythink.expressad.foundation.b.a.b().b(context);
        if (!TextUtils.isEmpty(cVar.ai())) {
            com.anythink.expressad.a.a.a(context, cVar, str, cVar.ai(), false, true, com.anythink.expressad.a.a.a.i);
        }
        if (TextUtils.isEmpty(str) || cVar.J() == null || cVar.J().o() == null) {
            return;
        }
        com.anythink.expressad.a.a.a(context, cVar, str, cVar.J().o(), false);
    }

    public final void a(com.anythink.expressad.foundation.d.c cVar, ATSplashView aTSplashView) {
        a(this.h);
        this.d = cVar;
        this.e = aTSplashView;
        SplashJSBridgeImpl splashJSBridgeImpl = aTSplashView.getSplashJSBridgeImpl();
        SplashJSBridgeImpl splashJSBridgeImpl2 = splashJSBridgeImpl;
        if (splashJSBridgeImpl == null) {
            SplashJSBridgeImpl splashJSBridgeImpl3 = new SplashJSBridgeImpl(aTSplashView.getContext(), this.l, this.k);
            ArrayList arrayList = new ArrayList();
            arrayList.add(cVar);
            splashJSBridgeImpl3.setCampaignList(arrayList);
            splashJSBridgeImpl2 = splashJSBridgeImpl3;
        }
        splashJSBridgeImpl2.setCountdownS(this.m);
        splashJSBridgeImpl2.setAllowSkip(this.h ? 1 : 0);
        splashJSBridgeImpl2.setSplashBridgeListener(this.v);
        aTSplashView.setSplashJSBridgeImpl(splashJSBridgeImpl2);
        boolean r = cVar.r();
        View view = this.j;
        if (view == null) {
            if (r) {
                this.i.setVisibility(8);
            }
            i();
            b(this.i);
            aTSplashView.setCloseView(this.i);
        } else {
            if (r) {
                view.setVisibility(8);
            }
            b(this.j);
            aTSplashView.setCloseView(this.j);
        }
        aTSplashView.show();
        com.anythink.expressad.foundation.d.c cVar2 = this.d;
        if (cVar2 != null && cVar2.aA()) {
            aTSplashView.getSplashWebview();
        }
        aTSplashView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.anythink.expressad.splash.c.d.4
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view2) {
                m.a().a(new Runnable() { // from class: com.anythink.expressad.splash.c.d.4.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        d dVar = d.this;
                        if (d.a(dVar, dVar.e)) {
                            d.this.g();
                        }
                    }
                }, 100L);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view2) {
            }
        });
        m.a().a(new Runnable() { // from class: com.anythink.expressad.splash.c.d.5
            @Override // java.lang.Runnable
            public final void run() {
                d dVar = d.this;
                if (d.a(dVar, dVar.e)) {
                    d.this.g();
                }
            }
        }, 100L);
        b.a(this.d.be());
        this.a.removeMessages(1);
        this.a.sendEmptyMessageDelayed(1, 1000L);
        this.a.sendEmptyMessageDelayed(2, 1000L);
        if (!com.anythink.expressad.foundation.f.b.a().b() || this.e.isDynamicView()) {
            return;
        }
        com.anythink.expressad.foundation.f.b.a().a(this.k, new AnonymousClass6());
        FeedBackButton b = com.anythink.expressad.foundation.f.b.a().b(this.k);
        if (b != null) {
            RelativeLayout.LayoutParams layoutParams = null;
            try {
                layoutParams = (RelativeLayout.LayoutParams) b.getLayoutParams();
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (layoutParams == null) {
                layoutParams = new RelativeLayout.LayoutParams(com.anythink.expressad.foundation.f.b.a, com.anythink.expressad.foundation.f.b.b);
            }
            layoutParams.topMargin = s.b(m.a().e(), 10.0f);
            layoutParams.leftMargin = s.b(m.a().e(), 10.0f);
            ViewGroup viewGroup = (ViewGroup) b.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(b);
            }
            this.e.addView(b, layoutParams);
        }
        this.d.j(this.k);
        com.anythink.expressad.foundation.f.b.a().a(this.k, this.d);
    }

    private void b(int i) {
        ATSplashView aTSplashView = this.e;
        if (aTSplashView != null) {
            aTSplashView.updateCountdown(i);
            if (this.e.getSplashJSBridgeImpl() != null) {
                this.e.getSplashJSBridgeImpl().updateCountDown(i);
            }
        }
        if (i < 0) {
            this.m = i;
        } else if (this.j == null) {
            i();
        }
    }

    public final void c() {
        if (this.f != null) {
            this.f = null;
        }
        if (this.v != null) {
            this.v = null;
        }
        if (this.u != null) {
            this.u = null;
        }
        ATSplashView aTSplashView = this.e;
        if (aTSplashView != null) {
            aTSplashView.destroy();
        }
        com.anythink.expressad.foundation.f.b.a().c(this.k);
    }

    private void b(View view) {
        if (view != null) {
            view.setOnClickListener(this.u);
        }
    }

    private void b(com.anythink.expressad.foundation.d.c cVar, Context context, String str) {
        if (cVar != null) {
            try {
                if (TextUtils.isEmpty(cVar.ak())) {
                    return;
                }
                com.anythink.expressad.a.a.a(context, cVar, str, cVar.ak(), false, true, com.anythink.expressad.a.a.a.j);
            } catch (Throwable th) {
                n.d(this.c, th.getMessage());
            }
        }
    }

    private boolean a(View view) {
        return view != null && view.getVisibility() == 0 && view.getParent() != null && view.getWindowVisibility() == 0 && view.getGlobalVisibleRect(this.b) && ((long) this.b.height()) * ((long) this.b.width()) > 0;
    }

    private void a(String str) {
        com.anythink.expressad.splash.d.d dVar = this.f;
        if (dVar != null) {
            "web show failed:".concat(String.valueOf(str));
            dVar.b();
        }
    }

    public final void a(boolean z) {
        this.h = z;
        if (z) {
            this.n = this.o;
        } else {
            this.n = this.q;
        }
    }

    public final void a(com.anythink.expressad.foundation.d.c cVar) {
        if (cVar != null) {
            try {
                cVar.aC();
            } catch (Throwable th) {
                n.a(this.c, th.getMessage());
            }
        }
        com.anythink.expressad.splash.d.d dVar = this.f;
        if (dVar != null) {
            dVar.a(cVar);
            j();
        }
    }

    private void a(com.anythink.expressad.foundation.d.c cVar, Context context, String str) {
        if (cVar != null) {
            try {
                List<String> e = cVar.e();
                if (e == null || e.size() <= 0) {
                    return;
                }
                for (String str2 : e) {
                    com.anythink.expressad.a.a.a(context, cVar, str, str2, true);
                }
            } catch (Throwable th) {
                n.d(this.c, th.getMessage());
            }
        }
    }

    public static /* synthetic */ void a(d dVar, int i) {
        ATSplashView aTSplashView = dVar.e;
        if (aTSplashView != null) {
            aTSplashView.updateCountdown(i);
            if (dVar.e.getSplashJSBridgeImpl() != null) {
                dVar.e.getSplashJSBridgeImpl().updateCountDown(i);
            }
        }
        if (i < 0) {
            dVar.m = i;
        } else if (dVar.j == null) {
            dVar.i();
        }
    }

    public static /* synthetic */ void a(d dVar, String str) {
        com.anythink.expressad.splash.d.d dVar2 = dVar.f;
        if (dVar2 != null) {
            "web show failed:".concat(String.valueOf(str));
            dVar2.b();
        }
    }

    public static /* synthetic */ boolean a(d dVar, View view) {
        return view != null && view.getVisibility() == 0 && view.getParent() != null && view.getWindowVisibility() == 0 && view.getGlobalVisibleRect(dVar.b) && ((long) dVar.b.height()) * ((long) dVar.b.width()) > 0;
    }
}