package com.p7700g.p99005;

import android.content.Context;
import com.p7700g.p99005.at1;
import com.p7700g.p99005.xs1;
import java.io.File;

/* compiled from: ExternalCacheDiskCacheFactory.java */
@Deprecated
/* loaded from: classes2.dex */
public final class ct1 extends at1 {

    /* compiled from: ExternalCacheDiskCacheFactory.java */
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
            File externalCacheDir = this.a.getExternalCacheDir();
            if (externalCacheDir == null) {
                return null;
            }
            return this.b != null ? new File(externalCacheDir, this.b) : externalCacheDir;
        }
    }

    public ct1(Context context) {
        this(context, xs1.a.b, xs1.a.a);
    }

    public ct1(Context context, int i) {
        this(context, xs1.a.b, i);
    }

    public ct1(Context context, String str, int i) {
        super(new a(context, str), i);
    }
}