package com.p7700g.p99005;

import com.p7700g.p99005.rs2;
import java.util.HashSet;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* compiled from: Sequences.kt */
@vo4(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010\f\u001a\u00020\rH\u0014R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00028\u00010\nj\b\u0012\u0004\u0012\u00028\u0001`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlin/sequences/DistinctIterator;", "T", "K", "Lkotlin/collections/AbstractIterator;", rs2.f.b, "", "keySelector", "Lkotlin/Function1;", "(Ljava/util/Iterator;Lkotlin/jvm/functions/Function1;)V", "observed", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "computeNext", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class v65<T, K> extends mr4<T> {
    @NotNull
    private final Iterator<T> u;
    @NotNull
    private final f05<T, K> v;
    @NotNull
    private final HashSet<K> w;

    /* JADX WARN: Multi-variable type inference failed */
    public v65(@NotNull Iterator<? extends T> it, @NotNull f05<? super T, ? extends K> f05Var) {
        c25.p(it, rs2.f.b);
        c25.p(f05Var, "keySelector");
        this.u = it;
        this.v = f05Var;
        this.w = new HashSet<>();
    }

    @Override // com.p7700g.p99005.mr4
    public void a() {
        while (this.u.hasNext()) {
            T next = this.u.next();
            if (this.w.add(this.v.M(next))) {
                c(next);
                return;
            }
        }
        b();
    }
}