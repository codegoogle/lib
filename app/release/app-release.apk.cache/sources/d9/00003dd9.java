package com.p7700g.p99005;

import com.p7700g.p99005.z00;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CreationExtras.kt */
@vo4(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J$\u0010\u0004\u001a\u0004\u0018\u0001H\u0005\"\u0004\b\u0000\u0010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0007H\u0096\u0002¢\u0006\u0002\u0010\bJ*\u0010\t\u001a\u00020\n\"\u0004\b\u0000\u0010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u00072\u0006\u0010\u000b\u001a\u0002H\u0005H\u0086\u0002¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Landroidx/lifecycle/viewmodel/MutableCreationExtras;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "initialExtras", "(Landroidx/lifecycle/viewmodel/CreationExtras;)V", "get", "T", "key", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "(Landroidx/lifecycle/viewmodel/CreationExtras$Key;)Ljava/lang/Object;", la1.a, "", "t", "(Landroidx/lifecycle/viewmodel/CreationExtras$Key;Ljava/lang/Object;)V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d10 extends z00 {
    public d10() {
        this(null, 1, null);
    }

    public d10(@NotNull z00 z00Var) {
        c25.p(z00Var, "initialExtras");
        b().putAll(z00Var.b());
    }

    @Override // com.p7700g.p99005.z00
    @Nullable
    public <T> T a(@NotNull z00.b<T> bVar) {
        c25.p(bVar, "key");
        return (T) b().get(bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void c(@NotNull z00.b<T> bVar, T t) {
        c25.p(bVar, "key");
        b().put(bVar, t);
    }

    public /* synthetic */ d10(z00 z00Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? z00.a.b : z00Var);
    }
}