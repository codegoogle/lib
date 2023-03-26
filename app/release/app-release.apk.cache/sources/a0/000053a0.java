package com.p7700g.p99005;

import com.anchorfree.partner.api.ClientInfo;
import com.anchorfree.sdk.RemoteConfigLoader;
import com.anchorfree.sdk.RemoteConfigRepository;
import com.google.gson.Gson;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: RemoteFileListener.java */
/* loaded from: classes.dex */
public class o41 {
    @x1
    public static final kj1 a = kj1.b("RemoteFileListener");
    @x1
    public static final String b = "bpl";
    @x1
    public static final String c = "cnl";
    @x1
    private final Gson d;
    @x1
    private final i41 e;
    @x1
    private final a f;
    @x1
    private x31 g;
    @x1
    private final Executor h;
    @x1
    private final o51 i;

    /* compiled from: RemoteFileListener.java */
    /* loaded from: classes.dex */
    public interface a {
        @x1
        List<n41> a(@x1 String str);
    }

    public o41(@x1 Gson gson, @x1 i41 i41Var, @x1 x31 x31Var, @x1 o51 o51Var, @x1 a aVar, @x1 Executor executor) {
        this.d = gson;
        this.e = i41Var;
        this.f = aVar;
        this.h = executor;
        this.i = o51Var;
        a.c("create", new Object[0]);
        this.g = x31Var;
    }

    public static /* synthetic */ Void b(dq0 dq0Var) throws Exception {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ dq0 d(ft0 ft0Var, dq0 dq0Var) throws Exception {
        List<ClientInfo> list = (List) dq0Var.F();
        if (list != null && list.size() > 0) {
            LinkedList linkedList = new LinkedList();
            for (ClientInfo clientInfo : list) {
                RemoteConfigLoader.FilesObject files = new RemoteConfigRepository(this.d, this.e, clientInfo.getCarrierId()).getFiles();
                for (n41 n41Var : this.f.a(clientInfo.getCarrierId())) {
                    linkedList.add(n41Var.c(files, ft0Var));
                }
            }
            return ((dq0) r81.f(dq0.a0(linkedList))).q(ty0.a);
        }
        return dq0.D(null);
    }

    @x1
    public dq0<Void> a(@z1 mr0 mr0Var, @x1 final ft0 ft0Var) {
        return this.i.q0().u(new aq0() { // from class: com.p7700g.p99005.uy0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return o41.this.d(ft0Var, dq0Var);
            }
        });
    }
}