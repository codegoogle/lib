package com.p7700g.p99005;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.li;
import com.p7700g.p99005.oi;
import com.p7700g.p99005.tn;

/* compiled from: TypefaceCompat.java */
/* loaded from: classes.dex */
public class vj {
    private static final bk a;
    private static final w7<String, Typeface> b;

    /* compiled from: TypefaceCompat.java */
    @i2({i2.a.LIBRARY})
    /* loaded from: classes.dex */
    public static class a extends tn.d {
        @z1
        private oi.g j;

        public a(@z1 oi.g gVar) {
            this.j = gVar;
        }

        @Override // com.p7700g.p99005.tn.d
        public void a(int i) {
            oi.g gVar = this.j;
            if (gVar != null) {
                gVar.a(i);
            }
        }

        @Override // com.p7700g.p99005.tn.d
        public void b(@x1 Typeface typeface) {
            oi.g gVar = this.j;
            if (gVar != null) {
                gVar.b(typeface);
            }
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            a = new ak();
        } else if (i >= 28) {
            a = new zj();
        } else if (i >= 26) {
            a = new yj();
        } else if (i >= 24 && xj.m()) {
            a = new xj();
        } else {
            a = new wj();
        }
        b = new w7<>(16);
    }

    private vj() {
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @r2
    public static void a() {
        b.evictAll();
    }

    @x1
    public static Typeface b(@x1 Context context, @z1 Typeface typeface, int i) {
        if (context != null) {
            return Typeface.create(typeface, i);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @z1
    public static Typeface c(@x1 Context context, @z1 CancellationSignal cancellationSignal, @x1 tn.c[] cVarArr, int i) {
        return a.c(context, cancellationSignal, cVarArr, i);
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @z1
    @Deprecated
    public static Typeface d(@x1 Context context, @x1 li.b bVar, @x1 Resources resources, int i, int i2, @z1 oi.g gVar, @z1 Handler handler, boolean z) {
        return e(context, bVar, resources, i, null, 0, i2, gVar, handler, z);
    }

    @i2({i2.a.LIBRARY})
    @z1
    public static Typeface e(@x1 Context context, @x1 li.b bVar, @x1 Resources resources, int i, @z1 String str, int i2, int i3, @z1 oi.g gVar, @z1 Handler handler, boolean z) {
        Typeface b2;
        if (bVar instanceof li.f) {
            li.f fVar = (li.f) bVar;
            Typeface l = l(fVar.c());
            if (l != null) {
                if (gVar != null) {
                    gVar.callbackSuccessAsync(l, handler);
                }
                return l;
            }
            b2 = tn.f(context, fVar.b(), i3, !z ? gVar != null : fVar.a() != 0, z ? fVar.d() : -1, oi.g.getHandler(handler), new a(gVar));
        } else {
            b2 = a.b(context, (li.d) bVar, resources, i3);
            if (gVar != null) {
                if (b2 != null) {
                    gVar.callbackSuccessAsync(b2, handler);
                } else {
                    gVar.callbackFailAsync(-3, handler);
                }
            }
        }
        if (b2 != null) {
            b.put(h(resources, i, str, i2, i3), b2);
        }
        return b2;
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @z1
    @Deprecated
    public static Typeface f(@x1 Context context, @x1 Resources resources, int i, String str, int i2) {
        return g(context, resources, i, str, 0, i2);
    }

    @i2({i2.a.LIBRARY})
    @z1
    public static Typeface g(@x1 Context context, @x1 Resources resources, int i, String str, int i2, int i3) {
        Typeface e = a.e(context, resources, i, str, i3);
        if (e != null) {
            b.put(h(resources, i, str, i2, i3), e);
        }
        return e;
    }

    private static String h(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @z1
    @Deprecated
    public static Typeface i(@x1 Resources resources, int i, int i2) {
        return j(resources, i, null, 0, i2);
    }

    @i2({i2.a.LIBRARY})
    @z1
    public static Typeface j(@x1 Resources resources, int i, @z1 String str, int i2, int i3) {
        return b.get(h(resources, i, str, i2, i3));
    }

    @z1
    private static Typeface k(Context context, Typeface typeface, int i) {
        bk bkVar = a;
        li.d i2 = bkVar.i(typeface);
        if (i2 == null) {
            return null;
        }
        return bkVar.b(context, i2, context.getResources(), i);
    }

    private static Typeface l(@z1 String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }
}