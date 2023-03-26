package com.anythink.expressad.advanced.c;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.anythink.core.common.b.m;
import com.anythink.expressad.advanced.d.d;
import com.anythink.expressad.advanced.js.NativeAdvancedJSBridgeImpl;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.anythink.expressad.advanced.view.ATNativeAdvancedView;
import com.anythink.expressad.advanced.view.ATNativeAdvancedWebview;
import com.anythink.expressad.atsignalcommon.windvane.AbsFeedBackForH5;
import com.anythink.expressad.atsignalcommon.windvane.j;
import com.anythink.expressad.foundation.g.a.f;
import com.anythink.expressad.foundation.h.h;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.s;
import com.anythink.expressad.foundation.h.x;
import com.anythink.expressad.widget.FeedBackButton;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class b {
    private com.anythink.expressad.foundation.d.c c;
    private ATNativeAdvancedView d;
    private d e;
    private com.anythink.expressad.a.a f;
    private com.anythink.expressad.advanced.d.c g;
    private boolean h;
    private ImageView j;
    private String k;
    private String l;
    private boolean m;
    private String b = "NativeAdvancedShowManager";
    private int i = -1;
    private View.OnClickListener n = new View.OnClickListener() { // from class: com.anythink.expressad.advanced.c.b.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (b.this.h) {
                b.b(b.this);
            }
        }
    };
    public Handler a = new Handler(Looper.getMainLooper()) { // from class: com.anythink.expressad.advanced.c.b.2
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 2 && b.this.c != null && b.this.c.aA() && b.this.d != null) {
                b.this.d.getAdvancedNativeWebview();
            }
        }
    };
    private com.anythink.expressad.advanced.d.a o = new com.anythink.expressad.advanced.d.a() { // from class: com.anythink.expressad.advanced.c.b.3
        @Override // com.anythink.expressad.advanced.d.a
        public final void a(int i) {
            b.this.i = i;
            if (b.this.d != null) {
                b.this.d.changeCloseBtnState(i);
            }
        }

        @Override // com.anythink.expressad.advanced.d.a
        public final void b() {
        }

        @Override // com.anythink.expressad.advanced.d.a
        public final void b(int i) {
            n.d(b.this.b, "resetCountdown".concat(String.valueOf(i)));
        }

        @Override // com.anythink.expressad.advanced.d.a
        public final void c() {
        }

        @Override // com.anythink.expressad.advanced.d.a
        public final void d() {
            b.b(b.this);
        }

        @Override // com.anythink.expressad.advanced.d.a
        public final void a() {
            if (b.this.d != null) {
                b.this.d.setVisibility(8);
            }
            b.b(b.this);
        }

        @Override // com.anythink.expressad.advanced.d.a
        public final void a(com.anythink.expressad.foundation.d.c cVar) {
            b.this.a(cVar);
        }

        @Override // com.anythink.expressad.advanced.d.a
        public final void a(boolean z) {
            if (b.this.e != null) {
                b.this.m = z;
            }
        }

        @Override // com.anythink.expressad.advanced.d.a
        public final void a(String str) {
            try {
                if (b.this.e != null) {
                    if (TextUtils.isEmpty(str)) {
                        b.this.e.a(b.this.c);
                        return;
                    }
                    com.anythink.expressad.foundation.d.c b = com.anythink.expressad.foundation.d.c.b(com.anythink.expressad.foundation.d.c.a(b.this.c));
                    b.n(str);
                    b.this.a(b);
                }
            } catch (Exception e) {
                n.d(b.this.b, e.getMessage());
            }
        }
    };

    public b(Context context, String str, String str2) {
        this.k = str2;
        this.l = str;
        if (this.j == null) {
            ImageView imageView = new ImageView(context);
            this.j = imageView;
            imageView.setPadding(s.b(context, 2.0f), s.b(context, 2.0f), s.b(context, 2.0f), s.b(context, 2.0f));
            Context e = m.a().e();
            this.j.setScaleType(ImageView.ScaleType.FIT_XY);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.j.getLayoutParams();
            this.j.setLayoutParams(layoutParams == null ? new RelativeLayout.LayoutParams(s.b(e, 29.0f), s.b(e, 16.0f)) : layoutParams);
            this.j.setImageResource(e.getResources().getIdentifier("anythink_native_advanced_close_icon", h.c, com.anythink.expressad.foundation.b.a.b().a()));
        }
    }

    private void g() {
        if (this.c.V()) {
            return;
        }
        boolean z = true;
        this.c.c(true);
        com.anythink.expressad.foundation.d.c cVar = this.c;
        if (cVar.r()) {
            z = false;
        } else {
            Context e = m.a().e();
            String str = this.k;
            com.anythink.expressad.foundation.b.a.b().b(e);
            if (!TextUtils.isEmpty(cVar.ai())) {
                com.anythink.expressad.a.a.a(e, cVar, str, cVar.ai(), false, true, com.anythink.expressad.a.a.a.i);
            }
            if (!TextUtils.isEmpty(str) && cVar.J() != null && cVar.J().o() != null) {
                com.anythink.expressad.a.a.a(e, cVar, str, cVar.J().o(), false);
            }
            cVar.c(true);
            f.a(this.k, cVar, f.g);
        }
        if (z) {
            b(cVar, m.a().e(), this.k);
            a(cVar, m.a().e(), this.k);
        }
        d dVar = this.e;
        if (dVar != null) {
            dVar.a();
        }
    }

    private static void h() {
    }

    private void i() {
        d dVar = this.e;
        if (dVar != null) {
            dVar.c();
            this.e = null;
        }
    }

    private static /* synthetic */ void j() {
    }

    public final com.anythink.expressad.advanced.d.a b() {
        return this.o;
    }

    private void b(com.anythink.expressad.foundation.d.c cVar) {
        boolean z = true;
        if (cVar.r()) {
            z = false;
        } else {
            Context e = m.a().e();
            String str = this.k;
            com.anythink.expressad.foundation.b.a.b().b(e);
            if (!TextUtils.isEmpty(cVar.ai())) {
                com.anythink.expressad.a.a.a(e, cVar, str, cVar.ai(), false, true, com.anythink.expressad.a.a.a.i);
            }
            if (!TextUtils.isEmpty(str) && cVar.J() != null && cVar.J().o() != null) {
                com.anythink.expressad.a.a.a(e, cVar, str, cVar.J().o(), false);
            }
            cVar.c(true);
            f.a(this.k, cVar, f.g);
        }
        if (z) {
            b(cVar, m.a().e(), this.k);
            a(cVar, m.a().e(), this.k);
        }
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

    private void f() {
        Context e = m.a().e();
        this.j.setScaleType(ImageView.ScaleType.FIT_XY);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.j.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(s.b(e, 29.0f), s.b(e, 16.0f));
        }
        this.j.setLayoutParams(layoutParams);
        this.j.setImageResource(e.getResources().getIdentifier("anythink_native_advanced_close_icon", h.c, com.anythink.expressad.foundation.b.a.b().a()));
    }

    public final void d() {
        ATNativeAdvancedWebview advancedNativeWebview;
        if (this.d == null || com.anythink.expressad.foundation.f.b.c || (advancedNativeWebview = this.d.getAdvancedNativeWebview()) == null || advancedNativeWebview.isDestroyed()) {
            return;
        }
        NativeAdvancedJsUtils.sendEventToH5(advancedNativeWebview, NativeAdvancedJsUtils.b, "");
    }

    public final void e() {
        ATNativeAdvancedWebview advancedNativeWebview;
        ATNativeAdvancedView aTNativeAdvancedView = this.d;
        if (aTNativeAdvancedView == null || (advancedNativeWebview = aTNativeAdvancedView.getAdvancedNativeWebview()) == null || advancedNativeWebview.isDestroyed()) {
            return;
        }
        j.a();
        j.a((WebView) advancedNativeWebview, NativeAdvancedJsUtils.a, "");
    }

    public final void a(com.anythink.expressad.advanced.d.c cVar) {
        this.g = cVar;
    }

    public final void a(d dVar) {
        this.e = dVar;
    }

    public final String a() {
        com.anythink.expressad.foundation.d.c cVar = this.c;
        return (cVar == null || cVar.aa() == null) ? "" : this.c.aa();
    }

    public final void c() {
        if (this.e != null) {
            this.e = null;
        }
        if (this.o != null) {
            this.o = null;
        }
        if (this.n != null) {
            this.n = null;
        }
        ATNativeAdvancedView aTNativeAdvancedView = this.d;
        if (aTNativeAdvancedView != null) {
            aTNativeAdvancedView.destroy();
        }
        if (this.g != null) {
            this.g = null;
        }
        com.anythink.expressad.foundation.f.b.a().c(this.k);
    }

    public final void a(final com.anythink.expressad.foundation.d.c cVar, final ATNativeAdvancedView aTNativeAdvancedView, boolean z) {
        FeedBackButton b;
        if (aTNativeAdvancedView == null) {
            return;
        }
        com.anythink.expressad.foundation.f.b.a().a(this.k, new com.anythink.expressad.foundation.f.a() { // from class: com.anythink.expressad.advanced.c.b.4
            @Override // com.anythink.expressad.foundation.f.a
            public final void a() {
                String str;
                b.this.e();
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (m.a().e() != null) {
                        jSONObject.put("status", 1);
                    }
                    str = jSONObject.toString();
                } catch (Throwable th) {
                    n.b(b.this.b, th.getMessage(), th);
                    str = "";
                }
                String encodeToString = Base64.encodeToString(str.getBytes(), 2);
                j.a();
                j.a((WebView) aTNativeAdvancedView.getAdvancedNativeWebview(), AbsFeedBackForH5.m_, encodeToString);
            }

            @Override // com.anythink.expressad.foundation.f.a
            public final void b() {
                String str;
                b.this.d();
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (m.a().e() != null) {
                        jSONObject.put("status", 2);
                    }
                    str = jSONObject.toString();
                } catch (Throwable th) {
                    n.b(b.this.b, th.getMessage(), th);
                    str = "";
                }
                String encodeToString = Base64.encodeToString(str.getBytes(), 2);
                j.a();
                j.a((WebView) aTNativeAdvancedView.getAdvancedNativeWebview(), AbsFeedBackForH5.m_, encodeToString);
            }

            @Override // com.anythink.expressad.foundation.f.a
            public final void c() {
                String str;
                b.this.d();
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (m.a().e() != null) {
                        jSONObject.put("status", 2);
                    }
                    str = jSONObject.toString();
                } catch (Throwable th) {
                    n.b(b.this.b, th.getMessage(), th);
                    str = "";
                }
                String encodeToString = Base64.encodeToString(str.getBytes(), 2);
                j.a();
                j.a((WebView) aTNativeAdvancedView.getAdvancedNativeWebview(), AbsFeedBackForH5.m_, encodeToString);
            }
        });
        if (cVar.F() && com.anythink.expressad.foundation.f.b.a().b() && (b = com.anythink.expressad.foundation.f.b.a().b(this.k)) != null) {
            RelativeLayout.LayoutParams layoutParams = null;
            try {
                layoutParams = (RelativeLayout.LayoutParams) b.getLayoutParams();
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (layoutParams == null) {
                layoutParams = new RelativeLayout.LayoutParams(com.anythink.expressad.foundation.f.b.a, com.anythink.expressad.foundation.f.b.b);
            }
            layoutParams.addRule(12);
            ViewGroup viewGroup = (ViewGroup) b.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(b);
            }
            aTNativeAdvancedView.addView(b, layoutParams);
        }
        this.h = this.h;
        this.c = cVar;
        this.d = aTNativeAdvancedView;
        NativeAdvancedJSBridgeImpl advancedNativeJSBridgeImpl = aTNativeAdvancedView.getAdvancedNativeJSBridgeImpl();
        NativeAdvancedJSBridgeImpl nativeAdvancedJSBridgeImpl = advancedNativeJSBridgeImpl;
        if (advancedNativeJSBridgeImpl == null) {
            NativeAdvancedJSBridgeImpl nativeAdvancedJSBridgeImpl2 = new NativeAdvancedJSBridgeImpl(aTNativeAdvancedView.getContext(), this.l, this.k);
            ArrayList arrayList = new ArrayList();
            arrayList.add(cVar);
            nativeAdvancedJSBridgeImpl2.setCampaignList(arrayList);
            nativeAdvancedJSBridgeImpl = nativeAdvancedJSBridgeImpl2;
        }
        nativeAdvancedJSBridgeImpl.setAllowSkip(this.h ? 1 : 0);
        nativeAdvancedJSBridgeImpl.setNativeAdvancedBridgeListener(this.o);
        aTNativeAdvancedView.setAdvancedNativeJSBridgeImpl(nativeAdvancedJSBridgeImpl);
        if (cVar.r() || !this.h) {
            this.j.setVisibility(8);
        }
        ImageView imageView = this.j;
        if (imageView != null) {
            imageView.setOnClickListener(this.n);
        }
        aTNativeAdvancedView.setCloseView(this.j);
        boolean z2 = false;
        if (aTNativeAdvancedView.getVisibility() != 0) {
            aTNativeAdvancedView.setVisibility(0);
        }
        boolean a = x.a(aTNativeAdvancedView.getAdvancedNativeWebview());
        com.anythink.expressad.advanced.d.c cVar2 = this.g;
        if (cVar2 == null || a || cVar2.c() == null || this.g.c().getAlpha() < 0.5f || this.g.c().getVisibility() != 0 || this.m) {
            if (z) {
                aTNativeAdvancedView.postDelayed(new Runnable() { // from class: com.anythink.expressad.advanced.c.b.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.this.a(cVar, aTNativeAdvancedView, false);
                    }
                }, 200L);
                return;
            }
            return;
        }
        aTNativeAdvancedView.show();
        com.anythink.expressad.foundation.b.a.b().b(aTNativeAdvancedView.getContext());
        cVar.j(this.k);
        com.anythink.expressad.foundation.f.b.a().a(this.k, cVar);
        com.anythink.expressad.foundation.d.c cVar3 = this.c;
        if (cVar3 != null && cVar3.aA()) {
            aTNativeAdvancedView.getAdvancedNativeWebview();
            try {
                com.anythink.expressad.advanced.a.a.c(cVar.aa());
            } catch (Throwable th) {
                n.a("OMSDK", th.getMessage());
                com.anythink.expressad.foundation.d.c cVar4 = this.c;
                if (cVar4 != null) {
                    cVar4.aa();
                    this.c.ab();
                }
            }
        }
        if (!this.c.V()) {
            this.c.c(true);
            com.anythink.expressad.foundation.d.c cVar5 = this.c;
            if (!cVar5.r()) {
                Context e2 = m.a().e();
                String str = this.k;
                com.anythink.expressad.foundation.b.a.b().b(e2);
                if (!TextUtils.isEmpty(cVar5.ai())) {
                    com.anythink.expressad.a.a.a(e2, cVar5, str, cVar5.ai(), false, true, com.anythink.expressad.a.a.a.i);
                }
                if (!TextUtils.isEmpty(str) && cVar5.J() != null && cVar5.J().o() != null) {
                    com.anythink.expressad.a.a.a(e2, cVar5, str, cVar5.J().o(), false);
                }
                cVar5.c(true);
                f.a(this.k, cVar5, f.g);
                z2 = true;
            }
            if (z2) {
                b(cVar5, m.a().e(), this.k);
                a(cVar5, m.a().e(), this.k);
            }
            d dVar = this.e;
            if (dVar != null) {
                dVar.a();
            }
        }
        int i = this.i;
        if (i != -1) {
            aTNativeAdvancedView.changeCloseBtnState(i);
        }
        com.anythink.expressad.advanced.a.a.c(cVar.aa());
        this.a.sendEmptyMessageDelayed(2, 1000L);
    }

    private void b(com.anythink.expressad.foundation.d.c cVar, Context context, String str) {
        if (cVar != null) {
            try {
                if (TextUtils.isEmpty(cVar.ak())) {
                    return;
                }
                com.anythink.expressad.a.a.a(context, cVar, str, cVar.ak(), false, true, com.anythink.expressad.a.a.a.j);
            } catch (Throwable th) {
                n.d(this.b, th.getMessage());
            }
        }
    }

    public static /* synthetic */ void b(b bVar) {
        d dVar = bVar.e;
        if (dVar != null) {
            dVar.c();
            bVar.e = null;
        }
    }

    public final void a(boolean z) {
        this.h = z;
    }

    public final void a(com.anythink.expressad.foundation.d.c cVar) {
        cVar.j(this.k);
        d dVar = this.e;
        if (dVar != null) {
            dVar.a(cVar);
        }
    }

    private void a(View view) {
        if (view != null) {
            view.setOnClickListener(this.n);
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
                n.d(this.b, th.getMessage());
            }
        }
    }
}