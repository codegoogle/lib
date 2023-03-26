package com.p7700g.p99005;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: UriTemplateParser.java */
/* loaded from: classes3.dex */
public class ps3 {
    public static final int[] a = new int[0];
    private static final Set<Character> b = l();
    private static final Pattern c = Pattern.compile("[^/]+?");
    private final String d;
    private final StringBuffer e;
    private final StringBuffer f;
    private final StringBuffer g;
    private final Pattern h;
    private final List<String> i;
    private final List<Integer> j;
    private final Map<String, Pattern> k;
    private int l;
    private int m;

    /* compiled from: UriTemplateParser.java */
    /* loaded from: classes3.dex */
    public interface a {
        boolean hasNext();

        char next();

        char p();

        int q();
    }

    /* compiled from: UriTemplateParser.java */
    /* loaded from: classes3.dex */
    public static final class b implements a {
        private int a = 0;
        private String b;

        public b(String str) {
            this.b = str;
        }

        @Override // com.p7700g.p99005.ps3.a
        public boolean hasNext() {
            return this.a < this.b.length();
        }

        @Override // com.p7700g.p99005.ps3.a
        public char next() {
            if (hasNext()) {
                String str = this.b;
                int i = this.a;
                this.a = i + 1;
                return str.charAt(i);
            }
            throw new NoSuchElementException();
        }

        @Override // com.p7700g.p99005.ps3.a
        public char p() {
            if (hasNext()) {
                return this.b.charAt(this.a);
            }
            throw new NoSuchElementException();
        }

        @Override // com.p7700g.p99005.ps3.a
        public int q() {
            int i = this.a;
            if (i != 0) {
                return i - 1;
            }
            throw new IllegalStateException("Iterator not used yet.");
        }
    }

    public ps3(String str) throws IllegalArgumentException {
        StringBuffer stringBuffer = new StringBuffer();
        this.e = stringBuffer;
        this.f = new StringBuffer();
        this.g = new StringBuffer();
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = new HashMap();
        if (str != null && str.length() != 0) {
            this.d = str;
            m(new b(str));
            try {
                this.h = Pattern.compile(stringBuffer.toString());
                return;
            } catch (PatternSyntaxException e) {
                StringBuilder G = wo1.G("Invalid syntax for the template expression '");
                G.append((Object) this.e);
                G.append("'");
                throw new IllegalArgumentException(G.toString(), e);
            }
        }
        throw new IllegalArgumentException();
    }

    private char a(a aVar) {
        char next;
        do {
            next = aVar.next();
        } while (Character.isWhitespace(next));
        return next;
    }

    private static Set<Character> l() {
        char[] cArr = {'.', '^', h95.d, '!', '?', '-', ':', h95.e, '(', f14.u, h95.c, '=', ')', f14.v, e14.f0, h95.f, n04.z, '+', gl4.T};
        HashSet hashSet = new HashSet(19);
        for (int i = 0; i < 19; i++) {
            hashSet.add(Character.valueOf(cArr[i]));
        }
        return hashSet;
    }

    private void m(a aVar) {
        while (aVar.hasNext()) {
            try {
                char next = aVar.next();
                if (next == '{') {
                    p();
                    n(aVar);
                } else {
                    this.g.append(next);
                }
            } catch (NoSuchElementException e) {
                throw new IllegalArgumentException(wo1.C(wo1.G("Invalid syntax for the template, \""), this.d, "\". Check if a path parameter is terminated with a '}'."), e);
            }
        }
        p();
    }

    private void n(a aVar) {
        char next;
        String str;
        char a2 = a(aVar);
        StringBuilder sb = new StringBuilder();
        if (!Character.isLetterOrDigit(a2) && a2 != '_') {
            throw new IllegalArgumentException("Illegal character '" + a2 + "' at position " + aVar.q() + " is not as the start of a name");
        }
        sb.append(a2);
        while (true) {
            next = aVar.next();
            if (!Character.isLetterOrDigit(next) && next != '_' && next != '-' && next != '.') {
                break;
            }
            sb.append(next);
        }
        if (next == ':') {
            str = o(aVar);
        } else {
            if (next != '}') {
                if (next == ' ') {
                    char a3 = a(aVar);
                    if (a3 == ':') {
                        str = o(aVar);
                    } else if (a3 != '}') {
                        throw new IllegalArgumentException("Illegal character '" + a3 + "' at position " + aVar.q() + " is not allowed after a name");
                    }
                } else {
                    throw new IllegalArgumentException("Illegal character '" + next + "' at position " + aVar.q() + " is not allowed as part of a name");
                }
            }
            str = "";
        }
        String sb2 = sb.toString();
        this.i.add(sb2);
        try {
            if (str.length() > 0) {
                this.l++;
            }
            Pattern compile = str.length() == 0 ? c : Pattern.compile(str);
            if (this.k.containsKey(sb2)) {
                if (!this.k.get(sb2).equals(compile)) {
                    throw new IllegalArgumentException("The name '" + sb2 + "' is declared more than once with different regular expressions");
                }
            } else {
                this.k.put(sb2, compile);
            }
            this.j.add(Integer.valueOf(compile.matcher("").groupCount() + 1));
            StringBuffer stringBuffer = this.e;
            stringBuffer.append('(');
            stringBuffer.append(compile);
            stringBuffer.append(')');
            StringBuffer stringBuffer2 = this.f;
            stringBuffer2.append('{');
            stringBuffer2.append(sb2);
            stringBuffer2.append('}');
        } catch (PatternSyntaxException e) {
            throw new IllegalArgumentException(wo1.w("Invalid syntax for the expression '", str, "' associated with the name '", sb2, "'"), e);
        }
    }

    private String o(a aVar) {
        StringBuilder sb = new StringBuilder();
        int i = 1;
        while (true) {
            char next = aVar.next();
            if (next == '{') {
                i++;
            } else if (next == '}' && i - 1 == 0) {
                return sb.toString().trim();
            }
            sb.append(next);
        }
    }

    private void p() {
        if (this.g.length() > 0) {
            this.m = this.g.length() + this.m;
            String b2 = b(this.g.toString());
            this.f.append(b2);
            for (int i = 0; i < b2.length(); i++) {
                char charAt = b2.charAt(i);
                if (b.contains(Character.valueOf(charAt))) {
                    this.e.append("\\");
                }
                this.e.append(charAt);
            }
            this.g.setLength(0);
        }
    }

    public String b(String str) {
        return str;
    }

    public final List<Integer> c() {
        return this.j;
    }

    public final int[] d() {
        if (this.i.isEmpty()) {
            return a;
        }
        int size = this.i.size() + 1;
        int[] iArr = new int[size];
        int i = 0;
        iArr[0] = 1;
        for (int i2 = 1; i2 < size; i2++) {
            int i3 = i2 - 1;
            iArr[i2] = this.j.get(i3).intValue() + iArr[i3];
        }
        while (i < size) {
            int i4 = iArr[i];
            i++;
            if (i4 != i) {
                return iArr;
            }
        }
        return a;
    }

    public final Map<String, Pattern> e() {
        return this.k;
    }

    public final List<String> f() {
        return this.i;
    }

    public final String g() {
        return this.f.toString();
    }

    public final int h() {
        return this.l;
    }

    public final int i() {
        return this.m;
    }

    public final Pattern j() {
        return this.h;
    }

    public final String k() {
        return this.d;
    }
}