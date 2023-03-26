package com.anchorfree.vpnsdk.reconnect;

import android.os.Parcel;
import android.os.Parcelable;
import com.p7700g.p99005.en1;
import com.p7700g.p99005.gc1;
import com.p7700g.p99005.pe1;
import com.p7700g.p99005.ve1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.xb1;
import com.p7700g.p99005.xu0;

/* loaded from: classes2.dex */
public class NetworkChangeExceptionHandler extends pe1 {
    public static final Parcelable.Creator<NetworkChangeExceptionHandler> CREATOR = new a();

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<NetworkChangeExceptionHandler> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public NetworkChangeExceptionHandler createFromParcel(@x1 Parcel parcel) {
            return new NetworkChangeExceptionHandler(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public NetworkChangeExceptionHandler[] newArray(int i) {
            return new NetworkChangeExceptionHandler[i];
        }
    }

    public NetworkChangeExceptionHandler(int i) {
        super(i);
    }

    @Override // com.p7700g.p99005.pe1
    public boolean d(@x1 ve1 ve1Var, @x1 gc1 gc1Var, @x1 en1 en1Var, int i) {
        return (gc1Var instanceof xb1) && super.d(ve1Var, gc1Var, en1Var, i);
    }

    @Override // com.p7700g.p99005.pe1
    public void g(@x1 ve1 ve1Var, @x1 gc1 gc1Var, int i) {
        e().C(ve1Var, xu0.e.j);
    }

    public NetworkChangeExceptionHandler(@x1 Parcel parcel) {
        super(parcel);
    }
}