package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.p7700g.p99005.ck3;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzfh implements zzfov {
    public static final /* synthetic */ zzfh zza = new zzfh();

    private /* synthetic */ zzfh() {
    }

    @Override // com.google.android.gms.internal.ads.zzfov
    public final boolean zza(Object obj) {
        String str = (String) obj;
        if (str == null) {
            return false;
        }
        String zza2 = zzfoc.zza(str);
        if (TextUtils.isEmpty(zza2)) {
            return false;
        }
        return ((zza2.contains("text") && !zza2.contains("text/vtt")) || zza2.contains(ck3.a) || zza2.contains("xml")) ? false : true;
    }
}