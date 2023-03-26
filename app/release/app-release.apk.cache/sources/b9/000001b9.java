package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.microsoft.appcenter.utils.crypto.CryptoConstants;
import com.p7700g.p99005.au;
import com.p7700g.p99005.ep;
import com.p7700g.p99005.f1;
import com.p7700g.p99005.fk;
import com.p7700g.p99005.fr;
import com.p7700g.p99005.g1;
import com.p7700g.p99005.gh;
import com.p7700g.p99005.gr;
import com.p7700g.p99005.gs;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.ip;
import com.p7700g.p99005.ir;
import com.p7700g.p99005.jr;
import com.p7700g.p99005.kf;
import com.p7700g.p99005.lf;
import com.p7700g.p99005.m1;
import com.p7700g.p99005.mf;
import com.p7700g.p99005.nq;
import com.p7700g.p99005.q0;
import com.p7700g.p99005.r2;
import com.p7700g.p99005.sr;
import com.p7700g.p99005.w0;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import com.p7700g.p99005.zg2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xbill.DNS.SimpleResolver;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements fr, gr {
    public static final int A = 2;
    public static final Comparator<View> B;
    private static final ip.a<Rect> C;
    public static final String s = "CoordinatorLayout";
    public static final String t;
    private static final int u = 0;
    private static final int v = 1;
    public static final Class<?>[] w;
    public static final ThreadLocal<Map<String, Constructor<c>>> x;
    public static final int y = 0;
    public static final int z = 1;
    private final List<View> D;
    private final lf<View> E;
    private final List<View> F;
    private final List<View> G;
    private Paint H;
    private final int[] I;
    private final int[] J;
    private boolean K;
    private boolean L;
    private int[] M;
    private View N;
    private View O;
    private h P;
    private boolean Q;
    private gs R;
    private boolean S;
    private Drawable T;
    public ViewGroup.OnHierarchyChangeListener U;
    private jr V;
    private final ir W;

    /* loaded from: classes.dex */
    public class a implements jr {
        public a() {
        }

        @Override // com.p7700g.p99005.jr
        public gs a(View view, gs gsVar) {
            return CoordinatorLayout.this.V(gsVar);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        @x1
        c getBehavior();
    }

    /* loaded from: classes.dex */
    public static abstract class c<V extends View> {
        public c() {
        }

        public static void F(@x1 View view, @z1 Object obj) {
            ((g) view.getLayoutParams()).r = obj;
        }

        @z1
        public static Object e(@x1 View view) {
            return ((g) view.getLayoutParams()).r;
        }

        @Deprecated
        public boolean A(@x1 CoordinatorLayout coordinatorLayout, @x1 V v, @x1 View view, @x1 View view2, int i) {
            return false;
        }

        public boolean B(@x1 CoordinatorLayout coordinatorLayout, @x1 V v, @x1 View view, @x1 View view2, int i, int i2) {
            if (i2 == 0) {
                return A(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        @Deprecated
        public void C(@x1 CoordinatorLayout coordinatorLayout, @x1 V v, @x1 View view) {
        }

        public void D(@x1 CoordinatorLayout coordinatorLayout, @x1 V v, @x1 View view, int i) {
            if (i == 0) {
                C(coordinatorLayout, v, view);
            }
        }

        public boolean E(@x1 CoordinatorLayout coordinatorLayout, @x1 V v, @x1 MotionEvent motionEvent) {
            return false;
        }

        public boolean a(@x1 CoordinatorLayout coordinatorLayout, @x1 V v) {
            return d(coordinatorLayout, v) > 0.0f;
        }

        public boolean b(@x1 CoordinatorLayout coordinatorLayout, @x1 V v, @x1 Rect rect) {
            return false;
        }

        @w0
        public int c(@x1 CoordinatorLayout coordinatorLayout, @x1 V v) {
            return sr.t;
        }

        @g1(from = zg2.s, to = 1.0d)
        public float d(@x1 CoordinatorLayout coordinatorLayout, @x1 V v) {
            return 0.0f;
        }

        public boolean f(@x1 CoordinatorLayout coordinatorLayout, @x1 V v, @x1 View view) {
            return false;
        }

        @x1
        public gs g(@x1 CoordinatorLayout coordinatorLayout, @x1 V v, @x1 gs gsVar) {
            return gsVar;
        }

        public void h(@x1 g gVar) {
        }

        public boolean i(@x1 CoordinatorLayout coordinatorLayout, @x1 V v, @x1 View view) {
            return false;
        }

        public void j(@x1 CoordinatorLayout coordinatorLayout, @x1 V v, @x1 View view) {
        }

        public void k() {
        }

        public boolean l(@x1 CoordinatorLayout coordinatorLayout, @x1 V v, @x1 MotionEvent motionEvent) {
            return false;
        }

        public boolean m(@x1 CoordinatorLayout coordinatorLayout, @x1 V v, int i) {
            return false;
        }

        public boolean n(@x1 CoordinatorLayout coordinatorLayout, @x1 V v, int i, int i2, int i3, int i4) {
            return false;
        }

        public boolean o(@x1 CoordinatorLayout coordinatorLayout, @x1 V v, @x1 View view, float f, float f2, boolean z) {
            return false;
        }

        public boolean p(@x1 CoordinatorLayout coordinatorLayout, @x1 V v, @x1 View view, float f, float f2) {
            return false;
        }

        @Deprecated
        public void q(@x1 CoordinatorLayout coordinatorLayout, @x1 V v, @x1 View view, int i, int i2, @x1 int[] iArr) {
        }

        public void r(@x1 CoordinatorLayout coordinatorLayout, @x1 V v, @x1 View view, int i, int i2, @x1 int[] iArr, int i3) {
            if (i3 == 0) {
                q(coordinatorLayout, v, view, i, i2, iArr);
            }
        }

        @Deprecated
        public void s(@x1 CoordinatorLayout coordinatorLayout, @x1 V v, @x1 View view, int i, int i2, int i3, int i4) {
        }

        @Deprecated
        public void t(@x1 CoordinatorLayout coordinatorLayout, @x1 V v, @x1 View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                s(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }

        public void u(@x1 CoordinatorLayout coordinatorLayout, @x1 V v, @x1 View view, int i, int i2, int i3, int i4, int i5, @x1 int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            t(coordinatorLayout, v, view, i, i2, i3, i4, i5);
        }

        @Deprecated
        public void v(@x1 CoordinatorLayout coordinatorLayout, @x1 V v, @x1 View view, @x1 View view2, int i) {
        }

        public void w(@x1 CoordinatorLayout coordinatorLayout, @x1 V v, @x1 View view, @x1 View view2, int i, int i2) {
            if (i2 == 0) {
                v(coordinatorLayout, v, view, view2, i);
            }
        }

        public boolean x(@x1 CoordinatorLayout coordinatorLayout, @x1 V v, @x1 Rect rect, boolean z) {
            return false;
        }

        public void y(@x1 CoordinatorLayout coordinatorLayout, @x1 V v, @x1 Parcelable parcelable) {
        }

        @z1
        public Parcelable z(@x1 CoordinatorLayout coordinatorLayout, @x1 V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public c(Context context, AttributeSet attributeSet) {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    /* loaded from: classes.dex */
    public @interface d {
        Class<? extends c> value();
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface e {
    }

    /* loaded from: classes.dex */
    public class f implements ViewGroup.OnHierarchyChangeListener {
        public f() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.U;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.G(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.U;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* loaded from: classes.dex */
    public class h implements ViewTreeObserver.OnPreDrawListener {
        public h() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.G(0);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class j implements Comparator<View> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(View view, View view2) {
            float E0 = sr.E0(view);
            float E02 = sr.E0(view2);
            if (E0 > E02) {
                return -1;
            }
            return E0 < E02 ? 1 : 0;
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        t = r0 != null ? r0.getName() : null;
        B = new j();
        w = new Class[]{Context.class, AttributeSet.class};
        x = new ThreadLocal<>();
        C = new ip.c(12);
    }

    public CoordinatorLayout(@x1 Context context) {
        this(context, null);
    }

    private void B(View view, int i2) {
        g gVar = (g) view.getLayoutParams();
        Rect e2 = e();
        e2.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) gVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) gVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin);
        if (this.R != null && sr.T(this) && !sr.T(view)) {
            e2.left = this.R.p() + e2.left;
            e2.top = this.R.r() + e2.top;
            e2.right -= this.R.q();
            e2.bottom -= this.R.o();
        }
        Rect e3 = e();
        nq.b(R(gVar.c), view.getMeasuredWidth(), view.getMeasuredHeight(), e2, e3, i2);
        view.layout(e3.left, e3.top, e3.right, e3.bottom);
        N(e2);
        N(e3);
    }

    private void C(View view, View view2, int i2) {
        Rect e2 = e();
        Rect e3 = e();
        try {
            s(view2, e2);
            t(view, i2, e2, e3);
            view.layout(e3.left, e3.top, e3.right, e3.bottom);
        } finally {
            N(e2);
            N(e3);
        }
    }

    private void D(View view, int i2, int i3) {
        g gVar = (g) view.getLayoutParams();
        int d2 = nq.d(S(gVar.c), i3);
        int i4 = d2 & 7;
        int i5 = d2 & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i3 == 1) {
            i2 = width - i2;
        }
        int v2 = v(i2) - measuredWidth;
        int i6 = 0;
        if (i4 == 1) {
            v2 += measuredWidth / 2;
        } else if (i4 == 5) {
            v2 += measuredWidth;
        }
        if (i5 == 16) {
            i6 = 0 + (measuredHeight / 2);
        } else if (i5 == 80) {
            i6 = measuredHeight + 0;
        }
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) gVar).leftMargin, Math.min(v2, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) gVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin, Math.min(i6, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    private void E(View view, Rect rect, int i2) {
        boolean z2;
        boolean z3;
        int width;
        int i3;
        int i4;
        int i5;
        int height;
        int i6;
        int i7;
        int i8;
        if (sr.T0(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            g gVar = (g) view.getLayoutParams();
            c f2 = gVar.f();
            Rect e2 = e();
            Rect e3 = e();
            e3.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (f2 != null && f2.b(this, view, e2)) {
                if (!e3.contains(e2)) {
                    StringBuilder G = wo1.G("Rect should be within the child's bounds. Rect:");
                    G.append(e2.toShortString());
                    G.append(" | Bounds:");
                    G.append(e3.toShortString());
                    throw new IllegalArgumentException(G.toString());
                }
            } else {
                e2.set(e3);
            }
            N(e3);
            if (e2.isEmpty()) {
                N(e2);
                return;
            }
            int d2 = nq.d(gVar.h, i2);
            boolean z4 = true;
            if ((d2 & 48) != 48 || (i7 = (e2.top - ((ViewGroup.MarginLayoutParams) gVar).topMargin) - gVar.j) >= (i8 = rect.top)) {
                z2 = false;
            } else {
                U(view, i8 - i7);
                z2 = true;
            }
            if ((d2 & 80) == 80 && (height = ((getHeight() - e2.bottom) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) + gVar.j) < (i6 = rect.bottom)) {
                U(view, height - i6);
                z2 = true;
            }
            if (!z2) {
                U(view, 0);
            }
            if ((d2 & 3) != 3 || (i4 = (e2.left - ((ViewGroup.MarginLayoutParams) gVar).leftMargin) - gVar.i) >= (i5 = rect.left)) {
                z3 = false;
            } else {
                T(view, i5 - i4);
                z3 = true;
            }
            if ((d2 & 5) != 5 || (width = ((getWidth() - e2.right) - ((ViewGroup.MarginLayoutParams) gVar).rightMargin) + gVar.i) >= (i3 = rect.right)) {
                z4 = z3;
            } else {
                T(view, width - i3);
            }
            if (!z4) {
                T(view, 0);
            }
            N(e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static c J(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(CryptoConstants.ALIAS_SEPARATOR)) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = t;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<c>>> threadLocal = x;
            Map<String, Constructor<c>> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Constructor<c> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(w);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e2) {
            throw new RuntimeException(wo1.t("Could not inflate Behavior subclass ", str), e2);
        }
    }

    private boolean K(MotionEvent motionEvent, int i2) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.F;
        y(list);
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z2 = false;
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = list.get(i3);
            g gVar = (g) view.getLayoutParams();
            c f2 = gVar.f();
            if (!(z2 || z3) || actionMasked == 0) {
                if (!z2 && f2 != null) {
                    if (i2 == 0) {
                        z2 = f2.l(this, view, motionEvent);
                    } else if (i2 == 1) {
                        z2 = f2.E(this, view, motionEvent);
                    }
                    if (z2) {
                        this.N = view;
                    }
                }
                boolean c2 = gVar.c();
                boolean j2 = gVar.j(this, view);
                z3 = j2 && !c2;
                if (j2 && !z3) {
                    break;
                }
            } else if (f2 != null) {
                if (motionEvent2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i2 == 0) {
                    f2.l(this, view, motionEvent2);
                } else if (i2 == 1) {
                    f2.E(this, view, motionEvent2);
                }
            }
        }
        list.clear();
        return z2;
    }

    private void L() {
        this.D.clear();
        this.E.c();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            g x2 = x(childAt);
            x2.d(this, childAt);
            this.E.b(childAt);
            for (int i3 = 0; i3 < childCount; i3++) {
                if (i3 != i2) {
                    View childAt2 = getChildAt(i3);
                    if (x2.b(this, childAt, childAt2)) {
                        if (!this.E.d(childAt2)) {
                            this.E.b(childAt2);
                        }
                        this.E.a(childAt2, childAt);
                    }
                }
            }
        }
        this.D.addAll(this.E.i());
        Collections.reverse(this.D);
    }

    private static void N(@x1 Rect rect) {
        rect.setEmpty();
        C.a(rect);
    }

    private void P(boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            c f2 = ((g) childAt.getLayoutParams()).f();
            if (f2 != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z2) {
                    f2.l(this, childAt, obtain);
                } else {
                    f2.E(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            ((g) getChildAt(i3).getLayoutParams()).n();
        }
        this.N = null;
        this.K = false;
    }

    private static int Q(int i2) {
        if (i2 == 0) {
            return 17;
        }
        return i2;
    }

    private static int R(int i2) {
        if ((i2 & 7) == 0) {
            i2 |= nq.b;
        }
        return (i2 & 112) == 0 ? i2 | 48 : i2;
    }

    private static int S(int i2) {
        if (i2 == 0) {
            return 8388661;
        }
        return i2;
    }

    private void T(View view, int i2) {
        g gVar = (g) view.getLayoutParams();
        int i3 = gVar.i;
        if (i3 != i2) {
            sr.d1(view, i2 - i3);
            gVar.i = i2;
        }
    }

    private void U(View view, int i2) {
        g gVar = (g) view.getLayoutParams();
        int i3 = gVar.j;
        if (i3 != i2) {
            sr.e1(view, i2 - i3);
            gVar.j = i2;
        }
    }

    private void W() {
        if (sr.T(this)) {
            if (this.V == null) {
                this.V = new a();
            }
            sr.Z1(this, this.V);
            setSystemUiVisibility(SimpleResolver.DEFAULT_EDNS_PAYLOADSIZE);
            return;
        }
        sr.Z1(this, null);
    }

    @x1
    private static Rect e() {
        Rect b2 = C.b();
        return b2 == null ? new Rect() : b2;
    }

    private static int g(int i2, int i3, int i4) {
        return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
    }

    private void h(g gVar, Rect rect, int i2, int i3) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) gVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i2) - ((ViewGroup.MarginLayoutParams) gVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i3) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin));
        rect.set(max, max2, i2 + max, i3 + max2);
    }

    private gs i(gs gsVar) {
        c f2;
        if (gsVar.A()) {
            return gsVar;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (sr.T(childAt) && (f2 = ((g) childAt.getLayoutParams()).f()) != null) {
                gsVar = f2.g(this, childAt, gsVar);
                if (gsVar.A()) {
                    break;
                }
            }
        }
        return gsVar;
    }

    private void u(View view, int i2, Rect rect, Rect rect2, g gVar, int i3, int i4) {
        int width;
        int height;
        int d2 = nq.d(Q(gVar.c), i2);
        int d3 = nq.d(R(gVar.d), i2);
        int i5 = d2 & 7;
        int i6 = d2 & 112;
        int i7 = d3 & 7;
        int i8 = d3 & 112;
        if (i7 == 1) {
            width = rect.left + (rect.width() / 2);
        } else if (i7 != 5) {
            width = rect.left;
        } else {
            width = rect.right;
        }
        if (i8 == 16) {
            height = rect.top + (rect.height() / 2);
        } else if (i8 != 80) {
            height = rect.top;
        } else {
            height = rect.bottom;
        }
        if (i5 == 1) {
            width -= i3 / 2;
        } else if (i5 != 5) {
            width -= i3;
        }
        if (i6 == 16) {
            height -= i4 / 2;
        } else if (i6 != 80) {
            height -= i4;
        }
        rect2.set(width, height, i3 + width, i4 + height);
    }

    private int v(int i2) {
        int[] iArr = this.M;
        if (iArr == null) {
            String str = "No keylines defined for " + this + " - attempted index lookup " + i2;
            return 0;
        } else if (i2 >= 0 && i2 < iArr.length) {
            return iArr[i2];
        } else {
            String str2 = "Keyline index " + i2 + " out of range for " + this;
            return 0;
        }
    }

    private void y(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        Comparator<View> comparator = B;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    private boolean z(View view) {
        return this.E.j(view);
    }

    public boolean A(@x1 View view, int i2, int i3) {
        Rect e2 = e();
        s(view, e2);
        try {
            return e2.contains(i2, i3);
        } finally {
            N(e2);
        }
    }

    public void F(View view, int i2) {
        c f2;
        g gVar = (g) view.getLayoutParams();
        if (gVar.k != null) {
            Rect e2 = e();
            Rect e3 = e();
            Rect e4 = e();
            s(gVar.k, e2);
            boolean z2 = false;
            p(view, false, e3);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            u(view, i2, e2, e4, gVar, measuredWidth, measuredHeight);
            z2 = (e4.left == e3.left && e4.top == e3.top) ? true : true;
            h(gVar, e4, measuredWidth, measuredHeight);
            int i3 = e4.left - e3.left;
            int i4 = e4.top - e3.top;
            if (i3 != 0) {
                sr.d1(view, i3);
            }
            if (i4 != 0) {
                sr.e1(view, i4);
            }
            if (z2 && (f2 = gVar.f()) != null) {
                f2.i(this, view, gVar.k);
            }
            N(e2);
            N(e3);
            N(e4);
        }
    }

    public final void G(int i2) {
        boolean z2;
        int Y = sr.Y(this);
        int size = this.D.size();
        Rect e2 = e();
        Rect e3 = e();
        Rect e4 = e();
        for (int i3 = 0; i3 < size; i3++) {
            View view = this.D.get(i3);
            g gVar = (g) view.getLayoutParams();
            if (i2 != 0 || view.getVisibility() != 8) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (gVar.l == this.D.get(i4)) {
                        F(view, Y);
                    }
                }
                p(view, true, e3);
                if (gVar.g != 0 && !e3.isEmpty()) {
                    int d2 = nq.d(gVar.g, Y);
                    int i5 = d2 & 112;
                    if (i5 == 48) {
                        e2.top = Math.max(e2.top, e3.bottom);
                    } else if (i5 == 80) {
                        e2.bottom = Math.max(e2.bottom, getHeight() - e3.top);
                    }
                    int i6 = d2 & 7;
                    if (i6 == 3) {
                        e2.left = Math.max(e2.left, e3.right);
                    } else if (i6 == 5) {
                        e2.right = Math.max(e2.right, getWidth() - e3.left);
                    }
                }
                if (gVar.h != 0 && view.getVisibility() == 0) {
                    E(view, e2, Y);
                }
                if (i2 != 2) {
                    w(view, e4);
                    if (!e4.equals(e3)) {
                        M(view, e3);
                    }
                }
                for (int i7 = i3 + 1; i7 < size; i7++) {
                    View view2 = this.D.get(i7);
                    g gVar2 = (g) view2.getLayoutParams();
                    c f2 = gVar2.f();
                    if (f2 != null && f2.f(this, view2, view)) {
                        if (i2 == 0 && gVar2.g()) {
                            gVar2.l();
                        } else {
                            if (i2 != 2) {
                                z2 = f2.i(this, view2, view);
                            } else {
                                f2.j(this, view2, view);
                                z2 = true;
                            }
                            if (i2 == 1) {
                                gVar2.r(z2);
                            }
                        }
                    }
                }
            }
        }
        N(e2);
        N(e3);
        N(e4);
    }

    public void H(@x1 View view, int i2) {
        g gVar = (g) view.getLayoutParams();
        if (!gVar.a()) {
            View view2 = gVar.k;
            if (view2 != null) {
                C(view, view2, i2);
                return;
            }
            int i3 = gVar.e;
            if (i3 >= 0) {
                D(view, i3, i2);
                return;
            } else {
                B(view, i2);
                return;
            }
        }
        throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
    }

    public void I(View view, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    public void M(View view, Rect rect) {
        ((g) view.getLayoutParams()).s(rect);
    }

    public void O() {
        if (this.L && this.P != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.P);
        }
        this.Q = false;
    }

    public final gs V(gs gsVar) {
        if (ep.a(this.R, gsVar)) {
            return gsVar;
        }
        this.R = gsVar;
        boolean z2 = true;
        boolean z3 = gsVar != null && gsVar.r() > 0;
        this.S = z3;
        setWillNotDraw((z3 || getBackground() != null) ? false : false);
        gs i2 = i(gsVar);
        requestLayout();
        return i2;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof g) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j2) {
        g gVar = (g) view.getLayoutParams();
        c cVar = gVar.a;
        if (cVar != null) {
            float d2 = cVar.d(this, view);
            if (d2 > 0.0f) {
                if (this.H == null) {
                    this.H = new Paint();
                }
                this.H.setColor(gVar.a.c(this, view));
                this.H.setAlpha(g(Math.round(d2 * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.H);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.T;
        boolean z2 = false;
        if (drawable != null && drawable.isStateful()) {
            z2 = false | drawable.setState(drawableState);
        }
        if (z2) {
            invalidate();
        }
    }

    public void f() {
        if (this.L) {
            if (this.P == null) {
                this.P = new h();
            }
            getViewTreeObserver().addOnPreDrawListener(this.P);
        }
        this.Q = true;
    }

    @r2
    public final List<View> getDependencySortedChildren() {
        L();
        return Collections.unmodifiableList(this.D);
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public final gs getLastWindowInsets() {
        return this.R;
    }

    @Override // android.view.ViewGroup, com.p7700g.p99005.hr
    public int getNestedScrollAxes() {
        return this.W.a();
    }

    @z1
    public Drawable getStatusBarBackground() {
        return this.T;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public void j(@x1 View view) {
        List g2 = this.E.g(view);
        if (g2 == null || g2.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < g2.size(); i2++) {
            View view2 = (View) g2.get(i2);
            c f2 = ((g) view2.getLayoutParams()).f();
            if (f2 != null) {
                f2.i(this, view2, view);
            }
        }
    }

    public boolean k(@x1 View view, @x1 View view2) {
        boolean z2 = false;
        if (view.getVisibility() == 0 && view2.getVisibility() == 0) {
            Rect e2 = e();
            p(view, view.getParent() != this, e2);
            Rect e3 = e();
            p(view2, view2.getParent() != this, e3);
            try {
                if (e2.left <= e3.right && e2.top <= e3.bottom && e2.right >= e3.left) {
                    if (e2.bottom >= e3.top) {
                        z2 = true;
                    }
                }
                return z2;
            } finally {
                N(e2);
                N(e3);
            }
        }
        return false;
    }

    public void l() {
        int childCount = getChildCount();
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            } else if (z(getChildAt(i2))) {
                z2 = true;
                break;
            } else {
                i2++;
            }
        }
        if (z2 != this.Q) {
            if (z2) {
                f();
            } else {
                O();
            }
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: m */
    public g generateDefaultLayoutParams() {
        return new g(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: n */
    public g generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: o */
    public g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof g) {
            return new g((g) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new g((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new g(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        P(false);
        if (this.Q) {
            if (this.P == null) {
                this.P = new h();
            }
            getViewTreeObserver().addOnPreDrawListener(this.P);
        }
        if (this.R == null && sr.T(this)) {
            sr.u1(this);
        }
        this.L = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        P(false);
        if (this.Q && this.P != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.P);
        }
        View view = this.O;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.L = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.S || this.T == null) {
            return;
        }
        gs gsVar = this.R;
        int r = gsVar != null ? gsVar.r() : 0;
        if (r > 0) {
            this.T.setBounds(0, 0, getWidth(), r);
            this.T.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            P(true);
        }
        boolean K = K(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            P(true);
        }
        return K;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        c f2;
        int Y = sr.Y(this);
        int size = this.D.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = this.D.get(i6);
            if (view.getVisibility() != 8 && ((f2 = ((g) view.getLayoutParams()).f()) == null || !f2.m(this, view, Y))) {
                H(view, Y);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x011a, code lost:
        if (r0.n(r30, r20, r11, r21, r23, 0) == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        c f2;
        g gVar;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        L();
        l();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int Y = sr.Y(this);
        boolean z2 = Y == 1;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int i14 = paddingLeft + paddingRight;
        int i15 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        boolean z3 = this.R != null && sr.T(this);
        int size3 = this.D.size();
        int i16 = suggestedMinimumWidth;
        int i17 = suggestedMinimumHeight;
        int i18 = 0;
        int i19 = 0;
        while (i19 < size3) {
            View view = this.D.get(i19);
            if (view.getVisibility() == 8) {
                i12 = i19;
                i9 = size3;
                i10 = paddingLeft;
            } else {
                g gVar2 = (g) view.getLayoutParams();
                int i20 = gVar2.e;
                if (i20 < 0 || mode == 0) {
                    i4 = i18;
                } else {
                    int v2 = v(i20);
                    int d2 = nq.d(S(gVar2.c), Y) & 7;
                    i4 = i18;
                    if ((d2 == 3 && !z2) || (d2 == 5 && z2)) {
                        i5 = Math.max(0, (size - paddingRight) - v2);
                    } else if ((d2 == 5 && !z2) || (d2 == 3 && z2)) {
                        i5 = Math.max(0, v2 - paddingLeft);
                    }
                    if (z3 || sr.T(view)) {
                        i6 = i2;
                        i7 = i3;
                    } else {
                        int q = this.R.q() + this.R.p();
                        int o = this.R.o() + this.R.r();
                        i6 = View.MeasureSpec.makeMeasureSpec(size - q, mode);
                        i7 = View.MeasureSpec.makeMeasureSpec(size2 - o, mode2);
                    }
                    f2 = gVar2.f();
                    if (f2 == null) {
                        gVar = gVar2;
                        i11 = i4;
                        i12 = i19;
                        i8 = i17;
                        i10 = paddingLeft;
                        i13 = i16;
                        i9 = size3;
                    } else {
                        gVar = gVar2;
                        i8 = i17;
                        i9 = size3;
                        i10 = paddingLeft;
                        i11 = i4;
                        i12 = i19;
                        i13 = i16;
                    }
                    I(view, i6, i5, i7, 0);
                    g gVar3 = gVar;
                    int max = Math.max(i13, view.getMeasuredWidth() + i14 + ((ViewGroup.MarginLayoutParams) gVar3).leftMargin + ((ViewGroup.MarginLayoutParams) gVar3).rightMargin);
                    int max2 = Math.max(i8, view.getMeasuredHeight() + i15 + ((ViewGroup.MarginLayoutParams) gVar3).topMargin + ((ViewGroup.MarginLayoutParams) gVar3).bottomMargin);
                    i18 = View.combineMeasuredStates(i11, view.getMeasuredState());
                    i16 = max;
                    i17 = max2;
                }
                i5 = 0;
                if (z3) {
                }
                i6 = i2;
                i7 = i3;
                f2 = gVar2.f();
                if (f2 == null) {
                }
                I(view, i6, i5, i7, 0);
                g gVar32 = gVar;
                int max3 = Math.max(i13, view.getMeasuredWidth() + i14 + ((ViewGroup.MarginLayoutParams) gVar32).leftMargin + ((ViewGroup.MarginLayoutParams) gVar32).rightMargin);
                int max22 = Math.max(i8, view.getMeasuredHeight() + i15 + ((ViewGroup.MarginLayoutParams) gVar32).topMargin + ((ViewGroup.MarginLayoutParams) gVar32).bottomMargin);
                i18 = View.combineMeasuredStates(i11, view.getMeasuredState());
                i16 = max3;
                i17 = max22;
            }
            i19 = i12 + 1;
            paddingLeft = i10;
            size3 = i9;
        }
        int i21 = i18;
        setMeasuredDimension(View.resolveSizeAndState(i16, i2, (-16777216) & i21), View.resolveSizeAndState(i17, i3, i21 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, com.p7700g.p99005.hr
    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        c f4;
        int childCount = getChildCount();
        boolean z3 = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.k(0) && (f4 = gVar.f()) != null) {
                    z3 |= f4.o(this, childAt, view, f2, f3, z2);
                }
            }
        }
        if (z3) {
            G(1);
        }
        return z3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, com.p7700g.p99005.hr
    public boolean onNestedPreFling(View view, float f2, float f3) {
        c f4;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.k(0) && (f4 = gVar.f()) != null) {
                    z2 |= f4.p(this, childAt, view, f2, f3);
                }
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, com.p7700g.p99005.hr
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        onNestedPreScroll(view, i2, i3, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, com.p7700g.p99005.hr
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        onNestedScroll(view, i2, i3, i4, i5, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, com.p7700g.p99005.hr
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        onNestedScrollAccepted(view, view2, i2, 0);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.getSuperState());
        SparseArray<Parcelable> sparseArray = iVar.s;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            c f2 = x(childAt).f();
            if (id != -1 && f2 != null && (parcelable2 = sparseArray.get(id)) != null) {
                f2.y(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable z2;
        i iVar = new i(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            c f2 = ((g) childAt.getLayoutParams()).f();
            if (id != -1 && f2 != null && (z2 = f2.z(this, childAt)) != null) {
                sparseArray.append(id, z2);
            }
        }
        iVar.s = sparseArray;
        return iVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, com.p7700g.p99005.hr
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return onStartNestedScroll(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, com.p7700g.p99005.hr
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r3 != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean E;
        MotionEvent motionEvent2;
        int actionMasked = motionEvent.getActionMasked();
        if (this.N == null) {
            z2 = K(motionEvent, 1);
        } else {
            z2 = false;
        }
        c f2 = ((g) this.N.getLayoutParams()).f();
        if (f2 != null) {
            E = f2.E(this, this.N, motionEvent);
            motionEvent2 = null;
            if (this.N != null) {
                E |= super.onTouchEvent(motionEvent);
            } else if (z2) {
                long uptimeMillis = SystemClock.uptimeMillis();
                motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEvent2);
            }
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            if (actionMasked != 1 || actionMasked == 3) {
                P(false);
            }
            return E;
        }
        E = false;
        motionEvent2 = null;
        if (this.N != null) {
        }
        if (motionEvent2 != null) {
        }
        if (actionMasked != 1) {
        }
        P(false);
        return E;
    }

    public void p(View view, boolean z2, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z2) {
            s(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @x1
    public List<View> q(@x1 View view) {
        List<View> h2 = this.E.h(view);
        this.G.clear();
        if (h2 != null) {
            this.G.addAll(h2);
        }
        return this.G;
    }

    @x1
    public List<View> r(@x1 View view) {
        List g2 = this.E.g(view);
        this.G.clear();
        if (g2 != null) {
            this.G.addAll(g2);
        }
        return this.G;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        c f2 = ((g) view.getLayoutParams()).f();
        if (f2 == null || !f2.x(this, view, rect, z2)) {
            return super.requestChildRectangleOnScreen(view, rect, z2);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (!z2 || this.K) {
            return;
        }
        P(false);
        this.K = true;
    }

    public void s(View view, Rect rect) {
        mf.a(this, view, rect);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z2) {
        super.setFitsSystemWindows(z2);
        W();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.U = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(@z1 Drawable drawable) {
        Drawable drawable2 = this.T;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.T = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.T.setState(getDrawableState());
                }
                fk.m(this.T, sr.Y(this));
                this.T.setVisible(getVisibility() == 0, false);
                this.T.setCallback(this);
            }
            sr.m1(this);
        }
    }

    public void setStatusBarBackgroundColor(@w0 int i2) {
        setStatusBarBackground(new ColorDrawable(i2));
    }

    public void setStatusBarBackgroundResource(@f1 int i2) {
        setStatusBarBackground(i2 != 0 ? gh.i(getContext(), i2) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z2 = i2 == 0;
        Drawable drawable = this.T;
        if (drawable == null || drawable.isVisible() == z2) {
            return;
        }
        this.T.setVisible(z2, false);
    }

    public void t(View view, int i2, Rect rect, Rect rect2) {
        g gVar = (g) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        u(view, i2, rect, rect2, gVar, measuredWidth, measuredHeight);
        h(gVar, rect2, measuredWidth, measuredHeight);
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.T;
    }

    public void w(View view, Rect rect) {
        rect.set(((g) view.getLayoutParams()).h());
    }

    public g x(View view) {
        g gVar = (g) view.getLayoutParams();
        if (!gVar.b) {
            if (view instanceof b) {
                gVar.q(((b) view).getBehavior());
                gVar.b = true;
            } else {
                d dVar = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (d) cls.getAnnotation(d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        gVar.q(dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception unused) {
                        dVar.value().getName();
                    }
                }
                gVar.b = true;
            }
        }
        return gVar;
    }

    public CoordinatorLayout(@x1 Context context, @z1 AttributeSet attributeSet) {
        this(context, attributeSet, kf.a.b);
    }

    @Override // com.p7700g.p99005.fr
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr, int i4) {
        c f2;
        int childCount = getChildCount();
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.k(i4) && (f2 = gVar.f()) != null) {
                    int[] iArr2 = this.I;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f2.r(this, childAt, view, i2, i3, iArr2, i4);
                    int[] iArr3 = this.I;
                    i5 = i2 > 0 ? Math.max(i5, iArr3[0]) : Math.min(i5, iArr3[0]);
                    int[] iArr4 = this.I;
                    i6 = i3 > 0 ? Math.max(i6, iArr4[1]) : Math.min(i6, iArr4[1]);
                    z2 = true;
                }
            }
        }
        iArr[0] = i5;
        iArr[1] = i6;
        if (z2) {
            G(1);
        }
    }

    @Override // com.p7700g.p99005.fr
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5, int i6) {
        onNestedScroll(view, i2, i3, i4, i5, 0, this.J);
    }

    @Override // com.p7700g.p99005.fr
    public void onNestedScrollAccepted(View view, View view2, int i2, int i3) {
        c f2;
        this.W.c(view, view2, i2, i3);
        this.O = view2;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            g gVar = (g) childAt.getLayoutParams();
            if (gVar.k(i3) && (f2 = gVar.f()) != null) {
                f2.w(this, childAt, view, view2, i2, i3);
            }
        }
    }

    @Override // com.p7700g.p99005.fr
    public boolean onStartNestedScroll(View view, View view2, int i2, int i3) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                c f2 = gVar.f();
                if (f2 != null) {
                    boolean B2 = f2.B(this, childAt, view, view2, i2, i3);
                    z2 |= B2;
                    gVar.t(i3, B2);
                } else {
                    gVar.t(i3, false);
                }
            }
        }
        return z2;
    }

    @Override // com.p7700g.p99005.fr
    public void onStopNestedScroll(View view, int i2) {
        this.W.e(view, i2);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            g gVar = (g) childAt.getLayoutParams();
            if (gVar.k(i2)) {
                c f2 = gVar.f();
                if (f2 != null) {
                    f2.D(this, childAt, view, i2);
                }
                gVar.m(i2);
                gVar.l();
            }
        }
        this.O = null;
    }

    public CoordinatorLayout(@x1 Context context, @z1 AttributeSet attributeSet, @q0 int i2) {
        super(context, attributeSet, i2);
        TypedArray obtainStyledAttributes;
        this.D = new ArrayList();
        this.E = new lf<>();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.I = new int[2];
        this.J = new int[2];
        this.W = new ir(this);
        if (i2 == 0) {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kf.j.g, 0, kf.i.h);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kf.j.g, i2, 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (i2 == 0) {
                saveAttributeDataForStyleable(context, kf.j.g, attributeSet, obtainStyledAttributes, 0, kf.i.h);
            } else {
                saveAttributeDataForStyleable(context, kf.j.g, attributeSet, obtainStyledAttributes, i2, 0);
            }
        }
        int resourceId = obtainStyledAttributes.getResourceId(kf.j.h, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.M = resources.getIntArray(resourceId);
            float f2 = resources.getDisplayMetrics().density;
            int length = this.M.length;
            for (int i3 = 0; i3 < length; i3++) {
                int[] iArr = this.M;
                iArr[i3] = (int) (iArr[i3] * f2);
            }
        }
        this.T = obtainStyledAttributes.getDrawable(kf.j.i);
        obtainStyledAttributes.recycle();
        W();
        super.setOnHierarchyChangeListener(new f());
        if (sr.U(this) == 0) {
            sr.Q1(this, 1);
        }
    }

    @Override // com.p7700g.p99005.gr
    public void onNestedScroll(@x1 View view, int i2, int i3, int i4, int i5, int i6, @x1 int[] iArr) {
        c f2;
        int min;
        int childCount = getChildCount();
        boolean z2 = false;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.k(i6) && (f2 = gVar.f()) != null) {
                    int[] iArr2 = this.I;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f2.u(this, childAt, view, i2, i3, i4, i5, i6, iArr2);
                    int[] iArr3 = this.I;
                    i7 = i4 > 0 ? Math.max(i7, iArr3[0]) : Math.min(i7, iArr3[0]);
                    if (i5 > 0) {
                        min = Math.max(i8, this.I[1]);
                    } else {
                        min = Math.min(i8, this.I[1]);
                    }
                    i8 = min;
                    z2 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i7;
        iArr[1] = iArr[1] + i8;
        if (z2) {
            G(1);
        }
    }

    /* loaded from: classes.dex */
    public static class i extends au {
        public static final Parcelable.Creator<i> CREATOR = new a();
        public SparseArray<Parcelable> s;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<i> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public i createFromParcel(Parcel parcel) {
                return new i(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public i[] newArray(int i) {
                return new i[i];
            }
        }

        public i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.s = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.s.append(iArr[i], readParcelableArray[i]);
            }
        }

        @Override // com.p7700g.p99005.au, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.s;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.s.keyAt(i2);
                parcelableArr[i2] = this.s.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        public i(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* loaded from: classes.dex */
    public static class g extends ViewGroup.MarginLayoutParams {
        public c a;
        public boolean b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public View k;
        public View l;
        private boolean m;
        private boolean n;
        private boolean o;
        private boolean p;
        public final Rect q;
        public Object r;

        public g(int i, int i2) {
            super(i, i2);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }

        private void o(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f);
            this.k = findViewById;
            if (findViewById == null) {
                if (coordinatorLayout.isInEditMode()) {
                    this.l = null;
                    this.k = null;
                    return;
                }
                StringBuilder G = wo1.G("Could not find CoordinatorLayout descendant view with id ");
                G.append(coordinatorLayout.getResources().getResourceName(this.f));
                G.append(" to anchor view ");
                G.append(view);
                throw new IllegalStateException(G.toString());
            } else if (findViewById == coordinatorLayout) {
                if (coordinatorLayout.isInEditMode()) {
                    this.l = null;
                    this.k = null;
                    return;
                }
                throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
            } else {
                for (ViewParent parent = findViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                    if (parent == view) {
                        if (coordinatorLayout.isInEditMode()) {
                            this.l = null;
                            this.k = null;
                            return;
                        }
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    if (parent instanceof View) {
                        findViewById = (View) parent;
                    }
                }
                this.l = findViewById;
            }
        }

        private boolean u(View view, int i) {
            int d = nq.d(((g) view.getLayoutParams()).g, i);
            return d != 0 && (nq.d(this.h, i) & d) == d;
        }

        private boolean v(View view, CoordinatorLayout coordinatorLayout) {
            if (this.k.getId() != this.f) {
                return false;
            }
            View view2 = this.k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent != null && parent != view) {
                    if (parent instanceof View) {
                        view2 = (View) parent;
                    }
                } else {
                    this.l = null;
                    this.k = null;
                    return false;
                }
            }
            this.l = view2;
            return true;
        }

        public boolean a() {
            return this.k == null && this.f != -1;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            c cVar;
            return view2 == this.l || u(view2, sr.Y(coordinatorLayout)) || ((cVar = this.a) != null && cVar.f(coordinatorLayout, view, view2));
        }

        public boolean c() {
            if (this.a == null) {
                this.m = false;
            }
            return this.m;
        }

        public View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f == -1) {
                this.l = null;
                this.k = null;
                return null;
            }
            if (this.k == null || !v(view, coordinatorLayout)) {
                o(view, coordinatorLayout);
            }
            return this.k;
        }

        @m1
        public int e() {
            return this.f;
        }

        @z1
        public c f() {
            return this.a;
        }

        public boolean g() {
            return this.p;
        }

        public Rect h() {
            return this.q;
        }

        public void i() {
            this.l = null;
            this.k = null;
        }

        public boolean j(CoordinatorLayout coordinatorLayout, View view) {
            boolean z = this.m;
            if (z) {
                return true;
            }
            c cVar = this.a;
            boolean a = (cVar != null ? cVar.a(coordinatorLayout, view) : false) | z;
            this.m = a;
            return a;
        }

        public boolean k(int i) {
            if (i != 0) {
                if (i != 1) {
                    return false;
                }
                return this.o;
            }
            return this.n;
        }

        public void l() {
            this.p = false;
        }

        public void m(int i) {
            t(i, false);
        }

        public void n() {
            this.m = false;
        }

        public void p(@m1 int i) {
            i();
            this.f = i;
        }

        public void q(@z1 c cVar) {
            c cVar2 = this.a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.k();
                }
                this.a = cVar;
                this.r = null;
                this.b = true;
                if (cVar != null) {
                    cVar.h(this);
                }
            }
        }

        public void r(boolean z) {
            this.p = z;
        }

        public void s(Rect rect) {
            this.q.set(rect);
        }

        public void t(int i, boolean z) {
            if (i == 0) {
                this.n = z;
            } else if (i != 1) {
            } else {
                this.o = z;
            }
        }

        public g(@x1 Context context, @z1 AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kf.j.j);
            this.c = obtainStyledAttributes.getInteger(kf.j.k, 0);
            this.f = obtainStyledAttributes.getResourceId(kf.j.l, -1);
            this.d = obtainStyledAttributes.getInteger(kf.j.m, 0);
            this.e = obtainStyledAttributes.getInteger(kf.j.q, -1);
            this.g = obtainStyledAttributes.getInt(kf.j.p, 0);
            this.h = obtainStyledAttributes.getInt(kf.j.o, 0);
            int i = kf.j.n;
            boolean hasValue = obtainStyledAttributes.hasValue(i);
            this.b = hasValue;
            if (hasValue) {
                this.a = CoordinatorLayout.J(context, attributeSet, obtainStyledAttributes.getString(i));
            }
            obtainStyledAttributes.recycle();
            c cVar = this.a;
            if (cVar != null) {
                cVar.h(this);
            }
        }

        public g(g gVar) {
            super((ViewGroup.MarginLayoutParams) gVar);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }
    }
}