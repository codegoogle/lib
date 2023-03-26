package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzafx implements zzahl {
    private final List zza;

    public zzafx() {
        this(0);
    }

    private final zzahb zzb(zzahk zzahkVar) {
        return new zzahb(zzd(zzahkVar));
    }

    private final zzahp zzc(zzahk zzahkVar) {
        return new zzahp(zzd(zzahkVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4 */
    private final List zzd(zzahk zzahkVar) {
        String str;
        int i;
        List list;
        zzdy zzdyVar = new zzdy(zzahkVar.zzd);
        ArrayList arrayList = this.zza;
        while (zzdyVar.zza() > 0) {
            int zzk = zzdyVar.zzk();
            int zzc = zzdyVar.zzc() + zzdyVar.zzk();
            if (zzk == 134) {
                arrayList = new ArrayList();
                int zzk2 = zzdyVar.zzk() & 31;
                for (int i2 = 0; i2 < zzk2; i2++) {
                    String zzx = zzdyVar.zzx(3, zzfoi.zzc);
                    int zzk3 = zzdyVar.zzk();
                    int i3 = zzk3 & 128;
                    if (i3 != 0) {
                        i = zzk3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte zzk4 = (byte) zzdyVar.zzk();
                    zzdyVar.zzG(1);
                    if (i3 != 0) {
                        int i4 = zzcy.zza;
                        list = Collections.singletonList((zzk4 & 64) != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    zzab zzabVar = new zzab();
                    zzabVar.zzS(str);
                    zzabVar.zzK(zzx);
                    zzabVar.zzu(i);
                    zzabVar.zzI(list);
                    arrayList.add(zzabVar.zzY());
                }
            }
            zzdyVar.zzF(zzc);
            arrayList = arrayList;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzahl
    @z1
    public final zzahn zza(int i, zzahk zzahkVar) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new zzagr(new zzago(zzahkVar.zzb));
            }
            if (i == 21) {
                return new zzagr(new zzagm());
            }
            if (i == 27) {
                return new zzagr(new zzagj(zzb(zzahkVar), false, false));
            }
            if (i == 36) {
                return new zzagr(new zzagl(zzb(zzahkVar)));
            }
            if (i == 89) {
                return new zzagr(new zzafz(zzahkVar.zzc));
            }
            if (i == 138) {
                return new zzagr(new zzafy(zzahkVar.zzb));
            }
            if (i == 172) {
                return new zzagr(new zzaft(zzahkVar.zzb));
            }
            if (i == 257) {
                return new zzaha(new zzagq("application/vnd.dvb.ait"));
            }
            if (i != 128) {
                if (i != 129) {
                    if (i == 134) {
                        return new zzaha(new zzagq("application/x-scte35"));
                    }
                    if (i != 135) {
                        switch (i) {
                            case 15:
                                return new zzagr(new zzafw(false, zzahkVar.zzb));
                            case 16:
                                return new zzagr(new zzagf(zzc(zzahkVar)));
                            case 17:
                                return new zzagr(new zzagn(zzahkVar.zzb));
                            default:
                                return null;
                        }
                    }
                }
                return new zzagr(new zzafq(zzahkVar.zzb));
            }
        }
        return new zzagr(new zzagc(zzc(zzahkVar)));
    }

    public zzafx(int i) {
        this.zza = zzfrj.zzo();
    }
}