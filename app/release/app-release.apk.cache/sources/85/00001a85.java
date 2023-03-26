package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.p7700g.p99005.r0;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class zzf extends zza {
    @z1
    public final IBinder zze;
    public final /* synthetic */ BaseGmsClient zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @r0
    public zzf(BaseGmsClient baseGmsClient, @z1 int i, @z1 IBinder iBinder, Bundle bundle) {
        super(baseGmsClient, i, bundle);
        this.zzf = baseGmsClient;
        this.zze = iBinder;
    }

    @Override // com.google.android.gms.common.internal.zza
    public final void zzb(ConnectionResult connectionResult) {
        if (this.zzf.zzx != null) {
            this.zzf.zzx.onConnectionFailed(connectionResult);
        }
        this.zzf.onConnectionFailed(connectionResult);
    }

    @Override // com.google.android.gms.common.internal.zza
    public final boolean zzd() {
        BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks;
        BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks2;
        try {
            IBinder iBinder = this.zze;
            Preconditions.checkNotNull(iBinder);
            if (!this.zzf.getServiceDescriptor().equals(iBinder.getInterfaceDescriptor())) {
                this.zzf.getServiceDescriptor();
                return false;
            }
            IInterface createServiceInterface = this.zzf.createServiceInterface(this.zze);
            if (createServiceInterface != null) {
                if (BaseGmsClient.zzn(this.zzf, 2, 4, createServiceInterface) || BaseGmsClient.zzn(this.zzf, 3, 4, createServiceInterface)) {
                    this.zzf.zzB = null;
                    Bundle connectionHint = this.zzf.getConnectionHint();
                    BaseGmsClient baseGmsClient = this.zzf;
                    baseConnectionCallbacks = baseGmsClient.zzw;
                    if (baseConnectionCallbacks != null) {
                        baseConnectionCallbacks2 = baseGmsClient.zzw;
                        baseConnectionCallbacks2.onConnected(connectionHint);
                    }
                    return true;
                }
                return false;
            }
            return false;
        } catch (RemoteException unused) {
            return false;
        }
    }
}