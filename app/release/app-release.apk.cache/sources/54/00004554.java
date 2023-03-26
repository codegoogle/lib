package com.p7700g.p99005;

import com.p7700g.p99005.ym4;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.UnmarshalException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.transform.stream.StreamSource;

/* compiled from: AbstractRootElementProvider.java */
/* loaded from: classes3.dex */
public abstract class gv3 extends ev3<Object> {
    public gv3(ln4 ln4Var) {
        super(ln4Var);
    }

    @Override // com.p7700g.p99005.jn4
    public final void a(Object obj, Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var, um4<String, Object> um4Var, OutputStream outputStream) throws IOException {
        try {
            Marshaller n = n(cls, tm4Var);
            Charset f = av3.f(tm4Var);
            if (f != av3.a) {
                n.setProperty("jaxb.encoding", f.name());
            }
            w(n, annotationArr);
            y(obj, tm4Var, f, n, outputStream);
        } catch (JAXBException e) {
            throw new lm4((Throwable) e, ym4.b.INTERNAL_SERVER_ERROR);
        }
    }

    @Override // com.p7700g.p99005.in4
    public final Object b(Class<Object> cls, Type type, Annotation[] annotationArr, tm4 tm4Var, um4<String, String> um4Var, InputStream inputStream) throws IOException {
        try {
            return x(cls, tm4Var, r(cls, tm4Var), inputStream);
        } catch (JAXBException e) {
            throw new lm4((Throwable) e, ym4.b.INTERNAL_SERVER_ERROR);
        } catch (UnmarshalException e2) {
            throw new lm4((Throwable) e2, ym4.b.BAD_REQUEST);
        }
    }

    @Override // com.p7700g.p99005.in4
    public boolean c(Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var) {
        return !(cls.getAnnotation(XmlRootElement.class) == null && cls.getAnnotation(XmlType.class) == null) && t(tm4Var);
    }

    @Override // com.p7700g.p99005.jn4
    public boolean e(Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var) {
        return cls.getAnnotation(XmlRootElement.class) != null && t(tm4Var);
    }

    public Object x(Class<Object> cls, tm4 tm4Var, Unmarshaller unmarshaller, InputStream inputStream) throws JAXBException {
        if (cls.isAnnotationPresent(XmlRootElement.class)) {
            return unmarshaller.unmarshal(inputStream);
        }
        return unmarshaller.unmarshal(new StreamSource(inputStream), cls).getValue();
    }

    public void y(Object obj, tm4 tm4Var, Charset charset, Marshaller marshaller, OutputStream outputStream) throws JAXBException {
        marshaller.marshal(obj, outputStream);
    }

    public gv3(ln4 ln4Var, tm4 tm4Var) {
        super(ln4Var, tm4Var);
    }
}