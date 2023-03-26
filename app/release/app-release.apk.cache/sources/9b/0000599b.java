package com.p7700g.p99005;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* compiled from: SchemaManager.java */
/* loaded from: classes2.dex */
public final class r92 extends SQLiteOpenHelper {
    private static final String A = "DROP TABLE transport_contexts";
    private static final String B = "CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))";
    private static final String C = "DROP TABLE IF EXISTS event_payloads";
    public static int D = 4;
    private static final a E;
    private static final a F;
    private static final a G;
    private static final a H;
    private static final List<a> I;
    public static final String s = "com.google.android.datatransport.events";
    private static final String t = "CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)";
    private static final String u = "CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)";
    private static final String v = "CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)";
    private static final String w = "CREATE INDEX events_backend_id on events(context_id)";
    private static final String x = "CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)";
    private static final String y = "DROP TABLE events";
    private static final String z = "DROP TABLE event_metadata";
    private final int J;
    private boolean K;

    /* compiled from: SchemaManager.java */
    /* loaded from: classes2.dex */
    public interface a {
        void a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        d92 d92Var = d92.a;
        E = d92Var;
        a92 a92Var = a92.a;
        F = a92Var;
        b92 b92Var = b92.a;
        G = b92Var;
        c92 c92Var = c92.a;
        H = c92Var;
        I = Arrays.asList(d92Var, a92Var, b92Var, c92Var);
    }

    @ml4
    public r92(Context context, @nl4("SQLITE_DB_NAME") String str, @nl4("SCHEMA_VERSION") int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.K = false;
        this.J = i;
    }

    private void a(SQLiteDatabase sQLiteDatabase) {
        if (this.K) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    public static /* synthetic */ void b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(t);
        sQLiteDatabase.execSQL(u);
        sQLiteDatabase.execSQL(v);
        sQLiteDatabase.execSQL(w);
        sQLiteDatabase.execSQL(x);
    }

    public static /* synthetic */ void d(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    public static /* synthetic */ void f(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL(C);
        sQLiteDatabase.execSQL(B);
    }

    private void h(SQLiteDatabase sQLiteDatabase, int i) {
        a(sQLiteDatabase);
        j(sQLiteDatabase, 0, i);
    }

    private void j(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        List<a> list = I;
        if (i2 <= list.size()) {
            while (i < i2) {
                I.get(i).a(sQLiteDatabase);
                i++;
            }
            return;
        }
        StringBuilder J = wo1.J("Migration from ", i, " to ", i2, " was requested, but cannot be performed. Only ");
        J.append(list.size());
        J.append(" migrations are provided");
        throw new IllegalArgumentException(J.toString());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.K = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        h(sQLiteDatabase, this.J);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL(y);
        sQLiteDatabase.execSQL(z);
        sQLiteDatabase.execSQL(A);
        sQLiteDatabase.execSQL(C);
        h(sQLiteDatabase, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        a(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        a(sQLiteDatabase);
        j(sQLiteDatabase, i, i2);
    }
}