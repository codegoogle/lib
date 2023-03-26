package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import androidx.lifecycle.LiveData;
import com.p7700g.p99005.i2;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;

/* compiled from: InvalidationTracker.java */
/* loaded from: classes.dex */
public class t40 {
    private static final String[] a = {"UPDATE", "DELETE", "INSERT"};
    private static final String b = "room_table_modification_log";
    private static final String c = "table_id";
    private static final String d = "invalidated";
    private static final String e = "CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)";
    @r2
    public static final String f = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ";
    @r2
    public static final String g = "SELECT * FROM room_table_modification_log WHERE invalidated = 1;";
    @x1
    public final HashMap<String, Integer> h;
    public final String[] i;
    @x1
    private Map<String, Set<String>> j;
    public final d50 k;
    public AtomicBoolean l;
    private volatile boolean m;
    public volatile s60 n;
    private b o;
    private final s40 p;
    @r2
    @SuppressLint({"RestrictedApi"})
    public final l5<c, d> q;
    private v40 r;
    @r2
    public Runnable s;

    /* compiled from: InvalidationTracker.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        private Set<Integer> a() {
            HashSet hashSet = new HashSet();
            Cursor v = t40.this.k.v(new m60(t40.g));
            while (v.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(v.getInt(0)));
                } catch (Throwable th) {
                    v.close();
                    throw th;
                }
            }
            v.close();
            if (!hashSet.isEmpty()) {
                t40.this.n.z0();
            }
            return hashSet;
        }

        @Override // java.lang.Runnable
        public void run() {
            Lock k = t40.this.k.k();
            Set<Integer> set = null;
            try {
                k.lock();
            } catch (SQLiteException | IllegalStateException unused) {
            } catch (Throwable th) {
                k.unlock();
                throw th;
            }
            if (!t40.this.f()) {
                k.unlock();
            } else if (!t40.this.l.compareAndSet(true, false)) {
                k.unlock();
            } else if (t40.this.k.q()) {
                k.unlock();
            } else {
                d50 d50Var = t40.this.k;
                if (d50Var.i) {
                    n60 M0 = d50Var.m().M0();
                    M0.t();
                    try {
                        set = a();
                        M0.A0();
                        M0.W0();
                    } catch (Throwable th2) {
                        M0.W0();
                        throw th2;
                    }
                } else {
                    set = a();
                }
                k.unlock();
                if (set == null || set.isEmpty()) {
                    return;
                }
                synchronized (t40.this.q) {
                    Iterator<Map.Entry<c, d>> it = t40.this.q.iterator();
                    while (it.hasNext()) {
                        it.next().getValue().a(set);
                    }
                }
            }
        }
    }

    /* compiled from: InvalidationTracker.java */
    /* loaded from: classes.dex */
    public static class b {
        public static final int a = 0;
        public static final int b = 1;
        public static final int c = 2;
        public final long[] d;
        public final boolean[] e;
        public final int[] f;
        public boolean g;
        public boolean h;

        public b(int i) {
            long[] jArr = new long[i];
            this.d = jArr;
            boolean[] zArr = new boolean[i];
            this.e = zArr;
            this.f = new int[i];
            Arrays.fill(jArr, 0L);
            Arrays.fill(zArr, false);
        }

        @z1
        public int[] a() {
            synchronized (this) {
                if (this.g && !this.h) {
                    int length = this.d.length;
                    int i = 0;
                    while (true) {
                        int i2 = 1;
                        if (i < length) {
                            boolean z = this.d[i] > 0;
                            boolean[] zArr = this.e;
                            if (z != zArr[i]) {
                                int[] iArr = this.f;
                                if (!z) {
                                    i2 = 2;
                                }
                                iArr[i] = i2;
                            } else {
                                this.f[i] = 0;
                            }
                            zArr[i] = z;
                            i++;
                        } else {
                            this.h = true;
                            this.g = false;
                            return this.f;
                        }
                    }
                }
                return null;
            }
        }

