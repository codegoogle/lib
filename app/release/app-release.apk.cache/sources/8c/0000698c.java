package com.p7700g.p99005;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* compiled from: BidiFormatter.java */
/* loaded from: classes.dex */
public final class zn {
    public static final ko a;
    private static final char b = 8234;
    private static final char c = 8235;
    private static final char d = 8236;
    private static final char e = 8206;
    private static final char f = 8207;
    private static final String g;
    private static final String h;
    private static final String i = "";
    private static final int j = 2;
    private static final int k = 2;
    public static final zn l;
    public static final zn m;
    private static final int n = -1;
    private static final int o = 0;
    private static final int p = 1;
    private final boolean q;
    private final int r;
    private final ko s;

    /* compiled from: BidiFormatter.java */
    /* loaded from: classes.dex */
    public static class b {
        private static final int a = 1792;
        private static final byte[] b = new byte[1792];
        private final CharSequence c;
        private final boolean d;
        private final int e;
        private int f;
        private char g;

        static {
            for (int i = 0; i < 1792; i++) {
                b[i] = Character.getDirectionality(i);
            }
        }

        public b(CharSequence charSequence, boolean z) {
            this.c = charSequence;
            this.d = z;
            this.e = charSequence.length();
        }

        private static byte c(char c) {
            return c < 1792 ? b[c] : Character.getDirectionality(c);
        }

        private byte f() {
            char charAt;
            int i = this.f;
            do {
                int i2 = this.f;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.c;
                int i3 = i2 - 1;
                this.f = i3;
                charAt = charSequence.charAt(i3);
                this.g = charAt;
                if (charAt == '&') {
                    return (byte) 12;
                }
            } while (charAt != ';');
            this.f = i;
            this.g = ';';
            return (byte) 13;
        }

        private byte g() {
            char charAt;
            do {
                int i = this.f;
                if (i >= this.e) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.c;
                this.f = i + 1;
                charAt = charSequence.charAt(i);
                this.g = charAt;
            } while (charAt != ';');
            return (byte) 12;
        }

        private byte h() {
            char charAt;
            int i = this.f;
            while (true) {
                int i2 = this.f;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.c;
                int i3 = i2 - 1;
                this.f = i3;
                char charAt2 = charSequence.charAt(i3);
                this.g = charAt2;
                if (charAt2 == '<') {
                    return (byte) 12;
                }
                if (charAt2 == '>') {
                    break;
                } else if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i4 = this.f;
                        if (i4 > 0) {
                            CharSequence charSequence2 = this.c;
                            int i5 = i4 - 1;
                            this.f = i5;
                            charAt = charSequence2.charAt(i5);
                            this.g = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
            this.f = i;
            this.g = h95.f;
            return (byte) 13;
        }

        private byte i() {
            char charAt;
            int i = this.f;
            while (true) {
                int i2 = this.f;
                if (i2 < this.e) {
                    CharSequence charSequence = this.c;
                    this.f = i2 + 1;
                    char charAt2 = charSequence.charAt(i2);
                    this.g = charAt2;
                    if (charAt2 == '>') {
                        return (byte) 12;
                    }
                    if (charAt2 == '\"' || charAt2 == '\'') {
                        do {
                            int i3 = this.f;
                            if (i3 < this.e) {
                                CharSequence charSequence2 = this.c;
                                this.f = i3 + 1;
                                charAt = charSequence2.charAt(i3);
                                this.g = charAt;
                            }
                        } while (charAt != charAt2);
                    }
                } else {
                    this.f = i;
                    this.g = h95.e;
                    return (byte) 13;
                }
            }
        }

        public byte a() {
            char charAt = this.c.charAt(this.f - 1);
            this.g = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.c, this.f);
                this.f -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f--;
            byte c = c(this.g);
            if (this.d) {
                char c2 = this.g;
                if (c2 == '>') {
                    return h();
                }
                return c2 == ';' ? f() : c;
            }
            return c;
        }

        public byte b() {
            char charAt = this.c.charAt(this.f);
            this.g = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.c, this.f);
                this.f = Character.charCount(codePointAt) + this.f;
                return Character.getDirectionality(codePointAt);
            }
            this.f++;
            byte c = c(this.g);
            if (this.d) {
                char c2 = this.g;
                if (c2 == '<') {
                    return i();
                }
                return c2 == '&' ? g() : c;
            }
            return c;
        }

        public int d() {
            this.f = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.f < this.e && i == 0) {
                byte b2 = b();
                if (b2 != 0) {
                    if (b2 == 1 || b2 == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (b2 != 9) {
                        switch (b2) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                break;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                break;
                            case 18:
                                i3--;
                                i2 = 0;
                                break;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
            if (i == 0) {
                return 0;
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.f > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i == i3) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i == i3) {
                            return 1;
                        }
                        break;
                    case 18:
                        i3++;
                        continue;
                }
                i3--;
            }
            return 0;
        }

