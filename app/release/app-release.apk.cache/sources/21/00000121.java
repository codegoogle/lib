package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import com.p7700g.p99005.bt;
import com.p7700g.p99005.e1;
import com.p7700g.p99005.e2;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.nt;
import com.p7700g.p99005.oi;
import com.p7700g.p99005.sr;
import com.p7700g.p99005.ts;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.x2;
import com.p7700g.p99005.z1;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* loaded from: classes.dex */
public class AppCompatTextHelper {
    private static final int MONOSPACE = 3;
    private static final int SANS = 1;
    private static final int SERIF = 2;
    private static final int TEXT_FONT_WEIGHT_UNSPECIFIED = -1;
    private boolean mAsyncFontPending;
    @x1
    private final AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper;
    private TintInfo mDrawableBottomTint;
    private TintInfo mDrawableEndTint;
    private TintInfo mDrawableLeftTint;
    private TintInfo mDrawableRightTint;
    private TintInfo mDrawableStartTint;
    private TintInfo mDrawableTint;
    private TintInfo mDrawableTopTint;
    private Typeface mFontTypeface;
    @x1
    private final TextView mView;
    private int mStyle = 0;
    private int mFontWeight = -1;

    @e2(17)
    /* loaded from: classes.dex */
    public static class Api17Impl {
        private Api17Impl() {
        }

