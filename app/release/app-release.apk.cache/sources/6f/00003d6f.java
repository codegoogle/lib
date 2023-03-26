package com.p7700g.p99005;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.SAXParserFactory;

/* compiled from: XMLJAXBElementProvider.java */
/* loaded from: classes3.dex */
public class cu3 extends dv3 {
    private final iy3<SAXParserFactory> j;

    /* compiled from: XMLJAXBElementProvider.java */
    @jm4({tm4.j})
    @tl4({tm4.j})
    /* loaded from: classes3.dex */
    public static final class a extends cu3 {
        public a(@om4 iy3<SAXParserFactory> iy3Var, @om4 ln4 ln4Var) {
            super(iy3Var, ln4Var, tm4.k);
        }
    }

    /* compiled from: XMLJAXBElementProvider.java */
    @jm4({tm4.h})
    @tl4({tm4.h})
    /* loaded from: classes3.dex */
    public static final class b extends cu3 {
        public b(@om4 iy3<SAXParserFactory> iy3Var, @om4 ln4 ln4Var) {
            super(iy3Var, ln4Var);
        }

        @Override // com.p7700g.p99005.ev3
        public boolean t(tm4 tm4Var) {
            return tm4Var.c().endsWith("+xml");
        }
    }

    /* compiled from: XMLJAXBElementProvider.java */
    @jm4({tm4.B})
    @tl4({tm4.B})
    /* loaded from: classes3.dex */
    public static final class c extends cu3 {
        public c(@om4 iy3<SAXParserFactory> iy3Var, @om4 ln4 ln4Var) {
            super(iy3Var, ln4Var, tm4.C);
        }
    }

    public cu3(iy3<SAXParserFactory> iy3Var, ln4 ln4Var) {
        super(ln4Var);
        this.j = iy3Var;
    }

    @Override // com.p7700g.p99005.dv3
    public final void A(JAXBElement<?> jAXBElement, tm4 tm4Var, Charset charset, Marshaller marshaller, OutputStream outputStream) throws JAXBException {
        marshaller.marshal(jAXBElement, outputStream);
    }

    @Override // com.p7700g.p99005.dv3
    public final JAXBElement<?> y(Class<?> cls, tm4 tm4Var, Unmarshaller unmarshaller, InputStream inputStream) throws JAXBException {
        return unmarshaller.unmarshal(ev3.o(this.j.getValue(), inputStream), cls);
    }

    public cu3(iy3<SAXParserFactory> iy3Var, ln4 ln4Var, tm4 tm4Var) {
        super(ln4Var, tm4Var);
        this.j = iy3Var;
    }
}