package com.anythink.expressad.videocommon.a;

import android.text.TextUtils;
import com.anythink.core.common.b.m;
import com.anythink.expressad.foundation.d.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class a {
    public static final int a = 1;
    public static final int b = 2;
    private static final String c = "com.anythink.expressad.videocommon.a.a";
    private static a d;

    private a() {
        try {
            m.a();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static a a() {
        if (d == null) {
            synchronized (a.class) {
                if (d == null) {
                    d = new a();
                }
            }
        }
        return d;
    }

    private static void b() {
    }

    private static void c() {
    }

    private static void d() {
    }

    private static void e() {
    }

    private static void f() {
    }

    private static void a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        }
    }

    public static boolean a(c cVar) {
        try {
            com.anythink.expressad.videocommon.e.a b2 = com.anythink.expressad.videocommon.e.c.a().b();
            long c2 = b2 != null ? b2.c() : 0L;
            long currentTimeMillis = System.currentTimeMillis();
            if (cVar != null) {
                long n = cVar.n() * 1000;
                long bg = currentTimeMillis - cVar.bg();
                int i = (n > 0L ? 1 : (n == 0L ? 0 : -1));
                if (i > 0 && n >= bg) {
                    return false;
                }
                if (i <= 0 && c2 >= bg) {
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    public static List<c> a(List<c> list) {
        ArrayList arrayList = null;
        if (list == null) {
            return null;
        }
        try {
            com.anythink.expressad.videocommon.e.a b2 = com.anythink.expressad.videocommon.e.c.a().b();
            long c2 = b2 != null ? b2.c() : 0L;
            long currentTimeMillis = System.currentTimeMillis();
            if (list.size() > 0) {
                ArrayList arrayList2 = new ArrayList();
                try {
                    for (c cVar : list) {
                        if (cVar != null) {
                            long n = cVar.n() * 1000;
                            long bg = currentTimeMillis - cVar.bg();
                            int i = (n > 0L ? 1 : (n == 0L ? 0 : -1));
                            if ((i > 0 && n >= bg) || (i <= 0 && c2 >= bg)) {
                                arrayList2.add(cVar);
                            }
                        }
                    }
                    return arrayList2;
                } catch (Exception e) {
                    e = e;
                    arrayList = arrayList2;
                    e.printStackTrace();
                    return arrayList;
                }
            }
            return null;
        } catch (Exception e2) {
            e = e2;
        }
    }
}