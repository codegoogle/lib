package com.google.android.gms.internal.ads;

import android.os.Environment;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzbhi implements Callable {
    public static final /* synthetic */ zzbhi zza = new zzbhi();

    private /* synthetic */ zzbhi() {
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Boolean.valueOf("mounted".equals(Environment.getExternalStorageState()));
    }
}