package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.p7700g.p99005.cf2;
import com.p7700g.p99005.ch2;
import com.p7700g.p99005.fh2;
import com.p7700g.p99005.fq;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.kf2;
import com.p7700g.p99005.ls;
import com.p7700g.p99005.m1;
import com.p7700g.p99005.qh2;
import com.p7700g.p99005.r2;
import com.p7700g.p99005.s0;
import com.p7700g.p99005.sq;
import com.p7700g.p99005.sr;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.yi2;
import com.p7700g.p99005.z1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public class MaterialButtonToggleGroup extends LinearLayout {
    private static final String s = MaterialButtonToggleGroup.class.getSimpleName();
    private static final int t = ga2.n.Sh;
    private boolean A;
    private boolean B;
    @m1
    private final int C;
    private Set<Integer> D;
    private final List<c> u;
    private final e v;
    private final LinkedHashSet<d> w;
    private final Comparator<MaterialButton> x;
    private Integer[] y;
    private boolean z;

    /* loaded from: classes2.dex */
    public class a implements Comparator<MaterialButton> {
        public a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            return compareTo2 != 0 ? compareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    /* loaded from: classes2.dex */
    public class b extends fq {
        public b() {
        }

        @Override // com.p7700g.p99005.fq
        public void g(View view, @x1 ls lsVar) {
            super.g(view, lsVar);
            lsVar.Z0(ls.c.h(0, 1, MaterialButtonToggleGroup.this.k(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    /* loaded from: classes2.dex */
    public static class c {
        private static final fh2 a = new ch2(0.0f);
        public fh2 b;
        public fh2 c;
        public fh2 d;
        public fh2 e;

        public c(fh2 fh2Var, fh2 fh2Var2, fh2 fh2Var3, fh2 fh2Var4) {
            this.b = fh2Var;
            this.c = fh2Var3;
            this.d = fh2Var4;
            this.e = fh2Var2;
        }

        public static c a(c cVar) {
            fh2 fh2Var = a;
            return new c(fh2Var, cVar.e, fh2Var, cVar.d);
        }

        public static c b(c cVar, View view) {
            return kf2.k(view) ? c(cVar) : d(cVar);
        }

        public static c c(c cVar) {
            fh2 fh2Var = cVar.b;
            fh2 fh2Var2 = cVar.e;
            fh2 fh2Var3 = a;
            return new c(fh2Var, fh2Var2, fh2Var3, fh2Var3);
        }

        public static c d(c cVar) {
            fh2 fh2Var = a;
            return new c(fh2Var, fh2Var, cVar.c, cVar.d);
        }

        public static c e(c cVar, View view) {
            return kf2.k(view) ? d(cVar) : c(cVar);
        }

        public static c f(c cVar) {
            fh2 fh2Var = cVar.b;
            fh2 fh2Var2 = a;
            return new c(fh2Var, fh2Var2, cVar.c, fh2Var2);
        }
    }

    /* loaded from: classes2.dex */
    public interface d {
        void a(MaterialButtonToggleGroup materialButtonToggleGroup, @m1 int i, boolean z);
    }

    /* loaded from: classes2.dex */
    public class e implements MaterialButton.c {
        private e() {
        }

        @Override // com.google.android.material.button.MaterialButton.c
        public void a(@x1 MaterialButton materialButton, boolean z) {
            MaterialButtonToggleGroup.this.invalidate();
        }

        public /* synthetic */ e(MaterialButtonToggleGroup materialButtonToggleGroup, a aVar) {
            this();
        }
    }

    public MaterialButtonToggleGroup(@x1 Context context) {
        this(context, null);
    }

    private void c() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton j = j(i);
            int min = Math.min(j.getStrokeWidth(), j(i - 1).getStrokeWidth());
            LinearLayout.LayoutParams d2 = d(j);
            if (getOrientation() == 0) {
                sq.g(d2, 0);
                sq.h(d2, -min);
                d2.topMargin = 0;
            } else {
                d2.bottomMargin = 0;
                d2.topMargin = -min;
                sq.h(d2, 0);
            }
            j.setLayoutParams(d2);
        }
        r(firstVisibleChildIndex);
    }

    @x1
    private LinearLayout.LayoutParams d(@x1 View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return (LinearLayout.LayoutParams) layoutParams;
        }
        return new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    private void f(@m1 int i, boolean z) {
        if (i == -1) {
            return;
        }
        HashSet hashSet = new HashSet(this.D);
        if (z && !hashSet.contains(Integer.valueOf(i))) {
            if (this.A && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else if (z || !hashSet.contains(Integer.valueOf(i))) {
            return;
        } else {
            if (!this.B || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        v(hashSet);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (m(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (m(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && m(i2)) {
                i++;
            }
        }
        return i;
    }

    private void i(@m1 int i, boolean z) {
        Iterator<d> it = this.w.iterator();
        while (it.hasNext()) {
            it.next().a(this, i, z);
        }
    }

    private MaterialButton j(int i) {
        return (MaterialButton) getChildAt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int k(@z1 View view) {
        if (view instanceof MaterialButton) {
            int i = 0;
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                if (getChildAt(i2) == view) {
                    return i;
                }
                if ((getChildAt(i2) instanceof MaterialButton) && m(i2)) {
                    i++;
                }
            }
            return -1;
        }
        return -1;
    }

    @z1
    private c l(int i, int i2, int i3) {
        c cVar = this.u.get(i);
        if (i2 == i3) {
            return cVar;
        }
        boolean z = getOrientation() == 0;
        if (i == i2) {
            return z ? c.e(cVar, this) : c.f(cVar);
        } else if (i == i3) {
            return z ? c.b(cVar, this) : c.a(cVar);
        } else {
            return null;
        }
    }

    private boolean m(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    private void r(int i) {
        if (getChildCount() == 0 || i == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) j(i).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
            return;
        }
        sq.g(layoutParams, 0);
        sq.h(layoutParams, 0);
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
    }

    private void s(@m1 int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof MaterialButton) {
            this.z = true;
            ((MaterialButton) findViewById).setChecked(z);
            this.z = false;
        }
    }

    private void setGeneratedIdIfNeeded(@x1 MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(sr.C());
        }
    }

    private void setupButtonChild(@x1 MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.v);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    private static void u(qh2.b bVar, @z1 c cVar) {
        if (cVar == null) {
            bVar.o(0.0f);
        } else {
            bVar.L(cVar.b).y(cVar.e).Q(cVar.c).D(cVar.d);
        }
    }

    private void v(Set<Integer> set) {
        Set<Integer> set2 = this.D;
        this.D = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = j(i).getId();
            s(id, set.contains(Integer.valueOf(id)));
            if (set2.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                i(id, set.contains(Integer.valueOf(id)));
            }
        }
        invalidate();
    }

    private void w() {
        TreeMap treeMap = new TreeMap(this.x);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(j(i), Integer.valueOf(i));
        }
        this.y = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof MaterialButton) {
            super.addView(view, i, layoutParams);
            MaterialButton materialButton = (MaterialButton) view;
            setGeneratedIdIfNeeded(materialButton);
            setupButtonChild(materialButton);
            f(materialButton.getId(), materialButton.isChecked());
            qh2 shapeAppearanceModel = materialButton.getShapeAppearanceModel();
            this.u.add(new c(shapeAppearanceModel.r(), shapeAppearanceModel.j(), shapeAppearanceModel.t(), shapeAppearanceModel.l()));
            sr.A1(materialButton, new b());
        }
    }

    public void b(@x1 d dVar) {
        this.w.add(dVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@x1 Canvas canvas) {
        w();
        super.dispatchDraw(canvas);
    }

    public void e(@m1 int i) {
        f(i, true);
    }

    public void g() {
        v(new HashSet());
    }

    @m1
    public int getCheckedButtonId() {
        if (!this.A || this.D.isEmpty()) {
            return -1;
        }
        return this.D.iterator().next().intValue();
    }

    @x1
    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = j(i).getId();
            if (this.D.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.y;
        return (numArr == null || i2 >= numArr.length) ? i2 : numArr[i2].intValue();
    }

    public void h() {
        this.w.clear();
    }

    public boolean n() {
        return this.B;
    }

    public boolean o() {
        return this.A;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.C;
        if (i != -1) {
            v(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@x1 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ls.X1(accessibilityNodeInfo).Y0(ls.b.f(1, getVisibleButtonCount(), false, o() ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        x();
        c();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.u.remove(indexOfChild);
        }
        x();
        c();
    }

    public void p(@x1 MaterialButton materialButton, boolean z) {
        if (this.z) {
            return;
        }
        f(materialButton.getId(), z);
    }

    public void q(@x1 d dVar) {
        this.w.remove(dVar);
    }

    public void setSelectionRequired(boolean z) {
        this.B = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.A != z) {
            this.A = z;
            g();
        }
    }

    public void t(@m1 int i) {
        f(i, false);
    }

    @r2
    public void x() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton j = j(i);
            if (j.getVisibility() != 8) {
                qh2.b v = j.getShapeAppearanceModel().v();
                u(v, l(i, firstVisibleChildIndex, lastVisibleChildIndex));
                j.setShapeAppearanceModel(v.m());
            }
        }
    }

    public MaterialButtonToggleGroup(@x1 Context context, @z1 AttributeSet attributeSet) {
        this(context, attributeSet, ga2.c.La);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MaterialButtonToggleGroup(@x1 Context context, @z1 AttributeSet attributeSet, int i) {
        super(yi2.c(context, attributeSet, i, r4), attributeSet, i);
        int i2 = t;
        this.u = new ArrayList();
        this.v = new e(this, null);
        this.w = new LinkedHashSet<>();
        this.x = new a();
        this.z = false;
        this.D = new HashSet();
        TypedArray j = cf2.j(getContext(), attributeSet, ga2.o.ul, i, i2, new int[0]);
        setSingleSelection(j.getBoolean(ga2.o.xl, false));
        this.C = j.getResourceId(ga2.o.vl, -1);
        this.B = j.getBoolean(ga2.o.wl, false);
        setChildrenDrawingOrderEnabled(true);
        j.recycle();
        sr.Q1(this, 1);
    }

    public void setSingleSelection(@s0 int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}