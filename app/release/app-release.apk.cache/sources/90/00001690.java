package com.google.android.gms.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.internal.ads.zzcfi;
import com.p7700g.p99005.pg1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class ResponseInfo {
    @z1
    private final zzdh zza;
    private final List zzb = new ArrayList();
    @z1
    private AdapterResponseInfo zzc;

    private ResponseInfo(@z1 zzdh zzdhVar) {
        this.zza = zzdhVar;
        if (zzdhVar != null) {
            try {
                List<zzu> zzi = zzdhVar.zzi();
                if (zzi != null) {
                    for (zzu zzuVar : zzi) {
                        AdapterResponseInfo zza = AdapterResponseInfo.zza(zzuVar);
                        if (zza != null) {
                            this.zzb.add(zza);
                        }
                    }
                }
            } catch (RemoteException e) {
                zzcfi.zzh("Could not forward getAdapterResponseInfo to ResponseInfo.", e);
            }
        }
        zzdh zzdhVar2 = this.zza;
        if (zzdhVar2 == null) {
            return;
        }
        try {
            zzu zzf = zzdhVar2.zzf();
            if (zzf != null) {
                this.zzc = AdapterResponseInfo.zza(zzf);
            }
        } catch (RemoteException e2) {
            zzcfi.zzh("Could not forward getLoadedAdapterResponse to ResponseInfo.", e2);
        }
    }

    @z1
    public static ResponseInfo zza(@z1 zzdh zzdhVar) {
        if (zzdhVar != null) {
            return new ResponseInfo(zzdhVar);
        }
        return null;
    }

    @x1
    public static ResponseInfo zzb(@z1 zzdh zzdhVar) {
        return new ResponseInfo(zzdhVar);
    }

    @x1
    public List<AdapterResponseInfo> getAdapterResponses() {
        return this.zzb;
    }

    @z1
    public AdapterResponseInfo getLoadedAdapterResponseInfo() {
        return this.zzc;
    }

    @z1
    public String getMediationAdapterClassName() {
        try {
            zzdh zzdhVar = this.zza;
            if (zzdhVar != null) {
                return zzdhVar.zzg();
            }
            return null;
        } catch (RemoteException e) {
            zzcfi.zzh("Could not forward getMediationAdapterClassName to ResponseInfo.", e);
            return null;
        }
    }

    @x1
    public Bundle getResponseExtras() {
        try {
            zzdh zzdhVar = this.zza;
            if (zzdhVar != null) {
                return zzdhVar.zze();
            }
        } catch (RemoteException e) {
            zzcfi.zzh("Could not forward getResponseExtras to ResponseInfo.", e);
        }
        return new Bundle();
    }

    @z1
    public String getResponseId() {
        try {
            zzdh zzdhVar = this.zza;
            if (zzdhVar != null) {
                return zzdhVar.zzh();
            }
            return null;
        } catch (RemoteException e) {
            zzcfi.zzh("Could not forward getResponseId to ResponseInfo.", e);
            return null;
        }
    }

    @x1
    public String toString() {
        try {
            return zzc().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    @x1
    public final JSONObject zzc() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String responseId = getResponseId();
        if (responseId == null) {
            jSONObject.put("Response ID", pg1.d);
        } else {
            jSONObject.put("Response ID", responseId);
        }
        String mediationAdapterClassName = getMediationAdapterClassName();
        if (mediationAdapterClassName == null) {
            jSONObject.put("Mediation Adapter Class Name", pg1.d);
        } else {
            jSONObject.put("Mediation Adapter Class Name", mediationAdapterClassName);
        }
        JSONArray jSONArray = new JSONArray();
        for (AdapterResponseInfo adapterResponseInfo : this.zzb) {
            jSONArray.put(adapterResponseInfo.zzb());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        AdapterResponseInfo adapterResponseInfo2 = this.zzc;
        if (adapterResponseInfo2 != null) {
            jSONObject.put("Loaded Adapter Response", adapterResponseInfo2.zzb());
        }
        Bundle responseExtras = getResponseExtras();
        if (responseExtras != null) {
            jSONObject.put("Response Extras", zzaw.zzb().zzh(responseExtras));
        }
        return jSONObject;
    }
}