        public boolean b(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long[] jArr = this.d;
                    long j = jArr[i];
                    jArr[i] = 1 + j;
                    if (j == 0) {
                        this.g = true;
                        z = true;
                    }
                }
            }
            return z;
        }

        public boolean c(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long[] jArr = this.d;
                    long j = jArr[i];
                    jArr[i] = j - 1;
                    if (j == 1) {
                        this.g = true;
                        z = true;
                    }
                }
            }
            return z;
        }

        public void d() {
            synchronized (this) {
                this.h = false;
            }
        }
    }

    /* compiled from: InvalidationTracker.java */
    /* loaded from: classes.dex */
    public static class d {
        public final int[] a;
        private final String[] b;
        public final c c;
        private final Set<String> d;

        public d(c cVar, int[] iArr, String[] strArr) {
            this.c = cVar;
            this.a = iArr;
            this.b = strArr;
            if (iArr.length == 1) {
                HashSet hashSet = new HashSet();
                hashSet.add(strArr[0]);
                this.d = Collections.unmodifiableSet(hashSet);
                return;
            }
            this.d = null;
        }

        public void a(Set<Integer> set) {
            int length = this.a.length;
            Set<String> set2 = null;
            for (int i = 0; i < length; i++) {
                if (set.contains(Integer.valueOf(this.a[i]))) {
                    if (length == 1) {
                        set2 = this.d;
                    } else {
                        if (set2 == null) {
                            set2 = new HashSet<>(length);
                        }
                        set2.add(this.b[i]);
                    }
                }
            }
            if (set2 != null) {
                this.c.b(set2);
            }
        }

        public void b(String[] strArr) {
            Set<String> set = null;
            if (this.b.length == 1) {
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (strArr[i].equalsIgnoreCase(this.b[0])) {
                        set = this.d;
                        break;
                    } else {
                        i++;
                    }
                }
            } else {
                HashSet hashSet = new HashSet();
                for (String str : strArr) {
                    String[] strArr2 = this.b;
                    int length2 = strArr2.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length2) {
                            String str2 = strArr2[i2];
                            if (str2.equalsIgnoreCase(str)) {
                                hashSet.add(str2);
                                break;
                            }
                            i2++;
                        }
                    }
                }
                if (hashSet.size() > 0) {
                    set = hashSet;
                }
            }
            if (set != null) {
                this.c.b(set);
            }
        }
    }

    /* compiled from: InvalidationTracker.java */
    /* loaded from: classes.dex */
    public static class e extends c {
        public final t40 b;
        public final WeakReference<c> c;

        public e(t40 t40Var, c cVar) {
            super(cVar.a);
            this.b = t40Var;
            this.c = new WeakReference<>(cVar);
        }

        @Override // com.p7700g.p99005.t40.c
        public void b(@x1 Set<String> set) {
            c cVar = this.c.get();
            if (cVar == null) {
                this.b.k(this);
            } else {
                cVar.b(set);
            }
        }
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public t40(d50 d50Var, String... strArr) {
        this(d50Var, new HashMap(), Collections.emptyMap(), strArr);
    }

    private static void c(StringBuilder sb, String str, String str2) {
        wo1.h0(sb, "`", "room_table_modification_trigger_", str, "_");
        sb.append(str2);
        sb.append("`");
    }

    private String[] l(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.j.containsKey(lowerCase)) {
                hashSet.addAll(this.j.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    private void n(n60 n60Var, int i) {
        String[] strArr;
        n60Var.I("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.i[i];
        StringBuilder sb = new StringBuilder();
        for (String str2 : a) {
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            c(sb, str, str2);
            wo1.h0(sb, " AFTER ", str2, " ON `", str);
            wo1.h0(sb, "` BEGIN UPDATE ", b, " SET ", d);
            wo1.h0(sb, " = 1", " WHERE ", c, " = ");
            sb.append(i);
            sb.append(" AND ");
            sb.append(d);
            sb.append(" = 0");
            sb.append("; END");
            n60Var.I(sb.toString());
        }
    }

    private void p(n60 n60Var, int i) {
        String[] strArr;
        String str = this.i[i];
        StringBuilder sb = new StringBuilder();
        for (String str2 : a) {
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            c(sb, str, str2);
            n60Var.I(sb.toString());
        }
    }

    private String[] s(String[] strArr) {
        String[] l = l(strArr);
        for (String str : l) {
            if (!this.h.containsKey(str.toLowerCase(Locale.US))) {
                throw new IllegalArgumentException(wo1.t("There is no table with name ", str));
            }
        }
        return l;
    }

    @s2
    @SuppressLint({"RestrictedApi"})
    public void a(@x1 c cVar) {
        d f2;
        String[] l = l(cVar.a);
        int[] iArr = new int[l.length];
        int length = l.length;
        for (int i = 0; i < length; i++) {
            Integer num = this.h.get(l[i].toLowerCase(Locale.US));
            if (num != null) {
                iArr[i] = num.intValue();
            } else {
                StringBuilder G = wo1.G("There is no table with name ");
                G.append(l[i]);
                throw new IllegalArgumentException(G.toString());
            }
        }
        d dVar = new d(cVar, iArr, l);
        synchronized (this.q) {
            f2 = this.q.f(cVar, dVar);
        }
        if (f2 == null && this.o.b(iArr)) {
            q();
        }
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public void b(c cVar) {
        a(new e(this, cVar));
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public <T> LiveData<T> d(String[] strArr, Callable<T> callable) {
        return e(strArr, false, callable);
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public <T> LiveData<T> e(String[] strArr, boolean z, Callable<T> callable) {
        return this.p.a(s(strArr), z, callable);
    }

    public boolean f() {
        if (this.k.u()) {
            if (!this.m) {
                this.k.m().M0();
            }
            return this.m;
        }
        return false;
    }

    public void g(n60 n60Var) {
        synchronized (this) {
            if (this.m) {
                return;
            }
            n60Var.I("PRAGMA temp_store = MEMORY;");
            n60Var.I("PRAGMA recursive_triggers='ON';");
            n60Var.I(e);
            r(n60Var);
            this.n = n60Var.R(f);
            this.m = true;
        }
    }

    @i2({i2.a.LIBRARY})
    @r2(otherwise = 3)
    public void h(String... strArr) {
        synchronized (this.q) {
            Iterator<Map.Entry<c, d>> it = this.q.iterator();
            while (it.hasNext()) {
                Map.Entry<c, d> next = it.next();
                if (!next.getKey().a()) {
                    next.getValue().b(strArr);
                }
            }
        }
    }

    public void i() {
        if (this.l.compareAndSet(false, true)) {
            this.k.n().execute(this.s);
        }
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @s2
    public void j() {
        q();
        this.s.run();
    }

    @s2
    @SuppressLint({"RestrictedApi"})
    public void k(@x1 c cVar) {
        d g2;
        synchronized (this.q) {
            g2 = this.q.g(cVar);
        }
        if (g2 == null || !this.o.c(g2.a)) {
            return;
        }
        q();
    }

    public void m(Context context, String str) {
        this.r = new v40(context, str, this, this.k.n());
    }

    public void o() {
        v40 v40Var = this.r;
        if (v40Var != null) {
            v40Var.a();
            this.r = null;
        }
    }

    public void q() {
        if (this.k.u()) {
            r(this.k.m().M0());
        }
    }

    public void r(n60 n60Var) {
        if (n60Var.t1()) {
            return;
        }
        while (true) {
            try {
                Lock k = this.k.k();
                k.lock();
                int[] a2 = this.o.a();
                if (a2 == null) {
                    k.unlock();
                    return;
                }
                int length = a2.length;
                n60Var.t();
                for (int i = 0; i < length; i++) {
                    int i2 = a2[i];
                    if (i2 == 1) {
                        n(n60Var, i);
                    } else if (i2 == 2) {
                        p(n60Var, i);
                    }
                }
                n60Var.A0();
                n60Var.W0();
                this.o.d();
                k.unlock();
            } catch (SQLiteException | IllegalStateException unused) {
                return;
            }
        }
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public t40(d50 d50Var, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.l = new AtomicBoolean(false);
        this.m = false;
        this.q = new l5<>();
        this.s = new a();
        this.k = d50Var;
        this.o = new b(strArr.length);
        this.h = new HashMap<>();
        this.j = map2;
        this.p = new s40(d50Var);
        int length = strArr.length;
        this.i = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.h.put(lowerCase, Integer.valueOf(i));
            String str2 = map.get(strArr[i]);
            if (str2 != null) {
                this.i[i] = str2.toLowerCase(locale);
            } else {
                this.i[i] = lowerCase;
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            Locale locale2 = Locale.US;
            String lowerCase2 = entry.getValue().toLowerCase(locale2);
            if (this.h.containsKey(lowerCase2)) {
                String lowerCase3 = entry.getKey().toLowerCase(locale2);
                HashMap<String, Integer> hashMap = this.h;
                hashMap.put(lowerCase3, hashMap.get(lowerCase2));
            }
        }
    }

    /* compiled from: InvalidationTracker.java */
    /* loaded from: classes.dex */
    public static abstract class c {
        public final String[] a;

        public c(@x1 String str, String... strArr) {
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length + 1);
            this.a = strArr2;
            strArr2[strArr.length] = str;
        }

        public boolean a() {
            return false;
        }

        public abstract void b(@x1 Set<String> set);

        public c(@x1 String[] strArr) {
            this.a = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
    }
}