package com.google.android.gms.common.api.internal;

import com.p7700g.p99005.r0;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public final class zaar extends com.google.android.gms.signin.internal.zac {
    private final WeakReference<zaaw> zaa;

    public zaar(zaaw zaawVar) {
        this.zaa = new WeakReference<>(zaawVar);
    }

    @Override // com.google.android.gms.signin.internal.zac, com.google.android.gms.signin.internal.zae
    @r0
    public final void zab(com.google.android.gms.signin.internal.zak zakVar) {
        zabi zabiVar;
        zaaw zaawVar = this.zaa.get();
        if (zaawVar == null) {
            return;
        }
        zabiVar = zaawVar.zaa;
        zabiVar.zal(new zaaq(this, zaawVar, zaawVar, zakVar));
    }
}