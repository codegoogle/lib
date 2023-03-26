package com.p7700g.p99005;

import com.p7700g.p99005.ym4;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.UnmarshalException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

/* compiled from: AbstractListElementProvider.java */
/* loaded from: classes3.dex */
public abstract class fv3 extends ev3<Object> {
    private static final Class[] j = {ArrayList.class, LinkedList.class, HashSet.class, TreeSet.class, Stack.class};
    private static final b k = new a();
    private final ut3 l;

    /* compiled from: AbstractListElementProvider.java */
    /* loaded from: classes3.dex */
    public static class a implements b {
        @Override // com.p7700g.p99005.fv3.b
        public boolean a(Class cls) {
            return cls.isAnnotationPresent(XmlRootElement.class) || cls.isAnnotationPresent(XmlType.class);
        }
    }

    /* compiled from: AbstractListElementProvider.java */
    /* loaded from: classes3.dex */
    public interface b {
        boolean a(Class cls);
    }

    public fv3(ln4 ln4Var) {
        super(ln4Var);
        this.l = ut3.o();
    }

    private static boolean D(Class cls) {
        return E(cls, k);
    }

    public static boolean E(Class cls, b bVar) {
        Class<?> componentType = cls.getComponentType();
        return bVar.a(componentType) || JAXBElement.class.isAssignableFrom(componentType);
    }

    public static boolean F(Class<?> cls) {
        try {
            if (Collection.class.isAssignableFrom(cls)) {
                for (Class<?> cls2 : j) {
                    if (cls.isAssignableFrom(cls2)) {
                        return true;
                    }
                }
                if (Modifier.isAbstract(cls.getModifiers())) {
                    return false;
                }
                return Modifier.isPublic(cls.getConstructor(new Class[0]).getModifiers());
            }
        } catch (NoSuchMethodException e) {
            Logger.getLogger(fv3.class.getName()).log(Level.SEVERE, (String) null, (Throwable) e);
        } catch (SecurityException e2) {
            Logger.getLogger(fv3.class.getName()).log(Level.SEVERE, (String) null, (Throwable) e2);
        }
        return false;
    }

    private static boolean G(Type type) {
        return H(type, k);
    }

