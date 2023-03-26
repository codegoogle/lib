package com.p7700g.p99005;

import android.database.Cursor;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.o60;
import java.util.List;

/* compiled from: RoomOpenHelper.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class f50 extends o60.a {
    @z1
    private c40 c;
    @x1
    private final a d;
    @x1
    private final String e;
    @x1
    private final String f;

    /* compiled from: RoomOpenHelper.java */
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public static abstract class a {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        public abstract void a(n60 n60Var);

        public abstract void b(n60 n60Var);

        public abstract void c(n60 n60Var);

        public abstract void d(n60 n60Var);

        public void e(n60 n60Var) {
        }

        public void f(n60 n60Var) {
        }

        @x1
        public b g(@x1 n60 n60Var) {
            h(n60Var);
            return new b(true, null);
        }

        @Deprecated
        public void h(n60 n60Var) {
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }
    }

    /* compiled from: RoomOpenHelper.java */
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public static class b {
        public final boolean a;
        @z1
        public final String b;

        public b(boolean z, @z1 String str) {
            this.a = z;
            this.b = str;
        }
    }

    public f50(@x1 c40 c40Var, @x1 a aVar, @x1 String str, @x1 String str2) {
        super(aVar.a);
        this.c = c40Var;
        this.d = aVar;
        this.e = str;
        this.f = str2;
    }

    private void h(n60 n60Var) {
        if (k(n60Var)) {
            Cursor k1 = n60Var.k1(new m60(e50.g));
            try {
                String string = k1.moveToFirst() ? k1.getString(0) : null;
                k1.close();
                if (!this.e.equals(string) && !this.f.equals(string)) {
                    throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                }
                return;
            } catch (Throwable th) {
                k1.close();
                throw th;
            }
        }
        b g = this.d.g(n60Var);
        if (g.a) {
            this.d.e(n60Var);
            l(n60Var);
            return;
        }
        StringBuilder G = wo1.G("Pre-packaged database has an invalid schema: ");
        G.append(g.b);
        throw new IllegalStateException(G.toString());
    }

    private void i(n60 n60Var) {
        n60Var.I(e50.f);
    }

    private static boolean j(n60 n60Var) {
        Cursor P0 = n60Var.P0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (P0.moveToFirst()) {
                if (P0.getInt(0) == 0) {
                    z = true;
                }
            }
            return z;
        } finally {
            P0.close();
        }
    }

    private static boolean k(n60 n60Var) {
        Cursor P0 = n60Var.P0("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z = false;
            if (P0.moveToFirst()) {
                if (P0.getInt(0) != 0) {
                    z = true;
                }
            }
            return z;
        } finally {
            P0.close();
        }
    }

    private void l(n60 n60Var) {
        i(n60Var);
        n60Var.I(e50.a(this.e));
    }

    @Override // com.p7700g.p99005.o60.a
    public void b(n60 n60Var) {
        super.b(n60Var);
    }

    @Override // com.p7700g.p99005.o60.a
    public void d(n60 n60Var) {
        boolean j = j(n60Var);
        this.d.a(n60Var);
        if (!j) {
            b g = this.d.g(n60Var);
            if (!g.a) {
                StringBuilder G = wo1.G("Pre-packaged database has an invalid schema: ");
                G.append(g.b);
                throw new IllegalStateException(G.toString());
            }
        }
        l(n60Var);
        this.d.c(n60Var);
    }

    @Override // com.p7700g.p99005.o60.a
    public void e(n60 n60Var, int i, int i2) {
        g(n60Var, i, i2);
    }

    @Override // com.p7700g.p99005.o60.a
    public void f(n60 n60Var) {
        super.f(n60Var);
        h(n60Var);
        this.d.d(n60Var);
        this.c = null;
    }

    @Override // com.p7700g.p99005.o60.a
    public void g(n60 n60Var, int i, int i2) {
        boolean z;
        List<s50> c;
        c40 c40Var = this.c;
        if (c40Var == null || (c = c40Var.d.c(i, i2)) == null) {
            z = false;
        } else {
            this.d.f(n60Var);
            for (s50 s50Var : c) {
                s50Var.a(n60Var);
            }
            b g = this.d.g(n60Var);
            if (g.a) {
                this.d.e(n60Var);
                l(n60Var);
                z = true;
            } else {
                StringBuilder G = wo1.G("Migration didn't properly handle: ");
                G.append(g.b);
                throw new IllegalStateException(G.toString());
            }
        }
        if (z) {
            return;
        }
        c40 c40Var2 = this.c;
        if (c40Var2 != null && !c40Var2.a(i, i2)) {
            this.d.b(n60Var);
            this.d.a(n60Var);
            return;
        }
        throw new IllegalStateException("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }

    public f50(@x1 c40 c40Var, @x1 a aVar, @x1 String str) {
        this(c40Var, aVar, "", str);
    }
}