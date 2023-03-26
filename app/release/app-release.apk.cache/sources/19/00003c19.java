package com.p7700g.p99005;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.x2;

/* compiled from: AlertDialog.java */
/* loaded from: classes.dex */
public class c3 extends h3 implements DialogInterface {
    public static final int w = 0;
    public static final int x = 1;
    public final AlertController y;

    /* compiled from: AlertDialog.java */
    /* loaded from: classes.dex */
    public static class a {
        private final AlertController.f a;
        private final int b;

        public a(@x1 Context context) {
            this(context, c3.o(context, 0));
        }

        public a A(DialogInterface.OnKeyListener onKeyListener) {
            this.a.u = onKeyListener;
            return this;
        }

        public a B(@l2 int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.i = fVar.a.getText(i);
            this.a.k = onClickListener;
            return this;
        }

        public a C(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.i = charSequence;
            fVar.k = onClickListener;
            return this;
        }

        public a D(Drawable drawable) {
            this.a.j = drawable;
            return this;
        }

        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        public a E(boolean z) {
            this.a.Q = z;
            return this;
        }

        public a F(@p0 int i, int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.v = fVar.a.getResources().getTextArray(i);
            AlertController.f fVar2 = this.a;
            fVar2.x = onClickListener;
            fVar2.I = i2;
            fVar2.H = true;
            return this;
        }

        public a G(Cursor cursor, int i, String str, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.K = cursor;
            fVar.x = onClickListener;
            fVar.I = i;
            fVar.L = str;
            fVar.H = true;
            return this;
        }

        public a H(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.w = listAdapter;
            fVar.x = onClickListener;
            fVar.I = i;
            fVar.H = true;
            return this;
        }

        public a I(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.v = charSequenceArr;
            fVar.x = onClickListener;
            fVar.I = i;
            fVar.H = true;
            return this;
        }

        public a J(@l2 int i) {
            AlertController.f fVar = this.a;
            fVar.f = fVar.a.getText(i);
            return this;
        }

        public a K(@z1 CharSequence charSequence) {
            this.a.f = charSequence;
            return this;
        }

        public a L(int i) {
            AlertController.f fVar = this.a;
            fVar.z = null;
            fVar.y = i;
            fVar.E = false;
            return this;
        }

        public a M(View view) {
            AlertController.f fVar = this.a;
            fVar.z = view;
            fVar.y = 0;
            fVar.E = false;
            return this;
        }

        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public a N(View view, int i, int i2, int i3, int i4) {
            AlertController.f fVar = this.a;
            fVar.z = view;
            fVar.y = 0;
            fVar.E = true;
            fVar.A = i;
            fVar.B = i2;
            fVar.C = i3;
            fVar.D = i4;
            return this;
        }

        public c3 O() {
            c3 a = a();
            a.show();
            return a;
        }

        @x1
        public c3 a() {
            c3 c3Var = new c3(this.a.a, this.b);
            this.a.a(c3Var.y);
            c3Var.setCancelable(this.a.r);
            if (this.a.r) {
                c3Var.setCanceledOnTouchOutside(true);
            }
            c3Var.setOnCancelListener(this.a.s);
            c3Var.setOnDismissListener(this.a.t);
            DialogInterface.OnKeyListener onKeyListener = this.a.u;
            if (onKeyListener != null) {
                c3Var.setOnKeyListener(onKeyListener);
            }
            return c3Var;
        }

        @x1
        public Context b() {
            return this.a.a;
        }

        public a c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.w = listAdapter;
            fVar.x = onClickListener;
            return this;
        }

        public a d(boolean z) {
            this.a.r = z;
            return this;
        }

        public a e(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
            AlertController.f fVar = this.a;
            fVar.K = cursor;
            fVar.L = str;
            fVar.x = onClickListener;
            return this;
        }

        public a f(@z1 View view) {
            this.a.g = view;
            return this;
        }

        public a g(@f1 int i) {
            this.a.c = i;
            return this;
        }

        public a h(@z1 Drawable drawable) {
            this.a.d = drawable;
            return this;
        }

        public a i(@q0 int i) {
            TypedValue typedValue = new TypedValue();
            this.a.a.getTheme().resolveAttribute(i, typedValue, true);
            this.a.c = typedValue.resourceId;
            return this;
        }

        @Deprecated
        public a j(boolean z) {
            this.a.N = z;
            return this;
        }

