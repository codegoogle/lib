package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.p7700g.p99005.z1;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdrn extends zzbmx {
    @z1
    private final String zza;
    private final zzdnc zzb;
    private final zzdnh zzc;

    public zzdrn(@z1 String str, zzdnc zzdncVar, zzdnh zzdnhVar) {
        this.zza = str;
        this.zzb = zzdncVar;
        this.zzc = zzdnhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final void zzA() {
        this.zzb.zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final void zzB(Bundle bundle) throws RemoteException {
        this.zzb.zzE(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final void zzC() {
        this.zzb.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final void zzD(com.google.android.gms.ads.internal.client.zzcq zzcqVar) throws RemoteException {
        this.zzb.zzH(zzcqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final void zzE(com.google.android.gms.ads.internal.client.zzde zzdeVar) throws RemoteException {
        this.zzb.zzI(zzdeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final void zzF(zzbmv zzbmvVar) throws RemoteException {
        this.zzb.zzJ(zzbmvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final boolean zzG() {
        return this.zzb.zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final boolean zzH() throws RemoteException {
        return (this.zzc.zzF().isEmpty() || this.zzc.zzk() == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final boolean zzI(Bundle bundle) throws RemoteException {
        return this.zzb.zzQ(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final double zze() throws RemoteException {
        return this.zzc.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final Bundle zzf() throws RemoteException {
        return this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    @z1
    public final com.google.android.gms.ads.internal.client.zzdh zzg() throws RemoteException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfK)).booleanValue()) {
            return this.zzb.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final com.google.android.gms.ads.internal.client.zzdk zzh() throws RemoteException {
        return this.zzc.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final zzbkt zzi() throws RemoteException {
        return this.zzc.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final zzbky zzj() throws RemoteException {
        return this.zzb.zza().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final zzblb zzk() throws RemoteException {
        return this.zzc.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final IObjectWrapper zzl() throws RemoteException {
        return this.zzc.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final IObjectWrapper zzm() throws RemoteException {
        return ObjectWrapper.wrap(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final String zzn() throws RemoteException {
        return this.zzc.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final String zzo() throws RemoteException {
        return this.zzc.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final String zzp() throws RemoteException {
        return this.zzc.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final String zzq() throws RemoteException {
        return this.zzc.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final String zzr() throws RemoteException {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final String zzs() throws RemoteException {
        return this.zzc.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final String zzt() throws RemoteException {
        return this.zzc.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final List zzu() throws RemoteException {
        return this.zzc.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final List zzv() throws RemoteException {
        if (zzH()) {
            return this.zzc.zzF();
        }
        return Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final void zzw() throws RemoteException {
        this.zzb.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final void zzx() throws RemoteException {
        this.zzb.zzV();
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final void zzy(@z1 com.google.android.gms.ads.internal.client.zzcu zzcuVar) throws RemoteException {
        this.zzb.zzw(zzcuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final void zzz(Bundle bundle) throws RemoteException {
        this.zzb.zzz(bundle);
    }
}