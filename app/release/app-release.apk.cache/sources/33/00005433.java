package com.p7700g.p99005;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.p7700g.p99005.i2;

/* compiled from: InsetDialogOnTouchListener.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class od2 implements View.OnTouchListener {
    @x1
    private final Dialog s;
    private final int t;
    private final int u;
    private final int v;

    public od2(@x1 Dialog dialog, @x1 Rect rect) {
        this.s = dialog;
        this.t = rect.left;
        this.u = rect.top;
        this.v = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(@x1 View view, @x1 MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = findViewById.getLeft() + this.t;
        int width = findViewById.getWidth() + left;
        int top = findViewById.getTop() + this.u;
        if (new RectF(left, top, width, findViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i = this.v;
            obtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.s.onTouchEvent(obtain);
    }
}