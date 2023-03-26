package com.anythink.expressad.video.module;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.g.a;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.video.dynview.e.d;
import com.anythink.expressad.video.module.a.a.e;
import com.anythink.expressad.video.signal.f;
import com.anythink.expressad.video.signal.factory.b;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AnythinkClickCTAView extends AnythinkBaseView implements f {
    private static final String m = "anythink_reward_clickable_cta";
    private ViewGroup n;
    private ImageView o;
    private TextView p;
    private TextView q;
    private TextView r;
    private String s;
    private float t;
    private float u;
    private int v;
    private ObjectAnimator w;

    public AnythinkClickCTAView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.n.setBackgroundColor(0);
        ImageView imageView = this.o;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        TextView textView = this.q;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private void e() {
        setWrapContent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f() {
        this.n = (ViewGroup) findViewById(findID("anythink_viewgroup_ctaroot"));
        this.o = (ImageView) findViewById(findID("anythink_iv_appicon"));
        this.p = (TextView) findViewById(findID("anythink_tv_title"));
        TextView textView = (TextView) findViewById(findID("anythink_tv_install"));
        this.r = textView;
        return isNotNULL(this.n, this.o, this.p, textView);
    }

    private void g() {
        JSONObject jSONObject;
        JSONException e;
        try {
            jSONObject = new JSONObject();
        } catch (JSONException e2) {
            jSONObject = null;
            e = e2;
        }
        try {
            jSONObject.put(a.ce, a(0));
        } catch (JSONException e3) {
            e = e3;
            e.printStackTrace();
            this.e_.a(105, jSONObject);
        }
        this.e_.a(105, jSONObject);
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void init(Context context) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ObjectAnimator objectAnimator = this.w;
        if (objectAnimator != null) {
            try {
                objectAnimator.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ObjectAnimator objectAnimator = this.w;
        if (objectAnimator != null) {
            try {
                objectAnimator.cancel();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.t = motionEvent.getRawX();
        this.u = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        this.v = configuration.orientation;
    }

    @Override // com.anythink.expressad.video.signal.f
    public void preLoadData(b bVar) {
        c cVar = this.b_;
        if (cVar != null) {
            if (cVar.j()) {
                c cVar2 = this.b_;
                new com.anythink.expressad.video.dynview.i.c();
                com.anythink.expressad.video.dynview.c b = com.anythink.expressad.video.dynview.i.c.b(this, cVar2);
                com.anythink.expressad.video.dynview.b.a();
                com.anythink.expressad.video.dynview.b.a(b, new AnonymousClass1(this));
            } else {
                int findLayout = findLayout(m);
                if (findLayout >= 0) {
                    this.c_.inflate(findLayout, this);
                    this.f_ = f();
                    c();
                    setWrapContent();
                }
            }
            if (this.f_) {
                this.r.setText(this.b_.cS);
                if (!TextUtils.isEmpty(this.b_.bd())) {
                    this.p.setText(this.b_.bb());
                    TextView textView = this.q;
                    if (textView != null) {
                        textView.setText(this.b_.bc());
                    }
                    com.anythink.expressad.foundation.g.d.b.a(this.a_.getApplicationContext()).a(this.b_.bd(), new e(this.o, this.b_, this.s) { // from class: com.anythink.expressad.video.module.AnythinkClickCTAView.5
                        @Override // com.anythink.expressad.video.module.a.a.e, com.anythink.expressad.foundation.g.d.c
                        public final void a(String str, String str2) {
                            super.a(str, str2);
                            AnythinkClickCTAView.this.b();
                        }
                    });
                    return;
                }
                b();
            }
        }
    }

    public void setObjectAnimator(ObjectAnimator objectAnimator) {
        this.w = objectAnimator;
    }

    public void setUnitId(String str) {
        this.s = str;
    }

    public AnythinkClickCTAView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public final void c() {
        super.c();
        if (this.f_) {
            c cVar = this.b_;
            if (cVar != null && cVar.j()) {
                setOnClickListener(new com.anythink.expressad.widget.a() { // from class: com.anythink.expressad.video.module.AnythinkClickCTAView.2
                    @Override // com.anythink.expressad.widget.a
                    public final void a(View view) {
                        AnythinkClickCTAView.b(AnythinkClickCTAView.this);
                    }
                });
            }
            this.r.setOnClickListener(new com.anythink.expressad.widget.a() { // from class: com.anythink.expressad.video.module.AnythinkClickCTAView.3
                @Override // com.anythink.expressad.widget.a
                public final void a(View view) {
                    AnythinkClickCTAView.b(AnythinkClickCTAView.this);
                }
            });
            ImageView imageView = this.o;
            if (imageView != null) {
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.module.AnythinkClickCTAView.4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                    }
                });
            }
        }
    }

    private void a(ViewGroup viewGroup, c cVar) {
        new com.anythink.expressad.video.dynview.i.c();
        com.anythink.expressad.video.dynview.c b = com.anythink.expressad.video.dynview.i.c.b(viewGroup, cVar);
        com.anythink.expressad.video.dynview.b.a();
        com.anythink.expressad.video.dynview.b.a(b, new AnonymousClass1(viewGroup));
    }

    /* renamed from: com.anythink.expressad.video.module.AnythinkClickCTAView$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 implements d {
        public final /* synthetic */ ViewGroup a;

        public AnonymousClass1(ViewGroup viewGroup) {
            this.a = viewGroup;
        }

        @Override // com.anythink.expressad.video.dynview.e.d
        public final void a(com.anythink.expressad.video.dynview.a aVar) {
            this.a.addView(aVar.a());
            AnythinkClickCTAView anythinkClickCTAView = AnythinkClickCTAView.this;
            anythinkClickCTAView.f_ = anythinkClickCTAView.f();
            AnythinkClickCTAView anythinkClickCTAView2 = AnythinkClickCTAView.this;
            anythinkClickCTAView2.q = (TextView) anythinkClickCTAView2.findViewById(anythinkClickCTAView2.findID("anythink_tv_desc"));
            AnythinkClickCTAView.this.c();
        }

        @Override // com.anythink.expressad.video.dynview.e.d
        public final void a(com.anythink.expressad.video.dynview.c.a aVar) {
            n.d(AnythinkBaseView.TAG, "errorMsg:" + aVar.b());
        }
    }

    private void a() {
        int findLayout = findLayout(m);
        if (findLayout >= 0) {
            this.c_.inflate(findLayout, this);
            this.f_ = f();
            c();
            setWrapContent();
        }
    }

    public static /* synthetic */ void b(AnythinkClickCTAView anythinkClickCTAView) {
        JSONObject jSONObject;
        JSONException e;
        try {
            jSONObject = new JSONObject();
        } catch (JSONException e2) {
            jSONObject = null;
            e = e2;
        }
        try {
            jSONObject.put(a.ce, anythinkClickCTAView.a(0));
        } catch (JSONException e3) {
            e = e3;
            e.printStackTrace();
            anythinkClickCTAView.e_.a(105, jSONObject);
        }
        anythinkClickCTAView.e_.a(105, jSONObject);
    }
}