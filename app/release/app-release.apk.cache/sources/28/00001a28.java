package com.google.android.gms.common.internal;

import android.net.Uri;
import com.anythink.expressad.foundation.h.h;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public final class ResourceUtils {
    private static final Uri zza = new Uri.Builder().scheme("android.resource").authority("com.google.android.gms").appendPath(h.c).build();

    private ResourceUtils() {
    }
}