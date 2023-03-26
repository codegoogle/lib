package com.p7700g.p99005;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Pair;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

/* compiled from: FrameworkSQLiteDatabase.java */
/* loaded from: classes.dex */
public class t60 implements n60 {
    private static final String[] s = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    private static final String[] t = new String[0];
    private final SQLiteDatabase u;

    /* compiled from: FrameworkSQLiteDatabase.java */
    /* loaded from: classes.dex */
    public class a implements SQLiteDatabase.CursorFactory {
        public final /* synthetic */ q60 a;

        public a(q60 q60Var) {
            this.a = q60Var;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.a.d(new w60(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    /* compiled from: FrameworkSQLiteDatabase.java */
    /* loaded from: classes.dex */
    public class b implements SQLiteDatabase.CursorFactory {
        public final /* synthetic */ q60 a;

        public b(q60 q60Var) {
            this.a = q60Var;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.a.d(new w60(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public t60(SQLiteDatabase sQLiteDatabase) {
        this.u = sQLiteDatabase;
    }

    @Override // com.p7700g.p99005.n60
    public void A0() {
        this.u.setTransactionSuccessful();
    }

    @Override // com.p7700g.p99005.n60
    public Cursor B(String str, Object[] objArr) {
        return k1(new m60(str, objArr));
    }

    @Override // com.p7700g.p99005.n60
    public void B0(String str, Object[] objArr) throws SQLException {
        this.u.execSQL(str, objArr);
    }

    @Override // com.p7700g.p99005.n60
    @e2(api = 16)
    public boolean B1() {
        return this.u.isWriteAheadLoggingEnabled();
    }

    @Override // com.p7700g.p99005.n60
    public List<Pair<String, String>> C() {
        return this.u.getAttachedDbs();
    }

    @Override // com.p7700g.p99005.n60
    public long C0() {
        return this.u.getMaximumSize();
    }

    @Override // com.p7700g.p99005.n60
    public void D0() {
        this.u.beginTransactionNonExclusive();
    }

    @Override // com.p7700g.p99005.n60
    public int E0(String str, int i, ContentValues contentValues, String str2, Object[] objArr) {
        if (contentValues != null && contentValues.size() != 0) {
            StringBuilder sb = new StringBuilder(120);
            sb.append("UPDATE ");
            sb.append(s[i]);
            sb.append(str);
            sb.append(" SET ");
            int size = contentValues.size();
            int length = objArr == null ? size : objArr.length + size;
            Object[] objArr2 = new Object[length];
            int i2 = 0;
            for (String str3 : contentValues.keySet()) {
                sb.append(i2 > 0 ? "," : "");
                sb.append(str3);
                objArr2[i2] = contentValues.get(str3);
                sb.append("=?");
                i2++;
            }
            if (objArr != null) {
                for (int i3 = size; i3 < length; i3++) {
                    objArr2[i3] = objArr[i3 - size];
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                sb.append(" WHERE ");
                sb.append(str2);
            }
            s60 R = R(sb.toString());
            m60.e(R, objArr2);
            return R.z0();
        }
        throw new IllegalArgumentException("Empty values");
    }

    @Override // com.p7700g.p99005.n60
    public void E1(int i) {
        this.u.setMaxSqlCacheSize(i);
    }

    @Override // com.p7700g.p99005.n60
    public long F0(long j) {
        return this.u.setMaximumSize(j);
    }

    @Override // com.p7700g.p99005.n60
    public void G(int i) {
        this.u.setVersion(i);
    }

    @Override // com.p7700g.p99005.n60
    @e2(api = 16)
    public void H() {
        this.u.disableWriteAheadLogging();
    }

    @Override // com.p7700g.p99005.n60
    public void H1(long j) {
        this.u.setPageSize(j);
    }

    @Override // com.p7700g.p99005.n60
    public void I(String str) throws SQLException {
        this.u.execSQL(str);
    }

    @Override // com.p7700g.p99005.n60
    public boolean N() {
        return this.u.isDatabaseIntegrityOk();
    }

    @Override // com.p7700g.p99005.n60
    public boolean N0() {
        return this.u.yieldIfContendedSafely();
    }

    @Override // com.p7700g.p99005.n60
    public Cursor P0(String str) {
        return k1(new m60(str));
    }

    @Override // com.p7700g.p99005.n60
    public s60 R(String str) {
        return new x60(this.u.compileStatement(str));
    }

    @Override // com.p7700g.p99005.n60
    public long S0(String str, int i, ContentValues contentValues) throws SQLException {
        return this.u.insertWithOnConflict(str, null, contentValues, i);
    }

    @Override // com.p7700g.p99005.n60
    public void T0(SQLiteTransactionListener sQLiteTransactionListener) {
        this.u.beginTransactionWithListener(sQLiteTransactionListener);
    }

    @Override // com.p7700g.p99005.n60
    public boolean U0() {
        return this.u.isDbLockedByCurrentThread();
    }

    @Override // com.p7700g.p99005.n60
    public void W0() {
        this.u.endTransaction();
    }

    public boolean a(SQLiteDatabase sQLiteDatabase) {
        return this.u == sQLiteDatabase;
    }

    @Override // com.p7700g.p99005.n60
    public int c(String str, String str2, Object[] objArr) {
        StringBuilder L = wo1.L("DELETE FROM ", str);
        L.append(TextUtils.isEmpty(str2) ? "" : wo1.t(" WHERE ", str2));
        s60 R = R(L.toString());
        m60.e(R, objArr);
        return R.z0();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.u.close();
    }

    @Override // com.p7700g.p99005.n60
    public String getPath() {
        return this.u.getPath();
    }

    @Override // com.p7700g.p99005.n60
    public int getVersion() {
        return this.u.getVersion();
    }

    @Override // com.p7700g.p99005.n60
    @e2(api = 16)
    public Cursor h0(q60 q60Var, CancellationSignal cancellationSignal) {
        return this.u.rawQueryWithFactory(new b(q60Var), q60Var.b(), t, null, cancellationSignal);
    }

    @Override // com.p7700g.p99005.n60
    public boolean h1(int i) {
        return this.u.needUpgrade(i);
    }

    @Override // com.p7700g.p99005.n60
    public boolean i0() {
        return this.u.isReadOnly();
    }

    @Override // com.p7700g.p99005.n60
    public boolean isOpen() {
        return this.u.isOpen();
    }

    @Override // com.p7700g.p99005.n60
    public Cursor k1(q60 q60Var) {
        return this.u.rawQueryWithFactory(new a(q60Var), q60Var.b(), t, null);
    }

    @Override // com.p7700g.p99005.n60
    public void n1(Locale locale) {
        this.u.setLocale(locale);
    }

    @Override // com.p7700g.p99005.n60
    public void q1(SQLiteTransactionListener sQLiteTransactionListener) {
        this.u.beginTransactionWithListenerNonExclusive(sQLiteTransactionListener);
    }

    @Override // com.p7700g.p99005.n60
    @e2(api = 16)
    public void r0(boolean z) {
        this.u.setForeignKeyConstraintsEnabled(z);
    }

    @Override // com.p7700g.p99005.n60
    public long s0() {
        return this.u.getPageSize();
    }

    @Override // com.p7700g.p99005.n60
    public void t() {
        this.u.beginTransaction();
    }

    @Override // com.p7700g.p99005.n60
    public boolean t1() {
        return this.u.inTransaction();
    }

    @Override // com.p7700g.p99005.n60
    public boolean v0() {
        return this.u.enableWriteAheadLogging();
    }

    @Override // com.p7700g.p99005.n60
    public boolean y(long j) {
        return this.u.yieldIfContendedSafely(j);
    }
}