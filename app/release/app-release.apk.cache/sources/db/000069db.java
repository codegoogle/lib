package com.p7700g.p99005;

import com.microsoft.appcenter.AppCenter;
import com.p7700g.p99005.kt3;
import java.net.URI;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: LinkHeader.java */
/* loaded from: classes3.dex */
public class zs3 {
    private URI a;
    private Set<String> b;
    private tm4 c;
    private um4<String, String> d;

    /* compiled from: LinkHeader.java */
    /* loaded from: classes3.dex */
    public static class a<T extends a, V extends zs3> {
        public URI a;
        public Set<String> b;
        public tm4 c;
        public um4<String, String> d;

        public a(URI uri) {
            this.a = uri;
        }

        public V a() {
            return (V) new zs3(this);
        }

        public T b(String str) {
            c("op", str);
            return this;
        }

        public T c(String str, String str2) {
            if (str.equals("rel")) {
                return d(str2);
            }
            if (str.equals("type")) {
                return e(tm4.h(str2));
            }
            if (this.d == null) {
                this.d = new fx3();
            }
            this.d.d(str, str2);
            return this;
        }

        public T d(String str) {
            if (str != null) {
                String trim = str.trim();
                if (trim.length() != 0) {
                    Set<String> set = this.b;
                    if (set == null) {
                        this.b = Collections.singleton(trim);
                    } else if (set.size() == 1 && !this.b.contains(trim)) {
                        HashSet hashSet = new HashSet(this.b);
                        this.b = hashSet;
                        hashSet.add(trim);
                    } else {
                        this.b.add(trim);
                    }
                    return this;
                }
                throw new IllegalArgumentException("rel parameter cannot an empty string or just white space");
            }
            throw new IllegalArgumentException("rel parameter cannot be null");
        }

        public T e(tm4 tm4Var) {
            this.c = tm4Var;
            return this;
        }
    }

    public zs3(String str) throws ParseException, IllegalArgumentException {
        this(kt3.g(str));
    }

    private void a(String str, String str2) {
        b();
        this.d.d(str, str2);
    }

    private void b() {
        if (this.d == null) {
            this.d = new fx3();
        }
    }

    private boolean c(String str) {
        b();
        return this.d.containsKey(str);
    }

    private void i(kt3 kt3Var) throws ParseException {
        while (kt3Var.e()) {
            kt3Var.o(';');
            while (kt3Var.f(';', true)) {
                kt3Var.i();
            }
            if (!kt3Var.e()) {
                return;
            }
            String lowerCase = kt3Var.p().toLowerCase();
            kt3Var.o('=');
            if (lowerCase.equals("rel")) {
                String q = kt3Var.q();
                if (kt3Var.a() == kt3.j.Token) {
                    this.b = Collections.singleton(q);
                } else {
                    this.b = Collections.unmodifiableSet(new HashSet(Arrays.asList(q.split(" "))));
                }
            } else if (lowerCase.equals("hreflang")) {
                a(lowerCase, kt3Var.q());
            } else if (lowerCase.equals("media")) {
                if (!c("media")) {
                    a(lowerCase, kt3Var.q());
                }
            } else if (lowerCase.equals("title")) {
                if (!c("title")) {
                    a(lowerCase, kt3Var.l());
                }
            } else if (lowerCase.equals("title*")) {
                a(lowerCase, kt3Var.l());
            } else if (lowerCase.equals("type")) {
                String p = kt3Var.p();
                kt3Var.o(j14.P);
                this.c = new tm4(p, kt3Var.p());
            } else {
                a(lowerCase, kt3Var.q());
            }
        }
    }

    public static a j(URI uri) {
        return new a(uri);
    }

    public static zs3 k(String str) throws IllegalArgumentException {
        try {
            return new zs3(kt3.g(str));
        } catch (ParseException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public String d() {
        um4<String, String> um4Var = this.d;
        if (um4Var != null) {
            return um4Var.b("op");
        }
        return null;
    }

    public um4<String, String> e() {
        b();
        return this.d;
    }

    public Set<String> f() {
        if (this.b == null) {
            this.b = Collections.emptySet();
        }
        return this.b;
    }

    public tm4 g() {
        return this.c;
    }

    public URI h() {
        return this.a;
    }

    public String toString() {
        StringBuilder F = wo1.F(h95.e);
        F.append(this.a.toASCIIString());
        F.append(h95.f);
        if (this.b != null) {
            F.append(';');
            F.append("rel=");
            boolean z = true;
            if (this.b.size() == 1) {
                F.append(this.b.iterator().next());
            } else {
                F.append(h95.b);
                for (String str : this.b) {
                    if (!z) {
                        F.append(gl4.R);
                    }
                    F.append(str);
                    z = false;
                }
                F.append(h95.b);
            }
        }
        if (this.c != null) {
            F.append(';');
            F.append("type=");
            F.append(this.c.d());
            F.append(j14.P);
            F.append(this.c.c());
        }
        um4<String, String> um4Var = this.d;
        if (um4Var != null) {
            for (Map.Entry<String, String> entry : um4Var.entrySet()) {
                String key = entry.getKey();
                List list = (List) entry.getValue();
                if (!key.equals("anchor") && !key.equals("title")) {
                    if (key.equals("hreflang")) {
                        for (String str2 : (List) entry.getValue()) {
                            F.append(AppCenter.PAIR_DELIMITER);
                            wo1.g0(F, entry.getKey(), AppCenter.KEY_VALUE_DELIMITER, str2);
                        }
                    } else {
                        for (String str3 : (List) entry.getValue()) {
                            F.append(AppCenter.PAIR_DELIMITER);
                            F.append(entry.getKey());
                            F.append(AppCenter.KEY_VALUE_DELIMITER);
                            qu3.b(F, str3);
                        }
                    }
                } else {
                    wo1.g0(F, AppCenter.PAIR_DELIMITER, key, AppCenter.KEY_VALUE_DELIMITER);
                    qu3.b(F, (String) list.get(0));
                }
            }
        }
        return F.toString();
    }

    public zs3(kt3 kt3Var) throws ParseException, IllegalArgumentException {
        this.a = URI.create(kt3Var.m(h95.e, h95.f));
        if (kt3Var.e()) {
            i(kt3Var);
        }
    }

    public zs3(a aVar) {
        this.a = aVar.a;
        Set<String> set = aVar.b;
        if (set != null) {
            if (set.size() == 1) {
                this.b = aVar.b;
            } else {
                this.b = Collections.unmodifiableSet(new HashSet(aVar.b));
            }
        }
        this.c = aVar.c;
        if (aVar.d != null) {
            this.d = new fx3(aVar.d);
        }
    }
}