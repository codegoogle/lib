package com.smarteist.autoimageslider;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import com.p7700g.p99005.aq3;
import com.p7700g.p99005.as3;
import com.p7700g.p99005.bq3;
import com.p7700g.p99005.bs3;
import com.p7700g.p99005.cs3;
import com.p7700g.p99005.ds3;
import com.p7700g.p99005.eq3;
import com.p7700g.p99005.es3;
import com.p7700g.p99005.fs3;
import com.p7700g.p99005.gr3;
import com.p7700g.p99005.gs3;
import com.p7700g.p99005.hs3;
import com.p7700g.p99005.ir3;
import com.p7700g.p99005.is3;
import com.p7700g.p99005.jr3;
import com.p7700g.p99005.kr3;
import com.p7700g.p99005.lr3;
import com.p7700g.p99005.mp3;
import com.p7700g.p99005.mq3;
import com.p7700g.p99005.mr3;
import com.p7700g.p99005.nq3;
import com.p7700g.p99005.nr3;
import com.p7700g.p99005.or3;
import com.p7700g.p99005.pr3;
import com.p7700g.p99005.qq3;
import com.p7700g.p99005.qr3;
import com.p7700g.p99005.ra0;
import com.p7700g.p99005.rr3;
import com.p7700g.p99005.sq3;
import com.p7700g.p99005.sr;
import com.p7700g.p99005.sr3;
import com.p7700g.p99005.tr3;
import com.p7700g.p99005.ur3;
import com.p7700g.p99005.vr3;
import com.p7700g.p99005.wr3;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.xr3;
import com.p7700g.p99005.yr3;
import com.p7700g.p99005.zr3;
import java.util.Objects;

