package com.anythink.expressad.atsignalcommon.b;

import com.anythink.expressad.atsignalcommon.b.c;
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.utils.crypto.CryptoConstants;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class a extends Exception {
    private static final long a = 1;
    private List<c.b.a> b;

    private a(String str) {
        super(str);
        this.b = new ArrayList();
    }

    private void a(c.b.a aVar) {
        this.b.add(aVar);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (c.b.a aVar : this.b) {
            sb.append(aVar.toString());
            sb.append(AppCenter.PAIR_DELIMITER);
            try {
                int i = 0;
                if (aVar.getCause() instanceof NoSuchFieldException) {
                    Field[] declaredFields = aVar.a().getDeclaredFields();
                    sb.append(aVar.a().getName());
                    sb.append(CryptoConstants.ALIAS_SEPARATOR);
                    sb.append(aVar.c());
                    sb.append(AppCenter.PAIR_DELIMITER);
                    while (i < declaredFields.length) {
                        sb.append(declaredFields[i].getName());
                        sb.append("/");
                        i++;
                    }
                } else if (aVar.getCause() instanceof NoSuchMethodException) {
                    Method[] declaredMethods = aVar.a().getDeclaredMethods();
                    sb.append(aVar.a().getName());
                    sb.append("->");
                    sb.append(aVar.b());
                    sb.append(AppCenter.PAIR_DELIMITER);
                    while (i < declaredMethods.length) {
                        if (aVar.b().equals(declaredMethods[i].getName())) {
                            sb.append(declaredMethods[i].toGenericString());
                            sb.append("/");
                        }
                        i++;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            sb.append("@@@@");
        }
        return sb.toString();
    }

    private void a(List<c.b.a> list) {
        this.b.addAll(list);
    }

    private List<c.b.a> a() {
        return this.b;
    }

    private static a a(a aVar, a aVar2) {
        if (aVar == null) {
            return aVar2;
        }
        if (aVar2 == null) {
            return aVar;
        }
        a aVar3 = new a(aVar.getMessage() + AppCenter.PAIR_DELIMITER + aVar2.getMessage());
        aVar3.a(aVar.b);
        aVar3.a(aVar2.b);
        return aVar3;
    }
}