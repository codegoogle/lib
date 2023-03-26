package com.anchorfree.vpnsdk.reconnect;

import android.os.Parcel;
import android.os.Parcelable;
import com.anchorfree.sdk.SessionConfig;
import com.p7700g.p99005.en1;
import com.p7700g.p99005.g51;
import com.p7700g.p99005.gc1;
import com.p7700g.p99005.h51;
import com.p7700g.p99005.i61;
import com.p7700g.p99005.pe1;
import com.p7700g.p99005.ve1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.xu0;
import java.util.List;

/* loaded from: classes2.dex */
public class TransportFallbackHandler extends pe1 {
    public static final Parcelable.Creator<TransportFallbackHandler> CREATOR = new a();
    @x1
    private final h51 v;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<TransportFallbackHandler> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public TransportFallbackHandler createFromParcel(@x1 Parcel parcel) {
            return new TransportFallbackHandler(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public TransportFallbackHandler[] newArray(int i) {
            return new TransportFallbackHandler[i];
        }
    }

    public TransportFallbackHandler(@x1 h51 h51Var) {
        super(3);
        this.v = h51Var;
    }

    @Override // com.p7700g.p99005.pe1
    public boolean d(@x1 ve1 ve1Var, @x1 gc1 gc1Var, @x1 en1 en1Var, int i) {
        g51 h = this.v.h(ve1Var.d());
        if (en1Var == en1.CONNECTED || en1Var == en1.PAUSED) {
            return false;
        }
        SessionConfig e = h.e();
        List<String> transportFallbacks = e.getTransportFallbacks();
        return transportFallbacks.size() != 0 && transportFallbacks.indexOf(e.getTransport()) < transportFallbacks.size() - 1;
    }

    @Override // com.p7700g.p99005.pe1
    public void g(@x1 ve1 ve1Var, @x1 gc1 gc1Var, int i) {
        g51 h = this.v.h(ve1Var.d());
        SessionConfig e = h.e();
        List<String> transportFallbacks = e.getTransportFallbacks();
        int indexOf = transportFallbacks.indexOf(e.getTransport());
        if (transportFallbacks.size() != 0 && indexOf < transportFallbacks.size() - 1) {
            ve1Var = ve1Var.l(this.v.o(e.edit().G(transportFallbacks.get(indexOf + 1)).s(), h.b(), h.a(), "3.5.0", true));
        }
        e().C(ve1Var, xu0.e.g);
    }

    public TransportFallbackHandler(@x1 Parcel parcel) {
        super(parcel);
        this.v = (h51) i61.a().d(h51.class);
    }
}