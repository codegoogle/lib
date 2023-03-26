package com.p7700g.p99005;

import android.database.sqlite.SQLiteProgram;

/* compiled from: FrameworkSQLiteProgram.java */
/* loaded from: classes.dex */
public class w60 implements p60 {
    private final SQLiteProgram s;

    public w60(SQLiteProgram sQLiteProgram) {
        this.s = sQLiteProgram;
    }

    @Override // com.p7700g.p99005.p60
    public void I0(int i, byte[] bArr) {
        this.s.bindBlob(i, bArr);
    }

    @Override // com.p7700g.p99005.p60
    public void I1() {
        this.s.clearBindings();
    }

    @Override // com.p7700g.p99005.p60
    public void J(int i, String str) {
        this.s.bindString(i, str);
    }

    @Override // com.p7700g.p99005.p60
    public void a0(int i, double d) {
        this.s.bindDouble(i, d);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.s.close();
    }

    @Override // com.p7700g.p99005.p60
    public void l1(int i) {
        this.s.bindNull(i);
    }

    @Override // com.p7700g.p99005.p60
    public void u0(int i, long j) {
        this.s.bindLong(i, j);
    }
}