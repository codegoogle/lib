package com.p7700g.p99005;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.p7700g.p99005.rq1;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: LocalUriFetcher.java */
/* loaded from: classes2.dex */
public abstract class zq1<T> implements rq1<T> {
    private static final String s = "LocalUriFetcher";
    private final Uri t;
    private final ContentResolver u;
    private T v;

    public zq1(ContentResolver contentResolver, Uri uri) {
        this.u = contentResolver;
        this.t = uri;
    }

    @Override // com.p7700g.p99005.rq1
    public void b() {
        T t = this.v;
        if (t != null) {
            try {
                c(t);
            } catch (IOException unused) {
            }
        }
    }

    public abstract void c(T t) throws IOException;

    @Override // com.p7700g.p99005.rq1
    public void cancel() {
    }

    @Override // com.p7700g.p99005.rq1
    @x1
    public aq1 d() {
        return aq1.LOCAL;
    }

    @Override // com.p7700g.p99005.rq1
    public final void e(@x1 fp1 fp1Var, @x1 rq1.a<? super T> aVar) {
        try {
            T f = f(this.t, this.u);
            this.v = f;
            aVar.f(f);
        } catch (FileNotFoundException e) {
            Log.isLoggable(s, 3);
            aVar.c(e);
        }
    }

    public abstract T f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;
}