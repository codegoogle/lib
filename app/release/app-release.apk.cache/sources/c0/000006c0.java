package com.anythink.core.common.j;

import com.anythink.core.common.e.af;
import java.util.List;

/* loaded from: classes2.dex */
public final class q {
    public static boolean a(List<af> list) {
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                af afVar = list.get(i);
                if (afVar != null && afVar.aa()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean a(af afVar) {
        return afVar.c() == 15 && !afVar.j();
    }
}