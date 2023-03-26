package com.p7700g.p99005;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;

/* compiled from: SpriteContainer.java */
/* loaded from: classes2.dex */
public abstract class y12 extends x12 {
    private x12[] W = S();
    private int X;

    public y12() {
        Q();
        R(this.W);
    }

    private void Q() {
        x12[] x12VarArr = this.W;
        if (x12VarArr != null) {
            for (x12 x12Var : x12VarArr) {
                x12Var.setCallback(this);
            }
        }
    }

    public void N(Canvas canvas) {
        x12[] x12VarArr = this.W;
        if (x12VarArr != null) {
            for (x12 x12Var : x12VarArr) {
                int save = canvas.save();
                x12Var.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
    }

    public x12 O(int i) {
        x12[] x12VarArr = this.W;
        if (x12VarArr == null) {
            return null;
        }
        return x12VarArr[i];
    }

    public int P() {
        x12[] x12VarArr = this.W;
        if (x12VarArr == null) {
            return 0;
        }
        return x12VarArr.length;
    }

    public void R(x12... x12VarArr) {
    }

    public abstract x12[] S();

    @Override // com.p7700g.p99005.x12, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        super.draw(canvas);
        N(canvas);
    }

    @Override // com.p7700g.p99005.x12
    public void e(Canvas canvas) {
    }

    @Override // com.p7700g.p99005.x12
    public int g() {
        return this.X;
    }

    @Override // com.p7700g.p99005.x12, android.graphics.drawable.Animatable
    public boolean isRunning() {
        return i12.b(this.W) || super.isRunning();
    }

    @Override // com.p7700g.p99005.x12, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        for (x12 x12Var : this.W) {
            x12Var.setBounds(rect);
        }
    }

    @Override // com.p7700g.p99005.x12, android.graphics.drawable.Animatable
    public void start() {
        super.start();
        i12.e(this.W);
    }

    @Override // com.p7700g.p99005.x12, android.graphics.drawable.Animatable
    public void stop() {
        super.stop();
        i12.g(this.W);
    }

    @Override // com.p7700g.p99005.x12
    public ValueAnimator v() {
        return null;
    }

    @Override // com.p7700g.p99005.x12
    public void y(int i) {
        this.X = i;
        for (int i2 = 0; i2 < P(); i2++) {
            O(i2).y(i);
        }
    }
}