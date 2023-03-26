package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.fragment.app.Fragment;
import com.p7700g.p99005.by;
import com.p7700g.p99005.cx;
import com.p7700g.p99005.d0;
import com.p7700g.p99005.dx;
import com.p7700g.p99005.dy;
import com.p7700g.p99005.e0;
import com.p7700g.p99005.ex;
import com.p7700g.p99005.ey;
import com.p7700g.p99005.fx;
import com.p7700g.p99005.g0;
import com.p7700g.p99005.g54;
import com.p7700g.p99005.h0;
import com.p7700g.p99005.hx;
import com.p7700g.p99005.i0;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.ix;
import com.p7700g.p99005.j0;
import com.p7700g.p99005.jx;
import com.p7700g.p99005.jy;
import com.p7700g.p99005.k0;
import com.p7700g.p99005.ky;
import com.p7700g.p99005.l2;
import com.p7700g.p99005.lx;
import com.p7700g.p99005.ly;
import com.p7700g.p99005.m1;
import com.p7700g.p99005.mx;
import com.p7700g.p99005.mz;
import com.p7700g.p99005.nm;
import com.p7700g.p99005.nx;
import com.p7700g.p99005.ox;
import com.p7700g.p99005.oz;
import com.p7700g.p99005.p00;
import com.p7700g.p99005.pg1;
import com.p7700g.p99005.q00;
import com.p7700g.p99005.qx;
import com.p7700g.p99005.qz;
import com.p7700g.p99005.r7;
import com.p7700g.p99005.rx;
import com.p7700g.p99005.sx;
import com.p7700g.p99005.tx;
import com.p7700g.p99005.u1;
import com.p7700g.p99005.vx;
import com.p7700g.p99005.w;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.wx;
import com.p7700g.p99005.x;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.xx;
import com.p7700g.p99005.yx;
import com.p7700g.p99005.z1;
import com.p7700g.p99005.zx;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class FragmentManager implements wx {
    private static boolean a = false;
    public static final String b = "FragmentManager";
    public static boolean c = true;
    public static final int d = 1;
    private static final String e = "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE";
    private g0<Intent> E;
    private g0<i0> F;
    private g0<String[]> G;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private ArrayList<dx> N;
    private ArrayList<Boolean> O;
    private ArrayList<Fragment> P;
    private ArrayList<s> Q;
    private sx R;
    private boolean g;
    public ArrayList<dx> i;
    private ArrayList<Fragment> j;
    private OnBackPressedDispatcher l;
    private ArrayList<p> q;
    private mx<?> w;
    private jx x;
    private Fragment y;
    @z1
    public Fragment z;
    private final ArrayList<q> f = new ArrayList<>();
    private final by h = new by();
    private final nx k = new nx(this);
    private final w m = new c(false);
    private final AtomicInteger n = new AtomicInteger();
    private final Map<String, Bundle> o = Collections.synchronizedMap(new HashMap());
    private final Map<String, o> p = Collections.synchronizedMap(new HashMap());
    private Map<Fragment, HashSet<nm>> r = Collections.synchronizedMap(new HashMap());
    private final ey.g s = new d();
    private final ox t = new ox(this);
    private final CopyOnWriteArrayList<tx> u = new CopyOnWriteArrayList<>();
    public int v = -1;
    private lx A = null;
    private lx B = new e();
    private ly C = null;
    private ly D = new f();
    public ArrayDeque<n> H = new ArrayDeque<>();
    private Runnable S = new g();

    /* loaded from: classes.dex */
    public class a implements e0<d0> {
        public a() {
        }

        @Override // com.p7700g.p99005.e0
        /* renamed from: b */
        public void a(d0 d0Var) {
            n pollFirst = FragmentManager.this.H.pollFirst();
            if (pollFirst == null) {
                String str = "No IntentSenders were started for " + this;
                return;
            }
            String str2 = pollFirst.s;
            int i = pollFirst.t;
            Fragment i2 = FragmentManager.this.h.i(str2);
            if (i2 == null) {
                return;
            }
            i2.onActivityResult(i, d0Var.d(), d0Var.c());
        }
    }

    /* loaded from: classes.dex */
    public class b implements e0<Map<String, Boolean>> {
        public b() {
        }

        @Override // com.p7700g.p99005.e0
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b */
        public void a(Map<String, Boolean> map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
            }
            n pollFirst = FragmentManager.this.H.pollFirst();
            if (pollFirst == null) {
                String str = "No permissions were requested for " + this;
                return;
            }
            String str2 = pollFirst.s;
            int i2 = pollFirst.t;
            Fragment i3 = FragmentManager.this.h.i(str2);
            if (i3 == null) {
                return;
            }
            i3.onRequestPermissionsResult(i2, strArr, iArr);
        }
    }

    /* loaded from: classes.dex */
    public class c extends w {
        public c(boolean z) {
            super(z);
        }

        @Override // com.p7700g.p99005.w
        public void b() {
            FragmentManager.this.P0();
        }
    }

    /* loaded from: classes.dex */
    public class d implements ey.g {
        public d() {
        }

        @Override // com.p7700g.p99005.ey.g
        public void a(@x1 Fragment fragment, @x1 nm nmVar) {
            if (nmVar.c()) {
                return;
            }
            FragmentManager.this.w1(fragment, nmVar);
        }

        @Override // com.p7700g.p99005.ey.g
        public void b(@x1 Fragment fragment, @x1 nm nmVar) {
            FragmentManager.this.j(fragment, nmVar);
        }
    }

    /* loaded from: classes.dex */
    public class e extends lx {
        public e() {
        }

        @Override // com.p7700g.p99005.lx
        @x1
        public Fragment a(@x1 ClassLoader classLoader, @x1 String str) {
            return FragmentManager.this.H0().b(FragmentManager.this.H0().g(), str, null);
        }
    }

    /* loaded from: classes.dex */
    public class f implements ly {
        public f() {
        }

        @Override // com.p7700g.p99005.ly
        @x1
        public ky a(@x1 ViewGroup viewGroup) {
            return new fx(viewGroup);
        }
    }

    /* loaded from: classes.dex */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager.this.h0(true);
        }
    }

    /* loaded from: classes.dex */
    public class h extends AnimatorListenerAdapter {
        public final /* synthetic */ ViewGroup s;
        public final /* synthetic */ View t;
        public final /* synthetic */ Fragment u;

        public h(ViewGroup viewGroup, View view, Fragment fragment) {
            this.s = viewGroup;
            this.t = view;
            this.u = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.s.endViewTransition(this.t);
            animator.removeListener(this);
            Fragment fragment = this.u;
            View view = fragment.mView;
            if (view == null || !fragment.mHidden) {
                return;
            }
            view.setVisibility(8);
        }
    }

    /* loaded from: classes.dex */
    public class i implements tx {
        public final /* synthetic */ Fragment s;

        public i(Fragment fragment) {
            this.s = fragment;
        }

        @Override // com.p7700g.p99005.tx
        public void a(@x1 FragmentManager fragmentManager, @x1 Fragment fragment) {
            this.s.onAttachFragment(fragment);
        }
    }

    /* loaded from: classes.dex */
    public class j implements e0<d0> {
        public j() {
        }

        @Override // com.p7700g.p99005.e0
        /* renamed from: b */
        public void a(d0 d0Var) {
            n pollFirst = FragmentManager.this.H.pollFirst();
            if (pollFirst == null) {
                String str = "No Activities were started for result for " + this;
                return;
            }
            String str2 = pollFirst.s;
            int i = pollFirst.t;
            Fragment i2 = FragmentManager.this.h.i(str2);
            if (i2 == null) {
                return;
            }
            i2.onActivityResult(i, d0Var.d(), d0Var.c());
        }
    }

    /* loaded from: classes.dex */
    public interface k {
        @z1
        @Deprecated
        CharSequence a();

        @l2
        @Deprecated
        int c();

        @l2
        @Deprecated
        int d();

        @z1
        @Deprecated
        CharSequence e();

        int getId();

        @z1
        String getName();
    }

    /* loaded from: classes.dex */
    public static class l extends j0<i0, d0> {
        @Override // com.p7700g.p99005.j0
        @x1
        /* renamed from: d */
        public Intent a(@x1 Context context, i0 i0Var) {
            Bundle bundleExtra;
            Intent intent = new Intent(k0.l.b);
            Intent c = i0Var.c();
            if (c != null && (bundleExtra = c.getBundleExtra(k0.k.b)) != null) {
                intent.putExtra(k0.k.b, bundleExtra);
                c.removeExtra(k0.k.b);
                if (c.getBooleanExtra(FragmentManager.e, false)) {
                    i0Var = new i0.b(i0Var.g()).b(null).c(i0Var.e(), i0Var.d()).a();
                }
            }
            intent.putExtra(k0.l.c, i0Var);
            if (FragmentManager.T0(2)) {
                String str = "CreateIntent created the following intent: " + intent;
            }
            return intent;
        }

        @Override // com.p7700g.p99005.j0
        @x1
        /* renamed from: e */
        public d0 c(int i, @z1 Intent intent) {
            return new d0(i, intent);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class m {
        @Deprecated
        public void a(@x1 FragmentManager fragmentManager, @x1 Fragment fragment, @z1 Bundle bundle) {
        }

        public void b(@x1 FragmentManager fragmentManager, @x1 Fragment fragment, @x1 Context context) {
        }

        public void c(@x1 FragmentManager fragmentManager, @x1 Fragment fragment, @z1 Bundle bundle) {
        }

        public void d(@x1 FragmentManager fragmentManager, @x1 Fragment fragment) {
        }

        public void e(@x1 FragmentManager fragmentManager, @x1 Fragment fragment) {
        }

        public void f(@x1 FragmentManager fragmentManager, @x1 Fragment fragment) {
        }

        public void g(@x1 FragmentManager fragmentManager, @x1 Fragment fragment, @x1 Context context) {
        }

        public void h(@x1 FragmentManager fragmentManager, @x1 Fragment fragment, @z1 Bundle bundle) {
        }

        public void i(@x1 FragmentManager fragmentManager, @x1 Fragment fragment) {
        }

        public void j(@x1 FragmentManager fragmentManager, @x1 Fragment fragment, @x1 Bundle bundle) {
        }

        public void k(@x1 FragmentManager fragmentManager, @x1 Fragment fragment) {
        }

        public void l(@x1 FragmentManager fragmentManager, @x1 Fragment fragment) {
        }

        public void m(@x1 FragmentManager fragmentManager, @x1 Fragment fragment, @x1 View view, @z1 Bundle bundle) {
        }

        public void n(@x1 FragmentManager fragmentManager, @x1 Fragment fragment) {
        }
    }

    /* loaded from: classes.dex */
    public static class o implements vx {
        private final mz a;
        private final vx b;
        private final oz c;

        public o(@x1 mz mzVar, @x1 vx vxVar, @x1 oz ozVar) {
            this.a = mzVar;
            this.b = vxVar;
            this.c = ozVar;
        }

        @Override // com.p7700g.p99005.vx
        public void a(@x1 String str, @x1 Bundle bundle) {
            this.b.a(str, bundle);
        }

        public boolean b(mz.c cVar) {
            return this.a.b().a(cVar);
        }

        public void c() {
            this.a.c(this.c);
        }
    }

    /* loaded from: classes.dex */
    public interface p {
        @u1
        void a();
    }

    /* loaded from: classes.dex */
    public interface q {
        boolean b(@x1 ArrayList<dx> arrayList, @x1 ArrayList<Boolean> arrayList2);
    }

    /* loaded from: classes.dex */
    public class r implements q {
        public final String a;
        public final int b;
        public final int c;

        public r(@z1 String str, int i, int i2) {
            this.a = str;
            this.b = i;
            this.c = i2;
        }

        @Override // androidx.fragment.app.FragmentManager.q
        public boolean b(@x1 ArrayList<dx> arrayList, @x1 ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.z;
            if (fragment == null || this.b >= 0 || this.a != null || !fragment.getChildFragmentManager().o1()) {
                return FragmentManager.this.s1(arrayList, arrayList2, this.a, this.b, this.c);
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class s implements Fragment.l {
        public final boolean a;
        public final dx b;
        private int c;

        public s(@x1 dx dxVar, boolean z) {
            this.a = z;
            this.b = dxVar;
        }

        @Override // androidx.fragment.app.Fragment.l
        public void a() {
            this.c++;
        }

        @Override // androidx.fragment.app.Fragment.l
        public void b() {
            int i = this.c - 1;
            this.c = i;
            if (i != 0) {
                return;
            }
            this.b.M.J1();
        }

        public void c() {
            dx dxVar = this.b;
            dxVar.M.y(dxVar, this.a, false, false);
        }

        public void d() {
            boolean z = this.c > 0;
            for (Fragment fragment : this.b.M.G0()) {
                fragment.setOnStartEnterTransitionListener(null);
                if (z && fragment.isPostponed()) {
                    fragment.startPostponedEnterTransition();
                }
            }
            dx dxVar = this.b;
            dxVar.M.y(dxVar, this.a, !z, true);
        }

        public boolean e() {
            return this.c == 0;
        }
    }

    @x1
    private sx A0(@x1 Fragment fragment) {
        return this.R.j(fragment);
    }

    private void A1(@x1 ArrayList<dx> arrayList, @x1 ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() == arrayList2.size()) {
            m0(arrayList, arrayList2);
            int size = arrayList.size();
            int i2 = 0;
            int i3 = 0;
            while (i2 < size) {
                if (!arrayList.get(i2).J) {
                    if (i3 != i2) {
                        k0(arrayList, arrayList2, i3, i2);
                    }
                    i3 = i2 + 1;
                    if (arrayList2.get(i2).booleanValue()) {
                        while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).J) {
                            i3++;
                        }
                    }
                    k0(arrayList, arrayList2, i2, i3);
                    i2 = i3 - 1;
                }
                i2++;
            }
            if (i3 != size) {
                k0(arrayList, arrayList2, i3, size);
                return;
            }
            return;
        }
        throw new IllegalStateException("Internal error with the back stack records");
    }

    private void B(@x1 Fragment fragment) {
        fragment.performDestroyView();
        this.t.n(fragment, false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.q(null);
        fragment.mInLayout = false;
    }

    private void C1() {
        if (this.q != null) {
            for (int i2 = 0; i2 < this.q.size(); i2++) {
                this.q.get(i2).a();
            }
        }
    }

    private ViewGroup D0(@x1 Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.x.e()) {
            View d2 = this.x.d(fragment.mContainerId);
            if (d2 instanceof ViewGroup) {
                return (ViewGroup) d2;
            }
        }
        return null;
    }

    public static int G1(int i2) {
        if (i2 != 4097) {
            if (i2 != 4099) {
                if (i2 != 8194) {
                    return 0;
                }
                return dy.p;
            }
            return dy.r;
        }
        return 8194;
    }

    @z1
    public static Fragment N0(@x1 View view) {
        Object tag = view.getTag(cx.g.R);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    private void P1(@x1 Fragment fragment) {
        ViewGroup D0 = D0(fragment);
        if (D0 != null) {
            if (fragment.getPopExitAnim() + fragment.getPopEnterAnim() + fragment.getExitAnim() + fragment.getEnterAnim() > 0) {
                int i2 = cx.g.u0;
                if (D0.getTag(i2) == null) {
                    D0.setTag(i2, fragment);
                }
                ((Fragment) D0.getTag(i2)).setPopDirection(fragment.getPopDirection());
            }
        }
    }

    private void Q(@z1 Fragment fragment) {
        if (fragment == null || !fragment.equals(n0(fragment.mWho))) {
            return;
        }
        fragment.performPrimaryNavigationFragmentChanged();
    }

    private void R1() {
        for (yx yxVar : this.h.l()) {
            k1(yxVar);
        }
    }

    private void S1(RuntimeException runtimeException) {
        runtimeException.getMessage();
        PrintWriter printWriter = new PrintWriter(new jy(b));
        mx<?> mxVar = this.w;
        try {
            if (mxVar != null) {
                mxVar.i(g54.A, null, printWriter, new String[0]);
            } else {
                b0(g54.A, null, printWriter, new String[0]);
            }
        } catch (Exception unused) {
        }
        throw runtimeException;
    }

    public static boolean T0(int i2) {
        return a || Log.isLoggable(b, i2);
    }

    private boolean U0(@x1 Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.t();
    }

    private void U1() {
        synchronized (this.f) {
            boolean z = true;
            if (!this.f.isEmpty()) {
                this.m.f(true);
            } else {
                this.m.f((z0() <= 0 || !W0(this.y)) ? false : false);
            }
        }
    }

    private void X(int i2) {
        try {
            this.g = true;
            this.h.d(i2);
            e1(i2, false);
            if (c) {
                for (ky kyVar : w()) {
                    kyVar.j();
                }
            }
            this.g = false;
            h0(true);
        } catch (Throwable th) {
            this.g = false;
            throw th;
        }
    }

    private void a0() {
        if (this.M) {
            this.M = false;
            R1();
        }
    }

    @Deprecated
    public static void c0(boolean z) {
        a = z;
    }

    private void c1(@x1 r7<Fragment> r7Var) {
        int size = r7Var.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment m2 = r7Var.m(i2);
            if (!m2.mAdded) {
                View requireView = m2.requireView();
                m2.mPostponedAlpha = requireView.getAlpha();
                requireView.setAlpha(0.0f);
            }
        }
    }

    @zx
    public static void d0(boolean z) {
        c = z;
    }

    private void e0() {
        if (c) {
            for (ky kyVar : w()) {
                kyVar.j();
            }
        } else if (!this.r.isEmpty()) {
            for (Fragment fragment : this.r.keySet()) {
                s(fragment);
                f1(fragment);
            }
        }
    }

    private void g0(boolean z) {
        if (!this.g) {
            if (this.w == null) {
                if (this.L) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (Looper.myLooper() == this.w.h().getLooper()) {
                if (!z) {
                    u();
                }
                if (this.N == null) {
                    this.N = new ArrayList<>();
                    this.O = new ArrayList<>();
                }
                this.g = true;
                try {
                    m0(null, null);
                    return;
                } finally {
                    this.g = false;
                }
            } else {
                throw new IllegalStateException("Must be called from main thread of fragment host");
            }
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    private void h(@x1 r7<Fragment> r7Var) {
        int i2 = this.v;
        if (i2 < 1) {
            return;
        }
        int min = Math.min(i2, 5);
        for (Fragment fragment : this.h.o()) {
            if (fragment.mState < min) {
                g1(fragment, min);
                if (fragment.mView != null && !fragment.mHidden && fragment.mIsNewlyAdded) {
                    r7Var.add(fragment);
                }
            }
        }
    }

    private static void j0(@x1 ArrayList<dx> arrayList, @x1 ArrayList<Boolean> arrayList2, int i2, int i3) {
        while (i2 < i3) {
            dx dxVar = arrayList.get(i2);
            if (arrayList2.get(i2).booleanValue()) {
                dxVar.U(-1);
                dxVar.Z(i2 == i3 + (-1));
            } else {
                dxVar.U(1);
                dxVar.Y();
            }
            i2++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01be  */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void k0(@x1 ArrayList<dx> arrayList, @x1 ArrayList<Boolean> arrayList2, int i2, int i3) {
        ?? r1;
        boolean z;
        int i4;
        int i5;
        ArrayList<Boolean> arrayList3;
        int i6;
        int i7;
        ArrayList<Boolean> arrayList4;
        int i8;
        boolean z2;
        int i9;
        boolean z3 = arrayList.get(i2).J;
        ArrayList<Fragment> arrayList5 = this.P;
        if (arrayList5 == null) {
            this.P = new ArrayList<>();
        } else {
            arrayList5.clear();
        }
        this.P.addAll(this.h.o());
        Fragment L0 = L0();
        boolean z4 = false;
        for (int i10 = i2; i10 < i3; i10++) {
            dx dxVar = arrayList.get(i10);
            if (!arrayList2.get(i10).booleanValue()) {
                L0 = dxVar.a0(this.P, L0);
            } else {
                L0 = dxVar.h0(this.P, L0);
            }
            z4 = z4 || dxVar.A;
        }
        this.P.clear();
        if (!z3 && this.v >= 1) {
            if (!c) {
                r1 = 1;
                ey.C(this.w.g(), this.x, arrayList, arrayList2, i2, i3, false, this.s);
                j0(arrayList, arrayList2, i2, i3);
                if (c) {
                    if (z3) {
                        r7 r7Var = new r7();
                        h(r7Var);
                        i6 = 1;
                        z = z3;
                        i4 = i3;
                        i5 = i2;
                        arrayList3 = arrayList2;
                        i7 = t1(arrayList, arrayList2, i2, i3, r7Var);
                        c1(r7Var);
                    } else {
                        z = z3;
                        i4 = i3;
                        i5 = i2;
                        arrayList3 = arrayList2;
                        i6 = 1;
                        i7 = i4;
                    }
                    if (i7 == i5 || !z) {
                        arrayList4 = arrayList3;
                        i8 = i4;
                    } else {
                        if (this.v >= i6) {
                            arrayList4 = arrayList3;
                            int i11 = i7;
                            i8 = i4;
                            z2 = true;
                            ey.C(this.w.g(), this.x, arrayList, arrayList2, i2, i11, true, this.s);
                        } else {
                            arrayList4 = arrayList3;
                            i8 = i4;
                            z2 = true;
                        }
                        e1(this.v, z2);
                    }
                } else {
                    boolean booleanValue = arrayList2.get(i3 - 1).booleanValue();
                    for (int i12 = i2; i12 < i3; i12++) {
                        dx dxVar2 = arrayList.get(i12);
                        if (booleanValue) {
                            for (int size = dxVar2.u.size() - r1; size >= 0; size--) {
                                Fragment fragment = dxVar2.u.get(size).b;
                                if (fragment != null) {
                                    A(fragment).m();
                                }
                            }
                        } else {
                            Iterator<dy.a> it = dxVar2.u.iterator();
                            while (it.hasNext()) {
                                Fragment fragment2 = it.next().b;
                                if (fragment2 != null) {
                                    A(fragment2).m();
                                }
                            }
                        }
                    }
                    e1(this.v, r1);
                    for (ky kyVar : x(arrayList, i2, i3)) {
                        kyVar.r(booleanValue);
                        kyVar.p();
                        kyVar.g();
                    }
                    i8 = i3;
                    arrayList4 = arrayList2;
                }
                for (i9 = i2; i9 < i8; i9++) {
                    dx dxVar3 = arrayList.get(i9);
                    if (arrayList4.get(i9).booleanValue() && dxVar3.O >= 0) {
                        dxVar3.O = -1;
                    }
                    dxVar3.f0();
                }
                if (z4) {
                    return;
                }
                C1();
                return;
            }
            for (int i13 = i2; i13 < i3; i13++) {
                Iterator<dy.a> it2 = arrayList.get(i13).u.iterator();
                while (it2.hasNext()) {
                    Fragment fragment3 = it2.next().b;
                    if (fragment3 != null && fragment3.mFragmentManager != null) {
                        this.h.q(A(fragment3));
                    }
                }
            }
        }
        r1 = 1;
        j0(arrayList, arrayList2, i2, i3);
        if (c) {
        }
        while (i9 < i8) {
        }
        if (z4) {
        }
    }

    private void m0(@z1 ArrayList<dx> arrayList, @z1 ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<s> arrayList3 = this.Q;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            s sVar = this.Q.get(i2);
            if (arrayList != null && !sVar.a && (indexOf2 = arrayList.indexOf(sVar.b)) != -1 && arrayList2 != null && arrayList2.get(indexOf2).booleanValue()) {
                this.Q.remove(i2);
                i2--;
                size--;
                sVar.c();
            } else if (sVar.e() || (arrayList != null && sVar.b.c0(arrayList, 0, arrayList.size()))) {
                this.Q.remove(i2);
                i2--;
                size--;
                if (arrayList != null && !sVar.a && (indexOf = arrayList.indexOf(sVar.b)) != -1 && arrayList2 != null && arrayList2.get(indexOf).booleanValue()) {
                    sVar.c();
                } else {
                    sVar.d();
                }
            }
            i2++;
        }
    }

    @x1
    public static <F extends Fragment> F o0(@x1 View view) {
        F f2 = (F) t0(view);
        if (f2 != null) {
            return f2;
        }
        throw new IllegalStateException("View " + view + " does not have a Fragment set");
    }

    private boolean r1(@z1 String str, int i2, int i3) {
        h0(false);
        g0(true);
        Fragment fragment = this.z;
        if (fragment == null || i2 >= 0 || str != null || !fragment.getChildFragmentManager().o1()) {
            boolean s1 = s1(this.N, this.O, str, i2, i3);
            if (s1) {
                this.g = true;
                try {
                    A1(this.N, this.O);
                } finally {
                    v();
                }
            }
            U1();
            a0();
            this.h.b();
            return s1;
        }
        return true;
    }

    private void s(@x1 Fragment fragment) {
        HashSet<nm> hashSet = this.r.get(fragment);
        if (hashSet != null) {
            Iterator<nm> it = hashSet.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            hashSet.clear();
            B(fragment);
            this.r.remove(fragment);
        }
    }

    @x1
    public static FragmentManager s0(@x1 View view) {
        Fragment t0 = t0(view);
        if (t0 != null) {
            if (t0.isAdded()) {
                return t0.getChildFragmentManager();
            }
            throw new IllegalStateException("The Fragment " + t0 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        hx hxVar = null;
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                break;
            } else if (context instanceof hx) {
                hxVar = (hx) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (hxVar != null) {
            return hxVar.L();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    @z1
    private static Fragment t0(@x1 View view) {
        while (view != null) {
            Fragment N0 = N0(view);
            if (N0 != null) {
                return N0;
            }
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    private int t1(@x1 ArrayList<dx> arrayList, @x1 ArrayList<Boolean> arrayList2, int i2, int i3, @x1 r7<Fragment> r7Var) {
        int i4 = i3;
        for (int i5 = i3 - 1; i5 >= i2; i5--) {
            dx dxVar = arrayList.get(i5);
            boolean booleanValue = arrayList2.get(i5).booleanValue();
            if (dxVar.e0() && !dxVar.c0(arrayList, i5 + 1, i3)) {
                if (this.Q == null) {
                    this.Q = new ArrayList<>();
                }
                s sVar = new s(dxVar, booleanValue);
                this.Q.add(sVar);
                dxVar.g0(sVar);
                if (booleanValue) {
                    dxVar.Y();
                } else {
                    dxVar.Z(false);
                }
                i4--;
                if (i5 != i4) {
                    arrayList.remove(i5);
                    arrayList.add(i4, dxVar);
                }
                h(r7Var);
            }
        }
        return i4;
    }

    private void u() {
        if (Y0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private void u0() {
        if (c) {
            for (ky kyVar : w()) {
                kyVar.k();
            }
        } else if (this.Q != null) {
            while (!this.Q.isEmpty()) {
                this.Q.remove(0).d();
            }
        }
    }

    private void v() {
        this.g = false;
        this.O.clear();
        this.N.clear();
    }

    private boolean v0(@x1 ArrayList<dx> arrayList, @x1 ArrayList<Boolean> arrayList2) {
        synchronized (this.f) {
            if (this.f.isEmpty()) {
                return false;
            }
            int size = this.f.size();
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                z |= this.f.get(i2).b(arrayList, arrayList2);
            }
            this.f.clear();
            this.w.h().removeCallbacks(this.S);
            return z;
        }
    }

    private Set<ky> w() {
        HashSet hashSet = new HashSet();
        for (yx yxVar : this.h.l()) {
            ViewGroup viewGroup = yxVar.k().mContainer;
            if (viewGroup != null) {
                hashSet.add(ky.o(viewGroup, M0()));
            }
        }
        return hashSet;
    }

    private Set<ky> x(@x1 ArrayList<dx> arrayList, int i2, int i3) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i2 < i3) {
            Iterator<dy.a> it = arrayList.get(i2).u.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().b;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(ky.n(viewGroup, this));
                }
            }
            i2++;
        }
        return hashSet;
    }

    private void z(@x1 Fragment fragment) {
        Animator animator;
        if (fragment.mView != null) {
            ix.d c2 = ix.c(this.w.g(), fragment, !fragment.mHidden, fragment.getPopDirection());
            if (c2 != null && (animator = c2.b) != null) {
                animator.setTarget(fragment.mView);
                if (fragment.mHidden) {
                    if (fragment.isHideReplaced()) {
                        fragment.setHideReplaced(false);
                    } else {
                        ViewGroup viewGroup = fragment.mContainer;
                        View view = fragment.mView;
                        viewGroup.startViewTransition(view);
                        c2.b.addListener(new h(viewGroup, view, fragment));
                    }
                } else {
                    fragment.mView.setVisibility(0);
                }
                c2.b.start();
            } else {
                if (c2 != null) {
                    fragment.mView.startAnimation(c2.a);
                    c2.a.start();
                }
                fragment.mView.setVisibility((!fragment.mHidden || fragment.isHideReplaced()) ? 0 : 8);
                if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                }
            }
        }
        R0(fragment);
        fragment.mHiddenChanged = false;
        fragment.onHiddenChanged(fragment.mHidden);
    }

    @x1
    public yx A(@x1 Fragment fragment) {
        yx n2 = this.h.n(fragment.mWho);
        if (n2 != null) {
            return n2;
        }
        yx yxVar = new yx(this.t, this.h, fragment);
        yxVar.o(this.w.g().getClassLoader());
        yxVar.u(this.v);
        return yxVar;
    }

    @x1
    public jx B0() {
        return this.x;
    }

    public void B1(@x1 Fragment fragment) {
        this.R.p(fragment);
    }

    public void C(@x1 Fragment fragment) {
        if (T0(2)) {
            String str = "detach: " + fragment;
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (T0(2)) {
                String str2 = "remove from detach: " + fragment;
            }
            this.h.t(fragment);
            if (U0(fragment)) {
                this.I = true;
            }
            P1(fragment);
        }
    }

    @z1
    public Fragment C0(@x1 Bundle bundle, @x1 String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment n0 = n0(string);
        if (n0 == null) {
            S1(new IllegalStateException(wo1.v("Fragment no longer exists for key ", str, ": unique id ", string)));
        }
        return n0;
    }

    public void D() {
        this.J = false;
        this.K = false;
        this.R.r(false);
        X(4);
    }

    public void D1(@z1 Parcelable parcelable, @z1 qx qxVar) {
        if (this.w instanceof q00) {
            S1(new IllegalStateException("You must use restoreSaveState when your FragmentHostCallback implements ViewModelStoreOwner"));
        }
        this.R.q(qxVar);
        E1(parcelable);
    }

    public void E() {
        this.J = false;
        this.K = false;
        this.R.r(false);
        X(0);
    }

    @x1
    public lx E0() {
        lx lxVar = this.A;
        if (lxVar != null) {
            return lxVar;
        }
        Fragment fragment = this.y;
        if (fragment != null) {
            return fragment.mFragmentManager.E0();
        }
        return this.B;
    }

    public void E1(@z1 Parcelable parcelable) {
        yx yxVar;
        if (parcelable == null) {
            return;
        }
        rx rxVar = (rx) parcelable;
        if (rxVar.s == null) {
            return;
        }
        this.h.u();
        Iterator<xx> it = rxVar.s.iterator();
        while (it.hasNext()) {
            xx next = it.next();
            if (next != null) {
                Fragment i2 = this.R.i(next.t);
                if (i2 != null) {
                    if (T0(2)) {
                        String str = "restoreSaveState: re-attaching retained " + i2;
                    }
                    yxVar = new yx(this.t, this.h, i2, next);
                } else {
                    yxVar = new yx(this.t, this.h, this.w.g().getClassLoader(), E0(), next);
                }
                Fragment k2 = yxVar.k();
                k2.mFragmentManager = this;
                if (T0(2)) {
                    StringBuilder G = wo1.G("restoreSaveState: active (");
                    G.append(k2.mWho);
                    G.append("): ");
                    G.append(k2);
                    G.toString();
                }
                yxVar.o(this.w.g().getClassLoader());
                this.h.q(yxVar);
                yxVar.u(this.v);
            }
        }
        for (Fragment fragment : this.R.l()) {
            if (!this.h.c(fragment.mWho)) {
                if (T0(2)) {
                    String str2 = "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + rxVar.s;
                }
                this.R.p(fragment);
                fragment.mFragmentManager = this;
                yx yxVar2 = new yx(this.t, this.h, fragment);
                yxVar2.u(1);
                yxVar2.m();
                fragment.mRemoving = true;
                yxVar2.m();
            }
        }
        this.h.v(rxVar.t);
        if (rxVar.u != null) {
            this.i = new ArrayList<>(rxVar.u.length);
            int i3 = 0;
            while (true) {
                ex[] exVarArr = rxVar.u;
                if (i3 >= exVarArr.length) {
                    break;
                }
                dx c2 = exVarArr[i3].c(this);
                if (T0(2)) {
                    StringBuilder H = wo1.H("restoreAllState: back stack #", i3, " (index ");
                    H.append(c2.O);
                    H.append("): ");
                    H.append(c2);
                    H.toString();
                    PrintWriter printWriter = new PrintWriter(new jy(b));
                    c2.X(g54.A, printWriter, false);
                    printWriter.close();
                }
                this.i.add(c2);
                i3++;
            }
        } else {
            this.i = null;
        }
        this.n.set(rxVar.v);
        String str3 = rxVar.w;
        if (str3 != null) {
            Fragment n0 = n0(str3);
            this.z = n0;
            Q(n0);
        }
        ArrayList<String> arrayList = rxVar.x;
        if (arrayList != null) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                Bundle bundle = rxVar.y.get(i4);
                bundle.setClassLoader(this.w.g().getClassLoader());
                this.o.put(arrayList.get(i4), bundle);
            }
        }
        this.H = new ArrayDeque<>(rxVar.z);
    }

    public void F(@x1 Configuration configuration) {
        for (Fragment fragment : this.h.o()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
            }
        }
    }

    @x1
    public by F0() {
        return this.h;
    }

    @Deprecated
    public qx F1() {
        if (this.w instanceof q00) {
            S1(new IllegalStateException("You cannot use retainNonConfig when your FragmentHostCallback implements ViewModelStoreOwner."));
        }
        return this.R.m();
    }

    public boolean G(@x1 MenuItem menuItem) {
        if (this.v < 1) {
            return false;
        }
        for (Fragment fragment : this.h.o()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    @x1
    public List<Fragment> G0() {
        return this.h.o();
    }

    public void H() {
        this.J = false;
        this.K = false;
        this.R.r(false);
        X(1);
    }

    @x1
    public mx<?> H0() {
        return this.w;
    }

    public Parcelable H1() {
        int size;
        u0();
        e0();
        h0(true);
        this.J = true;
        this.R.r(true);
        ArrayList<xx> w = this.h.w();
        ex[] exVarArr = null;
        if (w.isEmpty()) {
            T0(2);
            return null;
        }
        ArrayList<String> x = this.h.x();
        ArrayList<dx> arrayList = this.i;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            exVarArr = new ex[size];
            for (int i2 = 0; i2 < size; i2++) {
                exVarArr[i2] = new ex(this.i.get(i2));
                if (T0(2)) {
                    StringBuilder H = wo1.H("saveAllState: adding back stack #", i2, ": ");
                    H.append(this.i.get(i2));
                    H.toString();
                }
            }
        }
        rx rxVar = new rx();
        rxVar.s = w;
        rxVar.t = x;
        rxVar.u = exVarArr;
        rxVar.v = this.n.get();
        Fragment fragment = this.z;
        if (fragment != null) {
            rxVar.w = fragment.mWho;
        }
        rxVar.x.addAll(this.o.keySet());
        rxVar.y.addAll(this.o.values());
        rxVar.z = new ArrayList<>(this.H);
        return rxVar;
    }

    public boolean I(@x1 Menu menu, @x1 MenuInflater menuInflater) {
        if (this.v < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.h.o()) {
            if (fragment != null && V0(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.j != null) {
            for (int i2 = 0; i2 < this.j.size(); i2++) {
                Fragment fragment2 = this.j.get(i2);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.j = arrayList;
        return z;
    }

    @x1
    public LayoutInflater.Factory2 I0() {
        return this.k;
    }

    @z1
    public Fragment.m I1(@x1 Fragment fragment) {
        yx n2 = this.h.n(fragment.mWho);
        if (n2 == null || !n2.k().equals(fragment)) {
            S1(new IllegalStateException(wo1.q("Fragment ", fragment, " is not currently in the FragmentManager")));
        }
        return n2.r();
    }

    public void J() {
        this.L = true;
        h0(true);
        e0();
        X(-1);
        this.w = null;
        this.x = null;
        this.y = null;
        if (this.l != null) {
            this.m.d();
            this.l = null;
        }
        g0<Intent> g0Var = this.E;
        if (g0Var != null) {
            g0Var.d();
            this.F.d();
            this.G.d();
        }
    }

    @x1
    public ox J0() {
        return this.t;
    }

    public void J1() {
        synchronized (this.f) {
            ArrayList<s> arrayList = this.Q;
            boolean z = (arrayList == null || arrayList.isEmpty()) ? false : true;
            boolean z2 = this.f.size() == 1;
            if (z || z2) {
                this.w.h().removeCallbacks(this.S);
                this.w.h().post(this.S);
                U1();
            }
        }
    }

    public void K() {
        X(1);
    }

    @z1
    public Fragment K0() {
        return this.y;
    }

    public void K1(@x1 Fragment fragment, boolean z) {
        ViewGroup D0 = D0(fragment);
        if (D0 == null || !(D0 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) D0).setDrawDisappearingViewsLast(!z);
    }

    public void L() {
        for (Fragment fragment : this.h.o()) {
            if (fragment != null) {
                fragment.performLowMemory();
            }
        }
    }

    @z1
    public Fragment L0() {
        return this.z;
    }

    public void L1(@x1 lx lxVar) {
        this.A = lxVar;
    }

    public void M(boolean z) {
        for (Fragment fragment : this.h.o()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
            }
        }
    }

    @x1
    public ly M0() {
        ly lyVar = this.C;
        if (lyVar != null) {
            return lyVar;
        }
        Fragment fragment = this.y;
        if (fragment != null) {
            return fragment.mFragmentManager.M0();
        }
        return this.D;
    }

    public void M1(@x1 Fragment fragment, @x1 mz.c cVar) {
        if (fragment.equals(n0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = cVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public void N(@x1 Fragment fragment) {
        Iterator<tx> it = this.u.iterator();
        while (it.hasNext()) {
            it.next().a(this, fragment);
        }
    }

    public void N1(@z1 Fragment fragment) {
        if (fragment != null && (!fragment.equals(n0(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this))) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        Fragment fragment2 = this.z;
        this.z = fragment;
        Q(fragment2);
        Q(this.z);
    }

    public boolean O(@x1 MenuItem menuItem) {
        if (this.v < 1) {
            return false;
        }
        for (Fragment fragment : this.h.o()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    @x1
    public p00 O0(@x1 Fragment fragment) {
        return this.R.n(fragment);
    }

    public void O1(@x1 ly lyVar) {
        this.C = lyVar;
    }

    public void P(@x1 Menu menu) {
        if (this.v < 1) {
            return;
        }
        for (Fragment fragment : this.h.o()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    public void P0() {
        h0(true);
        if (this.m.c()) {
            o1();
        } else {
            this.l.e();
        }
    }

    public void Q0(@x1 Fragment fragment) {
        if (T0(2)) {
            String str = "hide: " + fragment;
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        P1(fragment);
    }

    public void Q1(@x1 Fragment fragment) {
        if (T0(2)) {
            String str = "show: " + fragment;
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    public void R() {
        X(5);
    }

    public void R0(@x1 Fragment fragment) {
        if (fragment.mAdded && U0(fragment)) {
            this.I = true;
        }
    }

    public void S(boolean z) {
        for (Fragment fragment : this.h.o()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
            }
        }
    }

    public boolean S0() {
        return this.L;
    }

    public boolean T(@x1 Menu menu) {
        boolean z = false;
        if (this.v < 1) {
            return false;
        }
        for (Fragment fragment : this.h.o()) {
            if (fragment != null && V0(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    public void T1(@x1 m mVar) {
        this.t.p(mVar);
    }

    public void U() {
        U1();
        Q(this.z);
    }

    public void V() {
        this.J = false;
        this.K = false;
        this.R.r(false);
        X(7);
    }

    public boolean V0(@z1 Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    public void W() {
        this.J = false;
        this.K = false;
        this.R.r(false);
        X(5);
    }

    public boolean W0(@z1 Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        return fragment.equals(fragmentManager.L0()) && W0(fragmentManager.y);
    }

    public boolean X0(int i2) {
        return this.v >= i2;
    }

    public void Y() {
        this.K = true;
        this.R.r(true);
        X(4);
    }

    public boolean Y0() {
        return this.J || this.K;
    }

    public void Z() {
        X(2);
    }

    public void Z0(@x1 Fragment fragment, @x1 String[] strArr, int i2) {
        if (this.G != null) {
            this.H.addLast(new n(fragment.mWho, i2));
            this.G.b(strArr);
            return;
        }
        this.w.o(fragment, strArr, i2);
    }

    @Override // com.p7700g.p99005.wx
    public final void a(@x1 String str, @x1 Bundle bundle) {
        o oVar = this.p.get(str);
        if (oVar != null && oVar.b(mz.c.STARTED)) {
            oVar.a(str, bundle);
        } else {
            this.o.put(str, bundle);
        }
    }

    public void a1(@x1 Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i2, @z1 Bundle bundle) {
        if (this.E != null) {
            this.H.addLast(new n(fragment.mWho, i2));
            if (intent != null && bundle != null) {
                intent.putExtra(k0.k.b, bundle);
            }
            this.E.b(intent);
            return;
        }
        this.w.s(fragment, intent, i2, bundle);
    }

    @Override // com.p7700g.p99005.wx
    @SuppressLint({"SyntheticAccessor"})
    public final void b(@x1 final String str, @x1 qz qzVar, @x1 final vx vxVar) {
        final mz lifecycle = qzVar.getLifecycle();
        if (lifecycle.b() == mz.c.DESTROYED) {
            return;
        }
        oz ozVar = new oz() { // from class: androidx.fragment.app.FragmentManager.6
            @Override // com.p7700g.p99005.oz
            public void i(@x1 qz qzVar2, @x1 mz.b bVar) {
                Bundle bundle;
                if (bVar == mz.b.ON_START && (bundle = (Bundle) FragmentManager.this.o.get(str)) != null) {
                    vxVar.a(str, bundle);
                    FragmentManager.this.d(str);
                }
                if (bVar == mz.b.ON_DESTROY) {
                    lifecycle.c(this);
                    FragmentManager.this.p.remove(str);
                }
            }
        };
        lifecycle.a(ozVar);
        o put = this.p.put(str, new o(lifecycle, vxVar, ozVar));
        if (put != null) {
            put.c();
        }
    }

    public void b0(@x1 String str, @z1 FileDescriptor fileDescriptor, @x1 PrintWriter printWriter, @z1 String[] strArr) {
        int size;
        int size2;
        String t = wo1.t(str, "    ");
        this.h.e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.j;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(this.j.get(i2).toString());
            }
        }
        ArrayList<dx> arrayList2 = this.i;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                dx dxVar = this.i.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(dxVar.toString());
                dxVar.W(t, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.n.get());
        synchronized (this.f) {
            int size3 = this.f.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size3; i4++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(this.f.get(i4));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.w);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.x);
        if (this.y != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.y);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.v);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.J);
        printWriter.print(" mStopped=");
        printWriter.print(this.K);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.L);
        if (this.I) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.I);
        }
    }

    public void b1(@x1 Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, @z1 Intent intent, int i3, int i4, int i5, @z1 Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent2;
        if (this.F != null) {
            if (bundle != null) {
                if (intent == null) {
                    intent2 = new Intent();
                    intent2.putExtra(e, true);
                } else {
                    intent2 = intent;
                }
                if (T0(2)) {
                    String str = "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + fragment;
                }
                intent2.putExtra(k0.k.b, bundle);
            } else {
                intent2 = intent;
            }
            i0 a2 = new i0.b(intentSender).b(intent2).c(i4, i3).a();
            this.H.addLast(new n(fragment.mWho, i2));
            if (T0(2)) {
                String str2 = "Fragment " + fragment + "is launching an IntentSender for result ";
            }
            this.F.b(a2);
            return;
        }
        this.w.t(fragment, intentSender, i2, intent, i3, i4, i5, bundle);
    }

    @Override // com.p7700g.p99005.wx
    public final void c(@x1 String str) {
        o remove = this.p.remove(str);
        if (remove != null) {
            remove.c();
        }
    }

    @Override // com.p7700g.p99005.wx
    public final void d(@x1 String str) {
        this.o.remove(str);
    }

    public void d1(@x1 Fragment fragment) {
        if (!this.h.c(fragment.mWho)) {
            if (T0(3)) {
                String str = "Ignoring moving " + fragment + " to state " + this.v + "since it is not added to " + this;
                return;
            }
            return;
        }
        f1(fragment);
        View view = fragment.mView;
        if (view != null && fragment.mIsNewlyAdded && fragment.mContainer != null) {
            float f2 = fragment.mPostponedAlpha;
            if (f2 > 0.0f) {
                view.setAlpha(f2);
            }
            fragment.mPostponedAlpha = 0.0f;
            fragment.mIsNewlyAdded = false;
            ix.d c2 = ix.c(this.w.g(), fragment, true, fragment.getPopDirection());
            if (c2 != null) {
                Animation animation = c2.a;
                if (animation != null) {
                    fragment.mView.startAnimation(animation);
                } else {
                    c2.b.setTarget(fragment.mView);
                    c2.b.start();
                }
            }
        }
        if (fragment.mHiddenChanged) {
            z(fragment);
        }
    }

    public void e1(int i2, boolean z) {
        mx<?> mxVar;
        if (this.w == null && i2 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i2 != this.v) {
            this.v = i2;
            if (c) {
                this.h.s();
            } else {
                for (Fragment fragment : this.h.o()) {
                    d1(fragment);
                }
                for (yx yxVar : this.h.l()) {
                    Fragment k2 = yxVar.k();
                    if (!k2.mIsNewlyAdded) {
                        d1(k2);
                    }
                    if (k2.mRemoving && !k2.isInBackStack()) {
                        this.h.r(yxVar);
                    }
                }
            }
            R1();
            if (this.I && (mxVar = this.w) != null && this.v == 7) {
                mxVar.u();
                this.I = false;
            }
        }
    }

    public void f0(@x1 q qVar, boolean z) {
        if (!z) {
            if (this.w == null) {
                if (this.L) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            u();
        }
        synchronized (this.f) {
            if (this.w == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
                return;
            }
            this.f.add(qVar);
            J1();
        }
    }

    public void f1(@x1 Fragment fragment) {
        g1(fragment, this.v);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
        if (r2 != 5) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void g1(@x1 Fragment fragment, int i2) {
        ViewGroup viewGroup;
        yx n2 = this.h.n(fragment.mWho);
        int i3 = 1;
        if (n2 == null) {
            n2 = new yx(this.t, this.h, fragment);
            n2.u(1);
        }
        if (fragment.mFromLayout && fragment.mInLayout && fragment.mState == 2) {
            i2 = Math.max(i2, 2);
        }
        int min = Math.min(i2, n2.d());
        int i4 = fragment.mState;
        if (i4 <= min) {
            if (i4 < min && !this.r.isEmpty()) {
                s(fragment);
            }
            int i5 = fragment.mState;
            if (i5 != -1) {
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            if (i5 != 4) {
                            }
                            if (min > 4) {
                                n2.v();
                            }
                            if (min > 5) {
                                n2.p();
                            }
                        }
                        if (min > 2) {
                            n2.a();
                        }
                        if (min > 4) {
                        }
                        if (min > 5) {
                        }
                    }
                    if (min > -1) {
                        n2.j();
                    }
                    if (min > 1) {
                        n2.f();
                    }
                    if (min > 2) {
                    }
                    if (min > 4) {
                    }
                    if (min > 5) {
                    }
                }
            } else if (min > -1) {
                n2.c();
            }
            if (min > 0) {
                n2.e();
            }
            if (min > -1) {
            }
            if (min > 1) {
            }
            if (min > 2) {
            }
            if (min > 4) {
            }
            if (min > 5) {
            }
        } else if (i4 > min) {
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 4) {
                            if (i4 != 5) {
                                if (i4 == 7) {
                                    if (min < 7) {
                                        n2.n();
                                    }
                                }
                            }
                            if (min < 5) {
                                n2.w();
                            }
                        }
                        if (min < 4) {
                            if (T0(3)) {
                                String str = "movefrom ACTIVITY_CREATED: " + fragment;
                            }
                            if (fragment.mView != null && this.w.p(fragment) && fragment.mSavedViewState == null) {
                                n2.t();
                            }
                        }
                    }
                    if (min < 2) {
                        ix.d dVar = null;
                        View view = fragment.mView;
                        if (view != null && (viewGroup = fragment.mContainer) != null) {
                            viewGroup.endViewTransition(view);
                            fragment.mView.clearAnimation();
                            if (!fragment.isRemovingParent()) {
                                if (this.v > -1 && !this.L && fragment.mView.getVisibility() == 0 && fragment.mPostponedAlpha >= 0.0f) {
                                    dVar = ix.c(this.w.g(), fragment, false, fragment.getPopDirection());
                                }
                                fragment.mPostponedAlpha = 0.0f;
                                ViewGroup viewGroup2 = fragment.mContainer;
                                View view2 = fragment.mView;
                                if (dVar != null) {
                                    ix.a(fragment, dVar, this.s);
                                }
                                viewGroup2.removeView(view2);
                                if (T0(2)) {
                                    String str2 = "Removing view " + view2 + " for fragment " + fragment + " from container " + viewGroup2;
                                }
                                if (viewGroup2 != fragment.mContainer) {
                                    return;
                                }
                            }
                        }
                        if (this.r.get(fragment) == null) {
                            n2.h();
                        }
                    }
                }
                if (min < 1) {
                    if (this.r.get(fragment) == null) {
                        n2.g();
                    }
                    if (i3 < 0) {
                        n2.i();
                    }
                    min = i3;
                }
            }
            i3 = min;
            if (i3 < 0) {
            }
            min = i3;
        }
        if (fragment.mState != min) {
            if (T0(3)) {
                String str3 = "moveToState: Fragment state for " + fragment + " not updated inline; expected state " + min + " found " + fragment.mState;
            }
            fragment.mState = min;
        }
    }

    public boolean h0(boolean z) {
        g0(z);
        boolean z2 = false;
        while (v0(this.N, this.O)) {
            this.g = true;
            try {
                A1(this.N, this.O);
                v();
                z2 = true;
            } catch (Throwable th) {
                v();
                throw th;
            }
        }
        U1();
        a0();
        this.h.b();
        return z2;
    }

    public void h1() {
        if (this.w == null) {
            return;
        }
        this.J = false;
        this.K = false;
        this.R.r(false);
        for (Fragment fragment : this.h.o()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public void i(dx dxVar) {
        if (this.i == null) {
            this.i = new ArrayList<>();
        }
        this.i.add(dxVar);
    }

    public void i0(@x1 q qVar, boolean z) {
        if (z && (this.w == null || this.L)) {
            return;
        }
        g0(z);
        if (qVar.b(this.N, this.O)) {
            this.g = true;
            try {
                A1(this.N, this.O);
            } finally {
                v();
            }
        }
        U1();
        a0();
        this.h.b();
    }

    public void i1(@x1 FragmentContainerView fragmentContainerView) {
        View view;
        for (yx yxVar : this.h.l()) {
            Fragment k2 = yxVar.k();
            if (k2.mContainerId == fragmentContainerView.getId() && (view = k2.mView) != null && view.getParent() == null) {
                k2.mContainer = fragmentContainerView;
                yxVar.b();
            }
        }
    }

    public void j(@x1 Fragment fragment, @x1 nm nmVar) {
        if (this.r.get(fragment) == null) {
            this.r.put(fragment, new HashSet<>());
        }
        this.r.get(fragment).add(nmVar);
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @x1
    @Deprecated
    public dy j1() {
        return r();
    }

    public yx k(@x1 Fragment fragment) {
        if (T0(2)) {
            String str = "add: " + fragment;
        }
        yx A = A(fragment);
        fragment.mFragmentManager = this;
        this.h.q(A);
        if (!fragment.mDetached) {
            this.h.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (U0(fragment)) {
                this.I = true;
            }
        }
        return A;
    }

    public void k1(@x1 yx yxVar) {
        Fragment k2 = yxVar.k();
        if (k2.mDeferStart) {
            if (this.g) {
                this.M = true;
                return;
            }
            k2.mDeferStart = false;
            if (c) {
                yxVar.m();
            } else {
                f1(k2);
            }
        }
    }

    public void l(@x1 tx txVar) {
        this.u.add(txVar);
    }

    public boolean l0() {
        boolean h0 = h0(true);
        u0();
        return h0;
    }

    public void l1() {
        f0(new r(null, -1, 0), false);
    }

    public void m(@x1 p pVar) {
        if (this.q == null) {
            this.q = new ArrayList<>();
        }
        this.q.add(pVar);
    }

    public void m1(int i2, int i3) {
        if (i2 >= 0) {
            f0(new r(null, i2, i3), false);
            return;
        }
        throw new IllegalArgumentException(wo1.l("Bad id: ", i2));
    }

    public void n(@x1 Fragment fragment) {
        this.R.g(fragment);
    }

    @z1
    public Fragment n0(@x1 String str) {
        return this.h.f(str);
    }

    public void n1(@z1 String str, int i2) {
        f0(new r(str, -1, i2), false);
    }

    public int o() {
        return this.n.getAndIncrement();
    }

    public boolean o1() {
        return r1(null, -1, 0);
    }

    @SuppressLint({"SyntheticAccessor"})
    public void p(@x1 mx<?> mxVar, @x1 jx jxVar, @z1 Fragment fragment) {
        if (this.w == null) {
            this.w = mxVar;
            this.x = jxVar;
            this.y = fragment;
            if (fragment != null) {
                l(new i(fragment));
            } else if (mxVar instanceof tx) {
                l((tx) mxVar);
            }
            if (this.y != null) {
                U1();
            }
            if (mxVar instanceof x) {
                x xVar = (x) mxVar;
                OnBackPressedDispatcher c2 = xVar.c();
                this.l = c2;
                qz qzVar = xVar;
                if (fragment != null) {
                    qzVar = fragment;
                }
                c2.b(qzVar, this.m);
            }
            if (fragment != null) {
                this.R = fragment.mFragmentManager.A0(fragment);
            } else if (mxVar instanceof q00) {
                this.R = sx.k(((q00) mxVar).getViewModelStore());
            } else {
                this.R = new sx(false);
            }
            this.R.r(Y0());
            this.h.y(this.R);
            mx<?> mxVar2 = this.w;
            if (mxVar2 instanceof h0) {
                ActivityResultRegistry m2 = ((h0) mxVar2).m();
                String t = wo1.t("FragmentManager:", fragment != null ? wo1.C(new StringBuilder(), fragment.mWho, ":") : "");
                this.E = m2.i(wo1.t(t, "StartActivityForResult"), new k0.k(), new j());
                this.F = m2.i(wo1.t(t, "StartIntentSenderForResult"), new l(), new a());
                this.G = m2.i(wo1.t(t, "RequestPermissions"), new k0.i(), new b());
                return;
            }
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    @z1
    public Fragment p0(@m1 int i2) {
        return this.h.g(i2);
    }

    public boolean p1(int i2, int i3) {
        if (i2 >= 0) {
            return r1(null, i2, i3);
        }
        throw new IllegalArgumentException(wo1.l("Bad id: ", i2));
    }

    public void q(@x1 Fragment fragment) {
        if (T0(2)) {
            String str = "attach: " + fragment;
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.h.a(fragment);
            if (T0(2)) {
                String str2 = "add from attach: " + fragment;
            }
            if (U0(fragment)) {
                this.I = true;
            }
        }
    }

    @z1
    public Fragment q0(@z1 String str) {
        return this.h.h(str);
    }

    public boolean q1(@z1 String str, int i2) {
        return r1(str, -1, i2);
    }

    @x1
    public dy r() {
        return new dx(this);
    }

    public Fragment r0(@x1 String str) {
        return this.h.i(str);
    }

    public boolean s1(@x1 ArrayList<dx> arrayList, @x1 ArrayList<Boolean> arrayList2, @z1 String str, int i2, int i3) {
        int i4;
        ArrayList<dx> arrayList3 = this.i;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i2 < 0 && (i3 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.i.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i2 >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    dx dxVar = this.i.get(size2);
                    if ((str != null && str.equals(dxVar.getName())) || (i2 >= 0 && i2 == dxVar.O)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i3 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        dx dxVar2 = this.i.get(size2);
                        if (str == null || !str.equals(dxVar2.getName())) {
                            if (i2 < 0 || i2 != dxVar2.O) {
                                break;
                            }
                        }
                    }
                }
                i4 = size2;
            } else {
                i4 = -1;
            }
            if (i4 == this.i.size() - 1) {
                return false;
            }
            for (int size3 = this.i.size() - 1; size3 > i4; size3--) {
                arrayList.add(this.i.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    public boolean t() {
        boolean z = false;
        for (Fragment fragment : this.h.m()) {
            if (fragment != null) {
                z = U0(fragment);
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @x1
    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.y;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.y)));
            sb.append("}");
        } else {
            mx<?> mxVar = this.w;
            if (mxVar != null) {
                sb.append(mxVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.w)));
                sb.append("}");
            } else {
                sb.append(pg1.d);
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public void u1(@x1 Bundle bundle, @x1 String str, @x1 Fragment fragment) {
        if (fragment.mFragmentManager != this) {
            S1(new IllegalStateException(wo1.q("Fragment ", fragment, " is not currently in the FragmentManager")));
        }
        bundle.putString(str, fragment.mWho);
    }

    public void v1(@x1 m mVar, boolean z) {
        this.t.o(mVar, z);
    }

    public int w0() {
        return this.h.k();
    }

    public void w1(@x1 Fragment fragment, @x1 nm nmVar) {
        HashSet<nm> hashSet = this.r.get(fragment);
        if (hashSet != null && hashSet.remove(nmVar) && hashSet.isEmpty()) {
            this.r.remove(fragment);
            if (fragment.mState < 5) {
                B(fragment);
                f1(fragment);
            }
        }
    }

    @x1
    public List<Fragment> x0() {
        return this.h.m();
    }

    public void x1(@x1 Fragment fragment) {
        if (T0(2)) {
            String str = "remove: " + fragment + " nesting=" + fragment.mBackStackNesting;
        }
        boolean z = !fragment.isInBackStack();
        if (!fragment.mDetached || z) {
            this.h.t(fragment);
            if (U0(fragment)) {
                this.I = true;
            }
            fragment.mRemoving = true;
            P1(fragment);
        }
    }

    public void y(@x1 dx dxVar, boolean z, boolean z2, boolean z3) {
        if (z) {
            dxVar.Z(z3);
        } else {
            dxVar.Y();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(dxVar);
        arrayList2.add(Boolean.valueOf(z));
        if (z2 && this.v >= 1) {
            ey.C(this.w.g(), this.x, arrayList, arrayList2, 0, 1, true, this.s);
        }
        if (z3) {
            e1(this.v, true);
        }
        for (Fragment fragment : this.h.m()) {
            if (fragment != null && fragment.mView != null && fragment.mIsNewlyAdded && dxVar.b0(fragment.mContainerId)) {
                float f2 = fragment.mPostponedAlpha;
                if (f2 > 0.0f) {
                    fragment.mView.setAlpha(f2);
                }
                if (z3) {
                    fragment.mPostponedAlpha = 0.0f;
                } else {
                    fragment.mPostponedAlpha = -1.0f;
                    fragment.mIsNewlyAdded = false;
                }
            }
        }
    }

    @x1
    public k y0(int i2) {
        return this.i.get(i2);
    }

    public void y1(@x1 tx txVar) {
        this.u.remove(txVar);
    }

    public int z0() {
        ArrayList<dx> arrayList = this.i;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public void z1(@x1 p pVar) {
        ArrayList<p> arrayList = this.q;
        if (arrayList != null) {
            arrayList.remove(pVar);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class n implements Parcelable {
        public static final Parcelable.Creator<n> CREATOR = new a();
        public String s;
        public int t;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<n> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public n createFromParcel(Parcel parcel) {
                return new n(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public n[] newArray(int i) {
                return new n[i];
            }
        }

        public n(@x1 String str, int i) {
            this.s = str;
            this.t = i;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.s);
            parcel.writeInt(this.t);
        }

        public n(@x1 Parcel parcel) {
            this.s = parcel.readString();
            this.t = parcel.readInt();
        }
    }
}