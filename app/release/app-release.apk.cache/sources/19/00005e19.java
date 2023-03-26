package com.p7700g.p99005;

import android.os.Parcel;
import android.os.Parcelable;
import com.p7700g.p99005.xu0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: HydraConnectionStatus.java */
/* loaded from: classes2.dex */
public class tg1 extends lm1 {
    @x1
    private static final String A = "server_ip";
    @x1
    private static final String B = "sni";
    @x1
    private static final String C = "duration_ms";
    @x1
    public static final Parcelable.Creator<tg1> CREATOR = new a();
    @x1
    private static final String z = "state_code";
    @x1
    private final List<c> D;

    /* compiled from: HydraConnectionStatus.java */
    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<tg1> {
        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: a */
        public tg1 createFromParcel(@x1 Parcel parcel) {
            return new tg1(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: b */
        public tg1[] newArray(int i) {
            return new tg1[i];
        }
    }

    /* compiled from: HydraConnectionStatus.java */
    /* loaded from: classes2.dex */
    public static final class b {
        @x1
        private List<km1> a;
        @x1
        private List<km1> b;
        @x1
        private String c;
        @x1
        private String d;
        @x1
        private String e;
        @x1
        private String f;
        @x1
        private ti1 g;

        public /* synthetic */ b(a aVar) {
            this();
        }

        @x1
        private static List<c> b(@x1 String str) {
            ArrayList arrayList = new ArrayList();
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        arrayList.add(c.d(jSONArray.getJSONObject(i)));
                    } catch (JSONException unused) {
                    }
                }
            } catch (JSONException e) {
                xg1.y.f(e);
            }
            return arrayList;
        }

        @x1
        public tg1 a() {
            List arrayList;
            ti1 ti1Var = this.g;
            if (!this.c.isEmpty()) {
                arrayList = b(this.c);
            } else {
                arrayList = new ArrayList();
            }
            return new tg1(this.a, this.b, this.d, this.e, this.f, ti1Var, arrayList);
        }

        @x1
        public b c(@x1 ti1 ti1Var) {
            this.g = ti1Var;
            return this;
        }

        @x1
        public b d(@x1 String str) {
            this.c = str;
            return this;
        }

        @x1
        public b e(@x1 List<km1> list) {
            this.b = list;
            return this;
        }

        @x1
        public b f(@x1 String str) {
            this.d = str;
            return this;
        }

        @x1
        public b g(@x1 String str) {
            this.f = str;
            return this;
        }

        @x1
        public b h(@x1 String str) {
            this.e = str;
            return this;
        }

        @x1
        public b i(@x1 List<km1> list) {
            this.a = list;
            return this;
        }

