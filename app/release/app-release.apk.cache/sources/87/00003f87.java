package com.p7700g.p99005;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.p7700g.p99005.dy;
import com.p7700g.p99005.mz;
import java.io.PrintWriter;
import java.util.ArrayList;

/* compiled from: BackStackRecord.java */
/* loaded from: classes.dex */
public final class dx extends dy implements FragmentManager.k, FragmentManager.q {
    private static final String L = "FragmentManager";
    public final FragmentManager M;
    public boolean N;
    public int O;

    public dx(@x1 FragmentManager fragmentManager) {
        super(fragmentManager.E0(), fragmentManager.H0() != null ? fragmentManager.H0().g().getClassLoader() : null);
        this.O = -1;
        this.M = fragmentManager;
    }

    private static boolean d0(dy.a aVar) {
        Fragment fragment = aVar.b;
        return (fragment == null || !fragment.mAdded || fragment.mView == null || fragment.mDetached || fragment.mHidden || !fragment.isPostponed()) ? false : true;
    }

    @Override // com.p7700g.p99005.dy
    public boolean A() {
        return this.u.isEmpty();
    }

    @Override // com.p7700g.p99005.dy
    @x1
    public dy B(@x1 Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager != null && fragmentManager != this.M) {
            StringBuilder G = wo1.G("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
            G.append(fragment.toString());
            G.append(" is already attached to a FragmentManager.");
            throw new IllegalStateException(G.toString());
        }
        return super.B(fragment);
    }

    @Override // com.p7700g.p99005.dy
    @x1
    public dy O(@x1 Fragment fragment, @x1 mz.c cVar) {
        if (fragment.mFragmentManager == this.M) {
            if (cVar == mz.c.INITIALIZED && fragment.mState > -1) {
                throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + cVar + " after the Fragment has been created");
            } else if (cVar != mz.c.DESTROYED) {
                return super.O(fragment, cVar);
            } else {
                throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + cVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
            }
        }
        StringBuilder G = wo1.G("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
        G.append(this.M);
        throw new IllegalArgumentException(G.toString());
    }

    @Override // com.p7700g.p99005.dy
    @x1
    public dy P(@z1 Fragment fragment) {
        FragmentManager fragmentManager;
        if (fragment != null && (fragmentManager = fragment.mFragmentManager) != null && fragmentManager != this.M) {
            StringBuilder G = wo1.G("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment ");
            G.append(fragment.toString());
            G.append(" is already attached to a FragmentManager.");
            throw new IllegalStateException(G.toString());
        }
        return super.P(fragment);
    }

