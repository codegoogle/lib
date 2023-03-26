package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import androidx.appcompat.widget.ActivityChooserModel;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.o60;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: RoomDatabase.java */
/* loaded from: classes.dex */
public abstract class d50 {
    private static final String a = "_Impl";
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public static final int b = 999;
    @Deprecated
    public volatile n60 c;
    private Executor d;
    private Executor e;
    private o60 f;
    private boolean h;
    public boolean i;
    @z1
    @Deprecated
    public List<b> j;
    private final ReentrantReadWriteLock k = new ReentrantReadWriteLock();
    private final ThreadLocal<Integer> l = new ThreadLocal<>();
    private final Map<String, Object> m = new ConcurrentHashMap();
    private final t40 g = g();

    /* compiled from: RoomDatabase.java */
    /* loaded from: classes.dex */
    public static class a<T extends d50> {
        private final Class<T> a;
        private final String b;
        private final Context c;
        private ArrayList<b> d;
        private Executor e;
        private Executor f;
        private o60.c g;
        private boolean h;
        private boolean j;
        private boolean l;
        private Set<Integer> n;
        private Set<Integer> o;
        private String p;
        private File q;
        private c i = c.AUTOMATIC;
        private boolean k = true;
        private final d m = new d();

        public a(@x1 Context context, @x1 Class<T> cls, @z1 String str) {
            this.c = context;
            this.a = cls;
            this.b = str;
        }

        @x1
        public a<T> a(@x1 b bVar) {
            if (this.d == null) {
                this.d = new ArrayList<>();
            }
            this.d.add(bVar);
            return this;
        }

        @x1
        public a<T> b(@x1 s50... s50VarArr) {
            if (this.o == null) {
                this.o = new HashSet();
            }
            for (s50 s50Var : s50VarArr) {
                this.o.add(Integer.valueOf(s50Var.a));
                this.o.add(Integer.valueOf(s50Var.b));
            }
            this.m.b(s50VarArr);
            return this;
        }

        @x1
        public a<T> c() {
            this.h = true;
            return this;
        }

        @x1
        @SuppressLint({"RestrictedApi"})
        public T d() {
            Executor executor;
            if (this.c != null) {
                if (this.a != null) {
                    Executor executor2 = this.e;
                    if (executor2 == null && this.f == null) {
                        Executor e = h5.e();
                        this.f = e;
                        this.e = e;
                    } else if (executor2 != null && this.f == null) {
                        this.f = executor2;
                    } else if (executor2 == null && (executor = this.f) != null) {
                        this.e = executor;
                    }
                    Set<Integer> set = this.o;
                    if (set != null && this.n != null) {
                        for (Integer num : set) {
                            if (this.n.contains(num)) {
                                throw new IllegalArgumentException("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + num);
                            }
                        }
                    }
                    if (this.g == null) {
                        this.g = new v60();
                    }
                    String str = this.p;
                    if (str != null || this.q != null) {
                        if (this.b != null) {
                            if (str != null && this.q != null) {
                                throw new IllegalArgumentException("Both createFromAsset() and createFromFile() was called on this Builder but the database can only be created using one of the two configurations.");
                            }
                            this.g = new k50(str, this.q, this.g);
                        } else {
                            throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                        }
                    }
                    Context context = this.c;
                    c40 c40Var = new c40(context, this.b, this.g, this.m, this.d, this.h, this.i.b(context), this.e, this.f, this.j, this.k, this.l, this.n, this.p, this.q);
                    T t = (T) c50.b(this.a, d50.a);
                    t.r(c40Var);
                    return t;
                }
                throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
            }
            throw new IllegalArgumentException("Cannot provide null context for the database.");
        }

        @x1
        public a<T> e(@x1 String str) {
            this.p = str;
            return this;
        }

        @x1
        public a<T> f(@x1 File file) {
            this.q = file;
            return this;
        }

        @x1
        public a<T> g() {
            this.j = this.b != null;
            return this;
        }

        @x1
        public a<T> h() {
            this.k = false;
            this.l = true;
            return this;
        }

        @x1
        public a<T> i(int... iArr) {
            if (this.n == null) {
                this.n = new HashSet(iArr.length);
            }
            for (int i : iArr) {
                this.n.add(Integer.valueOf(i));
            }
            return this;
        }

        @x1
        public a<T> j() {
            this.k = true;
            this.l = true;
            return this;
        }

        @x1
        public a<T> k(@z1 o60.c cVar) {
            this.g = cVar;
            return this;
        }

        @x1
        public a<T> l(@x1 c cVar) {
            this.i = cVar;
            return this;
        }

        @x1
        public a<T> m(@x1 Executor executor) {
            this.e = executor;
            return this;
        }

        @x1
        public a<T> n(@x1 Executor executor) {
            this.f = executor;
            return this;
        }
    }

    /* compiled from: RoomDatabase.java */
    /* loaded from: classes.dex */
    public static abstract class b {
        public void a(@x1 n60 n60Var) {
        }

        public void b(@x1 n60 n60Var) {
        }

        public void c(@x1 n60 n60Var) {
        }
    }

    /* compiled from: RoomDatabase.java */
    /* loaded from: classes.dex */
    public enum c {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private static boolean a(@x1 ActivityManager activityManager) {
            return activityManager.isLowRamDevice();
        }

        @SuppressLint({"NewApi"})
        public c b(Context context) {
            if (this != AUTOMATIC) {
                return this;
            }
            ActivityManager activityManager = (ActivityManager) context.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            if (activityManager != null && !a(activityManager)) {
                return WRITE_AHEAD_LOGGING;
            }
            return TRUNCATE;
        }
    }

