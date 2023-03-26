package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.anythink.expressad.foundation.c.d;
import com.anythink.expressad.foundation.g.a.f;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzefc implements zzbxp {
    @z1
    private static zzfis zzf(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == -382745961) {
            if (str.equals("htmlDisplay")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 112202875) {
            if (hashCode == 714893483 && str.equals("nativeDisplay")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals(d.a.a)) {
                c = 2;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    return null;
                }
                return zzfis.VIDEO;
            }
            return zzfis.NATIVE_DISPLAY;
        }
        return zzfis.HTML_DISPLAY;
    }

    private static zzfiu zzg(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == -1104128070) {
            if (str.equals("beginToRender")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 1318088141) {
            if (hashCode == 1988248512 && str.equals("onePixel")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str.equals("definedByJavascript")) {
                c = 1;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    return zzfiu.UNSPECIFIED;
                }
                return zzfiu.ONE_PIXEL;
            }
            return zzfiu.DEFINED_BY_JAVASCRIPT;
        }
        return zzfiu.BEGIN_TO_RENDER;
    }

    private static zzfiv zzh(@z1 String str) {
        if (f.a.equals(str)) {
            return zzfiv.NATIVE;
        }
        if ("javascript".equals(str)) {
            return zzfiv.JAVASCRIPT;
        }
        return zzfiv.NONE;
    }

    @Override // com.google.android.gms.internal.ads.zzbxp
    @z1
    public final IObjectWrapper zza(String str, WebView webView, String str2, String str3, @z1 String str4, zzbxr zzbxrVar, zzbxq zzbxqVar, @z1 String str5) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzeb)).booleanValue() && zzfil.zzb()) {
            zzfiw zza = zzfiw.zza("Google", str);
            zzfiv zzh = zzh("javascript");
            zzfis zzf = zzf(zzbxqVar.toString());
            zzfiv zzfivVar = zzfiv.NONE;
            if (zzh == zzfivVar) {
                zzcfi.zzj("Omid html session error; Unable to parse impression owner: javascript");
                return null;
            } else if (zzf == null) {
                zzcfi.zzj("Omid html session error; Unable to parse creative type: ".concat(String.valueOf(zzbxqVar)));
                return null;
            } else {
                zzfiv zzh2 = zzh(str4);
                if (zzf == zzfis.VIDEO && zzh2 == zzfivVar) {
                    zzcfi.zzj("Omid html session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
                    return null;
                }
                return ObjectWrapper.wrap(zzfin.zza(zzfio.zza(zzf, zzg(zzbxrVar.toString()), zzh, zzh2, true), zzfip.zzb(zza, webView, str5, "")));
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbxp
    @z1
    public final IObjectWrapper zzb(String str, WebView webView, String str2, String str3, @z1 String str4, String str5, zzbxr zzbxrVar, zzbxq zzbxqVar, @z1 String str6) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzeb)).booleanValue() && zzfil.zzb()) {
            zzfiw zza = zzfiw.zza(str5, str);
            zzfiv zzh = zzh("javascript");
            zzfiv zzh2 = zzh(str4);
            zzfis zzf = zzf(zzbxqVar.toString());
            zzfiv zzfivVar = zzfiv.NONE;
            if (zzh == zzfivVar) {
                zzcfi.zzj("Omid js session error; Unable to parse impression owner: javascript");
                return null;
            } else if (zzf == null) {
                zzcfi.zzj("Omid js session error; Unable to parse creative type: ".concat(String.valueOf(zzbxqVar)));
                return null;
            } else if (zzf == zzfis.VIDEO && zzh2 == zzfivVar) {
                zzcfi.zzj("Omid js session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
                return null;
            } else {
                return ObjectWrapper.wrap(zzfin.zza(zzfio.zza(zzf, zzg(zzbxrVar.toString()), zzh, zzh2, true), zzfip.zzc(zza, webView, str6, "")));
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbxp
    public final void zzc(IObjectWrapper iObjectWrapper, View view) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzeb)).booleanValue() && zzfil.zzb()) {
            Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
            if (unwrap instanceof zzfin) {
                ((zzfin) unwrap).zzd(view);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxp
    public final void zzd(IObjectWrapper iObjectWrapper) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzeb)).booleanValue() && zzfil.zzb()) {
            Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
            if (unwrap instanceof zzfin) {
                ((zzfin) unwrap).zze();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxp
    public final boolean zze(Context context) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzeb)).booleanValue()) {
            zzcfi.zzj("Omid flag is disabled");
            return false;
        } else if (zzfil.zzb()) {
            return true;
        } else {
            zzfil.zza(context);
            return zzfil.zzb();
        }
    }
}