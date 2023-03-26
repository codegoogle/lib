package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.ActivityResultRegistry;
import androidx.lifecycle.LiveData;
import com.p7700g.p99005.e0;
import com.p7700g.p99005.f0;
import com.p7700g.p99005.f60;
import com.p7700g.p99005.g0;
import com.p7700g.p99005.g00;
import com.p7700g.p99005.g54;
import com.p7700g.p99005.g60;
import com.p7700g.p99005.h0;
import com.p7700g.p99005.h60;
import com.p7700g.p99005.hx;
import com.p7700g.p99005.hy;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.i60;
import com.p7700g.p99005.j0;
import com.p7700g.p99005.j10;
import com.p7700g.p99005.jx;
import com.p7700g.p99005.ky;
import com.p7700g.p99005.kz;
import com.p7700g.p99005.l2;
import com.p7700g.p99005.lx;
import com.p7700g.p99005.lz;
import com.p7700g.p99005.m00;
import com.p7700g.p99005.m5;
import com.p7700g.p99005.mx;
import com.p7700g.p99005.my;
import com.p7700g.p99005.mz;
import com.p7700g.p99005.oz;
import com.p7700g.p99005.p00;
import com.p7700g.p99005.px;
import com.p7700g.p99005.q00;
import com.p7700g.p99005.q2;
import com.p7700g.p99005.qq;
import com.p7700g.p99005.qz;
import com.p7700g.p99005.r00;
import com.p7700g.p99005.rz;
import com.p7700g.p99005.s1;
import com.p7700g.p99005.t0;
import com.p7700g.p99005.t00;
import com.p7700g.p99005.u1;
import com.p7700g.p99005.uf;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.xz;
import com.p7700g.p99005.yg;
import com.p7700g.p99005.z0;
import com.p7700g.p99005.z00;
import com.p7700g.p99005.z1;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, qz, q00, lz, h60, f0 {
    public static final int ACTIVITY_CREATED = 4;
    public static final int ATTACHED = 0;
    public static final int AWAITING_ENTER_EFFECTS = 6;
    public static final int AWAITING_EXIT_EFFECTS = 3;
    public static final int CREATED = 1;
    public static final int INITIALIZING = -1;
    public static final int RESUMED = 7;
    public static final int STARTED = 5;
    public static final Object USE_DEFAULT_TRANSITION = new Object();
    public static final int VIEW_CREATED = 2;
    public boolean mAdded;
    public i mAnimationInfo;
    public Bundle mArguments;
    public int mBackStackNesting;
    private boolean mCalled;
    @x1
    public FragmentManager mChildFragmentManager;
    public ViewGroup mContainer;
    public int mContainerId;
    @s1
    private int mContentLayoutId;
    public m00.b mDefaultFactory;
    public boolean mDeferStart;
    public boolean mDetached;
    public int mFragmentId;
    public FragmentManager mFragmentManager;
    public boolean mFromLayout;
    public boolean mHasMenu;
    public boolean mHidden;
    public boolean mHiddenChanged;
    public mx<?> mHost;
    public boolean mInLayout;
    public boolean mIsCreated;
    public boolean mIsNewlyAdded;
    private Boolean mIsPrimaryNavigationFragment;
    public LayoutInflater mLayoutInflater;
    public rz mLifecycleRegistry;
    public mz.c mMaxState;
    public boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<k> mOnPreAttachedListeners;
    public Fragment mParentFragment;
    public boolean mPerformedCreateView;
    public float mPostponedAlpha;
    public Runnable mPostponedDurationRunnable;
    public boolean mRemoving;
    public boolean mRestored;
    public boolean mRetainInstance;
    public boolean mRetainInstanceChangedWhileDetached;
    public Bundle mSavedFragmentState;
    public g60 mSavedStateRegistryController;
    @z1
    public Boolean mSavedUserVisibleHint;
    public Bundle mSavedViewRegistryState;
    public SparseArray<Parcelable> mSavedViewState;
    public int mState;
    public String mTag;
    public Fragment mTarget;
    public int mTargetRequestCode;
    public String mTargetWho;
    public boolean mUserVisibleHint;
    public View mView;
    @z1
    public hy mViewLifecycleOwner;
    public xz<qz> mViewLifecycleOwnerLiveData;
    @x1
    public String mWho;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.startPostponedEnterTransition();
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.callStartTransitionListener(false);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public final /* synthetic */ ky s;

        public c(ky kyVar) {
            this.s = kyVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.s.g();
        }
    }

    /* loaded from: classes.dex */
    public class d extends jx {
        public d() {
        }

        @Override // com.p7700g.p99005.jx
        @z1
        public View d(int i) {
            View view = Fragment.this.mView;
            if (view != null) {
                return view.findViewById(i);
            }
            StringBuilder G = wo1.G("Fragment ");
            G.append(Fragment.this);
            G.append(" does not have a view");
            throw new IllegalStateException(G.toString());
        }

        @Override // com.p7700g.p99005.jx
        public boolean e() {
            return Fragment.this.mView != null;
        }
    }

    /* loaded from: classes.dex */
    public class e implements m5<Void, ActivityResultRegistry> {
        public e() {
        }

        @Override // com.p7700g.p99005.m5
        /* renamed from: a */
        public ActivityResultRegistry apply(Void r3) {
            Fragment fragment = Fragment.this;
            mx<?> mxVar = fragment.mHost;
            if (mxVar instanceof h0) {
                return ((h0) mxVar).m();
            }
            return fragment.requireActivity().m();
        }
    }

    /* loaded from: classes.dex */
    public class f implements m5<Void, ActivityResultRegistry> {
        public final /* synthetic */ ActivityResultRegistry a;

        public f(ActivityResultRegistry activityResultRegistry) {
            this.a = activityResultRegistry;
        }

        @Override // com.p7700g.p99005.m5
        /* renamed from: a */
        public ActivityResultRegistry apply(Void r1) {
            return this.a;
        }
    }

    /* loaded from: classes.dex */
    public class g extends k {
        public final /* synthetic */ m5 a;
        public final /* synthetic */ AtomicReference b;
        public final /* synthetic */ j0 c;
        public final /* synthetic */ e0 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(m5 m5Var, AtomicReference atomicReference, j0 j0Var, e0 e0Var) {
            super(null);
            this.a = m5Var;
            this.b = atomicReference;
            this.c = j0Var;
            this.d = e0Var;
        }

        @Override // androidx.fragment.app.Fragment.k
        public void a() {
            this.b.set(((ActivityResultRegistry) this.a.apply(null)).j(Fragment.this.generateActivityResultKey(), Fragment.this, this.c, this.d));
        }
    }

    /* loaded from: classes.dex */
    public class h extends g0<I> {
        public final /* synthetic */ AtomicReference a;
        public final /* synthetic */ j0 b;

        public h(AtomicReference atomicReference, j0 j0Var) {
            this.a = atomicReference;
            this.b = j0Var;
        }

        @Override // com.p7700g.p99005.g0
        @x1
        public j0<I, ?> a() {
            return this.b;
        }

        @Override // com.p7700g.p99005.g0
        public void c(I i, @z1 uf ufVar) {
            g0 g0Var = (g0) this.a.get();
            if (g0Var != null) {
                g0Var.c(i, ufVar);
                return;
            }
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }

        @Override // com.p7700g.p99005.g0
        public void d() {
            g0 g0Var = (g0) this.a.getAndSet(null);
            if (g0Var != null) {
                g0Var.d();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class i {
        public View a;
        public Animator b;
        public boolean c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public ArrayList<String> i;
        public ArrayList<String> j;
        public Object k = null;
        public Object l;
        public Object m;
        public Object n;
        public Object o;
        public Object p;
        public Boolean q;
        public Boolean r;
        public yg s;
        public yg t;
        public float u;
        public View v;
        public boolean w;
        public l x;
        public boolean y;

        public i() {
            Object obj = Fragment.USE_DEFAULT_TRANSITION;
            this.l = obj;
            this.m = null;
            this.n = obj;
            this.o = null;
            this.p = obj;
            this.s = null;
            this.t = null;
            this.u = 1.0f;
            this.v = null;
        }
    }

    /* loaded from: classes.dex */
    public static class j extends RuntimeException {
        public j(@x1 String str, @z1 Exception exc) {
            super(str, exc);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class k {
        private k() {
        }

        public abstract void a();

        public /* synthetic */ k(a aVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public interface l {
        void a();

        void b();
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new px();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new a();
        this.mMaxState = mz.c.RESUMED;
        this.mViewLifecycleOwnerLiveData = new xz<>();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        initLifecycle();
    }

    private i ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new i();
        }
        return this.mAnimationInfo;
    }

    private int getMinimumMaxLifecycleState() {
        mz.c cVar = this.mMaxState;
        if (cVar != mz.c.INITIALIZED && this.mParentFragment != null) {
            return Math.min(cVar.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
        }
        return cVar.ordinal();
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new rz(this);
        this.mSavedStateRegistryController = g60.a(this);
        this.mDefaultFactory = null;
    }

    @x1
    @Deprecated
    public static Fragment instantiate(@x1 Context context, @x1 String str) {
        return instantiate(context, str, null);
    }

    @x1
    private <I, O> g0<I> prepareCallInternal(@x1 j0<I, O> j0Var, @x1 m5<Void, ActivityResultRegistry> m5Var, @x1 e0<O> e0Var) {
        if (this.mState <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            registerOnPreAttachListener(new g(m5Var, atomicReference, j0Var, e0Var));
            return new h(atomicReference, j0Var);
        }
        throw new IllegalStateException(wo1.q("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
    }

    private void registerOnPreAttachListener(@x1 k kVar) {
        if (this.mState >= 0) {
            kVar.a();
        } else {
            this.mOnPreAttachedListeners.add(kVar);
        }
    }

    public void callStartTransitionListener(boolean z) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        i iVar = this.mAnimationInfo;
        l lVar = null;
        if (iVar != null) {
            iVar.w = false;
            l lVar2 = iVar.x;
            iVar.x = null;
            lVar = lVar2;
        }
        if (lVar != null) {
            lVar.b();
        } else if (!FragmentManager.c || this.mView == null || (viewGroup = this.mContainer) == null || (fragmentManager = this.mFragmentManager) == null) {
        } else {
            ky n = ky.n(viewGroup, fragmentManager);
            n.p();
            if (z) {
                this.mHost.h().post(new c(n));
            } else {
                n.g();
            }
        }
    }

    @x1
    public jx createFragmentContainer() {
        return new d();
    }

    public void dump(@x1 String str, @z1 FileDescriptor fileDescriptor, @x1 PrintWriter printWriter, @z1 String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment targetFragment = getTargetFragment();
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            j10.d(this).b(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.b0(wo1.t(str, g54.A), fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(@z1 Object obj) {
        return super.equals(obj);
    }

    @z1
    public Fragment findFragmentByWho(@x1 String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.r0(str);
    }

    @x1
    public String generateActivityResultKey() {
        StringBuilder G = wo1.G("fragment_");
        G.append(this.mWho);
        G.append("_rq#");
        G.append(this.mNextLocalRequestCode.getAndIncrement());
        return G.toString();
    }

    @z1
    public final hx getActivity() {
        mx<?> mxVar = this.mHost;
        if (mxVar == null) {
            return null;
        }
        return (hx) mxVar.f();
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        i iVar = this.mAnimationInfo;
        if (iVar == null || (bool = iVar.r) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        i iVar = this.mAnimationInfo;
        if (iVar == null || (bool = iVar.q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.a;
    }

    public Animator getAnimator() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.b;
    }

    @z1
    public final Bundle getArguments() {
        return this.mArguments;
    }

    @x1
    public final FragmentManager getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException(wo1.q("Fragment ", this, " has not been attached yet."));
    }

    @z1
    public Context getContext() {
        mx<?> mxVar = this.mHost;
        if (mxVar == null) {
            return null;
        }
        return mxVar.g();
    }

    @Override // com.p7700g.p99005.lz
    @x1
    public m00.b getDefaultViewModelProviderFactory() {
        if (this.mFragmentManager != null) {
            if (this.mDefaultFactory == null) {
                Application application = null;
                Context applicationContext = requireContext().getApplicationContext();
                while (true) {
                    if (!(applicationContext instanceof ContextWrapper)) {
                        break;
                    } else if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                        break;
                    } else {
                        applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                    }
                }
                if (application == null && FragmentManager.T0(3)) {
                    StringBuilder G = wo1.G("Could not find Application instance from Context ");
                    G.append(requireContext().getApplicationContext());
                    G.append(", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
                    G.toString();
                }
                this.mDefaultFactory = new g00(application, this, getArguments());
            }
            return this.mDefaultFactory;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public int getEnterAnim() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 0;
        }
        return iVar.d;
    }

    @z1
    public Object getEnterTransition() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.k;
    }

    public yg getEnterTransitionCallback() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.s;
    }

    public int getExitAnim() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 0;
        }
        return iVar.e;
    }

    @z1
    public Object getExitTransition() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.m;
    }

    public yg getExitTransitionCallback() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.t;
    }

    public View getFocusedView() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.v;
    }

    @z1
    @Deprecated
    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    @z1
    public final Object getHost() {
        mx<?> mxVar = this.mHost;
        if (mxVar == null) {
            return null;
        }
        return mxVar.j();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    @x1
    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Override // com.p7700g.p99005.qz
    @x1
    public mz getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @x1
    @Deprecated
    public j10 getLoaderManager() {
        return j10.d(this);
    }

    public int getNextTransition() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 0;
        }
        return iVar.h;
    }

    @z1
    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    @x1
    public final FragmentManager getParentFragmentManager() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException(wo1.q("Fragment ", this, " not associated with a fragment manager."));
    }

    public boolean getPopDirection() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return false;
        }
        return iVar.c;
    }

    public int getPopEnterAnim() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 0;
        }
        return iVar.f;
    }

    public int getPopExitAnim() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 0;
        }
        return iVar.g;
    }

    public float getPostOnViewCreatedAlpha() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 1.0f;
        }
        return iVar.u;
    }

    @z1
    public Object getReenterTransition() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        Object obj = iVar.n;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    @x1
    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        return this.mRetainInstance;
    }

    @z1
    public Object getReturnTransition() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        Object obj = iVar.l;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // com.p7700g.p99005.h60
    @x1
    public final f60 getSavedStateRegistry() {
        return this.mSavedStateRegistryController.b();
    }

    @z1
    public Object getSharedElementEnterTransition() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.o;
    }

    @z1
    public Object getSharedElementReturnTransition() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        Object obj = iVar.p;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    @x1
    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        i iVar = this.mAnimationInfo;
        return (iVar == null || (arrayList = iVar.i) == null) ? new ArrayList<>() : arrayList;
    }

    @x1
    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        i iVar = this.mAnimationInfo;
        return (iVar == null || (arrayList = iVar.j) == null) ? new ArrayList<>() : arrayList;
    }

    @x1
    public final String getString(@l2 int i2) {
        return getResources().getString(i2);
    }

    @z1
    public final String getTag() {
        return this.mTag;
    }

    @z1
    @Deprecated
    public final Fragment getTargetFragment() {
        String str;
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return fragmentManager.n0(str);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        return this.mTargetRequestCode;
    }

    @x1
    public final CharSequence getText(@l2 int i2) {
        return getResources().getText(i2);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    @z1
    public View getView() {
        return this.mView;
    }

    @x1
    @u1
    public qz getViewLifecycleOwner() {
        hy hyVar = this.mViewLifecycleOwner;
        if (hyVar != null) {
            return hyVar;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    @x1
    public LiveData<qz> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // com.p7700g.p99005.q00
    @x1
    public p00 getViewModelStore() {
        if (this.mFragmentManager != null) {
            if (getMinimumMaxLifecycleState() != mz.c.INITIALIZED.ordinal()) {
                return this.mFragmentManager.O0(this);
            }
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @SuppressLint({"KotlinPropertyAccess"})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        initLifecycle();
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new px();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        return this.mHidden;
    }

    public boolean isHideReplaced() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return false;
        }
        return iVar.y;
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public final boolean isMenuVisible() {
        FragmentManager fragmentManager;
        return this.mMenuVisible && ((fragmentManager = this.mFragmentManager) == null || fragmentManager.V0(this.mParentFragment));
    }

    public boolean isPostponed() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return false;
        }
        return iVar.w;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isRemovingParent() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null && (parentFragment.isRemoving() || parentFragment.isRemovingParent());
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.Y0();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    @Override // com.p7700g.p99005.lz
    public /* synthetic */ z00 j() {
        return kz.a(this);
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.h1();
    }

    @t0
    @u1
    @Deprecated
    public void onActivityCreated(@z1 Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i2, int i3, @z1 Intent intent) {
        if (FragmentManager.T0(2)) {
            String str = "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i2 + " resultCode: " + i3 + " data: " + intent;
        }
    }

    @t0
    @u1
    public void onAttach(@x1 Context context) {
        this.mCalled = true;
        mx<?> mxVar = this.mHost;
        Activity f2 = mxVar == null ? null : mxVar.f();
        if (f2 != null) {
            this.mCalled = false;
            onAttach(f2);
        }
    }

    @u1
    @Deprecated
    public void onAttachFragment(@x1 Fragment fragment) {
    }

    @Override // android.content.ComponentCallbacks
    @t0
    public void onConfigurationChanged(@x1 Configuration configuration) {
        this.mCalled = true;
    }

    @u1
    public boolean onContextItemSelected(@x1 MenuItem menuItem) {
        return false;
    }

    @t0
    @u1
    public void onCreate(@z1 Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        if (this.mChildFragmentManager.X0(1)) {
            return;
        }
        this.mChildFragmentManager.H();
    }

    @u1
    @z1
    public Animation onCreateAnimation(int i2, boolean z, int i3) {
        return null;
    }

    @u1
    @z1
    public Animator onCreateAnimator(int i2, boolean z, int i3) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    @u1
    public void onCreateContextMenu(@x1 ContextMenu contextMenu, @x1 View view, @z1 ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @u1
    public void onCreateOptionsMenu(@x1 Menu menu, @x1 MenuInflater menuInflater) {
    }

    @u1
    @z1
    public View onCreateView(@x1 LayoutInflater layoutInflater, @z1 ViewGroup viewGroup, @z1 Bundle bundle) {
        int i2 = this.mContentLayoutId;
        if (i2 != 0) {
            return layoutInflater.inflate(i2, viewGroup, false);
        }
        return null;
    }

    @t0
    @u1
    public void onDestroy() {
        this.mCalled = true;
    }

    @u1
    public void onDestroyOptionsMenu() {
    }

    @t0
    @u1
    public void onDestroyView() {
        this.mCalled = true;
    }

    @t0
    @u1
    public void onDetach() {
        this.mCalled = true;
    }

    @x1
    public LayoutInflater onGetLayoutInflater(@z1 Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    @u1
    public void onHiddenChanged(boolean z) {
    }

    @q2
    @t0
    public void onInflate(@x1 Context context, @x1 AttributeSet attributeSet, @z1 Bundle bundle) {
        this.mCalled = true;
        mx<?> mxVar = this.mHost;
        Activity f2 = mxVar == null ? null : mxVar.f();
        if (f2 != null) {
            this.mCalled = false;
            onInflate(f2, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    @t0
    @u1
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    @u1
    public boolean onOptionsItemSelected(@x1 MenuItem menuItem) {
        return false;
    }

    @u1
    public void onOptionsMenuClosed(@x1 Menu menu) {
    }

    @t0
    @u1
    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    @u1
    public void onPrepareOptionsMenu(@x1 Menu menu) {
    }

    @u1
    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i2, @x1 String[] strArr, @x1 int[] iArr) {
    }

    @t0
    @u1
    public void onResume() {
        this.mCalled = true;
    }

    @u1
    public void onSaveInstanceState(@x1 Bundle bundle) {
    }

    @t0
    @u1
    public void onStart() {
        this.mCalled = true;
    }

    @t0
    @u1
    public void onStop() {
        this.mCalled = true;
    }

    @u1
    public void onViewCreated(@x1 View view, @z1 Bundle bundle) {
    }

    @t0
    @u1
    public void onViewStateRestored(@z1 Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.h1();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            restoreViewState();
            this.mChildFragmentManager.D();
            return;
        }
        throw new my(wo1.q("Fragment ", this, " did not call through to super.onActivityCreated()"));
    }

    public void performAttach() {
        Iterator<k> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.p(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.g());
        if (this.mCalled) {
            this.mFragmentManager.N(this);
            this.mChildFragmentManager.E();
            return;
        }
        throw new my(wo1.q("Fragment ", this, " did not call through to super.onAttach()"));
    }

    public void performConfigurationChanged(@x1 Configuration configuration) {
        onConfigurationChanged(configuration);
        this.mChildFragmentManager.F(configuration);
    }

    public boolean performContextItemSelected(@x1 MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.G(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.h1();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.a(new oz() { // from class: androidx.fragment.app.Fragment.5
            @Override // com.p7700g.p99005.oz
            public void i(@x1 qz qzVar, @x1 mz.b bVar) {
                View view;
                if (bVar != mz.b.ON_STOP || (view = Fragment.this.mView) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        this.mSavedStateRegistryController.d(bundle);
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.j(mz.b.ON_CREATE);
            return;
        }
        throw new my(wo1.q("Fragment ", this, " did not call through to super.onCreate()"));
    }

    public boolean performCreateOptionsMenu(@x1 Menu menu, @x1 MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z = true;
            onCreateOptionsMenu(menu, menuInflater);
        }
        return z | this.mChildFragmentManager.I(menu, menuInflater);
    }

    public void performCreateView(@x1 LayoutInflater layoutInflater, @z1 ViewGroup viewGroup, @z1 Bundle bundle) {
        this.mChildFragmentManager.h1();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new hy(this, getViewModelStore());
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        if (onCreateView != null) {
            this.mViewLifecycleOwner.b();
            r00.b(this.mView, this.mViewLifecycleOwner);
            t00.b(this.mView, this.mViewLifecycleOwner);
            i60.b(this.mView, this.mViewLifecycleOwner);
            this.mViewLifecycleOwnerLiveData.q(this.mViewLifecycleOwner);
        } else if (!this.mViewLifecycleOwner.d()) {
            this.mViewLifecycleOwner = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    public void performDestroy() {
        this.mChildFragmentManager.J();
        this.mLifecycleRegistry.j(mz.b.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new my(wo1.q("Fragment ", this, " did not call through to super.onDestroy()"));
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.K();
        if (this.mView != null && this.mViewLifecycleOwner.getLifecycle().b().a(mz.c.CREATED)) {
            this.mViewLifecycleOwner.a(mz.b.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            j10.d(this).h();
            this.mPerformedCreateView = false;
            return;
        }
        throw new my(wo1.q("Fragment ", this, " did not call through to super.onDestroyView()"));
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (this.mCalled) {
            if (this.mChildFragmentManager.S0()) {
                return;
            }
            this.mChildFragmentManager.J();
            this.mChildFragmentManager = new px();
            return;
        }
        throw new my(wo1.q("Fragment ", this, " did not call through to super.onDetach()"));
    }

    @x1
    public LayoutInflater performGetLayoutInflater(@z1 Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
        this.mChildFragmentManager.L();
    }

    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
        this.mChildFragmentManager.M(z);
    }

    public boolean performOptionsItemSelected(@x1 MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.O(menuItem);
    }

    public void performOptionsMenuClosed(@x1 Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.P(menu);
    }

    public void performPause() {
        this.mChildFragmentManager.R();
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(mz.b.ON_PAUSE);
        }
        this.mLifecycleRegistry.j(mz.b.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new my(wo1.q("Fragment ", this, " did not call through to super.onPause()"));
        }
    }

    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
        this.mChildFragmentManager.S(z);
    }

    public boolean performPrepareOptionsMenu(@x1 Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z = true;
            onPrepareOptionsMenu(menu);
        }
        return z | this.mChildFragmentManager.T(menu);
    }

    public void performPrimaryNavigationFragmentChanged() {
        boolean W0 = this.mFragmentManager.W0(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != W0) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(W0);
            onPrimaryNavigationFragmentChanged(W0);
            this.mChildFragmentManager.U();
        }
    }

    public void performResume() {
        this.mChildFragmentManager.h1();
        this.mChildFragmentManager.h0(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (this.mCalled) {
            rz rzVar = this.mLifecycleRegistry;
            mz.b bVar = mz.b.ON_RESUME;
            rzVar.j(bVar);
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(bVar);
            }
            this.mChildFragmentManager.V();
            return;
        }
        throw new my(wo1.q("Fragment ", this, " did not call through to super.onResume()"));
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.e(bundle);
        Parcelable H1 = this.mChildFragmentManager.H1();
        if (H1 != null) {
            bundle.putParcelable(hx.K, H1);
        }
    }

    public void performStart() {
        this.mChildFragmentManager.h1();
        this.mChildFragmentManager.h0(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (this.mCalled) {
            rz rzVar = this.mLifecycleRegistry;
            mz.b bVar = mz.b.ON_START;
            rzVar.j(bVar);
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(bVar);
            }
            this.mChildFragmentManager.W();
            return;
        }
        throw new my(wo1.q("Fragment ", this, " did not call through to super.onStart()"));
    }

    public void performStop() {
        this.mChildFragmentManager.Y();
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(mz.b.ON_STOP);
        }
        this.mLifecycleRegistry.j(mz.b.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new my(wo1.q("Fragment ", this, " did not call through to super.onStop()"));
        }
    }

    public void performViewCreated() {
        onViewCreated(this.mView, this.mSavedFragmentState);
        this.mChildFragmentManager.Z();
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().w = true;
    }

    @Override // com.p7700g.p99005.f0
    @x1
    @u1
    public final <I, O> g0<I> registerForActivityResult(@x1 j0<I, O> j0Var, @x1 e0<O> e0Var) {
        return prepareCallInternal(j0Var, new e(), e0Var);
    }

    public void registerForContextMenu(@x1 View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(@x1 String[] strArr, int i2) {
        if (this.mHost != null) {
            getParentFragmentManager().Z0(this, strArr, i2);
            return;
        }
        throw new IllegalStateException(wo1.q("Fragment ", this, " not attached to Activity"));
    }

    @x1
    public final hx requireActivity() {
        hx activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException(wo1.q("Fragment ", this, " not attached to an activity."));
    }

    @x1
    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException(wo1.q("Fragment ", this, " does not have any arguments."));
    }

    @x1
    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException(wo1.q("Fragment ", this, " not attached to a context."));
    }

    @x1
    @Deprecated
    public final FragmentManager requireFragmentManager() {
        return getParentFragmentManager();
    }

    @x1
    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException(wo1.q("Fragment ", this, " not attached to a host."));
    }

    @x1
    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            if (getContext() == null) {
                throw new IllegalStateException(wo1.q("Fragment ", this, " is not attached to any Fragment or host"));
            }
            throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
        }
        return parentFragment;
    }

    @x1
    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(wo1.q("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public void restoreChildFragmentState(@z1 Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable(hx.K)) == null) {
            return;
        }
        this.mChildFragmentManager.E1(parcelable);
        this.mChildFragmentManager.H();
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.e(this.mSavedViewRegistryState);
            this.mSavedViewRegistryState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (this.mCalled) {
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(mz.b.ON_CREATE);
                return;
            }
            return;
        }
        throw new my(wo1.q("Fragment ", this, " did not call through to super.onViewStateRestored()"));
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        ensureAnimationInfo().r = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        ensureAnimationInfo().q = Boolean.valueOf(z);
    }

    public void setAnimatingAway(View view) {
        ensureAnimationInfo().a = view;
    }

    public void setAnimations(int i2, int i3, int i4, int i5) {
        if (this.mAnimationInfo == null && i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) {
            return;
        }
        ensureAnimationInfo().d = i2;
        ensureAnimationInfo().e = i3;
        ensureAnimationInfo().f = i4;
        ensureAnimationInfo().g = i5;
    }

    public void setAnimator(Animator animator) {
        ensureAnimationInfo().b = animator;
    }

    public void setArguments(@z1 Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(@z1 yg ygVar) {
        ensureAnimationInfo().s = ygVar;
    }

    public void setEnterTransition(@z1 Object obj) {
        ensureAnimationInfo().k = obj;
    }

    public void setExitSharedElementCallback(@z1 yg ygVar) {
        ensureAnimationInfo().t = ygVar;
    }

    public void setExitTransition(@z1 Object obj) {
        ensureAnimationInfo().m = obj;
    }

    public void setFocusedView(View view) {
        ensureAnimationInfo().v = view;
    }

    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.mHost.u();
        }
    }

    public void setHideReplaced(boolean z) {
        ensureAnimationInfo().y = z;
    }

    public void setInitialSavedState(@z1 m mVar) {
        if (this.mFragmentManager == null) {
            this.mSavedFragmentState = (mVar == null || (r2 = mVar.s) == null) ? null : null;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.u();
            }
        }
    }

    public void setNextTransition(int i2) {
        if (this.mAnimationInfo == null && i2 == 0) {
            return;
        }
        ensureAnimationInfo();
        this.mAnimationInfo.h = i2;
    }

    public void setOnStartEnterTransitionListener(l lVar) {
        ensureAnimationInfo();
        i iVar = this.mAnimationInfo;
        l lVar2 = iVar.x;
        if (lVar == lVar2) {
            return;
        }
        if (lVar != null && lVar2 != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
        if (iVar.w) {
            iVar.x = lVar;
        }
        if (lVar != null) {
            lVar.a();
        }
    }

    public void setPopDirection(boolean z) {
        if (this.mAnimationInfo == null) {
            return;
        }
        ensureAnimationInfo().c = z;
    }

    public void setPostOnViewCreatedAlpha(float f2) {
        ensureAnimationInfo().u = f2;
    }

    public void setReenterTransition(@z1 Object obj) {
        ensureAnimationInfo().n = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z) {
        this.mRetainInstance = z;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z) {
            fragmentManager.n(this);
        } else {
            fragmentManager.B1(this);
        }
    }

    public void setReturnTransition(@z1 Object obj) {
        ensureAnimationInfo().l = obj;
    }

    public void setSharedElementEnterTransition(@z1 Object obj) {
        ensureAnimationInfo().o = obj;
    }

    public void setSharedElementNames(@z1 ArrayList<String> arrayList, @z1 ArrayList<String> arrayList2) {
        ensureAnimationInfo();
        i iVar = this.mAnimationInfo;
        iVar.i = arrayList;
        iVar.j = arrayList2;
    }

    public void setSharedElementReturnTransition(@z1 Object obj) {
        ensureAnimationInfo().p = obj;
    }

    @Deprecated
    public void setTargetFragment(@z1 Fragment fragment, int i2) {
        FragmentManager fragmentManager = this.mFragmentManager;
        FragmentManager fragmentManager2 = fragment != null ? fragment.mFragmentManager : null;
        if (fragmentManager != null && fragmentManager2 != null && fragmentManager != fragmentManager2) {
            throw new IllegalArgumentException(wo1.q("Fragment ", fragment, " must share the same FragmentManager to be set as a target fragment"));
        }
        for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.getTargetFragment()) {
            if (fragment2.equals(this)) {
                throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (fragment == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager != null && fragment.mFragmentManager != null) {
            this.mTargetWho = fragment.mWho;
            this.mTarget = null;
        } else {
            this.mTargetWho = null;
            this.mTarget = fragment;
        }
        this.mTargetRequestCode = i2;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
        if (!this.mUserVisibleHint && z && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            FragmentManager fragmentManager = this.mFragmentManager;
            fragmentManager.k1(fragmentManager.A(this));
        }
        this.mUserVisibleHint = z;
        this.mDeferStart = this.mState < 5 && !z;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public boolean shouldShowRequestPermissionRationale(@x1 String str) {
        mx<?> mxVar = this.mHost;
        if (mxVar != null) {
            return mxVar.q(str);
        }
        return false;
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2) {
        startActivityForResult(intent, i2, null);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, @z1 Intent intent, int i3, int i4, int i5, @z1 Bundle bundle) throws IntentSender.SendIntentException {
        if (this.mHost != null) {
            if (FragmentManager.T0(2)) {
                String str = "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i2 + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle;
            }
            getParentFragmentManager().b1(this, intentSender, i2, intent, i3, i4, i5, bundle);
            return;
        }
        throw new IllegalStateException(wo1.q("Fragment ", this, " not attached to Activity"));
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !ensureAnimationInfo().w) {
            return;
        }
        if (this.mHost == null) {
            ensureAnimationInfo().w = false;
        } else if (Looper.myLooper() != this.mHost.h().getLooper()) {
            this.mHost.h().postAtFrontOfQueue(new b());
        } else {
            callStartTransitionListener(true);
        }
    }

    @x1
    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        return sb.toString();
    }

    public void unregisterForContextMenu(@x1 View view) {
        view.setOnCreateContextMenuListener(null);
    }

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    /* loaded from: classes.dex */
    public static class m implements Parcelable {
        @x1
        public static final Parcelable.Creator<m> CREATOR = new a();
        public final Bundle s;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<m> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public m createFromParcel(Parcel parcel) {
                return new m(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public m createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new m(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public m[] newArray(int i) {
                return new m[i];
            }
        }

        public m(Bundle bundle) {
            this.s = bundle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@x1 Parcel parcel, int i) {
            parcel.writeBundle(this.s);
        }

        public m(@x1 Parcel parcel, @z1 ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.s = readBundle;
            if (classLoader == null || readBundle == null) {
                return;
            }
            readBundle.setClassLoader(classLoader);
        }
    }

    @x1
    @Deprecated
    public static Fragment instantiate(@x1 Context context, @x1 String str, @z1 Bundle bundle) {
        try {
            Fragment newInstance = lx.d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(newInstance.getClass().getClassLoader());
                newInstance.setArguments(bundle);
            }
            return newInstance;
        } catch (IllegalAccessException e2) {
            throw new j(wo1.u("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (InstantiationException e3) {
            throw new j(wo1.u("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e3);
        } catch (NoSuchMethodException e4) {
            throw new j(wo1.u("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e4);
        } catch (InvocationTargetException e5) {
            throw new j(wo1.u("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e5);
        }
    }

    @x1
    public final String getString(@l2 int i2, @z1 Object... objArr) {
        return getResources().getString(i2, objArr);
    }

    public final void postponeEnterTransition(long j2, @x1 TimeUnit timeUnit) {
        Handler handler;
        ensureAnimationInfo().w = true;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            handler = fragmentManager.H0().h();
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.removeCallbacks(this.mPostponedDurationRunnable);
        handler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j2));
    }

    @Override // com.p7700g.p99005.f0
    @x1
    @u1
    public final <I, O> g0<I> registerForActivityResult(@x1 j0<I, O> j0Var, @x1 ActivityResultRegistry activityResultRegistry, @x1 e0<O> e0Var) {
        return prepareCallInternal(j0Var, new f(activityResultRegistry), e0Var);
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent, @z1 Bundle bundle) {
        mx<?> mxVar = this.mHost;
        if (mxVar != null) {
            mxVar.s(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException(wo1.q("Fragment ", this, " not attached to Activity"));
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2, @z1 Bundle bundle) {
        if (this.mHost != null) {
            getParentFragmentManager().a1(this, intent, i2, bundle);
            return;
        }
        throw new IllegalStateException(wo1.q("Fragment ", this, " not attached to Activity"));
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @x1
    @Deprecated
    public LayoutInflater getLayoutInflater(@z1 Bundle bundle) {
        mx<?> mxVar = this.mHost;
        if (mxVar != null) {
            LayoutInflater k2 = mxVar.k();
            qq.d(k2, this.mChildFragmentManager.I0());
            return k2;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @t0
    @u1
    @Deprecated
    public void onAttach(@x1 Activity activity) {
        this.mCalled = true;
    }

    @q2
    @t0
    @Deprecated
    public void onInflate(@x1 Activity activity, @x1 AttributeSet attributeSet, @z1 Bundle bundle) {
        this.mCalled = true;
    }

    private void restoreViewState() {
        if (FragmentManager.T0(3)) {
            String str = "moveto RESTORE_VIEW_STATE: " + this;
        }
        if (this.mView != null) {
            restoreViewState(this.mSavedFragmentState);
        }
        this.mSavedFragmentState = null;
    }

    @z0
    public Fragment(@s1 int i2) {
        this();
        this.mContentLayoutId = i2;
    }
}