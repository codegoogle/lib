package com.p7700g.p99005;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class d43 extends c43 {
    @NotNull
    public static final a s = new a(null);
    @Nullable
    private ox5 t;
    @Nullable
    private ImageView u;
    @NotNull
    private String v;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ d43(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final ox5 b(String str) {
        return new ox5(gy4.v(new File(str)));
    }

    @Override // com.p7700g.p99005.c43
    public void a() {
        ox5 ox5Var = this.t;
        if (ox5Var == null) {
            return;
        }
        ox5Var.start();
    }

    @Nullable
    public final ox5 getGifDrawable() {
        return this.t;
    }

    @Override // com.p7700g.p99005.c43
    @Nullable
    public ImageView getGifView() {
        return this.u;
    }

    @Override // com.p7700g.p99005.c43
    @NotNull
    public String getSrc() {
        return this.v;
    }

    public final void setGifDrawable(@Nullable ox5 ox5Var) {
        this.t = ox5Var;
    }

    @Override // com.p7700g.p99005.c43
    public void setGifView(@Nullable ImageView imageView) {
        this.u = imageView;
    }

    @Override // com.p7700g.p99005.c43
    public void setSrc(@NotNull String str) {
        c25.p(str, "value");
        this.v = str;
        if (str.length() == 0) {
            return;
        }
        try {
            this.t = b(this.v);
            setGifView(new tx5(getContext()));
            ImageView gifView = getGifView();
            if (gifView != null) {
                gifView.setImageDrawable(this.t);
            }
            removeAllViews();
            addView(getGifView());
        } catch (Exception e) {
            xz2.b("GifViewerImpl", "Exception while showing gif", e);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d43(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c25.p(context, "context");
        this.v = "";
    }
}