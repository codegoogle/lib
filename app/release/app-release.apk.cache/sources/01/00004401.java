package com.p7700g.p99005;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.greedygame.core.AppConfig;
import com.greedygame.core.GreedyGameAds;
import com.greedygame.core.adview.general.GGAdview;
import com.greedygame.core.mediation.GGButton;
import com.greedygame.core.network.model.responses.Ad;
import com.greedygame.core.network.model.responses.Partner;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.p7700g.p99005.b03;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class g73 {
    @NotNull
    public static final a a = new a(null);
    @Nullable
    private final Context b;
    @NotNull
    private final n33 c;
    @Nullable
    private final hc3 d;
    private int e;
    private int f;
    private boolean g;
    @NotNull
    private final qo4 h;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final g73 a() {
            return b.a.a();
        }
    }

    @r2
    /* loaded from: classes3.dex */
    public static final class b {
        @NotNull
        public static final b a = new b();
        @NotNull
        private static final g73 b = new g73(null, null, null, 7, null);

        private b() {
        }

        @NotNull
        public final g73 a() {
            return b;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends e25 implements uz4<LayoutInflater> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c() {
            super(0);
            g73.this = r1;
        }

        @Override // com.p7700g.p99005.uz4
        /* renamed from: h */
        public final LayoutInflater x() {
            return LayoutInflater.from(g73.this.b);
        }
    }

    @r2
    public g73() {
        this(null, null, null, 7, null);
    }

    @r2
    public g73(@Nullable Context context, @NotNull n33 n33Var, @Nullable hc3 hc3Var) {
        c25.p(n33Var, "mystiqueInstance");
        this.b = context;
        this.c = n33Var;
        this.d = hc3Var;
        this.e = -1;
        this.f = -1;
        this.g = true;
        this.h = so4.c(new c());
    }

    private static final Bitmap c(g73 g73Var, Ad ad) {
        Uri a2;
        hc3 hc3Var = g73Var.d;
        if (hc3Var == null) {
            a2 = null;
        } else {
            String i = ad.v().i();
            if (i == null) {
                i = "";
            }
            a2 = hc3Var.a(i);
        }
        return BitmapFactory.decodeFile(String.valueOf(a2));
    }

    public static final void j(f05 f05Var, String str, View view) {
        c25.p(str, "$url");
        if (f05Var == null) {
            return;
        }
        f05Var.M(str);
    }

    public static /* synthetic */ void k(f05 f05Var, String str, View view) {
        j(f05Var, str, view);
    }

    @r2
    public final int a(@NotNull GGAdview gGAdview, @NotNull n03 n03Var, @Nullable DisplayMetrics displayMetrics) {
        int intValue;
        Resources resources;
        Resources resources2;
        Resources resources3;
        Resources resources4;
        Resources resources5;
        c25.p(gGAdview, "adView");
        c25.p(n03Var, "unitConfig");
        ViewGroup.LayoutParams k = n03Var.k();
        int i = k == null ? -1 : k.width;
        if (i == 0) {
            i = -1;
        }
        ViewGroup.LayoutParams k2 = n03Var.k();
        DisplayMetrics displayMetrics2 = null;
        Integer valueOf = k2 == null ? null : Integer.valueOf(k2.height);
        boolean z = true;
        if (valueOf != null && valueOf.intValue() == -2) {
            if (gGAdview.getAdsMaxHeight() > 0) {
                int adsMaxHeight = gGAdview.getAdsMaxHeight();
                Context context = this.b;
                if (adsMaxHeight >= ac3.a(50, (context == null || (resources5 = context.getResources()) == null) ? null : resources5.getDisplayMetrics())) {
                    intValue = gGAdview.getAdsMaxHeight();
                }
            }
            cc3 cc3Var = cc3.a;
            Context context2 = gGAdview.getContext();
            c25.o(context2, "adView.context");
            int j = n03Var.j();
            Context context3 = gGAdview.getContext();
            c25.o(context3, "adView.context");
            int b2 = cc3Var.b(context2, cz2.e(j, context3));
            Context context4 = gGAdview.getContext();
            c25.o(context4, "adView.context");
            intValue = cz2.a(b2, context4);
        } else {
            if (valueOf == null || valueOf.intValue() == 0) {
                if (gGAdview.getAdsMaxHeight() > 0) {
                    int adsMaxHeight2 = gGAdview.getAdsMaxHeight();
                    Context context5 = this.b;
                    if (adsMaxHeight2 >= ac3.a(50, (context5 == null || (resources = context5.getResources()) == null) ? null : resources.getDisplayMetrics())) {
                        intValue = gGAdview.getAdsMaxHeight();
                    }
                }
                Context context6 = gGAdview.getContext();
                c25.o(context6, "adView.context");
                intValue = cz2.a(250, context6);
            } else {
                intValue = valueOf.intValue();
            }
        }
        if (i == -2) {
            if (gGAdview.getAdsMaxWidth() > 0) {
                int adsMaxWidth = gGAdview.getAdsMaxWidth();
                Context context7 = this.b;
                if (adsMaxWidth >= ac3.a(100, (context7 == null || (resources4 = context7.getResources()) == null) ? null : resources4.getDisplayMetrics())) {
                    i = gGAdview.getAdsMaxWidth();
                }
            }
            i = -1;
        }
        if (intValue == -1 && gGAdview.getAdsMaxHeight() > 0) {
            int adsMaxHeight3 = gGAdview.getAdsMaxHeight();
            Context context8 = this.b;
            if (adsMaxHeight3 >= ac3.a(50, (context8 == null || (resources3 = context8.getResources()) == null) ? null : resources3.getDisplayMetrics())) {
                intValue = gGAdview.getAdsMaxHeight();
            }
        }
        if (i == -1 && gGAdview.getAdsMaxWidth() > 0) {
            int adsMaxWidth2 = gGAdview.getAdsMaxWidth();
            Context context9 = this.b;
            if (context9 != null && (resources2 = context9.getResources()) != null) {
                displayMetrics2 = resources2.getDisplayMetrics();
            }
            if (adsMaxWidth2 >= ac3.a(100, displayMetrics2)) {
                i = gGAdview.getAdsMaxWidth();
            }
        }
        if (intValue <= 0 || i <= 0) {
            if (intValue == -1 && i == -1) {
                return b03.k.G0;
            }
            if (intValue == -1) {
                return b03.k.G0;
            }
            if (i == -1) {
                if (intValue < ac3.a(80, displayMetrics)) {
                    return b03.k.F0;
                }
                if (intValue < ac3.a(110, displayMetrics)) {
                    return b03.k.D0;
                }
                if (intValue < ac3.a(180, displayMetrics)) {
                    return b03.k.E0;
                }
                if (intValue < ac3.a(250, displayMetrics)) {
                    return b03.k.H0;
                }
                return b03.k.C0;
            }
            return b03.k.G0;
        }
        double d = i / intValue;
        if (intValue >= ac3.a(50, displayMetrics) && intValue < ac3.a(180, displayMetrics)) {
            if (d >= 6.0d) {
                return b03.k.F0;
            }
            if ((2.0d > d || d > 6.0d) ? false : false) {
                if (intValue >= ac3.a(50, displayMetrics) && intValue < ac3.a(110, displayMetrics)) {
                    return b03.k.D0;
                }
                return b03.k.E0;
            } else if (intValue >= ac3.a(50, displayMetrics) && intValue < ac3.a(IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, displayMetrics)) {
                return b03.k.A0;
            } else {
                return b03.k.B0;
            }
        }
        if (2.0d <= d && d <= 6.0d) {
            if (intValue >= ac3.a(180, displayMetrics) && intValue < ac3.a(250, displayMetrics)) {
                return b03.k.H0;
            }
            return b03.k.C0;
        }
        if ((1.0d > d || d > 2.0d) ? false : false) {
            if (intValue >= ac3.a(180, displayMetrics) && intValue < ac3.a(200, displayMetrics)) {
                return b03.k.B0;
            }
            return b03.k.C0;
        } else if (intValue >= ac3.a(180, displayMetrics) && intValue < ac3.a(400, displayMetrics)) {
            return b03.k.B0;
        } else {
            return b03.k.G0;
        }
    }

    @NotNull
    public final o33 d(@NotNull GGAdview gGAdview, @NotNull n03 n03Var, @NotNull Ad ad, @NotNull q33 q33Var, @Nullable Partner partner, @NotNull f05<? super String, yq4> f05Var) {
        Resources resources;
        AppConfig r;
        Typeface h;
        iz2 j;
        AppConfig r2;
        Typeface h2;
        iz2 j2;
        AppConfig r3;
        Typeface h3;
        iz2 j3;
        c25.p(gGAdview, "adView");
        c25.p(n03Var, "unitConfig");
        c25.p(ad, "ad");
        c25.p(q33Var, "viewProcessed");
        c25.p(f05Var, "customOnClickAction");
        long currentTimeMillis = System.currentTimeMillis();
        Bitmap c2 = c(this, ad);
        hz2 b2 = c2 == null ? null : cz2.b(c2);
        LayoutInflater from = LayoutInflater.from(gGAdview.getContext());
        Context context = this.b;
        View inflate = from.inflate(a(gGAdview, n03Var, (context == null || (resources = context.getResources()) == null) ? null : resources.getDisplayMetrics()), (ViewGroup) null, false);
        Objects.requireNonNull(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) inflate;
        Integer valueOf = b2 != null ? Integer.valueOf(b2.g()) : null;
        int parseColor = valueOf == null ? Color.parseColor("#262625") : valueOf.intValue();
        viewGroup.setBackgroundColor(parseColor);
        View findViewById = viewGroup.findViewById(b03.h.O4);
        TextView textView = (TextView) findViewById;
        String q = ad.v().q();
        if (q == null) {
            q = "";
        }
        i(textView, q);
        if (textView != null) {
            textView.setTextColor((b2 == null || (j3 = b2.j()) == null) ? -1 : j3.g());
        }
        String y = ad.y();
        if (y == null) {
            y = "";
        }
        f(findViewById, y, f05Var);
        GreedyGameAds.Companion companion = GreedyGameAds.a;
        GreedyGameAds iNSTANCE$com_greedygame_sdkx_core = companion.getINSTANCE$com_greedygame_sdkx_core();
        if (iNSTANCE$com_greedygame_sdkx_core != null && (r3 = iNSTANCE$com_greedygame_sdkx_core.r()) != null && (h3 = r3.h()) != null && textView != null) {
            textView.setTypeface(h3);
        }
        View findViewById2 = viewGroup.findViewById(b03.h.N4);
        TextView textView2 = (TextView) findViewById2;
        if (textView2 != null) {
            textView2.setAlpha(0.85f);
        }
        String g = ad.v().g();
        if (g == null) {
            g = "";
        }
        i(textView2, g);
        if (textView2 != null) {
            textView2.setTextColor((b2 == null || (j2 = b2.j()) == null) ? -1 : j2.g());
        }
        String y2 = ad.y();
        if (y2 == null) {
            y2 = "";
        }
        f(findViewById2, y2, f05Var);
        GreedyGameAds iNSTANCE$com_greedygame_sdkx_core2 = companion.getINSTANCE$com_greedygame_sdkx_core();
        if (iNSTANCE$com_greedygame_sdkx_core2 != null && (r2 = iNSTANCE$com_greedygame_sdkx_core2.r()) != null && (h2 = r2.h()) != null && textView2 != null) {
            textView2.setTypeface(h2);
        }
        GGButton gGButton = (GGButton) viewGroup.findViewById(b03.h.M4);
        String e = ad.v().e();
        if (e == null) {
            e = "";
        }
        i(gGButton, e);
        gGButton.setBackground(b2 != null ? b2.h() : -1);
        if (b2 != null && (j = b2.j()) != null) {
            parseColor = j.f();
        }
        gGButton.setTextColor(parseColor);
        String y3 = ad.y();
        if (y3 == null) {
            y3 = "";
        }
        f(gGButton, y3, f05Var);
        GreedyGameAds iNSTANCE$com_greedygame_sdkx_core3 = companion.getINSTANCE$com_greedygame_sdkx_core();
        if (iNSTANCE$com_greedygame_sdkx_core3 != null && (r = iNSTANCE$com_greedygame_sdkx_core3.r()) != null && (h = r.h()) != null) {
            gGButton.setTypeface(h);
        }
        ImageView imageView = (ImageView) viewGroup.findViewById(b03.h.P4);
        hc3 hc3Var = this.d;
        if (hc3Var != null) {
            h(imageView, hc3Var, ad);
        }
        View view = (FrameLayout) viewGroup.findViewById(b03.h.Q4);
        String y4 = ad.y();
        if (y4 == null) {
            y4 = "";
        }
        f(view, y4, f05Var);
        String y5 = ad.y();
        f(imageView, y5 != null ? y5 : "", f05Var);
        o33 r4 = this.c.r(viewGroup, q33Var, m13.b(partner), currentTimeMillis);
        r4.setDominantColor(b2 == null ? sr.t : b2.h());
        r4.setTimeTaken(System.currentTimeMillis() - currentTimeMillis);
        return r4;
    }

    @Nullable
    public final o33 e(@NotNull GGAdview gGAdview, @NotNull n03 n03Var, @NotNull String str, @Nullable Partner partner, @NotNull Ad ad, @NotNull f05<? super String, yq4> f05Var, @NotNull q33 q33Var) {
        c25.p(gGAdview, "adView");
        c25.p(n03Var, "unitConfig");
        c25.p(str, "templateUrl");
        c25.p(ad, "ad");
        c25.p(f05Var, "customOnClickAction");
        c25.p(q33Var, "viewProcessed");
        if (!(str.length() == 0) && this.c.m(str)) {
            return this.c.l(n03Var.j(), str, m13.b(partner), m13.a(ad), q33Var, f05Var);
        }
        return d(gGAdview, n03Var, ad, q33Var, partner, f05Var);
    }

    @r2
    public final void f(@Nullable View view, @NotNull final String str, @Nullable final f05<? super String, yq4> f05Var) {
        c25.p(str, "url");
        if (view == null) {
            return;
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: com.p7700g.p99005.r53
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                g73.k(f05.this, str, view2);
            }
        });
    }

    public final void g(@Nullable ImageView imageView, @NotNull Bitmap bitmap) {
        c25.p(bitmap, "bitmap");
        if (imageView == null) {
            return;
        }
        imageView.setImageBitmap(bitmap);
    }

    public final void h(@Nullable ImageView imageView, @NotNull hc3 hc3Var, @NotNull Ad ad) {
        Context context;
        c25.p(hc3Var, "assetManager");
        c25.p(ad, "ad");
        String i = ad.v().i();
        String str = "";
        if (i == null) {
            i = "";
        }
        String uri = hc3Var.a(i).toString();
        c25.o(uri, "assetManager.getCachedPath(ad.nativeMediatedAsset.icon ?: \"\").toString()");
        Bitmap decodeFile = BitmapFactory.decodeFile(uri);
        if (decodeFile == null) {
            if (imageView == null || (context = imageView.getContext()) == null) {
                decodeFile = null;
            } else {
                ay2 ay2Var = ay2.a;
                String e = ad.v().e();
                if (e == null) {
                    String q = ad.v().q();
                    if (q != null) {
                        str = q;
                    }
                } else {
                    str = e;
                }
                decodeFile = ay2Var.a(context, str);
            }
        }
        if (decodeFile == null) {
            return;
        }
        g(imageView, decodeFile);
    }

    public final void i(@Nullable TextView textView, @NotNull String str) {
        c25.p(str, "content");
        if (textView == null) {
            return;
        }
        textView.setText(str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ g73(Context context, n33 n33Var, hc3 hc3Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, n33Var, hc3Var);
        AppConfig r;
        AppConfig r2;
        if ((i & 1) != 0) {
            GreedyGameAds iNSTANCE$com_greedygame_sdkx_core = GreedyGameAds.a.getINSTANCE$com_greedygame_sdkx_core();
            context = (iNSTANCE$com_greedygame_sdkx_core == null || (r2 = iNSTANCE$com_greedygame_sdkx_core.r()) == null) ? null : r2.e();
        }
        n33Var = (i & 2) != 0 ? n33.a.a() : n33Var;
        if ((i & 4) != 0) {
            GreedyGameAds iNSTANCE$com_greedygame_sdkx_core2 = GreedyGameAds.a.getINSTANCE$com_greedygame_sdkx_core();
            hc3Var = (iNSTANCE$com_greedygame_sdkx_core2 == null || (r = iNSTANCE$com_greedygame_sdkx_core2.r()) == null) ? null : r.p();
        }
    }
}