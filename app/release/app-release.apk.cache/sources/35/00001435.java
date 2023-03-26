package com.facebook.ads.redexgen.X;

import android.app.ActivityManager;
import android.os.Build;
import android.support.v4.media.session.PlaybackStateCompat;

/* renamed from: com.facebook.ads.redexgen.X.Td  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0998Td implements InterfaceC04416i {
    public final /* synthetic */ C1007Tm A00;

    public C0998Td(C1007Tm c1007Tm) {
        this.A00 = c1007Tm;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04416i
    public final AbstractC04566x A50() {
        ActivityManager activityManager;
        ActivityManager activityManager2;
        if (Build.VERSION.SDK_INT < 16) {
            return this.A00.A08(EnumC04526t.A05);
        }
        activityManager = this.A00.A02;
        if (activityManager != null) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager2 = this.A00.A02;
            activityManager2.getMemoryInfo(memoryInfo);
            return this.A00.A07(memoryInfo.totalMem / PlaybackStateCompat.M);
        }
        return this.A00.A08(EnumC04526t.A07);
    }
}