package com.p7700g.p99005;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: CaketubeConnectionStatus.java */
/* loaded from: classes3.dex */
public class ph3 extends lm1 {
    @x1
    public static final Parcelable.Creator<ph3> CREATOR = new a();

    /* compiled from: CaketubeConnectionStatus.java */
    /* loaded from: classes3.dex */
    public class a implements Parcelable.Creator<ph3> {
        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: a */
        public ph3 createFromParcel(@x1 Parcel parcel) {
            return new ph3(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: b */
        public ph3[] newArray(int i) {
            return new ph3[i];
        }
    }

    public ph3(@x1 List<km1> list, @x1 List<km1> list2, @x1 String str, @x1 String str2, @x1 String str3) {
        super(list, list2, str, str2, str3);
    }

    @Override // com.p7700g.p99005.lm1
    @x1
    public JSONArray d() {
        JSONArray d = super.d();
        d.put(new JSONObject());
        return d;
    }

    @Override // com.p7700g.p99005.lm1
    @x1
    public lm1 e(@x1 lm1 lm1Var) {
        return (m().equals(lm1Var.m()) && o().equals(lm1Var.o())) ? new ph3(p(), l(), m(), o(), n(), j()) : this;
    }

    @Override // com.p7700g.p99005.lm1
    @x1
    public lm1 r(@x1 ti1 ti1Var) {
        return new ph3(p(), l(), m(), o(), n(), ti1Var);
    }

    public ph3(@x1 List<km1> list, @x1 List<km1> list2, @x1 String str, @x1 String str2, @x1 String str3, @x1 ti1 ti1Var) {
        super(list, list2, str, str2, str3, ti1Var);
    }

    public ph3(@x1 Parcel parcel) {
        super(parcel);
    }
}