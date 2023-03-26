package com.p7700g.p99005;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import com.p7700g.p99005.i2;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: LottieComposition.java */
/* loaded from: classes.dex */
public class ei0 {
    private Map<String, List<lm0>> c;
    private Map<String, ii0> d;
    private Map<String, rk0> e;
    private List<wk0> f;
    private z7<sk0> g;
    private v7<lm0> h;
    private List<lm0> i;
    private Rect j;
    private float k;
    private float l;
    private float m;
    private boolean n;
    private final qi0 a = new qi0();
    private final HashSet<String> b = new HashSet<>();
    private int o = 0;

    /* compiled from: LottieComposition.java */
    @Deprecated
    /* loaded from: classes.dex */
    public static class b {

        /* compiled from: LottieComposition.java */
        /* loaded from: classes.dex */
        public static final class a implements ji0<ei0>, zh0 {
            private final pi0 a;
            private boolean b;

            @Override // com.p7700g.p99005.ji0
            /* renamed from: a */
            public void onResult(ei0 ei0Var) {
                if (this.b) {
                    return;
                }
                this.a.a(ei0Var);
            }

            @Override // com.p7700g.p99005.zh0
            public void cancel() {
                this.b = true;
            }

            private a(pi0 pi0Var) {
                this.b = false;
                this.a = pi0Var;
            }
        }

        private b() {
        }

        @Deprecated
        public static zh0 a(Context context, String str, pi0 pi0Var) {
            a aVar = new a(pi0Var);
            fi0.d(context, str).c(aVar);
            return aVar;
        }

        @s2
        @z1
        @Deprecated
        public static ei0 b(Context context, String str) {
            return fi0.f(context, str).b();
        }

        @Deprecated
        public static zh0 c(InputStream inputStream, pi0 pi0Var) {
            a aVar = new a(pi0Var);
            fi0.i(inputStream, null).c(aVar);
            return aVar;
        }

        @s2
        @z1
        @Deprecated
        public static ei0 d(InputStream inputStream) {
            return fi0.j(inputStream, null).b();
        }

        @s2
        @z1
        @Deprecated
        public static ei0 e(InputStream inputStream, boolean z) {
            if (z) {
                yo0.e("Lottie now auto-closes input stream!");
            }
            return fi0.j(inputStream, null).b();
        }

        @Deprecated
        public static zh0 f(po0 po0Var, pi0 pi0Var) {
            a aVar = new a(pi0Var);
            fi0.l(po0Var, null).c(aVar);
            return aVar;
        }

        @Deprecated
        public static zh0 g(String str, pi0 pi0Var) {
            a aVar = new a(pi0Var);
            fi0.o(str, null).c(aVar);
            return aVar;
        }

        @s2
        @z1
        @Deprecated
        public static ei0 h(Resources resources, JSONObject jSONObject) {
            return fi0.q(jSONObject, null).b();
        }

        @s2
        @z1
        @Deprecated
        public static ei0 i(po0 po0Var) {
            return fi0.m(po0Var, null).b();
        }

        @s2
        @z1
        @Deprecated
        public static ei0 j(String str) {
            return fi0.p(str, null).b();
        }

        @Deprecated
        public static zh0 k(Context context, @d2 int i, pi0 pi0Var) {
            a aVar = new a(pi0Var);
            fi0.r(context, i).c(aVar);
            return aVar;
        }
    }

    @i2({i2.a.LIBRARY})
    public void a(String str) {
        yo0.e(str);
        this.b.add(str);
    }

    public Rect b() {
        return this.j;
    }

    public z7<sk0> c() {
        return this.g;
    }

    public float d() {
        return (e() / this.m) * 1000.0f;
    }

    public float e() {
        return this.l - this.k;
    }

    public float f() {
        return this.l;
    }

    public Map<String, rk0> g() {
        return this.e;
    }

    public float h(float f) {
        return bp0.k(this.k, this.l, f);
    }

    public float i() {
        return this.m;
    }

    public Map<String, ii0> j() {
        return this.d;
    }

    public List<lm0> k() {
        return this.i;
    }

    @z1
    public wk0 l(String str) {
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            wk0 wk0Var = this.f.get(i);
            if (wk0Var.d(str)) {
                return wk0Var;
            }
        }
        return null;
    }

    public List<wk0> m() {
        return this.f;
    }

    @i2({i2.a.LIBRARY})
    public int n() {
        return this.o;
    }

    public qi0 o() {
        return this.a;
    }

    @i2({i2.a.LIBRARY})
    @z1
    public List<lm0> p(String str) {
        return this.c.get(str);
    }

    public float q(float f) {
        float f2 = this.k;
        return (f - f2) / (this.l - f2);
    }

    public float r() {
        return this.k;
    }

    public ArrayList<String> s() {
        HashSet<String> hashSet = this.b;
        return new ArrayList<>(Arrays.asList((String[]) hashSet.toArray(new String[hashSet.size()])));
    }

    @i2({i2.a.LIBRARY})
    public boolean t() {
        return this.n;
    }

    @x1
    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        for (lm0 lm0Var : this.i) {
            sb.append(lm0Var.y("\t"));
        }
        return sb.toString();
    }

    public boolean u() {
        return !this.d.isEmpty();
    }

    @i2({i2.a.LIBRARY})
    public void v(int i) {
        this.o += i;
    }

    @i2({i2.a.LIBRARY})
    public void w(Rect rect, float f, float f2, float f3, List<lm0> list, v7<lm0> v7Var, Map<String, List<lm0>> map, Map<String, ii0> map2, z7<sk0> z7Var, Map<String, rk0> map3, List<wk0> list2) {
        this.j = rect;
        this.k = f;
        this.l = f2;
        this.m = f3;
        this.i = list;
        this.h = v7Var;
        this.c = map;
        this.d = map2;
        this.g = z7Var;
        this.e = map3;
        this.f = list2;
    }

    @i2({i2.a.LIBRARY})
    public lm0 x(long j) {
        return this.h.h(j);
    }

    @i2({i2.a.LIBRARY})
    public void y(boolean z) {
        this.n = z;
    }

    public void z(boolean z) {
        this.a.g(z);
    }
}