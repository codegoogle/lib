package com.p7700g.p99005;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class c33 {
    @NotNull
    public static final c33 a = new c33();

    private c33() {
    }

    @Nullable
    public final Bitmap a(@NotNull Context context, @Nullable Bitmap bitmap, float f) {
        c25.p(context, "context");
        if (bitmap == null) {
            xz2.c("BlrBldr", "[ERROR] Cannot do blur operation on Null Bitmap");
            return null;
        }
        try {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, a45.J0(bitmap.getWidth() * 0.05f), a45.J0(bitmap.getHeight() * 0.05f), false);
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
            xz2.c("BlrBldr", "[ERROR] Renderscript failed to create and Blur operation failed");
            return null;
        }
    }
}