package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import com.p7700g.p99005.aa;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.li;
import com.p7700g.p99005.tn;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: TypefaceCompatBaseImpl.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class bk {
    private static final String a = "TypefaceCompatBaseImpl";
    private static final int b = 0;
    @SuppressLint({"BanConcurrentHashMap"})
    private ConcurrentHashMap<Long, li.d> c = new ConcurrentHashMap<>();

    /* compiled from: TypefaceCompatBaseImpl.java */
    /* loaded from: classes.dex */
    public class a implements c<tn.c> {
        public a() {
        }

        @Override // com.p7700g.p99005.bk.c
        /* renamed from: c */
        public int a(tn.c cVar) {
            return cVar.e();
        }

        @Override // com.p7700g.p99005.bk.c
        /* renamed from: d */
        public boolean b(tn.c cVar) {
            return cVar.f();
        }
    }

    /* compiled from: TypefaceCompatBaseImpl.java */
    /* loaded from: classes.dex */
    public class b implements c<li.e> {
        public b() {
        }

        @Override // com.p7700g.p99005.bk.c
        /* renamed from: c */
        public int a(li.e eVar) {
            return eVar.e();
        }

        @Override // com.p7700g.p99005.bk.c
        /* renamed from: d */
        public boolean b(li.e eVar) {
            return eVar.f();
        }
    }

    /* compiled from: TypefaceCompatBaseImpl.java */
    /* loaded from: classes.dex */
    public interface c<T> {
        int a(T t);

        boolean b(T t);
    }

    private void a(Typeface typeface, li.d dVar) {
        long j = j(typeface);
        if (j != 0) {
            this.c.put(Long.valueOf(j), dVar);
        }
    }

    private li.e f(li.d dVar, int i) {
        return (li.e) g(dVar.a(), i, new b());
    }

    private static <T> T g(T[] tArr, int i, c<T> cVar) {
        int i2 = (i & 1) == 0 ? 400 : aa.h.j;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = (Math.abs(cVar.a(t2) - i2) * 2) + (cVar.b(t2) == z ? 0 : 1);
            if (t == null || i3 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    private static long j(@z1 Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return 0L;
        }
    }

    @z1
    public Typeface b(Context context, li.d dVar, Resources resources, int i) {
        li.e f = f(dVar, i);
        if (f == null) {
            return null;
        }
        Typeface g = vj.g(context, resources, f.b(), f.a(), 0, i);
        a(g, dVar);
        return g;
    }

    @z1
    public Typeface c(Context context, @z1 CancellationSignal cancellationSignal, @x1 tn.c[] cVarArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (cVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(h(cVarArr, i).d());
            try {
                Typeface d = d(context, inputStream);
                ck.a(inputStream);
                return d;
            } catch (IOException unused) {
                ck.a(inputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                ck.a(inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public Typeface d(Context context, InputStream inputStream) {
        File e = ck.e(context);
        if (e == null) {
            return null;
        }
        try {
            if (ck.d(e, inputStream)) {
                return Typeface.createFromFile(e.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e.delete();
        }
    }

    @z1
    public Typeface e(Context context, Resources resources, int i, String str, int i2) {
        File e = ck.e(context);
        if (e == null) {
            return null;
        }
        try {
            if (ck.c(e, resources, i)) {
                return Typeface.createFromFile(e.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e.delete();
        }
    }

    public tn.c h(tn.c[] cVarArr, int i) {
        return (tn.c) g(cVarArr, i, new a());
    }

    @z1
    public li.d i(Typeface typeface) {
        long j = j(typeface);
        if (j == 0) {
            return null;
        }
        return this.c.get(Long.valueOf(j));
    }
}