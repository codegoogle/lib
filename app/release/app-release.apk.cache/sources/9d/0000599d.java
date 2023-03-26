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
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.ActivityChooserModel;
import com.greedygame.core.AppConfig;
import com.greedygame.core.GreedyGameAds;
import com.greedygame.core.mediation.GGRatingBar;
import com.mopub.nativeads.ClickInterface;
import com.mopub.nativeads.MediaLayout;
import com.mopub.nativeads.StaticNativeAd;
import com.mopub.nativeads.VideoNativeAd;
import com.p7700g.p99005.b03;
import com.p7700g.p99005.u93;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class r93 extends u93 {
    @NotNull
    public static final a k = new a(null);
    @NotNull
    private static final String l = "MopActvFlat";
    private boolean m;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            u93.b.values();
            int[] iArr = new int[2];
            iArr[u93.b.VIDEO.ordinal()] = 1;
            iArr[u93.b.STATIC.ordinal()] = 2;
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r93(@NotNull q13 q13Var, @NotNull n13<?> n13Var, @NotNull VideoNativeAd videoNativeAd) {
        super(q13Var, n13Var, videoNativeAd);
        c25.p(q13Var, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        c25.p(n13Var, "adView");
        c25.p(videoNativeAd, "ad");
        this.m = true;
    }

    public static /* synthetic */ void A(r93 r93Var, View view) {
        y(r93Var, view);
    }

    public static /* synthetic */ void B(r93 r93Var, View view) {
        u(r93Var, view);
    }

    public static final void u(r93 r93Var, View view) {
        c25.p(r93Var, "this$0");
        r93Var.g().a().a();
    }

    private static final void v(r93 r93Var, VideoNativeAd videoNativeAd, View view) {
        c25.p(r93Var, "this$0");
        c25.p(videoNativeAd, "$videoNativeAd");
        xz2.c(l, "Mopub Handle click");
        try {
            j73 j73Var = j73.a;
            Activity p = r93Var.p();
            String clickDestinationUrl = videoNativeAd.getClickDestinationUrl();
            if (clickDestinationUrl == null) {
                clickDestinationUrl = "";
            }
            j73Var.a(p, clickDestinationUrl);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static final void w(StaticNativeAd staticNativeAd, View view) {
        c25.p(staticNativeAd, "$ad");
        String str = l;
        xz2.c(str, "Mopub Handle click");
        String clickDestinationUrl = staticNativeAd.getClickDestinationUrl();
        if (clickDestinationUrl != null) {
            if (b95.u2(clickDestinationUrl, "mopubnativebrowser://navigate?url=", false, 2, null)) {
                xz2.c(str, "Already added Mopub Native scheme prefix");
            } else {
                try {
                    String C = c25.C("mopubnativebrowser://navigate?url=", URLEncoder.encode(clickDestinationUrl, u93.d.a()));
                    xz2.c(str, C);
                    staticNativeAd.setClickDestinationUrl(C);
                    xz2.c(str, "Opened outside the app");
                } catch (UnsupportedEncodingException e) {
                    xz2.b(l, "Encoding failed", e);
                }
            }
        }
        staticNativeAd.handleClick(view);
    }

    public static final void y(r93 r93Var, View view) {
        c25.p(r93Var, "this$0");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://greedygame.com/"));
        if (intent.resolveActivity(r93Var.p().getPackageManager()) != null) {
            r93Var.p().startActivity(intent);
        }
    }

    private final Bitmap z() {
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

    @Override // com.p7700g.p99005.u93, com.p7700g.p99005.l13
    public void f() {
        p().setContentView(b03.k.M);
        p().getWindow().setLayout(-1, -1);
        int i = b.a[n().ordinal()];
        if (i == 1) {
            x();
        } else if (i == 2) {
            t();
        }
        TextView textView = (TextView) p().findViewById(b03.h.L4);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.p7700g.p99005.p63
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r93.B(r93.this, view);
            }
        });
        Drawable d = yz2.d(p().getApplicationContext(), b03.g.P1);
        if (this.m) {
            textView.setTextColor(Color.parseColor("#262626"));
            d.setColorFilter(-1, PorterDuff.Mode.SRC);
        } else {
            textView.setTextColor(-1);
            d.setColorFilter(Color.parseColor("#262626"), PorterDuff.Mode.SRC);
        }
        textView.setBackground(d);
        ((ImageView) p().findViewById(b03.h.U1)).setOnClickListener(new View.OnClickListener() { // from class: com.p7700g.p99005.m63
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r93.A(r93.this, view);
            }
        });
    }

    public void t() {
        int f;
        int i;
        String callToAction;
        AppConfig r;
        hc3 p;
        View findViewById = p().findViewById(b03.h.W1);
        final StaticNativeAd l2 = l();
        if (l2 == null) {
            return;
        }
        l2.prepare(findViewById);
        o().setOnClickListener(findViewById, new ClickInterface() { // from class: com.p7700g.p99005.o63
            public final void a(View view) {
                r93.lambda$PyFqVTvqSOxRrBaLL1MHeKUOyhs(l2, view);
            }
        });
        Bitmap z = z();
        int i2 = -1;
        if (z == null) {
            i = sr.t;
            f = -1;
        } else {
            hz2 b2 = cz2.b(z);
            int h = b2.h();
            f = b2.j().f();
            this.m = b2.j().h();
            int g = b2.j().g();
            int g2 = b2.g();
            p().findViewById(b03.h.h1).setBackgroundColor(g2);
            p().findViewById(b03.h.a1).setBackgroundColor(g2);
            i = h;
            i2 = g;
        }
        String title = l2.getTitle();
        if (title != null) {
            TextView textView = (TextView) p().findViewById(b03.h.O4);
            textView.setText(title);
            textView.setTextColor(i2);
        }
        Activity p2 = p();
        int i3 = b03.h.P4;
        ImageView imageView = (ImageView) p2.findViewById(i3);
        if (l2.getIconImageUrl() != null) {
            ImageView imageView2 = (ImageView) p().findViewById(i3);
            Bitmap z2 = z();
            if (z2 != null) {
                imageView2.setImageBitmap(z2);
            }
        } else {
            ay2 ay2Var = ay2.a;
            Context context = imageView.getContext();
            c25.o(context, "ivIcon.context");
            StaticNativeAd l3 = l();
            if (l3 == null || (callToAction = l3.getCallToAction()) == null) {
                callToAction = "";
            }
            imageView.setImageBitmap(ay2Var.a(context, callToAction));
        }
        String callToAction2 = l2.getCallToAction();
        if (callToAction2 != null) {
            TextView textView2 = (TextView) p().findViewById(b03.h.n1);
            String lowerCase = callToAction2.toLowerCase();
            c25.o(lowerCase, "(this as java.lang.String).toLowerCase()");
            String m1 = b95.m1(lowerCase);
            ((ImageView) p().findViewById(b03.h.O2)).setColorFilter(f);
            textView2.setText(m1);
            ((FrameLayout) p().findViewById(b03.h.M4)).setBackgroundColor(i);
            textView2.setTextColor(f);
        }
        String text = l2.getText();
        if (text != null) {
            TextView textView3 = (TextView) p().findViewById(b03.h.N4);
            textView3.setText(text);
            textView3.setTextColor(i2);
        }
        TextView textView4 = (TextView) p().findViewById(b03.h.T4);
        if (l2.getStarRating() != null) {
            GGRatingBar gGRatingBar = (GGRatingBar) p().findViewById(b03.h.S4);
            gGRatingBar.setNumStars(5);
            try {
                gGRatingBar.setRating(Float.parseFloat(String.valueOf(l2.getStarRating())));
                textView4.setText("(" + l2.getStarRating() + ')');
            } catch (Exception unused) {
                gGRatingBar.setRating(0.0f);
            }
            textView4.setTextColor(i2);
            View findViewById2 = p().findViewById(b03.h.l3);
            Objects.requireNonNull(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) findViewById2).setTextColor(i2);
        } else {
            p().findViewById(b03.h.l3).setVisibility(8);
        }
        if (l2.getMainImageUrl() == null) {
            return;
        }
        ImageView imageView3 = (ImageView) p().findViewById(b03.h.K4);
        p().findViewById(b03.h.s2).setVisibility(0);
        imageView3.setVisibility(0);
        BitmapFactory.Options options = new BitmapFactory.Options();
        String j = h().b().j();
        String str = j != null ? j : "";
        GreedyGameAds iNSTANCE$com_greedygame_sdkx_core = GreedyGameAds.a.getINSTANCE$com_greedygame_sdkx_core();
        Uri uri = null;
        if (iNSTANCE$com_greedygame_sdkx_core != null && (r = iNSTANCE$com_greedygame_sdkx_core.r()) != null && (p = r.p()) != null) {
            uri = p.a(str);
        }
        Bitmap decodeFile = BitmapFactory.decodeFile(String.valueOf(uri), options);
        if (decodeFile != null) {
            imageView3.setImageBitmap(decodeFile);
        }
    }

    public void x() {
        int f;
        int g;
        int i;
        View findViewById = p().findViewById(b03.h.W1);
        final VideoNativeAd m = m();
        if (m == null) {
            return;
        }
        m.prepare(findViewById);
        o().setOnClickListener(findViewById, new ClickInterface() { // from class: com.p7700g.p99005.n63
            public final void a(View view) {
                r93.lambda$AEFyYEfO_bGOIvAXMpuz2sbeq1c(r93.this, m, view);
            }
        });
        Bitmap z = z();
        if (z == null) {
            i = sr.t;
            f = -1;
            g = -1;
        } else {
            hz2 b2 = cz2.b(z);
            int h = b2.h();
            f = b2.j().f();
            this.m = b2.j().h();
            g = b2.j().g();
            int g2 = b2.g();
            p().findViewById(b03.h.h1).setBackgroundColor(g2);
            p().findViewById(b03.h.a1).setBackgroundColor(g2);
            i = h;
        }
        String title = m.getTitle();
        if (title != null) {
            TextView textView = (TextView) p().findViewById(b03.h.O4);
            textView.setText(title);
            textView.setTextColor(g);
        }
        Activity p = p();
        int i2 = b03.h.P4;
        ImageView imageView = (ImageView) p.findViewById(i2);
        if (m.getIconImageUrl() != null) {
            ImageView imageView2 = (ImageView) p().findViewById(i2);
            Bitmap z2 = z();
            if (z2 != null) {
                imageView2.setImageBitmap(z2);
            }
        } else {
            imageView.setVisibility(8);
        }
        String callToAction = m.getCallToAction();
        if (callToAction != null) {
            TextView textView2 = (TextView) p().findViewById(b03.h.n1);
            String lowerCase = callToAction.toLowerCase();
            c25.o(lowerCase, "(this as java.lang.String).toLowerCase()");
            String m1 = b95.m1(lowerCase);
            ((ImageView) p().findViewById(b03.h.O2)).setColorFilter(f);
            textView2.setText(m1);
            ((FrameLayout) p().findViewById(b03.h.M4)).setBackgroundColor(i);
            textView2.setTextColor(f);
        }
        String text = m.getText();
        if (text != null) {
            TextView textView3 = (TextView) p().findViewById(b03.h.N4);
            textView3.setText(text);
            textView3.setTextColor(g);
        }
        FrameLayout frameLayout = (FrameLayout) p().findViewById(b03.h.s2);
        frameLayout.setVisibility(0);
        MediaLayout mediaLayout = new MediaLayout(p());
        mediaLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.addView((View) mediaLayout);
        m.render(mediaLayout);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r93(@NotNull q13 q13Var, @NotNull n13<?> n13Var, @NotNull StaticNativeAd staticNativeAd) {
        super(q13Var, n13Var, staticNativeAd);
        c25.p(q13Var, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        c25.p(n13Var, "adView");
        c25.p(staticNativeAd, "ad");
        this.m = true;
    }
}