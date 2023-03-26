package com.p7700g.p99005;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.p7700g.p99005.mz;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* compiled from: FragmentTransaction.java */
/* loaded from: classes.dex */
public abstract class dy {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = 6;
    public static final int h = 7;
    public static final int i = 8;
    public static final int j = 9;
    public static final int k = 10;
    public static final int l = 4096;
    public static final int m = 8192;
    public static final int n = -1;
    public static final int o = 0;
    public static final int p = 4097;
    public static final int q = 8194;
    public static final int r = 4099;
    public boolean A;
    public boolean B;
    @z1
    public String C;
    public int D;
    public CharSequence E;
    public int F;
    public CharSequence G;
    public ArrayList<String> H;
    public ArrayList<String> I;
    public boolean J;
    public ArrayList<Runnable> K;
    private final lx s;
    private final ClassLoader t;
    public ArrayList<a> u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    /* compiled from: FragmentTransaction.java */
    /* loaded from: classes.dex */
    public static final class a {
        public int a;
        public Fragment b;
        public int c;
        public int d;
        public int e;
        public int f;
        public mz.c g;
        public mz.c h;

        public a() {
        }

        public a(int i, Fragment fragment) {
            this.a = i;
            this.b = fragment;
            mz.c cVar = mz.c.RESUMED;
            this.g = cVar;
            this.h = cVar;
        }

        public a(int i, @x1 Fragment fragment, mz.c cVar) {
            this.a = i;
            this.b = fragment;
            this.g = fragment.mMaxState;
            this.h = cVar;
        }
    }

    @Deprecated
    public dy() {
        this.u = new ArrayList<>();
        this.B = true;
        this.J = false;
        this.s = null;
        this.t = null;
    }

