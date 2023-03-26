package com.p7700g.p99005;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.util.DisplayMetrics;
import com.anchorfree.hdr.AFHydra;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DisplayHelper.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b#\u0010$J!\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\t\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\u0007J)\u0010\r\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\nJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u00162\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR\u0016\u0010 \u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001eR\u0016\u0010!\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u001cR\u0016\u0010\"\u001a\u00020\u00198\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u001a¨\u0006%"}, d2 = {"Lcom/p7700g/p99005/dy2;", "", "Landroid/content/Context;", "context", "", "px", "e", "(Landroid/content/Context;F)F", "thresholdDensity", "f", "(Landroid/content/Context;FF)F", "dp", "b", "c", "", "d", "()I", "sp", "h", "(FLandroid/content/Context;)I", "a", "(FLandroid/content/Context;F)I", "Lcom/p7700g/p99005/yq4;", com.anythink.basead.d.g.i, "(Landroid/content/Context;)V", "", "Ljava/lang/String;", "ADDING_TRANSPARENCY", "F", "screenDensity", AFHydra.STATUS_IDLE, "screenHeight", "screenWidth", "ENGAGEMENT_WINDOW_DIM", "TAG", "<init>", "()V", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class dy2 {
    @NotNull
    public static final String b = "DisHlpr";
    private static final float c = 0.51f;
    @NotNull
    private static final String d = "000000";
    @NotNull
    public static final dy2 a = new dy2();
    @cz4
    public static int e = -1;
    @cz4
    public static float f = -1.0f;
    @cz4
    public static int g = -1;

    private dy2() {
    }

    @jz4
    public static final int a(float f2, @Nullable Context context, float f3) {
        if (context != null) {
            return (int) (Math.min(context.getResources().getDisplayMetrics().scaledDensity, f3) * f2);
        }
        return 0;
    }

    @jz4
    public static final float b(@Nullable Context context, float f2) {
        if (context != null) {
            return f2 * context.getResources().getDisplayMetrics().density;
        }
        return 0.0f;
    }

    @jz4
    public static final float c(@Nullable Context context, float f2, float f3) {
        if (context != null) {
            return Math.min(context.getResources().getDisplayMetrics().scaledDensity, f3) * f2;
        }
        return 0.0f;
    }

    @jz4
    public static final int d() {
        j35 j35Var = j35.a;
        String format = String.format("#%02X", Arrays.copyOf(new Object[]{Integer.valueOf((int) (255 * c))}, 1));
        c25.o(format, "java.lang.String.format(format, *args)");
        return Color.parseColor(c25.C(format, d));
    }

    @jz4
    public static final float e(@Nullable Context context, float f2) {
        if (context != null) {
            return f2 / context.getResources().getDisplayMetrics().density;
        }
        return 0.0f;
    }

    @jz4
    public static final float f(@Nullable Context context, float f2, float f3) {
        if (context != null) {
            return f2 / Math.min(context.getResources().getDisplayMetrics().scaledDensity, f3);
        }
        return 0.0f;
    }

    @jz4
    public static final void g(@Nullable Context context) {
        if (context == null) {
            xz2.c(b, "[ERROR] Cannot get the DisplayMetrics initialize a null context");
            return;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        g = displayMetrics.widthPixels;
        e = displayMetrics.heightPixels;
        f = displayMetrics.density;
    }

    @jz4
    public static final int h(float f2, @Nullable Context context) {
        Resources resources;
        DisplayMetrics displayMetrics;
        float f3 = 0.0f;
        if (context != null && (resources = context.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            f3 = displayMetrics.scaledDensity;
        }
        return (int) (f2 * f3);
    }
}