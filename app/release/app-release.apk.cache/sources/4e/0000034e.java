package com.anchorfree.vpnsdk.reconnect;

import android.os.Parcel;
import android.os.Parcelable;
import com.p7700g.p99005.en1;
import com.p7700g.p99005.gc1;
import com.p7700g.p99005.pe1;
import com.p7700g.p99005.ve1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.xu0;
import com.p7700g.p99005.yb1;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class NetworkRelatedExceptionHandler extends pe1 {
    public static final Parcelable.Creator<NetworkRelatedExceptionHandler> CREATOR = new a();

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<NetworkRelatedExceptionHandler> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public NetworkRelatedExceptionHandler createFromParcel(@x1 Parcel parcel) {
            return new NetworkRelatedExceptionHandler(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public NetworkRelatedExceptionHandler[] newArray(int i) {
            return new NetworkRelatedExceptionHandler[i];
        }
    }

    public NetworkRelatedExceptionHandler(int i) {
        super(i);
    }

    @Override // com.p7700g.p99005.pe1
    public boolean d(@x1 ve1 ve1Var, @x1 gc1 gc1Var, @x1 en1 en1Var, int i) {
        return (gc1Var instanceof yb1) && e().m() && super.d(ve1Var, gc1Var, en1Var, i);
    }

    @Override // com.p7700g.p99005.pe1
    public void g(@x1 ve1 ve1Var, @x1 gc1 gc1Var, int i) {
        if (e().l()) {
            e().B(ve1Var, TimeUnit.SECONDS.toMillis(2L), xu0.e.g);
        } else {
            e().C(ve1Var, xu0.e.j);
        }
    }

    public NetworkRelatedExceptionHandler(@x1 Parcel parcel) {
        super(parcel);
    }
}