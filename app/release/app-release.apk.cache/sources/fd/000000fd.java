package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.ResourceManagerInternal;
import com.p7700g.p99005.a1;
import com.p7700g.p99005.f1;
import com.p7700g.p99005.fj;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.r3;
import com.p7700g.p99005.w0;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.x2;

@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class AppCompatDrawableManager {
    private static final boolean DEBUG = false;
    private static final PorterDuff.Mode DEFAULT_MODE = PorterDuff.Mode.SRC_IN;
    private static AppCompatDrawableManager INSTANCE = null;
    private static final String TAG = "AppCompatDrawableManag";
    private ResourceManagerInternal mResourceManager;

    public static synchronized AppCompatDrawableManager get() {
        AppCompatDrawableManager appCompatDrawableManager;
        synchronized (AppCompatDrawableManager.class) {
            if (INSTANCE == null) {
                preload();
            }
            appCompatDrawableManager = INSTANCE;
        }
        return appCompatDrawableManager;
    }

    public static synchronized PorterDuffColorFilter getPorterDuffColorFilter(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (AppCompatDrawableManager.class) {
            porterDuffColorFilter = ResourceManagerInternal.getPorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    public static synchronized void preload() {
        synchronized (AppCompatDrawableManager.class) {
            if (INSTANCE == null) {
                AppCompatDrawableManager appCompatDrawableManager = new AppCompatDrawableManager();
                INSTANCE = appCompatDrawableManager;
                appCompatDrawableManager.mResourceManager = ResourceManagerInternal.get();
                INSTANCE.mResourceManager.setHooks(new ResourceManagerInternal.ResourceManagerHooks() { // from class: androidx.appcompat.widget.AppCompatDrawableManager.1
                    private final int[] COLORFILTER_TINT_COLOR_CONTROL_NORMAL = {x2.f.y0, x2.f.w0, x2.f.a};
                    private final int[] TINT_COLOR_CONTROL_NORMAL = {x2.f.y, x2.f.h0, x2.f.F, x2.f.A, x2.f.B, x2.f.E, x2.f.D};
                    private final int[] COLORFILTER_COLOR_CONTROL_ACTIVATED = {x2.f.v0, x2.f.x0, x2.f.r, x2.f.r0, x2.f.s0, x2.f.t0, x2.f.u0};
                    private final int[] COLORFILTER_COLOR_BACKGROUND_MULTIPLY = {x2.f.X, x2.f.p, x2.f.W};
                    private final int[] TINT_COLOR_CONTROL_STATE_LIST = {x2.f.p0, x2.f.z0};
                    private final int[] TINT_CHECKABLE_BUTTON_LIST = {x2.f.d, x2.f.j, x2.f.e, x2.f.k};

                    private boolean arrayContains(int[] iArr, int i) {
                        for (int i2 : iArr) {
                            if (i2 == i) {
                                return true;
                            }
                        }
                        return false;
                    }

                    private ColorStateList createBorderlessButtonColorStateList(@x1 Context context) {
                        return createButtonColorStateList(context, 0);
                    }

                    private ColorStateList createButtonColorStateList(@x1 Context context, @w0 int i) {
                        int themeAttrColor = ThemeUtils.getThemeAttrColor(context, x2.b.G0);
                        return new ColorStateList(new int[][]{ThemeUtils.DISABLED_STATE_SET, ThemeUtils.PRESSED_STATE_SET, ThemeUtils.FOCUSED_STATE_SET, ThemeUtils.EMPTY_STATE_SET}, new int[]{ThemeUtils.getDisabledThemeAttrColor(context, x2.b.E0), fj.t(themeAttrColor, i), fj.t(themeAttrColor, i), i});
                    }

                    private ColorStateList createColoredButtonColorStateList(@x1 Context context) {
                        return createButtonColorStateList(context, ThemeUtils.getThemeAttrColor(context, x2.b.C0));
                    }

                    private ColorStateList createDefaultButtonColorStateList(@x1 Context context) {
                        return createButtonColorStateList(context, ThemeUtils.getThemeAttrColor(context, x2.b.E0));
                    }

                    private ColorStateList createSwitchThumbColorStateList(Context context) {
                        int[][] iArr = new int[3];
                        int[] iArr2 = new int[3];
                        int i = x2.b.L0;
                        ColorStateList themeAttrColorStateList = ThemeUtils.getThemeAttrColorStateList(context, i);
                        if (themeAttrColorStateList != null && themeAttrColorStateList.isStateful()) {
                            iArr[0] = ThemeUtils.DISABLED_STATE_SET;
                            iArr2[0] = themeAttrColorStateList.getColorForState(iArr[0], 0);
                            iArr[1] = ThemeUtils.CHECKED_STATE_SET;
                            iArr2[1] = ThemeUtils.getThemeAttrColor(context, x2.b.F0);
                            iArr[2] = ThemeUtils.EMPTY_STATE_SET;
                            iArr2[2] = themeAttrColorStateList.getDefaultColor();
                        } else {
                            iArr[0] = ThemeUtils.DISABLED_STATE_SET;
                            iArr2[0] = ThemeUtils.getDisabledThemeAttrColor(context, i);
                            iArr[1] = ThemeUtils.CHECKED_STATE_SET;
                            iArr2[1] = ThemeUtils.getThemeAttrColor(context, x2.b.F0);
                            iArr[2] = ThemeUtils.EMPTY_STATE_SET;
                            iArr2[2] = ThemeUtils.getThemeAttrColor(context, i);
                        }
                        return new ColorStateList(iArr, iArr2);
                    }

                    private LayerDrawable getRatingBarLayerDrawable(@x1 ResourceManagerInternal resourceManagerInternal, @x1 Context context, @a1 int i) {
                        BitmapDrawable bitmapDrawable;
                        BitmapDrawable bitmapDrawable2;
                        BitmapDrawable bitmapDrawable3;
                        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
                        Drawable drawable = resourceManagerInternal.getDrawable(context, x2.f.l0);
                        Drawable drawable2 = resourceManagerInternal.getDrawable(context, x2.f.m0);
                        if ((drawable instanceof BitmapDrawable) && drawable.getIntrinsicWidth() == dimensionPixelSize && drawable.getIntrinsicHeight() == dimensionPixelSize) {
                            bitmapDrawable = (BitmapDrawable) drawable;
                            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
                        } else {
                            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(createBitmap);
                            drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                            drawable.draw(canvas);
                            bitmapDrawable = new BitmapDrawable(createBitmap);
                            bitmapDrawable2 = new BitmapDrawable(createBitmap);
                        }
                        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
                        if ((drawable2 instanceof BitmapDrawable) && drawable2.getIntrinsicWidth() == dimensionPixelSize && drawable2.getIntrinsicHeight() == dimensionPixelSize) {
                            bitmapDrawable3 = (BitmapDrawable) drawable2;
                        } else {
                            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                            Canvas canvas2 = new Canvas(createBitmap2);
                            drawable2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                            drawable2.draw(canvas2);
                            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
                        }
                        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
                        layerDrawable.setId(0, 16908288);
                        layerDrawable.setId(1, 16908303);
                        layerDrawable.setId(2, 16908301);
                        return layerDrawable;
                    }

                    private void setPorterDuffColorFilter(Drawable drawable, int i, PorterDuff.Mode mode) {
                        if (DrawableUtils.canSafelyMutateDrawable(drawable)) {
                            drawable = drawable.mutate();
                        }
                        if (mode == null) {
                            mode = AppCompatDrawableManager.DEFAULT_MODE;
                        }
                        drawable.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(i, mode));
                    }

                    @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
                    public Drawable createDrawableFor(@x1 ResourceManagerInternal resourceManagerInternal, @x1 Context context, int i) {
                        if (i == x2.f.q) {
                            return new LayerDrawable(new Drawable[]{resourceManagerInternal.getDrawable(context, x2.f.p), resourceManagerInternal.getDrawable(context, x2.f.r)});
                        }
                        if (i == x2.f.Z) {
                            return getRatingBarLayerDrawable(resourceManagerInternal, context, x2.e.h0);
                        }
                        if (i == x2.f.Y) {
                            return getRatingBarLayerDrawable(resourceManagerInternal, context, x2.e.i0);
                        }
                        if (i == x2.f.a0) {
                            return getRatingBarLayerDrawable(resourceManagerInternal, context, x2.e.j0);
                        }
                        return null;
                    }

                    @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
                    public ColorStateList getTintListForDrawableRes(@x1 Context context, int i) {
                        if (i == x2.f.u) {
                            return r3.a(context, x2.d.v);
                        }
                        if (i == x2.f.o0) {
                            return r3.a(context, x2.d.y);
                        }
                        if (i == x2.f.n0) {
                            return createSwitchThumbColorStateList(context);
                        }
                        if (i == x2.f.i) {
                            return createDefaultButtonColorStateList(context);
                        }
                        if (i == x2.f.c) {
                            return createBorderlessButtonColorStateList(context);
                        }
                        if (i == x2.f.h) {
                            return createColoredButtonColorStateList(context);
                        }
                        if (i != x2.f.j0 && i != x2.f.k0) {
                            if (arrayContains(this.TINT_COLOR_CONTROL_NORMAL, i)) {
                                return ThemeUtils.getThemeAttrColorStateList(context, x2.b.H0);
                            }
                            if (arrayContains(this.TINT_COLOR_CONTROL_STATE_LIST, i)) {
                                return r3.a(context, x2.d.u);
                            }
                            if (arrayContains(this.TINT_CHECKABLE_BUTTON_LIST, i)) {
                                return r3.a(context, x2.d.t);
                            }
                            if (i == x2.f.g0) {
                                return r3.a(context, x2.d.w);
                            }
                            return null;
                        }
                        return r3.a(context, x2.d.x);
                    }

                    @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
                    public PorterDuff.Mode getTintModeForDrawableRes(int i) {
                        if (i == x2.f.n0) {
                            return PorterDuff.Mode.MULTIPLY;
                        }
                        return null;
                    }

                    @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
                    public boolean tintDrawable(@x1 Context context, int i, @x1 Drawable drawable) {
                        if (i == x2.f.i0) {
                            LayerDrawable layerDrawable = (LayerDrawable) drawable;
                            Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
                            int i2 = x2.b.H0;
                            setPorterDuffColorFilter(findDrawableByLayerId, ThemeUtils.getThemeAttrColor(context, i2), AppCompatDrawableManager.DEFAULT_MODE);
                            setPorterDuffColorFilter(layerDrawable.findDrawableByLayerId(16908303), ThemeUtils.getThemeAttrColor(context, i2), AppCompatDrawableManager.DEFAULT_MODE);
                            setPorterDuffColorFilter(layerDrawable.findDrawableByLayerId(16908301), ThemeUtils.getThemeAttrColor(context, x2.b.F0), AppCompatDrawableManager.DEFAULT_MODE);
                            return true;
                        } else if (i == x2.f.Z || i == x2.f.Y || i == x2.f.a0) {
                            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                            setPorterDuffColorFilter(layerDrawable2.findDrawableByLayerId(16908288), ThemeUtils.getDisabledThemeAttrColor(context, x2.b.H0), AppCompatDrawableManager.DEFAULT_MODE);
                            Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908303);
                            int i3 = x2.b.F0;
                            setPorterDuffColorFilter(findDrawableByLayerId2, ThemeUtils.getThemeAttrColor(context, i3), AppCompatDrawableManager.DEFAULT_MODE);
                            setPorterDuffColorFilter(layerDrawable2.findDrawableByLayerId(16908301), ThemeUtils.getThemeAttrColor(context, i3), AppCompatDrawableManager.DEFAULT_MODE);
                            return true;
                        } else {
                            return false;
                        }
                    }

                    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
                    /* JADX WARN: Removed duplicated region for block: B:28:0x0061 A[RETURN] */
                    @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public boolean tintDrawableUsingColorFilter(@x1 Context context, int i, @x1 Drawable drawable) {
                        int i2;
                        boolean z;
                        PorterDuff.Mode mode = AppCompatDrawableManager.DEFAULT_MODE;
                        int i3 = 16842801;
                        if (arrayContains(this.COLORFILTER_TINT_COLOR_CONTROL_NORMAL, i)) {
                            i3 = x2.b.H0;
                        } else if (arrayContains(this.COLORFILTER_COLOR_CONTROL_ACTIVATED, i)) {
                            i3 = x2.b.F0;
                        } else if (arrayContains(this.COLORFILTER_COLOR_BACKGROUND_MULTIPLY, i)) {
                            mode = PorterDuff.Mode.MULTIPLY;
                        } else if (i == x2.f.L) {
                            i3 = 16842800;
                            i2 = Math.round(40.8f);
                            z = true;
                            if (z) {
                                if (DrawableUtils.canSafelyMutateDrawable(drawable)) {
                                    drawable = drawable.mutate();
                                }
                                drawable.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(ThemeUtils.getThemeAttrColor(context, i3), mode));
                                if (i2 != -1) {
                                    drawable.setAlpha(i2);
                                }
                                return true;
                            }
                            return false;
                        } else if (i != x2.f.t) {
                            i2 = -1;
                            z = false;
                            i3 = 0;
                            if (z) {
                            }
                        }
                        i2 = -1;
                        z = true;
                        if (z) {
                        }
                    }
                });
            }
        }
    }

    public static void tintDrawable(Drawable drawable, TintInfo tintInfo, int[] iArr) {
        ResourceManagerInternal.tintDrawable(drawable, tintInfo, iArr);
    }

    public synchronized Drawable getDrawable(@x1 Context context, @f1 int i) {
        return this.mResourceManager.getDrawable(context, i);
    }

    public synchronized ColorStateList getTintList(@x1 Context context, @f1 int i) {
        return this.mResourceManager.getTintList(context, i);
    }

    public synchronized void onConfigurationChanged(@x1 Context context) {
        this.mResourceManager.onConfigurationChanged(context);
    }

    public synchronized Drawable onDrawableLoadedFromResources(@x1 Context context, @x1 VectorEnabledTintResources vectorEnabledTintResources, @f1 int i) {
        return this.mResourceManager.onDrawableLoadedFromResources(context, vectorEnabledTintResources, i);
    }

    public boolean tintDrawableUsingColorFilter(@x1 Context context, @f1 int i, @x1 Drawable drawable) {
        return this.mResourceManager.tintDrawableUsingColorFilter(context, i, drawable);
    }

    public synchronized Drawable getDrawable(@x1 Context context, @f1 int i, boolean z) {
        return this.mResourceManager.getDrawable(context, i, z);
    }
}