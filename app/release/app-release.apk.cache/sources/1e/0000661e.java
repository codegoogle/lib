package com.p7700g.p99005;

import java.io.File;

/* compiled from: DiskCache.java */
/* loaded from: classes2.dex */
public interface xs1 {

    /* compiled from: DiskCache.java */
    /* loaded from: classes2.dex */
    public interface a {
        public static final int a = 262144000;
        public static final String b = "image_manager_disk_cache";

        @z1
        xs1 build();
    }

    /* compiled from: DiskCache.java */
    /* loaded from: classes2.dex */
    public interface b {
        boolean a(@x1 File file);
    }

    void a(gq1 gq1Var, b bVar);

    @z1
    File b(gq1 gq1Var);

    void c(gq1 gq1Var);

    void clear();
}