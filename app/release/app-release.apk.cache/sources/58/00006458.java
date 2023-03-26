package com.p7700g.p99005;

import java.util.Comparator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Comparisons.kt */
@vo4(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a>\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u00022\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005H\u0087\bø\u0001\u0000\u001aY\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u000226\u0010\u0007\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u00050\b\"\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005¢\u0006\u0002\u0010\t\u001aZ\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n2\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\n0\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\n`\u00032\u0014\b\u0004\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\n0\u0005H\u0087\bø\u0001\u0000\u001a>\u0010\f\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u00022\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005H\u0087\bø\u0001\u0000\u001aZ\u0010\f\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n2\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\n0\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\n`\u00032\u0014\b\u0004\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\n0\u0005H\u0087\bø\u0001\u0000\u001a-\u0010\r\u001a\u00020\u000e\"\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00062\b\u0010\u000f\u001a\u0004\u0018\u0001H\u00022\b\u0010\u0010\u001a\u0004\u0018\u0001H\u0002¢\u0006\u0002\u0010\u0011\u001aA\u0010\u0012\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u000f\u001a\u0002H\u00022\u0006\u0010\u0010\u001a\u0002H\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0013\u001aY\u0010\u0012\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u000f\u001a\u0002H\u00022\u0006\u0010\u0010\u001a\u0002H\u000226\u0010\u0007\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u00050\b\"\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005¢\u0006\u0002\u0010\u0014\u001a]\u0010\u0012\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n2\u0006\u0010\u000f\u001a\u0002H\u00022\u0006\u0010\u0010\u001a\u0002H\u00022\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\n0\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\n`\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\n0\u0005H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0015\u001aG\u0010\u0016\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u000f\u001a\u0002H\u00022\u0006\u0010\u0010\u001a\u0002H\u00022 \u0010\u0007\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u00050\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0014\u001a&\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0006\u001a-\u0010\u0019\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001j\n\u0012\u0006\u0012\u0004\u0018\u0001H\u0002`\u0003\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u0087\b\u001a@\u0010\u0019\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001j\n\u0012\u0006\u0012\u0004\u0018\u0001H\u0002`\u0003\"\b\b\u0000\u0010\u0002*\u00020\u001a2\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\u0002`\u0003\u001a-\u0010\u001b\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001j\n\u0012\u0006\u0012\u0004\u0018\u0001H\u0002`\u0003\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u0087\b\u001a@\u0010\u001b\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001j\n\u0012\u0006\u0012\u0004\u0018\u0001H\u0002`\u0003\"\b\b\u0000\u0010\u0002*\u00020\u001a2\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\u0002`\u0003\u001a&\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0006\u001a0\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\u001aO\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u00032\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\u0002`\u0003H\u0086\u0004\u001aR\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u00032\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005H\u0087\bø\u0001\u0000\u001an\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u00032\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\n0\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\n`\u00032\u0014\b\u0004\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\n0\u0005H\u0087\bø\u0001\u0000\u001aR\u0010 \u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u00032\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005H\u0087\bø\u0001\u0000\u001an\u0010 \u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u00032\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\n0\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\n`\u00032\u0014\b\u0004\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\n0\u0005H\u0087\bø\u0001\u0000\u001ap\u0010!\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u000328\b\u0004\u0010\"\u001a2\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u000e0#H\u0087\bø\u0001\u0000\u001aO\u0010&\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u00032\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\u0002`\u0003H\u0086\u0004\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006'"}, d2 = {"compareBy", "Ljava/util/Comparator;", "T", "Lkotlin/Comparator;", "selector", "Lkotlin/Function1;", "", "selectors", "", "([Lkotlin/jvm/functions/Function1;)Ljava/util/Comparator;", "K", "comparator", "compareByDescending", "compareValues", "", "a", "b", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)I", "compareValuesBy", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)I", "(Ljava/lang/Object;Ljava/lang/Object;[Lkotlin/jvm/functions/Function1;)I", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;Lkotlin/jvm/functions/Function1;)I", "compareValuesByImpl", "compareValuesByImpl$ComparisonsKt__ComparisonsKt", "naturalOrder", "nullsFirst", "", "nullsLast", "reverseOrder", "reversed", "then", "thenBy", "thenByDescending", "thenComparator", "comparison", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "thenDescending", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/comparisons/ComparisonsKt")
/* loaded from: classes3.dex */
public class wu4 {

