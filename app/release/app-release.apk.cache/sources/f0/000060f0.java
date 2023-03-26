package com.p7700g.p99005;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BlurBuilder.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J3\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/p7700g/p99005/uz2;", "", "Landroid/content/Context;", "context", "Landroid/graphics/Bitmap;", "image", "", "color", "", "radius", "c", "(Landroid/content/Context;Landroid/graphics/Bitmap;IF)Landroid/graphics/Bitmap;", "a", "(Landroid/content/Context;Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;", "F", "BITMAP_SCALE", "d", "DEFAULT_RADIUS", "", "b", "Ljava/lang/String;", "TAG", "<init>", "()V", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class uz2 {
    @NotNull
    public static final uz2 a = new uz2();
    @NotNull
    private static final String b = "BlrBldr";
    private static final float c = 0.05f;
    private static final float d = 15.0f;

    private uz2() {
    }

    public static /* synthetic */ Bitmap b(uz2 uz2Var, Context context, Bitmap bitmap, float f, int i, Object obj) throws Exception {
        if ((i & 4) != 0) {
            f = d;
        }
        return uz2Var.a(context, bitmap, f);
    }

    public static /* synthetic */ Bitmap d(uz2 uz2Var, Context context, Bitmap bitmap, int i, float f, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            f = d;
        }
        return uz2Var.c(context, bitmap, i, f);
    }

    @Nullable
    public final Bitmap a(@NotNull Context context, @Nullable Bitmap bitmap, float f) throws Exception {
        c25.p(context, "context");
        if (bitmap == null) {
            xz2.c(b, "[ERROR] Cannot do blur operation on Null Bitmap");
            return null;
        }
        try {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, a45.J0(bitmap.getWidth() * c), a45.J0(bitmap.getHeight() * c), false);
            Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
            RenderScript create = RenderScript.create(context);
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
            Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
            create2.setRadius(f);
            create2.setInput(createFromBitmap);
            create2.forEach(createFromBitmap2);
            createFromBitmap2.copyTo(createBitmap);
            return createBitmap;
        } catch (Exception unused) {
            xz2.c(b, "[ERROR] Renderscript failed to create and Blur operation failed");
            return null;
        }
    }

    @Nullable
    public final Bitmap c(@NotNull Context context, @Nullable Bitmap bitmap, int i, float f) {
        c25.p(context, "context");
        try {
            int i2 = context.getResources().getDisplayMetrics().densityDpi;
            if (i2 != 120 && i2 != 160) {
                xz2.c(b, "Display meets minimum requirements. Processing blur");
                return a(context, bitmap, f);
            }
            xz2.c(b, "Display is too low. Switching to color");
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(i);
            return gk.b(gradientDrawable, 0, 0, null, 7, null);
        } catch (Exception unused) {
            return null;
        }
    }
}