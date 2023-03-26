package com.p7700g.p99005;

import com.anythink.core.api.ATAdConst;
import org.jetbrains.annotations.NotNull;

/* compiled from: PrimitiveSpreadBuilders.kt */
@vo4(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0002\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0004H\u0004J\u001d\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0000H\u0004¢\u0006\u0002\u0010\u0016J\u0011\u0010\u0017\u001a\u00020\u0004*\u00028\u0000H$¢\u0006\u0002\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u0004X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0005R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000bX\u0082\u0004¢\u0006\n\n\u0002\u0010\u000e\u0012\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lkotlin/jvm/internal/PrimitiveSpreadBuilder;", "T", "", ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, "", "(I)V", "position", "getPosition", "()I", "setPosition", "spreads", "", "getSpreads$annotations", "()V", "[Ljava/lang/Object;", "addSpread", "", "spreadArgument", "(Ljava/lang/Object;)V", "toArray", "values", "result", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "getSize", "(Ljava/lang/Object;)I", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public abstract class t25<T> {
    private final int a;
    private int b;
    @NotNull
    private final T[] c;

    public t25(int i) {
        this.a = i;
        this.c = (T[]) new Object[i];
    }

    private static /* synthetic */ void d() {
    }

    public final void a(@NotNull T t) {
        c25.p(t, "spreadArgument");
        T[] tArr = this.c;
        int i = this.b;
        this.b = i + 1;
        tArr[i] = t;
    }

    public final int b() {
        return this.b;
    }

    public abstract int c(@NotNull T t);

    public final void e(int i) {
        this.b = i;
    }

    public final int f() {
        int i = 0;
        ft4 it = new c55(0, this.a - 1).iterator();
        while (it.hasNext()) {
            T t = this.c[it.b()];
            i += t != null ? c(t) : 1;
        }
        return i;
    }

    @NotNull
    public final T g(@NotNull T t, @NotNull T t2) {
        c25.p(t, "values");
        c25.p(t2, "result");
        ft4 it = new c55(0, this.a - 1).iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            int b = it.b();
            T t3 = this.c[b];
            if (t3 != null) {
                if (i < b) {
                    int i3 = b - i;
                    System.arraycopy(t, i, t2, i2, i3);
                    i2 += i3;
                }
                int c = c(t3);
                System.arraycopy(t3, 0, t2, i2, c);
                i2 += c;
                i = b + 1;
            }
        }
        int i4 = this.a;
        if (i < i4) {
            System.arraycopy(t, i, t2, i2, i4 - i);
        }
        return t2;
    }
}