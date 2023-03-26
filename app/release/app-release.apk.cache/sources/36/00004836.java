package com.p7700g.p99005;

import com.p7700g.p99005.xv4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CoroutineContext.kt */
@vo4(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0018B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\t\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0002H\u0016J\b\u0010\u0016\u001a\u00020\u0002H\u0016J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/CoroutineId;", "Lkotlinx/coroutines/ThreadContextElement;", "", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "id", "", "(J)V", "getId", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "restoreThreadContext", "", "context", "Lkotlin/coroutines/CoroutineContext;", "oldState", "toString", "updateThreadContext", "Key", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
@IgnoreJRERequirement
/* loaded from: classes3.dex */
public final class ic5 extends rv4 implements jf5<String> {
    @NotNull
    public static final a s = new a(null);
    private final long t;

    /* compiled from: CoroutineContext.kt */
    @vo4(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineId$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlinx/coroutines/CoroutineId;", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements xv4.c<ic5> {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ic5(long j) {
        super(s);
        this.t = j;
    }

    public static /* synthetic */ ic5 w(ic5 ic5Var, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = ic5Var.t;
        }
        return ic5Var.v(j);
    }

    @Override // com.p7700g.p99005.jf5
    /* renamed from: F */
    public void j3(@NotNull xv4 xv4Var, @NotNull String str) {
        Thread.currentThread().setName(str);
    }

    @Override // com.p7700g.p99005.jf5
    @NotNull
    /* renamed from: K */
    public String p3(@NotNull xv4 xv4Var) {
        String z;
        kc5 kc5Var = (kc5) xv4Var.get(kc5.s);
        String str = "coroutine";
        if (kc5Var != null && (z = kc5Var.z()) != null) {
            str = z;
        }
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        int F3 = c95.F3(name, " @", 0, false, 6, null);
        if (F3 < 0) {
            F3 = name.length();
        }
        StringBuilder sb = new StringBuilder(str.length() + F3 + 10);
        String substring = name.substring(0, F3);
        c25.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        sb.append(substring);
        sb.append(" @");
        sb.append(str);
        sb.append('#');
        sb.append(z());
        String sb2 = sb.toString();
        c25.o(sb2, "StringBuilder(capacity).…builderAction).toString()");
        currentThread.setName(sb2);
        return name;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ic5) && this.t == ((ic5) obj).t;
    }

    public int hashCode() {
        return jc5.a(this.t);
    }

    public final long s() {
        return this.t;
    }

    @NotNull
    public String toString() {
        StringBuilder G = wo1.G("CoroutineId(");
        G.append(this.t);
        G.append(')');
        return G.toString();
    }

    @NotNull
    public final ic5 v(long j) {
        return new ic5(j);
    }

    public final long z() {
        return this.t;
    }
}