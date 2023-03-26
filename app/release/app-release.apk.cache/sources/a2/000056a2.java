package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: OSOutcomeEventsFactory.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\nR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0013¨\u0006\u001b"}, d2 = {"Lcom/p7700g/p99005/po3;", "", "Lcom/p7700g/p99005/cp3;", "c", "()Lcom/p7700g/p99005/cp3;", "Lcom/p7700g/p99005/qo3;", "a", "()Lcom/p7700g/p99005/qo3;", "b", "Lcom/p7700g/p99005/no3;", "Lcom/p7700g/p99005/no3;", "outcomeEventsCache", "Lcom/p7700g/p99005/km3;", "d", "Lcom/p7700g/p99005/km3;", "apiClient", "Lcom/p7700g/p99005/tk3;", "Lcom/p7700g/p99005/tk3;", "logger", "Lcom/p7700g/p99005/cp3;", "repository", "Lcom/p7700g/p99005/pm3;", "dbHelper", "Lcom/p7700g/p99005/sl3;", "preferences", "<init>", "(Lcom/p7700g/p99005/tk3;Lcom/p7700g/p99005/km3;Lcom/p7700g/p99005/pm3;Lcom/p7700g/p99005/sl3;)V", "onesignal_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes3.dex */
public final class po3 {
    private final no3 a;
    private cp3 b;
    private final tk3 c;
    private final km3 d;

    public po3(@NotNull tk3 tk3Var, @NotNull km3 km3Var, @Nullable pm3 pm3Var, @Nullable sl3 sl3Var) {
        c25.p(tk3Var, "logger");
        c25.p(km3Var, "apiClient");
        this.c = tk3Var;
        this.d = km3Var;
        c25.m(pm3Var);
        c25.m(sl3Var);
        this.a = new no3(tk3Var, pm3Var, sl3Var);
    }

    private final qo3 a() {
        if (this.a.j()) {
            return new uo3(this.c, this.a, new vo3(this.d));
        }
        return new so3(this.c, this.a, new to3(this.d));
    }

    private final cp3 c() {
        if (!this.a.j()) {
            cp3 cp3Var = this.b;
            if (cp3Var instanceof so3) {
                c25.m(cp3Var);
                return cp3Var;
            }
        }
        if (this.a.j()) {
            cp3 cp3Var2 = this.b;
            if (cp3Var2 instanceof uo3) {
                c25.m(cp3Var2);
                return cp3Var2;
            }
        }
        return a();
    }

    @NotNull
    public final cp3 b() {
        return this.b != null ? c() : a();
    }
}