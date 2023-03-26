package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.p7700g.p99005.jr2;
import com.p7700g.p99005.jv2;
import com.p7700g.p99005.kv2;
import com.p7700g.p99005.or2;
import com.p7700g.p99005.pn2;
import com.p7700g.p99005.pr2;
import com.p7700g.p99005.so2;
import com.p7700g.p99005.to2;
import com.p7700g.p99005.wo2;
import com.p7700g.p99005.xq2;
import com.p7700g.p99005.zo2;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes3.dex */
public class FirebaseInstallationsRegistrar implements wo2 {
    public static /* synthetic */ pr2 lambda$getComponents$0(to2 to2Var) {
        return new or2((pn2) to2Var.a(pn2.class), to2Var.b(kv2.class), to2Var.b(xq2.class));
    }

    @Override // com.p7700g.p99005.wo2
    public List<so2<?>> getComponents() {
        return Arrays.asList(so2.a(pr2.class).b(zo2.j(pn2.class)).b(zo2.i(xq2.class)).b(zo2.i(kv2.class)).f(jr2.a).d(), jv2.a("fire-installations", "17.0.0"));
    }
}