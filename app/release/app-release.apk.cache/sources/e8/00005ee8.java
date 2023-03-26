package com.p7700g.p99005;

import com.anythink.core.api.ATAdConst;
import com.p7700g.p99005.b35;
import com.p7700g.p99005.xv4;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CoroutineContextImpl.kt */
@vo4(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001!B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0000H\u0002J\u0013\u0010\f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J5\u0010\u000f\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u00102\u0006\u0010\u0011\u001a\u0002H\u00102\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\u00100\u0013H\u0016¢\u0006\u0002\u0010\u0014J(\u0010\u0015\u001a\u0004\u0018\u0001H\u0016\"\b\b\u0000\u0010\u0016*\u00020\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0018H\u0096\u0002¢\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0014\u0010\u001c\u001a\u00020\u00012\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0018H\u0016J\b\u0010\u001d\u001a\u00020\u001bH\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u000eH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lkotlin/coroutines/CombinedContext;", "Lkotlin/coroutines/CoroutineContext;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "left", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext$Element;)V", "contains", "", "containsAll", "context", "equals", "other", "", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "get", "E", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "hashCode", "", "minusKey", ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, "toString", "", "writeReplace", "Serialized", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
@tp4(version = "1.3")
/* loaded from: classes3.dex */
public final class tv4 implements xv4, Serializable {
    @NotNull
    private final xv4 s;
    @NotNull
    private final xv4.b t;

    /* compiled from: CoroutineContextImpl.kt */
    @vo4(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u0000 \f2\u00060\u0001j\u0002`\u0002:\u0001\fB\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0002R\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lkotlin/coroutines/CombinedContext$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "elements", "", "Lkotlin/coroutines/CoroutineContext;", "([Lkotlin/coroutines/CoroutineContext;)V", "getElements", "()[Lkotlin/coroutines/CoroutineContext;", "[Lkotlin/coroutines/CoroutineContext;", "readResolve", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Serializable {
        @NotNull
        public static final C0252a s = new C0252a(null);
        private static final long t = 0;
        @NotNull
        private final xv4[] u;

        /* compiled from: CoroutineContextImpl.kt */
        @vo4(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlin/coroutines/CombinedContext$Serialized$Companion;", "", "()V", "serialVersionUID", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
        /* renamed from: com.p7700g.p99005.tv4$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0252a {
            private C0252a() {
            }

            public /* synthetic */ C0252a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public a(@NotNull xv4[] xv4VarArr) {
            c25.p(xv4VarArr, "elements");
            this.u = xv4VarArr;
        }

        private final Object g() {
            xv4[] xv4VarArr = this.u;
            xv4 xv4Var = zv4.s;
            for (xv4 xv4Var2 : xv4VarArr) {
                xv4Var = xv4Var.plus(xv4Var2);
            }
            return xv4Var;
        }

        @NotNull
        public final xv4[] f() {
            return this.u;
        }
    }

    /* compiled from: CoroutineContextImpl.kt */
    @vo4(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "acc", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends e25 implements j05<String, xv4.b, String> {
        public static final b t = new b();

        public b() {
            super(2);
        }

        @Override // com.p7700g.p99005.j05
        @NotNull
        /* renamed from: a */
        public final String w3(@NotNull String str, @NotNull xv4.b bVar) {
            c25.p(str, "acc");
            c25.p(bVar, "element");
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    /* compiled from: CoroutineContextImpl.kt */
    @vo4(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke", "(Lkotlin/Unit;Lkotlin/coroutines/CoroutineContext$Element;)V"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c extends e25 implements j05<yq4, xv4.b, yq4> {
        public final /* synthetic */ xv4[] t;
        public final /* synthetic */ b35.f u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(xv4[] xv4VarArr, b35.f fVar) {
            super(2);
            this.t = xv4VarArr;
            this.u = fVar;
        }

        public final void a(@NotNull yq4 yq4Var, @NotNull xv4.b bVar) {
            c25.p(yq4Var, "<anonymous parameter 0>");
            c25.p(bVar, "element");
            xv4[] xv4VarArr = this.t;
            b35.f fVar = this.u;
            int i = fVar.s;
            fVar.s = i + 1;
            xv4VarArr[i] = bVar;
        }

        @Override // com.p7700g.p99005.j05
        public /* bridge */ /* synthetic */ yq4 w3(yq4 yq4Var, xv4.b bVar) {
            a(yq4Var, bVar);
            return yq4.a;
        }
    }

    public tv4(@NotNull xv4 xv4Var, @NotNull xv4.b bVar) {
        c25.p(xv4Var, "left");
        c25.p(bVar, "element");
        this.s = xv4Var;
        this.t = bVar;
    }

    private final boolean c(xv4.b bVar) {
        return c25.g(get(bVar.getKey()), bVar);
    }

    private final boolean g(tv4 tv4Var) {
        while (c(tv4Var.t)) {
            xv4 xv4Var = tv4Var.s;
            if (xv4Var instanceof tv4) {
                tv4Var = (tv4) xv4Var;
            } else {
                c25.n(xv4Var, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return c((xv4.b) xv4Var);
            }
        }
        return false;
    }

    private final int i() {
        int i = 2;
        tv4 tv4Var = this;
        while (true) {
            xv4 xv4Var = tv4Var.s;
            tv4Var = xv4Var instanceof tv4 ? (tv4) xv4Var : null;
            if (tv4Var == null) {
                return i;
            }
            i++;
        }
    }

    private final Object n() {
        int i = i();
        xv4[] xv4VarArr = new xv4[i];
        b35.f fVar = new b35.f();
        fold(yq4.a, new c(xv4VarArr, fVar));
        if (fVar.s == i) {
            return new a(xv4VarArr);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof tv4) {
                tv4 tv4Var = (tv4) obj;
                if (tv4Var.i() != i() || !tv4Var.g(this)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.p7700g.p99005.xv4
    public <R> R fold(R r, @NotNull j05<? super R, ? super xv4.b, ? extends R> j05Var) {
        c25.p(j05Var, "operation");
        return j05Var.w3((Object) this.s.fold(r, j05Var), this.t);
    }

    @Override // com.p7700g.p99005.xv4
    @Nullable
    public <E extends xv4.b> E get(@NotNull xv4.c<E> cVar) {
        c25.p(cVar, "key");
        tv4 tv4Var = this;
        while (true) {
            E e = (E) tv4Var.t.get(cVar);
            if (e != null) {
                return e;
            }
            xv4 xv4Var = tv4Var.s;
            if (xv4Var instanceof tv4) {
                tv4Var = (tv4) xv4Var;
            } else {
                return (E) xv4Var.get(cVar);
            }
        }
    }

    public int hashCode() {
        return this.t.hashCode() + this.s.hashCode();
    }

    @Override // com.p7700g.p99005.xv4
    @NotNull
    public xv4 minusKey(@NotNull xv4.c<?> cVar) {
        c25.p(cVar, "key");
        if (this.t.get(cVar) != null) {
            return this.s;
        }
        xv4 minusKey = this.s.minusKey(cVar);
        return minusKey == this.s ? this : minusKey == zv4.s ? this.t : new tv4(minusKey, this.t);
    }

    @Override // com.p7700g.p99005.xv4
    @NotNull
    public xv4 plus(@NotNull xv4 xv4Var) {
        return xv4.a.a(this, xv4Var);
    }

    @NotNull
    public String toString() {
        return wo1.B(wo1.F(f14.u), (String) fold("", b.t), f14.v);
    }
}