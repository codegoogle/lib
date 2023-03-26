package com.p7700g.p99005;

import android.content.Context;
import android.os.Bundle;
import com.anchorfree.partner.api.ClientInfo;
import java.lang.reflect.Constructor;
import java.util.concurrent.Executors;

/* compiled from: SwitchableSourceFactory.java */
/* loaded from: classes2.dex */
public class pa1 {
    @x1
    private static final kj1 a = kj1.b("SwitchableCredentialsSource");
    @x1
    private final Context b;

    public pa1(@x1 Context context) {
        this.b = context;
    }

    @x1
    public r31 a(@x1 k81<r31> k81Var) throws i81 {
        return (r31) j81.a().b(k81Var);
    }

    @z1
    public ho1 b(@x1 j51 j51Var, @x1 ClientInfo clientInfo, @x1 v41 v41Var, @x1 o41 o41Var, @x1 o51 o51Var) {
        try {
            a.c("Try to create transport for name %s", j51Var);
            Constructor<?> constructor = Class.forName(j51Var.c().g()).getConstructor(Context.class, Bundle.class, x11.class, o41.class, o51.class);
            Bundle bundle = new Bundle();
            Context context = this.b;
            return (ho1) constructor.newInstance(this.b, bundle, g21.a(context, clientInfo, "3.5.0", b81.a(context), v41Var, Executors.newSingleThreadExecutor()), o41Var, o51Var);
        } catch (Throwable th) {
            a.f(th);
            return null;
        }
    }

    @z1
    public hn1 c(@x1 String str, @x1 td1 td1Var, @x1 td1 td1Var2, @x1 po1 po1Var) {
        try {
            return ((qa1) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0])).create(this.b, po1Var, td1Var, td1Var2);
        } catch (Throwable th) {
            a.f(th);
            return null;
        }
    }
}