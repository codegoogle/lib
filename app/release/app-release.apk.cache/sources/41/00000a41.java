package com.anythink.expressad.video.module;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.anythink.expressad.video.signal.f;
import com.anythink.expressad.video.signal.factory.b;
import com.anythink.expressad.widget.a;

/* loaded from: classes2.dex */
public class AnythinkVastEndCardView extends AnythinkBaseView implements f {
    private static final String m = "anythink_reward_endcard_vast";
    private ViewGroup n;
    private View o;
    private View p;

    public AnythinkVastEndCardView(Context context) {
        super(context);
    }

    private void a() {
        if (this.f_) {
            setMatchParent();
            setBackgroundResource(findColor("anythink_reward_endcard_vast_bg"));
            setClickable(true);
            ((RelativeLayout.LayoutParams) this.n.getLayoutParams()).addRule(13, -1);
        }
    }

    private boolean b() {
        this.n = (ViewGroup) findViewById(findID("anythink_rl_content"));
        this.o = findViewById(findID("anythink_iv_vastclose"));
        View findViewById = findViewById(findID("anythink_iv_vastok"));
        this.p = findViewById;
        return isNotNULL(this.n, this.o, findViewById);
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public final void c() {
        super.c();
        if (this.f_) {
            this.o.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.module.AnythinkVastEndCardView.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AnythinkVastEndCardView.this.e_.a(104, "");
                }
            });
            this.p.setOnClickListener(new a() { // from class: com.anythink.expressad.video.module.AnythinkVastEndCardView.2
                @Override // com.anythink.expressad.widget.a
                public final void a(View view) {
                    AnythinkVastEndCardView anythinkVastEndCardView = AnythinkVastEndCardView.this;
                    anythinkVastEndCardView.e_.a(108, anythinkVastEndCardView.d());
                }
            });
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void init(Context context) {
        int findLayout = findLayout(m);
        if (findLayout >= 0) {
            this.c_.inflate(findLayout, this);
            this.n = (ViewGroup) findViewById(findID("anythink_rl_content"));
            this.o = findViewById(findID("anythink_iv_vastclose"));
            View findViewById = findViewById(findID("anythink_iv_vastok"));
            this.p = findViewById;
            this.f_ = isNotNULL(this.n, this.o, findViewById);
            c();
            if (this.f_) {
                setMatchParent();
                setBackgroundResource(findColor("anythink_reward_endcard_vast_bg"));
                setClickable(true);
                ((RelativeLayout.LayoutParams) this.n.getLayoutParams()).addRule(13, -1);
            }
        }
    }

    public void notifyShowListener() {
        this.e_.a(111, "");
    }

    @Override // com.anythink.expressad.video.signal.f
    public void preLoadData(b bVar) {
    }

    public AnythinkVastEndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}