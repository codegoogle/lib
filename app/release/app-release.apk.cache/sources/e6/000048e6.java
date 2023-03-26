package com.p7700g.p99005;

/* compiled from: LanguageProviderAppDefined.java */
/* loaded from: classes3.dex */
public class io3 implements ho3 {
    public static final String a = "PREFS_OS_LANGUAGE";
    private static final String b = "en";
    private final sl3 c;

    public io3(sl3 sl3Var) {
        this.c = sl3Var;
    }

    @Override // com.p7700g.p99005.ho3
    @x1
    public String a() {
        sl3 sl3Var = this.c;
        return sl3Var.f(sl3Var.h(), a, "en");
    }

    public void b(String str) {
        sl3 sl3Var = this.c;
        sl3Var.l(sl3Var.h(), a, str);
    }
}