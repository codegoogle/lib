package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.p7700g.p99005.x1;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public interface IGmsCallbacks extends IInterface {
    void onPostInitComplete(int i, @x1 IBinder iBinder, @x1 Bundle bundle) throws RemoteException;

    void zzb(int i, @x1 Bundle bundle) throws RemoteException;

    void zzc(int i, IBinder iBinder, zzj zzjVar) throws RemoteException;
}