package com.p7700g.p99005;

import android.database.sqlite.SQLiteStatement;

/* compiled from: FrameworkSQLiteStatement.java */
/* loaded from: classes.dex */
public class x60 extends w60 implements s60 {
    private final SQLiteStatement t;

    public x60(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.t = sQLiteStatement;
    }

    @Override // com.p7700g.p99005.s60
    public String L0() {
        return this.t.simpleQueryForString();
    }

    @Override // com.p7700g.p99005.s60
    public long R1() {
        return this.t.executeInsert();
    }

    @Override // com.p7700g.p99005.s60
    public void w0() {
        this.t.execute();
    }

    @Override // com.p7700g.p99005.s60
    public long y0() {
        return this.t.simpleQueryForLong();
    }

    @Override // com.p7700g.p99005.s60
    public int z0() {
        return this.t.executeUpdateDelete();
    }
}