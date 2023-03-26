package com.p7700g.p99005;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.mj;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: VectorDrawableCompat.java */
/* loaded from: classes.dex */
public class ga0 extends fa0 {
    private static final int A = 1;
    private static final int B = 2;
    private static final int C = 0;
    private static final int D = 1;
    private static final int E = 2;
    private static final int F = 2048;
    private static final boolean G = false;
    public static final String t = "VectorDrawableCompat";
    public static final PorterDuff.Mode u = PorterDuff.Mode.SRC_IN;
    private static final String v = "clip-path";
    private static final String w = "group";
    private static final String x = "path";
    private static final String y = "vector";
    private static final int z = 0;
    private h H;
    private PorterDuffColorFilter I;
    private ColorFilter J;
    private boolean K;
    private boolean L;
    private Drawable.ConstantState M;
    private final float[] N;
    private final Matrix O;
    private final Rect P;

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class b extends f {
        public b() {
        }

        private void j(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.c = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.b = mj.d(string2);
            }
            this.d = ri.k(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // com.p7700g.p99005.ga0.f
        public boolean e() {
            return true;
        }

        public void i(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (ri.r(xmlPullParser, "pathData")) {
                TypedArray s = ri.s(resources, theme, attributeSet, y90.I);
                j(s, xmlPullParser);
                s.recycle();
            }
        }

        public b(b bVar) {
            super(bVar);
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static abstract class e {
        private e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class h extends Drawable.ConstantState {
        public int a;
        public g b;
        public ColorStateList c;
        public PorterDuff.Mode d;
        public boolean e;
        public Bitmap f;
        public int[] g;
        public ColorStateList h;
        public PorterDuff.Mode i;
        public int j;
        public boolean k;
        public boolean l;
        public Paint m;

        public h(h hVar) {
            this.c = null;
            this.d = ga0.u;
            if (hVar != null) {
                this.a = hVar.a;
                g gVar = new g(hVar.b);
                this.b = gVar;
                if (hVar.b.f != null) {
                    gVar.f = new Paint(hVar.b.f);
                }
                if (hVar.b.e != null) {
                    this.b.e = new Paint(hVar.b.e);
                }
                this.c = hVar.c;
                this.d = hVar.d;
                this.e = hVar.e;
            }
        }

        public boolean a(int i, int i2) {
            return i == this.f.getWidth() && i2 == this.f.getHeight();
        }

        public boolean b() {
            return !this.l && this.h == this.c && this.i == this.d && this.k == this.e && this.j == this.b.getRootAlpha();
        }

        public void c(int i, int i2) {
            if (this.f == null || !a(i, i2)) {
                this.f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.l = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (f() || colorFilter != null) {
                if (this.m == null) {
                    Paint paint = new Paint();
                    this.m = paint;
                    paint.setFilterBitmap(true);
                }
                this.m.setAlpha(this.b.getRootAlpha());
                this.m.setColorFilter(colorFilter);
                return this.m;
            }
            return null;
        }

        public boolean f() {
            return this.b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.b.f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.a;
        }

        public boolean h(int[] iArr) {
            boolean g = this.b.g(iArr);
            this.l |= g;
            return g;
        }

        public void i() {
            this.h = this.c;
            this.i = this.d;
            this.j = this.b.getRootAlpha();
            this.k = this.e;
            this.l = false;
        }

        public void j(int i, int i2) {
            this.f.eraseColor(0);
            this.b.b(new Canvas(this.f), i, i2, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @x1
        public Drawable newDrawable() {
            return new ga0(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @x1
        public Drawable newDrawable(Resources resources) {
            return new ga0(this);
        }

        public h() {
            this.c = null;
            this.d = ga0.u;
            this.b = new g();
        }
    }

    public ga0() {
        this.L = true;
        this.N = new float[9];
        this.O = new Matrix();
        this.P = new Rect();
        this.H = new h();
    }

    public static int a(int i2, float f2) {
        return (i2 & sr.s) | (((int) (Color.alpha(i2) * f2)) << 24);
    }

    @z1
    public static ga0 e(@x1 Resources resources, @f1 int i2, @z1 Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            ga0 ga0Var = new ga0();
            ga0Var.s = oi.g(resources, i2, theme);
            ga0Var.M = new i(ga0Var.s.getConstantState());
            return ga0Var;
        }
        try {
            XmlResourceParser xml = resources.getXml(i2);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            while (true) {
                next = xml.next();
                if (next == 2 || next == 1) {
                    break;
                }
            }
            if (next == 2) {
                return f(resources, xml, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException unused) {
            return null;
        }
    }

    public static ga0 f(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        ga0 ga0Var = new ga0();
        ga0Var.inflate(resources, xmlPullParser, attributeSet, theme);
        return ga0Var;
    }

    private void i(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        h hVar = this.H;
        g gVar = hVar.b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.i);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z2 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.k(resources, attributeSet, theme, xmlPullParser);
                    dVar.b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.q.put(cVar.getPathName(), cVar);
                    }
                    z2 = false;
                    hVar.a = cVar.e | hVar.a;
                } else if (v.equals(name)) {
                    b bVar = new b();
                    bVar.i(resources, attributeSet, theme, xmlPullParser);
                    dVar.b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.q.put(bVar.getPathName(), bVar);
                    }
                    hVar.a = bVar.e | hVar.a;
                } else if (w.equals(name)) {
                    d dVar2 = new d();
                    dVar2.c(resources, attributeSet, theme, xmlPullParser);
                    dVar.b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.q.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.a = dVar2.k | hVar.a;
                }
            } else if (eventType == 3 && w.equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z2) {
            throw new XmlPullParserException("no path defined");
        }
    }

    private boolean j() {
        return isAutoMirrored() && fk.f(this) == 1;
    }

    private static PorterDuff.Mode k(int i2, PorterDuff.Mode mode) {
        if (i2 != 3) {
            if (i2 != 5) {
                if (i2 != 9) {
                    switch (i2) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    private void l(d dVar, int i2) {
        String str = "";
        for (int i3 = 0; i3 < i2; i3++) {
            str = wo1.t(str, "    ");
        }
        dVar.getGroupName();
        dVar.getLocalMatrix().toString();
        for (int i4 = 0; i4 < dVar.b.size(); i4++) {
            e eVar = dVar.b.get(i4);
            if (eVar instanceof d) {
                l((d) eVar, i2 + 1);
            } else {
                ((f) eVar).g(i2 + 1);
            }
        }
    }

    private void n(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        h hVar = this.H;
        g gVar = hVar.b;
        hVar.d = k(ri.k(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList g2 = ri.g(typedArray, xmlPullParser, theme, "tint", 1);
        if (g2 != null) {
            hVar.c = g2;
        }
        hVar.e = ri.e(typedArray, xmlPullParser, "autoMirrored", 5, hVar.e);
        gVar.l = ri.j(typedArray, xmlPullParser, "viewportWidth", 7, gVar.l);
        float j = ri.j(typedArray, xmlPullParser, "viewportHeight", 8, gVar.m);
        gVar.m = j;
        if (gVar.l <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (j > 0.0f) {
            gVar.j = typedArray.getDimension(3, gVar.j);
            float dimension = typedArray.getDimension(2, gVar.k);
            gVar.k = dimension;
            if (gVar.j <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                gVar.setAlpha(ri.j(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    gVar.o = string;
                    gVar.q.put(string, gVar);
                }
            } else {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    @Override // com.p7700g.p99005.fa0, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.s;
        if (drawable != null) {
            fk.b(drawable);
            return false;
        }
        return false;
    }

    @Override // com.p7700g.p99005.fa0, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.s;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.P);
        if (this.P.width() <= 0 || this.P.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.J;
        if (colorFilter == null) {
            colorFilter = this.I;
        }
        canvas.getMatrix(this.O);
        this.O.getValues(this.N);
        float abs = Math.abs(this.N[0]);
        float abs2 = Math.abs(this.N[4]);
        float abs3 = Math.abs(this.N[1]);
        float abs4 = Math.abs(this.N[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int min = Math.min(2048, (int) (this.P.width() * abs));
        int min2 = Math.min(2048, (int) (this.P.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        Rect rect = this.P;
        canvas.translate(rect.left, rect.top);
        if (j()) {
            canvas.translate(this.P.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.P.offsetTo(0, 0);
        this.H.c(min, min2);
        if (!this.L) {
            this.H.j(min, min2);
        } else if (!this.H.b()) {
            this.H.j(min, min2);
            this.H.i();
        }
        this.H.d(canvas, colorFilter, this.P);
        canvas.restoreToCount(save);
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public float g() {
        g gVar;
        h hVar = this.H;
        if (hVar == null || (gVar = hVar.b) == null) {
            return 1.0f;
        }
        float f2 = gVar.j;
        if (f2 != 0.0f) {
            float f3 = gVar.k;
            if (f3 != 0.0f) {
                float f4 = gVar.m;
                if (f4 != 0.0f) {
                    float f5 = gVar.l;
                    if (f5 == 0.0f) {
                        return 1.0f;
                    }
                    return Math.min(f5 / f2, f4 / f3);
                }
                return 1.0f;
            }
            return 1.0f;
        }
        return 1.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.s;
        if (drawable != null) {
            return fk.d(drawable);
        }
        return this.H.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.s;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.H.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.s;
        if (drawable != null) {
            return fk.e(drawable);
        }
        return this.J;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.s != null && Build.VERSION.SDK_INT >= 24) {
            return new i(this.s.getConstantState());
        }
        this.H.a = getChangingConfigurations();
        return this.H;
    }

    @Override // com.p7700g.p99005.fa0, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.s;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.H.b.k;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.s;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.H.b.j;
    }

    @Override // com.p7700g.p99005.fa0, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // com.p7700g.p99005.fa0, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.s;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // com.p7700g.p99005.fa0, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // com.p7700g.p99005.fa0, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // com.p7700g.p99005.fa0, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public Object h(String str) {
        return this.H.b.q.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.s;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.s;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.s;
        if (drawable != null) {
            return fk.h(drawable);
        }
        return this.H.e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.s;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return super.isStateful() || ((hVar = this.H) != null && (hVar.g() || ((colorStateList = this.H.c) != null && colorStateList.isStateful())));
    }

    @Override // com.p7700g.p99005.fa0, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public void m(boolean z2) {
        this.L = z2;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.s;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.K && super.mutate() == this) {
            this.H = new h(this.H);
            this.K = true;
        }
        return this;
    }

    public PorterDuffColorFilter o(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // com.p7700g.p99005.fa0, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.s;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.s;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z2 = false;
        h hVar = this.H;
        ColorStateList colorStateList = hVar.c;
        if (colorStateList != null && (mode = hVar.d) != null) {
            this.I = o(this.I, colorStateList, mode);
            invalidateSelf();
            z2 = true;
        }
        if (hVar.g() && hVar.h(iArr)) {
            invalidateSelf();
            return true;
        }
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.s;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        Drawable drawable = this.s;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else if (this.H.b.getRootAlpha() != i2) {
            this.H.b.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z2) {
        Drawable drawable = this.s;
        if (drawable != null) {
            fk.j(drawable, z2);
        } else {
            this.H.e = z2;
        }
    }

    @Override // com.p7700g.p99005.fa0, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i2) {
        super.setChangingConfigurations(i2);
    }

    @Override // com.p7700g.p99005.fa0, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i2, PorterDuff.Mode mode) {
        super.setColorFilter(i2, mode);
    }

    @Override // com.p7700g.p99005.fa0, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z2) {
        super.setFilterBitmap(z2);
    }

    @Override // com.p7700g.p99005.fa0, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f2, float f3) {
        super.setHotspot(f2, f3);
    }

    @Override // com.p7700g.p99005.fa0, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i2, int i3, int i4, int i5) {
        super.setHotspotBounds(i2, i3, i4, i5);
    }

    @Override // com.p7700g.p99005.fa0, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, com.p7700g.p99005.lk
    public void setTint(int i2) {
        Drawable drawable = this.s;
        if (drawable != null) {
            fk.n(drawable, i2);
        } else {
            setTintList(ColorStateList.valueOf(i2));
        }
    }

    @Override // android.graphics.drawable.Drawable, com.p7700g.p99005.lk
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.s;
        if (drawable != null) {
            fk.o(drawable, colorStateList);
            return;
        }
        h hVar = this.H;
        if (hVar.c != colorStateList) {
            hVar.c = colorStateList;
            this.I = o(this.I, colorStateList, hVar.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, com.p7700g.p99005.lk
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.s;
        if (drawable != null) {
            fk.p(drawable, mode);
            return;
        }
        h hVar = this.H;
        if (hVar.d != mode) {
            hVar.d = mode;
            this.I = o(this.I, hVar.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.s;
        if (drawable != null) {
            return drawable.setVisible(z2, z3);
        }
        return super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.s;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    @e2(24)
    /* loaded from: classes.dex */
    public static class i extends Drawable.ConstantState {
        private final Drawable.ConstantState a;

        public i(Drawable.ConstantState constantState) {
            this.a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            ga0 ga0Var = new ga0();
            ga0Var.s = (VectorDrawable) this.a.newDrawable();
            return ga0Var;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            ga0 ga0Var = new ga0();
            ga0Var.s = (VectorDrawable) this.a.newDrawable(resources);
            return ga0Var;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            ga0 ga0Var = new ga0();
            ga0Var.s = (VectorDrawable) this.a.newDrawable(resources, theme);
            return ga0Var;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.s;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.J = colorFilter;
        invalidateSelf();
    }

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static abstract class f extends e {
        public static final int a = 0;
        public mj.b[] b;
        public String c;
        public int d;
        public int e;

        public f() {
            super();
            this.b = null;
            this.d = 0;
        }

        public void c(Resources.Theme theme) {
        }

        public boolean d() {
            return false;
        }

        public boolean e() {
            return false;
        }

        public String f(mj.b[] bVarArr) {
            String str = " ";
            for (int i = 0; i < bVarArr.length; i++) {
                StringBuilder G = wo1.G(str);
                G.append(bVarArr[i].a);
                G.append(":");
                str = G.toString();
                for (float f : bVarArr[i].b) {
                    StringBuilder G2 = wo1.G(str);
                    G2.append(f);
                    G2.append(",");
                    str = G2.toString();
                }
            }
            return str;
        }

        public void g(int i) {
            String str = "";
            for (int i2 = 0; i2 < i; i2++) {
                str = wo1.t(str, "    ");
            }
            f(this.b);
        }

        public mj.b[] getPathData() {
            return this.b;
        }

        public String getPathName() {
            return this.c;
        }

        public void h(Path path) {
            path.reset();
            mj.b[] bVarArr = this.b;
            if (bVarArr != null) {
                mj.b.e(bVarArr, path);
            }
        }

        public void setPathData(mj.b[] bVarArr) {
            if (!mj.b(this.b, bVarArr)) {
                this.b = mj.f(bVarArr);
            } else {
                mj.k(this.b, bVarArr);
            }
        }

        public f(f fVar) {
            super();
            this.b = null;
            this.d = 0;
            this.c = fVar.c;
            this.e = fVar.e;
            this.b = mj.f(fVar.b);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.s;
        if (drawable != null) {
            fk.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.H;
        hVar.b = new g();
        TypedArray s = ri.s(resources, theme, attributeSet, y90.a);
        n(s, xmlPullParser, theme);
        s.recycle();
        hVar.a = getChangingConfigurations();
        hVar.l = true;
        i(resources, xmlPullParser, attributeSet, theme);
        this.I = o(this.I, hVar.c, hVar.d);
    }

    public ga0(@x1 h hVar) {
        this.L = true;
        this.N = new float[9];
        this.O = new Matrix();
        this.P = new Rect();
        this.H = hVar;
        this.I = o(this.I, hVar.c, hVar.d);
    }

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class c extends f {
        private int[] f;
        public ji g;
        public float h;
        public ji i;
        public float j;
        public float k;
        public float l;
        public float m;
        public float n;
        public Paint.Cap o;
        public Paint.Join p;
        public float q;

        public c() {
            this.h = 0.0f;
            this.j = 1.0f;
            this.k = 1.0f;
            this.l = 0.0f;
            this.m = 1.0f;
            this.n = 0.0f;
            this.o = Paint.Cap.BUTT;
            this.p = Paint.Join.MITER;
            this.q = 4.0f;
        }

        private Paint.Cap i(int i, Paint.Cap cap) {
            if (i != 0) {
                if (i != 1) {
                    return i != 2 ? cap : Paint.Cap.SQUARE;
                }
                return Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }

        private Paint.Join j(int i, Paint.Join join) {
            if (i != 0) {
                if (i != 1) {
                    return i != 2 ? join : Paint.Join.BEVEL;
                }
                return Paint.Join.ROUND;
            }
            return Paint.Join.MITER;
        }

        private void l(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f = null;
            if (ri.r(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.c = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.b = mj.d(string2);
                }
                this.i = ri.i(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.k = ri.j(typedArray, xmlPullParser, "fillAlpha", 12, this.k);
                this.o = i(ri.k(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.o);
                this.p = j(ri.k(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.p);
                this.q = ri.j(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.q);
                this.g = ri.i(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.j = ri.j(typedArray, xmlPullParser, "strokeAlpha", 11, this.j);
                this.h = ri.j(typedArray, xmlPullParser, "strokeWidth", 4, this.h);
                this.m = ri.j(typedArray, xmlPullParser, "trimPathEnd", 6, this.m);
                this.n = ri.j(typedArray, xmlPullParser, "trimPathOffset", 7, this.n);
                this.l = ri.j(typedArray, xmlPullParser, "trimPathStart", 5, this.l);
                this.d = ri.k(typedArray, xmlPullParser, "fillType", 13, this.d);
            }
        }

        @Override // com.p7700g.p99005.ga0.e
        public boolean a() {
            return this.i.i() || this.g.i();
        }

        @Override // com.p7700g.p99005.ga0.e
        public boolean b(int[] iArr) {
            return this.g.j(iArr) | this.i.j(iArr);
        }

        @Override // com.p7700g.p99005.ga0.f
        public void c(Resources.Theme theme) {
            if (this.f == null) {
            }
        }

        @Override // com.p7700g.p99005.ga0.f
        public boolean d() {
            return this.f != null;
        }

        public float getFillAlpha() {
            return this.k;
        }

        @w0
        public int getFillColor() {
            return this.i.e();
        }

        public float getStrokeAlpha() {
            return this.j;
        }

        @w0
        public int getStrokeColor() {
            return this.g.e();
        }

        public float getStrokeWidth() {
            return this.h;
        }

        public float getTrimPathEnd() {
            return this.m;
        }

        public float getTrimPathOffset() {
            return this.n;
        }

        public float getTrimPathStart() {
            return this.l;
        }

        public void k(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray s = ri.s(resources, theme, attributeSet, y90.t);
            l(s, xmlPullParser, theme);
            s.recycle();
        }

        public void setFillAlpha(float f) {
            this.k = f;
        }

        public void setFillColor(int i) {
            this.i.k(i);
        }

        public void setStrokeAlpha(float f) {
            this.j = f;
        }

        public void setStrokeColor(int i) {
            this.g.k(i);
        }

        public void setStrokeWidth(float f) {
            this.h = f;
        }

        public void setTrimPathEnd(float f) {
            this.m = f;
        }

        public void setTrimPathOffset(float f) {
            this.n = f;
        }

        public void setTrimPathStart(float f) {
            this.l = f;
        }

        public c(c cVar) {
            super(cVar);
            this.h = 0.0f;
            this.j = 1.0f;
            this.k = 1.0f;
            this.l = 0.0f;
            this.m = 1.0f;
            this.n = 0.0f;
            this.o = Paint.Cap.BUTT;
            this.p = Paint.Join.MITER;
            this.q = 4.0f;
            this.f = cVar.f;
            this.g = cVar.g;
            this.h = cVar.h;
            this.j = cVar.j;
            this.i = cVar.i;
            this.d = cVar.d;
            this.k = cVar.k;
            this.l = cVar.l;
            this.m = cVar.m;
            this.n = cVar.n;
            this.o = cVar.o;
            this.p = cVar.p;
            this.q = cVar.q;
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class g {
        private static final Matrix a = new Matrix();
        private final Path b;
        private final Path c;
        private final Matrix d;
        public Paint e;
        public Paint f;
        private PathMeasure g;
        private int h;
        public final d i;
        public float j;
        public float k;
        public float l;
        public float m;
        public int n;
        public String o;
        public Boolean p;
        public final q7<String, Object> q;

        public g() {
            this.d = new Matrix();
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 0.0f;
            this.n = 255;
            this.o = null;
            this.p = null;
            this.q = new q7<>();
            this.i = new d();
            this.b = new Path();
            this.c = new Path();
        }

        private static float a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        private void c(d dVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            dVar.a.set(matrix);
            dVar.a.preConcat(dVar.j);
            canvas.save();
            for (int i3 = 0; i3 < dVar.b.size(); i3++) {
                e eVar = dVar.b.get(i3);
                if (eVar instanceof d) {
                    c((d) eVar, dVar.a, canvas, i, i2, colorFilter);
                } else if (eVar instanceof f) {
                    d(dVar, (f) eVar, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        private void d(d dVar, f fVar, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = i / this.l;
            float f2 = i2 / this.m;
            float min = Math.min(f, f2);
            Matrix matrix = dVar.a;
            this.d.set(matrix);
            this.d.postScale(f, f2);
            float e = e(matrix);
            if (e == 0.0f) {
                return;
            }
            fVar.h(this.b);
            Path path = this.b;
            this.c.reset();
            if (fVar.e()) {
                this.c.setFillType(fVar.d == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.c.addPath(path, this.d);
                canvas.clipPath(this.c);
                return;
            }
            c cVar = (c) fVar;
            float f3 = cVar.l;
            if (f3 != 0.0f || cVar.m != 1.0f) {
                float f4 = cVar.n;
                float f5 = (f3 + f4) % 1.0f;
                float f6 = (cVar.m + f4) % 1.0f;
                if (this.g == null) {
                    this.g = new PathMeasure();
                }
                this.g.setPath(this.b, false);
                float length = this.g.getLength();
                float f7 = f5 * length;
                float f8 = f6 * length;
                path.reset();
                if (f7 > f8) {
                    this.g.getSegment(f7, length, path, true);
                    this.g.getSegment(0.0f, f8, path, true);
                } else {
                    this.g.getSegment(f7, f8, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.c.addPath(path, this.d);
            if (cVar.i.l()) {
                ji jiVar = cVar.i;
                if (this.f == null) {
                    Paint paint = new Paint(1);
                    this.f = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f;
                if (jiVar.h()) {
                    Shader f9 = jiVar.f();
                    f9.setLocalMatrix(this.d);
                    paint2.setShader(f9);
                    paint2.setAlpha(Math.round(cVar.k * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(ga0.a(jiVar.e(), cVar.k));
                }
                paint2.setColorFilter(colorFilter);
                this.c.setFillType(cVar.d == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.c, paint2);
            }
            if (cVar.g.l()) {
                ji jiVar2 = cVar.g;
                if (this.e == null) {
                    Paint paint3 = new Paint(1);
                    this.e = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.e;
                Paint.Join join = cVar.p;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.o;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.q);
                if (jiVar2.h()) {
                    Shader f10 = jiVar2.f();
                    f10.setLocalMatrix(this.d);
                    paint4.setShader(f10);
                    paint4.setAlpha(Math.round(cVar.j * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(ga0.a(jiVar2.e(), cVar.j));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.h * min * e);
                canvas.drawPath(this.c, paint4);
            }
        }

        private float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float a2 = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot(fArr[0], fArr[1]), (float) Math.hypot(fArr[2], fArr[3]));
            if (max > 0.0f) {
                return Math.abs(a2) / max;
            }
            return 0.0f;
        }

        public void b(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            c(this.i, a, canvas, i, i2, colorFilter);
        }

        public boolean f() {
            if (this.p == null) {
                this.p = Boolean.valueOf(this.i.a());
            }
            return this.p.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.i.b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.n;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.n = i;
        }

        public g(g gVar) {
            this.d = new Matrix();
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 0.0f;
            this.n = 255;
            this.o = null;
            this.p = null;
            q7<String, Object> q7Var = new q7<>();
            this.q = q7Var;
            this.i = new d(gVar.i, q7Var);
            this.b = new Path(gVar.b);
            this.c = new Path(gVar.c);
            this.j = gVar.j;
            this.k = gVar.k;
            this.l = gVar.l;
            this.m = gVar.m;
            this.h = gVar.h;
            this.n = gVar.n;
            this.o = gVar.o;
            String str = gVar.o;
            if (str != null) {
                q7Var.put(str, this);
            }
            this.p = gVar.p;
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class d extends e {
        public final Matrix a;
        public final ArrayList<e> b;
        public float c;
        private float d;
        private float e;
        private float f;
        private float g;
        private float h;
        private float i;
        public final Matrix j;
        public int k;
        private int[] l;
        private String m;

        public d(d dVar, q7<String, Object> q7Var) {
            super();
            f bVar;
            this.a = new Matrix();
            this.b = new ArrayList<>();
            this.c = 0.0f;
            this.d = 0.0f;
            this.e = 0.0f;
            this.f = 1.0f;
            this.g = 1.0f;
            this.h = 0.0f;
            this.i = 0.0f;
            Matrix matrix = new Matrix();
            this.j = matrix;
            this.m = null;
            this.c = dVar.c;
            this.d = dVar.d;
            this.e = dVar.e;
            this.f = dVar.f;
            this.g = dVar.g;
            this.h = dVar.h;
            this.i = dVar.i;
            this.l = dVar.l;
            String str = dVar.m;
            this.m = str;
            this.k = dVar.k;
            if (str != null) {
                q7Var.put(str, this);
            }
            matrix.set(dVar.j);
            ArrayList<e> arrayList = dVar.b;
            for (int i = 0; i < arrayList.size(); i++) {
                e eVar = arrayList.get(i);
                if (eVar instanceof d) {
                    this.b.add(new d((d) eVar, q7Var));
                } else {
                    if (eVar instanceof c) {
                        bVar = new c((c) eVar);
                    } else if (eVar instanceof b) {
                        bVar = new b((b) eVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.b.add(bVar);
                    String str2 = bVar.c;
                    if (str2 != null) {
                        q7Var.put(str2, bVar);
                    }
                }
            }
        }

        private void d() {
            this.j.reset();
            this.j.postTranslate(-this.d, -this.e);
            this.j.postScale(this.f, this.g);
            this.j.postRotate(this.c, 0.0f, 0.0f);
            this.j.postTranslate(this.h + this.d, this.i + this.e);
        }

        private void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.l = null;
            this.c = ri.j(typedArray, xmlPullParser, td.d, 5, this.c);
            this.d = typedArray.getFloat(1, this.d);
            this.e = typedArray.getFloat(2, this.e);
            this.f = ri.j(typedArray, xmlPullParser, "scaleX", 3, this.f);
            this.g = ri.j(typedArray, xmlPullParser, "scaleY", 4, this.g);
            this.h = ri.j(typedArray, xmlPullParser, "translateX", 6, this.h);
            this.i = ri.j(typedArray, xmlPullParser, "translateY", 7, this.i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.m = string;
            }
            d();
        }

        @Override // com.p7700g.p99005.ga0.e
        public boolean a() {
            for (int i = 0; i < this.b.size(); i++) {
                if (this.b.get(i).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.p7700g.p99005.ga0.e
        public boolean b(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.b.size(); i++) {
                z |= this.b.get(i).b(iArr);
            }
            return z;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray s = ri.s(resources, theme, attributeSet, y90.k);
            e(s, xmlPullParser);
            s.recycle();
        }

        public String getGroupName() {
            return this.m;
        }

        public Matrix getLocalMatrix() {
            return this.j;
        }

        public float getPivotX() {
            return this.d;
        }

        public float getPivotY() {
            return this.e;
        }

        public float getRotation() {
            return this.c;
        }

        public float getScaleX() {
            return this.f;
        }

        public float getScaleY() {
            return this.g;
        }

        public float getTranslateX() {
            return this.h;
        }

        public float getTranslateY() {
            return this.i;
        }

        public void setPivotX(float f) {
            if (f != this.d) {
                this.d = f;
                d();
            }
        }

        public void setPivotY(float f) {
            if (f != this.e) {
                this.e = f;
                d();
            }
        }

        public void setRotation(float f) {
            if (f != this.c) {
                this.c = f;
                d();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f) {
                this.f = f;
                d();
            }
        }

        public void setScaleY(float f) {
            if (f != this.g) {
                this.g = f;
                d();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.h) {
                this.h = f;
                d();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.i) {
                this.i = f;
                d();
            }
        }

        public d() {
            super();
            this.a = new Matrix();
            this.b = new ArrayList<>();
            this.c = 0.0f;
            this.d = 0.0f;
            this.e = 0.0f;
            this.f = 1.0f;
            this.g = 1.0f;
            this.h = 0.0f;
            this.i = 0.0f;
            this.j = new Matrix();
            this.m = null;
        }
    }
}