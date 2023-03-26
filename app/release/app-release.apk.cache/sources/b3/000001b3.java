package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.p7700g.p99005.ac;
import com.p7700g.p99005.af;
import com.p7700g.p99005.bf;
import com.p7700g.p99005.cc;
import com.p7700g.p99005.cf;
import com.p7700g.p99005.ef;
import com.p7700g.p99005.fc;
import com.p7700g.p99005.ff;
import com.p7700g.p99005.hf;
import com.p7700g.p99005.ic;
import com.p7700g.p99005.j8;
import com.p7700g.p99005.jf;
import com.p7700g.p99005.lc;
import com.p7700g.p99005.sr;
import com.p7700g.p99005.tk;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.xe;
import com.p7700g.p99005.yb;
import com.p7700g.p99005.ye;
import com.p7700g.p99005.z1;
import com.p7700g.p99005.zb;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    private static hf A = null;
    public static final String s = "ConstraintLayout-2.1.4";
    private static final String t = "ConstraintLayout";
    private static final boolean u = true;
    private static final boolean v = false;
    private static final boolean w = false;
    private static final boolean x = false;
    private static final boolean y = false;
    public static final int z = 0;
    public SparseArray<View> B;
    private ArrayList<xe> C;
    public ac D;
    private int E;
    private int F;
    private int G;
    private int H;
    public boolean I;
    private int J;
    private af K;
    public ye L;
    private int M;
    private HashMap<String, Integer> N;
    private int O;
    private int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    private SparseArray<zb> U;
    private cf V;
    private j8 W;
    public c u0;
    private int v0;
    private int w0;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            zb.b.values();
            int[] iArr = new int[4];
            a = iArr;
            try {
                iArr[zb.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[zb.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[zb.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[zb.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements lc.b {
        public ConstraintLayout a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;

        public c(ConstraintLayout l) {
            this.a = l;
        }

        private boolean d(int lastMeasureSpec, int spec, int widgetSize) {
            if (lastMeasureSpec == spec) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(lastMeasureSpec);
            View.MeasureSpec.getSize(lastMeasureSpec);
            int mode2 = View.MeasureSpec.getMode(spec);
            int size = View.MeasureSpec.getSize(spec);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && widgetSize == size;
            }
            return false;
        }

        @Override // com.p7700g.p99005.lc.b
        public final void a() {
            int childCount = this.a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.a.getChildAt(i);
                if (childAt instanceof ef) {
                    ((ef) childAt).b(this.a);
                }
            }
            int size = this.a.C.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    ((xe) this.a.C.get(i2)).E(this.a);
                }
            }
        }

        @Override // com.p7700g.p99005.lc.b
        @SuppressLint({"WrongCall"})
        public final void b(zb widget, lc.a measure) {
            int makeMeasureSpec;
            int makeMeasureSpec2;
            int baseline;
            int max;
            int i;
            int i2;
            int i3;
            if (widget == null) {
                return;
            }
            if (widget.l0() == 8 && !widget.C0()) {
                measure.h = 0;
                measure.i = 0;
                measure.j = 0;
            } else if (widget.U() == null) {
            } else {
                zb.b bVar = measure.d;
                zb.b bVar2 = measure.e;
                int i4 = measure.f;
                int i5 = measure.g;
                int i6 = this.b + this.c;
                int i7 = this.d;
                View view = (View) widget.w();
                int ordinal = bVar.ordinal();
                if (ordinal == 0) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                } else if (ordinal == 1) {
                    makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i7, -2);
                } else if (ordinal != 2) {
                    makeMeasureSpec = ordinal != 3 ? 0 : ViewGroup.getChildMeasureSpec(this.f, widget.I() + i7, -1);
                } else {
                    makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i7, -2);
                    boolean z = widget.c0 == 1;
                    int i8 = measure.m;
                    if (i8 == lc.a.b || i8 == lc.a.c) {
                        if (measure.m == lc.a.c || !z || (z && (view.getMeasuredHeight() == widget.D())) || (view instanceof ef) || widget.G0()) {
                            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(widget.m0(), 1073741824);
                        }
                    }
                }
                int ordinal2 = bVar2.ordinal();
                if (ordinal2 == 0) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
                } else if (ordinal2 == 1) {
                    makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i6, -2);
                } else if (ordinal2 != 2) {
                    makeMeasureSpec2 = ordinal2 != 3 ? 0 : ViewGroup.getChildMeasureSpec(this.g, widget.k0() + i6, -1);
                } else {
                    makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i6, -2);
                    boolean z2 = widget.d0 == 1;
                    int i9 = measure.m;
                    if (i9 == lc.a.b || i9 == lc.a.c) {
                        if (measure.m == lc.a.c || !z2 || (z2 && (view.getMeasuredWidth() == widget.m0())) || (view instanceof ef) || widget.H0()) {
                            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(widget.D(), 1073741824);
                        }
                    }
                }
                ac acVar = (ac) widget.U();
                if (acVar != null && fc.b(ConstraintLayout.this.J, 256) && view.getMeasuredWidth() == widget.m0() && view.getMeasuredWidth() < acVar.m0() && view.getMeasuredHeight() == widget.D() && view.getMeasuredHeight() < acVar.D() && view.getBaseline() == widget.t() && !widget.F0()) {
                    if (d(widget.J(), makeMeasureSpec, widget.m0()) && d(widget.K(), makeMeasureSpec2, widget.D())) {
                        measure.h = widget.m0();
                        measure.i = widget.D();
                        measure.j = widget.t();
                        return;
                    }
                }
                zb.b bVar3 = zb.b.MATCH_CONSTRAINT;
                boolean z3 = bVar == bVar3;
                boolean z4 = bVar2 == bVar3;
                zb.b bVar4 = zb.b.MATCH_PARENT;
                boolean z5 = bVar2 == bVar4 || bVar2 == zb.b.FIXED;
                boolean z6 = bVar == bVar4 || bVar == zb.b.FIXED;
                boolean z7 = z3 && widget.L0 > 0.0f;
                boolean z8 = z4 && widget.L0 > 0.0f;
                if (view == null) {
                    return;
                }
                b bVar5 = (b) view.getLayoutParams();
                int i10 = measure.m;
                if (i10 != lc.a.b && i10 != lc.a.c && z3 && widget.c0 == 0 && z4 && widget.d0 == 0) {
                    i3 = -1;
                    i2 = 0;
                    baseline = 0;
                    max = 0;
                } else {
                    if ((view instanceof jf) && (widget instanceof ic)) {
                        ((jf) view).J((ic) widget, makeMeasureSpec, makeMeasureSpec2);
                    } else {
                        view.measure(makeMeasureSpec, makeMeasureSpec2);
                    }
                    widget.J1(makeMeasureSpec, makeMeasureSpec2);
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    int i11 = widget.f0;
                    max = i11 > 0 ? Math.max(i11, measuredWidth) : measuredWidth;
                    int i12 = widget.g0;
                    if (i12 > 0) {
                        max = Math.min(i12, max);
                    }
                    int i13 = widget.i0;
                    if (i13 > 0) {
                        i2 = Math.max(i13, measuredHeight);
                        i = makeMeasureSpec;
                    } else {
                        i = makeMeasureSpec;
                        i2 = measuredHeight;
                    }
                    int i14 = widget.j0;
                    if (i14 > 0) {
                        i2 = Math.min(i14, i2);
                    }
                    if (!fc.b(ConstraintLayout.this.J, 1)) {
                        if (z7 && z5) {
                            max = (int) ((i2 * widget.L0) + 0.5f);
                        } else if (z8 && z6) {
                            i2 = (int) ((max / widget.L0) + 0.5f);
                        }
                    }
                    if (measuredWidth != max || measuredHeight != i2) {
                        int makeMeasureSpec3 = measuredWidth != max ? View.MeasureSpec.makeMeasureSpec(max, 1073741824) : i;
                        if (measuredHeight != i2) {
                            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
                        }
                        view.measure(makeMeasureSpec3, makeMeasureSpec2);
                        widget.J1(makeMeasureSpec3, makeMeasureSpec2);
                        max = view.getMeasuredWidth();
                        i2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    }
                    i3 = -1;
                }
                boolean z9 = baseline != i3;
                measure.l = (max == measure.f && i2 == measure.g) ? false : true;
                if (bVar5.E0) {
                    z9 = true;
                }
                if (z9 && baseline != -1 && widget.t() != baseline) {
                    measure.l = true;
                }
                measure.h = max;
                measure.i = i2;
                measure.k = z9;
                measure.j = baseline;
            }
        }

        public void c(int widthSpec, int heightSpec, int top, int bottom, int width, int height) {
            this.b = top;
            this.c = bottom;
            this.d = width;
            this.e = height;
            this.f = widthSpec;
            this.g = heightSpec;
        }
    }

    public ConstraintLayout(@x1 Context context) {
        super(context);
        this.B = new SparseArray<>();
        this.C = new ArrayList<>(4);
        this.D = new ac();
        this.E = 0;
        this.F = 0;
        this.G = Integer.MAX_VALUE;
        this.H = Integer.MAX_VALUE;
        this.I = true;
        this.J = 257;
        this.K = null;
        this.L = null;
        this.M = -1;
        this.N = new HashMap<>();
        this.O = -1;
        this.P = -1;
        this.Q = -1;
        this.R = -1;
        this.S = 0;
        this.T = 0;
        this.U = new SparseArray<>();
        this.u0 = new c(this);
        this.v0 = 0;
        this.w0 = 0;
        p(null, 0, 0);
    }

    private void A(zb widget, b layoutParams, SparseArray<zb> idToWidget, int baselineTarget, yb.b type) {
        View view = this.B.get(baselineTarget);
        zb zbVar = idToWidget.get(baselineTarget);
        if (zbVar == null || view == null || !(view.getLayoutParams() instanceof b)) {
            return;
        }
        layoutParams.E0 = true;
        yb.b bVar = yb.b.BASELINE;
        if (type == bVar) {
            b bVar2 = (b) view.getLayoutParams();
            bVar2.E0 = true;
            bVar2.T0.x1(true);
        }
        widget.r(bVar).b(zbVar.r(type), layoutParams.b0, layoutParams.a0, true);
        widget.x1(true);
        widget.r(yb.b.TOP).x();
        widget.r(yb.b.BOTTOM).x();
    }

    private boolean B() {
        int childCount = getChildCount();
        boolean z2 = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (getChildAt(i).isLayoutRequested()) {
                z2 = true;
                break;
            } else {
                i++;
            }
        }
        if (z2) {
            w();
        }
        return z2;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public static hf getSharedValues() {
        if (A == null) {
            A = new hf();
        }
        return A;
    }

    private final zb m(int id) {
        if (id == 0) {
            return this.D;
        }
        View view = this.B.get(id);
        if (view == null && (view = findViewById(id)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.D;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).T0;
    }

    private void p(AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        this.D.h1(this);
        this.D.U2(this.u0);
        this.B.put(getId(), this);
        this.K = null;
        if (attrs != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, ff.m.x6, defStyleAttr, defStyleRes);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == ff.m.O6) {
                    this.E = obtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                } else if (index == ff.m.P6) {
                    this.F = obtainStyledAttributes.getDimensionPixelOffset(index, this.F);
                } else if (index == ff.m.M6) {
                    this.G = obtainStyledAttributes.getDimensionPixelOffset(index, this.G);
                } else if (index == ff.m.N6) {
                    this.H = obtainStyledAttributes.getDimensionPixelOffset(index, this.H);
                } else if (index == ff.m.H8) {
                    this.J = obtainStyledAttributes.getInt(index, this.J);
                } else if (index == ff.m.C7) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            t(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.L = null;
                        }
                    }
                } else if (index == ff.m.g7) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        af afVar = new af();
                        this.K = afVar;
                        afVar.w0(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.K = null;
                    }
                    this.M = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.D.V2(this.J);
    }

    private void s() {
        this.I = true;
        this.O = -1;
        this.P = -1;
        this.Q = -1;
        this.R = -1;
        this.S = 0;
        this.T = 0;
    }

    private void w() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            zb o = o(getChildAt(i));
            if (o != null) {
                o.R0();
            }
        }
        if (isInEditMode) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    x(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    m(childAt.getId()).j1(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.M != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt2 = getChildAt(i3);
                if (childAt2.getId() == this.M && (childAt2 instanceof bf)) {
                    this.K = ((bf) childAt2).getConstraintSet();
                }
            }
        }
        af afVar = this.K;
        if (afVar != null) {
            afVar.t(this, true);
        }
        this.D.p2();
        int size = this.C.size();
        if (size > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                this.C.get(i4).H(this);
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt3 = getChildAt(i5);
            if (childAt3 instanceof ef) {
                ((ef) childAt3).c(this);
            }
        }
        this.U.clear();
        this.U.put(0, this.D);
        this.U.put(getId(), this.D);
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt4 = getChildAt(i6);
            this.U.put(childAt4.getId(), o(childAt4));
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt5 = getChildAt(i7);
            zb o2 = o(childAt5);
            if (o2 != null) {
                b bVar = (b) childAt5.getLayoutParams();
                this.D.b(o2);
                h(isInEditMode, childAt5, o2, bVar, this.U);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams p) {
        return p instanceof b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<xe> arrayList = this.C;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                this.C.get(i).F(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((parseInt / 1080.0f) * width);
                        int i4 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(tk.c);
                        float f = i3;
                        float f2 = i4;
                        float f3 = i3 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float parseInt4 = i4 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, parseInt4, paint);
                        canvas.drawLine(f3, parseInt4, f, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f3, f2, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void forceLayout() {
        s();
        super.forceLayout();
    }

    public int getMaxHeight() {
        return this.H;
    }

    public int getMaxWidth() {
        return this.G;
    }

    public int getMinHeight() {
        return this.F;
    }

    public int getMinWidth() {
        return this.E;
    }

    public int getOptimizationLevel() {
        return this.D.H2();
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        if (this.D.U == null) {
            int id2 = getId();
            if (id2 != -1) {
                this.D.U = getContext().getResources().getResourceEntryName(id2);
            } else {
                this.D.U = "parent";
            }
        }
        if (this.D.y() == null) {
            ac acVar = this.D;
            acVar.j1(acVar.U);
            this.D.y();
        }
        Iterator<zb> it = this.D.l2().iterator();
        while (it.hasNext()) {
            zb next = it.next();
            View view = (View) next.w();
            if (view != null) {
                if (next.U == null && (id = view.getId()) != -1) {
                    next.U = getContext().getResources().getResourceEntryName(id);
                }
                if (next.y() == null) {
                    next.j1(next.U);
                    next.y();
                }
            }
        }
        this.D.b0(sb);
        return sb.toString();
    }

    public void h(boolean isInEditMode, View child, zb widget, b layoutParams, SparseArray<zb> idToWidget) {
        zb zbVar;
        zb zbVar2;
        zb zbVar3;
        zb zbVar4;
        int i;
        layoutParams.e();
        layoutParams.U0 = false;
        widget.b2(child.getVisibility());
        if (layoutParams.H0) {
            widget.H1(true);
            widget.b2(8);
        }
        widget.h1(child);
        if (child instanceof xe) {
            ((xe) child).B(widget, this.D.O2());
        }
        if (layoutParams.F0) {
            cc ccVar = (cc) widget;
            int i2 = layoutParams.Q0;
            int i3 = layoutParams.R0;
            float f = layoutParams.S0;
            if (f != -1.0f) {
                ccVar.y2(f);
                return;
            } else if (i2 != -1) {
                ccVar.w2(i2);
                return;
            } else if (i3 != -1) {
                ccVar.x2(i3);
                return;
            } else {
                return;
            }
        }
        int i4 = layoutParams.J0;
        int i5 = layoutParams.K0;
        int i6 = layoutParams.L0;
        int i7 = layoutParams.M0;
        int i8 = layoutParams.N0;
        int i9 = layoutParams.O0;
        float f2 = layoutParams.P0;
        int i10 = layoutParams.N;
        if (i10 != -1) {
            zb zbVar5 = idToWidget.get(i10);
            if (zbVar5 != null) {
                widget.m(zbVar5, layoutParams.P, layoutParams.O);
            }
        } else {
            if (i4 != -1) {
                zb zbVar6 = idToWidget.get(i4);
                if (zbVar6 != null) {
                    yb.b bVar = yb.b.LEFT;
                    widget.v0(bVar, zbVar6, bVar, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i8);
                }
            } else if (i5 != -1 && (zbVar = idToWidget.get(i5)) != null) {
                widget.v0(yb.b.LEFT, zbVar, yb.b.RIGHT, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i8);
            }
            if (i6 != -1) {
                zb zbVar7 = idToWidget.get(i6);
                if (zbVar7 != null) {
                    widget.v0(yb.b.RIGHT, zbVar7, yb.b.LEFT, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i9);
                }
            } else if (i7 != -1 && (zbVar2 = idToWidget.get(i7)) != null) {
                yb.b bVar2 = yb.b.RIGHT;
                widget.v0(bVar2, zbVar2, bVar2, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i9);
            }
            int i11 = layoutParams.G;
            if (i11 != -1) {
                zb zbVar8 = idToWidget.get(i11);
                if (zbVar8 != null) {
                    yb.b bVar3 = yb.b.TOP;
                    widget.v0(bVar3, zbVar8, bVar3, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.V);
                }
            } else {
                int i12 = layoutParams.H;
                if (i12 != -1 && (zbVar3 = idToWidget.get(i12)) != null) {
                    widget.v0(yb.b.TOP, zbVar3, yb.b.BOTTOM, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.V);
                }
            }
            int i13 = layoutParams.I;
            if (i13 != -1) {
                zb zbVar9 = idToWidget.get(i13);
                if (zbVar9 != null) {
                    widget.v0(yb.b.BOTTOM, zbVar9, yb.b.TOP, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.X);
                }
            } else {
                int i14 = layoutParams.J;
                if (i14 != -1 && (zbVar4 = idToWidget.get(i14)) != null) {
                    yb.b bVar4 = yb.b.BOTTOM;
                    widget.v0(bVar4, zbVar4, bVar4, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.X);
                }
            }
            int i15 = layoutParams.K;
            if (i15 != -1) {
                A(widget, layoutParams, idToWidget, i15, yb.b.BASELINE);
            } else {
                int i16 = layoutParams.L;
                if (i16 != -1) {
                    A(widget, layoutParams, idToWidget, i16, yb.b.TOP);
                } else {
                    int i17 = layoutParams.M;
                    if (i17 != -1) {
                        A(widget, layoutParams, idToWidget, i17, yb.b.BOTTOM);
                    }
                }
            }
            if (f2 >= 0.0f) {
                widget.A1(f2);
            }
            float f3 = layoutParams.f0;
            if (f3 >= 0.0f) {
                widget.V1(f3);
            }
        }
        if (isInEditMode && ((i = layoutParams.v0) != -1 || layoutParams.w0 != -1)) {
            widget.R1(i, layoutParams.w0);
        }
        if (!layoutParams.C0) {
            if (((ViewGroup.MarginLayoutParams) layoutParams).width == -1) {
                if (layoutParams.y0) {
                    widget.D1(zb.b.MATCH_CONSTRAINT);
                } else {
                    widget.D1(zb.b.MATCH_PARENT);
                }
                widget.r(yb.b.LEFT).i = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                widget.r(yb.b.RIGHT).i = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            } else {
                widget.D1(zb.b.MATCH_CONSTRAINT);
                widget.c2(0);
            }
        } else {
            widget.D1(zb.b.FIXED);
            widget.c2(((ViewGroup.MarginLayoutParams) layoutParams).width);
            if (((ViewGroup.MarginLayoutParams) layoutParams).width == -2) {
                widget.D1(zb.b.WRAP_CONTENT);
            }
        }
        if (!layoutParams.D0) {
            if (((ViewGroup.MarginLayoutParams) layoutParams).height == -1) {
                if (layoutParams.z0) {
                    widget.Y1(zb.b.MATCH_CONSTRAINT);
                } else {
                    widget.Y1(zb.b.MATCH_PARENT);
                }
                widget.r(yb.b.TOP).i = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                widget.r(yb.b.BOTTOM).i = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            } else {
                widget.Y1(zb.b.MATCH_CONSTRAINT);
                widget.y1(0);
            }
        } else {
            widget.Y1(zb.b.FIXED);
            widget.y1(((ViewGroup.MarginLayoutParams) layoutParams).height);
            if (((ViewGroup.MarginLayoutParams) layoutParams).height == -2) {
                widget.Y1(zb.b.WRAP_CONTENT);
            }
        }
        widget.n1(layoutParams.g0);
        widget.F1(layoutParams.j0);
        widget.a2(layoutParams.k0);
        widget.B1(layoutParams.l0);
        widget.W1(layoutParams.m0);
        widget.e2(layoutParams.B0);
        widget.E1(layoutParams.n0, layoutParams.p0, layoutParams.r0, layoutParams.t0);
        widget.Z1(layoutParams.o0, layoutParams.q0, layoutParams.s0, layoutParams.u0);
    }

    public void i(j8 metrics) {
        this.W = metrics;
        this.D.E2(metrics);
    }

    @Override // android.view.ViewGroup
    /* renamed from: j */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: k */
    public b generateLayoutParams(AttributeSet attrs) {
        return new b(getContext(), attrs);
    }

    public Object l(int type, Object value) {
        if (type == 0 && (value instanceof String)) {
            String str = (String) value;
            HashMap<String, Integer> hashMap = this.N;
            if (hashMap == null || !hashMap.containsKey(str)) {
                return null;
            }
            return this.N.get(str);
        }
        return null;
    }

    public View n(int id) {
        return this.B.get(id);
    }

    public final zb o(View view) {
        if (view == this) {
            return this.D;
        }
        if (view != null) {
            if (view.getLayoutParams() instanceof b) {
                return ((b) view.getLayoutParams()).T0;
            }
            view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
            if (view.getLayoutParams() instanceof b) {
                return ((b) view.getLayoutParams()).T0;
            }
            return null;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            b bVar = (b) childAt.getLayoutParams();
            zb zbVar = bVar.T0;
            if ((childAt.getVisibility() != 8 || bVar.F0 || bVar.G0 || bVar.I0 || isInEditMode) && !bVar.H0) {
                int o0 = zbVar.o0();
                int p0 = zbVar.p0();
                int m0 = zbVar.m0() + o0;
                int D = zbVar.D() + p0;
                childAt.layout(o0, p0, m0, D);
                if ((childAt instanceof ef) && (content = ((ef) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(o0, p0, m0, D);
                }
            }
        }
        int size = this.C.size();
        if (size > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                this.C.get(i2).D(this);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.v0 == widthMeasureSpec) {
            int i = this.w0;
        }
        if (!this.I) {
            int childCount = getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    break;
                } else if (getChildAt(i2).isLayoutRequested()) {
                    this.I = true;
                    break;
                } else {
                    i2++;
                }
            }
        }
        boolean z2 = this.I;
        this.v0 = widthMeasureSpec;
        this.w0 = heightMeasureSpec;
        this.D.Y2(q());
        if (this.I) {
            this.I = false;
            if (B()) {
                this.D.a3();
            }
        }
        v(this.D, this.J, widthMeasureSpec, heightMeasureSpec);
        u(widthMeasureSpec, heightMeasureSpec, this.D.m0(), this.D.D(), this.D.P2(), this.D.N2());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        zb o = o(view);
        if ((view instanceof Guideline) && !(o instanceof cc)) {
            b bVar = (b) view.getLayoutParams();
            cc ccVar = new cc();
            bVar.T0 = ccVar;
            bVar.F0 = true;
            ccVar.B2(bVar.x0);
        }
        if (view instanceof xe) {
            xe xeVar = (xe) view;
            xeVar.I();
            ((b) view.getLayoutParams()).G0 = true;
            if (!this.C.contains(xeVar)) {
                this.C.add(xeVar);
            }
        }
        this.B.put(view.getId(), view);
        this.I = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.B.remove(view.getId());
        this.D.o2(o(view));
        this.C.remove(view);
        this.I = true;
    }

    public boolean q() {
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    public void r(int layoutDescription) {
        if (layoutDescription != 0) {
            try {
                this.L = new ye(getContext(), this, layoutDescription);
                return;
            } catch (Resources.NotFoundException unused) {
                this.L = null;
                return;
            }
        }
        this.L = null;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        s();
        super.requestLayout();
    }

    public void setConstraintSet(af set) {
        this.K = set;
    }

    @Override // android.view.View
    public void setId(int id) {
        this.B.remove(getId());
        super.setId(id);
        this.B.put(getId(), this);
    }

    public void setMaxHeight(int value) {
        if (value == this.H) {
            return;
        }
        this.H = value;
        requestLayout();
    }

    public void setMaxWidth(int value) {
        if (value == this.G) {
            return;
        }
        this.G = value;
        requestLayout();
    }

    public void setMinHeight(int value) {
        if (value == this.F) {
            return;
        }
        this.F = value;
        requestLayout();
    }

    public void setMinWidth(int value) {
        if (value == this.E) {
            return;
        }
        this.E = value;
        requestLayout();
    }

    public void setOnConstraintsChanged(cf constraintsChangedListener) {
        this.V = constraintsChangedListener;
        ye yeVar = this.L;
        if (yeVar != null) {
            yeVar.d(constraintsChangedListener);
        }
    }

    public void setOptimizationLevel(int level) {
        this.J = level;
        this.D.V2(level);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public void t(int id) {
        this.L = new ye(getContext(), this, id);
    }

    public void u(int widthMeasureSpec, int heightMeasureSpec, int measuredWidth, int measuredHeight, boolean isWidthMeasuredTooSmall, boolean isHeightMeasuredTooSmall) {
        c cVar = this.u0;
        int i = cVar.e;
        int resolveSizeAndState = ViewGroup.resolveSizeAndState(measuredWidth + cVar.d, widthMeasureSpec, 0);
        int resolveSizeAndState2 = ViewGroup.resolveSizeAndState(measuredHeight + i, heightMeasureSpec, 0);
        int i2 = resolveSizeAndState & sr.s;
        int i3 = resolveSizeAndState2 & sr.s;
        int min = Math.min(this.G, i2);
        int min2 = Math.min(this.H, i3);
        if (isWidthMeasuredTooSmall) {
            min |= 16777216;
        }
        if (isHeightMeasuredTooSmall) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.O = min;
        this.P = min2;
    }

    public void v(ac layout, int optimizationLevel, int widthMeasureSpec, int heightMeasureSpec) {
        int i;
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i2 = max + max2;
        int paddingWidth = getPaddingWidth();
        this.u0.c(widthMeasureSpec, heightMeasureSpec, max, max2, paddingWidth, i2);
        int max3 = Math.max(0, getPaddingStart());
        int max4 = Math.max(0, getPaddingEnd());
        if (max3 <= 0 && max4 <= 0) {
            i = Math.max(0, getPaddingLeft());
        } else {
            i = q() ? max4 : max3;
        }
        int i3 = size - paddingWidth;
        int i4 = size2 - i2;
        y(layout, mode, i3, mode2, i4);
        layout.Q2(optimizationLevel, mode, i3, mode2, i4, this.O, this.P, i, max);
    }

    public void x(int type, Object value1, Object value2) {
        if (type == 0 && (value1 instanceof String) && (value2 instanceof Integer)) {
            if (this.N == null) {
                this.N = new HashMap<>();
            }
            String str = (String) value1;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.N.put(str, Integer.valueOf(((Integer) value2).intValue()));
        }
    }

    public void y(ac layout, int widthMode, int widthSize, int heightMode, int heightSize) {
        zb.b bVar;
        c cVar = this.u0;
        int i = cVar.e;
        int i2 = cVar.d;
        zb.b bVar2 = zb.b.FIXED;
        int childCount = getChildCount();
        if (widthMode == Integer.MIN_VALUE) {
            bVar = zb.b.WRAP_CONTENT;
            if (childCount == 0) {
                widthSize = Math.max(0, this.E);
            }
        } else if (widthMode == 0) {
            bVar = zb.b.WRAP_CONTENT;
            if (childCount == 0) {
                widthSize = Math.max(0, this.E);
            }
            widthSize = 0;
        } else if (widthMode != 1073741824) {
            bVar = bVar2;
            widthSize = 0;
        } else {
            widthSize = Math.min(this.G - i2, widthSize);
            bVar = bVar2;
        }
        if (heightMode == Integer.MIN_VALUE) {
            bVar2 = zb.b.WRAP_CONTENT;
            if (childCount == 0) {
                heightSize = Math.max(0, this.F);
            }
        } else if (heightMode != 0) {
            if (heightMode == 1073741824) {
                heightSize = Math.min(this.H - i, heightSize);
            }
            heightSize = 0;
        } else {
            bVar2 = zb.b.WRAP_CONTENT;
            if (childCount == 0) {
                heightSize = Math.max(0, this.F);
            }
            heightSize = 0;
        }
        if (widthSize != layout.m0() || heightSize != layout.D()) {
            layout.M2();
        }
        layout.f2(0);
        layout.g2(0);
        layout.M1(this.G - i2);
        layout.L1(this.H - i);
        layout.P1(0);
        layout.O1(0);
        layout.D1(bVar);
        layout.c2(widthSize);
        layout.Y1(bVar2);
        layout.y1(heightSize);
        layout.P1(this.E - i2);
        layout.O1(this.F - i);
    }

    public void z(int id, int screenWidth, int screenHeight) {
        ye yeVar = this.L;
        if (yeVar != null) {
            yeVar.e(id, screenWidth, screenHeight);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p) {
        return new b(p);
    }

    public ConstraintLayout(@x1 Context context, @z1 AttributeSet attrs) {
        super(context, attrs);
        this.B = new SparseArray<>();
        this.C = new ArrayList<>(4);
        this.D = new ac();
        this.E = 0;
        this.F = 0;
        this.G = Integer.MAX_VALUE;
        this.H = Integer.MAX_VALUE;
        this.I = true;
        this.J = 257;
        this.K = null;
        this.L = null;
        this.M = -1;
        this.N = new HashMap<>();
        this.O = -1;
        this.P = -1;
        this.Q = -1;
        this.R = -1;
        this.S = 0;
        this.T = 0;
        this.U = new SparseArray<>();
        this.u0 = new c(this);
        this.v0 = 0;
        this.w0 = 0;
        p(attrs, 0, 0);
    }

    public ConstraintLayout(@x1 Context context, @z1 AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.B = new SparseArray<>();
        this.C = new ArrayList<>(4);
        this.D = new ac();
        this.E = 0;
        this.F = 0;
        this.G = Integer.MAX_VALUE;
        this.H = Integer.MAX_VALUE;
        this.I = true;
        this.J = 257;
        this.K = null;
        this.L = null;
        this.M = -1;
        this.N = new HashMap<>();
        this.O = -1;
        this.P = -1;
        this.Q = -1;
        this.R = -1;
        this.S = 0;
        this.T = 0;
        this.U = new SparseArray<>();
        this.u0 = new c(this);
        this.v0 = 0;
        this.w0 = 0;
        p(attrs, defStyleAttr, 0);
    }

    @TargetApi(21)
    public ConstraintLayout(@x1 Context context, @z1 AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.B = new SparseArray<>();
        this.C = new ArrayList<>(4);
        this.D = new ac();
        this.E = 0;
        this.F = 0;
        this.G = Integer.MAX_VALUE;
        this.H = Integer.MAX_VALUE;
        this.I = true;
        this.J = 257;
        this.K = null;
        this.L = null;
        this.M = -1;
        this.N = new HashMap<>();
        this.O = -1;
        this.P = -1;
        this.Q = -1;
        this.R = -1;
        this.S = 0;
        this.T = 0;
        this.U = new SparseArray<>();
        this.u0 = new c(this);
        this.v0 = 0;
        this.w0 = 0;
        p(attrs, defStyleAttr, defStyleRes);
    }

    /* loaded from: classes.dex */
    public static class b extends ViewGroup.MarginLayoutParams {
        public static final int a = 0;
        public static final int b = 0;
        public static final int c = -1;
        public static final int d = Integer.MIN_VALUE;
        public static final int e = 0;
        public static final int f = 1;
        public static final int g = 1;
        public static final int h = 2;
        public static final int i = 3;
        public static final int j = 4;
        public static final int k = 5;
        public static final int l = 6;
        public static final int m = 7;
        public static final int n = 8;
        public static final int o = 1;
        public static final int p = 0;
        public static final int q = 2;
        public static final int r = 0;
        public static final int s = 1;
        public static final int t = 2;
        public static final int u = 0;
        public static final int v = 1;
        public static final int w = 2;
        public static final int x = 3;
        public float A;
        public String A0;
        public boolean B;
        public int B0;
        public int C;
        public boolean C0;
        public int D;
        public boolean D0;
        public int E;
        public boolean E0;
        public int F;
        public boolean F0;
        public int G;
        public boolean G0;
        public int H;
        public boolean H0;
        public int I;
        public boolean I0;
        public int J;
        public int J0;
        public int K;
        public int K0;
        public int L;
        public int L0;
        public int M;
        public int M0;
        public int N;
        public int N0;
        public int O;
        public int O0;
        public float P;
        public float P0;
        public int Q;
        public int Q0;
        public int R;
        public int R0;
        public int S;
        public float S0;
        public int T;
        public zb T0;
        public int U;
        public boolean U0;
        public int V;
        public int W;
        public int X;
        public int Y;
        public int Z;
        public int a0;
        public int b0;
        public boolean c0;
        public boolean d0;
        public float e0;
        public float f0;
        public String g0;
        public float h0;
        public int i0;
        public float j0;
        public float k0;
        public int l0;
        public int m0;
        public int n0;
        public int o0;
        public int p0;
        public int q0;
        public int r0;
        public int s0;
        public float t0;
        public float u0;
        public int v0;
        public int w0;
        public int x0;
        public int y;
        public boolean y0;
        public int z;
        public boolean z0;

        /* loaded from: classes.dex */
        public static class a {
            public static final int A = 26;
            public static final int B = 27;
            public static final int C = 28;
            public static final int D = 29;
            public static final int E = 30;
            public static final int F = 31;
            public static final int G = 32;
            public static final int H = 33;
            public static final int I = 34;
            public static final int J = 35;
            public static final int K = 36;
            public static final int L = 37;
            public static final int M = 38;
            public static final int N = 39;
            public static final int O = 40;
            public static final int P = 41;
            public static final int Q = 42;
            public static final int R = 43;
            public static final int S = 44;
            public static final int T = 45;
            public static final int U = 46;
            public static final int V = 47;
            public static final int W = 48;
            public static final int X = 49;
            public static final int Y = 50;
            public static final int Z = 51;
            public static final int a = 0;
            public static final int a0 = 52;
            public static final int b = 1;
            public static final int b0 = 53;
            public static final int c = 2;
            public static final int c0 = 54;
            public static final int d = 3;
            public static final int d0 = 55;
            public static final int e = 4;
            public static final int e0 = 64;
            public static final int f = 5;
            public static final int f0 = 65;
            public static final int g = 6;
            public static final int g0 = 66;
            public static final int h = 7;
            public static final int h0 = 67;
            public static final int i = 8;
            public static final SparseIntArray i0;
            public static final int j = 9;
            public static final int k = 10;
            public static final int l = 11;
            public static final int m = 12;
            public static final int n = 13;
            public static final int o = 14;
            public static final int p = 15;
            public static final int q = 16;
            public static final int r = 17;
            public static final int s = 18;
            public static final int t = 19;
            public static final int u = 20;
            public static final int v = 21;
            public static final int w = 22;
            public static final int x = 23;
            public static final int y = 24;
            public static final int z = 25;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                i0 = sparseIntArray;
                sparseIntArray.append(ff.m.s8, 64);
                sparseIntArray.append(ff.m.V7, 65);
                sparseIntArray.append(ff.m.e8, 8);
                sparseIntArray.append(ff.m.f8, 9);
                sparseIntArray.append(ff.m.h8, 10);
                sparseIntArray.append(ff.m.i8, 11);
                sparseIntArray.append(ff.m.o8, 12);
                sparseIntArray.append(ff.m.n8, 13);
                sparseIntArray.append(ff.m.L7, 14);
                sparseIntArray.append(ff.m.K7, 15);
                sparseIntArray.append(ff.m.G7, 16);
                sparseIntArray.append(ff.m.I7, 52);
                sparseIntArray.append(ff.m.H7, 53);
                sparseIntArray.append(ff.m.M7, 2);
                sparseIntArray.append(ff.m.O7, 3);
                sparseIntArray.append(ff.m.N7, 4);
                sparseIntArray.append(ff.m.x8, 49);
                sparseIntArray.append(ff.m.y8, 50);
                sparseIntArray.append(ff.m.S7, 5);
                sparseIntArray.append(ff.m.T7, 6);
                sparseIntArray.append(ff.m.U7, 7);
                sparseIntArray.append(ff.m.B7, 67);
                sparseIntArray.append(ff.m.y6, 1);
                sparseIntArray.append(ff.m.j8, 17);
                sparseIntArray.append(ff.m.k8, 18);
                sparseIntArray.append(ff.m.R7, 19);
                sparseIntArray.append(ff.m.Q7, 20);
                sparseIntArray.append(ff.m.C8, 21);
                sparseIntArray.append(ff.m.F8, 22);
                sparseIntArray.append(ff.m.D8, 23);
                sparseIntArray.append(ff.m.A8, 24);
                sparseIntArray.append(ff.m.E8, 25);
                sparseIntArray.append(ff.m.B8, 26);
                sparseIntArray.append(ff.m.z8, 55);
                sparseIntArray.append(ff.m.G8, 54);
                sparseIntArray.append(ff.m.a8, 29);
                sparseIntArray.append(ff.m.p8, 30);
                sparseIntArray.append(ff.m.P7, 44);
                sparseIntArray.append(ff.m.c8, 45);
                sparseIntArray.append(ff.m.r8, 46);
                sparseIntArray.append(ff.m.b8, 47);
                sparseIntArray.append(ff.m.q8, 48);
                sparseIntArray.append(ff.m.E7, 27);
                sparseIntArray.append(ff.m.D7, 28);
                sparseIntArray.append(ff.m.t8, 31);
                sparseIntArray.append(ff.m.W7, 32);
                sparseIntArray.append(ff.m.v8, 33);
                sparseIntArray.append(ff.m.u8, 34);
                sparseIntArray.append(ff.m.w8, 35);
                sparseIntArray.append(ff.m.Y7, 36);
                SparseIntArray sparseIntArray2 = i0;
                sparseIntArray2.append(ff.m.X7, 37);
                sparseIntArray2.append(ff.m.Z7, 38);
                sparseIntArray2.append(ff.m.d8, 39);
                sparseIntArray2.append(ff.m.m8, 40);
                sparseIntArray2.append(ff.m.g8, 41);
                sparseIntArray2.append(ff.m.J7, 42);
                sparseIntArray2.append(ff.m.F7, 43);
                sparseIntArray2.append(ff.m.l8, 51);
                sparseIntArray2.append(ff.m.I8, 66);
            }

            private a() {
            }
        }

        public b(b source) {
            super((ViewGroup.MarginLayoutParams) source);
            this.y = -1;
            this.z = -1;
            this.A = -1.0f;
            this.B = true;
            this.C = -1;
            this.D = -1;
            this.E = -1;
            this.F = -1;
            this.G = -1;
            this.H = -1;
            this.I = -1;
            this.J = -1;
            this.K = -1;
            this.L = -1;
            this.M = -1;
            this.N = -1;
            this.O = 0;
            this.P = 0.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = -1;
            this.U = Integer.MIN_VALUE;
            this.V = Integer.MIN_VALUE;
            this.W = Integer.MIN_VALUE;
            this.X = Integer.MIN_VALUE;
            this.Y = Integer.MIN_VALUE;
            this.Z = Integer.MIN_VALUE;
            this.a0 = Integer.MIN_VALUE;
            this.b0 = 0;
            this.c0 = true;
            this.d0 = true;
            this.e0 = 0.5f;
            this.f0 = 0.5f;
            this.g0 = null;
            this.h0 = 0.0f;
            this.i0 = 1;
            this.j0 = -1.0f;
            this.k0 = -1.0f;
            this.l0 = 0;
            this.m0 = 0;
            this.n0 = 0;
            this.o0 = 0;
            this.p0 = 0;
            this.q0 = 0;
            this.r0 = 0;
            this.s0 = 0;
            this.t0 = 1.0f;
            this.u0 = 1.0f;
            this.v0 = -1;
            this.w0 = -1;
            this.x0 = -1;
            this.y0 = false;
            this.z0 = false;
            this.A0 = null;
            this.B0 = 0;
            this.C0 = true;
            this.D0 = true;
            this.E0 = false;
            this.F0 = false;
            this.G0 = false;
            this.H0 = false;
            this.I0 = false;
            this.J0 = -1;
            this.K0 = -1;
            this.L0 = -1;
            this.M0 = -1;
            this.N0 = Integer.MIN_VALUE;
            this.O0 = Integer.MIN_VALUE;
            this.P0 = 0.5f;
            this.T0 = new zb();
            this.U0 = false;
            this.y = source.y;
            this.z = source.z;
            this.A = source.A;
            this.B = source.B;
            this.C = source.C;
            this.D = source.D;
            this.E = source.E;
            this.F = source.F;
            this.G = source.G;
            this.H = source.H;
            this.I = source.I;
            this.J = source.J;
            this.K = source.K;
            this.L = source.L;
            this.M = source.M;
            this.N = source.N;
            this.O = source.O;
            this.P = source.P;
            this.Q = source.Q;
            this.R = source.R;
            this.S = source.S;
            this.T = source.T;
            this.U = source.U;
            this.V = source.V;
            this.W = source.W;
            this.X = source.X;
            this.Y = source.Y;
            this.Z = source.Z;
            this.a0 = source.a0;
            this.b0 = source.b0;
            this.e0 = source.e0;
            this.f0 = source.f0;
            this.g0 = source.g0;
            this.h0 = source.h0;
            this.i0 = source.i0;
            this.j0 = source.j0;
            this.k0 = source.k0;
            this.l0 = source.l0;
            this.m0 = source.m0;
            this.y0 = source.y0;
            this.z0 = source.z0;
            this.n0 = source.n0;
            this.o0 = source.o0;
            this.p0 = source.p0;
            this.r0 = source.r0;
            this.q0 = source.q0;
            this.s0 = source.s0;
            this.t0 = source.t0;
            this.u0 = source.u0;
            this.v0 = source.v0;
            this.w0 = source.w0;
            this.x0 = source.x0;
            this.C0 = source.C0;
            this.D0 = source.D0;
            this.E0 = source.E0;
            this.F0 = source.F0;
            this.J0 = source.J0;
            this.K0 = source.K0;
            this.L0 = source.L0;
            this.M0 = source.M0;
            this.N0 = source.N0;
            this.O0 = source.O0;
            this.P0 = source.P0;
            this.A0 = source.A0;
            this.B0 = source.B0;
            this.T0 = source.T0;
            this.c0 = source.c0;
            this.d0 = source.d0;
        }

        public String a() {
            return this.A0;
        }

        public zb b() {
            return this.T0;
        }

        public void c() {
            zb zbVar = this.T0;
            if (zbVar != null) {
                zbVar.R0();
            }
        }

        public void d(String text) {
            this.T0.j1(text);
        }

        public void e() {
            this.F0 = false;
            this.C0 = true;
            this.D0 = true;
            int i2 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i2 == -2 && this.y0) {
                this.C0 = false;
                if (this.n0 == 0) {
                    this.n0 = 1;
                }
            }
            int i3 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i3 == -2 && this.z0) {
                this.D0 = false;
                if (this.o0 == 0) {
                    this.o0 = 1;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.C0 = false;
                if (i2 == 0 && this.n0 == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.y0 = true;
                }
            }
            if (i3 == 0 || i3 == -1) {
                this.D0 = false;
                if (i3 == 0 && this.o0 == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.z0 = true;
                }
            }
            if (this.A == -1.0f && this.y == -1 && this.z == -1) {
                return;
            }
            this.F0 = true;
            this.C0 = true;
            this.D0 = true;
            if (!(this.T0 instanceof cc)) {
                this.T0 = new cc();
            }
            ((cc) this.T0).B2(this.x0);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0086  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void resolveLayoutDirection(int layoutDirection) {
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i7 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(layoutDirection);
            boolean z = false;
            boolean z2 = 1 == getLayoutDirection();
            this.L0 = -1;
            this.M0 = -1;
            this.J0 = -1;
            this.K0 = -1;
            this.N0 = -1;
            this.O0 = -1;
            this.N0 = this.U;
            this.O0 = this.W;
            float f2 = this.e0;
            this.P0 = f2;
            int i8 = this.y;
            this.Q0 = i8;
            int i9 = this.z;
            this.R0 = i9;
            float f3 = this.A;
            this.S0 = f3;
            if (z2) {
                int i10 = this.Q;
                if (i10 != -1) {
                    this.L0 = i10;
                } else {
                    int i11 = this.R;
                    if (i11 != -1) {
                        this.M0 = i11;
                    }
                    i2 = this.S;
                    if (i2 != -1) {
                        this.K0 = i2;
                        z = true;
                    }
                    i3 = this.T;
                    if (i3 != -1) {
                        this.J0 = i3;
                        z = true;
                    }
                    i4 = this.Y;
                    if (i4 != Integer.MIN_VALUE) {
                        this.O0 = i4;
                    }
                    i5 = this.Z;
                    if (i5 != Integer.MIN_VALUE) {
                        this.N0 = i5;
                    }
                    if (z) {
                        this.P0 = 1.0f - f2;
                    }
                    if (this.F0 && this.x0 == 1 && this.B) {
                        if (f3 == -1.0f) {
                            this.S0 = 1.0f - f3;
                            this.Q0 = -1;
                            this.R0 = -1;
                        } else if (i8 != -1) {
                            this.R0 = i8;
                            this.Q0 = -1;
                            this.S0 = -1.0f;
                        } else if (i9 != -1) {
                            this.Q0 = i9;
                            this.R0 = -1;
                            this.S0 = -1.0f;
                        }
                    }
                }
                z = true;
                i2 = this.S;
                if (i2 != -1) {
                }
                i3 = this.T;
                if (i3 != -1) {
                }
                i4 = this.Y;
                if (i4 != Integer.MIN_VALUE) {
                }
                i5 = this.Z;
                if (i5 != Integer.MIN_VALUE) {
                }
                if (z) {
                }
                if (this.F0) {
                    if (f3 == -1.0f) {
                    }
                }
            } else {
                int i12 = this.Q;
                if (i12 != -1) {
                    this.K0 = i12;
                }
                int i13 = this.R;
                if (i13 != -1) {
                    this.J0 = i13;
                }
                int i14 = this.S;
                if (i14 != -1) {
                    this.L0 = i14;
                }
                int i15 = this.T;
                if (i15 != -1) {
                    this.M0 = i15;
                }
                int i16 = this.Y;
                if (i16 != Integer.MIN_VALUE) {
                    this.N0 = i16;
                }
                int i17 = this.Z;
                if (i17 != Integer.MIN_VALUE) {
                    this.O0 = i17;
                }
            }
            if (this.S == -1 && this.T == -1 && this.R == -1 && this.Q == -1) {
                int i18 = this.E;
                if (i18 != -1) {
                    this.L0 = i18;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                    }
                } else {
                    int i19 = this.F;
                    if (i19 != -1) {
                        this.M0 = i19;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                        }
                    }
                }
                int i20 = this.C;
                if (i20 != -1) {
                    this.J0 = i20;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                    return;
                }
                int i21 = this.D;
                if (i21 != -1) {
                    this.K0 = i21;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                }
            }
        }

        public b(Context c2, AttributeSet attrs) {
            super(c2, attrs);
            this.y = -1;
            this.z = -1;
            this.A = -1.0f;
            this.B = true;
            this.C = -1;
            this.D = -1;
            this.E = -1;
            this.F = -1;
            this.G = -1;
            this.H = -1;
            this.I = -1;
            this.J = -1;
            this.K = -1;
            this.L = -1;
            this.M = -1;
            this.N = -1;
            this.O = 0;
            this.P = 0.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = -1;
            this.U = Integer.MIN_VALUE;
            this.V = Integer.MIN_VALUE;
            this.W = Integer.MIN_VALUE;
            this.X = Integer.MIN_VALUE;
            this.Y = Integer.MIN_VALUE;
            this.Z = Integer.MIN_VALUE;
            this.a0 = Integer.MIN_VALUE;
            this.b0 = 0;
            this.c0 = true;
            this.d0 = true;
            this.e0 = 0.5f;
            this.f0 = 0.5f;
            this.g0 = null;
            this.h0 = 0.0f;
            this.i0 = 1;
            this.j0 = -1.0f;
            this.k0 = -1.0f;
            this.l0 = 0;
            this.m0 = 0;
            this.n0 = 0;
            this.o0 = 0;
            this.p0 = 0;
            this.q0 = 0;
            this.r0 = 0;
            this.s0 = 0;
            this.t0 = 1.0f;
            this.u0 = 1.0f;
            this.v0 = -1;
            this.w0 = -1;
            this.x0 = -1;
            this.y0 = false;
            this.z0 = false;
            this.A0 = null;
            this.B0 = 0;
            this.C0 = true;
            this.D0 = true;
            this.E0 = false;
            this.F0 = false;
            this.G0 = false;
            this.H0 = false;
            this.I0 = false;
            this.J0 = -1;
            this.K0 = -1;
            this.L0 = -1;
            this.M0 = -1;
            this.N0 = Integer.MIN_VALUE;
            this.O0 = Integer.MIN_VALUE;
            this.P0 = 0.5f;
            this.T0 = new zb();
            this.U0 = false;
            TypedArray obtainStyledAttributes = c2.obtainStyledAttributes(attrs, ff.m.x6);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                int i3 = a.i0.get(index);
                switch (i3) {
                    case 1:
                        this.x0 = obtainStyledAttributes.getInt(index, this.x0);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.N);
                        this.N = resourceId;
                        if (resourceId == -1) {
                            this.N = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 4:
                        float f2 = obtainStyledAttributes.getFloat(index, this.P) % 360.0f;
                        this.P = f2;
                        if (f2 < 0.0f) {
                            this.P = (360.0f - f2) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.y = obtainStyledAttributes.getDimensionPixelOffset(index, this.y);
                        break;
                    case 6:
                        this.z = obtainStyledAttributes.getDimensionPixelOffset(index, this.z);
                        break;
                    case 7:
                        this.A = obtainStyledAttributes.getFloat(index, this.A);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.C);
                        this.C = resourceId2;
                        if (resourceId2 == -1) {
                            this.C = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.D);
                        this.D = resourceId3;
                        if (resourceId3 == -1) {
                            this.D = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.E);
                        this.E = resourceId4;
                        if (resourceId4 == -1) {
                            this.E = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.F);
                        this.F = resourceId5;
                        if (resourceId5 == -1) {
                            this.F = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.G);
                        this.G = resourceId6;
                        if (resourceId6 == -1) {
                            this.G = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.H);
                        this.H = resourceId7;
                        if (resourceId7 == -1) {
                            this.H = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.I);
                        this.I = resourceId8;
                        if (resourceId8 == -1) {
                            this.I = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.J);
                        this.J = resourceId9;
                        if (resourceId9 == -1) {
                            this.J = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.K);
                        this.K = resourceId10;
                        if (resourceId10 == -1) {
                            this.K = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.Q);
                        this.Q = resourceId11;
                        if (resourceId11 == -1) {
                            this.Q = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.R);
                        this.R = resourceId12;
                        if (resourceId12 == -1) {
                            this.R = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.S);
                        this.S = resourceId13;
                        if (resourceId13 == -1) {
                            this.S = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.T);
                        this.T = resourceId14;
                        if (resourceId14 == -1) {
                            this.T = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.U = obtainStyledAttributes.getDimensionPixelSize(index, this.U);
                        break;
                    case 22:
                        this.V = obtainStyledAttributes.getDimensionPixelSize(index, this.V);
                        break;
                    case 23:
                        this.W = obtainStyledAttributes.getDimensionPixelSize(index, this.W);
                        break;
                    case 24:
                        this.X = obtainStyledAttributes.getDimensionPixelSize(index, this.X);
                        break;
                    case 25:
                        this.Y = obtainStyledAttributes.getDimensionPixelSize(index, this.Y);
                        break;
                    case 26:
                        this.Z = obtainStyledAttributes.getDimensionPixelSize(index, this.Z);
                        break;
                    case 27:
                        this.y0 = obtainStyledAttributes.getBoolean(index, this.y0);
                        break;
                    case 28:
                        this.z0 = obtainStyledAttributes.getBoolean(index, this.z0);
                        break;
                    case 29:
                        this.e0 = obtainStyledAttributes.getFloat(index, this.e0);
                        break;
                    case 30:
                        this.f0 = obtainStyledAttributes.getFloat(index, this.f0);
                        break;
                    case 31:
                        this.n0 = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 32:
                        this.o0 = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 33:
                        try {
                            this.p0 = obtainStyledAttributes.getDimensionPixelSize(index, this.p0);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.p0) == -2) {
                                this.p0 = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.r0 = obtainStyledAttributes.getDimensionPixelSize(index, this.r0);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.r0) == -2) {
                                this.r0 = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.t0 = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.t0));
                        this.n0 = 2;
                        break;
                    case 36:
                        try {
                            this.q0 = obtainStyledAttributes.getDimensionPixelSize(index, this.q0);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.q0) == -2) {
                                this.q0 = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.s0 = obtainStyledAttributes.getDimensionPixelSize(index, this.s0);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.s0) == -2) {
                                this.s0 = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.u0 = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.u0));
                        this.o0 = 2;
                        break;
                    default:
                        switch (i3) {
                            case 44:
                                af.C0(this, obtainStyledAttributes.getString(index));
                                continue;
                            case 45:
                                this.j0 = obtainStyledAttributes.getFloat(index, this.j0);
                                continue;
                            case 46:
                                this.k0 = obtainStyledAttributes.getFloat(index, this.k0);
                                continue;
                            case 47:
                                this.l0 = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 48:
                                this.m0 = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 49:
                                this.v0 = obtainStyledAttributes.getDimensionPixelOffset(index, this.v0);
                                continue;
                            case 50:
                                this.w0 = obtainStyledAttributes.getDimensionPixelOffset(index, this.w0);
                                continue;
                            case 51:
                                this.A0 = obtainStyledAttributes.getString(index);
                                continue;
                            case 52:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.L);
                                this.L = resourceId15;
                                if (resourceId15 == -1) {
                                    this.L = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    continue;
                                }
                            case 53:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.M);
                                this.M = resourceId16;
                                if (resourceId16 == -1) {
                                    this.M = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    continue;
                                }
                            case 54:
                                this.b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.b0);
                                continue;
                            case 55:
                                this.a0 = obtainStyledAttributes.getDimensionPixelSize(index, this.a0);
                                continue;
                            default:
                                switch (i3) {
                                    case 64:
                                        af.A0(this, obtainStyledAttributes, index, 0);
                                        this.c0 = true;
                                        continue;
                                    case 65:
                                        af.A0(this, obtainStyledAttributes, index, 1);
                                        this.d0 = true;
                                        continue;
                                    case 66:
                                        this.B0 = obtainStyledAttributes.getInt(index, this.B0);
                                        continue;
                                    case 67:
                                        this.B = obtainStyledAttributes.getBoolean(index, this.B);
                                        continue;
                                        continue;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
            e();
        }

        public b(int width, int height) {
            super(width, height);
            this.y = -1;
            this.z = -1;
            this.A = -1.0f;
            this.B = true;
            this.C = -1;
            this.D = -1;
            this.E = -1;
            this.F = -1;
            this.G = -1;
            this.H = -1;
            this.I = -1;
            this.J = -1;
            this.K = -1;
            this.L = -1;
            this.M = -1;
            this.N = -1;
            this.O = 0;
            this.P = 0.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = -1;
            this.U = Integer.MIN_VALUE;
            this.V = Integer.MIN_VALUE;
            this.W = Integer.MIN_VALUE;
            this.X = Integer.MIN_VALUE;
            this.Y = Integer.MIN_VALUE;
            this.Z = Integer.MIN_VALUE;
            this.a0 = Integer.MIN_VALUE;
            this.b0 = 0;
            this.c0 = true;
            this.d0 = true;
            this.e0 = 0.5f;
            this.f0 = 0.5f;
            this.g0 = null;
            this.h0 = 0.0f;
            this.i0 = 1;
            this.j0 = -1.0f;
            this.k0 = -1.0f;
            this.l0 = 0;
            this.m0 = 0;
            this.n0 = 0;
            this.o0 = 0;
            this.p0 = 0;
            this.q0 = 0;
            this.r0 = 0;
            this.s0 = 0;
            this.t0 = 1.0f;
            this.u0 = 1.0f;
            this.v0 = -1;
            this.w0 = -1;
            this.x0 = -1;
            this.y0 = false;
            this.z0 = false;
            this.A0 = null;
            this.B0 = 0;
            this.C0 = true;
            this.D0 = true;
            this.E0 = false;
            this.F0 = false;
            this.G0 = false;
            this.H0 = false;
            this.I0 = false;
            this.J0 = -1;
            this.K0 = -1;
            this.L0 = -1;
            this.M0 = -1;
            this.N0 = Integer.MIN_VALUE;
            this.O0 = Integer.MIN_VALUE;
            this.P0 = 0.5f;
            this.T0 = new zb();
            this.U0 = false;
        }

        public b(ViewGroup.LayoutParams source) {
            super(source);
            this.y = -1;
            this.z = -1;
            this.A = -1.0f;
            this.B = true;
            this.C = -1;
            this.D = -1;
            this.E = -1;
            this.F = -1;
            this.G = -1;
            this.H = -1;
            this.I = -1;
            this.J = -1;
            this.K = -1;
            this.L = -1;
            this.M = -1;
            this.N = -1;
            this.O = 0;
            this.P = 0.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = -1;
            this.U = Integer.MIN_VALUE;
            this.V = Integer.MIN_VALUE;
            this.W = Integer.MIN_VALUE;
            this.X = Integer.MIN_VALUE;
            this.Y = Integer.MIN_VALUE;
            this.Z = Integer.MIN_VALUE;
            this.a0 = Integer.MIN_VALUE;
            this.b0 = 0;
            this.c0 = true;
            this.d0 = true;
            this.e0 = 0.5f;
            this.f0 = 0.5f;
            this.g0 = null;
            this.h0 = 0.0f;
            this.i0 = 1;
            this.j0 = -1.0f;
            this.k0 = -1.0f;
            this.l0 = 0;
            this.m0 = 0;
            this.n0 = 0;
            this.o0 = 0;
            this.p0 = 0;
            this.q0 = 0;
            this.r0 = 0;
            this.s0 = 0;
            this.t0 = 1.0f;
            this.u0 = 1.0f;
            this.v0 = -1;
            this.w0 = -1;
            this.x0 = -1;
            this.y0 = false;
            this.z0 = false;
            this.A0 = null;
            this.B0 = 0;
            this.C0 = true;
            this.D0 = true;
            this.E0 = false;
            this.F0 = false;
            this.G0 = false;
            this.H0 = false;
            this.I0 = false;
            this.J0 = -1;
            this.K0 = -1;
            this.L0 = -1;
            this.M0 = -1;
            this.N0 = Integer.MIN_VALUE;
            this.O0 = Integer.MIN_VALUE;
            this.P0 = 0.5f;
            this.T0 = new zb();
            this.U0 = false;
        }
    }
}