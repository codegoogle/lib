package com.p7700g.p99005;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.p7700g.p99005.fo;
import com.p7700g.p99005.i2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: TextViewCompat.java */
/* loaded from: classes.dex */
public final class nt {
    private static final String a = "TextViewCompat";
    public static final int b = 0;
    public static final int c = 1;
    private static Field d = null;
    private static boolean e = false;
    private static Field f = null;
    private static boolean g = false;
    private static Field h = null;
    private static boolean i = false;
    private static Field j = null;
    private static boolean k = false;
    private static final int l = 1;

    /* compiled from: TextViewCompat.java */
    @e2(16)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static boolean a(TextView textView) {
            return textView.getIncludeFontPadding();
        }

        @e1
        public static int b(TextView textView) {
            return textView.getMaxLines();
        }

        @e1
        public static int c(TextView textView) {
            return textView.getMinLines();
        }
    }

    /* compiled from: TextViewCompat.java */
    @e2(17)
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @e1
        public static Drawable[] a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        @e1
        public static int b(View view) {
            return view.getLayoutDirection();
        }

        @e1
        public static int c(View view) {
            return view.getTextDirection();
        }

        @e1
        public static Locale d(TextView textView) {
            return textView.getTextLocale();
        }

        @e1
        public static void e(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }

        @e1
        public static void f(TextView textView, int i, int i2, int i3, int i4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        }

        @e1
        public static void g(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        @e1
        public static void h(View view, int i) {
            view.setTextDirection(i);
        }
    }

    /* compiled from: TextViewCompat.java */
    @e2(23)
    /* loaded from: classes.dex */
    public static class c {
        private c() {
        }

        @e1
        public static int a(TextView textView) {
            return textView.getBreakStrategy();
        }

        @e1
        public static ColorStateList b(TextView textView) {
            return textView.getCompoundDrawableTintList();
        }

        @e1
        public static PorterDuff.Mode c(TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }

        @e1
        public static int d(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        @e1
        public static void e(TextView textView, int i) {
            textView.setBreakStrategy(i);
        }

        @e1
        public static void f(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        @e1
        public static void g(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        @e1
        public static void h(TextView textView, int i) {
            textView.setHyphenationFrequency(i);
        }
    }

    /* compiled from: TextViewCompat.java */
    @e2(24)
    /* loaded from: classes.dex */
    public static class d {
        private d() {
        }

        @e1
        public static DecimalFormatSymbols a(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    /* compiled from: TextViewCompat.java */
    @e2(26)
    /* loaded from: classes.dex */
    public static class e {
        private e() {
        }

        @e1
        public static int a(TextView textView) {
            return textView.getAutoSizeMaxTextSize();
        }

        @e1
        public static int b(TextView textView) {
            return textView.getAutoSizeMinTextSize();
        }

        @e1
        public static int c(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        @e1
        public static int[] d(TextView textView) {
            return textView.getAutoSizeTextAvailableSizes();
        }

        @e1
        public static int e(TextView textView) {
            return textView.getAutoSizeTextType();
        }

        @e1
        public static void f(TextView textView, int i, int i2, int i3, int i4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        @e1
        public static void g(TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        @e1
        public static void h(TextView textView, int i) {
            textView.setAutoSizeTextTypeWithDefaults(i);
        }
    }

    /* compiled from: TextViewCompat.java */
    @e2(28)
    /* loaded from: classes.dex */
    public static class f {
        private f() {
        }

        @e1
        public static String[] a(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        @e1
        public static PrecomputedText.Params b(TextView textView) {
            return textView.getTextMetricsParams();
        }

        @e1
        public static void c(TextView textView, int i) {
            textView.setFirstBaselineToTopHeight(i);
        }
    }

    /* compiled from: TextViewCompat.java */
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface g {
    }

    /* compiled from: TextViewCompat.java */
    @e2(26)
    /* loaded from: classes.dex */
    public static class h implements ActionMode.Callback {
        private static final int a = 100;
        private final ActionMode.Callback b;
        private final TextView c;
        private Class<?> d;
        private Method e;
        private boolean f;
        private boolean g = false;

        public h(ActionMode.Callback callback, TextView textView) {
            this.b = callback;
            this.c = textView;
        }

        private Intent a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        private Intent b(ResolveInfo resolveInfo, TextView textView) {
            Intent putExtra = a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !e(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return putExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        private List<ResolveInfo> c(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (context instanceof Activity) {
                for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(a(), 0)) {
                    if (f(resolveInfo, context)) {
                        arrayList.add(resolveInfo);
                    }
                }
                return arrayList;
            }
            return arrayList;
        }

        private boolean e(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        private boolean f(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (activityInfo.exported) {
                String str = activityInfo.permission;
                return str == null || context.checkSelfPermission(str) == 0;
            }
            return false;
        }

        private void g(Menu menu) {
            Method declaredMethod;
            Context context = this.c.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.g) {
                this.g = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.d = cls;
                    this.e = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.f = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.d = null;
                    this.e = null;
                    this.f = false;
                }
            }
            try {
                if (this.f && this.d.isInstance(menu)) {
                    declaredMethod = this.e;
                } else {
                    declaredMethod = menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                }
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                List<ResolveInfo> c = c(context, packageManager);
                for (int i = 0; i < c.size(); i++) {
                    ResolveInfo resolveInfo = c.get(i);
                    menu.add(0, 0, i + 100, resolveInfo.loadLabel(packageManager)).setIntent(b(resolveInfo, this.c)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        @x1
        public ActionMode.Callback d() {
            return this.b;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.b.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.b.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.b.onDestroyActionMode(actionMode);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            g(menu);
            return this.b.onPrepareActionMode(actionMode, menu);
        }
    }

    private nt() {
    }

    public static void A(@x1 TextView textView, @p1(from = 0) @c2 int i2) {
        int i3;
        jp.i(i2);
        if (Build.VERSION.SDK_INT >= 28) {
            f.c(textView, i2);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (a.a(textView)) {
            i3 = fontMetricsInt.top;
        } else {
            i3 = fontMetricsInt.ascent;
        }
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), i2 + i3, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void B(@x1 TextView textView, @p1(from = 0) @c2 int i2) {
        int i3;
        jp.i(i2);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (a.a(textView)) {
            i3 = fontMetricsInt.bottom;
        } else {
            i3 = fontMetricsInt.descent;
        }
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i2 - i3);
        }
    }

    public static void C(@x1 TextView textView, @p1(from = 0) @c2 int i2) {
        jp.i(i2);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i2 != fontMetricsInt) {
            textView.setLineSpacing(i2 - fontMetricsInt, 1.0f);
        }
    }

    public static void D(@x1 TextView textView, @x1 fo foVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            textView.setText(foVar.f());
        } else if (o(textView).a(foVar.e())) {
            textView.setText(foVar);
        } else {
            throw new IllegalArgumentException("Given text can not be applied to TextView.");
        }
    }

    public static void E(@x1 TextView textView, @m2 int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i2);
        } else {
            textView.setTextAppearance(textView.getContext(), i2);
        }
    }

    public static void F(@x1 TextView textView, @x1 fo.a aVar) {
        int i2 = Build.VERSION.SDK_INT;
        b.h(textView, m(aVar.d()));
        if (i2 < 23) {
            float textScaleX = aVar.e().getTextScaleX();
            textView.getPaint().set(aVar.e());
            if (textScaleX == textView.getTextScaleX()) {
                textView.setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            textView.setTextScaleX(textScaleX);
            return;
        }
        textView.getPaint().set(aVar.e());
        c.e(textView, aVar.b());
        c.h(textView, aVar.c());
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @z1
    public static ActionMode.Callback G(@z1 ActionMode.Callback callback) {
        return (!(callback instanceof h) || Build.VERSION.SDK_INT < 26) ? callback : ((h) callback).d();
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @z1
    public static ActionMode.Callback H(@x1 TextView textView, @z1 ActionMode.Callback callback) {
        int i2 = Build.VERSION.SDK_INT;
        return (i2 < 26 || i2 > 27 || (callback instanceof h) || callback == null) ? callback : new h(callback, textView);
    }

    public static int a(@x1 TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return e.a(textView);
        }
        if (textView instanceof bt) {
            return ((bt) textView).getAutoSizeMaxTextSize();
        }
        return -1;
    }

    public static int b(@x1 TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return e.b(textView);
        }
        if (textView instanceof bt) {
            return ((bt) textView).getAutoSizeMinTextSize();
        }
        return -1;
    }

    public static int c(@x1 TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return e.c(textView);
        }
        if (textView instanceof bt) {
            return ((bt) textView).getAutoSizeStepGranularity();
        }
        return -1;
    }

    @x1
    public static int[] d(@x1 TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return e.d(textView);
        }
        return textView instanceof bt ? ((bt) textView).getAutoSizeTextAvailableSizes() : new int[0];
    }

    public static int e(@x1 TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return e.e(textView);
        }
        if (textView instanceof bt) {
            return ((bt) textView).getAutoSizeTextType();
        }
        return 0;
    }

    @z1
    public static ColorStateList f(@x1 TextView textView) {
        jp.l(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            return c.b(textView);
        }
        if (textView instanceof st) {
            return ((st) textView).getSupportCompoundDrawablesTintList();
        }
        return null;
    }

    @z1
    public static PorterDuff.Mode g(@x1 TextView textView) {
        jp.l(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            return c.c(textView);
        }
        if (textView instanceof st) {
            return ((st) textView).getSupportCompoundDrawablesTintMode();
        }
        return null;
    }

    @x1
    public static Drawable[] h(@x1 TextView textView) {
        return b.a(textView);
    }

    public static int i(@x1 TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    public static int j(@x1 TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    public static int k(@x1 TextView textView) {
        return a.b(textView);
    }

    public static int l(@x1 TextView textView) {
        return a.c(textView);
    }

    @e2(18)
    private static int m(@x1 TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        return textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL ? 7 : 1;
    }

    @e2(18)
    private static TextDirectionHeuristic n(@x1 TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        if (Build.VERSION.SDK_INT >= 28 && (textView.getInputType() & 15) == 3) {
            byte directionality = Character.getDirectionality(f.a(d.a(b.d(textView)))[0].codePointAt(0));
            if (directionality != 1 && directionality != 2) {
                return TextDirectionHeuristics.LTR;
            }
            return TextDirectionHeuristics.RTL;
        }
        boolean z = b.b(textView) == 1;
        switch (b.c(textView)) {
            case 2:
                return TextDirectionHeuristics.ANYRTL_LTR;
            case 3:
                return TextDirectionHeuristics.LTR;
            case 4:
                return TextDirectionHeuristics.RTL;
            case 5:
                return TextDirectionHeuristics.LOCALE;
            case 6:
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            case 7:
                return TextDirectionHeuristics.FIRSTSTRONG_RTL;
            default:
                if (z) {
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                }
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
    }

    @x1
    public static fo.a o(@x1 TextView textView) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            return new fo.a(f.b(textView));
        }
        fo.a.C0173a c0173a = new fo.a.C0173a(new TextPaint(textView.getPaint()));
        if (i2 >= 23) {
            c0173a.b(c.a(textView));
            c0173a.c(c.d(textView));
        }
        c0173a.d(n(textView));
        return c0173a.a();
    }

    private static Field p(String str) {
        Field field = null;
        try {
            field = TextView.class.getDeclaredField(str);
            field.setAccessible(true);
            return field;
        } catch (NoSuchFieldException unused) {
            return field;
        }
    }

    private static int q(Field field, TextView textView) {
        try {
            return field.getInt(textView);
        } catch (IllegalAccessException unused) {
            field.getName();
            return -1;
        }
    }

    public static void r(@x1 TextView textView, int i2, int i3, int i4, int i5) throws IllegalArgumentException {
        if (Build.VERSION.SDK_INT >= 27) {
            e.f(textView, i2, i3, i4, i5);
        } else if (textView instanceof bt) {
            ((bt) textView).setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
        }
    }

    public static void s(@x1 TextView textView, @x1 int[] iArr, int i2) throws IllegalArgumentException {
        if (Build.VERSION.SDK_INT >= 27) {
            e.g(textView, iArr, i2);
        } else if (textView instanceof bt) {
            ((bt) textView).setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
        }
    }

    public static void t(@x1 TextView textView, int i2) {
        if (Build.VERSION.SDK_INT >= 27) {
            e.h(textView, i2);
        } else if (textView instanceof bt) {
            ((bt) textView).setAutoSizeTextTypeWithDefaults(i2);
        }
    }

    public static void u(@x1 TextView textView, @z1 ColorStateList colorStateList) {
        jp.l(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            c.f(textView, colorStateList);
        } else if (textView instanceof st) {
            ((st) textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    public static void v(@x1 TextView textView, @z1 PorterDuff.Mode mode) {
        jp.l(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            c.g(textView, mode);
        } else if (textView instanceof st) {
            ((st) textView).setSupportCompoundDrawablesTintMode(mode);
        }
    }

    public static void w(@x1 TextView textView, @z1 Drawable drawable, @z1 Drawable drawable2, @z1 Drawable drawable3, @z1 Drawable drawable4) {
        b.e(textView, drawable, drawable2, drawable3, drawable4);
    }

    public static void x(@x1 TextView textView, @f1 int i2, @f1 int i3, @f1 int i4, @f1 int i5) {
        b.f(textView, i2, i3, i4, i5);
    }

    public static void y(@x1 TextView textView, @z1 Drawable drawable, @z1 Drawable drawable2, @z1 Drawable drawable3, @z1 Drawable drawable4) {
        b.g(textView, drawable, drawable2, drawable3, drawable4);
    }

    public static void z(@x1 TextView textView, @x1 ActionMode.Callback callback) {
        textView.setCustomSelectionActionModeCallback(H(textView, callback));
    }
}