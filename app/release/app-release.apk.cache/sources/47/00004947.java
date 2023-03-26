package com.p7700g.p99005;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: MethodList.java */
/* loaded from: classes3.dex */
public class iv3 implements Iterable<hv3> {
    private hv3[] s;

    /* compiled from: MethodList.java */
    /* loaded from: classes3.dex */
    public class a implements i {
        public a() {
        }

        @Override // com.p7700g.p99005.iv3.i
        public boolean a(hv3 hv3Var) {
            return !Modifier.isPublic(hv3Var.f().getModifiers());
        }
    }

    /* compiled from: MethodList.java */
    /* loaded from: classes3.dex */
    public class b implements i {
        public final /* synthetic */ int a;

        public b(int i) {
            this.a = i;
        }

        @Override // com.p7700g.p99005.iv3.i
        public boolean a(hv3 hv3Var) {
            return hv3Var.h().length == this.a;
        }
    }

    /* compiled from: MethodList.java */
    /* loaded from: classes3.dex */
    public class c implements i {
        public final /* synthetic */ Class a;

        public c(Class cls) {
            this.a = cls;
        }

        @Override // com.p7700g.p99005.iv3.i
        public boolean a(hv3 hv3Var) {
            return hv3Var.f().getReturnType() == this.a;
        }
    }

    /* compiled from: MethodList.java */
    /* loaded from: classes3.dex */
    public class d implements i {
        public final /* synthetic */ String a;

        public d(String str) {
            this.a = str;
        }

        @Override // com.p7700g.p99005.iv3.i
        public boolean a(hv3 hv3Var) {
            return hv3Var.f().getName().startsWith(this.a);
        }
    }

    /* compiled from: MethodList.java */
    /* loaded from: classes3.dex */
    public class e implements i {
        public final /* synthetic */ Class a;

        public e(Class cls) {
            this.a = cls;
        }

        @Override // com.p7700g.p99005.iv3.i
        public boolean a(hv3 hv3Var) {
            return hv3Var.getAnnotation(this.a) != null;
        }
    }

    /* compiled from: MethodList.java */
    /* loaded from: classes3.dex */
    public class f implements i {
        public final /* synthetic */ Class a;

        public f(Class cls) {
            this.a = cls;
        }

        @Override // com.p7700g.p99005.iv3.i
        public boolean a(hv3 hv3Var) {
            for (Annotation annotation : hv3Var.getAnnotations()) {
                if (annotation.annotationType().getAnnotation(this.a) != null) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: MethodList.java */
    /* loaded from: classes3.dex */
    public class g implements i {
        public final /* synthetic */ Class a;

        public g(Class cls) {
            this.a = cls;
        }

        @Override // com.p7700g.p99005.iv3.i
        public boolean a(hv3 hv3Var) {
            return hv3Var.getAnnotation(this.a) == null;
        }
    }

    /* compiled from: MethodList.java */
    /* loaded from: classes3.dex */
    public class h implements i {
        public final /* synthetic */ Class a;

        public h(Class cls) {
            this.a = cls;
        }

        @Override // com.p7700g.p99005.iv3.i
        public boolean a(hv3 hv3Var) {
            for (Annotation annotation : hv3Var.getAnnotations()) {
                if (annotation.annotationType().getAnnotation(this.a) != null) {
                    return false;
                }
            }
            return true;
        }
    }

    /* compiled from: MethodList.java */
    /* loaded from: classes3.dex */
    public interface i {
        boolean a(hv3 hv3Var);
    }

    public iv3(Class cls) {
        this(cls, false);
    }

    private static List<Method> b(Class cls) {
        ArrayList arrayList = new ArrayList();
        while (cls != null && cls != Object.class) {
            arrayList.addAll(Arrays.asList(cls.getDeclaredMethods()));
            cls = cls.getSuperclass();
        }
        return arrayList;
    }

    private static List<Method> c(Class cls) {
        return Arrays.asList(cls.getMethods());
    }

    public iv3 a(i iVar) {
        hv3[] hv3VarArr;
        ArrayList arrayList = new ArrayList();
        for (hv3 hv3Var : this.s) {
            if (iVar.a(hv3Var)) {
                arrayList.add(hv3Var);
            }
        }
        return new iv3((hv3[]) arrayList.toArray(new hv3[0]));
    }

    public <T extends Annotation> iv3 d(Class<T> cls) {
        return a(new e(cls));
    }

    public <T extends Annotation> iv3 e(Class<T> cls) {
        return a(new f(cls));
    }

    public <T extends Annotation> iv3 f(Class<T> cls) {
        return a(new g(cls));
    }

    public <T extends Annotation> iv3 g(Class<T> cls) {
        return a(new h(cls));
    }

    public <T extends Annotation> iv3 h(int i2) {
        return a(new b(i2));
    }

    public <T extends Annotation> iv3 i(Class<?> cls) {
        return a(new c(cls));
    }

    @Override // java.lang.Iterable
    public Iterator<hv3> iterator() {
        return Arrays.asList(this.s).iterator();
    }

    public <T extends Annotation> iv3 m() {
        return a(new a());
    }

    public <T extends Annotation> iv3 n(String str) {
        return a(new d(str));
    }

    public iv3(Class cls, boolean z) {
        this(z ? b(cls) : c(cls));
    }

    public iv3(List<Method> list) {
        ArrayList arrayList = new ArrayList();
        for (Method method : list) {
            if (!method.isBridge() && method.getDeclaringClass() != Object.class) {
                arrayList.add(new hv3(method));
            }
        }
        hv3[] hv3VarArr = new hv3[arrayList.size()];
        this.s = hv3VarArr;
        this.s = (hv3[]) arrayList.toArray(hv3VarArr);
    }

    public iv3(Method... methodArr) {
        ArrayList arrayList = new ArrayList();
        for (Method method : methodArr) {
            if (!method.isBridge() && method.getDeclaringClass() != Object.class) {
                arrayList.add(new hv3(method));
            }
        }
        hv3[] hv3VarArr = new hv3[arrayList.size()];
        this.s = hv3VarArr;
        this.s = (hv3[]) arrayList.toArray(hv3VarArr);
    }

    public iv3(hv3... hv3VarArr) {
        this.s = hv3VarArr;
    }
}