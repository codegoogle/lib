package com.p7700g.p99005;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MediaType.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\n\u0018\u0000 \"2\u00020\u0001:\u0001\fB/\b\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0006\u0012\u0006\u0010\u001f\u001a\u00020\u0006\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0019¢\u0006\u0004\b \u0010!J\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0018\u001a\u00020\u00068\u0007@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000bR\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016R\u0019\u0010\u001f\u001a\u00020\u00068\u0007@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u000b¨\u0006#"}, d2 = {"Lcom/p7700g/p99005/br5;", "", "Ljava/nio/charset/Charset;", "defaultValue", "f", "(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;", "", "name", "i", "(Ljava/lang/String;)Ljava/lang/String;", "b", "()Ljava/lang/String;", "a", "toString", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "h", "Ljava/lang/String;", "k", "subtype", "", "[Ljava/lang/String;", "parameterNamesAndValues", "mediaType", com.anythink.basead.d.g.i, "l", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V", "e", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class br5 {
    private static final String a = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";
    private static final String b = "\"([^\"]*)\"";
    private final String f;
    @NotNull
    private final String g;
    @NotNull
    private final String h;
    private final String[] i;
    public static final a e = new a(null);
    private static final Pattern c = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    private static final Pattern d = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* compiled from: MediaType.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\t\u0010\u0005R\u001e\u0010\f\u001a\n \u000b*\u0004\u0018\u00010\n0\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u001e\u0010\u0011\u001a\n \u000b*\u0004\u0018\u00010\n0\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\r¨\u0006\u0014"}, d2 = {"com/p7700g/p99005/br5$a", "", "", "Lcom/p7700g/p99005/br5;", "c", "(Ljava/lang/String;)Lcom/p7700g/p99005/br5;", "d", "mediaType", "a", "b", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "PARAMETER", "Ljava/util/regex/Pattern;", "QUOTED", "Ljava/lang/String;", "TOKEN", "TYPE_SUBTYPE", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        @fz4(name = "-deprecated_get")
        @xn4(level = zn4.ERROR, message = "moved to extension function", replaceWith = @op4(expression = "mediaType.toMediaType()", imports = {"okhttp3.MediaType.Companion.toMediaType"}))
        @NotNull
        public final br5 a(@NotNull String str) {
            c25.p(str, "mediaType");
            return c(str);
        }

        @fz4(name = "-deprecated_parse")
        @xn4(level = zn4.ERROR, message = "moved to extension function", replaceWith = @op4(expression = "mediaType.toMediaTypeOrNull()", imports = {"okhttp3.MediaType.Companion.toMediaTypeOrNull"}))
        @Nullable
        public final br5 b(@NotNull String str) {
            c25.p(str, "mediaType");
            return d(str);
        }

        @fz4(name = "get")
        @jz4
        @NotNull
        public final br5 c(@NotNull String str) {
            c25.p(str, "$this$toMediaType");
            Matcher matcher = br5.c.matcher(str);
            if (matcher.lookingAt()) {
                String group = matcher.group(1);
                c25.o(group, "typeSubtype.group(1)");
                Locale locale = Locale.US;
                c25.o(locale, "Locale.US");
                Objects.requireNonNull(group, "null cannot be cast to non-null type java.lang.String");
                String lowerCase = group.toLowerCase(locale);
                c25.o(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                String group2 = matcher.group(2);
                c25.o(group2, "typeSubtype.group(2)");
                c25.o(locale, "Locale.US");
                Objects.requireNonNull(group2, "null cannot be cast to non-null type java.lang.String");
                String lowerCase2 = group2.toLowerCase(locale);
                c25.o(lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
                ArrayList arrayList = new ArrayList();
                Matcher matcher2 = br5.d.matcher(str);
                int end = matcher.end();
                while (end < str.length()) {
                    matcher2.region(end, str.length());
                    if (matcher2.lookingAt()) {
                        String group3 = matcher2.group(1);
                        if (group3 == null) {
                            end = matcher2.end();
                        } else {
                            String group4 = matcher2.group(2);
                            if (group4 == null) {
                                group4 = matcher2.group(3);
                            } else if (b95.u2(group4, "'", false, 2, null) && b95.J1(group4, "'", false, 2, null) && group4.length() > 2) {
                                group4 = group4.substring(1, group4.length() - 1);
                                c25.o(group4, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            }
                            arrayList.add(group3);
                            arrayList.add(group4);
                            end = matcher2.end();
                        }
                    } else {
                        StringBuilder G = wo1.G("Parameter is not formatted correctly: \"");
                        String substring = str.substring(end);
                        c25.o(substring, "(this as java.lang.String).substring(startIndex)");
                        G.append(substring);
                        G.append("\" for: \"");
                        G.append(str);
                        G.append(h95.b);
                        throw new IllegalArgumentException(G.toString().toString());
                    }
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                return new br5(str, lowerCase, lowerCase2, (String[]) array, null);
            }
            throw new IllegalArgumentException(("No subtype found for: \"" + str + h95.b).toString());
        }

        @fz4(name = "parse")
        @jz4
        @Nullable
        public final br5 d(@NotNull String str) {
            c25.p(str, "$this$toMediaTypeOrNull");
            try {
                return c(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private br5(String str, String str2, String str3, String[] strArr) {
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = strArr;
    }

    public static /* synthetic */ Charset g(br5 br5Var, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = null;
        }
        return br5Var.f(charset);
    }

    @fz4(name = "get")
    @jz4
    @NotNull
    public static final br5 h(@NotNull String str) {
        return e.c(str);
    }

    @fz4(name = "parse")
    @jz4
    @Nullable
    public static final br5 j(@NotNull String str) {
        return e.d(str);
    }

    @fz4(name = "-deprecated_subtype")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "subtype", imports = {}))
    @NotNull
    public final String a() {
        return this.h;
    }

    @fz4(name = "-deprecated_type")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "type", imports = {}))
    @NotNull
    public final String b() {
        return this.g;
    }

    @gz4
    @Nullable
    public final Charset e() {
        return g(this, null, 1, null);
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof br5) && c25.g(((br5) obj).f, this.f);
    }

    @gz4
    @Nullable
    public final Charset f(@Nullable Charset charset) {
        String i = i("charset");
        if (i != null) {
            try {
                return Charset.forName(i);
            } catch (IllegalArgumentException unused) {
                return charset;
            }
        }
        return charset;
    }

    public int hashCode() {
        return this.f.hashCode();
    }

    @Nullable
    public final String i(@NotNull String str) {
        c25.p(str, "name");
        a55 e1 = i55.e1(as4.Oe(this.i), 2);
        int e2 = e1.e();
        int h = e1.h();
        int i = e1.i();
        if (i >= 0) {
            if (e2 > h) {
                return null;
            }
        } else if (e2 < h) {
            return null;
        }
        while (!b95.K1(this.i[e2], str, true)) {
            if (e2 == h) {
                return null;
            }
            e2 += i;
        }
        return this.i[e2 + 1];
    }

    @fz4(name = "subtype")
    @NotNull
    public final String k() {
        return this.h;
    }

    @fz4(name = "type")
    @NotNull
    public final String l() {
        return this.g;
    }

    @NotNull
    public String toString() {
        return this.f;
    }

    public /* synthetic */ br5(String str, String str2, String str3, String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, strArr);
    }
}