package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.anythink.expressad.foundation.d.c;
import com.microsoft.appcenter.utils.crypto.CryptoConstants;
import com.p7700g.p99005.wo1;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcji implements zzbom {
    private boolean zza;

    private static int zzb(Context context, Map map, String str, int i) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                com.google.android.gms.ads.internal.client.zzaw.zzb();
                i = zzcfb.zzw(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                zzcfi.zzj("Could not parse " + str + " in a video GMSG: " + str2);
            }
        }
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            StringBuilder N = wo1.N("Parse pixels for ", str, ", got string ", str2, ", int ");
            N.append(i);
            N.append(CryptoConstants.ALIAS_SEPARATOR);
            com.google.android.gms.ads.internal.util.zze.zza(N.toString());
        }
        return i;
    }

    private static void zzc(zzchf zzchfVar, Map map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                zzchfVar.zzA(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                zzcfi.zzj(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", str, str2));
                return;
            }
        }
        if (str2 != null) {
            zzchfVar.zzz(Integer.parseInt(str2));
        }
        if (str3 != null) {
            zzchfVar.zzx(Integer.parseInt(str3));
        }
        if (str4 != null) {
            zzchfVar.zzy(Integer.parseInt(str4));
        }
        if (str5 != null) {
            zzchfVar.zzC(Integer.parseInt(str5));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        int min;
        int min2;
        int i;
        String[] split;
        zzchr zzchrVar = (zzchr) obj;
        String str = (String) map.get("action");
        if (str == null) {
            zzcfi.zzj("Action missing from video GMSG.");
            return;
        }
        if (zzcfi.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            zzcfi.zze("Video GMSG: " + str + " " + jSONObject.toString());
        }
        if ("background".equals(str)) {
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                zzcfi.zzj("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                zzchrVar.setBackgroundColor(Color.parseColor(str2));
            } catch (IllegalArgumentException unused) {
                zzcfi.zzj("Invalid color parameter in background video GMSG.");
            }
        } else if ("playerBackground".equals(str)) {
            String str3 = (String) map.get("color");
            if (TextUtils.isEmpty(str3)) {
                zzcfi.zzj("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                zzchrVar.zzD(Color.parseColor(str3));
            } catch (IllegalArgumentException unused2) {
                zzcfi.zzj("Invalid color parameter in playerBackground video GMSG.");
            }
        } else {
            if ("decoderProps".equals(str)) {
                String str4 = (String) map.get("mimeTypes");
                if (str4 == null) {
                    zzcfi.zzj("No MIME types specified for decoder properties inspection.");
                    HashMap hashMap = new HashMap();
                    hashMap.put("event", "decoderProps");
                    hashMap.put("error", "missingMimeTypes");
                    zzchrVar.zzd("onVideoEvent", hashMap);
                    return;
                }
                HashMap hashMap2 = new HashMap();
                for (String str5 : str4.split(",")) {
                    hashMap2.put(str5, com.google.android.gms.ads.internal.util.zzch.zza(str5.trim()));
                }
                HashMap hashMap3 = new HashMap();
                hashMap3.put("event", "decoderProps");
                hashMap3.put("mimeTypes", hashMap2);
                zzchrVar.zzd("onVideoEvent", hashMap3);
                return;
            }
            zzchg zzbp = zzchrVar.zzbp();
            if (zzbp == null) {
                zzcfi.zzj("Could not get underlay container for a video GMSG.");
                return;
            }
            boolean equals = "new".equals(str);
            boolean equals2 = "position".equals(str);
            if (!equals && !equals2) {
                zzcme zzs = zzchrVar.zzs();
                if (zzs != null) {
                    if ("timeupdate".equals(str)) {
                        String str6 = (String) map.get("currentTime");
                        if (str6 == null) {
                            zzcfi.zzj("currentTime parameter missing from timeupdate video GMSG.");
                            return;
                        }
                        try {
                            zzs.zzt(Float.parseFloat(str6));
                            return;
                        } catch (NumberFormatException unused3) {
                            zzcfi.zzj("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str6));
                            return;
                        }
                    } else if ("skip".equals(str)) {
                        zzs.zzu();
                        return;
                    }
                }
                zzchf zza = zzbp.zza();
                if (zza == null) {
                    HashMap hashMap4 = new HashMap();
                    hashMap4.put("event", "no_video_view");
                    zzchrVar.zzd("onVideoEvent", hashMap4);
                    return;
                } else if (c.bY.equals(str)) {
                    Context context = zzchrVar.getContext();
                    int zzb = zzb(context, map, "x", 0);
                    int zzb2 = zzb(context, map, "y", 0);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, zzb, zzb2, 0);
                    zza.zzw(obtain);
                    obtain.recycle();
                    return;
                } else if ("currentTime".equals(str)) {
                    String str7 = (String) map.get("time");
                    if (str7 == null) {
                        zzcfi.zzj("Time parameter missing from currentTime video GMSG.");
                        return;
                    }
                    try {
                        zza.zzv((int) (Float.parseFloat(str7) * 1000.0f));
                        return;
                    } catch (NumberFormatException unused4) {
                        zzcfi.zzj("Could not parse time parameter from currentTime video GMSG: ".concat(str7));
                        return;
                    }
                } else if ("hide".equals(str)) {
                    zza.setVisibility(4);
                    return;
                } else if ("load".equals(str)) {
                    zza.zzq();
                    return;
                } else if ("loadControl".equals(str)) {
                    zzc(zza, map);
                    return;
                } else if ("muted".equals(str)) {
                    if (Boolean.parseBoolean((String) map.get("muted"))) {
                        zza.zzr();
                        return;
                    } else {
                        zza.zzH();
                        return;
                    }
                } else if (c.bZ.equals(str)) {
                    zza.zzt();
                    return;
                } else if ("play".equals(str)) {
                    zza.zzu();
                    return;
                } else if ("show".equals(str)) {
                    zza.setVisibility(0);
                    return;
                } else if ("src".equals(str)) {
                    String str8 = (String) map.get("src");
                    Integer num = null;
                    if (map.containsKey("periodicReportIntervalMs")) {
                        try {
                            num = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
                        } catch (NumberFormatException unused5) {
                            zzcfi.zzj("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf((String) map.get("periodicReportIntervalMs"))));
                        }
                    }
                    String[] strArr = {str8};
                    String str9 = (String) map.get("demuxed");
                    if (str9 != null) {
                        try {
                            JSONArray jSONArray = new JSONArray(str9);
                            String[] strArr2 = new String[jSONArray.length()];
                            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                                strArr2[i2] = jSONArray.getString(i2);
                            }
                            strArr = strArr2;
                        } catch (JSONException unused6) {
                            zzcfi.zzj("Malformed demuxed URL list for playback: ".concat(str9));
                            strArr = new String[]{str8};
                        }
                    }
                    if (num != null) {
                        zzchrVar.zzC(num.intValue());
                    }
                    zza.zzD(str8, strArr);
                    return;
                } else if ("touchMove".equals(str)) {
                    Context context2 = zzchrVar.getContext();
                    zza.zzG(zzb(context2, map, "dx", 0), zzb(context2, map, "dy", 0));
                    if (this.zza) {
                        return;
                    }
                    zzchrVar.zzw();
                    this.zza = true;
                    return;
                } else if ("volume".equals(str)) {
                    String str10 = (String) map.get("volume");
                    if (str10 == null) {
                        zzcfi.zzj("Level parameter missing from volume video GMSG.");
                        return;
                    }
                    try {
                        zza.zzF(Float.parseFloat(str10));
                        return;
                    } catch (NumberFormatException unused7) {
                        zzcfi.zzj("Could not parse volume parameter from volume video GMSG: ".concat(str10));
                        return;
                    }
                } else if ("watermark".equals(str)) {
                    zza.zzm();
                    return;
                } else {
                    zzcfi.zzj("Unknown video action: ".concat(str));
                    return;
                }
            }
            Context context3 = zzchrVar.getContext();
            int zzb3 = zzb(context3, map, "x", 0);
            int zzb4 = zzb(context3, map, "y", 0);
            int zzb5 = zzb(context3, map, "w", -1);
            zzbhr zzbhrVar = zzbhz.zzcU;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhrVar)).booleanValue()) {
                if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                    StringBuilder J = wo1.J("Calculate width with original width ", zzb5, ", videoHost.getVideoBoundingWidth() ", zzchrVar.zzj(), ", x ");
                    J.append(zzb3);
                    J.append(CryptoConstants.ALIAS_SEPARATOR);
                    com.google.android.gms.ads.internal.util.zze.zza(J.toString());
                }
                min = Math.min(zzb5, zzchrVar.zzj() - zzb3);
            } else if (zzb5 == -1) {
                min = zzchrVar.zzj();
            } else {
                min = Math.min(zzb5, zzchrVar.zzj());
            }
            int i3 = min;
            int zzb6 = zzb(context3, map, "h", -1);
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhrVar)).booleanValue()) {
                if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                    StringBuilder J2 = wo1.J("Calculate height with original height ", zzb6, ", videoHost.getVideoBoundingHeight() ", zzchrVar.zzi(), ", y ");
                    J2.append(zzb4);
                    J2.append(CryptoConstants.ALIAS_SEPARATOR);
                    com.google.android.gms.ads.internal.util.zze.zza(J2.toString());
                }
                min2 = Math.min(zzb6, zzchrVar.zzi() - zzb4);
            } else if (zzb6 == -1) {
                min2 = zzchrVar.zzi();
            } else {
                min2 = Math.min(zzb6, zzchrVar.zzi());
            }
            int i4 = min2;
            try {
                i = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException unused8) {
                i = 0;
            }
            boolean parseBoolean = Boolean.parseBoolean((String) map.get("spherical"));
            if (equals && zzbp.zza() == null) {
                zzbp.zzc(zzb3, zzb4, i3, i4, i, parseBoolean, new zzchq((String) map.get("flags")));
                zzchf zza2 = zzbp.zza();
                if (zza2 != null) {
                    zzc(zza2, map);
                    return;
                }
                return;
            }
            zzbp.zzb(zzb3, zzb4, i3, i4);
        }
    }
}