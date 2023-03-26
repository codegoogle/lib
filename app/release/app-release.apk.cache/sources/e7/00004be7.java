package com.p7700g.p99005;

import com.microsoft.appcenter.AppCenter;
import com.p7700g.p99005.g43;
import com.squareup.moshi.adapters.Iso8601Utils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;

/* compiled from: HttpHeaderParser.java */
/* loaded from: classes3.dex */
public class k53 {
    public static final String a = "Content-Type";
    private static final String b = "ISO-8859-1";
    private static final String c = "EEE, dd MMM yyyy HH:mm:ss zzz";

    public static String a(long epoch) {
        return wo1.j(epoch, b());
    }

    private static SimpleDateFormat b() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(c, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(Iso8601Utils.GMT_ID));
        return simpleDateFormat;
    }

    public static g43.a c(p43 response) {
        boolean z;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = response.c;
        String str = map.get(sm4.l);
        long f = str != null ? f(str) : 0L;
        String str2 = map.get(sm4.f);
        int i = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            int i2 = 0;
            j = 0;
            j2 = 0;
            while (i < split.length) {
                String trim = split[i].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j2 = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    i2 = 1;
                }
                i++;
            }
            i = i2;
            z = true;
        } else {
            z = false;
            j = 0;
            j2 = 0;
        }
        String str3 = map.get(sm4.n);
        long f2 = str3 != null ? f(str3) : 0L;
        String str4 = map.get(sm4.t);
        long f3 = str4 != null ? f(str4) : 0L;
        String str5 = map.get(sm4.m);
        if (z) {
            j4 = currentTimeMillis + (j * 1000);
            if (i != 0) {
                j5 = j4;
            } else {
                Long.signum(j2);
                j5 = (j2 * 1000) + j4;
            }
            j3 = j5;
        } else {
            j3 = 0;
            if (f <= 0 || f2 < f) {
                j4 = 0;
            } else {
                j4 = currentTimeMillis + (f2 - f);
                j3 = j4;
            }
        }
        g43.a aVar = new g43.a();
        aVar.a = response.b;
        aVar.b = str5;
        aVar.f = j4;
        aVar.e = j3;
        aVar.c = f;
        aVar.d = f3;
        aVar.g = map;
        aVar.h = response.d;
        return aVar;
    }

    public static String d(Map<String, String> headers) {
        return e(headers, b);
    }

    public static String e(Map<String, String> headers, String defaultCharset) {
        String str = headers.get("Content-Type");
        if (str != null) {
            String[] split = str.split(AppCenter.PAIR_DELIMITER, 0);
            for (int i = 1; i < split.length; i++) {
                String[] split2 = split[i].trim().split(AppCenter.KEY_VALUE_DELIMITER, 0);
                if (split2.length == 2 && split2[0].equals("charset")) {
                    return split2[1];
                }
            }
        }
        return defaultCharset;
    }

    public static long f(String dateStr) {
        try {
            return b().parse(dateStr).getTime();
        } catch (ParseException e) {
            c53.d(e, "Unable to parse dateStr: %s, falling back to 0", dateStr);
            return 0L;
        }
    }

    public static List<l43> g(Map<String, String> headers) {
        ArrayList arrayList = new ArrayList(headers.size());
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            arrayList.add(new l43(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    public static Map<String, String> h(List<l43> allHeaders) {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (l43 l43Var : allHeaders) {
            treeMap.put(l43Var.a(), l43Var.b());
        }
        return treeMap;
    }
}