        @e1
        public static Drawable[] getCompoundDrawablesRelative(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        @e1
        public static void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        @e1
        public static void setTextLocale(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    @e2(21)
    /* loaded from: classes.dex */
    public static class Api21Impl {
        private Api21Impl() {
        }

        @e1
        public static Locale forLanguageTag(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    @e2(24)
    /* loaded from: classes.dex */
    public static class Api24Impl {
        private Api24Impl() {
        }

        @e1
        public static LocaleList forLanguageTags(String str) {
            return LocaleList.forLanguageTags(str);
        }

        @e1
        public static void setTextLocales(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    @e2(26)
    /* loaded from: classes.dex */
    public static class Api26Impl {
        private Api26Impl() {
        }

        @e1
        public static int getAutoSizeStepGranularity(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        @e1
        public static void setAutoSizeTextTypeUniformWithConfiguration(TextView textView, int i, int i2, int i3, int i4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        @e1
        public static void setAutoSizeTextTypeUniformWithPresetSizes(TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        @e1
        public static boolean setFontVariationSettings(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    @e2(28)
    /* loaded from: classes.dex */
    public static class Api28Impl {
        private Api28Impl() {
        }

        @e1
        public static Typeface create(Typeface typeface, int i, boolean z) {
            return Typeface.create(typeface, i, z);
        }
    }

    public AppCompatTextHelper(@x1 TextView textView) {
        this.mView = textView;
        this.mAutoSizeTextHelper = new AppCompatTextViewAutoSizeHelper(textView);
    }

    private void applyCompoundDrawableTint(Drawable drawable, TintInfo tintInfo) {
        if (drawable == null || tintInfo == null) {
            return;
        }
        AppCompatDrawableManager.tintDrawable(drawable, tintInfo, this.mView.getDrawableState());
    }

    private static TintInfo createTintInfo(Context context, AppCompatDrawableManager appCompatDrawableManager, int i) {
        ColorStateList tintList = appCompatDrawableManager.getTintList(context, i);
        if (tintList != null) {
            TintInfo tintInfo = new TintInfo();
            tintInfo.mHasTintList = true;
            tintInfo.mTintList = tintList;
            return tintInfo;
        }
        return null;
    }

    private void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = Api17Impl.getCompoundDrawablesRelative(this.mView);
            TextView textView = this.mView;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            Api17Impl.setCompoundDrawablesRelativeWithIntrinsicBounds(textView, drawable5, drawable2, drawable6, drawable4);
        } else if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
        } else {
            Drawable[] compoundDrawablesRelative2 = Api17Impl.getCompoundDrawablesRelative(this.mView);
            if (compoundDrawablesRelative2[0] == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = this.mView.getCompoundDrawables();
                TextView textView2 = this.mView;
                if (drawable == null) {
                    drawable = compoundDrawables[0];
                }
                if (drawable2 == null) {
                    drawable2 = compoundDrawables[1];
                }
                if (drawable3 == null) {
                    drawable3 = compoundDrawables[2];
                }
                if (drawable4 == null) {
                    drawable4 = compoundDrawables[3];
                }
                textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                return;
            }
            TextView textView3 = this.mView;
            Drawable drawable7 = compoundDrawablesRelative2[0];
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            Drawable drawable8 = compoundDrawablesRelative2[2];
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            Api17Impl.setCompoundDrawablesRelativeWithIntrinsicBounds(textView3, drawable7, drawable2, drawable8, drawable4);
        }
    }

    private void setCompoundTints() {
        TintInfo tintInfo = this.mDrawableTint;
        this.mDrawableLeftTint = tintInfo;
        this.mDrawableTopTint = tintInfo;
        this.mDrawableRightTint = tintInfo;
        this.mDrawableBottomTint = tintInfo;
        this.mDrawableStartTint = tintInfo;
        this.mDrawableEndTint = tintInfo;
    }

    private void setTextSizeInternal(int i, float f) {
        this.mAutoSizeTextHelper.setTextSizeInternal(i, f);
    }

    private void updateTypefaceAndStyle(Context context, TintTypedArray tintTypedArray) {
        String string;
        this.mStyle = tintTypedArray.getInt(x2.m.R5, this.mStyle);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            int i2 = tintTypedArray.getInt(x2.m.a6, -1);
            this.mFontWeight = i2;
            if (i2 != -1) {
                this.mStyle = (this.mStyle & 2) | 0;
            }
        }
        int i3 = x2.m.Z5;
        if (!tintTypedArray.hasValue(i3) && !tintTypedArray.hasValue(x2.m.b6)) {
            int i4 = x2.m.Q5;
            if (tintTypedArray.hasValue(i4)) {
                this.mAsyncFontPending = false;
                int i5 = tintTypedArray.getInt(i4, 1);
                if (i5 == 1) {
                    this.mFontTypeface = Typeface.SANS_SERIF;
                    return;
                } else if (i5 == 2) {
                    this.mFontTypeface = Typeface.SERIF;
                    return;
                } else if (i5 != 3) {
                    return;
                } else {
                    this.mFontTypeface = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.mFontTypeface = null;
        int i6 = x2.m.b6;
        if (tintTypedArray.hasValue(i6)) {
            i3 = i6;
        }
        final int i7 = this.mFontWeight;
        final int i8 = this.mStyle;
        if (!context.isRestricted()) {
            final WeakReference weakReference = new WeakReference(this.mView);
            try {
                Typeface font = tintTypedArray.getFont(i3, this.mStyle, new oi.g() { // from class: androidx.appcompat.widget.AppCompatTextHelper.1
                    @Override // com.p7700g.p99005.oi.g
                    public void onFontRetrievalFailed(int i9) {
                    }

                    @Override // com.p7700g.p99005.oi.g
                    public void onFontRetrieved(@x1 Typeface typeface) {
                        int i9;
                        if (Build.VERSION.SDK_INT >= 28 && (i9 = i7) != -1) {
                            typeface = Api28Impl.create(typeface, i9, (i8 & 2) != 0);
                        }
                        AppCompatTextHelper.this.onAsyncTypefaceReceived(weakReference, typeface);
                    }
                });
                if (font != null) {
                    if (i >= 28 && this.mFontWeight != -1) {
                        this.mFontTypeface = Api28Impl.create(Typeface.create(font, 0), this.mFontWeight, (this.mStyle & 2) != 0);
                    } else {
                        this.mFontTypeface = font;
                    }
                }
                this.mAsyncFontPending = this.mFontTypeface == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.mFontTypeface != null || (string = tintTypedArray.getString(i3)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 28 && this.mFontWeight != -1) {
            this.mFontTypeface = Api28Impl.create(Typeface.create(string, 0), this.mFontWeight, (this.mStyle & 2) != 0);
        } else {
            this.mFontTypeface = Typeface.create(string, this.mStyle);
        }
    }

    public void applyCompoundDrawablesTints() {
        if (this.mDrawableLeftTint != null || this.mDrawableTopTint != null || this.mDrawableRightTint != null || this.mDrawableBottomTint != null) {
            Drawable[] compoundDrawables = this.mView.getCompoundDrawables();
            applyCompoundDrawableTint(compoundDrawables[0], this.mDrawableLeftTint);
            applyCompoundDrawableTint(compoundDrawables[1], this.mDrawableTopTint);
            applyCompoundDrawableTint(compoundDrawables[2], this.mDrawableRightTint);
            applyCompoundDrawableTint(compoundDrawables[3], this.mDrawableBottomTint);
        }
        if (this.mDrawableStartTint == null && this.mDrawableEndTint == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = Api17Impl.getCompoundDrawablesRelative(this.mView);
        applyCompoundDrawableTint(compoundDrawablesRelative[0], this.mDrawableStartTint);
        applyCompoundDrawableTint(compoundDrawablesRelative[2], this.mDrawableEndTint);
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public void autoSizeText() {
        this.mAutoSizeTextHelper.autoSizeText();
    }

    public int getAutoSizeMaxTextSize() {
        return this.mAutoSizeTextHelper.getAutoSizeMaxTextSize();
    }

    public int getAutoSizeMinTextSize() {
        return this.mAutoSizeTextHelper.getAutoSizeMinTextSize();
    }

    public int getAutoSizeStepGranularity() {
        return this.mAutoSizeTextHelper.getAutoSizeStepGranularity();
    }

    public int[] getAutoSizeTextAvailableSizes() {
        return this.mAutoSizeTextHelper.getAutoSizeTextAvailableSizes();
    }

    public int getAutoSizeTextType() {
        return this.mAutoSizeTextHelper.getAutoSizeTextType();
    }

    @z1
    public ColorStateList getCompoundDrawableTintList() {
        TintInfo tintInfo = this.mDrawableTint;
        if (tintInfo != null) {
            return tintInfo.mTintList;
        }
        return null;
    }

    @z1
    public PorterDuff.Mode getCompoundDrawableTintMode() {
        TintInfo tintInfo = this.mDrawableTint;
        if (tintInfo != null) {
            return tintInfo.mTintMode;
        }
        return null;
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public boolean isAutoSizeEnabled() {
        return this.mAutoSizeTextHelper.isAutoSizeEnabled();
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ca  */
    @SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void loadFromAttributes(@z1 AttributeSet attributeSet, int i) {
        String str;
        ColorStateList colorStateList;
        String str2;
        boolean z;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        boolean z2;
        String str3;
        int i2;
        int i3;
        String str4;
        AppCompatDrawableManager appCompatDrawableManager;
        Typeface typeface;
        TintTypedArray obtainStyledAttributes;
        int i4;
        int i5;
        int i6;
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int dimensionPixelSize3;
        int[] autoSizeTextAvailableSizes;
        Context context = this.mView.getContext();
        AppCompatDrawableManager appCompatDrawableManager2 = AppCompatDrawableManager.get();
        int[] iArr = x2.m.n0;
        TintTypedArray obtainStyledAttributes2 = TintTypedArray.obtainStyledAttributes(context, attributeSet, iArr, i, 0);
        TextView textView = this.mView;
        sr.y1(textView, textView.getContext(), iArr, attributeSet, obtainStyledAttributes2.getWrappedTypeArray(), i, 0);
        int resourceId = obtainStyledAttributes2.getResourceId(x2.m.o0, -1);
        int i7 = x2.m.r0;
        if (obtainStyledAttributes2.hasValue(i7)) {
            this.mDrawableLeftTint = createTintInfo(context, appCompatDrawableManager2, obtainStyledAttributes2.getResourceId(i7, 0));
        }
        int i8 = x2.m.p0;
        if (obtainStyledAttributes2.hasValue(i8)) {
            this.mDrawableTopTint = createTintInfo(context, appCompatDrawableManager2, obtainStyledAttributes2.getResourceId(i8, 0));
        }
        int i9 = x2.m.s0;
        if (obtainStyledAttributes2.hasValue(i9)) {
            this.mDrawableRightTint = createTintInfo(context, appCompatDrawableManager2, obtainStyledAttributes2.getResourceId(i9, 0));
        }
        int i10 = x2.m.q0;
        if (obtainStyledAttributes2.hasValue(i10)) {
            this.mDrawableBottomTint = createTintInfo(context, appCompatDrawableManager2, obtainStyledAttributes2.getResourceId(i10, 0));
        }
        int i11 = Build.VERSION.SDK_INT;
        int i12 = x2.m.t0;
        if (obtainStyledAttributes2.hasValue(i12)) {
            this.mDrawableStartTint = createTintInfo(context, appCompatDrawableManager2, obtainStyledAttributes2.getResourceId(i12, 0));
        }
        int i13 = x2.m.u0;
        if (obtainStyledAttributes2.hasValue(i13)) {
            this.mDrawableEndTint = createTintInfo(context, appCompatDrawableManager2, obtainStyledAttributes2.getResourceId(i13, 0));
        }
        obtainStyledAttributes2.recycle();
        boolean z3 = this.mView.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (resourceId != -1) {
            TintTypedArray obtainStyledAttributes3 = TintTypedArray.obtainStyledAttributes(context, resourceId, x2.m.O5);
            if (!z3) {
                int i14 = x2.m.d6;
                if (obtainStyledAttributes3.hasValue(i14)) {
                    z = obtainStyledAttributes3.getBoolean(i14, false);
                    z2 = true;
                    updateTypefaceAndStyle(context, obtainStyledAttributes3);
                    if (i11 >= 23) {
                        int i15 = x2.m.S5;
                        colorStateList = obtainStyledAttributes3.hasValue(i15) ? obtainStyledAttributes3.getColorStateList(i15) : null;
                        int i16 = x2.m.T5;
                        colorStateList2 = obtainStyledAttributes3.hasValue(i16) ? obtainStyledAttributes3.getColorStateList(i16) : null;
                        int i17 = x2.m.U5;
                        if (obtainStyledAttributes3.hasValue(i17)) {
                            colorStateList3 = obtainStyledAttributes3.getColorStateList(i17);
                            int i18 = x2.m.e6;
                            str2 = obtainStyledAttributes3.hasValue(i18) ? obtainStyledAttributes3.getString(i18) : null;
                            if (i11 >= 26) {
                                int i19 = x2.m.c6;
                                if (obtainStyledAttributes3.hasValue(i19)) {
                                    str = obtainStyledAttributes3.getString(i19);
                                    obtainStyledAttributes3.recycle();
                                }
                            }
                            str = null;
                            obtainStyledAttributes3.recycle();
                        }
                    } else {
                        colorStateList = null;
                        colorStateList2 = null;
                    }
                    colorStateList3 = null;
                    int i182 = x2.m.e6;
                    if (obtainStyledAttributes3.hasValue(i182)) {
                    }
                    if (i11 >= 26) {
                    }
                    str = null;
                    obtainStyledAttributes3.recycle();
                }
            }
            z = false;
            z2 = false;
            updateTypefaceAndStyle(context, obtainStyledAttributes3);
            if (i11 >= 23) {
            }
            colorStateList3 = null;
            int i1822 = x2.m.e6;
            if (obtainStyledAttributes3.hasValue(i1822)) {
            }
            if (i11 >= 26) {
            }
            str = null;
            obtainStyledAttributes3.recycle();
        } else {
            str = null;
            colorStateList = null;
            str2 = null;
            z = false;
            colorStateList2 = null;
            colorStateList3 = null;
            z2 = false;
        }
        TintTypedArray obtainStyledAttributes4 = TintTypedArray.obtainStyledAttributes(context, attributeSet, x2.m.O5, i, 0);
        if (!z3) {
            int i20 = x2.m.d6;
            if (obtainStyledAttributes4.hasValue(i20)) {
                str3 = str;
                z = obtainStyledAttributes4.getBoolean(i20, false);
                i2 = 23;
                z2 = true;
                if (i11 < i2) {
                    int i21 = x2.m.S5;
                    if (obtainStyledAttributes4.hasValue(i21)) {
                        colorStateList = obtainStyledAttributes4.getColorStateList(i21);
                    }
                    int i22 = x2.m.T5;
                    if (obtainStyledAttributes4.hasValue(i22)) {
                        colorStateList2 = obtainStyledAttributes4.getColorStateList(i22);
                    }
                    int i23 = x2.m.U5;
                    if (obtainStyledAttributes4.hasValue(i23)) {
                        colorStateList3 = obtainStyledAttributes4.getColorStateList(i23);
                    }
                }
                i3 = x2.m.e6;
                if (obtainStyledAttributes4.hasValue(i3)) {
                    str2 = obtainStyledAttributes4.getString(i3);
                }
                if (i11 >= 26) {
                    int i24 = x2.m.c6;
                    if (obtainStyledAttributes4.hasValue(i24)) {
                        str4 = obtainStyledAttributes4.getString(i24);
                        if (i11 >= 28) {
                            int i25 = x2.m.P5;
                            if (obtainStyledAttributes4.hasValue(i25)) {
                                appCompatDrawableManager = appCompatDrawableManager2;
                                if (obtainStyledAttributes4.getDimensionPixelSize(i25, -1) == 0) {
                                    this.mView.setTextSize(0, 0.0f);
                                }
                                updateTypefaceAndStyle(context, obtainStyledAttributes4);
                                obtainStyledAttributes4.recycle();
                                if (colorStateList != null) {
                                    this.mView.setTextColor(colorStateList);
                                }
                                if (colorStateList2 != null) {
                                    this.mView.setHintTextColor(colorStateList2);
                                }
                                if (colorStateList3 != null) {
                                    this.mView.setLinkTextColor(colorStateList3);
                                }
                                if (!z3 && z2) {
                                    setAllCaps(z);
                                }
                                typeface = this.mFontTypeface;
                                if (typeface != null) {
                                    if (this.mFontWeight == -1) {
                                        this.mView.setTypeface(typeface, this.mStyle);
                                    } else {
                                        this.mView.setTypeface(typeface);
                                    }
                                }
                                if (str4 != null) {
                                    Api26Impl.setFontVariationSettings(this.mView, str4);
                                }
                                if (str2 != null) {
                                    if (i11 >= 24) {
                                        Api24Impl.setTextLocales(this.mView, Api24Impl.forLanguageTags(str2));
                                    } else {
                                        Api17Impl.setTextLocale(this.mView, Api21Impl.forLanguageTag(str2.split(",")[0]));
                                    }
                                }
                                this.mAutoSizeTextHelper.loadFromAttributes(attributeSet, i);
                                if (bt.a0 && this.mAutoSizeTextHelper.getAutoSizeTextType() != 0) {
                                    autoSizeTextAvailableSizes = this.mAutoSizeTextHelper.getAutoSizeTextAvailableSizes();
                                    if (autoSizeTextAvailableSizes.length > 0) {
                                        if (Api26Impl.getAutoSizeStepGranularity(this.mView) != -1.0f) {
                                            Api26Impl.setAutoSizeTextTypeUniformWithConfiguration(this.mView, this.mAutoSizeTextHelper.getAutoSizeMinTextSize(), this.mAutoSizeTextHelper.getAutoSizeMaxTextSize(), this.mAutoSizeTextHelper.getAutoSizeStepGranularity(), 0);
                                        } else {
                                            Api26Impl.setAutoSizeTextTypeUniformWithPresetSizes(this.mView, autoSizeTextAvailableSizes, 0);
                                        }
                                    }
                                }
                                obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, x2.m.v0);
                                int resourceId2 = obtainStyledAttributes.getResourceId(x2.m.E0, -1);
                                AppCompatDrawableManager appCompatDrawableManager3 = appCompatDrawableManager;
                                Drawable drawable = resourceId2 == -1 ? appCompatDrawableManager3.getDrawable(context, resourceId2) : null;
                                int resourceId3 = obtainStyledAttributes.getResourceId(x2.m.J0, -1);
                                Drawable drawable2 = resourceId3 == -1 ? appCompatDrawableManager3.getDrawable(context, resourceId3) : null;
                                int resourceId4 = obtainStyledAttributes.getResourceId(x2.m.F0, -1);
                                Drawable drawable3 = resourceId4 == -1 ? appCompatDrawableManager3.getDrawable(context, resourceId4) : null;
                                int resourceId5 = obtainStyledAttributes.getResourceId(x2.m.C0, -1);
                                Drawable drawable4 = resourceId5 == -1 ? appCompatDrawableManager3.getDrawable(context, resourceId5) : null;
                                int resourceId6 = obtainStyledAttributes.getResourceId(x2.m.G0, -1);
                                Drawable drawable5 = resourceId6 == -1 ? appCompatDrawableManager3.getDrawable(context, resourceId6) : null;
                                int resourceId7 = obtainStyledAttributes.getResourceId(x2.m.D0, -1);
                                setCompoundDrawables(drawable, drawable2, drawable3, drawable4, drawable5, resourceId7 == -1 ? appCompatDrawableManager3.getDrawable(context, resourceId7) : null);
                                i4 = x2.m.H0;
                                if (obtainStyledAttributes.hasValue(i4)) {
                                    nt.u(this.mView, obtainStyledAttributes.getColorStateList(i4));
                                }
                                i5 = x2.m.I0;
                                if (obtainStyledAttributes.hasValue(i5)) {
                                    i6 = -1;
                                } else {
                                    i6 = -1;
                                    nt.v(this.mView, DrawableUtils.parseTintMode(obtainStyledAttributes.getInt(i5, -1), null));
                                }
                                dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(x2.m.L0, i6);
                                dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(x2.m.O0, i6);
                                dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(x2.m.P0, i6);
                                obtainStyledAttributes.recycle();
                                if (dimensionPixelSize != i6) {
                                    nt.A(this.mView, dimensionPixelSize);
                                }
                                if (dimensionPixelSize2 != i6) {
                                    nt.B(this.mView, dimensionPixelSize2);
                                }
                                if (dimensionPixelSize3 == i6) {
                                    nt.C(this.mView, dimensionPixelSize3);
                                    return;
                                }
                                return;
                            }
                        }
                        appCompatDrawableManager = appCompatDrawableManager2;
                        updateTypefaceAndStyle(context, obtainStyledAttributes4);
                        obtainStyledAttributes4.recycle();
                        if (colorStateList != null) {
                        }
                        if (colorStateList2 != null) {
                        }
                        if (colorStateList3 != null) {
                        }
                        if (!z3) {
                            setAllCaps(z);
                        }
                        typeface = this.mFontTypeface;
                        if (typeface != null) {
                        }
                        if (str4 != null) {
                        }
                        if (str2 != null) {
                        }
                        this.mAutoSizeTextHelper.loadFromAttributes(attributeSet, i);
                        if (bt.a0) {
                            autoSizeTextAvailableSizes = this.mAutoSizeTextHelper.getAutoSizeTextAvailableSizes();
                            if (autoSizeTextAvailableSizes.length > 0) {
                            }
                        }
                        obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, x2.m.v0);
                        int resourceId22 = obtainStyledAttributes.getResourceId(x2.m.E0, -1);
                        AppCompatDrawableManager appCompatDrawableManager32 = appCompatDrawableManager;
                        if (resourceId22 == -1) {
                        }
                        int resourceId32 = obtainStyledAttributes.getResourceId(x2.m.J0, -1);
                        if (resourceId32 == -1) {
                        }
                        int resourceId42 = obtainStyledAttributes.getResourceId(x2.m.F0, -1);
                        if (resourceId42 == -1) {
                        }
                        int resourceId52 = obtainStyledAttributes.getResourceId(x2.m.C0, -1);
                        if (resourceId52 == -1) {
                        }
                        int resourceId62 = obtainStyledAttributes.getResourceId(x2.m.G0, -1);
                        if (resourceId62 == -1) {
                        }
                        int resourceId72 = obtainStyledAttributes.getResourceId(x2.m.D0, -1);
                        setCompoundDrawables(drawable, drawable2, drawable3, drawable4, drawable5, resourceId72 == -1 ? appCompatDrawableManager32.getDrawable(context, resourceId72) : null);
                        i4 = x2.m.H0;
                        if (obtainStyledAttributes.hasValue(i4)) {
                        }
                        i5 = x2.m.I0;
                        if (obtainStyledAttributes.hasValue(i5)) {
                        }
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(x2.m.L0, i6);
                        dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(x2.m.O0, i6);
                        dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(x2.m.P0, i6);
                        obtainStyledAttributes.recycle();
                        if (dimensionPixelSize != i6) {
                        }
                        if (dimensionPixelSize2 != i6) {
                        }
                        if (dimensionPixelSize3 == i6) {
                        }
                    }
                }
                str4 = str3;
                if (i11 >= 28) {
                }
                appCompatDrawableManager = appCompatDrawableManager2;
                updateTypefaceAndStyle(context, obtainStyledAttributes4);
                obtainStyledAttributes4.recycle();
                if (colorStateList != null) {
                }
                if (colorStateList2 != null) {
                }
                if (colorStateList3 != null) {
                }
                if (!z3) {
                }
                typeface = this.mFontTypeface;
                if (typeface != null) {
                }
                if (str4 != null) {
                }
                if (str2 != null) {
                }
                this.mAutoSizeTextHelper.loadFromAttributes(attributeSet, i);
                if (bt.a0) {
                }
                obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, x2.m.v0);
                int resourceId222 = obtainStyledAttributes.getResourceId(x2.m.E0, -1);
                AppCompatDrawableManager appCompatDrawableManager322 = appCompatDrawableManager;
                if (resourceId222 == -1) {
                }
                int resourceId322 = obtainStyledAttributes.getResourceId(x2.m.J0, -1);
                if (resourceId322 == -1) {
                }
                int resourceId422 = obtainStyledAttributes.getResourceId(x2.m.F0, -1);
                if (resourceId422 == -1) {
                }
                int resourceId522 = obtainStyledAttributes.getResourceId(x2.m.C0, -1);
                if (resourceId522 == -1) {
                }
                int resourceId622 = obtainStyledAttributes.getResourceId(x2.m.G0, -1);
                if (resourceId622 == -1) {
                }
                int resourceId722 = obtainStyledAttributes.getResourceId(x2.m.D0, -1);
                setCompoundDrawables(drawable, drawable2, drawable3, drawable4, drawable5, resourceId722 == -1 ? appCompatDrawableManager322.getDrawable(context, resourceId722) : null);
                i4 = x2.m.H0;
                if (obtainStyledAttributes.hasValue(i4)) {
                }
                i5 = x2.m.I0;
                if (obtainStyledAttributes.hasValue(i5)) {
                }
                dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(x2.m.L0, i6);
                dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(x2.m.O0, i6);
                dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(x2.m.P0, i6);
                obtainStyledAttributes.recycle();
                if (dimensionPixelSize != i6) {
                }
                if (dimensionPixelSize2 != i6) {
                }
                if (dimensionPixelSize3 == i6) {
                }
            }
        }
        str3 = str;
        i2 = 23;
        if (i11 < i2) {
        }
        i3 = x2.m.e6;
        if (obtainStyledAttributes4.hasValue(i3)) {
        }
        if (i11 >= 26) {
        }
        str4 = str3;
        if (i11 >= 28) {
        }
        appCompatDrawableManager = appCompatDrawableManager2;
        updateTypefaceAndStyle(context, obtainStyledAttributes4);
        obtainStyledAttributes4.recycle();
        if (colorStateList != null) {
        }
        if (colorStateList2 != null) {
        }
        if (colorStateList3 != null) {
        }
        if (!z3) {
        }
        typeface = this.mFontTypeface;
        if (typeface != null) {
        }
        if (str4 != null) {
        }
        if (str2 != null) {
        }
        this.mAutoSizeTextHelper.loadFromAttributes(attributeSet, i);
        if (bt.a0) {
        }
        obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, x2.m.v0);
        int resourceId2222 = obtainStyledAttributes.getResourceId(x2.m.E0, -1);
        AppCompatDrawableManager appCompatDrawableManager3222 = appCompatDrawableManager;
        if (resourceId2222 == -1) {
        }
        int resourceId3222 = obtainStyledAttributes.getResourceId(x2.m.J0, -1);
        if (resourceId3222 == -1) {
        }
        int resourceId4222 = obtainStyledAttributes.getResourceId(x2.m.F0, -1);
        if (resourceId4222 == -1) {
        }
        int resourceId5222 = obtainStyledAttributes.getResourceId(x2.m.C0, -1);
        if (resourceId5222 == -1) {
        }
        int resourceId6222 = obtainStyledAttributes.getResourceId(x2.m.G0, -1);
        if (resourceId6222 == -1) {
        }
        int resourceId7222 = obtainStyledAttributes.getResourceId(x2.m.D0, -1);
        setCompoundDrawables(drawable, drawable2, drawable3, drawable4, drawable5, resourceId7222 == -1 ? appCompatDrawableManager3222.getDrawable(context, resourceId7222) : null);
        i4 = x2.m.H0;
        if (obtainStyledAttributes.hasValue(i4)) {
        }
        i5 = x2.m.I0;
        if (obtainStyledAttributes.hasValue(i5)) {
        }
        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(x2.m.L0, i6);
        dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(x2.m.O0, i6);
        dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(x2.m.P0, i6);
        obtainStyledAttributes.recycle();
        if (dimensionPixelSize != i6) {
        }
        if (dimensionPixelSize2 != i6) {
        }
        if (dimensionPixelSize3 == i6) {
        }
    }

    public void onAsyncTypefaceReceived(WeakReference<TextView> weakReference, final Typeface typeface) {
        if (this.mAsyncFontPending) {
            this.mFontTypeface = typeface;
            final TextView textView = weakReference.get();
            if (textView != null) {
                if (sr.N0(textView)) {
                    final int i = this.mStyle;
                    textView.post(new Runnable() { // from class: androidx.appcompat.widget.AppCompatTextHelper.2
                        @Override // java.lang.Runnable
                        public void run() {
                            textView.setTypeface(typeface, i);
                        }
                    });
                    return;
                }
                textView.setTypeface(typeface, this.mStyle);
            }
        }
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (bt.a0) {
            return;
        }
        autoSizeText();
    }

    public void onSetCompoundDrawables() {
        applyCompoundDrawablesTints();
    }

    public void onSetTextAppearance(Context context, int i) {
        String string;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, i, x2.m.O5);
        int i2 = x2.m.d6;
        if (obtainStyledAttributes.hasValue(i2)) {
            setAllCaps(obtainStyledAttributes.getBoolean(i2, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 23) {
            int i4 = x2.m.S5;
            if (obtainStyledAttributes.hasValue(i4) && (colorStateList3 = obtainStyledAttributes.getColorStateList(i4)) != null) {
                this.mView.setTextColor(colorStateList3);
            }
            int i5 = x2.m.U5;
            if (obtainStyledAttributes.hasValue(i5) && (colorStateList2 = obtainStyledAttributes.getColorStateList(i5)) != null) {
                this.mView.setLinkTextColor(colorStateList2);
            }
            int i6 = x2.m.T5;
            if (obtainStyledAttributes.hasValue(i6) && (colorStateList = obtainStyledAttributes.getColorStateList(i6)) != null) {
                this.mView.setHintTextColor(colorStateList);
            }
        }
        int i7 = x2.m.P5;
        if (obtainStyledAttributes.hasValue(i7) && obtainStyledAttributes.getDimensionPixelSize(i7, -1) == 0) {
            this.mView.setTextSize(0, 0.0f);
        }
        updateTypefaceAndStyle(context, obtainStyledAttributes);
        if (i3 >= 26) {
            int i8 = x2.m.c6;
            if (obtainStyledAttributes.hasValue(i8) && (string = obtainStyledAttributes.getString(i8)) != null) {
                Api26Impl.setFontVariationSettings(this.mView, string);
            }
        }
        obtainStyledAttributes.recycle();
        Typeface typeface = this.mFontTypeface;
        if (typeface != null) {
            this.mView.setTypeface(typeface, this.mStyle);
        }
    }

    public void populateSurroundingTextIfNeeded(@x1 TextView textView, @z1 InputConnection inputConnection, @x1 EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        ts.j(editorInfo, textView.getText());
    }

    public void setAllCaps(boolean z) {
        this.mView.setAllCaps(z);
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        this.mAutoSizeTextHelper.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(@x1 int[] iArr, int i) throws IllegalArgumentException {
        this.mAutoSizeTextHelper.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        this.mAutoSizeTextHelper.setAutoSizeTextTypeWithDefaults(i);
    }

    public void setCompoundDrawableTintList(@z1 ColorStateList colorStateList) {
        if (this.mDrawableTint == null) {
            this.mDrawableTint = new TintInfo();
        }
        TintInfo tintInfo = this.mDrawableTint;
        tintInfo.mTintList = colorStateList;
        tintInfo.mHasTintList = colorStateList != null;
        setCompoundTints();
    }

    public void setCompoundDrawableTintMode(@z1 PorterDuff.Mode mode) {
        if (this.mDrawableTint == null) {
            this.mDrawableTint = new TintInfo();
        }
        TintInfo tintInfo = this.mDrawableTint;
        tintInfo.mTintMode = mode;
        tintInfo.mHasTintMode = mode != null;
        setCompoundTints();
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public void setTextSize(int i, float f) {
        if (bt.a0 || isAutoSizeEnabled()) {
            return;
        }
        setTextSizeInternal(i, f);
    }
}