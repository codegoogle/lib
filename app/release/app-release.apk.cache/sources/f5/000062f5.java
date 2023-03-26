package com.p7700g.p99005;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.greedygame.mystique2.models.ScaleType;
import com.greedygame.mystique2.models.Style;
import com.greedygame.mystique2.models.StyleType;
import com.greedygame.mystique2.models.ViewLayer;
import com.p7700g.p99005.x33;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class w33 extends FrameLayout {
    @Nullable
    private View s;
    @Nullable
    private List<Style> t;
    @Nullable
    private x33 u;

    /* loaded from: classes3.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            x33.b.values();
            int[] iArr = new int[3];
            iArr[x33.b.IMAGE.ordinal()] = 1;
            iArr[x33.b.GIF.ordinal()] = 2;
            a = iArr;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements View.OnLayoutChangeListener {
        public final /* synthetic */ ImageView a;
        public final /* synthetic */ w33 b;

        public b(ImageView imageView, w33 w33Var) {
            this.a = imageView;
            this.b = w33Var;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@Nullable View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.a.removeOnLayoutChangeListener(this);
            if (this.a.getWidth() <= 0 || this.a.getHeight() <= 0) {
                return;
            }
            x33 mediaContent = this.b.getMediaContent();
            Bitmap c = wz2.c(String.valueOf(mediaContent == null ? null : mediaContent.a()));
            this.a.setImageDrawable(this.b.c(c != null ? b43.e(c, this.a.getWidth(), this.a.getHeight()) : null));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @gz4
    public w33(@NotNull Context context) {
        this(context, null, 0, 6, null);
        c25.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @gz4
    public w33(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        c25.p(context, "context");
    }

    public /* synthetic */ w33(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jk c(Bitmap bitmap) {
        String value;
        Context context = getContext();
        c25.o(context, "context");
        Style j = j(StyleType.RADIUS);
        String str = "0";
        if (j != null && (value = j.getValue()) != null) {
            str = value;
        }
        float b2 = b43.b(context, str, 0.0f, 2, null);
        if (bitmap == null) {
            return null;
        }
        Context context2 = getContext();
        c25.o(context2, "context");
        return b43.f(bitmap, context2, b2);
    }

    private final void f(String str) {
        ImageView gifView;
        View view = this.s;
        if (view instanceof ImageView) {
            ImageView imageView = view instanceof ImageView ? (ImageView) view : null;
            if (imageView == null) {
                return;
            }
            b43.g(imageView, str);
            if (imageView.getScaleType() == ImageView.ScaleType.CENTER_CROP && k(StyleType.RADIUS)) {
                imageView.addOnLayoutChangeListener(new b(imageView, this));
            }
        } else if (view instanceof c43) {
            c43 c43Var = view instanceof c43 ? (c43) view : null;
            if (c43Var == null || (gifView = c43Var.getGifView()) == null) {
                return;
            }
            b43.g(gifView, str);
        }
    }

    private final void g() {
        View i;
        x33 x33Var = this.u;
        c25.m(x33Var);
        int i2 = a.a[x33Var.b().ordinal()];
        if (i2 != 1) {
            i = i2 != 2 ? null : h();
        } else {
            i = i();
        }
        this.s = i;
        if (i == null) {
            return;
        }
        addView(this.s, new RelativeLayout.LayoutParams(-1, -1));
    }

    private final d43 h() {
        Context context = getContext();
        c25.o(context, "context");
        d43 d43Var = new d43(context, null, 0, 6, null);
        x33 mediaContent = getMediaContent();
        d43Var.setSrc(String.valueOf(mediaContent == null ? null : mediaContent.a()));
        d43Var.a();
        return d43Var;
    }

    private final ImageView i() {
        ImageView imageView = new ImageView(getContext());
        x33 mediaContent = getMediaContent();
        Bitmap c = wz2.c(String.valueOf(mediaContent == null ? null : mediaContent.a()));
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        if (k(StyleType.RADIUS)) {
            imageView.setImageDrawable(c(c));
        } else {
            imageView.setImageBitmap(c);
        }
        return imageView;
    }

    private final Style j(StyleType styleType) {
        return ViewLayer.Companion.a(styleType, this.t);
    }

    private final boolean k(StyleType styleType) {
        return ViewLayer.Companion.b(styleType, this.t);
    }

    private final void l() {
        StyleType styleType = StyleType.SCALE_TYPE;
        if (k(styleType)) {
            Style j = j(styleType);
            f(j == null ? null : j.getValue());
        }
    }

    public void a() {
    }

    public final void d(@NotNull ImageView.ScaleType scaleType) {
        ImageView gifView;
        c25.p(scaleType, "scaleType");
        View view = this.s;
        if (view instanceof ImageView) {
            gifView = view instanceof ImageView ? (ImageView) view : null;
            if (gifView == null) {
                return;
            }
            gifView.setScaleType(scaleType);
        } else if (view instanceof c43) {
            c43 c43Var = view instanceof c43 ? (c43) view : null;
            gifView = c43Var != null ? c43Var.getGifView() : null;
            if (gifView == null) {
                return;
            }
            gifView.setScaleType(scaleType);
        }
    }

    public final void e(@NotNull ScaleType scaleType) {
        c25.p(scaleType, "scaleType");
        f(scaleType.getValue());
    }

    @Nullable
    public final x33 getMediaContent() {
        return this.u;
    }

    @Nullable
    public final List<Style> getStyles() {
        return this.t;
    }

    public final void setMediaContent(@Nullable x33 x33Var) {
        this.u = x33Var;
        if (x33Var == null) {
            return;
        }
        g();
        l();
    }

    public final void setStyles(@Nullable List<Style> list) {
        this.t = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @gz4
    public w33(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c25.p(context, "context");
    }
}