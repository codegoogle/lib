package com.p7700g.p99005;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.nio.charset.Charset;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

/* compiled from: VASTProcessor.java */
/* loaded from: classes3.dex */
public final class up5 {
    private static final String a = "com.p7700g.p99005.up5";
    private static final int b = 5;
    private static final boolean c = false;
    private sp5 d;
    private pp5 e;
    private StringBuilder f = new StringBuilder(500);

    public up5(sp5 mediaPicker) {
        this.d = mediaPicker;
    }

    private Document a(InputStream is) {
        String str = a;
        bq5.a(str, "About to create doc from InputStream");
        try {
            Document parse = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(is);
            parse.getDocumentElement().normalize();
            bq5.a(str, "Doc successfully created.");
            return parse;
        } catch (Exception e) {
            bq5.c(a, e.getMessage(), e);
            return null;
        }
    }

    private void c(Document newDoc) {
        String str = a;
        bq5.a(str, "About to merge doc into main doc.");
        this.f.append(cq5.f(newDoc.getElementsByTagName("VAST").item(0)));
        bq5.a(str, "Merge successful.");
    }

    private int e(InputStream is, int depth) {
        String str = a;
        bq5.a(str, "processUri");
        if (depth >= 5) {
            bq5.b(str, "VAST wrapping exceeded max limit of 5.");
            return 4;
        }
        Document a2 = a(is);
        if (a2 == null) {
            return 2;
        }
        c(a2);
        NodeList elementsByTagName = a2.getElementsByTagName(qp5.vastAdTagURI.f());
        if (elementsByTagName == null || elementsByTagName.getLength() == 0) {
            return 0;
        }
        bq5.a(str, "Doc is a wrapper. ");
        String a3 = cq5.a(elementsByTagName.item(0));
        bq5.a(str, "Wrapper URL: " + a3);
        try {
            InputStream openStream = new URL(a3).openStream();
            int e = e(openStream, depth + 1);
            try {
                openStream.close();
            } catch (IOException unused) {
            }
            return e;
        } catch (Exception e2) {
            bq5.c(a, e2.getMessage(), e2);
            return 1;
        }
    }

    private Document f() {
        String str = a;
        bq5.a(str, "wrapmergedVastDocWithVasts");
        this.f.insert(0, "<VASTS>");
        this.f.append("</VASTS>");
        String sb = this.f.toString();
        bq5.g(str, "Merged VAST doc:\n" + sb);
        return cq5.d(sb);
    }

    public pp5 b() {
        return this.e;
    }

    public int d(String xmlData) {
        bq5.a(a, "process");
        this.e = null;
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(xmlData.getBytes(Charset.defaultCharset().name()));
            int e = e(byteArrayInputStream, 0);
            try {
                byteArrayInputStream.close();
            } catch (IOException unused) {
            }
            if (e != 0) {
                return e;
            }
            Document f = f();
            pp5 pp5Var = new pp5(f);
            this.e = pp5Var;
            if (f == null) {
                return 2;
            }
            return !tp5.a(pp5Var, this.d) ? 3 : 0;
        } catch (UnsupportedEncodingException e2) {
            bq5.c(a, e2.getMessage(), e2);
            return 2;
        }
    }
}