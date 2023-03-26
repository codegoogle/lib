package com.greedygame.core.adview.general;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.greedygame.core.adview.core.GGAdViewImpl;
import com.greedygame.core.adview.general.GGAdview;
import com.p7700g.p99005.ac3;
import com.p7700g.p99005.b03;
import com.p7700g.p99005.c25;
import com.p7700g.p99005.f03;
import com.p7700g.p99005.ia3;
import com.p7700g.p99005.k03;
import com.p7700g.p99005.my2;
import com.p7700g.p99005.mz;
import com.p7700g.p99005.n03;
import com.p7700g.p99005.nt;
import com.p7700g.p99005.o03;
import com.p7700g.p99005.o33;
import com.p7700g.p99005.pg1;
import com.p7700g.p99005.pz;
import com.p7700g.p99005.q0;
import com.p7700g.p99005.qz;
import com.p7700g.p99005.r13;
import com.p7700g.p99005.s03;
import com.p7700g.p99005.sc3;
import com.p7700g.p99005.sr;
import com.p7700g.p99005.u13;
import com.p7700g.p99005.v03;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.xz2;
import com.p7700g.p99005.zc3;
import com.p7700g.p99005.zz;
import java.lang.ref.WeakReference;
import java.util.Observable;
import java.util.Observer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class GGAdview extends FrameLayout implements pz, f03, Observer {
    @NotNull
    public static final a s = new a(null);
    @NotNull
    private static final String t = "GGAdView";
    private boolean A;
    private final int B;
    private int C;
    private int D;
    @NotNull
    private u13 E;
    @NotNull
    private final s03 u;
    @Nullable
    private AttributeSet v;
    private int w;
    @Nullable
    private v03 x;
    @Nullable
    private WeakReference<mz> y;
    @NotNull
    private n03 z;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a() {
            return GGAdview.t;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements Runnable {
        public final /* synthetic */ Object s;

        public b(Object obj) {
            this.s = obj;
        }

        @Override // java.lang.Runnable
        public final void run() {
            GGAdview gGAdview = (GGAdview) this.s;
            gGAdview.removeAllViews();
            gGAdview.t();
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements Runnable {
        public final /* synthetic */ Object s;
        public final /* synthetic */ GGAdview t;
        public final /* synthetic */ View u;

        public c(Object obj, GGAdview gGAdview, View view) {
            this.s = obj;
            this.t = gGAdview;
            this.u = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            GGAdview gGAdview = (GGAdview) this.s;
            gGAdview.t();
            this.t.removeAllViews();
            my2.d(this.u);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            this.t.addView(this.u, layoutParams);
            gGAdview.H();
            gGAdview.E();
            v03 v03Var = gGAdview.x;
            if (v03Var != null) {
                v03Var.onAdLoaded();
            }
            gGAdview.F();
        }
    }

    /* loaded from: classes3.dex */
    public static final class d implements Runnable {
        public final /* synthetic */ Object s;

        public d(Object obj) {
            this.s = obj;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ((GGAdview) this.s).removeAllViews();
        }
    }

    /* loaded from: classes3.dex */
    public static final class e implements Runnable {
        public final /* synthetic */ Object s;
        public final /* synthetic */ GGAdview t;
        public final /* synthetic */ View u;

        public e(Object obj, GGAdview gGAdview, View view) {
            this.s = obj;
            this.t = gGAdview;
            this.u = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            GGAdview gGAdview = (GGAdview) this.s;
            this.t.removeAllViews();
            this.t.addView(this.u);
            gGAdview.H();
            gGAdview.E();
            v03 v03Var = gGAdview.x;
            if (v03Var != null) {
                v03Var.onAdLoaded();
            }
            gGAdview.F();
        }
    }

    /* loaded from: classes3.dex */
    public static final class f implements Runnable {
        public final /* synthetic */ Object s;
        public final /* synthetic */ GGAdview t;
        public final /* synthetic */ o33 u;

        public f(Object obj, GGAdview gGAdview, o33 o33Var) {
            this.s = obj;
            this.t = gGAdview;
            this.u = o33Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            GGAdview gGAdview = (GGAdview) this.s;
            gGAdview.t();
            this.t.removeAllViews();
            my2.d(this.u);
            FrameLayout.LayoutParams viewLayoutParams = this.u.getViewLayoutParams();
            if (viewLayoutParams == null) {
                viewLayoutParams = new FrameLayout.LayoutParams(-2, -2);
                viewLayoutParams.gravity = 17;
            }
            this.t.addView(this.u, viewLayoutParams);
            gGAdview.H();
            gGAdview.E();
            v03 v03Var = gGAdview.x;
            if (v03Var != null) {
                v03Var.onAdLoaded();
            }
            gGAdview.F();
        }
    }

    /* loaded from: classes3.dex */
    public static final class g implements Runnable {
        public final /* synthetic */ Object s;

        public g(Object obj) {
            this.s = obj;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ((GGAdview) this.s).removeAllViews();
        }
    }

    /* loaded from: classes3.dex */
    public static final class h implements Runnable {
        public final /* synthetic */ Object s;

        public h(Object obj) {
            this.s = obj;
        }

        @Override // java.lang.Runnable
        public final void run() {
            GGAdview gGAdview = (GGAdview) this.s;
            gGAdview.removeAllViews();
            v03 v03Var = gGAdview.x;
            if (v03Var == null) {
                return;
            }
            v03Var.a(r13.VIEW_PREP_FAILED);
        }
    }

    /* loaded from: classes3.dex */
    public static final class i implements Runnable {
        public final /* synthetic */ Object s;
        public final /* synthetic */ GGAdview t;
        public final /* synthetic */ o03 u;

        public i(Object obj, GGAdview gGAdview, o03 o03Var) {
            this.s = obj;
            this.t = gGAdview;
            this.u = o03Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            GGAdview gGAdview = (GGAdview) this.s;
            gGAdview.t();
            this.t.removeAllViews();
            my2.d(this.u);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.u.getLayoutParams().width, this.u.getLayoutParams().height);
            layoutParams.gravity = 17;
            this.t.addView(this.u, layoutParams);
            gGAdview.H();
            gGAdview.E();
            v03 v03Var = gGAdview.x;
            if (v03Var != null) {
                v03Var.onAdLoaded();
            }
            gGAdview.F();
        }
    }

    /* loaded from: classes3.dex */
    public static final class j implements Runnable {
        public final /* synthetic */ Object s;

        public j(Object obj) {
            this.s = obj;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ((GGAdview) this.s).removeAllViews();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GGAdview(@NotNull Context context) {
        super(context);
        c25.p(context, "context");
        this.u = new GGAdViewImpl(false, 1, null);
        this.z = new n03(null, k03.NATIVE_OR_BANNER, 1, null);
        this.B = -1;
        this.C = -1;
        this.D = -1;
        this.E = u13.AUTO;
        w();
    }

    public static /* synthetic */ void A(GGAdview gGAdview) {
        m0setListeners$lambda5(gGAdview);
    }

    private final void C() {
        v(this);
    }

    private final void D() {
        this.v = null;
        this.x = null;
        if (c25.g(Looper.myLooper(), Looper.getMainLooper())) {
            removeAllViews();
        } else {
            new Handler(Looper.getMainLooper()).post(new d(this));
        }
    }

    public final void E() {
        this.u.o();
    }

    public final void F() {
        setVisibility(0);
    }

    private final TextView G() {
        TextView textView = new TextView(getContext());
        textView.setText(getUnitId());
        textView.setBackgroundColor(sr.t);
        textView.setTextColor(-1);
        textView.setTextSize(1, 10.0f);
        return textView;
    }

    public final void H() {
        if (this.u.m()) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 8388693;
            addView(G(), layoutParams);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 8388691;
            addView(I(), layoutParams2);
        }
    }

    private final TextView I() {
        TextView textView = new TextView(getContext());
        textView.setText(this.u.n());
        textView.setBackgroundColor(sr.t);
        textView.setTextColor(-1);
        textView.setTextSize(1, 10.0f);
        return textView;
    }

    private final void J() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        c25.C("Resolving adview size. Layout param width ", layoutParams == null ? pg1.d : Integer.valueOf(layoutParams.width));
        if (getParent() != null && getLayoutParams() != null && getLayoutParams().width < 0) {
            s03 s03Var = this.u;
            ViewParent parent = getParent();
            View view = parent instanceof View ? (View) parent : null;
            int width = view == null ? 0 : view.getWidth();
            ViewParent parent2 = getParent();
            View view2 = parent2 instanceof View ? (View) parent2 : null;
            s03Var.a(width, view2 != null ? Integer.valueOf(view2.getHeight()).intValue() : 0);
        } else {
            this.u.a(getWidth(), getHeight());
        }
        s03 s03Var2 = this.u;
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        c25.o(layoutParams2, "layoutParams");
        s03Var2.v(layoutParams2);
    }

    private final void K() {
        mz mzVar;
        this.u.B(this);
        setOnClickListener(new View.OnClickListener() { // from class: com.p7700g.p99005.t03
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GGAdview.z(GGAdview.this, view);
            }
        });
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.p7700g.p99005.u03
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                GGAdview.A(GGAdview.this);
            }
        });
        try {
            Context context = getContext();
            mz mzVar2 = null;
            qz qzVar = context instanceof qz ? (qz) context : null;
            if (qzVar != null) {
                mzVar2 = qzVar.getLifecycle();
            }
            if (mzVar2 == null) {
                String str = t;
                xz2.c(str, "AdView for unit " + this.z.c() + " is not lifecycle aware");
                return;
            }
            this.y = new WeakReference<>(mzVar2);
            String str2 = t;
            xz2.c(str2, "AdView for unit " + this.z.c() + " is lifecycle aware");
            WeakReference<mz> weakReference = this.y;
            if (weakReference != null && (mzVar = weakReference.get()) != null) {
                mzVar.a(this);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static final void L(GGAdview gGAdview, View view) {
        c25.p(gGAdview, "this$0");
        c25.C("View Clicked for Unit ", gGAdview.z.c());
        gGAdview.u.A();
    }

    private final void M() {
        if (xz2.e) {
            TextView textView = new TextView(getContext());
            textView.setText("SDKX Version -{0.0.94- 3042}");
            nt.r(textView, 10, 20, 1, 1);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.bottomMargin = (int) TypedValue.applyDimension(1, 5.0f, getContext().getResources().getDisplayMetrics());
            layoutParams.setMarginEnd((int) TypedValue.applyDimension(1, 5.0f, getContext().getResources().getDisplayMetrics()));
            layoutParams.gravity = 8388693;
            addView(textView, layoutParams);
        }
    }

    private final ia3 getMCurrentAd() {
        return this.u.g();
    }

    /* renamed from: setListeners$lambda-5 */
    public static final void m0setListeners$lambda5(GGAdview gGAdview) {
        c25.p(gGAdview, "this$0");
        String str = t;
        xz2.c(str, gGAdview.z.c() + " size: " + gGAdview.getHeight() + " X " + gGAdview.getWidth());
        gGAdview.u.a(gGAdview.getWidth(), gGAdview.getHeight());
    }

    public final void t() {
        if (getBackground() != null) {
            u(this);
            return;
        }
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null || viewGroup.getBackground() == null) {
            return;
        }
        u(this);
    }

    private static final void u(GGAdview gGAdview) {
        zc3 zc3Var = zc3.a;
        StringBuilder G = wo1.G("Policy Violation - ");
        G.append(gGAdview.getUnitId());
        G.append("- Ad view has background");
        zc3Var.a(G.toString(), "Native and banner adview cannot have background since that violates the Admob Policies.", gGAdview.getUnitId());
    }

    private final void v(f03 f03Var) {
        this.u.s(this, f03Var);
    }

    private final void w() {
        if (c25.g(Looper.myLooper(), Looper.getMainLooper())) {
            removeAllViews();
            t();
        } else {
            new Handler(Looper.getMainLooper()).post(new b(this));
        }
        this.u.a(getContext());
        boolean z = false;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(this.v, b03.n.jc, this.w, 0);
        c25.o(obtainStyledAttributes, "context.obtainStyledAttributes(\n            mAttributeSet, R.styleable.GGAdview, mDefStyleRes, 0\n        )");
        String string = obtainStyledAttributes.getString(b03.n.mc);
        this.C = obtainStyledAttributes.getDimensionPixelSize(b03.n.kc, this.B);
        this.D = obtainStyledAttributes.getDimensionPixelSize(b03.n.lc, this.B);
        obtainStyledAttributes.recycle();
        if ((string == null || string.length() == 0) ? true : true) {
            y();
            return;
        }
        this.z.g(string);
        setContentDescription(string);
        x(this.z);
    }

    private final void y() {
        this.u.a(getContext());
        x(this.z);
    }

    public static /* synthetic */ void z(GGAdview gGAdview, View view) {
        L(gGAdview, view);
    }

    public final void B(@NotNull v03 v03Var) {
        c25.p(v03Var, "adLoadListener");
        this.z.l().h();
        this.x = v03Var;
        if (getUnitId().length() == 0) {
            xz2.d(t, "Please specify a unitId for the view created.");
            v03Var.a(r13.EMPTY_UNIT_ID);
            return;
        }
        this.u.r(v03Var);
    }

    @Override // com.p7700g.p99005.f03
    public void e(@NotNull o03 o03Var) {
        c25.p(o03Var, com.anythink.expressad.a.B);
        if (c25.g(Looper.myLooper(), Looper.getMainLooper())) {
            t();
            removeAllViews();
            my2.d(o03Var);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(o03Var.getLayoutParams().width, o03Var.getLayoutParams().height);
            layoutParams.gravity = 17;
            addView(o03Var, layoutParams);
            H();
            E();
            v03 v03Var = this.x;
            if (v03Var != null) {
                v03Var.onAdLoaded();
            }
            F();
            return;
        }
        new Handler(Looper.getMainLooper()).post(new i(this, this, o03Var));
    }

    @Override // com.p7700g.p99005.f03
    public void f(@NotNull View view) {
        c25.p(view, com.anythink.expressad.a.B);
        if (c25.g(Looper.myLooper(), Looper.getMainLooper())) {
            removeAllViews();
            addView(view);
            H();
            E();
            v03 v03Var = this.x;
            if (v03Var != null) {
                v03Var.onAdLoaded();
            }
            F();
            return;
        }
        new Handler(Looper.getMainLooper()).post(new e(this, this, view));
    }

    public final int getAdsMaxHeight() {
        return this.C;
    }

    public final int getAdsMaxWidth() {
        return this.D;
    }

    @NotNull
    public final u13 getRefreshPolicy() {
        return this.u.k();
    }

    @NotNull
    public final String getUnitId() {
        return this.u.h();
    }

    @Override // com.p7700g.p99005.f03
    public void j(@NotNull View view) {
        c25.p(view, com.anythink.expressad.a.B);
        if (c25.g(Looper.myLooper(), Looper.getMainLooper())) {
            t();
            removeAllViews();
            my2.d(view);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            addView(view, layoutParams);
            H();
            E();
            v03 v03Var = this.x;
            if (v03Var != null) {
                v03Var.onAdLoaded();
            }
            F();
            return;
        }
        new Handler(Looper.getMainLooper()).post(new c(this, this, view));
    }

    @Override // com.p7700g.p99005.f03
    public void k(@NotNull o33 o33Var) {
        c25.p(o33Var, com.anythink.expressad.a.B);
        if (c25.g(Looper.myLooper(), Looper.getMainLooper())) {
            t();
            removeAllViews();
            my2.d(o33Var);
            FrameLayout.LayoutParams viewLayoutParams = o33Var.getViewLayoutParams();
            if (viewLayoutParams == null) {
                viewLayoutParams = new FrameLayout.LayoutParams(-2, -2);
                viewLayoutParams.gravity = 17;
            }
            addView(o33Var, viewLayoutParams);
            H();
            E();
            v03 v03Var = this.x;
            if (v03Var != null) {
                v03Var.onAdLoaded();
            }
            F();
            return;
        }
        new Handler(Looper.getMainLooper()).post(new f(this, this, o33Var));
    }

    @Override // com.p7700g.p99005.f03
    public void l() {
        if (c25.g(Looper.myLooper(), Looper.getMainLooper())) {
            removeAllViews();
            v03 v03Var = this.x;
            if (v03Var == null) {
                return;
            }
            v03Var.a(r13.VIEW_PREP_FAILED);
            return;
        }
        new Handler(Looper.getMainLooper()).post(new h(this));
    }

    public void m() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        xz2.c(t, c25.C("AdView Attached called ", Integer.valueOf(hashCode())));
        this.u.y();
        J();
    }

    @zz(mz.b.ON_CREATE)
    public final void onCreate() {
        this.u.p();
    }

    @zz(mz.b.ON_DESTROY)
    public final void onDestroy() {
        if (!this.A) {
            this.u.s();
        }
        this.u.w();
        this.x = null;
        removeAllViews();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        String str = t;
        StringBuilder G = wo1.G("GG ADView Detached from Window ");
        G.append(hashCode());
        G.append(" isOnPauseCalled? ");
        G.append(this.A);
        xz2.c(str, G.toString());
        String[] strArr = new String[1];
        WeakReference<mz> weakReference = this.y;
        strArr[0] = c25.C("GGAdView LifecycleOwner not null? ", Boolean.valueOf((weakReference == null ? null : weakReference.get()) != null));
        xz2.c(str, strArr);
        WeakReference<mz> weakReference2 = this.y;
        if ((weakReference2 != null ? weakReference2.get() : null) != null) {
            if (!this.A) {
                this.u.v();
            }
            WeakReference<mz> weakReference3 = this.y;
            if (weakReference3 == null) {
                return;
            }
            weakReference3.clear();
            return;
        }
        this.u.v();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        int a2 = ac3.a(50, getResources().getDisplayMetrics());
        int a3 = ac3.a(100, getResources().getDisplayMetrics());
        boolean z = true;
        if (size < a3) {
            i2 = View.MeasureSpec.makeMeasureSpec(a3, 1073741824);
        } else {
            int i4 = this.D;
            if (i4 != this.B) {
                if (a3 <= i4 && i4 < size) {
                    i2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                }
            }
        }
        if (size2 < a2) {
            i3 = View.MeasureSpec.makeMeasureSpec(a2, 1073741824);
        } else {
            int i5 = this.C;
            if (i5 != this.B) {
                if ((a2 > i5 || i5 >= size2) ? false : false) {
                    i3 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
                }
            }
        }
        super.onMeasure(i2, i3);
        this.u.a(View.MeasureSpec.getSize(i2), View.MeasureSpec.getSize(i3));
    }

    @zz(mz.b.ON_PAUSE)
    public final void onPause() {
        this.A = true;
        xz2.c(t, c25.C("AdView onPause called ", Integer.valueOf(hashCode())));
        this.u.s();
    }

    @zz(mz.b.ON_RESUME)
    public final void onResume() {
        this.A = false;
        xz2.c(t, c25.C("AdView onResume called ", Integer.valueOf(hashCode())));
        this.u.q();
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.u.a(i2, i3);
    }

    @zz(mz.b.ON_START)
    public final void onStart() {
        if (getWidth() > 0) {
            this.u.a(getWidth(), getHeight());
        }
        this.u.C();
    }

    @zz(mz.b.ON_STOP)
    public final void onStop() {
        this.u.t();
        if (c25.g(Looper.myLooper(), Looper.getMainLooper())) {
            removeAllViews();
        } else {
            new Handler(Looper.getMainLooper()).post(new g(this));
        }
    }

    @Override // android.view.View
    public void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        String str = t;
        String[] strArr = new String[1];
        StringBuilder G = wo1.G("has Lifecycle? ");
        WeakReference<mz> weakReference = this.y;
        G.append((weakReference == null ? null : weakReference.get()) != null);
        G.append(" Visibility Aggregated ");
        G.append(getVisibility());
        G.append(" isVisible-");
        G.append(z);
        strArr[0] = G.toString();
        xz2.c(str, strArr);
        WeakReference<mz> weakReference2 = this.y;
        if ((weakReference2 != null ? weakReference2.get() : null) != null) {
            return;
        }
        if (!this.u.j()) {
            xz2.c(str, "Rejecting visibility change since there is no ad loaded. ");
        } else {
            this.u.a(z);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.u.a(getWidth(), getHeight());
    }

    public final void setAdsMaxHeight(int i2) {
        this.C = i2;
    }

    public final void setAdsMaxWidth(int i2) {
        this.D = i2;
    }

    public final void setRefreshPolicy(@NotNull u13 u13Var) {
        c25.p(u13Var, "value");
        String str = t;
        StringBuilder G = wo1.G("Changing refresh policy for ");
        G.append(this.z.c());
        G.append(" from ");
        G.append(this.E);
        G.append(" to ");
        G.append(u13Var);
        xz2.c(str, G.toString());
        this.E = u13Var;
        this.u.e(u13Var);
    }

    public final void setUnitId(@NotNull String str) {
        c25.p(str, "value");
        this.u.a(str);
        setContentDescription(str);
    }

    @Override // java.util.Observer
    public void update(@Nullable Observable observable, @Nullable Object obj) {
        if (obj instanceof ia3) {
            C();
        } else if (obj instanceof r13) {
            if (c25.g(Looper.myLooper(), Looper.getMainLooper())) {
                removeAllViews();
            } else {
                new Handler(Looper.getMainLooper()).post(new j(this));
            }
        } else if (obj instanceof sc3) {
            D();
        }
    }

    public final void x(@NotNull n03 n03Var) {
        c25.p(n03Var, "unitConfig");
        K();
        M();
        this.u.f(n03Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GGAdview(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        c25.p(context, "context");
        this.u = new GGAdViewImpl(false, 1, null);
        this.z = new n03(null, k03.NATIVE_OR_BANNER, 1, null);
        this.B = -1;
        this.C = -1;
        this.D = -1;
        this.E = u13.AUTO;
        this.v = attributeSet;
        w();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GGAdview(@NotNull Context context, @Nullable AttributeSet attributeSet, @q0 int i2) {
        super(context, attributeSet, i2);
        c25.p(context, "context");
        this.u = new GGAdViewImpl(false, 1, null);
        this.z = new n03(null, k03.NATIVE_OR_BANNER, 1, null);
        this.B = -1;
        this.C = -1;
        this.D = -1;
        this.E = u13.AUTO;
        this.v = attributeSet;
        this.w = i2;
        w();
    }
}