    @Override // com.p7700g.p99005.dy
    @x1
    public dy T(@x1 Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager != null && fragmentManager != this.M) {
            StringBuilder G = wo1.G("Cannot show Fragment attached to a different FragmentManager. Fragment ");
            G.append(fragment.toString());
            G.append(" is already attached to a FragmentManager.");
            throw new IllegalStateException(G.toString());
        }
        return super.T(fragment);
    }

    public void U(int i) {
        if (this.A) {
            if (FragmentManager.T0(2)) {
                String str = "Bump nesting in " + this + " by " + i;
            }
            int size = this.u.size();
            for (int i2 = 0; i2 < size; i2++) {
                dy.a aVar = this.u.get(i2);
                Fragment fragment = aVar.b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i;
                    if (FragmentManager.T0(2)) {
                        StringBuilder G = wo1.G("Bump nesting of ");
                        G.append(aVar.b);
                        G.append(" to ");
                        G.append(aVar.b.mBackStackNesting);
                        G.toString();
                    }
                }
            }
        }
    }

    public int V(boolean z) {
        if (!this.N) {
            if (FragmentManager.T0(2)) {
                String str = "Commit: " + this;
                PrintWriter printWriter = new PrintWriter(new jy("FragmentManager"));
                W(g54.A, printWriter);
                printWriter.close();
            }
            this.N = true;
            if (this.A) {
                this.O = this.M.o();
            } else {
                this.O = -1;
            }
            this.M.f0(this, z);
            return this.O;
        }
        throw new IllegalStateException("commit already called");
    }

    public void W(String str, PrintWriter printWriter) {
        X(str, printWriter, true);
    }

    public void X(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.C);
            printWriter.print(" mIndex=");
            printWriter.print(this.O);
            printWriter.print(" mCommitted=");
            printWriter.println(this.N);
            if (this.z != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.z));
            }
            if (this.v != 0 || this.w != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.v));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.w));
            }
            if (this.x != 0 || this.y != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.x));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.y));
            }
            if (this.D != 0 || this.E != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.D));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.E);
            }
            if (this.F != 0 || this.G != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.F));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.G);
            }
        }
        if (this.u.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.u.size();
        for (int i = 0; i < size; i++) {
            dy.a aVar = this.u.get(i);
            switch (aVar.a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    StringBuilder G = wo1.G("cmd=");
                    G.append(aVar.a);
                    str2 = G.toString();
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.b);
            if (z) {
                if (aVar.c != 0 || aVar.d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.d));
                }
                if (aVar.e != 0 || aVar.f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f));
                }
            }
        }
    }

    public void Y() {
        int size = this.u.size();
        for (int i = 0; i < size; i++) {
            dy.a aVar = this.u.get(i);
            Fragment fragment = aVar.b;
            if (fragment != null) {
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.z);
                fragment.setSharedElementNames(this.H, this.I);
            }
            switch (aVar.a) {
                case 1:
                    fragment.setAnimations(aVar.c, aVar.d, aVar.e, aVar.f);
                    this.M.K1(fragment, false);
                    this.M.k(fragment);
                    break;
                case 2:
                default:
                    StringBuilder G = wo1.G("Unknown cmd: ");
                    G.append(aVar.a);
                    throw new IllegalArgumentException(G.toString());
                case 3:
                    fragment.setAnimations(aVar.c, aVar.d, aVar.e, aVar.f);
                    this.M.x1(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.c, aVar.d, aVar.e, aVar.f);
                    this.M.Q0(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.c, aVar.d, aVar.e, aVar.f);
                    this.M.K1(fragment, false);
                    this.M.Q1(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.c, aVar.d, aVar.e, aVar.f);
                    this.M.C(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.c, aVar.d, aVar.e, aVar.f);
                    this.M.K1(fragment, false);
                    this.M.q(fragment);
                    break;
                case 8:
                    this.M.N1(fragment);
                    break;
                case 9:
                    this.M.N1(null);
                    break;
                case 10:
                    this.M.M1(fragment, aVar.h);
                    break;
            }
            if (!this.J && aVar.a != 1 && fragment != null && !FragmentManager.c) {
                this.M.d1(fragment);
            }
        }
        if (this.J || FragmentManager.c) {
            return;
        }
        FragmentManager fragmentManager = this.M;
        fragmentManager.e1(fragmentManager.v, true);
    }

    public void Z(boolean z) {
        for (int size = this.u.size() - 1; size >= 0; size--) {
            dy.a aVar = this.u.get(size);
            Fragment fragment = aVar.b;
            if (fragment != null) {
                fragment.setPopDirection(true);
                fragment.setNextTransition(FragmentManager.G1(this.z));
                fragment.setSharedElementNames(this.I, this.H);
            }
            switch (aVar.a) {
                case 1:
                    fragment.setAnimations(aVar.c, aVar.d, aVar.e, aVar.f);
                    this.M.K1(fragment, true);
                    this.M.x1(fragment);
                    break;
                case 2:
                default:
                    StringBuilder G = wo1.G("Unknown cmd: ");
                    G.append(aVar.a);
                    throw new IllegalArgumentException(G.toString());
                case 3:
                    fragment.setAnimations(aVar.c, aVar.d, aVar.e, aVar.f);
                    this.M.k(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.c, aVar.d, aVar.e, aVar.f);
                    this.M.Q1(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.c, aVar.d, aVar.e, aVar.f);
                    this.M.K1(fragment, true);
                    this.M.Q0(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.c, aVar.d, aVar.e, aVar.f);
                    this.M.q(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.c, aVar.d, aVar.e, aVar.f);
                    this.M.K1(fragment, true);
                    this.M.C(fragment);
                    break;
                case 8:
                    this.M.N1(null);
                    break;
                case 9:
                    this.M.N1(fragment);
                    break;
                case 10:
                    this.M.M1(fragment, aVar.g);
                    break;
            }
            if (!this.J && aVar.a != 3 && fragment != null && !FragmentManager.c) {
                this.M.d1(fragment);
            }
        }
        if (this.J || !z || FragmentManager.c) {
            return;
        }
        FragmentManager fragmentManager = this.M;
        fragmentManager.e1(fragmentManager.v, true);
    }

    @Override // androidx.fragment.app.FragmentManager.k
    @z1
    public CharSequence a() {
        if (this.D != 0) {
            return this.M.H0().g().getText(this.D);
        }
        return this.E;
    }

    public Fragment a0(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.u.size()) {
            dy.a aVar = this.u.get(i);
            int i2 = aVar.a;
            if (i2 != 1) {
                if (i2 == 2) {
                    Fragment fragment3 = aVar.b;
                    int i3 = fragment3.mContainerId;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList.get(size);
                        if (fragment4.mContainerId == i3) {
                            if (fragment4 == fragment3) {
                                z = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.u.add(i, new dy.a(9, fragment4));
                                    i++;
                                    fragment2 = null;
                                }
                                dy.a aVar2 = new dy.a(3, fragment4);
                                aVar2.c = aVar.c;
                                aVar2.e = aVar.e;
                                aVar2.d = aVar.d;
                                aVar2.f = aVar.f;
                                this.u.add(i, aVar2);
                                arrayList.remove(fragment4);
                                i++;
                            }
                        }
                    }
                    if (z) {
                        this.u.remove(i);
                        i--;
                    } else {
                        aVar.a = 1;
                        arrayList.add(fragment3);
                    }
                } else if (i2 == 3 || i2 == 6) {
                    arrayList.remove(aVar.b);
                    Fragment fragment5 = aVar.b;
                    if (fragment5 == fragment2) {
                        this.u.add(i, new dy.a(9, fragment5));
                        i++;
                        fragment2 = null;
                    }
                } else if (i2 != 7) {
                    if (i2 == 8) {
                        this.u.add(i, new dy.a(9, fragment2));
                        i++;
                        fragment2 = aVar.b;
                    }
                }
                i++;
            }
            arrayList.add(aVar.b);
            i++;
        }
        return fragment2;
    }

    @Override // androidx.fragment.app.FragmentManager.q
    public boolean b(@x1 ArrayList<dx> arrayList, @x1 ArrayList<Boolean> arrayList2) {
        if (FragmentManager.T0(2)) {
            String str = "Run: " + this;
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.A) {
            this.M.i(this);
            return true;
        }
        return true;
    }

    public boolean b0(int i) {
        int size = this.u.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.u.get(i2).b;
            int i3 = fragment != null ? fragment.mContainerId : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.fragment.app.FragmentManager.k
    public int c() {
        return this.F;
    }

    public boolean c0(ArrayList<dx> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.u.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            Fragment fragment = this.u.get(i4).b;
            int i5 = fragment != null ? fragment.mContainerId : 0;
            if (i5 != 0 && i5 != i3) {
                for (int i6 = i; i6 < i2; i6++) {
                    dx dxVar = arrayList.get(i6);
                    int size2 = dxVar.u.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        Fragment fragment2 = dxVar.u.get(i7).b;
                        if ((fragment2 != null ? fragment2.mContainerId : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    @Override // androidx.fragment.app.FragmentManager.k
    public int d() {
        return this.D;
    }

    @Override // androidx.fragment.app.FragmentManager.k
    @z1
    public CharSequence e() {
        if (this.F != 0) {
            return this.M.H0().g().getText(this.F);
        }
        return this.G;
    }

    public boolean e0() {
        for (int i = 0; i < this.u.size(); i++) {
            if (d0(this.u.get(i))) {
                return true;
            }
        }
        return false;
    }

    public void f0() {
        if (this.K != null) {
            for (int i = 0; i < this.K.size(); i++) {
                this.K.get(i).run();
            }
            this.K = null;
        }
    }

    public void g0(Fragment.l lVar) {
        for (int i = 0; i < this.u.size(); i++) {
            dy.a aVar = this.u.get(i);
            if (d0(aVar)) {
                aVar.b.setOnStartEnterTransitionListener(lVar);
            }
        }
    }

    @Override // androidx.fragment.app.FragmentManager.k
    public int getId() {
        return this.O;
    }

    @Override // androidx.fragment.app.FragmentManager.k
    @z1
    public String getName() {
        return this.C;
    }

    public Fragment h0(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.u.size() - 1; size >= 0; size--) {
            dy.a aVar = this.u.get(size);
            int i = aVar.a;
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.b;
                            break;
                        case 10:
                            aVar.h = aVar.g;
                            break;
                    }
                }
                arrayList.add(aVar.b);
            }
            arrayList.remove(aVar.b);
        }
        return fragment;
    }

    @Override // com.p7700g.p99005.dy
    public int q() {
        return V(false);
    }

    @Override // com.p7700g.p99005.dy
    public int r() {
        return V(true);
    }

    @Override // com.p7700g.p99005.dy
    public void s() {
        w();
        this.M.i0(this, false);
    }

    @Override // com.p7700g.p99005.dy
    public void t() {
        w();
        this.M.i0(this, true);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.O >= 0) {
            sb.append(" #");
            sb.append(this.O);
        }
        if (this.C != null) {
            sb.append(" ");
            sb.append(this.C);
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // com.p7700g.p99005.dy
    @x1
    public dy v(@x1 Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager != null && fragmentManager != this.M) {
            StringBuilder G = wo1.G("Cannot detach Fragment attached to a different FragmentManager. Fragment ");
            G.append(fragment.toString());
            G.append(" is already attached to a FragmentManager.");
            throw new IllegalStateException(G.toString());
        }
        return super.v(fragment);
    }

    @Override // com.p7700g.p99005.dy
    public void x(int i, Fragment fragment, @z1 String str, int i2) {
        super.x(i, fragment, str, i2);
        fragment.mFragmentManager = this.M;
    }

    @Override // com.p7700g.p99005.dy
    @x1
    public dy y(@x1 Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager != null && fragmentManager != this.M) {
            StringBuilder G = wo1.G("Cannot hide Fragment attached to a different FragmentManager. Fragment ");
            G.append(fragment.toString());
            G.append(" is already attached to a FragmentManager.");
            throw new IllegalStateException(G.toString());
        }
        return super.y(fragment);
    }
}