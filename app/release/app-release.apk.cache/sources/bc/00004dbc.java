package com.p7700g.p99005;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.animation.Interpolator;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: SpriteAnimatorBuilder.java */
/* loaded from: classes2.dex */
public class l12 {
    private static final String a = "SpriteAnimatorBuilder";
    private x12 b;
    private Interpolator c;
    private int d = -1;
    private long e = 2000;
    private int f = 0;
    private Map<String, b> g = new HashMap();

    /* compiled from: SpriteAnimatorBuilder.java */
    /* loaded from: classes2.dex */
    public class a extends b<Float> {
        public a(float[] fArr, Property property, Float[] fArr2) {
            super(fArr, property, fArr2);
        }
    }

    /* compiled from: SpriteAnimatorBuilder.java */
    /* loaded from: classes2.dex */
    public class b<T> {
        public float[] a;
        public Property b;
        public T[] c;

        public b(float[] fArr, Property property, T[] tArr) {
            this.a = fArr;
            this.b = property;
            this.c = tArr;
        }
    }

    /* compiled from: SpriteAnimatorBuilder.java */
    /* loaded from: classes2.dex */
    public class c extends b<Integer> {
        public c(float[] fArr, Property property, Integer[] numArr) {
            super(fArr, property, numArr);
        }
    }

    public l12(x12 x12Var) {
        this.b = x12Var;
    }

    private void e(int i, int i2) {
        if (i != i2) {
            throw new IllegalStateException(String.format(Locale.getDefault(), "The fractions.length must equal values.length, fraction.length[%d], values.length[%d]", Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    private void f(float[] fArr, Property property, Float[] fArr2) {
        e(fArr.length, fArr2.length);
        this.g.put(property.getName(), new a(fArr, property, fArr2));
    }

    private void g(float[] fArr, Property property, Integer[] numArr) {
        e(fArr.length, numArr.length);
        this.g.put(property.getName(), new c(fArr, property, numArr));
    }

    public l12 a(float[] fArr, Integer... numArr) {
        g(fArr, x12.D, numArr);
        return this;
    }

    public ObjectAnimator b() {
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[this.g.size()];
        int i = 0;
        for (Map.Entry<String, b> entry : this.g.entrySet()) {
            b value = entry.getValue();
            float[] fArr = value.a;
            Keyframe[] keyframeArr = new Keyframe[fArr.length];
            int i2 = this.f;
            float f = fArr[i2];
            while (true) {
                int i3 = this.f;
                Object[] objArr = value.c;
                if (i2 < objArr.length + i3) {
                    int i4 = i2 - i3;
                    int length = i2 % objArr.length;
                    float f2 = fArr[length] - f;
                    if (f2 < 0.0f) {
                        f2 += fArr[fArr.length - 1];
                    }
                    if (value instanceof c) {
                        keyframeArr[i4] = Keyframe.ofInt(f2, ((Integer) objArr[length]).intValue());
                    } else if (value instanceof a) {
                        keyframeArr[i4] = Keyframe.ofFloat(f2, ((Float) objArr[length]).floatValue());
                    } else {
                        keyframeArr[i4] = Keyframe.ofObject(f2, objArr[length]);
                    }
                    i2++;
                }
            }
            propertyValuesHolderArr[i] = PropertyValuesHolder.ofKeyframe(value.b, keyframeArr);
            i++;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.b, propertyValuesHolderArr);
        ofPropertyValuesHolder.setDuration(this.e);
        ofPropertyValuesHolder.setRepeatCount(this.d);
        ofPropertyValuesHolder.setInterpolator(this.c);
        return ofPropertyValuesHolder;
    }

    public l12 c(long j) {
        this.e = j;
        return this;
    }

    public l12 d(float... fArr) {
        h(n12.a(fArr));
        return this;
    }

    public l12 h(Interpolator interpolator) {
        this.c = interpolator;
        return this;
    }

    public l12 i(int i) {
        this.d = i;
        return this;
    }

    public l12 j(float[] fArr, Integer... numArr) {
        g(fArr, x12.u, numArr);
        return this;
    }

    public l12 k(float[] fArr, Integer... numArr) {
        g(fArr, x12.t, numArr);
        return this;
    }

    public l12 l(float[] fArr, Integer... numArr) {
        g(fArr, x12.v, numArr);
        return this;
    }

    public l12 m(float[] fArr, Float... fArr2) {
        f(fArr, x12.C, fArr2);
        return this;
    }

    public l12 n(float[] fArr, Float... fArr2) {
        f(fArr, x12.C, fArr2);
        return this;
    }

    public l12 o(float[] fArr, Float... fArr2) {
        f(fArr, x12.B, fArr2);
        return this;
    }

    public l12 p(int i) {
        if (i < 0) {
            i = 0;
        }
        this.f = i;
        return this;
    }

    public l12 q(float[] fArr, Integer... numArr) {
        g(fArr, x12.w, numArr);
        return this;
    }

    public l12 r(float[] fArr, Float... fArr2) {
        f(fArr, x12.y, fArr2);
        return this;
    }

    public l12 s(float[] fArr, Integer... numArr) {
        g(fArr, x12.x, numArr);
        return this;
    }

    public l12 t(float[] fArr, Float... fArr2) {
        f(fArr, x12.z, fArr2);
        return this;
    }
}