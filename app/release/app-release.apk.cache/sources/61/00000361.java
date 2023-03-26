package com.anchorfree.vpnsdk.transporthydra.reconnect;

import android.os.Parcel;
import android.os.Parcelable;
import com.p7700g.p99005.en1;
import com.p7700g.p99005.gc1;
import com.p7700g.p99005.pe1;
import com.p7700g.p99005.ve1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.xu0;

/* loaded from: classes2.dex */
public class HydraPermanentVpnTunnelExceptionHandler extends pe1 {
    public static final Parcelable.Creator<HydraPermanentVpnTunnelExceptionHandler> CREATOR = new a();

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<HydraPermanentVpnTunnelExceptionHandler> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public HydraPermanentVpnTunnelExceptionHandler createFromParcel(@x1 Parcel parcel) {
            return new HydraPermanentVpnTunnelExceptionHandler(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public HydraPermanentVpnTunnelExceptionHandler[] newArray(int i) {
            return new HydraPermanentVpnTunnelExceptionHandler[i];
        }
    }

    public /* synthetic */ HydraPermanentVpnTunnelExceptionHandler(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // com.p7700g.p99005.pe1
    public boolean d(@x1 ve1 ve1Var, @x1 gc1 gc1Var, @x1 en1 en1Var, int i) {
        return ve1Var.j() && super.d(ve1Var, gc1Var, en1Var, i);
    }

    @Override // com.p7700g.p99005.pe1
    public void g(@x1 ve1 ve1Var, @x1 gc1 gc1Var, int i) {
        e().K(ve1Var, xu0.e.g);
    }

    public HydraPermanentVpnTunnelExceptionHandler() {
        super(0);
    }

    private HydraPermanentVpnTunnelExceptionHandler(@x1 Parcel parcel) {
        super(parcel);
    }
}