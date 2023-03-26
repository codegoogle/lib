package com.anchorfree.pingtool;

import android.content.Context;
import com.p7700g.p99005.cu0;
import com.p7700g.p99005.hu0;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;

/* loaded from: classes.dex */
public class PingService {
    private final VpnRouter vpnRouter;

    public PingService(@x1 Context context) {
        this(context, cu0.a);
    }

    public static /* synthetic */ void lambda$new$0(int i) {
    }

    public void protect(int i) {
        this.vpnRouter.protect(i);
    }

    public native long startPing(@x1 String str);

    @z1
    public native PingResult stopPing(long j);

    public PingService(@x1 Context context, @x1 VpnRouter vpnRouter) {
        this.vpnRouter = vpnRouter;
        hu0.b(context, "ping-lib");
    }
}