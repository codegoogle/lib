package com.p7700g.p99005;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.TintTypedArray;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.p4;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: NavigationBarView.java */
/* loaded from: classes3.dex */
public abstract class tf2 extends FrameLayout {
    public static final int s = -1;
    public static final int t = 0;
    public static final int u = 1;
    public static final int v = 2;
    private static final int w = 1;
    @z1
    private ColorStateList A;
    private MenuInflater B;
    private d C;
    private c D;
    @x1
    private final qf2 x;
    @x1
    private final rf2 y;
    @x1
    private final sf2 z;

    /* compiled from: NavigationBarView.java */
    /* loaded from: classes3.dex */
    public class a implements p4.a {
        public a() {
        }

        @Override // com.p7700g.p99005.p4.a
        public boolean onMenuItemSelected(p4 p4Var, @x1 MenuItem menuItem) {
            if (tf2.this.D == null || menuItem.getItemId() != tf2.this.getSelectedItemId()) {
                return (tf2.this.C == null || tf2.this.C.a(menuItem)) ? false : true;
            }
            tf2.this.D.a(menuItem);
            return true;
        }

        @Override // com.p7700g.p99005.p4.a
        public void onMenuModeChange(p4 p4Var) {
        }
    }

    /* compiled from: NavigationBarView.java */
    @i2({i2.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface b {
    }

    /* compiled from: NavigationBarView.java */
    /* loaded from: classes3.dex */
    public interface c {
        void a(@x1 MenuItem menuItem);
    }

    /* compiled from: NavigationBarView.java */
    /* loaded from: classes3.dex */
    public interface d {
        boolean a(@x1 MenuItem menuItem);
    }

    /* compiled from: NavigationBarView.java */
    /* loaded from: classes3.dex */
    public static class e extends au {
        public static final Parcelable.Creator<e> CREATOR = new a();
        @z1
        public Bundle s;

        /* compiled from: NavigationBarView.java */
        /* loaded from: classes3.dex */
        public class a implements Parcelable.ClassLoaderCreator<e> {
            @Override // android.os.Parcelable.Creator
            @z1
            /* renamed from: a */
            public e createFromParcel(@x1 Parcel parcel) {
                return new e(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @x1
            /* renamed from: b */
            public e createFromParcel(@x1 Parcel parcel, ClassLoader classLoader) {
                return new e(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @x1
            /* renamed from: c */
            public e[] newArray(int i) {
                return new e[i];
            }
        }

        public e(Parcelable parcelable) {
            super(parcelable);
        }

        private void c(@x1 Parcel parcel, ClassLoader classLoader) {
            this.s = parcel.readBundle(classLoader);
        }

        @Override // com.p7700g.p99005.au, android.os.Parcelable
        public void writeToParcel(@x1 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.s);
        }

        public e(@x1 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            c(parcel, classLoader == null ? getClass().getClassLoader() : classLoader);
        }
    }

    public tf2(@x1 Context context, @z1 AttributeSet attributeSet, @q0 int i, @m2 int i2) {
        super(yi2.c(context, attributeSet, i, i2), attributeSet, i);
        sf2 sf2Var = new sf2();
        this.z = sf2Var;
        Context context2 = getContext();
        int[] iArr = ga2.o.to;
        int i3 = ga2.o.Eo;
        int i4 = ga2.o.Do;
        TintTypedArray k = cf2.k(context2, attributeSet, iArr, i, i2, i3, i4);
        qf2 qf2Var = new qf2(context2, getClass(), getMaxItemCount());
        this.x = qf2Var;
        rf2 d2 = d(context2);
        this.y = d2;
        sf2Var.b(d2);
        sf2Var.a(1);
        d2.setPresenter(sf2Var);
        qf2Var.b(sf2Var);
        sf2Var.initForMenu(getContext(), qf2Var);
        int i5 = ga2.o.zo;
        if (k.hasValue(i5)) {
            d2.setIconTintList(k.getColorStateList(i5));
        } else {
            d2.setIconTintList(d2.d(16842808));
        }
        setItemIconSize(k.getDimensionPixelSize(ga2.o.yo, getResources().getDimensionPixelSize(ga2.f.o8)));
        if (k.hasValue(i3)) {
            setItemTextAppearanceInactive(k.getResourceId(i3, 0));
        }
        if (k.hasValue(i4)) {
            setItemTextAppearanceActive(k.getResourceId(i4, 0));
        }
        int i6 = ga2.o.Fo;
        if (k.hasValue(i6)) {
            setItemTextColor(k.getColorStateList(i6));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            sr.H1(this, c(context2));
        }
        int i7 = ga2.o.Bo;
        if (k.hasValue(i7)) {
            setItemPaddingTop(k.getDimensionPixelSize(i7, 0));
        }
        int i8 = ga2.o.Ao;
        if (k.hasValue(i8)) {
            setItemPaddingBottom(k.getDimensionPixelSize(i8, 0));
        }
        int i9 = ga2.o.vo;
        if (k.hasValue(i9)) {
            setElevation(k.getDimensionPixelSize(i9, 0));
        }
        fk.o(getBackground().mutate(), sg2.b(context2, k, ga2.o.uo));
        setLabelVisibilityMode(k.getInteger(ga2.o.Go, -1));
        int resourceId = k.getResourceId(ga2.o.xo, 0);
        if (resourceId != 0) {
            d2.setItemBackgroundRes(resourceId);
        } else {
            setItemRippleColor(sg2.b(context2, k, ga2.o.Co));
        }
        int resourceId2 = k.getResourceId(ga2.o.wo, 0);
        if (resourceId2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId2, ga2.o.no);
            setItemActiveIndicatorWidth(obtainStyledAttributes.getDimensionPixelSize(ga2.o.po, 0));
            setItemActiveIndicatorHeight(obtainStyledAttributes.getDimensionPixelSize(ga2.o.oo, 0));
            setItemActiveIndicatorMarginHorizontal(obtainStyledAttributes.getDimensionPixelOffset(ga2.o.ro, 0));
            setItemActiveIndicatorColor(sg2.a(context2, obtainStyledAttributes, ga2.o.qo));
            setItemActiveIndicatorShapeAppearance(qh2.b(context2, obtainStyledAttributes.getResourceId(ga2.o.so, 0), 0).m());
            obtainStyledAttributes.recycle();
        }
        int i10 = ga2.o.Ho;
        if (k.hasValue(i10)) {
            g(k.getResourceId(i10, 0));
        }
        k.recycle();
        addView(d2);
        qf2Var.X(new a());
    }

    @x1
    private lh2 c(Context context) {
        lh2 lh2Var = new lh2();
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            lh2Var.o0(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
        }
        lh2Var.Z(context);
        return lh2Var;
    }

    private MenuInflater getMenuInflater() {
        if (this.B == null) {
            this.B = new g4(getContext());
        }
        return this.B;
    }

    @i2({i2.a.LIBRARY_GROUP})
    @x1
    public abstract rf2 d(@x1 Context context);

    @z1
    public ya2 e(int i) {
        return this.y.h(i);
    }

    @x1
    public ya2 f(int i) {
        return this.y.i(i);
    }

    public void g(int i) {
        this.z.c(true);
        getMenuInflater().inflate(i, this.x);
        this.z.c(false);
        this.z.updateMenuView(true);
    }

    @z1
    public ColorStateList getItemActiveIndicatorColor() {
        return this.y.getItemActiveIndicatorColor();
    }

    @c2
    public int getItemActiveIndicatorHeight() {
        return this.y.getItemActiveIndicatorHeight();
    }

    @c2
    public int getItemActiveIndicatorMarginHorizontal() {
        return this.y.getItemActiveIndicatorMarginHorizontal();
    }

    @z1
    public qh2 getItemActiveIndicatorShapeAppearance() {
        return this.y.getItemActiveIndicatorShapeAppearance();
    }

    @c2
    public int getItemActiveIndicatorWidth() {
        return this.y.getItemActiveIndicatorWidth();
    }

    @z1
    public Drawable getItemBackground() {
        return this.y.getItemBackground();
    }

    @f1
    @Deprecated
    public int getItemBackgroundResource() {
        return this.y.getItemBackgroundRes();
    }

    @b1
    public int getItemIconSize() {
        return this.y.getItemIconSize();
    }

    @z1
    public ColorStateList getItemIconTintList() {
        return this.y.getIconTintList();
    }

    @c2
    public int getItemPaddingBottom() {
        return this.y.getItemPaddingBottom();
    }

    @c2
    public int getItemPaddingTop() {
        return this.y.getItemPaddingTop();
    }

    @z1
    public ColorStateList getItemRippleColor() {
        return this.A;
    }

    @m2
    public int getItemTextAppearanceActive() {
        return this.y.getItemTextAppearanceActive();
    }

    @m2
    public int getItemTextAppearanceInactive() {
        return this.y.getItemTextAppearanceInactive();
    }

    @z1
    public ColorStateList getItemTextColor() {
        return this.y.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.y.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    @x1
    public Menu getMenu() {
        return this.x;
    }

    @i2({i2.a.LIBRARY_GROUP})
    @x1
    public x4 getMenuView() {
        return this.y;
    }

    @i2({i2.a.LIBRARY_GROUP})
    @x1
    public sf2 getPresenter() {
        return this.z;
    }

    @m1
    public int getSelectedItemId() {
        return this.y.getSelectedItemId();
    }

    public boolean h() {
        return this.y.getItemActiveIndicatorEnabled();
    }

    public void i(int i) {
        this.y.m(i);
    }

    public void j(int i, @z1 View.OnTouchListener onTouchListener) {
        this.y.p(i, onTouchListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mh2.e(this);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(@z1 Parcelable parcelable) {
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.getSuperState());
        this.x.U(eVar.s);
    }

    @Override // android.view.View
    @x1
    public Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        eVar.s = bundle;
        this.x.W(bundle);
        return eVar;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        mh2.d(this, f);
    }

    public void setItemActiveIndicatorColor(@z1 ColorStateList colorStateList) {
        this.y.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.y.setItemActiveIndicatorEnabled(z);
    }

    public void setItemActiveIndicatorHeight(@c2 int i) {
        this.y.setItemActiveIndicatorHeight(i);
    }

    public void setItemActiveIndicatorMarginHorizontal(@c2 int i) {
        this.y.setItemActiveIndicatorMarginHorizontal(i);
    }

    public void setItemActiveIndicatorShapeAppearance(@z1 qh2 qh2Var) {
        this.y.setItemActiveIndicatorShapeAppearance(qh2Var);
    }

    public void setItemActiveIndicatorWidth(@c2 int i) {
        this.y.setItemActiveIndicatorWidth(i);
    }

    public void setItemBackground(@z1 Drawable drawable) {
        this.y.setItemBackground(drawable);
        this.A = null;
    }

    public void setItemBackgroundResource(@f1 int i) {
        this.y.setItemBackgroundRes(i);
        this.A = null;
    }

    public void setItemIconSize(@b1 int i) {
        this.y.setItemIconSize(i);
    }

    public void setItemIconSizeRes(@a1 int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(@z1 ColorStateList colorStateList) {
        this.y.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(@c2 int i) {
        this.y.setItemPaddingBottom(i);
    }

    public void setItemPaddingTop(@c2 int i) {
        this.y.setItemPaddingTop(i);
    }

    public void setItemRippleColor(@z1 ColorStateList colorStateList) {
        if (this.A == colorStateList) {
            if (colorStateList != null || this.y.getItemBackground() == null) {
                return;
            }
            this.y.setItemBackground(null);
            return;
        }
        this.A = colorStateList;
        if (colorStateList == null) {
            this.y.setItemBackground(null);
            return;
        }
        this.y.setItemBackground(new RippleDrawable(yg2.a(colorStateList), null, null));
    }

    public void setItemTextAppearanceActive(@m2 int i) {
        this.y.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceInactive(@m2 int i) {
        this.y.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(@z1 ColorStateList colorStateList) {
        this.y.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i) {
        if (this.y.getLabelVisibilityMode() != i) {
            this.y.setLabelVisibilityMode(i);
            this.z.updateMenuView(false);
        }
    }

    public void setOnItemReselectedListener(@z1 c cVar) {
        this.D = cVar;
    }

    public void setOnItemSelectedListener(@z1 d dVar) {
        this.C = dVar;
    }

    public void setSelectedItemId(@m1 int i) {
        MenuItem findItem = this.x.findItem(i);
        if (findItem == null || this.x.P(findItem, this.z, 0)) {
            return;
        }
        findItem.setChecked(true);
    }
}