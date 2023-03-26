package com.p7700g.p99005;

import java.util.Observable;
import java.util.Observer;
import org.jetbrains.annotations.Nullable;

/* compiled from: Observable.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0010\u0010\u0005J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR$\u0010\u000f\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/p7700g/p99005/lz2;", "T", "Ljava/util/Observable;", "Lcom/p7700g/p99005/yq4;", "notifyObservers", "()V", "Ljava/util/Observer;", ij3.b, "addObserver", "(Ljava/util/Observer;)V", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "b", "(Ljava/lang/Object;)V", "data", "<init>", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public class lz2<T> extends Observable {
    @Nullable
    private T a;

    @Nullable
    public final T a() {
        return this.a;
    }

    @Override // java.util.Observable
    public void addObserver(@Nullable Observer observer) {
        super.deleteObserver(observer);
        super.addObserver(observer);
    }

    public final void b(@Nullable T t) {
        this.a = t;
    }

    @Override // java.util.Observable
    public void notifyObservers() {
        setChanged();
        notifyObservers(this.a);
    }
}