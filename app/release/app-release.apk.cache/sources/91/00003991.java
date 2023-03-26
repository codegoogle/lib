package com.p7700g.p99005;

import com.p7700g.p99005.xs1;
import java.io.File;

/* compiled from: DiskLruCacheFactory.java */
/* loaded from: classes2.dex */
public class at1 implements xs1.a {
    private final long c;
    private final c d;

    /* compiled from: DiskLruCacheFactory.java */
    /* loaded from: classes2.dex */
    public class a implements c {
        public final /* synthetic */ String a;

        public a(String str) {
            this.a = str;
        }

        @Override // com.p7700g.p99005.at1.c
        public File a() {
            return new File(this.a);
        }
    }

    /* compiled from: DiskLruCacheFactory.java */
    /* loaded from: classes2.dex */
    public class b implements c {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        public b(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // com.p7700g.p99005.at1.c
        public File a() {
            return new File(this.a, this.b);
        }
    }

    /* compiled from: DiskLruCacheFactory.java */
    /* loaded from: classes2.dex */
    public interface c {
        File a();
    }

    public at1(String str, long j) {
        this(new a(str), j);
    }

    @Override // com.p7700g.p99005.xs1.a
    public xs1 build() {
        File a2 = this.d.a();
        if (a2 == null) {
            return null;
        }
        if (a2.isDirectory() || a2.mkdirs()) {
            return bt1.d(a2, this.c);
        }
        return null;
    }

    public at1(String str, String str2, long j) {
        this(new b(str, str2), j);
    }

    public at1(c cVar, long j) {
        this.c = j;
        this.d = cVar;
    }
}