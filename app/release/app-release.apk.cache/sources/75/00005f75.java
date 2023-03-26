package com.p7700g.p99005;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import com.p7700g.p99005.o60;
import java.io.File;

/* compiled from: FrameworkSQLiteOpenHelper.java */
/* loaded from: classes.dex */
public class u60 implements o60 {
    private final Context s;
    private final String t;
    private final o60.a u;
    private final boolean v;
    private final Object w;
    private a x;
    private boolean y;

    /* compiled from: FrameworkSQLiteOpenHelper.java */
    /* loaded from: classes.dex */
    public static class a extends SQLiteOpenHelper {
        public final t60[] s;
        public final o60.a t;
        private boolean u;

        /* compiled from: FrameworkSQLiteOpenHelper.java */
        /* renamed from: com.p7700g.p99005.u60$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0254a implements DatabaseErrorHandler {
            public final /* synthetic */ o60.a a;
            public final /* synthetic */ t60[] b;

            public C0254a(o60.a aVar, t60[] t60VarArr) {
                this.a = aVar;
                this.b = t60VarArr;
            }

            @Override // android.database.DatabaseErrorHandler
            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                this.a.c(a.d(this.b, sQLiteDatabase));
            }
        }

        public a(Context context, String str, t60[] t60VarArr, o60.a aVar) {
            super(context, str, null, aVar.b, new C0254a(aVar, t60VarArr));
            this.t = aVar;
            this.s = t60VarArr;
        }

        public static t60 d(t60[] t60VarArr, SQLiteDatabase sQLiteDatabase) {
            t60 t60Var = t60VarArr[0];
            if (t60Var == null || !t60Var.a(sQLiteDatabase)) {
                t60VarArr[0] = new t60(sQLiteDatabase);
            }
            return t60VarArr[0];
        }

        public synchronized n60 a() {
            this.u = false;
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            if (this.u) {
                close();
                return a();
            }
            return b(readableDatabase);
        }

        public t60 b(SQLiteDatabase sQLiteDatabase) {
            return d(this.s, sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public synchronized void close() {
            super.close();
            this.s[0] = null;
        }

        public synchronized n60 e() {
            this.u = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (this.u) {
                close();
                return e();
            }
            return b(writableDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.t.b(b(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.t.d(b(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.u = true;
            this.t.e(b(sQLiteDatabase), i, i2);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (this.u) {
                return;
            }
            this.t.f(b(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.u = true;
            this.t.g(b(sQLiteDatabase), i, i2);
        }
    }

    public u60(Context context, String str, o60.a aVar) {
        this(context, str, aVar, false);
    }

    private a a() {
        a aVar;
        synchronized (this.w) {
            if (this.x == null) {
                t60[] t60VarArr = new t60[1];
                if (Build.VERSION.SDK_INT >= 23 && this.t != null && this.v) {
                    this.x = new a(this.s, new File(this.s.getNoBackupFilesDir(), this.t).getAbsolutePath(), t60VarArr, this.u);
                } else {
                    this.x = new a(this.s, this.t, t60VarArr, this.u);
                }
                this.x.setWriteAheadLoggingEnabled(this.y);
            }
            aVar = this.x;
        }
        return aVar;
    }

    @Override // com.p7700g.p99005.o60
    public n60 H0() {
        return a().a();
    }

    @Override // com.p7700g.p99005.o60
    public n60 M0() {
        return a().e();
    }

    @Override // com.p7700g.p99005.o60, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a().close();
    }

    @Override // com.p7700g.p99005.o60
    public String getDatabaseName() {
        return this.t;
    }

    @Override // com.p7700g.p99005.o60
    @e2(api = 16)
    public void setWriteAheadLoggingEnabled(boolean z) {
        synchronized (this.w) {
            a aVar = this.x;
            if (aVar != null) {
                aVar.setWriteAheadLoggingEnabled(z);
            }
            this.y = z;
        }
    }

    public u60(Context context, String str, o60.a aVar, boolean z) {
        this.s = context;
        this.t = str;
        this.u = aVar;
        this.v = z;
        this.w = new Object();
    }
}