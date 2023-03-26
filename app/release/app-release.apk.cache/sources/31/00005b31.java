package com.p7700g.p99005;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import androidx.appcompat.widget.ResourceManagerInternal;
import com.p7700g.p99005.t3;
import com.p7700g.p99005.w3;
import com.p7700g.p99005.x3;
import com.p7700g.p99005.y3;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: AnimatedStateListDrawableCompat.java */
/* loaded from: classes.dex */
public class s3 extends w3 implements lk {
    private static final String L = s3.class.getSimpleName();
    private static final String M = "transition";
    private static final String N = "item";
    private static final String O = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable";
    private static final String P = ": <transition> tag requires 'fromId' & 'toId' attributes";
    private static final String Q = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable";
    private c R;
    private g S;
    private int T;
    private int U;
    private boolean V;

    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class b extends g {
        private final Animatable a;

        public b(Animatable animatable) {
            super();
            this.a = animatable;
        }

        @Override // com.p7700g.p99005.s3.g
        public void c() {
            this.a.start();
        }

        @Override // com.p7700g.p99005.s3.g
        public void d() {
            this.a.stop();
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class c extends w3.a {
        private static final long K = 4294967296L;
        private static final long L = 8589934592L;
        public v7<Long> M;
        public z7<Integer> N;

        public c(@z1 c cVar, @x1 s3 s3Var, @z1 Resources resources) {
            super(cVar, s3Var, resources);
            if (cVar != null) {
                this.M = cVar.M;
                this.N = cVar.N;
                return;
            }
            this.M = new v7<>();
            this.N = new z7<>();
        }

        private static long H(int i, int i2) {
            return i2 | (i << 32);
        }

        public int F(@x1 int[] iArr, @x1 Drawable drawable, int i) {
            int D = super.D(iArr, drawable);
            this.N.u(D, Integer.valueOf(i));
            return D;
        }

        public int G(int i, int i2, @x1 Drawable drawable, boolean z) {
            int a = super.a(drawable);
            long H = H(i, i2);
            long j = z ? L : 0L;
            long j2 = a;
            this.M.a(H, Long.valueOf(j2 | j));
            if (z) {
                this.M.a(H(i2, i), Long.valueOf(K | j2 | j));
            }
            return a;
        }

        public int I(int i) {
            if (i < 0) {
                return 0;
            }
            return this.N.i(i, 0).intValue();
        }

        public int J(@x1 int[] iArr) {
            int E = super.E(iArr);
            return E >= 0 ? E : super.E(StateSet.WILD_CARD);
        }

        public int K(int i, int i2) {
            return (int) this.M.i(H(i, i2), -1L).longValue();
        }

        public boolean L(int i, int i2) {
            return (this.M.i(H(i, i2), -1L).longValue() & K) != 0;
        }

        public boolean M(int i, int i2) {
            return (this.M.i(H(i, i2), -1L).longValue() & L) != 0;
        }

        @Override // com.p7700g.p99005.w3.a, android.graphics.drawable.Drawable.ConstantState
        @x1
        public Drawable newDrawable() {
            return new s3(this, null);
        }

        @Override // com.p7700g.p99005.w3.a, com.p7700g.p99005.t3.d
        public void v() {
            this.M = this.M.clone();
            this.N = this.N.clone();
        }

        @Override // com.p7700g.p99005.w3.a, android.graphics.drawable.Drawable.ConstantState
        @x1
        public Drawable newDrawable(Resources resources) {
            return new s3(this, resources);
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class d extends g {
        private final aa0 a;

        public d(aa0 aa0Var) {
            super();
            this.a = aa0Var;
        }

        @Override // com.p7700g.p99005.s3.g
        public void c() {
            this.a.start();
        }

        @Override // com.p7700g.p99005.s3.g
        public void d() {
            this.a.stop();
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class e extends g {
        private final ObjectAnimator a;
        private final boolean b;

        public e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
            x3.b.a(ofInt, true);
            ofInt.setDuration(fVar.a());
            ofInt.setInterpolator(fVar);
            this.b = z2;
            this.a = ofInt;
        }

        @Override // com.p7700g.p99005.s3.g
        public boolean a() {
            return this.b;
        }

        @Override // com.p7700g.p99005.s3.g
        public void b() {
            this.a.reverse();
        }

        @Override // com.p7700g.p99005.s3.g
        public void c() {
            this.a.start();
        }

        @Override // com.p7700g.p99005.s3.g
        public void d() {
            this.a.cancel();
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class f implements TimeInterpolator {
        private int[] a;
        private int b;
        private int c;

        public f(AnimationDrawable animationDrawable, boolean z) {
            b(animationDrawable, z);
        }

        public int a() {
            return this.c;
        }

        public int b(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.b = numberOfFrames;
            int[] iArr = this.a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.a = new int[numberOfFrames];
            }
            int[] iArr2 = this.a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.c = i;
            return i;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            int i = (int) ((f * this.c) + 0.5f);
            int i2 = this.b;
            int[] iArr = this.a;
            int i3 = 0;
            while (i3 < i2 && i >= iArr[i3]) {
                i -= iArr[i3];
                i3++;
            }
            return (i3 / i2) + (i3 < i2 ? i / this.c : 0.0f);
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* loaded from: classes.dex */
    public static abstract class g {
        private g() {
        }

        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    public s3() {
        this(null, null);
    }

    @z1
    public static s3 B(@x1 Context context, @f1 int i, @z1 Resources.Theme theme) {
        int next;
        try {
            Resources resources = context.getResources();
            XmlResourceParser xml = resources.getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            while (true) {
                next = xml.next();
                if (next == 2 || next == 1) {
                    break;
                }
            }
            if (next == 2) {
                return C(context, resources, xml, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException unused) {
            return null;
        }
    }

    @x1
    public static s3 C(@x1 Context context, @x1 Resources resources, @x1 XmlPullParser xmlPullParser, @x1 AttributeSet attributeSet, @z1 Resources.Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            s3 s3Var = new s3();
            s3Var.v(context, resources, xmlPullParser, attributeSet, theme);
            return s3Var;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    private void D() {
        onStateChange(getState());
    }

    private int E(@x1 Context context, @x1 Resources resources, @x1 XmlPullParser xmlPullParser, @x1 AttributeSet attributeSet, @z1 Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray s = ri.s(resources, theme, attributeSet, y3.b.h);
        int resourceId = s.getResourceId(y3.b.i, 0);
        int resourceId2 = s.getResourceId(y3.b.j, -1);
        Drawable drawable = resourceId2 > 0 ? ResourceManagerInternal.get().getDrawable(context, resourceId2) : null;
        s.recycle();
        int[] p = p(attributeSet);
        if (drawable == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                if (xmlPullParser.getName().equals("vector")) {
                    drawable = ga0.f(resources, xmlPullParser, attributeSet, theme);
                } else {
                    drawable = x3.c.a(resources, xmlPullParser, attributeSet, theme);
                }
            } else {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + Q);
            }
        }
        if (drawable != null) {
            return this.R.F(p, drawable, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + Q);
    }

    private int F(@x1 Context context, @x1 Resources resources, @x1 XmlPullParser xmlPullParser, @x1 AttributeSet attributeSet, @z1 Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray s = ri.s(resources, theme, attributeSet, y3.b.k);
        int resourceId = s.getResourceId(y3.b.n, -1);
        int resourceId2 = s.getResourceId(y3.b.m, -1);
        int resourceId3 = s.getResourceId(y3.b.l, -1);
        Drawable drawable = resourceId3 > 0 ? ResourceManagerInternal.get().getDrawable(context, resourceId3) : null;
        boolean z = s.getBoolean(y3.b.o, false);
        s.recycle();
        if (drawable == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                if (xmlPullParser.getName().equals("animated-vector")) {
                    drawable = aa0.f(context, resources, xmlPullParser, attributeSet, theme);
                } else {
                    drawable = x3.c.a(resources, xmlPullParser, attributeSet, theme);
                }
            } else {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + O);
            }
        }
        if (drawable == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + O);
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.R.G(resourceId, resourceId2, drawable, z);
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + P);
        }
    }

    private boolean G(int i) {
        int d2;
        int K;
        g bVar;
        g gVar = this.S;
        if (gVar != null) {
            if (i == this.T) {
                return true;
            }
            if (i == this.U && gVar.a()) {
                gVar.b();
                this.T = this.U;
                this.U = i;
                return true;
            }
            d2 = this.T;
            gVar.d();
        } else {
            d2 = d();
        }
        this.S = null;
        this.U = -1;
        this.T = -1;
        c cVar = this.R;
        int I = cVar.I(d2);
        int I2 = cVar.I(i);
        if (I2 == 0 || I == 0 || (K = cVar.K(I, I2)) < 0) {
            return false;
        }
        boolean M2 = cVar.M(I, I2);
        h(K);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            bVar = new e((AnimationDrawable) current, cVar.L(I, I2), M2);
        } else if (current instanceof aa0) {
            bVar = new d((aa0) current);
        } else {
            if (current instanceof Animatable) {
                bVar = new b((Animatable) current);
            }
            return false;
        }
        bVar.c();
        this.S = bVar;
        this.U = d2;
        this.T = i;
        return true;
    }

    private void w(@x1 Context context, @x1 Resources resources, @x1 XmlPullParser xmlPullParser, @x1 AttributeSet attributeSet, @z1 Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth) {
                if (xmlPullParser.getName().equals(N)) {
                    E(context, resources, xmlPullParser, attributeSet, theme);
                } else if (xmlPullParser.getName().equals(M)) {
                    F(context, resources, xmlPullParser, attributeSet, theme);
                }
            }
        }
    }

    private void x(TypedArray typedArray) {
        c cVar = this.R;
        cVar.d |= x3.c.b(typedArray);
        cVar.B(typedArray.getBoolean(y3.b.d, cVar.i));
        cVar.x(typedArray.getBoolean(y3.b.e, cVar.l));
        cVar.y(typedArray.getInt(y3.b.f, cVar.A));
        cVar.z(typedArray.getInt(y3.b.g, cVar.B));
        setDither(typedArray.getBoolean(y3.b.b, cVar.x));
    }

    @Override // com.p7700g.p99005.w3
    /* renamed from: A */
    public c o() {
        return new c(this.R, this, null);
    }

    @Override // com.p7700g.p99005.w3, com.p7700g.p99005.t3, android.graphics.drawable.Drawable
    @e2(21)
    public /* bridge */ /* synthetic */ void applyTheme(@x1 Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // com.p7700g.p99005.w3, com.p7700g.p99005.t3
    public void b() {
        super.b();
        this.V = false;
    }

    @Override // com.p7700g.p99005.t3, android.graphics.drawable.Drawable
    @e2(21)
    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    @Override // com.p7700g.p99005.t3, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void draw(@x1 Canvas canvas) {
        super.draw(canvas);
    }

    @Override // com.p7700g.p99005.t3, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // com.p7700g.p99005.t3, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    @Override // com.p7700g.p99005.t3, android.graphics.drawable.Drawable
    @x1
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // com.p7700g.p99005.t3, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getHotspotBounds(@x1 Rect rect) {
        super.getHotspotBounds(rect);
    }

    @Override // com.p7700g.p99005.t3, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    @Override // com.p7700g.p99005.t3, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    @Override // com.p7700g.p99005.t3, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // com.p7700g.p99005.t3, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // com.p7700g.p99005.t3, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // com.p7700g.p99005.t3, android.graphics.drawable.Drawable
    @e2(21)
    public /* bridge */ /* synthetic */ void getOutline(@x1 Outline outline) {
        super.getOutline(outline);
    }

    @Override // com.p7700g.p99005.t3, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(@x1 Rect rect) {
        return super.getPadding(rect);
    }

    @Override // com.p7700g.p99005.w3, com.p7700g.p99005.t3
    public void i(@x1 t3.d dVar) {
        super.i(dVar);
        if (dVar instanceof c) {
            this.R = (c) dVar;
        }
    }

    @Override // com.p7700g.p99005.t3, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void invalidateDrawable(@x1 Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    @Override // com.p7700g.p99005.t3, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    @Override // com.p7700g.p99005.w3, com.p7700g.p99005.t3, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // com.p7700g.p99005.t3, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.S;
        if (gVar != null) {
            gVar.d();
            this.S = null;
            h(this.T);
            this.T = -1;
            this.U = -1;
        }
    }

    @Override // com.p7700g.p99005.t3
    public /* bridge */ /* synthetic */ void k(int i) {
        super.k(i);
    }

    @Override // com.p7700g.p99005.t3
    public /* bridge */ /* synthetic */ void l(int i) {
        super.l(i);
    }

    @Override // com.p7700g.p99005.w3, com.p7700g.p99005.t3, android.graphics.drawable.Drawable
    @x1
    public Drawable mutate() {
        if (!this.V && super.mutate() == this) {
            this.R.v();
            this.V = true;
        }
        return this;
    }

    @Override // com.p7700g.p99005.w3
    public /* bridge */ /* synthetic */ void n(int[] iArr, Drawable drawable) {
        super.n(iArr, drawable);
    }

    @Override // com.p7700g.p99005.t3, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i) {
        return super.onLayoutDirectionChanged(i);
    }

