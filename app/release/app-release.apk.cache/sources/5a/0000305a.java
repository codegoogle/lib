package com.google.android.gms.internal.consent_sdk;

import java.util.HashSet;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* loaded from: classes2.dex */
public final class zzy {
    private final zzz zza;
    private final zzbw zzb;
    private int zzc = 0;

    public zzy(zzz zzzVar, zzbw zzbwVar) {
        this.zza = zzzVar;
        this.zzb = zzbwVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzaa zza() throws zzj {
        zzam zzamVar;
        String str;
        zzh zzhVar;
        zzak zzakVar;
        zzbw zzbwVar = this.zzb;
        int i = zzbwVar.zzf;
        int i2 = i - 1;
        if (i != 0) {
            switch (i2) {
                case 1:
                case 2:
                case 3:
                    this.zzc = 3;
                    break;
                case 4:
                    this.zzc = 2;
                    break;
                case 5:
                    this.zzc = 1;
                    break;
                case 6:
                    String valueOf = String.valueOf(zzbwVar.zzc);
                    throw new zzj(1, valueOf.length() != 0 ? "Invalid response from server: ".concat(valueOf) : new String("Invalid response from server: "));
                case 7:
                    String valueOf2 = String.valueOf(zzbwVar.zzc);
                    throw new zzj(3, valueOf2.length() != 0 ? "Publisher misconfiguration: ".concat(valueOf2) : new String("Publisher misconfiguration: "));
                default:
                    throw new zzj(1, "Invalid response from server.");
            }
            String str2 = zzbwVar.zza;
            zzbc zzbcVar = str2 == null ? null : new zzbc(zzbwVar.zzb, str2);
            zzamVar = this.zza.zzc;
            zzamVar.zzg(new HashSet(this.zzb.zzd));
            for (zzbv zzbvVar : this.zzb.zze) {
                int i3 = zzbvVar.zzb;
                int i4 = i3 - 1;
                if (i3 == 0) {
                    throw null;
                }
                if (i4 != 0) {
                    if (i4 == 1) {
                        str = "write";
                    } else if (i4 == 2) {
                        str = "clear";
                    }
                    if (str == null) {
                        zzhVar = this.zza.zza;
                        String str3 = zzbvVar.zza;
                        zzakVar = this.zza.zzb;
                        zzhVar.zzb(str, str3, zzakVar);
                    }
                }
                str = null;
                if (str == null) {
                }
            }
            return new zzaa(this.zzc, zzbcVar, null);
        }
        throw null;
    }
}