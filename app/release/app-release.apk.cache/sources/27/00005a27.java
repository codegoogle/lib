package com.p7700g.p99005;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@vo4(d1 = {"kotlinx/coroutines/flow/FlowKt__BuildersKt", "kotlinx/coroutines/flow/FlowKt__ChannelsKt", "kotlinx/coroutines/flow/FlowKt__CollectKt", "kotlinx/coroutines/flow/FlowKt__CollectionKt", "kotlinx/coroutines/flow/FlowKt__ContextKt", "kotlinx/coroutines/flow/FlowKt__CountKt", "kotlinx/coroutines/flow/FlowKt__DelayKt", "kotlinx/coroutines/flow/FlowKt__DistinctKt", "kotlinx/coroutines/flow/FlowKt__EmittersKt", "kotlinx/coroutines/flow/FlowKt__ErrorsKt", "kotlinx/coroutines/flow/FlowKt__LimitKt", "kotlinx/coroutines/flow/FlowKt__MergeKt", "kotlinx/coroutines/flow/FlowKt__MigrationKt", "kotlinx/coroutines/flow/FlowKt__ReduceKt", "kotlinx/coroutines/flow/FlowKt__ShareKt", "kotlinx/coroutines/flow/FlowKt__TransformKt", "kotlinx/coroutines/flow/FlowKt__ZipKt"}, k = 4, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ri5 {
    @NotNull
    public static final String a = "kotlinx.coroutines.flow.defaultConcurrency";

    @Nullable
    public static final <T> Object A(@NotNull pi5<? extends T> pi5Var, @NotNull j05<? super T, ? super uv4<? super yq4>, ? extends Object> j05Var, @NotNull uv4<? super yq4> uv4Var) {
        return ui5.f(pi5Var, j05Var, uv4Var);
    }

    @ud5
    @NotNull
    public static final <T, R> pi5<R> A0(@NotNull pi5<? extends T> pi5Var, @NotNull j05<? super T, ? super uv4<? super pi5<? extends R>>, ? extends Object> j05Var) {
        return dj5.a(pi5Var, j05Var);
    }

    @ud5
    @NotNull
    public static final <T> pi5<T> A1(@NotNull pi5<? extends T> pi5Var, long j) {
        return yi5.h(pi5Var, j);
    }

    @Nullable
    public static final <T> Object B(@NotNull pi5<? extends T> pi5Var, @NotNull j05<? super T, ? super uv4<? super Boolean>, ? extends Object> j05Var, @NotNull uv4<? super yq4> uv4Var) {
        return cj5.b(pi5Var, j05Var, uv4Var);
    }

    @td5
    @NotNull
    public static final <T, R> pi5<R> B0(@NotNull pi5<? extends T> pi5Var, @on4 @NotNull j05<? super T, ? super uv4<? super pi5<? extends R>>, ? extends Object> j05Var) {
        return dj5.b(pi5Var, j05Var);
    }

    @ud5
    @NotNull
    public static final <T> pi5<T> B1(@NotNull pi5<? extends T> pi5Var, long j) {
        return yi5.i(pi5Var, j);
    }

    @ud5
    @NotNull
    public static final <T, R> pi5<R> C0(@NotNull pi5<? extends T> pi5Var, int i, @NotNull j05<? super T, ? super uv4<? super pi5<? extends R>>, ? extends Object> j05Var) {
        return dj5.c(pi5Var, i, j05Var);
    }

    @NotNull
    public static final <T, R> pi5<R> C1(@NotNull pi5<? extends T> pi5Var, R r, @on4 @NotNull k05<? super R, ? super T, ? super uv4<? super R>, ? extends Object> k05Var) {
        return hj5.j(pi5Var, r, k05Var);
    }

    @NotNull
    public static final <T1, T2, R> pi5<R> D(@NotNull pi5<? extends T1> pi5Var, @NotNull pi5<? extends T2> pi5Var2, @NotNull k05<? super T1, ? super T2, ? super uv4<? super R>, ? extends Object> k05Var) {
        return ij5.c(pi5Var, pi5Var2, k05Var);
    }

    @xn4(level = zn4.ERROR, message = "Flow has less verbose 'scan' shortcut", replaceWith = @op4(expression = "scan(initial, operation)", imports = {}))
    @NotNull
    public static final <T, R> pi5<R> D1(@NotNull pi5<? extends T> pi5Var, R r, @on4 @NotNull k05<? super R, ? super T, ? super uv4<? super R>, ? extends Object> k05Var) {
        return ej5.B(pi5Var, r, k05Var);
    }

    @NotNull
    public static final <T1, T2, T3, R> pi5<R> E(@NotNull pi5<? extends T1> pi5Var, @NotNull pi5<? extends T2> pi5Var2, @NotNull pi5<? extends T3> pi5Var3, @on4 @NotNull l05<? super T1, ? super T2, ? super T3, ? super uv4<? super R>, ? extends Object> l05Var) {
        return ij5.d(pi5Var, pi5Var2, pi5Var3, l05Var);
    }

    @xn4(level = zn4.ERROR, message = "Flow analogue of 'flatten' is 'flattenConcat'", replaceWith = @op4(expression = "flattenConcat()", imports = {}))
    @NotNull
    public static final <T> pi5<T> E0(@NotNull pi5<? extends pi5<? extends T>> pi5Var) {
        return ej5.m(pi5Var);
    }

    @xn4(level = zn4.ERROR, message = "'scanReduce' was renamed to 'runningReduce' to be consistent with Kotlin standard library", replaceWith = @op4(expression = "runningReduce(operation)", imports = {}))
    @NotNull
    public static final <T> pi5<T> E1(@NotNull pi5<? extends T> pi5Var, @NotNull k05<? super T, ? super T, ? super uv4<? super T>, ? extends Object> k05Var) {
        return ej5.C(pi5Var, k05Var);
    }

    @NotNull
    public static final <T1, T2, T3, T4, R> pi5<R> F(@NotNull pi5<? extends T1> pi5Var, @NotNull pi5<? extends T2> pi5Var2, @NotNull pi5<? extends T3> pi5Var3, @NotNull pi5<? extends T4> pi5Var4, @NotNull m05<? super T1, ? super T2, ? super T3, ? super T4, ? super uv4<? super R>, ? extends Object> m05Var) {
        return ij5.e(pi5Var, pi5Var2, pi5Var3, pi5Var4, m05Var);
    }

    @ud5
    @NotNull
    public static final <T> pi5<T> F0(@NotNull pi5<? extends pi5<? extends T>> pi5Var) {
        return dj5.e(pi5Var);
    }

    @NotNull
    public static final <T> pj5<T> F1(@NotNull pi5<? extends T> pi5Var, @NotNull lc5 lc5Var, @NotNull vj5 vj5Var, int i) {
        return gj5.g(pi5Var, lc5Var, vj5Var, i);
    }

    @NotNull
    public static final <T1, T2, T3, T4, T5, R> pi5<R> G(@NotNull pi5<? extends T1> pi5Var, @NotNull pi5<? extends T2> pi5Var2, @NotNull pi5<? extends T3> pi5Var3, @NotNull pi5<? extends T4> pi5Var4, @NotNull pi5<? extends T5> pi5Var5, @NotNull n05<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super uv4<? super R>, ? extends Object> n05Var) {
        return ij5.f(pi5Var, pi5Var2, pi5Var3, pi5Var4, pi5Var5, n05Var);
    }

    @ud5
    @NotNull
    public static final <T> pi5<T> G0(@NotNull pi5<? extends pi5<? extends T>> pi5Var, int i) {
        return dj5.f(pi5Var, i);
    }

    @Nullable
    public static final <T> Object H1(@NotNull pi5<? extends T> pi5Var, @NotNull uv4<? super T> uv4Var) {
        return fj5.j(pi5Var, uv4Var);
    }

    @xn4(level = zn4.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @op4(expression = "this.combine(other, transform)", imports = {}))
    @NotNull
    public static final <T1, T2, R> pi5<R> I(@NotNull pi5<? extends T1> pi5Var, @NotNull pi5<? extends T2> pi5Var2, @NotNull k05<? super T1, ? super T2, ? super uv4<? super R>, ? extends Object> k05Var) {
        return ej5.b(pi5Var, pi5Var2, k05Var);
    }

    @NotNull
    public static final <T> pi5<T> I0(@on4 @NotNull j05<? super qi5<? super T>, ? super uv4<? super yq4>, ? extends Object> j05Var) {
        return si5.n(j05Var);
    }

    @Nullable
    public static final <T> Object I1(@NotNull pi5<? extends T> pi5Var, @NotNull uv4<? super T> uv4Var) {
        return fj5.k(pi5Var, uv4Var);
    }

    @xn4(level = zn4.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @op4(expression = "combine(this, other, other2, transform)", imports = {}))
    @NotNull
    public static final <T1, T2, T3, R> pi5<R> J(@NotNull pi5<? extends T1> pi5Var, @NotNull pi5<? extends T2> pi5Var2, @NotNull pi5<? extends T3> pi5Var3, @NotNull l05<? super T1, ? super T2, ? super T3, ? super uv4<? super R>, ? extends Object> l05Var) {
        return ej5.c(pi5Var, pi5Var2, pi5Var3, l05Var);
    }

    @fz4(name = "flowCombine")
    @NotNull
    public static final <T1, T2, R> pi5<R> J0(@NotNull pi5<? extends T1> pi5Var, @NotNull pi5<? extends T2> pi5Var2, @NotNull k05<? super T1, ? super T2, ? super uv4<? super R>, ? extends Object> k05Var) {
        return ij5.p(pi5Var, pi5Var2, k05Var);
    }

    @xn4(level = zn4.ERROR, message = "Flow analogue of 'skip' is 'drop'", replaceWith = @op4(expression = "drop(count)", imports = {}))
    @NotNull
    public static final <T> pi5<T> J1(@NotNull pi5<? extends T> pi5Var, int i) {
        return ej5.D(pi5Var, i);
    }

    @xn4(level = zn4.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @op4(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    @NotNull
    public static final <T1, T2, T3, T4, R> pi5<R> K(@NotNull pi5<? extends T1> pi5Var, @NotNull pi5<? extends T2> pi5Var2, @NotNull pi5<? extends T3> pi5Var3, @NotNull pi5<? extends T4> pi5Var4, @NotNull m05<? super T1, ? super T2, ? super T3, ? super T4, ? super uv4<? super R>, ? extends Object> m05Var) {
        return ej5.d(pi5Var, pi5Var2, pi5Var3, pi5Var4, m05Var);
    }

    @fz4(name = "flowCombineTransform")
    @NotNull
    public static final <T1, T2, R> pi5<R> K0(@NotNull pi5<? extends T1> pi5Var, @NotNull pi5<? extends T2> pi5Var2, @on4 @NotNull l05<? super qi5<? super R>, ? super T1, ? super T2, ? super uv4<? super yq4>, ? extends Object> l05Var) {
        return ij5.q(pi5Var, pi5Var2, l05Var);
    }

    @xn4(level = zn4.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emit(value) }'", replaceWith = @op4(expression = "onStart { emit(value) }", imports = {}))
    @NotNull
    public static final <T> pi5<T> K1(@NotNull pi5<? extends T> pi5Var, T t) {
        return ej5.E(pi5Var, t);
    }

    @xn4(level = zn4.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @op4(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    @NotNull
    public static final <T1, T2, T3, T4, T5, R> pi5<R> L(@NotNull pi5<? extends T1> pi5Var, @NotNull pi5<? extends T2> pi5Var2, @NotNull pi5<? extends T3> pi5Var3, @NotNull pi5<? extends T4> pi5Var4, @NotNull pi5<? extends T5> pi5Var5, @NotNull n05<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super uv4<? super R>, ? extends Object> n05Var) {
        return ej5.e(pi5Var, pi5Var2, pi5Var3, pi5Var4, pi5Var5, n05Var);
    }

    @NotNull
    public static final <T> pi5<T> L0(T t) {
        return si5.o(t);
    }

    @xn4(level = zn4.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emitAll(other) }'", replaceWith = @op4(expression = "onStart { emitAll(other) }", imports = {}))
    @NotNull
    public static final <T> pi5<T> L1(@NotNull pi5<? extends T> pi5Var, @NotNull pi5<? extends T> pi5Var2) {
        return ej5.F(pi5Var, pi5Var2);
    }

    @NotNull
    public static final <T> pi5<T> M0(@NotNull T... tArr) {
        return si5.p(tArr);
    }

    @Nullable
    public static final <T> Object M1(@NotNull pi5<? extends T> pi5Var, @NotNull lc5 lc5Var, @NotNull uv4<? super ak5<? extends T>> uv4Var) {
        return gj5.i(pi5Var, lc5Var, uv4Var);
    }

    @NotNull
    public static final <T1, T2, R> pi5<R> N(@NotNull pi5<? extends T1> pi5Var, @NotNull pi5<? extends T2> pi5Var2, @on4 @NotNull l05<? super qi5<? super R>, ? super T1, ? super T2, ? super uv4<? super yq4>, ? extends Object> l05Var) {
        return ij5.i(pi5Var, pi5Var2, l05Var);
    }

    @NotNull
    public static final <T> pi5<T> N0(@NotNull pi5<? extends T> pi5Var, @NotNull xv4 xv4Var) {
        return wi5.h(pi5Var, xv4Var);
    }

    @NotNull
    public static final <T> ak5<T> N1(@NotNull pi5<? extends T> pi5Var, @NotNull lc5 lc5Var, @NotNull vj5 vj5Var, T t) {
        return gj5.j(pi5Var, lc5Var, vj5Var, t);
    }

    @NotNull
    public static final <T1, T2, T3, R> pi5<R> O(@NotNull pi5<? extends T1> pi5Var, @NotNull pi5<? extends T2> pi5Var2, @NotNull pi5<? extends T3> pi5Var3, @on4 @NotNull m05<? super qi5<? super R>, ? super T1, ? super T2, ? super T3, ? super uv4<? super yq4>, ? extends Object> m05Var) {
        return ij5.j(pi5Var, pi5Var2, pi5Var3, m05Var);
    }

    @Nullable
    public static final <T, R> Object O0(@NotNull pi5<? extends T> pi5Var, R r, @NotNull k05<? super R, ? super T, ? super uv4<? super R>, ? extends Object> k05Var, @NotNull uv4<? super R> uv4Var) {
        return fj5.e(pi5Var, r, k05Var, uv4Var);
    }

    @xn4(level = zn4.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void O1(@NotNull pi5<? extends T> pi5Var) {
        ej5.G(pi5Var);
    }

    @NotNull
    public static final <T1, T2, T3, T4, R> pi5<R> P(@NotNull pi5<? extends T1> pi5Var, @NotNull pi5<? extends T2> pi5Var2, @NotNull pi5<? extends T3> pi5Var3, @NotNull pi5<? extends T4> pi5Var4, @on4 @NotNull n05<? super qi5<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super uv4<? super yq4>, ? extends Object> n05Var) {
        return ij5.k(pi5Var, pi5Var2, pi5Var3, pi5Var4, n05Var);
    }

    @xn4(level = zn4.ERROR, message = "Flow analogue of 'forEach' is 'collect'", replaceWith = @op4(expression = "collect(action)", imports = {}))
    public static final <T> void P0(@NotNull pi5<? extends T> pi5Var, @NotNull j05<? super T, ? super uv4<? super yq4>, ? extends Object> j05Var) {
        ej5.n(pi5Var, j05Var);
    }

    @xn4(level = zn4.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void P1(@NotNull pi5<? extends T> pi5Var, @NotNull j05<? super T, ? super uv4<? super yq4>, ? extends Object> j05Var) {
        ej5.H(pi5Var, j05Var);
    }

    @NotNull
    public static final <T1, T2, T3, T4, T5, R> pi5<R> Q(@NotNull pi5<? extends T1> pi5Var, @NotNull pi5<? extends T2> pi5Var2, @NotNull pi5<? extends T3> pi5Var3, @NotNull pi5<? extends T4> pi5Var4, @NotNull pi5<? extends T5> pi5Var5, @on4 @NotNull o05<? super qi5<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super uv4<? super yq4>, ? extends Object> o05Var) {
        return ij5.l(pi5Var, pi5Var2, pi5Var3, pi5Var4, pi5Var5, o05Var);
    }

    public static final int Q0() {
        return dj5.h();
    }

    @xn4(level = zn4.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void Q1(@NotNull pi5<? extends T> pi5Var, @NotNull j05<? super T, ? super uv4<? super yq4>, ? extends Object> j05Var, @NotNull j05<? super Throwable, ? super uv4<? super yq4>, ? extends Object> j05Var2) {
        ej5.I(pi5Var, j05Var, j05Var2);
    }

    @xn4(level = zn4.ERROR, message = "Use 'flowOn' instead")
    @NotNull
    public static final <T> pi5<T> R1(@NotNull pi5<? extends T> pi5Var, @NotNull xv4 xv4Var) {
        return ej5.J(pi5Var, xv4Var);
    }

    @xn4(level = zn4.ERROR, message = "Flow analogue of 'compose' is 'let'", replaceWith = @op4(expression = "let(transformer)", imports = {}))
    @NotNull
    public static final <T, R> pi5<R> S(@NotNull pi5<? extends T> pi5Var, @NotNull f05<? super pi5<? extends T>, ? extends pi5<? extends R>> f05Var) {
        return ej5.f(pi5Var, f05Var);
    }

    @Nullable
    public static final <T> Object S0(@NotNull pi5<? extends T> pi5Var, @NotNull uv4<? super T> uv4Var) {
        return fj5.g(pi5Var, uv4Var);
    }

    @xn4(level = zn4.ERROR, message = "Flow analogues of 'switchMap' are 'transformLatest', 'flatMapLatest' and 'mapLatest'", replaceWith = @op4(expression = "this.flatMapLatest(transform)", imports = {}))
    @NotNull
    public static final <T, R> pi5<R> S1(@NotNull pi5<? extends T> pi5Var, @NotNull j05<? super T, ? super uv4<? super pi5<? extends R>>, ? extends Object> j05Var) {
        return ej5.K(pi5Var, j05Var);
    }

    @xn4(level = zn4.ERROR, message = "Flow analogue of 'concatMap' is 'flatMapConcat'", replaceWith = @op4(expression = "flatMapConcat(mapper)", imports = {}))
    @NotNull
    public static final <T, R> pi5<R> T(@NotNull pi5<? extends T> pi5Var, @NotNull f05<? super T, ? extends pi5<? extends R>> f05Var) {
        return ej5.g(pi5Var, f05Var);
    }

    @Nullable
    public static final <T> Object T0(@NotNull pi5<? extends T> pi5Var, @NotNull uv4<? super T> uv4Var) {
        return fj5.h(pi5Var, uv4Var);
    }

    @NotNull
    public static final <T> pi5<T> T1(@NotNull pi5<? extends T> pi5Var, int i) {
        return cj5.g(pi5Var, i);
    }

    @xn4(level = zn4.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { emit(value) }'", replaceWith = @op4(expression = "onCompletion { emit(value) }", imports = {}))
    @NotNull
    public static final <T> pi5<T> U(@NotNull pi5<? extends T> pi5Var, T t) {
        return ej5.h(pi5Var, t);
    }

    @NotNull
    public static final <T> ee5 U0(@NotNull pi5<? extends T> pi5Var, @NotNull lc5 lc5Var) {
        return ui5.h(pi5Var, lc5Var);
    }

    @NotNull
    public static final <T> pi5<T> U1(@NotNull pi5<? extends T> pi5Var, @NotNull j05<? super T, ? super uv4<? super Boolean>, ? extends Object> j05Var) {
        return cj5.h(pi5Var, j05Var);
    }

    @xn4(level = zn4.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { if (it == null) emitAll(other) }'", replaceWith = @op4(expression = "onCompletion { if (it == null) emitAll(other) }", imports = {}))
    @NotNull
    public static final <T> pi5<T> V(@NotNull pi5<? extends T> pi5Var, @NotNull pi5<? extends T> pi5Var2) {
        return ej5.i(pi5Var, pi5Var2);
    }

    @NotNull
    public static final <T, R> pi5<R> V0(@NotNull pi5<? extends T> pi5Var, @NotNull j05<? super T, ? super uv4<? super R>, ? extends Object> j05Var) {
        return hj5.e(pi5Var, j05Var);
    }

    @Nullable
    public static final <T, C extends Collection<? super T>> Object V1(@NotNull pi5<? extends T> pi5Var, @NotNull C c, @NotNull uv4<? super C> uv4Var) {
        return vi5.a(pi5Var, c, uv4Var);
    }

    @NotNull
    public static final <T> pi5<T> W(@NotNull pi5<? extends T> pi5Var) {
        return wi5.g(pi5Var);
    }

    @td5
    @NotNull
    public static final <T, R> pi5<R> W0(@NotNull pi5<? extends T> pi5Var, @on4 @NotNull j05<? super T, ? super uv4<? super R>, ? extends Object> j05Var) {
        return dj5.k(pi5Var, j05Var);
    }

    @Nullable
    public static final <T> Object W1(@NotNull pi5<? extends T> pi5Var, @NotNull List<T> list, @NotNull uv4<? super List<? extends T>> uv4Var) {
        return vi5.b(pi5Var, list, uv4Var);
    }

    @NotNull
    public static final <T> pi5<T> X(@NotNull jh5<? extends T> jh5Var) {
        return ti5.c(jh5Var);
    }

    @NotNull
    public static final <T, R> pi5<R> X0(@NotNull pi5<? extends T> pi5Var, @NotNull j05<? super T, ? super uv4<? super R>, ? extends Object> j05Var) {
        return hj5.f(pi5Var, j05Var);
    }

    @Nullable
    public static final <T> Object Y(@NotNull pi5<? extends T> pi5Var, @NotNull uv4<? super Integer> uv4Var) {
        return xi5.a(pi5Var, uv4Var);
    }

    @NotNull
    public static final <T> pi5<T> Y0(@NotNull Iterable<? extends pi5<? extends T>> iterable) {
        return dj5.l(iterable);
    }

    @Nullable
    public static final <T> Object Y1(@NotNull pi5<? extends T> pi5Var, @NotNull Set<T> set, @NotNull uv4<? super Set<? extends T>> uv4Var) {
        return vi5.d(pi5Var, set, uv4Var);
    }

    @Nullable
    public static final <T> Object Z(@NotNull pi5<? extends T> pi5Var, @NotNull j05<? super T, ? super uv4<? super Boolean>, ? extends Object> j05Var, @NotNull uv4<? super Integer> uv4Var) {
        return xi5.b(pi5Var, j05Var, uv4Var);
    }

    @xn4(level = zn4.ERROR, message = "Flow analogue of 'merge' is 'flattenConcat'", replaceWith = @op4(expression = "flattenConcat()", imports = {}))
    @NotNull
    public static final <T> pi5<T> Z0(@NotNull pi5<? extends pi5<? extends T>> pi5Var) {
        return ej5.o(pi5Var);
    }

    @NotNull
    public static final <T> pi5<T> a(@NotNull Iterable<? extends T> iterable) {
        return si5.a(iterable);
    }

    @ud5
    @NotNull
    public static final <T> pi5<T> a0(@NotNull pi5<? extends T> pi5Var, long j) {
        return yi5.a(pi5Var, j);
    }

    @NotNull
    public static final <T> pi5<T> a1(@NotNull pi5<? extends T>... pi5VarArr) {
        return dj5.m(pi5VarArr);
    }

    @NotNull
    public static final <T, R> pi5<R> a2(@NotNull pi5<? extends T> pi5Var, @on4 @NotNull k05<? super qi5<? super R>, ? super T, ? super uv4<? super yq4>, ? extends Object> k05Var) {
        return aj5.g(pi5Var, k05Var);
    }

    @NotNull
    public static final <T> pi5<T> b(@NotNull Iterator<? extends T> it) {
        return si5.b(it);
    }

    @ud5
    @gp4
    @NotNull
    public static final <T> pi5<T> b0(@NotNull pi5<? extends T> pi5Var, @NotNull f05<? super T, Long> f05Var) {
        return yi5.b(pi5Var, f05Var);
    }

    @NotNull
    public static final Void b1() {
        return ej5.p();
    }

    @td5
    @NotNull
    public static final <T, R> pi5<R> b2(@NotNull pi5<? extends T> pi5Var, @on4 @NotNull k05<? super qi5<? super R>, ? super T, ? super uv4<? super yq4>, ? extends Object> k05Var) {
        return dj5.n(pi5Var, k05Var);
    }

    @ud5
    @NotNull
    public static final <T> pi5<T> c(@NotNull uz4<? extends T> uz4Var) {
        return si5.c(uz4Var);
    }

    @ud5
    @NotNull
    public static final <T> pi5<T> c0(@NotNull pi5<? extends T> pi5Var, long j) {
        return yi5.c(pi5Var, j);
    }

    @xn4(level = zn4.ERROR, message = "Collect flow in the desired context instead")
    @NotNull
    public static final <T> pi5<T> c1(@NotNull pi5<? extends T> pi5Var, @NotNull xv4 xv4Var) {
        return ej5.q(pi5Var, xv4Var);
    }

    @NotNull
    public static final <T, R> pi5<R> c2(@NotNull pi5<? extends T> pi5Var, @on4 @NotNull k05<? super qi5<? super R>, ? super T, ? super uv4<? super Boolean>, ? extends Object> k05Var) {
        return cj5.i(pi5Var, k05Var);
    }

    @ud5
    @NotNull
    public static final <T> pi5<T> d(@NotNull f05<? super uv4<? super T>, ? extends Object> f05Var) {
        return si5.d(f05Var);
    }

    @ud5
    @NotNull
    @fz4(name = "debounceDuration")
    @gp4
    public static final <T> pi5<T> d0(@NotNull pi5<? extends T> pi5Var, @NotNull f05<? super T, o95> f05Var) {
        return yi5.d(pi5Var, f05Var);
    }

    @NotNull
    public static final <T> pi5<T> d1(@NotNull pi5<? extends T> pi5Var, @NotNull k05<? super qi5<? super T>, ? super Throwable, ? super uv4<? super yq4>, ? extends Object> k05Var) {
        return aj5.d(pi5Var, k05Var);
    }

    @np4
    @NotNull
    public static final <T, R> pi5<R> d2(@NotNull pi5<? extends T> pi5Var, @on4 @NotNull k05<? super qi5<? super R>, ? super T, ? super uv4<? super yq4>, ? extends Object> k05Var) {
        return aj5.h(pi5Var, k05Var);
    }

    @NotNull
    public static final pi5<Integer> e(@NotNull c55 c55Var) {
        return si5.e(c55Var);
    }

    @xn4(level = zn4.ERROR, message = "Use 'onEach { delay(timeMillis) }'", replaceWith = @op4(expression = "onEach { delay(timeMillis) }", imports = {}))
    @NotNull
    public static final <T> pi5<T> e0(@NotNull pi5<? extends T> pi5Var, long j) {
        return ej5.j(pi5Var, j);
    }

    @NotNull
    public static final <T> pi5<T> e1(@NotNull pi5<? extends T> pi5Var, @NotNull j05<? super T, ? super uv4<? super yq4>, ? extends Object> j05Var) {
        return hj5.g(pi5Var, j05Var);
    }

    @NotNull
    public static final <T> pi5<ct4<T>> e2(@NotNull pi5<? extends T> pi5Var) {
        return hj5.k(pi5Var);
    }

    @NotNull
    public static final pi5<Long> f(@NotNull f55 f55Var) {
        return si5.f(f55Var);
    }

    @xn4(level = zn4.ERROR, message = "Use 'onStart { delay(timeMillis) }'", replaceWith = @op4(expression = "onStart { delay(timeMillis) }", imports = {}))
    @NotNull
    public static final <T> pi5<T> f0(@NotNull pi5<? extends T> pi5Var, long j) {
        return ej5.k(pi5Var, j);
    }

    @NotNull
    public static final <T> pi5<T> f1(@NotNull pi5<? extends T> pi5Var, @NotNull j05<? super qi5<? super T>, ? super uv4<? super yq4>, ? extends Object> j05Var) {
        return aj5.e(pi5Var, j05Var);
    }

    @NotNull
    public static final <T1, T2, R> pi5<R> f2(@NotNull pi5<? extends T1> pi5Var, @NotNull pi5<? extends T2> pi5Var2, @NotNull k05<? super T1, ? super T2, ? super uv4<? super R>, ? extends Object> k05Var) {
        return ij5.s(pi5Var, pi5Var2, k05Var);
    }

    @NotNull
    public static final <T> pi5<T> g(@NotNull g75<? extends T> g75Var) {
        return si5.g(g75Var);
    }

    @NotNull
    public static final <T> pi5<T> g0(@NotNull pi5<? extends T> pi5Var) {
        return zi5.a(pi5Var);
    }

    @xn4(level = zn4.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @op4(expression = "catch { emitAll(fallback) }", imports = {}))
    @NotNull
    public static final <T> pi5<T> g1(@NotNull pi5<? extends T> pi5Var, @NotNull pi5<? extends T> pi5Var2) {
        return ej5.r(pi5Var, pi5Var2);
    }

    @xn4(level = zn4.WARNING, message = "'BroadcastChannel' is obsolete and all corresponding operators are deprecated in the favour of StateFlow and SharedFlow")
    @NotNull
    public static final <T> pi5<T> h(@NotNull jg5<T> jg5Var) {
        return ti5.b(jg5Var);
    }

    @NotNull
    public static final <T> pi5<T> h0(@NotNull pi5<? extends T> pi5Var, @NotNull j05<? super T, ? super T, Boolean> j05Var) {
        return zi5.b(pi5Var, j05Var);
    }

    @xn4(level = zn4.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @op4(expression = "catch { emitAll(fallback) }", imports = {}))
    @NotNull
    public static final <T> pi5<T> h1(@NotNull pi5<? extends T> pi5Var, @NotNull pi5<? extends T> pi5Var2) {
        return ej5.s(pi5Var, pi5Var2);
    }

    @NotNull
    public static final pi5<Integer> i(@NotNull int[] iArr) {
        return si5.h(iArr);
    }

    @NotNull
    public static final <T, K> pi5<T> i0(@NotNull pi5<? extends T> pi5Var, @NotNull f05<? super T, ? extends K> f05Var) {
        return zi5.c(pi5Var, f05Var);
    }

    @xn4(level = zn4.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emit(fallback) }'", replaceWith = @op4(expression = "catch { emit(fallback) }", imports = {}))
    @NotNull
    public static final <T> pi5<T> i1(@NotNull pi5<? extends T> pi5Var, T t) {
        return ej5.t(pi5Var, t);
    }

    @NotNull
    public static final pi5<Long> j(@NotNull long[] jArr) {
        return si5.i(jArr);
    }

    @NotNull
    public static final <T> pi5<T> j0(@NotNull pi5<? extends T> pi5Var, int i) {
        return cj5.d(pi5Var, i);
    }

    @xn4(level = zn4.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { e -> if (predicate(e)) emit(fallback) else throw e }'", replaceWith = @op4(expression = "catch { e -> if (predicate(e)) emit(fallback) else throw e }", imports = {}))
    @NotNull
    public static final <T> pi5<T> j1(@NotNull pi5<? extends T> pi5Var, T t, @NotNull f05<? super Throwable, Boolean> f05Var) {
        return ej5.u(pi5Var, t, f05Var);
    }

    @NotNull
    public static final <T> pi5<T> k(@NotNull T[] tArr) {
        return si5.j(tArr);
    }

    @NotNull
    public static final <T> pi5<T> k0(@NotNull pi5<? extends T> pi5Var, @NotNull j05<? super T, ? super uv4<? super Boolean>, ? extends Object> j05Var) {
        return cj5.e(pi5Var, j05Var);
    }

    @NotNull
    public static final <T> pj5<T> l(@NotNull kj5<T> kj5Var) {
        return gj5.a(kj5Var);
    }

    @Nullable
    public static final <T> Object l0(@NotNull qi5<? super T> qi5Var, @NotNull jh5<? extends T> jh5Var, @NotNull uv4<? super yq4> uv4Var) {
        return ti5.d(qi5Var, jh5Var, uv4Var);
    }

    @NotNull
    public static final <T> pi5<T> l1(@NotNull pi5<? extends T> pi5Var, @NotNull j05<? super qi5<? super T>, ? super uv4<? super yq4>, ? extends Object> j05Var) {
        return aj5.f(pi5Var, j05Var);
    }

    @NotNull
    public static final <T> ak5<T> m(@NotNull lj5<T> lj5Var) {
        return gj5.b(lj5Var);
    }

    @Nullable
    public static final <T> Object m0(@NotNull qi5<? super T> qi5Var, @NotNull pi5<? extends T> pi5Var, @NotNull uv4<? super yq4> uv4Var) {
        return ui5.g(qi5Var, pi5Var, uv4Var);
    }

    @NotNull
    public static final <T> pj5<T> m1(@NotNull pj5<? extends T> pj5Var, @NotNull j05<? super qi5<? super T>, ? super uv4<? super yq4>, ? extends Object> j05Var) {
        return gj5.f(pj5Var, j05Var);
    }

    @NotNull
    public static final <T> pi5<T> n0() {
        return si5.m();
    }

    @ud5
    @NotNull
    public static final <T> jh5<T> n1(@NotNull pi5<? extends T> pi5Var, @NotNull lc5 lc5Var) {
        return ti5.f(pi5Var, lc5Var);
    }

    @NotNull
    public static final <T> pi5<T> o(@NotNull pi5<? extends T> pi5Var, int i, @NotNull ng5 ng5Var) {
        return wi5.b(pi5Var, i, ng5Var);
    }

    public static final void o0(@NotNull qi5<?> qi5Var) {
        aj5.b(qi5Var);
    }

    @xn4(level = zn4.ERROR, message = "Flow analogue of 'publish()' is 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @op4(expression = "this.shareIn(scope, 0)", imports = {}))
    @NotNull
    public static final <T> pi5<T> o1(@NotNull pi5<? extends T> pi5Var) {
        return ej5.w(pi5Var);
    }

    @NotNull
    public static final <T> pi5<T> p0(@NotNull pi5<? extends T> pi5Var, @NotNull j05<? super T, ? super uv4<? super Boolean>, ? extends Object> j05Var) {
        return hj5.a(pi5Var, j05Var);
    }

    @xn4(level = zn4.ERROR, message = "Flow analogue of 'publish(bufferSize)' is 'buffer' followed by 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @op4(expression = "this.buffer(bufferSize).shareIn(scope, 0)", imports = {}))
    @NotNull
    public static final <T> pi5<T> p1(@NotNull pi5<? extends T> pi5Var, int i) {
        return ej5.x(pi5Var, i);
    }

    @xn4(level = zn4.ERROR, message = "Collect flow in the desired context instead")
    @NotNull
    public static final <T> pi5<T> q1(@NotNull pi5<? extends T> pi5Var, @NotNull xv4 xv4Var) {
        return ej5.y(pi5Var, xv4Var);
    }

    @xn4(level = zn4.ERROR, message = "Flow analogue of 'cache()' is 'shareIn' with unlimited replay and 'started = SharingStared.Lazily' argument'", replaceWith = @op4(expression = "this.shareIn(scope, Int.MAX_VALUE, started = SharingStared.Lazily)", imports = {}))
    @NotNull
    public static final <T> pi5<T> r(@NotNull pi5<? extends T> pi5Var) {
        return ej5.a(pi5Var);
    }

    @NotNull
    public static final <T> pi5<T> r0(@NotNull pi5<? extends T> pi5Var, @NotNull j05<? super T, ? super uv4<? super Boolean>, ? extends Object> j05Var) {
        return hj5.c(pi5Var, j05Var);
    }

    @NotNull
    public static final <T> pi5<T> r1(@NotNull jh5<? extends T> jh5Var) {
        return ti5.g(jh5Var);
    }

    @NotNull
    public static final <T> pi5<T> s(@on4 @NotNull j05<? super hh5<? super T>, ? super uv4<? super yq4>, ? extends Object> j05Var) {
        return si5.k(j05Var);
    }

    @NotNull
    public static final <T> pi5<T> s0(@NotNull pi5<? extends T> pi5Var) {
        return hj5.d(pi5Var);
    }

    @Nullable
    public static final <S, T extends S> Object s1(@NotNull pi5<? extends T> pi5Var, @NotNull k05<? super S, ? super T, ? super uv4<? super S>, ? extends Object> k05Var, @NotNull uv4<? super S> uv4Var) {
        return fj5.i(pi5Var, k05Var, uv4Var);
    }

    @NotNull
    public static final <T> pi5<T> t(@NotNull pi5<? extends T> pi5Var) {
        return wi5.e(pi5Var);
    }

    @Nullable
    public static final <T> Object t0(@NotNull pi5<? extends T> pi5Var, @NotNull uv4<? super T> uv4Var) {
        return fj5.a(pi5Var, uv4Var);
    }

    @xn4(level = zn4.ERROR, message = "Flow analogue of 'replay()' is 'shareIn' with unlimited replay. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @op4(expression = "this.shareIn(scope, Int.MAX_VALUE)", imports = {}))
    @NotNull
    public static final <T> pi5<T> t1(@NotNull pi5<? extends T> pi5Var) {
        return ej5.z(pi5Var);
    }

    @NotNull
    public static final <T> pi5<T> u(@NotNull pi5<? extends T> pi5Var, @NotNull k05<? super qi5<? super T>, ? super Throwable, ? super uv4<? super yq4>, ? extends Object> k05Var) {
        return bj5.a(pi5Var, k05Var);
    }

    @Nullable
    public static final <T> Object u0(@NotNull pi5<? extends T> pi5Var, @NotNull j05<? super T, ? super uv4<? super Boolean>, ? extends Object> j05Var, @NotNull uv4<? super T> uv4Var) {
        return fj5.b(pi5Var, j05Var, uv4Var);
    }

    @xn4(level = zn4.ERROR, message = "Flow analogue of 'replay(bufferSize)' is 'shareIn' with the specified replay parameter. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @op4(expression = "this.shareIn(scope, bufferSize)", imports = {}))
    @NotNull
    public static final <T> pi5<T> u1(@NotNull pi5<? extends T> pi5Var, int i) {
        return ej5.A(pi5Var, i);
    }

    @Nullable
    public static final <T> Object v(@NotNull pi5<? extends T> pi5Var, @NotNull qi5<? super T> qi5Var, @NotNull uv4<? super Throwable> uv4Var) {
        return bj5.b(pi5Var, qi5Var, uv4Var);
    }

    @Nullable
    public static final <T> Object v0(@NotNull pi5<? extends T> pi5Var, @NotNull uv4<? super T> uv4Var) {
        return fj5.c(pi5Var, uv4Var);
    }

    @NotNull
    public static final <T> pi5<T> v1(@NotNull pi5<? extends T> pi5Var, long j, @NotNull j05<? super Throwable, ? super uv4<? super Boolean>, ? extends Object> j05Var) {
        return bj5.e(pi5Var, j, j05Var);
    }

    @NotNull
    public static final <T> pi5<T> w(@on4 @NotNull j05<? super hh5<? super T>, ? super uv4<? super yq4>, ? extends Object> j05Var) {
        return si5.l(j05Var);
    }

    @Nullable
    public static final <T> Object w0(@NotNull pi5<? extends T> pi5Var, @NotNull j05<? super T, ? super uv4<? super Boolean>, ? extends Object> j05Var, @NotNull uv4<? super T> uv4Var) {
        return fj5.d(pi5Var, j05Var, uv4Var);
    }

    @Nullable
    public static final Object x(@NotNull pi5<?> pi5Var, @NotNull uv4<? super yq4> uv4Var) {
        return ui5.a(pi5Var, uv4Var);
    }

    @NotNull
    public static final jh5<yq4> x0(@NotNull lc5 lc5Var, long j, long j2) {
        return yi5.f(lc5Var, j, j2);
    }

    @NotNull
    public static final <T> pi5<T> x1(@NotNull pi5<? extends T> pi5Var, @NotNull l05<? super qi5<? super T>, ? super Throwable, ? super Long, ? super uv4<? super Boolean>, ? extends Object> l05Var) {
        return bj5.g(pi5Var, l05Var);
    }

    @NotNull
    public static final <T, R> pi5<R> y1(@NotNull pi5<? extends T> pi5Var, R r, @on4 @NotNull k05<? super R, ? super T, ? super uv4<? super R>, ? extends Object> k05Var) {
        return hj5.h(pi5Var, r, k05Var);
    }

    @Nullable
    public static final <T> Object z(@NotNull pi5<? extends T> pi5Var, @NotNull k05<? super Integer, ? super T, ? super uv4<? super yq4>, ? extends Object> k05Var, @NotNull uv4<? super yq4> uv4Var) {
        return ui5.d(pi5Var, k05Var, uv4Var);
    }

    @xn4(level = zn4.ERROR, message = "Flow analogue is 'flatMapConcat'", replaceWith = @op4(expression = "flatMapConcat(mapper)", imports = {}))
    @NotNull
    public static final <T, R> pi5<R> z0(@NotNull pi5<? extends T> pi5Var, @NotNull j05<? super T, ? super uv4<? super pi5<? extends R>>, ? extends Object> j05Var) {
        return ej5.l(pi5Var, j05Var);
    }

    @NotNull
    public static final <T> pi5<T> z1(@NotNull pi5<? extends T> pi5Var, @NotNull k05<? super T, ? super T, ? super uv4<? super T>, ? extends Object> k05Var) {
        return hj5.i(pi5Var, k05Var);
    }
}