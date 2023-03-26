package com.p7700g.p99005;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import com.greedygame.mystique2.models.Style;
import com.greedygame.mystique2.models.StyleType;
import com.greedygame.mystique2.models.ViewLayer;
import com.greedygame.mystique2.models.ViewSize;
import com.p7700g.p99005.hd3;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class fd3 extends hd3 {
    @NotNull
    public static final a m = new a(null);
    @NotNull
    private final hd3.a n;
    public ImageView o;
    public c43 p;
    @Nullable
    private List<Style> q;
    @NotNull
    private final hp4<String, String> r;
    @NotNull
    private final String s;
    @NotNull
    private final String t;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements View.OnLayoutChangeListener {
        public final /* synthetic */ ImageView a;
        public final /* synthetic */ fd3 b;

        public b(ImageView imageView, fd3 fd3Var) {
            this.a = imageView;
            this.b = fd3Var;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@Nullable View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.a.removeOnLayoutChangeListener(this);
            if (this.a.getWidth() > 0 || this.a.getHeight() > 0) {
                Bitmap c = wz2.c(this.b.s);
                this.a.setImageDrawable(this.b.D(c == null ? null : b43.e(c, this.a.getWidth(), this.a.getHeight())));
                return;
            }
            xz2.c("ImgLayr", "View Height and Width is zero. Image not clipped with radius");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd3(@NotNull hd3.a aVar) {
        super(aVar);
        c25.p(aVar, "builder");
        this.n = aVar;
        hp4<String, String> P = P();
        this.r = P;
        this.s = P.m();
        this.t = P.n();
    }

    private final Bitmap A(Bitmap bitmap, int i) {
        if (!bitmap.isMutable()) {
            bitmap = bitmap.copy(Bitmap.Config.ARGB_8888, true);
        }
        new Canvas(bitmap).drawColor((i & 255) << 24, PorterDuff.Mode.DST_OVER);
        c25.o(bitmap, "mutableBitmap");
        return bitmap;
    }

    public static /* synthetic */ Bitmap B(fd3 fd3Var, Bitmap bitmap, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 255;
        }
        return fd3Var.A(bitmap, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jk D(Bitmap bitmap) {
        String value;
        Context c = c();
        Style F = F(StyleType.RADIUS);
        String str = "0";
        if (F != null && (value = F.getValue()) != null) {
            str = value;
        }
        float b2 = b43.b(c, str, 0.0f, 2, null);
        if (bitmap == null) {
            return null;
        }
        return b43.f(bitmap, c(), b2);
    }

    private final Style F(StyleType styleType) {
        return ViewLayer.Companion.a(styleType, this.q);
    }

    private final boolean J(String str) {
        if (str == null) {
            return false;
        }
        return c95.V2(str, ".gif", false, 2, null);
    }

    private final Bitmap K(Bitmap bitmap) {
        int intValue;
        int intValue2;
        String width = g().getWidth();
        ViewSize viewSize = ViewSize.WRAP;
        if (c25.g(width, viewSize.getValue())) {
            C().measure(0, 0);
            intValue = C().getMeasuredWidth();
        } else if (b95.u2(g().getWidth(), "@", false, 2, null)) {
            intValue = (int) TypedValue.applyDimension(1, Float.parseFloat(c95.c4(g().getWidth(), "@")), c().getResources().getDisplayMetrics());
        } else {
            Integer X0 = a95.X0(g().getWidth());
            if (X0 == null) {
                C().measure(0, 0);
                intValue = C().getMeasuredWidth();
            } else {
                intValue = X0.intValue();
            }
        }
        if (c25.g(g().getHeight(), viewSize.getValue())) {
            C().measure(0, 0);
            intValue2 = C().getMeasuredHeight();
        } else if (b95.u2(g().getHeight(), "@", false, 2, null)) {
            intValue2 = (int) TypedValue.applyDimension(1, Float.parseFloat(c95.c4(g().getHeight(), "@")), c().getResources().getDisplayMetrics());
        } else {
            Integer X02 = a95.X0(g().getHeight());
            if (X02 == null) {
                C().measure(0, 0);
                intValue2 = C().getMeasuredHeight();
            } else {
                intValue2 = X02.intValue();
            }
        }
        Bitmap d = uz2.d(uz2.a, c(), bitmap, e(), 0.0f, 8, null);
        if (d == null) {
            xz2.c("ImgLayr", "[ERROR] Blur operation failed. So making the campaign unavailable.");
            u("Blur operation failed");
            return null;
        }
        return Bitmap.createScaledBitmap(B(this, d, 0, 2, null), intValue, intValue2, false);
    }

    private final void M(ImageView imageView) {
        Float J0;
        Style style = g().getStyle(StyleType.SCALE_TYPE);
        if (style != null) {
            b43.g(imageView, style.getValue());
        }
        if (imageView.getScaleType() == ImageView.ScaleType.CENTER_CROP && N(StyleType.RADIUS)) {
            imageView.addOnLayoutChangeListener(new b(imageView, this));
        }
        Style style2 = g().getStyle(StyleType.OPACITY);
        if ((style2 == null ? null : style2.getValue()) != null) {
            String value = style2.getValue();
            float f = 1.0f;
            if (value != null && (J0 = z85.J0(value)) != null) {
                f = J0.floatValue();
            }
            imageView.setAlpha(f);
        }
    }

    private final boolean N(StyleType styleType) {
        return ViewLayer.Companion.b(styleType, this.q);
    }

    private final void O() {
        Bitmap K;
        H(new ImageView(c()));
        C().setPadding(0, 0, 0, 0);
        C().setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        Bitmap c = wz2.c(this.s.toString());
        if (c == null) {
            if (!c25.g(g().getFallback(), "{cta_icon}")) {
                return;
            }
            Resources resources = c().getResources();
            ay2 ay2Var = ay2.a;
            String b2 = h().b();
            if (b2 == null && (b2 = h().g()) == null) {
                b2 = "";
            }
            c = BitmapFactory.decodeResource(c().getResources(), resources.getIdentifier(ay2Var.b(b2), com.anythink.expressad.foundation.h.h.c, c().getPackageName()));
        }
        if (N(StyleType.RADIUS)) {
            C().setImageDrawable(D(c));
        } else {
            C().setImageBitmap(c);
        }
        if (g().getStyle(StyleType.BLUR_FILL) == null || c == null || (K = K(c)) == null) {
            return;
        }
        C().setImageBitmap(K);
    }

    private final hp4<String, String> P() {
        hp4<String, String> hp4Var;
        hp4<String, String> hp4Var2;
        boolean z = false;
        try {
            Uri parse = Uri.parse(g().getUse());
            if (b95.L1(g().getUse(), "{image}", false, 2, null)) {
                xx2 a2 = a();
                String a3 = h().a();
                if (a3 == null) {
                    a3 = "";
                }
                String uri = a2.b(a3).toString();
                String a4 = h().a();
                if (a4 == null) {
                    a4 = "";
                }
                hp4Var = new hp4<>(uri, a4);
            } else if (b95.L1(g().getUse(), "{icon}", false, 2, null)) {
                xx2 a5 = a();
                String e = h().e();
                if (e == null) {
                    e = "";
                }
                String uri2 = a5.b(e).toString();
                String e2 = h().e();
                if (e2 == null) {
                    e2 = "";
                }
                hp4Var = new hp4<>(uri2, e2);
            } else {
                if (parse != null) {
                    String scheme = parse.getScheme();
                    if (scheme == null ? false : b95.u2(scheme, "http", false, 2, null)) {
                        xx2 a6 = a();
                        String use = g().getUse();
                        if (use == null) {
                            use = "";
                        }
                        String uri3 = a6.b(use).toString();
                        String use2 = g().getUse();
                        if (use2 == null) {
                            use2 = "";
                        }
                        hp4Var = new hp4<>(uri3, use2);
                    }
                }
                hp4Var = new hp4<>("", "");
            }
        } catch (Exception e3) {
            xz2.b("ImgLayr", "Exception ", e3);
            hp4Var = new hp4<>("", "");
        }
        String m2 = hp4Var.m();
        c25.o(m2, "paths.first");
        if (m2.length() == 0) {
            try {
                Uri parse2 = Uri.parse(g().getFallback());
                if (b95.L1(g().getFallback(), "{image}", false, 2, null)) {
                    xx2 a7 = a();
                    String a8 = h().a();
                    if (a8 == null) {
                        a8 = "";
                    }
                    String uri4 = a7.b(a8).toString();
                    String a9 = h().a();
                    if (a9 == null) {
                        a9 = "";
                    }
                    hp4Var2 = new hp4<>(uri4, a9);
                } else if (b95.L1(g().getFallback(), "{icon}", false, 2, null)) {
                    xx2 a10 = a();
                    String e4 = h().e();
                    if (e4 == null) {
                        e4 = "";
                    }
                    String uri5 = a10.b(e4).toString();
                    String e5 = h().e();
                    if (e5 == null) {
                        e5 = "";
                    }
                    hp4Var2 = new hp4<>(uri5, e5);
                } else {
                    if (parse2 != null) {
                        String scheme2 = parse2.getScheme();
                        if (scheme2 != null) {
                            z = b95.u2(scheme2, "http", false, 2, null);
                        }
                        if (z) {
                            xx2 a11 = a();
                            String fallback = g().getFallback();
                            if (fallback == null) {
                                fallback = "";
                            }
                            String uri6 = a11.b(fallback).toString();
                            String fallback2 = g().getFallback();
                            if (fallback2 == null) {
                                fallback2 = "";
                            }
                            hp4Var2 = new hp4<>(uri6, fallback2);
                        }
                    }
                    hp4Var2 = new hp4<>("", "");
                }
            } catch (Exception e6) {
                xz2.b("ImgLayr", "Exception ", e6);
                hp4Var2 = new hp4<>("", "");
            }
            return hp4Var2;
        }
        return hp4Var;
    }

    private final void Q() {
        if (this.o != null) {
            R();
        } else if (this.p != null) {
            S();
        }
    }

    private final void R() {
        M(C());
    }

    private final void S() {
        ImageView gifView = L().getGifView();
        if (gifView == null) {
            return;
        }
        M(gifView);
    }

    private final void T() {
        I(new d43(c(), null, 0, 6, null));
        L().setSrc(this.s.toString());
        L().a();
    }

    @NotNull
    public final ImageView C() {
        ImageView imageView = this.o;
        if (imageView != null) {
            return imageView;
        }
        c25.S("imageView");
        throw null;
    }

    public final void H(@NotNull ImageView imageView) {
        c25.p(imageView, "<set-?>");
        this.o = imageView;
    }

    public final void I(@NotNull c43 c43Var) {
        c25.p(c43Var, "<set-?>");
        this.p = c43Var;
    }

    @NotNull
    public final c43 L() {
        c43 c43Var = this.p;
        if (c43Var != null) {
            return c43Var;
        }
        c25.S("gifViewer");
        throw null;
    }

    @Override // com.p7700g.p99005.hd3
    @Nullable
    public View o() {
        this.q = g().getStyles();
        if (J(this.t)) {
            T();
            Q();
            return L();
        }
        O();
        Q();
        return C();
    }
}