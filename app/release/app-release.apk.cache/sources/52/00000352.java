package com.anchorfree.vpnsdk.reconnect;

import android.os.Parcel;
import android.os.Parcelable;
import com.anchorfree.sdk.exceptions.CnlBlockedException;
import com.anchorfree.sdk.exceptions.PartnerApiException;
import com.google.gson.Gson;
import com.p7700g.p99005.c81;
import com.p7700g.p99005.dq0;
import com.p7700g.p99005.en1;
import com.p7700g.p99005.gc1;
import com.p7700g.p99005.h51;
import com.p7700g.p99005.i61;
import com.p7700g.p99005.kj1;
import com.p7700g.p99005.o51;
import com.p7700g.p99005.pe1;
import com.p7700g.p99005.qe1;
import com.p7700g.p99005.te1;
import com.p7700g.p99005.un1;
import com.p7700g.p99005.ve1;
import com.p7700g.p99005.vn1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import com.p7700g.p99005.zn1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class SDKReconnectExceptionHandler extends pe1 {
    public static final Parcelable.Creator<SDKReconnectExceptionHandler> CREATOR = new a();
    @x1
    private static final kj1 v = kj1.b("SDKReconnectExceptionHandler");
    @z1
    private pe1 A;
    @x1
    private final TransportFallbackHandler B;
    @x1
    private final o51 C;
    @x1
    private final te1 D;
    @x1
    private final h51 E;
    @x1
    private final List<pe1> w;
    private final List<String> x;
    @x1
    private final c81 y;
    @x1
    private final CaptivePortalReconnectionHandler z;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<SDKReconnectExceptionHandler> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public SDKReconnectExceptionHandler createFromParcel(@x1 Parcel parcel) {
            return new SDKReconnectExceptionHandler(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public SDKReconnectExceptionHandler[] newArray(int i) {
            return new SDKReconnectExceptionHandler[i];
        }
    }

    public SDKReconnectExceptionHandler(int i, @x1 String[] strArr) {
        super(i);
        this.w = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.x = arrayList;
        arrayList.addAll(Arrays.asList(strArr));
        this.y = (c81) i61.a().d(c81.class);
        this.B = (TransportFallbackHandler) i61.a().d(TransportFallbackHandler.class);
        this.z = (CaptivePortalReconnectionHandler) i61.a().d(CaptivePortalReconnectionHandler.class);
        this.C = (o51) i61.a().d(o51.class);
        this.E = (h51) i61.a().d(h51.class);
        this.D = new te1();
    }

    private boolean k(@x1 gc1 gc1Var) {
        if (gc1Var instanceof CnlBlockedException) {
            return false;
        }
        if (gc1Var instanceof PartnerApiException) {
            PartnerApiException partnerApiException = (PartnerApiException) gc1Var;
            return ("NOT_AUTHORIZED".equals(partnerApiException.getContent()) || "DEVICES_EXCEED".equals(partnerApiException.getContent()) || "USER_SUSPENDED".equals(partnerApiException.getContent()) || "TRAFFIC_EXCEED".equals(partnerApiException.getContent()) || "SESSIONS_EXCEED".equals(partnerApiException.getContent())) ? false : true;
        }
        return true;
    }

    @x1
    private String l(@x1 ve1 ve1Var) {
        return this.E.h(ve1Var.d()).e().getTransport();
    }

    @z1
    private zn1 n(String str) {
        return (zn1) new Gson().n(this.y.c(String.format("com.anchorfree.vpnsdk.vpn_config.%s", str)), zn1.class);
    }

    @Override // com.p7700g.p99005.pe1
    public void c(@x1 qe1 qe1Var) {
        super.c(qe1Var);
        m();
        for (pe1 pe1Var : this.w) {
            pe1Var.c(qe1Var);
        }
    }

    @Override // com.p7700g.p99005.pe1
    public boolean d(@x1 ve1 ve1Var, @x1 gc1 gc1Var, @x1 en1 en1Var, int i) {
        try {
            dq0<Boolean> g = this.C.g();
            g.Z(10L, TimeUnit.SECONDS);
            if (g.F() == Boolean.FALSE) {
                return false;
            }
        } catch (Throwable th) {
            v.f(th);
        }
        if (k(gc1Var)) {
            int a2 = this.D.a(l(ve1Var));
            for (pe1 pe1Var : this.w) {
                if (pe1Var.d(ve1Var, gc1Var, en1Var, a2)) {
                    this.A = pe1Var;
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.p7700g.p99005.pe1
    public void g(@x1 ve1 ve1Var, @x1 gc1 gc1Var, int i) {
        if (this.A != null) {
            String l = l(ve1Var);
            int a2 = this.D.a(l);
            this.D.d(l);
            v.c("will handle exception transport: %s global attempt: %d attempt: %d with %s", l, Integer.valueOf(i), Integer.valueOf(a2), this.A.getClass().getSimpleName());
            this.A.g(ve1Var, gc1Var, a2);
            this.A = null;
        }
    }

    @Override // com.p7700g.p99005.pe1
    public void i() {
        super.i();
        this.D.b();
    }

    @Override // com.p7700g.p99005.pe1
    public void j() {
        super.j();
        this.D.c();
    }

    public void m() {
        v.c("Load sdk reconnect exception handlers", new Object[0]);
        this.w.clear();
        this.w.add(this.z);
        for (String str : this.x) {
            try {
                zn1 n = n(str);
                if (n != null) {
                    v.c("Read exceptions handlers for %s", str);
                    for (vn1<? extends pe1> vn1Var : n.g().g()) {
                        this.w.add((pe1) un1.a().b(vn1Var));
                    }
                } else {
                    v.c("Not found exceptions handler for %s. Skip", str);
                }
            } catch (Throwable th) {
                v.f(th);
            }
        }
        this.w.add(this.B);
    }

    @Override // com.p7700g.p99005.pe1, android.os.Parcelable
    public void writeToParcel(@x1 Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeStringList(this.x);
    }

    public SDKReconnectExceptionHandler(@x1 Parcel parcel) {
        super(parcel);
        this.w = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.x = arrayList;
        parcel.readStringList(arrayList);
        this.E = (h51) i61.a().d(h51.class);
        this.y = (c81) i61.a().d(c81.class);
        this.B = (TransportFallbackHandler) i61.a().d(TransportFallbackHandler.class);
        this.z = (CaptivePortalReconnectionHandler) i61.a().d(CaptivePortalReconnectionHandler.class);
        this.C = (o51) i61.a().d(o51.class);
        this.D = new te1();
    }
}