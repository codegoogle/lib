package com.anythink.expressad.splash.js;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.anythink.core.common.b.m;
import com.anythink.expressad.atsignalcommon.a.b;
import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.h.j;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.splash.d.a;
import com.google.android.gms.ads.AdError;
import com.p7700g.p99005.tm4;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class SplashExpandDialog extends Dialog {
    private final String a;
    private String b;
    private boolean c;
    private FrameLayout d;
    private WindVaneWebView e;
    private TextView f;
    private String g;
    private List<c> h;
    private a i;
    private IMraidJSBridge j;

    /* renamed from: com.anythink.expressad.splash.js.SplashExpandDialog$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public AnonymousClass1() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SplashExpandDialog.this.dismiss();
        }
    }

    /* renamed from: com.anythink.expressad.splash.js.SplashExpandDialog$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 extends b {
        public AnonymousClass2() {
        }

        @Override // com.anythink.expressad.atsignalcommon.a.b, com.anythink.expressad.atsignalcommon.windvane.e
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            webView.evaluateJavascript("javascript:" + com.anythink.expressad.d.b.a.a().b(), new ValueCallback<String>() { // from class: com.anythink.expressad.splash.js.SplashExpandDialog.2.1
                @Override // android.webkit.ValueCallback
                public void onReceiveValue(String str2) {
                }
            });
            SplashExpandDialog.a(SplashExpandDialog.this);
        }
    }

    /* renamed from: com.anythink.expressad.splash.js.SplashExpandDialog$3  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass3 implements DialogInterface.OnDismissListener {
        public AnonymousClass3() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (SplashExpandDialog.this.i != null) {
                SplashExpandDialog.this.i.a(false);
                SplashExpandDialog.this.i.c();
            }
            SplashExpandDialog.this.e.loadDataWithBaseURL(null, "", tm4.D, "utf-8", null);
            SplashExpandDialog.this.d.removeView(SplashExpandDialog.this.e);
            SplashExpandDialog.this.e.release();
            SplashExpandDialog.this.e = null;
            SplashExpandDialog.this.i = null;
        }
    }

    public SplashExpandDialog(Context context, Bundle bundle, a aVar) {
        super(context);
        this.a = "SplashExpandDialog";
        this.j = new IMraidJSBridge() { // from class: com.anythink.expressad.splash.js.SplashExpandDialog.4
            @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
            public void close() {
                SplashExpandDialog.this.dismiss();
            }

            @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
            public void expand(String str, boolean z) {
            }

            @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
            public c getMraidCampaign() {
                return null;
            }

            @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
            public void open(String str) {
                try {
                    if (SplashExpandDialog.this.e != null && System.currentTimeMillis() - SplashExpandDialog.this.e.lastTouchTime > com.anythink.expressad.a.b.a.c) {
                        SplashExpandDialog.this.e.getUrl();
                        int i = com.anythink.expressad.a.b.a.a;
                        if (com.anythink.expressad.a.b.a.a((c) SplashExpandDialog.this.h.get(0))) {
                            return;
                        }
                    }
                    n.d("SplashExpandDialog", str);
                    if (SplashExpandDialog.this.h.size() > 1) {
                        m.a().e().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                        str = null;
                    }
                    if (SplashExpandDialog.this.i != null) {
                        SplashExpandDialog.this.i.b(str);
                    }
                } catch (Throwable th) {
                    n.b("SplashExpandDialog", "open", th);
                }
            }

            @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
            public void unload() {
                close();
            }

            @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
            public void useCustomClose(boolean z) {
                try {
                    SplashExpandDialog.this.f.setVisibility(z ? 4 : 0);
                } catch (Throwable th) {
                    n.b("SplashExpandDialog", "useCustomClose", th);
                }
            }
        };
        if (bundle != null) {
            this.b = bundle.getString("url");
            this.c = bundle.getBoolean("shouldUseCustomClose");
        }
        this.i = aVar;
    }

    private void a() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.d = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        WindVaneWebView windVaneWebView = new WindVaneWebView(getContext().getApplicationContext());
        this.e = windVaneWebView;
        windVaneWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.d.addView(this.e);
        TextView textView = new TextView(getContext());
        this.f = textView;
        textView.setBackgroundColor(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
        layoutParams.gravity = 8388661;
        layoutParams.setMargins(30, 30, 30, 30);
        this.f.setLayoutParams(layoutParams);
        this.f.setVisibility(this.c ? 4 : 0);
        this.f.setOnClickListener(new AnonymousClass1());
        this.d.addView(this.f);
        setContentView(this.d);
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            getWindow().setAttributes(attributes);
            getWindow().getDecorView().setSystemUiVisibility(4615);
        }
        this.e.setWebViewListener(new AnonymousClass2());
        this.e.setObject(this.j);
        this.e.loadUrl(this.b);
        setOnDismissListener(new AnonymousClass3());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setCanceledOnTouchOutside(false);
        setCancelable(true);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.d = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        WindVaneWebView windVaneWebView = new WindVaneWebView(getContext().getApplicationContext());
        this.e = windVaneWebView;
        windVaneWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.d.addView(this.e);
        TextView textView = new TextView(getContext());
        this.f = textView;
        textView.setBackgroundColor(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
        layoutParams.gravity = 8388661;
        layoutParams.setMargins(30, 30, 30, 30);
        this.f.setLayoutParams(layoutParams);
        this.f.setVisibility(this.c ? 4 : 0);
        this.f.setOnClickListener(new AnonymousClass1());
        this.d.addView(this.f);
        setContentView(this.d);
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            getWindow().setAttributes(attributes);
            getWindow().getDecorView().setSystemUiVisibility(4615);
        }
        this.e.setWebViewListener(new AnonymousClass2());
        this.e.setObject(this.j);
        this.e.loadUrl(this.b);
        setOnDismissListener(new AnonymousClass3());
    }

    public void setCampaignList(String str, List<c> list) {
        this.g = str;
        this.h = list;
    }

    private void b() {
        try {
            int i = m.a().e().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("orientation", i == 2 ? "landscape" : i == 1 ? "portrait" : AdError.UNDEFINED_DOMAIN);
            jSONObject.put("locked", "true");
            HashMap g = j.g(m.a().e());
            int intValue = ((Integer) g.get("width")).intValue();
            int intValue2 = ((Integer) g.get("height")).intValue();
            HashMap hashMap = new HashMap();
            hashMap.put(CallMraidJS.a, "Interstitial");
            hashMap.put(CallMraidJS.b, CallMraidJS.g);
            hashMap.put(CallMraidJS.c, "true");
            hashMap.put(CallMraidJS.d, jSONObject);
            int[] iArr = new int[2];
            this.e.getLocationInWindow(iArr);
            CallMraidJS callMraidJS = CallMraidJS.getInstance();
            WindVaneWebView windVaneWebView = this.e;
            callMraidJS.fireSetDefaultPosition(windVaneWebView, iArr[0], iArr[1], windVaneWebView.getWidth(), this.e.getHeight());
            CallMraidJS callMraidJS2 = CallMraidJS.getInstance();
            WindVaneWebView windVaneWebView2 = this.e;
            callMraidJS2.fireSetCurrentPosition(windVaneWebView2, iArr[0], iArr[1], windVaneWebView2.getWidth(), this.e.getHeight());
            CallMraidJS.getInstance().fireSetScreenSize(this.e, j.e(m.a().e()), j.f(m.a().e()));
            CallMraidJS.getInstance().fireSetMaxSize(this.e, intValue, intValue2);
            CallMraidJS.getInstance().fireChangeEventForPropertys(this.e, hashMap);
            CallMraidJS.getInstance().fireReadyEvent(this.e);
        } catch (Throwable th) {
            n.b("SplashExpandDialog", "notifyMraid", th);
        }
    }

    public static /* synthetic */ void a(SplashExpandDialog splashExpandDialog) {
        try {
            int i = m.a().e().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("orientation", i == 2 ? "landscape" : i == 1 ? "portrait" : AdError.UNDEFINED_DOMAIN);
            jSONObject.put("locked", "true");
            HashMap g = j.g(m.a().e());
            int intValue = ((Integer) g.get("width")).intValue();
            int intValue2 = ((Integer) g.get("height")).intValue();
            HashMap hashMap = new HashMap();
            hashMap.put(CallMraidJS.a, "Interstitial");
            hashMap.put(CallMraidJS.b, CallMraidJS.g);
            hashMap.put(CallMraidJS.c, "true");
            hashMap.put(CallMraidJS.d, jSONObject);
            int[] iArr = new int[2];
            splashExpandDialog.e.getLocationInWindow(iArr);
            CallMraidJS callMraidJS = CallMraidJS.getInstance();
            WindVaneWebView windVaneWebView = splashExpandDialog.e;
            callMraidJS.fireSetDefaultPosition(windVaneWebView, iArr[0], iArr[1], windVaneWebView.getWidth(), splashExpandDialog.e.getHeight());
            CallMraidJS callMraidJS2 = CallMraidJS.getInstance();
            WindVaneWebView windVaneWebView2 = splashExpandDialog.e;
            callMraidJS2.fireSetCurrentPosition(windVaneWebView2, iArr[0], iArr[1], windVaneWebView2.getWidth(), splashExpandDialog.e.getHeight());
            CallMraidJS.getInstance().fireSetScreenSize(splashExpandDialog.e, j.e(m.a().e()), j.f(m.a().e()));
            CallMraidJS.getInstance().fireSetMaxSize(splashExpandDialog.e, intValue, intValue2);
            CallMraidJS.getInstance().fireChangeEventForPropertys(splashExpandDialog.e, hashMap);
            CallMraidJS.getInstance().fireReadyEvent(splashExpandDialog.e);
        } catch (Throwable th) {
            n.b("SplashExpandDialog", "notifyMraid", th);
        }
    }
}