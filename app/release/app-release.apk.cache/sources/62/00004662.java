package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.p7700g.p99005.i2;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* compiled from: ViewOverlayApi14.java */
/* loaded from: classes3.dex */
public class hf2 implements jf2 {
    public a a;

    /* compiled from: ViewOverlayApi14.java */
    @SuppressLint({"ViewConstructor", "PrivateApi"})
    /* loaded from: classes3.dex */
    public static class a extends ViewGroup {
        public static Method s;
        public ViewGroup t;
        public View u;
        public ArrayList<Drawable> v;
        public hf2 w;
        private boolean x;

        static {
            try {
                Class cls = Integer.TYPE;
                s = ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", cls, cls, Rect.class);
            } catch (NoSuchMethodException unused) {
            }
        }

        public a(Context context, ViewGroup viewGroup, View view, hf2 hf2Var) {
            super(context);
            this.v = null;
            this.t = viewGroup;
            this.u = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.w = hf2Var;
        }

        private void c() {
            if (this.x) {
                throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        private void d() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.v;
                if (arrayList == null || arrayList.size() == 0) {
                    this.x = true;
                    this.t.removeView(this);
                }
            }
        }

        private void e(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.t.getLocationOnScreen(iArr2);
            this.u.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        public void a(Drawable drawable) {
            c();
            if (this.v == null) {
                this.v = new ArrayList<>();
            }
            if (this.v.contains(drawable)) {
                return;
            }
            this.v.add(drawable);
            invalidate(drawable.getBounds());
            drawable.setCallback(this);
        }

        public void b(View view) {
            c();
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != this.t && viewGroup.getParent() != null && sr.N0(viewGroup)) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.t.getLocationOnScreen(iArr2);
                    sr.d1(view, iArr[0] - iArr2[0]);
                    sr.e1(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.t.getLocationOnScreen(iArr);
            this.u.getLocationOnScreen(iArr2);
            canvas.translate(iArr2[0] - iArr[0], iArr2[1] - iArr[1]);
            canvas.clipRect(new Rect(0, 0, this.u.getWidth(), this.u.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.v;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i = 0; i < size; i++) {
                this.v.get(i).draw(canvas);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        public ViewParent f(int i, int i2, Rect rect) {
            if (this.t == null || s == null) {
                return null;
            }
            try {
                e(new int[2]);
                s.invoke(this.t, Integer.valueOf(i), Integer.valueOf(i2), rect);
                return null;
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return null;
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
                return null;
            }
        }

        public void g(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.v;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(null);
                d();
            }
        }

        public void h(View view) {
            super.removeView(view);
            d();
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.t != null) {
                rect.offset(iArr[0], iArr[1]);
                if (this.t != null) {
                    iArr[0] = 0;
                    iArr[1] = 0;
                    int[] iArr2 = new int[2];
                    e(iArr2);
                    rect.offset(iArr2[0], iArr2[1]);
                    return super.invalidateChildInParent(iArr, rect);
                }
                invalidate(rect);
                return null;
            }
            return null;
        }

        @Override // android.view.View, android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(@x1 Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        @Override // android.view.View
        public boolean verifyDrawable(@x1 Drawable drawable) {
            ArrayList<Drawable> arrayList;
            return super.verifyDrawable(drawable) || ((arrayList = this.v) != null && arrayList.contains(drawable));
        }
    }

    public hf2(Context context, ViewGroup viewGroup, View view) {
        this.a = new a(context, viewGroup, view, this);
    }

    public static hf2 e(View view) {
        ViewGroup g = kf2.g(view);
        if (g != null) {
            int childCount = g.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = g.getChildAt(i);
                if (childAt instanceof a) {
                    return ((a) childAt).w;
                }
            }
            return new ef2(g.getContext(), g, view);
        }
        return null;
    }

    @Override // com.p7700g.p99005.jf2
    public void a(@x1 Drawable drawable) {
        this.a.a(drawable);
    }

    @Override // com.p7700g.p99005.jf2
    public void b(@x1 Drawable drawable) {
        this.a.g(drawable);
    }
}