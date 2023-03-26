package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.xbill.DNS.WKSRecord;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzahh implements zzagz {
    public final /* synthetic */ zzahi zza;
    private final zzdx zzb = new zzdx(new byte[5], 5);
    private final SparseArray zzc = new SparseArray();
    private final SparseIntArray zzd = new SparseIntArray();
    private final int zze;

    public zzahh(zzahi zzahiVar, int i) {
        this.zza = zzahiVar;
        this.zze = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0112, code lost:
        if (r29.zzk() == 21) goto L30;
     */
    @Override // com.google.android.gms.internal.ads.zzagz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzdy zzdyVar) {
        List list;
        SparseArray sparseArray;
        int i;
        zzyu zzyuVar;
        SparseBooleanArray sparseBooleanArray;
        SparseBooleanArray sparseBooleanArray2;
        zzee zzeeVar;
        int i2;
        zzyu zzyuVar2;
        SparseArray sparseArray2;
        SparseBooleanArray sparseBooleanArray3;
        zzahl zzahlVar;
        zzee zzeeVar2;
        int i3;
        if (zzdyVar.zzk() != 2) {
            return;
        }
        list = this.zza.zzb;
        zzee zzeeVar3 = (zzee) list.get(0);
        if ((zzdyVar.zzk() & 128) == 0) {
            return;
        }
        zzdyVar.zzG(1);
        int zzo = zzdyVar.zzo();
        int i4 = 3;
        zzdyVar.zzG(3);
        zzdyVar.zzA(this.zzb, 2);
        this.zzb.zzj(3);
        int i5 = 13;
        this.zza.zzq = this.zzb.zzc(13);
        zzdyVar.zzA(this.zzb, 2);
        int i6 = 4;
        this.zzb.zzj(4);
        int i7 = 12;
        zzdyVar.zzG(this.zzb.zzc(12));
        this.zzc.clear();
        this.zzd.clear();
        int zza = zzdyVar.zza();
        while (zza > 0) {
            int i8 = 5;
            zzdyVar.zzA(this.zzb, 5);
            int zzc = this.zzb.zzc(8);
            this.zzb.zzj(i4);
            int zzc2 = this.zzb.zzc(i5);
            this.zzb.zzj(i6);
            int zzc3 = this.zzb.zzc(i7);
            int zzc4 = zzdyVar.zzc();
            int i9 = zzc4 + zzc3;
            String str = null;
            ArrayList arrayList = null;
            int i10 = -1;
            while (zzdyVar.zzc() < i9) {
                int zzk = zzdyVar.zzk();
                int zzc5 = zzdyVar.zzc() + zzdyVar.zzk();
                if (zzc5 > i9) {
                    break;
                }
                if (zzk == i8) {
                    long zzs = zzdyVar.zzs();
                    if (zzs == 1094921523) {
                        i10 = 129;
                    } else if (zzs == 1161904947) {
                        i10 = WKSRecord.Service.LOC_SRV;
                    } else {
                        if (zzs != 1094921524) {
                            if (zzs == 1212503619) {
                                i10 = 36;
                            }
                        }
                        i10 = 172;
                    }
                    zzeeVar2 = zzeeVar3;
                    i3 = zzo;
                } else if (zzk == 106) {
                    zzeeVar2 = zzeeVar3;
                    i3 = zzo;
                    i10 = 129;
                } else if (zzk == 122) {
                    zzeeVar2 = zzeeVar3;
                    i3 = zzo;
                    i10 = WKSRecord.Service.LOC_SRV;
                } else if (zzk != 127) {
                    if (zzk == 123) {
                        zzeeVar2 = zzeeVar3;
                        i3 = zzo;
                        i10 = WKSRecord.Service.NETBIOS_DGM;
                    } else if (zzk == 10) {
                        zzeeVar2 = zzeeVar3;
                        str = zzdyVar.zzx(3, zzfoi.zzc).trim();
                        i3 = zzo;
                    } else {
                        int i11 = 3;
                        if (zzk == 89) {
                            ArrayList arrayList2 = new ArrayList();
                            while (zzdyVar.zzc() < zzc5) {
                                String trim = zzdyVar.zzx(i11, zzfoi.zzc).trim();
                                int zzk2 = zzdyVar.zzk();
                                zzee zzeeVar4 = zzeeVar3;
                                byte[] bArr = new byte[4];
                                zzdyVar.zzB(bArr, 0, 4);
                                arrayList2.add(new zzahj(trim, zzk2, bArr));
                                zzeeVar3 = zzeeVar4;
                                zzo = zzo;
                                i11 = 3;
                            }
                            zzeeVar2 = zzeeVar3;
                            i3 = zzo;
                            arrayList = arrayList2;
                            i10 = 89;
                        } else {
                            zzeeVar2 = zzeeVar3;
                            i3 = zzo;
                            if (zzk == 111) {
                                i10 = 257;
                            }
                        }
                        zzdyVar.zzG(zzc5 - zzdyVar.zzc());
                        zzeeVar3 = zzeeVar2;
                        zzo = i3;
                        i8 = 5;
                    }
                }
                zzdyVar.zzG(zzc5 - zzdyVar.zzc());
                zzeeVar3 = zzeeVar2;
                zzo = i3;
                i8 = 5;
            }
            zzee zzeeVar5 = zzeeVar3;
            int i12 = zzo;
            zzdyVar.zzF(i9);
            zzahk zzahkVar = new zzahk(i10, str, arrayList, Arrays.copyOfRange(zzdyVar.zzH(), zzc4, i9));
            if (zzc == 6 || zzc == 5) {
                zzc = zzahkVar.zza;
            }
            zza -= zzc3 + 5;
            sparseBooleanArray3 = this.zza.zzg;
            if (!sparseBooleanArray3.get(zzc2)) {
                zzahlVar = this.zza.zze;
                zzahn zza2 = zzahlVar.zza(zzc, zzahkVar);
                this.zzd.put(zzc2, zzc2);
                this.zzc.put(zzc2, zza2);
            }
            zzeeVar3 = zzeeVar5;
            zzo = i12;
            i4 = 3;
            i6 = 4;
            i7 = 12;
            i5 = 13;
        }
        zzee zzeeVar6 = zzeeVar3;
        int i13 = zzo;
        int size = this.zzd.size();
        int i14 = 0;
        while (i14 < size) {
            int keyAt = this.zzd.keyAt(i14);
            int valueAt = this.zzd.valueAt(i14);
            sparseBooleanArray = this.zza.zzg;
            sparseBooleanArray.put(keyAt, true);
            sparseBooleanArray2 = this.zza.zzh;
            sparseBooleanArray2.put(valueAt, true);
            zzahn zzahnVar = (zzahn) this.zzc.valueAt(i14);
            if (zzahnVar != null) {
                zzyuVar2 = this.zza.zzk;
                i2 = i13;
                zzahm zzahmVar = new zzahm(i2, keyAt, 8192);
                zzeeVar = zzeeVar6;
                zzahnVar.zzb(zzeeVar, zzyuVar2, zzahmVar);
                sparseArray2 = this.zza.zzf;
                sparseArray2.put(valueAt, zzahnVar);
            } else {
                zzeeVar = zzeeVar6;
                i2 = i13;
            }
            i14++;
            zzeeVar6 = zzeeVar;
            i13 = i2;
        }
        sparseArray = this.zza.zzf;
        sparseArray.remove(this.zze);
        this.zza.zzl = 0;
        zzahi zzahiVar = this.zza;
        i = zzahiVar.zzl;
        if (i == 0) {
            zzyuVar = zzahiVar.zzk;
            zzyuVar.zzB();
            this.zza.zzm = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagz
    public final void zzb(zzee zzeeVar, zzyu zzyuVar, zzahm zzahmVar) {
    }
}