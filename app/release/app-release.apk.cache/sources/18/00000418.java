package com.anythink.basead.a.a;

import android.text.TextUtils;
import com.anythink.core.common.b.m;
import com.anythink.core.common.e.i;
import com.anythink.core.common.e.k;
import com.anythink.core.common.j.f;
import com.p7700g.p99005.wo1;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class b {
    public static final int a = 0;
    public static final int b = 1;
    private static Map<String, Integer> c = new HashMap();

    public static boolean a(String str) {
        Integer num = c.get(str);
        return 1 == (num != null ? num.intValue() : 0);
    }

    public static boolean b(String str) {
        String a2 = f.a(str);
        com.anythink.core.common.res.d a3 = com.anythink.core.common.res.d.a(m.a().e());
        if (TextUtils.isEmpty(a2)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a3.a(1));
        return new File(wo1.D(sb, File.separator, a2, ".0")).exists();
    }

    public static void a(String str, int i) {
        c.put(str, Integer.valueOf(i));
    }

    public static boolean a(i iVar, k kVar) {
        if (iVar == null) {
            return false;
        }
        List<String> b2 = iVar.b((i) kVar);
        int size = b2.size();
        if (size > 0) {
            for (int i = 0; i < size; i++) {
                if (!b(b2.get(i))) {
                    return false;
                }
            }
        }
        return true;
    }
}