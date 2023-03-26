package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.p7700g.p99005.br2;
import com.p7700g.p99005.h32;
import com.p7700g.p99005.jv2;
import com.p7700g.p99005.kv2;
import com.p7700g.p99005.mq2;
import com.p7700g.p99005.pn2;
import com.p7700g.p99005.pr2;
import com.p7700g.p99005.ps2;
import com.p7700g.p99005.so2;
import com.p7700g.p99005.to2;
import com.p7700g.p99005.tt2;
import com.p7700g.p99005.wo2;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.xq2;
import com.p7700g.p99005.zo2;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
@Keep
@KeepForSdk
/* loaded from: classes3.dex */
public class FirebaseMessagingRegistrar implements wo2 {
    public static final /* synthetic */ FirebaseMessaging lambda$getComponents$0$FirebaseMessagingRegistrar(to2 to2Var) {
        return new FirebaseMessaging((pn2) to2Var.a(pn2.class), (br2) to2Var.a(br2.class), to2Var.b(kv2.class), to2Var.b(xq2.class), (pr2) to2Var.a(pr2.class), (h32) to2Var.a(h32.class), (mq2) to2Var.a(mq2.class));
    }

    @Override // com.p7700g.p99005.wo2
    @x1
    @Keep
    public List<so2<?>> getComponents() {
        return Arrays.asList(so2.a(FirebaseMessaging.class).b(zo2.j(pn2.class)).b(zo2.h(br2.class)).b(zo2.i(kv2.class)).b(zo2.i(xq2.class)).b(zo2.h(h32.class)).b(zo2.j(pr2.class)).b(zo2.j(mq2.class)).f(tt2.a).c().d(), jv2.a("fire-fcm", ps2.a));
    }
}