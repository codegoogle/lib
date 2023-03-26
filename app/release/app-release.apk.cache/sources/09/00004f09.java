package com.p7700g.p99005;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: DragStartHelper.java */
/* loaded from: classes.dex */
public class lq {
    private final View a;
    private final a b;
    private int c;
    private int d;
    private boolean e;
    private final View.OnLongClickListener f = new View.OnLongClickListener() { // from class: com.p7700g.p99005.cq
        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            return lq.this.d(view);
        }
    };
    private final View.OnTouchListener g = new View.OnTouchListener() { // from class: com.p7700g.p99005.vp
        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return lq.this.e(view, motionEvent);
        }
    };

    /* compiled from: DragStartHelper.java */
    /* loaded from: classes.dex */
    public interface a {
        boolean a(@x1 View view, @x1 lq lqVar);
    }

    public lq(@x1 View view, @x1 a aVar) {
        this.a = view;
        this.b = aVar;
    }

    public void a() {
        this.a.setOnLongClickListener(this.f);
        this.a.setOnTouchListener(this.g);
    }

    public void b() {
        this.a.setOnLongClickListener(null);
        this.a.setOnTouchListener(null);
    }

    public void c(@x1 Point point) {
        point.set(this.c, this.d);
    }

    public boolean d(@x1 View view) {
        return this.b.a(view, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
        if (r2 != 3) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean e(@x1 View view, @x1 MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    if (ar.l(motionEvent, 8194) && (motionEvent.getButtonState() & 1) != 0 && !this.e && (this.c != x || this.d != y)) {
                        this.c = x;
                        this.d = y;
                        boolean a2 = this.b.a(view, this);
                        this.e = a2;
                        return a2;
                    }
                }
            }
            this.e = false;
        } else {
            this.c = x;
            this.d = y;
        }
        return false;
    }
}