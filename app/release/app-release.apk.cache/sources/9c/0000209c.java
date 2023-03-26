package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nonnull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbyr {
    @Nonnull
    private View zza;
    private final Map zzb = new HashMap();

    public final zzbyr zzb(View view) {
        this.zza = view;
        return this;
    }

    public final zzbyr zzc(Map map) {
        this.zzb.clear();
        for (Map.Entry entry : map.entrySet()) {
            View view = (View) entry.getValue();
            if (view != null) {
                this.zzb.put((String) entry.getKey(), new WeakReference(view));
            }
        }
        return this;
    }
}