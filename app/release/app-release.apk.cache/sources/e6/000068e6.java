package com.p7700g.p99005;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import com.p7700g.p99005.bd0;
import com.p7700g.p99005.i2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: ConstraintsCommandHandler.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class zc0 {
    private static final String a = tb0.f("ConstraintsCmdHandler");
    private final Context b;
    private final int c;
    private final bd0 d;
    private final kd0 e;

    public zc0(@x1 Context context, int startId, @x1 bd0 dispatcher) {
        this.b = context;
        this.c = startId;
        this.d = dispatcher;
        this.e = new kd0(context, dispatcher.f(), null);
    }

    @s2
    public void a() {
        List<we0> i = this.d.g().M().L().i();
        ConstraintProxy.a(this.b, i);
        this.e.d(i);
        ArrayList arrayList = new ArrayList(i.size());
        long currentTimeMillis = System.currentTimeMillis();
        for (we0 we0Var : i) {
            String str = we0Var.d;
            if (currentTimeMillis >= we0Var.a() && (!we0Var.b() || this.e.c(str))) {
                arrayList.add(we0Var);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = ((we0) it.next()).d;
            Intent b = yc0.b(this.b, str2);
            tb0.c().a(a, String.format("Creating a delay_met command for workSpec with id (%s)", str2), new Throwable[0]);
            bd0 bd0Var = this.d;
            bd0Var.k(new bd0.b(bd0Var, b, this.c));
        }
        this.e.e();
    }
}