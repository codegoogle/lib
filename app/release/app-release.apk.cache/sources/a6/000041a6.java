package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.savedstate.Recreator;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.p7700g.p99005.mz;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SavedStateRegistry.kt */
@vo4(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 )2\u00020\u0001:\u0003()*B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u0007H\u0007J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0015\u001a\u00020\u0007J\u0015\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0001¢\u0006\u0002\b\u001bJ\u0017\u0010\u001c\u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u0013H\u0001¢\u0006\u0002\b\u001eJ\u0010\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u0013H\u0007J\u0018\u0010!\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\bH\u0007J\u0018\u0010#\u001a\u00020\u00182\u000e\u0010$\u001a\n\u0012\u0006\b\u0001\u0012\u00020&0%H\u0007J\u0010\u0010'\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00048G@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Landroidx/savedstate/SavedStateRegistry;", "", "()V", "attached", "", "components", "Landroidx/arch/core/internal/SafeIterableMap;", "", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "isAllowingSavingState", "isAllowingSavingState$savedstate_release", "()Z", "setAllowingSavingState$savedstate_release", "(Z)V", "<set-?>", "isRestored", "recreatorProvider", "Landroidx/savedstate/Recreator$SavedStateProvider;", "restoredState", "Landroid/os/Bundle;", "consumeRestoredStateForKey", "key", "getSavedStateProvider", "performAttach", "", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "performAttach$savedstate_release", "performRestore", "savedState", "performRestore$savedstate_release", "performSave", "outBundle", "registerSavedStateProvider", IronSourceConstants.EVENTS_PROVIDER, "runOnNextRecreation", "clazz", "Ljava/lang/Class;", "Landroidx/savedstate/SavedStateRegistry$AutoRecreated;", "unregisterSavedStateProvider", "AutoRecreated", "Companion", "SavedStateProvider", "savedstate_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class f60 {
    @NotNull
    private static final b a = new b(null);
    @Deprecated
    @NotNull
    private static final String b = "androidx.lifecycle.BundlableSavedStateRegistry.key";
    private boolean d;
    @Nullable
    private Bundle e;
    private boolean f;
    @Nullable
    private Recreator.b g;
    @NotNull
    private final l5<String, c> c = new l5<>();
    private boolean h = true;

    /* compiled from: SavedStateRegistry.kt */
    @vo4(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Landroidx/savedstate/SavedStateRegistry$AutoRecreated;", "", "onRecreated", "", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "savedstate_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public interface a {
        void a(@NotNull h60 h60Var);
    }

    /* compiled from: SavedStateRegistry.kt */
    @vo4(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Landroidx/savedstate/SavedStateRegistry$Companion;", "", "()V", "SAVED_COMPONENTS_KEY", "", "savedstate_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: SavedStateRegistry.kt */
    @vo4(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "", "saveState", "Landroid/os/Bundle;", "savedstate_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public interface c {
        @NotNull
        Bundle a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(f60 f60Var, qz qzVar, mz.b bVar) {
        c25.p(f60Var, "this$0");
        c25.p(qzVar, "<anonymous parameter 0>");
        c25.p(bVar, "event");
        if (bVar == mz.b.ON_START) {
            f60Var.h = true;
        } else if (bVar == mz.b.ON_STOP) {
            f60Var.h = false;
        }
    }

    @u1
    @Nullable
    public final Bundle a(@NotNull String str) {
        c25.p(str, "key");
        if (this.f) {
            Bundle bundle = this.e;
            if (bundle != null) {
                Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
                Bundle bundle3 = this.e;
                if (bundle3 != null) {
                    bundle3.remove(str);
                }
                Bundle bundle4 = this.e;
                boolean z = false;
                if (bundle4 != null && !bundle4.isEmpty()) {
                    z = true;
                }
                if (!z) {
                    this.e = null;
                }
                return bundle2;
            }
            return null;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    @Nullable
    public final c b(@NotNull String str) {
        c25.p(str, "key");
        Iterator<Map.Entry<String, c>> it = this.c.iterator();
        while (it.hasNext()) {
            Map.Entry<String, c> next = it.next();
            c25.o(next, "components");
            c value = next.getValue();
            if (c25.g(next.getKey(), str)) {
                return value;
            }
        }
        return null;
    }

    public final boolean c() {
        return this.h;
    }

    @u1
    public final boolean d() {
        return this.f;
    }

    @u1
    public final void g(@NotNull mz mzVar) {
        c25.p(mzVar, "lifecycle");
        if (!this.d) {
            mzVar.a(new oz() { // from class: com.p7700g.p99005.d60
                @Override // com.p7700g.p99005.oz
                public final void i(qz qzVar, mz.b bVar) {
                    f60.f(f60.this, qzVar, bVar);
                }
            });
            this.d = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
    }

    @u1
    public final void h(@Nullable Bundle bundle) {
        if (this.d) {
            if (!this.f) {
                this.e = bundle != null ? bundle.getBundle(b) : null;
                this.f = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
    }

    @u1
    public final void i(@NotNull Bundle bundle) {
        c25.p(bundle, "outBundle");
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.e;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        l5<String, c>.d c2 = this.c.c();
        c25.o(c2, "this.components.iteratorWithAdditions()");
        while (c2.hasNext()) {
            Map.Entry next = c2.next();
            bundle2.putBundle((String) next.getKey(), ((c) next.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle(b, bundle2);
    }

    @u1
    public final void j(@NotNull String str, @NotNull c cVar) {
        c25.p(str, "key");
        c25.p(cVar, IronSourceConstants.EVENTS_PROVIDER);
        if (!(this.c.f(str, cVar) == null)) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    @u1
    public final void k(@NotNull Class<? extends a> cls) {
        c25.p(cls, "clazz");
        if (this.h) {
            Recreator.b bVar = this.g;
            if (bVar == null) {
                bVar = new Recreator.b(this);
            }
            this.g = bVar;
            try {
                cls.getDeclaredConstructor(new Class[0]);
                Recreator.b bVar2 = this.g;
                if (bVar2 != null) {
                    String name = cls.getName();
                    c25.o(name, "clazz.name");
                    bVar2.b(name);
                    return;
                }
                return;
            } catch (NoSuchMethodException e) {
                StringBuilder G = wo1.G("Class ");
                G.append(cls.getSimpleName());
                G.append(" must have default constructor in order to be automatically recreated");
                throw new IllegalArgumentException(G.toString(), e);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
    }

    public final void l(boolean z) {
        this.h = z;
    }

    @u1
    public final void m(@NotNull String str) {
        c25.p(str, "key");
        this.c.g(str);
    }
}