package com.p7700g.p99005;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.p7700g.p99005.b8;
import com.p7700g.p99005.f;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ConnectionHolder.java */
/* loaded from: classes.dex */
public class m6 implements ServiceConnection {
    private static final int s = 0;
    private static final int t = 1;
    private static final int u = 2;
    private static final int v = 3;
    @x1
    private List<b8.a<c7>> A;
    @z1
    private Exception B;
    @x1
    private final Runnable w;
    @x1
    private final a x;
    private int y;
    @z1
    private c7 z;

    /* compiled from: ConnectionHolder.java */
    /* loaded from: classes.dex */
    public static class a {
        @x1
        public c7 a(ComponentName componentName, IBinder iBinder) {
            return new c7(f.b.N1(iBinder), componentName);
        }
    }

    @u1
    public m6(@x1 Runnable runnable) {
        this(runnable, new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ Object d(b8.a aVar) throws Exception {
        int i = this.y;
        if (i == 0) {
            this.A.add(aVar);
        } else if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("Connection state is invalid");
                }
                throw this.B;
            }
            throw new IllegalStateException("Service has been disconnected.");
        } else {
            c7 c7Var = this.z;
            if (c7Var != null) {
                aVar.c(c7Var);
            } else {
                throw new IllegalStateException("ConnectionHolder state is incorrect.");
            }
        }
        StringBuilder G = wo1.G("ConnectionHolder, state = ");
        G.append(this.y);
        return G.toString();
    }

    @u1
    public void a(@x1 Exception exc) {
        for (b8.a<c7> aVar : this.A) {
            aVar.f(exc);
        }
        this.A.clear();
        this.w.run();
        this.y = 3;
        this.B = exc;
    }

    @x1
    @u1
    public gn2<c7> b() {
        return b8.a(new b8.c() { // from class: com.p7700g.p99005.j6
            @Override // com.p7700g.p99005.b8.c
            public final Object a(b8.a aVar) {
                return m6.this.d(aVar);
            }
        });
    }

    @Override // android.content.ServiceConnection
    @u1
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.z = this.x.a(componentName, iBinder);
        for (b8.a<c7> aVar : this.A) {
            aVar.c(this.z);
        }
        this.A.clear();
        this.y = 1;
    }

    @Override // android.content.ServiceConnection
    @u1
    public void onServiceDisconnected(ComponentName componentName) {
        this.z = null;
        this.w.run();
        this.y = 2;
    }

    @u1
    public m6(@x1 Runnable runnable, @x1 a aVar) {
        this.y = 0;
        this.A = new ArrayList();
        this.w = runnable;
        this.x = aVar;
    }
}