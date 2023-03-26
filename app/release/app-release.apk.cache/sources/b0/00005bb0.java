package com.p7700g.p99005;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.material.textfield.TextInputLayout;
import com.p7700g.p99005.ga2;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

/* compiled from: DateFormatTextWatcher.java */
/* loaded from: classes3.dex */
public abstract class sc2 extends bf2 {
    private static final int s = 1000;
    @x1
    private final TextInputLayout t;
    private final DateFormat u;
    private final oc2 v;
    private final String w;
    private final Runnable x;
    private Runnable y;

    /* compiled from: DateFormatTextWatcher.java */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public final /* synthetic */ String s;

        public a(String str) {
            this.s = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout textInputLayout = sc2.this.t;
            DateFormat dateFormat = sc2.this.u;
            Context context = textInputLayout.getContext();
            textInputLayout.setError(wo1.w(context.getString(ga2.m.N0), "\n", String.format(context.getString(ga2.m.P0), this.s), "\n", String.format(context.getString(ga2.m.O0), dateFormat.format(new Date(md2.t().getTimeInMillis())))));
            sc2.this.e();
        }
    }

    /* compiled from: DateFormatTextWatcher.java */
    /* loaded from: classes3.dex */
    public class b implements Runnable {
        public final /* synthetic */ long s;

        public b(long j) {
            this.s = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            sc2.this.t.setError(String.format(sc2.this.w, uc2.c(this.s)));
            sc2.this.e();
        }
    }

    public sc2(String str, DateFormat dateFormat, @x1 TextInputLayout textInputLayout, oc2 oc2Var) {
        this.u = dateFormat;
        this.t = textInputLayout;
        this.v = oc2Var;
        this.w = textInputLayout.getContext().getString(ga2.m.S0);
        this.x = new a(str);
    }

    private Runnable d(long j) {
        return new b(j);
    }

    public void e() {
    }

    public abstract void f(@z1 Long l);

    public void g(View view, Runnable runnable) {
        view.postDelayed(runnable, 1000L);
    }

    @Override // com.p7700g.p99005.bf2, android.text.TextWatcher
    public void onTextChanged(@x1 CharSequence charSequence, int i, int i2, int i3) {
        this.t.removeCallbacks(this.x);
        this.t.removeCallbacks(this.y);
        this.t.setError(null);
        f(null);
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        try {
            Date parse = this.u.parse(charSequence.toString());
            this.t.setError(null);
            long time = parse.getTime();
            if (this.v.j().b(time) && this.v.p(time)) {
                f(Long.valueOf(parse.getTime()));
                return;
            }
            Runnable d = d(time);
            this.y = d;
            g(this.t, d);
        } catch (ParseException unused) {
            g(this.t, this.x);
        }
    }
}