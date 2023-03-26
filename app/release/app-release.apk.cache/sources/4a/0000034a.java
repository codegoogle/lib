package com.anchorfree.vpnsdk.reconnect;

import android.os.Parcel;
import android.os.Parcelable;
import com.p7700g.p99005.ae1;
import com.p7700g.p99005.en1;
import com.p7700g.p99005.eo1;
import com.p7700g.p99005.gc1;
import com.p7700g.p99005.pe1;
import com.p7700g.p99005.ve1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.xu0;

/* loaded from: classes2.dex */
public class CaptivePortalReconnectionHandler extends pe1 {
    public static final Parcelable.Creator<CaptivePortalReconnectionHandler> CREATOR = new a();

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<CaptivePortalReconnectionHandler> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public CaptivePortalReconnectionHandler createFromParcel(@x1 Parcel parcel) {
            return new CaptivePortalReconnectionHandler(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public CaptivePortalReconnectionHandler[] newArray(int i) {
            return new CaptivePortalReconnectionHandler[i];
        }
    }

    public CaptivePortalReconnectionHandler(@x1 Parcel parcel) {
        super(parcel);
    }

    @Override // com.p7700g.p99005.pe1
    public boolean d(@x1 ve1 ve1Var, @x1 gc1 gc1Var, @x1 en1 en1Var, int i) {
        return super.d(ve1Var, gc1Var, en1Var, i) && (gc1Var instanceof eo1);
    }

    @Override // com.p7700g.p99005.pe1
    public void g(@x1 ve1 ve1Var, @x1 gc1 gc1Var, int i) {
        e().D(ve1Var, false, xu0.e.h, ae1.a);
    }

    public CaptivePortalReconnectionHandler(int i) {
        super(i);
    }
}