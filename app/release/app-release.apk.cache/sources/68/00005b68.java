package com.p7700g.p99005;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* compiled from: TypesJVM.kt */
@vo4(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u001a\"\u0010\n\u001a\u00020\u00012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000eH\u0003\u001a\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0001H\u0002\u001a\u0016\u0010\u0012\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0003\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00078BX\u0083\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\b\u001a\u0004\b\u0005\u0010\t¨\u0006\u0015"}, d2 = {"javaType", "Ljava/lang/reflect/Type;", "Lkotlin/reflect/KType;", "getJavaType$annotations", "(Lkotlin/reflect/KType;)V", "getJavaType", "(Lkotlin/reflect/KType;)Ljava/lang/reflect/Type;", "Lkotlin/reflect/KTypeProjection;", "(Lkotlin/reflect/KTypeProjection;)V", "(Lkotlin/reflect/KTypeProjection;)Ljava/lang/reflect/Type;", "createPossiblyInnerType", "jClass", "Ljava/lang/Class;", "arguments", "", "typeToString", "", "type", "computeJavaType", "forceWrapper", "", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class s65 {

    /* compiled from: TypesJVM.kt */
    @vo4(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            m65.values();
            int[] iArr = new int[3];
            iArr[m65.IN.ordinal()] = 1;
            iArr[m65.INVARIANT.ordinal()] = 2;
            iArr[m65.OUT.ordinal()] = 3;
            a = iArr;
        }
    }

    /* compiled from: TypesJVM.kt */
    @vo4(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class b extends y15 implements f05<Class<?>, Class<?>> {
        public static final b B = new b();

        public b() {
            super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
        }

        @Override // com.p7700g.p99005.f05
        /* renamed from: K4 */
        public final Class<?> M(@NotNull Class<?> cls) {
            c25.p(cls, "p0");
            return cls.getComponentType();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @fo4
    public static final Type c(j65 j65Var, boolean z) {
        x55 C3 = j65Var.C3();
        if (C3 instanceof k65) {
            return new r65((k65) C3);
        }
        if (C3 instanceof u55) {
            u55 u55Var = (u55) C3;
            Class g = z ? yy4.g(u55Var) : yy4.e(u55Var);
            List<l65> n = j65Var.n();
            if (n.isEmpty()) {
                return g;
            }
            if (g.isArray()) {
                if (g.getComponentType().isPrimitive()) {
                    return g;
                }
                l65 l65Var = (l65) rs4.f5(n);
                if (l65Var != null) {
                    m65 a2 = l65Var.a();
                    j65 b2 = l65Var.b();
                    int i = a2 == null ? -1 : a.a[a2.ordinal()];
                    if (i == -1 || i == 1) {
                        return g;
                    }
                    if (i != 2 && i != 3) {
                        throw new wo4();
                    }
                    c25.m(b2);
                    Type d = d(b2, false, 1, null);
                    return d instanceof Class ? g : new r55(d);
                }
                throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + j65Var);
            }
            return e(g, n);
        }
        throw new UnsupportedOperationException("Unsupported type classifier: " + j65Var);
    }

    public static /* synthetic */ Type d(j65 j65Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return c(j65Var, z);
    }

    @fo4
    private static final Type e(Class<?> cls, List<l65> list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ArrayList arrayList = new ArrayList(ks4.Z(list, 10));
            for (l65 l65Var : list) {
                arrayList.add(g(l65Var));
            }
            return new o65(cls, null, arrayList);
        } else if (Modifier.isStatic(cls.getModifiers())) {
            ArrayList arrayList2 = new ArrayList(ks4.Z(list, 10));
            for (l65 l65Var2 : list) {
                arrayList2.add(g(l65Var2));
            }
            return new o65(cls, declaringClass, arrayList2);
        } else {
            int length = cls.getTypeParameters().length;
            Type e = e(declaringClass, list.subList(length, list.size()));
            List<l65> subList = list.subList(0, length);
            ArrayList arrayList3 = new ArrayList(ks4.Z(subList, 10));
            for (l65 l65Var3 : subList) {
                arrayList3.add(g(l65Var3));
            }
            return new o65(cls, e, arrayList3);
        }
    }

    @NotNull
    public static final Type f(@NotNull j65 j65Var) {
        Type X0;
        c25.p(j65Var, "<this>");
        return (!(j65Var instanceof d25) || (X0 = ((d25) j65Var).X0()) == null) ? d(j65Var, false, 1, null) : X0;
    }

    private static final Type g(l65 l65Var) {
        m65 h = l65Var.h();
        if (h == null) {
            return t65.s.a();
        }
        j65 g = l65Var.g();
        c25.m(g);
        int ordinal = h.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return new t65(c(g, true), null);
                }
                throw new wo4();
            }
            return new t65(null, c(g, true));
        }
        return c(g, true);
    }

    @fo4
    @fx4
    @tp4(version = "1.4")
    public static /* synthetic */ void h(j65 j65Var) {
    }

    @fo4
    private static /* synthetic */ void i(l65 l65Var) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String j(Type type) {
        String name;
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                g75 l = m75.l(type, b.B);
                name = ((Class) o75.f1(l)).getName() + b95.g2(zq5.e, o75.g0(l));
            } else {
                name = cls.getName();
            }
            c25.o(name, "{\n        if (type.isArr…   } else type.name\n    }");
            return name;
        }
        return type.toString();
    }
}