package com.anchorfree.sdk.provider;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.anchorfree.sdk.provider.TelemetryUrlProvider;
import com.google.gson.Gson;
import com.p7700g.p99005.c21;
import com.p7700g.p99005.c81;
import com.p7700g.p99005.c91;
import com.p7700g.p99005.en1;
import com.p7700g.p99005.h31;
import com.p7700g.p99005.i41;
import com.p7700g.p99005.i61;
import com.p7700g.p99005.l61;
import com.p7700g.p99005.me1;
import com.p7700g.p99005.o51;
import com.p7700g.p99005.s41;
import com.p7700g.p99005.w51;
import com.p7700g.p99005.w71;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.x31;
import com.p7700g.p99005.x71;
import com.p7700g.p99005.y71;
import com.p7700g.p99005.z1;
import com.p7700g.p99005.z71;
import java.util.ArrayList;
import java.util.List;

@Keep
/* loaded from: classes.dex */
public class TelemetryUrlProvider implements c91 {
    @x1
    private final me1 connectionObserver;
    @x1
    private final List<w71> urlProviders;
    @x1
    private volatile en1 vpnState = en1.UNKNOWN;

    public TelemetryUrlProvider() {
        h31 h31Var = (h31) i61.a().d(h31.class);
        this.connectionObserver = (me1) i61.a().d(me1.class);
        s41 s41Var = (s41) i61.a().b(s41.class);
        s41 s41Var2 = s41Var == null ? new s41((x31) i61.a().d(x31.class)) : s41Var;
        Gson gson = (Gson) i61.a().d(Gson.class);
        o51 o51Var = (o51) i61.a().d(o51.class);
        i41 i41Var = (i41) i61.a().d(i41.class);
        ArrayList arrayList = new ArrayList();
        this.urlProviders = arrayList;
        arrayList.add(new y71(gson, o51Var, s41Var2, h31Var));
        s41 s41Var3 = s41Var2;
        arrayList.add(new z71(gson, o51Var, s41Var3, i41Var, h31Var));
        arrayList.add(new x71(gson, o51Var, s41Var3, h31Var, (c81) i61.a().d(c81.class), l61.j.c));
        h31Var.f(new c21() { // from class: com.p7700g.p99005.v71
            @Override // com.p7700g.p99005.c21
            public final void a(Object obj) {
                TelemetryUrlProvider.this.a(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$new$0 */
    public /* synthetic */ void a(Object obj) {
        if (obj instanceof w51) {
            this.vpnState = ((w51) obj).c();
        }
    }

    @Override // com.p7700g.p99005.c91
    @z1
    public String provide() {
        if (this.connectionObserver.b()) {
            en1 en1Var = this.vpnState;
            if (en1Var != en1.IDLE && en1Var != en1.CONNECTED) {
                w71.a.c("Return null url due to wrong state: %s", en1Var);
            } else {
                for (w71 w71Var : this.urlProviders) {
                    String f = w71Var.f();
                    if (!TextUtils.isEmpty(f)) {
                        return f;
                    }
                }
            }
            return null;
        }
        return null;
    }

    @Override // com.p7700g.p99005.c91
    public void reportUrl(@x1 String str, boolean z, @z1 Exception exc) {
        for (w71 w71Var : this.urlProviders) {
            w71Var.g(str, z, exc);
        }
    }
}