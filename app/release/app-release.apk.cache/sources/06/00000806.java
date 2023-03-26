package com.anythink.expressad.foundation.g.c;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class f {
    public e a;

    public f(String str) {
        e eVar = new e();
        eVar.a(str);
        eVar.a(a.AD_ROOT);
        List<e> a = a();
        if (a.size() > 0) {
            eVar.a(a);
        }
        this.a = eVar;
    }

    public static e a(ArrayList<e> arrayList, a aVar, String str) {
        e eVar = new e();
        eVar.a(aVar);
        eVar.a(str);
        arrayList.add(eVar);
        return eVar;
    }

    public abstract List<e> a();

    public final e b() {
        return this.a;
    }
}