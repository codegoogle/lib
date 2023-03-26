package com.anythink.expressad.video.signal.container;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.atsignalcommon.windvane.j;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.video.signal.b;
import com.anythink.expressad.video.signal.e;
import com.anythink.expressad.video.signal.factory.IJSFactory;
import com.anythink.expressad.video.signal.factory.a;
import com.anythink.expressad.video.signal.g;
import com.anythink.expressad.video.signal.i;
import com.anythink.expressad.videocommon.a;
import com.anythink.expressad.videocommon.c.c;
import com.anythink.expressad.videocommon.e.d;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class AbstractJSContainer extends FrameLayout implements IJSFactory {
    public static final String k = "AbstractJSContainer";
    private int a;
    private int b;
    public Activity l;
    public String m;
    public String n;
    public d o;
    public String p;
    public c q;
    public String r;
    public int s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public int x;
    public boolean y;
    public IJSFactory z;

    public AbstractJSContainer(Context context) {
        super(context);
        this.a = 0;
        this.b = 1;
        this.s = 2;
        this.t = false;
        this.u = false;
        this.y = false;
        this.z = new a();
    }

    private static void b(Object obj, String str) {
        j.a().a(obj, Base64.encodeToString(str.getBytes(), 2));
    }

    public final void a(Object obj) {
        j.a().a(obj, a(this.a));
    }

    public final int c(com.anythink.expressad.foundation.d.c cVar) {
        com.anythink.expressad.video.signal.a.j b = b(cVar);
        if (b != null) {
            return b.d();
        }
        return 0;
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public com.anythink.expressad.video.signal.a getActivityProxy() {
        return this.z.getActivityProxy();
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public i getIJSRewardVideoV1() {
        return this.z.getIJSRewardVideoV1();
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public b getJSBTModule() {
        return this.z.getJSBTModule();
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public com.anythink.expressad.video.signal.c getJSCommon() {
        return this.z.getJSCommon();
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public e getJSContainerModule() {
        return this.z.getJSContainerModule();
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public g getJSNotifyProxy() {
        return this.z.getJSNotifyProxy();
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public com.anythink.expressad.video.signal.j getJSVideoModule() {
        return this.z.getJSVideoModule();
    }

    public String getPlacementId() {
        return this.n;
    }

    public String getUnitId() {
        return this.m;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        if (getJSCommon().g()) {
            getActivityProxy().a(configuration);
        }
    }

    public void onDestroy() {
        if (getJSCommon().g()) {
            getActivityProxy().c();
        }
    }

    public void onPause() {
        if (getJSCommon().g()) {
            getActivityProxy().a();
        }
        getActivityProxy().a(1);
    }

    public void onRestart() {
        if (getJSCommon().g()) {
            getActivityProxy().f();
        }
        getActivityProxy().a(4);
    }

    public void onResume() {
        if (com.anythink.expressad.foundation.f.b.c) {
            return;
        }
        if (getJSCommon().g()) {
            getActivityProxy().b();
        }
        getActivityProxy().a(0);
    }

    public void onStart() {
        if (getJSCommon().g()) {
            getActivityProxy().e();
        }
        getActivityProxy().a(2);
    }

    public void onStop() {
        if (getJSCommon().g()) {
            getActivityProxy().d();
        }
        getActivityProxy().a(3);
    }

    public void registerJsFactory(IJSFactory iJSFactory) {
        this.z = iJSFactory;
    }

    public void setActivity(Activity activity) {
        this.l = activity;
    }

    public void setBidCampaign(boolean z) {
        this.u = z;
    }

    public void setBigOffer(boolean z) {
        this.y = z;
    }

    public void setIV(boolean z) {
        this.t = z;
    }

    public void setIVRewardEnable(int i, int i2, int i3) {
        this.v = i;
        this.w = i2;
        this.x = i3;
    }

    public void setMute(int i) {
        this.s = i;
    }

    public void setPlacementId(String str) {
        this.n = str;
    }

    public void setReward(c cVar) {
        this.q = cVar;
    }

    public void setRewardId(String str) {
        this.r = str;
    }

    public void setRewardUnitSetting(d dVar) {
        this.o = dVar;
    }

    public void setUnitId(String str) {
        this.m = str;
    }

    public void setUserId(String str) {
        this.p = str;
    }

    public static void a(Object obj, String str) {
        j.a().b(obj, Base64.encodeToString(str.getBytes(), 2));
    }

    private void b(Object obj) {
        j.a().b(obj, a(this.b));
    }

    private static void a(WindVaneWebView windVaneWebView, String str, String str2) {
        j.a();
        j.a((WebView) windVaneWebView, str, Base64.encodeToString(str2.getBytes(), 2));
    }

    public final com.anythink.expressad.video.signal.a.j b(com.anythink.expressad.foundation.d.c cVar) {
        if (cVar == null) {
            return null;
        }
        a.C0082a a = com.anythink.expressad.videocommon.a.a(this.t ? com.anythink.expressad.foundation.g.a.aU : 94, cVar);
        if (a != null && a.c()) {
            WindVaneWebView a2 = a.a();
            if (a2.getObject() instanceof com.anythink.expressad.video.signal.a.j) {
                n.d(k, "JSCommon 进来");
                return (com.anythink.expressad.video.signal.a.j) a2.getObject();
            }
        }
        return null;
    }

    private static String a(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            String jSONObject2 = jSONObject.toString();
            return !TextUtils.isEmpty(jSONObject2) ? Base64.encodeToString(jSONObject2.getBytes(), 2) : "";
        } catch (Throwable unused) {
            n.d(k, "code to string is error");
            return "";
        }
    }

    public AbstractJSContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        this.b = 1;
        this.s = 2;
        this.t = false;
        this.u = false;
        this.y = false;
        this.z = new com.anythink.expressad.video.signal.factory.a();
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    private boolean b(int i) {
        try {
        } catch (Throwable th) {
            n.b(k, th.getMessage(), th);
        }
        if (i != 1) {
            if (i == 2) {
                this.l.setRequestedOrientation(11);
            }
            return false;
        }
        this.l.setRequestedOrientation(12);
        return true;
    }

    public void a(String str) {
        n.d(k, str);
        Activity activity = this.l;
        if (activity != null) {
            activity.finish();
        }
    }

    public final void a(d dVar, com.anythink.expressad.foundation.d.c cVar) {
        c.C0061c L;
        if (c(cVar) == 1) {
            return;
        }
        boolean z = false;
        if (cVar != null && (L = cVar.L()) != null) {
            z = b(L.c());
        }
        if (z || dVar == null) {
            return;
        }
        b(this.o.b());
    }

    public final String b() {
        d dVar;
        if (TextUtils.isEmpty(this.n) && (dVar = this.o) != null && !TextUtils.isEmpty(dVar.N())) {
            return this.o.N();
        }
        return this.n;
    }
}