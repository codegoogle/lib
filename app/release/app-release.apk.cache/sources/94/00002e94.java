package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzps extends Handler {
    public final /* synthetic */ zzpu zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzps(zzpu zzpuVar, Looper looper) {
        super(looper);
        this.zza = zzpuVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        zzpu.zza(this.zza, message);
    }
}