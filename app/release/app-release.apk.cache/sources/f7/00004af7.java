package com.p7700g.p99005;

import java.util.Locale;

/* compiled from: LanguageProviderDevice.java */
/* loaded from: classes3.dex */
public class jo3 implements ho3 {
    private static final String a = "iw";
    private static final String b = "he";
    private static final String c = "in";
    private static final String d = "id";
    private static final String e = "ji";
    private static final String f = "yi";
    private static final String g = "zh";

    @Override // com.p7700g.p99005.ho3
    @x1
    public String a() {
        String language = Locale.getDefault().getLanguage();
        language.hashCode();
        language.hashCode();
        char c2 = 65535;
        switch (language.hashCode()) {
            case 3365:
                if (language.equals(c)) {
                    c2 = 0;
                    break;
                }
                break;
            case 3374:
                if (language.equals(a)) {
                    c2 = 1;
                    break;
                }
                break;
            case 3391:
                if (language.equals(e)) {
                    c2 = 2;
                    break;
                }
                break;
            case 3886:
                if (language.equals("zh")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return "id";
            case 1:
                return b;
            case 2:
                return f;
            case 3:
                StringBuilder L = wo1.L(language, "-");
                L.append(Locale.getDefault().getCountry());
                return L.toString();
            default:
                return language;
        }
    }
}