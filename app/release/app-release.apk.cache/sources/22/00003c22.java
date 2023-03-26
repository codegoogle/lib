package com.p7700g.p99005;

import android.content.Context;
import com.p7700g.p99005.d50;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.o60;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: DatabaseConfiguration.java */
/* loaded from: classes.dex */
public class c40 {
    @x1
    public final o60.c a;
    @x1
    public final Context b;
    @z1
    public final String c;
    @x1
    public final d50.d d;
    @z1
    public final List<d50.b> e;
    public final boolean f;
    public final d50.c g;
    @x1
    public final Executor h;
    @x1
    public final Executor i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    private final Set<Integer> m;
    @z1
    public final String n;
    @z1
    public final File o;

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public c40(@x1 Context context, @z1 String str, @x1 o60.c cVar, @x1 d50.d dVar, @z1 List<d50.b> list, boolean z, d50.c cVar2, @x1 Executor executor, boolean z2, @z1 Set<Integer> set) {
        this(context, str, cVar, dVar, list, z, cVar2, executor, executor, false, z2, false, set, null, null);
    }

    public boolean a(int i, int i2) {
        Set<Integer> set;
        return !((i > i2) && this.l) && this.k && ((set = this.m) == null || !set.contains(Integer.valueOf(i)));
    }

    @Deprecated
    public boolean b(int i) {
        return a(i, i + 1);
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public c40(@x1 Context context, @z1 String str, @x1 o60.c cVar, @x1 d50.d dVar, @z1 List<d50.b> list, boolean z, d50.c cVar2, @x1 Executor executor, @x1 Executor executor2, boolean z2, boolean z3, boolean z4, @z1 Set<Integer> set) {
        this(context, str, cVar, dVar, list, z, cVar2, executor, executor2, z2, z3, z4, set, null, null);
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public c40(@x1 Context context, @z1 String str, @x1 o60.c cVar, @x1 d50.d dVar, @z1 List<d50.b> list, boolean z, d50.c cVar2, @x1 Executor executor, @x1 Executor executor2, boolean z2, boolean z3, boolean z4, @z1 Set<Integer> set, @z1 String str2, @z1 File file) {
        this.a = cVar;
        this.b = context;
        this.c = str;
        this.d = dVar;
        this.e = list;
        this.f = z;
        this.g = cVar2;
        this.h = executor;
        this.i = executor2;
        this.j = z2;
        this.k = z3;
        this.l = z4;
        this.m = set;
        this.n = str2;
        this.o = file;
    }
}