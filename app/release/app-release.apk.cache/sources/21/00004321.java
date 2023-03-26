package com.p7700g.p99005;

import com.p7700g.p99005.ym4;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.UnmarshalException;
import javax.xml.parsers.SAXParserFactory;

/* compiled from: XMLRootObjectProvider.java */
/* loaded from: classes3.dex */
public class fu3 extends ev3<Object> {
    private final iy3<SAXParserFactory> j;

    /* compiled from: XMLRootObjectProvider.java */
    @jm4({tm4.j})
    @tl4({tm4.j})
    /* loaded from: classes3.dex */
    public static final class a extends fu3 {
        public a(@om4 iy3<SAXParserFactory> iy3Var, @om4 ln4 ln4Var) {
            super(iy3Var, ln4Var, tm4.k);
        }
    }

    /* compiled from: XMLRootObjectProvider.java */
    @jm4({tm4.h})
    @tl4({tm4.h})
    /* loaded from: classes3.dex */
    public static final class b extends fu3 {
        public b(@om4 iy3<SAXParserFactory> iy3Var, @om4 ln4 ln4Var) {
            super(iy3Var, ln4Var);
        }

        @Override // com.p7700g.p99005.ev3
        public boolean t(tm4 tm4Var) {
            return tm4Var.c().endsWith("+xml");
        }
    }

    /* compiled from: XMLRootObjectProvider.java */
    @jm4({tm4.B})
    @tl4({tm4.B})
    /* loaded from: classes3.dex */
    public static final class c extends fu3 {
        public c(@om4 iy3<SAXParserFactory> iy3Var, @om4 ln4 ln4Var) {
            super(iy3Var, ln4Var, tm4.C);
        }
    }

    public fu3(iy3<SAXParserFactory> iy3Var, ln4 ln4Var) {
        super(ln4Var);
        this.j = iy3Var;
    }

    @Override // com.p7700g.p99005.jn4
    public void a(Object obj, Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var, um4<String, Object> um4Var, OutputStream outputStream) throws IOException, lm4 {
        throw new IllegalArgumentException();
    }

    @Override // com.p7700g.p99005.in4
    public Object b(Class<Object> cls, Type type, Annotation[] annotationArr, tm4 tm4Var, um4<String, String> um4Var, InputStream inputStream) throws IOException {
        try {
            return r(cls, tm4Var).unmarshal(ev3.o(this.j.getValue(), inputStream));
        } catch (JAXBException e) {
            throw new lm4((Throwable) e, ym4.b.INTERNAL_SERVER_ERROR);
        } catch (UnmarshalException e2) {
            throw new lm4((Throwable) e2, ym4.b.BAD_REQUEST);
        }
    }

    @Override // com.p7700g.p99005.in4
    public boolean c(Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var) {
        if (Object.class == cls) {
            try {
                if (t(tm4Var)) {
                    if (r(cls, tm4Var) != null) {
                        return true;
                    }
                }
            } catch (JAXBException e) {
                throw new RuntimeException(rx3.J(cls), e);
            }
        }
        return false;
    }

    @Override // com.p7700g.p99005.jn4
    public boolean e(Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var) {
        return false;
    }

    @Override // com.p7700g.p99005.ev3
    public JAXBContext p(Class cls) throws JAXBException {
        return null;
    }

    public fu3(iy3<SAXParserFactory> iy3Var, ln4 ln4Var, tm4 tm4Var) {
        super(ln4Var, tm4Var);
        this.j = iy3Var;
    }
}