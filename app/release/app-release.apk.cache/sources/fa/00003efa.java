package com.p7700g.p99005;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.consent_sdk.zzd;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* loaded from: classes3.dex */
public final class dn2 {

    /* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
    /* loaded from: classes3.dex */
    public interface a {
        void onConsentFormLoadFailure(@RecentlyNonNull cn2 cn2Var);
    }

    /* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
    /* loaded from: classes3.dex */
    public interface b {
        void onConsentFormLoadSuccess(@RecentlyNonNull zm2 zm2Var);
    }

    private dn2() {
    }

    @RecentlyNonNull
    public static an2 a(@RecentlyNonNull Context context) {
        return zzd.zza(context).zzb();
    }

    public static void b(@RecentlyNonNull Context context, @RecentlyNonNull b bVar, @RecentlyNonNull a aVar) {
        zzd.zza(context).zzc().zza(bVar, aVar);
    }
}