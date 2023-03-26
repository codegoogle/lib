package com.p7700g.p99005;

import android.database.Cursor;
import androidx.paging.PositionalDataSource;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.t40;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* compiled from: LimitOffsetDataSource.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public abstract class t50<T> extends PositionalDataSource<T> {
    private final g50 a;
    private final String b;
    private final String c;
    private final d50 d;
    private final t40.c e;
    private final boolean f;

    /* compiled from: LimitOffsetDataSource.java */
    /* loaded from: classes.dex */
    public class a extends t40.c {
        public a(String[] strArr) {
            super(strArr);
        }

        @Override // com.p7700g.p99005.t40.c
        public void b(@x1 Set<String> set) {
            t50.this.invalidate();
        }
    }

    public t50(d50 d50Var, q60 q60Var, boolean z, String... strArr) {
        this(d50Var, g50.h(q60Var), z, strArr);
    }

    private g50 c(int i, int i2) {
        g50 e = g50.e(this.c, this.a.a() + 2);
        e.f(this.a);
        e.u0(e.a() - 1, i2);
        e.u0(e.a(), i);
        return e;
    }

    public abstract List<T> a(Cursor cursor);

    public int b() {
        g50 e = g50.e(this.b, this.a.a());
        e.f(this.a);
        Cursor v = this.d.v(e);
        try {
            if (v.moveToFirst()) {
                return v.getInt(0);
            }
            return 0;
        } finally {
            v.close();
            e.release();
        }
    }

    public boolean d() {
        this.d.l().j();
        return super.isInvalid();
    }

    public void e(@x1 PositionalDataSource.LoadInitialParams loadInitialParams, @x1 PositionalDataSource.LoadInitialCallback<T> loadInitialCallback) {
        g50 g50Var;
        int i;
        g50 g50Var2;
        List<T> emptyList = Collections.emptyList();
        this.d.c();
        Cursor cursor = null;
        try {
            int b = b();
            if (b != 0) {
                int computeInitialLoadPosition = computeInitialLoadPosition(loadInitialParams, b);
                g50Var = c(computeInitialLoadPosition, computeInitialLoadSize(loadInitialParams, computeInitialLoadPosition, b));
                try {
                    cursor = this.d.v(g50Var);
                    List<T> a2 = a(cursor);
                    this.d.A();
                    g50Var2 = g50Var;
                    i = computeInitialLoadPosition;
                    emptyList = a2;
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    this.d.i();
                    if (g50Var != null) {
                        g50Var.release();
                    }
                    throw th;
                }
            } else {
                i = 0;
                g50Var2 = null;
            }
            if (cursor != null) {
                cursor.close();
            }
            this.d.i();
            if (g50Var2 != null) {
                g50Var2.release();
            }
            loadInitialCallback.onResult(emptyList, i, b);
        } catch (Throwable th2) {
            th = th2;
            g50Var = null;
        }
    }

    @x1
    public List<T> f(int i, int i2) {
        g50 c = c(i, i2);
        if (this.f) {
            this.d.c();
            Cursor cursor = null;
            try {
                cursor = this.d.v(c);
                List<T> a2 = a(cursor);
                this.d.A();
                return a2;
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
                this.d.i();
                c.release();
            }
        }
        Cursor v = this.d.v(c);
        try {
            return a(v);
        } finally {
            v.close();
            c.release();
        }
    }

    public void g(@x1 PositionalDataSource.LoadRangeParams loadRangeParams, @x1 PositionalDataSource.LoadRangeCallback<T> loadRangeCallback) {
        loadRangeCallback.onResult(f(loadRangeParams.startPosition, loadRangeParams.loadSize));
    }

    public t50(d50 d50Var, g50 g50Var, boolean z, String... strArr) {
        this.d = d50Var;
        this.a = g50Var;
        this.f = z;
        StringBuilder G = wo1.G("SELECT COUNT(*) FROM ( ");
        G.append(g50Var.b());
        G.append(" )");
        this.b = G.toString();
        StringBuilder G2 = wo1.G("SELECT * FROM ( ");
        G2.append(g50Var.b());
        G2.append(" ) LIMIT ? OFFSET ?");
        this.c = G2.toString();
        a aVar = new a(strArr);
        this.e = aVar;
        d50Var.l().b(aVar);
    }
}