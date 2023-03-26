package com.p7700g.p99005;

import com.microsoft.appcenter.AppCenter;
import com.p7700g.p99005.ms3;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;

/* compiled from: UriBuilderImpl.java */
/* loaded from: classes3.dex */
public class ls3 extends bn4 {
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private int f;
    private final StringBuilder g;
    private um4<String, String> h;
    private final StringBuilder i;
    private um4<String, String> j;
    private String k;

    public ls3() {
        this.f = -1;
        this.g = new StringBuilder();
        this.i = new StringBuilder();
    }

    private URI D(boolean z, Object... objArr) {
        if (objArr != null && objArr.length != 0) {
            if (this.b == null) {
                M();
                N();
                String str = this.a;
                String str2 = this.c;
                String str3 = this.d;
                String str4 = this.e;
                int i = this.f;
                return K(os3.c(str, str2, str3, str4, i != -1 ? String.valueOf(i) : null, this.g.toString(), this.i.toString(), this.k, objArr, z));
            }
            throw new IllegalArgumentException("Schema specific part is opaque");
        }
        return K(J());
    }

    private URI E(boolean z, Map<String, ? extends Object> map) {
        if (this.b == null) {
            M();
            N();
            String str = this.a;
            String str2 = this.c;
            String str3 = this.d;
            String str4 = this.e;
            int i = this.f;
            return K(os3.b(str, str2, str3, str4, i != -1 ? String.valueOf(i) : null, this.g.toString(), this.i.toString(), this.k, map, z));
        }
        throw new IllegalArgumentException("Schema specific part is opaque");
    }

