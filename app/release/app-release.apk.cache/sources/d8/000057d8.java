package com.p7700g.p99005;

import android.net.NetworkInfo;

/* compiled from: NetworkInfoExtended.java */
/* loaded from: classes2.dex */
public class qc1 {
    @z1
    public final NetworkInfo a;

    public qc1(@z1 NetworkInfo networkInfo) {
        this.a = networkInfo;
    }

    private static boolean a(@z1 String str, @z1 String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        return str.equals(str2);
    }

    public int b() {
        NetworkInfo networkInfo = this.a;
        if (networkInfo != null) {
            return networkInfo.getType();
        }
        return 8;
    }

    public boolean c() {
        NetworkInfo networkInfo = this.a;
        return networkInfo != null && networkInfo.isConnected();
    }

    public boolean equals(@z1 Object obj) {
        if (obj instanceof qc1) {
            NetworkInfo networkInfo = ((qc1) obj).a;
            NetworkInfo networkInfo2 = this.a;
            if (networkInfo2 == null && networkInfo == null) {
                return true;
            }
            return networkInfo2 != null && networkInfo != null && a(networkInfo2.getExtraInfo(), networkInfo.getExtraInfo()) && networkInfo2.getDetailedState() == networkInfo.getDetailedState() && networkInfo2.getState() == networkInfo.getState() && networkInfo2.getType() == networkInfo.getType();
        }
        return super.equals(obj);
    }

    public int hashCode() {
        NetworkInfo networkInfo = this.a;
        if (networkInfo != null) {
            return networkInfo.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder K = wo1.K("NetworkInfoExtended{", "networkInfo=");
        K.append(this.a);
        K.append('}');
        return K.toString();
    }
}