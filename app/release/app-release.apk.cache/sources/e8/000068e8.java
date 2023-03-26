package com.p7700g.p99005;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.gs;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.oc2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: MaterialDatePicker.java */
/* loaded from: classes3.dex */
public final class zc2<S> extends gx {
    private static final String A = "NEGATIVE_BUTTON_TEXT_KEY";
    private static final String B = "INPUT_MODE_KEY";
    public static final Object C = "CONFIRM_BUTTON_TAG";
    public static final Object D = "CANCEL_BUTTON_TAG";
    public static final Object E = "TOGGLE_BUTTON_TAG";
    public static final int F = 0;
    public static final int G = 1;
    private static final String s = "OVERRIDE_THEME_RES_ID";
    private static final String t = "DATE_SELECTOR_KEY";
    private static final String u = "CALENDAR_CONSTRAINTS_KEY";
    private static final String v = "TITLE_TEXT_RES_ID_KEY";
    private static final String w = "TITLE_TEXT_KEY";
    private static final String x = "POSITIVE_BUTTON_TEXT_RES_ID_KEY";
    private static final String y = "POSITIVE_BUTTON_TEXT_KEY";
    private static final String z = "NEGATIVE_BUTTON_TEXT_RES_ID_KEY";
    private final LinkedHashSet<ad2<? super S>> H = new LinkedHashSet<>();
    private final LinkedHashSet<View.OnClickListener> I = new LinkedHashSet<>();
    private final LinkedHashSet<DialogInterface.OnCancelListener> J = new LinkedHashSet<>();
    private final LinkedHashSet<DialogInterface.OnDismissListener> K = new LinkedHashSet<>();
    @m2
    private int L;
    @z1
    private tc2<S> M;
    private hd2<S> N;
    @z1
    private oc2 O;
    private yc2<S> P;
    @l2
    private int Q;
    private CharSequence R;
    private boolean S;
    private int T;
    @l2
    private int U;
    private CharSequence V;
    @l2
    private int W;
    private CharSequence X;
    private TextView Y;
    private CheckableImageButton Z;
    @z1
    private lh2 u0;
    private Button v0;
    private boolean w0;

