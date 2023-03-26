package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzapn extends zzaqn {
    public zzapn(zzapc zzapcVar, String str, String str2, zzali zzaliVar, int i, int i2) {
        super(zzapcVar, "HKJ68+GFVOzzlXIErXZFscWEuic4IS+F1/JC4SL0ZBjl5Wpepiw6AwYzzVdq4ZK/", "QnEQ5Lj6VZj+ZyIvg9+5D3/xHwfXHkc5MHdc8LLlnMs=", zzaliVar, i, 49);
    }

    @Override // com.google.android.gms.internal.ads.zzaqn
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzZ(3);
        try {
            int i = 1;
            boolean booleanValue = ((Boolean) this.zzf.invoke(null, this.zzb.zzb())).booleanValue();
            zzali zzaliVar = this.zze;
            if (true == booleanValue) {
                i = 2;
            }
            zzaliVar.zzZ(i);
        } catch (InvocationTargetException e) {
            if (!(e.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e;
            }
        }
    }
}