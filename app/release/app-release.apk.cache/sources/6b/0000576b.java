package com.p7700g.p99005;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.p7700g.p99005.c3;
import com.p7700g.p99005.w4;
import com.p7700g.p99005.x2;

/* compiled from: MenuDialogHelper.java */
/* loaded from: classes.dex */
public class q4 implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, w4.a {
    private p4 s;
    private c3 t;
    public n4 u;
    private w4.a v;

    public q4(p4 p4Var) {
        this.s = p4Var;
    }

    public void a() {
        c3 c3Var = this.t;
        if (c3Var != null) {
            c3Var.dismiss();
        }
    }

    public void b(w4.a aVar) {
        this.v = aVar;
    }

    public void c(IBinder iBinder) {
        p4 p4Var = this.s;
        c3.a aVar = new c3.a(p4Var.x());
        n4 n4Var = new n4(aVar.b(), x2.j.q);
        this.u = n4Var;
        n4Var.setCallback(this);
        this.s.b(this.u);
        aVar.c(this.u.a(), this);
        View B = p4Var.B();
        if (B != null) {
            aVar.f(B);
        } else {
            aVar.h(p4Var.z()).K(p4Var.A());
        }
        aVar.A(this);
        c3 a = aVar.a();
        this.t = a;
        a.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.t.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.t.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.s.O((s4) this.u.a().getItem(i), 0);
    }

    @Override // com.p7700g.p99005.w4.a
    public void onCloseMenu(@x1 p4 p4Var, boolean z) {
        if (z || p4Var == this.s) {
            a();
        }
        w4.a aVar = this.v;
        if (aVar != null) {
            aVar.onCloseMenu(p4Var, z);
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.u.onCloseMenu(this.s, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.t.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.t.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.s.f(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.s.performShortcut(i, keyEvent, 0);
    }

    @Override // com.p7700g.p99005.w4.a
    public boolean onOpenSubMenu(@x1 p4 p4Var) {
        w4.a aVar = this.v;
        if (aVar != null) {
            return aVar.onOpenSubMenu(p4Var);
        }
        return false;
    }
}