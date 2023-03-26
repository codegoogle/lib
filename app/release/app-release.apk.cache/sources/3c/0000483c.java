package com.p7700g.p99005;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.i2;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: RangeDateSelector.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class id2 implements tc2<fp<Long, Long>> {
    public static final Parcelable.Creator<id2> CREATOR = new c();
    private String s;
    private final String t = " ";
    @z1
    private Long u = null;
    @z1
    private Long v = null;
    @z1
    private Long w = null;
    @z1
    private Long x = null;

    /* compiled from: RangeDateSelector.java */
    /* loaded from: classes3.dex */
    public class a extends sc2 {
        public final /* synthetic */ TextInputLayout A;
        public final /* synthetic */ gd2 B;
        public final /* synthetic */ TextInputLayout z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, DateFormat dateFormat, TextInputLayout textInputLayout, oc2 oc2Var, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, gd2 gd2Var) {
            super(str, dateFormat, textInputLayout, oc2Var);
            this.z = textInputLayout2;
            this.A = textInputLayout3;
            this.B = gd2Var;
        }

        @Override // com.p7700g.p99005.sc2
        public void e() {
            id2.this.w = null;
            id2.this.o(this.z, this.A, this.B);
        }

        @Override // com.p7700g.p99005.sc2
        public void f(@z1 Long l) {
            id2.this.w = l;
            id2.this.o(this.z, this.A, this.B);
        }
    }

    /* compiled from: RangeDateSelector.java */
    /* loaded from: classes3.dex */
    public class b extends sc2 {
        public final /* synthetic */ TextInputLayout A;
        public final /* synthetic */ gd2 B;
        public final /* synthetic */ TextInputLayout z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, DateFormat dateFormat, TextInputLayout textInputLayout, oc2 oc2Var, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, gd2 gd2Var) {
            super(str, dateFormat, textInputLayout, oc2Var);
            this.z = textInputLayout2;
            this.A = textInputLayout3;
            this.B = gd2Var;
        }

        @Override // com.p7700g.p99005.sc2
        public void e() {
            id2.this.x = null;
            id2.this.o(this.z, this.A, this.B);
        }

        @Override // com.p7700g.p99005.sc2
        public void f(@z1 Long l) {
            id2.this.x = l;
            id2.this.o(this.z, this.A, this.B);
        }
    }

    /* compiled from: RangeDateSelector.java */
    /* loaded from: classes3.dex */
    public class c implements Parcelable.Creator<id2> {
        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: a */
        public id2 createFromParcel(@x1 Parcel parcel) {
            id2 id2Var = new id2();
            id2Var.u = (Long) parcel.readValue(Long.class.getClassLoader());
            id2Var.v = (Long) parcel.readValue(Long.class.getClassLoader());
            return id2Var;
        }

        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: b */
        public id2[] newArray(int i) {
            return new id2[i];
        }
    }

    private void j(@x1 TextInputLayout textInputLayout, @x1 TextInputLayout textInputLayout2) {
        if (textInputLayout.getError() != null && this.s.contentEquals(textInputLayout.getError())) {
            textInputLayout.setError(null);
        }
        if (textInputLayout2.getError() == null || !" ".contentEquals(textInputLayout2.getError())) {
            return;
        }
        textInputLayout2.setError(null);
    }

    private boolean l(long j, long j2) {
        return j <= j2;
    }

    private void m(@x1 TextInputLayout textInputLayout, @x1 TextInputLayout textInputLayout2) {
        textInputLayout.setError(this.s);
        textInputLayout2.setError(" ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(@x1 TextInputLayout textInputLayout, @x1 TextInputLayout textInputLayout2, @x1 gd2<fp<Long, Long>> gd2Var) {
        Long l = this.w;
        if (l != null && this.x != null) {
            if (l(l.longValue(), this.x.longValue())) {
                this.u = this.w;
                this.v = this.x;
                gd2Var.b(Z());
                return;
            }
            m(textInputLayout, textInputLayout2);
            gd2Var.a();
            return;
        }
        j(textInputLayout, textInputLayout2);
        gd2Var.a();
    }

    @Override // com.p7700g.p99005.tc2
    public View A(@x1 LayoutInflater layoutInflater, @z1 ViewGroup viewGroup, @z1 Bundle bundle, oc2 oc2Var, @x1 gd2<fp<Long, Long>> gd2Var) {
        View inflate = layoutInflater.inflate(ga2.k.N0, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(ga2.h.z3);
        TextInputLayout textInputLayout2 = (TextInputLayout) inflate.findViewById(ga2.h.y3);
        EditText editText = textInputLayout.getEditText();
        EditText editText2 = textInputLayout2.getEditText();
        if (oe2.a()) {
            editText.setInputType(17);
            editText2.setInputType(17);
        }
        this.s = inflate.getResources().getString(ga2.m.Q0);
        SimpleDateFormat p = md2.p();
        Long l = this.u;
        if (l != null) {
            editText.setText(p.format(l));
            this.w = this.u;
        }
        Long l2 = this.v;
        if (l2 != null) {
            editText2.setText(p.format(l2));
            this.x = this.v;
        }
        String q = md2.q(inflate.getResources(), p);
        textInputLayout.setPlaceholderText(q);
        textInputLayout2.setPlaceholderText(q);
        editText.addTextChangedListener(new a(q, p, textInputLayout, oc2Var, textInputLayout, textInputLayout2, gd2Var));
        editText2.addTextChangedListener(new b(q, p, textInputLayout2, oc2Var, textInputLayout, textInputLayout2, gd2Var));
        kf2.p(editText);
        return inflate;
    }

    @Override // com.p7700g.p99005.tc2
    public int E() {
        return ga2.m.W0;
    }

    @Override // com.p7700g.p99005.tc2
    public int P(@x1 Context context) {
        int i;
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(ga2.f.f7)) {
            i = ga2.c.Za;
        } else {
            i = ga2.c.Oa;
        }
        return rg2.g(context, i, zc2.class.getCanonicalName());
    }

    @Override // com.p7700g.p99005.tc2
    public boolean U() {
        Long l = this.u;
        return (l == null || this.v == null || !l(l.longValue(), this.v.longValue())) ? false : true;
    }

    @Override // com.p7700g.p99005.tc2
    @x1
    public Collection<Long> X() {
        ArrayList arrayList = new ArrayList();
        Long l = this.u;
        if (l != null) {
            arrayList.add(l);
        }
        Long l2 = this.v;
        if (l2 != null) {
            arrayList.add(l2);
        }
        return arrayList;
    }

    @Override // com.p7700g.p99005.tc2
    public void X2(long j) {
        Long l = this.u;
        if (l == null) {
            this.u = Long.valueOf(j);
        } else if (this.v == null && l(l.longValue(), j)) {
            this.v = Long.valueOf(j);
        } else {
            this.v = null;
            this.u = Long.valueOf(j);
        }
    }

    @Override // com.p7700g.p99005.tc2
    @x1
    public String a(@x1 Context context) {
        Resources resources = context.getResources();
        Long l = this.u;
        if (l == null && this.v == null) {
            return resources.getString(ga2.m.X0);
        }
        Long l2 = this.v;
        if (l2 == null) {
            return resources.getString(ga2.m.U0, uc2.c(l.longValue()));
        }
        if (l == null) {
            return resources.getString(ga2.m.T0, uc2.c(l2.longValue()));
        }
        fp<String, String> a2 = uc2.a(l, l2);
        return resources.getString(ga2.m.V0, a2.a, a2.b);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.p7700g.p99005.tc2
    @x1
    public Collection<fp<Long, Long>> f() {
        if (this.u != null && this.v != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new fp(this.u, this.v));
            return arrayList;
        }
        return new ArrayList();
    }

    @Override // com.p7700g.p99005.tc2
    @x1
    /* renamed from: k */
    public fp<Long, Long> Z() {
        return new fp<>(this.u, this.v);
    }

    @Override // com.p7700g.p99005.tc2
    /* renamed from: n */
    public void h(@x1 fp<Long, Long> fpVar) {
        Long l = fpVar.a;
        if (l != null && fpVar.b != null) {
            jp.a(l(l.longValue(), fpVar.b.longValue()));
        }
        Long l2 = fpVar.a;
        this.u = l2 == null ? null : Long.valueOf(md2.a(l2.longValue()));
        Long l3 = fpVar.b;
        this.v = l3 != null ? Long.valueOf(md2.a(l3.longValue())) : null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@x1 Parcel parcel, int i) {
        parcel.writeValue(this.u);
        parcel.writeValue(this.v);
    }
}