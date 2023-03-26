package com.p7700g.p99005;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.p7700g.p99005.i2;
import java.lang.ref.WeakReference;

/* compiled from: TextDrawableHelper.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class ze2 {
    private float c;
    @z1
    private tg2 f;
    private final TextPaint a = new TextPaint(1);
    private final vg2 b = new a();
    private boolean d = true;
    @z1
    private WeakReference<b> e = new WeakReference<>(null);

    /* compiled from: TextDrawableHelper.java */
    /* loaded from: classes3.dex */
    public class a extends vg2 {
        public a() {
        }

        @Override // com.p7700g.p99005.vg2
        public void a(int i) {
            ze2.this.d = true;
            b bVar = (b) ze2.this.e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // com.p7700g.p99005.vg2
        public void b(@x1 Typeface typeface, boolean z) {
            if (z) {
                return;
            }
            ze2.this.d = true;
            b bVar = (b) ze2.this.e.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    /* compiled from: TextDrawableHelper.java */
    /* loaded from: classes3.dex */
    public interface b {
        void a();

        @x1
        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public ze2(@z1 b bVar) {
        h(bVar);
    }

    private float c(@z1 CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.a.measureText(charSequence, 0, charSequence.length());
    }

    @z1
    public tg2 d() {
        return this.f;
    }

    @x1
    public TextPaint e() {
        return this.a;
    }

    public float f(String str) {
        if (!this.d) {
            return this.c;
        }
        float c = c(str);
        this.c = c;
        this.d = false;
        return c;
    }

    public boolean g() {
        return this.d;
    }

    public void h(@z1 b bVar) {
        this.e = new WeakReference<>(bVar);
    }

    public void i(@z1 tg2 tg2Var, Context context) {
        if (this.f != tg2Var) {
            this.f = tg2Var;
            if (tg2Var != null) {
                tg2Var.o(context, this.a, this.b);
                b bVar = this.e.get();
                if (bVar != null) {
                    this.a.drawableState = bVar.getState();
                }
                tg2Var.n(context, this.a, this.b);
                this.d = true;
            }
            b bVar2 = this.e.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void j(boolean z) {
        this.d = z;
    }

    public void k(Context context) {
        this.f.n(context, this.a, this.b);
    }
}