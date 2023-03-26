package com.p7700g.p99005;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.timepicker.TimePickerView;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.i2;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: MaterialTimePicker.java */
/* loaded from: classes3.dex */
public final class aj2 extends gx implements TimePickerView.e {
    public static final String A = "TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES";
    public static final String B = "TIME_PICKER_NEGATIVE_BUTTON_TEXT";
    public static final String C = "TIME_PICKER_OVERRIDE_THEME_RES_ID";
    public static final int s = 0;
    public static final int t = 1;
    public static final String u = "TIME_PICKER_TIME_MODEL";
    public static final String v = "TIME_PICKER_INPUT_MODE";
    public static final String w = "TIME_PICKER_TITLE_RES";
    public static final String x = "TIME_PICKER_TITLE_TEXT";
    public static final String y = "TIME_PICKER_POSITIVE_BUTTON_TEXT_RES";
    public static final String z = "TIME_PICKER_POSITIVE_BUTTON_TEXT";
    private TimePickerView H;
    private ViewStub I;
    @z1
    private fj2 J;
    @z1
    private jj2 K;
    @z1
    private hj2 L;
    @f1
    private int M;
    @f1
    private int N;
    private CharSequence P;
    private CharSequence R;
    private CharSequence T;
    private MaterialButton U;
    private Button V;
    private ej2 X;
    private final Set<View.OnClickListener> D = new LinkedHashSet();
    private final Set<View.OnClickListener> E = new LinkedHashSet();
    private final Set<DialogInterface.OnCancelListener> F = new LinkedHashSet();
    private final Set<DialogInterface.OnDismissListener> G = new LinkedHashSet();
    @l2
    private int O = 0;
    @l2
    private int Q = 0;
    @l2
    private int S = 0;
    private int W = 0;
    private int Y = 0;

