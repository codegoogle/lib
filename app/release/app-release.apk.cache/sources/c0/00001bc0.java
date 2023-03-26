package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaeq {
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    @z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static UUID zza(byte[] bArr) {
        int zze;
        zzaep zzaepVar;
        UUID uuid;
        zzdy zzdyVar = new zzdy(bArr);
        if (zzdyVar.zzd() >= 32) {
            zzdyVar.zzF(0);
            if (zzdyVar.zze() == zzdyVar.zza() + 4 && zzdyVar.zze() == 1886614376 && (zze = zzadv.zze(zzdyVar.zze())) <= 1) {
                UUID uuid2 = new UUID(zzdyVar.zzr(), zzdyVar.zzr());
                if (zze == 1) {
                    zzdyVar.zzG(zzdyVar.zzn() * 16);
                }
                int zzn = zzdyVar.zzn();
                if (zzn == zzdyVar.zza()) {
                    byte[] bArr2 = new byte[zzn];
                    zzdyVar.zzB(bArr2, 0, zzn);
                    zzaepVar = new zzaep(uuid2, zze, bArr2);
                    if (zzaepVar != null) {
                        return null;
                    }
                    uuid = zzaepVar.zza;
                    return uuid;
                }
            }
        }
        zzaepVar = null;
        if (zzaepVar != null) {
        }
    }
}