package com.p7700g.p99005;

import android.graphics.Bitmap;
import com.anchorfree.hdr.AFHydra;
import com.anythink.expressad.foundation.c.d;
import org.jetbrains.annotations.NotNull;

/* compiled from: BitmapPoolAdapter.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u0014J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ(\u0010\u0010\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0012\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u001c\u001a\u00020\u000b8V@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u0017¨\u0006\u001e"}, d2 = {"Lcom/p7700g/p99005/vy2;", "Lcom/p7700g/p99005/uy2;", "", "sizeMultiplier", "Lcom/p7700g/p99005/yq4;", "e", "(F)V", "Landroid/graphics/Bitmap;", "bitmap", "a", "(Landroid/graphics/Bitmap;)V", "", "width", "height", "Landroid/graphics/Bitmap$Config;", "config", "b", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", com.anythink.basead.d.g.i, "d", "()V", d.a.w, "c", "(I)V", AFHydra.STATUS_IDLE, "f", "()I", "h", "maxSize", "<init>", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class vy2 implements uy2 {
    private int a;

    @Override // com.p7700g.p99005.uy2
    public void a(@NotNull Bitmap bitmap) {
        c25.p(bitmap, "bitmap");
        bitmap.recycle();
    }

    @Override // com.p7700g.p99005.uy2
    @NotNull
    public Bitmap b(int i, int i2, @NotNull Bitmap.Config config) {
        c25.p(config, "config");
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
        c25.o(createBitmap, "createBitmap(width, height, config)");
        return createBitmap;
    }

    @Override // com.p7700g.p99005.uy2
    public void c(int i) {
    }

    @Override // com.p7700g.p99005.uy2
    public void d() {
    }

    @Override // com.p7700g.p99005.uy2
    public void e(float f) {
    }

    @Override // com.p7700g.p99005.uy2
    public int f() {
        return 0;
    }

    @Override // com.p7700g.p99005.uy2
    @NotNull
    public Bitmap g(int i, int i2, @NotNull Bitmap.Config config) {
        c25.p(config, "config");
        return b(i, i2, config);
    }

    @Override // com.p7700g.p99005.uy2
    public void h(int i) {
        this.a = i;
    }
}