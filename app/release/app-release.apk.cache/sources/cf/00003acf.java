package com.p7700g.p99005;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.i2;

/* compiled from: MaterialStyledDatePickerDialog.java */
@i2({i2.a.LIBRARY_GROUP, i2.a.TESTS})
/* loaded from: classes3.dex */
public class bd2 extends DatePickerDialog {
    @q0
    private static final int s = 16843612;
    @m2
    private static final int t = ga2.n.z4;
    @x1
    private final Drawable u;
    @x1
    private final Rect v;

    public bd2(@x1 Context context) {
        this(context, 0);
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(this.u);
        getWindow().getDecorView().setOnTouchListener(new od2(this, this.v));
    }

    public bd2(@x1 Context context, int i) {
        this(context, i, null, -1, -1, -1);
    }

    public bd2(@x1 Context context, @z1 DatePickerDialog.OnDateSetListener onDateSetListener, int i, int i2, int i3) {
        this(context, 0, onDateSetListener, i, i2, i3);
    }

    public bd2(@x1 Context context, int i, @z1 DatePickerDialog.OnDateSetListener onDateSetListener, int i2, int i3, int i4) {
        super(context, i, onDateSetListener, i2, i3, i4);
        Context context2 = getContext();
        int g = rg2.g(getContext(), ga2.c.o3, getClass().getCanonicalName());
        int i5 = t;
        lh2 lh2Var = new lh2(context2, null, s, i5);
        lh2Var.o0(ColorStateList.valueOf(g));
        Rect a = qd2.a(context2, s, i5);
        this.v = a;
        this.u = qd2.b(lh2Var, a);
    }
}