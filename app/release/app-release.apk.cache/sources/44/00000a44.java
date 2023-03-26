package com.anythink.expressad.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.anythink.core.common.b.m;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.g.a;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.s;
import com.anythink.expressad.video.module.a.a.j;
import com.anythink.expressad.video.signal.f;
import com.anythink.expressad.video.signal.factory.b;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AnythinkVideoEndCoverView extends AnythinkBaseView implements f {
    private final String m;
    private View n;
    private ImageView o;
    private ImageView p;
    private TextView q;
    private TextView r;
    private TextView s;
    private b t;

    public AnythinkVideoEndCoverView(Context context) {
        super(context);
        this.m = "AnythinkVideoEndCoverView";
    }

    private boolean a(View view) {
        if (view != null) {
            try {
                this.o = (ImageView) view.findViewById(findID("anythink_vec_iv_icon"));
                this.p = (ImageView) view.findViewById(findID("anythink_vec_iv_close"));
                this.q = (TextView) view.findViewById(findID("anythink_vec_tv_title"));
                this.r = (TextView) view.findViewById(findID("anythink_vec_tv_desc"));
                this.s = (TextView) view.findViewById(findID("anythink_vec_btn"));
                return true;
            } catch (Throwable th) {
                n.d("AnythinkVideoEndCoverView", th.getMessage());
                return false;
            }
        }
        return true;
    }

    private void b() {
        View view = this.n;
        if (view == null) {
            init(this.a_);
            preLoadData(this.t);
            return;
        }
        if (view.getParent() != null) {
            ((ViewGroup) this.n.getParent()).removeView(this.n);
        }
        addView(this.n);
        a(this.n);
        c();
    }

    private void e() {
        ImageView imageView;
        c cVar = this.b_;
        if (cVar != null) {
            if (!TextUtils.isEmpty(cVar.bd()) && (imageView = this.o) != null) {
                com.anythink.expressad.foundation.g.d.b.a(this.a_.getApplicationContext()).a(this.b_.bd(), new j(imageView, s.b(m.a().e(), 8.0f)));
            }
            TextView textView = this.q;
            if (textView != null) {
                textView.setText(this.b_.bb());
            }
            TextView textView2 = this.s;
            if (textView2 != null) {
                textView2.setText(this.b_.cS);
            }
            TextView textView3 = this.r;
            if (textView3 != null) {
                textView3.setText(this.b_.bc());
            }
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public final void c() {
        super.c();
        this.p.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.module.AnythinkVideoEndCoverView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AnythinkVideoEndCoverView.this.e_.a(104, "");
            }
        });
        this.o.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.module.AnythinkVideoEndCoverView.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AnythinkVideoEndCoverView.this.a();
            }
        });
        this.s.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.module.AnythinkVideoEndCoverView.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AnythinkVideoEndCoverView.this.a();
            }
        });
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void init(Context context) {
        int findLayout = findLayout("anythink_reward_videoend_cover");
        if (findLayout >= 0) {
            View inflate = this.c_.inflate(findLayout, (ViewGroup) null);
            this.n = inflate;
            if (inflate != null) {
                this.f_ = a(inflate);
                addView(this.n, -1, -1);
                c();
            }
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.g_ = motionEvent.getRawX();
        this.h_ = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        this.d_ = configuration.orientation;
        removeView(this.n);
        View view = this.n;
        if (view == null) {
            init(this.a_);
            preLoadData(this.t);
            return;
        }
        if (view.getParent() != null) {
            ((ViewGroup) this.n.getParent()).removeView(this.n);
        }
        addView(this.n);
        a(this.n);
        c();
    }

    @Override // com.anythink.expressad.video.signal.f
    public void preLoadData(b bVar) {
        ImageView imageView;
        this.t = bVar;
        try {
            c cVar = this.b_;
            if (cVar == null || !this.f_ || cVar == null) {
                return;
            }
            if (!TextUtils.isEmpty(cVar.bd()) && (imageView = this.o) != null) {
                com.anythink.expressad.foundation.g.d.b.a(this.a_.getApplicationContext()).a(this.b_.bd(), new j(imageView, s.b(m.a().e(), 8.0f)));
            }
            TextView textView = this.q;
            if (textView != null) {
                textView.setText(this.b_.bb());
            }
            TextView textView2 = this.s;
            if (textView2 != null) {
                textView2.setText(this.b_.cS);
            }
            TextView textView3 = this.r;
            if (textView3 != null) {
                textView3.setText(this.b_.bc());
            }
        } catch (Throwable th) {
            n.a("AnythinkVideoEndCoverView", th.getMessage());
        }
    }

    public AnythinkVideoEndCoverView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m = "AnythinkVideoEndCoverView";
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|2|3|(2:4|5)|(5:6|7|8|9|10)|11|12|13|14|15|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007c, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0082, code lost:
        r0.printStackTrace();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONException e;
        try {
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject2 = new JSONObject();
            } catch (JSONException e2) {
                jSONObject2 = jSONObject3;
                e = e2;
            }
        } catch (JSONException e3) {
            jSONObject = null;
            JSONException e4 = e3;
        }
        try {
            jSONObject2.put(a.cc, s.a(m.a().e(), this.g_));
            jSONObject2.put(a.cd, s.a(m.a().e(), this.h_));
            jSONObject2.put(a.cf, 0);
            try {
                this.d_ = getContext().getResources().getConfiguration().orientation;
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            jSONObject2.put(a.cg, this.d_);
            jSONObject2.put(a.ch, s.c(getContext()));
        } catch (JSONException e6) {
            e = e6;
            n.d("AnythinkVideoEndCoverView", e.getMessage());
            jSONObject = new JSONObject();
            jSONObject.put(a.ce, jSONObject2);
            this.e_.a(105, jSONObject);
        }
        jSONObject = new JSONObject();
        jSONObject.put(a.ce, jSONObject2);
        this.e_.a(105, jSONObject);
    }
}