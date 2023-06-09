package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbjk;
import com.google.android.gms.internal.ads.zzbjx;
import com.google.android.gms.internal.ads.zzcfb;
import com.google.android.gms.internal.ads.zzcfi;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzav {
    @z1
    private static final zzcc zza;

    static {
        zzcc zzccVar = null;
        try {
            Object newInstance = zzau.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(newInstance instanceof IBinder)) {
                zzcfi.zzj("ClientApi class is not an instance of IBinder.");
            } else {
                IBinder iBinder = (IBinder) newInstance;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    zzccVar = queryLocalInterface instanceof zzcc ? (zzcc) queryLocalInterface : new zzca(iBinder);
                }
            }
        } catch (Exception unused) {
            zzcfi.zzj("Failed to instantiate ClientApi class.");
        }
        zza = zzccVar;
    }

    @z1
    private final Object zze() {
        zzcc zzccVar = zza;
        if (zzccVar != null) {
            try {
                return zzb(zzccVar);
            } catch (RemoteException e) {
                zzcfi.zzk("Cannot invoke local loader using ClientApi class.", e);
                return null;
            }
        }
        zzcfi.zzj("ClientApi class cannot be loaded.");
        return null;
    }

    @z1
    private final Object zzf() {
        try {
            return zzc();
        } catch (RemoteException e) {
            zzcfi.zzk("Cannot invoke remote loader.", e);
            return null;
        }
    }

    @x1
    public abstract Object zza();

    @z1
    public abstract Object zzb(zzcc zzccVar) throws RemoteException;

    @z1
    public abstract Object zzc() throws RemoteException;

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzd(Context context, boolean z) {
        boolean z2;
        Object zze;
        if (!z) {
            zzaw.zzb();
            if (!zzcfb.zzr(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE)) {
                zzcfi.zze("Google Play Services is not available.");
                z = true;
            }
        }
        boolean z3 = false;
        boolean z4 = z | (!(DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID) <= DynamiteModule.getRemoteVersion(context, ModuleDescriptor.MODULE_ID)));
        zzbhz.zzc(context);
        if (!((Boolean) zzbjk.zza.zze()).booleanValue()) {
            if (((Boolean) zzbjk.zzb.zze()).booleanValue()) {
                z2 = true;
                z3 = true;
                if (!z3) {
                    zze = zze();
                    if (zze == null && !z2) {
                        zze = zzf();
                    }
                } else {
                    Object zzf = zzf();
                    if (zzf == null) {
                        if (zzaw.zze().nextInt(((Long) zzbjx.zza.zze()).intValue()) == 0) {
                            Bundle bundle = new Bundle();
                            bundle.putString("action", "dynamite_load");
                            bundle.putInt("is_missing", 1);
                            zzaw.zzb().zzm(context, zzaw.zzc().zza, "gmob-apps", bundle, true);
                        }
                    }
                    zze = zzf == null ? zze() : zzf;
                }
                return zze != null ? zza() : zze;
            }
            z3 = z4;
        }
        z2 = false;
        if (!z3) {
        }
        if (zze != null) {
        }
    }
}