    /* compiled from: MaterialDatePicker.java */
    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = zc2.this.H.iterator();
            while (it.hasNext()) {
                ((ad2) it.next()).a(zc2.this.y());
            }
            zc2.this.dismiss();
        }
    }

    /* compiled from: MaterialDatePicker.java */
    /* loaded from: classes3.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = zc2.this.I.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            zc2.this.dismiss();
        }
    }

    /* compiled from: MaterialDatePicker.java */
    /* loaded from: classes3.dex */
    public class c implements jr {
        public final /* synthetic */ int a;
        public final /* synthetic */ View b;
        public final /* synthetic */ int c;

        public c(int i, View view, int i2) {
            this.a = i;
            this.b = view;
            this.c = i2;
        }

        @Override // com.p7700g.p99005.jr
        public gs a(View view, gs gsVar) {
            int i = gsVar.f(gs.m.i()).c;
            if (this.a >= 0) {
                this.b.getLayoutParams().height = this.a + i;
                View view2 = this.b;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = this.b;
            view3.setPadding(view3.getPaddingLeft(), this.c + i, this.b.getPaddingRight(), this.b.getPaddingBottom());
            return gsVar;
        }
    }

    /* compiled from: MaterialDatePicker.java */
    /* loaded from: classes3.dex */
    public class d extends gd2<S> {
        public d() {
        }

        @Override // com.p7700g.p99005.gd2
        public void a() {
            zc2.this.v0.setEnabled(false);
        }

        @Override // com.p7700g.p99005.gd2
        public void b(S s) {
            zc2.this.M();
            zc2.this.v0.setEnabled(zc2.this.v().U());
        }
    }

    /* compiled from: MaterialDatePicker.java */
    /* loaded from: classes3.dex */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            zc2.this.v0.setEnabled(zc2.this.v().U());
            zc2.this.Z.toggle();
            zc2 zc2Var = zc2.this;
            zc2Var.N(zc2Var.Z);
            zc2.this.J();
        }
    }

    /* compiled from: MaterialDatePicker.java */
    /* loaded from: classes3.dex */
    public static final class f<S> {
        public final tc2<S> a;
        public oc2 c;
        public int b = 0;
        public int d = 0;
        public CharSequence e = null;
        public int f = 0;
        public CharSequence g = null;
        public int h = 0;
        public CharSequence i = null;
        @z1
        public S j = null;
        public int k = 0;

        private f(tc2<S> tc2Var) {
            this.a = tc2Var;
        }

        private dd2 b() {
            if (!this.a.X().isEmpty()) {
                dd2 e = dd2.e(this.a.X().iterator().next().longValue());
                if (f(e, this.c)) {
                    return e;
                }
            }
            dd2 g = dd2.g();
            return f(g, this.c) ? g : this.c.n();
        }

        @i2({i2.a.LIBRARY_GROUP})
        @x1
        public static <S> f<S> c(@x1 tc2<S> tc2Var) {
            return new f<>(tc2Var);
        }

        @x1
        public static f<Long> d() {
            return new f<>(new jd2());
        }

        @x1
        public static f<fp<Long, Long>> e() {
            return new f<>(new id2());
        }

        private static boolean f(dd2 dd2Var, oc2 oc2Var) {
            return dd2Var.compareTo(oc2Var.n()) >= 0 && dd2Var.compareTo(oc2Var.k()) <= 0;
        }

        @x1
        public zc2<S> a() {
            if (this.c == null) {
                this.c = new oc2.b().a();
            }
            if (this.d == 0) {
                this.d = this.a.E();
            }
            S s = this.j;
            if (s != null) {
                this.a.h(s);
            }
            if (this.c.m() == null) {
                this.c.q(b());
            }
            return zc2.D(this);
        }

        @x1
        public f<S> g(oc2 oc2Var) {
            this.c = oc2Var;
            return this;
        }

        @x1
        public f<S> h(int i) {
            this.k = i;
            return this;
        }

        @x1
        public f<S> i(@l2 int i) {
            this.h = i;
            this.i = null;
            return this;
        }

        @x1
        public f<S> j(@z1 CharSequence charSequence) {
            this.i = charSequence;
            this.h = 0;
            return this;
        }

        @x1
        public f<S> k(@l2 int i) {
            this.f = i;
            this.g = null;
            return this;
        }

        @x1
        public f<S> l(@z1 CharSequence charSequence) {
            this.g = charSequence;
            this.f = 0;
            return this;
        }

        @x1
        public f<S> m(S s) {
            this.j = s;
            return this;
        }

        @x1
        public f<S> n(@m2 int i) {
            this.b = i;
            return this;
        }

        @x1
        public f<S> o(@l2 int i) {
            this.d = i;
            this.e = null;
            return this;
        }

        @x1
        public f<S> p(@z1 CharSequence charSequence) {
            this.e = charSequence;
            this.d = 0;
            return this;
        }
    }

    /* compiled from: MaterialDatePicker.java */
    @i2({i2.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface g {
    }

    private void A(Context context) {
        this.Z.setTag(E);
        this.Z.setImageDrawable(t(context));
        this.Z.setChecked(this.T != 0);
        sr.A1(this.Z, null);
        N(this.Z);
        this.Z.setOnClickListener(new e());
    }

    public static boolean B(@x1 Context context) {
        return E(context, 16843277);
    }

    public static boolean C(@x1 Context context) {
        return E(context, ga2.c.oc);
    }

    @x1
    public static <S> zc2<S> D(@x1 f<S> fVar) {
        zc2<S> zc2Var = new zc2<>();
        Bundle bundle = new Bundle();
        bundle.putInt(s, fVar.b);
        bundle.putParcelable(t, fVar.a);
        bundle.putParcelable(u, fVar.c);
        bundle.putInt(v, fVar.d);
        bundle.putCharSequence(w, fVar.e);
        bundle.putInt(B, fVar.k);
        bundle.putInt(x, fVar.f);
        bundle.putCharSequence(y, fVar.g);
        bundle.putInt(z, fVar.h);
        bundle.putCharSequence(A, fVar.i);
        zc2Var.setArguments(bundle);
        return zc2Var;
    }

    public static boolean E(@x1 Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(rg2.g(context, ga2.c.Ya, yc2.class.getCanonicalName()), new int[]{i});
        boolean z2 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        hd2<S> hd2Var;
        int z2 = z(requireContext());
        this.P = yc2.w(v(), z2, this.O);
        if (this.Z.isChecked()) {
            hd2Var = cd2.g(v(), z2, this.O);
        } else {
            hd2Var = this.P;
        }
        this.N = hd2Var;
        M();
        dy r = getChildFragmentManager().r();
        r.C(ga2.h.i3, this.N);
        r.s();
        this.N.b(new d());
    }

    public static long K() {
        return dd2.g().x;
    }

    public static long L() {
        return md2.t().getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M() {
        String w2 = w();
        this.Y.setContentDescription(String.format(getString(ga2.m.G0), w2));
        this.Y.setText(w2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(@x1 CheckableImageButton checkableImageButton) {
        String string;
        if (this.Z.isChecked()) {
            string = checkableImageButton.getContext().getString(ga2.m.f1);
        } else {
            string = checkableImageButton.getContext().getString(ga2.m.h1);
        }
        this.Z.setContentDescription(string);
    }

    @x1
    private static Drawable t(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, r3.b(context, ga2.g.d1));
        stateListDrawable.addState(new int[0], r3.b(context, ga2.g.f1));
        return stateListDrawable;
    }

    private void u(Window window) {
        if (this.w0) {
            return;
        }
        View findViewById = requireView().findViewById(ga2.h.W1);
        ke2.b(window, true, kf2.f(findViewById), null);
        sr.Z1(findViewById, new c(findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingTop()));
        this.w0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public tc2<S> v() {
        if (this.M == null) {
            this.M = (tc2) getArguments().getParcelable(t);
        }
        return this.M;
    }

    private static int x(@x1 Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(ga2.f.M6);
        int i = dd2.g().v;
        int dimensionPixelSize = resources.getDimensionPixelSize(ga2.f.S6) * i;
        return ((i - 1) * resources.getDimensionPixelOffset(ga2.f.g7)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    private int z(Context context) {
        int i = this.L;
        return i != 0 ? i : v().P(context);
    }

    public boolean F(DialogInterface.OnCancelListener onCancelListener) {
        return this.J.remove(onCancelListener);
    }

    public boolean G(DialogInterface.OnDismissListener onDismissListener) {
        return this.K.remove(onDismissListener);
    }

    public boolean H(View.OnClickListener onClickListener) {
        return this.I.remove(onClickListener);
    }

    public boolean I(ad2<? super S> ad2Var) {
        return this.H.remove(ad2Var);
    }

    public boolean l(DialogInterface.OnCancelListener onCancelListener) {
        return this.J.add(onCancelListener);
    }

    public boolean m(DialogInterface.OnDismissListener onDismissListener) {
        return this.K.add(onDismissListener);
    }

    public boolean n(View.OnClickListener onClickListener) {
        return this.I.add(onClickListener);
    }

    public boolean o(ad2<? super S> ad2Var) {
        return this.H.add(ad2Var);
    }

    @Override // com.p7700g.p99005.gx, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@x1 DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.J.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // com.p7700g.p99005.gx, androidx.fragment.app.Fragment
    public final void onCreate(@z1 Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.L = bundle.getInt(s);
        this.M = (tc2) bundle.getParcelable(t);
        this.O = (oc2) bundle.getParcelable(u);
        this.Q = bundle.getInt(v);
        this.R = bundle.getCharSequence(w);
        this.T = bundle.getInt(B);
        this.U = bundle.getInt(x);
        this.V = bundle.getCharSequence(y);
        this.W = bundle.getInt(z);
        this.X = bundle.getCharSequence(A);
    }

    @Override // com.p7700g.p99005.gx
    @x1
    public final Dialog onCreateDialog(@z1 Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), z(requireContext()));
        Context context = dialog.getContext();
        this.S = B(context);
        int g2 = rg2.g(context, ga2.c.o3, zc2.class.getCanonicalName());
        lh2 lh2Var = new lh2(context, null, ga2.c.Ya, ga2.n.Th);
        this.u0 = lh2Var;
        lh2Var.Z(context);
        this.u0.o0(ColorStateList.valueOf(g2));
        this.u0.n0(sr.Q(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    @x1
    public final View onCreateView(@x1 LayoutInflater layoutInflater, @z1 ViewGroup viewGroup, @z1 Bundle bundle) {
        View inflate = layoutInflater.inflate(this.S ? ga2.k.G0 : ga2.k.F0, viewGroup);
        Context context = inflate.getContext();
        if (this.S) {
            inflate.findViewById(ga2.h.i3).setLayoutParams(new LinearLayout.LayoutParams(x(context), -2));
        } else {
            inflate.findViewById(ga2.h.j3).setLayoutParams(new LinearLayout.LayoutParams(x(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(ga2.h.u3);
        this.Y = textView;
        sr.C1(textView, 1);
        this.Z = (CheckableImageButton) inflate.findViewById(ga2.h.w3);
        TextView textView2 = (TextView) inflate.findViewById(ga2.h.A3);
        CharSequence charSequence = this.R;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.Q);
        }
        A(context);
        this.v0 = (Button) inflate.findViewById(ga2.h.S0);
        if (v().U()) {
            this.v0.setEnabled(true);
        } else {
            this.v0.setEnabled(false);
        }
        this.v0.setTag(C);
        CharSequence charSequence2 = this.V;
        if (charSequence2 != null) {
            this.v0.setText(charSequence2);
        } else {
            int i = this.U;
            if (i != 0) {
                this.v0.setText(i);
            }
        }
        this.v0.setOnClickListener(new a());
        Button button = (Button) inflate.findViewById(ga2.h.B0);
        button.setTag(D);
        CharSequence charSequence3 = this.X;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i2 = this.W;
            if (i2 != 0) {
                button.setText(i2);
            }
        }
        button.setOnClickListener(new b());
        return inflate;
    }

    @Override // com.p7700g.p99005.gx, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@x1 DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.K.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // com.p7700g.p99005.gx, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@x1 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(s, this.L);
        bundle.putParcelable(t, this.M);
        oc2.b bVar = new oc2.b(this.O);
        if (this.P.s() != null) {
            bVar.c(this.P.s().x);
        }
        bundle.putParcelable(u, bVar.a());
        bundle.putInt(v, this.Q);
        bundle.putCharSequence(w, this.R);
        bundle.putInt(x, this.U);
        bundle.putCharSequence(y, this.V);
        bundle.putInt(z, this.W);
        bundle.putCharSequence(A, this.X);
    }

    @Override // com.p7700g.p99005.gx, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.S) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.u0);
            u(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(ga2.f.U6);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.u0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new od2(requireDialog(), rect));
        }
        J();
    }

    @Override // com.p7700g.p99005.gx, androidx.fragment.app.Fragment
    public void onStop() {
        this.N.d();
        super.onStop();
    }

    public void p() {
        this.J.clear();
    }

    public void q() {
        this.K.clear();
    }

    public void r() {
        this.I.clear();
    }

    public void s() {
        this.H.clear();
    }

    public String w() {
        return v().a(getContext());
    }

    @z1
    public final S y() {
        return v().Z();
    }
}