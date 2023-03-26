package com.p7700g.p99005;

import com.p7700g.p99005.ym4;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.UnmarshalException;
import javax.xml.bind.Unmarshaller;

/* compiled from: AbstractJAXBElementProvider.java */
/* loaded from: classes3.dex */
public abstract class dv3 extends ev3<JAXBElement<?>> {
    public dv3(ln4 ln4Var) {
        super(ln4Var);
    }

    public abstract void A(JAXBElement<?> jAXBElement, tm4 tm4Var, Charset charset, Marshaller marshaller, OutputStream outputStream) throws JAXBException;

    @Override // com.p7700g.p99005.in4
    public boolean c(Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var) {
        return cls == JAXBElement.class && (type instanceof ParameterizedType) && t(tm4Var);
    }

    @Override // com.p7700g.p99005.jn4
    public boolean e(Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var) {
        return JAXBElement.class.isAssignableFrom(cls) && t(tm4Var);
    }

    @Override // com.p7700g.p99005.in4
    /* renamed from: x */
    public final JAXBElement<?> b(Class<JAXBElement<?>> cls, Type type, Annotation[] annotationArr, tm4 tm4Var, um4<String, String> um4Var, InputStream inputStream) throws IOException {
        Class cls2 = (Class) ((ParameterizedType) type).getActualTypeArguments()[0];
        try {
            return y(cls2, tm4Var, r(cls2, tm4Var), inputStream);
        } catch (JAXBException e) {
            throw new lm4((Throwable) e, ym4.b.INTERNAL_SERVER_ERROR);
        } catch (UnmarshalException e2) {
            throw new lm4((Throwable) e2, ym4.b.BAD_REQUEST);
        }
    }

    public abstract JAXBElement<?> y(Class<?> cls, tm4 tm4Var, Unmarshaller unmarshaller, InputStream inputStream) throws JAXBException;

    @Override // com.p7700g.p99005.jn4
    /* renamed from: z */
    public final void a(JAXBElement<?> jAXBElement, Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var, um4<String, Object> um4Var, OutputStream outputStream) throws IOException {
        try {
            Marshaller n = n(jAXBElement.getDeclaredType(), tm4Var);
            Charset f = av3.f(tm4Var);
            if (f != av3.a) {
                n.setProperty("jaxb.encoding", f.name());
            }
            w(n, annotationArr);
            A(jAXBElement, tm4Var, f, n, outputStream);
        } catch (JAXBException e) {
            throw new lm4((Throwable) e, ym4.b.INTERNAL_SERVER_ERROR);
        }
    }

    public dv3(ln4 ln4Var, tm4 tm4Var) {
        super(ln4Var, tm4Var);
    }
}