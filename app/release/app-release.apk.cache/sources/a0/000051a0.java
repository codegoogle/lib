package com.p7700g.p99005;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: CCTDestination.java */
/* loaded from: classes2.dex */
public final class n32 implements n42 {
    public static final String a = "cct";
    public static final String b;
    public static final String c;
    private static final String d;
    private static final String e = "1$";
    private static final String f = "\\";
    private static final Set<b32> g;
    public static final n32 h;
    public static final n32 i;
    @x1
    private final String j;
    @z1
    private final String k;

    static {
        String a2 = p32.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        b = a2;
        String a3 = p32.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        c = a3;
        String a4 = p32.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        d = a4;
        g = Collections.unmodifiableSet(new HashSet(Arrays.asList(b32.b("proto"), b32.b("json"))));
        h = new n32(a2, null);
        i = new n32(a3, a4);
    }

    public n32(@x1 String str, @z1 String str2) {
        this.j = str;
        this.k = str2;
    }

    @x1
    public static String c(@x1 byte[] bArr) {
        return new String(bArr, Charset.forName("UTF-8"));
    }

    @x1
    public static byte[] d(@x1 String str) {
        return str.getBytes(Charset.forName("UTF-8"));
    }

    @x1
    public static n32 e(@x1 byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith(e)) {
            String[] split = str.substring(2).split(Pattern.quote(f), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new n32(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    @Override // com.p7700g.p99005.n42
    public Set<b32> a() {
        return g;
    }

    @z1
    public byte[] b() {
        String str = this.k;
        if (str == null && this.j == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = e;
        objArr[1] = this.j;
        objArr[2] = f;
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }

    @z1
    public String f() {
        return this.k;
    }

    @x1
    public String g() {
        return this.j;
    }

    @Override // com.p7700g.p99005.m42
    @z1
    public byte[] getExtras() {
        return b();
    }

    @Override // com.p7700g.p99005.m42
    @x1
    public String getName() {
        return a;
    }
}