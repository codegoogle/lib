package com.p7700g.p99005;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;

/* compiled from: ClassSpec.java */
/* loaded from: classes2.dex */
public class k81<T> implements Parcelable {
    public static final Parcelable.Creator<k81> CREATOR = new a();
    @x1
    @mw2("type")
    private final String s;
    @mw2("params")
    @z1
    private final rv2 t;
    @z1
    private Class<T> u;

    /* compiled from: ClassSpec.java */
    /* loaded from: classes2.dex */
    public static class a implements Parcelable.Creator<k81> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public k81 createFromParcel(@x1 Parcel parcel) {
            return new k81(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public k81[] newArray(int i) {
            return new k81[i];
        }
    }

    private k81() {
        this.s = "";
        this.t = new rv2();
    }

    @x1
    public static <T> k81<T> d(@x1 Class<T> cls, @z1 Object... objArr) {
        Gson gson = new Gson();
        rv2 rv2Var = new rv2();
        if (objArr != null && objArr.length > 0) {
            for (Object obj : objArr) {
                if (obj instanceof Boolean) {
                    rv2Var.G((Boolean) obj);
                } else if (obj instanceof Number) {
                    rv2Var.I((Number) obj);
                } else if (obj instanceof String) {
                    rv2Var.J((String) obj);
                } else {
                    rv2Var.E(gson.G(obj));
                }
            }
        }
        return new k81<>(cls.getName(), rv2Var);
    }

    @x1
    private Class<T> i() throws ClassNotFoundException {
        Class<T> cls = this.u;
        if (cls == null) {
            synchronized (this) {
                cls = this.u;
                if (cls == null) {
                    cls = (Class<T>) Class.forName(this.s);
                    this.u = cls;
                }
            }
        }
        return cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @x1
    public <R> k81<R> c(@x1 Class<R> cls) {
        try {
            Class<?> i = i();
            if (cls.isAssignableFrom(i)) {
                return this;
            }
            throw new ClassCastException(cls + " is not assignable from" + i);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @z1
    public rv2 e() {
        return this.t;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        k81 k81Var = (k81) obj;
        if (this.s.equals(k81Var.s) && r81.d(this.t, k81Var.t)) {
            return r81.d(this.u, k81Var.u);
        }
        return false;
    }

    @x1
    public String g() {
        return this.s;
    }

    public int hashCode() {
        int hashCode = this.s.hashCode() * 31;
        rv2 rv2Var = this.t;
        int hashCode2 = (hashCode + (rv2Var != null ? rv2Var.hashCode() : 0)) * 31;
        Class<T> cls = this.u;
        return hashCode2 + (cls != null ? cls.hashCode() : 0);
    }

    @x1
    public String toString() {
        StringBuilder G = wo1.G("ClassSpec{type='");
        wo1.d0(G, this.s, '\'', ", params=");
        G.append(this.t);
        G.append('}');
        return G.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@x1 Parcel parcel, int i) {
        parcel.writeString(this.s);
        rv2 rv2Var = this.t;
        parcel.writeString(rv2Var != null ? rv2Var.toString() : null);
    }

    @r2
    public k81(@x1 String str, @x1 rv2 rv2Var) {
        this.s = str;
        this.t = rv2Var;
    }

    public k81(@x1 Parcel parcel) {
        this.s = (String) r81.f(parcel.readString());
        String readString = parcel.readString();
        if (readString != null && !readString.isEmpty()) {
            this.t = (rv2) new Gson().n(readString, rv2.class);
        } else {
            this.t = null;
        }
    }
}