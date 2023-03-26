package com.p7700g.p99005;

import android.content.Context;
import com.p7700g.p99005.at1;
import com.p7700g.p99005.xs1;
import java.io.File;

/* compiled from: ExternalPreferredCacheDiskCacheFactory.java */
/* loaded from: classes2.dex */
public final class dt1 extends at1 {

    /* compiled from: ExternalPreferredCacheDiskCacheFactory.java */
    /* loaded from: classes2.dex */
    public class a implements at1.c {
        public final /* synthetic */ Context a;
        public final /* synthetic */ String b;

        public a(Context context, String str) {
            this.a = context;
            this.b = str;
        }

        @z1
        private File b() {
            File cacheDir = this.a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.b != null ? new File(cacheDir, this.b) : cacheDir;
        }

        @Override // com.p7700g.p99005.at1.c
        public File a() {
            File externalCacheDir;
            File b = b();
            return ((b == null || !b.exists()) && (externalCacheDir = this.a.getExternalCacheDir()) != null && externalCacheDir.canWrite()) ? this.b != null ? new File(externalCacheDir, this.b) : externalCacheDir : b;
        }
    }

    public dt1(Context context) {
        this(context, xs1.a.b, 262144000L);
    }

    public dt1(Context context, long j) {
        this(context, xs1.a.b, j);
    }

    public dt1(Context context, String str, long j) {
        super(new a(context, str), j);
    }
}