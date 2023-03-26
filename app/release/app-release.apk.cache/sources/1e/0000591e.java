package com.p7700g.p99005;

import com.p7700g.p99005.qp4;
import java.lang.reflect.Method;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: KotlinExtensions.kt */
@fz4(name = "KotlinExtensions")
@vo4(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u001c\u0010\u0002\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0000*\u00020\u0004*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\b\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0000*\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005H\u0087@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0007\u001a)\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0007\u001a\u001b\u0010\u000e\u001a\u00020\r*\u00060\u000bj\u0002`\fH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"T", "Lcom/p7700g/p99005/yz5;", "d", "(Lcom/p7700g/p99005/yz5;)Ljava/lang/Object;", "", "Lcom/p7700g/p99005/hz5;", "a", "(Lcom/p7700g/p99005/hz5;Lcom/p7700g/p99005/uv4;)Ljava/lang/Object;", "b", "Lcom/p7700g/p99005/xz5;", "c", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "e", "(Ljava/lang/Exception;Lcom/p7700g/p99005/uv4;)Ljava/lang/Object;", "retrofit"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class qz5 {

    /* compiled from: KotlinExtensions.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "T", "", "it", "Lcom/p7700g/p99005/yq4;", "a", "(Ljava/lang/Throwable;)V", "retrofit2/KotlinExtensions$await$2$1"}, k = 3, mv = {1, 4, 0})
    /* loaded from: classes4.dex */
    public static final class a extends e25 implements f05<Throwable, yq4> {
        public final /* synthetic */ hz5 t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(hz5 hz5Var) {
            super(1);
            this.t = hz5Var;
        }

        @Override // com.p7700g.p99005.f05
        public /* bridge */ /* synthetic */ yq4 M(Throwable th) {
            a(th);
            return yq4.a;
        }

        public final void a(@Nullable Throwable th) {
            this.t.cancel();
        }
    }

    /* compiled from: KotlinExtensions.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "T", "", "it", "Lcom/p7700g/p99005/yq4;", "a", "(Ljava/lang/Throwable;)V", "retrofit2/KotlinExtensions$await$4$1"}, k = 3, mv = {1, 4, 0})
    /* loaded from: classes4.dex */
    public static final class b extends e25 implements f05<Throwable, yq4> {
        public final /* synthetic */ hz5 t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(hz5 hz5Var) {
            super(1);
            this.t = hz5Var;
        }

        @Override // com.p7700g.p99005.f05
        public /* bridge */ /* synthetic */ yq4 M(Throwable th) {
            a(th);
            return yq4.a;
        }

        public final void a(@Nullable Throwable th) {
            this.t.cancel();
        }
    }

    /* compiled from: KotlinExtensions.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/p7700g/p99005/qz5$c", "Lcom/p7700g/p99005/jz5;", "Lcom/p7700g/p99005/hz5;", kg.p0, "Lcom/p7700g/p99005/xz5;", "response", "Lcom/p7700g/p99005/yq4;", "b", "(Lcom/p7700g/p99005/hz5;Lcom/p7700g/p99005/xz5;)V", "", "t", "a", "(Lcom/p7700g/p99005/hz5;Ljava/lang/Throwable;)V", "retrofit"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes4.dex */
    public static final class c implements jz5<T> {
        public final /* synthetic */ gb5 a;

        public c(gb5 gb5Var) {
            this.a = gb5Var;
        }

        @Override // com.p7700g.p99005.jz5
        public void a(@NotNull hz5<T> hz5Var, @NotNull Throwable th) {
            c25.q(hz5Var, kg.p0);
            c25.q(th, "t");
            gb5 gb5Var = this.a;
            qp4.a aVar = qp4.s;
            gb5Var.u(qp4.b(rp4.a(th)));
        }

        @Override // com.p7700g.p99005.jz5
        public void b(@NotNull hz5<T> hz5Var, @NotNull xz5<T> xz5Var) {
            c25.q(hz5Var, kg.p0);
            c25.q(xz5Var, "response");
            if (xz5Var.g()) {
                Object a = xz5Var.a();
                if (a == null) {
                    Object p = hz5Var.x0().p(pz5.class);
                    if (p == null) {
                        c25.L();
                    }
                    c25.h(p, "call.request().tag(Invocation::class.java)!!");
                    Method b = ((pz5) p).b();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Response from ");
                    c25.h(b, "method");
                    Class<?> declaringClass = b.getDeclaringClass();
                    c25.h(declaringClass, "method.declaringClass");
                    sb.append(declaringClass.getName());
                    sb.append('.');
                    sb.append(b.getName());
                    sb.append(" was null but response body type was declared as non-null");
                    mo4 mo4Var = new mo4(sb.toString());
                    gb5 gb5Var = this.a;
                    qp4.a aVar = qp4.s;
                    gb5Var.u(qp4.b(rp4.a(mo4Var)));
                    return;
                }
                gb5 gb5Var2 = this.a;
                qp4.a aVar2 = qp4.s;
                gb5Var2.u(qp4.b(a));
                return;
            }
            gb5 gb5Var3 = this.a;
            nz5 nz5Var = new nz5(xz5Var);
            qp4.a aVar3 = qp4.s;
            gb5Var3.u(qp4.b(rp4.a(nz5Var)));
        }
    }

    /* compiled from: KotlinExtensions.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001J/\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00022\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000b\u001a\u00020\u00062\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/p7700g/p99005/qz5$d", "Lcom/p7700g/p99005/jz5;", "Lcom/p7700g/p99005/hz5;", kg.p0, "Lcom/p7700g/p99005/xz5;", "response", "Lcom/p7700g/p99005/yq4;", "b", "(Lcom/p7700g/p99005/hz5;Lcom/p7700g/p99005/xz5;)V", "", "t", "a", "(Lcom/p7700g/p99005/hz5;Ljava/lang/Throwable;)V", "retrofit"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes4.dex */
    public static final class d implements jz5<T> {
        public final /* synthetic */ gb5 a;

        public d(gb5 gb5Var) {
            this.a = gb5Var;
        }

        @Override // com.p7700g.p99005.jz5
        public void a(@NotNull hz5<T> hz5Var, @NotNull Throwable th) {
            c25.q(hz5Var, kg.p0);
            c25.q(th, "t");
            gb5 gb5Var = this.a;
            qp4.a aVar = qp4.s;
            gb5Var.u(qp4.b(rp4.a(th)));
        }

        @Override // com.p7700g.p99005.jz5
        public void b(@NotNull hz5<T> hz5Var, @NotNull xz5<T> xz5Var) {
            c25.q(hz5Var, kg.p0);
            c25.q(xz5Var, "response");
            if (xz5Var.g()) {
                gb5 gb5Var = this.a;
                Object a = xz5Var.a();
                qp4.a aVar = qp4.s;
                gb5Var.u(qp4.b(a));
                return;
            }
            gb5 gb5Var2 = this.a;
            nz5 nz5Var = new nz5(xz5Var);
            qp4.a aVar2 = qp4.s;
            gb5Var2.u(qp4.b(rp4.a(nz5Var)));
        }
    }

    /* compiled from: KotlinExtensions.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "L;", "it", "Lcom/p7700g/p99005/yq4;", "invoke", "(L;)V", "kotlin/Throwable", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: classes4.dex */
    public static final class e extends e25 implements f05<Throwable, yq4> {
        public final /* synthetic */ hz5 t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(hz5 hz5Var) {
            super(1);
            this.t = hz5Var;
        }

        @Override // com.p7700g.p99005.f05
        public /* bridge */ /* synthetic */ yq4 M(Throwable th) {
            a(th);
            return yq4.a;
        }

        public final void a(@Nullable Throwable th) {
            this.t.cancel();
        }
    }

    /* compiled from: KotlinExtensions.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/p7700g/p99005/qz5$f", "Lcom/p7700g/p99005/jz5;", "Lcom/p7700g/p99005/hz5;", kg.p0, "Lcom/p7700g/p99005/xz5;", "response", "Lcom/p7700g/p99005/yq4;", "b", "(Lcom/p7700g/p99005/hz5;Lcom/p7700g/p99005/xz5;)V", "", "t", "a", "(Lcom/p7700g/p99005/hz5;Ljava/lang/Throwable;)V", "retrofit"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes4.dex */
    public static final class f implements jz5<T> {
        public final /* synthetic */ gb5 a;

        public f(gb5 gb5Var) {
            this.a = gb5Var;
        }

        @Override // com.p7700g.p99005.jz5
        public void a(@NotNull hz5<T> hz5Var, @NotNull Throwable th) {
            c25.q(hz5Var, kg.p0);
            c25.q(th, "t");
            gb5 gb5Var = this.a;
            qp4.a aVar = qp4.s;
            gb5Var.u(qp4.b(rp4.a(th)));
        }

        @Override // com.p7700g.p99005.jz5
        public void b(@NotNull hz5<T> hz5Var, @NotNull xz5<T> xz5Var) {
            c25.q(hz5Var, kg.p0);
            c25.q(xz5Var, "response");
            gb5 gb5Var = this.a;
            qp4.a aVar = qp4.s;
            gb5Var.u(qp4.b(xz5Var));
        }
    }

    /* compiled from: KotlinExtensions.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/p7700g/p99005/yq4;", "run", "()V", "retrofit2/KotlinExtensions$suspendAndThrow$2$1", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: classes4.dex */
    public static final class g implements Runnable {
        public final /* synthetic */ uv4 s;
        public final /* synthetic */ Exception t;

        public g(uv4 uv4Var, Exception exc) {
            this.s = uv4Var;
            this.t = exc;
        }

        @Override // java.lang.Runnable
        public final void run() {
            uv4 d = fw4.d(this.s);
            Exception exc = this.t;
            qp4.a aVar = qp4.s;
            d.u(qp4.b(rp4.a(exc)));
        }
    }

    /* compiled from: KotlinExtensions.kt */
    @mw4(c = "retrofit2.KotlinExtensions", f = "KotlinExtensions.kt", i = {0}, l = {113}, m = "suspendAndThrow", n = {"$this$suspendAndThrow"}, s = {"L$0"})
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00060\u0000j\u0002`\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0080@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ljava/lang/Exception;", "Lkotlin/Exception;", "Lcom/p7700g/p99005/uv4;", "", "continuation", "", "suspendAndThrow", "(Ljava/lang/Exception;Lcom/p7700g/p99005/uv4;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 0})
    /* loaded from: classes4.dex */
    public static final class h extends kw4 {
        public /* synthetic */ Object v;
        public int w;
        public Object x;

        public h(uv4 uv4Var) {
            super(uv4Var);
        }

        @Override // com.p7700g.p99005.hw4
        @Nullable
        public final Object D1(@NotNull Object obj) {
            this.v = obj;
            this.w |= Integer.MIN_VALUE;
            return qz5.e(null, this);
        }
    }

    @Nullable
    public static final <T> Object a(@NotNull hz5<T> hz5Var, @NotNull uv4<? super T> uv4Var) {
        hb5 hb5Var = new hb5(fw4.d(uv4Var), 1);
        hb5Var.D(new a(hz5Var));
        hz5Var.m(new c(hb5Var));
        Object x = hb5Var.x();
        if (x == gw4.h()) {
            ow4.c(uv4Var);
        }
        return x;
    }

    @fz4(name = "awaitNullable")
    @Nullable
    public static final <T> Object b(@NotNull hz5<T> hz5Var, @NotNull uv4<? super T> uv4Var) {
        hb5 hb5Var = new hb5(fw4.d(uv4Var), 1);
        hb5Var.D(new b(hz5Var));
        hz5Var.m(new d(hb5Var));
        Object x = hb5Var.x();
        if (x == gw4.h()) {
            ow4.c(uv4Var);
        }
        return x;
    }

    @Nullable
    public static final <T> Object c(@NotNull hz5<T> hz5Var, @NotNull uv4<? super xz5<T>> uv4Var) {
        hb5 hb5Var = new hb5(fw4.d(uv4Var), 1);
        hb5Var.D(new e(hz5Var));
        hz5Var.m(new f(hb5Var));
        Object x = hb5Var.x();
        if (x == gw4.h()) {
            ow4.c(uv4Var);
        }
        return x;
    }

    public static final /* synthetic */ <T> T d(@NotNull yz5 yz5Var) {
        c25.q(yz5Var, "$this$create");
        c25.y(4, "T");
        return (T) yz5Var.g(Object.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(@NotNull Exception exc, @NotNull uv4<?> uv4Var) {
        h hVar;
        int i;
        if (uv4Var instanceof h) {
            hVar = (h) uv4Var;
            int i2 = hVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.w = i2 - Integer.MIN_VALUE;
                Object obj = hVar.v;
                Object h2 = gw4.h();
                i = hVar.w;
                if (i != 0) {
                    rp4.n(obj);
                    hVar.x = exc;
                    hVar.w = 1;
                    dd5.a().s(hVar.getContext(), new g(hVar, exc));
                    Object h3 = gw4.h();
                    if (h3 == gw4.h()) {
                        ow4.c(hVar);
                    }
                    if (h3 == h2) {
                        return h2;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    Exception exc2 = (Exception) hVar.x;
                    rp4.n(obj);
                }
                return yq4.a;
            }
        }
        hVar = new h(uv4Var);
        Object obj2 = hVar.v;
        Object h22 = gw4.h();
        i = hVar.w;
        if (i != 0) {
        }
        return yq4.a;
    }
}