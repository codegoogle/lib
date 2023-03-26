package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.p7700g.p99005.ga2;
import java.util.Calendar;
import java.util.Locale;

/* compiled from: DaysOfWeekAdapter.java */
/* loaded from: classes3.dex */
public class xc2 extends BaseAdapter {
    private static final int s = 4;
    private static final int t;
    @x1
    private final Calendar u;
    private final int v;
    private final int w;

    static {
        t = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public xc2() {
        Calendar v = md2.v();
        this.u = v;
        this.v = v.getMaximum(7);
        this.w = v.getFirstDayOfWeek();
    }

    private int b(int i) {
        int i2 = i + this.w;
        int i3 = this.v;
        return i2 > i3 ? i2 - i3 : i2;
    }

    @Override // android.widget.Adapter
    @z1
    /* renamed from: a */
    public Integer getItem(int i) {
        if (i >= this.v) {
            return null;
        }
        return Integer.valueOf(b(i));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.v;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @z1
    @SuppressLint({"WrongConstant"})
    public View getView(int i, @z1 View view, @x1 ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(ga2.k.s0, viewGroup, false);
        }
        this.u.set(7, b(i));
        textView.setText(this.u.getDisplayName(7, t, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(ga2.m.M0), this.u.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}