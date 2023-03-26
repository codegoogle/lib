package com.p7700g.p99005;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Observer;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UniqueObservable.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0003\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u001b\u0010\nJ\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\b\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\t\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\t\u0010\rJ\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R:\u0010\u001a\u001a&\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u00030\u0003 \u0018*\u0012\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00190\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/p7700g/p99005/mz2;", "T", "Lcom/p7700g/p99005/lz2;", "Ljava/util/Observer;", ij3.b, "Lcom/p7700g/p99005/yq4;", "addObserver", "(Ljava/util/Observer;)V", "deleteObserver", "notifyObservers", "()V", "", "arg", "(Ljava/lang/Object;)V", "", "c", "()[Ljava/util/Observer;", "", "countObservers", "()I", "", "b", "Ljava/util/Set;", "observers", "kotlin.jvm.PlatformType", "", "syncObserver", "<init>", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public class mz2<T> extends lz2<T> {
    @NotNull
    private final Set<Observer> b;
    private final Set<Observer> c;

    public mz2() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.b = linkedHashSet;
        this.c = Collections.synchronizedSet(linkedHashSet);
    }

    @Override // com.p7700g.p99005.lz2, java.util.Observable
    public synchronized void addObserver(@Nullable Observer observer) {
        if (observer != null) {
            this.c.add(observer);
            xz2.c("UniqueObservable", c25.C("addObserver countObservers: ", Integer.valueOf(countObservers())));
        } else {
            throw new NullPointerException();
        }
    }

    @NotNull
    public final Observer[] c() {
        Set<Observer> set = this.c;
        c25.o(set, "syncObserver");
        Object[] array = set.toArray(new Observer[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (Observer[]) array;
    }

    @Override // java.util.Observable
    public int countObservers() {
        Set<Observer> set = this.c;
        c25.o(set, "syncObserver");
        return set.size();
    }

    @Override // java.util.Observable
    public synchronized void deleteObserver(@Nullable Observer observer) {
        if (observer != null) {
            this.c.remove(observer);
        }
        xz2.c("UniqueObservable", c25.C("deleteObserver countObservers: ", Integer.valueOf(countObservers())));
    }

    @Override // com.p7700g.p99005.lz2, java.util.Observable
    public void notifyObservers() {
        setChanged();
        notifyObservers(a());
        xz2.c("UniqueObservable", c25.C("notifyObservers countObservers: ", Integer.valueOf(countObservers())));
    }

    @Override // java.util.Observable
    public void notifyObservers(@Nullable Object obj) {
        synchronized (this) {
            if (!hasChanged()) {
                return;
            }
            Set<Observer> set = this.c;
            c25.o(set, "syncObserver");
            Object[] array = set.toArray(new Observer[0]);
            if (array != null) {
                clearChanged();
                yq4 yq4Var = yq4.a;
                int length = array.length - 1;
                if (length < 0) {
                    return;
                }
                while (true) {
                    int i = length - 1;
                    ((Observer[]) array)[length].update(this, obj);
                    if (i < 0) {
                        return;
                    }
                    length = i;
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }
    }
}