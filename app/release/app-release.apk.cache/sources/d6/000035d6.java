package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ironsource.environment.h;
import com.ironsource.sdk.controller.x;
import com.p7700g.p99005.pt0;

/* loaded from: classes3.dex */
public final class i extends FrameLayout implements com.ironsource.sdk.j.g {
    public Context s;
    public x t;

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewGroup b = i.b(i.this);
            if (b != null) {
                b.addView(i.this);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewGroup b = i.b(i.this);
            if (b != null) {
                b.removeView(i.this);
            }
        }
    }

    public i(Context context) {
        super(context);
        this.s = context;
        setClickable(true);
    }

    public static /* synthetic */ ViewGroup b(i iVar) {
        Activity activity = (Activity) iVar.s;
        if (activity != null) {
            return (ViewGroup) activity.getWindow().getDecorView();
        }
        return null;
    }

    public int a() {
        int identifier;
        try {
            Context context = this.s;
            if (context == null || (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", pt0.a)) <= 0) {
                return 0;
            }
            return this.s.getResources().getDimensionPixelSize(identifier);
        } catch (Exception unused) {
            return 0;
        }
    }

    public int c() {
        Rect rect;
        Rect rect2;
        Activity activity = (Activity) this.s;
        try {
            rect = new Rect();
            activity.getWindow().getDecorView().getDrawingRect(rect);
            rect2 = new Rect();
            activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect2);
        } catch (Exception unused) {
        }
        if (h.o(activity) == 1) {
            int i = rect.bottom;
            int i2 = rect2.bottom;
            if (i - i2 > 0) {
                return i - i2;
            }
            return 0;
        }
        int i3 = rect.right;
        int i4 = rect2.right;
        if (i3 - i4 > 0) {
            return i3 - i4;
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.t.l();
        this.t.a(true, "main");
    }

    @Override // com.ironsource.sdk.j.g
    public final boolean onBackButtonPressed() {
        new com.ironsource.sdk.i.a();
        return com.ironsource.sdk.i.a.a((Activity) this.s);
    }

    @Override // com.ironsource.sdk.j.g
    public final void onCloseRequested() {
        ((Activity) this.s).runOnUiThread(new b());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.t.k();
        this.t.a(false, "main");
        x xVar = this.t;
        if (xVar != null) {
            xVar.P = x.g.Gone;
            xVar.v0 = null;
            xVar.K0 = null;
        }
        removeAllViews();
    }

    @Override // com.ironsource.sdk.j.g
    public final void onOrientationChanged(String str, int i) {
    }
}