    /* compiled from: RoomDatabase.java */
    /* loaded from: classes.dex */
    public static class d {
        private HashMap<Integer, TreeMap<Integer, s50>> a = new HashMap<>();

        private void a(s50 s50Var) {
            int i = s50Var.a;
            int i2 = s50Var.b;
            TreeMap<Integer, s50> treeMap = this.a.get(Integer.valueOf(i));
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                this.a.put(Integer.valueOf(i), treeMap);
            }
            s50 s50Var2 = treeMap.get(Integer.valueOf(i2));
            if (s50Var2 != null) {
                String str = "Overriding migration " + s50Var2 + " with " + s50Var;
            }
            treeMap.put(Integer.valueOf(i2), s50Var);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0016 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private List<s50> d(List<s50> list, boolean z, int i, int i2) {
            TreeMap<Integer, s50> treeMap;
            Set<Integer> keySet;
            boolean z2;
            do {
                if (z) {
                    if (i >= i2) {
                        return list;
                    }
                    treeMap = this.a.get(Integer.valueOf(i));
                    if (treeMap == null) {
                        if (z) {
                            keySet = treeMap.descendingKeySet();
                        } else {
                            keySet = treeMap.keySet();
                        }
                        Iterator<Integer> it = keySet.iterator();
                        while (true) {
                            z2 = true;
                            boolean z3 = false;
                            if (!it.hasNext()) {
                                z2 = false;
                                continue;
                                break;
                            }
                            int intValue = it.next().intValue();
                            if (!z ? !(intValue < i2 || intValue >= i) : !(intValue > i2 || intValue <= i)) {
                                z3 = true;
                                continue;
                            }
                            if (z3) {
                                list.add(treeMap.get(Integer.valueOf(intValue)));
                                i = intValue;
                                continue;
                                break;
                            }
                        }
                    } else {
                        return null;
                    }
                } else {
                    if (i <= i2) {
                        return list;
                    }
                    treeMap = this.a.get(Integer.valueOf(i));
                    if (treeMap == null) {
                    }
                }
            } while (z2);
            return null;
        }

        public void b(@x1 s50... s50VarArr) {
            for (s50 s50Var : s50VarArr) {
                a(s50Var);
            }
        }

        @z1
        public List<s50> c(int i, int i2) {
            if (i == i2) {
                return Collections.emptyList();
            }
            return d(new ArrayList(), i2 > i, i, i2);
        }
    }

    private static boolean t() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Deprecated
    public void A() {
        this.f.M0().A0();
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public void a() {
        if (!this.h && t()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    @i2({i2.a.LIBRARY_GROUP})
    public void b() {
        if (!q() && this.l.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    public void c() {
        a();
        n60 M0 = this.f.M0();
        this.g.r(M0);
        M0.t();
    }

    @s2
    public abstract void d();

    public void e() {
        if (u()) {
            ReentrantReadWriteLock.WriteLock writeLock = this.k.writeLock();
            try {
                writeLock.lock();
                this.g.o();
                this.f.close();
            } finally {
                writeLock.unlock();
            }
        }
    }

    public s60 f(@x1 String str) {
        a();
        b();
        return this.f.M0().R(str);
    }

    @x1
    public abstract t40 g();

    @x1
    public abstract o60 h(c40 c40Var);

    @Deprecated
    public void i() {
        this.f.M0().W0();
        if (q()) {
            return;
        }
        this.g.i();
    }

    @i2({i2.a.LIBRARY_GROUP})
    public Map<String, Object> j() {
        return this.m;
    }

    public Lock k() {
        return this.k.readLock();
    }

    @x1
    public t40 l() {
        return this.g;
    }

    @x1
    public o60 m() {
        return this.f;
    }

    @x1
    public Executor n() {
        return this.d;
    }

    @i2({i2.a.LIBRARY_GROUP})
    public ThreadLocal<Integer> o() {
        return this.l;
    }

    @x1
    public Executor p() {
        return this.e;
    }

    public boolean q() {
        return this.f.M0().t1();
    }

    @t0
    public void r(@x1 c40 c40Var) {
        o60 h = h(c40Var);
        this.f = h;
        if (h instanceof j50) {
            ((j50) h).b(c40Var);
        }
        boolean z = c40Var.g == c.WRITE_AHEAD_LOGGING;
        this.f.setWriteAheadLoggingEnabled(z);
        this.j = c40Var.e;
        this.d = c40Var.h;
        this.e = new o50(c40Var.i);
        this.h = c40Var.f;
        this.i = z;
        if (c40Var.j) {
            this.g.m(c40Var.b, c40Var.c);
        }
    }

    public void s(@x1 n60 n60Var) {
        this.g.g(n60Var);
    }

    public boolean u() {
        n60 n60Var = this.c;
        return n60Var != null && n60Var.isOpen();
    }

    @x1
    public Cursor v(@x1 q60 q60Var) {
        return w(q60Var, null);
    }

    @x1
    public Cursor w(@x1 q60 q60Var, @z1 CancellationSignal cancellationSignal) {
        a();
        b();
        if (cancellationSignal != null) {
            return this.f.M0().h0(q60Var, cancellationSignal);
        }
        return this.f.M0().k1(q60Var);
    }

    @x1
    public Cursor x(@x1 String str, @z1 Object[] objArr) {
        return this.f.M0().k1(new m60(str, objArr));
    }

    public <V> V y(@x1 Callable<V> callable) {
        c();
        try {
            try {
                V call = callable.call();
                A();
                i();
                return call;
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
                z50.a(e2);
                i();
                return null;
            }
        } catch (Throwable th) {
            i();
            throw th;
        }
    }

    public void z(@x1 Runnable runnable) {
        c();
        try {
            runnable.run();
            A();
        } finally {
            i();
        }
    }
}