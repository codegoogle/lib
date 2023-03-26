package com.p7700g.p99005;

import android.graphics.Bitmap;
import com.anchorfree.hdr.AFHydra;
import com.anythink.expressad.foundation.c.d;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GlideBitmapPool.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0011\b\u0012\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001f\b\u0012\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\b\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u000f"}, d2 = {"Lcom/p7700g/p99005/ry2;", "", "Lcom/p7700g/p99005/uy2;", "d", "Lcom/p7700g/p99005/uy2;", "bitmapPool", "", "maxSize", "<init>", "(I)V", "", "Landroid/graphics/Bitmap$Config;", "allowedConfigs", "(ILjava/util/Set;)V", "a", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class ry2 {
    @NotNull
    public static final a a = new a(null);
    private static final int b = 6291456;
    @Nullable
    private static ry2 c;
    @Nullable
    private uy2 d;

    /* compiled from: GlideBitmapPool.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u00000\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b#\u0010\u0017J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0019\u0010\u0006J\u000f\u0010\u001a\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\u0017R\u0016\u0010\u001e\u001a\u00020\u001b8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u00028\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, d2 = {"com/p7700g/p99005/ry2$a", "", "", "maxSize", "Lcom/p7700g/p99005/yq4;", "e", "(I)V", "", "Landroid/graphics/Bitmap$Config;", "allowedConfigs", "f", "(ILjava/util/Set;)V", "Landroid/graphics/Bitmap;", "bitmap", com.anythink.basead.d.g.i, "(Landroid/graphics/Bitmap;)V", "width", "height", "config", "b", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "c", "a", "()V", d.a.w, "i", "h", "Lcom/p7700g/p99005/ry2;", "d", "()Lcom/p7700g/p99005/ry2;", "instance", "DEFAULT_MAX_SIZE", AFHydra.STATUS_IDLE, "sInstance", "Lcom/p7700g/p99005/ry2;", "<init>", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final ry2 d() {
            if (ry2.c == null) {
                ry2.c = new ry2(ry2.b, (DefaultConstructorMarker) null);
            }
            ry2 ry2Var = ry2.c;
            Objects.requireNonNull(ry2Var, "null cannot be cast to non-null type com.greedygame.commons.bitmappool.GlideBitmapPool");
            return ry2Var;
        }

        @jz4
        public final void a() {
            uy2 uy2Var = d().d;
            c25.m(uy2Var);
            uy2Var.d();
        }

        @jz4
        @NotNull
        public final Bitmap b(int i, int i2, @NotNull Bitmap.Config config) {
            c25.p(config, "config");
            uy2 uy2Var = d().d;
            c25.m(uy2Var);
            return uy2Var.b(i, i2, config);
        }

        @jz4
        @NotNull
        public final Bitmap c(int i, int i2, @NotNull Bitmap.Config config) {
            c25.p(config, "config");
            uy2 uy2Var = d().d;
            c25.m(uy2Var);
            return uy2Var.g(i, i2, config);
        }

        @jz4
        public final void e(int i) {
            ry2.c = new ry2(i, (DefaultConstructorMarker) null);
        }

        @jz4
        public final void f(int i, @NotNull Set<? extends Bitmap.Config> set) {
            c25.p(set, "allowedConfigs");
            ry2.c = new ry2(i, set, null);
        }

        @jz4
        public final void g(@NotNull Bitmap bitmap) {
            c25.p(bitmap, "bitmap");
            uy2 uy2Var = d().d;
            c25.m(uy2Var);
            uy2Var.a(bitmap);
        }

        @jz4
        public final void h() {
            if (ry2.c != null) {
                ry2 ry2Var = ry2.c;
                c25.m(ry2Var);
                uy2 uy2Var = ry2Var.d;
                c25.m(uy2Var);
                uy2Var.d();
                ry2.c = null;
            }
        }

        @jz4
        public final void i(int i) {
            uy2 uy2Var = d().d;
            c25.m(uy2Var);
            uy2Var.c(i);
        }
    }

    private ry2(int i) {
        this.d = new xy2(i);
    }

    public /* synthetic */ ry2(int i, Set set, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, set);
    }

    public /* synthetic */ ry2(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    @jz4
    public static final void e() {
        a.a();
    }

    @jz4
    @NotNull
    public static final Bitmap f(int i, int i2, @NotNull Bitmap.Config config) {
        return a.b(i, i2, config);
    }

    @jz4
    @NotNull
    public static final Bitmap g(int i, int i2, @NotNull Bitmap.Config config) {
        return a.c(i, i2, config);
    }

    @jz4
    public static final void h(int i) {
        a.e(i);
    }

    @jz4
    public static final void i(int i, @NotNull Set<? extends Bitmap.Config> set) {
        a.f(i, set);
    }

    @jz4
    public static final void j(@NotNull Bitmap bitmap) {
        a.g(bitmap);
    }

    @jz4
    public static final void k() {
        a.h();
    }

    @jz4
    public static final void l(int i) {
        a.i(i);
    }

    private ry2(int i, Set<? extends Bitmap.Config> set) {
        this.d = new xy2(i, set);
    }
}