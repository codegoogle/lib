package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public final class zabc extends com.google.android.gms.internal.base.zaq {
    public final /* synthetic */ zabe zaa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zabc(zabe zabeVar, Looper looper) {
        super(looper);
        this.zaa = zabeVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            zabe.zaj(this.zaa);
        } else if (i != 2) {
        } else {
            zabe.zai(this.zaa);
        }
    }
}