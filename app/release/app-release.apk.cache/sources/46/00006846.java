package com.p7700g.p99005;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.util.DisplayMetrics;
import com.anchorfree.hdr.AFHydra;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ResourceUtils.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/p7700g/p99005/yz2;", "", "Landroid/content/Context;", "context", "", xg1.v, "a", "(Landroid/content/Context;I)I", "Landroid/graphics/drawable/Drawable;", "d", "(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;", "", "e", "(Landroid/content/Context;)Z", "c", "(Landroid/content/Context;)I", "b", "", "Ljava/lang/String;", "RESOURCE_TYPE_STRING", "Landroid/graphics/drawable/ShapeDrawable;", "Landroid/graphics/drawable/ShapeDrawable;", "EMPTY_DRAWABLE", AFHydra.STATUS_IDLE, "INVALID_RESOURCE", "<init>", "()V", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class yz2 {
    @NotNull
    private static final String b = "string";
    private static final int c = -1;
    @NotNull
    public static final yz2 a = new yz2();
    @NotNull
    private static final ShapeDrawable d = new ShapeDrawable();

    private yz2() {
    }

    @jz4
    public static final int a(@Nullable Context context, int i) {
        if (context == null) {
            return -1;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getResources().getColor(i, context.getTheme());
        }
        return context.getResources().getColor(i);
    }

    @jz4
    @NotNull
    public static final Drawable d(@Nullable Context context, int i) {
        if (context == null) {
            return d;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            Drawable drawable = context.getResources().getDrawable(i, context.getTheme());
            c25.o(drawable, "{\n                context.resources.getDrawable(resource, context.theme)\n            }");
            return drawable;
        }
        Drawable drawable2 = context.getResources().getDrawable(i);
        c25.o(drawable2, "{\n                context.resources.getDrawable(resource)\n            }");
        return drawable2;
    }

    public final int b(@NotNull Context context) {
        c25.p(context, "context");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return a45.J0(displayMetrics.heightPixels / displayMetrics.density);
    }

    public final int c(@NotNull Context context) {
        c25.p(context, "context");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return a45.J0(displayMetrics.widthPixels / displayMetrics.density);
    }

    public final boolean e(@NotNull Context context) {
        c25.p(context, "context");
        return context.getResources().getConfiguration().orientation == 2;
    }
}