package com.p7700g.p99005;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.p7700g.p99005.b4;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.pq;
import com.p7700g.p99005.x2;

/* compiled from: AppCompatDialog.java */
/* loaded from: classes.dex */
public class h3 extends v implements e3 {
    private f3 u;
    private final pq.a v;

    public h3(@x1 Context context) {
        this(context, 0);
    }

    private static int j(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(x2.b.Z0, typedValue, true);
            return typedValue.resourceId;
        }
        return i;
    }

    @Override // com.p7700g.p99005.v, android.app.Dialog
    public void addContentView(@x1 View view, ViewGroup.LayoutParams layoutParams) {
        h().b(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        h().y();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return pq.e(this.v, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // com.p7700g.p99005.e3
    public void e(b4 b4Var) {
    }

    @Override // com.p7700g.p99005.e3
    public void f(b4 b4Var) {
    }

    @Override // android.app.Dialog
    @z1
    public <T extends View> T findViewById(@m1 int i) {
        return (T) h().l(i);
    }

    @x1
    public f3 h() {
        if (this.u == null) {
            this.u = f3.h(this, this);
        }
        return this.u;
    }

    public z2 i() {
        return h().q();
    }

    @Override // android.app.Dialog
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public void invalidateOptionsMenu() {
        h().t();
    }

    public boolean k(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean l(int i) {
        return h().G(i);
    }

    @Override // com.p7700g.p99005.v, android.app.Dialog
    public void onCreate(Bundle bundle) {
        h().s();
        super.onCreate(bundle);
        h().x(bundle);
    }

    @Override // com.p7700g.p99005.v, android.app.Dialog
    public void onStop() {
        super.onStop();
        h().D();
    }

    @Override // com.p7700g.p99005.e3
    @z1
    public b4 q(b4.a aVar) {
        return null;
    }

    @Override // com.p7700g.p99005.v, android.app.Dialog
    public void setContentView(@s1 int i) {
        h().I(i);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        h().Q(charSequence);
    }

    public h3(@x1 Context context, int i) {
        super(context, j(context, i));
        this.v = new pq.a() { // from class: com.p7700g.p99005.y2
            @Override // com.p7700g.p99005.pq.a
            public final boolean s(KeyEvent keyEvent) {
                return h3.this.k(keyEvent);
            }
        };
        f3 h = h();
        h.P(j(context, i));
        h.x(null);
    }

    @Override // com.p7700g.p99005.v, android.app.Dialog
    public void setContentView(@x1 View view) {
        h().J(view);
    }

    @Override // com.p7700g.p99005.v, android.app.Dialog
    public void setContentView(@x1 View view, ViewGroup.LayoutParams layoutParams) {
        h().K(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        h().Q(getContext().getString(i));
    }

    public h3(@x1 Context context, boolean z, @z1 DialogInterface.OnCancelListener onCancelListener) {
        super(context);
        this.v = new pq.a() { // from class: com.p7700g.p99005.y2
            @Override // com.p7700g.p99005.pq.a
            public final boolean s(KeyEvent keyEvent) {
                return h3.this.k(keyEvent);
            }
        };
        setCancelable(z);
        setOnCancelListener(onCancelListener);
    }
}