package com.anythink.expressad.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.anythink.core.common.b.m;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.h.h;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.s;
import com.anythink.expressad.video.module.a.a;
import com.anythink.expressad.video.module.a.a.f;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class AnythinkBaseView extends RelativeLayout {
    public static final String TAG = "AnythinkBaseView";
    private static final int m = -999;
    public Context a_;
    public c b_;
    public LayoutInflater c_;
    public int d_;
    public a e_;
    public boolean f_;
    public float g_;
    public float h_;
    public boolean i_;
    public int j_;
    public boolean k_;
    public int l_;

    public AnythinkBaseView(Context context) {
        this(context, null);
    }

    public final JSONObject a(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(com.anythink.expressad.foundation.g.a.cc, s.a(m.a().e(), this.g_));
                jSONObject2.put(com.anythink.expressad.foundation.g.a.cd, s.a(m.a().e(), this.h_));
                jSONObject2.put(com.anythink.expressad.foundation.g.a.cf, i);
                try {
                    this.d_ = getContext().getResources().getConfiguration().orientation;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                jSONObject2.put(com.anythink.expressad.foundation.g.a.cg, this.d_);
                jSONObject2.put(com.anythink.expressad.foundation.g.a.ch, s.c(getContext()));
                return jSONObject2;
            } catch (JSONException e2) {
                e = e2;
                jSONObject = jSONObject2;
                e.printStackTrace();
                return jSONObject;
            }
        } catch (JSONException e3) {
            e = e3;
        }
    }

    public void c() {
    }

    public final String d() {
        return a(0).toString();
    }

    public void defaultShow() {
        n.a(TAG, "defaultShow");
    }

    public int findColor(String str) {
        return h.a(this.a_.getApplicationContext(), str, "color");
    }

    public int findDrawable(String str) {
        return h.a(this.a_.getApplicationContext(), str, h.c);
    }

    public int findID(String str) {
        return h.a(this.a_.getApplicationContext(), str, "id");
    }

    public int findLayout(String str) {
        return h.a(this.a_.getApplicationContext(), str, "layout");
    }

    public c getCampaign() {
        return this.b_;
    }

    public LinearLayout.LayoutParams getParentLinearLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return (LinearLayout.LayoutParams) layoutParams;
        }
        return null;
    }

    public RelativeLayout.LayoutParams getParentRelativeLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            return (RelativeLayout.LayoutParams) layoutParams;
        }
        return null;
    }

    public abstract void init(Context context);

    public boolean isLandscape() {
        return this.a_.getResources().getConfiguration().orientation == 2;
    }

    public boolean isNotNULL(View... viewArr) {
        if (viewArr != null) {
            int length = viewArr.length;
            int i = 0;
            boolean z = false;
            while (i < length) {
                if (viewArr[i] == null) {
                    return false;
                }
                i++;
                z = true;
            }
            return z;
        }
        return false;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        this.d_ = configuration.orientation;
        super.onConfigurationChanged(configuration);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.g_ = motionEvent.getRawX();
        this.h_ = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onSelfConfigurationChanged(Configuration configuration) {
        this.d_ = configuration.orientation;
    }

    public void setCampaign(c cVar) {
        this.b_ = cVar;
    }

    public void setLayoutCenter(int i, int i2) {
        RelativeLayout.LayoutParams parentRelativeLayoutParams = getParentRelativeLayoutParams();
        LinearLayout.LayoutParams parentLinearLayoutParams = getParentLinearLayoutParams();
        if (parentRelativeLayoutParams != null) {
            parentRelativeLayoutParams.addRule(13);
            if (i != -999) {
                parentRelativeLayoutParams.width = i;
            }
            if (i2 != -999) {
                parentRelativeLayoutParams.height = i2;
            }
            setLayoutParams(parentRelativeLayoutParams);
        } else if (parentLinearLayoutParams != null) {
            parentLinearLayoutParams.gravity = 17;
            if (i != -999) {
                parentLinearLayoutParams.width = i;
            }
            if (i2 != -999) {
                parentLinearLayoutParams.height = i2;
            }
            setLayoutParams(parentLinearLayoutParams);
        }
    }

    public void setLayoutParam(int i, int i2, int i3, int i4) {
        RelativeLayout.LayoutParams parentRelativeLayoutParams = getParentRelativeLayoutParams();
        LinearLayout.LayoutParams parentLinearLayoutParams = getParentLinearLayoutParams();
        if (parentRelativeLayoutParams != null) {
            parentRelativeLayoutParams.topMargin = i2;
            parentRelativeLayoutParams.leftMargin = i;
            if (i3 != -999) {
                parentRelativeLayoutParams.width = i3;
            }
            if (i4 != -999) {
                parentRelativeLayoutParams.height = i4;
            }
            setLayoutParams(parentRelativeLayoutParams);
        } else if (parentLinearLayoutParams != null) {
            parentLinearLayoutParams.topMargin = i2;
            parentLinearLayoutParams.leftMargin = i;
            if (i3 != -999) {
                parentLinearLayoutParams.width = i3;
            }
            if (i4 != -999) {
                parentLinearLayoutParams.height = i4;
            }
            setLayoutParams(parentLinearLayoutParams);
        }
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

    public void setNotifyListener(a aVar) {
        this.e_ = aVar;
    }

    public void setWrapContent() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            return;
        }
        layoutParams.height = -2;
        layoutParams.width = -2;
    }

    public AnythinkBaseView(Context context, AttributeSet attributeSet, boolean z, int i, boolean z2, int i2) {
        super(context, attributeSet);
        this.d_ = 1;
        this.e_ = new f();
        this.f_ = false;
        this.l_ = 1;
        this.a_ = context;
        this.c_ = LayoutInflater.from(context);
        this.i_ = z;
        this.j_ = i;
        this.k_ = z2;
        this.l_ = i2;
        init(context);
    }

    public AnythinkBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d_ = 1;
        this.e_ = new f();
        this.f_ = false;
        this.l_ = 1;
        this.a_ = context;
        this.c_ = LayoutInflater.from(context);
        init(context);
    }
}