package com.p7700g.p99005;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandleAttacher;
import com.p7700g.p99005.f60;
import com.p7700g.p99005.m00;
import com.p7700g.p99005.mz;
import com.p7700g.p99005.z00;
import org.jetbrains.annotations.NotNull;

/* compiled from: SavedStateHandleSupport.kt */
@fz4(name = "SavedStateHandleSupport")
@vo4(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a*\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0002\u001a\f\u0010\u0012\u001a\u00020\u0013*\u00020\u0018H\u0007\u001a\u001f\u0010\u0019\u001a\u00020\u001a\"\f\b\u0000\u0010\u001b*\u00020\u0006*\u00020\t*\u0002H\u001bH\u0007¢\u0006\u0002\u0010\u001c\"\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00018\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00018\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\"\u0018\u0010\n\u001a\u00020\u000b*\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0018\u0010\u000e\u001a\u00020\u000f*\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"DEFAULT_ARGS_KEY", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "Landroid/os/Bundle;", "SAVED_STATE_KEY", "", "SAVED_STATE_REGISTRY_OWNER_KEY", "Landroidx/savedstate/SavedStateRegistryOwner;", "VIEWMODEL_KEY", "VIEW_MODEL_STORE_OWNER_KEY", "Landroidx/lifecycle/ViewModelStoreOwner;", "savedStateHandlesProvider", "Landroidx/lifecycle/SavedStateHandlesProvider;", "getSavedStateHandlesProvider", "(Landroidx/savedstate/SavedStateRegistryOwner;)Landroidx/lifecycle/SavedStateHandlesProvider;", "savedStateHandlesVM", "Landroidx/lifecycle/SavedStateHandlesVM;", "getSavedStateHandlesVM", "(Landroidx/lifecycle/ViewModelStoreOwner;)Landroidx/lifecycle/SavedStateHandlesVM;", "createSavedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "savedStateRegistryOwner", "viewModelStoreOwner", "key", "defaultArgs", "Landroidx/lifecycle/viewmodel/CreationExtras;", "enableSavedStateHandles", "", "T", "(Landroidx/savedstate/SavedStateRegistryOwner;)V", "lifecycle-viewmodel-savedstate_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d00 {
    @NotNull
    private static final String a = "androidx.lifecycle.internal.SavedStateHandlesVM";
    @NotNull
    private static final String b = "androidx.lifecycle.internal.SavedStateHandlesProvider";
    @cz4
    @NotNull
    public static final z00.b<h60> c = new b();
    @cz4
    @NotNull
    public static final z00.b<q00> d = new c();
    @cz4
    @NotNull
    public static final z00.b<Bundle> e = new a();

    /* compiled from: SavedStateHandleSupport.kt */
    @vo4(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/lifecycle/SavedStateHandleSupport$DEFAULT_ARGS_KEY$1", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "Landroid/os/Bundle;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a implements z00.b<Bundle> {
    }

    /* compiled from: SavedStateHandleSupport.kt */
    @vo4(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/lifecycle/SavedStateHandleSupport$SAVED_STATE_REGISTRY_OWNER_KEY$1", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "Landroidx/savedstate/SavedStateRegistryOwner;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class b implements z00.b<h60> {
    }

    /* compiled from: SavedStateHandleSupport.kt */
    @vo4(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/lifecycle/SavedStateHandleSupport$VIEW_MODEL_STORE_OWNER_KEY$1", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "Landroidx/lifecycle/ViewModelStoreOwner;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class c implements z00.b<q00> {
    }

    /* compiled from: SavedStateHandleSupport.kt */
    @vo4(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/lifecycle/SavedStateHandlesVM;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class d extends e25 implements f05<z00, f00> {
        public static final d t = new d();

        public d() {
            super(1);
        }

        @Override // com.p7700g.p99005.f05
        @NotNull
        /* renamed from: a */
        public final f00 M(@NotNull z00 z00Var) {
            c25.p(z00Var, "$this$initializer");
            return new f00();
        }
    }

    @u1
    @NotNull
    public static final c00 a(@NotNull z00 z00Var) {
        c25.p(z00Var, "<this>");
        h60 h60Var = (h60) z00Var.a(c);
        if (h60Var != null) {
            q00 q00Var = (q00) z00Var.a(d);
            if (q00Var != null) {
                Bundle bundle = (Bundle) z00Var.a(e);
                String str = (String) z00Var.a(m00.c.d);
                if (str != null) {
                    return b(h60Var, q00Var, str, bundle);
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    private static final c00 b(h60 h60Var, q00 q00Var, String str, Bundle bundle) {
        e00 d2 = d(h60Var);
        f00 e2 = e(q00Var);
        c00 c00Var = e2.g().get(str);
        if (c00Var == null) {
            c00 a2 = c00.a.a(d2.b(str), bundle);
            e2.g().put(str, a2);
            return a2;
        }
        return c00Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @u1
    public static final <T extends h60 & q00> void c(@NotNull T t) {
        c25.p(t, "<this>");
        mz.c b2 = t.getLifecycle().b();
        c25.o(b2, "lifecycle.currentState");
        if (b2 == mz.c.INITIALIZED || b2 == mz.c.CREATED) {
            if (t.getSavedStateRegistry().b(b) == null) {
                e00 e00Var = new e00(t.getSavedStateRegistry(), t);
                t.getSavedStateRegistry().j(b, e00Var);
                t.getLifecycle().a(new SavedStateHandleAttacher(e00Var));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @NotNull
    public static final e00 d(@NotNull h60 h60Var) {
        c25.p(h60Var, "<this>");
        f60.c b2 = h60Var.getSavedStateRegistry().b(b);
        e00 e00Var = b2 instanceof e00 ? (e00) b2 : null;
        if (e00Var != null) {
            return e00Var;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    @NotNull
    public static final f00 e(@NotNull q00 q00Var) {
        c25.p(q00Var, "<this>");
        b10 b10Var = new b10();
        b10Var.a(c35.d(f00.class), d.t);
        return (f00) new m00(q00Var, b10Var.b()).b(a, f00.class);
    }
}