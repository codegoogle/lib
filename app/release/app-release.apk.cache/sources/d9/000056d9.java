package com.p7700g.p99005;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.ou;
import com.p7700g.p99005.pu;
import java.util.ArrayList;

/* compiled from: DynamicAnimation.java */
/* loaded from: classes.dex */
public abstract class pu<T extends pu<T>> implements ou.b {
    public static final s a = new g("translationX");
    public static final s b = new h("translationY");
    public static final s c = new i("translationZ");
    public static final s d = new j("scaleX");
    public static final s e = new k("scaleY");
    public static final s f = new l(td.d);
    public static final s g = new m("rotationX");
    public static final s h = new n("rotationY");
    public static final s i = new o("x");
    public static final s j = new a("y");
    public static final s k = new b("z");
    public static final s l = new c("alpha");
    public static final s m = new d("scrollX");
    public static final s n = new e("scrollY");
    public static final float o = 1.0f;
    public static final float p = 0.1f;
    public static final float q = 0.00390625f;
    public static final float r = 0.002f;
    private static final float s = Float.MAX_VALUE;
    private static final float t = 0.75f;
    public float A;
    public float B;
    private long C;
    private float D;
    private final ArrayList<q> E;
    private final ArrayList<r> F;
    public float u;
    public float v;
    public boolean w;
    public final Object x;
    public final ru y;
    public boolean z;

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    public static class a extends s {
        public a(String str) {
            super(str, null);
        }

        @Override // com.p7700g.p99005.ru
        /* renamed from: d */
        public float b(View view) {
            return view.getY();
        }

        @Override // com.p7700g.p99005.ru
        /* renamed from: e */
        public void c(View view, float f) {
            view.setY(f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    public static class b extends s {
        public b(String str) {
            super(str, null);
        }

        @Override // com.p7700g.p99005.ru
        /* renamed from: d */
        public float b(View view) {
            return sr.E0(view);
        }

        @Override // com.p7700g.p99005.ru
        /* renamed from: e */
        public void c(View view, float f) {
            sr.A2(view, f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    public static class c extends s {
        public c(String str) {
            super(str, null);
        }

        @Override // com.p7700g.p99005.ru
        /* renamed from: d */
        public float b(View view) {
            return view.getAlpha();
        }

        @Override // com.p7700g.p99005.ru
        /* renamed from: e */
        public void c(View view, float f) {
            view.setAlpha(f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    public static class d extends s {
        public d(String str) {
            super(str, null);
        }

        @Override // com.p7700g.p99005.ru
        /* renamed from: d */
        public float b(View view) {
            return view.getScrollX();
        }

        @Override // com.p7700g.p99005.ru
        /* renamed from: e */
        public void c(View view, float f) {
            view.setScrollX((int) f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    public static class e extends s {
        public e(String str) {
            super(str, null);
        }

        @Override // com.p7700g.p99005.ru
        /* renamed from: d */
        public float b(View view) {
            return view.getScrollY();
        }

        @Override // com.p7700g.p99005.ru
        /* renamed from: e */
        public void c(View view, float f) {
            view.setScrollY((int) f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    public class f extends ru {
        public final /* synthetic */ su b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, su suVar) {
            super(str);
            this.b = suVar;
        }

        @Override // com.p7700g.p99005.ru
        public float b(Object obj) {
            return this.b.a();
        }

        @Override // com.p7700g.p99005.ru
        public void c(Object obj, float f) {
            this.b.b(f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    public static class g extends s {
        public g(String str) {
            super(str, null);
        }

        @Override // com.p7700g.p99005.ru
        /* renamed from: d */
        public float b(View view) {
            return view.getTranslationX();
        }

        @Override // com.p7700g.p99005.ru
        /* renamed from: e */
        public void c(View view, float f) {
            view.setTranslationX(f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    public static class h extends s {
        public h(String str) {
            super(str, null);
        }

        @Override // com.p7700g.p99005.ru
        /* renamed from: d */
        public float b(View view) {
            return view.getTranslationY();
        }

        @Override // com.p7700g.p99005.ru
        /* renamed from: e */
        public void c(View view, float f) {
            view.setTranslationY(f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    public static class i extends s {
        public i(String str) {
            super(str, null);
        }

        @Override // com.p7700g.p99005.ru
        /* renamed from: d */
        public float b(View view) {
            return sr.z0(view);
        }

        @Override // com.p7700g.p99005.ru
        /* renamed from: e */
        public void c(View view, float f) {
            sr.v2(view, f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    public static class j extends s {
        public j(String str) {
            super(str, null);
        }

        @Override // com.p7700g.p99005.ru
        /* renamed from: d */
        public float b(View view) {
            return view.getScaleX();
        }

        @Override // com.p7700g.p99005.ru
        /* renamed from: e */
        public void c(View view, float f) {
            view.setScaleX(f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    public static class k extends s {
        public k(String str) {
            super(str, null);
        }

        @Override // com.p7700g.p99005.ru
        /* renamed from: d */
        public float b(View view) {
            return view.getScaleY();
        }

        @Override // com.p7700g.p99005.ru
        /* renamed from: e */
        public void c(View view, float f) {
            view.setScaleY(f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    public static class l extends s {
        public l(String str) {
            super(str, null);
        }

        @Override // com.p7700g.p99005.ru
        /* renamed from: d */
        public float b(View view) {
            return view.getRotation();
        }

        @Override // com.p7700g.p99005.ru
        /* renamed from: e */
        public void c(View view, float f) {
            view.setRotation(f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    public static class m extends s {
        public m(String str) {
            super(str, null);
        }

        @Override // com.p7700g.p99005.ru
        /* renamed from: d */
        public float b(View view) {
            return view.getRotationX();
        }

        @Override // com.p7700g.p99005.ru
        /* renamed from: e */
        public void c(View view, float f) {
            view.setRotationX(f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    public static class n extends s {
        public n(String str) {
            super(str, null);
        }

        @Override // com.p7700g.p99005.ru
        /* renamed from: d */
        public float b(View view) {
            return view.getRotationY();
        }

        @Override // com.p7700g.p99005.ru
        /* renamed from: e */
        public void c(View view, float f) {
            view.setRotationY(f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    public static class o extends s {
        public o(String str) {
            super(str, null);
        }

        @Override // com.p7700g.p99005.ru
        /* renamed from: d */
        public float b(View view) {
            return view.getX();
        }

        @Override // com.p7700g.p99005.ru
        /* renamed from: e */
        public void c(View view, float f) {
            view.setX(f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    public static class p {
        public float a;
        public float b;
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    public interface q {
        void a(pu puVar, boolean z, float f, float f2);
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    public interface r {
        void a(pu puVar, float f, float f2);
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    public static abstract class s extends ru<View> {
        public /* synthetic */ s(String str, g gVar) {
            this(str);
        }

        private s(String str) {
            super(str);
        }
    }

    public pu(su suVar) {
        this.u = 0.0f;
        this.v = Float.MAX_VALUE;
        this.w = false;
        this.z = false;
        this.A = Float.MAX_VALUE;
        this.B = -Float.MAX_VALUE;
        this.C = 0L;
        this.E = new ArrayList<>();
        this.F = new ArrayList<>();
        this.x = null;
        this.y = new f("FloatValueHolder", suVar);
        this.D = 1.0f;
    }

    private void e(boolean z) {
        this.z = false;
        ou.e().h(this);
        this.C = 0L;
        this.w = false;
        for (int i2 = 0; i2 < this.E.size(); i2++) {
            if (this.E.get(i2) != null) {
                this.E.get(i2).a(this, z, this.v, this.u);
            }
        }
        n(this.E);
    }

    private float h() {
        return this.y.b(this.x);
    }

    private static <T> void m(ArrayList<T> arrayList, T t2) {
        int indexOf = arrayList.indexOf(t2);
        if (indexOf >= 0) {
            arrayList.set(indexOf, null);
        }
    }

    private static <T> void n(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    private void x() {
        if (this.z) {
            return;
        }
        this.z = true;
        if (!this.w) {
            this.v = h();
        }
        float f2 = this.v;
        if (f2 <= this.A && f2 >= this.B) {
            ou.e().a(this, 0L);
            return;
        }
        throw new IllegalArgumentException("Starting value need to be in between min value and max value");
    }

    @Override // com.p7700g.p99005.ou.b
    @i2({i2.a.LIBRARY})
    public boolean a(long j2) {
        long j3 = this.C;
        if (j3 == 0) {
            this.C = j2;
            s(this.v);
            return false;
        }
        this.C = j2;
        boolean y = y(j2 - j3);
        float min = Math.min(this.v, this.A);
        this.v = min;
        float max = Math.max(min, this.B);
        this.v = max;
        s(max);
        if (y) {
            e(false);
        }
        return y;
    }

    public T b(q qVar) {
        if (!this.E.contains(qVar)) {
            this.E.add(qVar);
        }
        return this;
    }

    public T c(r rVar) {
        if (!k()) {
            if (!this.F.contains(rVar)) {
                this.F.add(rVar);
            }
            return this;
        }
        throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
    }

    public void d() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.z) {
                e(true);
                return;
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
    }

    public abstract float f(float f2, float f3);

    public float g() {
        return this.D;
    }

    public float i() {
        return this.D * 0.75f;
    }

    public abstract boolean j(float f2, float f3);

    public boolean k() {
        return this.z;
    }

    public void l(q qVar) {
        m(this.E, qVar);
    }

    public void o(r rVar) {
        m(this.F, rVar);
    }

    public T p(float f2) {
        this.A = f2;
        return this;
    }

    public T q(float f2) {
        this.B = f2;
        return this;
    }

    public T r(@g1(from = 0.0d, fromInclusive = false) float f2) {
        if (f2 > 0.0f) {
            this.D = f2;
            v(f2 * 0.75f);
            return this;
        }
        throw new IllegalArgumentException("Minimum visible change must be positive.");
    }

    public void s(float f2) {
        this.y.c(this.x, f2);
        for (int i2 = 0; i2 < this.F.size(); i2++) {
            if (this.F.get(i2) != null) {
                this.F.get(i2).a(this, this.v, this.u);
            }
        }
        n(this.F);
    }

    public T t(float f2) {
        this.v = f2;
        this.w = true;
        return this;
    }

    public T u(float f2) {
        this.u = f2;
        return this;
    }

    public abstract void v(float f2);

    public void w() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.z) {
                return;
            }
            x();
            return;
        }
        throw new AndroidRuntimeException("Animations may only be started on the main thread");
    }

    public abstract boolean y(long j2);

    public <K> pu(K k2, ru<K> ruVar) {
        this.u = 0.0f;
        this.v = Float.MAX_VALUE;
        this.w = false;
        this.z = false;
        this.A = Float.MAX_VALUE;
        this.B = -Float.MAX_VALUE;
        this.C = 0L;
        this.E = new ArrayList<>();
        this.F = new ArrayList<>();
        this.x = k2;
        this.y = ruVar;
        if (ruVar != f && ruVar != g && ruVar != h) {
            if (ruVar == l) {
                this.D = 0.00390625f;
                return;
            } else if (ruVar != d && ruVar != e) {
                this.D = 1.0f;
                return;
            } else {
                this.D = 0.00390625f;
                return;
            }
        }
        this.D = 0.1f;
    }
}