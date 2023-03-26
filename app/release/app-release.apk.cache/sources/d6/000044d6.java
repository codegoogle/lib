package com.p7700g.p99005;

import android.os.PersistableBundle;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* compiled from: PersistableBundle.kt */
@vo4(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0007\u001a=\u0010\u0000\u001a\u00020\u00012.\u0010\u0002\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00040\u0003\"\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0007¢\u0006\u0002\u0010\u0007\u001a\u001a\u0010\b\u001a\u00020\u0001*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\tH\u0007¨\u0006\n"}, d2 = {"persistableBundleOf", "Landroid/os/PersistableBundle;", "pairs", "", "Lkotlin/Pair;", "", "", "([Lkotlin/Pair;)Landroid/os/PersistableBundle;", "toPersistableBundle", "", "core-ktx_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class gn {
    @e2(21)
    @NotNull
    public static final PersistableBundle a() {
        return en.a(0);
    }

    @e2(21)
    @NotNull
    public static final PersistableBundle b(@NotNull hp4<String, ? extends Object>... hp4VarArr) {
        c25.p(hp4VarArr, "pairs");
        PersistableBundle a = en.a(hp4VarArr.length);
        for (hp4<String, ? extends Object> hp4Var : hp4VarArr) {
            en.b(a, hp4Var.f(), hp4Var.g());
        }
        return a;
    }

    @e2(21)
    @NotNull
    public static final PersistableBundle c(@NotNull Map<String, ? extends Object> map) {
        c25.p(map, "<this>");
        PersistableBundle a = en.a(map.size());
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            en.b(a, entry.getKey(), entry.getValue());
        }
        return a;
    }
}