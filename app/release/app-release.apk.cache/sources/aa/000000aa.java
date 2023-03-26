package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import com.p7700g.p99005.d0;
import com.p7700g.p99005.e0;
import com.p7700g.p99005.g0;
import com.p7700g.p99005.j0;
import com.p7700g.p99005.mz;
import com.p7700g.p99005.oz;
import com.p7700g.p99005.qz;
import com.p7700g.p99005.u1;
import com.p7700g.p99005.uf;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* loaded from: classes.dex */
public abstract class ActivityResultRegistry {
    private static final String a = "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS";
    private static final String b = "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS";
    private static final String c = "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS";
    private static final String d = "KEY_COMPONENT_ACTIVITY_PENDING_RESULT";
    private static final String e = "KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT";
    private static final String f = "ActivityResultRegistry";
    private static final int g = 65536;
    private Random h = new Random();
    private final Map<Integer, String> i = new HashMap();
    public final Map<String, Integer> j = new HashMap();
    private final Map<String, d> k = new HashMap();
    public ArrayList<String> l = new ArrayList<>();
    public final transient Map<String, c<?>> m = new HashMap();
    public final Map<String, Object> n = new HashMap();
    public final Bundle o = new Bundle();

    /* loaded from: classes.dex */
    public class a extends g0<I> {
        public final /* synthetic */ String a;
        public final /* synthetic */ j0 b;

        public a(String str, j0 j0Var) {
            this.a = str;
            this.b = j0Var;
        }

        @Override // com.p7700g.p99005.g0
        @x1
        public j0<I, ?> a() {
            return this.b;
        }

        @Override // com.p7700g.p99005.g0
        public void c(I i, @z1 uf ufVar) {
            Integer num = ActivityResultRegistry.this.j.get(this.a);
            if (num != null) {
                ActivityResultRegistry.this.l.add(this.a);
                try {
                    ActivityResultRegistry.this.f(num.intValue(), this.b, i, ufVar);
                    return;
                } catch (Exception e) {
                    ActivityResultRegistry.this.l.remove(this.a);
                    throw e;
                }
            }
            StringBuilder G = wo1.G("Attempting to launch an unregistered ActivityResultLauncher with contract ");
            G.append(this.b);
            G.append(" and input ");
            G.append(i);
            G.append(". You must ensure the ActivityResultLauncher is registered before calling launch().");
            throw new IllegalStateException(G.toString());
        }

        @Override // com.p7700g.p99005.g0
        public void d() {
            ActivityResultRegistry.this.l(this.a);
        }
    }

    /* loaded from: classes.dex */
    public class b extends g0<I> {
        public final /* synthetic */ String a;
        public final /* synthetic */ j0 b;

        public b(String str, j0 j0Var) {
            this.a = str;
            this.b = j0Var;
        }

        @Override // com.p7700g.p99005.g0
        @x1
        public j0<I, ?> a() {
            return this.b;
        }

        @Override // com.p7700g.p99005.g0
        public void c(I i, @z1 uf ufVar) {
            Integer num = ActivityResultRegistry.this.j.get(this.a);
            if (num != null) {
                ActivityResultRegistry.this.l.add(this.a);
                try {
                    ActivityResultRegistry.this.f(num.intValue(), this.b, i, ufVar);
                    return;
                } catch (Exception e) {
                    ActivityResultRegistry.this.l.remove(this.a);
                    throw e;
                }
            }
            StringBuilder G = wo1.G("Attempting to launch an unregistered ActivityResultLauncher with contract ");
            G.append(this.b);
            G.append(" and input ");
            G.append(i);
            G.append(". You must ensure the ActivityResultLauncher is registered before calling launch().");
            throw new IllegalStateException(G.toString());
        }

        @Override // com.p7700g.p99005.g0
        public void d() {
            ActivityResultRegistry.this.l(this.a);
        }
    }

    /* loaded from: classes.dex */
    public static class c<O> {
        public final e0<O> a;
        public final j0<?, O> b;

        public c(e0<O> e0Var, j0<?, O> j0Var) {
            this.a = e0Var;
            this.b = j0Var;
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public final mz a;
        private final ArrayList<oz> b = new ArrayList<>();

        public d(@x1 mz mzVar) {
            this.a = mzVar;
        }

        public void a(@x1 oz ozVar) {
            this.a.a(ozVar);
            this.b.add(ozVar);
        }

        public void b() {
            Iterator<oz> it = this.b.iterator();
            while (it.hasNext()) {
                this.a.c(it.next());
            }
            this.b.clear();
        }
    }

    private void a(int i, String str) {
        this.i.put(Integer.valueOf(i), str);
        this.j.put(str, Integer.valueOf(i));
    }

    private <O> void d(String str, int i, @z1 Intent intent, @z1 c<O> cVar) {
        if (cVar != null && cVar.a != null && this.l.contains(str)) {
            cVar.a.a(cVar.b.c(i, intent));
            this.l.remove(str);
            return;
        }
        this.n.remove(str);
        this.o.putParcelable(str, new d0(i, intent));
    }

    private int e() {
        int nextInt = this.h.nextInt(2147418112);
        while (true) {
            int i = nextInt + 65536;
            if (!this.i.containsKey(Integer.valueOf(i))) {
                return i;
            }
            nextInt = this.h.nextInt(2147418112);
        }
    }

