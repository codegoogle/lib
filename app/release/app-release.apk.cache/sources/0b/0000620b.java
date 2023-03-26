package com.p7700g.p99005;

import android.os.Parcel;
import android.os.Parcelable;
import com.p7700g.p99005.xu0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: IpDomainPair.java */
/* loaded from: classes2.dex */
public class vm1 implements Parcelable {
    public static final Parcelable.Creator<vm1> CREATOR = new a();
    @x1
    public static final String s = "duration";
    @x1
    private final String t;
    @x1
    private final String u;

    /* compiled from: IpDomainPair.java */
    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<vm1> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public vm1 createFromParcel(@x1 Parcel parcel) {
            return new vm1(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public vm1[] newArray(int i) {
            return new vm1[i];
        }
    }

    public vm1(@x1 String str, @x1 String str2) {
        this.t = str;
        this.u = str2;
    }

    @x1
    public JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(xu0.f.u, this.u);
            jSONObject.put(xu0.f.v, e());
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @x1
    public String d() {
        return this.u;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @x1
    public String e() {
        return this.t;
    }

    public boolean equals(@z1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        vm1 vm1Var = (vm1) obj;
        if (this.t.equals(vm1Var.t)) {
            return this.u.equals(vm1Var.u);
        }
        return false;
    }

    public int hashCode() {
        return this.u.hashCode() + (this.t.hashCode() * 31);
    }

    @x1
    public String toString() {
        StringBuilder G = wo1.G("IpDomainPair{ip='");
        wo1.d0(G, this.t, '\'', ", domain='");
        G.append(this.u);
        G.append('\'');
        G.append('}');
        return G.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@x1 Parcel parcel, int i) {
        parcel.writeString(this.t);
        parcel.writeString(this.u);
    }

    public vm1(@x1 Parcel parcel) {
        this.t = (String) r81.f(parcel.readString());
        this.u = (String) r81.f(parcel.readString());
    }
}