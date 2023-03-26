package com.p7700g.p99005;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;
import java.util.Locale;

/* compiled from: SupportSQLiteDatabase.java */
/* loaded from: classes.dex */
public interface n60 extends Closeable {
    void A0();

    Cursor B(String str, Object[] objArr);

    void B0(String str, Object[] objArr) throws SQLException;

    @e2(api = 16)
    boolean B1();

    List<Pair<String, String>> C();

    long C0();

    void D0();

    int E0(String str, int i, ContentValues contentValues, String str2, Object[] objArr);

    void E1(int i);

    long F0(long j);

    void G(int i);

    @e2(api = 16)
    void H();

    void H1(long j);

    void I(String str) throws SQLException;

    boolean N();

    boolean N0();

    Cursor P0(String str);

    s60 R(String str);

    long S0(String str, int i, ContentValues contentValues) throws SQLException;

    void T0(SQLiteTransactionListener sQLiteTransactionListener);

    boolean U0();

    void W0();

    int c(String str, String str2, Object[] objArr);

    String getPath();

    int getVersion();

    @e2(api = 16)
    Cursor h0(q60 q60Var, CancellationSignal cancellationSignal);

    boolean h1(int i);

    boolean i0();

    boolean isOpen();

    Cursor k1(q60 q60Var);

    void n1(Locale locale);

    void q1(SQLiteTransactionListener sQLiteTransactionListener);

    @e2(api = 16)
    void r0(boolean z);

    long s0();

    void t();

    boolean t1();

    boolean v0();

    boolean y(long j);
}