        private b() {
            this.a = Collections.emptyList();
            this.b = Collections.emptyList();
            this.c = "";
            this.d = "";
            this.e = "";
            this.f = "";
            this.g = ti1.s;
        }
    }

    /* compiled from: HydraConnectionStatus.java */
    /* loaded from: classes2.dex */
    public enum d {
        UNKNOWN(0),
        TCP_HANDSHAKE_COMPLETED(1),
        TLS_HANDSHAKE_STARTED(2),
        TLS_HANDSHAKE_COMPLETED(3),
        TRANSPORT_READY(4),
        CLOSED_SUCCESSFULLY(5);
        
        private final int z;

        d(int i) {
            this.z = i;
        }

        @x1
        public static d b(int i) {
            d[] values = values();
            for (int i2 = 0; i2 < 6; i2++) {
                d dVar = values[i2];
                if (dVar.z == i) {
                    return dVar;
                }
            }
            return UNKNOWN;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @x1
        public String f() {
            return name().toLowerCase(Locale.US);
        }
    }

    public tg1(@x1 List<km1> list, @x1 List<km1> list2, @x1 String str, @x1 String str2, @x1 String str3, @x1 ti1 ti1Var, @x1 List<c> list3) {
        super(list, list2, str, str2, str3, ti1Var);
        this.D = list3;
    }

    @x1
    public static b s() {
        return new b(null);
    }

    private void t(@x1 JSONObject jSONObject) {
        String string;
        try {
            if (jSONObject.has("server_ip")) {
                string = jSONObject.getString("server_ip");
            } else {
                string = jSONObject.getString(xu0.f.u);
            }
            JSONObject jSONObject2 = new JSONObject();
            String str = "";
            for (c cVar : this.D) {
                if (cVar.s.equals(string)) {
                    if (cVar.v == 0) {
                        jSONObject2.put(cVar.t.f(), cVar.w);
                    }
                    if (str.isEmpty()) {
                        str = cVar.u;
                    }
                }
            }
            if (!str.isEmpty()) {
                jSONObject.put(B, str);
            }
            jSONObject.put("duration", jSONObject2);
        } catch (JSONException e) {
            kj1 kj1Var = xg1.y;
            kj1Var.e("Error by adding duration to " + jSONObject, e);
        }
    }

    @x1
    private static List<c> u(@x1 Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; readInt > i; i++) {
            c cVar = (c) parcel.readParcelable(c.class.getClassLoader());
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    @Override // com.p7700g.p99005.lm1
    @x1
    public JSONArray d() {
        JSONArray d2 = super.d();
        for (int i = 0; i < d2.length(); i++) {
            try {
                t(d2.getJSONObject(i));
            } catch (JSONException e) {
                xg1.y.e("Error by adding duration", e);
            }
        }
        return d2;
    }

    @Override // com.p7700g.p99005.lm1
    @x1
    public lm1 e(@x1 lm1 lm1Var) {
        if (m().equals(lm1Var.m()) && o().equals(lm1Var.o())) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            arrayList.addAll(p());
            arrayList.addAll(lm1Var.p());
            arrayList2.addAll(l());
            arrayList2.addAll(lm1Var.l());
            return new tg1(arrayList, arrayList2, m(), o(), n(), j(), this.D);
        }
        return this;
    }

    @Override // com.p7700g.p99005.lm1
    public boolean equals(@z1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && super.equals(obj)) {
            return this.D.equals(((tg1) obj).D);
        }
        return false;
    }

    @Override // com.p7700g.p99005.lm1
    public int hashCode() {
        return this.D.hashCode() + (super.hashCode() * 31);
    }

    @Override // com.p7700g.p99005.lm1
    @x1
    public lm1 r(@x1 ti1 ti1Var) {
        return new tg1(p(), l(), m(), o(), n(), ti1Var, new ArrayList(this.D));
    }

    @Override // com.p7700g.p99005.lm1
    @x1
    public String toString() {
        StringBuilder G = wo1.G("HydraConnectionStatus{connectionEventsLog=");
        G.append(this.D);
        G.append("} ");
        G.append(super.toString());
        return G.toString();
    }

    @Override // com.p7700g.p99005.lm1, android.os.Parcelable
    public void writeToParcel(@x1 Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.D.size());
        for (c cVar : this.D) {
            parcel.writeParcelable(cVar, i);
        }
    }

    public tg1(@x1 Parcel parcel) {
        super(parcel);
        this.D = u(parcel);
    }

    /* compiled from: HydraConnectionStatus.java */
    /* loaded from: classes2.dex */
    public static final class c implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new a();
        @x1
        public final String s;
        @x1
        public final d t;
        @x1
        public final String u;
        public final int v;
        public final long w;

        /* compiled from: HydraConnectionStatus.java */
        /* loaded from: classes2.dex */
        public class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            @x1
            /* renamed from: a */
            public c createFromParcel(@x1 Parcel parcel) {
                return new c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            @x1
            /* renamed from: b */
            public c[] newArray(int i) {
                return new c[i];
            }
        }

        public c(@x1 String str, @x1 d dVar, @x1 String str2, int i, long j) {
            this.s = str;
            this.t = dVar;
            this.u = str2;
            this.v = i;
            this.w = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @x1
        public static c d(@x1 JSONObject jSONObject) throws JSONException {
            return new c(jSONObject.getString("server_ip"), d.b(jSONObject.getInt(tg1.z)), jSONObject.getString(tg1.B), jSONObject.getInt(xu0.f.h), jSONObject.getLong(tg1.C));
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@z1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            if (this.v == cVar.v && this.w == cVar.w && this.s.equals(cVar.s) && this.t == cVar.t) {
                return this.u.equals(cVar.u);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.t.hashCode();
            String str = this.u;
            long j = this.w;
            return ((wo1.x(str, (hashCode + (this.s.hashCode() * 31)) * 31, 31) + this.v) * 31) + ((int) (j ^ (j >>> 32)));
        }

        public String toString() {
            StringBuilder G = wo1.G("ConnectionEvent{destination='");
            wo1.d0(G, this.s, '\'', ", connectionStage=");
            G.append(this.t);
            G.append(", sni='");
            wo1.d0(G, this.u, '\'', ", errorCode=");
            G.append(this.v);
            G.append(", duration=");
            G.append(this.w);
            G.append('}');
            return G.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@x1 Parcel parcel, int i) {
            parcel.writeString(this.s);
            parcel.writeString(this.t.name());
            parcel.writeString(this.u);
            parcel.writeInt(this.v);
            parcel.writeLong(this.w);
        }

        public c(@x1 Parcel parcel) {
            this.s = parcel.readString();
            this.t = d.valueOf(parcel.readString());
            this.u = parcel.readString();
            this.v = parcel.readInt();
            this.w = parcel.readLong();
        }
    }
}