package com.p7700g.p99005;

import javax.xml.stream.XMLInputFactory;

/* compiled from: XMLStreamReaderContextProvider.java */
/* loaded from: classes3.dex */
public class xu3 extends vu3<XMLInputFactory> {
    private final boolean c;

    public xu3(@om4 ax3 ax3Var) {
        super(XMLInputFactory.class);
        this.c = ax3Var.c(ax3.a);
    }

    @Override // com.p7700g.p99005.vu3
    /* renamed from: f */
    public XMLInputFactory e() {
        XMLInputFactory newInstance = XMLInputFactory.newInstance();
        if (!this.c) {
            newInstance.setProperty("javax.xml.stream.isReplacingEntityReferences", Boolean.FALSE);
        }
        return newInstance;
    }
}