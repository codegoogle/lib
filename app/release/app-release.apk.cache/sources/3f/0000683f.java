package com.p7700g.p99005;

import android.graphics.Bitmap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LruPoolStrategy.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J*\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH¦\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/p7700g/p99005/yy2;", "", "Landroid/graphics/Bitmap;", "bitmap", "Lcom/p7700g/p99005/yq4;", "a", "(Landroid/graphics/Bitmap;)V", "", "width", "height", "Landroid/graphics/Bitmap$Config;", "config", "b", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "c", "()Landroid/graphics/Bitmap;", "", "f", "(Landroid/graphics/Bitmap;)Ljava/lang/String;", "d", "(IILandroid/graphics/Bitmap$Config;)Ljava/lang/String;", "e", "(Landroid/graphics/Bitmap;)I", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public interface yy2 {
    void a(@NotNull Bitmap bitmap);

    @Nullable
    Bitmap b(int i, int i2, @NotNull Bitmap.Config config);

    @NotNull
    Bitmap c();

    @NotNull
    String d(int i, int i2, @NotNull Bitmap.Config config);

    int e(@NotNull Bitmap bitmap);

    @NotNull
    String f(@NotNull Bitmap bitmap);
}