        public int e() {
            this.f = this.e;
            int i = 0;
            int i2 = 0;
            while (this.f > 0) {
                byte a2 = a();
                if (a2 != 0) {
                    if (a2 == 1 || a2 == 2) {
                        if (i == 0) {
                            return 1;
                        }
                        if (i2 == 0) {
                            i2 = i;
                        }
                    } else if (a2 != 9) {
                        switch (a2) {
                            case 14:
                            case 15:
                                if (i2 == i) {
                                    return -1;
                                }
                                i--;
                                break;
                            case 16:
                            case 17:
                                if (i2 == i) {
                                    return 1;
                                }
                                i--;
                                break;
                            case 18:
                                i++;
                                break;
                            default:
                                if (i2 != 0) {
                                    break;
                                } else {
                                    i2 = i;
                                    break;
                                }
                        }
                    } else {
                        continue;
                    }
                } else if (i == 0) {
                    return -1;
                } else {
                    if (i2 == 0) {
                        i2 = i;
                    }
                }
            }
            return 0;
        }
    }

    static {
        ko koVar = lo.c;
        a = koVar;
        g = Character.toString(e);
        h = Character.toString(f);
        l = new zn(false, 2, koVar);
        m = new zn(true, 2, koVar);
    }

    public zn(boolean z, int i2, ko koVar) {
        this.q = z;
        this.r = i2;
        this.s = koVar;
    }

    private static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    private static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static zn c() {
        return new a().a();
    }

    public static zn d(Locale locale) {
        return new a(locale).a();
    }

    public static zn e(boolean z) {
        return new a(z).a();
    }

    public static boolean j(Locale locale) {
        return mo.b(locale) == 1;
    }

    private String k(CharSequence charSequence, ko koVar) {
        boolean b2 = koVar.b(charSequence, 0, charSequence.length());
        if (this.q || !(b2 || b(charSequence) == 1)) {
            return this.q ? (!b2 || b(charSequence) == -1) ? h : "" : "";
        }
        return g;
    }

    private String l(CharSequence charSequence, ko koVar) {
        boolean b2 = koVar.b(charSequence, 0, charSequence.length());
        if (this.q || !(b2 || a(charSequence) == 1)) {
            return this.q ? (!b2 || a(charSequence) == -1) ? h : "" : "";
        }
        return g;
    }

    public boolean f() {
        return (this.r & 2) != 0;
    }

    public boolean g(CharSequence charSequence) {
        return this.s.b(charSequence, 0, charSequence.length());
    }

    public boolean h(String str) {
        return g(str);
    }

    public boolean i() {
        return this.q;
    }

    public CharSequence m(CharSequence charSequence) {
        return o(charSequence, this.s, true);
    }

    public CharSequence n(CharSequence charSequence, ko koVar) {
        return o(charSequence, koVar, true);
    }

    public CharSequence o(CharSequence charSequence, ko koVar, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean b2 = koVar.b(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (f() && z) {
            spannableStringBuilder.append((CharSequence) l(charSequence, b2 ? lo.b : lo.a));
        }
        if (b2 != this.q) {
            spannableStringBuilder.append(b2 ? c : b);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(d);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            spannableStringBuilder.append((CharSequence) k(charSequence, b2 ? lo.b : lo.a));
        }
        return spannableStringBuilder;
    }

    public CharSequence p(CharSequence charSequence, boolean z) {
        return o(charSequence, this.s, z);
    }

    public String q(String str) {
        return s(str, this.s, true);
    }

    public String r(String str, ko koVar) {
        return s(str, koVar, true);
    }

    public String s(String str, ko koVar, boolean z) {
        if (str == null) {
            return null;
        }
        return o(str, koVar, z).toString();
    }

    public String t(String str, boolean z) {
        return s(str, this.s, z);
    }

    /* compiled from: BidiFormatter.java */
    /* loaded from: classes.dex */
    public static final class a {
        private boolean a;
        private int b;
        private ko c;

        public a() {
            c(zn.j(Locale.getDefault()));
        }

        private static zn b(boolean z) {
            return z ? zn.m : zn.l;
        }

        private void c(boolean z) {
            this.a = z;
            this.c = zn.a;
            this.b = 2;
        }

        public zn a() {
            if (this.b == 2 && this.c == zn.a) {
                return b(this.a);
            }
            return new zn(this.a, this.b, this.c);
        }

        public a d(ko koVar) {
            this.c = koVar;
            return this;
        }

        public a e(boolean z) {
            if (z) {
                this.b |= 2;
            } else {
                this.b &= -3;
            }
            return this;
        }

        public a(boolean z) {
            c(z);
        }

        public a(Locale locale) {
            c(zn.j(locale));
        }
    }
}