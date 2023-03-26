package com.p7700g.p99005;

import javax.xml.transform.TransformerFactory;

/* compiled from: TransformerFactoryProvider.java */
/* loaded from: classes3.dex */
public class wu3 extends vu3<TransformerFactory> {
    private final boolean c;

    public wu3(@om4 ax3 ax3Var) {
        super(TransformerFactory.class);
        this.c = ax3Var.c(ax3.a);
    }

    @Override // com.p7700g.p99005.vu3
    /* renamed from: f */
    public TransformerFactory e() {
        return TransformerFactory.newInstance();
    }
}