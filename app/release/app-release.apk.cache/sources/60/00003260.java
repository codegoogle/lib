package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.p7700g.p99005.h32;
import com.p7700g.p99005.lp2;
import com.p7700g.p99005.so2;
import com.p7700g.p99005.wo2;
import com.p7700g.p99005.zo2;
import java.util.Collections;
import java.util.List;

@Keep
/* loaded from: classes3.dex */
public class TransportRegistrar implements wo2 {
    @Override // com.p7700g.p99005.wo2
    public List<so2<?>> getComponents() {
        return Collections.singletonList(so2.a(h32.class).b(zo2.j(Context.class)).f(lp2.a).d());
    }
}