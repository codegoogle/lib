package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.z1;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzacj extends zzacb {
    public static final Parcelable.Creator<zzacj> CREATOR = new zzaci();
    @z1
    public final String zza;
    public final String zzb;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzacj(Parcel parcel) {
        super(r0);
        String readString = parcel.readString();
        int i = zzeg.zza;
        this.zza = parcel.readString();
        this.zzb = parcel.readString();
    }

    private static List zzb(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public final boolean equals(@z1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzacj.class == obj.getClass()) {
            zzacj zzacjVar = (zzacj) obj;
            if (zzeg.zzS(this.zzf, zzacjVar.zzf) && zzeg.zzS(this.zza, zzacjVar.zza) && zzeg.zzS(this.zzb, zzacjVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int x = wo1.x(this.zzf, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31);
        String str = this.zza;
        int hashCode = (x + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.zzb;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzacb
    public final String toString() {
        return wo1.w(this.zzf, ": description=", this.zza, ": value=", this.zzb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzf);
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzacb, com.google.android.gms.internal.ads.zzbk
    public final void zza(zzbf zzbfVar) {
        char c;
        String str = this.zzf;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
                zzbfVar.zzr(this.zzb);
                return;
            case 2:
            case 3:
                zzbfVar.zze(this.zzb);
                return;
            case 4:
            case 5:
                zzbfVar.zzc(this.zzb);
                return;
            case 6:
            case 7:
                zzbfVar.zzd(this.zzb);
                return;
            case '\b':
            case '\t':
                String[] zzaf = zzeg.zzaf(this.zzb, "/");
                try {
                    int parseInt = Integer.parseInt(zzaf[0]);
                    Integer valueOf = zzaf.length > 1 ? Integer.valueOf(Integer.parseInt(zzaf[1])) : null;
                    zzbfVar.zzt(Integer.valueOf(parseInt));
                    zzbfVar.zzs(valueOf);
                    return;
                } catch (NumberFormatException unused) {
                    return;
                }
            case '\n':
            case 11:
                try {
                    zzbfVar.zzm(Integer.valueOf(Integer.parseInt(this.zzb)));
                    return;
                } catch (NumberFormatException unused2) {
                    return;
                }
            case '\f':
            case '\r':
                try {
                    int parseInt2 = Integer.parseInt(this.zzb.substring(2, 4));
                    int parseInt3 = Integer.parseInt(this.zzb.substring(0, 2));
                    zzbfVar.zzl(Integer.valueOf(parseInt2));
                    zzbfVar.zzk(Integer.valueOf(parseInt3));
                    return;
                } catch (NumberFormatException | StringIndexOutOfBoundsException unused3) {
                    return;
                }
            case 14:
                List zzb = zzb(this.zzb);
                int size = zzb.size();
                if (size != 1) {
                    if (size != 2) {
                        if (size != 3) {
                            return;
                        }
                        zzbfVar.zzk((Integer) zzb.get(2));
                    }
                    zzbfVar.zzl((Integer) zzb.get(1));
                }
                zzbfVar.zzm((Integer) zzb.get(0));
                return;
            case 15:
                List zzb2 = zzb(this.zzb);
                int size2 = zzb2.size();
                if (size2 != 1) {
                    if (size2 != 2) {
                        if (size2 != 3) {
                            return;
                        }
                        zzbfVar.zzn((Integer) zzb2.get(2));
                    }
                    zzbfVar.zzo((Integer) zzb2.get(1));
                }
                zzbfVar.zzp((Integer) zzb2.get(0));
                return;
            case 16:
            case 17:
                zzbfVar.zzg(this.zzb);
                return;
            case 18:
            case 19:
                zzbfVar.zzh(this.zzb);
                return;
            case 20:
            case 21:
                zzbfVar.zzu(this.zzb);
                return;
            default:
                return;
        }
    }

    public zzacj(String str, @z1 String str2, String str3) {
        super(str);
        this.zza = str2;
        this.zzb = str3;
    }
}