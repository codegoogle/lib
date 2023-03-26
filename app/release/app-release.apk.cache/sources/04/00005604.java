package com.p7700g.p99005;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* compiled from: SystemIdInfoDao_Impl.java */
/* loaded from: classes.dex */
public final class pe0 implements oe0 {
    private final d50 a;
    private final i40<ne0> b;
    private final l50 c;

    /* compiled from: SystemIdInfoDao_Impl.java */
    /* loaded from: classes.dex */
    public class a extends i40<ne0> {
        public a(d50 database) {
            super(database);
        }

        @Override // com.p7700g.p99005.l50
        public String d() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        @Override // com.p7700g.p99005.i40
        /* renamed from: r */
        public void g(s60 stmt, ne0 value) {
            String str = value.a;
            if (str == null) {
                stmt.l1(1);
            } else {
                stmt.J(1, str);
            }
            stmt.u0(2, value.b);
        }
    }

    /* compiled from: SystemIdInfoDao_Impl.java */
    /* loaded from: classes.dex */
    public class b extends l50 {
        public b(d50 database) {
            super(database);
        }

        @Override // com.p7700g.p99005.l50
        public String d() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public pe0(d50 __db) {
        this.a = __db;
        this.b = new a(__db);
        this.c = new b(__db);
    }

    @Override // com.p7700g.p99005.oe0
    public List<String> a() {
        g50 e = g50.e("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
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

    @Override // com.p7700g.p99005.oe0
    public void b(final ne0 systemIdInfo) {
        this.a.b();
        this.a.c();
        try {
            this.b.i(systemIdInfo);
            this.a.A();
        } finally {
            this.a.i();
        }
    }

    @Override // com.p7700g.p99005.oe0
    public ne0 c(final String workSpecId) {
        g50 e = g50.e("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (workSpecId == null) {
            e.l1(1);
        } else {
            e.J(1, workSpecId);
        }
        this.a.b();
        Cursor d = w50.d(this.a, e, false, null);
        try {
            return d.moveToFirst() ? new ne0(d.getString(v50.c(d, "work_spec_id")), d.getInt(v50.c(d, "system_id"))) : null;
        } finally {
            d.close();
            e.release();
        }
    }

    @Override // com.p7700g.p99005.oe0
    public void d(final String workSpecId) {
        this.a.b();
        s60 a2 = this.c.a();
        if (workSpecId == null) {
            a2.l1(1);
        } else {
            a2.J(1, workSpecId);
        }
        this.a.c();
        try {
            a2.z0();
            this.a.A();
        } finally {
            this.a.i();
            this.c.f(a2);
        }
    }
}