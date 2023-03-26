package com.p7700g.p99005;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.List;

/* compiled from: SupportSQLiteOpenHelper.java */
/* loaded from: classes.dex */
public interface o60 extends Closeable {

    /* compiled from: SupportSQLiteOpenHelper.java */
    /* loaded from: classes.dex */
    public static abstract class a {
        private static final String a = "SupportSQLite";
        public final int b;

        public a(int i) {
            this.b = i;
        }

        private void a(String str) {
            if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
                try {
                    SQLiteDatabase.deleteDatabase(new File(str));
                } catch (Exception unused) {
                }
            }
        }

        public void b(@x1 n60 n60Var) {
        }

        public void c(@x1 n60 n60Var) {
            n60Var.getPath();
            if (!n60Var.isOpen()) {
                a(n60Var.getPath());
                return;
            }
            List<Pair<String, String>> list = null;
            try {
                try {
                    list = n60Var.C();
                } finally {
                    if (list != null) {
                        for (Pair<String, String> next : list) {
                            a((String) next.second);
                        }
                    } else {
                        a(n60Var.getPath());
                    }
                }
            } catch (SQLiteException unused) {
            }
            try {
                n60Var.close();
            } catch (IOException unused2) {
            }
        }

        public abstract void d(@x1 n60 n60Var);

        public void e(@x1 n60 n60Var, int i, int i2) {
            throw new SQLiteException(wo1.o("Can't downgrade database from version ", i, " to ", i2));
        }

        public void f(@x1 n60 n60Var) {
        }

        public abstract void g(@x1 n60 n60Var, int i, int i2);
    }

    /* compiled from: SupportSQLiteOpenHelper.java */
    /* loaded from: classes.dex */
    public static class b {
        @x1
        public final Context a;
        @z1
        public final String b;
        @x1
        public final a c;
        public final boolean d;

        /* compiled from: SupportSQLiteOpenHelper.java */
        /* loaded from: classes.dex */
        public static class a {
            public Context a;
            public String b;
            public a c;
            public boolean d;

            public a(@x1 Context context) {
                this.a = context;
            }

            @x1
            public b a() {
                if (this.c != null) {
                    if (this.a != null) {
                        if (this.d && TextUtils.isEmpty(this.b)) {
                            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                        }
                        return new b(this.a, this.b, this.c, this.d);
                    }
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                }
                throw new IllegalArgumentException("Must set a callback to create the configuration.");
            }

            @x1
            public a b(@x1 a aVar) {
                this.c = aVar;
                return this;
            }

            @x1
            public a c(@z1 String str) {
                this.b = str;
                return this;
            }

            @x1
            public a d(boolean z) {
                this.d = z;
                return this;
            }
        }

        public b(@x1 Context context, @z1 String str, @x1 a aVar) {
            this(context, str, aVar, false);
        }

        @x1
        public static a a(@x1 Context context) {
            return new a(context);
        }

        public b(@x1 Context context, @z1 String str, @x1 a aVar, boolean z) {
            this.a = context;
            this.b = str;
            this.c = aVar;
            this.d = z;
        }
    }

    /* compiled from: SupportSQLiteOpenHelper.java */
    /* loaded from: classes.dex */
    public interface c {
        @x1
        o60 a(@x1 b bVar);
    }

    n60 H0();

    n60 M0();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    @z1
    String getDatabaseName();

    @e2(api = 16)
    void setWriteAheadLoggingEnabled(boolean z);
}