    public static boolean H(Type type, b bVar) {
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            if (parameterizedType.getActualTypeArguments().length > 1) {
                return false;
            }
            Type type2 = parameterizedType.getActualTypeArguments()[0];
            if (type2 instanceof ParameterizedType) {
                ParameterizedType parameterizedType2 = (ParameterizedType) type2;
                return (parameterizedType2.getRawType() instanceof Class) && JAXBElement.class.isAssignableFrom((Class) parameterizedType2.getRawType());
            } else if (parameterizedType.getActualTypeArguments()[0] instanceof Class) {
                return bVar.a((Class) parameterizedType.getActualTypeArguments()[0]);
            } else {
                return false;
            }
        }
        return false;
    }

    private String x(String str) {
        return str.replace("$", "_");
    }

    private Object y(List list, Class cls) {
        Object newInstance = Array.newInstance(cls, list.size());
        for (int i = 0; i < list.size(); i++) {
            Array.set(newInstance, i, list.get(i));
        }
        return newInstance;
    }

    public final String A(Class<?> cls) {
        String name = cls.getName();
        XmlRootElement annotation = cls.getAnnotation(XmlRootElement.class);
        return (annotation == null || annotation.name().equals("##default")) ? name : annotation.name();
    }

    public final String B(Class<?> cls) {
        if (u()) {
            ut3 ut3Var = this.l;
            return x(ut3Var.r(ut3Var.l(A(cls))));
        }
        ut3 ut3Var2 = this.l;
        return x(ut3Var2.k(ut3Var2.r(ut3Var2.l(cls.getName()))));
    }

    public abstract XMLStreamReader C(Class<?> cls, tm4 tm4Var, Unmarshaller unmarshaller, InputStream inputStream) throws XMLStreamException;

    public abstract void I(Class<?> cls, Collection<?> collection, tm4 tm4Var, Charset charset, Marshaller marshaller, OutputStream outputStream) throws JAXBException, IOException;

    @Override // com.p7700g.p99005.jn4
    public final void a(Object obj, Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var, um4<String, Object> um4Var, OutputStream outputStream) throws IOException {
        try {
            Collection<?> asList = cls.isArray() ? Arrays.asList((Object[]) obj) : (Collection) obj;
            Class z = z(cls, type);
            Charset f = av3.f(tm4Var);
            String name = f.name();
            Marshaller n = n(z, tm4Var);
            n.setProperty("jaxb.fragment", Boolean.TRUE);
            if (f != av3.a) {
                n.setProperty("jaxb.encoding", name);
            }
            w(n, annotationArr);
            I(z, asList, tm4Var, f, n, outputStream);
        } catch (JAXBException e) {
            throw new lm4((Throwable) e, ym4.b.INTERNAL_SERVER_ERROR);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.Collection] */
    @Override // com.p7700g.p99005.in4
    public final Object b(Class<Object> cls, Type type, Annotation[] annotationArr, tm4 tm4Var, um4<String, String> um4Var, InputStream inputStream) throws IOException {
        try {
            Class<JAXBElement> z = z(cls, type);
            Unmarshaller r = r(z, tm4Var);
            XMLStreamReader C = C(z, tm4Var, r, inputStream);
            boolean z2 = false;
            ArrayList arrayList = null;
            if (cls.isArray()) {
                arrayList = new ArrayList();
            } else {
                try {
                    arrayList = (Collection) cls.newInstance();
                } catch (Exception unused) {
                    Class<?>[] clsArr = j;
                    int length = clsArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        Class<?> cls2 = clsArr[i];
                        if (cls.isAssignableFrom(cls2)) {
                            try {
                                arrayList = (Collection) cls2.newInstance();
                                break;
                            } catch (IllegalAccessException e) {
                                Logger.getLogger(fv3.class.getName()).log(Level.SEVERE, (String) null, (Throwable) e);
                                i++;
                            } catch (InstantiationException e2) {
                                Logger.getLogger(fv3.class.getName()).log(Level.SEVERE, (String) null, (Throwable) e2);
                                i++;
                            }
                        }
                        i++;
                    }
                }
            }
            for (int next = C.next(); next != 1; next = C.next()) {
            }
            int next2 = C.next();
            while (next2 != 1 && next2 != 8) {
                next2 = C.next();
            }
            while (next2 != 8) {
                if (z.isAnnotationPresent(XmlRootElement.class)) {
                    arrayList.add(r.unmarshal(C));
                } else if (z.isAnnotationPresent(XmlType.class)) {
                    arrayList.add(r.unmarshal(C, z).getValue());
                } else {
                    arrayList.add(r.unmarshal(C, z));
                    z2 = true;
                }
                next2 = C.getEventType();
                while (next2 != 1 && next2 != 8) {
                    next2 = C.next();
                }
            }
            if (cls.isArray()) {
                ArrayList arrayList2 = arrayList;
                if (z2) {
                    z = JAXBElement.class;
                }
                return y(arrayList2, z);
            }
            return arrayList;
        } catch (JAXBException e3) {
            throw new lm4((Throwable) e3, ym4.b.INTERNAL_SERVER_ERROR);
        } catch (XMLStreamException e4) {
            throw new lm4((Throwable) e4, ym4.b.BAD_REQUEST);
        } catch (UnmarshalException e5) {
            throw new lm4((Throwable) e5, ym4.b.BAD_REQUEST);
        }
    }

    @Override // com.p7700g.p99005.in4
    public boolean c(Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var) {
        return F(cls) ? G(type) && t(tm4Var) : cls.isArray() && D(cls) && t(tm4Var);
    }

    @Override // com.p7700g.p99005.jn4
    public boolean e(Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var) {
        return Collection.class.isAssignableFrom(cls) ? G(type) && t(tm4Var) : cls.isArray() && D(cls) && t(tm4Var);
    }

    public Class z(Class<?> cls, Type type) {
        Type componentType;
        if (type instanceof ParameterizedType) {
            componentType = ((ParameterizedType) type).getActualTypeArguments()[0];
        } else if (type instanceof GenericArrayType) {
            componentType = ((GenericArrayType) type).getGenericComponentType();
        } else {
            componentType = cls.getComponentType();
        }
        if (componentType instanceof ParameterizedType) {
            componentType = ((ParameterizedType) componentType).getActualTypeArguments()[0];
        }
        return (Class) componentType;
    }

    public fv3(ln4 ln4Var, tm4 tm4Var) {
        super(ln4Var, tm4Var);
        this.l = ut3.o();
    }
}