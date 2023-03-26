package com.p7700g.p99005;

import com.p7700g.p99005.io5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: P
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* compiled from: SelectUnbiased.kt */
@np4
@vo4(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0013H\u0001J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0001J6\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00182\u001c\u0010\u0019\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u001aH\u0016ø\u0001\u0000¢\u0006\u0002\u0010\u001bJ3\u0010\u001c\u001a\u00020\t*\u00020\u001d2\u001c\u0010\u0019\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u001aH\u0096\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u001eJE\u0010\u001c\u001a\u00020\t\"\u0004\b\u0001\u0010\u001f*\b\u0012\u0004\u0012\u0002H\u001f0 2\"\u0010\u0019\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00150!H\u0096\u0002ø\u0001\u0000¢\u0006\u0002\u0010\"JY\u0010\u001c\u001a\u00020\t\"\u0004\b\u0001\u0010#\"\u0004\b\u0002\u0010\u001f*\u000e\u0012\u0004\u0012\u0002H#\u0012\u0004\u0012\u0002H\u001f0$2\u0006\u0010%\u001a\u0002H#2\"\u0010\u0019\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00150!H\u0096\u0002ø\u0001\u0000¢\u0006\u0002\u0010&R-\u0010\u0006\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b`\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, d2 = {"Lkotlinx/coroutines/selects/UnbiasedSelectBuilderImpl;", "R", "Lkotlinx/coroutines/selects/SelectBuilder;", "uCont", "Lkotlin/coroutines/Continuation;", "(Lkotlin/coroutines/Continuation;)V", "clauses", "Ljava/util/ArrayList;", "Lkotlin/Function0;", "", "Lkotlin/collections/ArrayList;", "getClauses", "()Ljava/util/ArrayList;", "instance", "Lkotlinx/coroutines/selects/SelectBuilderImpl;", "getInstance", "()Lkotlinx/coroutines/selects/SelectBuilderImpl;", "handleBuilderException", "e", "", "initSelectResult", "", "onTimeout", "timeMillis", "", "block", "Lkotlin/Function1;", "(JLkotlin/jvm/functions/Function1;)V", "invoke", "Lkotlinx/coroutines/selects/SelectClause0;", "(Lkotlinx/coroutines/selects/SelectClause0;Lkotlin/jvm/functions/Function1;)V", "Q", "Lkotlinx/coroutines/selects/SelectClause1;", "Lkotlin/Function2;", "(Lkotlinx/coroutines/selects/SelectClause1;Lkotlin/jvm/functions/Function2;)V", "P", "Lkotlinx/coroutines/selects/SelectClause2;", "param", "(Lkotlinx/coroutines/selects/SelectClause2;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ro5<R> implements io5<R> {
    @NotNull
    private final jo5<R> s;
    @NotNull
    private final ArrayList<uz4<yq4>> t = new ArrayList<>();

    /* compiled from: SelectUnbiased.kt */
    @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002 \u0000H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "R", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends e25 implements uz4<yq4> {
        public final /* synthetic */ ko5 t;
        public final /* synthetic */ ro5<R> u;
        public final /* synthetic */ f05<uv4<? super R>, Object> v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(ko5 ko5Var, ro5<? super R> ro5Var, f05<? super uv4<? super R>, ? extends Object> f05Var) {
            super(0);
            this.t = ko5Var;
            this.u = ro5Var;
            this.v = f05Var;
        }

        public final void h() {
            this.t.r(this.u.c(), this.v);
        }

        @Override // com.p7700g.p99005.uz4
        public /* bridge */ /* synthetic */ yq4 x() {
            h();
            return yq4.a;
        }
    }

    /* compiled from: SelectUnbiased.kt */
    @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0006\b\u0001\u0010\u0003 \u0000H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Q", "R", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends e25 implements uz4<yq4> {
        public final /* synthetic */ lo5<Q> t;
        public final /* synthetic */ ro5<R> u;
        public final /* synthetic */ j05<Q, uv4<? super R>, Object> v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(lo5<? extends Q> lo5Var, ro5<? super R> ro5Var, j05<? super Q, ? super uv4<? super R>, ? extends Object> j05Var) {
            super(0);
            this.t = lo5Var;
            this.u = ro5Var;
            this.v = j05Var;
        }

        public final void h() {
            this.t.i(this.u.c(), this.v);
        }

        @Override // com.p7700g.p99005.uz4
        public /* bridge */ /* synthetic */ yq4 x() {
            h();
            return yq4.a;
        }
    }

    /* compiled from: SelectUnbiased.kt */
    @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0006\b\u0002\u0010\u0004 \u0000H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "P", "Q", "R", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c extends e25 implements uz4<yq4> {
        public final /* synthetic */ mo5<P, Q> t;
        public final /* synthetic */ ro5<R> u;
        public final /* synthetic */ P v;
        public final /* synthetic */ j05<Q, uv4<? super R>, Object> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(mo5<? super P, ? extends Q> mo5Var, ro5<? super R> ro5Var, P p, j05<? super Q, ? super uv4<? super R>, ? extends Object> j05Var) {
            super(0);
            this.t = mo5Var;
            this.u = ro5Var;
            this.v = p;
            this.w = j05Var;
        }

        public final void h() {
            this.t.G(this.u.c(), this.v, this.w);
        }

        @Override // com.p7700g.p99005.uz4
        public /* bridge */ /* synthetic */ yq4 x() {
            h();
            return yq4.a;
        }
    }

    /* compiled from: SelectUnbiased.kt */
    @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002 \u0000H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "R", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d extends e25 implements uz4<yq4> {
        public final /* synthetic */ ro5<R> t;
        public final /* synthetic */ long u;
        public final /* synthetic */ f05<uv4<? super R>, Object> v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(ro5<? super R> ro5Var, long j, f05<? super uv4<? super R>, ? extends Object> f05Var) {
            super(0);
            this.t = ro5Var;
            this.u = j;
            this.v = f05Var;
        }

        public final void h() {
            this.t.c().z(this.u, this.v);
        }

        @Override // com.p7700g.p99005.uz4
        public /* bridge */ /* synthetic */ yq4 x() {
            h();
            return yq4.a;
        }
    }

    public ro5(@NotNull uv4<? super R> uv4Var) {
        this.s = new jo5<>(uv4Var);
    }

    @Override // com.p7700g.p99005.io5
    public <Q> void W(@NotNull lo5<? extends Q> lo5Var, @NotNull j05<? super Q, ? super uv4<? super R>, ? extends Object> j05Var) {
        this.t.add(new b(lo5Var, this, j05Var));
    }

    @NotNull
    public final ArrayList<uz4<yq4>> a() {
        return this.t;
    }

    @Override // com.p7700g.p99005.io5
    public void b(@NotNull ko5 ko5Var, @NotNull f05<? super uv4<? super R>, ? extends Object> f05Var) {
        this.t.add(new a(ko5Var, this, f05Var));
    }

    @NotNull
    public final jo5<R> c() {
        return this.s;
    }

    @np4
    public final void d(@NotNull Throwable th) {
        this.s.M0(th);
    }

    @np4
    @Nullable
    public final Object e() {
        if (!this.s.v()) {
            try {
                Collections.shuffle(this.t);
                Iterator<T> it = this.t.iterator();
                while (it.hasNext()) {
                    ((uz4) it.next()).x();
                }
            } catch (Throwable th) {
                this.s.M0(th);
            }
        }
        return this.s.L0();
    }

    @Override // com.p7700g.p99005.io5
    public <P, Q> void k(@NotNull mo5<? super P, ? extends Q> mo5Var, @NotNull j05<? super Q, ? super uv4<? super R>, ? extends Object> j05Var) {
        io5.a.a(this, mo5Var, j05Var);
    }

    @Override // com.p7700g.p99005.io5
    public <P, Q> void s(@NotNull mo5<? super P, ? extends Q> mo5Var, P p, @NotNull j05<? super Q, ? super uv4<? super R>, ? extends Object> j05Var) {
        this.t.add(new c(mo5Var, this, p, j05Var));
    }

    @Override // com.p7700g.p99005.io5
    public void z(long j, @NotNull f05<? super uv4<? super R>, ? extends Object> f05Var) {
        this.t.add(new d(this, j, f05Var));
    }
}