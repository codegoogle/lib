package com.ironsource.sdk.c;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class a extends FrameLayout implements e {
    public c a;
    private boolean s;

    /* renamed from: com.ironsource.sdk.c.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class RunnableC0122a implements Runnable {
        private /* synthetic */ String s;
        private /* synthetic */ String t;

        public RunnableC0122a(String str, String str2) {
            this.s = str;
            this.t = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            aVar.removeView(aVar.a.u);
            a.this.a.a(this.s, this.t);
            a.this.a = null;
        }
    }

    public a(c cVar, Context context) {
        super(context);
        this.s = false;
        com.ironsource.sdk.a aVar = cVar.e;
        setLayoutParams(new FrameLayout.LayoutParams(aVar.a, aVar.b));
        this.a = cVar;
        addView(cVar.u);
    }

    public void a() {
        JSONObject jSONObject;
        try {
            jSONObject = this.a.d.a().getJSONObject("configs").getJSONObject("visibilityParams");
        } catch (Exception unused) {
            jSONObject = new JSONObject();
        }
        jSONObject.put("adViewId", this.a.t).put("isBNAutoRemove", false).put("isBannerDisplay", this.s);
        this.a.d.a("destroyBanner", jSONObject);
    }

    @Override // com.ironsource.sdk.c.e
    public final synchronized void a(String str, String str2) {
        com.ironsource.sdk.b.b bVar;
        c cVar = this.a;
        if (cVar != null && (bVar = cVar.d) != null && cVar.u != null) {
            if (bVar.a != null && bVar.b != null) {
                bVar.a("containerWasRemoved", bVar.a());
            }
            com.ironsource.environment.e.a.a.a(new RunnableC0122a(str, str2));
        }
    }

    @Override // com.ironsource.sdk.c.e
    public final void a(String str, String str2, String str3) {
        c cVar = this.a;
        if (cVar == null) {
            return;
        }
        cVar.a(str, str2, str3);
    }

    @Override // com.ironsource.sdk.c.e
    public final void a(JSONObject jSONObject, String str, String str2) {
        this.a.a(jSONObject, str, str2);
    }

    @Override // com.ironsource.sdk.c.e
    public final WebView b() {
        return this.a.u;
    }

    @Override // com.ironsource.sdk.c.e
    public final void b(JSONObject jSONObject, String str, String str2) {
        this.a.b(jSONObject, str, str2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Logger.i("IronSourceAdContainer", "onAttachedToWindow:");
        this.s = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        String str;
        com.ironsource.sdk.b.b bVar;
        JSONObject jSONObject;
        super.onDetachedFromWindow();
        Logger.i("IronSourceAdContainer", "onDetachedFromWindow:");
        c cVar = this.a;
        if (cVar == null || (bVar = cVar.d) == null) {
            str = "in onDetachedFromWindow mAdPresenter or mAdPresenter.getLogic() are null";
        } else {
            this.s = false;
            try {
                try {
                    jSONObject = bVar.a().getJSONObject("configs").getJSONObject("visibilityParams");
                } catch (Exception unused) {
                    jSONObject = new JSONObject();
                }
                jSONObject.put("adViewId", this.a.t).put("isBNAutoRemove", true).put("isBannerDisplay", this.s);
                this.a.d.a("destroyBanner", jSONObject);
                return;
            } catch (Exception e) {
                str = e.toString();
            }
        }
        Logger.i("IronSourceAdContainer", str);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        Logger.i("IronSourceAdContainer", "onVisibilityChanged: " + i);
        c cVar = this.a;
        if (cVar == null) {
            return;
        }
        try {
            cVar.d.a("isVisible", i, isShown());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        Logger.i("IronSourceAdContainer", "onWindowVisibilityChanged: " + i);
        c cVar = this.a;
        if (cVar == null) {
            return;
        }
        try {
            cVar.d.a("isWindowVisible", i, isShown());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}