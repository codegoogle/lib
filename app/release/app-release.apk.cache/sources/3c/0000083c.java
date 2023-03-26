package com.anythink.expressad.foundation.g.f.g;

import android.text.TextUtils;
import com.anythink.expressad.foundation.h.v;
import com.microsoft.appcenter.AppCenter;
import java.util.List;

/* loaded from: classes2.dex */
public class e {
    private static final String a = "e";

    public static String a(List<com.anythink.expressad.foundation.g.f.c.c> list) {
        com.anythink.expressad.foundation.g.f.c.c b = b(list, "Content-Type");
        if (b != null) {
            String b2 = b.b();
            if (!TextUtils.isEmpty(b2)) {
                String[] split = b2.split(AppCenter.PAIR_DELIMITER);
                for (int i = 1; i < split.length; i++) {
                    String[] split2 = split[i].trim().split(AppCenter.KEY_VALUE_DELIMITER);
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        return split2[1];
                    }
                }
            }
        }
        return "UTF-8";
    }

    private static com.anythink.expressad.foundation.g.f.c.c b(List<com.anythink.expressad.foundation.g.f.c.c> list, String str) {
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                com.anythink.expressad.foundation.g.f.c.c cVar = list.get(i);
                if (cVar != null && str.equals(cVar.a())) {
                    return cVar;
                }
            }
        }
        return null;
    }

    private static boolean c(List<com.anythink.expressad.foundation.g.f.c.c> list) {
        if (TextUtils.equals(a(list, "Accept-Ranges"), "bytes")) {
            return true;
        }
        String a2 = a(list, "Content-Range");
        return a2 != null && a2.startsWith("bytes");
    }

    public static boolean b(List<com.anythink.expressad.foundation.g.f.c.c> list) {
        return TextUtils.equals(a(list, "Content-Encoding"), "gzip");
    }

    public static String a(List<com.anythink.expressad.foundation.g.f.c.c> list, String str) {
        com.anythink.expressad.foundation.g.f.c.c b = b(list, str);
        return b != null ? b.b() : "";
    }

    private static void a(com.anythink.expressad.foundation.g.f.h.c cVar, String str, String str2) {
        if (cVar != null) {
            try {
                if (!v.a(str) && !v.a(str2)) {
                    cVar.a(str, str2);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}