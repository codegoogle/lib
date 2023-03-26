package com.p7700g.p99005;

import android.graphics.Canvas;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.List;

/* compiled from: HText.java */
/* loaded from: classes3.dex */
public abstract class wd3 implements yd3 {
    public int a;
    public int b;
    public CharSequence c;
    public CharSequence d;
    public TextPaint e;
    public TextPaint f;
    public xd3 g;
    public float j;
    public float k;
    public qd3 m;
    public List<Float> h = new ArrayList();
    public List<Float> i = new ArrayList();
    public float l = 0.0f;

    /* compiled from: HText.java */
    /* loaded from: classes3.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            float lineRight;
            wd3.this.g.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            wd3 wd3Var = wd3.this;
            wd3Var.k = wd3Var.g.getTextSize();
            wd3 wd3Var2 = wd3.this;
            wd3Var2.b = wd3Var2.g.getWidth();
            wd3 wd3Var3 = wd3.this;
            wd3Var3.a = wd3Var3.g.getHeight();
            wd3 wd3Var4 = wd3.this;
            wd3Var4.l = 0.0f;
            try {
                int Y = sr.Y(wd3Var4.g);
                wd3 wd3Var5 = wd3.this;
                if (Y == 0) {
                    lineRight = wd3Var5.g.getLayout().getLineLeft(0);
                } else {
                    lineRight = wd3Var5.g.getLayout().getLineRight(0);
                }
                wd3Var5.l = lineRight;
            } catch (Exception e) {
                e.printStackTrace();
            }
            wd3.this.h();
        }
    }

    private void i() {
        float textSize = this.g.getTextSize();
        this.k = textSize;
        this.e.setTextSize(textSize);
        this.e.setColor(this.g.getCurrentTextColor());
        this.e.setTypeface(this.g.getTypeface());
        this.h.clear();
        for (int i = 0; i < this.c.length(); i++) {
            this.h.add(Float.valueOf(this.e.measureText(String.valueOf(this.c.charAt(i)))));
        }
        this.f.setTextSize(this.k);
        this.f.setColor(this.g.getCurrentTextColor());
        this.f.setTypeface(this.g.getTypeface());
        this.i.clear();
        for (int i2 = 0; i2 < this.d.length(); i2++) {
            this.i.add(Float.valueOf(this.f.measureText(String.valueOf(this.d.charAt(i2)))));
        }
    }

    @Override // com.p7700g.p99005.yd3
    public void a(qd3 qd3Var) {
        this.m = qd3Var;
    }

    @Override // com.p7700g.p99005.yd3
    public void b(Canvas canvas) {
        g(canvas);
    }

    @Override // com.p7700g.p99005.yd3
    public void c(CharSequence charSequence) {
        this.g.setText(charSequence);
        this.d = this.c;
        this.c = charSequence;
        i();
        e(charSequence);
        f(charSequence);
    }

    @Override // com.p7700g.p99005.yd3
    public void d(xd3 xd3Var, AttributeSet attributeSet, int i) {
        this.g = xd3Var;
        this.d = "";
        this.c = xd3Var.getText();
        this.j = 1.0f;
        this.e = new TextPaint(1);
        this.f = new TextPaint(this.e);
        this.g.getViewTreeObserver().addOnGlobalLayoutListener(new a());
        i();
    }

    public abstract void e(CharSequence charSequence);

    public abstract void f(CharSequence charSequence);

    public abstract void g(Canvas canvas);

    public abstract void h();

    public void j(float f) {
        this.j = f;
        this.g.invalidate();
    }
}