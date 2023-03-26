package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.p7700g.p99005.ar;
import com.p7700g.p99005.cr;
import com.p7700g.p99005.e1;
import com.p7700g.p99005.e2;
import com.p7700g.p99005.er;
import com.p7700g.p99005.fq;
import com.p7700g.p99005.ft;
import com.p7700g.p99005.gr;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.ir;
import com.p7700g.p99005.ls;
import com.p7700g.p99005.nf;
import com.p7700g.p99005.ns;
import com.p7700g.p99005.pr;
import com.p7700g.p99005.r2;
import com.p7700g.p99005.sr;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.util.ArrayList;
import org.xbill.DNS.WKSRecord;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements gr, cr, pr {
    public static final int s = 250;
    public static final float t = 0.5f;
    private static final String u = "NestedScrollView";
    private static final int v = 250;
    private static final int w = -1;
    private static final a x = new a();
    private static final int[] y = {16843130};
    private final Rect A;
    private OverScroller B;
    @i2({i2.a.LIBRARY})
    @x1
    @r2
    public EdgeEffect C;
    @i2({i2.a.LIBRARY})
    @x1
    @r2
    public EdgeEffect D;
    private int E;
    private boolean F;
    private boolean G;
    private View H;
    private boolean I;
    private VelocityTracker J;
    private boolean K;
    private boolean L;
    private int M;
    private int N;
    private int O;
    private int P;
    private final int[] Q;
    private final int[] R;
    private int S;
    private int T;
    private d U;
    private final ir V;
    private final er W;
    private float u0;
    private c v0;
    private long z;

    /* loaded from: classes.dex */
    public static class a extends fq {
        @Override // com.p7700g.p99005.fq
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            ns.N(accessibilityEvent, nestedScrollView.getScrollX());
            ns.P(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // com.p7700g.p99005.fq
        public void g(View view, ls lsVar) {
            int scrollRange;
            super.g(view, lsVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            lsVar.W0(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            lsVar.F1(true);
            if (nestedScrollView.getScrollY() > 0) {
                lsVar.b(ls.a.o);
                lsVar.b(ls.a.z);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                lsVar.b(ls.a.n);
                lsVar.b(ls.a.B);
            }
        }

        @Override // com.p7700g.p99005.fq
        public boolean j(View view, int i, Bundle bundle) {
            if (super.j(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (nestedScrollView.isEnabled()) {
                int height = nestedScrollView.getHeight();
                Rect rect = new Rect();
                if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                    height = rect.height();
                }
                if (i != 4096) {
                    if (i == 8192 || i == 16908344) {
                        int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                        if (max != nestedScrollView.getScrollY()) {
                            nestedScrollView.S(0, max, true);
                            return true;
                        }
                        return false;
                    } else if (i != 16908346) {
                        return false;
                    }
                }
                int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                if (min != nestedScrollView.getScrollY()) {
                    nestedScrollView.S(0, min, true);
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    @e2(21)
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @e1
        public static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(@x1 NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    /* loaded from: classes.dex */
    public static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new a();
        public int s;

        /* loaded from: classes.dex */
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

        public d(Parcelable parcelable) {
            super(parcelable);
        }

        @x1
        public String toString() {
            StringBuilder G = wo1.G("HorizontalScrollView.SavedState{");
            G.append(Integer.toHexString(System.identityHashCode(this)));
            G.append(" scrollPosition=");
            return wo1.z(G, this.s, "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.s);
        }

        public d(Parcel parcel) {
            super(parcel);
            this.s = parcel.readInt();
        }
    }

    public NestedScrollView(@x1 Context context) {
        this(context, null);
    }

    private static boolean A(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && A((View) parent, view2);
    }

    private boolean B(View view, int i, int i2) {
        view.getDrawingRect(this.A);
        offsetDescendantRectToMyCoords(view, this.A);
        return this.A.bottom + i >= getScrollY() && this.A.top - i <= getScrollY() + i2;
    }

    private void C(int i, int i2, @z1 int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.W.e(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    private void D(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.P) {
            int i = actionIndex == 0 ? 1 : 0;
            this.E = (int) motionEvent.getY(i);
            this.P = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.J;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void G() {
        VelocityTracker velocityTracker = this.J;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.J = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int H(int i, float f) {
        float j;
        int round;
        float width = f / getWidth();
        float height = i / getHeight();
        float f2 = 0.0f;
        if (ft.d(this.C) != 0.0f) {
            j = -ft.j(this.C, -height, width);
            if (ft.d(this.C) == 0.0f) {
                this.C.onRelease();
            }
        } else {
            if (ft.d(this.D) != 0.0f) {
                j = ft.j(this.D, height, 1.0f - width);
                if (ft.d(this.D) == 0.0f) {
                    this.D.onRelease();
                }
            }
            round = Math.round(f2 * getHeight());
            if (round != 0) {
                invalidate();
            }
            return round;
        }
        f2 = j;
        round = Math.round(f2 * getHeight());
        if (round != 0) {
        }
        return round;
    }

    private void I(boolean z) {
        if (z) {
            e(2, 1);
        } else {
            f(1);
        }
        this.T = getScrollY();
        sr.m1(this);
    }

    private boolean J(int i, int i2, int i3) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z = false;
        boolean z2 = i == 33;
        View q = q(z2, i2, i3);
        if (q == null) {
            q = this;
        }
        if (i2 < scrollY || i3 > i4) {
            m(z2 ? i2 - scrollY : i3 - i4);
            z = true;
        }
        if (q != findFocus()) {
            q.requestFocus(i);
        }
        return z;
    }

    private void K(View view) {
        view.getDrawingRect(this.A);
        offsetDescendantRectToMyCoords(view, this.A);
        int l = l(this.A);
        if (l != 0) {
            scrollBy(0, l);
        }
    }

    private boolean L(Rect rect, boolean z) {
        int l = l(rect);
        boolean z2 = l != 0;
        if (z2) {
            if (z) {
                scrollBy(0, l);
            } else {
                M(0, l);
            }
        }
        return z2;
    }

    private void O(int i, int i2, int i3, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.z > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int scrollY = getScrollY();
            OverScroller overScroller = this.B;
            int scrollX = getScrollX();
            overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, i3);
            I(z);
        } else {
            if (!this.B.isFinished()) {
                g();
            }
            scrollBy(i, i2);
        }
        this.z = AnimationUtils.currentAnimationTimeMillis();
    }

    private boolean T(MotionEvent motionEvent) {
        boolean z;
        if (ft.d(this.C) != 0.0f) {
            ft.j(this.C, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        if (ft.d(this.D) != 0.0f) {
            ft.j(this.D, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
            return true;
        }
        return z;
    }

    private void g() {
        this.B.abortAnimation();
        f(1);
    }

    private float getVerticalScrollFactorCompat() {
        if (this.u0 == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.u0 = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.u0;
    }

    private boolean i() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0) {
            return overScrollMode == 1 && getScrollRange() > 0;
        }
        return true;
    }

    private boolean j() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
        }
        return false;
    }

    private static int k(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    private void m(int i) {
        if (i != 0) {
            if (this.L) {
                M(0, i);
            } else {
                scrollBy(0, i);
            }
        }
    }

    private boolean n(int i) {
        if (ft.d(this.C) != 0.0f) {
            this.C.onAbsorb(i);
        } else if (ft.d(this.D) == 0.0f) {
            return false;
        } else {
            this.D.onAbsorb(-i);
        }
        return true;
    }

    private void o() {
        this.I = false;
        G();
        f(0);
        this.C.onRelease();
        this.D.onRelease();
    }

    private View q(boolean z, int i, int i2) {
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = (View) focusables.get(i3);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i < bottom && top < i2) {
                boolean z3 = i < top && bottom < i2;
                if (view == null) {
                    view = view2;
                    z2 = z3;
                } else {
                    boolean z4 = (z && top < view.getTop()) || (!z && bottom > view.getBottom());
                    if (z2) {
                        if (z3) {
                            if (!z4) {
                            }
                            view = view2;
                        }
                    } else if (z3) {
                        view = view2;
                        z2 = true;
                    } else {
                        if (!z4) {
                        }
                        view = view2;
                    }
                }
            }
        }
        return view;
    }

    private boolean t(int i, int i2) {
        if (getChildCount() > 0) {
            int scrollY = getScrollY();
            View childAt = getChildAt(0);
            return i2 >= childAt.getTop() - scrollY && i2 < childAt.getBottom() - scrollY && i >= childAt.getLeft() && i < childAt.getRight();
        }
        return false;
    }

    private void u() {
        VelocityTracker velocityTracker = this.J;
        if (velocityTracker == null) {
            this.J = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void v() {
        this.B = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.M = viewConfiguration.getScaledTouchSlop();
        this.N = viewConfiguration.getScaledMinimumFlingVelocity();
        this.O = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void w() {
        if (this.J == null) {
            this.J = VelocityTracker.obtain();
        }
    }

    private boolean y(View view) {
        return !B(view, 0, getHeight());
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean E(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        boolean z2;
        boolean z3;
        int overScrollMode = getOverScrollMode();
        boolean z4 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z5 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z6 = overScrollMode == 0 || (overScrollMode == 1 && z4);
        boolean z7 = overScrollMode == 0 || (overScrollMode == 1 && z5);
        int i9 = i3 + i;
        int i10 = !z6 ? 0 : i7;
        int i11 = i4 + i2;
        int i12 = !z7 ? 0 : i8;
        int i13 = -i10;
        int i14 = i10 + i5;
        int i15 = -i12;
        int i16 = i12 + i6;
        if (i9 > i14) {
            i9 = i14;
        } else if (i9 >= i13) {
            z2 = false;
            if (i11 <= i16) {
                i11 = i16;
            } else if (i11 >= i15) {
                z3 = false;
                if (z3 && !d(1)) {
                    this.B.springBack(i9, i11, 0, 0, 0, getScrollRange());
                }
                onOverScrolled(i9, i11, z2, z3);
                return !z2 || z3;
            } else {
                i11 = i15;
            }
            z3 = true;
            if (z3) {
                this.B.springBack(i9, i11, 0, 0, 0, getScrollRange());
            }
            onOverScrolled(i9, i11, z2, z3);
            if (z2) {
            }
        } else {
            i9 = i13;
        }
        z2 = true;
        if (i11 <= i16) {
        }
        z3 = true;
        if (z3) {
        }
        onOverScrolled(i9, i11, z2, z3);
        if (z2) {
        }
    }

    public boolean F(int i) {
        boolean z = i == 130;
        int height = getHeight();
        if (z) {
            this.A.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                Rect rect = this.A;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            this.A.top = getScrollY() - height;
            Rect rect2 = this.A;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.A;
        int i2 = rect3.top;
        int i3 = height + i2;
        rect3.bottom = i3;
        return J(i, i2, i3);
    }

    public final void M(int i, int i2) {
        O(i, i2, 250, false);
    }

    public final void N(int i, int i2, int i3) {
        O(i, i2, i3, false);
    }

    public final void P(int i, int i2) {
        R(i, i2, 250, false);
    }

    public final void Q(int i, int i2, int i3) {
        R(i, i2, i3, false);
    }

    public void R(int i, int i2, int i3, boolean z) {
        O(i - getScrollX(), i2 - getScrollY(), i3, z);
    }

    public void S(int i, int i2, boolean z) {
        R(i, i2, 250, z);
    }

    @Override // com.p7700g.p99005.br
    public boolean a(int i, int i2, int i3, int i4, @z1 int[] iArr, int i5) {
        return this.W.g(i, i2, i3, i4, iArr, i5);
    }

    @Override // android.view.ViewGroup
    public void addView(@x1 View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // com.p7700g.p99005.br
    public boolean b(int i, int i2, @z1 int[] iArr, @z1 int[] iArr2, int i3) {
        return this.W.d(i, i2, iArr, iArr2, i3);
    }

    @Override // com.p7700g.p99005.cr
    public void c(int i, int i2, int i3, int i4, @z1 int[] iArr, int i5, @x1 int[] iArr2) {
        this.W.e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    @Override // android.view.View, com.p7700g.p99005.pr
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View, com.p7700g.p99005.pr
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View, com.p7700g.p99005.pr
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.B.isFinished()) {
            return;
        }
        this.B.computeScrollOffset();
        int currY = this.B.getCurrY();
        int i = currY - this.T;
        this.T = currY;
        int[] iArr = this.R;
        boolean z = false;
        iArr[1] = 0;
        b(0, i, iArr, null, 1);
        int i2 = i - this.R[1];
        int scrollRange = getScrollRange();
        if (i2 != 0) {
            int scrollY = getScrollY();
            E(0, i2, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i3 = i2 - scrollY2;
            int[] iArr2 = this.R;
            iArr2[1] = 0;
            c(0, scrollY2, 0, i3, this.Q, 1, iArr2);
            i2 = i3 - this.R[1];
        }
        if (i2 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                z = true;
            }
            if (z) {
                if (i2 < 0) {
                    if (this.C.isFinished()) {
                        this.C.onAbsorb((int) this.B.getCurrVelocity());
                    }
                } else if (this.D.isFinished()) {
                    this.D.onAbsorb((int) this.B.getCurrVelocity());
                }
            }
            g();
        }
        if (!this.B.isFinished()) {
            sr.m1(this);
        } else {
            f(1);
        }
    }

    @Override // android.view.View, com.p7700g.p99005.pr
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View, com.p7700g.p99005.pr
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View, com.p7700g.p99005.pr
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    @Override // com.p7700g.p99005.br
    public boolean d(int i) {
        return this.W.l(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || p(keyEvent);
    }

    @Override // android.view.View, com.p7700g.p99005.dr
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.W.a(f, f2, z);
    }

    @Override // android.view.View, com.p7700g.p99005.dr
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.W.b(f, f2);
    }

    @Override // android.view.View, com.p7700g.p99005.dr
    public boolean dispatchNestedPreScroll(int i, int i2, @z1 int[] iArr, @z1 int[] iArr2) {
        return b(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View, com.p7700g.p99005.dr
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, @z1 int[] iArr) {
        return this.W.f(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public void draw(@x1 Canvas canvas) {
        int i;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i2 = 0;
        if (!this.C.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (b.a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                i = getPaddingLeft() + 0;
            } else {
                i = 0;
            }
            if (b.a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i, min);
            this.C.setSize(width, height);
            if (this.C.draw(canvas)) {
                sr.m1(this);
            }
            canvas.restoreToCount(save);
        }
        if (this.D.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        if (b.a(this)) {
            width2 -= getPaddingRight() + getPaddingLeft();
            i2 = 0 + getPaddingLeft();
        }
        if (b.a(this)) {
            height2 -= getPaddingBottom() + getPaddingTop();
            max -= getPaddingBottom();
        }
        canvas.translate(i2 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        this.D.setSize(width2, height2);
        if (this.D.draw(canvas)) {
            sr.m1(this);
        }
        canvas.restoreToCount(save2);
    }

    @Override // com.p7700g.p99005.br
    public boolean e(int i, int i2) {
        return this.W.s(i, i2);
    }

    @Override // com.p7700g.p99005.br
    public void f(int i) {
        this.W.u(i);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup, com.p7700g.p99005.hr
    public int getNestedScrollAxes() {
        return this.V.a();
    }

    public int getScrollRange() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
        }
        return 0;
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public boolean h(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus != null && B(findNextFocus, maxScrollAmount, getHeight())) {
            findNextFocus.getDrawingRect(this.A);
            offsetDescendantRectToMyCoords(findNextFocus, this.A);
            m(l(this.A));
            findNextFocus.requestFocus(i);
        } else {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m(maxScrollAmount);
        }
        if (findFocus != null && findFocus.isFocused() && y(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
            return true;
        }
        return true;
    }

    @Override // android.view.View, com.p7700g.p99005.dr
    public boolean hasNestedScrollingParent() {
        return d(0);
    }

    @Override // android.view.View, com.p7700g.p99005.dr
    public boolean isNestedScrollingEnabled() {
        return this.W.m();
    }

    public int l(Rect rect) {
        int i;
        int i2;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i3 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i4 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i3 - verticalFadingEdgeLength : i3;
        int i5 = rect.bottom;
        if (i5 > i4 && rect.top > scrollY) {
            if (rect.height() > height) {
                i2 = rect.top - scrollY;
            } else {
                i2 = rect.bottom - i4;
            }
            return Math.min(i2 + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i3);
        } else if (rect.top >= scrollY || i5 >= i4) {
            return 0;
        } else {
            if (rect.height() > height) {
                i = 0 - (i4 - rect.bottom);
            } else {
                i = 0 - (scrollY - rect.top);
            }
            return Math.max(i, -getScrollY());
        }
    }

    @Override // android.view.ViewGroup
    public void measureChild(@x1 View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.G = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public boolean onGenericMotionEvent(@x1 MotionEvent motionEvent) {
        float axisValue;
        boolean z;
        int i = 0;
        if (motionEvent.getAction() == 8 && !this.I) {
            if (ar.l(motionEvent, 2)) {
                axisValue = motionEvent.getAxisValue(9);
            } else {
                axisValue = ar.l(motionEvent, 4194304) ? motionEvent.getAxisValue(26) : 0.0f;
            }
            if (axisValue != 0.0f) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int verticalScrollFactorCompat = scrollY - ((int) (axisValue * getVerticalScrollFactorCompat()));
                if (verticalScrollFactorCompat < 0) {
                    if (i() && !ar.l(motionEvent, 8194)) {
                        ft.j(this.C, (-verticalScrollFactorCompat) / getHeight(), 0.5f);
                        this.C.onRelease();
                        invalidate();
                        z = 1;
                    }
                    z = 0;
                } else if (verticalScrollFactorCompat > scrollRange) {
                    if (i() && !ar.l(motionEvent, 8194)) {
                        ft.j(this.D, (verticalScrollFactorCompat - scrollRange) / getHeight(), 0.5f);
                        this.D.onRelease();
                        invalidate();
                        i = 1;
                    }
                    z = i;
                    i = scrollRange;
                } else {
                    i = verticalScrollFactorCompat;
                    z = 0;
                }
                if (i != scrollY) {
                    super.scrollTo(getScrollX(), i);
                    return true;
                }
                return z;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@x1 MotionEvent motionEvent) {
        int findPointerIndex;
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2 && this.I) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.P;
                    if (i2 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i2)) != -1) {
                        int y2 = (int) motionEvent.getY(findPointerIndex);
                        if (Math.abs(y2 - this.E) > this.M && (2 & getNestedScrollAxes()) == 0) {
                            this.I = true;
                            this.E = y2;
                            w();
                            this.J.addMovement(motionEvent);
                            this.S = 0;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        D(motionEvent);
                    }
                }
            }
            this.I = false;
            this.P = -1;
            G();
            if (this.B.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                sr.m1(this);
            }
            f(0);
        } else {
            int y3 = (int) motionEvent.getY();
            if (!t((int) motionEvent.getX(), y3)) {
                if (!T(motionEvent) && this.B.isFinished()) {
                    z = false;
                }
                this.I = z;
                G();
            } else {
                this.E = y3;
                this.P = motionEvent.getPointerId(0);
                u();
                this.J.addMovement(motionEvent);
                this.B.computeScrollOffset();
                if (!T(motionEvent) && this.B.isFinished()) {
                    z = false;
                }
                this.I = z;
                e(2, 0);
            }
        }
        return this.I;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.F = false;
        View view = this.H;
        if (view != null && A(view, this)) {
            K(this.H);
        }
        this.H = null;
        if (!this.G) {
            if (this.U != null) {
                scrollTo(getScrollX(), this.U.s);
                this.U = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int k = k(scrollY, paddingTop, i5);
            if (k != scrollY) {
                scrollTo(getScrollX(), k);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.G = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.K && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, com.p7700g.p99005.hr
    public boolean onNestedFling(@x1 View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        r((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, com.p7700g.p99005.hr
    public boolean onNestedPreFling(@x1 View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // com.p7700g.p99005.fr
    public void onNestedPreScroll(@x1 View view, int i, int i2, @x1 int[] iArr, int i3) {
        b(i, i2, iArr, null, i3);
    }

    @Override // com.p7700g.p99005.gr
    public void onNestedScroll(@x1 View view, int i, int i2, int i3, int i4, int i5, @x1 int[] iArr) {
        C(i4, i5, iArr);
    }

    @Override // com.p7700g.p99005.fr
    public void onNestedScrollAccepted(@x1 View view, @x1 View view2, int i, int i2) {
        this.V.c(view, view2, i, i2);
        e(2, i2);
    }

    @Override // android.view.View
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        View findNextFocusFromRect;
        if (i == 2) {
            i = WKSRecord.Service.CISCO_FNA;
        } else if (i == 1) {
            i = 33;
        }
        if (rect == null) {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocus(this, null, i);
        } else {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        }
        if (findNextFocusFromRect == null || y(findNextFocusFromRect)) {
            return false;
        }
        return findNextFocusFromRect.requestFocus(i, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        this.U = dVar;
        requestLayout();
    }

    @Override // android.view.View
    @x1
    public Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.s = getScrollY();
        return dVar;
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        c cVar = this.v0;
        if (cVar != null) {
            cVar.a(this, i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !B(findFocus, 0, i4)) {
            return;
        }
        findFocus.getDrawingRect(this.A);
        offsetDescendantRectToMyCoords(findFocus, this.A);
        m(l(this.A));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, com.p7700g.p99005.hr
    public boolean onStartNestedScroll(@x1 View view, @x1 View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    @Override // com.p7700g.p99005.fr
    public boolean onStartNestedScroll(@x1 View view, @x1 View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // com.p7700g.p99005.fr
    public void onStopNestedScroll(@x1 View view, int i) {
        this.V.e(view, i);
        f(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x01bb  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(@x1 MotionEvent motionEvent) {
        ViewParent parent;
        w();
        int actionMasked = motionEvent.getActionMasked();
        boolean z = false;
        if (actionMasked == 0) {
            this.S = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(0.0f, this.S);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.J;
                velocityTracker.computeCurrentVelocity(1000, this.O);
                int yVelocity = (int) velocityTracker.getYVelocity(this.P);
                if (Math.abs(yVelocity) >= this.N) {
                    if (!n(yVelocity)) {
                        int i = -yVelocity;
                        float f = i;
                        if (!dispatchNestedPreFling(0.0f, f)) {
                            dispatchNestedFling(0.0f, f, true);
                            r(i);
                        }
                    }
                } else if (this.B.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    sr.m1(this);
                }
                this.P = -1;
                o();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.P);
                if (findPointerIndex != -1) {
                    int y2 = (int) motionEvent.getY(findPointerIndex);
                    int i2 = this.E - y2;
                    int H = i2 - H(i2, motionEvent.getX(findPointerIndex));
                    if (!this.I && Math.abs(H) > this.M) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.I = true;
                        H = H > 0 ? H - this.M : H + this.M;
                    }
                    int i3 = H;
                    if (this.I) {
                        if (b(0, i3, this.R, this.Q, 0)) {
                            i3 -= this.R[1];
                            this.S += this.Q[1];
                        }
                        int i4 = i3;
                        this.E = y2 - this.Q[1];
                        int scrollY = getScrollY();
                        int scrollRange = getScrollRange();
                        int overScrollMode = getOverScrollMode();
                        boolean z2 = overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0);
                        boolean z3 = E(0, i4, 0, getScrollY(), 0, scrollRange, 0, 0, true) && !d(0);
                        int scrollY2 = getScrollY() - scrollY;
                        int[] iArr = this.R;
                        iArr[1] = 0;
                        c(0, scrollY2, 0, i4 - scrollY2, this.Q, 0, iArr);
                        int i5 = this.E;
                        int[] iArr2 = this.Q;
                        this.E = i5 - iArr2[1];
                        this.S += iArr2[1];
                        if (z2) {
                            int i6 = i4 - this.R[1];
                            int i7 = scrollY + i6;
                            if (i7 < 0) {
                                ft.j(this.C, (-i6) / getHeight(), motionEvent.getX(findPointerIndex) / getWidth());
                                if (!this.D.isFinished()) {
                                    this.D.onRelease();
                                }
                            } else if (i7 > scrollRange) {
                                ft.j(this.D, i6 / getHeight(), 1.0f - (motionEvent.getX(findPointerIndex) / getWidth()));
                                if (!this.C.isFinished()) {
                                    this.C.onRelease();
                                }
                            }
                            if (!this.C.isFinished() || !this.D.isFinished()) {
                                sr.m1(this);
                                if (z) {
                                    this.J.clear();
                                }
                            }
                        }
                        z = z3;
                        if (z) {
                        }
                    }
                }
            } else if (actionMasked == 3) {
                if (this.I && getChildCount() > 0 && this.B.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    sr.m1(this);
                }
                this.P = -1;
                o();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.E = (int) motionEvent.getY(actionIndex);
                this.P = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                D(motionEvent);
                this.E = (int) motionEvent.getY(motionEvent.findPointerIndex(this.P));
            }
        } else if (getChildCount() == 0) {
            return false;
        } else {
            if (this.I && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.B.isFinished()) {
                g();
            }
            this.E = (int) motionEvent.getY();
            this.P = motionEvent.getPointerId(0);
            e(2, 0);
        }
        VelocityTracker velocityTracker2 = this.J;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public boolean p(@x1 KeyEvent keyEvent) {
        this.A.setEmpty();
        boolean j = j();
        int i = WKSRecord.Service.CISCO_FNA;
        if (!j) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, WKSRecord.Service.CISCO_FNA);
            return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(WKSRecord.Service.CISCO_FNA)) ? false : true;
        } else if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                if (!keyEvent.isAltPressed()) {
                    return h(33);
                }
                return s(33);
            } else if (keyCode == 20) {
                if (!keyEvent.isAltPressed()) {
                    return h(WKSRecord.Service.CISCO_FNA);
                }
                return s(WKSRecord.Service.CISCO_FNA);
            } else if (keyCode != 62) {
                return false;
            } else {
                if (keyEvent.isShiftPressed()) {
                    i = 33;
                }
                F(i);
                return false;
            }
        } else {
            return false;
        }
    }

    public void r(int i) {
        if (getChildCount() > 0) {
            this.B.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            I(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.F) {
            K(view2);
        } else {
            this.H = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(@x1 View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return L(rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            G();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.F = true;
        super.requestLayout();
    }

    public boolean s(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.A;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.A.bottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            Rect rect2 = this.A;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.A;
        return J(i, rect3.top, rect3.bottom);
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int k = k(i, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int k2 = k(i2, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (k == getScrollX() && k2 == getScrollY()) {
                return;
            }
            super.scrollTo(k, k2);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.K) {
            this.K = z;
            requestLayout();
        }
    }

    @Override // android.view.View, com.p7700g.p99005.dr
    public void setNestedScrollingEnabled(boolean z) {
        this.W.p(z);
    }

    public void setOnScrollChangeListener(@z1 c cVar) {
        this.v0 = cVar;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.L = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View, com.p7700g.p99005.dr
    public boolean startNestedScroll(int i) {
        return e(i, 0);
    }

    @Override // android.view.View, com.p7700g.p99005.dr
    public void stopNestedScroll() {
        f(0);
    }

    public boolean x() {
        return this.K;
    }

    public boolean z() {
        return this.L;
    }

    public NestedScrollView(@x1 Context context, @z1 AttributeSet attributeSet) {
        this(context, attributeSet, nf.a.n);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, com.p7700g.p99005.hr
    public void onNestedPreScroll(@x1 View view, int i, int i2, @x1 int[] iArr) {
        onNestedPreScroll(view, i, i2, iArr, 0);
    }

    @Override // com.p7700g.p99005.fr
    public void onNestedScroll(@x1 View view, int i, int i2, int i3, int i4, int i5) {
        C(i4, i5, null);
    }

    public NestedScrollView(@x1 Context context, @z1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A = new Rect();
        this.F = true;
        this.G = false;
        this.H = null;
        this.I = false;
        this.L = true;
        this.P = -1;
        this.Q = new int[2];
        this.R = new int[2];
        this.C = ft.a(context, attributeSet);
        this.D = ft.a(context, attributeSet);
        v();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.V = new ir(this);
        this.W = new er(this);
        setNestedScrollingEnabled(true);
        sr.A1(this, x);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, com.p7700g.p99005.hr
    public void onNestedScroll(@x1 View view, int i, int i2, int i3, int i4) {
        C(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, com.p7700g.p99005.hr
    public void onNestedScrollAccepted(@x1 View view, @x1 View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, com.p7700g.p99005.hr
    public void onStopNestedScroll(@x1 View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}