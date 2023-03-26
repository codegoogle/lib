package com.anythink.core.common.j;

import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.common.e.af;
import java.lang.reflect.Constructor;

/* loaded from: classes2.dex */
public final class i {
    public static i a = new i();

    public static ATBaseAdAdapter a(String str) {
        if (str != null) {
            Constructor declaredConstructor = Class.forName(str).asSubclass(ATBaseAdAdapter.class).getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            return (ATBaseAdAdapter) declaredConstructor.newInstance(new Object[0]);
        }
        return null;
    }

    private static ATBaseAdAdapter a(Class<? extends com.anythink.core.common.b.d> cls) {
        Constructor<? extends com.anythink.core.common.b.d> declaredConstructor = cls.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        return (ATBaseAdAdapter) declaredConstructor.newInstance(new Object[0]);
    }

    public static ATBaseAdAdapter a(af afVar) {
        try {
            return a(afVar.h());
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}