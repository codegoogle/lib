package com.p7700g.p99005;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.net.http.SslError;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.ads.Utils.CustomWebView;
import com.p7700g.p99005.zg3;

/* compiled from: Qureka_Native_Inflate.java */
/* loaded from: classes3.dex */
public class dg3 {
    private static String a = "Qureka_Native_Inflate";
    private static dh3 b = null;
    private static Activity c = null;
    public static int d = 0;
    public static boolean e = true;
    public static int f = 0;
    public static boolean g = true;
    public static int h = 0;
    public static boolean i = true;
    public static int j = 0;
    public static boolean k = true;
    public static int l = 0;
    public static boolean m = true;

    /* compiled from: Qureka_Native_Inflate.java */
    /* loaded from: classes3.dex */
    public class a extends WebViewClient {
        public final /* synthetic */ ShimmerFrameLayout a;
        public final /* synthetic */ Activity b;

        /* compiled from: Qureka_Native_Inflate.java */
        /* renamed from: com.p7700g.p99005.dg3$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class DialogInterface$OnClickListenerC0160a implements DialogInterface.OnClickListener {
            public final /* synthetic */ SslErrorHandler s;

            public DialogInterface$OnClickListenerC0160a(final SslErrorHandler val$handler) {
                this.s = val$handler;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialog, int which) {
                this.s.proceed();
            }
        }

        /* compiled from: Qureka_Native_Inflate.java */
        /* loaded from: classes3.dex */
        public class b implements DialogInterface.OnClickListener {
            public final /* synthetic */ SslErrorHandler s;

            public b(final SslErrorHandler val$handler) {
                this.s = val$handler;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialog, int which) {
                this.s.cancel();
            }
        }

