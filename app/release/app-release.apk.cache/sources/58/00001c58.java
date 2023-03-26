package com.google.android.gms.internal.ads;

import com.microsoft.appcenter.AppCenter;
import com.p7700g.p99005.k1;
import com.p7700g.p99005.z1;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public class zzakg extends zzajb {
    private final Object zza;
    @z1
    @k1("mLock")
    private final zzajg zzb;

    public zzakg(int i, String str, zzajg zzajgVar, @z1 zzajf zzajfVar) {
        super(i, str, zzajfVar);
        this.zza = new Object();
        this.zzb = zzajgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzajb
    public final zzajh zzh(zzaix zzaixVar) {
        String str;
        String str2;
        try {
            byte[] bArr = zzaixVar.zzb;
            Map map = zzaixVar.zzc;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] split = str2.split(AppCenter.PAIR_DELIMITER, 0);
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    String[] split2 = split[i].trim().split(AppCenter.KEY_VALUE_DELIMITER, 0);
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        str3 = split2[1];
                        break;
                    }
                    i++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzaixVar.zzb);
        }
        return zzajh.zzb(str, zzajy.zzb(zzaixVar));
    }

    @Override // com.google.android.gms.internal.ads.zzajb
    /* renamed from: zzz */
    public void zzo(String str) {
        zzajg zzajgVar;
        synchronized (this.zza) {
            zzajgVar = this.zzb;
        }
        zzajgVar.zza(str);
    }
}