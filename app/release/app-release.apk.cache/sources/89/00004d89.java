package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;

/* compiled from: PlatformImplementations.kt */
@vo4(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0001\u001a\"\u0010\b\u001a\u0002H\t\"\n\b\u0000\u0010\t\u0018\u0001*\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0083\b¢\u0006\u0002\u0010\f\u001a\b\u0010\r\u001a\u00020\u0005H\u0002\"\u0010\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"IMPLEMENTATIONS", "Lkotlin/internal/PlatformImplementations;", "apiVersionIsAtLeast", "", "major", "", "minor", "patch", "castToBaseType", "T", "", "instance", "(Ljava/lang/Object;)Ljava/lang/Object;", "getJavaVersion", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class kx4 {
    @cz4
    @NotNull
    public static final jx4 a;

    static {
        jx4 jx4Var;
        Object newInstance;
        Object newInstance2;
        int c = c();
        if (c >= 65544 || c < 65536) {
            try {
                newInstance = Class.forName("com.p7700g.p99005.rx4").newInstance();
                c25.o(newInstance, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    try {
                    } catch (ClassCastException e) {
                        ClassLoader classLoader = newInstance.getClass().getClassLoader();
                        ClassLoader classLoader2 = jx4.class.getClassLoader();
                        if (c25.g(classLoader, classLoader2)) {
                            throw e;
                        }
                        throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e);
                    }
                } catch (ClassNotFoundException unused) {
                }
            } catch (ClassNotFoundException unused2) {
                Object newInstance3 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                c25.o(newInstance3, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    if (newInstance3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                    jx4Var = (jx4) newInstance3;
                } catch (ClassCastException e2) {
                    ClassLoader classLoader3 = newInstance3.getClass().getClassLoader();
                    ClassLoader classLoader4 = jx4.class.getClassLoader();
                    if (c25.g(classLoader3, classLoader4)) {
                        throw e2;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader3 + ", base type classloader: " + classLoader4, e2);
                }
            }
            if (newInstance == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
            }
            jx4Var = (jx4) newInstance;
            a = jx4Var;
        }
        if (c >= 65543 || c < 65536) {
            try {
                newInstance2 = Class.forName("com.p7700g.p99005.qx4").newInstance();
                c25.o(newInstance2, "forName(\"kotlin.internal…entations\").newInstance()");
            } catch (ClassNotFoundException unused3) {
                Object newInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                c25.o(newInstance4, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    if (newInstance4 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                    jx4Var = (jx4) newInstance4;
                } catch (ClassCastException e3) {
                    ClassLoader classLoader5 = newInstance4.getClass().getClassLoader();
                    ClassLoader classLoader6 = jx4.class.getClassLoader();
                    if (c25.g(classLoader5, classLoader6)) {
                        throw e3;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader5 + ", base type classloader: " + classLoader6, e3);
                }
            }
            try {
                if (newInstance2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                }
                jx4Var = (jx4) newInstance2;
                a = jx4Var;
            } catch (ClassCastException e4) {
                ClassLoader classLoader7 = newInstance2.getClass().getClassLoader();
                ClassLoader classLoader8 = jx4.class.getClassLoader();
                if (c25.g(classLoader7, classLoader8)) {
                    throw e4;
                }
                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader7 + ", base type classloader: " + classLoader8, e4);
            }
        }
        jx4Var = new jx4();
        a = jx4Var;
    }

    @np4
    @tp4(version = "1.2")
    public static final boolean a(int i, int i2, int i3) {
        return no4.u.f(i, i2, i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dx4
    private static final /* synthetic */ <T> T b(Object obj) {
        try {
            c25.y(1, "T");
            return obj;
        } catch (ClassCastException e) {
            ClassLoader classLoader = obj.getClass().getClassLoader();
            c25.y(4, "T");
            ClassLoader classLoader2 = Object.class.getClassLoader();
            if (!c25.g(classLoader, classLoader2)) {
                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e);
            }
            throw e;
        }
    }

    private static final int c() {
        String property = System.getProperty("java.specification.version");
        if (property == null) {
            return 65542;
        }
        int q3 = c95.q3(property, '.', 0, false, 6, null);
        if (q3 < 0) {
            try {
                return Integer.parseInt(property) * 65536;
            } catch (NumberFormatException unused) {
                return 65542;
            }
        }
        int i = q3 + 1;
        int q32 = c95.q3(property, '.', i, false, 4, null);
        if (q32 < 0) {
            q32 = property.length();
        }
        String substring = property.substring(0, q3);
        c25.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        String substring2 = property.substring(i, q32);
        c25.o(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
        try {
            return (Integer.parseInt(substring) * 65536) + Integer.parseInt(substring2);
        } catch (NumberFormatException unused2) {
            return 65542;
        }
    }
}