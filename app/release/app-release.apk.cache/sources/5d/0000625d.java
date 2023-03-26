package com.p7700g.p99005;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: SizeConfigStrategy.java */
@e2(19)
/* loaded from: classes2.dex */
public class vs1 implements ss1 {
    private static final int a = 8;
    private static final Bitmap.Config[] b;
    private static final Bitmap.Config[] c;
    private static final Bitmap.Config[] d;
    private static final Bitmap.Config[] e;
    private static final Bitmap.Config[] f;
    private final c g = new c();
    private final os1<b, Bitmap> h = new os1<>();
    private final Map<Bitmap.Config, NavigableMap<Integer, Integer>> i = new HashMap();

    /* compiled from: SizeConfigStrategy.java */
    /* loaded from: classes2.dex */
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
    @r2
    /* loaded from: classes2.dex */
    public static class c extends ks1<b> {
        @Override // com.p7700g.p99005.ks1
        /* renamed from: d */
        public b a() {
            return new b(this);
        }

        public b e(int i, Bitmap.Config config) {
            b b = b();
            b.b(i, config);
            return b;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        b = configArr;
        c = configArr;
        d = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        e = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    private void g(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> k = k(bitmap.getConfig());
        Integer num2 = (Integer) k.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                k.remove(num);
                return;
            } else {
                k.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + f(bitmap) + ", this: " + this);
    }

    private b h(int i, Bitmap.Config config) {
        Bitmap.Config[] j;
        b e2 = this.g.e(i, config);
        for (Bitmap.Config config2 : j(config)) {
            Integer ceilingKey = k(config2).ceilingKey(Integer.valueOf(i));
            if (ceilingKey != null && ceilingKey.intValue() <= i * 8) {
                if (ceilingKey.intValue() == i) {
                    if (config2 == null) {
                        if (config == null) {
                            return e2;
                        }
                    } else if (config2.equals(config)) {
                        return e2;
                    }
                }
                this.g.c(e2);
                return this.g.e(ceilingKey.intValue(), config2);
            }
        }
        return e2;
    }

    public static String i(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    private static Bitmap.Config[] j(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            return c;
        }
        int i = a.a[config.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return i != 4 ? new Bitmap.Config[]{config} : f;
                }
                return e;
            }
            return d;
        }
        return b;
    }

    private NavigableMap<Integer, Integer> k(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.i.get(config);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            this.i.put(config, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    @Override // com.p7700g.p99005.ss1
    public void a(Bitmap bitmap) {
        b e2 = this.g.e(z02.h(bitmap), bitmap.getConfig());
        this.h.d(e2, bitmap);
        NavigableMap<Integer, Integer> k = k(bitmap.getConfig());
        Integer num = (Integer) k.get(Integer.valueOf(e2.b));
        k.put(Integer.valueOf(e2.b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // com.p7700g.p99005.ss1
    @z1
    public Bitmap b(int i, int i2, Bitmap.Config config) {
        b h = h(z02.g(i, i2, config), config);
        Bitmap a2 = this.h.a(h);
        if (a2 != null) {
            g(Integer.valueOf(h.b), a2);
            a2.reconfigure(i, i2, config);
        }
        return a2;
    }

    @Override // com.p7700g.p99005.ss1
    @z1
    public Bitmap c() {
        Bitmap f2 = this.h.f();
        if (f2 != null) {
            g(Integer.valueOf(z02.h(f2)), f2);
        }
        return f2;
    }

    @Override // com.p7700g.p99005.ss1
    public String d(int i, int i2, Bitmap.Config config) {
        return i(z02.g(i, i2, config), config);
    }

    @Override // com.p7700g.p99005.ss1
    public int e(Bitmap bitmap) {
        return z02.h(bitmap);
    }

    @Override // com.p7700g.p99005.ss1
    public String f(Bitmap bitmap) {
        return i(z02.h(bitmap), bitmap.getConfig());
    }

    public String toString() {
        StringBuilder G = wo1.G("SizeConfigStrategy{groupedMap=");
        G.append(this.h);
        G.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.i.entrySet()) {
            G.append(entry.getKey());
            G.append(f14.u);
            G.append(entry.getValue());
            G.append("], ");
        }
        if (!this.i.isEmpty()) {
            G.replace(G.length() - 2, G.length(), "");
        }
        G.append(")}");
        return G.toString();
    }

    /* compiled from: SizeConfigStrategy.java */
    @r2
    /* loaded from: classes2.dex */
    public static final class b implements ts1 {
        private final c a;
        public int b;
        private Bitmap.Config c;

        public b(c cVar) {
            this.a = cVar;
        }

        @Override // com.p7700g.p99005.ts1
        public void a() {
            this.a.c(this);
        }

        public void b(int i, Bitmap.Config config) {
            this.b = i;
            this.c = config;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.b == bVar.b && z02.d(this.c, bVar.c);
            }
            return false;
        }

        public int hashCode() {
            int i = this.b * 31;
            Bitmap.Config config = this.c;
            return i + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return vs1.i(this.b, this.c);
        }

        @r2
        public b(c cVar, int i, Bitmap.Config config) {
            this(cVar);
            b(i, config);
        }
    }
}