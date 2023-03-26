package com.anythink.expressad.video.bt.module;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.anythink.core.common.b.m;
import com.anythink.expressad.atsignalcommon.mraid.MraidVolumeChangeReceiver;
import com.anythink.expressad.atsignalcommon.windvane.AbsFeedBackForH5;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.atsignalcommon.windvane.j;
import com.anythink.expressad.foundation.d.r;
import com.anythink.expressad.foundation.h.g;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.s;
import com.anythink.expressad.video.bt.module.b.h;
import com.anythink.expressad.video.module.AnythinkContainerView;
import com.anythink.expressad.video.module.AnythinkVideoView;
import com.anythink.expressad.video.module.a.a.f;
import com.anythink.expressad.video.signal.a.c;
import com.anythink.expressad.video.signal.container.AbstractJSContainer;
import com.anythink.expressad.videocommon.a;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.p7700g.p99005.wo1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ATTempContainer extends AbstractJSContainer {
    private static final String A = ATTempContainer.class.getSimpleName();
    private static final long T = 5000;
    private static final long U = 2000;
    private static final long V = 100;
    private static final int W = -1;
    private static final int aa = -2;
    private static final int ab = -3;
    private static final int ac = -3;
    private static final int ad = -4;
    private static final int ah = 250;
    public static final int b = 0;
    private View B;
    private com.anythink.expressad.foundation.d.c C;
    private com.anythink.expressad.videocommon.b.a D;
    private h E;
    private com.anythink.expressad.video.bt.module.a.b F;
    private String G;
    private com.anythink.expressad.video.signal.factory.b H;
    private int I;
    private int J;
    private boolean K;
    private int L;
    private int M;
    private int N;
    private int O;
    private int P;
    private String Q;
    private String R;
    private LayoutInflater S;
    public boolean a;
    private int ae;
    private int af;
    private int ag;
    private View ai;
    private boolean aj;
    private boolean ak;
    private boolean al;
    private boolean am;
    private boolean an;
    private boolean ao;
    private boolean ap;
    private boolean aq;
    private boolean ar;
    private boolean as;
    private MraidVolumeChangeReceiver at;
    private Runnable au;
    public boolean c;
    public a d;
    public WindVaneWebView e;
    public AnythinkVideoView f;
    public AnythinkContainerView g;
    public Handler h;
    public Runnable i;
    public Runnable j;

    /* renamed from: com.anythink.expressad.video.bt.module.ATTempContainer$5  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass5 implements com.anythink.expressad.foundation.f.a {
        public AnonymousClass5() {
        }

        @Override // com.anythink.expressad.foundation.f.a
        public final void a() {
            String str;
            ATTempContainer.this.onPause();
            try {
                JSONObject jSONObject = new JSONObject();
                if (m.a().e() != null) {
                    jSONObject.put("status", 1);
                }
                str = jSONObject.toString();
            } catch (Throwable th) {
                n.b(ATTempContainer.A, th.getMessage(), th);
                str = "";
            }
            String encodeToString = Base64.encodeToString(str.getBytes(), 2);
            j.a();
            j.a((WebView) ATTempContainer.this.e, AbsFeedBackForH5.m_, encodeToString);
        }

        @Override // com.anythink.expressad.foundation.f.a
        public final void b() {
            String str;
            ATTempContainer.this.onResume();
            try {
                JSONObject jSONObject = new JSONObject();
                if (m.a().e() != null) {
                    jSONObject.put("status", 2);
                }
                str = jSONObject.toString();
            } catch (Throwable th) {
                n.b(ATTempContainer.A, th.getMessage(), th);
                str = "";
            }
            String encodeToString = Base64.encodeToString(str.getBytes(), 2);
            j.a();
            j.a((WebView) ATTempContainer.this.e, AbsFeedBackForH5.m_, encodeToString);
        }

        @Override // com.anythink.expressad.foundation.f.a
        public final void c() {
            String str;
            ATTempContainer.this.onResume();
            try {
                JSONObject jSONObject = new JSONObject();
                if (m.a().e() != null) {
                    jSONObject.put("status", 2);
                }
                str = jSONObject.toString();
            } catch (Throwable th) {
                n.b(ATTempContainer.A, th.getMessage(), th);
                str = "";
            }
            String encodeToString = Base64.encodeToString(str.getBytes(), 2);
            j.a();
            j.a((WebView) ATTempContainer.this.e, AbsFeedBackForH5.m_, encodeToString);
        }
    }

    /* renamed from: com.anythink.expressad.video.bt.module.ATTempContainer$6  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass6 implements MraidVolumeChangeReceiver.VolumeChangeListener {
        public AnonymousClass6() {
        }

        @Override // com.anythink.expressad.atsignalcommon.mraid.MraidVolumeChangeReceiver.VolumeChangeListener
        public final void onVolumeChanged(double d) {
            AnythinkContainerView anythinkContainerView;
            n.d(ATTempContainer.A, "volume is : ".concat(String.valueOf(d)));
            try {
                if (!ATTempContainer.this.C.F() || (anythinkContainerView = ATTempContainer.this.g) == null || anythinkContainerView.getH5EndCardView() == null) {
                    return;
                }
                ATTempContainer.this.g.getH5EndCardView().volumeChange(d);
            } catch (Exception e) {
                n.d(ATTempContainer.A, e.getMessage());
            }
        }
    }

    /* renamed from: com.anythink.expressad.video.bt.module.ATTempContainer$7  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass7 implements Runnable {
        public AnonymousClass7() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ATTempContainer.this.ai.setBackgroundColor(0);
            ATTempContainer.this.ai.setVisibility(0);
            ATTempContainer.this.ai.bringToFront();
        }
    }

    /* renamed from: com.anythink.expressad.video.bt.module.ATTempContainer$8  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass8 implements Runnable {
        public AnonymousClass8() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ATTempContainer.this.ai.setVisibility(8);
        }
    }

    /* loaded from: classes2.dex */
    public interface a {
        void a(String str);

        boolean a();

        void b();

        /* renamed from: com.anythink.expressad.video.bt.module.ATTempContainer$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C0077a implements a {
            private static final String b = "ActivityErrorListener";
            private boolean a = false;

            @Override // com.anythink.expressad.video.bt.module.ATTempContainer.a
            public void a(String str) {
                n.d(b, str);
                this.a = true;
            }

            @Override // com.anythink.expressad.video.bt.module.ATTempContainer.a
            public final void b() {
                this.a = true;
            }

            @Override // com.anythink.expressad.video.bt.module.ATTempContainer.a
            public final boolean a() {
                return this.a;
            }
        }
    }

    /* loaded from: classes2.dex */
    public final class b extends f {
        private Activity V;
        private com.anythink.expressad.foundation.d.c W;

        public b(Activity activity, com.anythink.expressad.foundation.d.c cVar) {
            this.V = activity;
            this.W = cVar;
        }

        @Override // com.anythink.expressad.video.module.a.a.f, com.anythink.expressad.video.module.a.a
        public final void a(int i, Object obj) {
            Context context = ATTempContainer.this.getContext();
            if (context != null && context != context.getApplicationContext()) {
                ATTempContainer.this.getJSCommon().a(context);
            }
            if (this.V != null) {
                ATTempContainer.this.getJSCommon().a(this.V);
            }
            ATTempContainer.this.aq = true;
            if (i == 108) {
                ATTempContainer.this.getJSCommon().a(new c.b(ATTempContainer.this.getJSCommon(), new d(ATTempContainer.this, (byte) 0)));
                ATTempContainer.this.getJSCommon().click(1, obj != null ? obj.toString() : "");
            } else if (i == 113) {
                ATTempContainer.this.E.a(this.W);
            } else if (i == 117) {
                AnythinkVideoView anythinkVideoView = ATTempContainer.this.f;
                if (anythinkVideoView != null) {
                    anythinkVideoView.setVisible(4);
                }
                ATTempContainer.this.aq = true;
                ATTempContainer.this.E.c();
            } else if (i == 126 || i == 128) {
                ATTempContainer.this.E.a(this.W);
            } else {
                switch (i) {
                    case 103:
                    case 104:
                        ATTempContainer.k(ATTempContainer.this);
                        break;
                    case 105:
                        ATTempContainer.this.getJSCommon().click(1, obj != null ? obj.toString() : "");
                        break;
                    case 106:
                        if (ATTempContainer.this.F != null) {
                            ATTempContainer.this.F.a(ATTempContainer.this.G, this.W);
                        } else {
                            ATTempContainer.this.E.a(this.W);
                        }
                        if (this.V != null && this.W != null) {
                            ATTempContainer.k(ATTempContainer.this);
                            break;
                        }
                        break;
                }
            }
            super.a(i, obj);
        }
    }

    /* loaded from: classes2.dex */
    public final class c extends f {
        private c() {
        }

        @Override // com.anythink.expressad.video.module.a.a.f, com.anythink.expressad.video.module.a.a
        public final void a(int i, Object obj) {
            String str;
            super.a(i, obj);
            try {
                if (obj instanceof JSONObject) {
                    str = obj.toString();
                } else {
                    str = (String) obj;
                }
                if (ATTempContainer.this.t && !TextUtils.isEmpty(str)) {
                    JSONObject jSONObject = new JSONObject(str);
                    int optInt = jSONObject.optInt("type");
                    int optInt2 = jSONObject.optInt(com.anythink.expressad.foundation.d.c.bV);
                    if (optInt == 2) {
                        ATTempContainer.this.I = com.anythink.expressad.foundation.g.a.cx;
                    } else if (optInt != 3) {
                        ATTempContainer.this.I = com.anythink.expressad.foundation.g.a.cv;
                    } else {
                        ATTempContainer.this.I = com.anythink.expressad.foundation.g.a.cw;
                    }
                    ATTempContainer.this.J = optInt2;
                }
            } catch (Exception unused) {
                n.d(f.U, "PlayableResultListener ERROR");
            }
            if (i == 120) {
                ATTempContainer.this.E.c();
            } else if (i == 126) {
                ATTempContainer.this.E.a(ATTempContainer.this.C);
            } else if (i != 127) {
                switch (i) {
                    case 100:
                        ATTempContainer.this.ar = true;
                        ATTempContainer aTTempContainer = ATTempContainer.this;
                        aTTempContainer.h.postDelayed(aTTempContainer.au, 250L);
                        ATTempContainer.this.E.a();
                        return;
                    case 101:
                    case 102:
                        ATTempContainer.this.getJSCommon().j();
                        return;
                    case 103:
                        ATTempContainer.this.ak = true;
                        if (ATTempContainer.this.C.F()) {
                            ATTempContainer.k(ATTempContainer.this);
                            return;
                        } else {
                            ATTempContainer.this.getJSCommon().j();
                            return;
                        }
                    case 104:
                        ATTempContainer.k(ATTempContainer.this);
                        return;
                    case 105:
                        ATTempContainer.this.getJSCommon().click(1, obj != null ? obj.toString() : "");
                        return;
                    default:
                        return;
                }
            } else {
                ATTempContainer.this.ak = true;
                ATTempContainer.this.E.a();
                ATTempContainer.this.E.c();
                ATTempContainer.this.getJSContainerModule().showEndcard(100);
            }
        }

        public /* synthetic */ c(ATTempContainer aTTempContainer, byte b) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public class d extends c.a {
        private d() {
        }

        @Override // com.anythink.expressad.video.signal.a.c.a, com.anythink.expressad.out.p.c
        public final void a(com.anythink.expressad.foundation.d.c cVar, String str) {
            super.a(cVar, str);
            ATTempContainer.s(ATTempContainer.this);
        }

        @Override // com.anythink.expressad.video.signal.a.c.a, com.anythink.expressad.video.signal.c.a
        public final void b() {
            super.b();
            ATTempContainer.this.receiveSuccess();
        }

        @Override // com.anythink.expressad.video.signal.a.c.a, com.anythink.expressad.video.signal.c.a
        public final void c() {
            super.c();
            ATTempContainer aTTempContainer = ATTempContainer.this;
            Handler handler = aTTempContainer.h;
            if (handler != null) {
                handler.removeCallbacks(aTTempContainer.i);
            }
        }

        public /* synthetic */ d(ATTempContainer aTTempContainer, byte b) {
            this();
        }

        @Override // com.anythink.expressad.video.signal.a.c.a, com.anythink.expressad.out.p.c
        public final void a(com.anythink.expressad.out.j jVar, String str) {
            super.a(jVar, str);
            ATTempContainer.this.ao = true;
            ATTempContainer.u(ATTempContainer.this);
            if (jVar == null || !(jVar instanceof com.anythink.expressad.foundation.d.c)) {
                return;
            }
            try {
                com.anythink.expressad.foundation.d.c cVar = (com.anythink.expressad.foundation.d.c) jVar;
                String optString = new JSONObject(ATTempContainer.this.getJSVideoModule().getCurrentProgress()).optString("progress", "");
                if (cVar.P() == 3 && cVar.A() == 2 && optString.equals("1.0") && ATTempContainer.this.l != null) {
                    if (!ATTempContainer.this.y) {
                        ATTempContainer.this.l.finish();
                    } else {
                        ATTempContainer.k(ATTempContainer.this);
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        @Override // com.anythink.expressad.video.signal.a.c.a, com.anythink.expressad.out.p.c
        public final void b(com.anythink.expressad.out.j jVar, String str) {
            super.b(jVar, str);
            ATTempContainer.u(ATTempContainer.this);
            ATTempContainer.this.ao = true;
        }

        @Override // com.anythink.expressad.video.signal.a.c.a, com.anythink.expressad.video.signal.c.a
        public final void a(com.anythink.expressad.foundation.d.c cVar, boolean z) {
            super.a(cVar, z);
            ATTempContainer.this.E.a(cVar);
        }

        @Override // com.anythink.expressad.video.signal.a.c.a, com.anythink.expressad.video.signal.c.a
        public final void a(int i, String str) {
            super.a(i, str);
            ATTempContainer.this.defaultLoad(i, str);
        }
    }

    /* loaded from: classes2.dex */
    public final class e extends f {
        private e() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:57:0x0111, code lost:
            if (r2.a.C.k() != false) goto L53;
         */
        @Override // com.anythink.expressad.video.module.a.a.f, com.anythink.expressad.video.module.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void a(int i, Object obj) {
            super.a(i, obj);
            if (ATTempContainer.this.t) {
                try {
                    if (obj instanceof String) {
                        String str = (String) obj;
                        if (!TextUtils.isEmpty(str)) {
                            JSONObject jSONObject = new JSONObject(str);
                            ATTempContainer.this.I = jSONObject.getInt("Alert_window_status");
                            ATTempContainer.this.J = jSONObject.getInt("complete_info");
                        }
                    }
                } catch (Exception e) {
                    n.d(f.U, e.getMessage());
                }
            }
            if (i != 2) {
                if (i == 121) {
                    ATTempContainer.this.ak = true;
                    ATTempContainer.this.E.b();
                    ATTempContainer.this.ap = false;
                    return;
                } else if (i == 16) {
                    ATTempContainer.k(ATTempContainer.this);
                    return;
                } else if (i == 17) {
                    ATTempContainer.this.ak = true;
                    return;
                } else {
                    switch (i) {
                        case 10:
                            ATTempContainer.this.ap = true;
                            if (ATTempContainer.this.C != null) {
                                if (ATTempContainer.this.C.j()) {
                                    if (ATTempContainer.this.y) {
                                        if (ATTempContainer.this.C.k()) {
                                            ATTempContainer.this.E.a();
                                            return;
                                        }
                                        return;
                                    }
                                    ATTempContainer.this.E.a();
                                    return;
                                }
                                ATTempContainer.this.E.a();
                                return;
                            }
                            return;
                        case 11:
                        case 12:
                            break;
                        default:
                            return;
                    }
                }
            }
            if (i == 12 && !ATTempContainer.this.ap) {
                if (ATTempContainer.this.o.T() == 0) {
                    ATTempContainer.this.E.a("play error");
                    ATTempContainer.this.ap = false;
                    ATTempContainer.k(ATTempContainer.this);
                    return;
                }
                if (ATTempContainer.this.C != null && ATTempContainer.this.C.j()) {
                    if (!ATTempContainer.this.y) {
                        ATTempContainer.this.E.a();
                    }
                }
                ATTempContainer.this.E.a();
            }
            ATTempContainer.this.getJSVideoModule().videoOperate(3);
            ATTempContainer.this.ap = false;
        }

        public /* synthetic */ e(ATTempContainer aTTempContainer, byte b) {
            this();
        }
    }

    public ATTempContainer(Context context) {
        super(context);
        this.G = "";
        this.I = com.anythink.expressad.foundation.g.a.cv;
        this.K = false;
        this.Q = "";
        this.a = false;
        this.c = false;
        this.d = new a.C0077a();
        this.h = new Handler();
        this.ae = 0;
        this.af = 0;
        this.ag = 0;
        this.i = new Runnable() { // from class: com.anythink.expressad.video.bt.module.ATTempContainer.1
            @Override // java.lang.Runnable
            public final void run() {
                if (ATTempContainer.this.getActivityProxy().h() != 0) {
                    ATTempContainer.this.ae = -3;
                    return;
                }
                String unused = ATTempContainer.A;
                ATTempContainer.this.defaultLoad(-1, "WebView load timeout");
            }
        };
        this.j = new Runnable() { // from class: com.anythink.expressad.video.bt.module.ATTempContainer.2
            @Override // java.lang.Runnable
            public final void run() {
                if (ATTempContainer.this.getActivityProxy().h() != 0) {
                    ATTempContainer.this.ae = -4;
                } else {
                    ATTempContainer.this.defaultLoad(-3, "JS bridge connect timeout");
                }
            }
        };
        this.aj = false;
        this.ak = false;
        this.al = false;
        this.an = false;
        this.ao = false;
        this.ap = false;
        this.aq = false;
        this.ar = false;
        this.as = false;
        this.au = new Runnable() { // from class: com.anythink.expressad.video.bt.module.ATTempContainer.3
            @Override // java.lang.Runnable
            public final void run() {
                if (ATTempContainer.this.ai != null) {
                    ATTempContainer.this.ai.setVisibility(8);
                }
            }
        };
        init(context);
    }

    private void k() {
        Runnable runnable;
        int i = this.ae;
        if (i == -3) {
            runnable = this.i;
        } else {
            runnable = i == -4 ? this.j : null;
        }
        if (runnable != null) {
            runnable.run();
            this.ae = 0;
        }
    }

    private static void p() {
    }

    private void s() {
        if (this.ak) {
            n.a(A, "sendToServerRewardInfo");
            com.anythink.expressad.video.module.b.a.a(this.C, this.q, this.m, this.p, this.R);
        }
    }

    private static int u() {
        try {
            com.anythink.expressad.videocommon.e.a b2 = com.anythink.expressad.videocommon.e.c.a().b();
            if (b2 == null) {
                com.anythink.expressad.videocommon.e.c.a();
                com.anythink.expressad.videocommon.e.c.c();
            }
            r0 = b2 != null ? (int) b2.g() : 5;
            n.b(A, "AnythinkBaseView buffetTimeout:".concat(String.valueOf(r0)));
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return r0;
    }

    public boolean canBackPress() {
        AnythinkContainerView anythinkContainerView = this.g;
        return anythinkContainerView == null || anythinkContainerView.canBackPress();
    }

    public void defaultLoad(int i, String str) {
        int e2;
        int p;
        superDefaultLoad(i, str);
        n.a(A, "hybrid load error ,start defaultLoad,desc:".concat(String.valueOf(str)));
        if (isLoadSuccess()) {
            if (this.C.H() == 2) {
                this.g.setCampaign(this.C);
                this.g.setUnitID(this.m);
                if (this.C.g() > -2) {
                    p = this.C.g();
                } else {
                    p = this.o.p();
                }
                this.g.setCloseDelayTime(p);
                this.g.setPlayCloseBtnTm(this.o.j());
                this.g.setNotifyListener(new com.anythink.expressad.video.module.a.a.h(this.C, this.D, this.q, b(), this.m, new c(this, (byte) 0), this.o.L(), this.y));
                this.g.preLoadData(this.H);
                this.g.showPlayableView();
                return;
            }
            a(i, str);
            this.ai.setVisibility(8);
            loadModuleDatas();
            int f = this.o.f();
            int e3 = e();
            int i2 = e3 != 0 ? e3 : f;
            com.anythink.expressad.foundation.d.c cVar = this.C;
            if (cVar != null && cVar.j()) {
                this.f.setContainerViewOnNotifyListener(new b(this.l, this.C));
            }
            com.anythink.expressad.foundation.d.c cVar2 = this.C;
            if (cVar2 != null && cVar2.h() > -2) {
                e2 = this.C.h();
            } else {
                e2 = this.o.e();
            }
            int i3 = e2;
            this.f.setVideoSkipTime(i3);
            AnythinkVideoView anythinkVideoView = this.f;
            anythinkVideoView.setNotifyListener(new com.anythink.expressad.video.module.a.a.m(anythinkVideoView, this.g, this.C, this.q, this.D, b(), this.m, i2, i3, new e(this, (byte) 0), this.o.L(), this.y, this.o.T()));
            this.f.defaultShow();
            AnythinkContainerView anythinkContainerView = this.g;
            anythinkContainerView.setNotifyListener(new com.anythink.expressad.video.module.a.a.b(this.f, anythinkContainerView, this.C, this.q, this.D, b(), this.m, new b(this.l, this.C), this.o.L(), this.y));
            this.g.defaultShow();
            return;
        }
        a(i, str);
        Activity activity = this.l;
        if (activity != null) {
            activity.finish();
        }
    }

    public AnythinkContainerView findAnythinkContainerView() {
        return (AnythinkContainerView) findViewById(findID("anythink_video_templete_container"));
    }

    public AnythinkVideoView findAnythinkVideoView() {
        return (AnythinkVideoView) findViewById(findID("anythink_video_templete_videoview"));
    }

    public int findID(String str) {
        return com.anythink.expressad.foundation.h.h.a(getContext(), str, "id");
    }

    public int findLayout(String str) {
        return com.anythink.expressad.foundation.h.h.a(getContext(), str, "layout");
    }

    public WindVaneWebView findWindVaneWebView() {
        a.C0082a a2;
        try {
            if (this.y) {
                String str = A;
                n.a(str, "当前大模板");
                com.anythink.expressad.foundation.d.c cVar = this.C;
                if (cVar == null || cVar.L() == null) {
                    return null;
                }
                n.a(str, "当前大模板，存在播放模板");
                a.C0082a a3 = com.anythink.expressad.videocommon.a.a(this.m + "_" + this.C.aZ() + "_" + this.C.aa() + "_" + this.C.L().e());
                if (a3 != null) {
                    return a3.a();
                }
                return null;
            }
            n.a(A, "当前非大模板");
            if (this.t) {
                a2 = com.anythink.expressad.videocommon.a.a((int) com.anythink.expressad.foundation.g.a.aU, this.C);
            } else {
                a2 = com.anythink.expressad.videocommon.a.a(94, this.C);
            }
            if (a2 == null || !a2.c()) {
                return null;
            }
            if (this.t) {
                com.anythink.expressad.videocommon.a.b(com.anythink.expressad.foundation.g.a.aU, this.C);
            } else {
                com.anythink.expressad.videocommon.a.b(94, this.C);
            }
            WindVaneWebView a4 = a2.a();
            if (this.an) {
                a4.setWebViewTransparent();
            }
            return a4;
        } catch (Exception e2) {
            if (com.anythink.expressad.a.a) {
                e2.printStackTrace();
                return null;
            }
            return null;
        }
    }

    public com.anythink.expressad.foundation.d.c getCampaign() {
        return this.C;
    }

    public String getInstanceId() {
        return this.G;
    }

    public int getLayoutID() {
        return findLayout(this.an ? "anythink_reward_activity_video_templete_transparent" : "anythink_reward_activity_video_templete");
    }

    public void init(Context context) {
        this.S = LayoutInflater.from(context);
    }

    public boolean initViews() {
        View findViewById = findViewById(findID("anythink_video_templete_progressbar"));
        this.ai = findViewById;
        return findViewById != null;
    }

    public boolean isLoadSuccess() {
        return this.c;
    }

    public void loadModuleDatas() {
        int e2;
        int p;
        int i;
        com.anythink.expressad.video.signal.a.j b2 = b(this.C);
        int b3 = b2 != null ? b2.b() : 0;
        if (b3 != 0) {
            this.s = b3;
        }
        int f = this.o.f();
        int e3 = e();
        int i2 = e3 != 0 ? e3 : f;
        this.f.setSoundState(this.s);
        this.f.setCampaign(this.C);
        this.f.setPlayURL(this.D.q());
        com.anythink.expressad.foundation.d.c cVar = this.C;
        if (cVar != null && cVar.h() > -2) {
            e2 = this.C.h();
        } else {
            e2 = this.o.e();
        }
        this.f.setVideoSkipTime(e2);
        this.f.setCloseAlert(this.o.k());
        this.f.setBufferTimeout(u());
        this.f.setNotifyListener(new com.anythink.expressad.video.module.a.a.n(this.H, this.C, this.q, this.D, b(), this.m, i2, e2, new e(this, (byte) 0), this.o.L(), this.y, this.o.T()));
        this.f.setShowingTransparent(this.an);
        if (this.t && ((i = this.v) == com.anythink.expressad.foundation.g.a.cr || i == com.anythink.expressad.foundation.g.a.cs)) {
            this.f.setIVRewardEnable(i, this.w, this.x);
            this.f.setDialogRole(getJSCommon() != null ? getJSCommon().n() : 1);
        }
        this.g.setCampaign(this.C);
        this.g.setUnitID(this.m);
        if (this.C.g() > -2) {
            p = this.C.g();
        } else {
            p = this.o.p();
        }
        this.g.setCloseDelayTime(p);
        this.g.setPlayCloseBtnTm(this.o.j());
        this.g.setVideoInteractiveType(this.o.h());
        this.g.setEndscreenType(this.o.r());
        this.g.setVideoSkipTime(e2);
        this.g.setShowingTransparent(this.an);
        this.g.setJSFactory(this.H);
        if (this.C.H() == 2) {
            this.g.setNotifyListener(new com.anythink.expressad.video.module.a.a.h(this.C, this.D, this.q, b(), this.m, new c(this, (byte) 0), this.o.L(), this.y));
            this.g.preLoadData(this.H);
            this.g.showPlayableView();
        } else {
            this.g.setNotifyListener(new com.anythink.expressad.video.module.a.a.c(this.H, this.C, this.q, this.D, b(), this.m, new b(this.l, this.C), this.o.L(), this.y));
            this.g.preLoadData(this.H);
            this.f.preLoadData(this.H);
        }
        if (this.an) {
            this.g.setAnythinkClickMiniCardViewTransparent();
        }
    }

    public void notifyEvent(String str) {
        WindVaneWebView windVaneWebView = this.e;
        if (windVaneWebView != null) {
            String str2 = this.G;
            j.a();
            j.a((WebView) windVaneWebView, str, Base64.encodeToString(str2.getBytes(), 2));
        }
    }

    public void onBackPressed() {
        AnythinkContainerView anythinkContainerView;
        AnythinkContainerView anythinkContainerView2;
        AnythinkVideoView anythinkVideoView;
        AnythinkVideoView anythinkVideoView2;
        if (this.an && (anythinkVideoView2 = this.f) != null) {
            anythinkVideoView2.notifyVideoClose();
        } else if (this.ap && (anythinkVideoView = this.f) != null) {
            if (anythinkVideoView.isMiniCardShowing()) {
                AnythinkContainerView anythinkContainerView3 = this.g;
                if (anythinkContainerView3 != null) {
                    anythinkContainerView3.onMiniEndcardBackPress();
                    return;
                }
                return;
            }
            this.f.onBackPress();
        } else if (this.ar && (anythinkContainerView2 = this.g) != null) {
            anythinkContainerView2.onPlayableBackPress();
        } else {
            if (this.aq && (anythinkContainerView = this.g) != null) {
                anythinkContainerView.onEndcardBackPress();
            }
            if (getJSCommon().g()) {
                if (getJSContainerModule() == null || !getJSContainerModule().miniCardShowing()) {
                    getActivityProxy().g();
                }
            } else if (canBackPress()) {
                Activity activity = this.l;
                if (activity == null || this.y || this.as) {
                    return;
                }
                this.as = true;
                activity.onBackPressed();
            } else {
                n.a(A, "onBackPressed can't excute");
            }
        }
    }

    @Override // com.anythink.expressad.video.signal.container.AbstractJSContainer, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onCreate() {
        ViewGroup viewGroup;
        String str = A;
        n.a(str, "onCreate isBigOffer: " + this.y);
        if (this.o == null) {
            this.o = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), this.m, this.t);
        }
        this.as = false;
        try {
            if (this.y) {
                com.anythink.expressad.foundation.d.c cVar = this.C;
                if (cVar != null && cVar.j()) {
                    this.E = new com.anythink.expressad.video.bt.module.b.e(getContext(), this.t, this.o, this.C, this.E, b(), this.m);
                } else {
                    this.E = new com.anythink.expressad.video.bt.module.b.d(this.F, this.G);
                }
            } else {
                this.E = new com.anythink.expressad.video.bt.module.b.e(getContext(), this.t, this.o, this.C, this.E, b(), this.m);
            }
            registerErrorListener(new com.anythink.expressad.video.bt.module.b.f(this.E));
            a(this.o, this.C);
            setShowingTransparent();
            int layoutID = getLayoutID();
            if (layoutID <= 0) {
                a("layoutID not found");
                return;
            }
            View inflate = this.S.inflate(layoutID, (ViewGroup) null);
            this.B = inflate;
            addView(inflate, new RelativeLayout.LayoutParams(-1, -1));
            if (this.a) {
                setMatchParent();
            }
            this.e = findWindVaneWebView();
            AnythinkVideoView findAnythinkVideoView = findAnythinkVideoView();
            this.f = findAnythinkVideoView;
            findAnythinkVideoView.setVideoLayout(this.C);
            this.f.setIsIV(this.t);
            this.f.setUnitId(this.m);
            if (this.y) {
                this.f.setNotchPadding(this.M, this.N, this.O, this.P);
            }
            AnythinkContainerView findAnythinkContainerView = findAnythinkContainerView();
            this.g = findAnythinkContainerView;
            if (this.y) {
                findAnythinkContainerView.setNotchPadding(this.L, this.M, this.N, this.O, this.P);
            }
            if (!((this.f == null || this.g == null || !initViews()) ? false : true)) {
                this.d.a(com.anythink.expressad.foundation.e.a.b);
                Activity activity = this.l;
                if (activity != null) {
                    activity.finish();
                    return;
                }
                return;
            }
            this.c = true;
            WindVaneWebView windVaneWebView = this.e;
            com.anythink.expressad.video.signal.factory.b bVar = new com.anythink.expressad.video.signal.factory.b(this.l, windVaneWebView, this.f, this.g, this.C, new d(this, (byte) 0));
            this.H = bVar;
            registerJsFactory(bVar);
            com.anythink.expressad.foundation.f.b a2 = com.anythink.expressad.foundation.f.b.a();
            a2.a(this.m + "_1", new AnonymousClass5());
            if (windVaneWebView != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.B.findViewById(com.anythink.expressad.foundation.h.h.a(getContext(), "anythink_video_templete_webview_parent", "id"));
                windVaneWebView.setApiManagerJSFactory(this.H);
                if (windVaneWebView.getParent() != null) {
                    defaultLoad(0, "preload template webview is null or load error");
                    return;
                }
                if (windVaneWebView.getObject() instanceof com.anythink.expressad.video.signal.a.j) {
                    this.H.a((com.anythink.expressad.video.signal.a.j) windVaneWebView.getObject());
                    getJSCommon().a(this.s);
                    getJSCommon().a(this.m);
                    getJSCommon().a(this.o);
                    getJSCommon().a(new d(this, (byte) 0));
                    com.anythink.expressad.foundation.d.c cVar2 = this.C;
                    if (cVar2 != null && (cVar2.F() || this.C.aA())) {
                        MraidVolumeChangeReceiver mraidVolumeChangeReceiver = new MraidVolumeChangeReceiver(getContext());
                        this.at = mraidVolumeChangeReceiver;
                        mraidVolumeChangeReceiver.registerReceiver();
                        this.at.getCurrentVolume();
                        this.at.setVolumeChangeListener(new AnonymousClass6());
                    }
                    getJSContainerModule().readyStatus(((com.anythink.expressad.video.signal.a.j) windVaneWebView.getObject()).r());
                    j();
                    ((com.anythink.expressad.video.signal.a.j) windVaneWebView.getObject()).r.b();
                    if (this.y) {
                        getJSCommon().f(this.af);
                        getJSCommon().e(this.ag);
                    }
                }
                if (getJSCommon().f() == 1 && (viewGroup = (ViewGroup) this.B.findViewById(com.anythink.expressad.foundation.h.h.a(getContext(), "anythink_video_templete_webview_parent", "id"))) != null) {
                    ((ViewGroup) this.B).removeView(viewGroup);
                    ((ViewGroup) this.B).addView(viewGroup, 1);
                }
                viewGroup2.addView(windVaneWebView, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            n.a(str, "template webview is null");
            defaultLoad(0, "preload template webview is null or load error");
        } catch (Throwable th) {
            a("onCreate error".concat(String.valueOf(th)));
        }
    }

    @Override // com.anythink.expressad.video.signal.container.AbstractJSContainer
    public void onDestroy() {
        com.anythink.expressad.foundation.d.c cVar;
        int i;
        if (this.K) {
            return;
        }
        boolean z = true;
        this.K = true;
        super.onDestroy();
        try {
            AnythinkVideoView anythinkVideoView = this.f;
            if (anythinkVideoView != null) {
                anythinkVideoView.releasePlayer();
            }
            com.anythink.expressad.videocommon.b.a aVar = this.D;
            if (aVar != null) {
                try {
                    String p = aVar.p();
                    if (!TextUtils.isEmpty(p) && com.anythink.expressad.foundation.g.i.a.c(p)) {
                        com.anythink.expressad.foundation.g.i.a.b(p);
                    }
                } catch (Exception unused) {
                }
            }
            WindVaneWebView windVaneWebView = this.e;
            if (windVaneWebView != null) {
                ViewGroup viewGroup = (ViewGroup) windVaneWebView.getParent();
                if (viewGroup != null) {
                    viewGroup.removeAllViews();
                }
                this.e.clearWebView();
                this.e.release();
            }
            if (this.F != null) {
                this.F = null;
            }
            this.h.removeCallbacks(this.i);
            this.h.removeCallbacks(this.j);
            getJSCommon().k();
            if (this.t) {
                com.anythink.expressad.d.b.a();
                com.anythink.expressad.d.b.c(this.m);
            }
            if (!this.aj) {
                this.aj = true;
                com.anythink.expressad.foundation.d.c cVar2 = this.C;
                if (cVar2 != null && cVar2.H() == 2) {
                    this.ak = true;
                }
                h hVar = this.E;
                if (hVar != null) {
                    if (this.t && ((i = this.v) == com.anythink.expressad.foundation.g.a.cr || i == com.anythink.expressad.foundation.g.a.cs)) {
                        if (this.J != 1) {
                            z = false;
                        }
                        hVar.a(z, this.I);
                    }
                    if (!this.ak) {
                        this.q.a(0);
                    }
                    this.E.a(this.ak, this.q);
                }
                this.h.removeCallbacks(this.au);
                if (((!this.t && !this.y) || ((cVar = this.C) != null && cVar.j())) && this.ak) {
                    n.a(A, "sendToServerRewardInfo");
                    com.anythink.expressad.video.module.b.a.a(this.C, this.q, this.m, this.p, this.R);
                }
                if (!this.y) {
                    if (this.t) {
                        com.anythink.expressad.videocommon.a.b(com.anythink.expressad.foundation.g.a.aU, this.C);
                    } else {
                        com.anythink.expressad.videocommon.a.b(94, this.C);
                    }
                }
                AnythinkContainerView anythinkContainerView = this.g;
                if (anythinkContainerView != null) {
                    anythinkContainerView.release();
                }
            }
            MraidVolumeChangeReceiver mraidVolumeChangeReceiver = this.at;
            if (mraidVolumeChangeReceiver != null) {
                mraidVolumeChangeReceiver.unregisterReceiver();
            }
            if (!this.y) {
                if (isLoadSuccess()) {
                    this.h.postDelayed(new Runnable() { // from class: com.anythink.expressad.video.bt.module.ATTempContainer.4
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (ATTempContainer.this.l != null) {
                                ATTempContainer.this.l.finish();
                            }
                        }
                    }, 100L);
                } else {
                    Activity activity = this.l;
                    if (activity != null) {
                        activity.finish();
                    }
                }
            }
            com.anythink.expressad.video.bt.a.c.a();
            com.anythink.expressad.video.bt.a.c.f(this.G);
        } catch (Throwable th) {
            n.a(A, th.getMessage());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // com.anythink.expressad.video.signal.container.AbstractJSContainer
    public void onPause() {
        super.onPause();
        this.al = true;
        try {
            getJSVideoModule().videoOperate(2);
            AnythinkContainerView anythinkContainerView = this.g;
            if (anythinkContainerView != null) {
                anythinkContainerView.setOnPause();
            }
        } catch (Throwable th) {
            n.b(A, th.getMessage(), th);
        }
    }

    @Override // com.anythink.expressad.video.signal.container.AbstractJSContainer
    public void onResume() {
        Runnable runnable;
        Activity activity;
        super.onResume();
        int i = this.ae;
        if (i == -3) {
            runnable = this.i;
        } else {
            runnable = i == -4 ? this.j : null;
        }
        if (runnable != null) {
            runnable.run();
            this.ae = 0;
        }
        try {
            if (this.f != null && !i() && !this.f.isMiniCardShowing() && !com.anythink.expressad.foundation.f.b.c) {
                this.f.setCover(false);
            }
            AnythinkContainerView anythinkContainerView = this.g;
            if (anythinkContainerView != null) {
                anythinkContainerView.setOnResume();
            }
            if (this.al && !i() && !com.anythink.expressad.foundation.f.b.c) {
                getJSVideoModule().videoOperate(1);
            }
            Activity activity2 = this.l;
            if (activity2 != null) {
                s.a(activity2.getWindow().getDecorView());
            }
            if (this.an && this.ao && (activity = this.l) != null) {
                activity.finish();
            }
        } catch (Throwable th) {
            n.b(A, th.getMessage(), th);
        }
    }

    @Override // com.anythink.expressad.video.signal.container.AbstractJSContainer
    public void onStop() {
        super.onStop();
        AnythinkVideoView anythinkVideoView = this.f;
        if (anythinkVideoView != null) {
            anythinkVideoView.setCover(true);
        }
    }

    public void preload() {
    }

    public void receiveSuccess() {
        n.a(A, "receiveSuccess ,start hybrid");
        this.h.removeCallbacks(this.j);
        this.h.postDelayed(this.au, 250L);
    }

    public void registerErrorListener(a aVar) {
        this.d = aVar;
    }

    public void setAnythinkTempCallback(com.anythink.expressad.video.bt.module.a.b bVar) {
        this.F = bVar;
    }

    public void setCampaign(com.anythink.expressad.foundation.d.c cVar) {
        this.C = cVar;
        if (cVar != null) {
            if (TextUtils.isEmpty(cVar.I()) && !TextUtils.isEmpty(this.m)) {
                cVar.j(this.m);
            }
            com.anythink.expressad.foundation.f.b a2 = com.anythink.expressad.foundation.f.b.a();
            a2.a(cVar.I() + "_1", cVar);
        }
    }

    public void setCampaignDownLoadTask(com.anythink.expressad.videocommon.b.a aVar) {
        this.D = aVar;
    }

    public void setCampaignExpired(boolean z) {
        try {
            com.anythink.expressad.foundation.d.c cVar = this.C;
            if (cVar != null) {
                if (z) {
                    cVar.d(1);
                    if (this.u) {
                        this.C.l(0);
                        return;
                    }
                    com.anythink.expressad.videocommon.e.d dVar = this.o;
                    if (dVar != null) {
                        if (dVar.L() == 1) {
                            this.C.l(1);
                            return;
                        } else {
                            this.C.l(0);
                            return;
                        }
                    }
                    return;
                }
                cVar.d(0);
                if (this.C.y()) {
                    this.C.l(0);
                    return;
                }
                com.anythink.expressad.videocommon.e.d dVar2 = this.o;
                if (dVar2 != null) {
                    this.C.l(dVar2.a());
                }
            }
        } catch (Exception e2) {
            n.d(A, e2.getMessage());
        }
    }

    public void setDeveloperExtraData(String str) {
        this.R = str;
    }

    public void setH5Cbp(int i) {
        this.ag = i;
    }

    public void setInstanceId(String str) {
        this.G = str;
    }

    public void setJSFactory(com.anythink.expressad.video.signal.factory.b bVar) {
        this.H = bVar;
    }

    public void setMatchParent() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        layoutParams.height = -1;
        layoutParams.width = -1;
    }

    public void setMediaPlayerUrl(String str) {
    }

    public void setNotchPadding(int i, int i2, int i3, int i4, int i5) {
        this.L = i;
        this.M = i2;
        this.N = i3;
        this.O = i4;
        this.P = i5;
        String a2 = g.a(i, i2, i3, i4, i5);
        this.Q = a2;
        n.d(A, a2);
        if (getJSCommon() != null && !TextUtils.isEmpty(this.Q)) {
            getJSCommon().b(this.Q);
            if (this.e != null && !TextUtils.isEmpty(this.Q)) {
                j.a();
                j.a((WebView) this.e, "oncutoutfetched", Base64.encodeToString(this.Q.getBytes(), 0));
            }
        }
        AnythinkVideoView anythinkVideoView = this.f;
        if (anythinkVideoView != null) {
            anythinkVideoView.setNotchPadding(i2, i3, i4, i5);
        }
        AnythinkContainerView anythinkContainerView = this.g;
        if (anythinkContainerView != null) {
            anythinkContainerView.setNotchPadding(i, i2, i3, i4, i5);
        }
    }

    public void setShowRewardListener(h hVar) {
        this.E = hVar;
    }

    public void setShowingTransparent() {
        int a2;
        Activity activity;
        boolean h = h();
        this.an = h;
        if (h || (a2 = com.anythink.expressad.foundation.h.h.a(getContext(), "anythink_reward_theme", com.anythink.expressad.foundation.h.h.e)) <= 1 || (activity = this.l) == null) {
            return;
        }
        activity.setTheme(a2);
    }

    public void setWebViewFront(int i) {
        this.af = i;
    }

    public void superDefaultLoad(int i, String str) {
        String str2 = A;
        n.d(str2, "receiveError:" + i + ",descroption:" + str);
        this.h.removeCallbacks(this.i);
        this.h.removeCallbacks(this.j);
        this.d.b();
        WindVaneWebView windVaneWebView = this.e;
        if (windVaneWebView != null) {
            windVaneWebView.setVisibility(8);
        }
    }

    private void d() {
        if (this.a) {
            setMatchParent();
        }
    }

    private int e() {
        com.anythink.expressad.video.signal.a.j b2 = b(this.C);
        if (b2 != null) {
            return b2.c();
        }
        return 0;
    }

    private int f() {
        if (getJSCommon() != null) {
            return getJSCommon().n();
        }
        return 1;
    }

    private int g() {
        com.anythink.expressad.video.signal.a.j b2 = b(this.C);
        if (b2 != null) {
            return b2.b();
        }
        return 0;
    }

    private boolean h() {
        com.anythink.expressad.video.signal.a.j b2 = b(this.C);
        if (b2 != null) {
            return b2.a();
        }
        return false;
    }

    private boolean i() {
        AnythinkVideoView anythinkVideoView = this.f;
        if (anythinkVideoView != null) {
            return anythinkVideoView.isShowingAlertView() || this.f.isInstallDialogShowing();
        }
        return false;
    }

    private void j() {
        int f;
        int e2;
        try {
            if (this.e != null) {
                int i = getResources().getConfiguration().orientation;
                if (h()) {
                    f = s.g(getContext());
                    e2 = s.h(getContext());
                    if (com.anythink.expressad.foundation.h.f.a(getContext())) {
                        int i2 = s.i(getContext());
                        if (i == 2) {
                            f += i2;
                        } else {
                            e2 += i2;
                        }
                    }
                } else {
                    f = s.f(getContext());
                    e2 = s.e(getContext());
                }
                int c2 = this.C.L().c();
                if (c(this.C) == 1) {
                    c2 = i;
                }
                getJSNotifyProxy().a(i, c2, f, e2);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(com.anythink.expressad.foundation.g.a.ch, s.c(getContext()));
                try {
                    if (this.q != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("name", this.q.a());
                        jSONObject2.put("amount", this.q.b());
                        jSONObject2.put("id", this.r);
                        jSONObject.put(DataKeys.USER_ID, this.p);
                        jSONObject.put("reward", jSONObject2);
                        jSONObject.put("playVideoMute", this.s);
                        jSONObject.put("extra", this.R);
                    }
                } catch (JSONException e3) {
                    n.a(A, e3.getMessage());
                } catch (Exception e4) {
                    n.a(A, e4.getMessage());
                }
                getJSNotifyProxy().a(jSONObject.toString());
                j.a();
                j.a((WebView) this.e, "oncutoutfetched", Base64.encodeToString(this.Q.getBytes(), 0));
                getJSCommon().h();
                loadModuleDatas();
                this.h.postDelayed(this.i, U);
            }
        } catch (Exception e5) {
            if (com.anythink.expressad.a.a) {
                e5.printStackTrace();
            }
        }
    }

    private boolean l() {
        this.e = findWindVaneWebView();
        AnythinkVideoView findAnythinkVideoView = findAnythinkVideoView();
        this.f = findAnythinkVideoView;
        findAnythinkVideoView.setVideoLayout(this.C);
        this.f.setIsIV(this.t);
        this.f.setUnitId(this.m);
        if (this.y) {
            this.f.setNotchPadding(this.M, this.N, this.O, this.P);
        }
        AnythinkContainerView findAnythinkContainerView = findAnythinkContainerView();
        this.g = findAnythinkContainerView;
        if (this.y) {
            findAnythinkContainerView.setNotchPadding(this.L, this.M, this.N, this.O, this.P);
        }
        return (this.f == null || this.g == null || !initViews()) ? false : true;
    }

    private void m() {
        if (this.o == null) {
            this.o = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), this.m, this.t);
        }
    }

    private void n() {
        com.anythink.expressad.videocommon.b.a aVar = this.D;
        if (aVar != null) {
            try {
                String p = aVar.p();
                if (TextUtils.isEmpty(p) || !com.anythink.expressad.foundation.g.i.a.c(p)) {
                    return;
                }
                com.anythink.expressad.foundation.g.i.a.b(p);
            } catch (Exception unused) {
            }
        }
    }

    private void o() {
        int i;
        try {
            com.anythink.expressad.video.bt.module.a.b bVar = this.F;
            if (bVar != null) {
                if (this.t && ((i = this.v) == com.anythink.expressad.foundation.g.a.cr || i == com.anythink.expressad.foundation.g.a.cs)) {
                    boolean z = true;
                    if (this.J != 1) {
                        z = false;
                    }
                    bVar.a(z, this.I);
                }
                this.F.a(this.G, this.ak, this.q);
                return;
            }
            Activity activity = this.l;
            if (activity != null) {
                activity.finish();
            }
        } catch (Exception unused) {
            Activity activity2 = this.l;
            if (activity2 != null) {
                activity2.finish();
            }
        }
    }

    private void q() {
        ViewGroup viewGroup;
        WindVaneWebView windVaneWebView = this.e;
        com.anythink.expressad.video.signal.factory.b bVar = new com.anythink.expressad.video.signal.factory.b(this.l, windVaneWebView, this.f, this.g, this.C, new d(this, (byte) 0));
        this.H = bVar;
        registerJsFactory(bVar);
        com.anythink.expressad.foundation.f.b.a().a(wo1.C(new StringBuilder(), this.m, "_1"), new AnonymousClass5());
        if (windVaneWebView != null) {
            ViewGroup viewGroup2 = (ViewGroup) this.B.findViewById(com.anythink.expressad.foundation.h.h.a(getContext(), "anythink_video_templete_webview_parent", "id"));
            windVaneWebView.setApiManagerJSFactory(this.H);
            if (windVaneWebView.getParent() != null) {
                defaultLoad(0, "preload template webview is null or load error");
                return;
            }
            if (windVaneWebView.getObject() instanceof com.anythink.expressad.video.signal.a.j) {
                this.H.a((com.anythink.expressad.video.signal.a.j) windVaneWebView.getObject());
                getJSCommon().a(this.s);
                getJSCommon().a(this.m);
                getJSCommon().a(this.o);
                getJSCommon().a(new d(this, (byte) 0));
                com.anythink.expressad.foundation.d.c cVar = this.C;
                if (cVar != null && (cVar.F() || this.C.aA())) {
                    MraidVolumeChangeReceiver mraidVolumeChangeReceiver = new MraidVolumeChangeReceiver(getContext());
                    this.at = mraidVolumeChangeReceiver;
                    mraidVolumeChangeReceiver.registerReceiver();
                    this.at.getCurrentVolume();
                    this.at.setVolumeChangeListener(new AnonymousClass6());
                }
                getJSContainerModule().readyStatus(((com.anythink.expressad.video.signal.a.j) windVaneWebView.getObject()).r());
                j();
                ((com.anythink.expressad.video.signal.a.j) windVaneWebView.getObject()).r.b();
                if (this.y) {
                    getJSCommon().f(this.af);
                    getJSCommon().e(this.ag);
                }
            }
            if (getJSCommon().f() == 1 && (viewGroup = (ViewGroup) this.B.findViewById(com.anythink.expressad.foundation.h.h.a(getContext(), "anythink_video_templete_webview_parent", "id"))) != null) {
                ((ViewGroup) this.B).removeView(viewGroup);
                ((ViewGroup) this.B).addView(viewGroup, 1);
            }
            viewGroup2.addView(windVaneWebView, new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        n.a(A, "template webview is null");
        defaultLoad(0, "preload template webview is null or load error");
    }

    private void r() {
        getJSCommon().a(this.s);
        getJSCommon().a(this.m);
        getJSCommon().a(this.o);
        getJSCommon().a(new d(this, (byte) 0));
        com.anythink.expressad.foundation.d.c cVar = this.C;
        if (cVar != null) {
            if (cVar.F() || this.C.aA()) {
                MraidVolumeChangeReceiver mraidVolumeChangeReceiver = new MraidVolumeChangeReceiver(getContext());
                this.at = mraidVolumeChangeReceiver;
                mraidVolumeChangeReceiver.registerReceiver();
                this.at.getCurrentVolume();
                this.at.setVolumeChangeListener(new AnonymousClass6());
            }
        }
    }

    private void t() {
        com.anythink.expressad.foundation.d.c cVar;
        int i;
        boolean z = true;
        try {
            this.aj = true;
            com.anythink.expressad.foundation.d.c cVar2 = this.C;
            if (cVar2 != null && cVar2.H() == 2) {
                this.ak = true;
            }
            h hVar = this.E;
            if (hVar != null) {
                if (this.t && ((i = this.v) == com.anythink.expressad.foundation.g.a.cr || i == com.anythink.expressad.foundation.g.a.cs)) {
                    if (this.J != 1) {
                        z = false;
                    }
                    hVar.a(z, this.I);
                }
                if (!this.ak) {
                    this.q.a(0);
                }
                this.E.a(this.ak, this.q);
            }
            this.h.removeCallbacks(this.au);
            if (((!this.t && !this.y) || ((cVar = this.C) != null && cVar.j())) && this.ak) {
                n.a(A, "sendToServerRewardInfo");
                com.anythink.expressad.video.module.b.a.a(this.C, this.q, this.m, this.p, this.R);
            }
            if (!this.y) {
                if (this.t) {
                    com.anythink.expressad.videocommon.a.b(com.anythink.expressad.foundation.g.a.aU, this.C);
                } else {
                    com.anythink.expressad.videocommon.a.b(94, this.C);
                }
            }
            AnythinkContainerView anythinkContainerView = this.g;
            if (anythinkContainerView != null) {
                anythinkContainerView.release();
            }
        } catch (Throwable th) {
            n.b(A, th.getMessage(), th);
        }
    }

    private void v() {
        if (isLoadSuccess()) {
            this.l.runOnUiThread(new AnonymousClass7());
        }
    }

    private void w() {
        if (isLoadSuccess()) {
            this.l.runOnUiThread(new AnonymousClass8());
        }
    }

    private static RelativeLayout.LayoutParams c() {
        return new RelativeLayout.LayoutParams(-1, -1);
    }

    public static /* synthetic */ void s(ATTempContainer aTTempContainer) {
        if (aTTempContainer.isLoadSuccess()) {
            aTTempContainer.l.runOnUiThread(new AnonymousClass7());
        }
    }

    @Override // com.anythink.expressad.video.signal.container.AbstractJSContainer
    public final void a(String str) {
        h hVar = this.E;
        if (hVar != null) {
            hVar.a(str);
        }
        super.a(str);
    }

    public static /* synthetic */ void k(ATTempContainer aTTempContainer) {
        int i;
        try {
            com.anythink.expressad.video.bt.module.a.b bVar = aTTempContainer.F;
            if (bVar != null) {
                if (aTTempContainer.t && ((i = aTTempContainer.v) == com.anythink.expressad.foundation.g.a.cr || i == com.anythink.expressad.foundation.g.a.cs)) {
                    boolean z = true;
                    if (aTTempContainer.J != 1) {
                        z = false;
                    }
                    bVar.a(z, aTTempContainer.I);
                }
                aTTempContainer.F.a(aTTempContainer.G, aTTempContainer.ak, aTTempContainer.q);
                return;
            }
            Activity activity = aTTempContainer.l;
            if (activity != null) {
                activity.finish();
            }
        } catch (Exception unused) {
            Activity activity2 = aTTempContainer.l;
            if (activity2 != null) {
                activity2.finish();
            }
        }
    }

    public static /* synthetic */ void u(ATTempContainer aTTempContainer) {
        if (aTTempContainer.isLoadSuccess()) {
            aTTempContainer.l.runOnUiThread(new AnonymousClass8());
        }
    }

    private void a(int i, String str) {
        try {
            r rVar = new r();
            rVar.h(r.i);
            rVar.c("code=" + i + ",desc=" + str);
            com.anythink.expressad.foundation.d.c cVar = this.C;
            rVar.b((cVar == null || cVar.L() == null) ? "" : this.C.L().e());
            rVar.f(this.m);
            com.anythink.expressad.foundation.d.c cVar2 = this.C;
            rVar.g(cVar2 != null ? cVar2.aZ() : "");
            com.anythink.expressad.foundation.d.c cVar3 = this.C;
            if (cVar3 != null && !TextUtils.isEmpty(cVar3.aa())) {
                rVar.d(this.C.aa());
            }
            com.anythink.expressad.foundation.d.c cVar4 = this.C;
            if (cVar4 != null && !TextUtils.isEmpty(cVar4.ab())) {
                rVar.e(this.C.ab());
            }
            getContext();
            int a2 = com.anythink.expressad.foundation.h.j.a();
            rVar.c(a2);
            rVar.j(com.anythink.expressad.foundation.h.j.a(getContext(), a2));
            r.a(rVar);
            com.anythink.expressad.video.module.b.a.a();
        } catch (Throwable th) {
            n.b(A, th.getMessage(), th);
        }
    }

    public ATTempContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.G = "";
        this.I = com.anythink.expressad.foundation.g.a.cv;
        this.K = false;
        this.Q = "";
        this.a = false;
        this.c = false;
        this.d = new a.C0077a();
        this.h = new Handler();
        this.ae = 0;
        this.af = 0;
        this.ag = 0;
        this.i = new Runnable() { // from class: com.anythink.expressad.video.bt.module.ATTempContainer.1
            @Override // java.lang.Runnable
            public final void run() {
                if (ATTempContainer.this.getActivityProxy().h() != 0) {
                    ATTempContainer.this.ae = -3;
                    return;
                }
                String unused = ATTempContainer.A;
                ATTempContainer.this.defaultLoad(-1, "WebView load timeout");
            }
        };
        this.j = new Runnable() { // from class: com.anythink.expressad.video.bt.module.ATTempContainer.2
            @Override // java.lang.Runnable
            public final void run() {
                if (ATTempContainer.this.getActivityProxy().h() != 0) {
                    ATTempContainer.this.ae = -4;
                } else {
                    ATTempContainer.this.defaultLoad(-3, "JS bridge connect timeout");
                }
            }
        };
        this.aj = false;
        this.ak = false;
        this.al = false;
        this.an = false;
        this.ao = false;
        this.ap = false;
        this.aq = false;
        this.ar = false;
        this.as = false;
        this.au = new Runnable() { // from class: com.anythink.expressad.video.bt.module.ATTempContainer.3
            @Override // java.lang.Runnable
            public final void run() {
                if (ATTempContainer.this.ai != null) {
                    ATTempContainer.this.ai.setVisibility(8);
                }
            }
        };
        init(context);
    }
}