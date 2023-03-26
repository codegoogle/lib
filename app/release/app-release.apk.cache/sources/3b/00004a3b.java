package com.p7700g.p99005;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
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

/* compiled from: SingleDateSelector.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class jd2 implements tc2<Long> {
    public static final Parcelable.Creator<jd2> CREATOR = new b();
    @z1
    private Long s;

    /* compiled from: SingleDateSelector.java */
    /* loaded from: classes3.dex */
    public class a extends sc2 {
        public final /* synthetic */ gd2 z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, DateFormat dateFormat, TextInputLayout textInputLayout, oc2 oc2Var, gd2 gd2Var) {
            super(str, dateFormat, textInputLayout, oc2Var);
            this.z = gd2Var;
        }

        @Override // com.p7700g.p99005.sc2
        public void e() {
            this.z.a();
        }

        @Override // com.p7700g.p99005.sc2
        public void f(@z1 Long l) {
            if (l == null) {
                jd2.this.e();
            } else {
                jd2.this.X2(l.longValue());
            }
            this.z.b(jd2.this.Z());
        }
    }

    /* compiled from: SingleDateSelector.java */
    /* loaded from: classes3.dex */
    public class b implements Parcelable.Creator<jd2> {
        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: a */
        public jd2 createFromParcel(@x1 Parcel parcel) {
            jd2 jd2Var = new jd2();
            jd2Var.s = (Long) parcel.readValue(Long.class.getClassLoader());
            return jd2Var;
        }

        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: b */
        public jd2[] newArray(int i) {
            return new jd2[i];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        this.s = null;
    }

    @Override // com.p7700g.p99005.tc2
    public View A(@x1 LayoutInflater layoutInflater, @z1 ViewGroup viewGroup, @z1 Bundle bundle, oc2 oc2Var, @x1 gd2<Long> gd2Var) {
        View inflate = layoutInflater.inflate(ga2.k.M0, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(ga2.h.x3);
        EditText editText = textInputLayout.getEditText();
        if (oe2.a()) {
            editText.setInputType(17);
        }
        SimpleDateFormat p = md2.p();
        String q = md2.q(inflate.getResources(), p);
        textInputLayout.setPlaceholderText(q);
        Long l = this.s;
        if (l != null) {
            editText.setText(p.format(l));
        }
        editText.addTextChangedListener(new a(q, p, textInputLayout, oc2Var, gd2Var));
        kf2.p(editText);
        return inflate;
    }

    @Override // com.p7700g.p99005.tc2
    public int E() {
        return ga2.m.K0;
    }

    @Override // com.p7700g.p99005.tc2
    public int P(Context context) {
        return rg2.g(context, ga2.c.Za, zc2.class.getCanonicalName());
    }

    @Override // com.p7700g.p99005.tc2
    public boolean U() {
        return this.s != null;
    }

    @Override // com.p7700g.p99005.tc2
    @x1
    public Collection<Long> X() {
        ArrayList arrayList = new ArrayList();
        Long l = this.s;
        if (l != null) {
            arrayList.add(l);
        }
        return arrayList;
    }

    @Override // com.p7700g.p99005.tc2
    public void X2(long j) {
        this.s = Long.valueOf(j);
    }

    @Override // com.p7700g.p99005.tc2
    @x1
    public String a(@x1 Context context) {
        Resources resources = context.getResources();
        Long l = this.s;
        if (l == null) {
            return resources.getString(ga2.m.L0);
        }
        return resources.getString(ga2.m.J0, uc2.j(l.longValue()));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.p7700g.p99005.tc2
    @x1
    public Collection<fp<Long, Long>> f() {
        return new ArrayList();
    }

    @Override // com.p7700g.p99005.tc2
    @z1
    /* renamed from: g */
    public Long Z() {
        return this.s;
    }

    @Override // com.p7700g.p99005.tc2
    /* renamed from: i */
    public void h(@z1 Long l) {
        this.s = l == null ? null : Long.valueOf(md2.a(l.longValue()));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@x1 Parcel parcel, int i) {
        parcel.writeValue(this.s);
    }
}