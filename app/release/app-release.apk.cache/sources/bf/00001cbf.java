package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaob extends zzaoa {
    public zzaob(Context context, String str, boolean z) {
        super(context, str, z);
    }

    public static zzaob zzs(String str, Context context, boolean z) {
        zzaoa.zzq(context, false);
        return new zzaob(context, str, false);
    }

    @Deprecated
    public static zzaob zzt(String str, Context context, boolean z, int i) {
        zzaoa.zzq(context, z);
        return new zzaob(context, str, z);
    }

    @Override // com.google.android.gms.internal.ads.zzaoa
    public final List zzo(zzapc zzapcVar, Context context, zzali zzaliVar, zzalb zzalbVar) {
        if (zzapcVar.zzk() != null && ((zzaoa) this).zzt) {
            int zza = zzapcVar.zza();
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(super.zzo(zzapcVar, context, zzaliVar, null));
            arrayList.add(new zzapt(zzapcVar, "Za6LxNnVxz2lEtZQYrJ2QLB5PwaCpmcdWBAdgk+Rc+b6fjcW8QKpJ7ITar8M3xU9", "2mbuydE9pw99Ld1EHQbedo6oUJcW1o/QWNiH9X+lcIw=", zzaliVar, zza, 24));
            return arrayList;
        }
        return super.zzo(zzapcVar, context, zzaliVar, null);
    }
}