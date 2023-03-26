package com.p7700g.p99005;

import com.p7700g.p99005.o60;
import java.io.File;

/* compiled from: SQLiteCopyOpenHelperFactory.java */
/* loaded from: classes.dex */
public class k50 implements o60.c {
    @z1
    private final String a;
    @z1
    private final File b;
    @x1
    private final o60.c c;

    public k50(@z1 String str, @z1 File file, @x1 o60.c cVar) {
        this.a = str;
        this.b = file;
        this.c = cVar;
    }

    @Override // com.p7700g.p99005.o60.c
    public o60 a(o60.b bVar) {
        return new j50(bVar.a, this.a, this.b, bVar.c.b, this.c.a(bVar));
    }
}