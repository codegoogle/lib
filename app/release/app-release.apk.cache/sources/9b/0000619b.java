package com.p7700g.p99005;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WorkProgressDao_Impl.java */
/* loaded from: classes.dex */
public final class ve0 implements ue0 {
    private final d50 a;
    private final i40<te0> b;
    private final l50 c;
    private final l50 d;

    /* compiled from: WorkProgressDao_Impl.java */
    /* loaded from: classes.dex */
    public class a extends i40<te0> {
        public a(d50 database) {
            super(database);
        }

        @Override // com.p7700g.p99005.l50
        public String d() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // com.p7700g.p99005.i40
        /* renamed from: r */
        public void g(s60 stmt, te0 value) {
            String str = value.a;
            if (str == null) {
                stmt.l1(1);
            } else {
                stmt.J(1, str);
            }
            byte[] F = kb0.F(value.b);
            if (F == null) {
                stmt.l1(2);
            } else {
                stmt.I0(2, F);
            }
        }
    }

    /* compiled from: WorkProgressDao_Impl.java */
    /* loaded from: classes.dex */
    public class b extends l50 {
        public b(d50 database) {
            super(database);
        }

        @Override // com.p7700g.p99005.l50
        public String d() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* compiled from: WorkProgressDao_Impl.java */
    /* loaded from: classes.dex */
    public class c extends l50 {
        public c(d50 database) {
            super(database);
        }

        @Override // com.p7700g.p99005.l50
        public String d() {
            return "DELETE FROM WorkProgress";
        }
    }

    public ve0(d50 __db) {
        this.a = __db;
        this.b = new a(__db);
        this.c = new b(__db);
        this.d = new c(__db);
    }

    @Override // com.p7700g.p99005.ue0
    public void a(final String workSpecId) {
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

    @Override // com.p7700g.p99005.ue0
    public kb0 b(final String workSpecId) {
        g50 e = g50.e("SELECT progress FROM WorkProgress WHERE work_spec_id=?", 1);
        if (workSpecId == null) {
            e.l1(1);
        } else {
            e.J(1, workSpecId);
        }
        this.a.b();
        Cursor d = w50.d(this.a, e, false, null);
        try {
            return d.moveToFirst() ? kb0.m(d.getBlob(0)) : null;
        } finally {
            d.close();
            e.release();
        }
    }

    @Override // com.p7700g.p99005.ue0
    public List<kb0> c(final List<String> workSpecIds) {
        StringBuilder c2 = a60.c();
        c2.append("SELECT progress FROM WorkProgress WHERE work_spec_id IN (");
        int size = workSpecIds.size();
        a60.a(c2, size);
        c2.append(")");
        g50 e = g50.e(c2.toString(), size + 0);
        int i = 1;
        for (String str : workSpecIds) {
            if (str == null) {
                e.l1(i);
            } else {
                e.J(i, str);
            }
            i++;
        }
        this.a.b();
        Cursor d = w50.d(this.a, e, false, null);
        try {
            ArrayList arrayList = new ArrayList(d.getCount());
            while (d.moveToNext()) {
                arrayList.add(kb0.m(d.getBlob(0)));
            }
            return arrayList;
        } finally {
            d.close();
            e.release();
        }
    }

    @Override // com.p7700g.p99005.ue0
    public void d() {
        this.a.b();
        s60 a2 = this.d.a();
        this.a.c();
        try {
            a2.z0();
            this.a.A();
        } finally {
            this.a.i();
            this.d.f(a2);
        }
    }

    @Override // com.p7700g.p99005.ue0
    public void e(final te0 progress) {
        this.a.b();
        this.a.c();
        try {
            this.b.i(progress);
            this.a.A();
        } finally {
            this.a.i();
        }
    }
}