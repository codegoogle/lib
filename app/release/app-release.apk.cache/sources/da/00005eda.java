package com.p7700g.p99005;

import javax.xml.parsers.SAXParserFactory;

/* compiled from: SAXParserContextProvider.java */
/* loaded from: classes3.dex */
public class tu3 extends vu3<SAXParserFactory> {
    private final boolean c;

    public tu3(@om4 ax3 ax3Var) {
        super(SAXParserFactory.class);
        this.c = ax3Var.c(ax3.a);
    }

    @Override // com.p7700g.p99005.vu3
    /* renamed from: f */
    public SAXParserFactory e() {
        SAXParserFactory newInstance = SAXParserFactory.newInstance();
        newInstance.setNamespaceAware(true);
        return !this.c ? new uu3(newInstance) : newInstance;
    }
}