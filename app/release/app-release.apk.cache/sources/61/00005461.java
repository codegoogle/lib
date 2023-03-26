package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.li;
import com.p7700g.p99005.oi;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ResourcesCompat.java */
/* loaded from: classes.dex */
public final class oi {
    private static final String a = "ResourcesCompat";
    private static final ThreadLocal<TypedValue> b = new ThreadLocal<>();
    @k1("sColorStateCacheLock")
    private static final WeakHashMap<f, SparseArray<e>> c = new WeakHashMap<>(0);
    private static final Object d = new Object();
    @n0
    public static final int e = 0;

    /* compiled from: ResourcesCompat.java */
    @e2(15)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static Drawable a(Resources resources, int i, int i2) {
            return resources.getDrawableForDensity(i, i2);
        }
    }

    /* compiled from: ResourcesCompat.java */
    @e2(21)
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @e1
        public static Drawable a(Resources resources, int i, Resources.Theme theme) {
            return resources.getDrawable(i, theme);
        }

        @e1
        public static Drawable b(Resources resources, int i, int i2, Resources.Theme theme) {
            return resources.getDrawableForDensity(i, i2, theme);
        }
    }

    /* compiled from: ResourcesCompat.java */
    @e2(23)
    /* loaded from: classes.dex */
    public static class c {
        private c() {
        }

        @e1
        public static int a(Resources resources, int i, Resources.Theme theme) {
            return resources.getColor(i, theme);
        }

        @x1
        @e1
        public static ColorStateList b(@x1 Resources resources, @y0 int i, @z1 Resources.Theme theme) {
            return resources.getColorStateList(i, theme);
        }
    }

    /* compiled from: ResourcesCompat.java */
    @e2(29)
    /* loaded from: classes.dex */
    public static class d {
        private d() {
        }

        @e1
        public static float a(@x1 Resources resources, @a1 int i) {
            return resources.getFloat(i);
        }
    }

    /* compiled from: ResourcesCompat.java */
    /* loaded from: classes.dex */
    public static class e {
        public final ColorStateList a;
        public final Configuration b;
        public final int c;

        public e(@x1 ColorStateList colorStateList, @x1 Configuration configuration, @z1 Resources.Theme theme) {
            this.a = colorStateList;
            this.b = configuration;
            this.c = theme == null ? 0 : theme.hashCode();
        }
    }

    /* compiled from: ResourcesCompat.java */
    /* loaded from: classes.dex */
    public static final class f {
        public final Resources a;
        public final Resources.Theme b;

        public f(@x1 Resources resources, @z1 Resources.Theme theme) {
            this.a = resources;
            this.b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || f.class != obj.getClass()) {
                return false;
            }
            f fVar = (f) obj;
            return this.a.equals(fVar.a) && ep.a(this.b, fVar.b);
        }

        public int hashCode() {
            return ep.b(this.a, this.b);
        }
    }

    /* compiled from: ResourcesCompat.java */
    /* loaded from: classes.dex */
    public static abstract class g {
        @i2({i2.a.LIBRARY})
        @x1
        public static Handler getHandler(@z1 Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        public final void callbackFailAsync(final int i, @z1 Handler handler) {
            getHandler(handler).post(new Runnable() { // from class: com.p7700g.p99005.ei
                @Override // java.lang.Runnable
                public final void run() {
                    oi.g.this.a(i);
                }
            });
        }

        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        public final void callbackSuccessAsync(@x1 final Typeface typeface, @z1 Handler handler) {
            getHandler(handler).post(new Runnable() { // from class: com.p7700g.p99005.fi
                @Override // java.lang.Runnable
                public final void run() {
                    oi.g.this.b(typeface);
                }
            });
        }

        /* renamed from: onFontRetrievalFailed */
        public abstract void a(int i);

        /* renamed from: onFontRetrieved */
        public abstract void b(@x1 Typeface typeface);
    }

    /* compiled from: ResourcesCompat.java */
    /* loaded from: classes.dex */
    public static final class h {

        /* compiled from: ResourcesCompat.java */
        @e2(23)
        /* loaded from: classes.dex */
        public static class a {
            private static final Object a = new Object();
            private static Method b;
            private static boolean c;

            private a() {
            }

            @SuppressLint({"BanUncheckedReflection"})
            public static void a(@x1 Resources.Theme theme) {
                synchronized (a) {
                    if (!c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException unused) {
                        }
                        c = true;
                    }
                    Method method = b;
                    if (method != null) {
                        try {
                            method.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                            b = null;
                        }
                    }
                }
            }
        }

        /* compiled from: ResourcesCompat.java */
        @e2(29)
        /* loaded from: classes.dex */
        public static class b {
            private b() {
            }

            @e1
            public static void a(@x1 Resources.Theme theme) {
                theme.rebase();
            }
        }

        private h() {
        }

        public static void a(@x1 Resources.Theme theme) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                b.a(theme);
            } else if (i >= 23) {
                a.a(theme);
            }
        }
    }

    private oi() {
    }

    private static void a(@x1 f fVar, @y0 int i, @x1 ColorStateList colorStateList, @z1 Resources.Theme theme) {
        synchronized (d) {
            WeakHashMap<f, SparseArray<e>> weakHashMap = c;
            SparseArray<e> sparseArray = weakHashMap.get(fVar);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(fVar, sparseArray);
            }
            sparseArray.append(i, new e(colorStateList, fVar.a.getConfiguration(), theme));
        }
    }

    public static void b(@x1 Resources.Theme theme) {
        synchronized (d) {
            Iterator<f> it = c.keySet().iterator();
            while (it.hasNext()) {
                f next = it.next();
                if (next != null && theme.equals(next.b)) {
                    it.remove();
                }
            }
        }
    }

    @z1
    private static ColorStateList c(@x1 f fVar, @y0 int i) {
        e eVar;
        Resources.Theme theme;
        synchronized (d) {
            SparseArray<e> sparseArray = c.get(fVar);
            if (sparseArray != null && sparseArray.size() > 0 && (eVar = sparseArray.get(i)) != null) {
                if (eVar.b.equals(fVar.a.getConfiguration()) && (((theme = fVar.b) == null && eVar.c == 0) || (theme != null && eVar.c == theme.hashCode()))) {
                    return eVar.a;
                }
                sparseArray.remove(i);
            }
            return null;
        }
    }

    @z1
    public static Typeface d(@x1 Context context, @h1 int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return p(context, i, new TypedValue(), 0, null, null, false, true);
    }

    @w0
    public static int e(@x1 Resources resources, @y0 int i, @z1 Resources.Theme theme) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 23) {
            return c.a(resources, i, theme);
        }
        return resources.getColor(i);
    }

    @z1
    public static ColorStateList f(@x1 Resources resources, @y0 int i, @z1 Resources.Theme theme) throws Resources.NotFoundException {
        f fVar = new f(resources, theme);
        ColorStateList c2 = c(fVar, i);
        if (c2 != null) {
            return c2;
        }
        ColorStateList n = n(resources, i, theme);
        if (n != null) {
            a(fVar, i, n, theme);
            return n;
        } else if (Build.VERSION.SDK_INT >= 23) {
            return c.b(resources, i, theme);
        } else {
            return resources.getColorStateList(i);
        }
    }

    @z1
    public static Drawable g(@x1 Resources resources, @f1 int i, @z1 Resources.Theme theme) throws Resources.NotFoundException {
        return b.a(resources, i, theme);
    }

    @z1
    public static Drawable h(@x1 Resources resources, @f1 int i, int i2, @z1 Resources.Theme theme) throws Resources.NotFoundException {
        return b.b(resources, i, i2, theme);
    }

    public static float i(@x1 Resources resources, @a1 int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            return d.a(resources, i);
        }
        TypedValue m = m();
        resources.getValue(i, m, true);
        if (m.type == 4) {
            return m.getFloat();
        }
        StringBuilder G = wo1.G("Resource ID #0x");
        G.append(Integer.toHexString(i));
        G.append(" type #0x");
        G.append(Integer.toHexString(m.type));
        G.append(" is not valid");
        throw new Resources.NotFoundException(G.toString());
    }

    @z1
    public static Typeface j(@x1 Context context, @h1 int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return p(context, i, new TypedValue(), 0, null, null, false, false);
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @z1
    public static Typeface k(@x1 Context context, @h1 int i, @x1 TypedValue typedValue, int i2, @z1 g gVar) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return p(context, i, typedValue, i2, gVar, null, true, false);
    }

    public static void l(@x1 Context context, @h1 int i, @x1 g gVar, @z1 Handler handler) throws Resources.NotFoundException {
        jp.l(gVar);
        if (context.isRestricted()) {
            gVar.callbackFailAsync(-4, handler);
        } else {
            p(context, i, new TypedValue(), 0, gVar, handler, false, false);
        }
    }

    @x1
    private static TypedValue m() {
        ThreadLocal<TypedValue> threadLocal = b;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }

    @z1
    private static ColorStateList n(Resources resources, int i, @z1 Resources.Theme theme) {
        if (o(resources, i)) {
            return null;
        }
        try {
            return ii.a(resources, resources.getXml(i), theme);
        } catch (Exception unused) {
            return null;
        }
    }

    private static boolean o(@x1 Resources resources, @y0 int i) {
        TypedValue m = m();
        resources.getValue(i, m, true);
        int i2 = m.type;
        return i2 >= 28 && i2 <= 31;
    }

    private static Typeface p(@x1 Context context, int i, @x1 TypedValue typedValue, int i2, @z1 g gVar, @z1 Handler handler, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface q = q(context, resources, typedValue, i, i2, gVar, handler, z, z2);
        if (q == null && gVar == null && !z2) {
            StringBuilder G = wo1.G("Font resource ID #0x");
            G.append(Integer.toHexString(i));
            G.append(" could not be retrieved.");
            throw new Resources.NotFoundException(G.toString());
        }
        return q;
    }

    private static Typeface q(@x1 Context context, Resources resources, @x1 TypedValue typedValue, int i, int i2, @z1 g gVar, @z1 Handler handler, boolean z, boolean z2) {
        CharSequence charSequence = typedValue.string;
        if (charSequence != null) {
            String charSequence2 = charSequence.toString();
            if (!charSequence2.startsWith("res/")) {
                if (gVar != null) {
                    gVar.callbackFailAsync(-3, handler);
                }
                return null;
            }
            Typeface j = vj.j(resources, i, charSequence2, typedValue.assetCookie, i2);
            if (j != null) {
                if (gVar != null) {
                    gVar.callbackSuccessAsync(j, handler);
                }
                return j;
            } else if (z2) {
                return null;
            } else {
                try {
                    if (charSequence2.toLowerCase().endsWith(".xml")) {
                        li.b b2 = li.b(resources.getXml(i), resources);
                        if (b2 == null) {
                            if (gVar != null) {
                                gVar.callbackFailAsync(-3, handler);
                            }
                            return null;
                        }
                        return vj.e(context, b2, resources, i, charSequence2, typedValue.assetCookie, i2, gVar, handler, z);
                    }
                    Typeface g2 = vj.g(context, resources, i, charSequence2, typedValue.assetCookie, i2);
                    if (gVar != null) {
                        if (g2 != null) {
                            gVar.callbackSuccessAsync(g2, handler);
                        } else {
                            gVar.callbackFailAsync(-3, handler);
                        }
                    }
                    return g2;
                } catch (IOException | XmlPullParserException unused) {
                    if (gVar != null) {
                        gVar.callbackFailAsync(-3, handler);
                    }
                    return null;
                }
            }
        }
        StringBuilder G = wo1.G("Resource \"");
        G.append(resources.getResourceName(i));
        G.append("\" (");
        G.append(Integer.toHexString(i));
        G.append(") is not a Font: ");
        G.append(typedValue);
        throw new Resources.NotFoundException(G.toString());
    }
}