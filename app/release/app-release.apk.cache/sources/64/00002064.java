package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.google.android.gms.common.util.CollectionUtils;
import com.p7700g.p99005.vn3;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbwp extends zzbwv {
    public static final Set zza = CollectionUtils.setOf("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
    private String zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private final Object zzj;
    private final zzcli zzk;
    private final Activity zzl;
    private zzcmx zzm;
    private ImageView zzn;
    private LinearLayout zzo;
    private final zzbww zzp;
    private PopupWindow zzq;
    private RelativeLayout zzr;
    private ViewGroup zzs;

    public zzbwp(zzcli zzcliVar, zzbww zzbwwVar) {
        super(zzcliVar, vn3.k.h);
        this.zzb = "top-right";
        this.zzc = true;
        this.zzd = 0;
        this.zze = 0;
        this.zzf = -1;
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = -1;
        this.zzj = new Object();
        this.zzk = zzcliVar;
        this.zzl = zzcliVar.zzk();
        this.zzp = zzbwwVar;
    }

    public final void zza(boolean z) {
        synchronized (this.zzj) {
            PopupWindow popupWindow = this.zzq;
            if (popupWindow != null) {
                popupWindow.dismiss();
                this.zzr.removeView((View) this.zzk);
                ViewGroup viewGroup = this.zzs;
                if (viewGroup != null) {
                    viewGroup.removeView(this.zzn);
                    this.zzs.addView((View) this.zzk);
                    this.zzk.zzai(this.zzm);
                }
                if (z) {
                    zzk("default");
                    zzbww zzbwwVar = this.zzp;
                    if (zzbwwVar != null) {
                        zzbwwVar.zzb();
                    }
                }
                this.zzq = null;
                this.zzr = null;
                this.zzs = null;
                this.zzo = null;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0257 A[Catch: all -> 0x047d, TryCatch #1 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:9:0x0012, B:11:0x001a, B:12:0x001f, B:14:0x0021, B:16:0x002d, B:17:0x0032, B:19:0x0034, B:21:0x003c, B:23:0x004a, B:24:0x005b, B:26:0x0069, B:27:0x007a, B:29:0x0088, B:30:0x0099, B:32:0x00a7, B:33:0x00b8, B:35:0x00c6, B:36:0x00d4, B:38:0x00e2, B:39:0x00e4, B:41:0x00e8, B:43:0x00ec, B:45:0x00f4, B:48:0x00fc, B:52:0x0122, B:58:0x012e, B:126:0x0257, B:127:0x025c, B:129:0x025e, B:131:0x027e, B:133:0x0282, B:135:0x028f, B:137:0x02cb, B:169:0x0384, B:176:0x03b3, B:177:0x03cb, B:178:0x03ec, B:180:0x03f4, B:181:0x03fb, B:182:0x0422, B:185:0x0425, B:187:0x044a, B:188:0x045f, B:170:0x038b, B:171:0x0392, B:172:0x0399, B:173:0x03a0, B:174:0x03a6, B:175:0x03ad, B:136:0x02c8, B:190:0x0461, B:191:0x0466, B:59:0x0135, B:61:0x0139, B:89:0x018c, B:97:0x01dc, B:99:0x01e7, B:101:0x01ea, B:103:0x01ed, B:105:0x01f1, B:108:0x01f7, B:90:0x0197, B:92:0x01ad, B:94:0x01b8, B:91:0x01a2, B:93:0x01b0, B:95:0x01bd, B:96:0x01d1, B:98:0x01df, B:109:0x0208, B:115:0x0232, B:121:0x0242, B:118:0x0238, B:120:0x0240, B:112:0x022a, B:114:0x0230, B:122:0x0249, B:123:0x024f, B:193:0x0468, B:194:0x046d, B:196:0x046f, B:197:0x0474, B:199:0x0476, B:200:0x047b), top: B:207:0x0007, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x025e A[Catch: all -> 0x047d, TryCatch #1 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:9:0x0012, B:11:0x001a, B:12:0x001f, B:14:0x0021, B:16:0x002d, B:17:0x0032, B:19:0x0034, B:21:0x003c, B:23:0x004a, B:24:0x005b, B:26:0x0069, B:27:0x007a, B:29:0x0088, B:30:0x0099, B:32:0x00a7, B:33:0x00b8, B:35:0x00c6, B:36:0x00d4, B:38:0x00e2, B:39:0x00e4, B:41:0x00e8, B:43:0x00ec, B:45:0x00f4, B:48:0x00fc, B:52:0x0122, B:58:0x012e, B:126:0x0257, B:127:0x025c, B:129:0x025e, B:131:0x027e, B:133:0x0282, B:135:0x028f, B:137:0x02cb, B:169:0x0384, B:176:0x03b3, B:177:0x03cb, B:178:0x03ec, B:180:0x03f4, B:181:0x03fb, B:182:0x0422, B:185:0x0425, B:187:0x044a, B:188:0x045f, B:170:0x038b, B:171:0x0392, B:172:0x0399, B:173:0x03a0, B:174:0x03a6, B:175:0x03ad, B:136:0x02c8, B:190:0x0461, B:191:0x0466, B:59:0x0135, B:61:0x0139, B:89:0x018c, B:97:0x01dc, B:99:0x01e7, B:101:0x01ea, B:103:0x01ed, B:105:0x01f1, B:108:0x01f7, B:90:0x0197, B:92:0x01ad, B:94:0x01b8, B:91:0x01a2, B:93:0x01b0, B:95:0x01bd, B:96:0x01d1, B:98:0x01df, B:109:0x0208, B:115:0x0232, B:121:0x0242, B:118:0x0238, B:120:0x0240, B:112:0x022a, B:114:0x0230, B:122:0x0249, B:123:0x024f, B:193:0x0468, B:194:0x046d, B:196:0x046f, B:197:0x0474, B:199:0x0476, B:200:0x047b), top: B:207:0x0007, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzb(Map map) {
        int[] iArr;
        char c;
        char c2;
        int i;
        int i2;
        int i3;
        int i4;
        synchronized (this.zzj) {
            if (this.zzl == null) {
                zzg("Not an activity context. Cannot resize.");
            } else if (this.zzk.zzQ() == null) {
                zzg("Webview is not yet available, size is not set.");
            } else if (this.zzk.zzQ().zzi()) {
                zzg("Is interstitial. Cannot resize an interstitial.");
            } else if (!this.zzk.zzaC()) {
                if (!TextUtils.isEmpty((CharSequence) map.get("width"))) {
                    com.google.android.gms.ads.internal.zzt.zzp();
                    this.zzi = com.google.android.gms.ads.internal.util.zzs.zzJ((String) map.get("width"));
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("height"))) {
                    com.google.android.gms.ads.internal.zzt.zzp();
                    this.zzf = com.google.android.gms.ads.internal.util.zzs.zzJ((String) map.get("height"));
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("offsetX"))) {
                    com.google.android.gms.ads.internal.zzt.zzp();
                    this.zzg = com.google.android.gms.ads.internal.util.zzs.zzJ((String) map.get("offsetX"));
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("offsetY"))) {
                    com.google.android.gms.ads.internal.zzt.zzp();
                    this.zzh = com.google.android.gms.ads.internal.util.zzs.zzJ((String) map.get("offsetY"));
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("allowOffscreen"))) {
                    this.zzc = Boolean.parseBoolean((String) map.get("allowOffscreen"));
                }
                String str = (String) map.get("customClosePosition");
                if (!TextUtils.isEmpty(str)) {
                    this.zzb = str;
                }
                if (this.zzi >= 0 && this.zzf >= 0) {
                    Window window = this.zzl.getWindow();
                    if (window != null && window.getDecorView() != null) {
                        com.google.android.gms.ads.internal.zzt.zzp();
                        int[] zzQ = com.google.android.gms.ads.internal.util.zzs.zzQ(this.zzl);
                        com.google.android.gms.ads.internal.zzt.zzp();
                        int[] zzN = com.google.android.gms.ads.internal.util.zzs.zzN(this.zzl);
                        int i5 = zzQ[0];
                        int i6 = zzQ[1];
                        int i7 = this.zzi;
                        if (i7 >= 50 && i7 <= i5) {
                            int i8 = this.zzf;
                            if (i8 >= 50 && i8 <= i6) {
                                if (i8 != i6 || i7 != i5) {
                                    if (this.zzc) {
                                        String str2 = this.zzb;
                                        switch (str2.hashCode()) {
                                            case -1364013995:
                                                if (str2.equals("center")) {
                                                    c2 = 2;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case -1012429441:
                                                if (str2.equals("top-left")) {
                                                    c2 = 0;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case -655373719:
                                                if (str2.equals("bottom-left")) {
                                                    c2 = 3;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case 1163912186:
                                                if (str2.equals("bottom-right")) {
                                                    c2 = 5;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case 1288627767:
                                                if (str2.equals("bottom-center")) {
                                                    c2 = 4;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case 1755462605:
                                                if (str2.equals("top-center")) {
                                                    c2 = 1;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            default:
                                                c2 = 65535;
                                                break;
                                        }
                                        if (c2 == 0) {
                                            i = this.zzd + this.zzg;
                                            i2 = this.zze;
                                        } else if (c2 != 1) {
                                            if (c2 != 2) {
                                                if (c2 == 3) {
                                                    i = this.zzd + this.zzg;
                                                    i4 = this.zze;
                                                } else if (c2 == 4) {
                                                    i = ((this.zzd + this.zzg) + (i7 >> 1)) - 25;
                                                    i4 = this.zze;
                                                } else if (c2 != 5) {
                                                    i = ((this.zzd + this.zzg) + i7) - 50;
                                                    i2 = this.zze;
                                                } else {
                                                    i = ((this.zzd + this.zzg) + i7) - 50;
                                                    i4 = this.zze;
                                                }
                                                i3 = ((i4 + this.zzh) + i8) - 50;
                                            } else {
                                                i = ((this.zzd + this.zzg) + (i7 >> 1)) - 25;
                                                i3 = ((this.zze + this.zzh) + (i8 >> 1)) - 25;
                                            }
                                            if (i >= 0 && i + 50 <= i5 && i3 >= zzN[0] && i3 + 50 <= zzN[1]) {
                                                iArr = new int[]{this.zzd + this.zzg, this.zze + this.zzh};
                                            }
                                        } else {
                                            i = ((this.zzd + this.zzg) + (i7 >> 1)) - 25;
                                            i2 = this.zze;
                                        }
                                        i3 = i2 + this.zzh;
                                        if (i >= 0) {
                                            iArr = new int[]{this.zzd + this.zzg, this.zze + this.zzh};
                                        }
                                    } else {
                                        com.google.android.gms.ads.internal.zzt.zzp();
                                        int[] zzQ2 = com.google.android.gms.ads.internal.util.zzs.zzQ(this.zzl);
                                        com.google.android.gms.ads.internal.zzt.zzp();
                                        int[] zzN2 = com.google.android.gms.ads.internal.util.zzs.zzN(this.zzl);
                                        int i9 = zzQ2[0];
                                        int i10 = this.zzd + this.zzg;
                                        int i11 = this.zze + this.zzh;
                                        if (i10 < 0) {
                                            i10 = 0;
                                        } else {
                                            int i12 = this.zzi;
                                            if (i10 + i12 > i9) {
                                                i10 = i9 - i12;
                                            }
                                        }
                                        int i13 = zzN2[0];
                                        if (i11 < i13) {
                                            i11 = i13;
                                        } else {
                                            int i14 = this.zzf;
                                            int i15 = i11 + i14;
                                            int i16 = zzN2[1];
                                            if (i15 > i16) {
                                                i11 = i16 - i14;
                                            }
                                        }
                                        iArr = new int[]{i10, i11};
                                    }
                                    if (iArr != null) {
                                        zzg("Resize location out of screen or close button is not visible.");
                                        return;
                                    }
                                    com.google.android.gms.ads.internal.client.zzaw.zzb();
                                    int zzw = zzcfb.zzw(this.zzl, this.zzi);
                                    com.google.android.gms.ads.internal.client.zzaw.zzb();
                                    int zzw2 = zzcfb.zzw(this.zzl, this.zzf);
                                    ViewParent parent = ((View) this.zzk).getParent();
                                    if (parent != null && (parent instanceof ViewGroup)) {
                                        ViewGroup viewGroup = (ViewGroup) parent;
                                        viewGroup.removeView((View) this.zzk);
                                        PopupWindow popupWindow = this.zzq;
                                        if (popupWindow == null) {
                                            this.zzs = viewGroup;
                                            com.google.android.gms.ads.internal.zzt.zzp();
                                            zzcli zzcliVar = this.zzk;
                                            ((View) zzcliVar).setDrawingCacheEnabled(true);
                                            Bitmap createBitmap = Bitmap.createBitmap(((View) zzcliVar).getDrawingCache());
                                            ((View) zzcliVar).setDrawingCacheEnabled(false);
                                            ImageView imageView = new ImageView(this.zzl);
                                            this.zzn = imageView;
                                            imageView.setImageBitmap(createBitmap);
                                            this.zzm = this.zzk.zzQ();
                                            this.zzs.addView(this.zzn);
                                        } else {
                                            popupWindow.dismiss();
                                        }
                                        RelativeLayout relativeLayout = new RelativeLayout(this.zzl);
                                        this.zzr = relativeLayout;
                                        relativeLayout.setBackgroundColor(0);
                                        this.zzr.setLayoutParams(new ViewGroup.LayoutParams(zzw, zzw2));
                                        com.google.android.gms.ads.internal.zzt.zzp();
                                        PopupWindow popupWindow2 = new PopupWindow((View) this.zzr, zzw, zzw2, false);
                                        this.zzq = popupWindow2;
                                        popupWindow2.setOutsideTouchable(false);
                                        this.zzq.setTouchable(true);
                                        this.zzq.setClippingEnabled(!this.zzc);
                                        this.zzr.addView((View) this.zzk, -1, -1);
                                        this.zzo = new LinearLayout(this.zzl);
                                        com.google.android.gms.ads.internal.client.zzaw.zzb();
                                        int zzw3 = zzcfb.zzw(this.zzl, 50);
                                        com.google.android.gms.ads.internal.client.zzaw.zzb();
                                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(zzw3, zzcfb.zzw(this.zzl, 50));
                                        String str3 = this.zzb;
                                        switch (str3.hashCode()) {
                                            case -1364013995:
                                                if (str3.equals("center")) {
                                                    c = 2;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -1012429441:
                                                if (str3.equals("top-left")) {
                                                    c = 0;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -655373719:
                                                if (str3.equals("bottom-left")) {
                                                    c = 3;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 1163912186:
                                                if (str3.equals("bottom-right")) {
                                                    c = 5;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 1288627767:
                                                if (str3.equals("bottom-center")) {
                                                    c = 4;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 1755462605:
                                                if (str3.equals("top-center")) {
                                                    c = 1;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            default:
                                                c = 65535;
                                                break;
                                        }
                                        if (c == 0) {
                                            layoutParams.addRule(10);
                                            layoutParams.addRule(9);
                                        } else if (c == 1) {
                                            layoutParams.addRule(10);
                                            layoutParams.addRule(14);
                                        } else if (c == 2) {
                                            layoutParams.addRule(13);
                                        } else if (c == 3) {
                                            layoutParams.addRule(12);
                                            layoutParams.addRule(9);
                                        } else if (c == 4) {
                                            layoutParams.addRule(12);
                                            layoutParams.addRule(14);
                                        } else if (c != 5) {
                                            layoutParams.addRule(10);
                                            layoutParams.addRule(11);
                                        } else {
                                            layoutParams.addRule(12);
                                            layoutParams.addRule(11);
                                        }
                                        this.zzo.setOnClickListener(new zzbwo(this));
                                        this.zzo.setContentDescription("Close button");
                                        this.zzr.addView(this.zzo, layoutParams);
                                        try {
                                            PopupWindow popupWindow3 = this.zzq;
                                            View decorView = window.getDecorView();
                                            com.google.android.gms.ads.internal.client.zzaw.zzb();
                                            int zzw4 = zzcfb.zzw(this.zzl, iArr[0]);
                                            com.google.android.gms.ads.internal.client.zzaw.zzb();
                                            popupWindow3.showAtLocation(decorView, 0, zzw4, zzcfb.zzw(this.zzl, iArr[1]));
                                            int i17 = iArr[0];
                                            int i18 = iArr[1];
                                            zzbww zzbwwVar = this.zzp;
                                            if (zzbwwVar != null) {
                                                zzbwwVar.zza(i17, i18, this.zzi, this.zzf);
                                            }
                                            this.zzk.zzai(zzcmx.zzb(zzw, zzw2));
                                            int i19 = iArr[0];
                                            int i20 = iArr[1];
                                            com.google.android.gms.ads.internal.zzt.zzp();
                                            zzj(i19, i20 - com.google.android.gms.ads.internal.util.zzs.zzN(this.zzl)[0], this.zzi, this.zzf);
                                            zzk(CallMraidJS.i);
                                            return;
                                        } catch (RuntimeException e) {
                                            zzg("Cannot show popup window: " + e.getMessage());
                                            this.zzr.removeView((View) this.zzk);
                                            ViewGroup viewGroup2 = this.zzs;
                                            if (viewGroup2 != null) {
                                                viewGroup2.removeView(this.zzn);
                                                this.zzs.addView((View) this.zzk);
                                                this.zzk.zzai(this.zzm);
                                            }
                                            return;
                                        }
                                    }
                                    zzg("Webview is detached, probably in the middle of a resize or expand.");
                                    return;
                                }
                                zzcfi.zzj("Cannot resize to a full-screen ad.");
                                iArr = null;
                                if (iArr != null) {
                                }
                            }
                            zzcfi.zzj("Height is too small or too large.");
                            iArr = null;
                            if (iArr != null) {
                            }
                        }
                        zzcfi.zzj("Width is too small or too large.");
                        iArr = null;
                        if (iArr != null) {
                        }
                    }
                    zzg("Activity context is not ready, cannot get window or decor view.");
                    return;
                }
                zzg("Invalid width and height options. Cannot resize.");
            } else {
                zzg("Cannot resize an expanded banner.");
            }
        }
    }

    public final void zzc(int i, int i2, boolean z) {
        synchronized (this.zzj) {
            this.zzd = i;
            this.zze = i2;
        }
    }

    public final void zzd(int i, int i2) {
        this.zzd = i;
        this.zze = i2;
    }

    public final boolean zze() {
        boolean z;
        synchronized (this.zzj) {
            z = this.zzq != null;
        }
        return z;
    }
}