package androidx.savedstate;

import android.os.Bundle;
import com.p7700g.p99005.c25;
import com.p7700g.p99005.f60;
import com.p7700g.p99005.h60;
import com.p7700g.p99005.mz;
import com.p7700g.p99005.oz;
import com.p7700g.p99005.qz;
import com.p7700g.p99005.rs2;
import com.p7700g.p99005.vo4;
import com.p7700g.p99005.wo1;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: Recreator.kt */
@vo4(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000e\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Landroidx/savedstate/Recreator;", "Landroidx/lifecycle/LifecycleEventObserver;", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "(Landroidx/savedstate/SavedStateRegistryOwner;)V", "onStateChanged", "", rs2.f.b, "Landroidx/lifecycle/LifecycleOwner;", "event", "Landroidx/lifecycle/Lifecycle$Event;", "reflectiveNew", "className", "", "Companion", "SavedStateProvider", "savedstate_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Recreator implements oz {
    @NotNull
    public static final a s = new a(null);
    @NotNull
    public static final String t = "classes_to_restore";
    @NotNull
    public static final String u = "androidx.savedstate.Restarter";
    @NotNull
    private final h60 v;

    /* compiled from: Recreator.kt */
    @vo4(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Landroidx/savedstate/Recreator$Companion;", "", "()V", "CLASSES_KEY", "", "COMPONENT_KEY", "savedstate_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: Recreator.kt */
    @vo4(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/savedstate/Recreator$SavedStateProvider;", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "registry", "Landroidx/savedstate/SavedStateRegistry;", "(Landroidx/savedstate/SavedStateRegistry;)V", "classes", "", "", com.anythink.expressad.d.a.b.ay, "", "className", "saveState", "Landroid/os/Bundle;", "savedstate_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class b implements f60.c {
        @NotNull
        private final Set<String> a;

        public b(@NotNull f60 f60Var) {
            c25.p(f60Var, "registry");
            this.a = new LinkedHashSet();
            f60Var.j(Recreator.u, this);
        }

        @Override // com.p7700g.p99005.f60.c
        @NotNull
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList(Recreator.t, new ArrayList<>(this.a));
            return bundle;
        }

        public final void b(@NotNull String str) {
            c25.p(str, "className");
            this.a.add(str);
        }
    }

    public Recreator(@NotNull h60 h60Var) {
        c25.p(h60Var, "owner");
        this.v = h60Var;
    }

    private final void e(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(f60.a.class);
            c25.o(asSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    Object newInstance = declaredConstructor.newInstance(new Object[0]);
                    c25.o(newInstance, "{\n                constr…wInstance()\n            }");
                    ((f60.a) newInstance).a(this.v);
                } catch (Exception e) {
                    throw new RuntimeException(wo1.t("Failed to instantiate ", str), e);
                }
            } catch (NoSuchMethodException e2) {
                StringBuilder G = wo1.G("Class ");
                G.append(asSubclass.getSimpleName());
                G.append(" must have default constructor in order to be automatically recreated");
                throw new IllegalStateException(G.toString(), e2);
            }
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException(wo1.u("Class ", str, " wasn't found"), e3);
        }
    }

    @Override // com.p7700g.p99005.oz
    public void i(@NotNull qz qzVar, @NotNull mz.b bVar) {
        c25.p(qzVar, rs2.f.b);
        c25.p(bVar, "event");
        if (bVar == mz.b.ON_CREATE) {
            qzVar.getLifecycle().c(this);
            Bundle a2 = this.v.getSavedStateRegistry().a(u);
            if (a2 == null) {
                return;
            }
            ArrayList<String> stringArrayList = a2.getStringArrayList(t);
            if (stringArrayList != null) {
                for (String str : stringArrayList) {
                    e(str);
                }
                return;
            }
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}