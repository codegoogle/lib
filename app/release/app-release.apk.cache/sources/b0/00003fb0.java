package com.p7700g.p99005;

import android.os.Bundle;
import com.p7700g.p99005.f60;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SavedStateHandleSupport.kt */
@vo4(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0016\u001a\u00020\nH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Landroidx/lifecycle/SavedStateHandlesProvider;", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "savedStateRegistry", "Landroidx/savedstate/SavedStateRegistry;", "viewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "(Landroidx/savedstate/SavedStateRegistry;Landroidx/lifecycle/ViewModelStoreOwner;)V", "restored", "", "restoredState", "Landroid/os/Bundle;", "viewModel", "Landroidx/lifecycle/SavedStateHandlesVM;", "getViewModel", "()Landroidx/lifecycle/SavedStateHandlesVM;", "viewModel$delegate", "Lkotlin/Lazy;", "consumeRestoredStateForKey", "key", "", "performRestore", "", "saveState", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e00 implements f60.c {
    @NotNull
    private final f60 a;
    private boolean b;
    @Nullable
    private Bundle c;
    @NotNull
    private final qo4 d;

    /* compiled from: SavedStateHandleSupport.kt */
    @vo4(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/lifecycle/SavedStateHandlesVM;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a extends e25 implements uz4<f00> {
        public final /* synthetic */ q00 t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q00 q00Var) {
            super(0);
            this.t = q00Var;
        }

        @Override // com.p7700g.p99005.uz4
        @NotNull
        /* renamed from: h */
        public final f00 x() {
            return d00.e(this.t);
        }
    }

    public e00(@NotNull f60 f60Var, @NotNull q00 q00Var) {
        c25.p(f60Var, "savedStateRegistry");
        c25.p(q00Var, "viewModelStoreOwner");
        this.a = f60Var;
        this.d = so4.c(new a(q00Var));
    }

    private final f00 c() {
        return (f00) this.d.getValue();
    }

    @Override // com.p7700g.p99005.f60.c
    @NotNull
    public Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry<String, c00> entry : c().g().entrySet()) {
            String key = entry.getKey();
            Bundle a2 = entry.getValue().o().a();
            if (!c25.g(a2, Bundle.EMPTY)) {
                bundle.putBundle(key, a2);
            }
        }
        this.b = false;
        return bundle;
    }

    @Nullable
    public final Bundle b(@NotNull String str) {
        c25.p(str, "key");
        d();
        Bundle bundle = this.c;
        Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
        Bundle bundle3 = this.c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.c;
        boolean z = true;
        if ((bundle4 == null || !bundle4.isEmpty()) ? false : false) {
            this.c = null;
        }
        return bundle2;
    }

    public final void d() {
        if (this.b) {
            return;
        }
        this.c = this.a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        this.b = true;
        c();
    }
}