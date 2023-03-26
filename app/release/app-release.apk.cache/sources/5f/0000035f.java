package com.anchorfree.vpnsdk.transporthydra.reconnect;

import android.os.Parcel;
import android.os.Parcelable;
import com.p7700g.p99005.en1;
import com.p7700g.p99005.gc1;
import com.p7700g.p99005.pe1;
import com.p7700g.p99005.ve1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.xb1;
import com.p7700g.p99005.xu0;
import com.p7700g.p99005.yg1;

/* loaded from: classes2.dex */
public class HydraLostConnectionHandler extends pe1 {
    public static final Parcelable.Creator<HydraLostConnectionHandler> CREATOR = new a();

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<HydraLostConnectionHandler> {
        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: a */
        public HydraLostConnectionHandler createFromParcel(@x1 Parcel parcel) {
            return new HydraLostConnectionHandler(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: b */
        public HydraLostConnectionHandler[] newArray(int i) {
            return new HydraLostConnectionHandler[i];
        }
    }

    public /* synthetic */ HydraLostConnectionHandler(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // com.p7700g.p99005.pe1
    public boolean d(@x1 ve1 ve1Var, @x1 gc1 gc1Var, @x1 en1 en1Var, int i) {
        if (gc1Var instanceof yg1) {
            int code = ((yg1) gc1Var).getCode();
            if (super.d(ve1Var, gc1Var, en1Var, i)) {
                return code == 181 || code == 182;
            }
            return false;
        } else if (gc1Var instanceof xb1) {
            return super.d(ve1Var, gc1Var, en1Var, i);
        } else {
            return false;
        }
    }

    @Override // com.p7700g.p99005.pe1
    public void g(@x1 ve1 ve1Var, @x1 gc1 gc1Var, int i) {
        e().C(ve1Var, xu0.e.h);
    }

    private HydraLostConnectionHandler(@x1 Parcel parcel) {
        super(parcel);
    }

    public HydraLostConnectionHandler(int i) {
        super(i);
    }
}