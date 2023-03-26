package com.p7700g.p99005;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.CharacterData;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

/* compiled from: XmlTools.java */
/* loaded from: classes3.dex */
public class cq5 {
    private static String a = "com.p7700g.p99005.cq5";

    public static String a(Node node) {
        NodeList childNodes = node.getChildNodes();
        String str = null;
        int i = 0;
        while (true) {
            if (i >= childNodes.getLength()) {
                break;
            }
            str = ((CharacterData) childNodes.item(i)).getData().trim();
            if (str.length() != 0) {
                String str2 = a;
                bq5.g(str2, "getElementValue: " + str);
                break;
            }
            i++;
        }
        return str;
    }

    public static void b(Document doc) {
        bq5.a(a, "logXmlDocument");
        try {
            Transformer newTransformer = TransformerFactory.newInstance().newTransformer();
            newTransformer.setOutputProperty("omit-xml-declaration", k21.h);
            newTransformer.setOutputProperty("method", "xml");
            newTransformer.setOutputProperty("indent", k21.g);
            newTransformer.setOutputProperty("encoding", "UTF-8");
            newTransformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            StringWriter stringWriter = new StringWriter();
            newTransformer.transform(new DOMSource(doc), new StreamResult(stringWriter));
            bq5.a(a, stringWriter.toString());
        } catch (Exception e) {
            bq5.c(a, e.getMessage(), e);
        }
    }

    public static String c(InputStream inputStream) throws IOException {
        bq5.a(a, "stringFromStream");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return new String(byteArrayOutputStream.toByteArray(), "UTF-8");
            }
        }
    }

    public static Document d(String doc) {
        bq5.a(a, "stringToDocument");
        try {
            DocumentBuilder newDocumentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            InputSource inputSource = new InputSource();
            inputSource.setCharacterStream(new StringReader(doc));
            return newDocumentBuilder.parse(inputSource);
        } catch (Exception e) {
            bq5.c(a, e.getMessage(), e);
            return null;
        }
    }

    public static String e(Document doc) {
        bq5.a(a, "xmlDocumentToString");
        try {
            Transformer newTransformer = TransformerFactory.newInstance().newTransformer();
            newTransformer.setOutputProperty("omit-xml-declaration", k21.h);
            newTransformer.setOutputProperty("method", "xml");
            newTransformer.setOutputProperty("indent", k21.g);
            newTransformer.setOutputProperty("encoding", "UTF-8");
            newTransformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            StringWriter stringWriter = new StringWriter();
            newTransformer.transform(new DOMSource(doc), new StreamResult(stringWriter));
            return stringWriter.toString();
        } catch (Exception e) {
            bq5.c(a, e.getMessage(), e);
            return null;
        }
    }

    public static String f(Node node) {
        bq5.a(a, "xmlDocumentToString");
        try {
            Transformer newTransformer = TransformerFactory.newInstance().newTransformer();
            newTransformer.setOutputProperty("omit-xml-declaration", k21.g);
            newTransformer.setOutputProperty("method", "xml");
            newTransformer.setOutputProperty("indent", k21.g);
            newTransformer.setOutputProperty("encoding", "UTF-8");
            newTransformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            StringWriter stringWriter = new StringWriter();
            newTransformer.transform(new DOMSource(node), new StreamResult(stringWriter));
            return stringWriter.toString();
        } catch (Exception e) {
            bq5.c(a, e.getMessage(), e);
            return null;
        }
    }
}