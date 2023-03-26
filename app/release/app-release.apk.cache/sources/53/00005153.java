package com.p7700g.p99005;

import com.p7700g.p99005.en4;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: VariantListBuilderImpl.java */
/* loaded from: classes3.dex */
public class mw3 extends en4.a {
    private List<en4> a;
    private final List<tm4> b = new ArrayList();
    private final List<Locale> c = new ArrayList();
    private final List<String> d = new ArrayList();
    private final List<String> e = new ArrayList();

    private void g(tm4 tm4Var, Locale locale) {
        if (this.e.isEmpty()) {
            j(tm4Var, locale, null);
            return;
        }
        for (String str : this.e) {
            j(tm4Var, locale, str);
        }
    }

    private void h(tm4 tm4Var) {
        if (this.c.isEmpty()) {
            g(tm4Var, null);
            return;
        }
        for (Locale locale : this.c) {
            g(tm4Var, locale);
        }
    }

    private void i() {
        if (this.b.isEmpty()) {
            h(null);
            return;
        }
        for (tm4 tm4Var : this.b) {
            h(tm4Var);
        }
    }

    private void j(tm4 tm4Var, Locale locale, String str) {
        this.a.add(new en4(tm4Var, locale, str));
    }

    @Override // com.p7700g.p99005.en4.a
    public en4.a a() {
        if (this.a == null) {
            this.a = new ArrayList();
        }
        i();
        this.d.clear();
        this.c.clear();
        this.e.clear();
        this.b.clear();
        return this;
    }

    @Override // com.p7700g.p99005.en4.a
    public List<en4> b() {
        if (this.a == null) {
            this.a = new ArrayList();
        }
        return this.a;
    }

    @Override // com.p7700g.p99005.en4.a
    public en4.a c(String... strArr) {
        for (String str : strArr) {
            this.e.add(str);
        }
        return this;
    }

    @Override // com.p7700g.p99005.en4.a
    public en4.a d(Locale... localeArr) {
        for (Locale locale : localeArr) {
            this.c.add(locale);
        }
        return this;
    }

    @Override // com.p7700g.p99005.en4.a
    public en4.a e(tm4... tm4VarArr) {
        for (tm4 tm4Var : tm4VarArr) {
            this.b.add(tm4Var);
        }
        return this;
    }
}