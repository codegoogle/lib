package com.p7700g.p99005;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.microsoft.appcenter.utils.crypto.CryptoConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Cookie.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b&\u0018\u0000 \u00102\u00020\u0001:\u0002\u0018\u0015BQ\b\u0002\u0012\u0006\u0010/\u001a\u00020\r\u0012\u0006\u0010$\u001a\u00020\r\u0012\u0006\u0010!\u001a\u00020\u0014\u0012\u0006\u0010-\u001a\u00020\r\u0012\u0006\u00107\u001a\u00020\r\u0012\u0006\u0010(\u001a\u00020\u0004\u0012\u0006\u00104\u001a\u00020\u0004\u0012\u0006\u0010+\u001a\u00020\u0004\u0012\u0006\u00101\u001a\u00020\u0004¢\u0006\u0004\b8\u00109J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\u0013J\u000f\u0010\u0018\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0018\u0010\u000fJ\u000f\u0010\u0019\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0019\u0010\u000fJ\u000f\u0010\u001a\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\u0013J\u000f\u0010\u001b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001b\u0010\u0013J\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010!\u001a\u00020\u00148\u0007@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b \u0010\u0016R\u0019\u0010$\u001a\u00020\r8\u0007@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\"\u001a\u0004\b#\u0010\u000fR\u0019\u0010(\u001a\u00020\u00048\u0007@\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0013R\u0019\u0010+\u001a\u00020\u00048\u0007@\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010\u0013R\u0019\u0010-\u001a\u00020\r8\u0007@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\"\u001a\u0004\b,\u0010\u000fR\u0019\u0010/\u001a\u00020\r8\u0007@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\"\u001a\u0004\b.\u0010\u000fR\u0019\u00101\u001a\u00020\u00048\u0007@\u0006¢\u0006\f\n\u0004\b,\u0010&\u001a\u0004\b0\u0010\u0013R\u0019\u00104\u001a\u00020\u00048\u0007@\u0006¢\u0006\f\n\u0004\b2\u0010&\u001a\u0004\b3\u0010\u0013R\u0019\u00107\u001a\u00020\r8\u0007@\u0006¢\u0006\f\n\u0004\b5\u0010\"\u001a\u0004\b6\u0010\u000f¨\u0006:"}, d2 = {"Lcom/p7700g/p99005/pq5;", "", "Lcom/p7700g/p99005/zq5;", "url", "", "r", "(Lcom/p7700g/p99005/zq5;)Z", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "e", "i", com.anythink.basead.d.g.i, "()Z", "", "b", "()J", "c", "a", "f", "d", "h", "forObsoleteRfc2965", "y", "(Z)Ljava/lang/String;", "J", ij3.b, "expiresAt", "Ljava/lang/String;", "z", "value", "k", "Z", "x", "secure", com.anythink.expressad.d.a.b.dH, "w", "persistent", "n", "domain", "s", "name", "p", "hostOnly", "l", "q", "httpOnly", "j", com.ironsource.sdk.controller.v.a, la1.k, "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZ)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class pq5 {
    @NotNull
    private final String f;
    @NotNull
    private final String g;
    private final long h;
    @NotNull
    private final String i;
    @NotNull
    private final String j;
    private final boolean k;
    private final boolean l;
    private final boolean m;
    private final boolean n;
    public static final b e = new b(null);
    private static final Pattern a = Pattern.compile("(\\d{2,4})[^\\d]*");
    private static final Pattern b = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    private static final Pattern c = Pattern.compile("(\\d{1,2})[^\\d]*");
    private static final Pattern d = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* compiled from: Cookie.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010#J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000bJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u000bJ\u0015\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u000bJ\u0015\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u000bJ\r\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001cR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001fR\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001cR\u0016\u0010!\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001cR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001fR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001fR\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001f¨\u0006$"}, d2 = {"com/p7700g/p99005/pq5$a", "", "", "domain", "", "hostOnly", "Lcom/p7700g/p99005/pq5$a;", "c", "(Ljava/lang/String;Z)Lcom/p7700g/p99005/pq5$a;", "name", com.anythink.basead.d.g.i, "(Ljava/lang/String;)Lcom/p7700g/p99005/pq5$a;", "value", "j", "", "expiresAt", "d", "(J)Lcom/p7700g/p99005/pq5$a;", "b", "e", la1.k, "h", "i", "()Lcom/p7700g/p99005/pq5$a;", "f", "Lcom/p7700g/p99005/pq5;", "a", "()Lcom/p7700g/p99005/pq5;", "Z", "persistent", "J", "Ljava/lang/String;", "httpOnly", "secure", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        private String a;
        private String b;
        private String d;
        private boolean f;
        private boolean g;
        private boolean h;
        private boolean i;
        private long c = ts5.a;
        private String e = "/";

        private final a c(String str, boolean z) {
            String e = pr5.e(str);
            if (e != null) {
                this.d = e;
                this.i = z;
                return this;
            }
            throw new IllegalArgumentException(wo1.t("unexpected domain: ", str));
        }

        @NotNull
        public final pq5 a() {
            String str = this.a;
            Objects.requireNonNull(str, "builder.name == null");
            String str2 = this.b;
            Objects.requireNonNull(str2, "builder.value == null");
            long j = this.c;
            String str3 = this.d;
            Objects.requireNonNull(str3, "builder.domain == null");
            return new pq5(str, str2, j, str3, this.e, this.f, this.g, this.h, this.i, null);
        }

        @NotNull
        public final a b(@NotNull String str) {
            c25.p(str, "domain");
            return c(str, false);
        }

        @NotNull
        public final a d(long j) {
            if (j <= 0) {
                j = Long.MIN_VALUE;
            }
            if (j > ts5.a) {
                j = 253402300799999L;
            }
            this.c = j;
            this.h = true;
            return this;
        }

        @NotNull
        public final a e(@NotNull String str) {
            c25.p(str, "domain");
            return c(str, true);
        }

        @NotNull
        public final a f() {
            this.g = true;
            return this;
        }

        @NotNull
        public final a g(@NotNull String str) {
            c25.p(str, "name");
            if (c25.g(c95.E5(str).toString(), str)) {
                this.a = str;
                return this;
            }
            throw new IllegalArgumentException("name is not trimmed".toString());
        }

        @NotNull
        public final a h(@NotNull String str) {
            c25.p(str, la1.k);
            if (b95.u2(str, "/", false, 2, null)) {
                this.e = str;
                return this;
            }
            throw new IllegalArgumentException("path must start with '/'".toString());
        }

        @NotNull
        public final a i() {
            this.f = true;
            return this;
        }

        @NotNull
        public final a j(@NotNull String str) {
            c25.p(str, "value");
            if (c25.g(c95.E5(str).toString(), str)) {
                this.b = str;
                return this;
            }
            throw new IllegalArgumentException("value is not trimmed".toString());
        }
    }

    /* compiled from: Cookie.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b/\u00100J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010!\u001a\u0004\u0018\u00010\u001d2\u0006\u0010 \u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u0002H\u0000¢\u0006\u0004\b!\u0010\"J%\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001d0%2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010$\u001a\u00020#H\u0007¢\u0006\u0004\b&\u0010'R\u001e\u0010*\u001a\n )*\u0004\u0018\u00010(0(8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001e\u0010,\u001a\n )*\u0004\u0018\u00010(0(8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010+R\u001e\u0010-\u001a\n )*\u0004\u0018\u00010(0(8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010+R\u001e\u0010.\u001a\n )*\u0004\u0018\u00010(0(8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010+¨\u00061"}, d2 = {"com/p7700g/p99005/pq5$b", "", "", "urlHost", "domain", "", "d", "(Ljava/lang/String;Ljava/lang/String;)Z", "Lcom/p7700g/p99005/zq5;", "url", la1.k, "k", "(Lcom/p7700g/p99005/zq5;Ljava/lang/String;)Z", "s", "", "pos", "limit", "", "i", "(Ljava/lang/String;II)J", "input", "invert", "c", "(Ljava/lang/String;IIZ)I", "j", "(Ljava/lang/String;)J", "h", "(Ljava/lang/String;)Ljava/lang/String;", "setCookie", "Lcom/p7700g/p99005/pq5;", "e", "(Lcom/p7700g/p99005/zq5;Ljava/lang/String;)Lcom/p7700g/p99005/pq5;", "currentTimeMillis", "f", "(JLcom/p7700g/p99005/zq5;Ljava/lang/String;)Lcom/p7700g/p99005/pq5;", "Lcom/p7700g/p99005/yq5;", "headers", "", com.anythink.basead.d.g.i, "(Lcom/p7700g/p99005/zq5;Lcom/p7700g/p99005/yq5;)Ljava/util/List;", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "DAY_OF_MONTH_PATTERN", "Ljava/util/regex/Pattern;", "MONTH_PATTERN", "TIME_PATTERN", "YEAR_PATTERN", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        private final int c(String str, int i, int i2, boolean z) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && '9' >= charAt) || (('a' <= charAt && 'z' >= charAt) || (('A' <= charAt && 'Z' >= charAt) || charAt == ':'))) == (!z)) {
                    return i;
                }
                i++;
            }
            return i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean d(String str, String str2) {
            if (c25.g(str, str2)) {
                return true;
            }
            return b95.J1(str, str2, false, 2, null) && str.charAt((str.length() - str2.length()) - 1) == '.' && !sr5.h(str);
        }

        private final String h(String str) {
            if (!b95.J1(str, CryptoConstants.ALIAS_SEPARATOR, false, 2, null)) {
                String e = pr5.e(c95.c4(str, CryptoConstants.ALIAS_SEPARATOR));
                if (e != null) {
                    return e;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        private final long i(String str, int i, int i2) {
            int c = c(str, i, i2, false);
            Matcher matcher = pq5.d.matcher(str);
            int i3 = -1;
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            while (c < i2) {
                int c2 = c(str, c + 1, i2, true);
                matcher.region(c, c2);
                if (i4 != -1 || !matcher.usePattern(pq5.d).matches()) {
                    if (i5 != -1 || !matcher.usePattern(pq5.c).matches()) {
                        if (i6 != -1 || !matcher.usePattern(pq5.b).matches()) {
                            if (i3 == -1 && matcher.usePattern(pq5.a).matches()) {
                                String group = matcher.group(1);
                                c25.o(group, "matcher.group(1)");
                                i3 = Integer.parseInt(group);
                            }
                        } else {
                            String group2 = matcher.group(1);
                            c25.o(group2, "matcher.group(1)");
                            Locale locale = Locale.US;
                            c25.o(locale, "Locale.US");
                            Objects.requireNonNull(group2, "null cannot be cast to non-null type java.lang.String");
                            String lowerCase = group2.toLowerCase(locale);
                            c25.o(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                            String pattern = pq5.b.pattern();
                            c25.o(pattern, "MONTH_PATTERN.pattern()");
                            i6 = c95.r3(pattern, lowerCase, 0, false, 6, null) / 4;
                        }
                    } else {
                        String group3 = matcher.group(1);
                        c25.o(group3, "matcher.group(1)");
                        i5 = Integer.parseInt(group3);
                    }
                } else {
                    String group4 = matcher.group(1);
                    c25.o(group4, "matcher.group(1)");
                    i4 = Integer.parseInt(group4);
                    String group5 = matcher.group(2);
                    c25.o(group5, "matcher.group(2)");
                    i7 = Integer.parseInt(group5);
                    String group6 = matcher.group(3);
                    c25.o(group6, "matcher.group(3)");
                    i8 = Integer.parseInt(group6);
                }
                c = c(str, c2 + 1, i2, false);
            }
            if (70 <= i3 && 99 >= i3) {
                i3 += 1900;
            }
            if (i3 >= 0 && 69 >= i3) {
                i3 += 2000;
            }
            if (i3 >= 1601) {
                if (i6 != -1) {
                    if (1 <= i5 && 31 >= i5) {
                        if (i4 >= 0 && 23 >= i4) {
                            if (i7 >= 0 && 59 >= i7) {
                                if (i8 >= 0 && 59 >= i8) {
                                    GregorianCalendar gregorianCalendar = new GregorianCalendar(sr5.f);
                                    gregorianCalendar.setLenient(false);
                                    gregorianCalendar.set(1, i3);
                                    gregorianCalendar.set(2, i6 - 1);
                                    gregorianCalendar.set(5, i5);
                                    gregorianCalendar.set(11, i4);
                                    gregorianCalendar.set(12, i7);
                                    gregorianCalendar.set(13, i8);
                                    gregorianCalendar.set(14, 0);
                                    return gregorianCalendar.getTimeInMillis();
                                }
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        private final long j(String str) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong <= 0) {
                    return Long.MIN_VALUE;
                }
                return parseLong;
            } catch (NumberFormatException e) {
                if (new o85("-?\\d+").n(str)) {
                    return b95.u2(str, "-", false, 2, null) ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean k(zq5 zq5Var, String str) {
            String x = zq5Var.x();
            if (c25.g(x, str)) {
                return true;
            }
            return b95.u2(x, str, false, 2, null) && (b95.J1(str, "/", false, 2, null) || x.charAt(str.length()) == '/');
        }

        @jz4
        @Nullable
        public final pq5 e(@NotNull zq5 zq5Var, @NotNull String str) {
            c25.p(zq5Var, "url");
            c25.p(str, "setCookie");
            return f(System.currentTimeMillis(), zq5Var, str);
        }

        /* JADX WARN: Code restructure failed: missing block: B:56:0x0103, code lost:
            if (r1 > com.p7700g.p99005.ts5.a) goto L86;
         */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0115  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0118  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x015b  */
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final pq5 f(long j, @NotNull zq5 zq5Var, @NotNull String str) {
            long j2;
            String F;
            pq5 pq5Var;
            String str2;
            String str3;
            String str4;
            int E3;
            String str5;
            c25.p(zq5Var, "url");
            c25.p(str, "setCookie");
            int r = sr5.r(str, ';', 0, 0, 6, null);
            int r2 = sr5.r(str, '=', 0, r, 2, null);
            if (r2 == r) {
                return null;
            }
            String h0 = sr5.h0(str, 0, r2, 1, null);
            if ((h0.length() == 0) || sr5.B(h0) != -1) {
                return null;
            }
            String g0 = sr5.g0(str, r2 + 1, r);
            if (sr5.B(g0) != -1) {
                return null;
            }
            int i = r + 1;
            int length = str.length();
            String str6 = null;
            String str7 = null;
            long j3 = -1;
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = true;
            long j4 = ts5.a;
            while (i < length) {
                int p = sr5.p(str, ';', i, length);
                int p2 = sr5.p(str, '=', i, p);
                String g02 = sr5.g0(str, i, p2);
                String g03 = p2 < p ? sr5.g0(str, p2 + 1, p) : "";
                if (b95.K1(g02, "expires", true)) {
                    try {
                        j4 = i(g03, 0, g03.length());
                    } catch (NumberFormatException | IllegalArgumentException unused) {
                    }
                } else if (b95.K1(g02, "max-age", true)) {
                    j3 = j(g03);
                } else {
                    if (b95.K1(g02, "domain", true)) {
                        str6 = h(g03);
                        z4 = false;
                    } else if (b95.K1(g02, la1.k, true)) {
                        str7 = g03;
                    } else if (b95.K1(g02, "secure", true)) {
                        z = true;
                    } else if (b95.K1(g02, "httponly", true)) {
                        z2 = true;
                    }
                    i = p + 1;
                }
                z3 = true;
                i = p + 1;
            }
            long j5 = Long.MIN_VALUE;
            if (j3 != Long.MIN_VALUE) {
                if (j3 != -1) {
                    j5 = j + (j3 <= 9223372036854775L ? j3 * 1000 : Long.MAX_VALUE);
                    long j6 = j5 >= j ? ts5.a : ts5.a;
                    j2 = j6;
                } else {
                    j2 = j4;
                }
                F = zq5Var.F();
                if (str6 != null) {
                    str2 = F;
                    pq5Var = null;
                } else if (!d(F, str6)) {
                    return null;
                } else {
                    pq5Var = null;
                    str2 = str6;
                }
                if (F.length() == str2.length() && PublicSuffixDatabase.f.c().e(str2) == null) {
                    return pq5Var;
                }
                str3 = "/";
                str4 = str7;
                if (str4 == null && b95.u2(str4, "/", false, 2, pq5Var)) {
                    str5 = str4;
                } else {
                    String x = zq5Var.x();
                    E3 = c95.E3(x, j14.P, 0, false, 6, null);
                    if (E3 != 0) {
                        Objects.requireNonNull(x, "null cannot be cast to non-null type java.lang.String");
                        str3 = x.substring(0, E3);
                        c25.o(str3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    }
                    str5 = str3;
                }
                return new pq5(h0, g0, j2, str2, str5, z, z2, z3, z4, null);
            }
            j2 = j5;
            F = zq5Var.F();
            if (str6 != null) {
            }
            if (F.length() == str2.length()) {
            }
            str3 = "/";
            str4 = str7;
            if (str4 == null) {
            }
            String x2 = zq5Var.x();
            E3 = c95.E3(x2, j14.P, 0, false, 6, null);
            if (E3 != 0) {
            }
            str5 = str3;
            return new pq5(h0, g0, j2, str2, str5, z, z2, z3, z4, null);
        }

        @jz4
        @NotNull
        public final List<pq5> g(@NotNull zq5 zq5Var, @NotNull yq5 yq5Var) {
            c25.p(zq5Var, "url");
            c25.p(yq5Var, "headers");
            List<String> u = yq5Var.u(sm4.z);
            int size = u.size();
            ArrayList arrayList = null;
            for (int i = 0; i < size; i++) {
                pq5 e = e(zq5Var, u.get(i));
                if (e != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(e);
                }
            }
            if (arrayList != null) {
                List<pq5> unmodifiableList = Collections.unmodifiableList(arrayList);
                c25.o(unmodifiableList, "Collections.unmodifiableList(cookies)");
                return unmodifiableList;
            }
            return js4.F();
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private pq5(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f = str;
        this.g = str2;
        this.h = j;
        this.i = str3;
        this.j = str4;
        this.k = z;
        this.l = z2;
        this.m = z3;
        this.n = z4;
    }

    @jz4
    @Nullable
    public static final pq5 t(@NotNull zq5 zq5Var, @NotNull String str) {
        return e.e(zq5Var, str);
    }

    @jz4
    @NotNull
    public static final List<pq5> u(@NotNull zq5 zq5Var, @NotNull yq5 yq5Var) {
        return e.g(zq5Var, yq5Var);
    }

    @fz4(name = "-deprecated_domain")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "domain", imports = {}))
    @NotNull
    public final String a() {
        return this.i;
    }

    @fz4(name = "-deprecated_expiresAt")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "expiresAt", imports = {}))
    public final long b() {
        return this.h;
    }

    @fz4(name = "-deprecated_hostOnly")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "hostOnly", imports = {}))
    public final boolean c() {
        return this.n;
    }

    @fz4(name = "-deprecated_httpOnly")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "httpOnly", imports = {}))
    public final boolean d() {
        return this.l;
    }

    @fz4(name = "-deprecated_name")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "name", imports = {}))
    @NotNull
    public final String e() {
        return this.f;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof pq5) {
            pq5 pq5Var = (pq5) obj;
            if (c25.g(pq5Var.f, this.f) && c25.g(pq5Var.g, this.g) && pq5Var.h == this.h && c25.g(pq5Var.i, this.i) && c25.g(pq5Var.j, this.j) && pq5Var.k == this.k && pq5Var.l == this.l && pq5Var.m == this.m && pq5Var.n == this.n) {
                return true;
            }
        }
        return false;
    }

    @fz4(name = "-deprecated_path")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = la1.k, imports = {}))
    @NotNull
    public final String f() {
        return this.j;
    }

    @fz4(name = "-deprecated_persistent")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "persistent", imports = {}))
    public final boolean g() {
        return this.m;
    }

    @fz4(name = "-deprecated_secure")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "secure", imports = {}))
    public final boolean h() {
        return this.k;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        int x = wo1.x(this.g, wo1.x(this.f, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31), 31);
        int x2 = wo1.x(this.j, wo1.x(this.i, (jc5.a(this.h) + x) * 31, 31), 31);
        int a2 = qq5.a(this.l);
        int a3 = qq5.a(this.m);
        return qq5.a(this.n) + ((a3 + ((a2 + ((qq5.a(this.k) + x2) * 31)) * 31)) * 31);
    }

    @fz4(name = "-deprecated_value")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "value", imports = {}))
    @NotNull
    public final String i() {
        return this.g;
    }

    @fz4(name = "domain")
    @NotNull
    public final String n() {
        return this.i;
    }

    @fz4(name = "expiresAt")
    public final long o() {
        return this.h;
    }

    @fz4(name = "hostOnly")
    public final boolean p() {
        return this.n;
    }

    @fz4(name = "httpOnly")
    public final boolean q() {
        return this.l;
    }

    public final boolean r(@NotNull zq5 zq5Var) {
        boolean d2;
        c25.p(zq5Var, "url");
        if (!this.n) {
            d2 = e.d(zq5Var.F(), this.i);
        } else {
            d2 = c25.g(zq5Var.F(), this.i);
        }
        if (d2 && e.k(zq5Var, this.j)) {
            return !this.k || zq5Var.G();
        }
        return false;
    }

    @fz4(name = "name")
    @NotNull
    public final String s() {
        return this.f;
    }

    @NotNull
    public String toString() {
        return y(false);
    }

    @fz4(name = la1.k)
    @NotNull
    public final String v() {
        return this.j;
    }

    @fz4(name = "persistent")
    public final boolean w() {
        return this.m;
    }

    @fz4(name = "secure")
    public final boolean x() {
        return this.k;
    }

    @NotNull
    public final String y(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f);
        sb.append('=');
        sb.append(this.g);
        if (this.m) {
            if (this.h == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(ts5.b(new Date(this.h)));
            }
        }
        if (!this.n) {
            sb.append("; domain=");
            if (z) {
                sb.append(CryptoConstants.ALIAS_SEPARATOR);
            }
            sb.append(this.i);
        }
        sb.append("; path=");
        sb.append(this.j);
        if (this.k) {
            sb.append("; secure");
        }
        if (this.l) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        c25.o(sb2, "toString()");
        return sb2;
    }

    @fz4(name = "value")
    @NotNull
    public final String z() {
        return this.g;
    }

    public /* synthetic */ pq5(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, str3, str4, z, z2, z3, z4);
    }
}