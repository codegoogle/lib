package com.p7700g.p99005;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.p7700g.p99005.e;

/* compiled from: TrustedWebActivityCallbackRemote.java */
/* loaded from: classes.dex */
public class w6 {
    private final e a;

    private w6(@x1 e eVar) {
        this.a = eVar;
    }

    @z1
    public static w6 a(@z1 IBinder iBinder) {
        e N1 = iBinder == null ? null : e.b.N1(iBinder);
        if (N1 == null) {
            return null;
        }
        return new w6(N1);
    }

    public void b(@x1 String str, @x1 Bundle bundle) throws RemoteException {
        this.a.z1(str, bundle);
    }
}