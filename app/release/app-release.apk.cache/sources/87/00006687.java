package com.p7700g.p99005;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.greedygame.core.app_open_ads.core.GGAppOpenAdsImpl;
import com.greedygame.core.network.model.responses.Ad;
import com.p7700g.p99005.b03;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class y03 extends l13 {
    @NotNull
    private Ad d;
    @NotNull
    private final String e;
    @NotNull
    private final Activity f;
    public FrameLayout g;
    @Nullable
    private CountDownTimer h;
    private FrameLayout i;
    private ProgressBar j;
    private ConstraintLayout k;
    private boolean l;

    /* loaded from: classes3.dex */
    public static final class a extends CountDownTimer {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(2000L, 1000L);
            y03.this = r5;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            y03.this.l = true;
            ProgressBar progressBar = y03.this.j;
            if (progressBar != null) {
                progressBar.setVisibility(8);
                ConstraintLayout constraintLayout = y03.this.k;
                if (constraintLayout != null) {
                    constraintLayout.setVisibility(0);
                    return;
                } else {
                    c25.S("continueAppContentLayout");
                    throw null;
                }
            }
            c25.S("progressBar");
            throw null;
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y03(@NotNull q13 q13Var, @NotNull n13<?> n13Var, @NotNull Ad ad) {
        super(q13Var, n13Var);
        c25.p(q13Var, "mediationPresenter");
        c25.p(n13Var, "ggAdView");
        c25.p(ad, "mAd");
        this.d = ad;
        this.e = "GGAppOpenAdsActivity";
        this.f = g().a().f();
    }

    public static final void l(y03 y03Var, View view) {
        c25.p(y03Var, "this$0");
        if (y03Var.l) {
            y03Var.n().finish();
        }
    }

    private final void s() {
        CountDownTimer countDownTimer = this.h;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        a aVar = new a();
        this.h = aVar;
        if (aVar == null) {
            return;
        }
        aVar.start();
    }

    public static /* synthetic */ void t(y03 y03Var, View view) {
        l(y03Var, view);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0101  */
    @Override // com.p7700g.p99005.l13
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f() {
        int i;
        FrameLayout frameLayout;
        Activity activity = this.f;
        if (Build.VERSION.SDK_INT != 26) {
            GGAppOpenAdsImpl.a aVar = GGAppOpenAdsImpl.s;
            if (aVar.a().d() == c13.PORTRAIT) {
                i = 1;
            } else if (aVar.a().d() == c13.LANDSCAPE) {
                i = 0;
            }
            activity.setRequestedOrientation(i);
            this.f.setContentView(b03.k.C);
            ImageView imageView = (ImageView) this.f.findViewById(b03.h.v0);
            TextView textView = (TextView) this.f.findViewById(b03.h.w0);
            View findViewById = this.f.findViewById(b03.h.j0);
            c25.o(findViewById, "mActivity.findViewById<GGAdview>(R.id.adLayoutContainer)");
            k((FrameLayout) findViewById);
            View findViewById2 = this.f.findViewById(b03.h.j1);
            c25.o(findViewById2, "mActivity.findViewById(R.id.continueAppDetailsView)");
            this.k = (ConstraintLayout) findViewById2;
            View findViewById3 = this.f.findViewById(b03.h.h3);
            c25.o(findViewById3, "mActivity.findViewById(R.id.progress_bar)");
            this.j = (ProgressBar) findViewById3;
            View findViewById4 = this.f.findViewById(b03.h.k1);
            c25.o(findViewById4, "mActivity.findViewById(R.id.continueTab)");
            frameLayout = (FrameLayout) findViewById4;
            this.i = frameLayout;
            if (frameLayout == null) {
                frameLayout.setOnClickListener(new View.OnClickListener() { // from class: com.p7700g.p99005.w03
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        y03.t(y03.this, view);
                    }
                });
                ProgressBar progressBar = this.j;
                if (progressBar != null) {
                    fk.n(progressBar.getIndeterminateDrawable(), gh.f(this.f, b03.e.n0));
                    CharSequence applicationLabel = this.f.getPackageManager().getApplicationLabel(this.f.getApplicationInfo());
                    c25.o(applicationLabel, "mActivity.packageManager.getApplicationLabel(mActivity.applicationInfo)");
                    textView.setVisibility(0);
                    textView.setText(applicationLabel);
                    Drawable applicationLogo = this.f.getPackageManager().getApplicationLogo(this.f.getPackageName());
                    if (applicationLogo == null) {
                        imageView.setVisibility(8);
                    } else {
                        imageView.setVisibility(0);
                        imageView.setImageDrawable(applicationLogo);
                    }
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.gravity = 17;
                    my2.a(q(), p(), layoutParams);
                    s();
                    return;
                }
                c25.S("progressBar");
                throw null;
            }
            c25.S("continueTab");
            throw null;
        }
        i = -1;
        activity.setRequestedOrientation(i);
        this.f.setContentView(b03.k.C);
        ImageView imageView2 = (ImageView) this.f.findViewById(b03.h.v0);
        TextView textView2 = (TextView) this.f.findViewById(b03.h.w0);
        View findViewById5 = this.f.findViewById(b03.h.j0);
        c25.o(findViewById5, "mActivity.findViewById<GGAdview>(R.id.adLayoutContainer)");
        k((FrameLayout) findViewById5);
        View findViewById22 = this.f.findViewById(b03.h.j1);
        c25.o(findViewById22, "mActivity.findViewById(R.id.continueAppDetailsView)");
        this.k = (ConstraintLayout) findViewById22;
        View findViewById32 = this.f.findViewById(b03.h.h3);
        c25.o(findViewById32, "mActivity.findViewById(R.id.progress_bar)");
        this.j = (ProgressBar) findViewById32;
        View findViewById42 = this.f.findViewById(b03.h.k1);
        c25.o(findViewById42, "mActivity.findViewById(R.id.continueTab)");
        frameLayout = (FrameLayout) findViewById42;
        this.i = frameLayout;
        if (frameLayout == null) {
        }
    }

    @NotNull
    public final Ad j() {
        return this.d;
    }

    public final void k(@NotNull FrameLayout frameLayout) {
        c25.p(frameLayout, "<set-?>");
        this.g = frameLayout;
    }

    @NotNull
    public final Activity n() {
        return this.f;
    }

    @NotNull
    public final FrameLayout p() {
        FrameLayout frameLayout = this.g;
        if (frameLayout != null) {
            return frameLayout;
        }
        c25.S("adLayoutContainer");
        throw null;
    }

    @Nullable
    public abstract View q();

    public final void r() {
        if (this.l) {
            this.f.finish();
        }
    }
}