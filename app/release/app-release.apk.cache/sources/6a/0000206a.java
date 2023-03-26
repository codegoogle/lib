package com.google.android.gms.internal.ads;

import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.anythink.expressad.video.signal.a.f;
import com.p7700g.p99005.qm3;
import com.p7700g.p99005.td;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public class zzbwv {
    private final zzcli zza;
    private final String zzb;

    public zzbwv(zzcli zzcliVar, String str) {
        this.zza = zzcliVar;
        this.zzb = str;
    }

    public final void zzf(int i, int i2, int i3, int i4) {
        try {
            this.zza.zze("onDefaultPositionReceived", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            zzcfi.zzh("Error occurred while dispatching default position.", e);
        }
    }

    public final void zzg(String str) {
        try {
            JSONObject put = new JSONObject().put(qm3.b.j, str).put("action", this.zzb);
            zzcli zzcliVar = this.zza;
            if (zzcliVar != null) {
                zzcliVar.zze("onError", put);
            }
        } catch (JSONException e) {
            zzcfi.zzh("Error occurred while dispatching error event.", e);
        }
    }

    public final void zzh(String str) {
        try {
            this.zza.zze("onReadyEventReceived", new JSONObject().put(f.a, str));
        } catch (JSONException e) {
            zzcfi.zzh("Error occurred while dispatching ready Event.", e);
        }
    }

    public final void zzi(int i, int i2, int i3, int i4, float f, int i5) {
        try {
            this.zza.zze("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put("density", f).put(td.d, i5));
        } catch (JSONException e) {
            zzcfi.zzh("Error occurred while obtaining screen information.", e);
        }
    }

    public final void zzj(int i, int i2, int i3, int i4) {
        try {
            this.zza.zze("onSizeChanged", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            zzcfi.zzh("Error occurred while dispatching size change.", e);
        }
    }

    public final void zzk(String str) {
        try {
            this.zza.zze("onStateChanged", new JSONObject().put(CallMraidJS.b, str));
        } catch (JSONException e) {
            zzcfi.zzh("Error occurred while dispatching state change.", e);
        }
    }
}