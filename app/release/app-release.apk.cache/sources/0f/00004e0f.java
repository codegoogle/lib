package com.p7700g.p99005;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.p7700g.p99005.p7;

/* compiled from: CardViewBaseImpl.java */
/* loaded from: classes.dex */
public class l7 implements n7 {
    public final RectF a = new RectF();

    /* compiled from: CardViewBaseImpl.java */
    /* loaded from: classes.dex */
    public class a implements p7.a {
        public a() {
        }

        @Override // com.p7700g.p99005.p7.a
        public void a(Canvas canvas, RectF rectF, float f, Paint paint) {
            float f2 = 2.0f * f;
            float width = (rectF.width() - f2) - 1.0f;
            float height = (rectF.height() - f2) - 1.0f;
            if (f >= 1.0f) {
                float f3 = f + 0.5f;
                float f4 = -f3;
                l7.this.a.set(f4, f4, f3, f3);
                int save = canvas.save();
                canvas.translate(rectF.left + f3, rectF.top + f3);
                canvas.drawArc(l7.this.a, 180.0f, 90.0f, true, paint);
                canvas.translate(width, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(l7.this.a, 180.0f, 90.0f, true, paint);
                canvas.translate(height, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(l7.this.a, 180.0f, 90.0f, true, paint);
                canvas.translate(width, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(l7.this.a, 180.0f, 90.0f, true, paint);
                canvas.restoreToCount(save);
                float f5 = rectF.top;
                canvas.drawRect((rectF.left + f3) - 1.0f, f5, (rectF.right - f3) + 1.0f, f5 + f3, paint);
                float f6 = rectF.bottom;
                canvas.drawRect((rectF.left + f3) - 1.0f, f6 - f3, (rectF.right - f3) + 1.0f, f6, paint);
            }
            canvas.drawRect(rectF.left, rectF.top + f, rectF.right, rectF.bottom - f, paint);
        }
    }

    private p7 p(Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        return new p7(context.getResources(), colorStateList, f, f2, f3);
    }

    private p7 q(m7 m7Var) {
        return (p7) m7Var.f();
    }

    @Override // com.p7700g.p99005.n7
    public void a(m7 m7Var, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        p7 p = p(context, colorStateList, f, f2, f3);
        p.m(m7Var.d());
        m7Var.c(p);
        i(m7Var);
    }

    @Override // com.p7700g.p99005.n7
    public void b(m7 m7Var, float f) {
        q(m7Var).p(f);
        i(m7Var);
    }

    @Override // com.p7700g.p99005.n7
    public float c(m7 m7Var) {
        return q(m7Var).l();
    }

    @Override // com.p7700g.p99005.n7
    public float d(m7 m7Var) {
        return q(m7Var).g();
    }

    @Override // com.p7700g.p99005.n7
    public void e(m7 m7Var) {
    }

    @Override // com.p7700g.p99005.n7
    public void f(m7 m7Var, float f) {
        q(m7Var).r(f);
    }

    @Override // com.p7700g.p99005.n7
    public float g(m7 m7Var) {
        return q(m7Var).i();
    }

    @Override // com.p7700g.p99005.n7
    public ColorStateList h(m7 m7Var) {
        return q(m7Var).f();
    }

    @Override // com.p7700g.p99005.n7
    public void i(m7 m7Var) {
        Rect rect = new Rect();
        q(m7Var).h(rect);
        m7Var.b((int) Math.ceil(l(m7Var)), (int) Math.ceil(k(m7Var)));
        m7Var.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // com.p7700g.p99005.n7
    public void j() {
        p7.c = new a();
    }

    @Override // com.p7700g.p99005.n7
    public float k(m7 m7Var) {
        return q(m7Var).j();
    }

    @Override // com.p7700g.p99005.n7
    public float l(m7 m7Var) {
        return q(m7Var).k();
    }

    @Override // com.p7700g.p99005.n7
    public void m(m7 m7Var) {
        q(m7Var).m(m7Var.d());
        i(m7Var);
    }

    @Override // com.p7700g.p99005.n7
    public void n(m7 m7Var, @z1 ColorStateList colorStateList) {
        q(m7Var).o(colorStateList);
    }

    @Override // com.p7700g.p99005.n7
    public void o(m7 m7Var, float f) {
        q(m7Var).q(f);
        i(m7Var);
    }
}