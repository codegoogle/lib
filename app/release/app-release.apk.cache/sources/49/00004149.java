package com.p7700g.p99005;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MultiCallback.java */
/* loaded from: classes4.dex */
public class ey5 implements Drawable.Callback {
    private final CopyOnWriteArrayList<a> s;
    private final boolean t;

    /* compiled from: MultiCallback.java */
    /* loaded from: classes4.dex */
    public static final class a extends WeakReference<Drawable.Callback> {
        public a(Drawable.Callback callback) {
            super(callback);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && a.class == obj.getClass() && get() == ((a) obj).get();
        }

        public int hashCode() {
            Drawable.Callback callback = get();
            if (callback != null) {
                return callback.hashCode();
            }
            return 0;
        }
    }

    public ey5() {
        this(false);
    }

    public void a(Drawable.Callback callback) {
        for (int i = 0; i < this.s.size(); i++) {
            a aVar = this.s.get(i);
            if (aVar.get() == null) {
                this.s.remove(aVar);
            }
        }
        this.s.addIfAbsent(new a(callback));
    }

    public void b(Drawable.Callback callback) {
        for (int i = 0; i < this.s.size(); i++) {
            a aVar = this.s.get(i);
            Drawable.Callback callback2 = aVar.get();
            if (callback2 == null || callback2 == callback) {
                this.s.remove(aVar);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@x1 Drawable drawable) {
        for (int i = 0; i < this.s.size(); i++) {
            a aVar = this.s.get(i);
            Drawable.Callback callback = aVar.get();
            if (callback != null) {
                if (this.t && (callback instanceof View)) {
                    ((View) callback).invalidate();
                } else {
                    callback.invalidateDrawable(drawable);
                }
            } else {
                this.s.remove(aVar);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@x1 Drawable drawable, @x1 Runnable runnable, long j) {
        for (int i = 0; i < this.s.size(); i++) {
            a aVar = this.s.get(i);
            Drawable.Callback callback = aVar.get();
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            } else {
                this.s.remove(aVar);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@x1 Drawable drawable, @x1 Runnable runnable) {
        for (int i = 0; i < this.s.size(); i++) {
            a aVar = this.s.get(i);
            Drawable.Callback callback = aVar.get();
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            } else {
                this.s.remove(aVar);
            }
        }
    }

    public ey5(boolean z) {
        this.s = new CopyOnWriteArrayList<>();
        this.t = z;
    }
}