/* loaded from: classes3.dex */
public class SliderView extends FrameLayout implements Runnable, View.OnTouchListener, mr3.a, lr3.j {
    public static final int s = 0;
    public static final int t = 1;
    public static final int u = 2;
    public static final String v = "Slider View : ";
    private int A;
    private mp3 B;
    private mr3 C;
    private lr3 D;
    private ir3 E;
    private c F;
    private boolean G;
    private boolean H;
    private int I;
    private final Handler w;
    private boolean x;
    private boolean y;
    private int z;

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SliderView.this.n();
        }
    }

    /* loaded from: classes3.dex */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            kr3.values();
            int[] iArr = new int[22];
            a = iArr;
            try {
                iArr[kr3.ANTICLOCKSPINTRANSFORMATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[kr3.CLOCK_SPINTRANSFORMATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[kr3.CUBEINDEPTHTRANSFORMATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[kr3.CUBEINROTATIONTRANSFORMATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[kr3.CUBEINSCALINGTRANSFORMATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[kr3.CUBEOUTDEPTHTRANSFORMATION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[kr3.CUBEOUTROTATIONTRANSFORMATION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[kr3.CUBEOUTSCALINGTRANSFORMATION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[kr3.DEPTHTRANSFORMATION.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[kr3.FADETRANSFORMATION.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[kr3.FANTRANSFORMATION.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[kr3.FIDGETSPINTRANSFORMATION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[kr3.GATETRANSFORMATION.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[kr3.HINGETRANSFORMATION.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[kr3.HORIZONTALFLIPTRANSFORMATION.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[kr3.POPTRANSFORMATION.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[kr3.SPINNERTRANSFORMATION.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[kr3.TOSSTRANSFORMATION.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                a[kr3.VERTICALFLIPTRANSFORMATION.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[kr3.VERTICALSHUTTRANSFORMATION.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                a[kr3.ZOOMOUTTRANSFORMATION.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface c {
        void a(int i);
    }

    public SliderView(Context context) {
        super(context);
        this.w = new Handler();
        this.G = true;
        this.H = true;
        this.I = -1;
        setupSlideView(context);
    }

    private void e() {
        if (this.B == null) {
            this.B = new mp3(getContext());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 81;
            layoutParams.setMargins(20, 20, 20, 20);
            addView(this.B, 1, layoutParams);
        }
        this.B.setViewPager(this.D);
        this.B.setDynamicCount(true);
    }

    private int getAdapterItemsCount() {
        try {
            return getSliderAdapter().e();
        } catch (NullPointerException unused) {
            return 0;
        }
    }

    private void k(@x1 Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jr3.m.I6, 0, 0);
        boolean z = obtainStyledAttributes.getBoolean(jr3.m.N6, true);
        int i = obtainStyledAttributes.getInt(jr3.m.J6, 250);
        int i2 = obtainStyledAttributes.getInt(jr3.m.a7, 2);
        boolean z2 = obtainStyledAttributes.getBoolean(jr3.m.L6, true);
        boolean z3 = obtainStyledAttributes.getBoolean(jr3.m.b7, false);
        int i3 = obtainStyledAttributes.getInt(jr3.m.K6, 0);
        setSliderAnimationDuration(i);
        setScrollTimeInSec(i2);
        setAutoCycle(z2);
        setAutoCycleDirection(i3);
        setAutoCycle(z3);
        setIndicatorEnabled(z);
        if (this.H) {
            e();
            int i4 = jr3.m.U6;
            qq3 qq3Var = qq3.HORIZONTAL;
            if (obtainStyledAttributes.getInt(i4, qq3Var.ordinal()) != 0) {
                qq3Var = qq3.VERTICAL;
            }
            int dimension = (int) obtainStyledAttributes.getDimension(jr3.m.R6, gr3.a(12));
            int dimension2 = (int) obtainStyledAttributes.getDimension(jr3.m.T6, gr3.a(12));
            int dimension3 = (int) obtainStyledAttributes.getDimension(jr3.m.S6, gr3.a(12));
            int dimension4 = (int) obtainStyledAttributes.getDimension(jr3.m.Q6, gr3.a(12));
            int i5 = obtainStyledAttributes.getInt(jr3.m.O6, 81);
            int color = obtainStyledAttributes.getColor(jr3.m.Z6, Color.parseColor(bq3.e));
            int color2 = obtainStyledAttributes.getColor(jr3.m.Y6, Color.parseColor(bq3.f));
            int i6 = obtainStyledAttributes.getInt(jr3.m.M6, aq3.a);
            sq3 b2 = mq3.b(obtainStyledAttributes.getInt(jr3.m.X6, sq3.Off.ordinal()));
            setIndicatorOrientation(qq3Var);
            setIndicatorRadius((int) obtainStyledAttributes.getDimension(jr3.m.W6, gr3.a(2)));
            setIndicatorPadding((int) obtainStyledAttributes.getDimension(jr3.m.V6, gr3.a(3)));
            setIndicatorMargin((int) obtainStyledAttributes.getDimension(jr3.m.P6, gr3.a(12)));
            g(dimension, dimension2, dimension3, dimension4);
            setIndicatorGravity(i5);
            h(dimension, dimension2, dimension3, dimension4);
            setIndicatorUnselectedColor(color);
            setIndicatorSelectedColor(color2);
            setIndicatorAnimationDuration(i6);
            setIndicatorRtlMode(b2);
        }
        obtainStyledAttributes.recycle();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void setupSlideView(Context context) {
        lr3 lr3Var = new lr3(context);
        this.D = lr3Var;
        lr3Var.setOverScrollMode(1);
        this.D.setId(sr.C());
        addView(this.D, 0, new FrameLayout.LayoutParams(-1, -1));
        this.D.setOnTouchListener(this);
        this.D.d(this);
    }

    @Override // com.p7700g.p99005.lr3.j
    public void a(int i, float f, int i2) {
    }

    @Override // com.p7700g.p99005.lr3.j
    public void b(int i) {
    }

    @Override // com.p7700g.p99005.lr3.j
    public void c(int i) {
        c cVar = this.F;
        if (cVar != null) {
            cVar.a(i);
        }
    }

    @Override // com.p7700g.p99005.mr3.a
    public void d() {
        if (this.G) {
            this.E.l();
            this.D.T(0, false);
        }
    }

    public boolean f() {
        return this.y;
    }

    public void g(int i, int i2, int i3, int i4) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.B.getLayoutParams();
        layoutParams.setMargins(i, i2, i3, i4);
        this.B.setLayoutParams(layoutParams);
    }

    public int getAutoCycleDirection() {
        return this.z;
    }

    public int getCurrentPagePosition() {
        Objects.requireNonNull(getSliderAdapter(), "Adapter not set");
        return getSliderPager().getCurrentItem();
    }

    public int getIndicatorRadius() {
        return this.B.getRadius();
    }

    public int getIndicatorSelectedColor() {
        return this.B.getSelectedColor();
    }

    public int getIndicatorUnselectedColor() {
        return this.B.getUnselectedColor();
    }

    public mp3 getPagerIndicator() {
        return this.B;
    }

    public int getScrollTimeInMillis() {
        return this.A;
    }

    public int getScrollTimeInSec() {
        return this.A / 1000;
    }

    public ra0 getSliderAdapter() {
        return this.C;
    }

    public lr3 getSliderPager() {
        return this.D;
    }

    public void h(int i, int i2, int i3, int i4) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.B.getLayoutParams();
        layoutParams.setMargins(i, i2, i3, i4);
        this.B.setLayoutParams(layoutParams);
    }

    public void i(@x1 mr3 mr3Var, boolean z) {
        this.G = z;
        if (!z) {
            this.C = mr3Var;
            this.D.setAdapter(mr3Var);
            return;
        }
        setSliderAdapter(mr3Var);
    }

    public void j(int i, Interpolator interpolator) {
        this.D.Z(i, interpolator);
    }

    public void l() {
        int currentItem = this.D.getCurrentItem();
        int adapterItemsCount = getAdapterItemsCount();
        if (adapterItemsCount > 1) {
            if (this.z == 2) {
                if (currentItem % (adapterItemsCount - 1) == 0 && this.I != getAdapterItemsCount() - 1 && this.I != 0) {
                    this.x = !this.x;
                }
                if (this.x) {
                    this.D.T(currentItem + 1, true);
                } else {
                    this.D.T(currentItem - 1, true);
                }
            }
            if (this.z == 1) {
                this.D.T(currentItem - 1, true);
            }
            if (this.z == 0) {
                this.D.T(currentItem + 1, true);
            }
        }
        this.I = currentItem;
    }

    public void m() {
        int currentItem = this.D.getCurrentItem();
        int adapterItemsCount = getAdapterItemsCount();
        if (adapterItemsCount > 1) {
            if (this.z == 2) {
                if (currentItem % (adapterItemsCount - 1) == 0 && this.I != getAdapterItemsCount() - 1 && this.I != 0) {
                    this.x = !this.x;
                }
                if (this.x && currentItem < this.I) {
                    this.D.T(currentItem - 1, true);
                } else {
                    this.D.T(currentItem + 1, true);
                }
            }
            if (this.z == 1) {
                this.D.T(currentItem + 1, true);
            }
            if (this.z == 0) {
                this.D.T(currentItem - 1, true);
            }
        }
        this.I = currentItem;
    }

    public void n() {
        this.w.removeCallbacks(this);
        this.w.postDelayed(this, this.A);
    }

    public void o() {
        this.w.removeCallbacks(this);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (f()) {
            if (motionEvent.getAction() == 2) {
                o();
                return false;
            } else if (motionEvent.getAction() == 1) {
                this.w.postDelayed(new a(), 2000L);
                return false;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            l();
        } finally {
            if (this.y) {
                this.w.postDelayed(this, this.A);
            }
        }
    }

    public void setAutoCycle(boolean z) {
        this.y = z;
    }

    public void setAutoCycleDirection(int i) {
        this.z = i;
    }

    public void setCurrentPageListener(c cVar) {
        this.F = cVar;
    }

    public void setCurrentPagePosition(int i) {
        this.D.T(i, true);
    }

    public void setCustomSliderTransformAnimation(lr3.l lVar) {
        this.D.X(false, lVar);
    }

    public void setIndicatorAnimation(eq3 eq3Var) {
        this.B.setAnimationType(eq3Var);
    }

    public void setIndicatorAnimationDuration(long j) {
        this.B.setAnimationDuration(j);
    }

    public void setIndicatorEnabled(boolean z) {
        this.H = z;
        if (this.B == null && z) {
            e();
        }
    }

    public void setIndicatorGravity(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.B.getLayoutParams();
        layoutParams.gravity = i;
        this.B.setLayoutParams(layoutParams);
    }

    public void setIndicatorMargin(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.B.getLayoutParams();
        layoutParams.setMargins(i, i, i, i);
        this.B.setLayoutParams(layoutParams);
    }

    public void setIndicatorOrientation(qq3 qq3Var) {
        this.B.setOrientation(qq3Var);
    }

    public void setIndicatorPadding(int i) {
        this.B.setPadding(i);
    }

    public void setIndicatorRadius(int i) {
        this.B.setRadius(i);
    }

    public void setIndicatorRtlMode(sq3 sq3Var) {
        this.B.setRtlMode(sq3Var);
    }

    public void setIndicatorSelectedColor(int i) {
        this.B.setSelectedColor(i);
    }

    public void setIndicatorUnselectedColor(int i) {
        this.B.setUnselectedColor(i);
    }

    public void setIndicatorVisibility(boolean z) {
        if (z) {
            this.B.setVisibility(0);
        } else {
            this.B.setVisibility(8);
        }
    }

    public void setInfiniteAdapterEnabled(boolean z) {
        mr3 mr3Var = this.C;
        if (mr3Var != null) {
            i(mr3Var, z);
        }
    }

    public void setOffscreenPageLimit(int i) {
        this.D.setOffscreenPageLimit(i);
    }

    public void setOnIndicatorClickListener(nq3.b bVar) {
        this.B.setClickListener(bVar);
    }

    public void setPageIndicatorView(mp3 mp3Var) {
        this.B = mp3Var;
        e();
    }

    public void setScrollTimeInMillis(int i) {
        this.A = i;
    }

    public void setScrollTimeInSec(int i) {
        this.A = i * 1000;
    }

    public void setSliderAdapter(@x1 mr3 mr3Var) {
        this.C = mr3Var;
        ir3 ir3Var = new ir3(mr3Var);
        this.E = ir3Var;
        this.D.setAdapter(ir3Var);
        this.C.v(this);
        setCurrentPagePosition(0);
    }

    public void setSliderAnimationDuration(int i) {
        this.D.setScrollDuration(i);
    }

    public void setSliderTransformAnimation(kr3 kr3Var) {
        switch (kr3Var.ordinal()) {
            case 0:
                this.D.X(false, new nr3());
                return;
            case 1:
                this.D.X(false, new or3());
                return;
            case 2:
                this.D.X(false, new pr3());
                return;
            case 3:
                this.D.X(false, new qr3());
                return;
            case 4:
                this.D.X(false, new rr3());
                return;
            case 5:
                this.D.X(false, new sr3());
                return;
            case 6:
                this.D.X(false, new tr3());
                return;
            case 7:
                this.D.X(false, new ur3());
                return;
            case 8:
                this.D.X(false, new vr3());
                return;
            case 9:
                this.D.X(false, new wr3());
                return;
            case 10:
                this.D.X(false, new xr3());
                return;
            case 11:
                this.D.X(false, new yr3());
                return;
            case 12:
                this.D.X(false, new zr3());
                return;
            case 13:
                this.D.X(false, new as3());
                return;
            case 14:
                this.D.X(false, new bs3());
                return;
            case 15:
                this.D.X(false, new cs3());
                return;
            case 16:
            default:
                this.D.X(false, new ds3());
                return;
            case 17:
                this.D.X(false, new es3());
                return;
            case 18:
                this.D.X(false, new fs3());
                return;
            case 19:
                this.D.X(false, new gs3());
                return;
            case 20:
                this.D.X(false, new hs3());
                return;
            case 21:
                this.D.X(false, new is3());
                return;
        }
    }

    public SliderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.w = new Handler();
        this.G = true;
        this.H = true;
        this.I = -1;
        setupSlideView(context);
        k(context, attributeSet);
    }

    public SliderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.w = new Handler();
        this.G = true;
        this.H = true;
        this.I = -1;
        setupSlideView(context);
        k(context, attributeSet);
    }
}