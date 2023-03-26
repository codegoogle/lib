package com.p7700g.p99005;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WorkTagDao_Impl.java */
/* loaded from: classes.dex */
public final class bf0 implements af0 {
    private final d50 a;
    private final i40<ze0> b;

    /* compiled from: WorkTagDao_Impl.java */
    /* loaded from: classes.dex */
    public class a extends i40<ze0> {
        public a(d50 database) {
            super(database);
        }

        @Override // com.p7700g.p99005.l50
        public String d() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // com.p7700g.p99005.i40
        /* renamed from: r */
        public void g(s60 stmt, ze0 value) {
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

    public bf0(d50 __db) {
        this.a = __db;
        this.b = new a(__db);
    }

    @Override // com.p7700g.p99005.af0
    public void a(final ze0 workTag) {
        this.a.b();
        this.a.c();
        try {
            this.b.i(workTag);
            this.a.A();
        } finally {
            this.a.i();
        }
    }

    @Override // com.p7700g.p99005.af0
    public List<String> b(final String id) {
        g50 e = g50.e("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
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

    @Override // com.p7700g.p99005.af0
    public List<String> c(final String tag) {
        g50 e = g50.e("SELECT work_spec_id FROM worktag WHERE tag=?", 1);
        if (tag == null) {
            e.l1(1);
        } else {
            e.J(1, tag);
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