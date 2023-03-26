package com.p7700g.p99005;

import android.net.Uri;
import com.microsoft.appcenter.AppCenter;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: MailTo.java */
/* loaded from: classes.dex */
public final class em {
    public static final String a = "mailto:";
    private static final String b = "mailto";
    private static final String c = "to";
    private static final String d = "body";
    private static final String e = "cc";
    private static final String f = "bcc";
    private static final String g = "subject";
    private HashMap<String, String> h = new HashMap<>();

    private em() {
    }

    public static boolean g(@z1 Uri uri) {
        return uri != null && b.equals(uri.getScheme());
    }

    public static boolean h(@z1 String str) {
        return str != null && str.startsWith(a);
    }

    @x1
    public static em i(@x1 Uri uri) throws fm {
        return j(uri.toString());
    }

    @x1
    public static em j(@x1 String str) throws fm {
        String decode;
        String substring;
        jp.l(str);
        if (h(str)) {
            int indexOf = str.indexOf(35);
            if (indexOf != -1) {
                str = str.substring(0, indexOf);
            }
            int indexOf2 = str.indexOf(63);
            if (indexOf2 == -1) {
                decode = Uri.decode(str.substring(7));
                substring = null;
            } else {
                decode = Uri.decode(str.substring(7, indexOf2));
                substring = str.substring(indexOf2 + 1);
            }
            em emVar = new em();
            if (substring != null) {
                for (String str2 : substring.split("&")) {
                    String[] split = str2.split(AppCenter.KEY_VALUE_DELIMITER, 2);
                    if (split.length != 0) {
                        emVar.h.put(Uri.decode(split[0]).toLowerCase(Locale.ROOT), split.length > 1 ? Uri.decode(split[1]) : null);
                    }
                }
            }
            String f2 = emVar.f();
            if (f2 != null) {
                decode = wo1.u(decode, ", ", f2);
            }
            emVar.h.put("to", decode);
            return emVar;
        }
        throw new fm("Not a mailto scheme");
    }

    @z1
    public String a() {
        return this.h.get(f);
    }

    @z1
    public String b() {
        return this.h.get(d);
    }

    @z1
    public String c() {
        return this.h.get("cc");
    }

    @z1
    public Map<String, String> d() {
        return this.h;
    }

    @z1
    public String e() {
        return this.h.get(g);
    }

    @z1
    public String f() {
        return this.h.get("to");
    }

    @x1
    public String toString() {
        StringBuilder sb = new StringBuilder(a);
        sb.append('?');
        for (Map.Entry<String, String> entry : this.h.entrySet()) {
            sb.append(Uri.encode(entry.getKey()));
            sb.append('=');
            sb.append(Uri.encode(entry.getValue()));
            sb.append(h95.d);
        }
        return sb.toString();
    }
}