package com.p7700g.p99005;

import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilderFactory;

/* compiled from: DocumentBuilderFactoryProvider.java */
/* loaded from: classes3.dex */
public class ru3 extends vu3<DocumentBuilderFactory> {
    private static final Logger c = Logger.getLogger(ru3.class.getName());
    private final boolean d;

    public ru3(@om4 ax3 ax3Var) {
        super(DocumentBuilderFactory.class);
        this.d = ax3Var.c(ax3.a);
    }

    @Override // com.p7700g.p99005.vu3
    /* renamed from: f */
    public DocumentBuilderFactory e() {
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        newInstance.setNamespaceAware(true);
        if (!this.d) {
            newInstance.setExpandEntityReferences(false);
        }
        return newInstance;
    }
}