    /* compiled from: MaterialTimePicker.java */
    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            for (View.OnClickListener onClickListener : aj2.this.D) {
                onClickListener.onClick(view);
            }
            aj2.this.dismiss();
        }
    }

    /* compiled from: MaterialTimePicker.java */
    /* loaded from: classes3.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            for (View.OnClickListener onClickListener : aj2.this.E) {
                onClickListener.onClick(view);
            }
            aj2.this.dismiss();
        }
    }

    /* compiled from: MaterialTimePicker.java */
    /* loaded from: classes3.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            aj2 aj2Var = aj2.this;
            aj2Var.W = aj2Var.W == 0 ? 1 : 0;
            aj2 aj2Var2 = aj2.this;
            aj2Var2.J(aj2Var2.U);
        }
    }

    /* compiled from: MaterialTimePicker.java */
    /* loaded from: classes3.dex */
    public static final class d {
        private int b;
        private CharSequence d;
        private CharSequence f;
        private CharSequence h;
        private ej2 a = new ej2();
        @l2
        private int c = 0;
        @l2
        private int e = 0;
        @l2
        private int g = 0;
        private int i = 0;

        @x1
        public aj2 j() {
            return aj2.z(this);
        }

        @x1
        public d k(@p1(from = 0, to = 23) int i) {
            this.a.l(i);
            return this;
        }

        @x1
        public d l(int i) {
            this.b = i;
            return this;
        }

        @x1
        public d m(@p1(from = 0, to = 59) int i) {
            this.a.m(i);
            return this;
        }

        @x1
        public d n(@l2 int i) {
            this.g = i;
            return this;
        }

        @x1
        public d o(@z1 CharSequence charSequence) {
            this.h = charSequence;
            return this;
        }

        @x1
        public d p(@l2 int i) {
            this.e = i;
            return this;
        }

        @x1
        public d q(@z1 CharSequence charSequence) {
            this.f = charSequence;
            return this;
        }

        @x1
        public d r(@m2 int i) {
            this.i = i;
            return this;
        }

        @x1
        public d s(int i) {
            ej2 ej2Var = this.a;
            int i2 = ej2Var.x;
            int i3 = ej2Var.y;
            ej2 ej2Var2 = new ej2(i);
            this.a = ej2Var2;
            ej2Var2.m(i3);
            this.a.l(i2);
            return this;
        }

        @x1
        public d t(@l2 int i) {
            this.c = i;
            return this;
        }

        @x1
        public d u(@z1 CharSequence charSequence) {
            this.d = charSequence;
            return this;
        }
    }

    private void E(@z1 Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ej2 ej2Var = (ej2) bundle.getParcelable(u);
        this.X = ej2Var;
        if (ej2Var == null) {
            this.X = new ej2();
        }
        this.W = bundle.getInt(v, 0);
        this.O = bundle.getInt(w, 0);
        this.P = bundle.getCharSequence(x);
        this.Q = bundle.getInt(y, 0);
        this.R = bundle.getCharSequence(z);
        this.S = bundle.getInt(A, 0);
        this.T = bundle.getCharSequence(B);
        this.Y = bundle.getInt(C, 0);
    }

    private void I() {
        Button button = this.V;
        if (button != null) {
            button.setVisibility(isCancelable() ? 0 : 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J(MaterialButton materialButton) {
        if (materialButton == null || this.H == null || this.I == null) {
            return;
        }
        hj2 hj2Var = this.L;
        if (hj2Var != null) {
            hj2Var.f();
        }
        hj2 y2 = y(this.W, this.H, this.I);
        this.L = y2;
        y2.show();
        this.L.a();
        Pair<Integer, Integer> s2 = s(this.W);
        materialButton.setIconResource(((Integer) s2.first).intValue());
        materialButton.setContentDescription(getResources().getString(((Integer) s2.second).intValue()));
        materialButton.sendAccessibilityEvent(4);
    }

    private Pair<Integer, Integer> s(int i) {
        if (i != 0) {
            if (i == 1) {
                return new Pair<>(Integer.valueOf(this.N), Integer.valueOf(ga2.m.u0));
            }
            throw new IllegalArgumentException(wo1.l("no icon for mode: ", i));
        }
        return new Pair<>(Integer.valueOf(this.M), Integer.valueOf(ga2.m.z0));
    }

    private int w() {
        int i = this.Y;
        if (i != 0) {
            return i;
        }
        TypedValue a2 = rg2.a(requireContext(), ga2.c.mb);
        if (a2 == null) {
            return 0;
        }
        return a2.data;
    }

    private hj2 y(int i, @x1 TimePickerView timePickerView, @x1 ViewStub viewStub) {
        if (i == 0) {
            fj2 fj2Var = this.J;
            if (fj2Var == null) {
                fj2Var = new fj2(timePickerView, this.X);
            }
            this.J = fj2Var;
            return fj2Var;
        }
        if (this.K == null) {
            this.K = new jj2((LinearLayout) viewStub.inflate(), this.X);
        }
        this.K.d();
        return this.K;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @x1
    public static aj2 z(@x1 d dVar) {
        aj2 aj2Var = new aj2();
        Bundle bundle = new Bundle();
        bundle.putParcelable(u, dVar.a);
        bundle.putInt(v, dVar.b);
        bundle.putInt(w, dVar.c);
        if (dVar.d != null) {
            bundle.putCharSequence(x, dVar.d);
        }
        bundle.putInt(y, dVar.e);
        if (dVar.f != null) {
            bundle.putCharSequence(z, dVar.f);
        }
        bundle.putInt(A, dVar.g);
        if (dVar.h != null) {
            bundle.putCharSequence(B, dVar.h);
        }
        bundle.putInt(C, dVar.i);
        aj2Var.setArguments(bundle);
        return aj2Var;
    }

    public boolean A(@x1 DialogInterface.OnCancelListener onCancelListener) {
        return this.F.remove(onCancelListener);
    }

    public boolean B(@x1 DialogInterface.OnDismissListener onDismissListener) {
        return this.G.remove(onDismissListener);
    }

    public boolean C(@x1 View.OnClickListener onClickListener) {
        return this.E.remove(onClickListener);
    }

    public boolean D(@x1 View.OnClickListener onClickListener) {
        return this.D.remove(onClickListener);
    }

    @r2
    public void F(@z1 hj2 hj2Var) {
        this.L = hj2Var;
    }

    public void G(@p1(from = 0, to = 23) int i) {
        this.X.k(i);
        hj2 hj2Var = this.L;
        if (hj2Var != null) {
            hj2Var.a();
        }
    }

    public void H(@p1(from = 0, to = 59) int i) {
        this.X.m(i);
        hj2 hj2Var = this.L;
        if (hj2Var != null) {
            hj2Var.a();
        }
    }

    @Override // com.google.android.material.timepicker.TimePickerView.e
    @i2({i2.a.LIBRARY_GROUP})
    public void a() {
        this.W = 1;
        J(this.U);
        this.K.h();
    }

    public boolean k(@x1 DialogInterface.OnCancelListener onCancelListener) {
        return this.F.add(onCancelListener);
    }

    public boolean l(@x1 DialogInterface.OnDismissListener onDismissListener) {
        return this.G.add(onDismissListener);
    }

    public boolean m(@x1 View.OnClickListener onClickListener) {
        return this.E.add(onClickListener);
    }

    public boolean n(@x1 View.OnClickListener onClickListener) {
        return this.D.add(onClickListener);
    }

    public void o() {
        this.F.clear();
    }

    @Override // com.p7700g.p99005.gx, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@x1 DialogInterface dialogInterface) {
        for (DialogInterface.OnCancelListener onCancelListener : this.F) {
            onCancelListener.onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // com.p7700g.p99005.gx, androidx.fragment.app.Fragment
    public void onCreate(@z1 Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        E(bundle);
    }

    @Override // com.p7700g.p99005.gx
    @x1
    public final Dialog onCreateDialog(@z1 Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), w());
        Context context = dialog.getContext();
        int g = rg2.g(context, ga2.c.o3, aj2.class.getCanonicalName());
        int i = ga2.c.lb;
        int i2 = ga2.n.Xi;
        lh2 lh2Var = new lh2(context, null, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, ga2.o.Gm, i, i2);
        this.N = obtainStyledAttributes.getResourceId(ga2.o.Hm, 0);
        this.M = obtainStyledAttributes.getResourceId(ga2.o.Im, 0);
        obtainStyledAttributes.recycle();
        lh2Var.Z(context);
        lh2Var.o0(ColorStateList.valueOf(g));
        Window window = dialog.getWindow();
        window.setBackgroundDrawable(lh2Var);
        window.requestFeature(1);
        window.setLayout(-2, -2);
        lh2Var.n0(sr.Q(window.getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    @x1
    public final View onCreateView(@x1 LayoutInflater layoutInflater, @z1 ViewGroup viewGroup, @z1 Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(ga2.k.i0, viewGroup);
        TimePickerView timePickerView = (TimePickerView) viewGroup2.findViewById(ga2.h.S2);
        this.H = timePickerView;
        timePickerView.L(this);
        this.I = (ViewStub) viewGroup2.findViewById(ga2.h.M2);
        this.U = (MaterialButton) viewGroup2.findViewById(ga2.h.Q2);
        TextView textView = (TextView) viewGroup2.findViewById(ga2.h.c2);
        int i = this.O;
        if (i != 0) {
            textView.setText(i);
        } else if (!TextUtils.isEmpty(this.P)) {
            textView.setText(this.P);
        }
        J(this.U);
        Button button = (Button) viewGroup2.findViewById(ga2.h.R2);
        button.setOnClickListener(new a());
        int i2 = this.Q;
        if (i2 != 0) {
            button.setText(i2);
        } else if (!TextUtils.isEmpty(this.R)) {
            button.setText(this.R);
        }
        Button button2 = (Button) viewGroup2.findViewById(ga2.h.N2);
        this.V = button2;
        button2.setOnClickListener(new b());
        int i3 = this.S;
        if (i3 != 0) {
            this.V.setText(i3);
        } else if (!TextUtils.isEmpty(this.T)) {
            this.V.setText(this.T);
        }
        I();
        this.U.setOnClickListener(new c());
        return viewGroup2;
    }

    @Override // com.p7700g.p99005.gx, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.L = null;
        this.J = null;
        this.K = null;
        TimePickerView timePickerView = this.H;
        if (timePickerView != null) {
            timePickerView.L(null);
            this.H = null;
        }
    }

    @Override // com.p7700g.p99005.gx, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@x1 DialogInterface dialogInterface) {
        for (DialogInterface.OnDismissListener onDismissListener : this.G) {
            onDismissListener.onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    @Override // com.p7700g.p99005.gx, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@x1 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable(u, this.X);
        bundle.putInt(v, this.W);
        bundle.putInt(w, this.O);
        bundle.putCharSequence(x, this.P);
        bundle.putInt(y, this.Q);
        bundle.putCharSequence(z, this.R);
        bundle.putInt(A, this.S);
        bundle.putCharSequence(B, this.T);
        bundle.putInt(C, this.Y);
    }

    public void p() {
        this.G.clear();
    }

    public void q() {
        this.E.clear();
    }

    public void r() {
        this.D.clear();
    }

    @Override // com.p7700g.p99005.gx
    public void setCancelable(boolean z2) {
        super.setCancelable(z2);
        I();
    }

    @p1(from = 0, to = 23)
    public int t() {
        return this.X.x % 24;
    }

    public int u() {
        return this.W;
    }

    @p1(from = 0, to = 59)
    public int v() {
        return this.X.y;
    }

    @z1
    public fj2 x() {
        return this.J;
    }
}