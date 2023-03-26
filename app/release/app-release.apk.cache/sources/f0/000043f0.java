package com.p7700g.p99005;

import android.os.Bundle;
import androidx.savedstate.Recreator;
import com.p7700g.p99005.mz;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SavedStateRegistryController.kt */
@vo4(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0007J\u0012\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0007R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Landroidx/savedstate/SavedStateRegistryController;", "", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "(Landroidx/savedstate/SavedStateRegistryOwner;)V", "attached", "", "savedStateRegistry", "Landroidx/savedstate/SavedStateRegistry;", "getSavedStateRegistry", "()Landroidx/savedstate/SavedStateRegistry;", "performAttach", "", "performRestore", "savedState", "Landroid/os/Bundle;", "performSave", "outBundle", "Companion", "savedstate_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g60 {
    @NotNull
    public static final a a = new a(null);
    @NotNull
    private final h60 b;
    @NotNull
    private final f60 c;
    private boolean d;

    /* compiled from: SavedStateRegistryController.kt */
    @vo4(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/savedstate/SavedStateRegistryController$Companion;", "", "()V", "create", "Landroidx/savedstate/SavedStateRegistryController;", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "savedstate_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @jz4
        @NotNull
        public final g60 a(@NotNull h60 h60Var) {
            c25.p(h60Var, "owner");
            return new g60(h60Var, null);
        }
    }

    private g60(h60 h60Var) {
        this.b = h60Var;
        this.c = new f60();
    }

    public /* synthetic */ g60(h60 h60Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(h60Var);
    }

    @jz4
    @NotNull
    public static final g60 a(@NotNull h60 h60Var) {
        return a.a(h60Var);
    }

    @NotNull
    public final f60 b() {
        return this.c;
    }

    @u1
    public final void c() {
        mz lifecycle = this.b.getLifecycle();
        c25.o(lifecycle, "owner.lifecycle");
        if (lifecycle.b() == mz.c.INITIALIZED) {
            lifecycle.a(new Recreator(this.b));
            this.c.g(lifecycle);
            this.d = true;
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
    }

    @u1
    public final void d(@Nullable Bundle bundle) {
        if (!this.d) {
            c();
        }
        mz lifecycle = this.b.getLifecycle();
        c25.o(lifecycle, "owner.lifecycle");
        if (!lifecycle.b().a(mz.c.STARTED)) {
            this.c.h(bundle);
            return;
        }
        StringBuilder G = wo1.G("performRestore cannot be called when owner is ");
        G.append(lifecycle.b());
        throw new IllegalStateException(G.toString().toString());
    }

    @u1
    public final void e(@NotNull Bundle bundle) {
        c25.p(bundle, "outBundle");
        this.c.i(bundle);
    }
}