package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FragmentController.java */
/* loaded from: classes.dex */
public class kx {
    private final mx<?> a;

    private kx(mx<?> mxVar) {
        this.a = mxVar;
    }

    @x1
    public static kx b(@x1 mx<?> mxVar) {
        return new kx((mx) jp.m(mxVar, "callbacks == null"));
    }

    @z1
    public Fragment A(@x1 String str) {
        return this.a.w.r0(str);
    }

    @x1
    public List<Fragment> B(@SuppressLint({"UnknownNullness"}) List<Fragment> list) {
        return this.a.w.x0();
    }

    public int C() {
        return this.a.w.w0();
    }

    @x1
    public FragmentManager D() {
        return this.a.w;
    }

    @SuppressLint({"UnknownNullness"})
    @Deprecated
    public j10 E() {
        throw new UnsupportedOperationException("Loaders are managed separately from FragmentController, use LoaderManager.getInstance() to obtain a LoaderManager.");
    }

    public void F() {
        this.a.w.h1();
    }

    @z1
    public View G(@z1 View view, @x1 String str, @x1 Context context, @x1 AttributeSet attributeSet) {
        return this.a.w.I0().onCreateView(view, str, context, attributeSet);
    }

    @Deprecated
    public void H() {
    }

    @Deprecated
    public void I(@z1 Parcelable parcelable, @z1 qx qxVar) {
        this.a.w.D1(parcelable, qxVar);
    }

    @Deprecated
    public void J(@z1 Parcelable parcelable, @z1 List<Fragment> list) {
        this.a.w.D1(parcelable, new qx(list, null, null));
    }

    @Deprecated
    public void K(@SuppressLint({"UnknownNullness"}) y7<String, j10> y7Var) {
    }

    public void L(@z1 Parcelable parcelable) {
        mx<?> mxVar = this.a;
        if (mxVar instanceof q00) {
            mxVar.w.E1(parcelable);
            return;
        }
        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
    }

    @z1
    @Deprecated
    public y7<String, j10> M() {
        return null;
    }

    @z1
    @Deprecated
    public qx N() {
        return this.a.w.F1();
    }

    @z1
    @Deprecated
    public List<Fragment> O() {
        qx F1 = this.a.w.F1();
        if (F1 == null || F1.b() == null) {
            return null;
        }
        return new ArrayList(F1.b());
    }

    @z1
    public Parcelable P() {
        return this.a.w.H1();
    }

    public void a(@z1 Fragment fragment) {
        mx<?> mxVar = this.a;
        mxVar.w.p(mxVar, mxVar, fragment);
    }

    public void c() {
        this.a.w.D();
    }

    public void d(@x1 Configuration configuration) {
        this.a.w.F(configuration);
    }

    public boolean e(@x1 MenuItem menuItem) {
        return this.a.w.G(menuItem);
    }

    public void f() {
        this.a.w.H();
    }

    public boolean g(@x1 Menu menu, @x1 MenuInflater menuInflater) {
        return this.a.w.I(menu, menuInflater);
    }

    public void h() {
        this.a.w.J();
    }

    public void i() {
        this.a.w.K();
    }

    public void j() {
        this.a.w.L();
    }

    public void k(boolean z) {
        this.a.w.M(z);
    }

    public boolean l(@x1 MenuItem menuItem) {
        return this.a.w.O(menuItem);
    }

    public void m(@x1 Menu menu) {
        this.a.w.P(menu);
    }

    public void n() {
        this.a.w.R();
    }

    public void o(boolean z) {
        this.a.w.S(z);
    }

    public boolean p(@x1 Menu menu) {
        return this.a.w.T(menu);
    }

    @Deprecated
    public void q() {
    }

    public void r() {
        this.a.w.V();
    }

    public void s() {
        this.a.w.W();
    }

    public void t() {
        this.a.w.Y();
    }

    @Deprecated
    public void u() {
    }

    @Deprecated
    public void v() {
    }

    @Deprecated
    public void w() {
    }

    @Deprecated
    public void x(boolean z) {
    }

    @Deprecated
    public void y(@x1 String str, @z1 FileDescriptor fileDescriptor, @x1 PrintWriter printWriter, @z1 String[] strArr) {
    }

    public boolean z() {
        return this.a.w.h0(true);
    }
}