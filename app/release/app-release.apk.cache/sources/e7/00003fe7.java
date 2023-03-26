package com.p7700g.p99005;

import com.p7700g.p99005.i2;

/* compiled from: RoomMasterTable.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class e50 {
    public static final String a = "room_master_table";
    public static final String b = "room_master_table";
    private static final String c = "id";
    private static final String d = "identity_hash";
    public static final String e = "42";
    public static final String f = "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)";
    public static final String g = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1";

    private e50() {
    }

    public static String a(String str) {
        return wo1.u("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '", str, "')");
    }
}