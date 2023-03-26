package com.p7700g.p99005;

import android.graphics.Bitmap;
import com.anythink.expressad.foundation.c.d;
import org.jetbrains.annotations.NotNull;

/* compiled from: BitmapPool.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ(\u0010\u0010\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH¦\u0002¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0012\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0004H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u000bH&¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001b\u001a\u00020\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/p7700g/p99005/uy2;", "", "", "sizeMultiplier", "Lcom/p7700g/p99005/yq4;", "e", "(F)V", "Landroid/graphics/Bitmap;", "bitmap", "a", "(Landroid/graphics/Bitmap;)V", "", "width", "height", "Landroid/graphics/Bitmap$Config;", "config", "b", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", com.anythink.basead.d.g.i, "d", "()V", d.a.w, "c", "(I)V", "f", "()I", "h", "maxSize", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public interface uy2 {
    void a(@NotNull Bitmap bitmap);

    @NotNull
    Bitmap b(int i, int i2, @NotNull Bitmap.Config config);

    void c(int i);

    void d();

    void e(float f);

    int f();

    @NotNull
    Bitmap g(int i, int i2, @NotNull Bitmap.Config config);

    void h(int i);
}