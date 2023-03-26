package com.p7700g.p99005;

import com.p7700g.p99005.qp4;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ExceptionsConstructor.kt */
@vo4(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a2\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005j\u0002`\u0007\"\b\b\u0000\u0010\b*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\nH\u0002\u001a*\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u00072\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\rH\u0002\u001a1\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005j\u0002`\u00072\u0014\b\u0004\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H\u0082\b\u001a!\u0010\u0010\u001a\u0004\u0018\u0001H\b\"\b\b\u0000\u0010\b*\u00020\u00062\u0006\u0010\u0011\u001a\u0002H\bH\u0000¢\u0006\u0002\u0010\u0012\u001a\u001b\u0010\u0013\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\n2\b\b\u0002\u0010\u0014\u001a\u00020\u0003H\u0082\u0010\u001a\u0018\u0010\u0015\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u0016\u001a\u00020\u0003H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000*(\b\u0002\u0010\u0017\"\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¨\u0006\u0018"}, d2 = {"ctorCache", "Lkotlinx/coroutines/internal/CtorCache;", "throwableFields", "", "createConstructor", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/Ctor;", "E", "clz", "Ljava/lang/Class;", "createSafeConstructor", "constructor", "Ljava/lang/reflect/Constructor;", "safeCtor", "block", "tryCopyException", "exception", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "fieldsCount", "accumulator", "fieldsCountOrDefault", "defaultValue", "Ctor", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class wl5 {
    private static final int a = f(Throwable.class, -1);
    @NotNull
    private static final tl5 b;

    /* compiled from: Comparisons.kt */
    @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return wu4.g(Integer.valueOf(((Constructor) t2).getParameterTypes().length), Integer.valueOf(((Constructor) t).getParameterTypes().length));
        }
    }

    /* compiled from: ExceptionsConstructor.kt */
    @vo4(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "E", "", "it", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends e25 implements f05 {
        public static final b t = new b();

        public b() {
            super(1);
        }

        @Override // com.p7700g.p99005.f05
        @Nullable
        /* renamed from: a */
        public final Void M(@NotNull Throwable th) {
            return null;
        }
    }

    /* compiled from: ExceptionsConstructor.kt */
    @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "e", "invoke", "kotlinx/coroutines/internal/ExceptionsConstructorKt$safeCtor$1"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c extends e25 implements f05<Throwable, Throwable> {
        public final /* synthetic */ Constructor t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Constructor constructor) {
            super(1);
            this.t = constructor;
        }

        @Override // com.p7700g.p99005.f05
        @Nullable
        /* renamed from: a */
        public final Throwable M(@NotNull Throwable th) {
            Object b;
            Object newInstance;
            try {
                qp4.a aVar = qp4.s;
                newInstance = this.t.newInstance(th.getMessage(), th);
            } catch (Throwable th2) {
                qp4.a aVar2 = qp4.s;
                b = qp4.b(rp4.a(th2));
            }
            if (newInstance != null) {
                b = qp4.b((Throwable) newInstance);
                if (qp4.i(b)) {
                    b = null;
                }
                return (Throwable) b;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    /* compiled from: ExceptionsConstructor.kt */
    @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "e", "invoke", "kotlinx/coroutines/internal/ExceptionsConstructorKt$safeCtor$1"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d extends e25 implements f05<Throwable, Throwable> {
        public final /* synthetic */ Constructor t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Constructor constructor) {
            super(1);
            this.t = constructor;
        }

        @Override // com.p7700g.p99005.f05
        @Nullable
        /* renamed from: a */
        public final Throwable M(@NotNull Throwable th) {
            Object b;
            Object newInstance;
            try {
                qp4.a aVar = qp4.s;
                newInstance = this.t.newInstance(th);
            } catch (Throwable th2) {
                qp4.a aVar2 = qp4.s;
                b = qp4.b(rp4.a(th2));
            }
            if (newInstance != null) {
                b = qp4.b((Throwable) newInstance);
                if (qp4.i(b)) {
                    b = null;
                }
                return (Throwable) b;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    /* compiled from: ExceptionsConstructor.kt */
    @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "e", "invoke", "kotlinx/coroutines/internal/ExceptionsConstructorKt$safeCtor$1"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class e extends e25 implements f05<Throwable, Throwable> {
        public final /* synthetic */ Constructor t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Constructor constructor) {
            super(1);
            this.t = constructor;
        }

        @Override // com.p7700g.p99005.f05
        @Nullable
        /* renamed from: a */
        public final Throwable M(@NotNull Throwable th) {
            Object b;
            Object newInstance;
            try {
                qp4.a aVar = qp4.s;
                newInstance = this.t.newInstance(th.getMessage());
            } catch (Throwable th2) {
                qp4.a aVar2 = qp4.s;
                b = qp4.b(rp4.a(th2));
            }
            if (newInstance != null) {
                Throwable th3 = (Throwable) newInstance;
                th3.initCause(th);
                b = qp4.b(th3);
                if (qp4.i(b)) {
                    b = null;
                }
                return (Throwable) b;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    /* compiled from: ExceptionsConstructor.kt */
    @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "e", "invoke", "kotlinx/coroutines/internal/ExceptionsConstructorKt$safeCtor$1"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class f extends e25 implements f05<Throwable, Throwable> {
        public final /* synthetic */ Constructor t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Constructor constructor) {
            super(1);
            this.t = constructor;
        }

        @Override // com.p7700g.p99005.f05
        @Nullable
        /* renamed from: a */
        public final Throwable M(@NotNull Throwable th) {
            Object b;
            Object newInstance;
            try {
                qp4.a aVar = qp4.s;
                newInstance = this.t.newInstance(new Object[0]);
            } catch (Throwable th2) {
                qp4.a aVar2 = qp4.s;
                b = qp4.b(rp4.a(th2));
            }
            if (newInstance != null) {
                Throwable th3 = (Throwable) newInstance;
                th3.initCause(th);
                b = qp4.b(th3);
                if (qp4.i(b)) {
                    b = null;
                }
                return (Throwable) b;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    /* compiled from: ExceptionsConstructor.kt */
    @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "e", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class g extends e25 implements f05<Throwable, Throwable> {
        public final /* synthetic */ f05<Throwable, Throwable> t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(f05<? super Throwable, ? extends Throwable> f05Var) {
            super(1);
            this.t = f05Var;
        }

        @Override // com.p7700g.p99005.f05
        @Nullable
        /* renamed from: a */
        public final Throwable M(@NotNull Throwable th) {
            Object b;
            f05<Throwable, Throwable> f05Var = this.t;
            try {
                qp4.a aVar = qp4.s;
                b = qp4.b(f05Var.M(th));
            } catch (Throwable th2) {
                qp4.a aVar2 = qp4.s;
                b = qp4.b(rp4.a(th2));
            }
            if (qp4.i(b)) {
                b = null;
            }
            return (Throwable) b;
        }
    }

    static {
        tl5 tl5Var;
        try {
            tl5Var = yl5.a() ? nn5.a : nl5.a;
        } catch (Throwable unused) {
            tl5Var = nn5.a;
        }
        b = tl5Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E extends Throwable> f05<Throwable, Throwable> b(Class<E> cls) {
        b bVar = b.t;
        if (a != f(cls, 0)) {
            return bVar;
        }
        for (Constructor constructor : as4.lw(cls.getConstructors(), new a())) {
            f05<Throwable, Throwable> c2 = c(constructor);
            if (c2 != null) {
                return c2;
            }
        }
        return bVar;
    }

    private static final f05<Throwable, Throwable> c(Constructor<?> constructor) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        int length = parameterTypes.length;
        if (length != 0) {
            if (length != 1) {
                if (length == 2 && c25.g(parameterTypes[0], String.class) && c25.g(parameterTypes[1], Throwable.class)) {
                    return new c(constructor);
                }
                return null;
            }
            Class<?> cls = parameterTypes[0];
            if (c25.g(cls, Throwable.class)) {
                return new d(constructor);
            }
            if (c25.g(cls, String.class)) {
                return new e(constructor);
            }
            return null;
        }
        return new f(constructor);
    }

    private static final int d(Class<?> cls, int i) {
        do {
            Field[] declaredFields = cls.getDeclaredFields();
            int length = declaredFields.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                Field field = declaredFields[i2];
                i2++;
                if (!Modifier.isStatic(field.getModifiers())) {
                    i3++;
                }
            }
            i += i3;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i;
    }

    public static /* synthetic */ int e(Class cls, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return d(cls, i);
    }

    private static final int f(Class<?> cls, int i) {
        Integer b2;
        yy4.i(cls);
        try {
            qp4.a aVar = qp4.s;
            b2 = qp4.b(Integer.valueOf(e(cls, 0, 1, null)));
        } catch (Throwable th) {
            qp4.a aVar2 = qp4.s;
            b2 = qp4.b(rp4.a(th));
        }
        Integer valueOf = Integer.valueOf(i);
        if (qp4.i(b2)) {
            b2 = valueOf;
        }
        return ((Number) b2).intValue();
    }

    private static final f05<Throwable, Throwable> g(f05<? super Throwable, ? extends Throwable> f05Var) {
        return new g(f05Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final <E extends Throwable> E h(@NotNull E e2) {
        Object b2;
        if (e2 instanceof cc5) {
            try {
                qp4.a aVar = qp4.s;
                b2 = qp4.b(((cc5) e2).f());
            } catch (Throwable th) {
                qp4.a aVar2 = qp4.s;
                b2 = qp4.b(rp4.a(th));
            }
            if (qp4.i(b2)) {
                b2 = null;
            }
            return (E) b2;
        }
        return (E) b.a(e2.getClass()).M(e2);
    }
}