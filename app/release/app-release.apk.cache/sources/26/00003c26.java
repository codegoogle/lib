package com.p7700g.p99005;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class c43 extends FrameLayout {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @gz4
    public c43(@NotNull Context context) {
        this(context, null, 0, 6, null);
        c25.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @gz4
    public c43(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        c25.p(context, "context");
    }

    public /* synthetic */ c43(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public abstract void a();

    @Nullable
    public abstract ImageView getGifView();

    @NotNull
    public abstract String getSrc();

    public abstract void setGifView(@Nullable ImageView imageView);

    public abstract void setSrc(@NotNull String str);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @gz4
    public c43(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c25.p(context, "context");
    }
}