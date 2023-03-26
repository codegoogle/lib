package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.LegacySavedStateHandleController;
import androidx.lifecycle.SavedStateHandleController;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.m00;
import java.lang.reflect.Constructor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SavedStateViewModelFactory.kt */
@vo4(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\u0019\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB#\b\u0017\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ%\u0010\u0011\u001a\u0002H\u0012\"\b\b\u0000\u0010\u0012*\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00120\u0015H\u0016¢\u0006\u0002\u0010\u0016J-\u0010\u0011\u001a\u0002H\u0012\"\b\b\u0000\u0010\u0012*\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00120\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0016¢\u0006\u0002\u0010\u0019J+\u0010\u0011\u001a\u0002H\u0012\"\b\b\u0000\u0010\u0012*\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00120\u0015¢\u0006\u0002\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0013H\u0017R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Landroidx/lifecycle/SavedStateViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$OnRequeryFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "()V", "application", "Landroid/app/Application;", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "(Landroid/app/Application;Landroidx/savedstate/SavedStateRegistryOwner;)V", "defaultArgs", "Landroid/os/Bundle;", "(Landroid/app/Application;Landroidx/savedstate/SavedStateRegistryOwner;Landroid/os/Bundle;)V", "factory", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "savedStateRegistry", "Landroidx/savedstate/SavedStateRegistry;", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "key", "", "(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "onRequery", "", "viewModel", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g00 extends m00.d implements m00.b {
    @Nullable
    private Application b;
    @NotNull
    private final m00.b c;
    @Nullable
    private Bundle d;
    @Nullable
    private mz e;
    @Nullable
    private f60 f;

    public g00() {
        this.c = new m00.a();
    }

    @Override // com.p7700g.p99005.m00.b
    @NotNull
    public <T extends k00> T a(@NotNull Class<T> cls) {
        c25.p(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) d(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // com.p7700g.p99005.m00.b
    @NotNull
    public <T extends k00> T b(@NotNull Class<T> cls, @NotNull z00 z00Var) {
        Constructor c;
        c25.p(cls, "modelClass");
        c25.p(z00Var, "extras");
        String str = (String) z00Var.a(m00.c.d);
        if (str != null) {
            if (z00Var.a(d00.c) != null && z00Var.a(d00.d) != null) {
                Application application = (Application) z00Var.a(m00.a.h);
                boolean isAssignableFrom = bz.class.isAssignableFrom(cls);
                if (isAssignableFrom && application != null) {
                    c = h00.c(cls, h00.a());
                } else {
                    c = h00.c(cls, h00.b());
                }
                if (c == null) {
                    return (T) this.c.b(cls, z00Var);
                }
                return (!isAssignableFrom || application == null) ? (T) h00.d(cls, c, d00.a(z00Var)) : (T) h00.d(cls, c, application, d00.a(z00Var));
            } else if (this.e != null) {
                return (T) d(str, cls);
            } else {
                throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            }
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // com.p7700g.p99005.m00.d
    @i2({i2.a.LIBRARY_GROUP})
    public void c(@NotNull k00 k00Var) {
        c25.p(k00Var, "viewModel");
        mz mzVar = this.e;
        if (mzVar != null) {
            LegacySavedStateHandleController.a(k00Var, this.f, mzVar);
        }
    }

    @NotNull
    public final <T extends k00> T d(@NotNull String str, @NotNull Class<T> cls) {
        Constructor c;
        T t;
        Application application;
        c25.p(str, "key");
        c25.p(cls, "modelClass");
        if (this.e != null) {
            boolean isAssignableFrom = bz.class.isAssignableFrom(cls);
            if (isAssignableFrom && this.b != null) {
                c = h00.c(cls, h00.a());
            } else {
                c = h00.c(cls, h00.b());
            }
            if (c == null) {
                return this.b != null ? (T) this.c.a(cls) : (T) m00.c.b.a().a(cls);
            }
            SavedStateHandleController b = LegacySavedStateHandleController.b(this.f, this.e, str, this.d);
            if (isAssignableFrom && (application = this.b) != null) {
                c25.m(application);
                c00 f = b.f();
                c25.o(f, "controller.handle");
                t = (T) h00.d(cls, c, application, f);
            } else {
                c00 f2 = b.f();
                c25.o(f2, "controller.handle");
                t = (T) h00.d(cls, c, f2);
            }
            t.f("androidx.lifecycle.savedstate.vm.tag", b);
            return t;
        }
        throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g00(@Nullable Application application, @NotNull h60 h60Var) {
        this(application, h60Var, null);
        c25.p(h60Var, "owner");
    }

    @SuppressLint({"LambdaLast"})
    public g00(@Nullable Application application, @NotNull h60 h60Var, @Nullable Bundle bundle) {
        m00.a aVar;
        c25.p(h60Var, "owner");
        this.f = h60Var.getSavedStateRegistry();
        this.e = h60Var.getLifecycle();
        this.d = bundle;
        this.b = application;
        if (application != null) {
            aVar = m00.a.e.b(application);
        } else {
            aVar = new m00.a();
        }
        this.c = aVar;
    }
}