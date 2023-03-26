package com.p7700g.p99005;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Property;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MotionSpec.java */
/* loaded from: classes2.dex */
public class oa2 {
    private static final String a = "MotionSpec";
    private final y7<String, pa2> b = new y7<>();
    private final y7<String, PropertyValuesHolder[]> c = new y7<>();

    private static void a(@x1 oa2 oa2Var, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            oa2Var.l(objectAnimator.getPropertyName(), objectAnimator.getValues());
            oa2Var.m(objectAnimator.getPropertyName(), pa2.b(objectAnimator));
            return;
        }
        throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
    }

    @x1
    private PropertyValuesHolder[] b(@x1 PropertyValuesHolder[] propertyValuesHolderArr) {
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
        for (int i = 0; i < propertyValuesHolderArr.length; i++) {
            propertyValuesHolderArr2[i] = propertyValuesHolderArr[i].clone();
        }
        return propertyValuesHolderArr2;
    }

    @z1
    public static oa2 c(@x1 Context context, @x1 TypedArray typedArray, @n2 int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return d(context, resourceId);
    }

    @z1
    public static oa2 d(@x1 Context context, @m0 int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return e(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(loadAnimator);
                return e(arrayList);
            }
            return null;
        } catch (Exception unused) {
            Integer.toHexString(i);
            return null;
        }
    }

    @x1
    private static oa2 e(@x1 List<Animator> list) {
        oa2 oa2Var = new oa2();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a(oa2Var, list.get(i));
        }
        return oa2Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof oa2) {
            return this.b.equals(((oa2) obj).b);
        }
        return false;
    }

    @x1
    public <T> ObjectAnimator f(@x1 String str, @x1 T t, @x1 Property<T, ?> property) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(t, g(str));
        ofPropertyValuesHolder.setProperty(property);
        h(str).a(ofPropertyValuesHolder);
        return ofPropertyValuesHolder;
    }

    @x1
    public PropertyValuesHolder[] g(String str) {
        if (j(str)) {
            return b(this.c.get(str));
        }
        throw new IllegalArgumentException();
    }

    public pa2 h(String str) {
        if (k(str)) {
            return this.b.get(str);
        }
        throw new IllegalArgumentException();
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public long i() {
        int size = this.b.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            pa2 r = this.b.r(i);
            j = Math.max(j, r.d() + r.c());
        }
        return j;
    }

    public boolean j(String str) {
        return this.c.get(str) != null;
    }

    public boolean k(String str) {
        return this.b.get(str) != null;
    }

    public void l(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.c.put(str, propertyValuesHolderArr);
    }

    public void m(String str, @z1 pa2 pa2Var) {
        this.b.put(str, pa2Var);
    }

    @x1
    public String toString() {
        StringBuilder F = wo1.F('\n');
        F.append(getClass().getName());
        F.append('{');
        F.append(Integer.toHexString(System.identityHashCode(this)));
        F.append(" timings: ");
        F.append(this.b);
        F.append("}\n");
        return F.toString();
    }
}