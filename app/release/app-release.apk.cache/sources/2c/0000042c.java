package com.anythink.basead.a;

import com.anythink.basead.a.a.a;
import com.anythink.core.common.b.m;
import com.anythink.core.common.e.k;
import com.anythink.core.common.e.q;
import com.anythink.core.common.e.s;
import com.p7700g.p99005.wo1;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes2.dex */
public class f {
    public static final String a = "f";
    private static f b;

    private f() {
    }

    public static synchronized f a() {
        f fVar;
        synchronized (f.class) {
            if (b == null) {
                b = new f();
            }
            fVar = b;
        }
        return fVar;
    }

    public static String b(String str) {
        String a2 = com.anythink.core.common.j.f.a(str);
        com.anythink.core.common.res.d a3 = com.anythink.core.common.res.d.a(m.a().e());
        StringBuilder sb = new StringBuilder();
        sb.append(a3.a(1));
        return wo1.D(sb, File.separator, a2, ".0");
    }

    private static void a(String str, List<q> list, s sVar) {
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a(str, true, list.get(i), sVar, null);
        }
    }

    public static void a(String str, com.anythink.core.common.e.i iVar, k kVar, a.InterfaceC0017a interfaceC0017a) {
        a(str, false, iVar, kVar, interfaceC0017a);
    }

    public static void a(String str, boolean z, com.anythink.core.common.e.i iVar, k kVar, a.InterfaceC0017a interfaceC0017a) {
        new com.anythink.basead.a.a.a(str, z, kVar.k()).a(iVar, kVar, interfaceC0017a);
    }

    public static boolean a(q qVar, k kVar) {
        return com.anythink.basead.a.a.b.a(qVar, kVar);
    }

    public static boolean a(String str, InputStream inputStream) {
        if (str == null || inputStream == null) {
            return false;
        }
        return com.anythink.core.common.res.d.a(m.a().e()).a(1, com.anythink.core.common.j.f.a(str), inputStream);
    }

    public static FileInputStream a(String str) {
        return com.anythink.core.common.res.d.a(m.a().e()).a(1, com.anythink.core.common.j.f.a(str));
    }
}