        public a(final ShimmerFrameLayout val$mShimmerViewContainer, final Activity val$activity) {
            this.a = val$mShimmerViewContainer;
            this.b = val$activity;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView view, String url) {
            this.a.h();
            this.a.setVisibility(8);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            this.a.g();
            this.a.setVisibility(0);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this.b);
            builder.setMessage(zg3.i.b);
            builder.setPositiveButton(zg3.i.e, new DialogInterface$OnClickListenerC0160a(handler));
            builder.setNegativeButton(zg3.i.d, new b(handler));
            builder.create().show();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            webView.loadUrl(str);
            return true;
        }
    }

    /* compiled from: Qureka_Native_Inflate.java */
    /* loaded from: classes3.dex */
    public class b extends WebViewClient {
        public final /* synthetic */ ShimmerFrameLayout a;
        public final /* synthetic */ Activity b;

        /* compiled from: Qureka_Native_Inflate.java */
        /* loaded from: classes3.dex */
        public class a implements DialogInterface.OnClickListener {
            public final /* synthetic */ SslErrorHandler s;

            public a(final SslErrorHandler val$handler) {
                this.s = val$handler;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialog, int which) {
                this.s.proceed();
            }
        }

        /* compiled from: Qureka_Native_Inflate.java */
        /* renamed from: com.p7700g.p99005.dg3$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class DialogInterface$OnClickListenerC0161b implements DialogInterface.OnClickListener {
            public final /* synthetic */ SslErrorHandler s;

            public DialogInterface$OnClickListenerC0161b(final SslErrorHandler val$handler) {
                this.s = val$handler;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialog, int which) {
                this.s.cancel();
            }
        }

        public b(final ShimmerFrameLayout val$mShimmerViewContainer, final Activity val$activity) {
            this.a = val$mShimmerViewContainer;
            this.b = val$activity;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView view, String url) {
            this.a.h();
            this.a.setVisibility(8);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            this.a.g();
            this.a.setVisibility(0);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this.b);
            builder.setMessage(zg3.i.b);
            builder.setPositiveButton(zg3.i.e, new a(handler));
            builder.setNegativeButton(zg3.i.d, new DialogInterface$OnClickListenerC0161b(handler));
            builder.create().show();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            webView.loadUrl(str);
            return true;
        }
    }

    /* compiled from: Qureka_Native_Inflate.java */
    /* loaded from: classes3.dex */
    public class c implements View.OnClickListener {
        public final /* synthetic */ Activity s;

        public c(final Activity val$activity) {
            this.s = val$activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            dg3.b(this.s);
        }
    }

    /* compiled from: Qureka_Native_Inflate.java */
    /* loaded from: classes3.dex */
    public class d implements View.OnClickListener {
        public final /* synthetic */ Activity s;

        public d(final Activity val$activity) {
            this.s = val$activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            dg3.b(this.s);
        }
    }

    /* compiled from: Qureka_Native_Inflate.java */
    /* loaded from: classes3.dex */
    public class e implements View.OnClickListener {
        public final /* synthetic */ Activity s;

        public e(final Activity val$activity) {
            this.s = val$activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            dg3.b(this.s);
        }
    }

    /* compiled from: Qureka_Native_Inflate.java */
    /* loaded from: classes3.dex */
    public class f implements View.OnClickListener {
        public final /* synthetic */ Activity s;

        public f(final Activity val$activity) {
            this.s = val$activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            dg3.b(this.s);
        }
    }

    /* compiled from: Qureka_Native_Inflate.java */
    /* loaded from: classes3.dex */
    public class g implements View.OnClickListener {
        public final /* synthetic */ Activity s;

        public g(final Activity val$activity) {
            this.s = val$activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            dg3.b(this.s);
        }
    }

    /* compiled from: Qureka_Native_Inflate.java */
    /* loaded from: classes3.dex */
    public class h implements View.OnClickListener {
        public final /* synthetic */ Activity s;

        public h(final Activity val$activity) {
            this.s = val$activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            dg3.b(this.s);
        }
    }

    /* compiled from: Qureka_Native_Inflate.java */
    /* loaded from: classes3.dex */
    public class i implements View.OnClickListener {
        public final /* synthetic */ Activity s;

        public i(final Activity val$activity) {
            this.s = val$activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            dg3.b(this.s);
        }
    }

    /* compiled from: Qureka_Native_Inflate.java */
    /* loaded from: classes3.dex */
    public class j implements View.OnClickListener {
        public final /* synthetic */ Activity s;

        public j(final Activity val$activity) {
            this.s = val$activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            dg3.b(this.s);
        }
    }

    /* compiled from: Qureka_Native_Inflate.java */
    /* loaded from: classes3.dex */
    public class k implements View.OnClickListener {
        public final /* synthetic */ Activity s;

        public k(final Activity val$activity) {
            this.s = val$activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            dg3.b(this.s);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Activity activity) {
        ih3.Q(activity, d());
    }

    private static Resources c() {
        if (b == null) {
            b = new dh3(c.getResources());
        }
        return b;
    }

    public static String d() {
        String[] split = yg3.e(bh3.z0).split("\\|");
        if (split.length != 0 && split.length != 0) {
            if (!m && split.length - 1 == l) {
                l = 0;
                m = true;
            }
            if (m) {
                m = false;
            } else {
                l++;
            }
        }
        return split[l].trim();
    }

    public static String e() {
        String[] split = yg3.e(bh3.Q).split("\\|");
        if (split.length != 0 && split.length != 0) {
            if (!g && split.length - 1 == f) {
                f = 0;
                g = true;
            }
            if (g) {
                g = false;
            } else {
                f++;
            }
        }
        return split[f].trim();
    }

    public static String f() {
        String[] split = yg3.e(bh3.N).split("\\|");
        if (split.length != 0 && split.length != 0) {
            if (!e && split.length - 1 == d) {
                d = 0;
                e = true;
            }
            if (e) {
                e = false;
            } else {
                d++;
            }
        }
        return split[d].trim();
    }

    public static String g() {
        String[] split = yg3.e(bh3.P).split("\\|");
        if (split.length != 0 && split.length != 0) {
            if (!k && split.length - 1 == j) {
                j = 0;
                k = true;
            }
            if (k) {
                k = false;
            } else {
                j++;
            }
        }
        return split[j].trim();
    }

    public static String h() {
        String[] split = yg3.e(bh3.O).split("\\|");
        if (split.length != 0 && split.length != 0) {
            if (!i && split.length - 1 == h) {
                h = 0;
                i = true;
            }
            if (i) {
                i = false;
            } else {
                h++;
            }
        }
        return split[h].trim();
    }

    public static void i(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        c = activity;
        viewGroup.setVisibility(0);
        View inflate = LayoutInflater.from(activity).inflate(zg3.g.v, (ViewGroup) null);
        ih3.R((TextView) inflate.findViewById(zg3.e.e));
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(zg3.e.z);
        relativeLayout.getLayoutParams().height = (int) c().getDimension(zg3.c.d);
        LayerDrawable layerDrawable = (LayerDrawable) relativeLayout.getBackground();
        GradientDrawable gradientDrawable = new GradientDrawable(ih3.n(yg3.e(bh3.W)), new int[]{c().getColor(zg3.b.c), c().getColor(zg3.b.b)});
        dh3 dh3Var = b;
        int i2 = zg3.c.e;
        gradientDrawable.setCornerRadius(dh3Var.getDimension(i2));
        GradientDrawable gradientDrawable2 = new GradientDrawable(ih3.n(yg3.e(bh3.V)), new int[]{c().getColor(zg3.b.e), c().getColor(zg3.b.d)});
        gradientDrawable2.setCornerRadius(b.getDimension(i2));
        dh3 dh3Var2 = b;
        int i3 = zg3.c.c;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) gradientDrawable2, (int) dh3Var2.getDimension(i3), (int) b.getDimension(i3), (int) b.getDimension(i3), (int) b.getDimension(i3));
        if (Build.VERSION.SDK_INT >= 23) {
            layerDrawable.setDrawable(0, gradientDrawable);
            layerDrawable.setDrawable(1, insetDrawable);
        }
        ImageView imageView = (ImageView) inflate.findViewById(zg3.e.K);
        yo1.C(activity).a(g()).p().E1(imageView);
        imageView.setOnClickListener(new j(activity));
        relativeLayout.setOnClickListener(new k(activity));
        viewGroup.removeAllViews();
        viewGroup.addView(inflate);
    }

    public static void j(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        c = activity;
        viewGroup.setVisibility(0);
        View inflate = LayoutInflater.from(activity).inflate(zg3.g.B, (ViewGroup) null);
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) inflate.findViewById(zg3.e.n0);
        shimmerFrameLayout.g();
        shimmerFrameLayout.setVisibility(0);
        CustomWebView customWebView = (CustomWebView) inflate.findViewById(zg3.e.C0);
        ((RelativeLayout) inflate.findViewById(zg3.e.B0)).getLayoutParams().height = (int) c().getDimension(zg3.c.a);
        String d2 = d();
        ih3.h(activity, customWebView);
        customWebView.setWebViewClient(new b(shimmerFrameLayout, activity));
        customWebView.loadUrl(d2);
        viewGroup.removeAllViews();
        viewGroup.addView(inflate);
    }

    public static void k(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        c = activity;
        viewGroup.setVisibility(0);
        View inflate = LayoutInflater.from(activity).inflate(zg3.g.w, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(zg3.e.e);
        if (!yg3.e(bh3.Y).equals("")) {
            StringBuilder G = wo1.G("");
            G.append(yg3.e(bh3.Y));
            textView.setText(G.toString());
        }
        if (!yg3.e(bh3.X).equals("")) {
            wo1.b0(bh3.X, textView);
        }
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(zg3.e.z);
        relativeLayout.getLayoutParams().height = (int) c().getDimension(zg3.c.d);
        LayerDrawable layerDrawable = (LayerDrawable) relativeLayout.getBackground();
        GradientDrawable gradientDrawable = new GradientDrawable(ih3.n(yg3.e(bh3.W)), new int[]{c().getColor(zg3.b.c), c().getColor(zg3.b.b)});
        dh3 dh3Var = b;
        int i2 = zg3.c.e;
        gradientDrawable.setCornerRadius(dh3Var.getDimension(i2));
        GradientDrawable gradientDrawable2 = new GradientDrawable(ih3.n(yg3.e(bh3.V)), new int[]{c().getColor(zg3.b.e), c().getColor(zg3.b.d)});
        gradientDrawable2.setCornerRadius(b.getDimension(i2));
        dh3 dh3Var2 = b;
        int i3 = zg3.c.c;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) gradientDrawable2, (int) dh3Var2.getDimension(i3), (int) b.getDimension(i3), (int) b.getDimension(i3), (int) b.getDimension(i3));
        if (Build.VERSION.SDK_INT >= 23) {
            layerDrawable.setDrawable(0, gradientDrawable);
            layerDrawable.setDrawable(1, insetDrawable);
        }
        ImageView imageView = (ImageView) inflate.findViewById(zg3.e.K);
        yo1.C(activity).a(h()).p().E1(imageView);
        imageView.setOnClickListener(new f(activity));
        relativeLayout.setOnClickListener(new g(activity));
        viewGroup.removeAllViews();
        viewGroup.addView(inflate);
    }

    public static void l(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        c = activity;
        viewGroup.setVisibility(0);
        View inflate = LayoutInflater.from(activity).inflate(zg3.g.B, (ViewGroup) null);
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) inflate.findViewById(zg3.e.n0);
        shimmerFrameLayout.g();
        shimmerFrameLayout.setVisibility(0);
        CustomWebView customWebView = (CustomWebView) inflate.findViewById(zg3.e.C0);
        ((RelativeLayout) inflate.findViewById(zg3.e.B0)).getLayoutParams().height = (int) c().getDimension(zg3.c.b);
        String d2 = d();
        ih3.h(activity, customWebView);
        customWebView.setWebViewClient(new a(shimmerFrameLayout, activity));
        customWebView.loadUrl(d2);
        viewGroup.removeAllViews();
        viewGroup.addView(inflate);
    }

    public static void m(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        c = activity;
        viewGroup.setVisibility(0);
        View inflate = LayoutInflater.from(activity).inflate(zg3.g.u, (ViewGroup) null);
        CardView cardView = (CardView) inflate.findViewById(zg3.e.y);
        if (yg3.e(bh3.N0).equals("")) {
            cardView.setCardBackgroundColor(Color.parseColor("#00000000"));
            cardView.setCardElevation(0.0f);
            cardView.setMaxCardElevation(0.0f);
        } else {
            cardView.setCardBackgroundColor(Color.parseColor(yg3.e(bh3.N0)));
        }
        ImageView imageView = (ImageView) inflate.findViewById(zg3.e.K);
        yo1.C(activity).a(h()).p().E1(imageView);
        imageView.setOnClickListener(new h(activity));
        viewGroup.removeAllViews();
        viewGroup.addView(inflate);
    }

    public static void n(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        c = activity;
        viewGroup.setVisibility(0);
        View inflate = LayoutInflater.from(activity).inflate(zg3.g.u, (ViewGroup) null);
        CardView cardView = (CardView) inflate.findViewById(zg3.e.y);
        if (yg3.e(bh3.N0).equals("")) {
            cardView.setCardBackgroundColor(Color.parseColor("#00000000"));
            cardView.setCardElevation(0.0f);
            cardView.setMaxCardElevation(0.0f);
        } else {
            cardView.setCardBackgroundColor(Color.parseColor(yg3.e(bh3.N0)));
        }
        ImageView imageView = (ImageView) inflate.findViewById(zg3.e.K);
        yo1.C(activity).a(g()).p().E1(imageView);
        imageView.setOnClickListener(new i(activity));
        viewGroup.removeAllViews();
        viewGroup.addView(inflate);
    }

    public static void o(Activity activity, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(activity).inflate(zg3.g.i, (ViewGroup) null);
        ImageView imageView = (ImageView) inflate.findViewById(zg3.e.K);
        yo1.C(activity).a(e()).p().E1(imageView);
        imageView.setOnClickListener(new e(activity));
        viewGroup.removeAllViews();
        viewGroup.addView(inflate);
    }

    public static void p(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        View inflate;
        c = activity;
        LayoutInflater from = LayoutInflater.from(activity);
        yg3.e(bh3.E0);
        if (yg3.e(bh3.E0).equals("1")) {
            inflate = from.inflate(zg3.g.j, (ViewGroup) null);
            CardView cardView = (CardView) inflate.findViewById(zg3.e.y);
            if (yg3.e(bh3.N0).equals("")) {
                cardView.setCardBackgroundColor(Color.parseColor("#00000000"));
                cardView.setCardElevation(0.0f);
                cardView.setMaxCardElevation(0.0f);
            } else {
                cardView.setCardBackgroundColor(Color.parseColor(yg3.e(bh3.N0)));
            }
        } else {
            inflate = from.inflate(zg3.g.k, (ViewGroup) null);
        }
        ImageView imageView = (ImageView) inflate.findViewById(zg3.e.K);
        TextView textView = (TextView) inflate.findViewById(zg3.e.e);
        if (!yg3.e(bh3.Y).equals("")) {
            StringBuilder G = wo1.G("");
            G.append(yg3.e(bh3.Y));
            textView.setText(G.toString());
        }
        if (!yg3.e(bh3.X).equals("")) {
            wo1.b0(bh3.X, textView);
        }
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(zg3.e.z);
        relativeLayout.getLayoutParams().height = (int) c().getDimension(zg3.c.d);
        LayerDrawable layerDrawable = (LayerDrawable) relativeLayout.getBackground();
        GradientDrawable gradientDrawable = new GradientDrawable(ih3.n(yg3.e(bh3.W)), new int[]{c().getColor(zg3.b.c), c().getColor(zg3.b.b)});
        dh3 dh3Var = b;
        int i2 = zg3.c.e;
        gradientDrawable.setCornerRadius(dh3Var.getDimension(i2));
        GradientDrawable gradientDrawable2 = new GradientDrawable(ih3.n(yg3.e(bh3.V)), new int[]{c().getColor(zg3.b.e), c().getColor(zg3.b.d)});
        gradientDrawable2.setCornerRadius(b.getDimension(i2));
        dh3 dh3Var2 = b;
        int i3 = zg3.c.c;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) gradientDrawable2, (int) dh3Var2.getDimension(i3), (int) b.getDimension(i3), (int) b.getDimension(i3), (int) b.getDimension(i3));
        if (Build.VERSION.SDK_INT >= 23) {
            layerDrawable.setDrawable(0, gradientDrawable);
            layerDrawable.setDrawable(1, insetDrawable);
        }
        if (direction.equals(bh3.Y0)) {
            if (yg3.e(bh3.C0).equals("1")) {
                tg3.d(sg3.FadeIn).m(1000L).w(6).v(relativeLayout);
            } else if (yg3.e(bh3.C0).equals("2")) {
                tg3.d(sg3.Bounce).m(1000L).w(6).v(relativeLayout);
            } else if (yg3.e(bh3.C0).equals("3")) {
                tg3.d(sg3.Shake).m(1000L).w(6).v(relativeLayout);
            }
        }
        yo1.C(activity).a(f()).p().E1(imageView);
        imageView.setOnClickListener(new c(activity));
        relativeLayout.setOnClickListener(new d(activity));
        viewGroup.removeAllViews();
        viewGroup.addView(inflate);
    }
}