    @x1
    private Fragment u(@x1 Class<? extends Fragment> cls, @z1 Bundle bundle) {
        lx lxVar = this.s;
        if (lxVar != null) {
            ClassLoader classLoader = this.t;
            if (classLoader != null) {
                Fragment a2 = lxVar.a(classLoader, cls.getName());
                if (bundle != null) {
                    a2.setArguments(bundle);
                }
                return a2;
            }
            throw new IllegalStateException("The FragmentManager must be attached to itshost to create a Fragment");
        }
        throw new IllegalStateException("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
    }

    public boolean A() {
        return this.u.isEmpty();
    }

    @x1
    public dy B(@x1 Fragment fragment) {
        m(new a(3, fragment));
        return this;
    }

    @x1
    public dy C(@m1 int i2, @x1 Fragment fragment) {
        return D(i2, fragment, null);
    }

    @x1
    public dy D(@m1 int i2, @x1 Fragment fragment, @z1 String str) {
        if (i2 != 0) {
            x(i2, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    @x1
    public final dy E(@m1 int i2, @x1 Class<? extends Fragment> cls, @z1 Bundle bundle) {
        return F(i2, cls, bundle, null);
    }

    @x1
    public final dy F(@m1 int i2, @x1 Class<? extends Fragment> cls, @z1 Bundle bundle, @z1 String str) {
        return D(i2, u(cls, bundle), str);
    }

    @x1
    public dy G(@x1 Runnable runnable) {
        w();
        if (this.K == null) {
            this.K = new ArrayList<>();
        }
        this.K.add(runnable);
        return this;
    }

    @x1
    @Deprecated
    public dy H(boolean z) {
        return Q(z);
    }

    @x1
    @Deprecated
    public dy I(@l2 int i2) {
        this.F = i2;
        this.G = null;
        return this;
    }

    @x1
    @Deprecated
    public dy J(@z1 CharSequence charSequence) {
        this.F = 0;
        this.G = charSequence;
        return this;
    }

    @x1
    @Deprecated
    public dy K(@l2 int i2) {
        this.D = i2;
        this.E = null;
        return this;
    }

    @x1
    @Deprecated
    public dy L(@z1 CharSequence charSequence) {
        this.D = 0;
        this.E = charSequence;
        return this;
    }

    @x1
    public dy M(@l0 @m0 int i2, @l0 @m0 int i3) {
        return N(i2, i3, 0, 0);
    }

    @x1
    public dy N(@l0 @m0 int i2, @l0 @m0 int i3, @l0 @m0 int i4, @l0 @m0 int i5) {
        this.v = i2;
        this.w = i3;
        this.x = i4;
        this.y = i5;
        return this;
    }

    @x1
    public dy O(@x1 Fragment fragment, @x1 mz.c cVar) {
        m(new a(10, fragment, cVar));
        return this;
    }

    @x1
    public dy P(@z1 Fragment fragment) {
        m(new a(8, fragment));
        return this;
    }

    @x1
    public dy Q(boolean z) {
        this.J = z;
        return this;
    }

    @x1
    public dy R(int i2) {
        this.z = i2;
        return this;
    }

    @x1
    @Deprecated
    public dy S(@m2 int i2) {
        return this;
    }

    @x1
    public dy T(@x1 Fragment fragment) {
        m(new a(5, fragment));
        return this;
    }

    @x1
    public dy f(@m1 int i2, @x1 Fragment fragment) {
        x(i2, fragment, null, 1);
        return this;
    }

    @x1
    public dy g(@m1 int i2, @x1 Fragment fragment, @z1 String str) {
        x(i2, fragment, str, 1);
        return this;
    }

    @x1
    public final dy h(@m1 int i2, @x1 Class<? extends Fragment> cls, @z1 Bundle bundle) {
        return f(i2, u(cls, bundle));
    }

    @x1
    public final dy i(@m1 int i2, @x1 Class<? extends Fragment> cls, @z1 Bundle bundle, @z1 String str) {
        return g(i2, u(cls, bundle), str);
    }

    public dy j(@x1 ViewGroup viewGroup, @x1 Fragment fragment, @z1 String str) {
        fragment.mContainer = viewGroup;
        return g(viewGroup.getId(), fragment, str);
    }

    @x1
    public dy k(@x1 Fragment fragment, @z1 String str) {
        x(0, fragment, str, 1);
        return this;
    }

    @x1
    public final dy l(@x1 Class<? extends Fragment> cls, @z1 Bundle bundle, @z1 String str) {
        return k(u(cls, bundle), str);
    }

    public void m(a aVar) {
        this.u.add(aVar);
        aVar.c = this.v;
        aVar.d = this.w;
        aVar.e = this.x;
        aVar.f = this.y;
    }

    @x1
    public dy n(@x1 View view, @x1 String str) {
        if (ey.D()) {
            String w0 = sr.w0(view);
            if (w0 != null) {
                if (this.H == null) {
                    this.H = new ArrayList<>();
                    this.I = new ArrayList<>();
                } else if (!this.I.contains(str)) {
                    if (this.H.contains(w0)) {
                        throw new IllegalArgumentException(wo1.u("A shared element with the source name '", w0, "' has already been added to the transaction."));
                    }
                } else {
                    throw new IllegalArgumentException(wo1.u("A shared element with the target name '", str, "' has already been added to the transaction."));
                }
                this.H.add(w0);
                this.I.add(str);
            } else {
                throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
            }
        }
        return this;
    }

    @x1
    public dy o(@z1 String str) {
        if (this.B) {
            this.A = true;
            this.C = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    @x1
    public dy p(@x1 Fragment fragment) {
        m(new a(7, fragment));
        return this;
    }

    public abstract int q();

    public abstract int r();

    public abstract void s();

    public abstract void t();

    @x1
    public dy v(@x1 Fragment fragment) {
        m(new a(6, fragment));
        return this;
    }

    @x1
    public dy w() {
        if (!this.A) {
            this.B = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public void x(int i2, Fragment fragment, @z1 String str, int i3) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                String str2 = fragment.mTag;
                if (str2 != null && !str.equals(str2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Can't change tag of fragment ");
                    sb.append(fragment);
                    sb.append(": was ");
                    throw new IllegalStateException(wo1.D(sb, fragment.mTag, " now ", str));
                }
                fragment.mTag = str;
            }
            if (i2 != 0) {
                if (i2 != -1) {
                    int i4 = fragment.mFragmentId;
                    if (i4 != 0 && i4 != i2) {
                        throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i2);
                    }
                    fragment.mFragmentId = i2;
                    fragment.mContainerId = i2;
                } else {
                    throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
                }
            }
            m(new a(i3, fragment));
            return;
        }
        StringBuilder G = wo1.G("Fragment ");
        G.append(cls.getCanonicalName());
        G.append(" must be a public static class to be  properly recreated from instance state.");
        throw new IllegalStateException(G.toString());
    }

    @x1
    public dy y(@x1 Fragment fragment) {
        m(new a(4, fragment));
        return this;
    }

    public boolean z() {
        return this.B;
    }

    public dy(@x1 lx lxVar, @z1 ClassLoader classLoader) {
        this.u = new ArrayList<>();
        this.B = true;
        this.J = false;
        this.s = lxVar;
        this.t = classLoader;
    }
}