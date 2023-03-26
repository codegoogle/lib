package com.p7700g.p99005;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import com.p7700g.p99005.i2;

/* compiled from: ActionMode.java */
/* loaded from: classes.dex */
public abstract class b4 {
    private Object s;
    private boolean t;

    /* compiled from: ActionMode.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(b4 b4Var);

        boolean b(b4 b4Var, Menu menu);

        boolean c(b4 b4Var, Menu menu);

        boolean d(b4 b4Var, MenuItem menuItem);
    }

    public abstract void a();

    public abstract View b();

    public abstract Menu c();

    public abstract MenuInflater d();

    public abstract CharSequence e();

    public Object f() {
        return this.s;
    }

    public abstract CharSequence g();

    public boolean h() {
        return this.t;
    }

    public abstract void i();

    public boolean j() {
        return false;
    }

    @i2({i2.a.u})
    public boolean k() {
        return true;
    }

    public abstract void l(View view);

    public abstract void m(int i);

    public abstract void n(CharSequence charSequence);

    public void o(Object obj) {
        this.s = obj;
    }

    public abstract void p(int i);

    public abstract void q(CharSequence charSequence);

    public void r(boolean z) {
        this.t = z;
    }
}