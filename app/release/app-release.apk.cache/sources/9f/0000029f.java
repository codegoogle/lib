package androidx.work.impl;

import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.p7700g.p99005.af0;
import com.p7700g.p99005.b60;
import com.p7700g.p99005.bf0;
import com.p7700g.p99005.c40;
import com.p7700g.p99005.d50;
import com.p7700g.p99005.e50;
import com.p7700g.p99005.f50;
import com.p7700g.p99005.ge0;
import com.p7700g.p99005.he0;
import com.p7700g.p99005.je0;
import com.p7700g.p99005.ke0;
import com.p7700g.p99005.le0;
import com.p7700g.p99005.me0;
import com.p7700g.p99005.n60;
import com.p7700g.p99005.o60;
import com.p7700g.p99005.oe0;
import com.p7700g.p99005.pe0;
import com.p7700g.p99005.re0;
import com.p7700g.p99005.se0;
import com.p7700g.p99005.t40;
import com.p7700g.p99005.ue0;
import com.p7700g.p99005.ve0;
import com.p7700g.p99005.w50;
import com.p7700g.p99005.xe0;
import com.p7700g.p99005.ye0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {
    private volatile xe0 q;
    private volatile ge0 r;
    private volatile af0 s;
    private volatile oe0 t;
    private volatile re0 u;
    private volatile ue0 v;
    private volatile je0 w;
    private volatile le0 x;

    /* loaded from: classes.dex */
    public class a extends f50.a {
        public a(int version) {
            super(version);
        }

        @Override // com.p7700g.p99005.f50.a
        public void a(n60 _db) {
            _db.I("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            _db.I("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            _db.I("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            _db.I("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
            _db.I("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            _db.I("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
            _db.I("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            _db.I("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            _db.I("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            _db.I("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            _db.I("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            _db.I("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            _db.I("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            _db.I(e50.f);
            _db.I("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
        }

        @Override // com.p7700g.p99005.f50.a
        public void b(n60 _db) {
            _db.I("DROP TABLE IF EXISTS `Dependency`");
            _db.I("DROP TABLE IF EXISTS `WorkSpec`");
            _db.I("DROP TABLE IF EXISTS `WorkTag`");
            _db.I("DROP TABLE IF EXISTS `SystemIdInfo`");
            _db.I("DROP TABLE IF EXISTS `WorkName`");
            _db.I("DROP TABLE IF EXISTS `WorkProgress`");
            _db.I("DROP TABLE IF EXISTS `Preference`");
            if (WorkDatabase_Impl.this.j != null) {
                int size = WorkDatabase_Impl.this.j.size();
                for (int i = 0; i < size; i++) {
                    ((d50.b) WorkDatabase_Impl.this.j.get(i)).b(_db);
                }
            }
        }

        @Override // com.p7700g.p99005.f50.a
        public void c(n60 _db) {
            if (WorkDatabase_Impl.this.j != null) {
                int size = WorkDatabase_Impl.this.j.size();
                for (int i = 0; i < size; i++) {
                    ((d50.b) WorkDatabase_Impl.this.j.get(i)).a(_db);
                }
            }
        }

        @Override // com.p7700g.p99005.f50.a
        public void d(n60 _db) {
            WorkDatabase_Impl.this.c = _db;
            _db.I("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.s(_db);
            if (WorkDatabase_Impl.this.j != null) {
                int size = WorkDatabase_Impl.this.j.size();
                for (int i = 0; i < size; i++) {
                    ((d50.b) WorkDatabase_Impl.this.j.get(i)).c(_db);
                }
            }
        }

        @Override // com.p7700g.p99005.f50.a
        public void e(n60 _db) {
        }

        @Override // com.p7700g.p99005.f50.a
        public void f(n60 _db) {
            w50.b(_db);
        }

        @Override // com.p7700g.p99005.f50.a
        public f50.b g(n60 _db) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("work_spec_id", new b60.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap.put("prerequisite_id", new b60.a("prerequisite_id", "TEXT", true, 2, null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new b60.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            hashSet.add(new b60.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new b60.d("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id")));
            hashSet2.add(new b60.d("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id")));
            b60 b60Var = new b60("Dependency", hashMap, hashSet, hashSet2);
            b60 a = b60.a(_db, "Dependency");
            if (!b60Var.equals(a)) {
                return new f50.b(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + b60Var + "\n Found:\n" + a);
            }
            HashMap hashMap2 = new HashMap(25);
            hashMap2.put("id", new b60.a("id", "TEXT", true, 1, null, 1));
            hashMap2.put(CallMraidJS.b, new b60.a(CallMraidJS.b, "INTEGER", true, 0, null, 1));
            hashMap2.put("worker_class_name", new b60.a("worker_class_name", "TEXT", true, 0, null, 1));
            hashMap2.put("input_merger_class_name", new b60.a("input_merger_class_name", "TEXT", false, 0, null, 1));
            hashMap2.put("input", new b60.a("input", "BLOB", true, 0, null, 1));
            hashMap2.put("output", new b60.a("output", "BLOB", true, 0, null, 1));
            hashMap2.put("initial_delay", new b60.a("initial_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("interval_duration", new b60.a("interval_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("flex_duration", new b60.a("flex_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("run_attempt_count", new b60.a("run_attempt_count", "INTEGER", true, 0, null, 1));
            hashMap2.put("backoff_policy", new b60.a("backoff_policy", "INTEGER", true, 0, null, 1));
            hashMap2.put("backoff_delay_duration", new b60.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("period_start_time", new b60.a("period_start_time", "INTEGER", true, 0, null, 1));
            hashMap2.put("minimum_retention_duration", new b60.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("schedule_requested_at", new b60.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
            hashMap2.put("run_in_foreground", new b60.a("run_in_foreground", "INTEGER", true, 0, null, 1));
            hashMap2.put("out_of_quota_policy", new b60.a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
            hashMap2.put("required_network_type", new b60.a("required_network_type", "INTEGER", false, 0, null, 1));
            hashMap2.put("requires_charging", new b60.a("requires_charging", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_device_idle", new b60.a("requires_device_idle", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_battery_not_low", new b60.a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_storage_not_low", new b60.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            hashMap2.put("trigger_content_update_delay", new b60.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("trigger_max_content_delay", new b60.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("content_uri_triggers", new b60.a("content_uri_triggers", "BLOB", false, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new b60.d("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at")));
            hashSet4.add(new b60.d("index_WorkSpec_period_start_time", false, Arrays.asList("period_start_time")));
            b60 b60Var2 = new b60("WorkSpec", hashMap2, hashSet3, hashSet4);
            b60 a2 = b60.a(_db, "WorkSpec");
            if (!b60Var2.equals(a2)) {
                return new f50.b(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + b60Var2 + "\n Found:\n" + a2);
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put("tag", new b60.a("tag", "TEXT", true, 1, null, 1));
            hashMap3.put("work_spec_id", new b60.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new b60.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new b60.d("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id")));
            b60 b60Var3 = new b60("WorkTag", hashMap3, hashSet5, hashSet6);
            b60 a3 = b60.a(_db, "WorkTag");
            if (!b60Var3.equals(a3)) {
                return new f50.b(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + b60Var3 + "\n Found:\n" + a3);
            }
            HashMap hashMap4 = new HashMap(2);
            hashMap4.put("work_spec_id", new b60.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap4.put("system_id", new b60.a("system_id", "INTEGER", true, 0, null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new b60.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            b60 b60Var4 = new b60("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
            b60 a4 = b60.a(_db, "SystemIdInfo");
            if (!b60Var4.equals(a4)) {
                return new f50.b(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + b60Var4 + "\n Found:\n" + a4);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put("name", new b60.a("name", "TEXT", true, 1, null, 1));
            hashMap5.put("work_spec_id", new b60.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new b60.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new b60.d("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id")));
            b60 b60Var5 = new b60("WorkName", hashMap5, hashSet8, hashSet9);
            b60 a5 = b60.a(_db, "WorkName");
            if (!b60Var5.equals(a5)) {
                return new f50.b(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + b60Var5 + "\n Found:\n" + a5);
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("work_spec_id", new b60.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap6.put("progress", new b60.a("progress", "BLOB", true, 0, null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new b60.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            b60 b60Var6 = new b60("WorkProgress", hashMap6, hashSet10, new HashSet(0));
            b60 a6 = b60.a(_db, "WorkProgress");
            if (!b60Var6.equals(a6)) {
                return new f50.b(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + b60Var6 + "\n Found:\n" + a6);
            }
            HashMap hashMap7 = new HashMap(2);
            hashMap7.put("key", new b60.a("key", "TEXT", true, 1, null, 1));
            hashMap7.put("long_value", new b60.a("long_value", "INTEGER", false, 0, null, 1));
            b60 b60Var7 = new b60("Preference", hashMap7, new HashSet(0), new HashSet(0));
            b60 a7 = b60.a(_db, "Preference");
            if (!b60Var7.equals(a7)) {
                return new f50.b(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + b60Var7 + "\n Found:\n" + a7);
            }
            return new f50.b(true, null);
        }
    }

    @Override // androidx.work.impl.WorkDatabase
    public ge0 C() {
        ge0 ge0Var;
        if (this.r != null) {
            return this.r;
        }
        synchronized (this) {
            if (this.r == null) {
                this.r = new he0(this);
            }
            ge0Var = this.r;
        }
        return ge0Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public je0 G() {
        je0 je0Var;
        if (this.w != null) {
            return this.w;
        }
        synchronized (this) {
            if (this.w == null) {
                this.w = new ke0(this);
            }
            je0Var = this.w;
        }
        return je0Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public le0 H() {
        le0 le0Var;
        if (this.x != null) {
            return this.x;
        }
        synchronized (this) {
            if (this.x == null) {
                this.x = new me0(this);
            }
            le0Var = this.x;
        }
        return le0Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public oe0 I() {
        oe0 oe0Var;
        if (this.t != null) {
            return this.t;
        }
        synchronized (this) {
            if (this.t == null) {
                this.t = new pe0(this);
            }
            oe0Var = this.t;
        }
        return oe0Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public re0 J() {
        re0 re0Var;
        if (this.u != null) {
            return this.u;
        }
        synchronized (this) {
            if (this.u == null) {
                this.u = new se0(this);
            }
            re0Var = this.u;
        }
        return re0Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public ue0 K() {
        ue0 ue0Var;
        if (this.v != null) {
            return this.v;
        }
        synchronized (this) {
            if (this.v == null) {
                this.v = new ve0(this);
            }
            ue0Var = this.v;
        }
        return ue0Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public xe0 L() {
        xe0 xe0Var;
        if (this.q != null) {
            return this.q;
        }
        synchronized (this) {
            if (this.q == null) {
                this.q = new ye0(this);
            }
            xe0Var = this.q;
        }
        return xe0Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public af0 M() {
        af0 af0Var;
        if (this.s != null) {
            return this.s;
        }
        synchronized (this) {
            if (this.s == null) {
                this.s = new bf0(this);
            }
            af0Var = this.s;
        }
        return af0Var;
    }

    @Override // com.p7700g.p99005.d50
    public void d() {
        super.a();
        n60 M0 = super.m().M0();
        if (1 == 0) {
            try {
                M0.I("PRAGMA foreign_keys = FALSE");
            } finally {
                super.i();
                if (1 == 0) {
                    M0.I("PRAGMA foreign_keys = TRUE");
                }
                M0.P0("PRAGMA wal_checkpoint(FULL)").close();
                if (!M0.t1()) {
                    M0.I("VACUUM");
                }
            }
        }
        super.c();
        if (1 != 0) {
            M0.I("PRAGMA defer_foreign_keys = TRUE");
        }
        M0.I("DELETE FROM `Dependency`");
        M0.I("DELETE FROM `WorkSpec`");
        M0.I("DELETE FROM `WorkTag`");
        M0.I("DELETE FROM `SystemIdInfo`");
        M0.I("DELETE FROM `WorkName`");
        M0.I("DELETE FROM `WorkProgress`");
        M0.I("DELETE FROM `Preference`");
        super.A();
    }

    @Override // com.p7700g.p99005.d50
    public t40 g() {
        return new t40(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // com.p7700g.p99005.d50
    public o60 h(c40 configuration) {
        return configuration.a.a(o60.b.a(configuration.b).c(configuration.c).b(new f50(configuration, new a(12), "c103703e120ae8cc73c9248622f3cd1e", "49f946663a8deb7054212b8adda248c6")).a());
    }
}