package com.p7700g.p99005;

import android.content.res.AssetManager;
import android.util.Log;
import com.p7700g.p99005.rq1;
import java.io.IOException;

/* compiled from: AssetPathFetcher.java */
/* loaded from: classes2.dex */
public abstract class pq1<T> implements rq1<T> {
    private static final String s = "AssetPathFetcher";
    private final String t;
    private final AssetManager u;
    private T v;

    public pq1(AssetManager assetManager, String str) {
        this.u = assetManager;
        this.t = str;
    }

    @Override // com.p7700g.p99005.rq1
    public void b() {
        T t = this.v;
        if (t == null) {
            return;
        }
        try {
            c(t);
        } catch (IOException unused) {
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
    public void e(@x1 fp1 fp1Var, @x1 rq1.a<? super T> aVar) {
        try {
            T f = f(this.u, this.t);
            this.v = f;
            aVar.f(f);
        } catch (IOException e) {
            Log.isLoggable(s, 3);
            aVar.c(e);
        }
    }

    public abstract T f(AssetManager assetManager, String str) throws IOException;
}