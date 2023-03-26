package com.p7700g.p99005;

import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.sax.SAXSource;
import org.xml.sax.InputSource;

/* compiled from: AbstractJAXBProvider.java */
/* loaded from: classes3.dex */
public abstract class ev3<T> extends av3<T> {
    private static final Map<Class<?>, WeakReference<JAXBContext>> b = new WeakHashMap();
    private final ln4 c;
    private final boolean d;
    private final fn4<JAXBContext> e;
    private final fn4<Unmarshaller> f;
    private final fn4<Marshaller> g;
    private boolean h;
    private boolean i;

    public ev3(ln4 ln4Var) {
        this(ln4Var, null);
    }

    private JAXBContext l(Class cls, tm4 tm4Var) throws JAXBException {
        JAXBContext jAXBContext;
        fn4<T> c = this.c.c(JAXBContext.class, tm4Var);
        return (c == null || (jAXBContext = (JAXBContext) c.a(cls)) == null) ? p(cls) : jAXBContext;
    }

    private Marshaller m(Class cls) throws JAXBException {
        Marshaller a;
        fn4<Marshaller> fn4Var = this.g;
        if (fn4Var == null || (a = fn4Var.a(cls)) == null) {
            Marshaller createMarshaller = k(cls).createMarshaller();
            boolean z = this.h;
            if (z) {
                createMarshaller.setProperty("jaxb.formatted.output", Boolean.valueOf(z));
            }
            return createMarshaller;
        }
        return a;
    }

    public static SAXSource o(SAXParserFactory sAXParserFactory, InputStream inputStream) throws JAXBException {
        try {
            return new SAXSource(sAXParserFactory.newSAXParser().getXMLReader(), new InputSource(inputStream));
        } catch (Exception e) {
            throw new JAXBException("Error creating SAXSource", e);
        }
    }

    private Unmarshaller q(Class cls) throws JAXBException {
        Unmarshaller a;
        fn4<Unmarshaller> fn4Var = this.f;
        return (fn4Var == null || (a = fn4Var.a(cls)) == null) ? k(cls).createUnmarshaller() : a;
    }

    public JAXBContext k(Class cls) throws JAXBException {
        JAXBContext a;
        fn4<JAXBContext> fn4Var = this.e;
        return (fn4Var == null || (a = fn4Var.a(cls)) == null) ? p(cls) : a;
    }

    public final Marshaller n(Class cls, tm4 tm4Var) throws JAXBException {
        Marshaller marshaller;
        if (this.d) {
            return m(cls);
        }
        fn4<T> c = this.c.c(Marshaller.class, tm4Var);
        if (c == null || (marshaller = (Marshaller) c.a(cls)) == null) {
            Marshaller createMarshaller = l(cls, tm4Var).createMarshaller();
            boolean z = this.h;
            if (z) {
                createMarshaller.setProperty("jaxb.formatted.output", Boolean.valueOf(z));
            }
            return createMarshaller;
        }
        return marshaller;
    }

    public JAXBContext p(Class cls) throws JAXBException {
        JAXBContext jAXBContext;
        Map<Class<?>, WeakReference<JAXBContext>> map = b;
        synchronized (map) {
            WeakReference<JAXBContext> weakReference = map.get(cls);
            jAXBContext = weakReference != null ? weakReference.get() : null;
            if (jAXBContext == null) {
                jAXBContext = JAXBContext.newInstance(new Class[]{cls});
                map.put(cls, new WeakReference<>(jAXBContext));
            }
        }
        return jAXBContext;
    }

    public final Unmarshaller r(Class cls, tm4 tm4Var) throws JAXBException {
        Unmarshaller unmarshaller;
        if (this.d) {
            return q(cls);
        }
        fn4<T> c = this.c.c(Unmarshaller.class, tm4Var);
        return (c == null || (unmarshaller = (Unmarshaller) c.a(cls)) == null) ? l(cls, tm4Var).createUnmarshaller() : unmarshaller;
    }

    public boolean s() {
        return this.h;
    }

    public boolean t(tm4 tm4Var) {
        return true;
    }

    public boolean u() {
        return this.i;
    }

    @om4
    public void v(ax3 ax3Var) {
        this.h = ax3Var.c(ax3.b);
        this.i = ax3Var.c(ax3.c);
    }

    public void w(Marshaller marshaller, Annotation[] annotationArr) throws PropertyException {
        for (Annotation annotation : annotationArr) {
            if (annotation instanceof js3) {
                try {
                    try {
                        marshaller.setProperty("com.sun.xml.bind.xmlHeaders", ((js3) annotation).value());
                        return;
                    } catch (PropertyException unused) {
                        Logger.getLogger(ev3.class.getName()).log(Level.WARNING, "@XmlHeader annotation is not supported with this JAXB implementation. Please use JAXB RI if you need this feature.");
                        return;
                    }
                } catch (PropertyException unused2) {
                    marshaller.setProperty("com.sun.xml.internal.bind.xmlHeaders", ((js3) annotation).value());
                    return;
                }
            }
        }
    }

    public ev3(ln4 ln4Var, tm4 tm4Var) {
        this.h = false;
        this.i = false;
        this.c = ln4Var;
        boolean z = tm4Var != null;
        this.d = z;
        if (z) {
            this.e = ln4Var.c(JAXBContext.class, tm4Var);
            this.f = ln4Var.c(Unmarshaller.class, tm4Var);
            this.g = ln4Var.c(Marshaller.class, tm4Var);
            return;
        }
        this.e = null;
        this.f = null;
        this.g = null;
    }
}