package com.p7700g.p99005;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WorkNameDao_Impl.java */
/* loaded from: classes.dex */
public final class se0 implements re0 {
    private final d50 a;
    private final i40<qe0> b;

    /* compiled from: WorkNameDao_Impl.java */
    /* loaded from: classes.dex */
    public class a extends i40<qe0> {
        public a(d50 database) {
            super(database);
        }

        @Override // com.p7700g.p99005.l50
        public String d() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // com.p7700g.p99005.i40
        /* renamed from: r */
        public void g(s60 stmt, qe0 value) {
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

    public se0(d50 __db) {
        this.a = __db;
        this.b = new a(__db);
    }

    @Override // com.p7700g.p99005.re0
    public void a(final qe0 workName) {
        this.a.b();
        this.a.c();
        try {
            this.b.i(workName);
            this.a.A();
        } finally {
            this.a.i();
        }
    }

    @Override // com.p7700g.p99005.re0
    public List<String> b(final String name) {
        g50 e = g50.e("SELECT work_spec_id FROM workname WHERE name=?", 1);
        if (name == null) {
            e.l1(1);
        } else {
            e.J(1, name);
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

    @Override // com.p7700g.p99005.re0
    public List<String> c(final String workSpecId) {
        g50 e = g50.e("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (workSpecId == null) {
            e.l1(1);
        } else {
            e.J(1, workSpecId);
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