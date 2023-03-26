package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzcfi;
import com.p7700g.p99005.ec0;
import com.p7700g.p99005.hb0;
import com.p7700g.p99005.ib0;
import com.p7700g.p99005.kb0;
import com.p7700g.p99005.kg;
import com.p7700g.p99005.ub0;
import com.p7700g.p99005.vb0;
import com.p7700g.p99005.x1;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class WorkManagerUtil extends zzbq {
    private static void zzb(Context context) {
        try {
            ec0.A(context.getApplicationContext(), new hb0.b().a());
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final void zze(@x1 IObjectWrapper iObjectWrapper) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzb(context);
        try {
            ec0 p = ec0.p(context);
            p.f("offline_ping_sender_work");
            p.j(new vb0.a(OfflinePingSender.class).i(new ib0.a().c(ub0.CONNECTED).b()).a("offline_ping_sender_work").b());
        } catch (IllegalStateException e) {
            zzcfi.zzk("Failed to instantiate WorkManager.", e);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final boolean zzf(@x1 IObjectWrapper iObjectWrapper, @x1 String str, @x1 String str2) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzb(context);
        ib0 b = new ib0.a().c(ub0.CONNECTED).b();
        try {
            ec0.p(context).j(new vb0.a(OfflineNotificationPoster.class).i(b).o(new kb0.a().q(kg.m.a.e, str).q("gws_query_id", str2).a()).a("offline_notification_work").b());
            return true;
        } catch (IllegalStateException e) {
            zzcfi.zzk("Failed to instantiate WorkManager.", e);
            return false;
        }
    }
}