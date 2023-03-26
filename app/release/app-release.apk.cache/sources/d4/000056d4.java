package com.p7700g.p99005;

import com.p7700g.p99005.ym4;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/* compiled from: DocumentProvider.java */
@jm4({tm4.j, tm4.B, tm4.h})
@tl4({tm4.j, tm4.B, tm4.h})
/* loaded from: classes3.dex */
public final class pt3 extends av3<Document> {
    private final iy3<DocumentBuilderFactory> b;
    private final iy3<TransformerFactory> c;

    public pt3(@om4 iy3<DocumentBuilderFactory> iy3Var, @om4 iy3<TransformerFactory> iy3Var2) {
        this.b = iy3Var;
        this.c = iy3Var2;
    }

    @Override // com.p7700g.p99005.in4
    public boolean c(Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var) {
        return Document.class == cls;
    }

    @Override // com.p7700g.p99005.jn4
    public boolean e(Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var) {
        return Document.class.isAssignableFrom(cls);
    }

    @Override // com.p7700g.p99005.in4
    /* renamed from: k */
    public Document b(Class<Document> cls, Type type, Annotation[] annotationArr, tm4 tm4Var, um4<String, String> um4Var, InputStream inputStream) throws IOException {
        try {
            return this.b.getValue().newDocumentBuilder().parse(inputStream);
        } catch (ParserConfigurationException e) {
            throw new lm4(e, ym4.b.INTERNAL_SERVER_ERROR);
        } catch (SAXException e2) {
            throw new lm4(e2, ym4.b.BAD_REQUEST);
        }
    }

    @Override // com.p7700g.p99005.jn4
    /* renamed from: l */
    public void a(Document document, Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var, um4<String, Object> um4Var, OutputStream outputStream) throws IOException {
        try {
            this.c.getValue().newTransformer().transform(new DOMSource(document), new StreamResult(outputStream));
        } catch (TransformerException e) {
            throw new lm4(e, ym4.b.INTERNAL_SERVER_ERROR);
        }
    }
}