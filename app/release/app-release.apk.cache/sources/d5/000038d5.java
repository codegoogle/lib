package com.p7700g.p99005;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p7700g.p99005.i2;
import java.util.Map;

/* compiled from: TextScale.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class af2 extends s80 {
    private static final String I0 = "android:textscale:scale";

    /* compiled from: TextScale.java */
    /* loaded from: classes3.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ TextView s;

        public a(TextView textView) {
            this.s = textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@x1 ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.s.setScaleX(floatValue);
            this.s.setScaleY(floatValue);
        }
    }

    private void Q0(@x1 z80 z80Var) {
        View view = z80Var.b;
        if (view instanceof TextView) {
            z80Var.a.put(I0, Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // com.p7700g.p99005.s80
    public Animator A(@x1 ViewGroup viewGroup, @z1 z80 z80Var, @z1 z80 z80Var2) {
        if (z80Var == null || z80Var2 == null || !(z80Var.b instanceof TextView)) {
            return null;
        }
        View view = z80Var2.b;
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            Map<String, Object> map = z80Var.a;
            Map<String, Object> map2 = z80Var2.a;
            float floatValue = map.get(I0) != null ? ((Float) map.get(I0)).floatValue() : 1.0f;
            float floatValue2 = map2.get(I0) != null ? ((Float) map2.get(I0)).floatValue() : 1.0f;
            if (floatValue == floatValue2) {
                return null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(floatValue, floatValue2);
            ofFloat.addUpdateListener(new a(textView));
            return ofFloat;
        }
        return null;
    }

    @Override // com.p7700g.p99005.s80
    public void n(@x1 z80 z80Var) {
        Q0(z80Var);
    }

    @Override // com.p7700g.p99005.s80
    public void t(@x1 z80 z80Var) {
        Q0(z80Var);
    }
}