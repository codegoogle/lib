package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.p7700g.p99005.bh;

/* compiled from: UnusedAppRestrictionsBackportService.java */
/* loaded from: classes.dex */
public abstract class th extends Service {
    @SuppressLint({"ActionValue"})
    public static final String s = "android.support.unusedapprestrictions.action.CustomUnusedAppRestrictionsBackportService";
    private bh.b t = new a();

    /* compiled from: UnusedAppRestrictionsBackportService.java */
    /* loaded from: classes.dex */
    public class a extends bh.b {
        public a() {
        }

        @Override // com.p7700g.p99005.bh
        public void a0(@z1 ah ahVar) throws RemoteException {
            if (ahVar == null) {
                return;
            }
            th.this.a(new sh(ahVar));
        }
    }

    public abstract void a(@x1 sh shVar);

    @Override // android.app.Service
    @z1
    public IBinder onBind(@z1 Intent intent) {
        return this.t;
    }
}