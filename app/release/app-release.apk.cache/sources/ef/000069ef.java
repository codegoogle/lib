package com.p7700g.p99005;

import com.p7700g.p99005.ym4;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.Source;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.sax.SAXSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

/* compiled from: SourceProvider.java */
/* loaded from: classes3.dex */
public final class zt3 {

    /* compiled from: SourceProvider.java */
    @tl4({tm4.j, tm4.B, tm4.h})
    @jm4({tm4.j, tm4.B, tm4.h})
    /* loaded from: classes3.dex */
    public static final class a implements in4<DOMSource> {
        private final iy3<DocumentBuilderFactory> a;

        public a(@om4 iy3<DocumentBuilderFactory> iy3Var) {
            this.a = iy3Var;
        }

        @Override // com.p7700g.p99005.in4
        /* renamed from: a */
        public DOMSource b(Class<DOMSource> cls, Type type, Annotation[] annotationArr, tm4 tm4Var, um4<String, String> um4Var, InputStream inputStream) throws IOException {
            try {
                return new DOMSource(this.a.getValue().newDocumentBuilder().parse(inputStream));
            } catch (ParserConfigurationException e) {
                throw new lm4(e, ym4.b.INTERNAL_SERVER_ERROR);
            } catch (SAXParseException e2) {
                throw new lm4(e2, ym4.b.BAD_REQUEST);
            } catch (SAXException e3) {
                throw new lm4(e3, ym4.b.INTERNAL_SERVER_ERROR);
            }
        }

        @Override // com.p7700g.p99005.in4
        public boolean c(Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var) {
            return DOMSource.class == cls;
        }
    }

    /* compiled from: SourceProvider.java */
    @tl4({tm4.j, tm4.B, tm4.h})
    @jm4({tm4.j, tm4.B, tm4.h})
    /* loaded from: classes3.dex */
    public static final class b implements in4<SAXSource> {
        private final iy3<SAXParserFactory> a;

        public b(@om4 iy3<SAXParserFactory> iy3Var) {
            this.a = iy3Var;
        }

        @Override // com.p7700g.p99005.in4
        /* renamed from: a */
        public SAXSource b(Class<SAXSource> cls, Type type, Annotation[] annotationArr, tm4 tm4Var, um4<String, String> um4Var, InputStream inputStream) throws IOException {
            try {
                return new SAXSource(this.a.getValue().newSAXParser().getXMLReader(), new InputSource(inputStream));
            } catch (ParserConfigurationException e) {
                throw new lm4(e, ym4.b.INTERNAL_SERVER_ERROR);
            } catch (SAXParseException e2) {
                throw new lm4(e2, ym4.b.BAD_REQUEST);
            } catch (SAXException e3) {
                throw new lm4(e3, ym4.b.INTERNAL_SERVER_ERROR);
            }
        }

        @Override // com.p7700g.p99005.in4
        public boolean c(Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var) {
            return SAXSource.class == cls;
        }
    }

    /* compiled from: SourceProvider.java */
    @tl4({tm4.j, tm4.B, tm4.h})
    @jm4({tm4.j, tm4.B, tm4.h})
    /* loaded from: classes3.dex */
    public static final class c implements jn4<Source> {
        private final iy3<SAXParserFactory> a;
        private final iy3<TransformerFactory> b;

        public c(@om4 iy3<SAXParserFactory> iy3Var, @om4 iy3<TransformerFactory> iy3Var2) {
            this.a = iy3Var;
            this.b = iy3Var2;
        }

        @Override // com.p7700g.p99005.jn4
        /* renamed from: b */
        public long d(Source source, Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var) {
            return -1L;
        }

        @Override // com.p7700g.p99005.jn4
        /* renamed from: c */
        public void a(Source source, Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var, um4<String, Object> um4Var, OutputStream outputStream) throws IOException {
            try {
                if (source instanceof StreamSource) {
                    source = new SAXSource(this.a.getValue().newSAXParser().getXMLReader(), new InputSource(((StreamSource) source).getInputStream()));
                }
                this.b.getValue().newTransformer().transform(source, new StreamResult(outputStream));
            } catch (ParserConfigurationException e) {
                throw new lm4(e, ym4.b.INTERNAL_SERVER_ERROR);
            } catch (TransformerException e2) {
                throw new lm4(e2, ym4.b.INTERNAL_SERVER_ERROR);
            } catch (SAXException e3) {
                throw new lm4(e3, ym4.b.INTERNAL_SERVER_ERROR);
            }
        }

        @Override // com.p7700g.p99005.jn4
        public boolean e(Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var) {
            return Source.class.isAssignableFrom(cls);
        }
    }

    /* compiled from: SourceProvider.java */
    @tl4({tm4.j, tm4.B, tm4.h})
    @jm4({tm4.j, tm4.B, tm4.h})
    /* loaded from: classes3.dex */
    public static final class d implements in4<StreamSource> {
        @Override // com.p7700g.p99005.in4
        /* renamed from: a */
        public StreamSource b(Class<StreamSource> cls, Type type, Annotation[] annotationArr, tm4 tm4Var, um4<String, String> um4Var, InputStream inputStream) throws IOException {
            return new StreamSource(inputStream);
        }

        @Override // com.p7700g.p99005.in4
        public boolean c(Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var) {
            return StreamSource.class == cls;
        }
    }
}