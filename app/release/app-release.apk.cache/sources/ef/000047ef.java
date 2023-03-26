package com.p7700g.p99005;

import android.view.View;
import android.view.ViewParent;
import com.p7700g.p99005.e60;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ViewTreeSavedStateRegistryOwner.kt */
@fz4(name = "ViewTreeSavedStateRegistryOwner")
@vo4(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007¢\u0006\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0005*\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"findViewTreeSavedStateRegistryOwner", "Landroidx/savedstate/SavedStateRegistryOwner;", "Landroid/view/View;", "get", "setViewTreeSavedStateRegistryOwner", "", "owner", la1.a, "savedstate_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i60 {

    /* compiled from: ViewTreeSavedStateRegistryOwner.kt */
    @vo4(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", com.anythink.expressad.a.B, "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a extends e25 implements f05<View, View> {
        public static final a t = new a();

        public a() {
            super(1);
        }

        @Override // com.p7700g.p99005.f05
        @Nullable
        /* renamed from: a */
        public final View M(@NotNull View view) {
            c25.p(view, com.anythink.expressad.a.B);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    /* compiled from: ViewTreeSavedStateRegistryOwner.kt */
    @vo4(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/savedstate/SavedStateRegistryOwner;", com.anythink.expressad.a.B, "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class b extends e25 implements f05<View, h60> {
        public static final b t = new b();

        public b() {
            super(1);
        }

        @Override // com.p7700g.p99005.f05
        @Nullable
        /* renamed from: a */
        public final h60 M(@NotNull View view) {
            c25.p(view, com.anythink.expressad.a.B);
            Object tag = view.getTag(e60.a.a);
            if (tag instanceof h60) {
                return (h60) tag;
            }
            return null;
        }
    }

    @fz4(name = "get")
    @Nullable
    public static final h60 a(@NotNull View view) {
        c25.p(view, "<this>");
        return (h60) o75.F0(o75.p1(m75.l(view, a.t), b.t));
    }

    @fz4(name = la1.a)
    public static final void b(@NotNull View view, @Nullable h60 h60Var) {
        c25.p(view, "<this>");
        view.setTag(e60.a.a, h60Var);
    }
}