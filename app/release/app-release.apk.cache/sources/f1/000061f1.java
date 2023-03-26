package com.p7700g.p99005;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.transition.Transition;
import android.view.View;
import android.view.Window;
import com.p7700g.p99005.ga2;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* compiled from: MaterialContainerTransformSharedElementCallback.java */
@e2(21)
/* loaded from: classes3.dex */
public class vk2 extends SharedElementCallback {
    @z1
    private static WeakReference<View> a;
    @z1
    private Rect e;
    private boolean b = true;
    private boolean c = true;
    private boolean d = false;
    @z1
    private d f = new e();

    /* compiled from: MaterialContainerTransformSharedElementCallback.java */
    /* loaded from: classes3.dex */
    public class a extends dl2 {
        public final /* synthetic */ Window a;

        public a(Window window) {
            this.a = window;
        }

        @Override // com.p7700g.p99005.dl2, android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            vk2.j(this.a);
        }

        @Override // com.p7700g.p99005.dl2, android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            vk2.i(this.a);
        }
    }

    /* compiled from: MaterialContainerTransformSharedElementCallback.java */
    /* loaded from: classes3.dex */
    public class b extends dl2 {
        public final /* synthetic */ Activity a;

        public b(Activity activity) {
            this.a = activity;
        }

        @Override // com.p7700g.p99005.dl2, android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            View view;
            if (vk2.a != null && (view = (View) vk2.a.get()) != null) {
                view.setAlpha(1.0f);
                WeakReference unused = vk2.a = null;
            }
            this.a.finish();
            this.a.overridePendingTransition(0, 0);
        }
    }

    /* compiled from: MaterialContainerTransformSharedElementCallback.java */
    /* loaded from: classes3.dex */
    public class c extends dl2 {
        public final /* synthetic */ Window a;

        public c(Window window) {
            this.a = window;
        }

        @Override // com.p7700g.p99005.dl2, android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            vk2.i(this.a);
        }
    }

    /* compiled from: MaterialContainerTransformSharedElementCallback.java */
    /* loaded from: classes3.dex */
    public interface d {
        @z1
        qh2 a(@x1 View view);
    }

    /* compiled from: MaterialContainerTransformSharedElementCallback.java */
    /* loaded from: classes3.dex */
    public static class e implements d {
        @Override // com.p7700g.p99005.vk2.d
        @z1
        public qh2 a(@x1 View view) {
            if (view instanceof uh2) {
                return ((uh2) view).getShapeAppearanceModel();
            }
            return null;
        }
    }

    @z1
    private static Drawable f(Window window) {
        return window.getDecorView().getBackground();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void i(Window window) {
        Drawable f = f(window);
        if (f == null) {
            return;
        }
        f.mutate().setColorFilter(aj.a(0, bj.CLEAR));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void j(Window window) {
        Drawable f = f(window);
        if (f == null) {
            return;
        }
        f.mutate().clearColorFilter();
    }

    private void n(Window window) {
        Transition sharedElementEnterTransition = window.getSharedElementEnterTransition();
        if (sharedElementEnterTransition instanceof uk2) {
            uk2 uk2Var = (uk2) sharedElementEnterTransition;
            if (!this.d) {
                window.setSharedElementReenterTransition(null);
            }
            if (this.c) {
                p(window, uk2Var);
                uk2Var.addListener(new a(window));
            }
        }
    }

    private void o(Activity activity, Window window) {
        Transition sharedElementReturnTransition = window.getSharedElementReturnTransition();
        if (sharedElementReturnTransition instanceof uk2) {
            uk2 uk2Var = (uk2) sharedElementReturnTransition;
            uk2Var.j0(true);
            uk2Var.addListener(new b(activity));
            if (this.c) {
                p(window, uk2Var);
                uk2Var.addListener(new c(window));
            }
        }
    }

    private static void p(Window window, uk2 uk2Var) {
        if (uk2Var.getDuration() >= 0) {
            window.setTransitionBackgroundFadeDuration(uk2Var.getDuration());
        }
    }

    @z1
    public d e() {
        return this.f;
    }

    public boolean g() {
        return this.d;
    }

    public boolean h() {
        return this.c;
    }

    public void k(@z1 d dVar) {
        this.f = dVar;
    }

    public void l(boolean z) {
        this.d = z;
    }

    public void m(boolean z) {
        this.c = z;
    }

    @Override // android.app.SharedElementCallback
    @z1
    public Parcelable onCaptureSharedElementSnapshot(@x1 View view, @x1 Matrix matrix, @x1 RectF rectF) {
        a = new WeakReference<>(view);
        return super.onCaptureSharedElementSnapshot(view, matrix, rectF);
    }

    @Override // android.app.SharedElementCallback
    @z1
    public View onCreateSnapshotView(@x1 Context context, @z1 Parcelable parcelable) {
        WeakReference<View> weakReference;
        View view;
        qh2 a2;
        View onCreateSnapshotView = super.onCreateSnapshotView(context, parcelable);
        if (onCreateSnapshotView != null && (weakReference = a) != null && this.f != null && (view = weakReference.get()) != null && (a2 = this.f.a(view)) != null) {
            onCreateSnapshotView.setTag(ga2.h.r3, a2);
        }
        return onCreateSnapshotView;
    }

    @Override // android.app.SharedElementCallback
    public void onMapSharedElements(@x1 List<String> list, @x1 Map<String, View> map) {
        View view;
        Activity a2;
        if (list.isEmpty() || map.isEmpty() || (view = map.get(list.get(0))) == null || (a2 = ie2.a(view.getContext())) == null) {
            return;
        }
        Window window = a2.getWindow();
        if (this.b) {
            n(window);
        } else {
            o(a2, window);
        }
    }

    @Override // android.app.SharedElementCallback
    public void onSharedElementEnd(@x1 List<String> list, @x1 List<View> list2, @x1 List<View> list3) {
        if (!list2.isEmpty()) {
            int i = ga2.h.r3;
            if (list2.get(0).getTag(i) instanceof View) {
                list2.get(0).setTag(i, null);
            }
        }
        if (!this.b && !list2.isEmpty()) {
            this.e = el2.i(list2.get(0));
        }
        this.b = false;
    }

    @Override // android.app.SharedElementCallback
    public void onSharedElementStart(@x1 List<String> list, @x1 List<View> list2, @x1 List<View> list3) {
        if (!list2.isEmpty() && !list3.isEmpty()) {
            list2.get(0).setTag(ga2.h.r3, list3.get(0));
        }
        if (this.b || list2.isEmpty() || this.e == null) {
            return;
        }
        View view = list2.get(0);
        view.measure(View.MeasureSpec.makeMeasureSpec(this.e.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.e.height(), 1073741824));
        Rect rect = this.e;
        view.layout(rect.left, rect.top, rect.right, rect.bottom);
    }
}