        public a k(@p0 int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.v = fVar.a.getResources().getTextArray(i);
            this.a.x = onClickListener;
            return this;
        }

        public a l(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.v = charSequenceArr;
            fVar.x = onClickListener;
            return this;
        }

        public a m(@l2 int i) {
            AlertController.f fVar = this.a;
            fVar.h = fVar.a.getText(i);
            return this;
        }

        public a n(@z1 CharSequence charSequence) {
            this.a.h = charSequence;
            return this;
        }

        public a o(@p0 int i, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.f fVar = this.a;
            fVar.v = fVar.a.getResources().getTextArray(i);
            AlertController.f fVar2 = this.a;
            fVar2.J = onMultiChoiceClickListener;
            fVar2.F = zArr;
            fVar2.G = true;
            return this;
        }

        public a p(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.f fVar = this.a;
            fVar.K = cursor;
            fVar.J = onMultiChoiceClickListener;
            fVar.M = str;
            fVar.L = str2;
            fVar.G = true;
            return this;
        }

        public a q(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.f fVar = this.a;
            fVar.v = charSequenceArr;
            fVar.J = onMultiChoiceClickListener;
            fVar.F = zArr;
            fVar.G = true;
            return this;
        }

        public a r(@l2 int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.l = fVar.a.getText(i);
            this.a.n = onClickListener;
            return this;
        }

        public a s(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.l = charSequence;
            fVar.n = onClickListener;
            return this;
        }

        public a t(Drawable drawable) {
            this.a.m = drawable;
            return this;
        }

        public a u(@l2 int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.o = fVar.a.getText(i);
            this.a.q = onClickListener;
            return this;
        }

        public a v(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.o = charSequence;
            fVar.q = onClickListener;
            return this;
        }

        public a w(Drawable drawable) {
            this.a.p = drawable;
            return this;
        }

        public a x(DialogInterface.OnCancelListener onCancelListener) {
            this.a.s = onCancelListener;
            return this;
        }

        public a y(DialogInterface.OnDismissListener onDismissListener) {
            this.a.t = onDismissListener;
            return this;
        }

        public a z(AdapterView.OnItemSelectedListener onItemSelectedListener) {
            this.a.O = onItemSelectedListener;
            return this;
        }

        public a(@x1 Context context, @m2 int i) {
            this.a = new AlertController.f(new ContextThemeWrapper(context, c3.o(context, i)));
            this.b = i;
        }
    }

    public c3(@x1 Context context) {
        this(context, 0);
    }

    public static int o(@x1 Context context, @m2 int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(x2.b.N, typedValue, true);
        return typedValue.resourceId;
    }

    public void A(View view, int i, int i2, int i3, int i4) {
        this.y.v(view, i, i2, i3, i4);
    }

    public Button m(int i) {
        return this.y.c(i);
    }

    public ListView n() {
        return this.y.e();
    }

    @Override // com.p7700g.p99005.h3, com.p7700g.p99005.v, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.y.f();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.y.h(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.y.i(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void p(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.y.l(i, charSequence, onClickListener, null, null);
    }

    public void r(int i, CharSequence charSequence, Drawable drawable, DialogInterface.OnClickListener onClickListener) {
        this.y.l(i, charSequence, onClickListener, null, drawable);
    }

    public void s(int i, CharSequence charSequence, Message message) {
        this.y.l(i, charSequence, null, message, null);
    }

    @Override // com.p7700g.p99005.h3, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.y.s(charSequence);
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public void t(int i) {
        this.y.m(i);
    }

    public void u(View view) {
        this.y.n(view);
    }

    public void v(int i) {
        this.y.o(i);
    }

    public void w(Drawable drawable) {
        this.y.p(drawable);
    }

    public void x(int i) {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(i, typedValue, true);
        this.y.o(typedValue.resourceId);
    }

    public void y(CharSequence charSequence) {
        this.y.q(charSequence);
    }

    public void z(View view) {
        this.y.u(view);
    }

    public c3(@x1 Context context, @m2 int i) {
        super(context, o(context, i));
        this.y = new AlertController(getContext(), this, getWindow());
    }

    public c3(@x1 Context context, boolean z, @z1 DialogInterface.OnCancelListener onCancelListener) {
        this(context, 0);
        setCancelable(z);
        setOnCancelListener(onCancelListener);
    }
}