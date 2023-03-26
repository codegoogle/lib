package com.p7700g.p99005;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.SAXParserFactory;

/* compiled from: SaxHelper.java */
/* loaded from: classes3.dex */
public final class jx3 {
    private jx3() {
    }

    public static boolean a(DocumentBuilderFactory documentBuilderFactory) {
        return b(documentBuilderFactory, "oracle.xml.jaxp.JXDocumentBuilderFactory");
    }

    private static boolean b(Object obj, String str) {
        try {
            return Class.forName(str).isAssignableFrom(obj.getClass());
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static boolean c(SAXParserFactory sAXParserFactory) {
        return b(sAXParserFactory, "oracle.xml.jaxp.JXSAXParserFactory");
    }
}