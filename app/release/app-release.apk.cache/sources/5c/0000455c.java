package com.p7700g.p99005;

/* compiled from: ReflectionAccessFilter.java */
/* loaded from: classes3.dex */
public interface gw2 {
    public static final gw2 a = new a();
    public static final gw2 b = new b();
    public static final gw2 c = new c();
    public static final gw2 d = new d();

    /* compiled from: ReflectionAccessFilter.java */
    /* loaded from: classes3.dex */
    public class a implements gw2 {
        @Override // com.p7700g.p99005.gw2
        public e a(Class<?> cls) {
            if (bx2.f(cls)) {
                return e.BLOCK_INACCESSIBLE;
            }
            return e.INDECISIVE;
        }
    }

    /* compiled from: ReflectionAccessFilter.java */
    /* loaded from: classes3.dex */
    public class b implements gw2 {
        @Override // com.p7700g.p99005.gw2
        public e a(Class<?> cls) {
            if (bx2.f(cls)) {
                return e.BLOCK_ALL;
            }
            return e.INDECISIVE;
        }
    }

    /* compiled from: ReflectionAccessFilter.java */
    /* loaded from: classes3.dex */
    public class c implements gw2 {
        @Override // com.p7700g.p99005.gw2
        public e a(Class<?> cls) {
            if (bx2.c(cls)) {
                return e.BLOCK_ALL;
            }
            return e.INDECISIVE;
        }
    }

    /* compiled from: ReflectionAccessFilter.java */
    /* loaded from: classes3.dex */
    public class d implements gw2 {
        @Override // com.p7700g.p99005.gw2
        public e a(Class<?> cls) {
            if (bx2.e(cls)) {
                return e.BLOCK_ALL;
            }
            return e.INDECISIVE;
        }
    }

    /* compiled from: ReflectionAccessFilter.java */
    /* loaded from: classes3.dex */
    public enum e {
        ALLOW,
        INDECISIVE,
        BLOCK_INACCESSIBLE,
        BLOCK_ALL
    }

    e a(Class<?> cls);
}