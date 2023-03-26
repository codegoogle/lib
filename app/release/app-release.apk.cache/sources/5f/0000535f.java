package com.p7700g.p99005;

import com.p7700g.p99005.z00;
import org.jetbrains.annotations.NotNull;

/* compiled from: ViewModelProvider.kt */
@fz4(name = "ViewModelProviderGetKt")
@vo4(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u001e\u0010\u0004\u001a\u0002H\u0005\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u0006*\u00020\u0007H\u0087\b¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"defaultCreationExtras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "owner", "Landroidx/lifecycle/ViewModelStoreOwner;", "get", "VM", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/ViewModelProvider;", "(Landroidx/lifecycle/ViewModelProvider;)Landroidx/lifecycle/ViewModel;", "lifecycle-viewmodel_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class o00 {
    @NotNull
    public static final z00 a(@NotNull q00 q00Var) {
        c25.p(q00Var, "owner");
        if (q00Var instanceof lz) {
            z00 j = ((lz) q00Var).j();
            c25.o(j, "{\n        owner.defaultV…ModelCreationExtras\n    }");
            return j;
        }
        return z00.a.b;
    }

    @u1
    public static final /* synthetic */ <VM extends k00> VM b(m00 m00Var) {
        c25.p(m00Var, "<this>");
        c25.y(4, "VM");
        return (VM) m00Var.a(k00.class);
    }
}