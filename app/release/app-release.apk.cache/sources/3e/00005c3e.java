package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import com.p7700g.p99005.tn;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: FontRequestWorker.java */
/* loaded from: classes.dex */
public class sn {
    public static final w7<String, Typeface> a = new w7<>(16);
    private static final ExecutorService b = un.a("fonts-androidx", 10, 10000);
    public static final Object c = new Object();
    @k1("LOCK")
    public static final y7<String, ArrayList<vo<e>>> d = new y7<>();

    /* compiled from: FontRequestWorker.java */
    /* loaded from: classes.dex */
    public class a implements Callable<e> {
        public final /* synthetic */ String a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ rn c;
        public final /* synthetic */ int d;

        public a(String str, Context context, rn rnVar, int i) {
            this.a = str;
            this.b = context;
            this.c = rnVar;
            this.d = i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public e call() {
            return sn.c(this.a, this.b, this.c, this.d);
        }
    }

    /* compiled from: FontRequestWorker.java */
    /* loaded from: classes.dex */
    public class b implements vo<e> {
        public final /* synthetic */ nn s;

        public b(nn nnVar) {
            this.s = nnVar;
        }

        @Override // com.p7700g.p99005.vo
        /* renamed from: a */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.s.b(eVar);
        }
    }

    /* compiled from: FontRequestWorker.java */
    /* loaded from: classes.dex */
    public class c implements Callable<e> {
        public final /* synthetic */ String a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ rn c;
        public final /* synthetic */ int d;

        public c(String str, Context context, rn rnVar, int i) {
            this.a = str;
            this.b = context;
            this.c = rnVar;
            this.d = i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public e call() {
            try {
                return sn.c(this.a, this.b, this.c, this.d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    /* compiled from: FontRequestWorker.java */
    /* loaded from: classes.dex */
    public class d implements vo<e> {
        public final /* synthetic */ String s;

        public d(String str) {
            this.s = str;
        }

        @Override // com.p7700g.p99005.vo
        /* renamed from: a */
        public void accept(e eVar) {
            synchronized (sn.c) {
                y7<String, ArrayList<vo<e>>> y7Var = sn.d;
                ArrayList<vo<e>> arrayList = y7Var.get(this.s);
                if (arrayList == null) {
                    return;
                }
                y7Var.remove(this.s);
                for (int i = 0; i < arrayList.size(); i++) {
                    arrayList.get(i).accept(eVar);
                }
            }
        }
    }

    private sn() {
    }

    private static String a(@x1 rn rnVar, int i) {
        return rnVar.d() + "-" + i;
    }

    @SuppressLint({"WrongConstant"})
    private static int b(@x1 tn.b bVar) {
        int i = 1;
        if (bVar.c() != 0) {
            return bVar.c() != 1 ? -3 : -2;
        }
        tn.c[] b2 = bVar.b();
        if (b2 != null && b2.length != 0) {
            i = 0;
            for (tn.c cVar : b2) {
                int b3 = cVar.b();
                if (b3 != 0) {
                    if (b3 < 0) {
                        return -3;
                    }
                    return b3;
                }
            }
        }
        return i;
    }

    @x1
    public static e c(@x1 String str, @x1 Context context, @x1 rn rnVar, int i) {
        w7<String, Typeface> w7Var = a;
        Typeface typeface = w7Var.get(str);
        if (typeface != null) {
            return new e(typeface);
        }
        try {
            tn.b d2 = qn.d(context, rnVar, null);
            int b2 = b(d2);
            if (b2 != 0) {
                return new e(b2);
            }
            Typeface c2 = vj.c(context, null, d2.b(), i);
            if (c2 != null) {
                w7Var.put(str, c2);
                return new e(c2);
            }
            return new e(-3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        }
    }

    public static Typeface d(@x1 Context context, @x1 rn rnVar, int i, @z1 Executor executor, @x1 nn nnVar) {
        String a2 = a(rnVar, i);
        Typeface typeface = a.get(a2);
        if (typeface != null) {
            nnVar.b(new e(typeface));
            return typeface;
        }
        b bVar = new b(nnVar);
        synchronized (c) {
            y7<String, ArrayList<vo<e>>> y7Var = d;
            ArrayList<vo<e>> arrayList = y7Var.get(a2);
            if (arrayList != null) {
                arrayList.add(bVar);
                return null;
            }
            ArrayList<vo<e>> arrayList2 = new ArrayList<>();
            arrayList2.add(bVar);
            y7Var.put(a2, arrayList2);
            c cVar = new c(a2, context, rnVar, i);
            if (executor == null) {
                executor = b;
            }
            un.c(executor, cVar, new d(a2));
            return null;
        }
    }

    public static Typeface e(@x1 Context context, @x1 rn rnVar, @x1 nn nnVar, int i, int i2) {
        String a2 = a(rnVar, i);
        Typeface typeface = a.get(a2);
        if (typeface != null) {
            nnVar.b(new e(typeface));
            return typeface;
        } else if (i2 == -1) {
            e c2 = c(a2, context, rnVar, i);
            nnVar.b(c2);
            return c2.a;
        } else {
            try {
                e eVar = (e) un.d(b, new a(a2, context, rnVar, i), i2);
                nnVar.b(eVar);
                return eVar.a;
            } catch (InterruptedException unused) {
                nnVar.b(new e(-3));
                return null;
            }
        }
    }

    public static void f() {
        a.evictAll();
    }

    /* compiled from: FontRequestWorker.java */
    /* loaded from: classes.dex */
    public static final class e {
        public final Typeface a;
        public final int b;

        public e(int i) {
            this.a = null;
            this.b = i;
        }

        @SuppressLint({"WrongConstant"})
        public boolean a() {
            return this.b == 0;
        }

        @SuppressLint({"WrongConstant"})
        public e(@x1 Typeface typeface) {
            this.a = typeface;
            this.b = 0;
        }
    }
}