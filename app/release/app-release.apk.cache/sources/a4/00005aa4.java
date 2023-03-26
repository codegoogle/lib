package com.p7700g.p99005;

import android.os.Bundle;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
/* loaded from: classes3.dex */
public final class rs2 {
    @x1
    public static final String a = "FirebaseMessaging";
    @x1
    public static final String b = "wake:com.google.firebase.messaging";
    public static final long c = TimeUnit.MINUTES.toMillis(3);
    @x1
    public static final String d = "error";

    /* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
    /* loaded from: classes3.dex */
    public static final class a {
        @x1
        public static final String a = "google.c.a.";
        @x1
        public static final String b = "google.c.a.e";
        @x1
        public static final String c = "google.c.a.c_id";
        @x1
        public static final String d = "google.c.a.c_l";
        @x1
        public static final String e = "google.c.a.ts";
        @x1
        public static final String f = "google.c.a.udt";
        @x1
        public static final String g = "google.c.a.tc";
        @x1
        public static final String h = "google.c.a.abt";
        @x1
        public static final String i = "google.c.a.m_l";
        @x1
        public static final String j = "google.c.a.m_c";

        private a() {
        }
    }

    /* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
    /* loaded from: classes3.dex */
    public static final class b {
        @x1
        public static final String a = "FCM_CLIENT_EVENT_LOGGING";

        private b() {
        }
    }

    /* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
    /* loaded from: classes3.dex */
    public static final class c {
        @x1
        public static final String A = "gcm.n.click_action";
        @x1
        public static final String B = "gcm.n.link";
        @x1
        public static final String C = "gcm.n.link_android";
        @x1
        public static final String D = "gcm.n.android_channel_id";
        @x1
        public static final String E = "gcm.n.analytics_data";
        @x1
        public static final String F = "_loc_key";
        @x1
        public static final String G = "_loc_args";
        @x1
        public static final String a = "gcm.";
        @x1
        public static final String b = "gcm.n.";
        @x1
        public static final String c = "gcm.notification.";
        @x1
        public static final String d = "gcm.n.e";
        @x1
        public static final String e = "gcm.n.dnp";
        @x1
        public static final String f = "gcm.n.noui";
        @x1
        public static final String g = "gcm.n.title";
        @x1
        public static final String h = "gcm.n.body";
        @x1
        public static final String i = "gcm.n.icon";
        @x1
        public static final String j = "gcm.n.image";
        @x1
        public static final String k = "gcm.n.tag";
        @x1
        public static final String l = "gcm.n.color";
        @x1
        public static final String m = "gcm.n.ticker";
        @x1
        public static final String n = "gcm.n.local_only";
        @x1
        public static final String o = "gcm.n.sticky";
        @x1
        public static final String p = "gcm.n.notification_priority";
        @x1
        public static final String q = "gcm.n.default_sound";
        @x1
        public static final String r = "gcm.n.default_vibrate_timings";
        @x1
        public static final String s = "gcm.n.default_light_settings";
        @x1
        public static final String t = "gcm.n.notification_count";
        @x1
        public static final String u = "gcm.n.visibility";
        @x1
        public static final String v = "gcm.n.vibrate_timings";
        @x1
        public static final String w = "gcm.n.light_settings";
        @x1
        public static final String x = "gcm.n.event_time";
        @x1
        public static final String y = "gcm.n.sound2";
        @x1
        public static final String z = "gcm.n.sound";

        private c() {
        }
    }

    /* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
    /* loaded from: classes3.dex */
    public static final class d {
        @x1
        public static final String a = "google.";
        @x1
        public static final String b = "from";
        @x1
        public static final String c = "rawData";
        @x1
        public static final String d = "message_type";
        @x1
        public static final String e = "collapse_key";
        @x1
        public static final String f = "message_id";
        @x1
        public static final String g = "google.to";
        @x1
        public static final String h = "google.message_id";
        @x1
        public static final String i = "google.ttl";
        @x1
        public static final String j = "google.sent_time";
        @x1
        public static final String k = "google.original_priority";
        @x1
        public static final String l = "google.delivered_priority";
        @x1
        public static final String m = "google.priority";
        @x1
        public static final String n = "google.priority_reduced";
        @x1
        public static final String o = "google.c.";
        @x1
        public static final String p = "google.c.sender.id";

        private d() {
        }

        @x1
        public static q7<String, String> a(@x1 Bundle bundle) {
            q7<String, String> q7Var = new q7<>();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith(a) && !str.startsWith(c.a) && !str.equals("from") && !str.equals(d) && !str.equals(e)) {
                        q7Var.put(str, str2);
                    }
                }
            }
            return q7Var;
        }
    }

    /* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
    /* loaded from: classes3.dex */
    public static final class e {
        @x1
        public static final String a = "gcm";
        @x1
        public static final String b = "deleted_messages";
        @x1
        public static final String c = "send_event";
        @x1
        public static final String d = "send_error";

        private e() {
        }
    }

    /* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
    /* loaded from: classes3.dex */
    public static final class f {
        @x1
        public static final String a = "fcm";
        @x1
        public static final String b = "source";
        @x1
        public static final String c = "medium";
        @x1
        public static final String d = "label";
        @x1
        public static final String e = "_nt";
        @x1
        public static final String f = "campaign";
        @x1
        public static final String g = "_nmn";
        @x1
        public static final String h = "_nmt";
        @x1
        public static final String i = "_ndt";
        @x1
        public static final String j = "message_channel";
        @x1
        public static final String k = "_nmc";
        @x1
        public static final String l = "_cmp";
        @x1
        public static final String m = "_nr";
        @x1
        public static final String n = "_no";
        @x1
        public static final String o = "_nd";
        @x1
        public static final String p = "_nf";
        @x1
        public static final String q = "_ln";

        /* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
        /* loaded from: classes3.dex */
        public @interface a {
            @x1
            public static final String u0 = "data";
            @x1
            public static final String v0 = "display";
        }

        private f() {
        }
    }

    private rs2() {
    }
}