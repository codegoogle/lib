package com.p7700g.p99005;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.p7700g.p99005.zg3;

/* compiled from: VpageActivity.java */
/* loaded from: classes3.dex */
public class jh3 extends Dialog {
    public Activity s;
    public b t;

    /* compiled from: VpageActivity.java */
    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ LottieAnimationView s;
        public final /* synthetic */ TextView t;

        public a(final LottieAnimationView val$lottie, final TextView val$texttt) {
            this.s = val$lottie;
            this.t = val$texttt;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.s.setVisibility(0);
            this.t.setVisibility(8);
            jh3.this.t.a();
        }
    }

    /* compiled from: VpageActivity.java */
    /* loaded from: classes3.dex */
    public interface b {
        void a();
    }

    public jh3(Activity activity) {
        super(activity);
        this.s = activity;
    }

    public void a(b clickOnButton) {
        this.t = clickOnButton;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(1);
        setContentView(zg3.g.d);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) findViewById(zg3.e.R);
        TextView textView = (TextView) findViewById(zg3.e.v0);
        TextView textView2 = (TextView) findViewById(zg3.e.s0);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(zg3.e.C);
        if (!yg3.e(bh3.r0).equals("")) {
            StringBuilder G = wo1.G("");
            G.append(yg3.e(bh3.r0));
            textView2.setText(G.toString());
        }
        relativeLayout.setOnClickListener(new a(lottieAnimationView, textView));
    }
}