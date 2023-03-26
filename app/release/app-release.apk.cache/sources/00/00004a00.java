package com.p7700g.p99005;

import android.content.Context;
import com.anchorfree.partner.api.ClientInfo;
import com.anchorfree.sdk.RemoteConfigRepository;
import com.google.gson.Gson;

/* compiled from: DefaultUrlRotatorFactory.java */
/* loaded from: classes2.dex */
public class ja1 implements cr0 {
    @x1
    private final s41 a;
    @x1
    private final Gson b;
    @x1
    private final i41 c;
    @x1
    private final c81 d;

    public ja1(@x1 s41 s41Var, @x1 Gson gson, @x1 i41 i41Var, @x1 c81 c81Var) {
        this.a = s41Var;
        this.b = gson;
        this.c = i41Var;
        this.d = c81Var;
    }

    @Override // com.p7700g.p99005.cr0
    @x1
    public br0 a(@x1 Context context, @x1 ClientInfo clientInfo) {
        return new sa1(this.b, clientInfo.getUrls(), this.a, new RemoteConfigRepository(this.b, this.c, clientInfo.getCarrierId()), this.d);
    }
}