package com.p7700g.p99005;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: BrowserActionsFallbackMenuDialog.java */
@Deprecated
/* loaded from: classes.dex */
public class s5 extends Dialog {
    private static final long s = 250;
    private static final long t = 150;
    private final View u;

    /* compiled from: BrowserActionsFallbackMenuDialog.java */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ boolean s;

        public a(boolean z) {
            this.s = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.s) {
                return;
            }
            s5.super.dismiss();
        }
    }

    public s5(Context context, View view) {
        super(context);
        this.u = view;
    }

    private void b(boolean z) {
        float f = z ? 0.0f : 1.0f;
        float f2 = z ? 1.0f : 0.0f;
        long j = z ? s : 150L;
        this.u.setScaleX(f);
        this.u.setScaleY(f);
        this.u.animate().scaleX(f2).scaleY(f2).setDuration(j).setInterpolator(new ry()).setListener(new a(z)).start();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        b(false);
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // android.app.Dialog
    public void show() {
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        b(true);
        super.show();
    }
}