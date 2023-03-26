package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.common.util.VisibleForTesting;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.io.File;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfmj {
    @VisibleForTesting
    public final File zza;
    private final File zzb;
    private final SharedPreferences zzc;
    private final int zzd;

    public zzfmj(@x1 Context context, int i) {
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        zzfmk.zza(dir, false);
        this.zzb = dir;
        File dir2 = context.getDir("tmppccache", 0);
        zzfmk.zza(dir2, true);
        this.zza = dir2;
        this.zzd = i;
    }

    @VisibleForTesting
    public static String zza(@x1 zzaqv zzaqvVar) {
        return Hex.bytesToStringLowercase(zzaqvVar.zzas().zzE());
    }

    private final File zze() {
        File file = new File(this.zzb, Integer.toString(this.zzd - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String zzf() {
        int i = this.zzd;
        StringBuilder G = wo1.G("FBAMTD");
        G.append(i - 1);
        return G.toString();
    }

    private final String zzg() {
        int i = this.zzd;
        StringBuilder G = wo1.G("LATMTD");
        G.append(i - 1);
        return G.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzb(@x1 zzaqs zzaqsVar, @z1 zzfmp zzfmpVar) {
        boolean z;
        zzaqv zzc;
        zzaqv zzc2;
        String zzk = zzaqsVar.zzd().zzk();
        byte[] zzE = zzaqsVar.zzf().zzE();
        byte[] zzE2 = zzaqsVar.zze().zzE();
        if (!TextUtils.isEmpty(zzk) && zzE2 != null && zzE2.length != 0) {
            zzfmk.zzd(this.zza);
            this.zza.mkdirs();
            zzfmk.zzc(zzk, this.zza).mkdirs();
            File zzb = zzfmk.zzb(zzk, "pcam.jar", this.zza);
            if ((zzE == null || zzE.length <= 0 || zzfmk.zze(zzb, zzE)) && zzfmk.zze(zzfmk.zzb(zzk, "pcbc", this.zza), zzE2)) {
                File zzb2 = zzfmk.zzb(zzaqsVar.zzd().zzk(), "pcam.jar", this.zza);
                if (!zzb2.exists() || zzfmpVar == null || zzfmpVar.zza(zzb2)) {
                    String zzk2 = zzaqsVar.zzd().zzk();
                    if (!TextUtils.isEmpty(zzk2)) {
                        File zzb3 = zzfmk.zzb(zzk2, "pcam.jar", this.zza);
                        File zzb4 = zzfmk.zzb(zzk2, "pcbc", this.zza);
                        File zzb5 = zzfmk.zzb(zzk2, "pcam.jar", zze());
                        File zzb6 = zzfmk.zzb(zzk2, "pcbc", zze());
                        if ((!zzb3.exists() || zzb3.renameTo(zzb5)) && zzb4.exists() && zzb4.renameTo(zzb6)) {
                            zzaqu zze = zzaqv.zze();
                            zze.zze(zzaqsVar.zzd().zzk());
                            zze.zza(zzaqsVar.zzd().zzj());
                            zze.zzb(zzaqsVar.zzd().zza());
                            zze.zzd(zzaqsVar.zzd().zzd());
                            zze.zzc(zzaqsVar.zzd().zzc());
                            zzaqv zzaqvVar = (zzaqv) zze.zzal();
                            zzaqv zzc3 = zzc(1);
                            SharedPreferences.Editor edit = this.zzc.edit();
                            if (zzc3 != null && !zzaqvVar.zzk().equals(zzc3.zzk())) {
                                edit.putString(zzf(), zza(zzc3));
                            }
                            edit.putString(zzg(), zza(zzaqvVar));
                            if (edit.commit()) {
                                z = true;
                                HashSet hashSet = new HashSet();
                                zzc = zzc(1);
                                if (zzc != null) {
                                    hashSet.add(zzc.zzk());
                                }
                                zzc2 = zzc(2);
                                if (zzc2 != null) {
                                    hashSet.add(zzc2.zzk());
                                }
                                for (File file : zze().listFiles()) {
                                    String name = file.getName();
                                    if (!hashSet.contains(name)) {
                                        zzfmk.zzd(zzfmk.zzc(name, zze()));
                                    }
                                }
                                return z;
                            }
                        }
                    }
                    z = false;
                    HashSet hashSet2 = new HashSet();
                    zzc = zzc(1);
                    if (zzc != null) {
                    }
                    zzc2 = zzc(2);
                    if (zzc2 != null) {
                    }
                    while (r4 < r1) {
                    }
                    return z;
                }
                return false;
            }
        }
        return false;
    }

    @VisibleForTesting
    @z1
    public final zzaqv zzc(int i) {
        String string;
        if (i == 1) {
            string = this.zzc.getString(zzg(), null);
        } else {
            string = this.zzc.getString(zzf(), null);
        }
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            zzaqv zzh = zzaqv.zzh(zzgji.zzv(Hex.stringToBytes(string)));
            String zzk = zzh.zzk();
            File zzb = zzfmk.zzb(zzk, "pcam.jar", zze());
            if (!zzb.exists()) {
                zzb = zzfmk.zzb(zzk, "pcam", zze());
            }
            File zzb2 = zzfmk.zzb(zzk, "pcbc", zze());
            if (zzb.exists()) {
                if (zzb2.exists()) {
                    return zzh;
                }
            }
        } catch (zzglc unused) {
        }
        return null;
    }

    @z1
    public final zzfmi zzd(int i) {
        zzaqv zzc = zzc(1);
        if (zzc == null) {
            return null;
        }
        String zzk = zzc.zzk();
        File zzb = zzfmk.zzb(zzk, "pcam.jar", zze());
        if (!zzb.exists()) {
            zzb = zzfmk.zzb(zzk, "pcam", zze());
        }
        return new zzfmi(zzc, zzb, zzfmk.zzb(zzk, "pcbc", zze()), zzfmk.zzb(zzk, "pcopt", zze()));
    }
}