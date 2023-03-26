package com.p7700g.p99005;

import com.p7700g.p99005.qm3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: IllegalBuildingException.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\b\u001a\u00020\u00038\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/p7700g/p99005/ey2;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "", "s", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", qm3.b.j, "<init>", "(Ljava/lang/String;)V", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class ey2 extends IllegalArgumentException {
    @NotNull
    private final String s;

    public ey2() {
        this(null, 1, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ey2(@NotNull String str) {
        super(str);
        c25.p(str, qm3.b.j);
        this.s = str;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return this.s;
    }

    public /* synthetic */ ey2(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "Not enough information to build the object" : str);
    }
}