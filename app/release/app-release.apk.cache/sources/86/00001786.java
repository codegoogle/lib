package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbdm;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbnm;
import com.google.android.gms.internal.ads.zzbno;
import com.google.android.gms.internal.ads.zzbwv;
import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzcfo;
import com.google.android.gms.internal.ads.zzcli;
import com.google.android.gms.internal.ads.zzclu;
import com.google.android.gms.internal.ads.zzcmt;
import com.google.android.gms.internal.ads.zzcmv;
import com.google.android.gms.internal.ads.zzcmx;
import com.google.android.gms.internal.ads.zzdcg;
import com.google.android.gms.internal.ads.zzdjg;
import com.google.android.gms.internal.ads.zzefa;
import com.google.android.gms.internal.ads.zzfnw;
import com.p7700g.p99005.oq;
import com.p7700g.p99005.sr;
import com.p7700g.p99005.tm4;
import com.p7700g.p99005.z1;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public class zzl extends zzbxu implements zzaa {
    @VisibleForTesting
    public static final int zza = Color.argb(0, 0, 0, 0);
    public final Activity zzb;
    @VisibleForTesting
    @z1
    public AdOverlayInfoParcel zzc;
    @VisibleForTesting
    public zzcli zzd;
    @VisibleForTesting
    public zzh zze;
    @VisibleForTesting
    public zzr zzf;
    @VisibleForTesting
    public FrameLayout zzh;
    @VisibleForTesting
    public WebChromeClient.CustomViewCallback zzi;
    @VisibleForTesting
    public zzg zzl;
    private Runnable zzp;
    private boolean zzq;
    private boolean zzr;
    @VisibleForTesting
    public boolean zzg = false;
    @VisibleForTesting
    public boolean zzj = false;
    @VisibleForTesting
    public boolean zzk = false;
    @VisibleForTesting
    public boolean zzm = false;
    @VisibleForTesting
    public int zzn = 1;
    private final Object zzo = new Object();
    private boolean zzs = false;
    private boolean zzt = false;
    private boolean zzu = true;

    public zzl(Activity activity) {
        this.zzb = activity;
    }

    private final void zzG(Configuration configuration) {
        com.google.android.gms.ads.internal.zzj zzjVar;
        com.google.android.gms.ads.internal.zzj zzjVar2;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = (adOverlayInfoParcel == null || (zzjVar2 = adOverlayInfoParcel.zzo) == null || !zzjVar2.zzb) ? false : true;
        boolean zze = com.google.android.gms.ads.internal.zzt.zzq().zze(this.zzb, configuration);
        if ((!this.zzk || z3) && !zze) {
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
            if (adOverlayInfoParcel2 != null && (zzjVar = adOverlayInfoParcel2.zzo) != null && zzjVar.zzg) {
                z2 = true;
            }
        } else {
            z = false;
        }
        Window window = this.zzb.getWindow();
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzaY)).booleanValue()) {
            window.getDecorView().setSystemUiVisibility(z ? z2 ? 5894 : 5380 : 256);
        } else if (z) {
            window.addFlags(1024);
            window.clearFlags(2048);
            if (z2) {
                window.getDecorView().setSystemUiVisibility(oq.l);
            }
        } else {
            window.addFlags(2048);
            window.clearFlags(1024);
        }
    }

    private static final void zzH(@z1 IObjectWrapper iObjectWrapper, @z1 View view) {
        if (iObjectWrapper == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzh().zzc(iObjectWrapper, view);
    }

    public final void zzA(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        FrameLayout frameLayout = new FrameLayout(this.zzb);
        this.zzh = frameLayout;
        frameLayout.setBackgroundColor(sr.t);
        this.zzh.addView(view, -1, -1);
        this.zzb.setContentView(this.zzh);
        this.zzr = true;
        this.zzi = customViewCallback;
        this.zzg = true;
    }

    public final void zzB(boolean z) throws zzf {
        if (!this.zzr) {
            this.zzb.requestWindowFeature(1);
        }
        Window window = this.zzb.getWindow();
        if (window != null) {
            zzcli zzcliVar = this.zzc.zzd;
            zzcmv zzP = zzcliVar != null ? zzcliVar.zzP() : null;
            boolean z2 = zzP != null && zzP.zzJ();
            this.zzm = false;
            if (z2) {
                int i = this.zzc.zzj;
                if (i == 6) {
                    r4 = this.zzb.getResources().getConfiguration().orientation == 1;
                    this.zzm = r4;
                } else if (i == 7) {
                    r4 = this.zzb.getResources().getConfiguration().orientation == 2;
                    this.zzm = r4;
                }
            }
            zzcfi.zze("Delay onShow to next orientation change: " + r4);
            zzy(this.zzc.zzj);
            window.setFlags(16777216, 16777216);
            zzcfi.zze("Hardware acceleration on the AdActivity window enabled.");
            if (!this.zzk) {
                this.zzl.setBackgroundColor(sr.t);
            } else {
                this.zzl.setBackgroundColor(zza);
            }
            this.zzb.setContentView(this.zzl);
            this.zzr = true;
            if (z) {
                try {
                    com.google.android.gms.ads.internal.zzt.zzz();
                    Activity activity = this.zzb;
                    zzcli zzcliVar2 = this.zzc.zzd;
                    zzcmx zzQ = zzcliVar2 != null ? zzcliVar2.zzQ() : null;
                    zzcli zzcliVar3 = this.zzc.zzd;
                    String zzU = zzcliVar3 != null ? zzcliVar3.zzU() : null;
                    AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
                    zzcfo zzcfoVar = adOverlayInfoParcel.zzm;
                    zzcli zzcliVar4 = adOverlayInfoParcel.zzd;
                    zzcli zza2 = zzclu.zza(activity, zzQ, zzU, true, z2, null, null, zzcfoVar, null, null, zzcliVar4 != null ? zzcliVar4.zzm() : null, zzbdm.zza(), null, null);
                    this.zzd = zza2;
                    zzcmv zzP2 = zza2.zzP();
                    AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
                    zzbnm zzbnmVar = adOverlayInfoParcel2.zzp;
                    zzbno zzbnoVar = adOverlayInfoParcel2.zze;
                    zzw zzwVar = adOverlayInfoParcel2.zzi;
                    zzcli zzcliVar5 = adOverlayInfoParcel2.zzd;
                    zzP2.zzL(null, zzbnmVar, null, zzbnoVar, zzwVar, true, null, zzcliVar5 != null ? zzcliVar5.zzP().zzd() : null, null, null, null, null, null, null, null, null);
                    this.zzd.zzP().zzz(new zzcmt() { // from class: com.google.android.gms.ads.internal.overlay.zzd
                        @Override // com.google.android.gms.internal.ads.zzcmt
                        public final void zza(boolean z3) {
                            zzcli zzcliVar6 = zzl.this.zzd;
                            if (zzcliVar6 != null) {
                                zzcliVar6.zzZ();
                            }
                        }
                    });
                    AdOverlayInfoParcel adOverlayInfoParcel3 = this.zzc;
                    String str = adOverlayInfoParcel3.zzl;
                    if (str != null) {
                        this.zzd.loadUrl(str);
                    } else {
                        String str2 = adOverlayInfoParcel3.zzh;
                        if (str2 != null) {
                            this.zzd.loadDataWithBaseURL(adOverlayInfoParcel3.zzf, str2, tm4.D, "UTF-8", null);
                        } else {
                            throw new zzf("No URL or HTML to display in ad overlay.");
                        }
                    }
                    zzcli zzcliVar6 = this.zzc.zzd;
                    if (zzcliVar6 != null) {
                        zzcliVar6.zzat(this);
                    }
                } catch (Exception e) {
                    zzcfi.zzh("Error obtaining webview.", e);
                    throw new zzf("Could not obtain webview for the overlay.");
                }
            } else {
                zzcli zzcliVar7 = this.zzc.zzd;
                this.zzd = zzcliVar7;
                zzcliVar7.zzam(this.zzb);
            }
            this.zzd.zzah(this);
            zzcli zzcliVar8 = this.zzc.zzd;
            if (zzcliVar8 != null) {
                zzH(zzcliVar8.zzS(), this.zzl);
            }
            if (this.zzc.zzk != 5) {
                ViewParent parent = this.zzd.getParent();
                if (parent != null && (parent instanceof ViewGroup)) {
                    ((ViewGroup) parent).removeView(this.zzd.zzH());
                }
                if (this.zzk) {
                    this.zzd.zzal();
                }
                this.zzl.addView(this.zzd.zzH(), -1, -1);
            }
            if (!z && !this.zzm) {
                zze();
            }
            AdOverlayInfoParcel adOverlayInfoParcel4 = this.zzc;
            if (adOverlayInfoParcel4.zzk != 5) {
                zzu(z2);
                if (this.zzd.zzay()) {
                    zzw(z2, true);
                    return;
                }
                return;
            }
            zzefa.zzh(this.zzb, this, adOverlayInfoParcel4.zzu, adOverlayInfoParcel4.zzr, adOverlayInfoParcel4.zzs, adOverlayInfoParcel4.zzt, adOverlayInfoParcel4.zzq, adOverlayInfoParcel4.zzv);
            return;
        }
        throw new zzf("Invalid activity, no window available.");
    }

    public final void zzC() {
        synchronized (this.zzo) {
            this.zzq = true;
            Runnable runnable = this.zzp;
            if (runnable != null) {
                zzfnw zzfnwVar = com.google.android.gms.ads.internal.util.zzs.zza;
                zzfnwVar.removeCallbacks(runnable);
                zzfnwVar.post(this.zzp);
            }
        }
    }

    public final void zzD() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        zzo zzoVar;
        if (!this.zzb.isFinishing() || this.zzs) {
            return;
        }
        this.zzs = true;
        zzcli zzcliVar = this.zzd;
        if (zzcliVar != null) {
            zzcliVar.zzY(this.zzn - 1);
            synchronized (this.zzo) {
                if (!this.zzq && this.zzd.zzaz()) {
                    if (((Boolean) zzay.zzc().zzb(zzbhz.zzdQ)).booleanValue() && !this.zzt && (adOverlayInfoParcel = this.zzc) != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
                        zzoVar.zzbC();
                    }
                    Runnable runnable = new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zze
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzl.this.zzc();
                        }
                    };
                    this.zzp = runnable;
                    com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(runnable, ((Long) zzay.zzc().zzb(zzbhz.zzaR)).longValue());
                    return;
                }
            }
        }
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzbxv
    public final boolean zzE() {
        this.zzn = 1;
        if (this.zzd == null) {
            return true;
        }
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzhv)).booleanValue() && this.zzd.canGoBack()) {
            this.zzd.goBack();
            return false;
        }
        boolean zzaE = this.zzd.zzaE();
        if (!zzaE) {
            this.zzd.zzd("onbackblocked", Collections.emptyMap());
        }
        return zzaE;
    }

    public final void zzb() {
        this.zzn = 3;
        this.zzb.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.zzk != 5) {
            return;
        }
        this.zzb.overridePendingTransition(0, 0);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzaa
    public final void zzbJ() {
        this.zzn = 2;
        this.zzb.finish();
    }

    @VisibleForTesting
    public final void zzc() {
        zzcli zzcliVar;
        zzo zzoVar;
        if (this.zzt) {
            return;
        }
        this.zzt = true;
        zzcli zzcliVar2 = this.zzd;
        if (zzcliVar2 != null) {
            this.zzl.removeView(zzcliVar2.zzH());
            zzh zzhVar = this.zze;
            if (zzhVar != null) {
                this.zzd.zzam(zzhVar.zzd);
                this.zzd.zzap(false);
                ViewGroup viewGroup = this.zze.zzc;
                View zzH = this.zzd.zzH();
                zzh zzhVar2 = this.zze;
                viewGroup.addView(zzH, zzhVar2.zza, zzhVar2.zzb);
                this.zze = null;
            } else if (this.zzb.getApplicationContext() != null) {
                this.zzd.zzam(this.zzb.getApplicationContext());
            }
            this.zzd = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
            zzoVar.zzf(this.zzn);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
        if (adOverlayInfoParcel2 == null || (zzcliVar = adOverlayInfoParcel2.zzd) == null) {
            return;
        }
        zzH(zzcliVar.zzS(), this.zzc.zzd.zzH());
    }

    public final void zzd() {
        this.zzl.zzb = true;
    }

    public final void zze() {
        this.zzd.zzZ();
    }

    public final void zzf() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && this.zzg) {
            zzy(adOverlayInfoParcel.zzj);
        }
        if (this.zzh != null) {
            this.zzb.setContentView(this.zzl);
            this.zzr = true;
            this.zzh.removeAllViews();
            this.zzh = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.zzi;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.zzi = null;
        }
        this.zzg = false;
    }

    @Override // com.google.android.gms.internal.ads.zzbxv
    public final void zzg(int i, int i2, Intent intent) {
    }

    @Override // com.google.android.gms.internal.ads.zzbxv
    public final void zzh() {
        this.zzn = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbxv
    public final void zzj(IObjectWrapper iObjectWrapper) {
        zzG((Configuration) ObjectWrapper.unwrap(iObjectWrapper));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0071 A[Catch: zzf -> 0x00f5, TryCatch #0 {zzf -> 0x00f5, blocks: (B:9:0x0017, B:11:0x0025, B:13:0x002e, B:14:0x0030, B:16:0x0038, B:17:0x0046, B:19:0x004d, B:25:0x005a, B:27:0x005e, B:29:0x0063, B:32:0x0071, B:34:0x0075, B:36:0x007b, B:37:0x007e, B:39:0x0084, B:40:0x0087, B:42:0x008d, B:44:0x0091, B:45:0x0094, B:47:0x009a, B:48:0x009d, B:55:0x00cc, B:57:0x00d0, B:58:0x00d7, B:59:0x00d8, B:61:0x00dc, B:63:0x00e9, B:22:0x0054, B:24:0x0058, B:30:0x006d, B:65:0x00ed, B:66:0x00f4), top: B:70:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e9 A[Catch: zzf -> 0x00f5, TryCatch #0 {zzf -> 0x00f5, blocks: (B:9:0x0017, B:11:0x0025, B:13:0x002e, B:14:0x0030, B:16:0x0038, B:17:0x0046, B:19:0x004d, B:25:0x005a, B:27:0x005e, B:29:0x0063, B:32:0x0071, B:34:0x0075, B:36:0x007b, B:37:0x007e, B:39:0x0084, B:40:0x0087, B:42:0x008d, B:44:0x0091, B:45:0x0094, B:47:0x009a, B:48:0x009d, B:55:0x00cc, B:57:0x00d0, B:58:0x00d7, B:59:0x00d8, B:61:0x00dc, B:63:0x00e9, B:22:0x0054, B:24:0x0058, B:30:0x006d, B:65:0x00ed, B:66:0x00f4), top: B:70:0x0017 }] */
    @Override // com.google.android.gms.internal.ads.zzbxv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void zzk(Bundle bundle) {
        int i;
        this.zzb.requestWindowFeature(1);
        this.zzj = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            AdOverlayInfoParcel zza2 = AdOverlayInfoParcel.zza(this.zzb.getIntent());
            this.zzc = zza2;
            if (zza2 != null) {
                if (zza2.zzm.zzc > 7500000) {
                    this.zzn = 4;
                }
                if (this.zzb.getIntent() != null) {
                    this.zzu = this.zzb.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
                }
                AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
                com.google.android.gms.ads.internal.zzj zzjVar = adOverlayInfoParcel.zzo;
                if (zzjVar == null) {
                    if (adOverlayInfoParcel.zzk == 5) {
                        this.zzk = true;
                        if (adOverlayInfoParcel.zzk != 5) {
                            new zzk(this, null).zzb();
                        }
                        if (bundle == null) {
                        }
                        Activity activity = this.zzb;
                        AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
                        zzg zzgVar = new zzg(activity, adOverlayInfoParcel2.zzn, adOverlayInfoParcel2.zzm.zza, adOverlayInfoParcel2.zzw);
                        this.zzl = zzgVar;
                        zzgVar.setId(1000);
                        com.google.android.gms.ads.internal.zzt.zzq().zzj(this.zzb);
                        AdOverlayInfoParcel adOverlayInfoParcel3 = this.zzc;
                        i = adOverlayInfoParcel3.zzk;
                        if (i == 1) {
                        }
                    } else {
                        this.zzk = false;
                        if (bundle == null) {
                        }
                        Activity activity2 = this.zzb;
                        AdOverlayInfoParcel adOverlayInfoParcel22 = this.zzc;
                        zzg zzgVar2 = new zzg(activity2, adOverlayInfoParcel22.zzn, adOverlayInfoParcel22.zzm.zza, adOverlayInfoParcel22.zzw);
                        this.zzl = zzgVar2;
                        zzgVar2.setId(1000);
                        com.google.android.gms.ads.internal.zzt.zzq().zzj(this.zzb);
                        AdOverlayInfoParcel adOverlayInfoParcel32 = this.zzc;
                        i = adOverlayInfoParcel32.zzk;
                        if (i == 1) {
                        }
                    }
                } else {
                    boolean z = zzjVar.zza;
                    this.zzk = z;
                    if (z) {
                        if (adOverlayInfoParcel.zzk != 5 && zzjVar.zzf != -1) {
                            new zzk(this, null).zzb();
                        }
                    }
                    if (bundle == null) {
                        if (this.zzu) {
                            zzdcg zzdcgVar = this.zzc.zzx;
                            if (zzdcgVar != null) {
                                zzdcgVar.zzd();
                            }
                            zzo zzoVar = this.zzc.zzc;
                            if (zzoVar != null) {
                                zzoVar.zzb();
                            }
                        }
                        AdOverlayInfoParcel adOverlayInfoParcel4 = this.zzc;
                        if (adOverlayInfoParcel4.zzk != 1) {
                            com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel4.zzb;
                            if (zzaVar != null) {
                                zzaVar.onAdClicked();
                            }
                            zzdjg zzdjgVar = this.zzc.zzy;
                            if (zzdjgVar != null) {
                                zzdjgVar.zzq();
                            }
                        }
                    }
                    Activity activity22 = this.zzb;
                    AdOverlayInfoParcel adOverlayInfoParcel222 = this.zzc;
                    zzg zzgVar22 = new zzg(activity22, adOverlayInfoParcel222.zzn, adOverlayInfoParcel222.zzm.zza, adOverlayInfoParcel222.zzw);
                    this.zzl = zzgVar22;
                    zzgVar22.setId(1000);
                    com.google.android.gms.ads.internal.zzt.zzq().zzj(this.zzb);
                    AdOverlayInfoParcel adOverlayInfoParcel322 = this.zzc;
                    i = adOverlayInfoParcel322.zzk;
                    if (i == 1) {
                        zzB(false);
                    } else if (i == 2) {
                        this.zze = new zzh(adOverlayInfoParcel322.zzd);
                        zzB(false);
                    } else if (i == 3) {
                        zzB(true);
                    } else if (i == 5) {
                        zzB(false);
                    } else {
                        throw new zzf("Could not determine ad overlay type.");
                    }
                }
            } else {
                throw new zzf("Could not get info for ad overlay.");
            }
        } catch (zzf e) {
            zzcfi.zzj(e.getMessage());
            this.zzn = 4;
            this.zzb.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxv
    public final void zzl() {
        zzcli zzcliVar = this.zzd;
        if (zzcliVar != null) {
            try {
                this.zzl.removeView(zzcliVar.zzH());
            } catch (NullPointerException unused) {
            }
        }
        zzD();
    }

    public final void zzm() {
        if (this.zzm) {
            this.zzm = false;
            zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxv
    public final void zzn() {
        zzo zzoVar;
        zzf();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
            zzoVar.zzbr();
        }
        if (!((Boolean) zzay.zzc().zzb(zzbhz.zzdS)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzbxv
    public final void zzo() {
    }

    @Override // com.google.android.gms.internal.ads.zzbxv
    public final void zzp() {
        zzo zzoVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
            zzoVar.zzbK();
        }
        zzG(this.zzb.getResources().getConfiguration());
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzdS)).booleanValue()) {
            return;
        }
        zzcli zzcliVar = this.zzd;
        if (zzcliVar != null && !zzcliVar.zzaB()) {
            this.zzd.onResume();
        } else {
            zzcfi.zzj("The webview does not exist. Ignoring action.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxv
    public final void zzq(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzbxv
    public final void zzr() {
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzdS)).booleanValue()) {
            zzcli zzcliVar = this.zzd;
            if (zzcliVar != null && !zzcliVar.zzaB()) {
                this.zzd.onResume();
            } else {
                zzcfi.zzj("The webview does not exist. Ignoring action.");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxv
    public final void zzs() {
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzdS)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzbxv
    public final void zzt() {
        zzo zzoVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzoVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        zzoVar.zze();
    }

    public final void zzu(boolean z) {
        int intValue = ((Integer) zzay.zzc().zzb(zzbhz.zzdU)).intValue();
        boolean z2 = ((Boolean) zzay.zzc().zzb(zzbhz.zzaU)).booleanValue() || z;
        zzq zzqVar = new zzq();
        zzqVar.zzd = 50;
        zzqVar.zza = true != z2 ? 0 : intValue;
        zzqVar.zzb = true != z2 ? intValue : 0;
        zzqVar.zzc = intValue;
        this.zzf = new zzr(this.zzb, zzqVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z2 ? 9 : 11);
        zzw(z, this.zzc.zzg);
        this.zzl.addView(this.zzf, layoutParams);
    }

    @Override // com.google.android.gms.internal.ads.zzbxv
    public final void zzv() {
        this.zzr = true;
    }

    public final void zzw(boolean z, boolean z2) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        com.google.android.gms.ads.internal.zzj zzjVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        com.google.android.gms.ads.internal.zzj zzjVar2;
        boolean z3 = true;
        boolean z4 = ((Boolean) zzay.zzc().zzb(zzbhz.zzaS)).booleanValue() && (adOverlayInfoParcel2 = this.zzc) != null && (zzjVar2 = adOverlayInfoParcel2.zzo) != null && zzjVar2.zzh;
        boolean z5 = ((Boolean) zzay.zzc().zzb(zzbhz.zzaT)).booleanValue() && (adOverlayInfoParcel = this.zzc) != null && (zzjVar = adOverlayInfoParcel.zzo) != null && zzjVar.zzi;
        if (z && z2 && z4 && !z5) {
            new zzbwv(this.zzd, "useCustomClose").zzg("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        zzr zzrVar = this.zzf;
        if (zzrVar != null) {
            if (!z5 && (!z2 || z4)) {
                z3 = false;
            }
            zzrVar.zzb(z3);
        }
    }

    public final void zzx() {
        this.zzl.removeView(this.zzf);
        zzu(true);
    }

    public final void zzy(int i) {
        if (this.zzb.getApplicationInfo().targetSdkVersion >= ((Integer) zzay.zzc().zzb(zzbhz.zzeV)).intValue()) {
            if (this.zzb.getApplicationInfo().targetSdkVersion <= ((Integer) zzay.zzc().zzb(zzbhz.zzeW)).intValue()) {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= ((Integer) zzay.zzc().zzb(zzbhz.zzeX)).intValue()) {
                    if (i2 <= ((Integer) zzay.zzc().zzb(zzbhz.zzeY)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.zzb.setRequestedOrientation(i);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzo().zzs(th, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void zzz(boolean z) {
        if (z) {
            this.zzl.setBackgroundColor(0);
        } else {
            this.zzl.setBackgroundColor(sr.t);
        }
    }
}