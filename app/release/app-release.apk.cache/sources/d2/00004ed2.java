package com.p7700g.p99005;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.p7700g.p99005.xu0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ConnectionStatus.java */
/* loaded from: classes2.dex */
public class lm1 implements Parcelable {
    @x1
    public static final Parcelable.Creator<lm1> CREATOR = new a();
    @x1
    private final List<km1> s;
    @x1
    private final List<km1> t;
    @x1
    private final String u;
    @x1
    private final String v;
    @x1
    private final String w;
    @x1
    private final ti1 x;
    @x1
    private final Bundle y;

    /* compiled from: ConnectionStatus.java */
    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<lm1> {
        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: a */
        public lm1 createFromParcel(@x1 Parcel parcel) {
            return new lm1(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: b */
        public lm1[] newArray(int i) {
            return new lm1[i];
        }
    }

    public lm1(@x1 List<km1> list, @x1 List<km1> list2, @x1 String str, @x1 String str2, @x1 String str3) {
        this(list, list2, str, str2, str3, ti1.s);
    }

    @x1
    public static lm1 g() {
        return new lm1(Collections.emptyList(), Collections.emptyList(), "", "", "");
    }

    private void i(@x1 Set<vm1> set, @x1 JSONArray jSONArray, int i) {
        for (vm1 vm1Var : set) {
            JSONObject c = vm1Var.c();
            try {
                c.put(xu0.f.h, i);
            } catch (JSONException unused) {
            }
            jSONArray.put(c);
        }
    }

    @x1
    private Set<vm1> q(@x1 List<km1> list) {
        HashSet hashSet = new HashSet();
        for (km1 km1Var : list) {
            hashSet.addAll(km1Var.g());
        }
        return hashSet;
    }

    @x1
    public lm1 c(@x1 Bundle bundle) {
        this.y.putAll(bundle);
        return this;
    }

    @x1
    public JSONArray d() {
        JSONArray jSONArray = new JSONArray();
        i(q(this.s), jSONArray, 0);
        i(q(this.t), jSONArray, 2);
        return jSONArray;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @x1
    public lm1 e(@x1 lm1 lm1Var) {
        if (this.u.equals(lm1Var.u) && this.v.equals(lm1Var.v)) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            arrayList.addAll(this.s);
            arrayList.addAll(lm1Var.s);
            arrayList2.addAll(this.t);
            arrayList2.addAll(lm1Var.t);
            return new lm1(arrayList, arrayList2, this.u, this.v, this.w, ti1.s, this.y);
        }
        return this;
    }

    public boolean equals(@z1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        lm1 lm1Var = (lm1) obj;
        return this.s.equals(lm1Var.s) && this.t.equals(lm1Var.t) && this.u.equals(lm1Var.u) && this.v.equals(lm1Var.v) && this.w.equals(lm1Var.w) && this.x.equals(lm1Var.x);
    }

    public int hashCode() {
        int hashCode = this.t.hashCode();
        int x = wo1.x(this.w, wo1.x(this.v, wo1.x(this.u, (hashCode + (this.s.hashCode() * 31)) * 31, 31), 31), 31);
        return this.y.hashCode() + ((this.x.hashCode() + x) * 31);
    }

    @x1
    public ti1 j() {
        return this.x;
    }

    @x1
    public Bundle k() {
        return this.y;
    }

    @x1
    public List<km1> l() {
        return this.t;
    }

    @x1
    public String m() {
        return this.u;
    }

    @x1
    public String n() {
        return this.w;
    }

    @x1
    public String o() {
        return this.v;
    }

    @x1
    public List<km1> p() {
        return this.s;
    }

    @x1
    public lm1 r(@x1 ti1 ti1Var) {
        return new lm1(this.s, this.t, this.u, this.v, this.w, ti1Var, this.y);
    }

    @x1
    public String toString() {
        StringBuilder G = wo1.G("ConnectionStatus{successInfo=");
        G.append(this.s);
        G.append(", failInfo=");
        G.append(this.t);
        G.append(", protocol='");
        wo1.d0(G, this.u, '\'', ", sessionId='");
        wo1.d0(G, this.v, '\'', ", protocolVersion='");
        wo1.d0(G, this.w, '\'', ", connectionAttemptId=");
        G.append(this.x);
        G.append(", extras=");
        G.append(this.y);
        G.append('}');
        return G.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@x1 Parcel parcel, int i) {
        parcel.writeTypedList(this.s);
        parcel.writeTypedList(this.t);
        parcel.writeString(this.u);
        parcel.writeString(this.v);
        parcel.writeString(this.w);
        parcel.writeParcelable(this.x, i);
        parcel.writeBundle(this.y);
    }

    public lm1(@x1 List<km1> list, @x1 List<km1> list2, @x1 String str, @x1 String str2, @x1 String str3, @x1 ti1 ti1Var) {
        this(list, list2, str, str2, str3, ti1Var, new Bundle());
    }

    public lm1(@x1 List<km1> list, @x1 List<km1> list2, @x1 String str, @x1 String str2, @x1 String str3, @x1 ti1 ti1Var, @x1 Bundle bundle) {
        this.s = list;
        this.t = list2;
        this.u = str;
        this.v = str2;
        this.w = str3;
        this.x = ti1Var;
        this.y = bundle;
    }

    public lm1(@x1 Parcel parcel) {
        Parcelable.Creator<km1> creator = km1.CREATOR;
        this.s = (List) r81.f(parcel.createTypedArrayList(creator));
        this.t = (List) r81.f(parcel.createTypedArrayList(creator));
        this.u = (String) r81.f(parcel.readString());
        this.v = (String) r81.f(parcel.readString());
        this.w = (String) r81.f(parcel.readString());
        this.x = (ti1) r81.f((ti1) parcel.readParcelable(ti1.class.getClassLoader()));
        this.y = parcel.readBundle(getClass().getClassLoader());
    }
}