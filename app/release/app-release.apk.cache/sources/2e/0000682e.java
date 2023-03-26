package com.p7700g.p99005;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.p7700g.p99005.cx;
import com.p7700g.p99005.ky;
import com.p7700g.p99005.mz;

/* compiled from: FragmentStateManager.java */
/* loaded from: classes.dex */
public class yx {
    private static final String a = "FragmentManager";
    private static final String b = "android:target_req_state";
    private static final String c = "android:target_state";
    private static final String d = "android:view_state";
    private static final String e = "android:view_registry_state";
    private static final String f = "android:user_visible_hint";
    private final ox g;
    private final by h;
    @x1
    private final Fragment i;
    private boolean j = false;
    private int k = -1;

    /* compiled from: FragmentStateManager.java */
    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View s;

        public a(View view) {
            this.s = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.s.removeOnAttachStateChangeListener(this);
            sr.u1(this.s);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* compiled from: FragmentStateManager.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            mz.c.values();
            int[] iArr = new int[5];
            a = iArr;
            try {
                iArr[mz.c.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[mz.c.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[mz.c.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[mz.c.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public yx(@x1 ox oxVar, @x1 by byVar, @x1 Fragment fragment) {
        this.g = oxVar;
        this.h = byVar;
        this.i = fragment;
    }

    private boolean l(@x1 View view) {
        if (view == this.i.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.i.mView) {
                return true;
            }
        }
        return false;
    }

    private Bundle q() {
        Bundle bundle = new Bundle();
        this.i.performSaveInstanceState(bundle);
        this.g.j(this.i, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.i.mView != null) {
            t();
        }
        if (this.i.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray(d, this.i.mSavedViewState);
        }
        if (this.i.mSavedViewRegistryState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle(e, this.i.mSavedViewRegistryState);
        }
        if (!this.i.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean(f, this.i.mUserVisibleHint);
        }
        return bundle;
    }

    public void a() {
        if (FragmentManager.T0(3)) {
            StringBuilder G = wo1.G("moveto ACTIVITY_CREATED: ");
            G.append(this.i);
            G.toString();
        }
        Fragment fragment = this.i;
        fragment.performActivityCreated(fragment.mSavedFragmentState);
        ox oxVar = this.g;
        Fragment fragment2 = this.i;
        oxVar.a(fragment2, fragment2.mSavedFragmentState, false);
    }

    public void b() {
        int j = this.h.j(this.i);
        Fragment fragment = this.i;
        fragment.mContainer.addView(fragment.mView, j);
    }

    public void c() {
        if (FragmentManager.T0(3)) {
            StringBuilder G = wo1.G("moveto ATTACHED: ");
            G.append(this.i);
            G.toString();
        }
        Fragment fragment = this.i;
        Fragment fragment2 = fragment.mTarget;
        yx yxVar = null;
        if (fragment2 != null) {
            yx n = this.h.n(fragment2.mWho);
            if (n != null) {
                Fragment fragment3 = this.i;
                fragment3.mTargetWho = fragment3.mTarget.mWho;
                fragment3.mTarget = null;
                yxVar = n;
            } else {
                StringBuilder G2 = wo1.G("Fragment ");
                G2.append(this.i);
                G2.append(" declared target fragment ");
                G2.append(this.i.mTarget);
                G2.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(G2.toString());
            }
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (yxVar = this.h.n(str)) == null) {
                StringBuilder G3 = wo1.G("Fragment ");
                G3.append(this.i);
                G3.append(" declared target fragment ");
                throw new IllegalStateException(wo1.C(G3, this.i.mTargetWho, " that does not belong to this FragmentManager!"));
            }
        }
        if (yxVar != null && (FragmentManager.c || yxVar.k().mState < 1)) {
            yxVar.m();
        }
        Fragment fragment4 = this.i;
        fragment4.mHost = fragment4.mFragmentManager.H0();
        Fragment fragment5 = this.i;
        fragment5.mParentFragment = fragment5.mFragmentManager.K0();
        this.g.g(this.i, false);
        this.i.performAttach();
        this.g.b(this.i, false);
    }

    public int d() {
        Fragment fragment;
        ViewGroup viewGroup;
        Fragment fragment2 = this.i;
        if (fragment2.mFragmentManager == null) {
            return fragment2.mState;
        }
        int i = this.k;
        int ordinal = fragment2.mMaxState.ordinal();
        if (ordinal == 1) {
            i = Math.min(i, 0);
        } else if (ordinal == 2) {
            i = Math.min(i, 1);
        } else if (ordinal == 3) {
            i = Math.min(i, 5);
        } else if (ordinal != 4) {
            i = Math.min(i, -1);
        }
        Fragment fragment3 = this.i;
        if (fragment3.mFromLayout) {
            if (fragment3.mInLayout) {
                i = Math.max(this.k, 2);
                View view = this.i.mView;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.k < 4 ? Math.min(i, fragment3.mState) : Math.min(i, 1);
            }
        }
        if (!this.i.mAdded) {
            i = Math.min(i, 1);
        }
        ky.e.b bVar = null;
        if (FragmentManager.c && (viewGroup = (fragment = this.i).mContainer) != null) {
            bVar = ky.n(viewGroup, fragment.getParentFragmentManager()).l(this);
        }
        if (bVar == ky.e.b.ADDING) {
            i = Math.min(i, 6);
        } else if (bVar == ky.e.b.REMOVING) {
            i = Math.max(i, 3);
        } else {
            Fragment fragment4 = this.i;
            if (fragment4.mRemoving) {
                if (fragment4.isInBackStack()) {
                    i = Math.min(i, 1);
                } else {
                    i = Math.min(i, -1);
                }
            }
        }
        Fragment fragment5 = this.i;
        if (fragment5.mDeferStart && fragment5.mState < 5) {
            i = Math.min(i, 4);
        }
        if (FragmentManager.T0(2)) {
            StringBuilder H = wo1.H("computeExpectedState() of ", i, " for ");
            H.append(this.i);
            H.toString();
        }
        return i;
    }

    public void e() {
        if (FragmentManager.T0(3)) {
            StringBuilder G = wo1.G("moveto CREATED: ");
            G.append(this.i);
            G.toString();
        }
        Fragment fragment = this.i;
        if (!fragment.mIsCreated) {
            this.g.h(fragment, fragment.mSavedFragmentState, false);
            Fragment fragment2 = this.i;
            fragment2.performCreate(fragment2.mSavedFragmentState);
            ox oxVar = this.g;
            Fragment fragment3 = this.i;
            oxVar.c(fragment3, fragment3.mSavedFragmentState, false);
            return;
        }
        fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
        this.i.mState = 1;
    }

    public void f() {
        String str;
        if (this.i.mFromLayout) {
            return;
        }
        if (FragmentManager.T0(3)) {
            StringBuilder G = wo1.G("moveto CREATE_VIEW: ");
            G.append(this.i);
            G.toString();
        }
        Fragment fragment = this.i;
        LayoutInflater performGetLayoutInflater = fragment.performGetLayoutInflater(fragment.mSavedFragmentState);
        ViewGroup viewGroup = null;
        Fragment fragment2 = this.i;
        ViewGroup viewGroup2 = fragment2.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = fragment2.mContainerId;
            if (i != 0) {
                if (i != -1) {
                    viewGroup = (ViewGroup) fragment2.mFragmentManager.B0().d(this.i.mContainerId);
                    if (viewGroup == null) {
                        Fragment fragment3 = this.i;
                        if (!fragment3.mRestored) {
                            try {
                                str = fragment3.getResources().getResourceName(this.i.mContainerId);
                            } catch (Resources.NotFoundException unused) {
                                str = "unknown";
                            }
                            StringBuilder G2 = wo1.G("No view found for id 0x");
                            G2.append(Integer.toHexString(this.i.mContainerId));
                            G2.append(" (");
                            G2.append(str);
                            G2.append(") for fragment ");
                            G2.append(this.i);
                            throw new IllegalArgumentException(G2.toString());
                        }
                    }
                } else {
                    StringBuilder G3 = wo1.G("Cannot create fragment ");
                    G3.append(this.i);
                    G3.append(" for a container view with no id");
                    throw new IllegalArgumentException(G3.toString());
                }
            }
        }
        Fragment fragment4 = this.i;
        fragment4.mContainer = viewGroup;
        fragment4.performCreateView(performGetLayoutInflater, viewGroup, fragment4.mSavedFragmentState);
        View view = this.i.mView;
        if (view != null) {
            boolean z = false;
            view.setSaveFromParentEnabled(false);
            Fragment fragment5 = this.i;
            fragment5.mView.setTag(cx.g.R, fragment5);
            if (viewGroup != null) {
                b();
            }
            Fragment fragment6 = this.i;
            if (fragment6.mHidden) {
                fragment6.mView.setVisibility(8);
            }
            if (sr.N0(this.i.mView)) {
                sr.u1(this.i.mView);
            } else {
                View view2 = this.i.mView;
                view2.addOnAttachStateChangeListener(new a(view2));
            }
            this.i.performViewCreated();
            ox oxVar = this.g;
            Fragment fragment7 = this.i;
            oxVar.m(fragment7, fragment7.mView, fragment7.mSavedFragmentState, false);
            int visibility = this.i.mView.getVisibility();
            float alpha = this.i.mView.getAlpha();
            if (FragmentManager.c) {
                this.i.setPostOnViewCreatedAlpha(alpha);
                Fragment fragment8 = this.i;
                if (fragment8.mContainer != null && visibility == 0) {
                    View findFocus = fragment8.mView.findFocus();
                    if (findFocus != null) {
                        this.i.setFocusedView(findFocus);
                        if (FragmentManager.T0(2)) {
                            String str2 = "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.i;
                        }
                    }
                    this.i.mView.setAlpha(0.0f);
                }
            } else {
                Fragment fragment9 = this.i;
                if (visibility == 0 && fragment9.mContainer != null) {
                    z = true;
                }
                fragment9.mIsNewlyAdded = z;
            }
        }
        this.i.mState = 2;
    }

    public void g() {
        Fragment f2;
        if (FragmentManager.T0(3)) {
            StringBuilder G = wo1.G("movefrom CREATED: ");
            G.append(this.i);
            G.toString();
        }
        Fragment fragment = this.i;
        boolean z = true;
        boolean z2 = fragment.mRemoving && !fragment.isInBackStack();
        if (z2 || this.h.p().s(this.i)) {
            mx<?> mxVar = this.i.mHost;
            if (mxVar instanceof q00) {
                z = this.h.p().o();
            } else if (mxVar.g() instanceof Activity) {
                z = true ^ ((Activity) mxVar.g()).isChangingConfigurations();
            }
            if (z2 || z) {
                this.h.p().h(this.i);
            }
            this.i.performDestroy();
            this.g.d(this.i, false);
            for (yx yxVar : this.h.l()) {
                if (yxVar != null) {
                    Fragment k = yxVar.k();
                    if (this.i.mWho.equals(k.mTargetWho)) {
                        k.mTarget = this.i;
                        k.mTargetWho = null;
                    }
                }
            }
            Fragment fragment2 = this.i;
            String str = fragment2.mTargetWho;
            if (str != null) {
                fragment2.mTarget = this.h.f(str);
            }
            this.h.r(this);
            return;
        }
        String str2 = this.i.mTargetWho;
        if (str2 != null && (f2 = this.h.f(str2)) != null && f2.mRetainInstance) {
            this.i.mTarget = f2;
        }
        this.i.mState = 0;
    }

    public void h() {
        View view;
        if (FragmentManager.T0(3)) {
            StringBuilder G = wo1.G("movefrom CREATE_VIEW: ");
            G.append(this.i);
            G.toString();
        }
        Fragment fragment = this.i;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        this.i.performDestroyView();
        this.g.n(this.i, false);
        Fragment fragment2 = this.i;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.q(null);
        this.i.mInLayout = false;
    }

    public void i() {
        if (FragmentManager.T0(3)) {
            StringBuilder G = wo1.G("movefrom ATTACHED: ");
            G.append(this.i);
            G.toString();
        }
        this.i.performDetach();
        boolean z = false;
        this.g.e(this.i, false);
        Fragment fragment = this.i;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (fragment.mRemoving && !fragment.isInBackStack()) {
            z = true;
        }
        if (z || this.h.p().s(this.i)) {
            if (FragmentManager.T0(3)) {
                StringBuilder G2 = wo1.G("initState called for fragment: ");
                G2.append(this.i);
                G2.toString();
            }
            this.i.initState();
        }
    }

    public void j() {
        Fragment fragment = this.i;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.T0(3)) {
                StringBuilder G = wo1.G("moveto CREATE_VIEW: ");
                G.append(this.i);
                G.toString();
            }
            Fragment fragment2 = this.i;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(fragment2.mSavedFragmentState), null, this.i.mSavedFragmentState);
            View view = this.i.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.i;
                fragment3.mView.setTag(cx.g.R, fragment3);
                Fragment fragment4 = this.i;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.i.performViewCreated();
                ox oxVar = this.g;
                Fragment fragment5 = this.i;
                oxVar.m(fragment5, fragment5.mView, fragment5.mSavedFragmentState, false);
                this.i.mState = 2;
            }
        }
    }

    @x1
    public Fragment k() {
        return this.i;
    }

    public void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.j) {
            if (FragmentManager.T0(2)) {
                StringBuilder G = wo1.G("Ignoring re-entrant call to moveToExpectedState() for ");
                G.append(k());
                G.toString();
                return;
            }
            return;
        }
        try {
            this.j = true;
            while (true) {
                int d2 = d();
                Fragment fragment = this.i;
                int i = fragment.mState;
                if (d2 == i) {
                    if (FragmentManager.c && fragment.mHiddenChanged) {
                        if (fragment.mView != null && (viewGroup = fragment.mContainer) != null) {
                            ky n = ky.n(viewGroup, fragment.getParentFragmentManager());
                            if (this.i.mHidden) {
                                n.c(this);
                            } else {
                                n.e(this);
                            }
                        }
                        Fragment fragment2 = this.i;
                        FragmentManager fragmentManager = fragment2.mFragmentManager;
                        if (fragmentManager != null) {
                            fragmentManager.R0(fragment2);
                        }
                        Fragment fragment3 = this.i;
                        fragment3.mHiddenChanged = false;
                        fragment3.onHiddenChanged(fragment3.mHidden);
                    }
                    return;
                } else if (d2 > i) {
                    switch (i + 1) {
                        case 0:
                            c();
                            continue;
                        case 1:
                            e();
                            continue;
                        case 2:
                            j();
                            f();
                            continue;
                        case 3:
                            a();
                            continue;
                        case 4:
                            if (fragment.mView != null && (viewGroup2 = fragment.mContainer) != null) {
                                ky.n(viewGroup2, fragment.getParentFragmentManager()).b(ky.e.c.b(this.i.mView.getVisibility()), this);
                            }
                            this.i.mState = 4;
                            continue;
                        case 5:
                            v();
                            continue;
                        case 6:
                            fragment.mState = 6;
                            continue;
                        case 7:
                            p();
                            continue;
                        default:
                            continue;
                    }
                } else {
                    switch (i - 1) {
                        case -1:
                            i();
                            continue;
                        case 0:
                            g();
                            continue;
                        case 1:
                            h();
                            this.i.mState = 1;
                            continue;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            continue;
                        case 3:
                            if (FragmentManager.T0(3)) {
                                String str = "movefrom ACTIVITY_CREATED: " + this.i;
                            }
                            Fragment fragment4 = this.i;
                            if (fragment4.mView != null && fragment4.mSavedViewState == null) {
                                t();
                            }
                            Fragment fragment5 = this.i;
                            if (fragment5.mView != null && (viewGroup3 = fragment5.mContainer) != null) {
                                ky.n(viewGroup3, fragment5.getParentFragmentManager()).d(this);
                            }
                            this.i.mState = 3;
                            continue;
                        case 4:
                            w();
                            continue;
                        case 5:
                            fragment.mState = 5;
                            continue;
                        case 6:
                            n();
                            continue;
                        default:
                            continue;
                    }
                }
            }
        } finally {
            this.j = false;
        }
    }

    public void n() {
        if (FragmentManager.T0(3)) {
            StringBuilder G = wo1.G("movefrom RESUMED: ");
            G.append(this.i);
            G.toString();
        }
        this.i.performPause();
        this.g.f(this.i, false);
    }

    public void o(@x1 ClassLoader classLoader) {
        Bundle bundle = this.i.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.i;
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray(d);
        Fragment fragment2 = this.i;
        fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle(e);
        Fragment fragment3 = this.i;
        fragment3.mTargetWho = fragment3.mSavedFragmentState.getString(c);
        Fragment fragment4 = this.i;
        if (fragment4.mTargetWho != null) {
            fragment4.mTargetRequestCode = fragment4.mSavedFragmentState.getInt(b, 0);
        }
        Fragment fragment5 = this.i;
        Boolean bool = fragment5.mSavedUserVisibleHint;
        if (bool != null) {
            fragment5.mUserVisibleHint = bool.booleanValue();
            this.i.mSavedUserVisibleHint = null;
        } else {
            fragment5.mUserVisibleHint = fragment5.mSavedFragmentState.getBoolean(f, true);
        }
        Fragment fragment6 = this.i;
        if (fragment6.mUserVisibleHint) {
            return;
        }
        fragment6.mDeferStart = true;
    }

    public void p() {
        if (FragmentManager.T0(3)) {
            StringBuilder G = wo1.G("moveto RESUMED: ");
            G.append(this.i);
            G.toString();
        }
        View focusedView = this.i.getFocusedView();
        if (focusedView != null && l(focusedView)) {
            boolean requestFocus = focusedView.requestFocus();
            if (FragmentManager.T0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("requestFocus: Restoring focused view ");
                sb.append(focusedView);
                sb.append(" ");
                sb.append(requestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(this.i);
                sb.append(" resulting in focused view ");
                sb.append(this.i.mView.findFocus());
                sb.toString();
            }
        }
        this.i.setFocusedView(null);
        this.i.performResume();
        this.g.i(this.i, false);
        Fragment fragment = this.i;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    @z1
    public Fragment.m r() {
        Bundle q;
        if (this.i.mState <= -1 || (q = q()) == null) {
            return null;
        }
        return new Fragment.m(q);
    }

    @x1
    public xx s() {
        xx xxVar = new xx(this.i);
        Fragment fragment = this.i;
        if (fragment.mState > -1 && xxVar.E == null) {
            Bundle q = q();
            xxVar.E = q;
            if (this.i.mTargetWho != null) {
                if (q == null) {
                    xxVar.E = new Bundle();
                }
                xxVar.E.putString(c, this.i.mTargetWho);
                int i = this.i.mTargetRequestCode;
                if (i != 0) {
                    xxVar.E.putInt(b, i);
                }
            }
        } else {
            xxVar.E = fragment.mSavedFragmentState;
        }
        return xxVar;
    }

    public void t() {
        if (this.i.mView == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.i.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.i.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.i.mViewLifecycleOwner.f(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.i.mSavedViewRegistryState = bundle;
    }

    public void u(int i) {
        this.k = i;
    }

    public void v() {
        if (FragmentManager.T0(3)) {
            StringBuilder G = wo1.G("moveto STARTED: ");
            G.append(this.i);
            G.toString();
        }
        this.i.performStart();
        this.g.k(this.i, false);
    }

    public void w() {
        if (FragmentManager.T0(3)) {
            StringBuilder G = wo1.G("movefrom STARTED: ");
            G.append(this.i);
            G.toString();
        }
        this.i.performStop();
        this.g.l(this.i, false);
    }

    public yx(@x1 ox oxVar, @x1 by byVar, @x1 ClassLoader classLoader, @x1 lx lxVar, @x1 xx xxVar) {
        this.g = oxVar;
        this.h = byVar;
        Fragment a2 = lxVar.a(classLoader, xxVar.s);
        this.i = a2;
        Bundle bundle = xxVar.B;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a2.setArguments(xxVar.B);
        a2.mWho = xxVar.t;
        a2.mFromLayout = xxVar.u;
        a2.mRestored = true;
        a2.mFragmentId = xxVar.v;
        a2.mContainerId = xxVar.w;
        a2.mTag = xxVar.x;
        a2.mRetainInstance = xxVar.y;
        a2.mRemoving = xxVar.z;
        a2.mDetached = xxVar.A;
        a2.mHidden = xxVar.C;
        a2.mMaxState = mz.c.values()[xxVar.D];
        Bundle bundle2 = xxVar.E;
        if (bundle2 != null) {
            a2.mSavedFragmentState = bundle2;
        } else {
            a2.mSavedFragmentState = new Bundle();
        }
        if (FragmentManager.T0(2)) {
            String str = "Instantiated fragment " + a2;
        }
    }

    public yx(@x1 ox oxVar, @x1 by byVar, @x1 Fragment fragment, @x1 xx xxVar) {
        this.g = oxVar;
        this.h = byVar;
        this.i = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        Bundle bundle = xxVar.E;
        if (bundle != null) {
            fragment.mSavedFragmentState = bundle;
        } else {
            fragment.mSavedFragmentState = new Bundle();
        }
    }
}