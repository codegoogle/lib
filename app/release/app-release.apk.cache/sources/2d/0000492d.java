package com.p7700g.p99005;

import com.microsoft.appcenter.AppCenter;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: CookiesParser.java */
/* loaded from: classes3.dex */
public class it3 {

    /* compiled from: CookiesParser.java */
    /* loaded from: classes3.dex */
    public static class a {
        public String a;
        public String b;
        public int c = 1;
        public String d = null;
        public String e = null;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public pm4 a() {
            return new pm4(this.a, this.b, this.d, this.e, this.c);
        }
    }

    /* compiled from: CookiesParser.java */
    /* loaded from: classes3.dex */
    public static class b {
        public String a;
        public String b;
        public String c = null;
        public String d = null;
        public int e = 1;
        public String f = null;
        public int g = -1;
        public boolean h = false;

        public b(String str, String str2) {
            this.a = null;
            this.b = null;
            this.a = str;
            this.b = str2;
        }

        public vm4 a() {
            return new vm4(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        }
    }

    public static pm4 a(String str) {
        return b(str).entrySet().iterator().next().getValue();
    }

    public static Map<String, pm4> b(String str) {
        String[] split = str.split("[;,]");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a aVar = null;
        int i = 0;
        for (String str2 : split) {
            String[] split2 = str2.split(AppCenter.KEY_VALUE_DELIMITER, 2);
            String trim = split2.length > 0 ? split2[0].trim() : "";
            String trim2 = split2.length > 1 ? split2[1].trim() : "";
            if (trim2.startsWith("\"") && trim2.endsWith("\"") && trim2.length() > 1) {
                trim2 = trim2.substring(1, trim2.length() - 1);
            }
            if (!trim.startsWith("$")) {
                if (aVar != null) {
                    linkedHashMap.put(aVar.a, aVar.a());
                }
                aVar = new a(trim, trim2);
                aVar.c = i;
            } else if (trim.startsWith("$Version")) {
                i = Integer.parseInt(trim2);
            } else if (trim.startsWith("$Path") && aVar != null) {
                aVar.d = trim2;
            } else if (trim.startsWith("$Domain") && aVar != null) {
                aVar.e = trim2;
            }
        }
        if (aVar != null) {
            linkedHashMap.put(aVar.a, aVar.a());
        }
        return linkedHashMap;
    }

    public static vm4 c(String str) {
        b bVar = null;
        for (String str2 : str.split("[;,]")) {
            String[] split = str2.split(AppCenter.KEY_VALUE_DELIMITER, 2);
            String trim = split.length > 0 ? split[0].trim() : "";
            String trim2 = split.length > 1 ? split[1].trim() : "";
            if (trim2.startsWith("\"") && trim2.endsWith("\"") && trim2.length() > 1) {
                trim2 = trim2.substring(1, trim2.length() - 1);
            }
            if (bVar == null) {
                bVar = new b(trim, trim2);
            } else if (trim.startsWith("Comment")) {
                bVar.f = trim2;
            } else if (trim.startsWith("Domain")) {
                bVar.d = trim2;
            } else if (trim.startsWith("Max-Age")) {
                bVar.g = Integer.parseInt(trim2);
            } else if (trim.startsWith("Path")) {
                bVar.c = trim2;
            } else if (trim.startsWith("Secure")) {
                bVar.h = true;
            } else if (trim.startsWith("Version")) {
                bVar.e = Integer.parseInt(trim2);
            } else if (trim.startsWith("Domain")) {
                bVar.d = trim2;
            }
        }
        return bVar.a();
    }
}