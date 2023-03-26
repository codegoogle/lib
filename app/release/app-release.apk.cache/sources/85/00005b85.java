package com.p7700g.p99005;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;
import com.greedygame.core.AppConfig;
import com.greedygame.core.GreedyGameAds;
import com.p7700g.p99005.b03;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class s83 extends l13 {
    @NotNull
    private final NativeAd d;
    @NotNull
    private final Activity e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s83(@NotNull q13 q13Var, @NotNull n13<?> n13Var, @NotNull NativeAd nativeAd) {
        super(q13Var, n13Var);
        c25.p(q13Var, "mediationPresenter");
        c25.p(n13Var, "adView");
        c25.p(nativeAd, "mAd");
        this.d = nativeAd;
        e(n13Var);
        this.e = q13Var.a().f();
    }

    public static final void j(s83 s83Var, View view) {
        c25.p(s83Var, "this$0");
        s83Var.g().a().a();
    }

    private final Bitmap k() {
        AppConfig r;
        hc3 p;
        BitmapFactory.Options options = new BitmapFactory.Options();
        String i = h().b().i();
        if (i == null) {
            i = "";
        }
        GreedyGameAds iNSTANCE$com_greedygame_sdkx_core = GreedyGameAds.a.getINSTANCE$com_greedygame_sdkx_core();
        Uri uri = null;
        if (iNSTANCE$com_greedygame_sdkx_core != null && (r = iNSTANCE$com_greedygame_sdkx_core.r()) != null && (p = r.p()) != null) {
            uri = p.a(i);
        }
        return BitmapFactory.decodeFile(String.valueOf(uri), options);
    }

    public static final void l(s83 s83Var, View view) {
        c25.p(s83Var, "this$0");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://greedygame.com/"));
        if (intent.resolveActivity(s83Var.i().getPackageManager()) != null) {
            s83Var.i().startActivity(intent);
        }
    }

    public static /* synthetic */ void m(s83 s83Var, View view) {
        j(s83Var, view);
    }

    public static /* synthetic */ void n(s83 s83Var, View view) {
        l(s83Var, view);
    }

    @Override // com.p7700g.p99005.l13
    public void f() {
        int f;
        int g;
        int i;
        boolean z;
        ArrayList arrayList = new ArrayList();
        this.e.setContentView(b03.k.L);
        this.e.getWindow().setLayout(-1, -1);
        LinearLayout linearLayout = (LinearLayout) this.e.findViewById(b03.h.k0);
        AdOptionsView adOptionsView = new AdOptionsView(this.e, this.d, (NativeAdLayout) this.e.findViewById(b03.h.M2));
        linearLayout.removeAllViews();
        linearLayout.addView(adOptionsView, 0);
        ConstraintLayout constraintLayout = (ConstraintLayout) this.e.findViewById(b03.h.h1);
        Bitmap k = k();
        if (k == null) {
            i = sr.t;
            z = true;
            f = -1;
            g = -1;
        } else {
            hz2 b = cz2.b(k);
            int h = b.h();
            f = b.j().f();
            boolean h2 = b.j().h();
            g = b.j().g();
            int g2 = b.g();
            constraintLayout.setBackgroundColor(g2);
            i().findViewById(b03.h.a1).setBackgroundColor(g2);
            i = h;
            z = h2;
        }
        if (this.d.getAdHeadline() != null) {
            TextView textView = (TextView) this.e.findViewById(b03.h.O4);
            textView.setText(this.d.getAdHeadline());
            textView.setTextColor(g);
            arrayList.add(textView);
        }
        Activity activity = this.e;
        int i2 = b03.h.P4;
        ImageView imageView = (ImageView) activity.findViewById(i2);
        if (this.d.getAdIcon() != null) {
            ImageView imageView2 = (ImageView) this.e.findViewById(i2);
            Bitmap k2 = k();
            if (k2 != null) {
                imageView2.setImageBitmap(k2);
            }
            arrayList.add(imageView2);
        } else {
            ay2 ay2Var = ay2.a;
            Context context = imageView.getContext();
            c25.o(context, "ivIcon.context");
            String adCallToAction = this.d.getAdCallToAction();
            if (adCallToAction == null) {
                adCallToAction = "";
            }
            imageView.setImageBitmap(ay2Var.a(context, adCallToAction));
        }
        MediaView mediaView = (MediaView) this.e.findViewById(b03.h.Q4);
        String adCallToAction2 = this.d.getAdCallToAction();
        if (adCallToAction2 != null) {
            FrameLayout frameLayout = (FrameLayout) i().findViewById(b03.h.M4);
            TextView textView2 = (TextView) i().findViewById(b03.h.n1);
            String lowerCase = adCallToAction2.toLowerCase();
            c25.o(lowerCase, "(this as java.lang.String).toLowerCase()");
            String m1 = b95.m1(lowerCase);
            ((ImageView) i().findViewById(b03.h.O2)).setColorFilter(f);
            textView2.setText(m1);
            frameLayout.setBackgroundColor(i);
            textView2.setTextColor(f);
            arrayList.add(frameLayout);
        }
        if (this.d.getAdvertiserName() != null) {
            TextView textView3 = (TextView) this.e.findViewById(b03.h.J4);
            textView3.setText(this.d.getAdvertiserName());
            textView3.setTextColor(g);
            arrayList.add(textView3);
        }
        if (this.d.getAdBodyText() != null) {
            TextView textView4 = (TextView) this.e.findViewById(b03.h.N4);
            textView4.setText(this.d.getAdBodyText());
            textView4.setTextColor(g);
            arrayList.add(textView4);
        }
        TextView textView5 = (TextView) this.e.findViewById(b03.h.L4);
        textView5.setOnClickListener(new View.OnClickListener() { // from class: com.p7700g.p99005.z53
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                s83.m(s83.this, view);
            }
        });
        Drawable d = yz2.d(this.e, b03.g.P1);
        if (z) {
            textView5.setTextColor(Color.parseColor("#262626"));
            d.setColorFilter(-1, PorterDuff.Mode.SRC);
        } else {
            textView5.setTextColor(-1);
            d.setColorFilter(Color.parseColor("#262626"), PorterDuff.Mode.SRC);
        }
        textView5.setBackground(d);
        ((ImageView) this.e.findViewById(b03.h.U1)).setOnClickListener(new View.OnClickListener() { // from class: com.p7700g.p99005.a63
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                s83.n(s83.this, view);
            }
        });
        this.d.registerViewForInteraction(constraintLayout, mediaView, arrayList);
    }

    @NotNull
    public final Activity i() {
        return this.e;
    }
}