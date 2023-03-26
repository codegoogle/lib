package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: LruBitmapPool.java */
/* loaded from: classes2.dex */
public class rs1 implements ls1 {
    private static final String a = "LruBitmapPool";
    private static final Bitmap.Config b = Bitmap.Config.ARGB_8888;
    private final ss1 c;
    private final Set<Bitmap.Config> d;
    private final long e;
    private final a f;
    private long g;
    private long h;
    private int i;
    private int j;
    private int k;
    private int l;

    /* compiled from: LruBitmapPool.java */
    /* loaded from: classes2.dex */
    public interface a {
        void a(Bitmap bitmap);

        void b(Bitmap bitmap);
    }

    /* compiled from: LruBitmapPool.java */
    /* loaded from: classes2.dex */
    public static final class b implements a {
        @Override // com.p7700g.p99005.rs1.a
        public void a(Bitmap bitmap) {
        }

        @Override // com.p7700g.p99005.rs1.a
        public void b(Bitmap bitmap) {
        }
    }

    /* compiled from: LruBitmapPool.java */
    /* loaded from: classes2.dex */
    public static class c implements a {
        private final Set<Bitmap> a = Collections.synchronizedSet(new HashSet());

        private c() {
        }

        @Override // com.p7700g.p99005.rs1.a
        public void a(Bitmap bitmap) {
            if (this.a.contains(bitmap)) {
                this.a.remove(bitmap);
                return;
            }
            throw new IllegalStateException("Cannot remove bitmap not in tracker");
        }

        @Override // com.p7700g.p99005.rs1.a
        public void b(Bitmap bitmap) {
            if (!this.a.contains(bitmap)) {
                this.a.add(bitmap);
                return;
            }
            throw new IllegalStateException("Can't add already added bitmap: " + bitmap + " [" + bitmap.getWidth() + "x" + bitmap.getHeight() + "]");
        }
    }

    public rs1(long j, ss1 ss1Var, Set<Bitmap.Config> set) {
        this.e = j;
        this.g = j;
        this.c = ss1Var;
        this.d = set;
        this.f = new b();
    }

    @TargetApi(26)
    private static void h(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    @x1
    private static Bitmap i(int i, int i2, @z1 Bitmap.Config config) {
        if (config == null) {
            config = b;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    private void j() {
        if (Log.isLoggable(a, 2)) {
            k();
        }
    }

    private void k() {
        StringBuilder G = wo1.G("Hits=");
        G.append(this.i);
        G.append(", misses=");
        G.append(this.j);
        G.append(", puts=");
        G.append(this.k);
        G.append(", evictions=");
        G.append(this.l);
        G.append(", currentSize=");
        G.append(this.h);
        G.append(", maxSize=");
        G.append(this.g);
        G.append("\nStrategy=");
        G.append(this.c);
        G.toString();
    }

    private void l() {
        v(this.g);
    }

    @TargetApi(26)
    private static Set<Bitmap.Config> o() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private static ss1 p() {
        return new vs1();
    }

    @z1
    private synchronized Bitmap q(int i, int i2, @z1 Bitmap.Config config) {
        Bitmap b2;
        h(config);
        b2 = this.c.b(i, i2, config != null ? config : b);
        if (b2 == null) {
            if (Log.isLoggable(a, 3)) {
                this.c.d(i, i2, config);
            }
            this.j++;
        } else {
            this.i++;
            this.h -= this.c.e(b2);
            this.f.a(b2);
            u(b2);
        }
        if (Log.isLoggable(a, 2)) {
            this.c.d(i, i2, config);
        }
        j();
        return b2;
    }

    @TargetApi(19)
    private static void s(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    private static void u(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        s(bitmap);
    }

    private synchronized void v(long j) {
        while (this.h > j) {
            Bitmap c2 = this.c.c();
            if (c2 == null) {
                if (Log.isLoggable(a, 5)) {
                    k();
                }
                this.h = 0L;
                return;
            }
            this.f.a(c2);
            this.h -= this.c.e(c2);
            this.l++;
            if (Log.isLoggable(a, 3)) {
                this.c.f(c2);
            }
            j();
            c2.recycle();
        }
    }

    @Override // com.p7700g.p99005.ls1
    public synchronized void a(Bitmap bitmap) {
        try {
            if (bitmap != null) {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable() && this.c.e(bitmap) <= this.g && this.d.contains(bitmap.getConfig())) {
                        int e = this.c.e(bitmap);
                        this.c.a(bitmap);
                        this.f.b(bitmap);
                        this.k++;
                        this.h += e;
                        if (Log.isLoggable(a, 2)) {
                            this.c.f(bitmap);
                        }
                        j();
                        l();
                        return;
                    }
                    if (Log.isLoggable(a, 2)) {
                        this.c.f(bitmap);
                        bitmap.isMutable();
                        this.d.contains(bitmap.getConfig());
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            throw new NullPointerException("Bitmap must not be null");
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.p7700g.p99005.ls1
    @x1
    public Bitmap b(int i, int i2, Bitmap.Config config) {
        Bitmap q = q(i, i2, config);
        if (q != null) {
            q.eraseColor(0);
            return q;
        }
        return i(i, i2, config);
    }

    @Override // com.p7700g.p99005.ls1
    @SuppressLint({"InlinedApi"})
    public void c(int i) {
        Log.isLoggable(a, 3);
        if (i >= 40 || (Build.VERSION.SDK_INT >= 23 && i >= 20)) {
            d();
        } else if (i >= 20 || i == 15) {
            v(f() / 2);
        }
    }

    @Override // com.p7700g.p99005.ls1
    public void d() {
        Log.isLoggable(a, 3);
        v(0L);
    }

    @Override // com.p7700g.p99005.ls1
    public synchronized void e(float f) {
        this.g = Math.round(((float) this.e) * f);
        l();
    }

    @Override // com.p7700g.p99005.ls1
    public long f() {
        return this.g;
    }

    @Override // com.p7700g.p99005.ls1
    @x1
    public Bitmap g(int i, int i2, Bitmap.Config config) {
        Bitmap q = q(i, i2, config);
        return q == null ? i(i, i2, config) : q;
    }

    public long m() {
        return this.l;
    }

    public long n() {
        return this.h;
    }

    public long r() {
        return this.i;
    }

    public long t() {
        return this.j;
    }

    public rs1(long j) {
        this(j, p(), o());
    }

    public rs1(long j, Set<Bitmap.Config> set) {
        this(j, p(), set);
    }
}