package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.impl.R;
import com.p7700g.p99005.sm4;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbws extends zzbwv {
    private final Map zza;
    private final Context zzb;

    public zzbws(zzcli zzcliVar, Map map) {
        super(zzcliVar, "storePicture");
        this.zza = map;
        this.zzb = zzcliVar.zzk();
    }

    public final void zzb() {
        if (this.zzb == null) {
            zzg("Activity context is not available");
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        if (!new zzbhj(this.zzb).zzc()) {
            zzg("Feature is not supported by the device.");
            return;
        }
        String str = (String) this.zza.get("iurl");
        if (TextUtils.isEmpty(str)) {
            zzg("Image url cannot be empty.");
        } else if (URLUtil.isValidUrl(str)) {
            String lastPathSegment = Uri.parse(str).getLastPathSegment();
            com.google.android.gms.ads.internal.zzt.zzp();
            if (!TextUtils.isEmpty(lastPathSegment) && lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
                Resources zzd = com.google.android.gms.ads.internal.zzt.zzo().zzd();
                com.google.android.gms.ads.internal.zzt.zzp();
                AlertDialog.Builder builder = new AlertDialog.Builder(this.zzb);
                builder.setTitle(zzd != null ? zzd.getString(R.string.s1) : "Save image");
                builder.setMessage(zzd != null ? zzd.getString(R.string.s2) : "Allow Ad to store image in Picture gallery?");
                builder.setPositiveButton(zzd != null ? zzd.getString(R.string.s3) : sm4.a, new zzbwq(this, str, lastPathSegment));
                builder.setNegativeButton(zzd != null ? zzd.getString(R.string.s4) : "Decline", new zzbwr(this));
                builder.create().show();
                return;
            }
            zzg("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
        } else {
            zzg("Invalid image url: ".concat(String.valueOf(str)));
        }
    }
}