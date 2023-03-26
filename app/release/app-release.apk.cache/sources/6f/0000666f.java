package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.util.Log;
import com.anchorfree.hdr.AFHydra;
import com.anythink.core.api.ATAdConst;
import com.anythink.expressad.foundation.c.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: LruBitmapPool.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u000b\u0018\u0000 \u00172\u00020\u0001:\u0004\u0017\u0019\u001d\u001bB'\b\u0002\u0012\u0006\u0010%\u001a\u00020\u0005\u0012\u0006\u0010)\u001a\u00020'\u0012\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\b0*¢\u0006\u0004\b2\u00103B\u0011\b\u0016\u0012\u0006\u00101\u001a\u00020\u0005¢\u0006\u0004\b2\u0010\u000fB\u001f\b\u0016\u0012\u0006\u00101\u001a\u00020\u0005\u0012\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\b0*¢\u0006\u0004\b2\u00104J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0004J\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u0019\u0010\fJ'\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\fJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u0004J\u0017\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u001d\u0010\u000fR\u0016\u0010\u001f\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001eR\u0016\u0010 \u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001eR\u0016\u0010!\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0016\u0010$\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010#R\u0016\u0010%\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001eR\u0016\u0010&\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR\u0016\u0010)\u001a\u00020'8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010(R\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020\b0*8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010.\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001eR\"\u00101\u001a\u00020\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b/\u0010\u001e\u001a\u0004\b+\u00100\"\u0004\b/\u0010\u000f¨\u00065"}, d2 = {"Lcom/p7700g/p99005/xy2;", "Lcom/p7700g/p99005/uy2;", "Lcom/p7700g/p99005/yq4;", "k", "()V", "", "width", "height", "Landroid/graphics/Bitmap$Config;", "config", "Landroid/graphics/Bitmap;", "l", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, com.anythink.expressad.d.a.b.dH, "(I)V", "i", "j", "", "sizeMultiplier", "e", "(F)V", "bitmap", "a", "(Landroid/graphics/Bitmap;)V", "b", com.anythink.basead.d.g.i, "d", d.a.w, "c", AFHydra.STATUS_IDLE, "hits", "evictions", "misses", "Lcom/p7700g/p99005/xy2$a;", "Lcom/p7700g/p99005/xy2$a;", "tracker", "initialMaxSize", "puts", "Lcom/p7700g/p99005/yy2;", "Lcom/p7700g/p99005/yy2;", "strategy", "", "f", "Ljava/util/Set;", "allowedConfigs", "currentSize", "h", "()I", "maxSize", "<init>", "(ILcom/p7700g/p99005/yy2;Ljava/util/Set;)V", "(ILjava/util/Set;)V", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class xy2 implements uy2 {
    @NotNull
    public static final b a = new b(null);
    @NotNull
    private static final String b = "LruBiPo";
    @NotNull
    private static final Bitmap.Config c = Bitmap.Config.ARGB_8888;
    private final int d;
    @NotNull
    private final yy2 e;
    @NotNull
    private final Set<Bitmap.Config> f;
    @NotNull
    private a g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;

    /* compiled from: LruBitmapPool.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bb\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"com/p7700g/p99005/xy2$a", "", "Landroid/graphics/Bitmap;", "bitmap", "Lcom/p7700g/p99005/yq4;", "b", "(Landroid/graphics/Bitmap;)V", "a", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public interface a {
        void a(@NotNull Bitmap bitmap);

        void b(@NotNull Bitmap bitmap);
    }

    /* compiled from: LruBitmapPool.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u00000\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\b\u0010\u0006R\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"com/p7700g/p99005/xy2$b", "", "Landroid/graphics/Bitmap;", "bitmap", "Lcom/p7700g/p99005/yq4;", "h", "(Landroid/graphics/Bitmap;)V", "f", com.anythink.basead.d.g.i, "", "Landroid/graphics/Bitmap$Config;", "d", "()Ljava/util/Set;", "defaultAllowedConfigs", "Lcom/p7700g/p99005/yy2;", "e", "()Lcom/p7700g/p99005/yy2;", "defaultStrategy", "DEFAULT_CONFIG", "Landroid/graphics/Bitmap$Config;", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Set<Bitmap.Config> d() {
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            Bitmap.Config[] values = Bitmap.Config.values();
            int length = values.length;
            int i = 0;
            while (i < length) {
                Bitmap.Config config = values[i];
                i++;
                arrayList.add(config);
            }
            Set<Bitmap.Config> unmodifiableSet = Collections.unmodifiableSet(hashSet);
            c25.o(unmodifiableSet, "unmodifiableSet<Bitmap.Config>(configs)");
            return unmodifiableSet;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final yy2 e() {
            return new az2();
        }

        @TargetApi(12)
        private final void f(Bitmap bitmap) {
            bitmap.setHasAlpha(true);
        }

        @TargetApi(19)
        private final void g(Bitmap bitmap) {
            bitmap.setPremultiplied(true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void h(Bitmap bitmap) {
            f(bitmap);
            g(bitmap);
        }
    }

    /* compiled from: LruBitmapPool.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\n"}, d2 = {"com/p7700g/p99005/xy2$c", "Lcom/p7700g/p99005/xy2$a;", "Landroid/graphics/Bitmap;", "bitmap", "Lcom/p7700g/p99005/yq4;", "b", "(Landroid/graphics/Bitmap;)V", "a", "<init>", "()V", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class c implements a {
        @Override // com.p7700g.p99005.xy2.a
        public void a(@NotNull Bitmap bitmap) {
            c25.p(bitmap, "bitmap");
        }

        @Override // com.p7700g.p99005.xy2.a
        public void b(@NotNull Bitmap bitmap) {
            c25.p(bitmap, "bitmap");
        }
    }

    /* compiled from: LruBitmapPool.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0000\n\u0002\u0010\"\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006R:\u0010\f\u001a&\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00020\u0002 \t*\u0012\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\n0\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000b¨\u0006\u000f"}, d2 = {"com/p7700g/p99005/xy2$d", "Lcom/p7700g/p99005/xy2$a;", "Landroid/graphics/Bitmap;", "bitmap", "Lcom/p7700g/p99005/yq4;", "b", "(Landroid/graphics/Bitmap;)V", "a", "", "kotlin.jvm.PlatformType", "", "Ljava/util/Set;", "bitmaps", "<init>", "()V", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class d implements a {
        private final Set<Bitmap> a = Collections.synchronizedSet(new HashSet());

        @Override // com.p7700g.p99005.xy2.a
        public void a(@NotNull Bitmap bitmap) {
            c25.p(bitmap, "bitmap");
            if (this.a.contains(bitmap)) {
                this.a.remove(bitmap);
                return;
            }
            throw new IllegalStateException("Cannot remove bitmap not in tracker");
        }

        @Override // com.p7700g.p99005.xy2.a
        public void b(@NotNull Bitmap bitmap) {
            c25.p(bitmap, "bitmap");
            if (!this.a.contains(bitmap)) {
                this.a.add(bitmap);
                return;
            }
            throw new IllegalStateException("Can't add already added bitmap: " + bitmap + " [" + bitmap.getWidth() + 'x' + bitmap.getHeight() + f14.v);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private xy2(int i, yy2 yy2Var, Set<? extends Bitmap.Config> set) {
        this.d = i;
        this.e = yy2Var;
        this.f = set;
        h(i);
        this.g = new c();
    }

    private final void i() {
        if (Log.isLoggable(b, 2)) {
            j();
        }
    }

    private final void j() {
        StringBuilder G = wo1.G("Hits=");
        G.append(this.j);
        G.append(", misses=");
        G.append(this.k);
        G.append(", puts=");
        G.append(this.l);
        G.append(", evictions=");
        G.append(this.m);
        G.append(", currentSize=");
        G.append(this.i);
        G.append(", maxSize=");
        G.append(f());
        G.append("\nStrategy=");
        G.append(this.e);
        G.toString();
    }

    private final void k() {
        m(f());
    }

    private final synchronized Bitmap l(int i, int i2, Bitmap.Config config) {
        Bitmap b2;
        b2 = this.e.b(i, i2, config == null ? c : config);
        if (b2 == null) {
            if (Log.isLoggable(b, 3)) {
                yy2 yy2Var = this.e;
                c25.m(config);
                c25.C("Missing bitmap=", yy2Var.d(i, i2, config));
            }
            this.k++;
        } else {
            this.j++;
            this.i -= this.e.e(b2);
            this.g.a(b2);
            a.h(b2);
        }
        if (Log.isLoggable(b, 2)) {
            yy2 yy2Var2 = this.e;
            c25.m(config);
            c25.C("Get bitmap=", yy2Var2.d(i, i2, config));
        }
        i();
        return b2;
    }

    private final synchronized void m(int i) {
        while (this.i > i) {
            Bitmap c2 = this.e.c();
            if (c2 == null) {
                if (Log.isLoggable(b, 5)) {
                    j();
                }
                this.i = 0;
                return;
            }
            this.g.a(c2);
            this.i -= this.e.e(c2);
            this.m++;
            if (Log.isLoggable(b, 3)) {
                c25.C("Evicting bitmap=", this.e.f(c2));
            }
            i();
            c2.recycle();
        }
    }

    @Override // com.p7700g.p99005.uy2
    public synchronized void a(@NotNull Bitmap bitmap) {
        c25.p(bitmap, "bitmap");
        if (!bitmap.isRecycled()) {
            if (bitmap.isMutable() && this.e.e(bitmap) <= f() && this.f.contains(bitmap.getConfig())) {
                int e = this.e.e(bitmap);
                this.e.a(bitmap);
                this.g.b(bitmap);
                this.l++;
                this.i += e;
                if (Log.isLoggable(b, 2)) {
                    c25.C("Put bitmap in pool=", this.e.f(bitmap));
                }
                i();
                k();
                return;
            }
            if (Log.isLoggable(b, 2)) {
                this.e.f(bitmap);
                bitmap.isMutable();
                this.f.contains(bitmap.getConfig());
            }
            bitmap.recycle();
            return;
        }
        throw new IllegalStateException("Cannot pool recycled bitmap");
    }

    @Override // com.p7700g.p99005.uy2
    @NotNull
    public Bitmap b(int i, int i2, @NotNull Bitmap.Config config) {
        c25.p(config, "config");
        if (i2 < 0) {
            i2 = 1;
        }
        if (i < 0) {
            i = 1;
        }
        Bitmap l = l(i, i2, config);
        if (l != null) {
            l.eraseColor(0);
        } else {
            l = Bitmap.createBitmap(i, i2, config);
        }
        c25.m(l);
        return l;
    }

    @Override // com.p7700g.p99005.uy2
    @SuppressLint({"InlinedApi"})
    public void c(int i) {
        if (Log.isLoggable(b, 3)) {
            c25.C("trimMemory, level=", Integer.valueOf(i));
        }
        if (i >= 40) {
            d();
        } else if (i >= 20) {
            m(f() / 2);
        }
    }

    @Override // com.p7700g.p99005.uy2
    public void d() {
        Log.isLoggable(b, 3);
        m(0);
    }

    @Override // com.p7700g.p99005.uy2
    public synchronized void e(float f) {
        h(Math.round(this.d * f));
        k();
    }

    @Override // com.p7700g.p99005.uy2
    public int f() {
        return this.h;
    }

    @Override // com.p7700g.p99005.uy2
    @NotNull
    public Bitmap g(int i, int i2, @NotNull Bitmap.Config config) {
        c25.p(config, "config");
        Bitmap l = l(i, i2, config);
        if (l == null) {
            l = Bitmap.createBitmap(i, i2, config);
        }
        c25.m(l);
        return l;
    }

    @Override // com.p7700g.p99005.uy2
    public void h(int i) {
        this.h = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xy2(int i) {
        this(i, r0.e(), r0.d());
        b bVar = a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public xy2(int i, @NotNull Set<? extends Bitmap.Config> set) {
        this(i, a.e(), set);
        c25.p(set, "allowedConfigs");
    }
}