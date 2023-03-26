package com.anchorfree.vpnsdk.transporthydra.reconnect;

import android.os.Parcel;
import android.os.Parcelable;
import com.p7700g.p99005.en1;
import com.p7700g.p99005.gc1;
import com.p7700g.p99005.kc1;
import com.p7700g.p99005.pe1;
import com.p7700g.p99005.ve1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.xu0;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class HydraInternalErrorHandler extends pe1 {
    public static final Parcelable.Creator<HydraInternalErrorHandler> CREATOR = new a();

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<HydraInternalErrorHandler> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public HydraInternalErrorHandler createFromParcel(@x1 Parcel parcel) {
            return new HydraInternalErrorHandler(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public HydraInternalErrorHandler[] newArray(int i) {
            return new HydraInternalErrorHandler[i];
        }
    }

    public /* synthetic */ HydraInternalErrorHandler(Parcel parcel, a aVar) {
        this(parcel);
    }

    private boolean k(@x1 kc1 kc1Var) {
        return kc1Var.getCode() == 185 || kc1Var.getCode() == 183;
    }

    @Override // com.p7700g.p99005.pe1
    public boolean d(@x1 ve1 ve1Var, @x1 gc1 gc1Var, @x1 en1 en1Var, int i) {
        return super.d(ve1Var, gc1Var, en1Var, i) && (gc1Var instanceof kc1) && k((kc1) gc1Var);
    }

    @Override // com.p7700g.p99005.pe1
    public void g(@x1 ve1 ve1Var, @x1 gc1 gc1Var, int i) {
        e().B(ve1Var, TimeUnit.SECONDS.toMillis(2L), xu0.e.h);
    }

    public HydraInternalErrorHandler(int i) {
        super(i);
    }

    private HydraInternalErrorHandler(@x1 Parcel parcel) {
        super(parcel);
    }
}