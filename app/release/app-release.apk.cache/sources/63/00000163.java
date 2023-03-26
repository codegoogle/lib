package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import com.anythink.expressad.foundation.h.h;
import com.p7700g.p99005.aa0;
import com.p7700g.p99005.f1;
import com.p7700g.p99005.fk;
import com.p7700g.p99005.ga0;
import com.p7700g.p99005.gh;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.s3;
import com.p7700g.p99005.v7;
import com.p7700g.p99005.w7;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.x3;
import com.p7700g.p99005.y3;
import com.p7700g.p99005.y7;
import com.p7700g.p99005.z1;
import com.p7700g.p99005.z7;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class ResourceManagerInternal {
    private static final boolean DEBUG = false;
    private static ResourceManagerInternal INSTANCE = null;
    private static final String PLATFORM_VD_CLAZZ = "android.graphics.drawable.VectorDrawable";
    private static final String SKIP_DRAWABLE_TAG = "appcompat_skip_skip";
    private static final String TAG = "ResourceManagerInternal";
    private y7<String, InflateDelegate> mDelegates;
    private final WeakHashMap<Context, v7<WeakReference<Drawable.ConstantState>>> mDrawableCaches = new WeakHashMap<>(0);
    private boolean mHasCheckedVectorDrawableSetup;
    private ResourceManagerHooks mHooks;
    private z7<String> mKnownDrawableIdTags;
    private WeakHashMap<Context, z7<ColorStateList>> mTintLists;
    private TypedValue mTypedValue;
    private static final PorterDuff.Mode DEFAULT_MODE = PorterDuff.Mode.SRC_IN;
    private static final ColorFilterLruCache COLOR_FILTER_CACHE = new ColorFilterLruCache(6);

    /* loaded from: classes.dex */
    public static class AsldcInflateDelegate implements InflateDelegate {
        @Override // androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate
        public Drawable createFromXmlInner(@x1 Context context, @x1 XmlPullParser xmlPullParser, @x1 AttributeSet attributeSet, @z1 Resources.Theme theme) {
            try {
                return s3.C(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class AvdcInflateDelegate implements InflateDelegate {
        @Override // androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate
        public Drawable createFromXmlInner(@x1 Context context, @x1 XmlPullParser xmlPullParser, @x1 AttributeSet attributeSet, @z1 Resources.Theme theme) {
            try {
                return aa0.f(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class ColorFilterLruCache extends w7<Integer, PorterDuffColorFilter> {
        public ColorFilterLruCache(int i) {
            super(i);
        }

        private static int generateCacheKey(int i, PorterDuff.Mode mode) {
            return mode.hashCode() + ((i + 31) * 31);
        }

        public PorterDuffColorFilter get(int i, PorterDuff.Mode mode) {
            return get(Integer.valueOf(generateCacheKey(i, mode)));
        }

        public PorterDuffColorFilter put(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return put(Integer.valueOf(generateCacheKey(i, mode)), porterDuffColorFilter);
        }
    }

    /* loaded from: classes.dex */
    public static class DrawableDelegate implements InflateDelegate {
        @Override // androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate
        public Drawable createFromXmlInner(@x1 Context context, @x1 XmlPullParser xmlPullParser, @x1 AttributeSet attributeSet, @z1 Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) DrawableDelegate.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    x3.c.c(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                    return drawable;
                } catch (Exception unused) {
                }
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public interface InflateDelegate {
        Drawable createFromXmlInner(@x1 Context context, @x1 XmlPullParser xmlPullParser, @x1 AttributeSet attributeSet, @z1 Resources.Theme theme);
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public interface ResourceManagerHooks {
        @z1
        Drawable createDrawableFor(@x1 ResourceManagerInternal resourceManagerInternal, @x1 Context context, @f1 int i);

        @z1
        ColorStateList getTintListForDrawableRes(@x1 Context context, @f1 int i);

        @z1
        PorterDuff.Mode getTintModeForDrawableRes(int i);

        boolean tintDrawable(@x1 Context context, @f1 int i, @x1 Drawable drawable);

        boolean tintDrawableUsingColorFilter(@x1 Context context, @f1 int i, @x1 Drawable drawable);
    }

    /* loaded from: classes.dex */
    public static class VdcInflateDelegate implements InflateDelegate {
        @Override // androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate
        public Drawable createFromXmlInner(@x1 Context context, @x1 XmlPullParser xmlPullParser, @x1 AttributeSet attributeSet, @z1 Resources.Theme theme) {
            try {
                return ga0.f(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    private void addDelegate(@x1 String str, @x1 InflateDelegate inflateDelegate) {
        if (this.mDelegates == null) {
            this.mDelegates = new y7<>();
        }
        this.mDelegates.put(str, inflateDelegate);
    }

    private synchronized boolean addDrawableToCache(@x1 Context context, long j, @x1 Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            v7<WeakReference<Drawable.ConstantState>> v7Var = this.mDrawableCaches.get(context);
            if (v7Var == null) {
                v7Var = new v7<>();
                this.mDrawableCaches.put(context, v7Var);
            }
            v7Var.u(j, new WeakReference<>(constantState));
            return true;
        }
        return false;
    }

    private void addTintListToCache(@x1 Context context, @f1 int i, @x1 ColorStateList colorStateList) {
        if (this.mTintLists == null) {
            this.mTintLists = new WeakHashMap<>();
        }
        z7<ColorStateList> z7Var = this.mTintLists.get(context);
        if (z7Var == null) {
            z7Var = new z7<>();
            this.mTintLists.put(context, z7Var);
        }
        z7Var.a(i, colorStateList);
    }

    private void checkVectorDrawableSetup(@x1 Context context) {
        if (this.mHasCheckedVectorDrawableSetup) {
            return;
        }
        this.mHasCheckedVectorDrawableSetup = true;
        Drawable drawable = getDrawable(context, y3.a.a);
        if (drawable == null || !isVectorDrawable(drawable)) {
            this.mHasCheckedVectorDrawableSetup = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private static long createCacheKey(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    private Drawable createDrawableIfNeeded(@x1 Context context, @f1 int i) {
        if (this.mTypedValue == null) {
            this.mTypedValue = new TypedValue();
        }
        TypedValue typedValue = this.mTypedValue;
        context.getResources().getValue(i, typedValue, true);
        long createCacheKey = createCacheKey(typedValue);
        Drawable cachedDrawable = getCachedDrawable(context, createCacheKey);
        if (cachedDrawable != null) {
            return cachedDrawable;
        }
        ResourceManagerHooks resourceManagerHooks = this.mHooks;
        Drawable createDrawableFor = resourceManagerHooks == null ? null : resourceManagerHooks.createDrawableFor(this, context, i);
        if (createDrawableFor != null) {
            createDrawableFor.setChangingConfigurations(typedValue.changingConfigurations);
            addDrawableToCache(context, createCacheKey, createDrawableFor);
        }
        return createDrawableFor;
    }

    private static PorterDuffColorFilter createTintFilter(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return getPorterDuffColorFilter(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized ResourceManagerInternal get() {
        ResourceManagerInternal resourceManagerInternal;
        synchronized (ResourceManagerInternal.class) {
            if (INSTANCE == null) {
                ResourceManagerInternal resourceManagerInternal2 = new ResourceManagerInternal();
                INSTANCE = resourceManagerInternal2;
                installDefaultInflateDelegates(resourceManagerInternal2);
            }
            resourceManagerInternal = INSTANCE;
        }
        return resourceManagerInternal;
    }

    private synchronized Drawable getCachedDrawable(@x1 Context context, long j) {
        v7<WeakReference<Drawable.ConstantState>> v7Var = this.mDrawableCaches.get(context);
        if (v7Var == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> h = v7Var.h(j);
        if (h != null) {
            Drawable.ConstantState constantState = h.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            v7Var.A(j);
        }
        return null;
    }

    public static synchronized PorterDuffColorFilter getPorterDuffColorFilter(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (ResourceManagerInternal.class) {
            ColorFilterLruCache colorFilterLruCache = COLOR_FILTER_CACHE;
            porterDuffColorFilter = colorFilterLruCache.get(i, mode);
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
                colorFilterLruCache.put(i, mode, porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    private ColorStateList getTintListFromCache(@x1 Context context, @f1 int i) {
        z7<ColorStateList> z7Var;
        WeakHashMap<Context, z7<ColorStateList>> weakHashMap = this.mTintLists;
        if (weakHashMap == null || (z7Var = weakHashMap.get(context)) == null) {
            return null;
        }
        return z7Var.h(i);
    }

    private static void installDefaultInflateDelegates(@x1 ResourceManagerInternal resourceManagerInternal) {
        if (Build.VERSION.SDK_INT < 24) {
            resourceManagerInternal.addDelegate("vector", new VdcInflateDelegate());
            resourceManagerInternal.addDelegate("animated-vector", new AvdcInflateDelegate());
            resourceManagerInternal.addDelegate("animated-selector", new AsldcInflateDelegate());
            resourceManagerInternal.addDelegate(h.c, new DrawableDelegate());
        }
    }

    private static boolean isVectorDrawable(@x1 Drawable drawable) {
        return (drawable instanceof ga0) || PLATFORM_VD_CLAZZ.equals(drawable.getClass().getName());
    }

    private Drawable loadDrawableFromDelegates(@x1 Context context, @f1 int i) {
        int next;
        y7<String, InflateDelegate> y7Var = this.mDelegates;
        if (y7Var == null || y7Var.isEmpty()) {
            return null;
        }
        z7<String> z7Var = this.mKnownDrawableIdTags;
        if (z7Var != null) {
            String h = z7Var.h(i);
            if (SKIP_DRAWABLE_TAG.equals(h) || (h != null && this.mDelegates.get(h) == null)) {
                return null;
            }
        } else {
            this.mKnownDrawableIdTags = new z7<>();
        }
        if (this.mTypedValue == null) {
            this.mTypedValue = new TypedValue();
        }
        TypedValue typedValue = this.mTypedValue;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        long createCacheKey = createCacheKey(typedValue);
        Drawable cachedDrawable = getCachedDrawable(context, createCacheKey);
        if (cachedDrawable != null) {
            return cachedDrawable;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                while (true) {
                    next = xml.next();
                    if (next == 2 || next == 1) {
                        break;
                    }
                }
                if (next == 2) {
                    String name = xml.getName();
                    this.mKnownDrawableIdTags.a(i, name);
                    InflateDelegate inflateDelegate = this.mDelegates.get(name);
                    if (inflateDelegate != null) {
                        cachedDrawable = inflateDelegate.createFromXmlInner(context, xml, asAttributeSet, context.getTheme());
                    }
                    if (cachedDrawable != null) {
                        cachedDrawable.setChangingConfigurations(typedValue.changingConfigurations);
                        addDrawableToCache(context, createCacheKey, cachedDrawable);
                    }
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (Exception unused) {
            }
        }
        if (cachedDrawable == null) {
            this.mKnownDrawableIdTags.a(i, SKIP_DRAWABLE_TAG);
        }
        return cachedDrawable;
    }

    private Drawable tintDrawable(@x1 Context context, @f1 int i, boolean z, @x1 Drawable drawable) {
        ColorStateList tintList = getTintList(context, i);
        if (tintList != null) {
            if (DrawableUtils.canSafelyMutateDrawable(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable r = fk.r(drawable);
            fk.o(r, tintList);
            PorterDuff.Mode tintMode = getTintMode(i);
            if (tintMode != null) {
                fk.p(r, tintMode);
                return r;
            }
            return r;
        }
        ResourceManagerHooks resourceManagerHooks = this.mHooks;
        if ((resourceManagerHooks == null || !resourceManagerHooks.tintDrawable(context, i, drawable)) && !tintDrawableUsingColorFilter(context, i, drawable) && z) {
            return null;
        }
        return drawable;
    }

    public synchronized Drawable getDrawable(@x1 Context context, @f1 int i) {
        return getDrawable(context, i, false);
    }

    public synchronized ColorStateList getTintList(@x1 Context context, @f1 int i) {
        ColorStateList tintListFromCache;
        tintListFromCache = getTintListFromCache(context, i);
        if (tintListFromCache == null) {
            ResourceManagerHooks resourceManagerHooks = this.mHooks;
            tintListFromCache = resourceManagerHooks == null ? null : resourceManagerHooks.getTintListForDrawableRes(context, i);
            if (tintListFromCache != null) {
                addTintListToCache(context, i, tintListFromCache);
            }
        }
        return tintListFromCache;
    }

    public PorterDuff.Mode getTintMode(int i) {
        ResourceManagerHooks resourceManagerHooks = this.mHooks;
        if (resourceManagerHooks == null) {
            return null;
        }
        return resourceManagerHooks.getTintModeForDrawableRes(i);
    }

    public synchronized void onConfigurationChanged(@x1 Context context) {
        v7<WeakReference<Drawable.ConstantState>> v7Var = this.mDrawableCaches.get(context);
        if (v7Var != null) {
            v7Var.b();
        }
    }

    public synchronized Drawable onDrawableLoadedFromResources(@x1 Context context, @x1 VectorEnabledTintResources vectorEnabledTintResources, @f1 int i) {
        Drawable loadDrawableFromDelegates = loadDrawableFromDelegates(context, i);
        if (loadDrawableFromDelegates == null) {
            loadDrawableFromDelegates = vectorEnabledTintResources.getDrawableCanonical(i);
        }
        if (loadDrawableFromDelegates != null) {
            return tintDrawable(context, i, false, loadDrawableFromDelegates);
        }
        return null;
    }

    public synchronized void setHooks(ResourceManagerHooks resourceManagerHooks) {
        this.mHooks = resourceManagerHooks;
    }

    public boolean tintDrawableUsingColorFilter(@x1 Context context, @f1 int i, @x1 Drawable drawable) {
        ResourceManagerHooks resourceManagerHooks = this.mHooks;
        return resourceManagerHooks != null && resourceManagerHooks.tintDrawableUsingColorFilter(context, i, drawable);
    }

    public synchronized Drawable getDrawable(@x1 Context context, @f1 int i, boolean z) {
        Drawable loadDrawableFromDelegates;
        checkVectorDrawableSetup(context);
        loadDrawableFromDelegates = loadDrawableFromDelegates(context, i);
        if (loadDrawableFromDelegates == null) {
            loadDrawableFromDelegates = createDrawableIfNeeded(context, i);
        }
        if (loadDrawableFromDelegates == null) {
            loadDrawableFromDelegates = gh.i(context, i);
        }
        if (loadDrawableFromDelegates != null) {
            loadDrawableFromDelegates = tintDrawable(context, i, z, loadDrawableFromDelegates);
        }
        if (loadDrawableFromDelegates != null) {
            DrawableUtils.fixDrawable(loadDrawableFromDelegates);
        }
        return loadDrawableFromDelegates;
    }

    public static void tintDrawable(Drawable drawable, TintInfo tintInfo, int[] iArr) {
        int[] state = drawable.getState();
        if (DrawableUtils.canSafelyMutateDrawable(drawable)) {
            if (!(drawable.mutate() == drawable)) {
                return;
            }
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = tintInfo.mHasTintList;
        if (!z && !tintInfo.mHasTintMode) {
            drawable.clearColorFilter();
        } else {
            drawable.setColorFilter(createTintFilter(z ? tintInfo.mTintList : null, tintInfo.mHasTintMode ? tintInfo.mTintMode : DEFAULT_MODE, iArr));
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }
}