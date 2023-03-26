package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaqc extends zzaqn {
    public zzaqc(zzapc zzapcVar, String str, String str2, zzali zzaliVar, int i, int i2) {
        super(zzapcVar, "sQRnRw5AtmLjG4zPuRRzbU9KCNWkvhkIESw7dU0UKjciZOTbDwuGbxSLRs8Rwqdx", "QTFg2pa0CDlg9dgYpioKGLNjWwgLSvJpA082RZAjjog=", zzaliVar, i, 73);
    }

    @Override // com.google.android.gms.internal.ads.zzaqn
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        try {
            int i = 1;
            boolean booleanValue = ((Boolean) this.zzf.invoke(null, this.zzb.zzb())).booleanValue();
            zzali zzaliVar = this.zze;
            if (true == booleanValue) {
                i = 2;
            }
            zzaliVar.zzad(i);
        } catch (InvocationTargetException unused) {
            this.zze.zzad(3);
        }
    }
}