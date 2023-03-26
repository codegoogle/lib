package com.p7700g.p99005;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.p7700g.p99005.ga2;
import java.util.ArrayList;
import java.util.List;

/* compiled from: RangeSlider.java */
/* loaded from: classes3.dex */
public class bi2 extends yh2<bi2, b, c> {
    private float i1;
    private int j1;

    /* compiled from: RangeSlider.java */
    /* loaded from: classes3.dex */
    public interface b extends wh2<bi2> {
        void b(@x1 bi2 bi2Var, float f, boolean z);
    }

    /* compiled from: RangeSlider.java */
    /* loaded from: classes3.dex */
    public interface c extends xh2<bi2> {
        void c(@x1 bi2 bi2Var);

        void e(@x1 bi2 bi2Var);
    }

    /* compiled from: RangeSlider.java */
    /* loaded from: classes3.dex */
    public static class d extends AbsSavedState {
        public static final Parcelable.Creator<d> CREATOR = new a();
        private float s;
        private int t;

        /* compiled from: RangeSlider.java */
        /* loaded from: classes3.dex */
        public class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public d[] newArray(int i) {
                return new d[i];
            }
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.s);
            parcel.writeInt(this.t);
        }

        public d(Parcelable parcelable) {
            super(parcelable);
        }

        private d(Parcel parcel) {
            super(parcel.readParcelable(d.class.getClassLoader()));
            this.s = parcel.readFloat();
            this.t = parcel.readInt();
        }
    }

    public bi2(@x1 Context context) {
        this(context, null);
    }

    private static List<Float> B0(TypedArray typedArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < typedArray.length(); i++) {
            arrayList.add(Float.valueOf(typedArray.getFloat(i, -1.0f)));
        }
        return arrayList;
    }

    @Override // com.p7700g.p99005.yh2
    public /* bridge */ /* synthetic */ boolean J() {
        return super.J();
    }

    @Override // com.p7700g.p99005.yh2
    public /* bridge */ /* synthetic */ boolean P() {
        return super.P();
    }

    @Override // com.p7700g.p99005.yh2, android.view.View
    public /* bridge */ /* synthetic */ boolean dispatchHoverEvent(@x1 MotionEvent motionEvent) {
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // com.p7700g.p99005.yh2, android.view.View
    public /* bridge */ /* synthetic */ boolean dispatchKeyEvent(@x1 KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // com.p7700g.p99005.yh2
    public /* bridge */ /* synthetic */ void f0(@x1 b bVar) {
        super.f0(bVar);
    }

    @Override // com.p7700g.p99005.yh2
    public /* bridge */ /* synthetic */ void g0(@x1 c cVar) {
        super.g0(cVar);
    }

    @Override // com.p7700g.p99005.yh2, android.view.View
    @x1
    public /* bridge */ /* synthetic */ CharSequence getAccessibilityClassName() {
        return super.getAccessibilityClassName();
    }

    @Override // com.p7700g.p99005.yh2
    public /* bridge */ /* synthetic */ int getActiveThumbIndex() {
        return super.getActiveThumbIndex();
    }

    @Override // com.p7700g.p99005.yh2
    public /* bridge */ /* synthetic */ int getFocusedThumbIndex() {
        return super.getFocusedThumbIndex();
    }

    @Override // com.p7700g.p99005.yh2
    @b1
    public /* bridge */ /* synthetic */ int getHaloRadius() {
        return super.getHaloRadius();
    }

    @Override // com.p7700g.p99005.yh2
    @x1
    public /* bridge */ /* synthetic */ ColorStateList getHaloTintList() {
        return super.getHaloTintList();
    }

    @Override // com.p7700g.p99005.yh2
    public /* bridge */ /* synthetic */ int getLabelBehavior() {
        return super.getLabelBehavior();
    }

    @Override // com.p7700g.p99005.yh2
    public float getMinSeparation() {
        return this.i1;
    }

    @Override // com.p7700g.p99005.yh2
    public /* bridge */ /* synthetic */ float getStepSize() {
        return super.getStepSize();
    }

    @Override // com.p7700g.p99005.yh2
    public /* bridge */ /* synthetic */ float getThumbElevation() {
        return super.getThumbElevation();
    }

    @Override // com.p7700g.p99005.yh2
    @b1
    public /* bridge */ /* synthetic */ int getThumbRadius() {
        return super.getThumbRadius();
    }

    @Override // com.p7700g.p99005.yh2
    public /* bridge */ /* synthetic */ ColorStateList getThumbStrokeColor() {
        return super.getThumbStrokeColor();
    }

    @Override // com.p7700g.p99005.yh2
    public /* bridge */ /* synthetic */ float getThumbStrokeWidth() {
        return super.getThumbStrokeWidth();
    }

    @Override // com.p7700g.p99005.yh2
    @x1
    public /* bridge */ /* synthetic */ ColorStateList getThumbTintList() {
        return super.getThumbTintList();
    }

    @Override // com.p7700g.p99005.yh2
    @x1
    public /* bridge */ /* synthetic */ ColorStateList getTickActiveTintList() {
        return super.getTickActiveTintList();
    }

    @Override // com.p7700g.p99005.yh2
    @x1
    public /* bridge */ /* synthetic */ ColorStateList getTickInactiveTintList() {
        return super.getTickInactiveTintList();
    }

    @Override // com.p7700g.p99005.yh2
    @x1
    public /* bridge */ /* synthetic */ ColorStateList getTickTintList() {
        return super.getTickTintList();
    }

    @Override // com.p7700g.p99005.yh2
    @x1
    public /* bridge */ /* synthetic */ ColorStateList getTrackActiveTintList() {
        return super.getTrackActiveTintList();
    }

    @Override // com.p7700g.p99005.yh2
    @b1
    public /* bridge */ /* synthetic */ int getTrackHeight() {
        return super.getTrackHeight();
    }

    @Override // com.p7700g.p99005.yh2
    @x1
    public /* bridge */ /* synthetic */ ColorStateList getTrackInactiveTintList() {
        return super.getTrackInactiveTintList();
    }

    @Override // com.p7700g.p99005.yh2
    @b1
    public /* bridge */ /* synthetic */ int getTrackSidePadding() {
        return super.getTrackSidePadding();
    }

    @Override // com.p7700g.p99005.yh2
    @x1
    public /* bridge */ /* synthetic */ ColorStateList getTrackTintList() {
        return super.getTrackTintList();
    }

    @Override // com.p7700g.p99005.yh2
    @b1
    public /* bridge */ /* synthetic */ int getTrackWidth() {
        return super.getTrackWidth();
    }

    @Override // com.p7700g.p99005.yh2
    public /* bridge */ /* synthetic */ float getValueFrom() {
        return super.getValueFrom();
    }

    @Override // com.p7700g.p99005.yh2
    public /* bridge */ /* synthetic */ float getValueTo() {
        return super.getValueTo();
    }

    @Override // com.p7700g.p99005.yh2
    @x1
    public List<Float> getValues() {
        return super.getValues();
    }

    @Override // com.p7700g.p99005.yh2
    public /* bridge */ /* synthetic */ void h(@x1 b bVar) {
        super.h(bVar);
    }

    @Override // com.p7700g.p99005.yh2
    public /* bridge */ /* synthetic */ void i(@x1 c cVar) {
        super.i(cVar);
    }

    @Override // com.p7700g.p99005.yh2, android.view.View, android.view.KeyEvent.Callback
    public /* bridge */ /* synthetic */ boolean onKeyDown(int i, @x1 KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.p7700g.p99005.yh2, android.view.View, android.view.KeyEvent.Callback
    public /* bridge */ /* synthetic */ boolean onKeyUp(int i, @x1 KeyEvent keyEvent) {
        return super.onKeyUp(i, keyEvent);
    }

    @Override // com.p7700g.p99005.yh2, android.view.View
    public void onRestoreInstanceState(@z1 Parcelable parcelable) {
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        this.i1 = dVar.s;
        int i = dVar.t;
        this.j1 = i;
        setSeparationUnit(i);
    }

    @Override // com.p7700g.p99005.yh2, android.view.View
    @x1
    public Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.s = this.i1;
        dVar.t = this.j1;
        return dVar;
    }

    @Override // com.p7700g.p99005.yh2, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(@x1 MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.p7700g.p99005.yh2
    public /* bridge */ /* synthetic */ void p() {
        super.p();
    }

    @Override // com.p7700g.p99005.yh2
    public /* bridge */ /* synthetic */ void q() {
        super.q();
    }

    @Override // com.p7700g.p99005.yh2
    public void setCustomThumbDrawable(@f1 int i) {
        super.setCustomThumbDrawable(i);
    }

    @Override // com.p7700g.p99005.yh2
    public void setCustomThumbDrawablesForValues(@x1 @f1 int... iArr) {
        super.setCustomThumbDrawablesForValues(iArr);
    }

    @Override // com.p7700g.p99005.yh2, android.view.View
    public /* bridge */ /* synthetic */ void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    @Override // com.p7700g.p99005.yh2
    public /* bridge */ /* synthetic */ void setFocusedThumbIndex(int i) {
        super.setFocusedThumbIndex(i);
    }

    @Override // com.p7700g.p99005.yh2
    public /* bridge */ /* synthetic */ void setHaloRadius(@p1(from = 0) @b1 int i) {
        super.setHaloRadius(i);
    }

    @Override // com.p7700g.p99005.yh2
    public /* bridge */ /* synthetic */ void setHaloRadiusResource(@a1 int i) {
        super.setHaloRadiusResource(i);
    }

    @Override // com.p7700g.p99005.yh2
    public /* bridge */ /* synthetic */ void setHaloTintList(@x1 ColorStateList colorStateList) {
        super.setHaloTintList(colorStateList);
    }

    @Override // com.p7700g.p99005.yh2
    public /* bridge */ /* synthetic */ void setLabelBehavior(int i) {
        super.setLabelBehavior(i);
    }

    @Override // com.p7700g.p99005.yh2
    public /* bridge */ /* synthetic */ void setLabelFormatter(@z1 ai2 ai2Var) {
        super.setLabelFormatter(ai2Var);
    }

    public void setMinSeparation(@b1 float f) {
        this.i1 = f;
        this.j1 = 0;
        setSeparationUnit(0);
    }

    public void setMinSeparationValue(float f) {
        this.i1 = f;
        this.j1 = 1;
        setSeparationUnit(1);
    }

    @Override // com.p7700g.p99005.yh2
    public /* bridge */ /* synthetic */ void setStepSize(float f) {
        super.setStepSize(f);
    }

    @Override // com.p7700g.p99005.yh2
    public /* bridge */ /* synthetic */ void setThumbElevation(float f) {
        super.setThumbElevation(f);
    }

    @Override // com.p7700g.p99005.yh2
    public /* bridge */ /* synthetic */ void setThumbElevationResource(@a1 int i) {
        super.setThumbElevationResource(i);
    }

    @Override // com.p7700g.p99005.yh2
    public /* bridge */ /* synthetic */ void setThumbRadius(@p1(from = 0) @b1 int i) {
        super.setThumbRadius(i);
    }

    @Override // com.p7700g.p99005.yh2
    public /* bridge */ /* synthetic */ void setThumbRadiusResource(@a1 int i) {
        super.setThumbRadiusResource(i);
    }

    @Override // com.p7700g.p99005.yh2
    public /* bridge */ /* synthetic */ void setThumbStrokeColor(@z1 ColorStateList colorStateList) {
        super.setThumbStrokeColor(colorStateList);
    }

    @Override // com.p7700g.p99005.yh2
    public /* bridge */ /* synthetic */ void setThumbStrokeColorResource(@y0 int i) {
        super.setThumbStrokeColorResource(i);
    }

    @Override // com.p7700g.p99005.yh2
    public /* bridge */ /* synthetic */ void setThumbStrokeWidth(float f) {
        super.setThumbStrokeWidth(f);
    }

    @Override // com.p7700g.p99005.yh2
    public /* bridge */ /* synthetic */ void setThumbStrokeWidthResource(@a1 int i) {
        super.setThumbStrokeWidthResource(i);
    }

    @Override // com.p7700g.p99005.yh2
    public /* bridge */ /* synthetic */ void setThumbTintList(@x1 ColorStateList colorStateList) {
        super.setThumbTintList(colorStateList);
    }

    @Override // com.p7700g.p99005.yh2
    public /* bridge */ /* synthetic */ void setTickActiveTintList(@x1 ColorStateList colorStateList) {
        super.setTickActiveTintList(colorStateList);
    }

    @Override // com.p7700g.p99005.yh2
    public /* bridge */ /* synthetic */ void setTickInactiveTintList(@x1 ColorStateList colorStateList) {
        super.setTickInactiveTintList(colorStateList);
    }

    @Override // com.p7700g.p99005.yh2
    public /* bridge */ /* synthetic */ void setTickTintList(@x1 ColorStateList colorStateList) {
        super.setTickTintList(colorStateList);
    }

    @Override // com.p7700g.p99005.yh2
    public /* bridge */ /* synthetic */ void setTickVisible(boolean z) {
        super.setTickVisible(z);
    }

    @Override // com.p7700g.p99005.yh2
    public /* bridge */ /* synthetic */ void setTrackActiveTintList(@x1 ColorStateList colorStateList) {
        super.setTrackActiveTintList(colorStateList);
    }

    @Override // com.p7700g.p99005.yh2
    public /* bridge */ /* synthetic */ void setTrackHeight(@p1(from = 0) @b1 int i) {
        super.setTrackHeight(i);
    }

    @Override // com.p7700g.p99005.yh2
    public /* bridge */ /* synthetic */ void setTrackInactiveTintList(@x1 ColorStateList colorStateList) {
        super.setTrackInactiveTintList(colorStateList);
    }

    @Override // com.p7700g.p99005.yh2
    public /* bridge */ /* synthetic */ void setTrackTintList(@x1 ColorStateList colorStateList) {
        super.setTrackTintList(colorStateList);
    }

    @Override // com.p7700g.p99005.yh2
    public /* bridge */ /* synthetic */ void setValueFrom(float f) {
        super.setValueFrom(f);
    }

    @Override // com.p7700g.p99005.yh2
    public /* bridge */ /* synthetic */ void setValueTo(float f) {
        super.setValueTo(f);
    }

    @Override // com.p7700g.p99005.yh2
    public void setValues(@x1 Float... fArr) {
        super.setValues(fArr);
    }

    public bi2(@x1 Context context, @z1 AttributeSet attributeSet) {
        this(context, attributeSet, ga2.c.ie);
    }

    @Override // com.p7700g.p99005.yh2
    public void setCustomThumbDrawable(@x1 Drawable drawable) {
        super.setCustomThumbDrawable(drawable);
    }

    @Override // com.p7700g.p99005.yh2
    public void setCustomThumbDrawablesForValues(@x1 Drawable... drawableArr) {
        super.setCustomThumbDrawablesForValues(drawableArr);
    }

    @Override // com.p7700g.p99005.yh2
    public void setValues(@x1 List<Float> list) {
        super.setValues(list);
    }

    public bi2(@x1 Context context, @z1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray j = cf2.j(context, attributeSet, ga2.o.jq, i, yh2.F, new int[0]);
        int i2 = ga2.o.lq;
        if (j.hasValue(i2)) {
            setValues(B0(j.getResources().obtainTypedArray(j.getResourceId(i2, 0))));
        }
        this.i1 = j.getDimension(ga2.o.kq, 0.0f);
        j.recycle();
    }
}