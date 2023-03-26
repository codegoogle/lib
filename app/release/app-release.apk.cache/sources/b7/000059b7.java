package com.p7700g.p99005;

import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;

/* compiled from: NetworkInfoExtendedApi21.java */
@e2(api = 21)
/* loaded from: classes2.dex */
public class rc1 extends qc1 {
    @x1
    private static final List<Integer> b;
    @z1
    private final Network c;
    @z1
    private final NetworkInfo d;
    @z1
    private final NetworkCapabilities e;

    static {
        ArrayList arrayList = new ArrayList();
        b = arrayList;
        if (Build.VERSION.SDK_INT >= 23) {
            arrayList.add(17);
            arrayList.add(16);
        }
        arrayList.add(12);
    }

    public rc1(@z1 NetworkInfo networkInfo, @z1 Network network, @z1 NetworkInfo networkInfo2, @z1 NetworkCapabilities networkCapabilities) {
        super(networkInfo);
        this.c = network;
        this.d = networkInfo2;
        this.e = networkCapabilities;
    }

    private boolean e(@x1 rc1 rc1Var) {
        NetworkCapabilities networkCapabilities = rc1Var.e;
        NetworkCapabilities networkCapabilities2 = this.e;
        if (networkCapabilities2 == null && networkCapabilities == null) {
            return true;
        }
        if (networkCapabilities2 == null || networkCapabilities == null) {
            return false;
        }
        for (Integer num : b) {
            if (this.e.hasCapability(num.intValue()) != networkCapabilities.hasCapability(num.intValue())) {
                return false;
            }
        }
        return true;
    }

    private boolean f(@x1 rc1 rc1Var) {
        Network network = this.c;
        return (network != null || rc1Var.c == null) && (network == null || rc1Var.c != null) && network != null && network.equals(rc1Var.c);
    }

    @z1
    public NetworkCapabilities d() {
        return this.e;
    }

    @Override // com.p7700g.p99005.qc1
    public boolean equals(@z1 Object obj) {
        if (obj instanceof rc1) {
            rc1 rc1Var = (rc1) obj;
            return super.equals(obj) && f(rc1Var) && e(rc1Var);
        }
        return super.equals(obj);
    }

    @Override // com.p7700g.p99005.qc1
    public int hashCode() {
        int hashCode = super.hashCode();
        Network network = this.c;
        return hashCode + (network == null ? 0 : network.hashCode());
    }

    @Override // com.p7700g.p99005.qc1
    public String toString() {
        StringBuilder K = wo1.K("NetworkInfoExtendedApi23{", "networkInfo=");
        K.append(this.a);
        K.append(", network=");
        K.append(this.c);
        K.append(", activeNetworkInfo=");
        K.append(this.d);
        K.append(", capabilities=");
        K.append(this.e);
        K.append('}');
        return K.toString();
    }
}