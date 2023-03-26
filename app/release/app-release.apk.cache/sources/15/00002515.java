package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import com.p7700g.p99005.wo1;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdp {
    public static void zza(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static void zzb(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(wo1.l("csd-", i), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }
}