    @Override // com.p7700g.p99005.w3, com.p7700g.p99005.t3, android.graphics.drawable.Drawable
    public boolean onStateChange(@x1 int[] iArr) {
        int J = this.R.J(iArr);
        boolean z = J != d() && (G(J) || h(J));
        Drawable current = getCurrent();
        return current != null ? z | current.setState(iArr) : z;
    }

    @Override // com.p7700g.p99005.t3, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void scheduleDrawable(@x1 Drawable drawable, @x1 Runnable runnable, long j) {
        super.scheduleDrawable(drawable, runnable, j);
    }

    @Override // com.p7700g.p99005.t3, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    @Override // com.p7700g.p99005.t3, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z) {
        super.setAutoMirrored(z);
    }

    @Override // com.p7700g.p99005.t3, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // com.p7700g.p99005.t3, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setDither(boolean z) {
        super.setDither(z);
    }

    @Override // com.p7700g.p99005.t3, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f2, float f3) {
        super.setHotspot(f2, f3);
    }

    @Override // com.p7700g.p99005.t3, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // com.p7700g.p99005.t3, android.graphics.drawable.Drawable, com.p7700g.p99005.lk
    public /* bridge */ /* synthetic */ void setTint(@w0 int i) {
        super.setTint(i);
    }

    @Override // com.p7700g.p99005.t3, android.graphics.drawable.Drawable, com.p7700g.p99005.lk
    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    @Override // com.p7700g.p99005.t3, android.graphics.drawable.Drawable, com.p7700g.p99005.lk
    public /* bridge */ /* synthetic */ void setTintMode(@x1 PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    @Override // com.p7700g.p99005.t3, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        g gVar = this.S;
        if (gVar != null && (visible || z2)) {
            if (z) {
                gVar.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    @Override // com.p7700g.p99005.t3, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void unscheduleDrawable(@x1 Drawable drawable, @x1 Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }

    @Override // com.p7700g.p99005.w3
    public void v(@x1 Context context, @x1 Resources resources, @x1 XmlPullParser xmlPullParser, @x1 AttributeSet attributeSet, @z1 Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray s = ri.s(resources, theme, attributeSet, y3.b.a);
        setVisible(s.getBoolean(y3.b.c, true), true);
        x(s);
        m(resources);
        s.recycle();
        w(context, resources, xmlPullParser, attributeSet, theme);
        D();
    }

    public void y(@x1 int[] iArr, @x1 Drawable drawable, int i) {
        ep.d(drawable);
        this.R.F(iArr, drawable, i);
        onStateChange(getState());
    }

    public <T extends Drawable & Animatable> void z(int i, int i2, @x1 T t, boolean z) {
        ep.d(t);
        this.R.G(i, i2, t, z);
    }

    public s3(@z1 c cVar, @z1 Resources resources) {
        super(null);
        this.T = -1;
        this.U = -1;
        i(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }
}