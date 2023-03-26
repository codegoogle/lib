package com.p7700g.p99005;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Challenge.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u001c\u001a\u00020\u0006\u0012\u0014\u0010\u0019\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b \u0010!B\u0019\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u0006\u0012\u0006\u0010\u001e\u001a\u00020\u0006¢\u0006\u0004\b \u0010\"J\u0015\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00060\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\bR'\u0010\u0019\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00060\t8G@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR\u0019\u0010\u001c\u001a\u00020\u00068\u0007@\u0006¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001b\u0010\bR\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u00068G@\u0006¢\u0006\u0006\u001a\u0004\b\u001d\u0010\bR\u0013\u0010\u0003\u001a\u00020\u00028G@\u0006¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u000e¨\u0006#"}, d2 = {"Lcom/p7700g/p99005/kq5;", "", "Ljava/nio/charset/Charset;", "charset", "i", "(Ljava/nio/charset/Charset;)Lcom/p7700g/p99005/kq5;", "", "d", "()Ljava/lang/String;", "", "a", "()Ljava/util/Map;", "c", "b", "()Ljava/nio/charset/Charset;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/Map;", "e", "authParams", "Ljava/lang/String;", "h", "scheme", com.anythink.basead.d.g.i, "realm", "f", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class kq5 {
    @NotNull
    private final Map<String, String> a;
    @NotNull
    private final String b;

    public kq5(@NotNull String str, @NotNull Map<String, String> map) {
        String str2;
        c25.p(str, "scheme");
        c25.p(map, "authParams");
        this.b = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null) {
                Locale locale = Locale.US;
                c25.o(locale, "US");
                str2 = key.toLowerCase(locale);
                c25.o(str2, "(this as java.lang.String).toLowerCase(locale)");
            } else {
                str2 = null;
            }
            linkedHashMap.put(str2, value);
        }
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        c25.o(unmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.a = unmodifiableMap;
    }

    @fz4(name = "-deprecated_authParams")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "authParams", imports = {}))
    @NotNull
    public final Map<String, String> a() {
        return this.a;
    }

    @fz4(name = "-deprecated_charset")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "charset", imports = {}))
    @NotNull
    public final Charset b() {
        return f();
    }

    @fz4(name = "-deprecated_realm")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "realm", imports = {}))
    @Nullable
    public final String c() {
        return g();
    }

    @fz4(name = "-deprecated_scheme")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "scheme", imports = {}))
    @NotNull
    public final String d() {
        return this.b;
    }

    @fz4(name = "authParams")
    @NotNull
    public final Map<String, String> e() {
        return this.a;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof kq5) {
            kq5 kq5Var = (kq5) obj;
            if (c25.g(kq5Var.b, this.b) && c25.g(kq5Var.a, this.a)) {
                return true;
            }
        }
        return false;
    }

    @fz4(name = "charset")
    @NotNull
    public final Charset f() {
        String str = this.a.get("charset");
        if (str != null) {
            try {
                Charset forName = Charset.forName(str);
                c25.o(forName, "Charset.forName(charset)");
                return forName;
            } catch (Exception unused) {
            }
        }
        Charset charset = StandardCharsets.ISO_8859_1;
        c25.o(charset, "ISO_8859_1");
        return charset;
    }

    @fz4(name = "realm")
    @Nullable
    public final String g() {
        return this.a.get("realm");
    }

    @fz4(name = "scheme")
    @NotNull
    public final String h() {
        return this.b;
    }

    public int hashCode() {
        return this.a.hashCode() + wo1.x(this.b, 899, 31);
    }

    @NotNull
    public final kq5 i(@NotNull Charset charset) {
        c25.p(charset, "charset");
        Map J0 = nt4.J0(this.a);
        String name = charset.name();
        c25.o(name, "charset.name()");
        J0.put("charset", name);
        return new kq5(this.b, J0);
    }

    @NotNull
    public String toString() {
        return this.b + " authParams=" + this.a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public kq5(@NotNull String str, @NotNull String str2) {
        this(str, r3);
        c25.p(str, "scheme");
        c25.p(str2, "realm");
        Map singletonMap = Collections.singletonMap("realm", str2);
        c25.o(singletonMap, "singletonMap(\"realm\", realm)");
    }
}