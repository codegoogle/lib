package com.p7700g.p99005;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* compiled from: ReflectionHelper.java */
/* loaded from: classes3.dex */
public class ix2 {
    private ix2() {
    }

    private static String a(Constructor<?> constructor) {
        StringBuilder sb = new StringBuilder(constructor.getDeclaringClass().getName());
        sb.append('#');
        sb.append(constructor.getDeclaringClass().getSimpleName());
        sb.append('(');
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        for (int i = 0; i < parameterTypes.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(parameterTypes[i].getSimpleName());
        }
        sb.append(')');
        return sb.toString();
    }

    public static RuntimeException b(IllegalAccessException illegalAccessException) {
        throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.9.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", illegalAccessException);
    }

    public static void c(Field field) throws vv2 {
        try {
            field.setAccessible(true);
        } catch (Exception e) {
            StringBuilder G = wo1.G("Failed making field '");
            G.append(field.getDeclaringClass().getName());
            G.append("#");
            G.append(field.getName());
            G.append("' accessible; either change its visibility or write a custom TypeAdapter for its declaring type");
            throw new vv2(G.toString(), e);
        }
    }

    public static String d(Constructor<?> constructor) {
        try {
            constructor.setAccessible(true);
            return null;
        } catch (Exception e) {
            StringBuilder G = wo1.G("Failed making constructor '");
            G.append(a(constructor));
            G.append("' accessible; either change its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: ");
            G.append(e.getMessage());
            return G.toString();
        }
    }
}