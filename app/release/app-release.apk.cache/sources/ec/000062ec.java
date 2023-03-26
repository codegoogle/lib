package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.widget.ResourceManagerInternal;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.t3;
import com.p7700g.p99005.x3;
import com.p7700g.p99005.y3;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: StateListDrawable.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
@SuppressLint({"RestrictedAPI"})
/* loaded from: classes.dex */
public class w3 extends t3 {
    private static final String H = "StateListDrawable";
    private static final boolean I = false;
    private a J;
    private boolean K;

    /* compiled from: StateListDrawable.java */
    /* loaded from: classes.dex */
    public static class a extends t3.d {
        public int[][] J;

        public a(a aVar, w3 w3Var, Resources resources) {
            super(aVar, w3Var, resources);
            if (aVar != null) {
                this.J = aVar.J;
            } else {
                this.J = new int[g()];
            }
        }

        public int D(int[] iArr, Drawable drawable) {
            int a = a(drawable);
            this.J[a] = iArr;
            return a;
        }

        public int E(int[] iArr) {
            int[][] iArr2 = this.J;
            int i = i();
            for (int i2 = 0; i2 < i; i2++) {
                if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                    return i2;
                }
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @x1
        public Drawable newDrawable() {
            return new w3(this, null);
        }

        @Override // com.p7700g.p99005.t3.d
        public void r(int i, int i2) {
            super.r(i, i2);
            int[][] iArr = new int[i2];
            System.arraycopy(this.J, 0, iArr, 0, i);
            this.J = iArr;
        }

        @Override // com.p7700g.p99005.t3.d
        public void v() {
            int[][] iArr = this.J;
            int[][] iArr2 = new int[iArr.length];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.J;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.J = iArr2;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @x1
        public Drawable newDrawable(Resources resources) {
            return new w3(this, resources);
        }
    }

    public w3() {
        this(null, null);
    }

    private void w(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        a aVar = this.J;
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next2 = xmlPullParser.next();
            if (next2 == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next2 == 3) {
                return;
            }
            if (next2 == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                TypedArray s = ri.s(resources, theme, attributeSet, y3.b.w);
                int resourceId = s.getResourceId(y3.b.x, -1);
                Drawable drawable = resourceId > 0 ? ResourceManagerInternal.get().getDrawable(context, resourceId) : null;
                s.recycle();
                int[] p = p(attributeSet);
                if (drawable == null) {
                    do {
                        next = xmlPullParser.next();
                    } while (next == 4);
                    if (next == 2) {
                        drawable = x3.c.a(resources, xmlPullParser, attributeSet, theme);
                    } else {
                        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                    }
                }
                aVar.D(p, drawable);
            }
        }
    }

    private void x(TypedArray typedArray) {
        a aVar = this.J;
        aVar.d |= x3.c.b(typedArray);
        aVar.i = typedArray.getBoolean(y3.b.s, aVar.i);
        aVar.l = typedArray.getBoolean(y3.b.t, aVar.l);
        aVar.A = typedArray.getInt(y3.b.u, aVar.A);
        aVar.B = typedArray.getInt(y3.b.v, aVar.B);
        aVar.x = typedArray.getBoolean(y3.b.q, aVar.x);
    }

    @Override // com.p7700g.p99005.t3, android.graphics.drawable.Drawable
    @e2(21)
    public void applyTheme(@x1 Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // com.p7700g.p99005.t3
    public void b() {
        super.b();
        this.K = false;
    }

    @Override // com.p7700g.p99005.t3
    public void i(@x1 t3.d dVar) {
        super.i(dVar);
        if (dVar instanceof a) {
            this.J = (a) dVar;
        }
    }

    @Override // com.p7700g.p99005.t3, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // com.p7700g.p99005.t3, android.graphics.drawable.Drawable
    @x1
    public Drawable mutate() {
        if (!this.K && super.mutate() == this) {
            this.J.v();
            this.K = true;
        }
        return this;
    }

    public void n(int[] iArr, Drawable drawable) {
        if (drawable != null) {
            this.J.D(iArr, drawable);
            onStateChange(getState());
        }
    }

    @Override // com.p7700g.p99005.t3
    /* renamed from: o */
    public a c() {
        return new a(this.J, this, null);
    }

    @Override // com.p7700g.p99005.t3, android.graphics.drawable.Drawable
    public boolean onStateChange(@x1 int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int E = this.J.E(iArr);
        if (E < 0) {
            E = this.J.E(StateSet.WILD_CARD);
        }
        return h(E) || onStateChange;
    }

    public int[] p(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i = 0;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                int i3 = i + 1;
                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i] = attributeNameResource;
                i = i3;
            }
        }
        return StateSet.trimStateSet(iArr, i);
    }

    public int q() {
        return this.J.i();
    }

    public Drawable r(int i) {
        return this.J.h(i);
    }

    public int s(int[] iArr) {
        return this.J.E(iArr);
    }

    public a t() {
        return this.J;
    }

    public int[] u(int i) {
        return this.J.J[i];
    }

    public void v(@x1 Context context, @x1 Resources resources, @x1 XmlPullParser xmlPullParser, @x1 AttributeSet attributeSet, @z1 Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray s = ri.s(resources, theme, attributeSet, y3.b.p);
        setVisible(s.getBoolean(y3.b.r, true), true);
        x(s);
        m(resources);
        s.recycle();
        w(context, resources, xmlPullParser, attributeSet, theme);
        onStateChange(getState());
    }

    public w3(a aVar, Resources resources) {
        i(new a(aVar, this, resources));
        onStateChange(getState());
    }

    public w3(@z1 a aVar) {
        if (aVar != null) {
            i(aVar);
        }
    }
}