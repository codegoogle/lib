package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import com.p7700g.p99005.i2;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: SpannableBuilder.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class nv extends SpannableStringBuilder {
    @x1
    private final Class<?> s;
    @x1
    private final List<a> t;

    /* compiled from: SpannableBuilder.java */
    /* loaded from: classes.dex */
    public static class a implements TextWatcher, SpanWatcher {
        public final Object s;
        private final AtomicInteger t = new AtomicInteger(0);

        public a(Object obj) {
            this.s = obj;
        }

        private boolean b(Object obj) {
            return obj instanceof jv;
        }

        public final void a() {
            this.t.incrementAndGet();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.s).afterTextChanged(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.s).beforeTextChanged(charSequence, i, i2, i3);
        }

        public final void c() {
            this.t.decrementAndGet();
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
            if (this.t.get() <= 0 || !b(obj)) {
                ((SpanWatcher) this.s).onSpanAdded(spannable, obj, i, i2);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            if (this.t.get() <= 0 || !b(obj)) {
                if (Build.VERSION.SDK_INT < 28) {
                    int i7 = i > i2 ? 0 : i;
                    if (i3 > i4) {
                        i5 = i7;
                        i6 = 0;
                    } else {
                        i6 = i3;
                        i5 = i7;
                    }
                } else {
                    i5 = i;
                    i6 = i3;
                }
                ((SpanWatcher) this.s).onSpanChanged(spannable, obj, i5, i2, i6, i4);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
            if (this.t.get() <= 0 || !b(obj)) {
                ((SpanWatcher) this.s).onSpanRemoved(spannable, obj, i, i2);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.s).onTextChanged(charSequence, i, i2, i3);
        }
    }

    @i2({i2.a.LIBRARY})
    public nv(@x1 Class<?> cls) {
        this.t = new ArrayList();
        jp.m(cls, "watcherClass cannot be null");
        this.s = cls;
    }

    private void b() {
        for (int i = 0; i < this.t.size(); i++) {
            this.t.get(i).a();
        }
    }

    @i2({i2.a.LIBRARY_GROUP})
    @x1
    public static nv c(@x1 Class<?> cls, @x1 CharSequence charSequence) {
        return new nv(cls, charSequence);
    }

    private void e() {
        for (int i = 0; i < this.t.size(); i++) {
            this.t.get(i).onTextChanged(this, 0, length(), length());
        }
    }

    private a f(Object obj) {
        for (int i = 0; i < this.t.size(); i++) {
            a aVar = this.t.get(i);
            if (aVar.s == obj) {
                return aVar;
            }
        }
        return null;
    }

    private boolean g(@x1 Class<?> cls) {
        return this.s == cls;
    }

    private boolean h(@z1 Object obj) {
        return obj != null && g(obj.getClass());
    }

    private void i() {
        for (int i = 0; i < this.t.size(); i++) {
            this.t.get(i).c();
        }
    }

    @i2({i2.a.LIBRARY})
    public void a() {
        b();
    }

    @i2({i2.a.LIBRARY})
    public void d() {
        i();
        e();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanEnd(@z1 Object obj) {
        a f;
        if (h(obj) && (f = f(obj)) != null) {
            obj = f;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanFlags(@z1 Object obj) {
        a f;
        if (h(obj) && (f = f(obj)) != null) {
            obj = f;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanStart(@z1 Object obj) {
        a f;
        if (h(obj) && (f = f(obj)) != null) {
            obj = f;
        }
        return super.getSpanStart(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    @SuppressLint({"UnknownNullness"})
    public <T> T[] getSpans(int i, int i2, @x1 Class<T> cls) {
        if (g(cls)) {
            a[] aVarArr = (a[]) super.getSpans(i, i2, a.class);
            T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, aVarArr.length));
            for (int i3 = 0; i3 < aVarArr.length; i3++) {
                tArr[i3] = aVarArr[i3].s;
            }
            return tArr;
        }
        return (T[]) super.getSpans(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int nextSpanTransition(int i, int i2, @z1 Class cls) {
        return super.nextSpanTransition(i, i2, (cls == null || g(cls)) ? a.class : a.class);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void removeSpan(@z1 Object obj) {
        a aVar;
        if (h(obj)) {
            aVar = f(obj);
            if (aVar != null) {
                obj = aVar;
            }
        } else {
            aVar = null;
        }
        super.removeSpan(obj);
        if (aVar != null) {
            this.t.remove(aVar);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(@z1 Object obj, int i, int i2, int i3) {
        if (h(obj)) {
            a aVar = new a(obj);
            this.t.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    @SuppressLint({"UnknownNullness"})
    public CharSequence subSequence(int i, int i2) {
        return new nv(this.s, this, i, i2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        b();
        super.replace(i, i2, charSequence);
        i();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @i2({i2.a.LIBRARY})
    public nv(@x1 Class<?> cls, @x1 CharSequence charSequence) {
        super(charSequence);
        this.t = new ArrayList();
        jp.m(cls, "watcherClass cannot be null");
        this.s = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        b();
        super.replace(i, i2, charSequence, i3, i4);
        i();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @x1
    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @x1
    public SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    @i2({i2.a.LIBRARY})
    public nv(@x1 Class<?> cls, @x1 CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        this.t = new ArrayList();
        jp.m(cls, "watcherClass cannot be null");
        this.s = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @x1
    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}