    private void F(String str) {
        G(str, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void G(String str, boolean z) {
        boolean z2;
        if (str != null) {
            if (str.length() == 0) {
                return;
            }
            M();
            String L = L(str, z ? ms3.c.PATH_SEGMENT : ms3.c.PATH);
            if (this.g.length() > 0) {
                StringBuilder sb = this.g;
                if (sb.charAt(sb.length() - 1) == '/') {
                    z2 = true;
                    boolean z3 = L.charAt(0) == '/';
                    if (this.g.length() <= 0 && !z2 && !z3) {
                        this.g.append(j14.P);
                    } else if (z2 && z3) {
                        L = L.substring(1);
                        if (L.length() == 0) {
                            return;
                        }
                    }
                    this.g.append(L);
                    return;
                }
            }
            z2 = false;
            if (L.charAt(0) == '/') {
            }
            if (this.g.length() <= 0) {
            }
            if (z2) {
                L = L.substring(1);
                if (L.length() == 0) {
                }
            }
            this.g.append(L);
            return;
        }
        throw new IllegalArgumentException("Path segment is null");
    }

    private void H(hm4 hm4Var) {
        if (hm4Var != null) {
            F(hm4Var.value());
            return;
        }
        throw new IllegalArgumentException("Path is null");
    }

    private void I() {
        if (this.b != null) {
            throw new IllegalArgumentException("Schema specific part is opaque");
        }
    }

    private String J() {
        M();
        N();
        StringBuilder sb = new StringBuilder();
        String str = this.a;
        if (str != null) {
            sb.append(str);
            sb.append(':');
        }
        String str2 = this.b;
        if (str2 != null) {
            sb.append(str2);
        } else {
            if (this.d == null && this.e == null && this.f == -1) {
                if (this.c != null) {
                    sb.append("//");
                    sb.append(this.c);
                }
            } else {
                sb.append("//");
                String str3 = this.d;
                if (str3 != null && str3.length() > 0) {
                    sb.append(this.d);
                    sb.append('@');
                }
                String str4 = this.e;
                if (str4 != null) {
                    sb.append(str4);
                }
                if (this.f != -1) {
                    sb.append(':');
                    sb.append(this.f);
                }
            }
            if (this.g.length() > 0) {
                if (sb.length() > 0 && this.g.charAt(0) != '/') {
                    sb.append("/");
                }
                sb.append((CharSequence) this.g);
            }
            if (this.i.length() > 0) {
                sb.append('?');
                sb.append((CharSequence) this.i);
            }
        }
        String str5 = this.k;
        if (str5 != null && str5.length() > 0) {
            sb.append('#');
            sb.append(this.k);
        }
        return ms3.z(sb.toString());
    }

    private URI K(String str) {
        try {
            return new URI(str);
        } catch (URISyntaxException e) {
            throw new cn4(e);
        }
    }

    private String L(String str, ms3.c cVar) {
        return ms3.f(str, cVar, true);
    }

    private void M() {
        um4<String, String> um4Var = this.h;
        if (um4Var == null || um4Var.isEmpty()) {
            return;
        }
        for (Map.Entry<String, String> entry : this.h.entrySet()) {
            String key = entry.getKey();
            for (String str : (List) entry.getValue()) {
                StringBuilder sb = this.g;
                sb.append(';');
                sb.append(key);
                if (str.length() > 0) {
                    StringBuilder sb2 = this.g;
                    sb2.append('=');
                    sb2.append(str);
                }
            }
        }
        this.h = null;
    }

    private void N() {
        um4<String, String> um4Var = this.j;
        if (um4Var == null || um4Var.isEmpty()) {
            return;
        }
        for (Map.Entry<String, String> entry : this.j.entrySet()) {
            String key = entry.getKey();
            for (String str : (List) entry.getValue()) {
                if (this.i.length() > 0) {
                    this.i.append(h95.d);
                }
                wo1.d0(this.i, key, '=', str);
            }
        }
        this.j = null;
    }

    private hm4 O(AnnotatedElement annotatedElement) {
        hm4 hm4Var = (hm4) annotatedElement.getAnnotation(hm4.class);
        if (hm4Var != null) {
            return hm4Var;
        }
        throw new IllegalArgumentException("The annotated element, " + annotatedElement + " is not annotated with @Path");
    }

    private String P(String str) {
        return str != null ? str : "";
    }

    @Override // com.p7700g.p99005.bn4
    public bn4 A(String... strArr) throws IllegalArgumentException {
        I();
        if (strArr != null) {
            for (String str : strArr) {
                G(str, true);
            }
            return this;
        }
        throw new IllegalArgumentException("Segments parameter is null");
    }

    @Override // com.p7700g.p99005.bn4
    public bn4 B(URI uri) {
        if (uri != null) {
            if (uri.getRawFragment() != null) {
                this.k = uri.getRawFragment();
            }
            if (uri.isOpaque()) {
                this.a = uri.getScheme();
                this.b = uri.getRawSchemeSpecificPart();
                return this;
            }
            if (uri.getScheme() == null) {
                if (this.b != null && uri.getRawSchemeSpecificPart() != null) {
                    this.b = uri.getRawSchemeSpecificPart();
                    return this;
                }
            } else {
                this.a = uri.getScheme();
            }
            this.b = null;
            if (uri.getRawAuthority() != null) {
                if (uri.getRawUserInfo() == null && uri.getHost() == null && uri.getPort() == -1) {
                    this.c = uri.getRawAuthority();
                    this.d = null;
                    this.e = null;
                    this.f = -1;
                } else {
                    this.c = null;
                    if (uri.getRawUserInfo() != null) {
                        this.d = uri.getRawUserInfo();
                    }
                    if (uri.getHost() != null) {
                        this.e = uri.getHost();
                    }
                    if (uri.getPort() != -1) {
                        this.f = uri.getPort();
                    }
                }
            }
            if (uri.getRawPath() != null && uri.getRawPath().length() > 0) {
                this.g.setLength(0);
                this.g.append(uri.getRawPath());
            }
            if (uri.getRawQuery() != null && uri.getRawQuery().length() > 0) {
                this.i.setLength(0);
                this.i.append(uri.getRawQuery());
            }
            return this;
        }
        throw new IllegalArgumentException("URI parameter is null");
    }

    @Override // com.p7700g.p99005.bn4
    public bn4 C(String str) {
        I();
        this.d = str != null ? L(str, ms3.c.USER_INFO) : null;
        return this;
    }

    @Override // com.p7700g.p99005.bn4
    public URI a(Object... objArr) {
        return D(true, objArr);
    }

    @Override // com.p7700g.p99005.bn4
    public URI b(Object... objArr) {
        return D(false, objArr);
    }

    @Override // com.p7700g.p99005.bn4
    public URI c(Map<String, ? extends Object> map) throws IllegalArgumentException, cn4 {
        return E(false, map);
    }

    @Override // com.p7700g.p99005.bn4
    public URI d(Map<String, ? extends Object> map) {
        return E(true, map);
    }

    @Override // com.p7700g.p99005.bn4
    /* renamed from: e */
    public bn4 clone() {
        return new ls3(this);
    }

    @Override // com.p7700g.p99005.bn4
    public bn4 f(String str) {
        this.k = str != null ? L(str, ms3.c.FRAGMENT) : null;
        return this;
    }

    @Override // com.p7700g.p99005.bn4
    public bn4 k(String str) {
        I();
        if (str != null) {
            if (str.length() != 0) {
                this.e = L(str, ms3.c.HOST);
            } else {
                throw new IllegalArgumentException("Invalid host name");
            }
        } else {
            this.e = null;
        }
        return this;
    }

    @Override // com.p7700g.p99005.bn4
    public bn4 l(String str, Object... objArr) {
        I();
        if (str != null) {
            if (objArr != null) {
                if (objArr.length == 0) {
                    return this;
                }
                String L = L(str, ms3.c.MATRIX_PARAM);
                int i = 0;
                if (this.h == null) {
                    int length = objArr.length;
                    while (i < length) {
                        Object obj = objArr[i];
                        StringBuilder sb = this.g;
                        sb.append(';');
                        sb.append(L);
                        if (obj != null) {
                            String obj2 = obj.toString();
                            if (obj2.length() > 0) {
                                StringBuilder sb2 = this.g;
                                sb2.append('=');
                                sb2.append(L(obj2, ms3.c.MATRIX_PARAM));
                            }
                            i++;
                        } else {
                            throw new IllegalArgumentException("One or more of matrix value parameters are null");
                        }
                    }
                } else {
                    int length2 = objArr.length;
                    while (i < length2) {
                        Object obj3 = objArr[i];
                        if (obj3 != null) {
                            this.h.d(L, L(obj3.toString(), ms3.c.MATRIX_PARAM));
                            i++;
                        } else {
                            throw new IllegalArgumentException("One or more of matrix value parameters are null");
                        }
                    }
                }
                return this;
            }
            throw new IllegalArgumentException("Value parameter is null");
        }
        throw new IllegalArgumentException("Name parameter is null");
    }

    @Override // com.p7700g.p99005.bn4
    public bn4 n(Class cls) {
        I();
        if (cls != null) {
            hm4 hm4Var = (hm4) cls.getAnnotation(hm4.class);
            if (hm4Var != null) {
                H(hm4Var);
                return this;
            }
            throw new IllegalArgumentException("The class, " + cls + " is not annotated with @Path");
        }
        throw new IllegalArgumentException("Resource parameter is null");
    }

    @Override // com.p7700g.p99005.bn4
    public bn4 o(Class cls, String str) {
        Method[] methods;
        I();
        if (cls != null) {
            if (str != null) {
                Method method = null;
                for (Method method2 : cls.getMethods()) {
                    if (str.equals(method2.getName())) {
                        if (method != null) {
                            throw new IllegalArgumentException();
                        }
                        method = method2;
                    }
                }
                if (method != null) {
                    H(O(method));
                    return this;
                }
                throw new IllegalArgumentException("The method named, " + str + ", is not specified by " + cls);
            }
            throw new IllegalArgumentException("MethodName parameter is null");
        }
        throw new IllegalArgumentException("Resource parameter is null");
    }

    @Override // com.p7700g.p99005.bn4
    public bn4 p(String str) {
        I();
        F(str);
        return this;
    }

    @Override // com.p7700g.p99005.bn4
    public bn4 q(Method method) {
        I();
        if (method != null) {
            H(O(method));
            return this;
        }
        throw new IllegalArgumentException("Method is null");
    }

    @Override // com.p7700g.p99005.bn4
    public bn4 r(int i) {
        I();
        if (i >= -1) {
            this.f = i;
            return this;
        }
        throw new IllegalArgumentException("Invalid port value");
    }

    @Override // com.p7700g.p99005.bn4
    public bn4 s(String str, Object... objArr) {
        I();
        if (str != null) {
            if (objArr != null) {
                if (objArr.length == 0) {
                    return this;
                }
                String L = L(str, ms3.c.QUERY_PARAM);
                int i = 0;
                if (this.j == null) {
                    int length = objArr.length;
                    while (i < length) {
                        Object obj = objArr[i];
                        if (this.i.length() > 0) {
                            this.i.append(h95.d);
                        }
                        this.i.append(L);
                        if (obj != null) {
                            StringBuilder sb = this.i;
                            sb.append('=');
                            sb.append(L(obj.toString(), ms3.c.QUERY_PARAM));
                            i++;
                        } else {
                            throw new IllegalArgumentException("One or more of query value parameters are null");
                        }
                    }
                } else {
                    int length2 = objArr.length;
                    while (i < length2) {
                        Object obj2 = objArr[i];
                        if (obj2 != null) {
                            this.j.d(L, L(obj2.toString(), ms3.c.QUERY_PARAM));
                            i++;
                        } else {
                            throw new IllegalArgumentException("One or more of query value parameters are null");
                        }
                    }
                }
                return this;
            }
            throw new IllegalArgumentException("Value parameter is null");
        }
        throw new IllegalArgumentException("Name parameter is null");
    }

    @Override // com.p7700g.p99005.bn4
    public bn4 t(String str) {
        I();
        int lastIndexOf = this.g.lastIndexOf("/");
        if (lastIndexOf != -1) {
            lastIndexOf = 0;
        }
        int indexOf = this.g.indexOf(AppCenter.PAIR_DELIMITER, lastIndexOf);
        if (indexOf != -1) {
            this.g.setLength(indexOf + 1);
        } else {
            this.g.append(';');
        }
        if (str != null) {
            this.g.append(L(str, ms3.c.PATH));
        }
        return this;
    }

    @Override // com.p7700g.p99005.bn4
    public bn4 u(String str, Object... objArr) {
        I();
        if (str != null) {
            if (this.h == null) {
                int lastIndexOf = this.g.lastIndexOf("/");
                if (lastIndexOf != -1) {
                    lastIndexOf = 0;
                }
                this.h = ms3.l(lastIndexOf != -1 ? this.g.substring(lastIndexOf) : "", false);
                int indexOf = this.g.indexOf(AppCenter.PAIR_DELIMITER, lastIndexOf);
                if (indexOf != -1) {
                    this.g.setLength(indexOf);
                }
            }
            String L = L(str, ms3.c.MATRIX_PARAM);
            this.h.remove(L);
            if (objArr != null) {
                for (Object obj : objArr) {
                    if (obj != null) {
                        this.h.d(L, L(obj.toString(), ms3.c.MATRIX_PARAM));
                    } else {
                        throw new IllegalArgumentException("One or more of matrix value parameters are null");
                    }
                }
            }
            return this;
        }
        throw new IllegalArgumentException("Name parameter is null");
    }

    @Override // com.p7700g.p99005.bn4
    public bn4 v(String str) {
        I();
        this.g.setLength(0);
        if (str != null) {
            F(str);
        }
        return this;
    }

    @Override // com.p7700g.p99005.bn4
    public bn4 w(String str) {
        I();
        this.i.setLength(0);
        if (str != null) {
            this.i.append(L(str, ms3.c.QUERY));
        }
        return this;
    }

    @Override // com.p7700g.p99005.bn4
    public bn4 x(String str, Object... objArr) {
        I();
        if (this.j == null) {
            this.j = ms3.t(this.i.toString(), false, false);
            this.i.setLength(0);
        }
        String L = L(str, ms3.c.QUERY_PARAM);
        this.j.remove(L);
        if (objArr == null) {
            return this;
        }
        for (Object obj : objArr) {
            if (obj != null) {
                this.j.d(L, L(obj.toString(), ms3.c.QUERY_PARAM));
            } else {
                throw new IllegalArgumentException("One or more of query value parameters are null");
            }
        }
        return this;
    }

    @Override // com.p7700g.p99005.bn4
    public bn4 y(String str) {
        if (str != null) {
            this.a = str;
            ms3.H(str, ms3.c.SCHEME, true);
        } else {
            this.a = null;
        }
        return this;
    }

    @Override // com.p7700g.p99005.bn4
    public bn4 z(String str) {
        if (str != null) {
            StringBuilder sb = new StringBuilder();
            String str2 = this.a;
            if (str2 != null) {
                sb.append(str2);
                sb.append(':');
            }
            sb.append(str);
            String str3 = this.k;
            if (str3 != null && str3.length() > 0) {
                sb.append('#');
                sb.append(this.k);
            }
            URI K = K(sb.toString());
            if (K.getRawSchemeSpecificPart() != null && K.getRawPath() == null) {
                this.b = K.getRawSchemeSpecificPart();
            } else {
                this.b = null;
                if (K.getRawAuthority() != null) {
                    if (K.getRawUserInfo() == null && K.getHost() == null && K.getPort() == -1) {
                        this.c = K.getRawAuthority();
                        this.d = null;
                        this.e = null;
                        this.f = -1;
                    } else {
                        this.c = null;
                        this.d = K.getRawUserInfo();
                        this.e = K.getHost();
                        this.f = K.getPort();
                    }
                }
                this.g.setLength(0);
                this.g.append(P(K.getRawPath()));
                this.i.setLength(0);
                this.i.append(P(K.getRawQuery()));
            }
            return this;
        }
        throw new IllegalArgumentException("Scheme specific part parameter is null");
    }

    private ls3(ls3 ls3Var) {
        this.f = -1;
        this.a = ls3Var.a;
        this.b = ls3Var.b;
        this.c = ls3Var.c;
        this.d = ls3Var.d;
        this.e = ls3Var.e;
        this.f = ls3Var.f;
        this.g = new StringBuilder(ls3Var.g);
        this.h = ls3Var.h == null ? null : new fx3(ls3Var.h);
        this.i = new StringBuilder(ls3Var.i);
        this.j = ls3Var.j != null ? new fx3(ls3Var.j) : null;
        this.k = ls3Var.k;
    }
}