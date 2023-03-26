package com.p7700g.p99005;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.p7700g.p99005.dc0;
import com.p7700g.p99005.we0;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: WorkSpecDao_Impl.java */
/* loaded from: classes.dex */
public final class ye0 implements xe0 {
    private final d50 a;
    private final i40<we0> b;
    private final l50 c;
    private final l50 d;
    private final l50 e;
    private final l50 f;
    private final l50 g;
    private final l50 h;
    private final l50 i;
    private final l50 j;

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    public class a implements Callable<List<String>> {
        public final /* synthetic */ g50 a;

        public a(final g50 val$_statement) {
            this.a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<String> call() throws Exception {
            ye0.this.a.c();
            try {
                Cursor d = w50.d(ye0.this.a, this.a, false, null);
                ArrayList arrayList = new ArrayList(d.getCount());
                while (d.moveToNext()) {
                    arrayList.add(d.getString(0));
                }
                ye0.this.a.A();
                d.close();
                return arrayList;
            } finally {
                ye0.this.a.i();
            }
        }

        public void finalize() {
            this.a.release();
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    public class b implements Callable<List<we0.c>> {
        public final /* synthetic */ g50 a;

        public b(final g50 val$_statement) {
            this.a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<we0.c> call() throws Exception {
            ye0.this.a.c();
            try {
                Cursor d = w50.d(ye0.this.a, this.a, true, null);
                int c = v50.c(d, "id");
                int c2 = v50.c(d, CallMraidJS.b);
                int c3 = v50.c(d, "output");
                int c4 = v50.c(d, "run_attempt_count");
                q7 q7Var = new q7();
                q7 q7Var2 = new q7();
                while (d.moveToNext()) {
                    if (!d.isNull(c)) {
                        String string = d.getString(c);
                        if (((ArrayList) q7Var.get(string)) == null) {
                            q7Var.put(string, new ArrayList());
                        }
                    }
                    if (!d.isNull(c)) {
                        String string2 = d.getString(c);
                        if (((ArrayList) q7Var2.get(string2)) == null) {
                            q7Var2.put(string2, new ArrayList());
                        }
                    }
                }
                d.moveToPosition(-1);
                ye0.this.J(q7Var);
                ye0.this.I(q7Var2);
                ArrayList arrayList = new ArrayList(d.getCount());
                while (d.moveToNext()) {
                    ArrayList arrayList2 = !d.isNull(c) ? (ArrayList) q7Var.get(d.getString(c)) : null;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    ArrayList arrayList3 = !d.isNull(c) ? (ArrayList) q7Var2.get(d.getString(c)) : null;
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    we0.c cVar = new we0.c();
                    cVar.a = d.getString(c);
                    cVar.b = cf0.g(d.getInt(c2));
                    cVar.c = kb0.m(d.getBlob(c3));
                    cVar.d = d.getInt(c4);
                    cVar.e = arrayList2;
                    cVar.f = arrayList3;
                    arrayList.add(cVar);
                }
                ye0.this.a.A();
                d.close();
                return arrayList;
            } finally {
                ye0.this.a.i();
            }
        }

        public void finalize() {
            this.a.release();
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    public class c implements Callable<List<we0.c>> {
        public final /* synthetic */ g50 a;

        public c(final g50 val$_statement) {
            this.a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<we0.c> call() throws Exception {
            ye0.this.a.c();
            try {
                Cursor d = w50.d(ye0.this.a, this.a, true, null);
                int c = v50.c(d, "id");
                int c2 = v50.c(d, CallMraidJS.b);
                int c3 = v50.c(d, "output");
                int c4 = v50.c(d, "run_attempt_count");
                q7 q7Var = new q7();
                q7 q7Var2 = new q7();
                while (d.moveToNext()) {
                    if (!d.isNull(c)) {
                        String string = d.getString(c);
                        if (((ArrayList) q7Var.get(string)) == null) {
                            q7Var.put(string, new ArrayList());
                        }
                    }
                    if (!d.isNull(c)) {
                        String string2 = d.getString(c);
                        if (((ArrayList) q7Var2.get(string2)) == null) {
                            q7Var2.put(string2, new ArrayList());
                        }
                    }
                }
                d.moveToPosition(-1);
                ye0.this.J(q7Var);
                ye0.this.I(q7Var2);
                ArrayList arrayList = new ArrayList(d.getCount());
                while (d.moveToNext()) {
                    ArrayList arrayList2 = !d.isNull(c) ? (ArrayList) q7Var.get(d.getString(c)) : null;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    ArrayList arrayList3 = !d.isNull(c) ? (ArrayList) q7Var2.get(d.getString(c)) : null;
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    we0.c cVar = new we0.c();
                    cVar.a = d.getString(c);
                    cVar.b = cf0.g(d.getInt(c2));
                    cVar.c = kb0.m(d.getBlob(c3));
                    cVar.d = d.getInt(c4);
                    cVar.e = arrayList2;
                    cVar.f = arrayList3;
                    arrayList.add(cVar);
                }
                ye0.this.a.A();
                d.close();
                return arrayList;
            } finally {
                ye0.this.a.i();
            }
        }

        public void finalize() {
            this.a.release();
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    public class d implements Callable<List<we0.c>> {
        public final /* synthetic */ g50 a;

        public d(final g50 val$_statement) {
            this.a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<we0.c> call() throws Exception {
            ye0.this.a.c();
            try {
                Cursor d = w50.d(ye0.this.a, this.a, true, null);
                int c = v50.c(d, "id");
                int c2 = v50.c(d, CallMraidJS.b);
                int c3 = v50.c(d, "output");
                int c4 = v50.c(d, "run_attempt_count");
                q7 q7Var = new q7();
                q7 q7Var2 = new q7();
                while (d.moveToNext()) {
                    if (!d.isNull(c)) {
                        String string = d.getString(c);
                        if (((ArrayList) q7Var.get(string)) == null) {
                            q7Var.put(string, new ArrayList());
                        }
                    }
                    if (!d.isNull(c)) {
                        String string2 = d.getString(c);
                        if (((ArrayList) q7Var2.get(string2)) == null) {
                            q7Var2.put(string2, new ArrayList());
                        }
                    }
                }
                d.moveToPosition(-1);
                ye0.this.J(q7Var);
                ye0.this.I(q7Var2);
                ArrayList arrayList = new ArrayList(d.getCount());
                while (d.moveToNext()) {
                    ArrayList arrayList2 = !d.isNull(c) ? (ArrayList) q7Var.get(d.getString(c)) : null;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    ArrayList arrayList3 = !d.isNull(c) ? (ArrayList) q7Var2.get(d.getString(c)) : null;
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    we0.c cVar = new we0.c();
                    cVar.a = d.getString(c);
                    cVar.b = cf0.g(d.getInt(c2));
                    cVar.c = kb0.m(d.getBlob(c3));
                    cVar.d = d.getInt(c4);
                    cVar.e = arrayList2;
                    cVar.f = arrayList3;
                    arrayList.add(cVar);
                }
                ye0.this.a.A();
                d.close();
                return arrayList;
            } finally {
                ye0.this.a.i();
            }
        }

        public void finalize() {
            this.a.release();
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    public class e implements Callable<Long> {
        public final /* synthetic */ g50 a;

        public e(final g50 val$_statement) {
            this.a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Long call() throws Exception {
            Long l = null;
            Cursor d = w50.d(ye0.this.a, this.a, false, null);
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

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    public class f extends i40<we0> {
        public f(d50 database) {
            super(database);
        }

        @Override // com.p7700g.p99005.l50
        public String d() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // com.p7700g.p99005.i40
        /* renamed from: r */
        public void g(s60 stmt, we0 value) {
            String str = value.d;
            if (str == null) {
                stmt.l1(1);
            } else {
                stmt.J(1, str);
            }
            stmt.u0(2, cf0.j(value.e));
            String str2 = value.f;
            if (str2 == null) {
                stmt.l1(3);
            } else {
                stmt.J(3, str2);
            }
            String str3 = value.g;
            if (str3 == null) {
                stmt.l1(4);
            } else {
                stmt.J(4, str3);
            }
            byte[] F = kb0.F(value.h);
            if (F == null) {
                stmt.l1(5);
            } else {
                stmt.I0(5, F);
            }
            byte[] F2 = kb0.F(value.i);
            if (F2 == null) {
                stmt.l1(6);
            } else {
                stmt.I0(6, F2);
            }
            stmt.u0(7, value.j);
            stmt.u0(8, value.k);
            stmt.u0(9, value.l);
            stmt.u0(10, value.n);
            stmt.u0(11, cf0.a(value.o));
            stmt.u0(12, value.p);
            stmt.u0(13, value.q);
            stmt.u0(14, value.r);
            stmt.u0(15, value.s);
            stmt.u0(16, value.t ? 1L : 0L);
            stmt.u0(17, cf0.i(value.u));
            ib0 ib0Var = value.m;
            if (ib0Var != null) {
                stmt.u0(18, cf0.h(ib0Var.b()));
                stmt.u0(19, ib0Var.g() ? 1L : 0L);
                stmt.u0(20, ib0Var.h() ? 1L : 0L);
                stmt.u0(21, ib0Var.f() ? 1L : 0L);
                stmt.u0(22, ib0Var.i() ? 1L : 0L);
                stmt.u0(23, ib0Var.c());
                stmt.u0(24, ib0Var.d());
                byte[] c = cf0.c(ib0Var.a());
                if (c == null) {
                    stmt.l1(25);
                    return;
                } else {
                    stmt.I0(25, c);
                    return;
                }
            }
            stmt.l1(18);
            stmt.l1(19);
            stmt.l1(20);
            stmt.l1(21);
            stmt.l1(22);
            stmt.l1(23);
            stmt.l1(24);
            stmt.l1(25);
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    public class g extends l50 {
        public g(d50 database) {
            super(database);
        }

        @Override // com.p7700g.p99005.l50
        public String d() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    public class h extends l50 {
        public h(d50 database) {
            super(database);
        }

        @Override // com.p7700g.p99005.l50
        public String d() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    public class i extends l50 {
        public i(d50 database) {
            super(database);
        }

        @Override // com.p7700g.p99005.l50
        public String d() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    public class j extends l50 {
        public j(d50 database) {
            super(database);
        }

        @Override // com.p7700g.p99005.l50
        public String d() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    public class k extends l50 {
        public k(d50 database) {
            super(database);
        }

        @Override // com.p7700g.p99005.l50
        public String d() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    public class l extends l50 {
        public l(d50 database) {
            super(database);
        }

        @Override // com.p7700g.p99005.l50
        public String d() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    public class m extends l50 {
        public m(d50 database) {
            super(database);
        }

        @Override // com.p7700g.p99005.l50
        public String d() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    public class n extends l50 {
        public n(d50 database) {
            super(database);
        }

        @Override // com.p7700g.p99005.l50
        public String d() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public ye0(d50 __db) {
        this.a = __db;
        this.b = new f(__db);
        this.c = new g(__db);
        this.d = new h(__db);
        this.e = new i(__db);
        this.f = new j(__db);
        this.g = new k(__db);
        this.h = new l(__db);
        this.i = new m(__db);
        this.j = new n(__db);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I(final q7<String, ArrayList<kb0>> _map) {
        ArrayList<kb0> arrayList;
        int i2;
        Set<String> keySet = _map.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (_map.size() > 999) {
            q7<String, ArrayList<kb0>> q7Var = new q7<>((int) d50.b);
            int size = _map.size();
            int i3 = 0;
            loop0: while (true) {
                i2 = 0;
                while (i3 < size) {
                    q7Var.put(_map.n(i3), _map.r(i3));
                    i3++;
                    i2++;
                    if (i2 == 999) {
                        break;
                    }
                }
                I(q7Var);
                q7Var = new q7<>((int) d50.b);
            }
            if (i2 > 0) {
                I(q7Var);
                return;
            }
            return;
        }
        StringBuilder c2 = a60.c();
        c2.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size2 = keySet.size();
        a60.a(c2, size2);
        c2.append(")");
        g50 e2 = g50.e(c2.toString(), size2 + 0);
        int i4 = 1;
        for (String str : keySet) {
            if (str == null) {
                e2.l1(i4);
            } else {
                e2.J(i4, str);
            }
            i4++;
        }
        Cursor d2 = w50.d(this.a, e2, false, null);
        try {
            int b2 = v50.b(d2, "work_spec_id");
            if (b2 == -1) {
                return;
            }
            while (d2.moveToNext()) {
                if (!d2.isNull(b2) && (arrayList = _map.get(d2.getString(b2))) != null) {
                    arrayList.add(kb0.m(d2.getBlob(0)));
                }
            }
        } finally {
            d2.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J(final q7<String, ArrayList<String>> _map) {
        ArrayList<String> arrayList;
        int i2;
        Set<String> keySet = _map.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (_map.size() > 999) {
            q7<String, ArrayList<String>> q7Var = new q7<>((int) d50.b);
            int size = _map.size();
            int i3 = 0;
            loop0: while (true) {
                i2 = 0;
                while (i3 < size) {
                    q7Var.put(_map.n(i3), _map.r(i3));
                    i3++;
                    i2++;
                    if (i2 == 999) {
                        break;
                    }
                }
                J(q7Var);
                q7Var = new q7<>((int) d50.b);
            }
            if (i2 > 0) {
                J(q7Var);
                return;
            }
            return;
        }
        StringBuilder c2 = a60.c();
        c2.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size2 = keySet.size();
        a60.a(c2, size2);
        c2.append(")");
        g50 e2 = g50.e(c2.toString(), size2 + 0);
        int i4 = 1;
        for (String str : keySet) {
            if (str == null) {
                e2.l1(i4);
            } else {
                e2.J(i4, str);
            }
            i4++;
        }
        Cursor d2 = w50.d(this.a, e2, false, null);
        try {
            int b2 = v50.b(d2, "work_spec_id");
            if (b2 == -1) {
                return;
            }
            while (d2.moveToNext()) {
                if (!d2.isNull(b2) && (arrayList = _map.get(d2.getString(b2))) != null) {
                    arrayList.add(d2.getString(0));
                }
            }
        } finally {
            d2.close();
        }
    }

    @Override // com.p7700g.p99005.xe0
    public List<kb0> A(final String id) {
        g50 e2 = g50.e("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (id == null) {
            e2.l1(1);
        } else {
            e2.J(1, id);
        }
        this.a.b();
        Cursor d2 = w50.d(this.a, e2, false, null);
        try {
            ArrayList arrayList = new ArrayList(d2.getCount());
            while (d2.moveToNext()) {
                arrayList.add(kb0.m(d2.getBlob(0)));
            }
            return arrayList;
        } finally {
            d2.close();
            e2.release();
        }
    }

    @Override // com.p7700g.p99005.xe0
    public int B(final String id) {
        this.a.b();
        s60 a2 = this.f.a();
        if (id == null) {
            a2.l1(1);
        } else {
            a2.J(1, id);
        }
        this.a.c();
        try {
            int z0 = a2.z0();
            this.a.A();
            return z0;
        } finally {
            this.a.i();
            this.f.f(a2);
        }
    }

    @Override // com.p7700g.p99005.xe0
    public void C(final String id, final long periodStartTime) {
        this.a.b();
        s60 a2 = this.e.a();
        a2.u0(1, periodStartTime);
        if (id == null) {
            a2.l1(2);
        } else {
            a2.J(2, id);
        }
        this.a.c();
        try {
            a2.z0();
            this.a.A();
        } finally {
            this.a.i();
            this.e.f(a2);
        }
    }

    @Override // com.p7700g.p99005.xe0
    public List<we0.c> D(final String name) {
        g50 e2 = g50.e("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (name == null) {
            e2.l1(1);
        } else {
            e2.J(1, name);
        }
        this.a.b();
        this.a.c();
        try {
            Cursor d2 = w50.d(this.a, e2, true, null);
            int c2 = v50.c(d2, "id");
            int c3 = v50.c(d2, CallMraidJS.b);
            int c4 = v50.c(d2, "output");
            int c5 = v50.c(d2, "run_attempt_count");
            q7<String, ArrayList<String>> q7Var = new q7<>();
            q7<String, ArrayList<kb0>> q7Var2 = new q7<>();
            while (d2.moveToNext()) {
                if (!d2.isNull(c2)) {
                    String string = d2.getString(c2);
                    if (q7Var.get(string) == null) {
                        q7Var.put(string, new ArrayList<>());
                    }
                }
                if (!d2.isNull(c2)) {
                    String string2 = d2.getString(c2);
                    if (q7Var2.get(string2) == null) {
                        q7Var2.put(string2, new ArrayList<>());
                    }
                }
            }
            d2.moveToPosition(-1);
            J(q7Var);
            I(q7Var2);
            ArrayList arrayList = new ArrayList(d2.getCount());
            while (d2.moveToNext()) {
                ArrayList<String> arrayList2 = !d2.isNull(c2) ? q7Var.get(d2.getString(c2)) : null;
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>();
                }
                ArrayList<kb0> arrayList3 = !d2.isNull(c2) ? q7Var2.get(d2.getString(c2)) : null;
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList<>();
                }
                we0.c cVar = new we0.c();
                cVar.a = d2.getString(c2);
                cVar.b = cf0.g(d2.getInt(c3));
                cVar.c = kb0.m(d2.getBlob(c4));
                cVar.d = d2.getInt(c5);
                cVar.e = arrayList2;
                cVar.f = arrayList3;
                arrayList.add(cVar);
            }
            this.a.A();
            d2.close();
            e2.release();
            return arrayList;
        } finally {
            this.a.i();
        }
    }

    @Override // com.p7700g.p99005.xe0
    public List<we0.c> E(final List<String> ids) {
        StringBuilder c2 = a60.c();
        c2.append("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (");
        int size = ids.size();
        a60.a(c2, size);
        c2.append(")");
        g50 e2 = g50.e(c2.toString(), size + 0);
        int i2 = 1;
        for (String str : ids) {
            if (str == null) {
                e2.l1(i2);
            } else {
                e2.J(i2, str);
            }
            i2++;
        }
        this.a.b();
        this.a.c();
        try {
            Cursor d2 = w50.d(this.a, e2, true, null);
            int c3 = v50.c(d2, "id");
            int c4 = v50.c(d2, CallMraidJS.b);
            int c5 = v50.c(d2, "output");
            int c6 = v50.c(d2, "run_attempt_count");
            q7<String, ArrayList<String>> q7Var = new q7<>();
            q7<String, ArrayList<kb0>> q7Var2 = new q7<>();
            while (d2.moveToNext()) {
                if (!d2.isNull(c3)) {
                    String string = d2.getString(c3);
                    if (q7Var.get(string) == null) {
                        q7Var.put(string, new ArrayList<>());
                    }
                }
                if (!d2.isNull(c3)) {
                    String string2 = d2.getString(c3);
                    if (q7Var2.get(string2) == null) {
                        q7Var2.put(string2, new ArrayList<>());
                    }
                }
            }
            d2.moveToPosition(-1);
            J(q7Var);
            I(q7Var2);
            ArrayList arrayList = new ArrayList(d2.getCount());
            while (d2.moveToNext()) {
                ArrayList<String> arrayList2 = !d2.isNull(c3) ? q7Var.get(d2.getString(c3)) : null;
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>();
                }
                ArrayList<kb0> arrayList3 = !d2.isNull(c3) ? q7Var2.get(d2.getString(c3)) : null;
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList<>();
                }
                we0.c cVar = new we0.c();
                cVar.a = d2.getString(c3);
                cVar.b = cf0.g(d2.getInt(c4));
                cVar.c = kb0.m(d2.getBlob(c5));
                cVar.d = d2.getInt(c6);
                cVar.e = arrayList2;
                cVar.f = arrayList3;
                arrayList.add(cVar);
            }
            this.a.A();
            d2.close();
            e2.release();
            return arrayList;
        } finally {
            this.a.i();
        }
    }

    @Override // com.p7700g.p99005.xe0
    public List<we0> F(final int maxLimit) {
        g50 g50Var;
        int c2;
        int c3;
        int c4;
        int c5;
        int c6;
        int c7;
        int c8;
        int c9;
        int c10;
        int c11;
        int c12;
        int c13;
        int c14;
        int c15;
        g50 e2 = g50.e("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        e2.u0(1, maxLimit);
        this.a.b();
        Cursor d2 = w50.d(this.a, e2, false, null);
        try {
            c2 = v50.c(d2, "required_network_type");
            c3 = v50.c(d2, "requires_charging");
            c4 = v50.c(d2, "requires_device_idle");
            c5 = v50.c(d2, "requires_battery_not_low");
            c6 = v50.c(d2, "requires_storage_not_low");
            c7 = v50.c(d2, "trigger_content_update_delay");
            c8 = v50.c(d2, "trigger_max_content_delay");
            c9 = v50.c(d2, "content_uri_triggers");
            c10 = v50.c(d2, "id");
            c11 = v50.c(d2, CallMraidJS.b);
            c12 = v50.c(d2, "worker_class_name");
            c13 = v50.c(d2, "input_merger_class_name");
            c14 = v50.c(d2, "input");
            c15 = v50.c(d2, "output");
            g50Var = e2;
        } catch (Throwable th) {
            th = th;
            g50Var = e2;
        }
        try {
            int c16 = v50.c(d2, "initial_delay");
            int c17 = v50.c(d2, "interval_duration");
            int c18 = v50.c(d2, "flex_duration");
            int c19 = v50.c(d2, "run_attempt_count");
            int c20 = v50.c(d2, "backoff_policy");
            int c21 = v50.c(d2, "backoff_delay_duration");
            int c22 = v50.c(d2, "period_start_time");
            int c23 = v50.c(d2, "minimum_retention_duration");
            int c24 = v50.c(d2, "schedule_requested_at");
            int c25 = v50.c(d2, "run_in_foreground");
            int c26 = v50.c(d2, "out_of_quota_policy");
            int i2 = c15;
            ArrayList arrayList = new ArrayList(d2.getCount());
            while (d2.moveToNext()) {
                String string = d2.getString(c10);
                int i3 = c10;
                String string2 = d2.getString(c12);
                int i4 = c12;
                ib0 ib0Var = new ib0();
                int i5 = c2;
                ib0Var.k(cf0.e(d2.getInt(c2)));
                ib0Var.m(d2.getInt(c3) != 0);
                ib0Var.n(d2.getInt(c4) != 0);
                ib0Var.l(d2.getInt(c5) != 0);
                ib0Var.o(d2.getInt(c6) != 0);
                int i6 = c3;
                int i7 = c4;
                ib0Var.p(d2.getLong(c7));
                ib0Var.q(d2.getLong(c8));
                ib0Var.j(cf0.b(d2.getBlob(c9)));
                we0 we0Var = new we0(string, string2);
                we0Var.e = cf0.g(d2.getInt(c11));
                we0Var.g = d2.getString(c13);
                we0Var.h = kb0.m(d2.getBlob(c14));
                int i8 = i2;
                we0Var.i = kb0.m(d2.getBlob(i8));
                i2 = i8;
                int i9 = c16;
                we0Var.j = d2.getLong(i9);
                int i10 = c13;
                int i11 = c17;
                we0Var.k = d2.getLong(i11);
                int i12 = c5;
                int i13 = c18;
                we0Var.l = d2.getLong(i13);
                int i14 = c19;
                we0Var.n = d2.getInt(i14);
                int i15 = c20;
                we0Var.o = cf0.d(d2.getInt(i15));
                c18 = i13;
                int i16 = c21;
                we0Var.p = d2.getLong(i16);
                int i17 = c22;
                we0Var.q = d2.getLong(i17);
                c22 = i17;
                int i18 = c23;
                we0Var.r = d2.getLong(i18);
                int i19 = c24;
                we0Var.s = d2.getLong(i19);
                int i20 = c25;
                we0Var.t = d2.getInt(i20) != 0;
                int i21 = c26;
                we0Var.u = cf0.f(d2.getInt(i21));
                we0Var.m = ib0Var;
                arrayList.add(we0Var);
                c26 = i21;
                c3 = i6;
                c13 = i10;
                c16 = i9;
                c17 = i11;
                c19 = i14;
                c24 = i19;
                c10 = i3;
                c12 = i4;
                c2 = i5;
                c25 = i20;
                c23 = i18;
                c4 = i7;
                c21 = i16;
                c5 = i12;
                c20 = i15;
            }
            d2.close();
            g50Var.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            d2.close();
            g50Var.release();
            throw th;
        }
    }

    @Override // com.p7700g.p99005.xe0
    public List<String> G() {
        g50 e2 = g50.e("SELECT id FROM workspec", 0);
        this.a.b();
        Cursor d2 = w50.d(this.a, e2, false, null);
        try {
            ArrayList arrayList = new ArrayList(d2.getCount());
            while (d2.moveToNext()) {
                arrayList.add(d2.getString(0));
            }
            return arrayList;
        } finally {
            d2.close();
            e2.release();
        }
    }

    @Override // com.p7700g.p99005.xe0
    public int H() {
        this.a.b();
        s60 a2 = this.i.a();
        this.a.c();
        try {
            int z0 = a2.z0();
            this.a.A();
            return z0;
        } finally {
            this.a.i();
            this.i.f(a2);
        }
    }

    @Override // com.p7700g.p99005.xe0
    public void a(final String id) {
        this.a.b();
        s60 a2 = this.c.a();
        if (id == null) {
            a2.l1(1);
        } else {
            a2.J(1, id);
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

    @Override // com.p7700g.p99005.xe0
    public int b(final dc0.a state, final String... ids) {
        this.a.b();
        StringBuilder c2 = a60.c();
        c2.append("UPDATE workspec SET state=");
        c2.append("?");
        c2.append(" WHERE id IN (");
        a60.a(c2, ids.length);
        c2.append(")");
        s60 f2 = this.a.f(c2.toString());
        f2.u0(1, cf0.j(state));
        int i2 = 2;
        for (String str : ids) {
            if (str == null) {
                f2.l1(i2);
            } else {
                f2.J(i2, str);
            }
            i2++;
        }
        this.a.c();
        try {
            int z0 = f2.z0();
            this.a.A();
            return z0;
        } finally {
            this.a.i();
        }
    }

    @Override // com.p7700g.p99005.xe0
    public void c() {
        this.a.b();
        s60 a2 = this.j.a();
        this.a.c();
        try {
            a2.z0();
            this.a.A();
        } finally {
            this.a.i();
            this.j.f(a2);
        }
    }

    @Override // com.p7700g.p99005.xe0
    public int d(final String id, final long startTime) {
        this.a.b();
        s60 a2 = this.h.a();
        a2.u0(1, startTime);
        if (id == null) {
            a2.l1(2);
        } else {
            a2.J(2, id);
        }
        this.a.c();
        try {
            int z0 = a2.z0();
            this.a.A();
            return z0;
        } finally {
            this.a.i();
            this.h.f(a2);
        }
    }

    @Override // com.p7700g.p99005.xe0
    public List<we0.b> e(final String name) {
        g50 e2 = g50.e("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (name == null) {
            e2.l1(1);
        } else {
            e2.J(1, name);
        }
        this.a.b();
        Cursor d2 = w50.d(this.a, e2, false, null);
        try {
            int c2 = v50.c(d2, "id");
            int c3 = v50.c(d2, CallMraidJS.b);
            ArrayList arrayList = new ArrayList(d2.getCount());
            while (d2.moveToNext()) {
                we0.b bVar = new we0.b();
                bVar.a = d2.getString(c2);
                bVar.b = cf0.g(d2.getInt(c3));
                arrayList.add(bVar);
            }
            return arrayList;
        } finally {
            d2.close();
            e2.release();
        }
    }

    @Override // com.p7700g.p99005.xe0
    public List<we0> f(final long startingAt) {
        g50 g50Var;
        int c2;
        int c3;
        int c4;
        int c5;
        int c6;
        int c7;
        int c8;
        int c9;
        int c10;
        int c11;
        int c12;
        int c13;
        int c14;
        int c15;
        g50 e2 = g50.e("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        e2.u0(1, startingAt);
        this.a.b();
        Cursor d2 = w50.d(this.a, e2, false, null);
        try {
            c2 = v50.c(d2, "required_network_type");
            c3 = v50.c(d2, "requires_charging");
            c4 = v50.c(d2, "requires_device_idle");
            c5 = v50.c(d2, "requires_battery_not_low");
            c6 = v50.c(d2, "requires_storage_not_low");
            c7 = v50.c(d2, "trigger_content_update_delay");
            c8 = v50.c(d2, "trigger_max_content_delay");
            c9 = v50.c(d2, "content_uri_triggers");
            c10 = v50.c(d2, "id");
            c11 = v50.c(d2, CallMraidJS.b);
            c12 = v50.c(d2, "worker_class_name");
            c13 = v50.c(d2, "input_merger_class_name");
            c14 = v50.c(d2, "input");
            c15 = v50.c(d2, "output");
            g50Var = e2;
        } catch (Throwable th) {
            th = th;
            g50Var = e2;
        }
        try {
            int c16 = v50.c(d2, "initial_delay");
            int c17 = v50.c(d2, "interval_duration");
            int c18 = v50.c(d2, "flex_duration");
            int c19 = v50.c(d2, "run_attempt_count");
            int c20 = v50.c(d2, "backoff_policy");
            int c21 = v50.c(d2, "backoff_delay_duration");
            int c22 = v50.c(d2, "period_start_time");
            int c23 = v50.c(d2, "minimum_retention_duration");
            int c24 = v50.c(d2, "schedule_requested_at");
            int c25 = v50.c(d2, "run_in_foreground");
            int c26 = v50.c(d2, "out_of_quota_policy");
            int i2 = c15;
            ArrayList arrayList = new ArrayList(d2.getCount());
            while (d2.moveToNext()) {
                String string = d2.getString(c10);
                int i3 = c10;
                String string2 = d2.getString(c12);
                int i4 = c12;
                ib0 ib0Var = new ib0();
                int i5 = c2;
                ib0Var.k(cf0.e(d2.getInt(c2)));
                ib0Var.m(d2.getInt(c3) != 0);
                ib0Var.n(d2.getInt(c4) != 0);
                ib0Var.l(d2.getInt(c5) != 0);
                ib0Var.o(d2.getInt(c6) != 0);
                int i6 = c3;
                int i7 = c4;
                ib0Var.p(d2.getLong(c7));
                ib0Var.q(d2.getLong(c8));
                ib0Var.j(cf0.b(d2.getBlob(c9)));
                we0 we0Var = new we0(string, string2);
                we0Var.e = cf0.g(d2.getInt(c11));
                we0Var.g = d2.getString(c13);
                we0Var.h = kb0.m(d2.getBlob(c14));
                int i8 = i2;
                we0Var.i = kb0.m(d2.getBlob(i8));
                int i9 = c16;
                i2 = i8;
                we0Var.j = d2.getLong(i9);
                int i10 = c13;
                int i11 = c17;
                we0Var.k = d2.getLong(i11);
                int i12 = c5;
                int i13 = c18;
                we0Var.l = d2.getLong(i13);
                int i14 = c19;
                we0Var.n = d2.getInt(i14);
                int i15 = c20;
                we0Var.o = cf0.d(d2.getInt(i15));
                c18 = i13;
                int i16 = c21;
                we0Var.p = d2.getLong(i16);
                int i17 = c22;
                we0Var.q = d2.getLong(i17);
                c22 = i17;
                int i18 = c23;
                we0Var.r = d2.getLong(i18);
                int i19 = c24;
                we0Var.s = d2.getLong(i19);
                int i20 = c25;
                we0Var.t = d2.getInt(i20) != 0;
                int i21 = c26;
                we0Var.u = cf0.f(d2.getInt(i21));
                we0Var.m = ib0Var;
                arrayList.add(we0Var);
                c3 = i6;
                c26 = i21;
                c13 = i10;
                c16 = i9;
                c17 = i11;
                c19 = i14;
                c24 = i19;
                c10 = i3;
                c12 = i4;
                c2 = i5;
                c25 = i20;
                c23 = i18;
                c4 = i7;
                c21 = i16;
                c5 = i12;
                c20 = i15;
            }
            d2.close();
            g50Var.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            d2.close();
            g50Var.release();
            throw th;
        }
    }

    @Override // com.p7700g.p99005.xe0
    public List<we0> g(final int schedulerLimit) {
        g50 g50Var;
        int c2;
        int c3;
        int c4;
        int c5;
        int c6;
        int c7;
        int c8;
        int c9;
        int c10;
        int c11;
        int c12;
        int c13;
        int c14;
        int c15;
        g50 e2 = g50.e("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        e2.u0(1, schedulerLimit);
        this.a.b();
        Cursor d2 = w50.d(this.a, e2, false, null);
        try {
            c2 = v50.c(d2, "required_network_type");
            c3 = v50.c(d2, "requires_charging");
            c4 = v50.c(d2, "requires_device_idle");
            c5 = v50.c(d2, "requires_battery_not_low");
            c6 = v50.c(d2, "requires_storage_not_low");
            c7 = v50.c(d2, "trigger_content_update_delay");
            c8 = v50.c(d2, "trigger_max_content_delay");
            c9 = v50.c(d2, "content_uri_triggers");
            c10 = v50.c(d2, "id");
            c11 = v50.c(d2, CallMraidJS.b);
            c12 = v50.c(d2, "worker_class_name");
            c13 = v50.c(d2, "input_merger_class_name");
            c14 = v50.c(d2, "input");
            c15 = v50.c(d2, "output");
            g50Var = e2;
        } catch (Throwable th) {
            th = th;
            g50Var = e2;
        }
        try {
            int c16 = v50.c(d2, "initial_delay");
            int c17 = v50.c(d2, "interval_duration");
            int c18 = v50.c(d2, "flex_duration");
            int c19 = v50.c(d2, "run_attempt_count");
            int c20 = v50.c(d2, "backoff_policy");
            int c21 = v50.c(d2, "backoff_delay_duration");
            int c22 = v50.c(d2, "period_start_time");
            int c23 = v50.c(d2, "minimum_retention_duration");
            int c24 = v50.c(d2, "schedule_requested_at");
            int c25 = v50.c(d2, "run_in_foreground");
            int c26 = v50.c(d2, "out_of_quota_policy");
            int i2 = c15;
            ArrayList arrayList = new ArrayList(d2.getCount());
            while (d2.moveToNext()) {
                String string = d2.getString(c10);
                int i3 = c10;
                String string2 = d2.getString(c12);
                int i4 = c12;
                ib0 ib0Var = new ib0();
                int i5 = c2;
                ib0Var.k(cf0.e(d2.getInt(c2)));
                ib0Var.m(d2.getInt(c3) != 0);
                ib0Var.n(d2.getInt(c4) != 0);
                ib0Var.l(d2.getInt(c5) != 0);
                ib0Var.o(d2.getInt(c6) != 0);
                int i6 = c3;
                int i7 = c4;
                ib0Var.p(d2.getLong(c7));
                ib0Var.q(d2.getLong(c8));
                ib0Var.j(cf0.b(d2.getBlob(c9)));
                we0 we0Var = new we0(string, string2);
                we0Var.e = cf0.g(d2.getInt(c11));
                we0Var.g = d2.getString(c13);
                we0Var.h = kb0.m(d2.getBlob(c14));
                int i8 = i2;
                we0Var.i = kb0.m(d2.getBlob(i8));
                i2 = i8;
                int i9 = c16;
                we0Var.j = d2.getLong(i9);
                int i10 = c13;
                int i11 = c17;
                we0Var.k = d2.getLong(i11);
                int i12 = c5;
                int i13 = c18;
                we0Var.l = d2.getLong(i13);
                int i14 = c19;
                we0Var.n = d2.getInt(i14);
                int i15 = c20;
                we0Var.o = cf0.d(d2.getInt(i15));
                c18 = i13;
                int i16 = c21;
                we0Var.p = d2.getLong(i16);
                int i17 = c22;
                we0Var.q = d2.getLong(i17);
                c22 = i17;
                int i18 = c23;
                we0Var.r = d2.getLong(i18);
                int i19 = c24;
                we0Var.s = d2.getLong(i19);
                int i20 = c25;
                we0Var.t = d2.getInt(i20) != 0;
                int i21 = c26;
                we0Var.u = cf0.f(d2.getInt(i21));
                we0Var.m = ib0Var;
                arrayList.add(we0Var);
                c26 = i21;
                c3 = i6;
                c13 = i10;
                c16 = i9;
                c17 = i11;
                c19 = i14;
                c24 = i19;
                c10 = i3;
                c12 = i4;
                c2 = i5;
                c25 = i20;
                c23 = i18;
                c4 = i7;
                c21 = i16;
                c5 = i12;
                c20 = i15;
            }
            d2.close();
            g50Var.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            d2.close();
            g50Var.release();
            throw th;
        }
    }

    @Override // com.p7700g.p99005.xe0
    public void h(final we0 workSpec) {
        this.a.b();
        this.a.c();
        try {
            this.b.i(workSpec);
            this.a.A();
        } finally {
            this.a.i();
        }
    }

    @Override // com.p7700g.p99005.xe0
    public List<we0> i() {
        g50 g50Var;
        int c2;
        int c3;
        int c4;
        int c5;
        int c6;
        int c7;
        int c8;
        int c9;
        int c10;
        int c11;
        int c12;
        int c13;
        int c14;
        int c15;
        g50 e2 = g50.e("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.a.b();
        Cursor d2 = w50.d(this.a, e2, false, null);
        try {
            c2 = v50.c(d2, "required_network_type");
            c3 = v50.c(d2, "requires_charging");
            c4 = v50.c(d2, "requires_device_idle");
            c5 = v50.c(d2, "requires_battery_not_low");
            c6 = v50.c(d2, "requires_storage_not_low");
            c7 = v50.c(d2, "trigger_content_update_delay");
            c8 = v50.c(d2, "trigger_max_content_delay");
            c9 = v50.c(d2, "content_uri_triggers");
            c10 = v50.c(d2, "id");
            c11 = v50.c(d2, CallMraidJS.b);
            c12 = v50.c(d2, "worker_class_name");
            c13 = v50.c(d2, "input_merger_class_name");
            c14 = v50.c(d2, "input");
            c15 = v50.c(d2, "output");
            g50Var = e2;
        } catch (Throwable th) {
            th = th;
            g50Var = e2;
        }
        try {
            int c16 = v50.c(d2, "initial_delay");
            int c17 = v50.c(d2, "interval_duration");
            int c18 = v50.c(d2, "flex_duration");
            int c19 = v50.c(d2, "run_attempt_count");
            int c20 = v50.c(d2, "backoff_policy");
            int c21 = v50.c(d2, "backoff_delay_duration");
            int c22 = v50.c(d2, "period_start_time");
            int c23 = v50.c(d2, "minimum_retention_duration");
            int c24 = v50.c(d2, "schedule_requested_at");
            int c25 = v50.c(d2, "run_in_foreground");
            int c26 = v50.c(d2, "out_of_quota_policy");
            int i2 = c15;
            ArrayList arrayList = new ArrayList(d2.getCount());
            while (d2.moveToNext()) {
                String string = d2.getString(c10);
                int i3 = c10;
                String string2 = d2.getString(c12);
                int i4 = c12;
                ib0 ib0Var = new ib0();
                int i5 = c2;
                ib0Var.k(cf0.e(d2.getInt(c2)));
                ib0Var.m(d2.getInt(c3) != 0);
                ib0Var.n(d2.getInt(c4) != 0);
                ib0Var.l(d2.getInt(c5) != 0);
                ib0Var.o(d2.getInt(c6) != 0);
                int i6 = c3;
                int i7 = c4;
                ib0Var.p(d2.getLong(c7));
                ib0Var.q(d2.getLong(c8));
                ib0Var.j(cf0.b(d2.getBlob(c9)));
                we0 we0Var = new we0(string, string2);
                we0Var.e = cf0.g(d2.getInt(c11));
                we0Var.g = d2.getString(c13);
                we0Var.h = kb0.m(d2.getBlob(c14));
                int i8 = i2;
                we0Var.i = kb0.m(d2.getBlob(i8));
                i2 = i8;
                int i9 = c16;
                we0Var.j = d2.getLong(i9);
                int i10 = c14;
                int i11 = c17;
                we0Var.k = d2.getLong(i11);
                int i12 = c5;
                int i13 = c18;
                we0Var.l = d2.getLong(i13);
                int i14 = c19;
                we0Var.n = d2.getInt(i14);
                int i15 = c20;
                we0Var.o = cf0.d(d2.getInt(i15));
                c18 = i13;
                int i16 = c21;
                we0Var.p = d2.getLong(i16);
                int i17 = c22;
                we0Var.q = d2.getLong(i17);
                c22 = i17;
                int i18 = c23;
                we0Var.r = d2.getLong(i18);
                int i19 = c24;
                we0Var.s = d2.getLong(i19);
                int i20 = c25;
                we0Var.t = d2.getInt(i20) != 0;
                int i21 = c26;
                we0Var.u = cf0.f(d2.getInt(i21));
                we0Var.m = ib0Var;
                arrayList.add(we0Var);
                c26 = i21;
                c3 = i6;
                c14 = i10;
                c16 = i9;
                c17 = i11;
                c19 = i14;
                c24 = i19;
                c10 = i3;
                c12 = i4;
                c2 = i5;
                c25 = i20;
                c23 = i18;
                c4 = i7;
                c21 = i16;
                c5 = i12;
                c20 = i15;
            }
            d2.close();
            g50Var.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            d2.close();
            g50Var.release();
            throw th;
        }
    }

    @Override // com.p7700g.p99005.xe0
    public we0[] j(final List<String> ids) {
        g50 g50Var;
        StringBuilder c2 = a60.c();
        c2.append("SELECT ");
        c2.append(tm4.g);
        c2.append(" FROM workspec WHERE id IN (");
        int size = ids.size();
        a60.a(c2, size);
        c2.append(")");
        g50 e2 = g50.e(c2.toString(), size + 0);
        int i2 = 1;
        for (String str : ids) {
            if (str == null) {
                e2.l1(i2);
            } else {
                e2.J(i2, str);
            }
            i2++;
        }
        this.a.b();
        Cursor d2 = w50.d(this.a, e2, false, null);
        try {
            int c3 = v50.c(d2, "required_network_type");
            int c4 = v50.c(d2, "requires_charging");
            int c5 = v50.c(d2, "requires_device_idle");
            int c6 = v50.c(d2, "requires_battery_not_low");
            int c7 = v50.c(d2, "requires_storage_not_low");
            int c8 = v50.c(d2, "trigger_content_update_delay");
            int c9 = v50.c(d2, "trigger_max_content_delay");
            int c10 = v50.c(d2, "content_uri_triggers");
            int c11 = v50.c(d2, "id");
            int c12 = v50.c(d2, CallMraidJS.b);
            int c13 = v50.c(d2, "worker_class_name");
            int c14 = v50.c(d2, "input_merger_class_name");
            int c15 = v50.c(d2, "input");
            int c16 = v50.c(d2, "output");
            g50Var = e2;
            try {
                int c17 = v50.c(d2, "initial_delay");
                int c18 = v50.c(d2, "interval_duration");
                int c19 = v50.c(d2, "flex_duration");
                int c20 = v50.c(d2, "run_attempt_count");
                int c21 = v50.c(d2, "backoff_policy");
                int c22 = v50.c(d2, "backoff_delay_duration");
                int c23 = v50.c(d2, "period_start_time");
                int c24 = v50.c(d2, "minimum_retention_duration");
                int c25 = v50.c(d2, "schedule_requested_at");
                int c26 = v50.c(d2, "run_in_foreground");
                int c27 = v50.c(d2, "out_of_quota_policy");
                we0[] we0VarArr = new we0[d2.getCount()];
                int i3 = 0;
                while (d2.moveToNext()) {
                    we0[] we0VarArr2 = we0VarArr;
                    String string = d2.getString(c11);
                    int i4 = c11;
                    String string2 = d2.getString(c13);
                    int i5 = c13;
                    ib0 ib0Var = new ib0();
                    int i6 = c3;
                    ib0Var.k(cf0.e(d2.getInt(c3)));
                    ib0Var.m(d2.getInt(c4) != 0);
                    ib0Var.n(d2.getInt(c5) != 0);
                    ib0Var.l(d2.getInt(c6) != 0);
                    ib0Var.o(d2.getInt(c7) != 0);
                    int i7 = c4;
                    int i8 = c5;
                    ib0Var.p(d2.getLong(c8));
                    ib0Var.q(d2.getLong(c9));
                    ib0Var.j(cf0.b(d2.getBlob(c10)));
                    we0 we0Var = new we0(string, string2);
                    we0Var.e = cf0.g(d2.getInt(c12));
                    we0Var.g = d2.getString(c14);
                    we0Var.h = kb0.m(d2.getBlob(c15));
                    we0Var.i = kb0.m(d2.getBlob(c16));
                    int i9 = c16;
                    int i10 = c17;
                    we0Var.j = d2.getLong(i10);
                    c17 = i10;
                    int i11 = c18;
                    we0Var.k = d2.getLong(i11);
                    int i12 = c14;
                    int i13 = c19;
                    we0Var.l = d2.getLong(i13);
                    int i14 = c20;
                    we0Var.n = d2.getInt(i14);
                    int i15 = c21;
                    we0Var.o = cf0.d(d2.getInt(i15));
                    c19 = i13;
                    int i16 = c22;
                    we0Var.p = d2.getLong(i16);
                    int i17 = c23;
                    we0Var.q = d2.getLong(i17);
                    c23 = i17;
                    int i18 = c24;
                    we0Var.r = d2.getLong(i18);
                    c24 = i18;
                    int i19 = c25;
                    we0Var.s = d2.getLong(i19);
                    int i20 = c26;
                    we0Var.t = d2.getInt(i20) != 0;
                    int i21 = c27;
                    we0Var.u = cf0.f(d2.getInt(i21));
                    we0Var.m = ib0Var;
                    we0VarArr2[i3] = we0Var;
                    i3++;
                    c27 = i21;
                    c4 = i7;
                    c25 = i19;
                    we0VarArr = we0VarArr2;
                    c11 = i4;
                    c13 = i5;
                    c3 = i6;
                    c26 = i20;
                    c16 = i9;
                    c5 = i8;
                    c22 = i16;
                    c14 = i12;
                    c18 = i11;
                    c20 = i14;
                    c21 = i15;
                }
                we0[] we0VarArr3 = we0VarArr;
                d2.close();
                g50Var.release();
                return we0VarArr3;
            } catch (Throwable th) {
                th = th;
                d2.close();
                g50Var.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            g50Var = e2;
        }
    }

    @Override // com.p7700g.p99005.xe0
    public void k(final String id, final kb0 output) {
        this.a.b();
        s60 a2 = this.d.a();
        byte[] F = kb0.F(output);
        if (F == null) {
            a2.l1(1);
        } else {
            a2.I0(1, F);
        }
        if (id == null) {
            a2.l1(2);
        } else {
            a2.J(2, id);
        }
        this.a.c();
        try {
            a2.z0();
            this.a.A();
        } finally {
            this.a.i();
            this.d.f(a2);
        }
    }

    @Override // com.p7700g.p99005.xe0
    public LiveData<List<String>> l() {
        return this.a.l().e(new String[]{"workspec"}, true, new a(g50.e("SELECT id FROM workspec", 0)));
    }

    @Override // com.p7700g.p99005.xe0
    public LiveData<List<we0.c>> m(final String name) {
        g50 e2 = g50.e("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (name == null) {
            e2.l1(1);
        } else {
            e2.J(1, name);
        }
        return this.a.l().e(new String[]{"WorkTag", "WorkProgress", "workspec", "workname"}, true, new d(e2));
    }

    @Override // com.p7700g.p99005.xe0
    public List<we0> n() {
        g50 g50Var;
        int c2;
        int c3;
        int c4;
        int c5;
        int c6;
        int c7;
        int c8;
        int c9;
        int c10;
        int c11;
        int c12;
        int c13;
        int c14;
        int c15;
        g50 e2 = g50.e("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        this.a.b();
        Cursor d2 = w50.d(this.a, e2, false, null);
        try {
            c2 = v50.c(d2, "required_network_type");
            c3 = v50.c(d2, "requires_charging");
            c4 = v50.c(d2, "requires_device_idle");
            c5 = v50.c(d2, "requires_battery_not_low");
            c6 = v50.c(d2, "requires_storage_not_low");
            c7 = v50.c(d2, "trigger_content_update_delay");
            c8 = v50.c(d2, "trigger_max_content_delay");
            c9 = v50.c(d2, "content_uri_triggers");
            c10 = v50.c(d2, "id");
            c11 = v50.c(d2, CallMraidJS.b);
            c12 = v50.c(d2, "worker_class_name");
            c13 = v50.c(d2, "input_merger_class_name");
            c14 = v50.c(d2, "input");
            c15 = v50.c(d2, "output");
            g50Var = e2;
        } catch (Throwable th) {
            th = th;
            g50Var = e2;
        }
        try {
            int c16 = v50.c(d2, "initial_delay");
            int c17 = v50.c(d2, "interval_duration");
            int c18 = v50.c(d2, "flex_duration");
            int c19 = v50.c(d2, "run_attempt_count");
            int c20 = v50.c(d2, "backoff_policy");
            int c21 = v50.c(d2, "backoff_delay_duration");
            int c22 = v50.c(d2, "period_start_time");
            int c23 = v50.c(d2, "minimum_retention_duration");
            int c24 = v50.c(d2, "schedule_requested_at");
            int c25 = v50.c(d2, "run_in_foreground");
            int c26 = v50.c(d2, "out_of_quota_policy");
            int i2 = c15;
            ArrayList arrayList = new ArrayList(d2.getCount());
            while (d2.moveToNext()) {
                String string = d2.getString(c10);
                int i3 = c10;
                String string2 = d2.getString(c12);
                int i4 = c12;
                ib0 ib0Var = new ib0();
                int i5 = c2;
                ib0Var.k(cf0.e(d2.getInt(c2)));
                ib0Var.m(d2.getInt(c3) != 0);
                ib0Var.n(d2.getInt(c4) != 0);
                ib0Var.l(d2.getInt(c5) != 0);
                ib0Var.o(d2.getInt(c6) != 0);
                int i6 = c3;
                int i7 = c4;
                ib0Var.p(d2.getLong(c7));
                ib0Var.q(d2.getLong(c8));
                ib0Var.j(cf0.b(d2.getBlob(c9)));
                we0 we0Var = new we0(string, string2);
                we0Var.e = cf0.g(d2.getInt(c11));
                we0Var.g = d2.getString(c13);
                we0Var.h = kb0.m(d2.getBlob(c14));
                int i8 = i2;
                we0Var.i = kb0.m(d2.getBlob(i8));
                i2 = i8;
                int i9 = c16;
                we0Var.j = d2.getLong(i9);
                int i10 = c14;
                int i11 = c17;
                we0Var.k = d2.getLong(i11);
                int i12 = c5;
                int i13 = c18;
                we0Var.l = d2.getLong(i13);
                int i14 = c19;
                we0Var.n = d2.getInt(i14);
                int i15 = c20;
                we0Var.o = cf0.d(d2.getInt(i15));
                c18 = i13;
                int i16 = c21;
                we0Var.p = d2.getLong(i16);
                int i17 = c22;
                we0Var.q = d2.getLong(i17);
                c22 = i17;
                int i18 = c23;
                we0Var.r = d2.getLong(i18);
                int i19 = c24;
                we0Var.s = d2.getLong(i19);
                int i20 = c25;
                we0Var.t = d2.getInt(i20) != 0;
                int i21 = c26;
                we0Var.u = cf0.f(d2.getInt(i21));
                we0Var.m = ib0Var;
                arrayList.add(we0Var);
                c26 = i21;
                c3 = i6;
                c14 = i10;
                c16 = i9;
                c17 = i11;
                c19 = i14;
                c24 = i19;
                c10 = i3;
                c12 = i4;
                c2 = i5;
                c25 = i20;
                c23 = i18;
                c4 = i7;
                c21 = i16;
                c5 = i12;
                c20 = i15;
            }
            d2.close();
            g50Var.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            d2.close();
            g50Var.release();
            throw th;
        }
    }

    @Override // com.p7700g.p99005.xe0
    public LiveData<List<we0.c>> o(final String tag) {
        g50 e2 = g50.e("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (tag == null) {
            e2.l1(1);
        } else {
            e2.J(1, tag);
        }
        return this.a.l().e(new String[]{"WorkTag", "WorkProgress", "workspec", "worktag"}, true, new c(e2));
    }

    @Override // com.p7700g.p99005.xe0
    public List<String> p() {
        g50 e2 = g50.e("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
        this.a.b();
        Cursor d2 = w50.d(this.a, e2, false, null);
        try {
            ArrayList arrayList = new ArrayList(d2.getCount());
            while (d2.moveToNext()) {
                arrayList.add(d2.getString(0));
            }
            return arrayList;
        } finally {
            d2.close();
            e2.release();
        }
    }

    @Override // com.p7700g.p99005.xe0
    public boolean q() {
        boolean z = false;
        g50 e2 = g50.e("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.a.b();
        Cursor d2 = w50.d(this.a, e2, false, null);
        try {
            if (d2.moveToFirst()) {
                if (d2.getInt(0) != 0) {
                    z = true;
                }
            }
            return z;
        } finally {
            d2.close();
            e2.release();
        }
    }

    @Override // com.p7700g.p99005.xe0
    public List<String> r(final String name) {
        g50 e2 = g50.e("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (name == null) {
            e2.l1(1);
        } else {
            e2.J(1, name);
        }
        this.a.b();
        Cursor d2 = w50.d(this.a, e2, false, null);
        try {
            ArrayList arrayList = new ArrayList(d2.getCount());
            while (d2.moveToNext()) {
                arrayList.add(d2.getString(0));
            }
            return arrayList;
        } finally {
            d2.close();
            e2.release();
        }
    }

    @Override // com.p7700g.p99005.xe0
    public we0.c s(final String id) {
        g50 e2 = g50.e("SELECT id, state, output, run_attempt_count FROM workspec WHERE id=?", 1);
        if (id == null) {
            e2.l1(1);
        } else {
            e2.J(1, id);
        }
        this.a.b();
        this.a.c();
        try {
            we0.c cVar = null;
            Cursor d2 = w50.d(this.a, e2, true, null);
            int c2 = v50.c(d2, "id");
            int c3 = v50.c(d2, CallMraidJS.b);
            int c4 = v50.c(d2, "output");
            int c5 = v50.c(d2, "run_attempt_count");
            q7<String, ArrayList<String>> q7Var = new q7<>();
            q7<String, ArrayList<kb0>> q7Var2 = new q7<>();
            while (d2.moveToNext()) {
                if (!d2.isNull(c2)) {
                    String string = d2.getString(c2);
                    if (q7Var.get(string) == null) {
                        q7Var.put(string, new ArrayList<>());
                    }
                }
                if (!d2.isNull(c2)) {
                    String string2 = d2.getString(c2);
                    if (q7Var2.get(string2) == null) {
                        q7Var2.put(string2, new ArrayList<>());
                    }
                }
            }
            d2.moveToPosition(-1);
            J(q7Var);
            I(q7Var2);
            if (d2.moveToFirst()) {
                ArrayList<String> arrayList = !d2.isNull(c2) ? q7Var.get(d2.getString(c2)) : null;
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                ArrayList<kb0> arrayList2 = d2.isNull(c2) ? null : q7Var2.get(d2.getString(c2));
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>();
                }
                we0.c cVar2 = new we0.c();
                cVar2.a = d2.getString(c2);
                cVar2.b = cf0.g(d2.getInt(c3));
                cVar2.c = kb0.m(d2.getBlob(c4));
                cVar2.d = d2.getInt(c5);
                cVar2.e = arrayList;
                cVar2.f = arrayList2;
                cVar = cVar2;
            }
            this.a.A();
            d2.close();
            e2.release();
            return cVar;
        } finally {
            this.a.i();
        }
    }

    @Override // com.p7700g.p99005.xe0
    public dc0.a t(final String id) {
        g50 e2 = g50.e("SELECT state FROM workspec WHERE id=?", 1);
        if (id == null) {
            e2.l1(1);
        } else {
            e2.J(1, id);
        }
        this.a.b();
        Cursor d2 = w50.d(this.a, e2, false, null);
        try {
            return d2.moveToFirst() ? cf0.g(d2.getInt(0)) : null;
        } finally {
            d2.close();
            e2.release();
        }
    }

    @Override // com.p7700g.p99005.xe0
    public we0 u(final String id) {
        g50 g50Var;
        int c2;
        int c3;
        int c4;
        int c5;
        int c6;
        int c7;
        int c8;
        int c9;
        int c10;
        int c11;
        int c12;
        int c13;
        int c14;
        int c15;
        we0 we0Var;
        g50 e2 = g50.e("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (id == null) {
            e2.l1(1);
        } else {
            e2.J(1, id);
        }
        this.a.b();
        Cursor d2 = w50.d(this.a, e2, false, null);
        try {
            c2 = v50.c(d2, "required_network_type");
            c3 = v50.c(d2, "requires_charging");
            c4 = v50.c(d2, "requires_device_idle");
            c5 = v50.c(d2, "requires_battery_not_low");
            c6 = v50.c(d2, "requires_storage_not_low");
            c7 = v50.c(d2, "trigger_content_update_delay");
            c8 = v50.c(d2, "trigger_max_content_delay");
            c9 = v50.c(d2, "content_uri_triggers");
            c10 = v50.c(d2, "id");
            c11 = v50.c(d2, CallMraidJS.b);
            c12 = v50.c(d2, "worker_class_name");
            c13 = v50.c(d2, "input_merger_class_name");
            c14 = v50.c(d2, "input");
            c15 = v50.c(d2, "output");
            g50Var = e2;
        } catch (Throwable th) {
            th = th;
            g50Var = e2;
        }
        try {
            int c16 = v50.c(d2, "initial_delay");
            int c17 = v50.c(d2, "interval_duration");
            int c18 = v50.c(d2, "flex_duration");
            int c19 = v50.c(d2, "run_attempt_count");
            int c20 = v50.c(d2, "backoff_policy");
            int c21 = v50.c(d2, "backoff_delay_duration");
            int c22 = v50.c(d2, "period_start_time");
            int c23 = v50.c(d2, "minimum_retention_duration");
            int c24 = v50.c(d2, "schedule_requested_at");
            int c25 = v50.c(d2, "run_in_foreground");
            int c26 = v50.c(d2, "out_of_quota_policy");
            if (d2.moveToFirst()) {
                String string = d2.getString(c10);
                String string2 = d2.getString(c12);
                ib0 ib0Var = new ib0();
                ib0Var.k(cf0.e(d2.getInt(c2)));
                ib0Var.m(d2.getInt(c3) != 0);
                ib0Var.n(d2.getInt(c4) != 0);
                ib0Var.l(d2.getInt(c5) != 0);
                ib0Var.o(d2.getInt(c6) != 0);
                ib0Var.p(d2.getLong(c7));
                ib0Var.q(d2.getLong(c8));
                ib0Var.j(cf0.b(d2.getBlob(c9)));
                we0 we0Var2 = new we0(string, string2);
                we0Var2.e = cf0.g(d2.getInt(c11));
                we0Var2.g = d2.getString(c13);
                we0Var2.h = kb0.m(d2.getBlob(c14));
                we0Var2.i = kb0.m(d2.getBlob(c15));
                we0Var2.j = d2.getLong(c16);
                we0Var2.k = d2.getLong(c17);
                we0Var2.l = d2.getLong(c18);
                we0Var2.n = d2.getInt(c19);
                we0Var2.o = cf0.d(d2.getInt(c20));
                we0Var2.p = d2.getLong(c21);
                we0Var2.q = d2.getLong(c22);
                we0Var2.r = d2.getLong(c23);
                we0Var2.s = d2.getLong(c24);
                we0Var2.t = d2.getInt(c25) != 0;
                we0Var2.u = cf0.f(d2.getInt(c26));
                we0Var2.m = ib0Var;
                we0Var = we0Var2;
            } else {
                we0Var = null;
            }
            d2.close();
            g50Var.release();
            return we0Var;
        } catch (Throwable th2) {
            th = th2;
            d2.close();
            g50Var.release();
            throw th;
        }
    }

    @Override // com.p7700g.p99005.xe0
    public int v(final String id) {
        this.a.b();
        s60 a2 = this.g.a();
        if (id == null) {
            a2.l1(1);
        } else {
            a2.J(1, id);
        }
        this.a.c();
        try {
            int z0 = a2.z0();
            this.a.A();
            return z0;
        } finally {
            this.a.i();
            this.g.f(a2);
        }
    }

    @Override // com.p7700g.p99005.xe0
    public List<we0.c> w(final String tag) {
        g50 e2 = g50.e("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (tag == null) {
            e2.l1(1);
        } else {
            e2.J(1, tag);
        }
        this.a.b();
        this.a.c();
        try {
            Cursor d2 = w50.d(this.a, e2, true, null);
            int c2 = v50.c(d2, "id");
            int c3 = v50.c(d2, CallMraidJS.b);
            int c4 = v50.c(d2, "output");
            int c5 = v50.c(d2, "run_attempt_count");
            q7<String, ArrayList<String>> q7Var = new q7<>();
            q7<String, ArrayList<kb0>> q7Var2 = new q7<>();
            while (d2.moveToNext()) {
                if (!d2.isNull(c2)) {
                    String string = d2.getString(c2);
                    if (q7Var.get(string) == null) {
                        q7Var.put(string, new ArrayList<>());
                    }
                }
                if (!d2.isNull(c2)) {
                    String string2 = d2.getString(c2);
                    if (q7Var2.get(string2) == null) {
                        q7Var2.put(string2, new ArrayList<>());
                    }
                }
            }
            d2.moveToPosition(-1);
            J(q7Var);
            I(q7Var2);
            ArrayList arrayList = new ArrayList(d2.getCount());
            while (d2.moveToNext()) {
                ArrayList<String> arrayList2 = !d2.isNull(c2) ? q7Var.get(d2.getString(c2)) : null;
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>();
                }
                ArrayList<kb0> arrayList3 = !d2.isNull(c2) ? q7Var2.get(d2.getString(c2)) : null;
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList<>();
                }
                we0.c cVar = new we0.c();
                cVar.a = d2.getString(c2);
                cVar.b = cf0.g(d2.getInt(c3));
                cVar.c = kb0.m(d2.getBlob(c4));
                cVar.d = d2.getInt(c5);
                cVar.e = arrayList2;
                cVar.f = arrayList3;
                arrayList.add(cVar);
            }
            this.a.A();
            d2.close();
            e2.release();
            return arrayList;
        } finally {
            this.a.i();
        }
    }

    @Override // com.p7700g.p99005.xe0
    public LiveData<Long> x(final String id) {
        g50 e2 = g50.e("SELECT schedule_requested_at FROM workspec WHERE id=?", 1);
        if (id == null) {
            e2.l1(1);
        } else {
            e2.J(1, id);
        }
        return this.a.l().e(new String[]{"workspec"}, false, new e(e2));
    }

    @Override // com.p7700g.p99005.xe0
    public LiveData<List<we0.c>> y(final List<String> ids) {
        StringBuilder c2 = a60.c();
        c2.append("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (");
        int size = ids.size();
        a60.a(c2, size);
        c2.append(")");
        g50 e2 = g50.e(c2.toString(), size + 0);
        int i2 = 1;
        for (String str : ids) {
            if (str == null) {
                e2.l1(i2);
            } else {
                e2.J(i2, str);
            }
            i2++;
        }
        return this.a.l().e(new String[]{"WorkTag", "WorkProgress", "workspec"}, true, new b(e2));
    }

    @Override // com.p7700g.p99005.xe0
    public List<String> z(final String tag) {
        g50 e2 = g50.e("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (tag == null) {
            e2.l1(1);
        } else {
            e2.J(1, tag);
        }
        this.a.b();
        Cursor d2 = w50.d(this.a, e2, false, null);
        try {
            ArrayList arrayList = new ArrayList(d2.getCount());
            while (d2.moveToNext()) {
                arrayList.add(d2.getString(0));
            }
            return arrayList;
        } finally {
            d2.close();
            e2.release();
        }
    }
}