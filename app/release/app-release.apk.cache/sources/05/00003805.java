package com.p7700g.p99005;

import com.p7700g.p99005.m00;
import org.jetbrains.annotations.NotNull;

/* compiled from: InitializerViewModelFactory.kt */
@vo4(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u001a\u0010\u0002\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003\"\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0002\u0010\u0005J-\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016¢\u0006\u0002\u0010\u000eR\u001c\u0010\u0002\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/viewmodel/InitializerViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "initializers", "", "Landroidx/lifecycle/viewmodel/ViewModelInitializer;", "([Landroidx/lifecycle/viewmodel/ViewModelInitializer;)V", "[Landroidx/lifecycle/viewmodel/ViewModelInitializer;", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a10 implements m00.b {
    @NotNull
    private final g10<?>[] b;

    public a10(@NotNull g10<?>... g10VarArr) {
        c25.p(g10VarArr, "initializers");
        this.b = g10VarArr;
    }

    @Override // com.p7700g.p99005.m00.b
    public /* synthetic */ k00 a(Class cls) {
        return n00.a(this, cls);
    }

    @Override // com.p7700g.p99005.m00.b
    @NotNull
    public <T extends k00> T b(@NotNull Class<T> cls, @NotNull z00 z00Var) {
        g10<?>[] g10VarArr;
        c25.p(cls, "modelClass");
        c25.p(z00Var, "extras");
        T t = null;
        for (g10<?> g10Var : this.b) {
            if (c25.g(g10Var.a(), cls)) {
                Object M = g10Var.b().M(z00Var);
                t = M instanceof k00 ? (T) M : null;
            }
        }
        if (t != null) {
            return t;
        }
        StringBuilder G = wo1.G("No initializer set for given class ");
        G.append(cls.getName());
        throw new IllegalArgumentException(G.toString());
    }
}