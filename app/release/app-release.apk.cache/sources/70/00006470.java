package com.p7700g.p99005;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import com.p7700g.p99005.i2;

/* compiled from: EmojiTextViewHelper.java */
/* loaded from: classes.dex */
public final class ww {
    private final b a;

    /* compiled from: EmojiTextViewHelper.java */
    @e2(19)
    /* loaded from: classes.dex */
    public static class a extends b {
        private final TextView a;
        private final uw b;
        private boolean c = true;

        public a(TextView textView) {
            this.a = textView;
            this.b = new uw(textView);
        }

        @x1
        private InputFilter[] g(@x1 InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.b;
            return inputFilterArr2;
        }

        private SparseArray<InputFilter> h(@x1 InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArray = new SparseArray<>(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                if (inputFilterArr[i] instanceof uw) {
                    sparseArray.put(i, inputFilterArr[i]);
                }
            }
            return sparseArray;
        }

        @x1
        private InputFilter[] i(@x1 InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> h = h(inputFilterArr);
            if (h.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - h.size()];
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (h.indexOfKey(i2) < 0) {
                    inputFilterArr2[i] = inputFilterArr[i2];
                    i++;
                }
            }
            return inputFilterArr2;
        }

        @z1
        private TransformationMethod k(@z1 TransformationMethod transformationMethod) {
            return transformationMethod instanceof yw ? ((yw) transformationMethod).a() : transformationMethod;
        }

        private void l() {
            this.a.setFilters(a(this.a.getFilters()));
        }

        @x1
        private TransformationMethod m(@z1 TransformationMethod transformationMethod) {
            return ((transformationMethod instanceof yw) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new yw(transformationMethod);
        }

        @Override // com.p7700g.p99005.ww.b
        @x1
        public InputFilter[] a(@x1 InputFilter[] inputFilterArr) {
            if (!this.c) {
                return i(inputFilterArr);
            }
            return g(inputFilterArr);
        }

        @Override // com.p7700g.p99005.ww.b
        public boolean b() {
            return this.c;
        }

        @Override // com.p7700g.p99005.ww.b
        public void c(boolean z) {
            if (z) {
                e();
            }
        }

        @Override // com.p7700g.p99005.ww.b
        public void d(boolean z) {
            this.c = z;
            e();
            l();
        }

        @Override // com.p7700g.p99005.ww.b
        public void e() {
            this.a.setTransformationMethod(f(this.a.getTransformationMethod()));
        }

        @Override // com.p7700g.p99005.ww.b
        @z1
        public TransformationMethod f(@z1 TransformationMethod transformationMethod) {
            if (this.c) {
                return m(transformationMethod);
            }
            return k(transformationMethod);
        }

        @i2({i2.a.LIBRARY})
        public void j(boolean z) {
            this.c = z;
        }
    }

    /* compiled from: EmojiTextViewHelper.java */
    /* loaded from: classes.dex */
    public static class b {
        @x1
        public InputFilter[] a(@x1 InputFilter[] inputFilterArr) {
            return inputFilterArr;
        }

        public boolean b() {
            return false;
        }

        public void c(boolean z) {
        }

        public void d(boolean z) {
        }

        public void e() {
        }

        @z1
        public TransformationMethod f(@z1 TransformationMethod transformationMethod) {
            return transformationMethod;
        }
    }

    /* compiled from: EmojiTextViewHelper.java */
    @e2(19)
    /* loaded from: classes.dex */
    public static class c extends b {
        private final a a;

        public c(TextView textView) {
            this.a = new a(textView);
        }

        private boolean g() {
            return !fv.n();
        }

        @Override // com.p7700g.p99005.ww.b
        @x1
        public InputFilter[] a(@x1 InputFilter[] inputFilterArr) {
            return g() ? inputFilterArr : this.a.a(inputFilterArr);
        }

        @Override // com.p7700g.p99005.ww.b
        public boolean b() {
            return this.a.b();
        }

        @Override // com.p7700g.p99005.ww.b
        public void c(boolean z) {
            if (g()) {
                return;
            }
            this.a.c(z);
        }

        @Override // com.p7700g.p99005.ww.b
        public void d(boolean z) {
            if (g()) {
                this.a.j(z);
            } else {
                this.a.d(z);
            }
        }

        @Override // com.p7700g.p99005.ww.b
        public void e() {
            if (g()) {
                return;
            }
            this.a.e();
        }

        @Override // com.p7700g.p99005.ww.b
        @z1
        public TransformationMethod f(@z1 TransformationMethod transformationMethod) {
            return g() ? transformationMethod : this.a.f(transformationMethod);
        }
    }

    public ww(@x1 TextView textView) {
        this(textView, true);
    }

    @x1
    public InputFilter[] a(@x1 InputFilter[] inputFilterArr) {
        return this.a.a(inputFilterArr);
    }

    public boolean b() {
        return this.a.b();
    }

    public void c(boolean z) {
        this.a.c(z);
    }

    public void d(boolean z) {
        this.a.d(z);
    }

    public void e() {
        this.a.e();
    }

    @z1
    public TransformationMethod f(@z1 TransformationMethod transformationMethod) {
        return this.a.f(transformationMethod);
    }

    public ww(@x1 TextView textView, boolean z) {
        jp.m(textView, "textView cannot be null");
        if (!z) {
            this.a = new c(textView);
        } else {
            this.a = new a(textView);
        }
    }
}