    private void k(String str) {
        if (this.j.get(str) != null) {
            return;
        }
        a(e(), str);
    }

    @u1
    public final boolean b(int i, int i2, @z1 Intent intent) {
        String str = this.i.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        d(str, i2, intent, this.m.get(str));
        return true;
    }

    @u1
    public final <O> boolean c(int i, @SuppressLint({"UnknownNullness"}) O o) {
        e0<?> e0Var;
        String str = this.i.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        c<?> cVar = this.m.get(str);
        if (cVar != null && (e0Var = cVar.a) != null) {
            if (this.l.remove(str)) {
                e0Var.a(o);
                return true;
            }
            return true;
        }
        this.o.remove(str);
        this.n.put(str, o);
        return true;
    }

    @u1
    public abstract <I, O> void f(int i, @x1 j0<I, O> j0Var, @SuppressLint({"UnknownNullness"}) I i2, @z1 uf ufVar);

    public final void g(@z1 Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(a);
        ArrayList<String> stringArrayList = bundle.getStringArrayList(b);
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        this.l = bundle.getStringArrayList(c);
        this.h = (Random) bundle.getSerializable(e);
        this.o.putAll(bundle.getBundle(d));
        for (int i = 0; i < stringArrayList.size(); i++) {
            String str = stringArrayList.get(i);
            if (this.j.containsKey(str)) {
                Integer remove = this.j.remove(str);
                if (!this.o.containsKey(str)) {
                    this.i.remove(remove);
                }
            }
            a(integerArrayList.get(i).intValue(), stringArrayList.get(i));
        }
    }

    public final void h(@x1 Bundle bundle) {
        bundle.putIntegerArrayList(a, new ArrayList<>(this.j.values()));
        bundle.putStringArrayList(b, new ArrayList<>(this.j.keySet()));
        bundle.putStringArrayList(c, new ArrayList<>(this.l));
        bundle.putBundle(d, (Bundle) this.o.clone());
        bundle.putSerializable(e, this.h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @x1
    public final <I, O> g0<I> i(@x1 String str, @x1 j0<I, O> j0Var, @x1 e0<O> e0Var) {
        k(str);
        this.m.put(str, new c<>(e0Var, j0Var));
        if (this.n.containsKey(str)) {
            Object obj = this.n.get(str);
            this.n.remove(str);
            e0Var.a(obj);
        }
        d0 d0Var = (d0) this.o.getParcelable(str);
        if (d0Var != null) {
            this.o.remove(str);
            e0Var.a(j0Var.c(d0Var.d(), d0Var.c()));
        }
        return new b(str, j0Var);
    }

    @x1
    public final <I, O> g0<I> j(@x1 final String str, @x1 qz qzVar, @x1 final j0<I, O> j0Var, @x1 final e0<O> e0Var) {
        mz lifecycle = qzVar.getLifecycle();
        if (!lifecycle.b().a(mz.c.STARTED)) {
            k(str);
            d dVar = this.k.get(str);
            if (dVar == null) {
                dVar = new d(lifecycle);
            }
            dVar.a(new oz() { // from class: androidx.activity.result.ActivityResultRegistry.1
                @Override // com.p7700g.p99005.oz
                public void i(@x1 qz qzVar2, @x1 mz.b bVar) {
                    if (mz.b.ON_START.equals(bVar)) {
                        ActivityResultRegistry.this.m.put(str, new c<>(e0Var, j0Var));
                        if (ActivityResultRegistry.this.n.containsKey(str)) {
                            Object obj = ActivityResultRegistry.this.n.get(str);
                            ActivityResultRegistry.this.n.remove(str);
                            e0Var.a(obj);
                        }
                        d0 d0Var = (d0) ActivityResultRegistry.this.o.getParcelable(str);
                        if (d0Var != null) {
                            ActivityResultRegistry.this.o.remove(str);
                            e0Var.a(j0Var.c(d0Var.d(), d0Var.c()));
                        }
                    } else if (mz.b.ON_STOP.equals(bVar)) {
                        ActivityResultRegistry.this.m.remove(str);
                    } else if (mz.b.ON_DESTROY.equals(bVar)) {
                        ActivityResultRegistry.this.l(str);
                    }
                }
            });
            this.k.put(str, dVar);
            return new a(str, j0Var);
        }
        throw new IllegalStateException("LifecycleOwner " + qzVar + " is attempting to register while current state is " + lifecycle.b() + ". LifecycleOwners must call register before they are STARTED.");
    }

    @u1
    public final void l(@x1 String str) {
        Integer remove;
        if (!this.l.contains(str) && (remove = this.j.remove(str)) != null) {
            this.i.remove(remove);
        }
        this.m.remove(str);
        if (this.n.containsKey(str)) {
            StringBuilder M = wo1.M("Dropping pending result for request ", str, ": ");
            M.append(this.n.get(str));
            M.toString();
            this.n.remove(str);
        }
        if (this.o.containsKey(str)) {
            StringBuilder M2 = wo1.M("Dropping pending result for request ", str, ": ");
            M2.append(this.o.getParcelable(str));
            M2.toString();
            this.o.remove(str);
        }
        d dVar = this.k.get(str);
        if (dVar != null) {
            dVar.b();
            this.k.remove(str);
        }
    }
}