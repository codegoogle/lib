package com.p7700g.p99005;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import java.util.concurrent.Callable;

/* compiled from: PreferenceDao_Impl.java */
/* loaded from: classes.dex */
public final class ke0 implements je0 {
    private final d50 a;
    private final i40<ie0> b;

    /* compiled from: PreferenceDao_Impl.java */
    /* loaded from: classes.dex */
    public class a extends i40<ie0> {
        public a(d50 database) {
            super(database);
        }

        @Override // com.p7700g.p99005.l50
        public String d() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // com.p7700g.p99005.i40
        /* renamed from: r */
        public void g(s60 stmt, ie0 value) {
            String str = value.a;
            if (str == null) {
                stmt.l1(1);
            } else {
                stmt.J(1, str);
            }
            Long l = value.b;
            if (l == null) {
                stmt.l1(2);
            } else {
                stmt.u0(2, l.longValue());
            }
        }
    }

    /* compiled from: PreferenceDao_Impl.java */
    /* loaded from: classes.dex */
    public class b implements Callable<Long> {
        public final /* synthetic */ g50 a;

        public b(final g50 val$_statement) {
            this.a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Long call() throws Exception {
            Long l = null;
            Cursor d = w50.d(ke0.this.a, this.a, false, null);
            try {
                if (d.moveToFirst() && !d.isNull(0)) {
                    l = Long.valueOf(d.getLong(0));
                }
                return l;
            } finally {
                d.close();
            }
        }

        public void finalize() {
            this.a.release();
        }
    }

    public ke0(d50 __db) {
        this.a = __db;
        this.b = new a(__db);
    }

    @Override // com.p7700g.p99005.je0
    public LiveData<Long> a(final String key) {
        g50 e = g50.e("SELECT long_value FROM Preference where `key`=?", 1);
        if (key == null) {
            e.l1(1);
        } else {
            e.J(1, key);
        }
        return this.a.l().e(new String[]{"Preference"}, false, new b(e));
    }

    @Override // com.p7700g.p99005.je0
    public Long b(final String key) {
        g50 e = g50.e("SELECT long_value FROM Preference where `key`=?", 1);
        if (key == null) {
            e.l1(1);
        } else {
            e.J(1, key);
        }
        this.a.b();
        Long l = null;
        Cursor d = w50.d(this.a, e, false, null);
        try {
            if (d.moveToFirst() && !d.isNull(0)) {
                l = Long.valueOf(d.getLong(0));
            }
            return l;
        } finally {
            d.close();
            e.release();
        }
    }

    @Override // com.p7700g.p99005.je0
    public void c(final ie0 preference) {
        this.a.b();
        this.a.c();
        try {
            this.b.i(preference);
            this.a.A();
        } finally {
            this.a.i();
        }
    }
}