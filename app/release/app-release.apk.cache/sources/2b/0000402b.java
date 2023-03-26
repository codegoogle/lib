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
import android.widget.TextView;
import com.greedygame.core.AppConfig;
import com.greedygame.core.GreedyGameAds;
import com.greedygame.core.models.core.NativeMediatedAsset;
import com.p7700g.p99005.b03;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ea3 extends l13 {
    @NotNull
    private final Activity d;
    @NotNull
    private final NativeMediatedAsset e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea3(@NotNull q13 q13Var, @NotNull n13<?> n13Var) {
        super(q13Var, n13Var);
        c25.p(q13Var, "mediationPresenter");
        c25.p(n13Var, "adView");
        this.d = q13Var.a().f();
        this.e = n13Var.b();
    }

    private final Bitmap i() {
        AppConfig r;
        hc3 p;
        BitmapFactory.Options options = new BitmapFactory.Options();
        String i = this.e.i();
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

    public static final void j(ea3 ea3Var, View view) {
        c25.p(ea3Var, "this$0");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://greedygame.com/"));
        if (intent.resolveActivity(ea3Var.d.getPackageManager()) != null) {
            ea3Var.d.startActivity(intent);
        }
    }

    public static final void k(ea3 ea3Var, View view) {
        c25.p(ea3Var, "this$0");
        ea3Var.g().a().a();
    }

    public static /* synthetic */ void l(ea3 ea3Var, View view) {
        k(ea3Var, view);
    }

    public static /* synthetic */ void m(ea3 ea3Var, View view) {
        j(ea3Var, view);
    }

    @Override // com.p7700g.p99005.l13
    public void f() {
        int f;
        int g;
        int i;
        boolean z;
        AppConfig r;
        hc3 p;
        this.d.setContentView(b03.k.N);
        this.d.getWindow().setLayout(-1, -1);
        Bitmap i2 = i();
        if (i2 == null) {
            i = sr.t;
            z = true;
            f = -1;
            g = -1;
        } else {
            hz2 b = cz2.b(i2);
            int h = b.h();
            f = b.j().f();
            boolean h2 = b.j().h();
            g = b.j().g();
            int g2 = b.g();
            this.d.findViewById(b03.h.h1).setBackgroundColor(g2);
            this.d.findViewById(b03.h.a1).setBackgroundColor(g2);
            i = h;
            z = h2;
        }
        if (this.e.q() != null) {
            TextView textView = (TextView) this.d.findViewById(b03.h.O4);
            textView.setText(this.e.q());
            textView.setTextColor(g);
        }
        Activity activity = this.d;
        int i3 = b03.h.P4;
        View findViewById = activity.findViewById(i3);
        if (i() != null) {
            View findViewById2 = this.d.findViewById(i3);
            Bitmap i4 = i();
            if (i4 != null) {
                ((ImageView) findViewById2).setImageBitmap(i4);
            }
        } else {
            ImageView imageView = (ImageView) findViewById;
            ay2 ay2Var = ay2.a;
            Context context = imageView.getContext();
            c25.o(context, "ivIcon.context");
            String e = this.e.e();
            if (e == null) {
                e = "";
            }
            imageView.setImageBitmap(ay2Var.a(context, e));
        }
        ImageView imageView2 = (ImageView) this.d.findViewById(b03.h.K4);
        if (this.e.j() != null) {
            ((FrameLayout) this.d.findViewById(b03.h.s2)).setVisibility(0);
            imageView2.setVisibility(0);
            BitmapFactory.Options options = new BitmapFactory.Options();
            String j = this.e.j();
            String str = j != null ? j : "";
            GreedyGameAds iNSTANCE$com_greedygame_sdkx_core = GreedyGameAds.a.getINSTANCE$com_greedygame_sdkx_core();
            Uri uri = null;
            if (iNSTANCE$com_greedygame_sdkx_core != null && (r = iNSTANCE$com_greedygame_sdkx_core.r()) != null && (p = r.p()) != null) {
                uri = p.a(str);
            }
            Bitmap decodeFile = BitmapFactory.decodeFile(String.valueOf(uri), options);
            if (decodeFile != null) {
                imageView2.setImageBitmap(decodeFile);
            }
        }
        String e2 = this.e.e();
        if (e2 != null) {
            TextView textView2 = (TextView) this.d.findViewById(b03.h.n1);
            String lowerCase = e2.toLowerCase();
            c25.o(lowerCase, "(this as java.lang.String).toLowerCase()");
            String m1 = b95.m1(lowerCase);
            ((ImageView) this.d.findViewById(b03.h.O2)).setColorFilter(f);
            textView2.setText(m1);
            ((FrameLayout) this.d.findViewById(b03.h.M4)).setBackgroundColor(i);
            textView2.setTextColor(f);
        }
        if (this.e.g() != null) {
            TextView textView3 = (TextView) this.d.findViewById(b03.h.N4);
            textView3.setText(this.e.g());
            textView3.setTextColor(g);
        }
        ((ImageView) this.d.findViewById(b03.h.U1)).setOnClickListener(new View.OnClickListener() { // from class: com.p7700g.p99005.y63
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ea3.m(ea3.this, view);
            }
        });
        TextView textView4 = (TextView) this.d.findViewById(b03.h.L4);
        textView4.setOnClickListener(new View.OnClickListener() { // from class: com.p7700g.p99005.x63
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ea3.l(ea3.this, view);
            }
        });
        Drawable d = yz2.d(this.d.getApplicationContext(), b03.g.P1);
        if (z) {
            textView4.setTextColor(Color.parseColor("#262626"));
            d.setColorFilter(-1, PorterDuff.Mode.SRC);
        } else {
            textView4.setTextColor(-1);
            d.setColorFilter(Color.parseColor("#262626"), PorterDuff.Mode.SRC);
        }
        textView4.setBackground(d);
    }
}