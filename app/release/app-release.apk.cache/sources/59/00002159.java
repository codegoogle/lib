package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcfq extends ScheduledThreadPoolExecutor {
    public zzcfq(int i, ThreadFactory threadFactory) {
        super(3, threadFactory);
    }
}