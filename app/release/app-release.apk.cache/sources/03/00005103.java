package com.p7700g.p99005;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Objects;

/* compiled from: OneShotPreDrawListener.java */
/* loaded from: classes.dex */
public final class mr implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    private final View s;
    private ViewTreeObserver t;
    private final Runnable u;

    private mr(View view, Runnable runnable) {
        this.s = view;
        this.t = view.getViewTreeObserver();
        this.u = runnable;
    }

    @x1
    public static mr a(@x1 View view, @x1 Runnable runnable) {
        Objects.requireNonNull(view, "view == null");
        Objects.requireNonNull(runnable, "runnable == null");
        mr mrVar = new mr(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(mrVar);
        view.addOnAttachStateChangeListener(mrVar);
        return mrVar;
    }

    public void b() {
        if (this.t.isAlive()) {
            this.t.removeOnPreDrawListener(this);
        } else {
            this.s.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.s.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.u.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(@x1 View view) {
        this.t = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@x1 View view) {
        b();
    }
}