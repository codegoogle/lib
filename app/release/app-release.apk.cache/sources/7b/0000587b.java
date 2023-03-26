package com.p7700g.p99005;

import android.provider.BaseColumns;

/* compiled from: OneSignalDbContract.java */
/* loaded from: classes3.dex */
public class qm3 {

    /* compiled from: OneSignalDbContract.java */
    /* loaded from: classes3.dex */
    public static abstract class a implements BaseColumns {
        public static final String a = "in_app_message";
        public static final String b = "message_id";
        public static final String c = "display_quantity";
        public static final String d = "last_display";
        public static final String e = "click_ids";
        public static final String f = "displayed_in_session";
    }

    /* compiled from: OneSignalDbContract.java */
    /* loaded from: classes3.dex */
    public static abstract class b implements BaseColumns {
        public static final String a = "notification";
        public static final String b = "notification_id";
        public static final String c = "android_notification_id";
        public static final String d = "group_id";
        public static final String e = "collapse_id";
        public static final String f = "is_summary";
        public static final String g = "opened";
        public static final String h = "dismissed";
        public static final String i = "title";
        public static final String j = "message";
        public static final String k = "created_time";
        public static final String l = "expire_time";
        public static final String m = "full_data";
        public static final String n = "CREATE INDEX notification_notification_id_idx ON notification(notification_id); ";
        public static final String o = "CREATE INDEX notification_android_notification_id_idx ON notification(android_notification_id); ";
        public static final String p = "CREATE INDEX notification_group_id_idx ON notification(group_id); ";
        public static final String q = "CREATE INDEX notification_collapse_id_idx ON notification(collapse_id); ";
        public static final String r = "CREATE INDEX notification_created_time_idx ON notification(created_time); ";
        public static final String s = "CREATE INDEX notification_expire_time_idx ON notification(expire_time); ";
    }
}