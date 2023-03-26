package com.p7700g.p99005;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import com.p7700g.p99005.z90;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: AnimatedVectorDrawableCompat.java */
/* loaded from: classes.dex */
public class aa0 extends fa0 implements z90 {
    private static final String t = "AnimatedVDCompat";
    private static final String u = "animated-vector";
    private static final String v = "target";
    private static final boolean w = false;
    public d A;
    private Animator.AnimatorListener B;
    public ArrayList<z90.a> C;
    public final Drawable.Callback D;
    private c x;
    private Context y;
    private ArgbEvaluator z;

    /* compiled from: AnimatedVectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public class a implements Drawable.Callback {
        public a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            aa0.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            aa0.this.scheduleSelf(runnable, j);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            aa0.this.unscheduleSelf(runnable);
        }
    }

    /* compiled from: AnimatedVectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ArrayList arrayList = new ArrayList(aa0.this.C);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((z90.a) arrayList.get(i)).b(aa0.this);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(aa0.this.C);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((z90.a) arrayList.get(i)).c(aa0.this);
            }
        }
    }

    /* compiled from: AnimatedVectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class c extends Drawable.ConstantState {
        public int a;
        public ga0 b;
        public AnimatorSet c;
        public ArrayList<Animator> d;
        public q7<Animator, String> e;

        public c(Context context, c cVar, Drawable.Callback callback, Resources resources) {
            if (cVar != null) {
                this.a = cVar.a;
                ga0 ga0Var = cVar.b;
                if (ga0Var != null) {
                    Drawable.ConstantState constantState = ga0Var.getConstantState();
                    if (resources != null) {
                        this.b = (ga0) constantState.newDrawable(resources);
                    } else {
                        this.b = (ga0) constantState.newDrawable();
                    }
                    ga0 ga0Var2 = (ga0) this.b.mutate();
                    this.b = ga0Var2;
                    ga0Var2.setCallback(callback);
                    this.b.setBounds(cVar.b.getBounds());
                    this.b.m(false);
                }
                ArrayList<Animator> arrayList = cVar.d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.d = new ArrayList<>(size);
                    this.e = new q7<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = cVar.d.get(i);
                        Animator clone = animator.clone();
                        String str = cVar.e.get(animator);
                        clone.setTarget(this.b.h(str));
                        this.d.add(clone);
                        this.e.put(clone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.c == null) {
                this.c = new AnimatorSet();
            }
            this.c.playTogether(this.d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    public aa0() {
        this(null, null, null);
    }

    public static void a(Drawable drawable) {
        if (drawable instanceof Animatable) {
            if (Build.VERSION.SDK_INT >= 24) {
                ((AnimatedVectorDrawable) drawable).clearAnimationCallbacks();
            } else {
                ((aa0) drawable).c();
            }
        }
    }

    @z1
    public static aa0 e(@x1 Context context, @f1 int i) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            aa0 aa0Var = new aa0(context);
            Drawable g = oi.g(context.getResources(), i, context.getTheme());
            aa0Var.s = g;
            g.setCallback(aa0Var.D);
            aa0Var.A = new d(aa0Var.s.getConstantState());
            return aa0Var;
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            while (true) {
                next = xml.next();
                if (next == 2 || next == 1) {
                    break;
                }
            }
            if (next == 2) {
                return f(context, context.getResources(), xml, asAttributeSet, context.getTheme());
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException unused) {
            return null;
        }
    }

    public static aa0 f(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        aa0 aa0Var = new aa0(context);
        aa0Var.inflate(resources, xmlPullParser, attributeSet, theme);
        return aa0Var;
    }

    public static void g(Drawable drawable, z90.a aVar) {
        if (drawable == null || aVar == null || !(drawable instanceof Animatable)) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            h((AnimatedVectorDrawable) drawable, aVar);
        } else {
            ((aa0) drawable).b(aVar);
        }
    }

    @e2(23)
    private static void h(@x1 AnimatedVectorDrawable animatedVectorDrawable, @x1 z90.a aVar) {
        animatedVectorDrawable.registerAnimationCallback(aVar.a());
    }

    private void i() {
        Animator.AnimatorListener animatorListener = this.B;
        if (animatorListener != null) {
            this.x.c.removeListener(animatorListener);
            this.B = null;
        }
    }

    private void j(String str, Animator animator) {
        animator.setTarget(this.x.b.h(str));
        c cVar = this.x;
        if (cVar.d == null) {
            cVar.d = new ArrayList<>();
            this.x.e = new q7<>();
        }
        this.x.d.add(animator);
        this.x.e.put(animator, str);
    }

    private void k(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                k(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.z == null) {
                    this.z = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.z);
            }
        }
    }

    public static boolean l(Drawable drawable, z90.a aVar) {
        if (drawable == null || aVar == null || !(drawable instanceof Animatable)) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return m((AnimatedVectorDrawable) drawable, aVar);
        }
        return ((aa0) drawable).d(aVar);
    }

    @e2(23)
    private static boolean m(AnimatedVectorDrawable animatedVectorDrawable, z90.a aVar) {
        return animatedVectorDrawable.unregisterAnimationCallback(aVar.a());
    }

    @Override // com.p7700g.p99005.fa0, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.s;
        if (drawable != null) {
            fk.a(drawable, theme);
        }
    }

    @Override // com.p7700g.p99005.z90
    public void b(@x1 z90.a aVar) {
        Drawable drawable = this.s;
        if (drawable != null) {
            h((AnimatedVectorDrawable) drawable, aVar);
        } else if (aVar == null) {
        } else {
            if (this.C == null) {
                this.C = new ArrayList<>();
            }
            if (this.C.contains(aVar)) {
                return;
            }
            this.C.add(aVar);
            if (this.B == null) {
                this.B = new b();
            }
            this.x.c.addListener(this.B);
        }
    }

    @Override // com.p7700g.p99005.z90
    public void c() {
        Drawable drawable = this.s;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).clearAnimationCallbacks();
            return;
        }
        i();
        ArrayList<z90.a> arrayList = this.C;
        if (arrayList == null) {
            return;
        }
        arrayList.clear();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.s;
        if (drawable != null) {
            return fk.b(drawable);
        }
        return false;
    }

    @Override // com.p7700g.p99005.fa0, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // com.p7700g.p99005.z90
    public boolean d(@x1 z90.a aVar) {
        Drawable drawable = this.s;
        if (drawable != null) {
            m((AnimatedVectorDrawable) drawable, aVar);
        }
        ArrayList<z90.a> arrayList = this.C;
        if (arrayList == null || aVar == null) {
            return false;
        }
        boolean remove = arrayList.remove(aVar);
        if (this.C.size() == 0) {
            i();
        }
        return remove;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.s;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.x.b.draw(canvas);
        if (this.x.c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.s;
        if (drawable != null) {
            return fk.d(drawable);
        }
        return this.x.b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.s;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.x.a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.s;
        if (drawable != null) {
            return fk.e(drawable);
        }
        return this.x.b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.s == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new d(this.s.getConstantState());
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
        return this.x.b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.s;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.x.b.getIntrinsicWidth();
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
        return this.x.b.getOpacity();
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

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.s;
        if (drawable != null) {
            fk.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (u.equals(name)) {
                    TypedArray s = ri.s(resources, theme, attributeSet, y90.M);
                    int resourceId = s.getResourceId(0, 0);
                    if (resourceId != 0) {
                        ga0 e = ga0.e(resources, resourceId, theme);
                        e.m(false);
                        e.setCallback(this.D);
                        ga0 ga0Var = this.x.b;
                        if (ga0Var != null) {
                            ga0Var.setCallback(null);
                        }
                        this.x.b = e;
                    }
                    s.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, y90.O);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.y;
                        if (context != null) {
                            j(string, ca0.j(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.x.a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.s;
        if (drawable != null) {
            return fk.h(drawable);
        }
        return this.x.b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.s;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.x.c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.s;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.x.b.isStateful();
    }

    @Override // com.p7700g.p99005.fa0, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.s;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // com.p7700g.p99005.fa0, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.s;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.x.b.setBounds(rect);
        }
    }

    @Override // com.p7700g.p99005.fa0, android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        Drawable drawable = this.s;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        return this.x.b.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.s;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.x.b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.s;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.x.b.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.s;
        if (drawable != null) {
            fk.j(drawable, z);
        } else {
            this.x.b.setAutoMirrored(z);
        }
    }

    @Override // com.p7700g.p99005.fa0, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    @Override // com.p7700g.p99005.fa0, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    @Override // com.p7700g.p99005.fa0, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // com.p7700g.p99005.fa0, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // com.p7700g.p99005.fa0, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // com.p7700g.p99005.fa0, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, com.p7700g.p99005.lk
    public void setTint(int i) {
        Drawable drawable = this.s;
        if (drawable != null) {
            fk.n(drawable, i);
        } else {
            this.x.b.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable, com.p7700g.p99005.lk
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.s;
        if (drawable != null) {
            fk.o(drawable, colorStateList);
        } else {
            this.x.b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, com.p7700g.p99005.lk
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.s;
        if (drawable != null) {
            fk.p(drawable, mode);
        } else {
            this.x.b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.s;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.x.b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.s;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (this.x.c.isStarted()) {
        } else {
            this.x.c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.s;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.x.c.end();
        }
    }

    private aa0(@z1 Context context) {
        this(context, null, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.s;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.x.b.setColorFilter(colorFilter);
        }
    }

    /* compiled from: AnimatedVectorDrawableCompat.java */
    @e2(24)
    /* loaded from: classes.dex */
    public static class d extends Drawable.ConstantState {
        private final Drawable.ConstantState a;

        public d(Drawable.ConstantState constantState) {
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
            aa0 aa0Var = new aa0();
            Drawable newDrawable = this.a.newDrawable();
            aa0Var.s = newDrawable;
            newDrawable.setCallback(aa0Var.D);
            return aa0Var;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            aa0 aa0Var = new aa0();
            Drawable newDrawable = this.a.newDrawable(resources);
            aa0Var.s = newDrawable;
            newDrawable.setCallback(aa0Var.D);
            return aa0Var;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            aa0 aa0Var = new aa0();
            Drawable newDrawable = this.a.newDrawable(resources, theme);
            aa0Var.s = newDrawable;
            newDrawable.setCallback(aa0Var.D);
            return aa0Var;
        }
    }

    private aa0(@z1 Context context, @z1 c cVar, @z1 Resources resources) {
        this.z = null;
        this.B = null;
        this.C = null;
        a aVar = new a();
        this.D = aVar;
        this.y = context;
        if (cVar != null) {
            this.x = cVar;
        } else {
            this.x = new c(context, cVar, aVar, resources);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}