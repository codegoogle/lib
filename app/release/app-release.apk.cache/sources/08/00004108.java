package com.p7700g.p99005;

import android.content.Context;
import com.p7700g.p99005.at1;
import com.p7700g.p99005.xs1;
import java.io.File;

/* compiled from: InternalCacheDiskCacheFactory.java */
/* loaded from: classes2.dex */
public final class et1 extends at1 {

    /* compiled from: InternalCacheDiskCacheFactory.java */
    /* loaded from: classes2.dex */
    public class a implements at1.c {
        public final /* synthetic */ Context a;
        public final /* synthetic */ String b;

        public a(Context context, String str) {
            this.a = context;
            this.b = str;
        }

        @Override // com.p7700g.p99005.at1.c
        public File a() {
            File cacheDir = this.a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.b != null ? new File(cacheDir, this.b) : cacheDir;
        }
    }

    public et1(Context context) {
        this(context, xs1.a.b, 262144000L);
    }

    public et1(Context context, long j) {
        this(context, xs1.a.b, j);
    }

    public et1(Context context, String str, long j) {
        super(new a(context, str), j);
    }
}