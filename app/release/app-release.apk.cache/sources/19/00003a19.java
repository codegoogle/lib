package com.p7700g.p99005;

import android.content.Context;
import com.anchorfree.partner.api.ClientInfo;
import com.anchorfree.sdk.SessionConfig;
import com.p7700g.p99005.a81;
import java.io.File;
import java.util.List;
import java.util.concurrent.Executors;

/* compiled from: BplFileConfigPatcher.java */
/* loaded from: classes.dex */
public class b21 implements s31 {
    @Override // com.p7700g.p99005.s31
    @x1
    public SessionConfig a(@x1 Context context, @x1 SessionConfig sessionConfig) {
        try {
            x31 x31Var = (x31) i61.a().d(x31.class);
            h31 h31Var = (h31) i61.a().d(h31.class);
            dq0<List<ClientInfo>> q0 = new o51(Executors.newSingleThreadExecutor(), new c81(context)).q0();
            q0.Y();
            List<ClientInfo> F = q0.F();
            SessionConfig.b edit = sessionConfig.edit();
            if (F != null) {
                for (ClientInfo clientInfo : F) {
                    File file = new File(new p41(x31Var, clientInfo.getCarrierId(), o41.b, h31Var).d());
                    if (file.exists() && file.length() > 0) {
                        return edit.p(a81.c.d().g(file.getAbsolutePath())).s();
                    }
                }
            }
            return edit.s();
        } catch (InterruptedException unused) {
            return sessionConfig;
        }
    }
}