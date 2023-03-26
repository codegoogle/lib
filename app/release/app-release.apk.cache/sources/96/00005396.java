package com.p7700g.p99005;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.greedygame.mystique2.models.MediationType;
import com.greedygame.mystique2.models.Style;
import com.greedygame.mystique2.models.StyleType;
import com.greedygame.mystique2.models.Template;
import com.greedygame.mystique2.models.ViewLayer;
import com.greedygame.mystique2.models.ViewSize;
import com.p7700g.p99005.hd3;
import com.p7700g.p99005.nd3;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class o33 extends RelativeLayout {
    @NotNull
    public static final b s = new b(null);
    @NotNull
    private static final String t = "MysView";
    @Nullable
    private final f05<String, yq4> A;
    @Nullable
    private final Typeface B;
    private int C;
    private int D;
    private long E;
    private boolean F;
    @Nullable
    private ViewGroup G;
    private long H;
    private boolean I;
    @Nullable
    private FrameLayout.LayoutParams J;
    private int u;
    @Nullable
    private final Template v;
    @Nullable
    private final xx2 w;
    @Nullable
    private final gz2 x;
    @Nullable
    private q33 y;
    @Nullable
    private final MediationType z;

    /* loaded from: classes3.dex */
    public static final class a {
        @NotNull
        private final Context a;
        @Nullable
        private xx2 b;
        @Nullable
        private gz2 c;
        @Nullable
        private Template d;
        @Nullable
        private q33 e;
        @Nullable
        private MediationType f;
        private int g;
        @Nullable
        private f05<? super String, yq4> h;
        @Nullable
        private Typeface i;

        public a(@NotNull Context context) {
            c25.p(context, "context");
            this.a = context;
        }

        @NotNull
        public final a a(int i) {
            this.g = i;
            return this;
        }

        @NotNull
        public final a b(@Nullable Typeface typeface) {
            this.i = typeface;
            return this;
        }

        @NotNull
        public final a c(@NotNull xx2 xx2Var) {
            c25.p(xx2Var, "assetInterface");
            this.b = xx2Var;
            return this;
        }

        @NotNull
        public final a d(@NotNull gz2 gz2Var) {
            c25.p(gz2Var, "nativeAdAsset");
            this.c = gz2Var;
            return this;
        }

        @NotNull
        public final a e(@NotNull q33 q33Var) {
            c25.p(q33Var, "viewProcessed");
            this.e = q33Var;
            return this;
        }

        @NotNull
        public final a f(@NotNull MediationType mediationType) {
            c25.p(mediationType, "mediationType");
            this.f = mediationType;
            return this;
        }

        @NotNull
        public final a g(@NotNull Template template) {
            c25.p(template, "template");
            this.d = template;
            return this;
        }

        @NotNull
        public final a h(@Nullable f05<? super String, yq4> f05Var) {
            this.h = f05Var;
            return this;
        }

        @Nullable
        public final o33 i() {
            gz2 gz2Var;
            MediationType mediationType;
            xx2 xx2Var = this.b;
            if (xx2Var == null || (gz2Var = this.c) == null || (mediationType = this.f) == null || this.d == null || xx2Var == null || gz2Var == null || this.e == null || mediationType == null) {
                return null;
            }
            int i = this.g;
            Template template = this.d;
            c25.m(template);
            xx2 xx2Var2 = this.b;
            c25.m(xx2Var2);
            gz2 gz2Var2 = this.c;
            c25.m(gz2Var2);
            q33 q33Var = this.e;
            c25.m(q33Var);
            MediationType mediationType2 = this.f;
            c25.m(mediationType2);
            return new o33(i, template, xx2Var2, gz2Var2, q33Var, mediationType2, this.h, this.i, this.a, null, 0, 1536, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            jz2.values();
            int[] iArr = new int[3];
            iArr[jz2.CENTER.ordinal()] = 1;
            iArr[jz2.LEFT.ordinal()] = 2;
            iArr[jz2.RIGHT.ordinal()] = 3;
            a = iArr;
            kz2.values();
            int[] iArr2 = new int[3];
            iArr2[kz2.CENTER.ordinal()] = 1;
            iArr2[kz2.TOP.ordinal()] = 2;
            iArr2[kz2.BOTTOM.ordinal()] = 3;
            b = iArr2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @gz4
    public o33(int i, @Nullable Template template, @Nullable xx2 xx2Var, @Nullable gz2 gz2Var, @Nullable MediationType mediationType, @NotNull Context context) {
        this(i, template, xx2Var, gz2Var, null, mediationType, null, null, context, null, 0, 1744, null);
        c25.p(context, "viewContext");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @gz4
    public o33(int i, @Nullable Template template, @Nullable xx2 xx2Var, @Nullable gz2 gz2Var, @Nullable q33 q33Var, @Nullable MediationType mediationType, @NotNull Context context) {
        this(i, template, xx2Var, gz2Var, q33Var, mediationType, null, null, context, null, 0, 1728, null);
        c25.p(context, "viewContext");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @gz4
    public o33(int i, @Nullable Template template, @Nullable xx2 xx2Var, @Nullable gz2 gz2Var, @Nullable q33 q33Var, @Nullable MediationType mediationType, @Nullable f05<? super String, yq4> f05Var, @NotNull Context context) {
        this(i, template, xx2Var, gz2Var, q33Var, mediationType, f05Var, null, context, null, 0, 1664, null);
        c25.p(context, "viewContext");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @gz4
    public o33(int i, @Nullable Template template, @Nullable xx2 xx2Var, @Nullable gz2 gz2Var, @Nullable q33 q33Var, @Nullable MediationType mediationType, @Nullable f05<? super String, yq4> f05Var, @Nullable Typeface typeface, @NotNull Context context) {
        this(i, template, xx2Var, gz2Var, q33Var, mediationType, f05Var, typeface, context, null, 0, 1536, null);
        c25.p(context, "viewContext");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @gz4
    public o33(int i, @Nullable Template template, @Nullable xx2 xx2Var, @Nullable gz2 gz2Var, @Nullable q33 q33Var, @Nullable MediationType mediationType, @Nullable f05<? super String, yq4> f05Var, @Nullable Typeface typeface, @NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(i, template, xx2Var, gz2Var, q33Var, mediationType, f05Var, typeface, context, attributeSet, 0, 1024, null);
        c25.p(context, "viewContext");
    }

    public /* synthetic */ o33(int i, Template template, xx2 xx2Var, gz2 gz2Var, q33 q33Var, MediationType mediationType, f05 f05Var, Typeface typeface, Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, template, xx2Var, gz2Var, (i3 & 16) != 0 ? null : q33Var, mediationType, (i3 & 64) != 0 ? null : f05Var, (i3 & 128) != 0 ? null : typeface, context, (i3 & 512) != 0 ? null : attributeSet, (i3 & 1024) != 0 ? 0 : i2);
    }

    private final hp4<Integer, Integer> A(float f) {
        if (f == -1.0f) {
            this.F = true;
            return new hp4<>(Integer.valueOf(this.u), -2);
        }
        int i = this.u;
        this.F = true;
        return new hp4<>(Integer.valueOf(i), Integer.valueOf((int) (i / f)));
    }

    private final int B(RelativeLayout relativeLayout, String str) {
        if (c25.g(str, ViewSize.WRAP.getValue())) {
            return -2;
        }
        if (c25.g(str, ViewSize.MATCH_PARENT.getValue())) {
            return -1;
        }
        if (b95.u2(str, "@", false, 2, null)) {
            Integer X0 = a95.X0(c95.c4(str, "@"));
            if (X0 == null) {
                return -2;
            }
            X0.intValue();
            return (int) TypedValue.applyDimension(1, X0.intValue(), getContext().getResources().getDisplayMetrics());
        }
        Integer X02 = a95.X0(str);
        if (X02 == null) {
            return -2;
        }
        return (X02.intValue() * relativeLayout.getLayoutParams().height) / 100;
    }

    private final Integer C(String str) {
        Template template = this.v;
        List<ViewLayer> views = template == null ? null : template.getViews();
        c25.m(views);
        for (ViewLayer viewLayer : views) {
            if (c25.g(viewLayer.getId(), str)) {
                return viewLayer.getViewId();
            }
        }
        return null;
    }

    private final int D(RelativeLayout relativeLayout, String str) {
        if (c25.g(str, ViewSize.WRAP.getValue())) {
            return -2;
        }
        if (c25.g(str, ViewSize.MATCH_PARENT.getValue())) {
            return -1;
        }
        if (b95.u2(str, "@", false, 2, null)) {
            Integer X0 = a95.X0(c95.c4(str, "@"));
            if (X0 == null) {
                return -2;
            }
            X0.intValue();
            return (int) TypedValue.applyDimension(1, X0.intValue(), getContext().getResources().getDisplayMetrics());
        }
        Integer X02 = a95.X0(str);
        if (X02 == null) {
            return -2;
        }
        return (X02.intValue() * relativeLayout.getLayoutParams().width) / 100;
    }

    private final ImageView F(View view) {
        if (view instanceof ImageView) {
            return (ImageView) view;
        }
        if (view instanceof c43) {
            return ((c43) view).getGifView();
        }
        return null;
    }

    private final View H() {
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        Template template = this.v;
        c25.m(template);
        hp4<Integer, Integer> y = y(template);
        if (y.m().intValue() == 0 && y.n().intValue() == 0) {
            addView(new FrameLayout(getContext()));
            return I(this, relativeLayout);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(y.m().intValue(), y.n().intValue());
        layoutParams.addRule(13, -1);
        relativeLayout.setLayoutParams(layoutParams);
        int i = 1;
        StringBuilder G = wo1.G("W: ");
        G.append(y.m().intValue());
        G.append(" H: ");
        G.append(y.n().intValue());
        xz2.c(t, G.toString());
        Bitmap icon = getIcon();
        hz2 b2 = icon == null ? null : cz2.b(icon);
        hz2 hz2Var = b2 == null ? new hz2(0, 0, null, null, 15, null) : b2;
        this.D = hz2Var.h();
        List<ViewLayer> views = this.v.getViews();
        c25.m(views);
        for (ViewLayer viewLayer : views) {
            String[] strArr = new String[i];
            strArr[0] = c25.C("Currently processing ", viewLayer.getType());
            xz2.c(t, strArr);
            Context context = getContext();
            c25.o(context, "context");
            hd3.a aVar = new hd3.a(context);
            xx2 xx2Var = this.w;
            c25.m(xx2Var);
            hd3.a k = aVar.c(xx2Var).g(viewLayer).k(y);
            gz2 gz2Var = this.x;
            c25.m(gz2Var);
            hd3.a d = k.d(gz2Var);
            MediationType mediationType = this.z;
            c25.m(mediationType);
            hd3 r = d.f(mediationType).h(this.A).e(hz2Var).b(this.B).r();
            View n = r == null ? null : r.n();
            if (n != null) {
                my2.c(n);
                viewLayer.setViewId(Integer.valueOf(n.getId()));
                if (n.getTag() == null) {
                    n.setTag(viewLayer.getNativeAdView());
                }
                int D = D(relativeLayout, viewLayer.getWidth());
                int B = B(relativeLayout, viewLayer.getHeight());
                ImageView F = F(n);
                if (F != null) {
                    l(relativeLayout, F, viewLayer);
                }
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(D, B);
                String[] strArr2 = new String[i];
                StringBuilder G2 = wo1.G("Layer: ");
                G2.append((Object) viewLayer.getType());
                G2.append(" w: ");
                G2.append(layoutParams2.width);
                G2.append(" h: ");
                G2.append(layoutParams2.height);
                strArr2[0] = G2.toString();
                xz2.c(t, strArr2);
                if (viewLayer.getStyles() != null) {
                    List<Style> styles = viewLayer.getStyles();
                    c25.m(styles);
                    v(viewLayer, styles, layoutParams2, relativeLayout, n);
                }
                relativeLayout.addView(n, layoutParams2);
                i = 1;
            }
        }
        return I(this, relativeLayout);
    }

    private static final View I(o33 o33Var, RelativeLayout relativeLayout) {
        List<Style> styles;
        yq4 yq4Var;
        Template template = o33Var.v;
        if (template == null || (styles = template.getStyles()) == null) {
            yq4Var = null;
        } else {
            o33Var.setViewLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            o33Var.u(relativeLayout, styles);
            yq4Var = yq4.a;
        }
        if (yq4Var == null) {
            xz2.c(t, "No root view style.");
        }
        nd3.a aVar = nd3.b;
        Template template2 = o33Var.v;
        c25.m(template2);
        MediationType mediationType = o33Var.z;
        c25.m(mediationType);
        nd3 a2 = aVar.a(template2, mediationType);
        ViewGroup b2 = a2 != null ? a2.b(relativeLayout) : null;
        o33Var.G = b2;
        if (b2 != null) {
            b2.addView(relativeLayout);
        }
        ViewGroup viewGroup = o33Var.G;
        return viewGroup == null ? relativeLayout : viewGroup;
    }

    private final void J() {
        TextView textView = new TextView(getContext());
        long currentTimeMillis = System.currentTimeMillis() - this.H;
        this.E = currentTimeMillis;
        if (xz2.e) {
            textView.setText(gl4.R + currentTimeMillis + " ms ");
            textView.setTextColor(yz2.a(getContext(), 17170443));
            textView.setBackgroundColor(yz2.a(getContext(), 17170444));
            textView.setTextSize(2, 10.0f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(10, -1);
            layoutParams.addRule(21, -1);
            addView(textView, layoutParams);
        }
    }

    private final void b(RelativeLayout.LayoutParams layoutParams, String str, RelativeLayout relativeLayout) {
        int intValue;
        if (b95.u2(str, "@", false, 2, null)) {
            Context context = getContext();
            c25.o(context, "context");
            intValue = b43.d(context, str, 0, 2, null);
        } else if (relativeLayout == null) {
            return;
        } else {
            Integer X0 = a95.X0(str);
            Integer valueOf = X0 != null ? Integer.valueOf((X0.intValue() * relativeLayout.getLayoutParams().height) / 100) : null;
            if (valueOf == null) {
                xz2.c(t, "Margin Bottom is not a valid integer");
                Integer num = 0;
                intValue = num.intValue();
            } else {
                intValue = valueOf.intValue();
            }
        }
        layoutParams.bottomMargin = intValue;
    }

    public static /* synthetic */ void c(o33 o33Var, RelativeLayout.LayoutParams layoutParams, String str, RelativeLayout relativeLayout, int i, Object obj) {
        if ((i & 4) != 0) {
            relativeLayout = null;
        }
        o33Var.b(layoutParams, str, relativeLayout);
    }

    private final void d(RelativeLayout.LayoutParams layoutParams, String str, RelativeLayout relativeLayout) {
        int intValue;
        if (b95.u2(str, "@", false, 2, null)) {
            Context context = getContext();
            c25.o(context, "context");
            intValue = b43.d(context, str, 0, 2, null);
        } else if (relativeLayout == null) {
            return;
        } else {
            Integer X0 = a95.X0(str);
            Integer valueOf = X0 != null ? Integer.valueOf((X0.intValue() * relativeLayout.getLayoutParams().width) / 100) : null;
            if (valueOf == null) {
                xz2.c(t, "Margin left is not a valid integer");
                Integer num = 0;
                intValue = num.intValue();
            } else {
                intValue = valueOf.intValue();
            }
        }
        layoutParams.setMarginStart(intValue);
    }

    public static /* synthetic */ void e(o33 o33Var, RelativeLayout.LayoutParams layoutParams, String str, RelativeLayout relativeLayout, int i, Object obj) {
        if ((i & 4) != 0) {
            relativeLayout = null;
        }
        o33Var.d(layoutParams, str, relativeLayout);
    }

    private final void f(RelativeLayout.LayoutParams layoutParams, String str, RelativeLayout relativeLayout) {
        int intValue;
        if (b95.u2(str, "@", false, 2, null)) {
            Context context = getContext();
            c25.o(context, "context");
            intValue = b43.d(context, str, 0, 2, null);
        } else if (relativeLayout == null) {
            return;
        } else {
            Integer X0 = a95.X0(str);
            Integer valueOf = X0 != null ? Integer.valueOf((X0.intValue() * relativeLayout.getLayoutParams().width) / 100) : null;
            if (valueOf == null) {
                xz2.c(t, "Margin right is not a valid integer");
                Integer num = 0;
                intValue = num.intValue();
            } else {
                intValue = valueOf.intValue();
            }
        }
        layoutParams.setMarginEnd(intValue);
    }

    public static /* synthetic */ void g(o33 o33Var, RelativeLayout.LayoutParams layoutParams, String str, RelativeLayout relativeLayout, int i, Object obj) {
        if ((i & 4) != 0) {
            relativeLayout = null;
        }
        o33Var.f(layoutParams, str, relativeLayout);
    }

    private final Bitmap getIcon() {
        gz2 gz2Var = this.x;
        Uri uri = null;
        String e = gz2Var == null ? null : gz2Var.e();
        xx2 xx2Var = this.w;
        if (xx2Var != null) {
            if (e == null) {
                e = "";
            }
            uri = xx2Var.b(e);
        }
        return BitmapFactory.decodeFile(String.valueOf(uri));
    }

    private final void h(RelativeLayout.LayoutParams layoutParams, String str, RelativeLayout relativeLayout) {
        int intValue;
        if (b95.u2(str, "@", false, 2, null)) {
            Context context = getContext();
            c25.o(context, "context");
            intValue = b43.d(context, str, 0, 2, null);
        } else if (relativeLayout == null) {
            return;
        } else {
            Integer X0 = a95.X0(str);
            Integer valueOf = X0 != null ? Integer.valueOf((X0.intValue() * relativeLayout.getLayoutParams().height) / 100) : null;
            if (valueOf == null) {
                xz2.c(t, "Margin Top is not a valid integer");
                Integer num = 0;
                intValue = num.intValue();
            } else {
                intValue = valueOf.intValue();
            }
        }
        layoutParams.topMargin = intValue;
    }

    public static /* synthetic */ void i(o33 o33Var, RelativeLayout.LayoutParams layoutParams, String str, RelativeLayout relativeLayout, int i, Object obj) {
        if ((i & 4) != 0) {
            relativeLayout = null;
        }
        o33Var.h(layoutParams, str, relativeLayout);
    }

    private final int j(String str, RelativeLayout relativeLayout) {
        if (b95.u2(str, "@", false, 2, null)) {
            Context context = getContext();
            c25.o(context, "context");
            return b43.d(context, str, 0, 2, null);
        }
        return (Integer.parseInt(str) * relativeLayout.getLayoutParams().height) / 100;
    }

    private final int k(String str, RelativeLayout relativeLayout) {
        if (b95.u2(str, "@", false, 2, null)) {
            Context context = getContext();
            c25.o(context, "context");
            return b43.d(context, str, 0, 2, null);
        }
        return (Integer.parseInt(str) * relativeLayout.getLayoutParams().width) / 100;
    }

    private final void l(RelativeLayout relativeLayout, ImageView imageView, ViewLayer viewLayer) {
        String value;
        String value2;
        Style style = viewLayer.getStyle(StyleType.MAX_WIDTH);
        if (style != null && (value2 = style.getValue()) != null) {
            imageView.setMaxWidth(k(value2, relativeLayout));
        }
        Style style2 = viewLayer.getStyle(StyleType.MAX_HEIGHT);
        if (style2 == null || (value = style2.getValue()) == null) {
            return;
        }
        imageView.setMaxHeight(j(value, relativeLayout));
    }

    private final int m(String str, RelativeLayout relativeLayout) {
        if (b95.u2(str, "@", false, 2, null)) {
            Context context = getContext();
            c25.o(context, "context");
            return b43.d(context, str, 0, 2, null);
        } else if (relativeLayout == null) {
            return 0;
        } else {
            Integer X0 = a95.X0(str);
            Integer valueOf = X0 != null ? Integer.valueOf((X0.intValue() * relativeLayout.getLayoutParams().height) / 100) : null;
            if (valueOf == null) {
                xz2.c(t, "Padding Bottom is not a valid integer");
                return 0;
            }
            return valueOf.intValue();
        }
    }

    public static /* synthetic */ int n(o33 o33Var, String str, RelativeLayout relativeLayout, int i, Object obj) {
        if ((i & 2) != 0) {
            relativeLayout = null;
        }
        return o33Var.m(str, relativeLayout);
    }

    private final int o(String str, RelativeLayout relativeLayout) {
        if (b95.u2(str, "@", false, 2, null)) {
            Context context = getContext();
            c25.o(context, "context");
            return b43.d(context, str, 0, 2, null);
        } else if (relativeLayout == null) {
            return 0;
        } else {
            Integer X0 = a95.X0(str);
            Integer valueOf = X0 != null ? Integer.valueOf((X0.intValue() * relativeLayout.getLayoutParams().width) / 100) : null;
            if (valueOf == null) {
                xz2.c(t, "Padding left is not a valid integer");
                return 0;
            }
            return valueOf.intValue();
        }
    }

    public static /* synthetic */ int p(o33 o33Var, String str, RelativeLayout relativeLayout, int i, Object obj) {
        if ((i & 2) != 0) {
            relativeLayout = null;
        }
        return o33Var.o(str, relativeLayout);
    }

    private final int q(String str, RelativeLayout relativeLayout) {
        if (b95.u2(str, "@", false, 2, null)) {
            Context context = getContext();
            c25.o(context, "context");
            return b43.d(context, str, 0, 2, null);
        } else if (relativeLayout == null) {
            return 0;
        } else {
            Integer X0 = a95.X0(str);
            Integer valueOf = X0 != null ? Integer.valueOf((X0.intValue() * relativeLayout.getLayoutParams().width) / 100) : null;
            if (valueOf == null) {
                xz2.c(t, "Padding right is not a valid integer");
                return 0;
            }
            return valueOf.intValue();
        }
    }

    public static /* synthetic */ int r(o33 o33Var, String str, RelativeLayout relativeLayout, int i, Object obj) {
        if ((i & 2) != 0) {
            relativeLayout = null;
        }
        return o33Var.q(str, relativeLayout);
    }

    private final int s(String str, RelativeLayout relativeLayout) {
        if (b95.u2(str, "@", false, 2, null)) {
            Context context = getContext();
            c25.o(context, "context");
            return b43.d(context, str, 0, 2, null);
        } else if (relativeLayout == null) {
            return 0;
        } else {
            Integer X0 = a95.X0(str);
            Integer valueOf = X0 != null ? Integer.valueOf((X0.intValue() * relativeLayout.getLayoutParams().height) / 100) : null;
            if (valueOf == null) {
                xz2.c(t, "Padding Top is not a valid integer");
                return 0;
            }
            return valueOf.intValue();
        }
    }

    public static /* synthetic */ int t(o33 o33Var, String str, RelativeLayout relativeLayout, int i, Object obj) {
        if ((i & 2) != 0) {
            relativeLayout = null;
        }
        return o33Var.s(str, relativeLayout);
    }

    /* JADX WARN: Removed duplicated region for block: B:241:0x0347 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0320 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void u(View view, List<Style> list) {
        FrameLayout.LayoutParams viewLayoutParams;
        FrameLayout.LayoutParams viewLayoutParams2;
        FrameLayout.LayoutParams layoutParams;
        FrameLayout.LayoutParams layoutParams2;
        FrameLayout.LayoutParams viewLayoutParams3;
        FrameLayout.LayoutParams viewLayoutParams4;
        Object obj;
        int i;
        for (Style style : list) {
            String key = style.getKey();
            boolean z = true;
            if (c25.g(key, StyleType.XALIGN.getValue())) {
                String value = style.getValue();
                if (value != null) {
                    int i2 = c.a[jz2.s.a(value).ordinal()];
                    if (i2 == 1) {
                        FrameLayout.LayoutParams viewLayoutParams5 = getViewLayoutParams();
                        if (viewLayoutParams5 != null) {
                            FrameLayout.LayoutParams viewLayoutParams6 = getViewLayoutParams();
                            viewLayoutParams5.gravity = (viewLayoutParams6 != null ? Integer.valueOf(viewLayoutParams6.gravity | 1) : null).intValue();
                        }
                    } else if (i2 == 2) {
                        FrameLayout.LayoutParams viewLayoutParams7 = getViewLayoutParams();
                        if (viewLayoutParams7 != null) {
                            FrameLayout.LayoutParams viewLayoutParams8 = getViewLayoutParams();
                            viewLayoutParams7.gravity = (viewLayoutParams8 != null ? Integer.valueOf(viewLayoutParams8.gravity | nq.b) : null).intValue();
                        }
                    } else if (i2 == 3 && (viewLayoutParams = getViewLayoutParams()) != null) {
                        FrameLayout.LayoutParams viewLayoutParams9 = getViewLayoutParams();
                        viewLayoutParams.gravity = (viewLayoutParams9 != null ? Integer.valueOf(viewLayoutParams9.gravity | nq.c) : null).intValue();
                    }
                }
            } else if (c25.g(key, StyleType.YALIGN.getValue())) {
                String value2 = style.getValue();
                if (value2 != null) {
                    int i3 = c.b[kz2.s.a(value2).ordinal()];
                    if (i3 == 1) {
                        FrameLayout.LayoutParams viewLayoutParams10 = getViewLayoutParams();
                        if (viewLayoutParams10 != null) {
                            FrameLayout.LayoutParams viewLayoutParams11 = getViewLayoutParams();
                            viewLayoutParams10.gravity = (viewLayoutParams11 != null ? Integer.valueOf(viewLayoutParams11.gravity | 16) : null).intValue();
                        }
                    } else if (i3 == 2) {
                        FrameLayout.LayoutParams viewLayoutParams12 = getViewLayoutParams();
                        if (viewLayoutParams12 != null) {
                            FrameLayout.LayoutParams viewLayoutParams13 = getViewLayoutParams();
                            viewLayoutParams12.gravity = (viewLayoutParams13 != null ? Integer.valueOf(viewLayoutParams13.gravity | 48) : null).intValue();
                        }
                    } else if (i3 == 3 && (viewLayoutParams2 = getViewLayoutParams()) != null) {
                        FrameLayout.LayoutParams viewLayoutParams14 = getViewLayoutParams();
                        viewLayoutParams2.gravity = (viewLayoutParams14 != null ? Integer.valueOf(viewLayoutParams14.gravity | 80) : null).intValue();
                    }
                }
            } else if (c25.g(key, StyleType.MARGIN_TOP.getValue())) {
                String value3 = style.getValue();
                if (value3 != null && value3.length() != 0) {
                    z = false;
                }
                if (!z && (layoutParams = this.J) != null) {
                    Context context = getContext();
                    c25.o(context, "context");
                    layoutParams.topMargin = b43.d(context, style.getValue(), 0, 2, null);
                }
            } else if (c25.g(key, StyleType.MARGIN_BOTTOM.getValue())) {
                String value4 = style.getValue();
                if (value4 != null && value4.length() != 0) {
                    z = false;
                }
                if (!z && (layoutParams2 = this.J) != null) {
                    Context context2 = getContext();
                    c25.o(context2, "context");
                    layoutParams2.bottomMargin = b43.d(context2, style.getValue(), 0, 2, null);
                }
            } else if (c25.g(key, StyleType.MARGIN_LEFT.getValue())) {
                if (style.getValue() != null && (viewLayoutParams3 = getViewLayoutParams()) != null) {
                    Context context3 = getContext();
                    c25.o(context3, "context");
                    viewLayoutParams3.setMarginStart(b43.d(context3, style.getValue(), 0, 2, null));
                }
            } else if (c25.g(key, StyleType.MARGIN_RIGHT.getValue())) {
                if (style.getValue() != null && (viewLayoutParams4 = getViewLayoutParams()) != null) {
                    Context context4 = getContext();
                    c25.o(context4, "context");
                    viewLayoutParams4.setMarginEnd(b43.d(context4, style.getValue(), 0, 2, null));
                }
            } else if (c25.g(key, StyleType.LEFT_PADDING.getValue())) {
                String value5 = style.getValue();
                if (value5 != null && value5.length() != 0) {
                    z = false;
                }
                if (!z) {
                    view.setPadding(p(this, style.getValue(), null, 2, null), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
                }
            } else if (c25.g(key, StyleType.TOP_PADDING.getValue())) {
                String value6 = style.getValue();
                if (value6 != null && value6.length() != 0) {
                    z = false;
                }
                if (!z) {
                    view.setPadding(view.getPaddingLeft(), t(this, style.getValue(), null, 2, null), view.getPaddingRight(), view.getPaddingBottom());
                }
            } else if (c25.g(key, StyleType.RIGHT_PADDING.getValue())) {
                String value7 = style.getValue();
                if (value7 != null && value7.length() != 0) {
                    z = false;
                }
                if (!z) {
                    view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), r(this, style.getValue(), null, 2, null), view.getPaddingBottom());
                }
            } else if (c25.g(key, StyleType.BOTTOM_PADDING.getValue())) {
                String value8 = style.getValue();
                if (value8 != null && value8.length() != 0) {
                    z = false;
                }
                if (!z) {
                    view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), n(this, style.getValue(), null, 2, null));
                }
            } else if (c25.g(key, StyleType.BGCOLOR.getValue())) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (c25.g(((Style) obj).getKey(), StyleType.RADIUS.getValue())) {
                        break;
                    }
                }
                Style style2 = (Style) obj;
                String value9 = style.getValue();
                if (value9 != null && value9.length() != 0) {
                    z = false;
                }
                if (!z) {
                    if (c25.g(style.getValue(), "{dynamic}")) {
                        i = this.D;
                    } else {
                        try {
                            i = Color.parseColor(style.getValue());
                        } catch (Exception unused) {
                        }
                    }
                    if (style2 == null) {
                        Context context5 = getContext();
                        c25.o(context5, "context");
                        String value10 = style2.getValue();
                        if (value10 == null) {
                            value10 = "0";
                        }
                        float b2 = b43.b(context5, value10, 0.0f, 2, null);
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setShape(0);
                        gradientDrawable.setColor(i);
                        gradientDrawable.setCornerRadius(b2);
                        view.setBackground(gradientDrawable);
                    } else {
                        view.setBackgroundColor(i);
                    }
                }
                i = 0;
                if (style2 == null) {
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:290:0x0372 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0346 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void v(ViewLayer viewLayer, List<Style> list, RelativeLayout.LayoutParams layoutParams, RelativeLayout relativeLayout, View view) {
        Float J0;
        Integer C;
        Integer C2;
        Integer C3;
        Integer C4;
        int i;
        String value;
        Float J02;
        for (Style style : list) {
            String key = style.getKey();
            if (c25.g(key, StyleType.Z_INDEX.getValue())) {
                String value2 = style.getValue();
                if (value2 != null && value2.length() != 0) {
                    r3 = false;
                }
                if (!r3 && (J0 = z85.J0(style.getValue())) != null) {
                    view.setElevation(J0.floatValue());
                    yq4 yq4Var = yq4.a;
                }
            } else if (c25.g(key, StyleType.TO_LEFT_OF.getValue())) {
                String value3 = style.getValue();
                if (!(value3 == null || value3.length() == 0)) {
                    String value4 = style.getValue();
                    if ((value4.length() > 0) && (C = C(value4)) != null) {
                        layoutParams.addRule(0, C.intValue());
                        yq4 yq4Var2 = yq4.a;
                    }
                }
            } else if (c25.g(key, StyleType.ABOVE.getValue())) {
                String value5 = style.getValue();
                if (!(value5 == null || value5.length() == 0)) {
                    String value6 = style.getValue();
                    if ((value6.length() > 0) && (C2 = C(value6)) != null) {
                        layoutParams.addRule(2, C2.intValue());
                        yq4 yq4Var3 = yq4.a;
                    }
                }
            } else if (c25.g(key, StyleType.TO_RIGHT_OF.getValue())) {
                String value7 = style.getValue();
                if (!(value7 == null || value7.length() == 0)) {
                    String value8 = style.getValue();
                    if ((value8.length() > 0 ? 1 : 0) != 0 && (C3 = C(value8)) != null) {
                        layoutParams.addRule(1, C3.intValue());
                        yq4 yq4Var4 = yq4.a;
                    }
                }
            } else if (c25.g(key, StyleType.BELOW.getValue())) {
                String value9 = style.getValue();
                if (!(value9 == null || value9.length() == 0)) {
                    String value10 = style.getValue();
                    if ((value10.length() > 0) && (C4 = C(value10)) != null) {
                        layoutParams.addRule(3, C4.intValue());
                        yq4 yq4Var5 = yq4.a;
                    }
                }
            } else if (c25.g(key, StyleType.XALIGN.getValue())) {
                String value11 = style.getValue();
                if (value11 != null) {
                    w(value11, layoutParams);
                    yq4 yq4Var6 = yq4.a;
                }
            } else if (c25.g(key, StyleType.YALIGN.getValue())) {
                String value12 = style.getValue();
                if (value12 != null) {
                    x(value12, layoutParams);
                    yq4 yq4Var7 = yq4.a;
                }
            } else if (c25.g(key, StyleType.MARGIN_TOP.getValue())) {
                String value13 = style.getValue();
                if (value13 != null && value13.length() != 0) {
                    r3 = false;
                }
                if (!r3) {
                    h(layoutParams, style.getValue(), relativeLayout);
                }
            } else if (c25.g(key, StyleType.MARGIN_BOTTOM.getValue())) {
                String value14 = style.getValue();
                if (value14 != null && value14.length() != 0) {
                    r3 = false;
                }
                if (!r3) {
                    b(layoutParams, style.getValue(), relativeLayout);
                }
            } else if (c25.g(key, StyleType.MARGIN_LEFT.getValue())) {
                String value15 = style.getValue();
                if (value15 != null) {
                    d(layoutParams, value15, relativeLayout);
                    yq4 yq4Var8 = yq4.a;
                }
            } else if (c25.g(key, StyleType.MARGIN_RIGHT.getValue())) {
                String value16 = style.getValue();
                if (value16 != null) {
                    f(layoutParams, value16, relativeLayout);
                    yq4 yq4Var9 = yq4.a;
                }
            } else if (c25.g(key, StyleType.LEFT_PADDING.getValue())) {
                String value17 = style.getValue();
                if (value17 != null && value17.length() != 0) {
                    r3 = false;
                }
                if (!r3) {
                    view.setPadding(o(style.getValue(), relativeLayout), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
                }
            } else if (c25.g(key, StyleType.TOP_PADDING.getValue())) {
                String value18 = style.getValue();
                if (value18 != null && value18.length() != 0) {
                    r3 = false;
                }
                if (!r3) {
                    view.setPadding(view.getPaddingLeft(), s(style.getValue(), relativeLayout), view.getPaddingRight(), view.getPaddingBottom());
                }
            } else if (c25.g(key, StyleType.RIGHT_PADDING.getValue())) {
                String value19 = style.getValue();
                if (value19 != null && value19.length() != 0) {
                    r3 = false;
                }
                if (!r3) {
                    view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), q(style.getValue(), relativeLayout), view.getPaddingBottom());
                }
            } else if (c25.g(key, StyleType.BOTTOM_PADDING.getValue())) {
                String value20 = style.getValue();
                if (value20 != null && value20.length() != 0) {
                    r3 = false;
                }
                if (!r3) {
                    view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), m(style.getValue(), relativeLayout));
                }
            } else if (c25.g(key, StyleType.VISIBILITY.getValue())) {
                String value21 = style.getValue();
                if (value21 != null && value21.length() != 0) {
                    r3 = false;
                }
                if (!r3) {
                    view.setVisibility(Boolean.parseBoolean(style.getValue()) ? 0 : 8);
                }
            } else if (c25.g(key, StyleType.BGCOLOR.getValue())) {
                Style style2 = viewLayer.getStyle(StyleType.RADIUS);
                String value22 = style.getValue();
                if (value22 != null && value22.length() != 0) {
                    r3 = false;
                }
                if (!r3) {
                    if (c25.g(style.getValue(), "{dynamic}")) {
                        if (c25.g(viewLayer.getUse(), "{cta}")) {
                            i = this.D;
                        } else {
                            i = this.C;
                        }
                    } else {
                        try {
                            i = Color.parseColor(style.getValue());
                        } catch (Exception unused) {
                        }
                    }
                    if (style2 == null) {
                        Context context = getContext();
                        c25.o(context, "context");
                        String value23 = style2.getValue();
                        if (value23 == null) {
                            value23 = "0";
                        }
                        float b2 = b43.b(context, value23, 0.0f, 2, null);
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setShape(0);
                        gradientDrawable.setColor(i);
                        gradientDrawable.setCornerRadius(b2);
                        yq4 yq4Var10 = yq4.a;
                        view.setBackground(gradientDrawable);
                    } else {
                        view.setBackgroundColor(i);
                    }
                }
                i = 0;
                if (style2 == null) {
                }
            } else {
                StyleType styleType = StyleType.OPACITY;
                if (c25.g(key, styleType.getValue())) {
                    Style style3 = viewLayer.getStyle(styleType);
                    float f = 1.0f;
                    if (style3 != null && (value = style3.getValue()) != null && (J02 = z85.J0(value)) != null) {
                        f = J02.floatValue();
                    }
                    view.setAlpha(f);
                }
            }
        }
    }

    private final void w(String str, RelativeLayout.LayoutParams layoutParams) {
        int i = c.a[jz2.s.a(str).ordinal()];
        if (i == 1) {
            layoutParams.addRule(14, -1);
        } else if (i == 2) {
            layoutParams.addRule(20, -1);
        } else if (i != 3) {
        } else {
            layoutParams.addRule(21, -1);
        }
    }

    private final void x(String str, RelativeLayout.LayoutParams layoutParams) {
        int i = c.b[kz2.s.a(str).ordinal()];
        if (i == 1) {
            layoutParams.addRule(15, -1);
        } else if (i == 2) {
            layoutParams.addRule(10, -1);
        } else if (i != 3) {
        } else {
            layoutParams.addRule(12, -1);
        }
    }

    private final hp4<Integer, Integer> y(Template template) {
        int width;
        xz2.c(t, c25.C("Template Info ", template));
        ViewParent parent = getParent();
        if (parent != null && (width = ((ViewGroup) parent).getWidth()) > 0) {
            this.u = width;
        }
        xz2.c(t, c25.C("Parent Width ", Integer.valueOf(this.u)));
        if (template.getHeight() != null && template.getWidth() != null) {
            return z(template.getWidth(), template.getHeight());
        }
        if (template.getRatio() != null) {
            return A(template.getRatio().floatValue());
        }
        return new hp4<>(0, 0);
    }

    private final hp4<Integer, Integer> z(String str, String str2) {
        Float J0;
        int applyDimension;
        Float J02;
        ViewSize viewSize = ViewSize.MATCH_PARENT;
        int i = -1;
        if (c25.g(str, viewSize.getValue())) {
            applyDimension = -1;
        } else {
            applyDimension = (c25.g(str, ViewSize.WRAP.getValue()) || (J0 = z85.J0(str)) == null) ? -2 : (int) TypedValue.applyDimension(1, J0.floatValue(), getContext().getResources().getDisplayMetrics());
        }
        if (!c25.g(str2, viewSize.getValue())) {
            i = (c25.g(str2, ViewSize.WRAP.getValue()) || (J02 = z85.J0(str2)) == null) ? -2 : (int) TypedValue.applyDimension(1, J02.floatValue(), getContext().getResources().getDisplayMetrics());
        }
        this.F = true;
        return new hp4<>(Integer.valueOf(applyDimension), Integer.valueOf(i));
    }

    public final boolean E() {
        return this.I;
    }

    public final void G() {
        xz2.c(t, c25.C("Is View Already Processed ", Boolean.valueOf(this.F)));
        this.H = System.currentTimeMillis();
        removeAllViews();
        View H = H();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        addView(H, layoutParams);
        J();
        q33 q33Var = this.y;
        if (q33Var != null) {
            q33Var.a(this);
        }
        this.y = null;
    }

    public void a() {
    }

    public final int getDominantColor() {
        return this.D;
    }

    @Nullable
    public final ViewGroup getNativeAdView() {
        return this.G;
    }

    public final long getTimeTaken() {
        return this.E;
    }

    @Nullable
    public final FrameLayout.LayoutParams getViewLayoutParams() {
        return this.J;
    }

    public final void setDominantColor(int i) {
        this.D = i;
    }

    public final void setNativeAdView(@Nullable ViewGroup viewGroup) {
        this.G = viewGroup;
    }

    public final void setTimeTaken(long j) {
        this.E = j;
    }

    public final void setViewLayoutParams(@Nullable FrameLayout.LayoutParams layoutParams) {
        this.J = layoutParams;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @gz4
    public o33(int i, @Nullable Template template, @Nullable xx2 xx2Var, @Nullable gz2 gz2Var, @Nullable q33 q33Var, @Nullable MediationType mediationType, @Nullable f05<? super String, yq4> f05Var, @Nullable Typeface typeface, @NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        c25.p(context, "viewContext");
        this.u = i;
        this.v = template;
        this.w = xx2Var;
        this.x = gz2Var;
        this.y = q33Var;
        this.z = mediationType;
        this.A = f05Var;
        this.B = typeface;
        this.C = Color.parseColor("#262625");
        this.D = sr.t;
        this.E = -1L;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o33(@NotNull ViewGroup viewGroup, @NotNull q33 q33Var, @NotNull MediationType mediationType, long j) {
        this(0, null, null, null, q33Var, mediationType, null, null, r9, null, 0, 1536, null);
        ViewGroup viewGroup2 = viewGroup;
        c25.p(viewGroup2, "viewToWrap");
        c25.p(q33Var, "viewProcessed");
        c25.p(mediationType, "mediationType");
        Context context = viewGroup.getContext();
        c25.o(context, "viewToWrap.context");
        this.I = true;
        this.H = j;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        this.H = System.currentTimeMillis();
        ld3 a2 = ld3.a.a(mediationType);
        ViewGroup a3 = a2 == null ? null : a2.a(viewGroup2);
        this.G = a3;
        if (a3 != null) {
            a3.addView(viewGroup2);
        }
        ViewGroup viewGroup3 = this.G;
        addView(viewGroup3 != null ? viewGroup3 : viewGroup2, layoutParams);
        J();
        q33Var.a(this);
    }
}