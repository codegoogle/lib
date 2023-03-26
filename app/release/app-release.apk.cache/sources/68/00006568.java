package com.p7700g.p99005;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p7700g.p99005.af;
import com.p7700g.p99005.ff;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: ConstraintHelper.java */
/* loaded from: classes.dex */
public abstract class xe extends View {
    public HashMap<Integer, String> A;
    public int[] s;
    public int t;
    public Context u;
    public dc v;
    public boolean w;
    public String x;
    public String y;
    private View[] z;

    public xe(Context context) {
        super(context);
        this.s = new int[32];
        this.w = false;
        this.z = null;
        this.A = new HashMap<>();
        this.u = context;
        y(null);
    }

    private void l(String idString) {
        if (idString == null || idString.length() == 0 || this.u == null) {
            return;
        }
        String trim = idString.trim();
        if (getParent() instanceof ConstraintLayout) {
            ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
        }
        int v = v(trim);
        if (v != 0) {
            this.A.put(Integer.valueOf(v), trim);
            m(v);
        }
    }

    private void m(int id) {
        if (id == getId()) {
            return;
        }
        int i = this.t + 1;
        int[] iArr = this.s;
        if (i > iArr.length) {
            this.s = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.s;
        int i2 = this.t;
        iArr2[i2] = id;
        this.t = i2 + 1;
    }

    private void n(String tagString) {
        if (tagString == null || tagString.length() == 0 || this.u == null) {
            return;
        }
        String trim = tagString.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.b) && trim.equals(((ConstraintLayout.b) layoutParams).A0)) {
                if (childAt.getId() == -1) {
                    childAt.getClass().getSimpleName();
                } else {
                    m(childAt.getId());
                }
            }
        }
    }

    private int[] t(View view, String referenceIdString) {
        String[] split = referenceIdString.split(",");
        view.getContext();
        int[] iArr = new int[split.length];
        int i = 0;
        for (String str : split) {
            int v = v(str.trim());
            if (v != 0) {
                iArr[i] = v;
                i++;
            }
        }
        return i != split.length ? Arrays.copyOf(iArr, i) : iArr;
    }

    private int u(ConstraintLayout container, String idString) {
        Resources resources;
        if (idString == null || container == null || (resources = this.u.getResources()) == null) {
            return 0;
        }
        int childCount = container.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = container.getChildAt(i);
            if (childAt.getId() != -1) {
                String str = null;
                try {
                    str = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (idString.equals(str)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    private int v(String referenceId) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object l = constraintLayout.l(0, referenceId);
            if (l instanceof Integer) {
                i = ((Integer) l).intValue();
            }
        }
        if (i == 0 && constraintLayout != null) {
            i = u(constraintLayout, referenceId);
        }
        if (i == 0) {
            try {
                i = ff.g.class.getField(referenceId).getInt(null);
            } catch (Exception unused) {
            }
        }
        return i == 0 ? this.u.getResources().getIdentifier(referenceId, "id", this.u.getPackageName()) : i;
    }

    public int A(View view) {
        int i;
        int id = view.getId();
        int i2 = -1;
        if (id == -1) {
            return -1;
        }
        this.x = null;
        int i3 = 0;
        while (true) {
            if (i3 >= this.t) {
                break;
            } else if (this.s[i3] == id) {
                int i4 = i3;
                while (true) {
                    i = this.t;
                    if (i4 >= i - 1) {
                        break;
                    }
                    int[] iArr = this.s;
                    int i5 = i4 + 1;
                    iArr[i4] = iArr[i5];
                    i4 = i5;
                }
                this.s[i - 1] = 0;
                this.t = i - 1;
                i2 = i3;
            } else {
                i3++;
            }
        }
        requestLayout();
        return i2;
    }

    public void B(zb widget, boolean isRtl) {
    }

    public void C(ConstraintLayout container) {
    }

    public void D(ConstraintLayout container) {
    }

    public void E(ConstraintLayout container) {
    }

    public void F(ConstraintLayout container) {
    }

    public void G(ac container, dc helper, SparseArray<zb> map) {
        helper.a();
        for (int i = 0; i < this.t; i++) {
            helper.b(map.get(this.s[i]));
        }
    }

    public void H(ConstraintLayout container) {
        String str;
        int u;
        if (isInEditMode()) {
            setIds(this.x);
        }
        dc dcVar = this.v;
        if (dcVar == null) {
            return;
        }
        dcVar.a();
        for (int i = 0; i < this.t; i++) {
            int i2 = this.s[i];
            View n = container.n(i2);
            if (n == null && (u = u(container, (str = this.A.get(Integer.valueOf(i2))))) != 0) {
                this.s[i] = u;
                this.A.put(Integer.valueOf(u), str);
                n = container.n(u);
            }
            if (n != null) {
                this.v.b(container.o(n));
            }
        }
        this.v.c(container.D);
    }

    public void I() {
        if (this.v == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).T0 = (zb) this.v;
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.s, this.t);
    }

    public void o(View view) {
        if (view == this || view.getId() == -1 || view.getParent() == null) {
            return;
        }
        this.x = null;
        m(view.getId());
        requestLayout();
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.x;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.y;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.w) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void p() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        q((ConstraintLayout) parent);
    }

    public void q(ConstraintLayout container) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.t; i++) {
            View n = container.n(this.s[i]);
            if (n != null) {
                n.setVisibility(visibility);
                if (elevation > 0.0f) {
                    n.setTranslationZ(n.getTranslationZ() + elevation);
                }
            }
        }
    }

    public void r(ConstraintLayout container) {
    }

    public boolean s(final int id) {
        for (int i : this.s) {
            if (i == id) {
                return true;
            }
        }
        return false;
    }

    public void setIds(String idList) {
        this.x = idList;
        if (idList == null) {
            return;
        }
        int i = 0;
        this.t = 0;
        while (true) {
            int indexOf = idList.indexOf(44, i);
            if (indexOf == -1) {
                l(idList.substring(i));
                return;
            } else {
                l(idList.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    public void setReferenceTags(String tagList) {
        this.y = tagList;
        if (tagList == null) {
            return;
        }
        int i = 0;
        this.t = 0;
        while (true) {
            int indexOf = tagList.indexOf(44, i);
            if (indexOf == -1) {
                n(tagList.substring(i));
                return;
            } else {
                n(tagList.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] ids) {
        this.x = null;
        this.t = 0;
        for (int i : ids) {
            m(i);
        }
    }

    @Override // android.view.View
    public void setTag(int key, Object tag) {
        super.setTag(key, tag);
        if (tag == null && this.x == null) {
            m(key);
        }
    }

    public View[] w(ConstraintLayout layout) {
        View[] viewArr = this.z;
        if (viewArr == null || viewArr.length != this.t) {
            this.z = new View[this.t];
        }
        for (int i = 0; i < this.t; i++) {
            this.z[i] = layout.n(this.s[i]);
        }
        return this.z;
    }

    public int x(final int id) {
        int i = -1;
        for (int i2 : this.s) {
            i++;
            if (i2 == id) {
                return i;
            }
        }
        return i;
    }

    public void y(AttributeSet attrs) {
        if (attrs != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, ff.m.x6);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == ff.m.h7) {
                    String string = obtainStyledAttributes.getString(index);
                    this.x = string;
                    setIds(string);
                } else if (index == ff.m.i7) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.y = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void z(af.a constraint, ec child, ConstraintLayout.b layoutParams, SparseArray<zb> mapIdToWidget) {
        af.b bVar = constraint.e;
        int[] iArr = bVar.D1;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = bVar.E1;
            if (str != null) {
                if (str.length() > 0) {
                    af.b bVar2 = constraint.e;
                    bVar2.D1 = t(this, bVar2.E1);
                } else {
                    constraint.e.D1 = null;
                }
            }
        }
        if (child == null) {
            return;
        }
        child.a();
        if (constraint.e.D1 == null) {
            return;
        }
        int i = 0;
        while (true) {
            int[] iArr2 = constraint.e.D1;
            if (i >= iArr2.length) {
                return;
            }
            zb zbVar = mapIdToWidget.get(iArr2[i]);
            if (zbVar != null) {
                child.b(zbVar);
            }
            i++;
        }
    }

    public xe(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.s = new int[32];
        this.w = false;
        this.z = null;
        this.A = new HashMap<>();
        this.u = context;
        y(attrs);
    }

    public xe(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.s = new int[32];
        this.w = false;
        this.z = null;
        this.A = new HashMap<>();
        this.u = context;
        y(attrs);
    }
}