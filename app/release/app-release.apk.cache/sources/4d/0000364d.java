package com.ironsource.sdk.g;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes3.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();
    public String a;
    public String b;
    public String c;
    public boolean d;
    public int e;
    public String f;
    public String g;
    public boolean h;
    public boolean i;
    public Map<String, String> j;
    private ArrayList<String> s;
    private ArrayList<String> t;
    private ArrayList<String> u;
    private ArrayList<String> v;
    private Map<String, String> w;

    /* loaded from: classes3.dex */
    public static class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ b createFromParcel(Parcel parcel) {
            return new b(parcel, (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ b[] newArray(int i) {
            return new b[i];
        }
    }

    public b() {
        d();
    }

    private b(Parcel parcel) {
        d();
        try {
            boolean z = true;
            this.d = parcel.readByte() != 0;
            this.e = parcel.readInt();
            this.a = parcel.readString();
            this.b = parcel.readString();
            this.c = parcel.readString();
            this.f = parcel.readString();
            this.g = parcel.readString();
            this.w = c(parcel.readString());
            this.i = parcel.readByte() != 0;
            if (parcel.readByte() == 0) {
                z = false;
            }
            this.h = z;
            this.j = c(parcel.readString());
        } catch (Throwable unused) {
            d();
        }
    }

    public /* synthetic */ b(Parcel parcel, byte b) {
        this(parcel);
    }

    private static Map<String, String> c(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return hashMap;
    }

    private void d() {
        this.d = false;
        this.e = -1;
        this.s = new ArrayList<>();
        this.t = new ArrayList<>();
        this.u = new ArrayList<>();
        this.v = new ArrayList<>();
        this.h = true;
        this.i = false;
        this.g = "";
        this.f = "";
        this.w = new HashMap();
        this.j = new HashMap();
    }

    public final void a(String str, boolean z) {
        if (TextUtils.isEmpty(str) || this.u.indexOf(str) != -1) {
            return;
        }
        this.u.add(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("shouldRestore:");
            sb.append(this.d);
            sb.append(", ");
            sb.append("displayedProduct:");
            sb.append(this.e);
            sb.append(", ");
            sb.append("ISReportInit:");
            sb.append(this.s);
            sb.append(", ");
            sb.append("ISInitSuccess:");
            sb.append(this.t);
            sb.append(", ");
            sb.append("ISAppKey");
            sb.append(this.f);
            sb.append(", ");
            sb.append("ISUserId");
            sb.append(this.g);
            sb.append(", ");
            sb.append("ISExtraParams");
            sb.append(this.w);
            sb.append(", ");
            sb.append("OWReportInit");
            sb.append(this.h);
            sb.append(", ");
            sb.append("OWInitSuccess");
            sb.append(this.i);
            sb.append(", ");
            sb.append("OWExtraParams");
            sb.append(this.j);
            sb.append(", ");
        } catch (Throwable unused) {
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        try {
            int i2 = 1;
            parcel.writeByte((byte) (this.d ? 1 : 0));
            parcel.writeInt(this.e);
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.f);
            parcel.writeString(this.g);
            parcel.writeString(new JSONObject(this.w).toString());
            parcel.writeByte((byte) (this.i ? 1 : 0));
            if (!this.h) {
                i2 = 0;
            }
            parcel.writeByte((byte) i2);
            parcel.writeString(new JSONObject(this.j).toString());
        } catch (Throwable unused) {
        }
    }
}