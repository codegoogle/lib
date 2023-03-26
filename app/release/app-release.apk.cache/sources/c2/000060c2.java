package com.p7700g.p99005;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.validation.Schema;
import org.xml.sax.EntityResolver;
import org.xml.sax.HandlerBase;
import org.xml.sax.InputSource;
import org.xml.sax.Parser;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

/* compiled from: SecureSAXParserFactory.java */
/* loaded from: classes3.dex */
public final class uu3 extends SAXParserFactory {
    private static final Logger a = Logger.getLogger(uu3.class.getName());
    private static final EntityResolver b = new a();
    private final SAXParserFactory c;

    /* compiled from: SecureSAXParserFactory.java */
    /* loaded from: classes3.dex */
    public static class a implements EntityResolver {
        @Override // org.xml.sax.EntityResolver
        public InputSource resolveEntity(String str, String str2) {
            return new InputSource(new ByteArrayInputStream(new byte[0]));
        }
    }

    /* compiled from: SecureSAXParserFactory.java */
    /* loaded from: classes3.dex */
    public static final class b extends SAXParser {
        private final SAXParser a;

        public b(SAXParser sAXParser) {
            this.a = sAXParser;
        }

        @Override // javax.xml.parsers.SAXParser
        public Parser getParser() throws SAXException {
            return this.a.getParser();
        }

        @Override // javax.xml.parsers.SAXParser
        public Object getProperty(String str) throws SAXNotRecognizedException, SAXNotSupportedException {
            return this.a.getProperty(str);
        }

        @Override // javax.xml.parsers.SAXParser
        public Schema getSchema() {
            return this.a.getSchema();
        }

        @Override // javax.xml.parsers.SAXParser
        public XMLReader getXMLReader() throws SAXException {
            XMLReader xMLReader = this.a.getXMLReader();
            xMLReader.setEntityResolver(uu3.b);
            return xMLReader;
        }

        @Override // javax.xml.parsers.SAXParser
        public boolean isNamespaceAware() {
            return this.a.isNamespaceAware();
        }

        @Override // javax.xml.parsers.SAXParser
        public boolean isValidating() {
            return this.a.isValidating();
        }

        @Override // javax.xml.parsers.SAXParser
        public boolean isXIncludeAware() {
            return this.a.isXIncludeAware();
        }

        @Override // javax.xml.parsers.SAXParser
        public void parse(InputStream inputStream, HandlerBase handlerBase) throws SAXException, IOException {
            this.a.parse(inputStream, handlerBase);
        }

        @Override // javax.xml.parsers.SAXParser
        public void reset() {
            this.a.reset();
        }

        @Override // javax.xml.parsers.SAXParser
        public void setProperty(String str, Object obj) throws SAXNotRecognizedException, SAXNotSupportedException {
            this.a.setProperty(str, obj);
        }

        @Override // javax.xml.parsers.SAXParser
        public void parse(InputStream inputStream, HandlerBase handlerBase, String str) throws SAXException, IOException {
            this.a.parse(inputStream, handlerBase, str);
        }

        @Override // javax.xml.parsers.SAXParser
        public void parse(InputStream inputStream, DefaultHandler defaultHandler) throws SAXException, IOException {
            this.a.parse(inputStream, defaultHandler);
        }

        @Override // javax.xml.parsers.SAXParser
        public void parse(InputStream inputStream, DefaultHandler defaultHandler, String str) throws SAXException, IOException {
            this.a.parse(inputStream, defaultHandler, str);
        }

        @Override // javax.xml.parsers.SAXParser
        public void parse(String str, HandlerBase handlerBase) throws SAXException, IOException {
            this.a.parse(str, handlerBase);
        }

        @Override // javax.xml.parsers.SAXParser
        public void parse(String str, DefaultHandler defaultHandler) throws SAXException, IOException {
            this.a.parse(str, defaultHandler);
        }

        @Override // javax.xml.parsers.SAXParser
        public void parse(File file, HandlerBase handlerBase) throws SAXException, IOException {
            this.a.parse(file, handlerBase);
        }

        @Override // javax.xml.parsers.SAXParser
        public void parse(File file, DefaultHandler defaultHandler) throws SAXException, IOException {
            this.a.parse(file, defaultHandler);
        }

        @Override // javax.xml.parsers.SAXParser
        public void parse(InputSource inputSource, HandlerBase handlerBase) throws SAXException, IOException {
            this.a.parse(inputSource, handlerBase);
        }

        @Override // javax.xml.parsers.SAXParser
        public void parse(InputSource inputSource, DefaultHandler defaultHandler) throws SAXException, IOException {
            this.a.parse(inputSource, defaultHandler);
        }
    }

    public uu3(SAXParserFactory sAXParserFactory) {
        this.c = sAXParserFactory;
        if (jx3.c(sAXParserFactory)) {
            a.log(Level.WARNING, rx3.n0());
            return;
        }
        try {
            sAXParserFactory.setFeature("http://xml.org/sax/features/external-general-entities", false);
            sAXParserFactory.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            try {
                sAXParserFactory.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
            } catch (Exception e) {
                a.log(Level.WARNING, rx3.l0(), (Throwable) e);
            }
        } catch (Exception e2) {
            throw new RuntimeException(rx3.m0(), e2);
        }
    }

    @Override // javax.xml.parsers.SAXParserFactory
    public boolean getFeature(String str) throws ParserConfigurationException, SAXNotRecognizedException, SAXNotSupportedException {
        return this.c.getFeature(str);
    }

    @Override // javax.xml.parsers.SAXParserFactory
    public Schema getSchema() {
        return this.c.getSchema();
    }

    @Override // javax.xml.parsers.SAXParserFactory
    public boolean isNamespaceAware() {
        return this.c.isNamespaceAware();
    }

    @Override // javax.xml.parsers.SAXParserFactory
    public boolean isValidating() {
        return this.c.isValidating();
    }

    @Override // javax.xml.parsers.SAXParserFactory
    public boolean isXIncludeAware() {
        return this.c.isXIncludeAware();
    }

    @Override // javax.xml.parsers.SAXParserFactory
    public SAXParser newSAXParser() throws ParserConfigurationException, SAXException {
        return new b(this.c.newSAXParser());
    }

    @Override // javax.xml.parsers.SAXParserFactory
    public void setFeature(String str, boolean z) throws ParserConfigurationException, SAXNotRecognizedException, SAXNotSupportedException {
        this.c.setFeature(str, z);
    }

    @Override // javax.xml.parsers.SAXParserFactory
    public void setNamespaceAware(boolean z) {
        this.c.setNamespaceAware(z);
    }

    @Override // javax.xml.parsers.SAXParserFactory
    public void setSchema(Schema schema) {
        this.c.setSchema(schema);
    }

    @Override // javax.xml.parsers.SAXParserFactory
    public void setValidating(boolean z) {
        this.c.setValidating(z);
    }

    @Override // javax.xml.parsers.SAXParserFactory
    public void setXIncludeAware(boolean z) {
        this.c.setXIncludeAware(z);
    }
}