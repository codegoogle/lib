package com.p7700g.p99005;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.ListPopupWindow;
import com.google.android.material.textfield.TextInputLayout;
import com.p7700g.p99005.ga2;

/* compiled from: MaterialAutoCompleteTextView.java */
/* loaded from: classes3.dex */
public class ui2 extends AppCompatAutoCompleteTextView {
    private static final int s = 15;
    @x1
    private final ListPopupWindow t;
    @z1
    private final AccessibilityManager u;
    @x1
    private final Rect v;
    @s1
    private final int w;

    /* compiled from: MaterialAutoCompleteTextView.java */
    /* loaded from: classes3.dex */
    public class a implements AdapterView.OnItemClickListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ui2 ui2Var = ui2.this;
            ui2.this.e(i < 0 ? ui2Var.t.getSelectedItem() : ui2Var.getAdapter().getItem(i));
            AdapterView.OnItemClickListener onItemClickListener = ui2.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i < 0) {
                    view = ui2.this.t.getSelectedView();
                    i = ui2.this.t.getSelectedItemPosition();
                    j = ui2.this.t.getSelectedItemId();
                }
                onItemClickListener.onItemClick(ui2.this.t.getListView(), view, i, j);
            }
            ui2.this.t.dismiss();
        }
    }

    public ui2(@x1 Context context) {
        this(context, null);
    }

    @z1
    private TextInputLayout c() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private int d() {
        ListAdapter adapter = getAdapter();
        TextInputLayout c = c();
        int i = 0;
        if (adapter == null || c == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int min = Math.min(adapter.getCount(), Math.max(0, this.t.getSelectedItemPosition()) + 15);
        View view = null;
        int i2 = 0;
        for (int max = Math.max(0, min - 15); max < min; max++) {
            int itemViewType = adapter.getItemViewType(max);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = adapter.getView(max, view, c);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        Drawable background = this.t.getBackground();
        if (background != null) {
            background.getPadding(this.v);
            Rect rect = this.v;
            i2 += rect.left + rect.right;
        }
        return c.getEndIconView().getMeasuredWidth() + i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T extends ListAdapter & Filterable> void e(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    @Override // android.widget.TextView
    @z1
    public CharSequence getHint() {
        TextInputLayout c = c();
        if (c != null && c.Z()) {
            return c.getHint();
        }
        return super.getHint();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout c = c();
        if (c != null && c.Z() && super.getHint() == null && oe2.c()) {
            setHint("");
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), d()), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(@z1 T t) {
        super.setAdapter(t);
        this.t.setAdapter(getAdapter());
    }

    public void setSimpleItems(@p0 int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        AccessibilityManager accessibilityManager = this.u;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            this.t.show();
        } else {
            super.showDropDown();
        }
    }

    public ui2(@x1 Context context, @z1 AttributeSet attributeSet) {
        this(context, attributeSet, ga2.c.Y);
    }

    public void setSimpleItems(@x1 String[] strArr) {
        setAdapter(new ArrayAdapter(getContext(), this.w, strArr));
    }

    public ui2(@x1 Context context, @z1 AttributeSet attributeSet, int i) {
        super(yi2.c(context, attributeSet, i, 0), attributeSet, i);
        this.v = new Rect();
        Context context2 = getContext();
        TypedArray j = cf2.j(context2, attributeSet, ga2.o.Uk, i, ga2.n.Nc, new int[0]);
        int i2 = ga2.o.Vk;
        if (j.hasValue(i2) && j.getInt(i2, 0) == 0) {
            setKeyListener(null);
        }
        this.w = j.getResourceId(ga2.o.Wk, ga2.k.q0);
        this.u = (AccessibilityManager) context2.getSystemService("accessibility");
        ListPopupWindow listPopupWindow = new ListPopupWindow(context2);
        this.t = listPopupWindow;
        listPopupWindow.setModal(true);
        listPopupWindow.setAnchorView(this);
        listPopupWindow.setInputMethodMode(2);
        listPopupWindow.setAdapter(getAdapter());
        listPopupWindow.setOnItemClickListener(new a());
        int i3 = ga2.o.Xk;
        if (j.hasValue(i3)) {
            setSimpleItems(j.getResourceId(i3, 0));
        }
        j.recycle();
    }
}