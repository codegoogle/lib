package com.anythink.expressad.mbbanner.a.a;

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
import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.h.j;
import com.anythink.expressad.foundation.h.n;
import com.google.android.gms.ads.AdError;
import com.p7700g.p99005.tm4;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class b extends Dialog {
    private final String a;
    private String b;
    private boolean c;
    private FrameLayout d;
    private WindVaneWebView e;
    private TextView f;
    private String g;
    private List<com.anythink.expressad.foundation.d.c> h;
    private com.anythink.expressad.mbbanner.a.c.a i;
    private IMraidJSBridge j;

    /* renamed from: com.anythink.expressad.mbbanner.a.a.b$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public AnonymousClass1() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            b.this.dismiss();
        }
    }

    /* renamed from: com.anythink.expressad.mbbanner.a.a.b$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 extends com.anythink.expressad.atsignalcommon.a.b {
        public AnonymousClass2() {
        }

        @Override // com.anythink.expressad.atsignalcommon.a.b, com.anythink.expressad.atsignalcommon.windvane.e
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            webView.evaluateJavascript("javascript:" + com.anythink.expressad.d.b.a.a().b(), new ValueCallback<String>() { // from class: com.anythink.expressad.mbbanner.a.a.b.2.1
                private static void a() {
                }

                @Override // android.webkit.ValueCallback
                public final /* bridge */ /* synthetic */ void onReceiveValue(String str2) {
                }
            });
            b.a(b.this);
        }
    }

    /* renamed from: com.anythink.expressad.mbbanner.a.a.b$3  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass3 implements DialogInterface.OnDismissListener {
        public AnonymousClass3() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            if (b.this.i != null) {
                b.this.i.a(false);
            }
            b.this.e.loadDataWithBaseURL(null, "", tm4.D, "utf-8", null);
            b.this.d.removeView(b.this.e);
            b.this.e.release();
            b.this.e = null;
            b.this.i = null;
        }
    }

    public b(Context context, Bundle bundle, com.anythink.expressad.mbbanner.a.c.a aVar) {
        super(context);
        this.a = "BannerExpandDialog";
        this.j = new IMraidJSBridge() { // from class: com.anythink.expressad.mbbanner.a.a.b.4
            @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
            public final void close() {
                b.this.dismiss();
            }

            @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
            public final void expand(String str, boolean z) {
            }

            @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
            public final com.anythink.expressad.foundation.d.c getMraidCampaign() {
                return null;
            }

            @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
            public final void open(String str) {
                try {
                    if (b.this.e != null && System.currentTimeMillis() - b.this.e.lastTouchTime > com.anythink.expressad.a.b.a.c) {
                        b.this.e.getUrl();
                        int i = com.anythink.expressad.a.b.a.a;
                        if (com.anythink.expressad.a.b.a.a((com.anythink.expressad.foundation.d.c) b.this.h.get(0))) {
                            return;
                        }
                    }
                    n.d("BannerExpandDialog", str);
                    if (b.this.h.size() > 1) {
                        m.a().e().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                        str = null;
                    }
                    if (b.this.i != null) {
                        b.this.i.a(true, str);
                    }
                } catch (Throwable th) {
                    n.b("BannerExpandDialog", "open", th);
                }
            }

            @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
            public final void unload() {
                close();
            }

            @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
            public final void useCustomClose(boolean z) {
                try {
                    b.this.f.setVisibility(z ? 4 : 0);
                } catch (Throwable th) {
                    n.b("BannerExpandDialog", "useCustomClose", th);
                }
            }
        };
        this.b = bundle.getString("url");
        this.c = bundle.getBoolean("shouldUseCustomClose");
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

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
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
            n.b("BannerExpandDialog", "notifyMraid", th);
        }
    }

    public final void a(String str, List<com.anythink.expressad.foundation.d.c> list) {
        this.g = str;
        this.h = list;
    }

    public static /* synthetic */ void a(b bVar) {
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
            bVar.e.getLocationInWindow(iArr);
            CallMraidJS callMraidJS = CallMraidJS.getInstance();
            WindVaneWebView windVaneWebView = bVar.e;
            callMraidJS.fireSetDefaultPosition(windVaneWebView, iArr[0], iArr[1], windVaneWebView.getWidth(), bVar.e.getHeight());
            CallMraidJS callMraidJS2 = CallMraidJS.getInstance();
            WindVaneWebView windVaneWebView2 = bVar.e;
            callMraidJS2.fireSetCurrentPosition(windVaneWebView2, iArr[0], iArr[1], windVaneWebView2.getWidth(), bVar.e.getHeight());
            CallMraidJS.getInstance().fireSetScreenSize(bVar.e, j.e(m.a().e()), j.f(m.a().e()));
            CallMraidJS.getInstance().fireSetMaxSize(bVar.e, intValue, intValue2);
            CallMraidJS.getInstance().fireChangeEventForPropertys(bVar.e, hashMap);
            CallMraidJS.getInstance().fireReadyEvent(bVar.e);
        } catch (Throwable th) {
            n.b("BannerExpandDialog", "notifyMraid", th);
        }
    }
}