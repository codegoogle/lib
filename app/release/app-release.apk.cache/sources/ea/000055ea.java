package com.p7700g.p99005;

import android.content.Context;
import android.os.Build;
import com.p7700g.p99005.i2;

/* compiled from: WorkDatabaseMigrations.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class pc0 {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    public static final int d = 4;
    public static final int e = 5;
    public static final int f = 6;
    public static final int g = 7;
    public static final int h = 8;
    public static final int i = 9;
    public static final int j = 10;
    public static final int k = 11;
    public static final int l = 12;
    private static final String m = "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )";
    private static final String n = "INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo";
    private static final String o = "UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0";
    private static final String p = "DROP TABLE IF EXISTS alarmInfo";
    private static final String q = "ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1";
    private static final String r = "ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1";
    private static final String s = "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )";
    private static final String t = "CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)";
    private static final String u = "ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0";
    public static final String v = "INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)";
    private static final String w = "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))";
    private static final String x = "ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0";
    @x1
    public static s50 y = new a(1, 2);
    @x1
    public static s50 z = new b(3, 4);
    @x1
    public static s50 A = new c(4, 5);
    @x1
    public static s50 B = new d(6, 7);
    @x1
    public static s50 C = new e(7, 8);
    @x1
    public static s50 D = new f(8, 9);
    @x1
    public static s50 E = new g(11, 12);

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: classes.dex */
    public class a extends s50 {
        public a(int startVersion, int endVersion) {
            super(startVersion, endVersion);
        }

        @Override // com.p7700g.p99005.s50
        public void a(@x1 n60 database) {
            database.I(pc0.m);
            database.I(pc0.n);
            database.I(pc0.p);
            database.I("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: classes.dex */
    public class b extends s50 {
        public b(int startVersion, int endVersion) {
            super(startVersion, endVersion);
        }

        @Override // com.p7700g.p99005.s50
        public void a(@x1 n60 database) {
            if (Build.VERSION.SDK_INT >= 23) {
                database.I(pc0.o);
            }
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: classes.dex */
    public class c extends s50 {
        public c(int startVersion, int endVersion) {
            super(startVersion, endVersion);
        }

        @Override // com.p7700g.p99005.s50
        public void a(@x1 n60 database) {
            database.I(pc0.q);
            database.I(pc0.r);
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: classes.dex */
    public class d extends s50 {
        public d(int startVersion, int endVersion) {
            super(startVersion, endVersion);
        }

        @Override // com.p7700g.p99005.s50
        public void a(@x1 n60 database) {
            database.I(pc0.s);
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: classes.dex */
    public class e extends s50 {
        public e(int startVersion, int endVersion) {
            super(startVersion, endVersion);
        }

        @Override // com.p7700g.p99005.s50
        public void a(@x1 n60 database) {
            database.I(pc0.t);
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: classes.dex */
    public class f extends s50 {
        public f(int startVersion, int endVersion) {
            super(startVersion, endVersion);
        }

        @Override // com.p7700g.p99005.s50
        public void a(@x1 n60 database) {
            database.I(pc0.u);
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: classes.dex */
    public class g extends s50 {
        public g(int startVersion, int endVersion) {
            super(startVersion, endVersion);
        }

        @Override // com.p7700g.p99005.s50
        public void a(@x1 n60 database) {
            database.I(pc0.x);
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: classes.dex */
    public static class h extends s50 {
        public final Context c;

        public h(@x1 Context context, int startVersion, int endVersion) {
            super(startVersion, endVersion);
            this.c = context;
        }

        @Override // com.p7700g.p99005.s50
        public void a(@x1 n60 database) {
            if (this.b >= 10) {
                database.B0(pc0.v, new Object[]{jf0.c, 1});
            } else {
                this.c.getSharedPreferences(jf0.a, 0).edit().putBoolean(jf0.c, true).apply();
            }
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: classes.dex */
    public static class i extends s50 {
        public final Context c;

        public i(@x1 Context context) {
            super(9, 10);
            this.c = context;
        }

        @Override // com.p7700g.p99005.s50
        public void a(@x1 n60 database) {
            database.I(pc0.w);
            jf0.d(this.c, database);
            gf0.a(this.c, database);
        }
    }

    private pc0() {
    }
}