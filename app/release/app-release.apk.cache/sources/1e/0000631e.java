package com.p7700g.p99005;

import com.p7700g.p99005.rs2;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* compiled from: Sequences.kt */
@vo4(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0096\u0002R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lkotlin/sequences/DistinctSequence;", "T", "K", "Lkotlin/sequences/Sequence;", rs2.f.b, "keySelector", "Lkotlin/Function1;", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)V", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class w65<T, K> implements g75<T> {
    @NotNull
    private final g75<T> a;
    @NotNull
    private final f05<T, K> b;

    /* JADX WARN: Multi-variable type inference failed */
    public w65(@NotNull g75<? extends T> g75Var, @NotNull f05<? super T, ? extends K> f05Var) {
        c25.p(g75Var, rs2.f.b);
        c25.p(f05Var, "keySelector");
        this.a = g75Var;
        this.b = f05Var;
    }

    @Override // com.p7700g.p99005.g75
    @NotNull
    public Iterator<T> iterator() {
        return new v65(this.a.iterator(), this.b);
    }
}