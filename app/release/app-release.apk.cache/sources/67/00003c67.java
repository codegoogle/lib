package com.p7700g.p99005;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.mj;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: AnimatorInflaterCompat.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ca0 {
    private static final String a = "AnimatorInflater";
    private static final int b = 0;
    private static final int c = 100;
    private static final int d = 0;
    private static final int e = 1;
    private static final int f = 2;
    private static final int g = 3;
    private static final int h = 4;
    private static final boolean i = false;

    /* compiled from: AnimatorInflaterCompat.java */
    /* loaded from: classes.dex */
    public static class a implements TypeEvaluator<mj.b[]> {
        private mj.b[] a;

        public a() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public mj.b[] evaluate(float f, mj.b[] bVarArr, mj.b[] bVarArr2) {
            if (mj.b(bVarArr, bVarArr2)) {
                if (!mj.b(this.a, bVarArr)) {
                    this.a = mj.f(bVarArr);
                }
                for (int i = 0; i < bVarArr.length; i++) {
                    this.a[i].d(bVarArr[i], bVarArr2[i], f);
                }
                return this.a;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }

        public a(mj.b[] bVarArr) {
            this.a = bVarArr;
        }
    }

    private ca0() {
    }

    private static Animator a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f2) throws XmlPullParserException, IOException {
        return b(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Animator b(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i2, float f2) throws XmlPullParserException, IOException {
        int i3;
        int depth = xmlPullParser.getDepth();
        ValueAnimator valueAnimator = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            i3 = 0;
            if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                if (next == 2) {
                    String name = xmlPullParser.getName();
                    if (name.equals("objectAnimator")) {
                        valueAnimator = o(context, resources, theme, attributeSet, f2, xmlPullParser);
                    } else if (name.equals("animator")) {
                        valueAnimator = m(context, resources, theme, attributeSet, null, f2, xmlPullParser);
                    } else {
                        if (name.equals(la1.a)) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            TypedArray s = ri.s(resources, theme, attributeSet, y90.a0);
                            b(context, resources, theme, xmlPullParser, attributeSet, animatorSet2, ri.k(s, xmlPullParser, "ordering", 0, 0), f2);
                            s.recycle();
                            valueAnimator = animatorSet2;
                        } else if (name.equals("propertyValuesHolder")) {
                            PropertyValuesHolder[] q = q(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser));
                            if (q != null && (valueAnimator instanceof ValueAnimator)) {
                                valueAnimator.setValues(q);
                            }
                            i3 = 1;
                        } else {
                            StringBuilder G = wo1.G("Unknown animator name: ");
                            G.append(xmlPullParser.getName());
                            throw new RuntimeException(G.toString());
                        }
                        if (animatorSet != null && i3 == 0) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(valueAnimator);
                        }
                    }
                    if (animatorSet != null) {
                        if (arrayList == null) {
                        }
                        arrayList.add(valueAnimator);
                    }
                }
            }
        }
        if (animatorSet != null && arrayList != null) {
            Animator[] animatorArr = new Animator[arrayList.size()];
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                animatorArr[i3] = (Animator) it.next();
                i3++;
            }
            if (i2 == 0) {
                animatorSet.playTogether(animatorArr);
            } else {
                animatorSet.playSequentially(animatorArr);
            }
        }
        return valueAnimator;
    }

    private static Keyframe c(Keyframe keyframe, float f2) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f2);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(f2);
        }
        return Keyframe.ofObject(f2);
    }

    private static void d(Keyframe[] keyframeArr, float f2, int i2, int i3) {
        float f3 = f2 / ((i3 - i2) + 2);
        while (i2 <= i3) {
            keyframeArr[i2].setFraction(keyframeArr[i2 - 1].getFraction() + f3);
            i2++;
        }
    }

    private static void e(Object[] objArr, String str) {
        if (objArr == null || objArr.length == 0) {
            return;
        }
        int length = objArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            Keyframe keyframe = (Keyframe) objArr[i2];
            StringBuilder H = wo1.H("Keyframe ", i2, ": fraction ");
            float fraction = keyframe.getFraction();
            Object obj = pg1.d;
            H.append(fraction < 0.0f ? pg1.d : Float.valueOf(keyframe.getFraction()));
            H.append(", , value : ");
            if (keyframe.hasValue()) {
                obj = keyframe.getValue();
            }
            H.append(obj);
            H.toString();
        }
    }

    private static PropertyValuesHolder f(TypedArray typedArray, int i2, int i3, int i4, String str) {
        int i5;
        PropertyValuesHolder ofInt;
        int i6;
        int i7;
        float f2;
        float f3;
        float f4;
        PropertyValuesHolder ofObject;
        TypedValue peekValue = typedArray.peekValue(i3);
        boolean z = peekValue != null;
        int i8 = z ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i4);
        boolean z2 = peekValue2 != null;
        int i9 = z2 ? peekValue2.type : 0;
        if (i2 == 4) {
            i2 = ((z && i(i8)) || (z2 && i(i9))) ? 3 : 0;
        }
        boolean z3 = i2 == 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i2 == 2) {
            String string = typedArray.getString(i3);
            String string2 = typedArray.getString(i4);
            mj.b[] d2 = mj.d(string);
            mj.b[] d3 = mj.d(string2);
            if (d2 == null && d3 == null) {
                return null;
            }
            if (d2 == null) {
                if (d3 != null) {
                    return PropertyValuesHolder.ofObject(str, new a(), d3);
                }
                return null;
            }
            a aVar = new a();
            if (d3 != null) {
                if (mj.b(d2, d3)) {
                    ofObject = PropertyValuesHolder.ofObject(str, aVar, d2, d3);
                } else {
                    throw new InflateException(wo1.v(" Can't morph from ", string, " to ", string2));
                }
            } else {
                ofObject = PropertyValuesHolder.ofObject(str, aVar, d2);
            }
            return ofObject;
        }
        da0 a2 = i2 == 3 ? da0.a() : null;
        if (z3) {
            if (z) {
                if (i8 == 5) {
                    f3 = typedArray.getDimension(i3, 0.0f);
                } else {
                    f3 = typedArray.getFloat(i3, 0.0f);
                }
                if (z2) {
                    if (i9 == 5) {
                        f4 = typedArray.getDimension(i4, 0.0f);
                    } else {
                        f4 = typedArray.getFloat(i4, 0.0f);
                    }
                    ofInt = PropertyValuesHolder.ofFloat(str, f3, f4);
                } else {
                    ofInt = PropertyValuesHolder.ofFloat(str, f3);
                }
            } else {
                if (i9 == 5) {
                    f2 = typedArray.getDimension(i4, 0.0f);
                } else {
                    f2 = typedArray.getFloat(i4, 0.0f);
                }
                ofInt = PropertyValuesHolder.ofFloat(str, f2);
            }
        } else if (!z) {
            if (z2) {
                if (i9 == 5) {
                    i5 = (int) typedArray.getDimension(i4, 0.0f);
                } else if (i(i9)) {
                    i5 = typedArray.getColor(i4, 0);
                } else {
                    i5 = typedArray.getInt(i4, 0);
                }
                ofInt = PropertyValuesHolder.ofInt(str, i5);
            }
            if (propertyValuesHolder == null && a2 != null) {
                propertyValuesHolder.setEvaluator(a2);
                return propertyValuesHolder;
            }
        } else {
            if (i8 == 5) {
                i6 = (int) typedArray.getDimension(i3, 0.0f);
            } else if (i(i8)) {
                i6 = typedArray.getColor(i3, 0);
            } else {
                i6 = typedArray.getInt(i3, 0);
            }
            if (z2) {
                if (i9 == 5) {
                    i7 = (int) typedArray.getDimension(i4, 0.0f);
                } else if (i(i9)) {
                    i7 = typedArray.getColor(i4, 0);
                } else {
                    i7 = typedArray.getInt(i4, 0);
                }
                ofInt = PropertyValuesHolder.ofInt(str, i6, i7);
            } else {
                ofInt = PropertyValuesHolder.ofInt(str, i6);
            }
        }
        propertyValuesHolder = ofInt;
        return propertyValuesHolder == null ? propertyValuesHolder : propertyValuesHolder;
    }

    private static int g(TypedArray typedArray, int i2, int i3) {
        TypedValue peekValue = typedArray.peekValue(i2);
        boolean z = peekValue != null;
        int i4 = z ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i3);
        boolean z2 = peekValue2 != null;
        return ((z && i(i4)) || (z2 && i(z2 ? peekValue2.type : 0))) ? 3 : 0;
    }

    private static int h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray s = ri.s(resources, theme, attributeSet, y90.h0);
        int i2 = 0;
        TypedValue t = ri.t(s, xmlPullParser, "value", 0);
        if ((t != null) && i(t.type)) {
            i2 = 3;
        }
        s.recycle();
        return i2;
    }

    private static boolean i(int i2) {
        return i2 >= 28 && i2 <= 31;
    }

    public static Animator j(Context context, @m0 int i2) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 24) {
            return AnimatorInflater.loadAnimator(context, i2);
        }
        return k(context, context.getResources(), context.getTheme(), i2);
    }

    public static Animator k(Context context, Resources resources, Resources.Theme theme, @m0 int i2) throws Resources.NotFoundException {
        return l(context, resources, theme, i2, 1.0f);
    }

    public static Animator l(Context context, Resources resources, Resources.Theme theme, @m0 int i2, float f2) throws Resources.NotFoundException {
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = resources.getAnimation(i2);
                    return a(context, resources, theme, xmlResourceParser, f2);
                } catch (IOException e2) {
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i2));
                    notFoundException.initCause(e2);
                    throw notFoundException;
                }
            } catch (XmlPullParserException e3) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i2));
                notFoundException2.initCause(e3);
                throw notFoundException2;
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }

    private static ValueAnimator m(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f2, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        TypedArray s = ri.s(resources, theme, attributeSet, y90.R);
        TypedArray s2 = ri.s(resources, theme, attributeSet, y90.m0);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        r(valueAnimator, s, s2, f2, xmlPullParser);
        int l = ri.l(s, xmlPullParser, "interpolator", 0, 0);
        if (l > 0) {
            valueAnimator.setInterpolator(ba0.b(context, l));
        }
        s.recycle();
        if (s2 != null) {
            s2.recycle();
        }
        return valueAnimator;
    }

    private static Keyframe n(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i2, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        Keyframe ofInt;
        TypedArray s = ri.s(resources, theme, attributeSet, y90.h0);
        float j = ri.j(s, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue t = ri.t(s, xmlPullParser, "value", 0);
        boolean z = t != null;
        if (i2 == 4) {
            i2 = (z && i(t.type)) ? 3 : 0;
        }
        if (z) {
            if (i2 != 0) {
                ofInt = (i2 == 1 || i2 == 3) ? Keyframe.ofInt(j, ri.k(s, xmlPullParser, "value", 0, 0)) : null;
            } else {
                ofInt = Keyframe.ofFloat(j, ri.j(s, xmlPullParser, "value", 0, 0.0f));
            }
        } else if (i2 == 0) {
            ofInt = Keyframe.ofFloat(j);
        } else {
            ofInt = Keyframe.ofInt(j);
        }
        int l = ri.l(s, xmlPullParser, "interpolator", 1, 0);
        if (l > 0) {
            ofInt.setInterpolator(ba0.b(context, l));
        }
        s.recycle();
        return ofInt;
    }

    private static ObjectAnimator o(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f2, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        m(context, resources, theme, attributeSet, objectAnimator, f2, xmlPullParser);
        return objectAnimator;
    }

    private static PropertyValuesHolder p(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, String str, int i2) throws XmlPullParserException, IOException {
        int size;
        PropertyValuesHolder propertyValuesHolder = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                break;
            } else if (xmlPullParser.getName().equals("keyframe")) {
                if (i2 == 4) {
                    i2 = h(resources, theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                Keyframe n = n(context, resources, theme, Xml.asAttributeSet(xmlPullParser), i2, xmlPullParser);
                if (n != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(n);
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null && (size = arrayList.size()) > 0) {
            Keyframe keyframe = (Keyframe) arrayList.get(0);
            Keyframe keyframe2 = (Keyframe) arrayList.get(size - 1);
            float fraction = keyframe2.getFraction();
            if (fraction < 1.0f) {
                if (fraction < 0.0f) {
                    keyframe2.setFraction(1.0f);
                } else {
                    arrayList.add(arrayList.size(), c(keyframe2, 1.0f));
                    size++;
                }
            }
            float fraction2 = keyframe.getFraction();
            if (fraction2 != 0.0f) {
                if (fraction2 < 0.0f) {
                    keyframe.setFraction(0.0f);
                } else {
                    arrayList.add(0, c(keyframe, 0.0f));
                    size++;
                }
            }
            Keyframe[] keyframeArr = new Keyframe[size];
            arrayList.toArray(keyframeArr);
            for (int i3 = 0; i3 < size; i3++) {
                Keyframe keyframe3 = keyframeArr[i3];
                if (keyframe3.getFraction() < 0.0f) {
                    if (i3 == 0) {
                        keyframe3.setFraction(0.0f);
                    } else {
                        int i4 = size - 1;
                        if (i3 == i4) {
                            keyframe3.setFraction(1.0f);
                        } else {
                            int i5 = i3;
                            for (int i6 = i3 + 1; i6 < i4 && keyframeArr[i6].getFraction() < 0.0f; i6++) {
                                i5 = i6;
                            }
                            d(keyframeArr, keyframeArr[i5 + 1].getFraction() - keyframeArr[i3 - 1].getFraction(), i3, i5);
                        }
                    }
                }
            }
            propertyValuesHolder = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
            if (i2 == 3) {
                propertyValuesHolder.setEvaluator(da0.a());
            }
        }
        return propertyValuesHolder;
    }

    private static PropertyValuesHolder[] q(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int i2;
        PropertyValuesHolder[] propertyValuesHolderArr = null;
        ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            if (eventType == 3 || eventType == 1) {
                break;
            } else if (eventType != 2) {
                xmlPullParser.next();
            } else {
                if (xmlPullParser.getName().equals("propertyValuesHolder")) {
                    TypedArray s = ri.s(resources, theme, attributeSet, y90.c0);
                    String m = ri.m(s, xmlPullParser, "propertyName", 3);
                    int k = ri.k(s, xmlPullParser, "valueType", 2, 4);
                    PropertyValuesHolder p = p(context, resources, theme, xmlPullParser, m, k);
                    if (p == null) {
                        p = f(s, k, 0, 1, m);
                    }
                    if (p != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(p);
                    }
                    s.recycle();
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            propertyValuesHolderArr = new PropertyValuesHolder[size];
            for (i2 = 0; i2 < size; i2++) {
                propertyValuesHolderArr[i2] = (PropertyValuesHolder) arrayList.get(i2);
            }
        }
        return propertyValuesHolderArr;
    }

    private static void r(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f2, XmlPullParser xmlPullParser) {
        long k = ri.k(typedArray, xmlPullParser, "duration", 1, 300);
        long k2 = ri.k(typedArray, xmlPullParser, "startOffset", 2, 0);
        int k3 = ri.k(typedArray, xmlPullParser, "valueType", 7, 4);
        if (ri.r(xmlPullParser, "valueFrom") && ri.r(xmlPullParser, "valueTo")) {
            if (k3 == 4) {
                k3 = g(typedArray, 5, 6);
            }
            PropertyValuesHolder f3 = f(typedArray, k3, 5, 6, "");
            if (f3 != null) {
                valueAnimator.setValues(f3);
            }
        }
        valueAnimator.setDuration(k);
        valueAnimator.setStartDelay(k2);
        valueAnimator.setRepeatCount(ri.k(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(ri.k(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            s(valueAnimator, typedArray2, k3, f2, xmlPullParser);
        }
    }

    private static void s(ValueAnimator valueAnimator, TypedArray typedArray, int i2, float f2, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String m = ri.m(typedArray, xmlPullParser, "pathData", 1);
        if (m != null) {
            String m2 = ri.m(typedArray, xmlPullParser, "propertyXName", 2);
            String m3 = ri.m(typedArray, xmlPullParser, "propertyYName", 3);
            if (i2 != 2) {
            }
            if (m2 == null && m3 == null) {
                throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
            }
            t(mj.e(m), objectAnimator, f2 * 0.5f, m2, m3);
            return;
        }
        objectAnimator.setPropertyName(ri.m(typedArray, xmlPullParser, "propertyName", 0));
    }

    private static void t(Path path, ObjectAnimator objectAnimator, float f2, String str, String str2) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        float f3 = 0.0f;
        arrayList.add(Float.valueOf(0.0f));
        float f4 = 0.0f;
        do {
            f4 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f4));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int min = Math.min(100, ((int) (f4 / f2)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f5 = f4 / (min - 1);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= min) {
                break;
            }
            pathMeasure2.getPosTan(f3 - ((Float) arrayList.get(i3)).floatValue(), fArr3, null);
            fArr[i2] = fArr3[0];
            fArr2[i2] = fArr3[1];
            f3 += f5;
            int i4 = i3 + 1;
            if (i4 < arrayList.size() && f3 > ((Float) arrayList.get(i4)).floatValue()) {
                pathMeasure2.nextContour();
                i3 = i4;
            }
            i2++;
        }
        PropertyValuesHolder ofFloat = str != null ? PropertyValuesHolder.ofFloat(str, fArr) : null;
        PropertyValuesHolder ofFloat2 = str2 != null ? PropertyValuesHolder.ofFloat(str2, fArr2) : null;
        if (ofFloat == null) {
            objectAnimator.setValues(ofFloat2);
        } else if (ofFloat2 == null) {
            objectAnimator.setValues(ofFloat);
        } else {
            objectAnimator.setValues(ofFloat, ofFloat2);
        }
    }
}