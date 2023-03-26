package com.p7700g.p99005;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: SizeConfigStrategy.java */
@TargetApi(19)
/* loaded from: classes3.dex */
public class az2 implements yy2 {
    private static final int a = 8;
    private static final Bitmap.Config[] b = {Bitmap.Config.ARGB_8888, null};
    private static final Bitmap.Config[] c = {Bitmap.Config.RGB_565};
    private static final Bitmap.Config[] d = {Bitmap.Config.ARGB_4444};
    private static final Bitmap.Config[] e = {Bitmap.Config.ALPHA_8};
    private final c f = new c();
    private final wy2<b, Bitmap> g = new wy2<>();
    private final Map<Bitmap.Config, NavigableMap<Integer, Integer>> h = new HashMap();

    /* compiled from: SizeConfigStrategy.java */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: SizeConfigStrategy.java */
    /* loaded from: classes3.dex */
    public static class c extends ty2<b> {
        @Override // com.p7700g.p99005.ty2
        /* renamed from: d */
        public b a() {
            return new b(this);
        }

        public b e(int size, Bitmap.Config config) {
            b b = b();
            b.c(size, config);
            return b;
        }
    }

    private void h(Integer size, Bitmap removed) {
        NavigableMap<Integer, Integer> l = l(removed.getConfig());
        Integer num = (Integer) l.get(size);
        if (num != null) {
            if (num.intValue() == 1) {
                l.remove(size);
                return;
            } else {
                l.put(size, Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + size + ", removed: " + f(removed) + ", this: " + this);
    }

    private b i(int size, Bitmap.Config config) {
        Bitmap.Config[] k;
        b e2 = this.f.e(size, config);
        for (Bitmap.Config config2 : k(config)) {
            Integer ceilingKey = l(config2).ceilingKey(Integer.valueOf(size));
            if (ceilingKey != null && ceilingKey.intValue() <= size * 8) {
                if (ceilingKey.intValue() == size) {
                    if (config2 == null) {
                        if (config == null) {
                            return e2;
                        }
                    } else if (config2.equals(config)) {
                        return e2;
                    }
                }
                this.f.c(e2);
                return this.f.e(ceilingKey.intValue(), config2);
            }
        }
        return e2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String j(int size, Bitmap.Config config) {
        return "[" + size + "](" + config + ")";
    }

    private static Bitmap.Config[] k(Bitmap.Config requested) {
        int i = a.a[requested.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return i != 4 ? new Bitmap.Config[]{requested} : e;
                }
                return d;
            }
            return c;
        }
        return b;
    }

    private NavigableMap<Integer, Integer> l(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.h.get(config);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            this.h.put(config, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    @Override // com.p7700g.p99005.yy2
    public void a(Bitmap bitmap) {
        b e2 = this.f.e(bz2.f(bitmap), bitmap.getConfig());
        this.g.d(e2, bitmap);
        NavigableMap<Integer, Integer> l = l(bitmap.getConfig());
        Integer num = (Integer) l.get(Integer.valueOf(e2.b));
        l.put(Integer.valueOf(e2.b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // com.p7700g.p99005.yy2
    public Bitmap b(int width, int height, Bitmap.Config config) {
        b i = i(bz2.e(width, height, config), config);
        Bitmap a2 = this.g.a(i);
        if (a2 != null) {
            h(Integer.valueOf(i.b), a2);
            a2.reconfigure(width, height, a2.getConfig() != null ? a2.getConfig() : Bitmap.Config.ARGB_8888);
        }
        return a2;
    }

    @Override // com.p7700g.p99005.yy2
    public Bitmap c() {
        Bitmap f = this.g.f();
        if (f != null) {
            h(Integer.valueOf(bz2.f(f)), f);
        }
        return f;
    }

    @Override // com.p7700g.p99005.yy2
    public String d(int width, int height, Bitmap.Config config) {
        return j(bz2.e(width, height, config), config);
    }

    @Override // com.p7700g.p99005.yy2
    public int e(Bitmap bitmap) {
        return bz2.f(bitmap);
    }

    @Override // com.p7700g.p99005.yy2
    public String f(Bitmap bitmap) {
        return j(bz2.f(bitmap), bitmap.getConfig());
    }

    public String toString() {
        StringBuilder G = wo1.G("SizeConfigStrategy{groupedMap=");
        G.append(this.g);
        G.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.h.entrySet()) {
            G.append(entry.getKey());
            G.append(f14.u);
            G.append(entry.getValue());
            G.append("], ");
        }
        if (!this.h.isEmpty()) {
            G.replace(G.length() - 2, G.length(), "");
        }
        G.append(")}");
        return G.toString();
    }

    /* compiled from: SizeConfigStrategy.java */
    /* loaded from: classes3.dex */
    public static final class b implements zy2 {
        private final c a;
        private int b;
        private Bitmap.Config c;

        public b(c pool) {
            this.a = pool;
        }

        @Override // com.p7700g.p99005.zy2
        public void a() {
            this.a.c(this);
        }

        public void c(int size, Bitmap.Config config) {
            this.b = size;
            this.c = config;
        }

        public boolean equals(Object o) {
            if (o instanceof b) {
                b bVar = (b) o;
                return this.b == bVar.b && bz2.a(this.c, bVar.c);
            }
            return false;
        }

        public int hashCode() {
            int i = this.b * 31;
            Bitmap.Config config = this.c;
            return i + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return az2.j(this.b, this.c);
        }

        public b(c pool, int size, Bitmap.Config config) {
            this(pool);
            c(size, config);
        }
    }
}