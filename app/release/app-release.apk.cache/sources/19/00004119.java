package com.p7700g.p99005;

import java.io.InputStream;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.sax.SAXSource;

/* compiled from: XMLRootElementProvider.java */
/* loaded from: classes3.dex */
public class eu3 extends gv3 {
    private final iy3<SAXParserFactory> j;

    /* compiled from: XMLRootElementProvider.java */
    @jm4({tm4.j})
    @tl4({tm4.j})
    /* loaded from: classes3.dex */
    public static final class a extends eu3 {
        public a(@om4 iy3<SAXParserFactory> iy3Var, @om4 ln4 ln4Var) {
            super(iy3Var, ln4Var, tm4.k);
        }
    }

    /* compiled from: XMLRootElementProvider.java */
    @jm4({tm4.h})
    @tl4({tm4.h})
    /* loaded from: classes3.dex */
    public static final class b extends eu3 {
        public b(@om4 iy3<SAXParserFactory> iy3Var, @om4 ln4 ln4Var) {
            super(iy3Var, ln4Var);
        }

        @Override // com.p7700g.p99005.ev3
        public boolean t(tm4 tm4Var) {
            return tm4Var.c().endsWith("+xml");
        }
    }

    /* compiled from: XMLRootElementProvider.java */
    @jm4({tm4.B})
    @tl4({tm4.B})
    /* loaded from: classes3.dex */
    public static final class c extends eu3 {
        public c(@om4 iy3<SAXParserFactory> iy3Var, @om4 ln4 ln4Var) {
            super(iy3Var, ln4Var, tm4.C);
        }
    }

    public eu3(iy3<SAXParserFactory> iy3Var, ln4 ln4Var) {
        super(ln4Var);
        this.j = iy3Var;
    }

    @Override // com.p7700g.p99005.gv3
    public Object x(Class<Object> cls, tm4 tm4Var, Unmarshaller unmarshaller, InputStream inputStream) throws JAXBException {
        SAXSource o = ev3.o(this.j.getValue(), inputStream);
        if (cls.isAnnotationPresent(XmlRootElement.class)) {
            return unmarshaller.unmarshal(o);
        }
        return unmarshaller.unmarshal(o, cls).getValue();
    }

    public eu3(iy3<SAXParserFactory> iy3Var, ln4 ln4Var, tm4 tm4Var) {
        super(ln4Var, tm4Var);
        this.j = iy3Var;
    }
}