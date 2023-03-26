package com.anythink.expressad.video.bt.module;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.core.common.j.k;
import com.anythink.expressad.foundation.b.a;
import com.anythink.expressad.foundation.g.d.b;
import com.anythink.expressad.foundation.h.h;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.s;
import com.anythink.expressad.video.bt.a.c;
import com.anythink.expressad.video.module.a.a.e;
import com.anythink.expressad.video.signal.a.j;
import com.anythink.expressad.videocommon.e.d;
import com.anythink.expressad.videocommon.view.RoundImageView;
import com.anythink.expressad.videocommon.view.StarLevelView;
import com.p7700g.p99005.zg2;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AnythinkBTNativeEC extends BTBaseView {
    private static final String p = "anythink_reward_endcard_native_hor";
    private static final String q = "anythink_reward_endcard_native_land";
    private TextView A;
    private TextView B;
    private StarLevelView C;
    private boolean D;
    private boolean E;
    private int F;
    private Runnable G;
    private View H;
    private View I;
    private String J;
    private j K;
    private WebView L;
    private ViewGroup r;
    private ViewGroup s;
    private RelativeLayout t;
    private ImageView u;
    private RoundImageView v;
    private ImageView w;
    private ImageView x;
    private ImageView y;
    private TextView z;

    public AnythinkBTNativeEC(Context context) {
        super(context);
        this.D = false;
        this.E = false;
        this.F = 0;
    }

    @TargetApi(17)
    public Bitmap blurBitmap(Bitmap bitmap) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            RenderScript create = RenderScript.create(this.a.getApplicationContext());
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap);
            Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
            create2.setRadius(10.0f);
            create2.setInput(createFromBitmap);
            create2.forEach(createFromBitmap2);
            createFromBitmap2.copyTo(createBitmap);
            bitmap.recycle();
            create.destroy();
            return createBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.anythink.expressad.video.bt.module.BTBaseView
    public void init(Context context) {
        boolean b;
        int findLayout = findLayout(isLandscape() ? q : p);
        if (findLayout > 0) {
            if (isLandscape()) {
                ViewGroup viewGroup = (ViewGroup) this.f.inflate(findLayout, (ViewGroup) null);
                this.s = viewGroup;
                addView(viewGroup);
                b = b(this.s);
            } else {
                ViewGroup viewGroup2 = (ViewGroup) this.f.inflate(findLayout, (ViewGroup) null);
                this.r = viewGroup2;
                addView(viewGroup2);
                b = b(this.r);
            }
            this.h = b;
            a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.G == null) {
            this.G = new Runnable() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTNativeEC.1
                @Override // java.lang.Runnable
                public final void run() {
                    AnythinkBTNativeEC.this.E = true;
                    if (AnythinkBTNativeEC.this.H != null) {
                        AnythinkBTNativeEC.this.H.setVisibility(0);
                    }
                }
            };
        }
        Runnable runnable = this.G;
        if (runnable != null) {
            postDelayed(runnable, this.F * 1000);
        }
        if (!this.h && this.L != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("id", this.d);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("unitId", this.J);
                jSONObject.put("data", jSONObject2);
                n.a(BTBaseView.TAG, "NativeEC Call H5 onCloseBtnClicked " + jSONObject.toString());
            } catch (JSONException e) {
                n.a(BTBaseView.TAG, e.getMessage());
            }
            com.anythink.expressad.atsignalcommon.windvane.j.a();
            com.anythink.expressad.atsignalcommon.windvane.j.a(this.L, "onCloseBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        }
        if (this.L != null) {
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("id", this.d);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("unitId", this.J);
                jSONObject3.put("data", jSONObject4);
                n.a(BTBaseView.TAG, "NativeEC Call H5 onEndCardShow " + jSONObject3.toString());
            } catch (JSONException e2) {
                n.a(BTBaseView.TAG, e2.getMessage());
            }
            com.anythink.expressad.atsignalcommon.windvane.j.a();
            com.anythink.expressad.atsignalcommon.windvane.j.a(this.L, "onNativeECShow", Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
        }
    }

    @Override // com.anythink.expressad.video.bt.module.BTBaseView
    public void onDestory() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.G;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // com.anythink.expressad.video.bt.module.BTBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        int i = configuration.orientation;
        this.g = i;
        if (i == 2) {
            removeView(this.r);
            a(this.s);
            return;
        }
        removeView(this.s);
        a(this.r);
    }

    public void preLoadData() {
        Bitmap blurBitmap;
        try {
            if (this.b == null || !this.h) {
                return;
            }
            d dVar = this.e;
            if (dVar != null) {
                this.F = dVar.p();
            }
            b.a(this.a.getApplicationContext()).a(this.b.be(), new e(this.v, this.b, this.J));
            b.a(this.a.getApplicationContext()).a(this.b.bd(), new com.anythink.expressad.video.module.a.a.j(this.w, s.b(a.b().d(), 8.0f)));
            this.z.setText(this.b.bb());
            this.A.setText(this.b.bc());
            TextView textView = this.B;
            textView.setText(this.b.aY() + ")");
            this.C.removeAllViews();
            double aX = this.b.aX();
            if (aX <= zg2.s) {
                aX = 5.0d;
            }
            this.C.initScore(aX);
            Bitmap a = a(this.v.getDrawable());
            if (a != null && (blurBitmap = blurBitmap(a)) != null) {
                this.u.setImageBitmap(blurBitmap);
            }
            if (!TextUtils.isEmpty(this.b.G()) && this.b.G().contains("alecfc=1")) {
                this.D = true;
            }
            String language = Locale.getDefault().getLanguage();
            if (!TextUtils.isEmpty(language) && language.equals(com.anythink.expressad.video.dynview.a.a.N)) {
                this.x.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("anythink_reward_flag_cn", h.c, a.b().a())));
            } else {
                this.x.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("anythink_reward_flag_en", h.c, a.b().a())));
            }
            a.b().e();
            com.anythink.expressad.d.b.a();
            com.anythink.expressad.d.a b = com.anythink.expressad.d.b.b();
            if (b != null) {
                final String K = b.K();
                if (TextUtils.isEmpty(K)) {
                    this.y.setVisibility(8);
                }
                this.y.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTNativeEC.2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        k.b(AnythinkBTNativeEC.this.a, K);
                    }
                });
            } else {
                this.y.setVisibility(8);
            }
            if (this.E) {
                return;
            }
            this.H.setVisibility(8);
        } catch (Throwable th) {
            n.a(BTBaseView.TAG, th.getMessage());
        }
    }

    public void setCreateWebView(WebView webView) {
        this.L = webView;
    }

    public void setJSCommon(j jVar) {
        this.K = jVar;
    }

    @Override // com.anythink.expressad.video.bt.module.BTBaseView
    public void setUnitId(String str) {
        this.J = str;
    }

    private void a(View view) {
        if (view == null) {
            init(this.a);
            preLoadData();
            return;
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        addView(view);
        b(view);
        a();
    }

    private boolean b(int i) {
        if (isLandscape()) {
            ViewGroup viewGroup = (ViewGroup) this.f.inflate(i, (ViewGroup) null);
            this.s = viewGroup;
            addView(viewGroup);
            return b(this.s);
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f.inflate(i, (ViewGroup) null);
        this.r = viewGroup2;
        addView(viewGroup2);
        return b(this.r);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void c(int i) {
        JSONObject jSONObject;
        j jVar;
        JSONObject jSONObject2 = null;
        try {
            try {
                jSONObject = new JSONObject();
                try {
                    jSONObject.put(com.anythink.expressad.foundation.g.a.ce, a(i));
                } catch (JSONException e) {
                    e = e;
                    jSONObject2 = jSONObject;
                    e.printStackTrace();
                    jSONObject = jSONObject2;
                    jVar = this.K;
                    if (jVar == null) {
                    }
                }
            } catch (JSONException e2) {
                e = e2;
            }
            jVar = this.K;
            if (jVar == null) {
                jVar.click(1, jSONObject != null ? jSONObject.toString() : "");
            }
        } catch (Throwable th) {
            n.a(BTBaseView.TAG, th.getMessage());
        }
    }

    public AnythinkBTNativeEC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.D = false;
        this.E = false;
        this.F = 0;
    }

    private boolean b(View view) {
        try {
            this.t = (RelativeLayout) view.findViewById(findID("anythink_native_ec_layout"));
            this.u = (ImageView) view.findViewById(findID("anythink_iv_adbanner_bg"));
            this.v = (RoundImageView) view.findViewById(findID("anythink_iv_adbanner"));
            this.w = (ImageView) view.findViewById(findID("anythink_iv_icon"));
            this.x = (ImageView) view.findViewById(findID("anythink_iv_flag"));
            this.y = (ImageView) view.findViewById(findID("anythink_iv_link"));
            this.z = (TextView) view.findViewById(findID("anythink_tv_apptitle"));
            this.A = (TextView) view.findViewById(findID("anythink_tv_appdesc"));
            this.B = (TextView) view.findViewById(findID("anythink_tv_nuater"));
            this.C = (StarLevelView) view.findViewById(findID("anythink_sv_starlevel"));
            this.H = view.findViewById(findID("anythink_iv_close"));
            View findViewById = view.findViewById(findID("anythink_tv_cta"));
            this.I = findViewById;
            return isNotNULL(this.u, this.v, this.w, this.z, this.A, this.B, this.C, this.H, findViewById);
        } catch (Throwable th) {
            n.b(BTBaseView.TAG, th.getMessage(), th);
            return false;
        }
    }

    @Override // com.anythink.expressad.video.bt.module.BTBaseView
    public final void a() {
        if (this.h) {
            this.t.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTNativeEC.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (AnythinkBTNativeEC.this.D) {
                        AnythinkBTNativeEC.a(AnythinkBTNativeEC.this, 1);
                        AnythinkBTNativeEC.a(AnythinkBTNativeEC.this, view.getX(), view.getY());
                    }
                }
            });
            this.H.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTNativeEC.4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (AnythinkBTNativeEC.this.L != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", AnythinkBTNativeEC.this.d);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("unitId", AnythinkBTNativeEC.this.J);
                            jSONObject.put("data", jSONObject2);
                            n.a(BTBaseView.TAG, "NativeEC Call H5 onCloseBtnClicked " + jSONObject.toString());
                        } catch (JSONException e) {
                            n.a(BTBaseView.TAG, e.getMessage());
                        }
                        com.anythink.expressad.atsignalcommon.windvane.j.a();
                        com.anythink.expressad.atsignalcommon.windvane.j.a(AnythinkBTNativeEC.this.L, "onCloseBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }
            });
            this.I.setOnClickListener(new com.anythink.expressad.widget.a() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTNativeEC.5
                @Override // com.anythink.expressad.widget.a
                public final void a(View view) {
                    AnythinkBTNativeEC.a(AnythinkBTNativeEC.this, 0);
                    AnythinkBTNativeEC.a(AnythinkBTNativeEC.this, view.getX(), view.getY());
                }
            });
            this.w.setOnClickListener(new com.anythink.expressad.widget.a() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTNativeEC.6
                @Override // com.anythink.expressad.widget.a
                public final void a(View view) {
                    AnythinkBTNativeEC.a(AnythinkBTNativeEC.this, 0);
                    AnythinkBTNativeEC.a(AnythinkBTNativeEC.this, view.getX(), view.getY());
                }
            });
            this.v.setOnClickListener(new com.anythink.expressad.widget.a() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTNativeEC.7
                @Override // com.anythink.expressad.widget.a
                public final void a(View view) {
                    AnythinkBTNativeEC.a(AnythinkBTNativeEC.this, 0);
                    AnythinkBTNativeEC.a(AnythinkBTNativeEC.this, view.getX(), view.getY());
                }
            });
        }
    }

    private static Bitmap a(Drawable drawable) {
        try {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            return createBitmap;
        } catch (Throwable th) {
            n.a(BTBaseView.TAG, th.getMessage());
            return null;
        }
    }

    private void a(float f, float f2) {
        if (this.L != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", BTBaseView.n);
                jSONObject.put("id", this.d);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("x", String.valueOf(f));
                jSONObject2.put("y", String.valueOf(f2));
                jSONObject.put("data", jSONObject2);
                com.anythink.expressad.atsignalcommon.windvane.j.a();
                com.anythink.expressad.atsignalcommon.windvane.j.a(this.L, "onClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } catch (Exception unused) {
                c.a();
                c.a(this.L, "onClicked", this.d);
            }
        }
    }

    private int b() {
        return findLayout(isLandscape() ? q : p);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(AnythinkBTNativeEC anythinkBTNativeEC, int i) {
        JSONObject jSONObject;
        j jVar;
        JSONObject jSONObject2 = null;
        try {
            try {
                jSONObject = new JSONObject();
                try {
                    jSONObject.put(com.anythink.expressad.foundation.g.a.ce, anythinkBTNativeEC.a(i));
                } catch (JSONException e) {
                    e = e;
                    jSONObject2 = jSONObject;
                    e.printStackTrace();
                    jSONObject = jSONObject2;
                    jVar = anythinkBTNativeEC.K;
                    if (jVar == null) {
                    }
                }
            } catch (JSONException e2) {
                e = e2;
            }
            jVar = anythinkBTNativeEC.K;
            if (jVar == null) {
                jVar.click(1, jSONObject != null ? jSONObject.toString() : "");
            }
        } catch (Throwable th) {
            n.a(BTBaseView.TAG, th.getMessage());
        }
    }

    public static /* synthetic */ void a(AnythinkBTNativeEC anythinkBTNativeEC, float f, float f2) {
        if (anythinkBTNativeEC.L != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", BTBaseView.n);
                jSONObject.put("id", anythinkBTNativeEC.d);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("x", String.valueOf(f));
                jSONObject2.put("y", String.valueOf(f2));
                jSONObject.put("data", jSONObject2);
                com.anythink.expressad.atsignalcommon.windvane.j.a();
                com.anythink.expressad.atsignalcommon.windvane.j.a(anythinkBTNativeEC.L, "onClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } catch (Exception unused) {
                c.a();
                c.a(anythinkBTNativeEC.L, "onClicked", anythinkBTNativeEC.d);
            }
        }
    }
}