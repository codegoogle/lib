package com.p7700g.p99005;

import com.p7700g.p99005.m00;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/* compiled from: InitializerViewModelFactory.kt */
@vo4(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J7\u0010\u0006\u001a\u00020\u0007\"\b\b\u0000\u0010\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000b2\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u0002H\b0\r¢\u0006\u0002\b\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011R\u0018\u0010\u0003\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;", "", "()V", "initializers", "", "Landroidx/lifecycle/viewmodel/ViewModelInitializer;", "addInitializer", "", "T", "Landroidx/lifecycle/ViewModel;", "clazz", "Lkotlin/reflect/KClass;", "initializer", "Lkotlin/Function1;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "Lkotlin/ExtensionFunctionType;", "build", "Landroidx/lifecycle/ViewModelProvider$Factory;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@f10
/* loaded from: classes.dex */
public final class b10 {
    @NotNull
    private final List<g10<?>> a = new ArrayList();

    public final <T extends k00> void a(@NotNull u55<T> u55Var, @NotNull f05<? super z00, ? extends T> f05Var) {
        c25.p(u55Var, "clazz");
        c25.p(f05Var, "initializer");
        this.a.add(new g10<>(yy4.e(u55Var), f05Var));
    }

    @NotNull
    public final m00.b b() {
        Object[] array = this.a.toArray(new g10[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        g10[] g10VarArr = (g10[]) array;
        return new a10((g10[]) Arrays.copyOf(g10VarArr, g10VarArr.length));
    }
}