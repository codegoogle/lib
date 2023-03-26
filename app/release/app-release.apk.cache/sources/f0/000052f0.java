package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.os.Parcelable;
import android.view.View;
import android.view.accessibility.AccessibilityRecord;
import java.util.List;

/* compiled from: AccessibilityRecordCompat.java */
/* loaded from: classes.dex */
public class ns {
    private final AccessibilityRecord a;

    /* compiled from: AccessibilityRecordCompat.java */
    @e2(15)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static int a(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollX();
        }

        @e1
        public static int b(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollY();
        }

        @e1
        public static void c(AccessibilityRecord accessibilityRecord, int i) {
            accessibilityRecord.setMaxScrollX(i);
        }

        @e1
        public static void d(AccessibilityRecord accessibilityRecord, int i) {
            accessibilityRecord.setMaxScrollY(i);
        }
    }

    /* compiled from: AccessibilityRecordCompat.java */
    @e2(16)
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @e1
        public static void a(AccessibilityRecord accessibilityRecord, View view, int i) {
            accessibilityRecord.setSource(view, i);
        }
    }

    @Deprecated
    public ns(Object obj) {
        this.a = (AccessibilityRecord) obj;
    }

    @Deprecated
    public static ns A(ns nsVar) {
        return new ns(AccessibilityRecord.obtain(nsVar.a));
    }

    public static void N(@x1 AccessibilityRecord accessibilityRecord, int i) {
        a.c(accessibilityRecord, i);
    }

    public static void P(@x1 AccessibilityRecord accessibilityRecord, int i) {
        a.d(accessibilityRecord, i);
    }

    public static void Y(@x1 AccessibilityRecord accessibilityRecord, @z1 View view, int i) {
        b.a(accessibilityRecord, view, i);
    }

    public static int j(@x1 AccessibilityRecord accessibilityRecord) {
        return a.a(accessibilityRecord);
    }

    public static int l(@x1 AccessibilityRecord accessibilityRecord) {
        return a.b(accessibilityRecord);
    }

    @Deprecated
    public static ns z() {
        return new ns(AccessibilityRecord.obtain());
    }

    @Deprecated
    public void B() {
        this.a.recycle();
    }

    @Deprecated
    public void C(int i) {
        this.a.setAddedCount(i);
    }

    @Deprecated
    public void D(CharSequence charSequence) {
        this.a.setBeforeText(charSequence);
    }

    @Deprecated
    public void E(boolean z) {
        this.a.setChecked(z);
    }

    @Deprecated
    public void F(CharSequence charSequence) {
        this.a.setClassName(charSequence);
    }

    @Deprecated
    public void G(CharSequence charSequence) {
        this.a.setContentDescription(charSequence);
    }

    @Deprecated
    public void H(int i) {
        this.a.setCurrentItemIndex(i);
    }

    @Deprecated
    public void I(boolean z) {
        this.a.setEnabled(z);
    }

    @Deprecated
    public void J(int i) {
        this.a.setFromIndex(i);
    }

    @Deprecated
    public void K(boolean z) {
        this.a.setFullScreen(z);
    }

    @Deprecated
    public void L(int i) {
        this.a.setItemCount(i);
    }

    @Deprecated
    public void M(int i) {
        N(this.a, i);
    }

    @Deprecated
    public void O(int i) {
        P(this.a, i);
    }

    @Deprecated
    public void Q(Parcelable parcelable) {
        this.a.setParcelableData(parcelable);
    }

    @Deprecated
    public void R(boolean z) {
        this.a.setPassword(z);
    }

    @Deprecated
    public void S(int i) {
        this.a.setRemovedCount(i);
    }

    @Deprecated
    public void T(int i) {
        this.a.setScrollX(i);
    }

    @Deprecated
    public void U(int i) {
        this.a.setScrollY(i);
    }

    @Deprecated
    public void V(boolean z) {
        this.a.setScrollable(z);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @Deprecated
    public void W(View view) {
        this.a.setSource(view);
    }

    @Deprecated
    public void X(View view, int i) {
        Y(this.a, view, i);
    }

    @Deprecated
    public void Z(int i) {
        this.a.setToIndex(i);
    }

    @Deprecated
    public int a() {
        return this.a.getAddedCount();
    }

    @Deprecated
    public CharSequence b() {
        return this.a.getBeforeText();
    }

    @Deprecated
    public CharSequence c() {
        return this.a.getClassName();
    }

    @Deprecated
    public CharSequence d() {
        return this.a.getContentDescription();
    }

    @Deprecated
    public int e() {
        return this.a.getCurrentItemIndex();
    }

    @Deprecated
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ns) {
            ns nsVar = (ns) obj;
            AccessibilityRecord accessibilityRecord = this.a;
            if (accessibilityRecord == null) {
                return nsVar.a == null;
            }
            return accessibilityRecord.equals(nsVar.a);
        }
        return false;
    }

    @Deprecated
    public int f() {
        return this.a.getFromIndex();
    }

    @Deprecated
    public Object g() {
        return this.a;
    }

    @Deprecated
    public int h() {
        return this.a.getItemCount();
    }

    @Deprecated
    public int hashCode() {
        AccessibilityRecord accessibilityRecord = this.a;
        if (accessibilityRecord == null) {
            return 0;
        }
        return accessibilityRecord.hashCode();
    }

    @Deprecated
    public int i() {
        return j(this.a);
    }

    @Deprecated
    public int k() {
        return l(this.a);
    }

    @Deprecated
    public Parcelable m() {
        return this.a.getParcelableData();
    }

    @Deprecated
    public int n() {
        return this.a.getRemovedCount();
    }

    @Deprecated
    public int o() {
        return this.a.getScrollX();
    }

    @Deprecated
    public int p() {
        return this.a.getScrollY();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @Deprecated
    public ls q() {
        return ls.Y1(this.a.getSource());
    }

    @Deprecated
    public List<CharSequence> r() {
        return this.a.getText();
    }

    @Deprecated
    public int s() {
        return this.a.getToIndex();
    }

    @Deprecated
    public int t() {
        return this.a.getWindowId();
    }

    @Deprecated
    public boolean u() {
        return this.a.isChecked();
    }

    @Deprecated
    public boolean v() {
        return this.a.isEnabled();
    }

    @Deprecated
    public boolean w() {
        return this.a.isFullScreen();
    }

    @Deprecated
    public boolean x() {
        return this.a.isPassword();
    }

    @Deprecated
    public boolean y() {
        return this.a.isScrollable();
    }
}