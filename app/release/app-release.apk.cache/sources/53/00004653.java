package com.p7700g.p99005;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DependencyDao_Impl.java */
/* loaded from: classes.dex */
public final class he0 implements ge0 {
    private final d50 a;
    private final i40<fe0> b;

    /* compiled from: DependencyDao_Impl.java */
    /* loaded from: classes.dex */
    public class a extends i40<fe0> {
        public a(d50 database) {
            super(database);
        }

        @Override // com.p7700g.p99005.l50
        public String d() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // com.p7700g.p99005.i40
        /* renamed from: r */
        public void g(s60 stmt, fe0 value) {
            String str = value.a;
            if (str == null) {
                stmt.l1(1);
            } else {
                stmt.J(1, str);
            }
            String str2 = value.b;
            if (str2 == null) {
                stmt.l1(2);
            } else {
                stmt.J(2, str2);
            }
        }
    }

    public he0(d50 __db) {
        this.a = __db;
        this.b = new a(__db);
    }

    @Override // com.p7700g.p99005.ge0
    public void a(final fe0 dependency) {
        this.a.b();
        this.a.c();
        try {
            this.b.i(dependency);
            this.a.A();
        } finally {
            this.a.i();
        }
    }

    @Override // com.p7700g.p99005.ge0
    public List<String> b(final String id) {
        g50 e = g50.e("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (id == null) {
            e.l1(1);
        } else {
            e.J(1, id);
        }
        this.a.b();
        Cursor d = w50.d(this.a, e, false, null);
        try {
            ArrayList arrayList = new ArrayList(d.getCount());
            while (d.moveToNext()) {
                arrayList.add(d.getString(0));
            }
            return arrayList;
        } finally {
            d.close();
            e.release();
        }
    }

    @Override // com.p7700g.p99005.ge0
    public boolean c(final String id) {
        g50 e = g50.e("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (id == null) {
            e.l1(1);
        } else {
            e.J(1, id);
        }
        this.a.b();
        boolean z = false;
        Cursor d = w50.d(this.a, e, false, null);
        try {
            if (d.moveToFirst()) {
                z = d.getInt(0) != 0;
            }
            return z;
        } finally {
            d.close();
            e.release();
        }
    }

    @Override // com.p7700g.p99005.ge0
    public boolean d(final String id) {
        g50 e = g50.e("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (id == null) {
            e.l1(1);
        } else {
            e.J(1, id);
        }
        this.a.b();
        boolean z = false;
        Cursor d = w50.d(this.a, e, false, null);
        try {
            if (d.moveToFirst()) {
                z = d.getInt(0) != 0;
            }
            return z;
        } finally {
            d.close();
            e.release();
        }
    }

    @Override // com.p7700g.p99005.ge0
    public List<String> e(final String id) {
        g50 e = g50.e("SELECT prerequisite_id FROM dependency WHERE work_spec_id=?", 1);
        if (id == null) {
            e.l1(1);
        } else {
            e.J(1, id);
        }
        this.a.b();
        Cursor d = w50.d(this.a, e, false, null);
        try {
            ArrayList arrayList = new ArrayList(d.getCount());
            while (d.moveToNext()) {
                arrayList.add(d.getString(0));
            }
            return arrayList;
        } finally {
            d.close();
            e.release();
        }
    }
}