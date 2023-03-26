package com.p7700g.p99005;

import com.ironsource.mediationsdk.impressionData.ImpressionData;
import java.util.ArrayList;
import java.util.List;

/* compiled from: RemoteConfigData.java */
/* loaded from: classes.dex */
public class j41 {
    @mw2("application")
    @z1
    public a a;

    /* compiled from: RemoteConfigData.java */
    /* loaded from: classes.dex */
    public static class a {
        @mw2("analytics")
        @z1
        public b a;

        @z1
        public b a() {
            return this.a;
        }
    }

    /* compiled from: RemoteConfigData.java */
    /* loaded from: classes.dex */
    public static class b {
        @mw2("report_name")
        @z1
        public String a;
        @mw2(ImpressionData.IMPRESSION_DATA_KEY_COUNTRY)
        @z1
        public String b;
        @mw2("domains")
        @z1
        public c c;

        @x1
        public String a() {
            String str = this.b;
            return str == null ? "" : str;
        }

        @x1
        public c b() {
            c cVar = this.c;
            return cVar == null ? new c() : cVar;
        }

        @x1
        public String c() {
            String str = this.a;
            return str == null ? "" : str;
        }

        @x1
        public List<String> d(boolean z) {
            ArrayList arrayList = new ArrayList(b().b());
            if (z) {
                arrayList.addAll(b().a());
            }
            return arrayList;
        }

        public boolean e() {
            return (this.b == null || this.a == null || this.c == null) ? false : true;
        }
    }

    /* compiled from: RemoteConfigData.java */
    /* loaded from: classes.dex */
    public static class c {
        @mw2("primary")
        @z1
        public List<String> a;
        @mw2("backup")
        @z1
        public List<String> b;

        @x1
        public List<String> a() {
            List<String> list = this.b;
            return list == null ? new ArrayList() : list;
        }

        @x1
        public List<String> b() {
            List<String> list = this.a;
            return list == null ? new ArrayList() : list;
        }
    }

    @z1
    public a a() {
        return this.a;
    }
}