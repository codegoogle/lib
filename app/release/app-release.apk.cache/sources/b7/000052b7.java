package com.p7700g.p99005;

import android.graphics.Color;
import com.p7700g.p99005.po0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: GradientColorParser.java */
/* loaded from: classes.dex */
public class nn0 implements mo0<ql0> {
    private int a;

    public nn0(int i) {
        this.a = i;
    }

    private ql0 b(ql0 ql0Var, List<Float> list) {
        int i = this.a * 4;
        if (list.size() <= i) {
            return ql0Var;
        }
        float[] b = ql0Var.b();
        int[] a = ql0Var.a();
        int size = (list.size() - i) / 2;
        float[] fArr = new float[size];
        float[] fArr2 = new float[size];
        int i2 = 0;
        while (i < list.size()) {
            if (i % 2 == 0) {
                fArr[i2] = list.get(i).floatValue();
            } else {
                fArr2[i2] = list.get(i).floatValue();
                i2++;
            }
            i++;
        }
        float[] e = e(ql0Var.b(), fArr);
        int length = e.length;
        int[] iArr = new int[length];
        for (int i3 = 0; i3 < length; i3++) {
            float f = e[i3];
            int binarySearch = Arrays.binarySearch(b, f);
            int binarySearch2 = Arrays.binarySearch(fArr, f);
            if (binarySearch >= 0 && binarySearch2 <= 0) {
                iArr[i3] = d(f, a[binarySearch], fArr, fArr2);
            } else {
                if (binarySearch2 < 0) {
                    binarySearch2 = -(binarySearch2 + 1);
                }
                iArr[i3] = c(f, fArr2[binarySearch2], b, a);
            }
        }
        return new ql0(e, iArr);
    }

    private int c(float f, float f2, float[] fArr, int[] iArr) {
        if (iArr.length >= 2 && f != fArr[0]) {
            for (int i = 1; i < fArr.length; i++) {
                if (fArr[i] >= f || i == fArr.length - 1) {
                    int i2 = i - 1;
                    float f3 = (f - fArr[i2]) / (fArr[i] - fArr[i2]);
                    int i3 = iArr[i];
                    int i4 = iArr[i2];
                    return Color.argb((int) (f2 * 255.0f), bp0.l(Color.red(i4), Color.red(i3), f3), bp0.l(Color.green(i4), Color.green(i3), f3), bp0.l(Color.blue(i4), Color.blue(i3), f3));
                }
            }
            throw new IllegalArgumentException("Unreachable code.");
        }
        return iArr[0];
    }

    private int d(float f, int i, float[] fArr, float[] fArr2) {
        float k;
        if (fArr2.length >= 2 && f > fArr[0]) {
            for (int i2 = 1; i2 < fArr.length; i2++) {
                int i3 = (fArr[i2] > f ? 1 : (fArr[i2] == f ? 0 : -1));
                if (i3 >= 0 || i2 == fArr.length - 1) {
                    if (i3 <= 0) {
                        k = fArr2[i2];
                    } else {
                        int i4 = i2 - 1;
                        k = bp0.k(fArr2[i4], fArr2[i2], (f - fArr[i4]) / (fArr[i2] - fArr[i4]));
                    }
                    return Color.argb((int) (k * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
                }
            }
            throw new IllegalArgumentException("Unreachable code.");
        }
        return Color.argb((int) (fArr2[0] * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
    }

    public static float[] e(float[] fArr, float[] fArr2) {
        if (fArr.length == 0) {
            return fArr2;
        }
        if (fArr2.length == 0) {
            return fArr;
        }
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            float f = i2 < fArr.length ? fArr[i2] : Float.NaN;
            float f2 = i3 < fArr2.length ? fArr2[i3] : Float.NaN;
            if (!Float.isNaN(f2) && f >= f2) {
                if (!Float.isNaN(f) && f2 >= f) {
                    fArr3[i4] = f;
                    i2++;
                    i3++;
                    i++;
                } else {
                    fArr3[i4] = f2;
                    i3++;
                }
            } else {
                fArr3[i4] = f;
                i2++;
            }
        }
        return i == 0 ? fArr3 : Arrays.copyOf(fArr3, length - i);
    }

    @Override // com.p7700g.p99005.mo0
    /* renamed from: f */
    public ql0 a(po0 po0Var, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        boolean z = po0Var.s() == po0.b.BEGIN_ARRAY;
        if (z) {
            po0Var.b();
        }
        while (po0Var.h()) {
            arrayList.add(Float.valueOf((float) po0Var.k()));
        }
        if (arrayList.size() == 4 && ((Float) arrayList.get(0)).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add((Float) arrayList.get(1));
            arrayList.add((Float) arrayList.get(2));
            arrayList.add((Float) arrayList.get(3));
            this.a = 2;
        }
        if (z) {
            po0Var.e();
        }
        if (this.a == -1) {
            this.a = arrayList.size() / 4;
        }
        int i = this.a;
        float[] fArr = new float[i];
        int[] iArr = new int[i];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.a * 4; i4++) {
            int i5 = i4 / 4;
            double floatValue = ((Float) arrayList.get(i4)).floatValue();
            int i6 = i4 % 4;
            if (i6 == 0) {
                if (i5 > 0) {
                    float f2 = (float) floatValue;
                    if (fArr[i5 - 1] >= f2) {
                        fArr[i5] = f2 + 0.01f;
                    }
                }
                fArr[i5] = (float) floatValue;
            } else if (i6 == 1) {
                i2 = (int) (floatValue * 255.0d);
            } else if (i6 == 2) {
                i3 = (int) (floatValue * 255.0d);
            } else if (i6 == 3) {
                iArr[i5] = Color.argb(255, i2, i3, (int) (floatValue * 255.0d));
            }
        }
        return b(new ql0(fArr, iArr), arrayList);
    }
}