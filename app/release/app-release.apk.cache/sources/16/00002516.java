package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdpa {
    private final zzdtp zza;
    private final zzdse zzb;
    private ViewTreeObserver.OnScrollChangedListener zzc = null;

    public zzdpa(zzdtp zzdtpVar, zzdse zzdseVar) {
        this.zza = zzdtpVar;
        this.zzb = zzdseVar;
    }

    private static final int zzf(Context context, String str, int i) {
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        com.google.android.gms.ads.internal.client.zzaw.zzb();
        return zzcfb.zzw(context, i);
    }

    public final View zza(@x1 final View view, @x1 final WindowManager windowManager) throws zzclt {
        zzcli zza = this.zza.zza(com.google.android.gms.ads.internal.client.zzq.zzc(), null, null);
        View view2 = (View) zza;
        view2.setVisibility(4);
        view2.setContentDescription("policy_validator");
        zza.zzaf("/sendMessageToSdk", new zzbom() { // from class: com.google.android.gms.internal.ads.zzdow
            @Override // com.google.android.gms.internal.ads.zzbom
            public final void zza(Object obj, Map map) {
                zzdpa.this.zzb((zzcli) obj, map);
            }
        });
        zza.zzaf("/hideValidatorOverlay", new zzbom() { // from class: com.google.android.gms.internal.ads.zzdox
            @Override // com.google.android.gms.internal.ads.zzbom
            public final void zza(Object obj, Map map) {
                zzdpa.this.zzc(windowManager, view, (zzcli) obj, map);
            }
        });
        zza.zzaf("/open", new zzbox(null, null, null, null, null));
        this.zzb.zzj(new WeakReference(zza), "/loadNativeAdPolicyViolations", new zzbom() { // from class: com.google.android.gms.internal.ads.zzdoy
            @Override // com.google.android.gms.internal.ads.zzbom
            public final void zza(Object obj, Map map) {
                zzdpa.this.zze(view, windowManager, (zzcli) obj, map);
            }
        });
        this.zzb.zzj(new WeakReference(zza), "/showValidatorOverlay", zzdoz.zza);
        return (View) zza;
    }

    public final /* synthetic */ void zzb(zzcli zzcliVar, Map map) {
        this.zzb.zzg("sendMessageToNativeJs", map);
    }

    public final /* synthetic */ void zzc(WindowManager windowManager, View view, zzcli zzcliVar, Map map) {
        zzcfi.zze("Hide native ad policy validator overlay.");
        zzcliVar.zzH().setVisibility(8);
        if (zzcliVar.zzH().getWindowToken() != null) {
            windowManager.removeView(zzcliVar.zzH());
        }
        zzcliVar.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.zzc == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.removeOnScrollChangedListener(this.zzc);
    }

    public final /* synthetic */ void zzd(Map map, boolean z) {
        HashMap R = wo1.R("messageType", "validatorHtmlLoaded");
        R.put("id", (String) map.get("id"));
        this.zzb.zzg("sendMessageToNativeJs", R);
    }

    public final /* synthetic */ void zze(final View view, final WindowManager windowManager, final zzcli zzcliVar, final Map map) {
        int i;
        zzcliVar.zzP().zzz(new zzcmt() { // from class: com.google.android.gms.internal.ads.zzdou
            @Override // com.google.android.gms.internal.ads.zzcmt
            public final void zza(boolean z) {
                zzdpa.this.zzd(map, z);
            }
        });
        if (map == null) {
            return;
        }
        Context context = view.getContext();
        int zzf = zzf(context, (String) map.get("validator_width"), ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzgL)).intValue());
        int zzf2 = zzf(context, (String) map.get("validator_height"), ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzgM)).intValue());
        int zzf3 = zzf(context, (String) map.get("validator_x"), 0);
        int zzf4 = zzf(context, (String) map.get("validator_y"), 0);
        zzcliVar.zzai(zzcmx.zzb(zzf, zzf2));
        try {
            zzcliVar.zzI().getSettings().setUseWideViewPort(((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzgN)).booleanValue());
            zzcliVar.zzI().getSettings().setLoadWithOverviewMode(((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzgO)).booleanValue());
        } catch (NullPointerException unused) {
        }
        final WindowManager.LayoutParams zzb = com.google.android.gms.ads.internal.util.zzbx.zzb();
        zzb.x = zzf3;
        zzb.y = zzf4;
        windowManager.updateViewLayout(zzcliVar.zzH(), zzb);
        final String str = (String) map.get("orientation");
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            if (!"1".equals(str) && !"2".equals(str)) {
                i = rect.top;
            } else {
                i = rect.bottom;
            }
            final int i2 = i - zzf4;
            this.zzc = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.gms.internal.ads.zzdov
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    View view2 = view;
                    zzcli zzcliVar2 = zzcliVar;
                    String str2 = str;
                    WindowManager.LayoutParams layoutParams = zzb;
                    int i3 = i2;
                    WindowManager windowManager2 = windowManager;
                    Rect rect2 = new Rect();
                    if (!view2.getGlobalVisibleRect(rect2) || zzcliVar2.zzH().getWindowToken() == null) {
                        return;
                    }
                    if (!"1".equals(str2) && !"2".equals(str2)) {
                        layoutParams.y = rect2.top - i3;
                    } else {
                        layoutParams.y = rect2.bottom - i3;
                    }
                    windowManager2.updateViewLayout(zzcliVar2.zzH(), layoutParams);
                }
            };
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnScrollChangedListener(this.zzc);
            }
        }
        String str2 = (String) map.get("overlay_url");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        zzcliVar.loadUrl(str2);
    }
}