package com.p7700g.p99005;

import android.os.Bundle;
import com.p7700g.p99005.xu0;
import java.io.IOException;
import java.util.Map;

/* compiled from: VpnException.java */
/* loaded from: classes2.dex */
public class gc1 extends IOException {
    public gc1(@x1 String str, @z1 Throwable th) {
        super(str, th);
    }

    @x1
    public static gc1 cast(@x1 Throwable th) {
        if (th instanceof gc1) {
            return (gc1) th;
        }
        return unexpected(th);
    }

    @x1
    public static gc1 castVpnException(@x1 Throwable th) {
        if (th instanceof gc1) {
            return (gc1) th;
        }
        return unexpectedVpn(th);
    }

    @z1
    public static gc1 fromReason(@x1 @xu0.d String str) {
        if (xu0.e.j.equals(str)) {
            return new xb1();
        }
        return null;
    }

    @x1
    public static gc1 genericException(@x1 String str) {
        return new gc1(str);
    }

    @z1
    public static Exception handleTrackingException(@z1 Exception exc, @x1 Bundle bundle) {
        if (exc instanceof fc1) {
            Map<String, String> f = ((fc1) exc).f();
            for (String str : f.keySet()) {
                bundle.putString(str, f.get(str));
            }
            return cast(exc.getCause());
        }
        return exc;
    }

    @x1
    public static gc1 network(@x1 Throwable th) {
        return new yb1(th);
    }

    @x1
    public static gc1 unWrap(@x1 gc1 gc1Var) {
        return gc1Var instanceof fc1 ? cast(gc1Var.getCause()) : gc1Var;
    }

    @x1
    public static gc1 unexpected(@x1 Throwable th) {
        return new wb1("Unexpected", th);
    }

    @x1
    public static gc1 unexpectedVpn(@x1 Throwable th) {
        return new gc1(th);
    }

    @x1
    public static gc1 vpnConnectCanceled() {
        return new rb1();
    }

    @x1
    public static gc1 vpnStopCanceled() {
        return new ec1();
    }

    @x1
    public static gc1 withMessage(@x1 String str) {
        return new gc1(str);
    }

    @x1
    public String getGprReason() {
        return xu0.e.h;
    }

    @x1
    public String toTrackerName() {
        StringBuilder G = wo1.G(hg1.b);
        G.append(getMessage());
        return G.toString();
    }

    public gc1(@x1 String str) {
        super(str);
    }

    public gc1(@x1 Throwable th) {
        super(th);
    }
}