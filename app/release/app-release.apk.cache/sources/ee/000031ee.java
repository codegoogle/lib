package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.p7700g.p99005.ed2;
import com.p7700g.p99005.fp;
import com.p7700g.p99005.fq;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.kf2;
import com.p7700g.p99005.ls;
import com.p7700g.p99005.md2;
import com.p7700g.p99005.qc2;
import com.p7700g.p99005.sr;
import com.p7700g.p99005.tc2;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import com.p7700g.p99005.zc2;
import java.util.Calendar;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class MaterialCalendarGridView extends GridView {
    private final Calendar s;
    private final boolean t;

    /* loaded from: classes3.dex */
    public class a extends fq {
        public a() {
        }

        @Override // com.p7700g.p99005.fq
        public void g(View view, @x1 ls lsVar) {
            super.g(view, lsVar);
            lsVar.Y0(null);
        }
    }

    public MaterialCalendarGridView(Context context) {
        this(context, null);
    }

    private void a(int i, Rect rect) {
        if (i == 33) {
            setSelection(getAdapter2().i());
        } else if (i == 130) {
            setSelection(getAdapter2().b());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    private View c(int i) {
        return getChildAt(i - getFirstVisiblePosition());
    }

    private static int d(@x1 View view) {
        return (view.getWidth() / 2) + view.getLeft();
    }

    private static boolean e(@z1 Long l, @z1 Long l2, @z1 Long l3, @z1 Long l4) {
        return l == null || l2 == null || l3 == null || l4 == null || l3.longValue() > l2.longValue() || l4.longValue() < l.longValue();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    @x1
    /* renamed from: b */
    public ed2 getAdapter2() {
        return (ed2) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter2().notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(@x1 Canvas canvas) {
        int a2;
        int d;
        int a3;
        int d2;
        int i;
        int i2;
        int left;
        int left2;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        ed2 adapter2 = getAdapter2();
        tc2<?> tc2Var = adapter2.u;
        qc2 qc2Var = adapter2.w;
        int max = Math.max(adapter2.b(), getFirstVisiblePosition());
        int min = Math.min(adapter2.i(), getLastVisiblePosition());
        Long item = adapter2.getItem(max);
        Long item2 = adapter2.getItem(min);
        Iterator<fp<Long, Long>> it = tc2Var.f().iterator();
        while (it.hasNext()) {
            fp<Long, Long> next = it.next();
            Long l = next.a;
            if (l == null) {
                materialCalendarGridView = this;
            } else if (next.b != null) {
                long longValue = l.longValue();
                long longValue2 = next.b.longValue();
                if (!e(item, item2, Long.valueOf(longValue), Long.valueOf(longValue2))) {
                    boolean k = kf2.k(this);
                    if (longValue < item.longValue()) {
                        if (adapter2.f(max)) {
                            left2 = 0;
                        } else if (!k) {
                            left2 = materialCalendarGridView.c(max - 1).getRight();
                        } else {
                            left2 = materialCalendarGridView.c(max - 1).getLeft();
                        }
                        d = left2;
                        a2 = max;
                    } else {
                        materialCalendarGridView.s.setTimeInMillis(longValue);
                        a2 = adapter2.a(materialCalendarGridView.s.get(5));
                        d = d(materialCalendarGridView.c(a2));
                    }
                    if (longValue2 > item2.longValue()) {
                        if (adapter2.g(min)) {
                            left = getWidth();
                        } else if (!k) {
                            left = materialCalendarGridView.c(min).getRight();
                        } else {
                            left = materialCalendarGridView.c(min).getLeft();
                        }
                        d2 = left;
                        a3 = min;
                    } else {
                        materialCalendarGridView.s.setTimeInMillis(longValue2);
                        a3 = adapter2.a(materialCalendarGridView.s.get(5));
                        d2 = d(materialCalendarGridView.c(a3));
                    }
                    int itemId = (int) adapter2.getItemId(a2);
                    int i3 = max;
                    int i4 = min;
                    int itemId2 = (int) adapter2.getItemId(a3);
                    while (itemId <= itemId2) {
                        int numColumns = getNumColumns() * itemId;
                        ed2 ed2Var = adapter2;
                        int numColumns2 = (getNumColumns() + numColumns) - 1;
                        View c = materialCalendarGridView.c(numColumns);
                        int e = qc2Var.a.e() + c.getTop();
                        Iterator<fp<Long, Long>> it2 = it;
                        int bottom = c.getBottom() - qc2Var.a.b();
                        if (!k) {
                            i = numColumns > a2 ? 0 : d;
                            i2 = a3 > numColumns2 ? getWidth() : d2;
                        } else {
                            int i5 = a3 > numColumns2 ? 0 : d2;
                            int width = numColumns > a2 ? getWidth() : d;
                            i = i5;
                            i2 = width;
                        }
                        canvas.drawRect(i, e, i2, bottom, qc2Var.h);
                        itemId++;
                        materialCalendarGridView = this;
                        itemId2 = itemId2;
                        adapter2 = ed2Var;
                        it = it2;
                    }
                    materialCalendarGridView = this;
                    max = i3;
                    min = i4;
                }
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            a(i, rect);
        } else {
            super.onFocusChanged(false, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (super.onKeyDown(i, keyEvent)) {
            if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter2().b()) {
                return true;
            }
            if (19 == i) {
                setSelection(getAdapter2().b());
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.t) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(sr.s, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i) {
        if (i < getAdapter2().b()) {
            super.setSelection(getAdapter2().b());
        } else {
            super.setSelection(i);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof ed2) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), ed2.class.getCanonicalName()));
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.s = md2.v();
        if (zc2.B(getContext())) {
            setNextFocusLeftId(ga2.h.B0);
            setNextFocusRightId(ga2.h.S0);
        }
        this.t = zc2.C(getContext());
        sr.A1(this, new a());
    }
}