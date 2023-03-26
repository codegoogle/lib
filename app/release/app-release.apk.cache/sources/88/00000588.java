package com.anythink.core.b.b;

import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATBiddingListener;

/* loaded from: classes2.dex */
public abstract class b implements ATBiddingListener {
    public ATBaseAdAdapter c;

    public b(ATBaseAdAdapter aTBaseAdAdapter) {
        this.c = aTBaseAdAdapter;
    }

    private void a() {
        this.c = null;
    }
}