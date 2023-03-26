package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import com.anythink.expressad.foundation.g.a.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzedz implements zzfuy {
    public final /* synthetic */ boolean zza;
    public final /* synthetic */ zzeea zzb;

    public zzedz(zzeea zzeeaVar, boolean z) {
        this.zzb = zzeeaVar;
        this.zza = z;
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final void zza(Throwable th) {
        zzcfi.zzg("Failed to get signals bundle");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    @Override // com.google.android.gms.internal.ads.zzfuy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List<String> emptyList;
        List asList;
        char c;
        zzbek zzbekVar;
        Bundle bundle = (Bundle) obj;
        if (this.zzb.zzf()) {
            return;
        }
        Object obj2 = bundle.get("ad_types");
        if (obj2 instanceof List) {
            asList = (List) obj2;
        } else if (obj2 instanceof String[]) {
            asList = Arrays.asList((String[]) obj2);
        } else {
            emptyList = Collections.emptyList();
            final ArrayList arrayList = new ArrayList();
            for (String str : emptyList) {
                switch (str.hashCode()) {
                    case -1396342996:
                        if (str.equals(f.e)) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1052618729:
                        if (str.equals(f.a)) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -239580146:
                        if (str.equals("rewarded")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 604727084:
                        if (str.equals("interstitial")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                if (c == 0) {
                    zzbekVar = zzbek.BANNER;
                } else if (c == 1) {
                    zzbekVar = zzbek.INTERSTITIAL;
                } else if (c == 2) {
                    zzbekVar = zzbek.NATIVE_APP_INSTALL;
                } else if (c != 3) {
                    zzbekVar = zzbek.AD_FORMAT_TYPE_UNSPECIFIED;
                } else {
                    zzbekVar = zzbek.REWARD_BASED_VIDEO_AD;
                }
                arrayList.add(zzbekVar);
            }
            final zzbfz zzb = zzeea.zzb(this.zzb, bundle);
            final zzbfq zza = zzeea.zza(this.zzb, bundle);
            zzedo zzedoVar = this.zzb.zza;
            final boolean z = this.zza;
            zzedoVar.zza(new zzffi() { // from class: com.google.android.gms.internal.ads.zzedy
                @Override // com.google.android.gms.internal.ads.zzffi
                public final Object zza(Object obj3) {
                    zzeds zzedsVar;
                    zzedz zzedzVar = zzedz.this;
                    boolean z2 = z;
                    ArrayList arrayList2 = arrayList;
                    zzbfq zzbfqVar = zza;
                    zzbfz zzbfzVar = zzb;
                    SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj3;
                    if (zzedzVar.zzb.zzf()) {
                        return null;
                    }
                    byte[] zze = zzeea.zze(zzedzVar.zzb, z2, arrayList2, zzbfqVar, zzbfzVar);
                    zzeed.zzg(sQLiteDatabase, z2, true);
                    zzedsVar = zzedzVar.zzb.zzf;
                    zzeed.zzd(sQLiteDatabase, zzedsVar.zzd(), zze);
                    return null;
                }
            });
        }
        ArrayList arrayList2 = new ArrayList(asList.size());
        for (Object obj3 : asList) {
            if (obj3 instanceof String) {
                arrayList2.add((String) obj3);
            }
        }
        emptyList = Collections.unmodifiableList(arrayList2);
        final ArrayList arrayList3 = new ArrayList();
        while (r0.hasNext()) {
        }
        final zzbfz zzb2 = zzeea.zzb(this.zzb, bundle);
        final zzbfq zza2 = zzeea.zza(this.zzb, bundle);
        zzedo zzedoVar2 = this.zzb.zza;
        final boolean z2 = this.zza;
        zzedoVar2.zza(new zzffi() { // from class: com.google.android.gms.internal.ads.zzedy
            @Override // com.google.android.gms.internal.ads.zzffi
            public final Object zza(Object obj32) {
                zzeds zzedsVar;
                zzedz zzedzVar = zzedz.this;
                boolean z22 = z2;
                ArrayList arrayList22 = arrayList3;
                zzbfq zzbfqVar = zza2;
                zzbfz zzbfzVar = zzb2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj32;
                if (zzedzVar.zzb.zzf()) {
                    return null;
                }
                byte[] zze = zzeea.zze(zzedzVar.zzb, z22, arrayList22, zzbfqVar, zzbfzVar);
                zzeed.zzg(sQLiteDatabase, z22, true);
                zzedsVar = zzedzVar.zzb.zzf;
                zzeed.zzd(sQLiteDatabase, zzedsVar.zzd(), zze);
                return null;
            }
        });
    }
}