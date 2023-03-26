package com.anythink.expressad.video.module;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.anythink.core.common.b.m;
import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge;
import com.anythink.expressad.atsignalcommon.mraid.MraidVolumeChangeReceiver;
import com.anythink.expressad.atsignalcommon.windvane.AbsFeedBackForH5;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.atsignalcommon.windvane.j;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.s;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.foundation.webview.BrowserView;
import com.anythink.expressad.video.signal.h;
import com.anythink.expressad.videocommon.b.g;
import com.anythink.expressad.widget.FeedBackButton;
import com.google.android.gms.ads.AdError;
import com.microsoft.appcenter.AppCenter;
import com.p7700g.p99005.aa;
import com.p7700g.p99005.b30;
import com.p7700g.p99005.j20;
import com.p7700g.p99005.tm4;
import java.io.File;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AnythinkH5EndCardView extends AnythinkBaseView implements IMraidJSBridge, com.anythink.expressad.video.signal.f, h {
    private static final String A = "portrait";
    private static final String B = "landscape";
    private static final int C = 1;
    private static final int D = 2;
    private static final int E = 20;
    private static final int F = 15;
    private static final int P = 100;
    public static final String m = "orientation";
    public static final String n = "webviewshow";
    private static final String z = "anythink_reward_endcard_h5";
    private FeedBackButton G;
    private boolean H;
    private boolean I;
    private int J;
    private int K;
    private boolean L;
    private boolean M;
    private int N;
    private long O;
    private boolean Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private boolean U;
    private boolean V;
    private boolean W;
    private boolean aa;
    private String ab;
    private com.anythink.expressad.video.signal.factory.b ac;
    private boolean ad;
    private boolean ae;
    public View o;
    public RelativeLayout p;
    public ImageView q;
    public WindVaneWebView r;
    public Handler s;
    public String t;
    public boolean u;
    public boolean v;
    public String w;
    public Handler x;
    public boolean y;

    /* renamed from: com.anythink.expressad.video.module.AnythinkH5EndCardView$5  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass5 implements Runnable {
        public AnonymousClass5() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AnythinkH5EndCardView.this.G.setVisibility(0);
        }
    }

    /* renamed from: com.anythink.expressad.video.module.AnythinkH5EndCardView$6  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass6 implements com.anythink.expressad.foundation.f.a {
        public AnonymousClass6() {
        }

        @Override // com.anythink.expressad.foundation.f.a
        public final void a() {
            String str;
            try {
                JSONObject jSONObject = new JSONObject();
                if (m.a().e() != null) {
                    jSONObject.put("status", 1);
                }
                str = jSONObject.toString();
            } catch (Throwable th) {
                n.b(AnythinkBaseView.TAG, th.getMessage(), th);
                str = "";
            }
            String encodeToString = Base64.encodeToString(str.getBytes(), 2);
            j.a();
            j.a((WebView) AnythinkH5EndCardView.this.r, AbsFeedBackForH5.m_, encodeToString);
        }

        @Override // com.anythink.expressad.foundation.f.a
        public final void b() {
            String str;
            try {
                JSONObject jSONObject = new JSONObject();
                if (m.a().e() != null) {
                    jSONObject.put("status", 2);
                }
                str = jSONObject.toString();
            } catch (Throwable th) {
                n.b(AnythinkBaseView.TAG, th.getMessage(), th);
                str = "";
            }
            String encodeToString = Base64.encodeToString(str.getBytes(), 2);
            j.a();
            j.a((WebView) AnythinkH5EndCardView.this.r, AbsFeedBackForH5.m_, encodeToString);
        }

        @Override // com.anythink.expressad.foundation.f.a
        public final void c() {
            String str;
            try {
                JSONObject jSONObject = new JSONObject();
                if (m.a().e() != null) {
                    jSONObject.put("status", 2);
                }
                str = jSONObject.toString();
            } catch (Throwable th) {
                n.b(AnythinkBaseView.TAG, th.getMessage(), th);
                str = "";
            }
            String encodeToString = Base64.encodeToString(str.getBytes(), 2);
            j.a();
            j.a((WebView) AnythinkH5EndCardView.this.r, AbsFeedBackForH5.m_, encodeToString);
        }
    }

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        private AnythinkH5EndCardView b;

        public a(AnythinkH5EndCardView anythinkH5EndCardView) {
            this.b = anythinkH5EndCardView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Handler handler;
            try {
                Thread.sleep(300L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            AnythinkH5EndCardView anythinkH5EndCardView = this.b;
            if (anythinkH5EndCardView == null || (handler = anythinkH5EndCardView.x) == null) {
                return;
            }
            handler.sendEmptyMessage(100);
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {
        private AnythinkH5EndCardView b;

        public b(AnythinkH5EndCardView anythinkH5EndCardView) {
            this.b = anythinkH5EndCardView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AnythinkH5EndCardView anythinkH5EndCardView = this.b;
            if (anythinkH5EndCardView == null || anythinkH5EndCardView.M) {
                return;
            }
            this.b.M = true;
            this.b.u = false;
            AnythinkH5EndCardView.this.reportRenderResult("timeout", 5);
            this.b.e_.a(127, "");
            n.a(AnythinkBaseView.TAG, "notify TYPE_NOTIFY_SHOW_NATIVE_ENDCARD");
        }
    }

    /* loaded from: classes2.dex */
    public static class c implements Runnable {
        private AnythinkH5EndCardView a;
        private int b;

        public c(AnythinkH5EndCardView anythinkH5EndCardView, int i) {
            this.a = anythinkH5EndCardView;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AnythinkH5EndCardView anythinkH5EndCardView = this.a;
            if (anythinkH5EndCardView == null || anythinkH5EndCardView.b_ == null) {
                return;
            }
            try {
                if (!anythinkH5EndCardView.L) {
                    this.a.L = true;
                    if (v.b(this.a.b_.G())) {
                        this.a.b_.G().contains(j20.w);
                        return;
                    }
                    return;
                }
                n.b(AnythinkBaseView.TAG, "insertEndCardReadyState hasInsertLoadEndCardReport true return");
            } catch (Throwable th) {
                n.b(AnythinkBaseView.TAG, th.getMessage(), th);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class d implements Runnable {
        private AnythinkH5EndCardView b;

        public d(AnythinkH5EndCardView anythinkH5EndCardView) {
            this.b = anythinkH5EndCardView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AnythinkH5EndCardView anythinkH5EndCardView = this.b;
            if (anythinkH5EndCardView != null) {
                anythinkH5EndCardView.U = true;
            }
        }
    }

    /* loaded from: classes2.dex */
    public class e implements Runnable {
        private AnythinkH5EndCardView b;

        public e(AnythinkH5EndCardView anythinkH5EndCardView) {
            this.b = anythinkH5EndCardView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AnythinkH5EndCardView anythinkH5EndCardView = this.b;
            if (anythinkH5EndCardView != null) {
                anythinkH5EndCardView.V = true;
            }
        }
    }

    /* loaded from: classes2.dex */
    public class f implements Runnable {
        private AnythinkH5EndCardView b;

        public f(AnythinkH5EndCardView anythinkH5EndCardView) {
            this.b = anythinkH5EndCardView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AnythinkH5EndCardView anythinkH5EndCardView = this.b;
            if (anythinkH5EndCardView != null) {
                if (!anythinkH5EndCardView.W) {
                    AnythinkH5EndCardView.this.setCloseVisible(0);
                }
                this.b.R = true;
            }
        }
    }

    public AnythinkH5EndCardView(Context context) {
        super(context);
        this.H = false;
        this.s = new Handler();
        this.u = false;
        this.v = false;
        this.I = false;
        this.J = 1;
        this.K = 1;
        this.L = false;
        this.M = false;
        this.N = 1;
        this.O = 0L;
        this.Q = false;
        this.R = false;
        this.S = false;
        this.T = false;
        this.U = false;
        this.V = false;
        this.W = false;
        this.aa = false;
        this.ab = "";
        this.x = new Handler(Looper.getMainLooper()) { // from class: com.anythink.expressad.video.module.AnythinkH5EndCardView.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                super.handleMessage(message);
                if (message.what != 100) {
                    return;
                }
                if (AnythinkH5EndCardView.this.Q) {
                    AnythinkH5EndCardView.this.e_.a(122, "");
                }
                AnythinkH5EndCardView.this.e_.a(103, "");
            }
        };
        this.ad = false;
        this.ae = false;
        this.y = false;
    }

    private void g() {
        if (this.ad || this.S) {
            return;
        }
        this.ad = true;
        int i = this.J;
        if (i == 0) {
            this.U = true;
            return;
        }
        this.U = false;
        if (i >= 0) {
            this.s.postDelayed(new d(this), this.J * 1000);
        }
    }

    private void i() {
        try {
            if (com.anythink.expressad.foundation.f.b.a().b()) {
                com.anythink.expressad.foundation.f.b a2 = com.anythink.expressad.foundation.f.b.a();
                a2.c(this.w + "_1");
                com.anythink.expressad.foundation.f.b a3 = com.anythink.expressad.foundation.f.b.a();
                FeedBackButton b2 = a3.b(this.w + "_2");
                this.G = b2;
                if (b2 != null) {
                    ViewGroup viewGroup = (ViewGroup) b2.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(this.G);
                    }
                    this.p.addView(this.G);
                    this.p.postDelayed(new AnonymousClass5(), 200L);
                }
                this.b_.j(this.w);
                com.anythink.expressad.foundation.f.b a4 = com.anythink.expressad.foundation.f.b.a();
                a4.a(this.w + "_2", this.b_);
                com.anythink.expressad.foundation.f.b a5 = com.anythink.expressad.foundation.f.b.a();
                a5.a(this.w + "_2", new AnonymousClass6());
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private static void k() {
    }

    public boolean canBackPress() {
        ImageView imageView = this.q;
        return imageView != null && imageView.getVisibility() == 0;
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public void close() {
        n.d("EndCard_MRAID", com.anythink.expressad.foundation.d.c.cd);
        try {
            onCloseViewClick();
        } catch (Exception e2) {
            n.d(AnythinkBaseView.TAG, e2.getMessage());
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void defaultShow() {
        super.defaultShow();
    }

    public void excuteEndCardShowTask(int i) {
        this.s.postDelayed(new c(this, i), i * 1000);
    }

    public void excuteTask() {
        if (this.I || this.J < 0) {
            return;
        }
        this.s.postDelayed(new f(this), this.J * 1000);
    }

    public void executeEndCardShow(int i) {
        this.s.postDelayed(new b(this), i * 1000);
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public void expand(String str, boolean z2) {
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public com.anythink.expressad.foundation.d.c getMraidCampaign() {
        return this.b_;
    }

    @Override // com.anythink.expressad.video.signal.h
    public void handlerPlayableException(String str) {
        n.d("========", "===========handlerPlayableException");
        if (this.v) {
            return;
        }
        this.v = true;
        this.u = false;
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void init(Context context) {
        int findLayout = findLayout(z);
        if (findLayout >= 0) {
            View inflate = this.c_.inflate(findLayout, (ViewGroup) null);
            this.o = inflate;
            try {
                this.q = (ImageView) inflate.findViewById(findID("anythink_windwv_close"));
                this.p = (RelativeLayout) inflate.findViewById(findID("anythink_windwv_content_rl"));
                this.r = new WindVaneWebView(getContext());
                this.r.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                this.p.addView(this.r);
                this.f_ = isNotNULL(this.q, this.r);
            } catch (Exception unused) {
                this.f_ = false;
            }
            addView(this.o, b());
            c();
            e();
        }
    }

    @Override // com.anythink.expressad.video.signal.h
    public void install(com.anythink.expressad.foundation.d.c cVar) {
    }

    public boolean isLoadSuccess() {
        return this.u;
    }

    public boolean isPlayable() {
        return this.I;
    }

    @Override // com.anythink.expressad.video.signal.h
    public void notifyCloseBtn(int i) {
        if (i == 0) {
            this.S = true;
        } else if (i != 1) {
        } else {
            this.T = true;
        }
    }

    public void onBackPress() {
        boolean z2;
        if (this.R || (((z2 = this.S) && this.T) || (!(z2 || !this.U || this.y) || (!z2 && this.V && this.y)))) {
            onCloseViewClick();
        }
    }

    public void onCloseViewClick() {
        try {
            if (this.r != null) {
                j.a();
                j.a((WebView) this.r, "onSystemDestory", "");
                new Thread(new a(this)).start();
                return;
            }
            this.e_.a(103, "");
            this.e_.a(119, "webview is null when closing webview");
        } catch (Exception e2) {
            this.e_.a(103, "");
            com.anythink.expressad.video.module.a.a aVar = this.e_;
            aVar.a(119, "close webview exception" + e2.getMessage());
            n.a(AnythinkBaseView.TAG, e2.getMessage());
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        orientation(configuration);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0 || this.aa) {
            return;
        }
        this.aa = true;
        setFocusableInTouchMode(true);
        requestFocus();
        requestFocusFromTouch();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        com.anythink.expressad.foundation.d.c cVar = this.b_;
        if (cVar == null || !cVar.F()) {
            return;
        }
        if (z2) {
            CallMraidJS.getInstance().fireSetIsViewable(this.r, "true");
        } else {
            CallMraidJS.getInstance().fireSetIsViewable(this.r, "false");
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public void open(String str) {
        n.d("EndCard_MRAID", "open : ".concat(String.valueOf(str)));
        try {
            String af = this.b_.af();
            if (!TextUtils.isEmpty(str)) {
                this.b_.n(str);
            }
            new com.anythink.expressad.a.a(getContext(), this.w);
            this.b_.n(af);
            this.e_.a(126, "");
        } catch (Exception e2) {
            try {
                n.d(AnythinkBaseView.TAG, e2.getMessage());
            } catch (Exception e3) {
                n.d(AnythinkBaseView.TAG, e3.getMessage());
            }
        }
    }

    @Override // com.anythink.expressad.video.signal.h
    public void orientation(Configuration configuration) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (configuration.orientation == 2) {
                jSONObject.put("orientation", B);
            } else {
                jSONObject.put("orientation", A);
            }
            String encodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 2);
            j.a();
            j.a((WebView) this.r, "orientation", encodeToString);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void preLoadData(com.anythink.expressad.video.signal.factory.b bVar) {
        int o;
        this.ac = bVar;
        String a2 = a();
        if (this.f_ && this.b_ != null && !TextUtils.isEmpty(a2)) {
            this.O = System.currentTimeMillis();
            BrowserView.DownloadListener downloadListener = new BrowserView.DownloadListener(this.b_);
            downloadListener.setTitle(this.b_.bb());
            this.r.setDownloadListener(downloadListener);
            this.r.setCampaignId(this.b_.aZ());
            setCloseVisible(8);
            this.r.setApiManagerJSFactory(bVar);
            if (this.b_.F()) {
                this.r.setMraidObject(this);
            }
            this.r.setWebViewListener(new com.anythink.expressad.atsignalcommon.a.b() { // from class: com.anythink.expressad.video.module.AnythinkH5EndCardView.3
                @Override // com.anythink.expressad.atsignalcommon.a.b, com.anythink.expressad.atsignalcommon.windvane.e
                public final void loadingResourceStatus(WebView webView, int i) {
                    super.loadingResourceStatus(webView, i);
                    AnythinkH5EndCardView.this.N = i;
                    if (AnythinkH5EndCardView.this.M) {
                        return;
                    }
                    AnythinkH5EndCardView.this.M = true;
                    if (i == 1) {
                        AnythinkH5EndCardView.this.reportRenderResult("success", 4);
                        return;
                    }
                    AnythinkH5EndCardView.this.e_.a(127, "");
                    AnythinkH5EndCardView.this.reportRenderResult("failed", 6);
                }

                @Override // com.anythink.expressad.atsignalcommon.a.b, com.anythink.expressad.atsignalcommon.windvane.e
                public final void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    n.d("========", "===========finish+".concat(String.valueOf(str)));
                    if (AnythinkH5EndCardView.this.v) {
                        return;
                    }
                    n.d("========", "===========finish  loadSuccess：" + AnythinkH5EndCardView.this.u);
                    AnythinkH5EndCardView.this.u = true;
                    n.a(AnythinkBaseView.TAG, "onPageFinished,url:".concat(String.valueOf(str)));
                    AnythinkH5EndCardView.this.e_.a(100, "");
                    AnythinkH5EndCardView.this.e_.a(120, "");
                }

                @Override // com.anythink.expressad.atsignalcommon.a.b, com.anythink.expressad.atsignalcommon.windvane.e
                public final void onReceivedError(WebView webView, int i, String str, String str2) {
                    super.onReceivedError(webView, i, str, str2);
                    n.d("========", "===========onReceivedError");
                    if (AnythinkH5EndCardView.this.v) {
                        return;
                    }
                    n.a(AnythinkBaseView.TAG, "onReceivedError,url:".concat(String.valueOf(str2)));
                    com.anythink.expressad.video.module.a.a aVar = AnythinkH5EndCardView.this.e_;
                    aVar.a(118, "onReceivedError " + i + str);
                    AnythinkH5EndCardView.this.reportRenderResult(str, 3);
                    AnythinkH5EndCardView.this.e_.a(127, "");
                    AnythinkH5EndCardView.this.e_.a(129, "");
                    AnythinkH5EndCardView.this.v = true;
                }

                @Override // com.anythink.expressad.atsignalcommon.a.b, com.anythink.expressad.atsignalcommon.windvane.e
                public final void readyState(WebView webView, int i) {
                    super.readyState(webView, i);
                    n.b(com.anythink.expressad.atsignalcommon.a.b.d, "h5EncardView readyStatus:" + i + "- isError" + AnythinkH5EndCardView.this.v);
                    AnythinkH5EndCardView.this.N = i;
                    if (AnythinkH5EndCardView.this.v) {
                        return;
                    }
                    AnythinkH5EndCardView.a(AnythinkH5EndCardView.this, System.currentTimeMillis() - AnythinkH5EndCardView.this.O);
                }
            });
            if (TextUtils.isEmpty(this.b_.E())) {
                try {
                    this.O = System.currentTimeMillis();
                    String G = this.b_.G();
                    com.anythink.expressad.videocommon.e.d a3 = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), this.w);
                    if (this.I && v.b(G) && (G.contains("wfr=1") || (a3 != null && a3.o() > 0))) {
                        n.d(AnythinkBaseView.TAG, "需要上报endcard加载时间");
                        if (G.contains("wfr=1")) {
                            String[] split = G.split("&");
                            if (split != null && split.length > 0) {
                                for (String str : split) {
                                    if (v.b(str) && str.contains(aa.h.d) && str.split(AppCenter.KEY_VALUE_DELIMITER) != null && str.split(AppCenter.KEY_VALUE_DELIMITER).length > 0) {
                                        o = s.a((Object) str.split(AppCenter.KEY_VALUE_DELIMITER)[1]);
                                        n.b(AnythinkBaseView.TAG, "从url获取的waitingtime:".concat(String.valueOf(o)));
                                        break;
                                    }
                                }
                            }
                            o = 20;
                        } else {
                            if (a3 != null && a3.o() > 0) {
                                o = a3.o();
                            }
                            o = 20;
                        }
                        if (o >= 0) {
                            excuteEndCardShowTask(o);
                            n.b(AnythinkBaseView.TAG, "开启excuteEndCardShowTask:".concat(String.valueOf(o)));
                        } else {
                            excuteEndCardShowTask(20);
                            n.b(AnythinkBaseView.TAG, "开启excuteEndCardShowTask: 20s def");
                        }
                    }
                } catch (Throwable th) {
                    n.b(AnythinkBaseView.TAG, th.getMessage(), th);
                }
            }
            setHtmlSource(com.anythink.expressad.videocommon.b.h.a().b(a2));
            if (TextUtils.isEmpty(this.t)) {
                n.a(AnythinkBaseView.TAG, "load url:".concat(String.valueOf(a2)));
                this.r.loadUrl(a2);
            } else {
                n.a(AnythinkBaseView.TAG, "load html...");
                this.r.loadDataWithBaseURL(a2, this.t, tm4.D, "UTF-8", null);
            }
        } else {
            reportRenderResult("PL URL IS NULL", 3);
            this.e_.a(127, "");
            this.e_.a(129, "");
        }
        this.y = false;
    }

    @Override // com.anythink.expressad.video.signal.h
    public void readyStatus(int i) {
    }

    public void release() {
        Handler handler = this.s;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.s = null;
        }
        Handler handler2 = this.x;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
            this.x = null;
        }
        this.p.removeAllViews();
        this.r.release();
        this.r = null;
    }

    public void reportRenderResult(String str, int i) {
    }

    public void setCloseDelayShowTime(int i) {
        this.J = i;
    }

    public void setCloseVisible(int i) {
        if (this.f_) {
            this.q.setVisibility(i);
        }
    }

    public void setCloseVisibleForMraid(int i) {
        if (this.f_) {
            this.W = true;
            if (i == 4) {
                this.q.setImageDrawable(new ColorDrawable(b30.s));
            } else {
                this.q.setImageResource(findDrawable("anythink_reward_close"));
            }
            this.q.setVisibility(0);
        }
    }

    public void setError(boolean z2) {
        this.v = z2;
    }

    public void setHtmlSource(String str) {
        this.t = str;
    }

    public void setLoadPlayable(boolean z2) {
        this.y = z2;
    }

    public void setNotchValue(String str, int i, int i2, int i3, int i4) {
        com.anythink.expressad.foundation.d.c cVar = this.b_;
        if (cVar == null || cVar.f() == 2) {
            return;
        }
        this.ab = str;
        n.d(AnythinkBaseView.TAG, "NOTCH H5ENDCARD " + String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.q.getLayoutParams();
        int b2 = s.b(getContext(), 20.0f);
        int i5 = i3 + b2;
        layoutParams.setMargins(i + b2, i5, i2 + b2, i4 + b2);
        n.d(AnythinkBaseView.TAG, "NOTCH H5ENDCARD " + i5);
        this.q.setLayoutParams(layoutParams);
    }

    public void setPlayCloseBtnTm(int i) {
        this.K = i;
    }

    public void setUnitId(String str) {
        this.w = str;
    }

    public void startCounterEndCardShowTimer() {
        try {
            String G = this.b_.G();
            int i = 15;
            if (v.b(G) && G.contains("wfl=1")) {
                String[] split = G.split("&");
                if (split != null && split.length > 0) {
                    for (String str : split) {
                        if (v.b(str) && str.contains("timeout") && str.split(AppCenter.KEY_VALUE_DELIMITER) != null && str.split(AppCenter.KEY_VALUE_DELIMITER).length > 0) {
                            i = s.a((Object) str.split(AppCenter.KEY_VALUE_DELIMITER)[1]);
                            n.b(AnythinkBaseView.TAG, "从url获取的wfl timeout :".concat(String.valueOf(i)));
                        }
                    }
                }
                executeEndCardShow(i);
            }
        } catch (Throwable th) {
            n.a(AnythinkBaseView.TAG, th.getMessage());
        }
    }

    @Override // com.anythink.expressad.video.signal.h
    public void toggleCloseBtn(int i) {
        int visibility = this.q.getVisibility();
        if (i == 1) {
            this.R = true;
            visibility = 0;
        } else if (i == 2) {
            this.R = false;
            visibility = 8;
            if (this.y) {
                if (!this.ae && !this.S) {
                    this.ae = true;
                    int i2 = this.K;
                    if (i2 == 0) {
                        this.V = true;
                    } else {
                        this.V = false;
                        if (i2 >= 0) {
                            this.s.postDelayed(new e(this), this.K * 1000);
                        }
                    }
                }
            } else if (!this.ad && !this.S) {
                this.ad = true;
                int i3 = this.J;
                if (i3 == 0) {
                    this.U = true;
                } else {
                    this.U = false;
                    if (i3 >= 0) {
                        this.s.postDelayed(new d(this), this.J * 1000);
                    }
                }
            }
        }
        setCloseVisible(visibility);
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public void unload() {
        n.d("EndCard_MRAID", "unload");
        close();
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public void useCustomClose(boolean z2) {
        n.d("EndCard_MRAID", "useCustomClose : ".concat(String.valueOf(z2)));
        try {
            setCloseVisibleForMraid(z2 ? 4 : 0);
        } catch (Exception e2) {
            n.d(AnythinkBaseView.TAG, e2.getMessage());
        }
    }

    public void volumeChange(double d2) {
        CallMraidJS.getInstance().fireAudioVolumeChange(this.r, d2);
    }

    public void webviewshow() {
        WindVaneWebView windVaneWebView = this.r;
        if (windVaneWebView != null) {
            windVaneWebView.post(new Runnable() { // from class: com.anythink.expressad.video.module.AnythinkH5EndCardView.4
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        n.a(AnythinkBaseView.TAG, "webviewshow");
                        int[] iArr = new int[2];
                        AnythinkH5EndCardView.this.r.getLocationOnScreen(iArr);
                        n.d(AnythinkBaseView.TAG, "coordinate:" + iArr[0] + "--" + iArr[1]);
                        JSONObject jSONObject = new JSONObject();
                        Context e2 = m.a().e();
                        if (e2 != null) {
                            jSONObject.put("startX", s.a(e2, iArr[0]));
                            jSONObject.put("startY", s.a(e2, iArr[1]));
                            jSONObject.put(com.anythink.expressad.foundation.g.a.ch, s.c(e2));
                        }
                        String encodeToString = Base64.encodeToString(jSONObject.toString().toString().getBytes(), 2);
                        j.a();
                        j.a((WebView) AnythinkH5EndCardView.this.r, "webviewshow", encodeToString);
                        AnythinkH5EndCardView.this.e_.a(109, "");
                        AnythinkH5EndCardView.g(AnythinkH5EndCardView.this);
                        AnythinkH5EndCardView.this.startCounterEndCardShowTimer();
                        j.a();
                        AnythinkH5EndCardView anythinkH5EndCardView = AnythinkH5EndCardView.this;
                        j.a((WebView) anythinkH5EndCardView.r, "oncutoutfetched", Base64.encodeToString(anythinkH5EndCardView.ab.getBytes(), 0));
                        AnythinkH5EndCardView.i(AnythinkH5EndCardView.this);
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                }
            });
        }
    }

    private void f() {
        int o;
        try {
            this.O = System.currentTimeMillis();
            String G = this.b_.G();
            com.anythink.expressad.videocommon.e.d a2 = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), this.w);
            if (this.I && v.b(G)) {
                if (G.contains("wfr=1") || (a2 != null && a2.o() > 0)) {
                    n.d(AnythinkBaseView.TAG, "需要上报endcard加载时间");
                    if (G.contains("wfr=1")) {
                        String[] split = G.split("&");
                        if (split != null && split.length > 0) {
                            for (String str : split) {
                                if (v.b(str) && str.contains(aa.h.d) && str.split(AppCenter.KEY_VALUE_DELIMITER) != null && str.split(AppCenter.KEY_VALUE_DELIMITER).length > 0) {
                                    o = s.a((Object) str.split(AppCenter.KEY_VALUE_DELIMITER)[1]);
                                    n.b(AnythinkBaseView.TAG, "从url获取的waitingtime:".concat(String.valueOf(o)));
                                    break;
                                }
                            }
                        }
                        o = 20;
                    } else {
                        if (a2 != null && a2.o() > 0) {
                            o = a2.o();
                        }
                        o = 20;
                    }
                    if (o >= 0) {
                        excuteEndCardShowTask(o);
                        n.b(AnythinkBaseView.TAG, "开启excuteEndCardShowTask:".concat(String.valueOf(o)));
                        return;
                    }
                    excuteEndCardShowTask(20);
                    n.b(AnythinkBaseView.TAG, "开启excuteEndCardShowTask: 20s def");
                }
            }
        } catch (Throwable th) {
            n.b(AnythinkBaseView.TAG, th.getMessage(), th);
        }
    }

    private void h() {
        if (this.ae || this.S) {
            return;
        }
        this.ae = true;
        int i = this.K;
        if (i == 0) {
            this.V = true;
            return;
        }
        this.V = false;
        if (i >= 0) {
            this.s.postDelayed(new e(this), this.K * 1000);
        }
    }

    private void j() {
        com.anythink.expressad.foundation.d.c cVar = this.b_;
        if (cVar == null || !cVar.F()) {
            return;
        }
        int i = getResources().getConfiguration().orientation;
        String str = AdError.UNDEFINED_DOMAIN;
        if (i != 0) {
            if (i == 1) {
                str = A;
            } else if (i == 2) {
                str = B;
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("orientation", str);
            jSONObject.put("locked", "true");
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        HashMap hashMap = new HashMap();
        hashMap.put(CallMraidJS.a, "Interstitial");
        hashMap.put(CallMraidJS.b, "default");
        hashMap.put(CallMraidJS.c, "true");
        hashMap.put(CallMraidJS.d, jSONObject);
        if (getContext() instanceof Activity) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity) getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            CallMraidJS.getInstance().fireSetScreenSize(this.r, com.anythink.expressad.foundation.h.j.e(getContext()), com.anythink.expressad.foundation.h.j.f(getContext()));
            CallMraidJS.getInstance().fireSetMaxSize(this.r, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        CallMraidJS callMraidJS = CallMraidJS.getInstance();
        WindVaneWebView windVaneWebView = this.r;
        callMraidJS.fireSetDefaultPosition(windVaneWebView, windVaneWebView.getLeft(), this.r.getTop(), this.r.getWidth(), this.r.getHeight());
        CallMraidJS callMraidJS2 = CallMraidJS.getInstance();
        WindVaneWebView windVaneWebView2 = this.r;
        callMraidJS2.fireSetCurrentPosition(windVaneWebView2, windVaneWebView2.getLeft(), this.r.getTop(), this.r.getWidth(), this.r.getHeight());
        CallMraidJS.getInstance().fireChangeEventForPropertys(this.r, hashMap);
        CallMraidJS.getInstance().fireAudioVolumeChange(this.r, MraidVolumeChangeReceiver.a);
        CallMraidJS.getInstance().fireReadyEvent(this.r);
    }

    public RelativeLayout.LayoutParams b() {
        return new RelativeLayout.LayoutParams(-1, -1);
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public final void c() {
        super.c();
        if (this.f_) {
            this.q.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.module.AnythinkH5EndCardView.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AnythinkH5EndCardView.this.onCloseViewClick();
                }
            });
        }
    }

    public void e() {
        if (this.f_) {
            setMatchParent();
        }
    }

    public String a() {
        com.anythink.expressad.foundation.d.c cVar = this.b_;
        if (cVar != null) {
            this.Q = true;
            if (cVar.F()) {
                this.I = false;
                String E2 = this.b_.E();
                if (!TextUtils.isEmpty(E2)) {
                    File file = new File(E2);
                    try {
                        if (file.exists() && file.isFile() && file.canRead()) {
                            n.b(AnythinkBaseView.TAG, "Mraid file ".concat(String.valueOf(E2)));
                            E2 = "file:////".concat(String.valueOf(E2));
                        } else {
                            n.b(AnythinkBaseView.TAG, "Mraid file not found. Will use endcard url.");
                            E2 = this.b_.O();
                        }
                        return E2;
                    } catch (Throwable th) {
                        if (com.anythink.expressad.a.a) {
                            th.printStackTrace();
                            return E2;
                        }
                        return E2;
                    }
                }
                String O = this.b_.O();
                n.d(AnythinkBaseView.TAG, "getURL playable=false endscreenurl兜底:".concat(String.valueOf(O)));
                return O;
            }
            String G = this.b_.G();
            if (!v.a(G)) {
                this.I = true;
                String c2 = g.a().c(G);
                if (TextUtils.isEmpty(c2)) {
                    try {
                        String path = Uri.parse(G).getPath();
                        if (!TextUtils.isEmpty(path) && path.toLowerCase().endsWith(j20.w)) {
                            String O2 = this.b_.O();
                            if (TextUtils.isEmpty(O2)) {
                                return null;
                            }
                            this.I = false;
                            excuteTask();
                            return O2;
                        }
                    } catch (Throwable th2) {
                        n.d(AnythinkBaseView.TAG, th2.getMessage());
                    }
                    n.b(AnythinkBaseView.TAG, "getURL playable=true endcard本地资源地址为空拿服务端地址:".concat(String.valueOf(G)));
                    return G + "&native_adtype=" + this.b_.u();
                }
                n.b(AnythinkBaseView.TAG, "getURL playable=true 资源不为空endcard地址:".concat(String.valueOf(c2)));
                return c2 + "&native_adtype=" + this.b_.u();
            }
            this.I = false;
            String O3 = this.b_.O();
            n.d(AnythinkBaseView.TAG, "getURL playable=false endscreenurl兜底:".concat(String.valueOf(O3)));
            return O3;
        }
        this.Q = false;
        n.d(AnythinkBaseView.TAG, "getURL playable=false url为空");
        return null;
    }

    public static /* synthetic */ void g(AnythinkH5EndCardView anythinkH5EndCardView) {
        com.anythink.expressad.foundation.d.c cVar = anythinkH5EndCardView.b_;
        if (cVar == null || !cVar.F()) {
            return;
        }
        int i = anythinkH5EndCardView.getResources().getConfiguration().orientation;
        String str = AdError.UNDEFINED_DOMAIN;
        if (i != 0) {
            if (i == 1) {
                str = A;
            } else if (i == 2) {
                str = B;
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("orientation", str);
            jSONObject.put("locked", "true");
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        HashMap hashMap = new HashMap();
        hashMap.put(CallMraidJS.a, "Interstitial");
        hashMap.put(CallMraidJS.b, "default");
        hashMap.put(CallMraidJS.c, "true");
        hashMap.put(CallMraidJS.d, jSONObject);
        if (anythinkH5EndCardView.getContext() instanceof Activity) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity) anythinkH5EndCardView.getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            CallMraidJS.getInstance().fireSetScreenSize(anythinkH5EndCardView.r, com.anythink.expressad.foundation.h.j.e(anythinkH5EndCardView.getContext()), com.anythink.expressad.foundation.h.j.f(anythinkH5EndCardView.getContext()));
            CallMraidJS.getInstance().fireSetMaxSize(anythinkH5EndCardView.r, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        CallMraidJS callMraidJS = CallMraidJS.getInstance();
        WindVaneWebView windVaneWebView = anythinkH5EndCardView.r;
        callMraidJS.fireSetDefaultPosition(windVaneWebView, windVaneWebView.getLeft(), anythinkH5EndCardView.r.getTop(), anythinkH5EndCardView.r.getWidth(), anythinkH5EndCardView.r.getHeight());
        CallMraidJS callMraidJS2 = CallMraidJS.getInstance();
        WindVaneWebView windVaneWebView2 = anythinkH5EndCardView.r;
        callMraidJS2.fireSetCurrentPosition(windVaneWebView2, windVaneWebView2.getLeft(), anythinkH5EndCardView.r.getTop(), anythinkH5EndCardView.r.getWidth(), anythinkH5EndCardView.r.getHeight());
        CallMraidJS.getInstance().fireChangeEventForPropertys(anythinkH5EndCardView.r, hashMap);
        CallMraidJS.getInstance().fireAudioVolumeChange(anythinkH5EndCardView.r, MraidVolumeChangeReceiver.a);
        CallMraidJS.getInstance().fireReadyEvent(anythinkH5EndCardView.r);
    }

    public static /* synthetic */ void i(AnythinkH5EndCardView anythinkH5EndCardView) {
        try {
            if (com.anythink.expressad.foundation.f.b.a().b()) {
                com.anythink.expressad.foundation.f.b a2 = com.anythink.expressad.foundation.f.b.a();
                a2.c(anythinkH5EndCardView.w + "_1");
                com.anythink.expressad.foundation.f.b a3 = com.anythink.expressad.foundation.f.b.a();
                FeedBackButton b2 = a3.b(anythinkH5EndCardView.w + "_2");
                anythinkH5EndCardView.G = b2;
                if (b2 != null) {
                    ViewGroup viewGroup = (ViewGroup) b2.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(anythinkH5EndCardView.G);
                    }
                    anythinkH5EndCardView.p.addView(anythinkH5EndCardView.G);
                    anythinkH5EndCardView.p.postDelayed(new AnonymousClass5(), 200L);
                }
                anythinkH5EndCardView.b_.j(anythinkH5EndCardView.w);
                com.anythink.expressad.foundation.f.b a4 = com.anythink.expressad.foundation.f.b.a();
                a4.a(anythinkH5EndCardView.w + "_2", anythinkH5EndCardView.b_);
                com.anythink.expressad.foundation.f.b a5 = com.anythink.expressad.foundation.f.b.a();
                a5.a(anythinkH5EndCardView.w + "_2", new AnonymousClass6());
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public AnythinkH5EndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.H = false;
        this.s = new Handler();
        this.u = false;
        this.v = false;
        this.I = false;
        this.J = 1;
        this.K = 1;
        this.L = false;
        this.M = false;
        this.N = 1;
        this.O = 0L;
        this.Q = false;
        this.R = false;
        this.S = false;
        this.T = false;
        this.U = false;
        this.V = false;
        this.W = false;
        this.aa = false;
        this.ab = "";
        this.x = new Handler(Looper.getMainLooper()) { // from class: com.anythink.expressad.video.module.AnythinkH5EndCardView.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                super.handleMessage(message);
                if (message.what != 100) {
                    return;
                }
                if (AnythinkH5EndCardView.this.Q) {
                    AnythinkH5EndCardView.this.e_.a(122, "");
                }
                AnythinkH5EndCardView.this.e_.a(103, "");
            }
        };
        this.ad = false;
        this.ae = false;
        this.y = false;
    }

    private boolean a(View view) {
        this.q = (ImageView) view.findViewById(findID("anythink_windwv_close"));
        this.p = (RelativeLayout) view.findViewById(findID("anythink_windwv_content_rl"));
        this.r = new WindVaneWebView(getContext());
        this.r.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.p.addView(this.r);
        return isNotNULL(this.q, this.r);
    }

    private void a(long j, boolean z2) {
        try {
            if (this.L) {
                n.b(AnythinkBaseView.TAG, "insertEndCardReadyState hasInsertLoadEndCardReport true return");
                return;
            }
            this.L = true;
            String str = "2";
            if (v.b(this.b_.G()) && this.b_.G().contains(j20.w)) {
                str = "1";
            }
            int i = 10;
            String str2 = "ready yes";
            if (z2) {
                i = 12;
                str2 = "ready timeout";
            } else if (this.N == 2) {
                i = 11;
                str2 = "ready no";
            }
            n.b(AnythinkBaseView.TAG, "insertEndCardReadyState result:" + i + " endCardLoadTime:" + j + " endcardurl:" + this.b_.G() + "  id:" + this.b_.aZ() + "  unitid:" + this.w + "  reason:" + str2 + "  type:" + str);
        } catch (Throwable th) {
            n.b(AnythinkBaseView.TAG, th.getMessage(), th);
        }
    }

    private void a(String str) {
        try {
            String af = this.b_.af();
            if (!TextUtils.isEmpty(str)) {
                this.b_.n(str);
            }
            new com.anythink.expressad.a.a(getContext(), this.w);
            this.b_.n(af);
            this.e_.a(126, "");
        } catch (Exception e2) {
            n.d(AnythinkBaseView.TAG, e2.getMessage());
        }
    }

    public static /* synthetic */ void a(AnythinkH5EndCardView anythinkH5EndCardView, long j) {
        try {
            if (anythinkH5EndCardView.L) {
                n.b(AnythinkBaseView.TAG, "insertEndCardReadyState hasInsertLoadEndCardReport true return");
                return;
            }
            anythinkH5EndCardView.L = true;
            String str = "2";
            if (v.b(anythinkH5EndCardView.b_.G()) && anythinkH5EndCardView.b_.G().contains(j20.w)) {
                str = "1";
            }
            int i = 10;
            String str2 = "ready yes";
            if (anythinkH5EndCardView.N == 2) {
                i = 11;
                str2 = "ready no";
            }
            n.b(AnythinkBaseView.TAG, "insertEndCardReadyState result:" + i + " endCardLoadTime:" + j + " endcardurl:" + anythinkH5EndCardView.b_.G() + "  id:" + anythinkH5EndCardView.b_.aZ() + "  unitid:" + anythinkH5EndCardView.w + "  reason:" + str2 + "  type:" + str);
        } catch (Throwable th) {
            n.b(AnythinkBaseView.TAG, th.getMessage(), th);
        }
    }
}