package com.p7700g.p99005;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.p7700g.p99005.iz5;
import com.p7700g.p99005.lz5;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: Platform.java */
/* loaded from: classes4.dex */
public class uz5 {
    private static final uz5 a = f();
    private final boolean b;
    @Nullable
    private final Constructor<MethodHandles.Lookup> c;

    /* compiled from: Platform.java */
    /* loaded from: classes4.dex */
    public static final class a extends uz5 {

        /* compiled from: Platform.java */
        /* renamed from: com.p7700g.p99005.uz5$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class ExecutorC0258a implements Executor {
            private final Handler s = new Handler(Looper.getMainLooper());

            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                this.s.post(runnable);
            }
        }

        public a() {
            super(Build.VERSION.SDK_INT >= 24);
        }

        @Override // com.p7700g.p99005.uz5
        public Executor c() {
            return new ExecutorC0258a();
        }

        @Override // com.p7700g.p99005.uz5
        @Nullable
        public Object h(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
            if (Build.VERSION.SDK_INT >= 26) {
                return super.h(method, cls, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }
    }

    public uz5(boolean z) {
        this.b = z;
        Constructor<MethodHandles.Lookup> constructor = null;
        if (z) {
            try {
                constructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
                constructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        }
        this.c = constructor;
    }

    private static uz5 f() {
        if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
            return new a();
        }
        return new uz5(true);
    }

    public static uz5 g() {
        return a;
    }

    public List<? extends iz5.a> a(@Nullable Executor executor) {
        mz5 mz5Var = new mz5(executor);
        return this.b ? Arrays.asList(kz5.a, mz5Var) : Collections.singletonList(mz5Var);
    }

    public int b() {
        return this.b ? 2 : 1;
    }

    @Nullable
    public Executor c() {
        return null;
    }

    public List<? extends lz5.a> d() {
        return this.b ? Collections.singletonList(sz5.a) : Collections.emptyList();
    }

    public int e() {
        return this.b ? 1 : 0;
    }

    @Nullable
    @IgnoreJRERequirement
    public Object h(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
        Constructor<MethodHandles.Lookup> constructor = this.c;
        return (constructor != null ? constructor.newInstance(cls, -1) : MethodHandles.lookup()).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }

    @IgnoreJRERequirement
    public boolean i(Method method) {
        return this.b && method.isDefault();
    }
}