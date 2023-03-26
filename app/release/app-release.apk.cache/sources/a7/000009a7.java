package com.anythink.expressad.video.bt.module;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.anythink.core.common.b.m;
import com.anythink.expressad.atsignalcommon.windvane.AbsFeedBackForH5;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.g.a.f;
import com.anythink.expressad.foundation.h.g;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.s;
import com.anythink.expressad.out.j;
import com.anythink.expressad.video.bt.module.b.h;
import com.anythink.expressad.video.signal.a.c;
import com.anythink.expressad.video.signal.b;
import com.anythink.expressad.video.signal.container.AbstractJSContainer;
import com.anythink.expressad.videocommon.a;
import com.anythink.expressad.videocommon.e.d;
import com.anythink.expressad.widget.FeedBackButton;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.p7700g.p99005.rs2;
import com.p7700g.p99005.wo1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AnythinkBTContainer extends AbstractJSContainer implements b {
    private static final String d = AnythinkBTContainer.class.getSimpleName();
    private Context A;
    private boolean B;
    private boolean C;
    private String D;
    private boolean E;
    private List<c> F;
    private List<com.anythink.expressad.videocommon.b.a> G;
    private com.anythink.expressad.video.bt.module.a.a H;
    private h I;
    private h J;
    private com.anythink.expressad.video.bt.module.a.b K;
    private String L;
    private String M;
    private boolean N;
    private int O;
    private boolean P;
    private int Q;
    private String R;
    private com.anythink.expressad.video.dynview.e.a S;
    public c a;
    private int e;
    private int f;
    private FrameLayout g;
    private AnythinkBTLayout h;
    private WindVaneWebView i;
    private LayoutInflater j;

    /* loaded from: classes2.dex */
    public class a extends c.a {
        private a() {
        }

        @Override // com.anythink.expressad.video.signal.a.c.a, com.anythink.expressad.out.p.c
        public final void a(com.anythink.expressad.foundation.d.c cVar, String str) {
            super.a(cVar, str);
        }

        @Override // com.anythink.expressad.video.signal.a.c.a, com.anythink.expressad.video.signal.c.a
        public final void b() {
            super.b();
        }

        @Override // com.anythink.expressad.video.signal.a.c.a, com.anythink.expressad.video.signal.c.a
        public final void c() {
            super.c();
        }

        public /* synthetic */ a(AnythinkBTContainer anythinkBTContainer, byte b) {
            this();
        }

        @Override // com.anythink.expressad.video.signal.a.c.a, com.anythink.expressad.out.p.c
        public final void a(j jVar, String str) {
            super.a(jVar, str);
            if (jVar == null || !(jVar instanceof com.anythink.expressad.foundation.d.c)) {
                return;
            }
            try {
                com.anythink.expressad.foundation.d.c cVar = (com.anythink.expressad.foundation.d.c) jVar;
                String optString = new JSONObject(AnythinkBTContainer.this.getJSVideoModule().getCurrentProgress()).optString("progress", "");
                if (cVar.P() == 3 && cVar.A() == 2 && optString.equals("1.0") && AnythinkBTContainer.this.l != null) {
                    if (!AnythinkBTContainer.this.C) {
                        AnythinkBTContainer.this.l.finish();
                    } else {
                        AnythinkBTContainer.this.onAdClose();
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        @Override // com.anythink.expressad.video.signal.a.c.a, com.anythink.expressad.out.p.c
        public final void b(j jVar, String str) {
            super.b(jVar, str);
        }

        @Override // com.anythink.expressad.video.signal.a.c.a, com.anythink.expressad.video.signal.c.a
        public final void a(com.anythink.expressad.foundation.d.c cVar, boolean z) {
            super.a(cVar, z);
            AnythinkBTContainer.this.J.a(cVar);
        }

        @Override // com.anythink.expressad.video.signal.a.c.a, com.anythink.expressad.video.signal.c.a
        public final void a(int i, String str) {
            super.a(i, str);
        }
    }

    public AnythinkBTContainer(Context context) {
        super(context);
        this.e = 0;
        this.f = 1;
        this.B = false;
        this.C = true;
        this.E = false;
        this.O = 1;
        init(context);
    }

    private static boolean e() {
        return true;
    }

    private static int f() {
        return 1;
    }

    public void appendSubView(AnythinkBTContainer anythinkBTContainer, ATTempContainer aTTempContainer, JSONObject jSONObject) {
        try {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            if (jSONObject != null) {
                Context e = m.a().e();
                int optInt = jSONObject.optInt("left", -999);
                int optInt2 = jSONObject.optInt("top", -999);
                int optInt3 = jSONObject.optInt("right", -999);
                int optInt4 = jSONObject.optInt("bottom", -999);
                if (optInt != -999 && e != null) {
                    layoutParams.leftMargin = s.b(e, optInt);
                }
                if (optInt2 != -999 && e != null) {
                    layoutParams.topMargin = s.b(e, optInt2);
                }
                if (optInt3 != -999 && e != null) {
                    layoutParams.rightMargin = s.b(e, optInt3);
                }
                if (optInt4 != -999 && e != null) {
                    layoutParams.bottomMargin = s.b(e, optInt4);
                }
                int optInt5 = jSONObject.optInt("width");
                int optInt6 = jSONObject.optInt("height");
                if (optInt5 > 0) {
                    layoutParams.width = optInt5;
                }
                if (optInt6 > 0) {
                    layoutParams.height = optInt6;
                }
            }
            anythinkBTContainer.addView(aTTempContainer, layoutParams);
            aTTempContainer.setActivity(this.l);
            aTTempContainer.setMute(this.s);
            aTTempContainer.setBidCampaign(this.B);
            aTTempContainer.setIV(this.t);
            aTTempContainer.setBigOffer(this.C);
            aTTempContainer.setIVRewardEnable(this.v, this.w, this.x);
            aTTempContainer.setShowRewardListener(this.J);
            aTTempContainer.setCampaignDownLoadTask(d(aTTempContainer.getCampaign()));
            aTTempContainer.setAnythinkTempCallback(c());
            aTTempContainer.setH5Cbp(getJSCommon().e());
            aTTempContainer.setWebViewFront(getJSCommon().f());
            aTTempContainer.init(this.A);
            aTTempContainer.onCreate();
        } catch (Throwable th) {
            n.a(d, th.getMessage());
        }
    }

    public void broadcast(String str, JSONObject jSONObject) {
        if (this.i != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", this.e);
                jSONObject2.put("id", this.D);
                jSONObject2.put("eventName", str);
                jSONObject2.put("data", jSONObject);
                com.anythink.expressad.atsignalcommon.windvane.j.a();
                com.anythink.expressad.atsignalcommon.windvane.j.a((WebView) this.i, "broadcast", Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            } catch (Exception unused) {
                com.anythink.expressad.video.bt.a.c.a();
                com.anythink.expressad.video.bt.a.c.a((WebView) this.i, "broadcast", this.D);
            }
        }
    }

    @Override // com.anythink.expressad.video.signal.d
    public void click(int i, String str) {
    }

    public int findID(String str) {
        return com.anythink.expressad.foundation.h.h.a(getContext(), str, "id");
    }

    public int findLayout(String str) {
        return com.anythink.expressad.foundation.h.h.a(getContext(), str, "layout");
    }

    @Override // com.anythink.expressad.video.signal.d
    public void handlerH5Exception(int i, String str) {
    }

    public void init(Context context) {
        this.A = context;
        this.j = LayoutInflater.from(context);
    }

    public boolean isNativeKilledCallback(com.anythink.expressad.foundation.d.c cVar) {
        if (getJSCommon().e() != 1 && cVar != null) {
            if (cVar.m() == 1) {
                d dVar = this.o;
                if (dVar != null) {
                    if (dVar.L() == 1) {
                        cVar.l(1);
                        return true;
                    }
                    cVar.l(0);
                    return false;
                }
            } else if (cVar.y()) {
                cVar.l(0);
                return false;
            } else {
                int a2 = this.o.a();
                cVar.l(a2);
                if (a2 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public void onAdClose() {
        Activity activity = this.l;
        if (activity != null) {
            activity.finish();
        }
    }

    public void onBackPressed() {
        try {
            LinkedHashMap<String, View> b = com.anythink.expressad.video.bt.a.c.a().b(this.m, this.M);
            if (b == null || b.size() <= 0) {
                return;
            }
            for (View view : b.values()) {
                if (view instanceof ATTempContainer) {
                    ((ATTempContainer) view).onBackPressed();
                } else if (view instanceof AnythinkBTWebView) {
                    ((AnythinkBTWebView) view).onBackPressed();
                } else if (view instanceof AnythinkBTLayout) {
                    ((AnythinkBTLayout) view).onBackPressed();
                }
            }
        } catch (Throwable th) {
            n.a(d, th.getMessage());
        }
    }

    @Override // com.anythink.expressad.video.signal.container.AbstractJSContainer, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        try {
            LinkedHashMap<String, View> b = com.anythink.expressad.video.bt.a.c.a().b(this.m, this.M);
            if (b == null || b.size() <= 0) {
                return;
            }
            for (View view : b.values()) {
                if (view instanceof ATTempContainer) {
                    ((ATTempContainer) view).onConfigurationChanged(configuration);
                } else if (view instanceof AnythinkBTWebView) {
                    ((AnythinkBTWebView) view).onConfigurationChanged(configuration);
                } else if (view instanceof AnythinkBTLayout) {
                    ((AnythinkBTLayout) view).onConfigurationChanged(configuration);
                }
            }
        } catch (Throwable th) {
            n.a(d, th.getMessage());
        }
    }

    public void onCreate() {
        String str;
        WindVaneWebView windVaneWebView;
        com.anythink.expressad.foundation.d.c cVar;
        try {
            int findLayout = findLayout("anythink_bt_container");
            if (findLayout < 0) {
                a("anythink_bt_container layout null");
                return;
            }
            FrameLayout frameLayout = (FrameLayout) this.j.inflate(findLayout, this);
            this.g = frameLayout;
            if (frameLayout == null) {
                a("ViewIds null");
                return;
            }
            this.M = "";
            List<com.anythink.expressad.foundation.d.c> list = this.F;
            if (list == null || list.size() <= 0) {
                str = "";
            } else {
                com.anythink.expressad.foundation.d.c cVar2 = this.F.get(0);
                str = cVar2.au();
                this.M = cVar2.aa();
            }
            a.C0082a a2 = com.anythink.expressad.videocommon.a.a(this.m + "_" + this.M + "_" + str);
            RelativeLayout.LayoutParams layoutParams = null;
            if (a2 != null) {
                this.D = a2.b();
                n.a(d, "get BT wraper.getTag = " + this.D);
                a2.a("");
                windVaneWebView = a2.a();
            } else {
                windVaneWebView = null;
            }
            this.i = windVaneWebView;
            com.anythink.expressad.videocommon.a.b(this.m + "_" + this.M + "_" + str);
            WindVaneWebView windVaneWebView2 = this.i;
            if (windVaneWebView2 != null) {
                com.anythink.expressad.video.signal.factory.b bVar = new com.anythink.expressad.video.signal.factory.b(this.l, this, windVaneWebView2);
                registerJsFactory(bVar);
                this.i.setApiManagerJSFactory(bVar);
                if (this.i.getParent() != null) {
                    a("preload template webview is null or load error");
                    return;
                }
                if (this.i.getObject() instanceof com.anythink.expressad.video.signal.a.j) {
                    bVar.a((com.anythink.expressad.video.signal.a.j) this.i.getObject());
                    if (this.i != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(com.anythink.expressad.foundation.g.a.ch, s.c(getContext()));
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("name", this.q.a());
                            jSONObject2.put("amount", this.q.b());
                            jSONObject2.put("id", this.r);
                            jSONObject.put(DataKeys.USER_ID, this.p);
                            jSONObject.put("reward", jSONObject2);
                            jSONObject.put("playVideoMute", this.s);
                            jSONObject.put("extra", this.R);
                        } catch (JSONException e) {
                            n.a(d, e.getMessage());
                        } catch (Exception e2) {
                            n.a(d, e2.getMessage());
                        }
                        this.J = new com.anythink.expressad.video.bt.module.b.d(c(), "");
                        getJSNotifyProxy().a(jSONObject.toString());
                        getJSCommon().h();
                        getJSCommon().a(new a(this, (byte) 0));
                    }
                    ((com.anythink.expressad.video.signal.a.c) getJSCommon()).r.b();
                }
                this.i.setBackgroundColor(0);
                LinkedHashMap<String, View> b = com.anythink.expressad.video.bt.a.c.a().b(this.m, this.M);
                if (b != null && b.containsKey(this.D)) {
                    View view = b.get(this.D);
                    if (view instanceof AnythinkBTLayout) {
                        AnythinkBTLayout anythinkBTLayout = (AnythinkBTLayout) view;
                        this.h = anythinkBTLayout;
                        anythinkBTLayout.addView(this.i, 0, new FrameLayout.LayoutParams(-1, -1));
                        com.anythink.expressad.foundation.f.b.a().a(this.m + "_1", new com.anythink.expressad.foundation.f.a() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTContainer.1
                            @Override // com.anythink.expressad.foundation.f.a
                            public final void a() {
                                String str2;
                                try {
                                    JSONObject jSONObject3 = new JSONObject();
                                    if (m.a().e() != null) {
                                        jSONObject3.put("status", 1);
                                    }
                                    str2 = jSONObject3.toString();
                                } catch (Throwable th) {
                                    n.b(AnythinkBTContainer.d, th.getMessage(), th);
                                    str2 = "";
                                }
                                String encodeToString = Base64.encodeToString(str2.getBytes(), 2);
                                com.anythink.expressad.atsignalcommon.windvane.j.a();
                                com.anythink.expressad.atsignalcommon.windvane.j.a((WebView) AnythinkBTContainer.this.i, AbsFeedBackForH5.m_, encodeToString);
                            }

                            @Override // com.anythink.expressad.foundation.f.a
                            public final void b() {
                                String str2;
                                try {
                                    JSONObject jSONObject3 = new JSONObject();
                                    if (m.a().e() != null) {
                                        jSONObject3.put("status", 2);
                                    }
                                    str2 = jSONObject3.toString();
                                } catch (Throwable th) {
                                    n.b(AnythinkBTContainer.d, th.getMessage(), th);
                                    str2 = "";
                                }
                                String encodeToString = Base64.encodeToString(str2.getBytes(), 2);
                                com.anythink.expressad.atsignalcommon.windvane.j.a();
                                com.anythink.expressad.atsignalcommon.windvane.j.a((WebView) AnythinkBTContainer.this.i, AbsFeedBackForH5.m_, encodeToString);
                            }

                            @Override // com.anythink.expressad.foundation.f.a
                            public final void c() {
                                String str2;
                                try {
                                    JSONObject jSONObject3 = new JSONObject();
                                    if (m.a().e() != null) {
                                        jSONObject3.put("status", 2);
                                    }
                                    str2 = jSONObject3.toString();
                                } catch (Throwable th) {
                                    n.b(AnythinkBTContainer.d, th.getMessage(), th);
                                    str2 = "";
                                }
                                String encodeToString = Base64.encodeToString(str2.getBytes(), 2);
                                com.anythink.expressad.atsignalcommon.windvane.j.a();
                                com.anythink.expressad.atsignalcommon.windvane.j.a((WebView) AnythinkBTContainer.this.i, AbsFeedBackForH5.m_, encodeToString);
                            }
                        });
                        com.anythink.expressad.foundation.f.b.a().c(this.m + "_2");
                        FeedBackButton b2 = com.anythink.expressad.foundation.f.b.a().b(this.m + "_1");
                        if (com.anythink.expressad.foundation.f.b.a().b() && b2 != null) {
                            try {
                                layoutParams = (RelativeLayout.LayoutParams) b2.getLayoutParams();
                            } catch (Exception e3) {
                                e3.printStackTrace();
                            }
                            if (layoutParams == null) {
                                layoutParams = new RelativeLayout.LayoutParams(com.anythink.expressad.foundation.f.b.a, com.anythink.expressad.foundation.f.b.b);
                            }
                            layoutParams.topMargin = s.b(m.a().e(), 10.0f);
                            layoutParams.leftMargin = s.b(m.a().e(), 10.0f);
                            b2.setLayoutParams(layoutParams);
                            ViewGroup viewGroup = (ViewGroup) b2.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(b2);
                            }
                            this.h.addView(b2);
                        }
                        this.h.setTag(this.D);
                        b.put(this.D, this.h);
                        Iterator<View> it = b.values().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            View next = it.next();
                            if (next instanceof AnythinkBTRootLayout) {
                                AnythinkBTRootLayout anythinkBTRootLayout = (AnythinkBTRootLayout) next;
                                this.L = anythinkBTRootLayout.getInstanceId();
                                this.g.addView(anythinkBTRootLayout, new FrameLayout.LayoutParams(-1, -1));
                                break;
                            }
                        }
                        b.remove(this.L);
                        b.put(this.L, this);
                    }
                    com.anythink.expressad.video.bt.a.c.a();
                    com.anythink.expressad.video.bt.a.c.a(this.m, this.s);
                    com.anythink.expressad.video.bt.a.c.a();
                    com.anythink.expressad.video.bt.a.c.a(this.D, this.M);
                    com.anythink.expressad.video.bt.a.c.a();
                    com.anythink.expressad.video.bt.a.c.a(this.L, this.M);
                    com.anythink.expressad.video.bt.a.c.a();
                    com.anythink.expressad.video.bt.a.c.a(this.m + "_" + this.M, this.l);
                    List<com.anythink.expressad.foundation.d.c> list2 = this.F;
                    if (list2 == null || list2.size() <= 0) {
                        return;
                    }
                    a(this.o, this.F.get(0));
                    return;
                }
                a("big template webviewLayout is null");
                return;
            }
            List<com.anythink.expressad.foundation.d.c> list3 = this.F;
            if (list3 != null && list3.size() > 0 && (cVar = this.F.get(0)) != null && cVar.j()) {
                Context context = this.A;
                if (this.S == null) {
                    a("ChoiceOneCallback is null");
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put(com.anythink.expressad.video.dynview.a.a.v, this.S);
                com.anythink.expressad.video.dynview.b.a();
                com.anythink.expressad.video.dynview.b.a(context, this.F, new AnonymousClass2(), hashMap);
                return;
            }
            a("big template webview is null");
        } catch (Throwable th) {
            a("onCreate exception ".concat(String.valueOf(th)));
        }
    }

    @Override // com.anythink.expressad.video.signal.container.AbstractJSContainer
    public void onDestroy() {
        if (this.E) {
            return;
        }
        this.E = true;
        super.onDestroy();
        com.anythink.expressad.video.bt.a.c.a();
        com.anythink.expressad.video.bt.a.c.d(this.m + "_" + this.M);
        d();
        try {
            WindVaneWebView windVaneWebView = this.i;
            if (windVaneWebView != null) {
                ViewGroup viewGroup = (ViewGroup) windVaneWebView.getParent();
                if (viewGroup != null) {
                    viewGroup.removeAllViews();
                }
                this.i.clearWebView();
                this.i.release();
            }
            if (this.K != null) {
                this.K = null;
            }
            if (this.H != null) {
                this.H = null;
            }
            if (this.A != null) {
                this.A = null;
            }
            List<com.anythink.expressad.foundation.d.c> list = this.F;
            if (list != null && list.size() > 0) {
                for (com.anythink.expressad.foundation.d.c cVar : this.F) {
                    if (cVar != null && cVar.L() != null) {
                        com.anythink.expressad.videocommon.a.b(this.m + "_" + cVar.aa() + "_" + cVar.L().e());
                    }
                }
            }
            com.anythink.expressad.video.bt.a.c.a();
            com.anythink.expressad.video.bt.a.c.f(this.D);
            com.anythink.expressad.video.bt.a.c.a();
            com.anythink.expressad.video.bt.a.c.g(this.m);
            com.anythink.expressad.video.bt.a.c.a().b(this.m, this.M).remove(this.D);
            com.anythink.expressad.video.bt.a.c.a().b(this.m, this.M).remove(this.L);
            com.anythink.expressad.video.bt.a.c.a().b(this.m, this.M).clear();
        } catch (Throwable th) {
            n.a(d, th.getMessage());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // com.anythink.expressad.video.signal.container.AbstractJSContainer
    public void onPause() {
        super.onPause();
        try {
            LinkedHashMap<String, View> b = com.anythink.expressad.video.bt.a.c.a().b(this.m, this.M);
            if (b == null || b.size() <= 0) {
                return;
            }
            for (View view : b.values()) {
                if (view instanceof AnythinkBTVideoView) {
                    ((AnythinkBTVideoView) view).onPause();
                }
            }
        } catch (Throwable th) {
            n.a(d, th.getMessage());
        }
    }

    @Override // com.anythink.expressad.video.signal.container.AbstractJSContainer
    public void onResume() {
        super.onResume();
        if (com.anythink.expressad.foundation.f.b.c) {
            return;
        }
        try {
            LinkedHashMap<String, View> b = com.anythink.expressad.video.bt.a.c.a().b(this.m, this.M);
            if (b == null || b.size() <= 0) {
                return;
            }
            for (View view : b.values()) {
                if (view instanceof AnythinkBTVideoView) {
                    ((AnythinkBTVideoView) view).onResume();
                }
            }
        } catch (Throwable th) {
            n.a(d, th.getMessage());
        }
    }

    @Override // com.anythink.expressad.video.signal.container.AbstractJSContainer
    public void onStop() {
        super.onStop();
        try {
            LinkedHashMap<String, View> b = com.anythink.expressad.video.bt.a.c.a().b(this.m, this.M);
            if (b == null || b.size() <= 0) {
                return;
            }
            for (View view : b.values()) {
                if (view instanceof AnythinkBTVideoView) {
                    ((AnythinkBTVideoView) view).onStop();
                }
            }
        } catch (Throwable th) {
            n.a(d, th.getMessage());
        }
    }

    @Override // com.anythink.expressad.video.signal.b
    public void reactDeveloper(Object obj, String str) {
        int i;
        if (this.H != null && !TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt("type");
                int optInt2 = jSONObject.optInt("hit");
                String optString = jSONObject.optString("unitId", getUnitId());
                jSONObject.optString(com.anythink.expressad.a.y, getPlacementId());
                JSONObject optJSONObject = jSONObject.optJSONObject("data");
                com.anythink.expressad.foundation.d.c cVar = this.F.get(0);
                boolean z = true;
                if (optInt == 1) {
                    boolean optBoolean = optJSONObject.optBoolean("expired");
                    if (cVar != null) {
                        if (optBoolean) {
                            cVar.d(1);
                        } else {
                            cVar.d(0);
                        }
                    }
                    this.N = isNativeKilledCallback(cVar);
                }
                switch (optInt) {
                    case 1:
                        this.H.a();
                        break;
                    case 2:
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("error");
                        String optString2 = optJSONObject2 != null ? optJSONObject2.optString("msg") : "";
                        if (TextUtils.isEmpty(optString2)) {
                            optString2 = optJSONObject.optString("error");
                        }
                        if (!this.N && optInt2 != this.O) {
                            this.H.a(optString2);
                            break;
                        }
                        break;
                    case 3:
                        this.H.b();
                        break;
                    case 4:
                        this.H.c();
                        break;
                    case 5:
                        com.anythink.expressad.video.bt.module.a.a aVar = this.H;
                        com.anythink.expressad.foundation.d.c cVar2 = this.a;
                        if (cVar2 != null) {
                            cVar = cVar2;
                        }
                        aVar.a(cVar);
                        break;
                    case 6:
                        if (optJSONObject.optInt("convert") != 1) {
                            z = false;
                        }
                        JSONObject optJSONObject3 = optJSONObject.optJSONObject("reward");
                        com.anythink.expressad.foundation.d.c b = com.anythink.expressad.foundation.d.c.b(optJSONObject.optJSONObject(rs2.f.f));
                        com.anythink.expressad.videocommon.c.c a2 = com.anythink.expressad.videocommon.c.c.a(optJSONObject3);
                        if (a2 == null) {
                            a2 = this.q;
                        }
                        String optString3 = optJSONObject.optString("extra");
                        if (!TextUtils.isEmpty(optString3)) {
                            this.R = optString3;
                        }
                        if (!this.N && optInt2 != this.O) {
                            if (this.t && ((i = this.v) == com.anythink.expressad.foundation.g.a.cr || i == com.anythink.expressad.foundation.g.a.cs)) {
                                this.H.a(this.P, this.Q);
                            }
                            if (!z) {
                                a2.a(0);
                            }
                            this.H.a(z, a2);
                            n.a(d, "sendToServerRewardInfo");
                            if (!this.t && z) {
                                if (b != null) {
                                    com.anythink.expressad.video.module.b.a.a(b, a2, optString, this.p, this.R);
                                    break;
                                } else {
                                    com.anythink.expressad.video.module.b.a.a(cVar, a2, optString, this.p, this.R);
                                    break;
                                }
                            }
                        }
                        break;
                }
                a(obj);
                return;
            } catch (JSONException e) {
                AbstractJSContainer.a(obj, e.getMessage());
                n.a(d, e.getMessage());
                return;
            }
        }
        AbstractJSContainer.a(obj, "listener is null");
    }

    public void setBTContainerCallback(com.anythink.expressad.video.bt.module.a.a aVar) {
        this.H = aVar;
    }

    public void setCampaignDownLoadTasks(List<com.anythink.expressad.videocommon.b.a> list) {
        this.G = list;
    }

    public void setCampaigns(List<com.anythink.expressad.foundation.d.c> list) {
        this.F = list;
    }

    public void setChoiceOneCallback(com.anythink.expressad.video.dynview.e.a aVar) {
        this.S = aVar;
    }

    public void setDeveloperExtraData(String str) {
        this.R = str;
    }

    public void setJSFactory(com.anythink.expressad.video.signal.factory.b bVar) {
        this.z = bVar;
    }

    public void setNotchPadding(int i, int i2, int i3, int i4, int i5) {
        try {
            String a2 = g.a(i, i2, i3, i4, i5);
            n.d(d, a2);
            WindVaneWebView windVaneWebView = this.i;
            if (windVaneWebView != null && (windVaneWebView.getObject() instanceof com.anythink.expressad.video.signal.a.j) && !TextUtils.isEmpty(a2)) {
                ((com.anythink.expressad.video.signal.a.j) this.i.getObject()).b(a2);
                com.anythink.expressad.atsignalcommon.windvane.j.a();
                com.anythink.expressad.atsignalcommon.windvane.j.a((WebView) this.i, "oncutoutfetched", Base64.encodeToString(a2.getBytes(), 0));
            }
            com.anythink.expressad.video.bt.a.c.a();
            com.anythink.expressad.video.bt.a.c.a(i, i2, i3, i4, i5);
            LinkedHashMap<String, View> b = com.anythink.expressad.video.bt.a.c.a().b(this.m, this.M);
            if (b == null || b.size() <= 0) {
                return;
            }
            for (View view : b.values()) {
                if (view instanceof AnythinkBTVideoView) {
                    ((AnythinkBTVideoView) view).setNotchPadding(i2, i3, i4, i5);
                }
                if (view instanceof ATTempContainer) {
                    ((ATTempContainer) view).setNotchPadding(i, i2, i3, i4, i5);
                }
                if ((view instanceof WindVaneWebView) && !TextUtils.isEmpty(a2)) {
                    com.anythink.expressad.atsignalcommon.windvane.j.a().a(view, "oncutoutfetched", Base64.encodeToString(a2.getBytes(), 0));
                }
            }
        } catch (Throwable th) {
            n.a(d, th.getMessage());
        }
    }

    public void setShowRewardVideoListener(h hVar) {
        this.I = hVar;
    }

    private WindVaneWebView b(String str) {
        a.C0082a a2 = com.anythink.expressad.videocommon.a.a(str);
        if (a2 != null) {
            this.D = a2.b();
            String str2 = d;
            n.a(str2, "get BT wraper.getTag = " + this.D);
            a2.a("");
            return a2.a();
        }
        return null;
    }

    private com.anythink.expressad.video.bt.module.a.b c() {
        if (this.K == null) {
            this.K = new com.anythink.expressad.video.bt.module.a.b() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTContainer.3
                @Override // com.anythink.expressad.video.bt.module.a.b
                public final void a() {
                }

                @Override // com.anythink.expressad.video.bt.module.a.b
                public final void a(String str) {
                    if (AnythinkBTContainer.this.i != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(com.anythink.expressad.a.y, AnythinkBTContainer.this.n);
                            jSONObject2.put("unitId", AnythinkBTContainer.this.m);
                            jSONObject.put("data", jSONObject2);
                            String str2 = AnythinkBTContainer.d;
                            n.a(str2, " BT Call H5 onAdShow " + jSONObject.toString());
                        } catch (JSONException e) {
                            n.a(AnythinkBTContainer.d, e.getMessage());
                        }
                        com.anythink.expressad.atsignalcommon.windvane.j.a();
                        com.anythink.expressad.atsignalcommon.windvane.j.a((WebView) AnythinkBTContainer.this.i, "onSubPlayTemplateViewPlayStart", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }

                @Override // com.anythink.expressad.video.bt.module.a.b
                public final void b(String str) {
                    if (AnythinkBTContainer.this.i != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("convert", true);
                            jSONObject2.put(com.anythink.expressad.a.y, AnythinkBTContainer.this.n);
                            jSONObject2.put("unitId", AnythinkBTContainer.this.m);
                            jSONObject.put("data", jSONObject2);
                            String str2 = AnythinkBTContainer.d;
                            n.a(str2, " BT Call H5 onVideoComplete " + jSONObject.toString());
                        } catch (JSONException e) {
                            n.a(AnythinkBTContainer.d, e.getMessage());
                        }
                        com.anythink.expressad.atsignalcommon.windvane.j.a();
                        com.anythink.expressad.atsignalcommon.windvane.j.a((WebView) AnythinkBTContainer.this.i, "onSubPlayTemplateViewPlayCompleted", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }

                @Override // com.anythink.expressad.video.bt.module.a.b
                public final void c(String str) {
                    if (AnythinkBTContainer.this.i != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(com.anythink.expressad.a.y, AnythinkBTContainer.this.n);
                            jSONObject2.put("unitId", AnythinkBTContainer.this.m);
                            jSONObject.put("data", jSONObject2);
                            String str2 = AnythinkBTContainer.d;
                            n.a(str2, " BT Call H5 onEndcardShow " + jSONObject.toString());
                        } catch (JSONException e) {
                            n.a(AnythinkBTContainer.d, e.getMessage());
                        }
                        com.anythink.expressad.atsignalcommon.windvane.j.a();
                        com.anythink.expressad.atsignalcommon.windvane.j.a((WebView) AnythinkBTContainer.this.i, "onSubPlayTemplateViewEndcardShowSuccess", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }

                @Override // com.anythink.expressad.video.bt.module.a.b
                public final void a(String str, boolean z, com.anythink.expressad.videocommon.c.c cVar) {
                    if (AnythinkBTContainer.this.i != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            if (cVar != null) {
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("name", cVar.a());
                                jSONObject3.put("amount", cVar.b());
                                jSONObject2.put("reward", jSONObject3);
                            }
                            jSONObject2.put("isComplete", z);
                            jSONObject2.put("convert", z ? 1 : 2);
                            jSONObject.put("data", jSONObject2);
                            String str2 = AnythinkBTContainer.d;
                            n.a(str2, " BT Call H5 onAdClose " + jSONObject.toString());
                        } catch (JSONException e) {
                            n.a(AnythinkBTContainer.d, e.getMessage());
                        }
                        com.anythink.expressad.atsignalcommon.windvane.j.a();
                        com.anythink.expressad.atsignalcommon.windvane.j.a((WebView) AnythinkBTContainer.this.i, "onSubPlayTemplateViewCloseBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                        com.anythink.expressad.atsignalcommon.windvane.j.a();
                        com.anythink.expressad.atsignalcommon.windvane.j.a((WebView) AnythinkBTContainer.this.i, "onSubPlayTemplateViewDismissed", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }

                @Override // com.anythink.expressad.video.bt.module.a.b
                public final void a(boolean z, int i) {
                    AnythinkBTContainer.this.P = z;
                    AnythinkBTContainer.this.Q = i;
                }

                @Override // com.anythink.expressad.video.bt.module.a.b
                public final void a(String str, String str2) {
                    if (AnythinkBTContainer.this.i != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(com.anythink.expressad.a.y, AnythinkBTContainer.this.n);
                            jSONObject2.put("unitId", AnythinkBTContainer.this.m);
                            jSONObject2.put("error", str2);
                            jSONObject.put("data", jSONObject2);
                            String str3 = AnythinkBTContainer.d;
                            n.a(str3, " BT Call H5 onShowFail " + jSONObject.toString());
                        } catch (JSONException e) {
                            n.a(AnythinkBTContainer.d, e.getMessage());
                        }
                        com.anythink.expressad.atsignalcommon.windvane.j.a();
                        com.anythink.expressad.atsignalcommon.windvane.j.a((WebView) AnythinkBTContainer.this.i, "onSubPlayTemplateViewPlayFailed", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }

                @Override // com.anythink.expressad.video.bt.module.a.b
                public final void a(String str, com.anythink.expressad.foundation.d.c cVar) {
                    AnythinkBTContainer anythinkBTContainer = AnythinkBTContainer.this;
                    anythinkBTContainer.a = cVar;
                    if (anythinkBTContainer.i != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(com.anythink.expressad.a.y, AnythinkBTContainer.this.n);
                            jSONObject2.put("unitId", AnythinkBTContainer.this.m);
                            jSONObject.put("data", jSONObject2);
                            String str2 = AnythinkBTContainer.d;
                            n.a(str2, " BT Call H5 onVideoAdClicked " + jSONObject.toString());
                        } catch (JSONException e) {
                            n.a(AnythinkBTContainer.d, e.getMessage());
                        }
                        com.anythink.expressad.atsignalcommon.windvane.j.a();
                        com.anythink.expressad.atsignalcommon.windvane.j.a((WebView) AnythinkBTContainer.this.i, "onSubPlayTemplateViewClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }
            };
        }
        return this.K;
    }

    private void d() {
        List<com.anythink.expressad.videocommon.b.a> list = this.G;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (com.anythink.expressad.videocommon.b.a aVar : this.G) {
            if (aVar != null) {
                try {
                    String p = aVar.p();
                    if (!TextUtils.isEmpty(p) && com.anythink.expressad.foundation.g.i.a.c(p)) {
                        com.anythink.expressad.foundation.g.i.a.b(p);
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    private boolean g() {
        try {
            d dVar = this.o;
            if (dVar == null) {
                return false;
            }
            double K = dVar.K();
            if (K == 1.0d) {
                return false;
            }
            return new Random().nextDouble() > K;
        } catch (Throwable th) {
            n.b(d, "", th);
            return false;
        }
    }

    private void a(Context context) {
        if (this.S == null) {
            a("ChoiceOneCallback is null");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(com.anythink.expressad.video.dynview.a.a.v, this.S);
        com.anythink.expressad.video.dynview.b.a();
        com.anythink.expressad.video.dynview.b.a(context, this.F, new AnonymousClass2(), hashMap);
    }

    private com.anythink.expressad.videocommon.b.a d(com.anythink.expressad.foundation.d.c cVar) {
        List<com.anythink.expressad.videocommon.b.a> list = this.G;
        if (list == null || cVar == null) {
            return null;
        }
        for (com.anythink.expressad.videocommon.b.a aVar : list) {
            if (aVar.k().aZ().equals(cVar.aZ())) {
                n.a(d, "tempContainer task initSuccess");
                return aVar;
            }
        }
        return null;
    }

    public AnythinkBTContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = 0;
        this.f = 1;
        this.B = false;
        this.C = true;
        this.E = false;
        this.O = 1;
        init(context);
    }

    @Override // com.anythink.expressad.video.signal.container.AbstractJSContainer
    public final void a(String str) {
        h hVar = this.I;
        if (hVar != null) {
            hVar.a(str);
        }
        super.a(str);
    }

    public final void a(com.anythink.expressad.foundation.d.c cVar) {
        if (cVar != null) {
            try {
                List<String> e = cVar.e();
                if (e == null || e.size() <= 0) {
                    return;
                }
                for (String str : e) {
                    com.anythink.expressad.a.a.a(m.a().e(), cVar, this.m, str, true);
                }
            } catch (Throwable th) {
                n.d(d, th.getMessage());
            }
        }
    }

    /* renamed from: com.anythink.expressad.video.bt.module.AnythinkBTContainer$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 implements com.anythink.expressad.video.dynview.e.d {
        public AnonymousClass2() {
        }

        @Override // com.anythink.expressad.video.dynview.e.d
        public final void a(com.anythink.expressad.video.dynview.a aVar) {
            com.anythink.expressad.foundation.d.c cVar;
            String sb;
            if (AnythinkBTContainer.this.g != null && aVar.a() != null) {
                AnythinkBTContainer.this.g.removeAllViews();
                AnythinkBTContainer.this.g.addView(aVar.a());
                if (AnythinkBTContainer.this.H != null) {
                    AnythinkBTContainer.this.H.a();
                }
                if (AnythinkBTContainer.this.F == null || AnythinkBTContainer.this.F.size() <= 0 || (cVar = (com.anythink.expressad.foundation.d.c) AnythinkBTContainer.this.F.get(0)) == null) {
                    return;
                }
                String ak = cVar.ak();
                d a = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), AnythinkBTContainer.this.m);
                int L = a != null ? a.L() : 1;
                if (cVar.m() == 1) {
                    StringBuilder L2 = wo1.L(ak, "&to=1&cbt=");
                    L2.append(cVar.aB());
                    L2.append("&tmorl=");
                    L2.append(L);
                    sb = L2.toString();
                } else {
                    StringBuilder L3 = wo1.L(ak, "&to=0&cbt=");
                    L3.append(cVar.aB());
                    L3.append("&tmorl=");
                    L3.append(L);
                    sb = L3.toString();
                }
                com.anythink.expressad.a.a.a(m.a().e(), cVar, AnythinkBTContainer.this.m, sb, false, true, com.anythink.expressad.a.a.a.j);
                f.h.put(cVar.ak(), Long.valueOf(System.currentTimeMillis()));
                AnythinkBTContainer.this.a(cVar);
                return;
            }
            AnythinkBTContainer.this.a("nativeview is null");
        }

        @Override // com.anythink.expressad.video.dynview.e.d
        public final void a(com.anythink.expressad.video.dynview.c.a aVar) {
            String str;
            if (aVar != null) {
                str = "errorCode:" + aVar.a() + "Msg:" + aVar.b();
            } else {
                str = "";
            }
            AnythinkBTContainer.this.a("nativeview is null".concat(String.valueOf(str)));
        }
    }

    private boolean a(boolean z) {
        d dVar;
        try {
            dVar = this.o;
        } catch (Throwable th) {
            n.b(d, "", th);
        }
        if (dVar == null) {
            return false;
        }
        int J = dVar.J();
        if (J != 1) {
            if (J == 2) {
                return z && g();
            } else if (J != 3) {
                return false;
            } else {
                return g();
            }
        }
        return z;
    }
}