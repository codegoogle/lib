package com.p7700g.p99005;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

/* compiled from: XMLListElementProvider.java */
/* loaded from: classes3.dex */
public class du3 extends fv3 {
    private final iy3<XMLInputFactory> m;

    /* compiled from: XMLListElementProvider.java */
    @jm4({tm4.j})
    @tl4({tm4.j})
    /* loaded from: classes3.dex */
    public static final class a extends du3 {
        public a(@om4 iy3<XMLInputFactory> iy3Var, @om4 ln4 ln4Var) {
            super(iy3Var, ln4Var, tm4.k);
        }
    }

    /* compiled from: XMLListElementProvider.java */
    @jm4({tm4.h})
    @tl4({tm4.h})
    /* loaded from: classes3.dex */
    public static final class b extends du3 {
        public b(@om4 iy3<XMLInputFactory> iy3Var, @om4 ln4 ln4Var) {
            super(iy3Var, ln4Var);
        }

        @Override // com.p7700g.p99005.ev3
        public boolean t(tm4 tm4Var) {
            return tm4Var.c().endsWith("+xml");
        }
    }

    /* compiled from: XMLListElementProvider.java */
    @jm4({tm4.B})
    @tl4({tm4.B})
    /* loaded from: classes3.dex */
    public static final class c extends du3 {
        public c(@om4 iy3<XMLInputFactory> iy3Var, @om4 ln4 ln4Var) {
            super(iy3Var, ln4Var, tm4.C);
        }
    }

    public du3(iy3<XMLInputFactory> iy3Var, ln4 ln4Var) {
        super(ln4Var);
        this.m = iy3Var;
    }

    @Override // com.p7700g.p99005.fv3
    public final XMLStreamReader C(Class<?> cls, tm4 tm4Var, Unmarshaller unmarshaller, InputStream inputStream) throws XMLStreamException {
        return this.m.getValue().createXMLStreamReader(inputStream);
    }

    @Override // com.p7700g.p99005.fv3
    public final void I(Class<?> cls, Collection<?> collection, tm4 tm4Var, Charset charset, Marshaller marshaller, OutputStream outputStream) throws JAXBException, IOException {
        String str;
        String B = B(cls);
        String name = charset.name();
        outputStream.write(String.format("<?xml version=\"1.0\" encoding=\"%s\" standalone=\"yes\"?>", name).getBytes(name));
        String str2 = "com.sun.xml.bind.xmlHeaders";
        try {
            str = (String) marshaller.getProperty("com.sun.xml.bind.xmlHeaders");
        } catch (PropertyException unused) {
            str2 = "com.sun.xml.internal.bind.xmlHeaders";
            try {
                str = (String) marshaller.getProperty("com.sun.xml.internal.bind.xmlHeaders");
            } catch (PropertyException unused2) {
                str = null;
                Logger.getLogger(du3.class.getName()).log(Level.WARNING, "@XmlHeader annotation is not supported with this JAXB implementation. Please use JAXB RI if you need this feature.");
            }
        }
        if (str != null) {
            marshaller.setProperty(str2, "");
            outputStream.write(str.getBytes(name));
        }
        outputStream.write(String.format("<%s>", B).getBytes(name));
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            marshaller.marshal(it.next(), outputStream);
        }
        outputStream.write(String.format("</%s>", B).getBytes(name));
    }

    public du3(iy3<XMLInputFactory> iy3Var, ln4 ln4Var, tm4 tm4Var) {
        super(ln4Var, tm4Var);
        this.m = iy3Var;
    }
}