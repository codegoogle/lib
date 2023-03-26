package com.p7700g.p99005;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.anythink.core.api.ATAdConst;
import java.util.ArrayDeque;
import java.util.Queue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Util.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u000f\u001a\u00020\u00112\b\u0010\u000f\u001a\u0004\u0018\u00010\u00012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u000f\u0010\u0012J!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u00132\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010 ¨\u0006#"}, d2 = {"Lcom/p7700g/p99005/bz2;", "", "Landroid/graphics/Bitmap;", "bitmap", "", "f", "(Landroid/graphics/Bitmap;)I", "width", "height", "Landroid/graphics/Bitmap$Config;", "config", "e", "(IILandroid/graphics/Bitmap$Config;)I", com.anythink.basead.d.g.i, "(Landroid/graphics/Bitmap$Config;)I", "a", "b", "", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "T", ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, "Ljava/util/Queue;", "d", "(I)Ljava/util/Queue;", "candidate", "Landroid/graphics/BitmapFactory$Options;", "targetOptions", "c", "(Landroid/graphics/Bitmap;Landroid/graphics/BitmapFactory$Options;)Z", "options", "reqWidth", "reqHeight", "(Landroid/graphics/BitmapFactory$Options;II)I", "<init>", "()V", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class bz2 {
    @NotNull
    public static final bz2 a = new bz2();

    /* compiled from: Util.kt */
    @vo4(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            iArr[Bitmap.Config.RGB_565.ordinal()] = 2;
            iArr[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            iArr[Bitmap.Config.ARGB_8888.ordinal()] = 4;
            a = iArr;
        }
    }

    private bz2() {
    }

    @jz4
    public static final boolean a(@Nullable Object obj, @Nullable Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return c25.g(obj, obj2);
    }

    @jz4
    public static final int e(int i, int i2, @NotNull Bitmap.Config config) {
        c25.p(config, "config");
        return i * i2 * a.g(config);
    }

    @TargetApi(19)
    @jz4
    public static final int f(@NotNull Bitmap bitmap) {
        c25.p(bitmap, "bitmap");
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + f14.u + bitmap.getWidth() + 'x' + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    private final int g(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = a.a[config.ordinal()];
        if (i != 1) {
            return (i == 2 || i == 3) ? 2 : 4;
        }
        return 1;
    }

    public final int b(@NotNull BitmapFactory.Options options, int i, int i2) {
        c25.p(options, "options");
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        int i5 = 1;
        if (i3 > i2 || i4 > i) {
            int i6 = i3 / 2;
            int i7 = i4 / 2;
            while (i6 / i5 > i2 && i7 / i5 > i) {
                i5 *= 2;
            }
        }
        return i5;
    }

    public final boolean c(@NotNull Bitmap bitmap, @NotNull BitmapFactory.Options options) {
        c25.p(bitmap, "candidate");
        c25.p(options, "targetOptions");
        int i = options.outWidth;
        int i2 = options.inSampleSize;
        int g = (options.outHeight / i2) * (i / i2) * g(bitmap.getConfig());
        try {
        } catch (NullPointerException unused) {
            if (g <= bitmap.getRowBytes() * bitmap.getHeight()) {
                return true;
            }
        }
        return g <= bitmap.getAllocationByteCount();
    }

    @NotNull
    public final <T> Queue<T> d(int i) {
        return new ArrayDeque(i);
    }
}