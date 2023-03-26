package com.p7700g.p99005;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.p7700g.p99005.d;

/* compiled from: PostMessageService.java */
/* loaded from: classes.dex */
public class g6 extends Service {
    private d.b s = new a();

    /* compiled from: PostMessageService.java */
    /* loaded from: classes.dex */
    public class a extends d.b {
        public a() {
        }

        @Override // com.p7700g.p99005.d
        public void o0(@x1 b bVar, @z1 Bundle bundle) throws RemoteException {
            bVar.A1(bundle);
        }

        @Override // com.p7700g.p99005.d
        public void y0(@x1 b bVar, @x1 String str, @z1 Bundle bundle) throws RemoteException {
            bVar.w(str, bundle);
        }
    }

    @Override // android.app.Service
    @x1
    public IBinder onBind(@z1 Intent intent) {
        return this.s;
    }
}