package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.z1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfie {
    private final zzeiq zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final Context zze;
    private final zzfby zzf;
    private final Clock zzg;
    private final zzaoc zzh;

    public zzfie(zzeiq zzeiqVar, zzcfo zzcfoVar, String str, String str2, Context context, @z1 zzfby zzfbyVar, Clock clock, zzaoc zzaocVar) {
        this.zza = zzeiqVar;
        this.zzb = zzcfoVar.zza;
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = zzfbyVar;
        this.zzg = clock;
        this.zzh = zzaocVar;
    }

    public static final List zzd(int i, int i2, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zzf((String) it.next(), "@gw_mpe@", wo1.l("2.", i2)));
        }
        return arrayList;
    }

    @z1
    private static String zze(@z1 String str) {
        return (TextUtils.isEmpty(str) || !zzcfh.zzl()) ? str : "fakeForAdDebugLog";
    }

    private static String zzf(String str, String str2, @z1 String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    public final List zza(zzfbx zzfbxVar, zzfbl zzfblVar, List list) {
        return zzb(zzfbxVar, zzfblVar, false, "", "", list);
    }

    public final List zzb(zzfbx zzfbxVar, @z1 zzfbl zzfblVar, boolean z, @z1 String str, @z1 String str2, List list) {
        ArrayList arrayList = new ArrayList();
        String str3 = true != z ? "0" : "1";
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String zzf = zzf(zzf(zzf((String) it.next(), "@gw_adlocid@", zzfbxVar.zza.zza.zzf), "@gw_adnetrefresh@", str3), "@gw_sdkver@", this.zzb);
            if (zzfblVar != null) {
                zzf = zzcdp.zzc(zzf(zzf(zzf(zzf, "@gw_qdata@", zzfblVar.zzz), "@gw_adnetid@", zzfblVar.zzy), "@gw_allocid@", zzfblVar.zzx), this.zze, zzfblVar.zzX);
            }
            String zzf2 = zzf(zzf(zzf(zzf, "@gw_adnetstatus@", this.zza.zzf()), "@gw_seqnum@", this.zzc), "@gw_sessid@", this.zzd);
            boolean z2 = false;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzcF)).booleanValue() && !TextUtils.isEmpty(str)) {
                z2 = true;
            }
            boolean z3 = !TextUtils.isEmpty(str2);
            if (!z2) {
                if (z3) {
                    z3 = true;
                } else {
                    arrayList.add(zzf2);
                }
            }
            if (this.zzh.zzf(Uri.parse(zzf2))) {
                Uri.Builder buildUpon = Uri.parse(zzf2).buildUpon();
                if (z2) {
                    buildUpon = buildUpon.appendQueryParameter("ms", str);
                }
                if (z3) {
                    buildUpon = buildUpon.appendQueryParameter("attok", str2);
                }
                zzf2 = buildUpon.build().toString();
            }
            arrayList.add(zzf2);
        }
        return arrayList;
    }

    public final List zzc(zzfbl zzfblVar, List list, zzcal zzcalVar) {
        ArrayList arrayList = new ArrayList();
        long currentTimeMillis = this.zzg.currentTimeMillis();
        try {
            String zzc = zzcalVar.zzc();
            String num = Integer.toString(zzcalVar.zzb());
            zzfby zzfbyVar = this.zzf;
            String zze = zzfbyVar == null ? "" : zze(zzfbyVar.zza);
            zzfby zzfbyVar2 = this.zzf;
            String zze2 = zzfbyVar2 != null ? zze(zzfbyVar2.zzb) : "";
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(zzcdp.zzc(zzf(zzf(zzf(zzf(zzf(zzf((String) it.next(), "@gw_rwd_userid@", Uri.encode(zze)), "@gw_rwd_custom_data@", Uri.encode(zze2)), "@gw_tmstmp@", Long.toString(currentTimeMillis)), "@gw_rwd_itm@", Uri.encode(zzc)), "@gw_rwd_amt@", num), "@gw_sdkver@", this.zzb), this.zze, zzfblVar.zzX));
            }
            return arrayList;
        } catch (RemoteException e) {
            zzcfi.zzh("Unable to determine award type and amount.", e);
            return arrayList;
        }
    }
}