    /* compiled from: Comparisons.kt */
    @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a<T> implements Comparator {
        public final /* synthetic */ f05<T, Comparable<?>>[] s;

        /* JADX WARN: Multi-variable type inference failed */
        public a(f05<? super T, ? extends Comparable<?>>[] f05VarArr) {
            this.s = f05VarArr;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return wu4.k(t, t2, this.s);
        }
    }

    /* compiled from: Comparisons.kt */
    @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, k = 3, mv = {1, 7, 1}, xi = 176)
    /* loaded from: classes3.dex */
    public static final class b<T> implements Comparator {
        public final /* synthetic */ f05<T, Comparable<?>> s;

        /* JADX WARN: Multi-variable type inference failed */
        public b(f05<? super T, ? extends Comparable<?>> f05Var) {
            this.s = f05Var;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            f05<T, Comparable<?>> f05Var = this.s;
            return wu4.g(f05Var.M(t), f05Var.M(t2));
        }
    }

    /* compiled from: Comparisons.kt */
    @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u000e\u0010\u0004\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "T", "K", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, k = 3, mv = {1, 7, 1}, xi = 176)
    /* loaded from: classes3.dex */
    public static final class c<T> implements Comparator {
        public final /* synthetic */ Comparator<? super K> s;
        public final /* synthetic */ f05<T, K> t;

        /* JADX WARN: Multi-variable type inference failed */
        public c(Comparator<? super K> comparator, f05<? super T, ? extends K> f05Var) {
            this.s = comparator;
            this.t = f05Var;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Comparator<? super K> comparator = this.s;
            f05<T, K> f05Var = this.t;
            return comparator.compare(f05Var.M(t), f05Var.M(t2));
        }
    }

    /* compiled from: Comparisons.kt */
    @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, k = 3, mv = {1, 7, 1}, xi = 176)
    /* loaded from: classes3.dex */
    public static final class d<T> implements Comparator {
        public final /* synthetic */ f05<T, Comparable<?>> s;

        /* JADX WARN: Multi-variable type inference failed */
        public d(f05<? super T, ? extends Comparable<?>> f05Var) {
            this.s = f05Var;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            f05<T, Comparable<?>> f05Var = this.s;
            return wu4.g(f05Var.M(t2), f05Var.M(t));
        }
    }

    /* compiled from: Comparisons.kt */
    @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u000e\u0010\u0004\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "T", "K", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, k = 3, mv = {1, 7, 1}, xi = 176)
    /* loaded from: classes3.dex */
    public static final class e<T> implements Comparator {
        public final /* synthetic */ Comparator<? super K> s;
        public final /* synthetic */ f05<T, K> t;

        /* JADX WARN: Multi-variable type inference failed */
        public e(Comparator<? super K> comparator, f05<? super T, ? extends K> f05Var) {
            this.s = comparator;
            this.t = f05Var;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Comparator<? super K> comparator = this.s;
            f05<T, K> f05Var = this.t;
            return comparator.compare(f05Var.M(t2), f05Var.M(t));
        }
    }

    /* compiled from: Comparisons.kt */
    @vo4(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u0001H\u00022\b\u0010\u0005\u001a\u0004\u0018\u0001H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "", "a", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class f<T> implements Comparator {
        public final /* synthetic */ Comparator<? super T> s;

        public f(Comparator<? super T> comparator) {
            this.s = comparator;
        }

        @Override // java.util.Comparator
        public final int compare(@Nullable T t, @Nullable T t2) {
            if (t == t2) {
                return 0;
            }
            if (t == null) {
                return -1;
            }
            if (t2 == null) {
                return 1;
            }
            return this.s.compare(t, t2);
        }
    }

    /* compiled from: Comparisons.kt */
    @vo4(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u0001H\u00022\b\u0010\u0005\u001a\u0004\u0018\u0001H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "", "a", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class g<T> implements Comparator {
        public final /* synthetic */ Comparator<? super T> s;

        public g(Comparator<? super T> comparator) {
            this.s = comparator;
        }

        @Override // java.util.Comparator
        public final int compare(@Nullable T t, @Nullable T t2) {
            if (t == t2) {
                return 0;
            }
            if (t == null) {
                return 1;
            }
            if (t2 == null) {
                return -1;
            }
            return this.s.compare(t, t2);
        }
    }

    /* compiled from: Comparisons.kt */
    @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class h<T> implements Comparator {
        public final /* synthetic */ Comparator<T> s;
        public final /* synthetic */ Comparator<? super T> t;

        public h(Comparator<T> comparator, Comparator<? super T> comparator2) {
            this.s = comparator;
            this.t = comparator2;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compare = this.s.compare(t, t2);
            return compare != 0 ? compare : this.t.compare(t, t2);
        }
    }

    /* compiled from: Comparisons.kt */
    @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, k = 3, mv = {1, 7, 1}, xi = 176)
    /* loaded from: classes3.dex */
    public static final class i<T> implements Comparator {
        public final /* synthetic */ Comparator<T> s;
        public final /* synthetic */ f05<T, Comparable<?>> t;

        /* JADX WARN: Multi-variable type inference failed */
        public i(Comparator<T> comparator, f05<? super T, ? extends Comparable<?>> f05Var) {
            this.s = comparator;
            this.t = f05Var;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compare = this.s.compare(t, t2);
            if (compare != 0) {
                return compare;
            }
            f05<T, Comparable<?>> f05Var = this.t;
            return wu4.g(f05Var.M(t), f05Var.M(t2));
        }
    }

    /* compiled from: Comparisons.kt */
    @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u000e\u0010\u0004\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "T", "K", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, k = 3, mv = {1, 7, 1}, xi = 176)
    /* loaded from: classes3.dex */
    public static final class j<T> implements Comparator {
        public final /* synthetic */ Comparator<T> s;
        public final /* synthetic */ Comparator<? super K> t;
        public final /* synthetic */ f05<T, K> u;

        /* JADX WARN: Multi-variable type inference failed */
        public j(Comparator<T> comparator, Comparator<? super K> comparator2, f05<? super T, ? extends K> f05Var) {
            this.s = comparator;
            this.t = comparator2;
            this.u = f05Var;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compare = this.s.compare(t, t2);
            if (compare != 0) {
                return compare;
            }
            Comparator<? super K> comparator = this.t;
            f05<T, K> f05Var = this.u;
            return comparator.compare(f05Var.M(t), f05Var.M(t2));
        }
    }

    /* compiled from: Comparisons.kt */
    @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, k = 3, mv = {1, 7, 1}, xi = 176)
    /* loaded from: classes3.dex */
    public static final class k<T> implements Comparator {
        public final /* synthetic */ Comparator<T> s;
        public final /* synthetic */ f05<T, Comparable<?>> t;

        /* JADX WARN: Multi-variable type inference failed */
        public k(Comparator<T> comparator, f05<? super T, ? extends Comparable<?>> f05Var) {
            this.s = comparator;
            this.t = f05Var;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compare = this.s.compare(t, t2);
            if (compare != 0) {
                return compare;
            }
            f05<T, Comparable<?>> f05Var = this.t;
            return wu4.g(f05Var.M(t2), f05Var.M(t));
        }
    }

    /* compiled from: Comparisons.kt */
    @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u000e\u0010\u0004\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "T", "K", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, k = 3, mv = {1, 7, 1}, xi = 176)
    /* loaded from: classes3.dex */
    public static final class l<T> implements Comparator {
        public final /* synthetic */ Comparator<T> s;
        public final /* synthetic */ Comparator<? super K> t;
        public final /* synthetic */ f05<T, K> u;

        /* JADX WARN: Multi-variable type inference failed */
        public l(Comparator<T> comparator, Comparator<? super K> comparator2, f05<? super T, ? extends K> f05Var) {
            this.s = comparator;
            this.t = comparator2;
            this.u = f05Var;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compare = this.s.compare(t, t2);
            if (compare != 0) {
                return compare;
            }
            Comparator<? super K> comparator = this.t;
            f05<T, K> f05Var = this.u;
            return comparator.compare(f05Var.M(t2), f05Var.M(t));
        }
    }

    /* compiled from: Comparisons.kt */
    @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, k = 3, mv = {1, 7, 1}, xi = 176)
    /* loaded from: classes3.dex */
    public static final class m<T> implements Comparator {
        public final /* synthetic */ Comparator<T> s;
        public final /* synthetic */ j05<T, T, Integer> t;

        /* JADX WARN: Multi-variable type inference failed */
        public m(Comparator<T> comparator, j05<? super T, ? super T, Integer> j05Var) {
            this.s = comparator;
            this.t = j05Var;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compare = this.s.compare(t, t2);
            return compare != 0 ? compare : this.t.w3(t, t2).intValue();
        }
    }

    /* compiled from: Comparisons.kt */
    @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class n<T> implements Comparator {
        public final /* synthetic */ Comparator<T> s;
        public final /* synthetic */ Comparator<? super T> t;

        public n(Comparator<T> comparator, Comparator<? super T> comparator2) {
            this.s = comparator;
            this.t = comparator2;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compare = this.s.compare(t, t2);
            return compare != 0 ? compare : this.t.compare(t2, t);
        }
    }

    @dx4
    private static final <T, K> Comparator<T> b(Comparator<? super K> comparator, f05<? super T, ? extends K> f05Var) {
        c25.p(comparator, "comparator");
        c25.p(f05Var, "selector");
        return new c(comparator, f05Var);
    }

    @dx4
    private static final <T> Comparator<T> c(f05<? super T, ? extends Comparable<?>> f05Var) {
        c25.p(f05Var, "selector");
        return new b(f05Var);
    }

    @NotNull
    public static final <T> Comparator<T> d(@NotNull f05<? super T, ? extends Comparable<?>>... f05VarArr) {
        c25.p(f05VarArr, "selectors");
        if (f05VarArr.length > 0) {
            return new a(f05VarArr);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @dx4
    private static final <T, K> Comparator<T> e(Comparator<? super K> comparator, f05<? super T, ? extends K> f05Var) {
        c25.p(comparator, "comparator");
        c25.p(f05Var, "selector");
        return new e(comparator, f05Var);
    }

    @dx4
    private static final <T> Comparator<T> f(f05<? super T, ? extends Comparable<?>> f05Var) {
        c25.p(f05Var, "selector");
        return new d(f05Var);
    }

    public static final <T extends Comparable<?>> int g(@Nullable T t, @Nullable T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }

    @dx4
    private static final <T, K> int h(T t, T t2, Comparator<? super K> comparator, f05<? super T, ? extends K> f05Var) {
        c25.p(comparator, "comparator");
        c25.p(f05Var, "selector");
        return comparator.compare((K) f05Var.M(t), (K) f05Var.M(t2));
    }

    @dx4
    private static final <T> int i(T t, T t2, f05<? super T, ? extends Comparable<?>> f05Var) {
        c25.p(f05Var, "selector");
        return g(f05Var.M(t), f05Var.M(t2));
    }

    public static final <T> int j(T t, T t2, @NotNull f05<? super T, ? extends Comparable<?>>... f05VarArr) {
        c25.p(f05VarArr, "selectors");
        if (f05VarArr.length > 0) {
            return k(t, t2, f05VarArr);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> int k(T t, T t2, f05<? super T, ? extends Comparable<?>>[] f05VarArr) {
        for (f05<? super T, ? extends Comparable<?>> f05Var : f05VarArr) {
            int g2 = g(f05Var.M(t), f05Var.M(t2));
            if (g2 != 0) {
                return g2;
            }
        }
        return 0;
    }

    @NotNull
    public static final <T extends Comparable<? super T>> Comparator<T> l() {
        zu4 zu4Var = zu4.s;
        c25.n(zu4Var, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder> }");
        return zu4Var;
    }

    @dx4
    private static final <T extends Comparable<? super T>> Comparator<T> m() {
        return n(l());
    }

    @NotNull
    public static final <T> Comparator<T> n(@NotNull Comparator<? super T> comparator) {
        c25.p(comparator, "comparator");
        return new f(comparator);
    }

    @dx4
    private static final <T extends Comparable<? super T>> Comparator<T> o() {
        return p(l());
    }

    @NotNull
    public static final <T> Comparator<T> p(@NotNull Comparator<? super T> comparator) {
        c25.p(comparator, "comparator");
        return new g(comparator);
    }

    @NotNull
    public static final <T extends Comparable<? super T>> Comparator<T> q() {
        av4 av4Var = av4.s;
        c25.n(av4Var, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder> }");
        return av4Var;
    }

    @NotNull
    public static final <T> Comparator<T> r(@NotNull Comparator<T> comparator) {
        c25.p(comparator, "<this>");
        if (comparator instanceof bv4) {
            return ((bv4) comparator).a();
        }
        Comparator<T> comparator2 = zu4.s;
        if (c25.g(comparator, comparator2)) {
            av4 av4Var = av4.s;
            c25.n(av4Var, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed> }");
            return av4Var;
        }
        if (c25.g(comparator, av4.s)) {
            c25.n(comparator2, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed> }");
        } else {
            comparator2 = new bv4<>(comparator);
        }
        return comparator2;
    }

    @NotNull
    public static final <T> Comparator<T> s(@NotNull Comparator<T> comparator, @NotNull Comparator<? super T> comparator2) {
        c25.p(comparator, "<this>");
        c25.p(comparator2, "comparator");
        return new h(comparator, comparator2);
    }

    @dx4
    private static final <T, K> Comparator<T> t(Comparator<T> comparator, Comparator<? super K> comparator2, f05<? super T, ? extends K> f05Var) {
        c25.p(comparator, "<this>");
        c25.p(comparator2, "comparator");
        c25.p(f05Var, "selector");
        return new j(comparator, comparator2, f05Var);
    }

    @dx4
    private static final <T> Comparator<T> u(Comparator<T> comparator, f05<? super T, ? extends Comparable<?>> f05Var) {
        c25.p(comparator, "<this>");
        c25.p(f05Var, "selector");
        return new i(comparator, f05Var);
    }

    @dx4
    private static final <T, K> Comparator<T> v(Comparator<T> comparator, Comparator<? super K> comparator2, f05<? super T, ? extends K> f05Var) {
        c25.p(comparator, "<this>");
        c25.p(comparator2, "comparator");
        c25.p(f05Var, "selector");
        return new l(comparator, comparator2, f05Var);
    }

    @dx4
    private static final <T> Comparator<T> w(Comparator<T> comparator, f05<? super T, ? extends Comparable<?>> f05Var) {
        c25.p(comparator, "<this>");
        c25.p(f05Var, "selector");
        return new k(comparator, f05Var);
    }

    @dx4
    private static final <T> Comparator<T> x(Comparator<T> comparator, j05<? super T, ? super T, Integer> j05Var) {
        c25.p(comparator, "<this>");
        c25.p(j05Var, "comparison");
        return new m(comparator, j05Var);
    }

    @NotNull
    public static final <T> Comparator<T> y(@NotNull Comparator<T> comparator, @NotNull Comparator<? super T> comparator2) {
        c25.p(comparator, "<this>");
        c25.p(comparator2, "comparator");
        return new n(comparator, comparator2);
    }
}