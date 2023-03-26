package com.p7700g.p99005;

import android.content.Context;
import com.anchorfree.partner.api.ClientInfo;
import com.anchorfree.sdk.RemoteConfigLoader;
import com.anchorfree.sdk.RemoteConfigRepository;
import com.google.gson.Gson;
import com.p7700g.p99005.i61;
import java.util.Map;
import java.util.concurrent.Executors;

/* compiled from: RemoteConfigLoaderFactory.java */
/* loaded from: classes.dex */
public class l41 implements i61.a<RemoteConfigLoader> {
    @x1
    private final Context a;
    private o51 b;
    @x1
    private final Gson c;
    @x1
    private final x31 d;
    @x1
    private final h31 e;

    public l41(@x1 Context context, @x1 o51 o51Var, @x1 Gson gson, @x1 x31 x31Var, @x1 h31 h31Var) {
        this.a = context;
        this.b = o51Var;
        this.c = gson;
        this.d = x31Var;
        this.e = h31Var;
    }

    @Override // com.p7700g.p99005.i61.a
    @z1
    /* renamed from: b */
    public RemoteConfigLoader a(@z1 Map<String, Object> map) {
        ClientInfo clientInfo;
        if (map == null || (clientInfo = (ClientInfo) map.get(m31.a)) == null) {
            return null;
        }
        x11 x11Var = (x11) map.get(m31.b);
        if (x11Var == null) {
            Context context = this.a;
            x11Var = g21.a(context, clientInfo, "3.5.0", b81.a(context), new v41(this.b, "remote-config", (r41) i61.a().d(r41.class)), Executors.newSingleThreadExecutor());
        }
        return new RemoteConfigLoader(this.d, new y11(x11Var), clientInfo.getCarrierId(), new RemoteConfigRepository(this.c, (i41) i61.a().d(i41.class), clientInfo.getCarrierId()), this.e);
    }
}