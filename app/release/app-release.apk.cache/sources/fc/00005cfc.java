package com.p7700g.p99005;

import android.graphics.Bitmap;
import com.anchorfree.hdr.AFHydra;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AttributeStrategy.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00052\u00020\u0001:\u0003\u0005\f\u000eB\u0007¢\u0006\u0004\b \u0010!J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001aR\"\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001e¨\u0006\""}, d2 = {"Lcom/p7700g/p99005/sy2;", "Lcom/p7700g/p99005/yy2;", "Landroid/graphics/Bitmap;", "bitmap", "Lcom/p7700g/p99005/yq4;", "a", "(Landroid/graphics/Bitmap;)V", "", "width", "height", "Landroid/graphics/Bitmap$Config;", "config", "b", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "c", "()Landroid/graphics/Bitmap;", "", "f", "(Landroid/graphics/Bitmap;)Ljava/lang/String;", "d", "(IILandroid/graphics/Bitmap$Config;)Ljava/lang/String;", "e", "(Landroid/graphics/Bitmap;)I", "toString", "()Ljava/lang/String;", "Lcom/p7700g/p99005/sy2$c;", "Lcom/p7700g/p99005/sy2$c;", "keyPool", "Lcom/p7700g/p99005/wy2;", "Lcom/p7700g/p99005/sy2$b;", "Lcom/p7700g/p99005/wy2;", "groupedMap", "<init>", "()V", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class sy2 implements yy2 {
    @NotNull
    public static final a a = new a(null);
    @NotNull
    private final c b = new c();
    @NotNull
    private final wy2<b, Bitmap> c = new wy2<>();

    /* compiled from: AttributeStrategy.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"com/p7700g/p99005/sy2$a", "", "Landroid/graphics/Bitmap;", "bitmap", "", "d", "(Landroid/graphics/Bitmap;)Ljava/lang/String;", "", "width", "height", "Landroid/graphics/Bitmap$Config;", "config", "c", "(IILandroid/graphics/Bitmap$Config;)Ljava/lang/String;", "<init>", "()V", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String c(int i, int i2, Bitmap.Config config) {
            return f14.u + i + 'x' + i2 + "], " + config;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String d(Bitmap bitmap) {
            return c(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        }
    }

    /* compiled from: AttributeStrategy.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R\u0016\u0010\u0004\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001aR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"com/p7700g/p99005/sy2$b", "Lcom/p7700g/p99005/zy2;", "", "width", "height", "Landroid/graphics/Bitmap$Config;", "config", "Lcom/p7700g/p99005/yq4;", "b", "(IILandroid/graphics/Bitmap$Config;)V", "", ij3.b, "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "()V", "Lcom/p7700g/p99005/sy2$c;", "Lcom/p7700g/p99005/sy2$c;", "pool", "c", AFHydra.STATUS_IDLE, "d", "Landroid/graphics/Bitmap$Config;", "<init>", "(Lcom/p7700g/p99005/sy2$c;)V", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class b implements zy2 {
        @NotNull
        private final c a;
        private int b;
        private int c;
        @Nullable
        private Bitmap.Config d;

        public b(@NotNull c cVar) {
            c25.p(cVar, "pool");
            this.a = cVar;
        }

        @Override // com.p7700g.p99005.zy2
        public void a() {
            this.a.c(this);
        }

        public final void b(int i, int i2, @NotNull Bitmap.Config config) {
            c25.p(config, "config");
            this.b = i;
            this.c = i2;
            this.d = config;
        }

        public boolean equals(@Nullable Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.b == bVar.b && this.c == bVar.c && this.d == bVar.d;
            }
            return false;
        }

        public int hashCode() {
            int i;
            int i2 = ((this.b * 31) + this.c) * 31;
            Bitmap.Config config = this.d;
            if (config != null) {
                c25.m(config);
                i = config.hashCode();
            } else {
                i = 0;
            }
            return i2 + i;
        }

        @NotNull
        public String toString() {
            return sy2.a.c(this.b, this.c, this.d);
        }
    }

    /* compiled from: AttributeStrategy.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ(\u0010\b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"com/p7700g/p99005/sy2$c", "Lcom/p7700g/p99005/ty2;", "Lcom/p7700g/p99005/sy2$b;", "", "width", "height", "Landroid/graphics/Bitmap$Config;", "config", "e", "(IILandroid/graphics/Bitmap$Config;)Lcom/p7700g/p99005/sy2$b;", "d", "()Lcom/p7700g/p99005/sy2$b;", "<init>", "()V", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class c extends ty2<b> {
        @Override // com.p7700g.p99005.ty2
        @NotNull
        /* renamed from: d */
        public b a() {
            return new b(this);
        }

        @NotNull
        public final b e(int i, int i2, @NotNull Bitmap.Config config) {
            c25.p(config, "config");
            b b = b();
            b.b(i, i2, config);
            return b;
        }
    }

    @Override // com.p7700g.p99005.yy2
    public void a(@NotNull Bitmap bitmap) {
        c25.p(bitmap, "bitmap");
        c cVar = this.b;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap.Config config = bitmap.getConfig();
        c25.o(config, "bitmap.config");
        this.c.d(cVar.e(width, height, config), bitmap);
    }

    @Override // com.p7700g.p99005.yy2
    @NotNull
    public Bitmap b(int i, int i2, @NotNull Bitmap.Config config) {
        c25.p(config, "config");
        Bitmap a2 = this.c.a(this.b.e(i, i2, config));
        c25.m(a2);
        return a2;
    }

    @Override // com.p7700g.p99005.yy2
    @NotNull
    public Bitmap c() {
        Bitmap f = this.c.f();
        c25.m(f);
        return f;
    }

    @Override // com.p7700g.p99005.yy2
    @NotNull
    public String d(int i, int i2, @NotNull Bitmap.Config config) {
        c25.p(config, "config");
        return a.c(i, i2, config);
    }

    @Override // com.p7700g.p99005.yy2
    public int e(@NotNull Bitmap bitmap) {
        c25.p(bitmap, "bitmap");
        return bz2.f(bitmap);
    }

    @Override // com.p7700g.p99005.yy2
    @NotNull
    public String f(@NotNull Bitmap bitmap) {
        c25.p(bitmap, "bitmap");
        return a.d(bitmap);
    }

    @NotNull
    public String toString() {
        return c25.C("AttributeStrategy:\n  ", this.c);
    }
}