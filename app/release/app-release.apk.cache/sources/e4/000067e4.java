package com.p7700g.p99005;

import com.anythink.core.api.ATAdConst;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Headers.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\u0018\u0000 42\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0002\u000e\u001bB\u0017\b\u0002\u0012\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00030.¢\u0006\u0004\b2\u00103J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0012J\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00172\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\"\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u001dH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#H\u0096\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\rH\u0016¢\u0006\u0004\b(\u0010\u000fJ\u000f\u0010)\u001a\u00020\u0003H\u0016¢\u0006\u0004\b)\u0010*J\u001f\u0010,\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00170+¢\u0006\u0004\b,\u0010-R\u001c\u00100\u001a\b\u0012\u0004\u0012\u00020\u00030.8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010/R\u0013\u00101\u001a\u00020\r8G@\u0006¢\u0006\u0006\u001a\u0004\b1\u0010\u000f¨\u00065"}, d2 = {"Lcom/p7700g/p99005/yq5;", "", "Lcom/p7700g/p99005/hp4;", "", "name", "c", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/util/Date;", "d", "(Ljava/lang/String;)Ljava/util/Date;", "Ljava/time/Instant;", "e", "(Ljava/lang/String;)Ljava/time/Instant;", "", "a", "()I", la1.l, "h", "(I)Ljava/lang/String;", "t", "", "i", "()Ljava/util/Set;", "", "u", "(Ljava/lang/String;)Ljava/util/List;", "", "b", "()J", "", "iterator", "()Ljava/util/Iterator;", "Lcom/p7700g/p99005/yq5$a;", com.anythink.expressad.d.a.b.dH, "()Lcom/p7700g/p99005/yq5$a;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "", "p", "()Ljava/util/Map;", "", "[Ljava/lang/String;", "namesAndValues", ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, "<init>", "([Ljava/lang/String;)V", "s", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class yq5 implements Iterable<hp4<? extends String, ? extends String>>, n35 {
    public static final b s = new b(null);
    private final String[] t;

    /* compiled from: Headers.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u00004\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b%\u0010&J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u001d\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0017\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0011H\u0086\u0002¢\u0006\u0004\b\u0017\u0010\u0013J \u0010\u0018\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0014H\u0087\u0002¢\u0006\u0004\b\u0018\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0019\u0010\u000bJ\u0015\u0010\u001a\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u0006J \u0010\u001b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u001b\u0010\u000bJ\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\r¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020 8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#¨\u0006'"}, d2 = {"com/p7700g/p99005/yq5$a", "", "", "line", "Lcom/p7700g/p99005/yq5$a;", "f", "(Ljava/lang/String;)Lcom/p7700g/p99005/yq5$a;", "a", "name", "value", "b", "(Ljava/lang/String;Ljava/lang/String;)Lcom/p7700g/p99005/yq5$a;", "h", "Lcom/p7700g/p99005/yq5;", "headers", "e", "(Lcom/p7700g/p99005/yq5;)Lcom/p7700g/p99005/yq5$a;", "Ljava/util/Date;", "d", "(Ljava/lang/String;Ljava/util/Date;)Lcom/p7700g/p99005/yq5$a;", "Ljava/time/Instant;", "c", "(Ljava/lang/String;Ljava/time/Instant;)Lcom/p7700g/p99005/yq5$a;", ij3.b, "n", com.anythink.basead.d.g.i, "l", com.anythink.expressad.d.a.b.dH, "j", "(Ljava/lang/String;)Ljava/lang/String;", "i", "()Lcom/p7700g/p99005/yq5;", "", "Ljava/util/List;", "k", "()Ljava/util/List;", "namesAndValues", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        @NotNull
        private final List<String> a = new ArrayList(20);

        @NotNull
        public final a a(@NotNull String str) {
            c25.p(str, "line");
            int q3 = c95.q3(str, ':', 0, false, 6, null);
            if (q3 != -1) {
                String substring = str.substring(0, q3);
                c25.o(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                Objects.requireNonNull(substring, "null cannot be cast to non-null type kotlin.CharSequence");
                String obj = c95.E5(substring).toString();
                String substring2 = str.substring(q3 + 1);
                c25.o(substring2, "(this as java.lang.String).substring(startIndex)");
                b(obj, substring2);
                return this;
            }
            throw new IllegalArgumentException(wo1.t("Unexpected header: ", str).toString());
        }

        @NotNull
        public final a b(@NotNull String str, @NotNull String str2) {
            c25.p(str, "name");
            c25.p(str2, "value");
            b bVar = yq5.s;
            bVar.f(str);
            bVar.g(str2, str);
            g(str, str2);
            return this;
        }

        @IgnoreJRERequirement
        @NotNull
        public final a c(@NotNull String str, @NotNull Instant instant) {
            c25.p(str, "name");
            c25.p(instant, "value");
            d(str, new Date(instant.toEpochMilli()));
            return this;
        }

        @NotNull
        public final a d(@NotNull String str, @NotNull Date date) {
            c25.p(str, "name");
            c25.p(date, "value");
            b(str, ts5.b(date));
            return this;
        }

        @NotNull
        public final a e(@NotNull yq5 yq5Var) {
            c25.p(yq5Var, "headers");
            int size = yq5Var.size();
            for (int i = 0; i < size; i++) {
                g(yq5Var.h(i), yq5Var.t(i));
            }
            return this;
        }

        @NotNull
        public final a f(@NotNull String str) {
            c25.p(str, "line");
            int q3 = c95.q3(str, ':', 1, false, 4, null);
            if (q3 != -1) {
                String substring = str.substring(0, q3);
                c25.o(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String substring2 = str.substring(q3 + 1);
                c25.o(substring2, "(this as java.lang.String).substring(startIndex)");
                g(substring, substring2);
            } else if (str.charAt(0) == ':') {
                String substring3 = str.substring(1);
                c25.o(substring3, "(this as java.lang.String).substring(startIndex)");
                g("", substring3);
            } else {
                g("", str);
            }
            return this;
        }

        @NotNull
        public final a g(@NotNull String str, @NotNull String str2) {
            c25.p(str, "name");
            c25.p(str2, "value");
            this.a.add(str);
            this.a.add(c95.E5(str2).toString());
            return this;
        }

        @NotNull
        public final a h(@NotNull String str, @NotNull String str2) {
            c25.p(str, "name");
            c25.p(str2, "value");
            yq5.s.f(str);
            g(str, str2);
            return this;
        }

        @NotNull
        public final yq5 i() {
            Object[] array = this.a.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            return new yq5((String[]) array, null);
        }

        @Nullable
        public final String j(@NotNull String str) {
            c25.p(str, "name");
            a55 e1 = i55.e1(i55.W(this.a.size() - 2, 0), 2);
            int e = e1.e();
            int h = e1.h();
            int i = e1.i();
            if (i >= 0) {
                if (e > h) {
                    return null;
                }
            } else if (e < h) {
                return null;
            }
            while (!b95.K1(str, this.a.get(e), true)) {
                if (e == h) {
                    return null;
                }
                e += i;
            }
            return this.a.get(e + 1);
        }

        @NotNull
        public final List<String> k() {
            return this.a;
        }

        @NotNull
        public final a l(@NotNull String str) {
            c25.p(str, "name");
            int i = 0;
            while (i < this.a.size()) {
                if (b95.K1(str, this.a.get(i), true)) {
                    this.a.remove(i);
                    this.a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        @NotNull
        public final a m(@NotNull String str, @NotNull String str2) {
            c25.p(str, "name");
            c25.p(str2, "value");
            b bVar = yq5.s;
            bVar.f(str);
            bVar.g(str2, str);
            l(str);
            g(str, str2);
            return this;
        }

        @IgnoreJRERequirement
        @NotNull
        public final a n(@NotNull String str, @NotNull Instant instant) {
            c25.p(str, "name");
            c25.p(instant, "value");
            return o(str, new Date(instant.toEpochMilli()));
        }

        @NotNull
        public final a o(@NotNull String str, @NotNull Date date) {
            c25.p(str, "name");
            c25.p(date, "value");
            m(str, ts5.b(date));
            return this;
        }
    }

    /* compiled from: Headers.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0006\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0011\u001a\u00020\u000e2\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H\u0007¢\u0006\u0004\b\u0011\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u000e*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0016\u001a\u00020\u000e2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0012H\u0007¢\u0006\u0004\b\u0016\u0010\u0014¨\u0006\u0019"}, d2 = {"com/p7700g/p99005/yq5$b", "", "", "", "namesAndValues", "name", "h", "([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lcom/p7700g/p99005/yq4;", "f", "(Ljava/lang/String;)V", "value", com.anythink.basead.d.g.i, "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/p7700g/p99005/yq5;", "j", "([Ljava/lang/String;)Lcom/p7700g/p99005/yq5;", "b", "", "i", "(Ljava/util/Map;)Lcom/p7700g/p99005/yq5;", "headers", "a", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void f(String str) {
            if (str.length() > 0) {
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char charAt = str.charAt(i);
                    if (!('!' <= charAt && '~' >= charAt)) {
                        throw new IllegalArgumentException(sr5.v("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str).toString());
                    }
                }
                return;
            }
            throw new IllegalArgumentException("name is empty".toString());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void g(String str, String str2) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (!(charAt == '\t' || (' ' <= charAt && '~' >= charAt))) {
                    throw new IllegalArgumentException(sr5.v("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i), str2, str).toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String h(String[] strArr, String str) {
            a55 e1 = i55.e1(i55.W(strArr.length - 2, 0), 2);
            int e = e1.e();
            int h = e1.h();
            int i = e1.i();
            if (i >= 0) {
                if (e > h) {
                    return null;
                }
            } else if (e < h) {
                return null;
            }
            while (!b95.K1(str, strArr[e], true)) {
                if (e == h) {
                    return null;
                }
                e += i;
            }
            return strArr[e + 1];
        }

        @fz4(name = "-deprecated_of")
        @xn4(level = zn4.ERROR, message = "function moved to extension", replaceWith = @op4(expression = "headers.toHeaders()", imports = {}))
        @NotNull
        public final yq5 a(@NotNull Map<String, String> map) {
            c25.p(map, "headers");
            return i(map);
        }

        @fz4(name = "-deprecated_of")
        @xn4(level = zn4.ERROR, message = "function name changed", replaceWith = @op4(expression = "headersOf(*namesAndValues)", imports = {}))
        @NotNull
        public final yq5 b(@NotNull String... strArr) {
            c25.p(strArr, "namesAndValues");
            return j((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        @fz4(name = "of")
        @jz4
        @NotNull
        public final yq5 i(@NotNull Map<String, String> map) {
            c25.p(map, "$this$toHeaders");
            String[] strArr = new String[map.size() * 2];
            int i = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                Objects.requireNonNull(key, "null cannot be cast to non-null type kotlin.CharSequence");
                String obj = c95.E5(key).toString();
                Objects.requireNonNull(value, "null cannot be cast to non-null type kotlin.CharSequence");
                String obj2 = c95.E5(value).toString();
                f(obj);
                g(obj2, obj);
                strArr[i] = obj;
                strArr[i + 1] = obj2;
                i += 2;
            }
            return new yq5(strArr, null);
        }

        @fz4(name = "of")
        @jz4
        @NotNull
        public final yq5 j(@NotNull String... strArr) {
            c25.p(strArr, "namesAndValues");
            if (strArr.length % 2 == 0) {
                Object clone = strArr.clone();
                Objects.requireNonNull(clone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                String[] strArr2 = (String[]) clone;
                int length = strArr2.length;
                for (int i = 0; i < length; i++) {
                    if (strArr2[i] != null) {
                        String str = strArr2[i];
                        Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
                        strArr2[i] = c95.E5(str).toString();
                    } else {
                        throw new IllegalArgumentException("Headers cannot be null".toString());
                    }
                }
                a55 e1 = i55.e1(i55.z1(0, strArr2.length), 2);
                int e = e1.e();
                int h = e1.h();
                int i2 = e1.i();
                if (i2 < 0 ? e >= h : e <= h) {
                    while (true) {
                        String str2 = strArr2[e];
                        String str3 = strArr2[e + 1];
                        f(str2);
                        g(str3, str2);
                        if (e == h) {
                            break;
                        }
                        e += i2;
                    }
                }
                return new yq5(strArr2, null);
            }
            throw new IllegalArgumentException("Expected alternating header names and values".toString());
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private yq5(String[] strArr) {
        this.t = strArr;
    }

    @fz4(name = "of")
    @jz4
    @NotNull
    public static final yq5 n(@NotNull Map<String, String> map) {
        return s.i(map);
    }

    @fz4(name = "of")
    @jz4
    @NotNull
    public static final yq5 o(@NotNull String... strArr) {
        return s.j(strArr);
    }

    @fz4(name = "-deprecated_size")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, imports = {}))
    public final int a() {
        return size();
    }

    public final long b() {
        String[] strArr = this.t;
        long length = strArr.length * 2;
        for (int i = 0; i < strArr.length; i++) {
            length += this.t[i].length();
        }
        return length;
    }

    @Nullable
    public final String c(@NotNull String str) {
        c25.p(str, "name");
        return s.h(this.t, str);
    }

    @Nullable
    public final Date d(@NotNull String str) {
        c25.p(str, "name");
        String c = c(str);
        if (c != null) {
            return ts5.a(c);
        }
        return null;
    }

    @IgnoreJRERequirement
    @Nullable
    public final Instant e(@NotNull String str) {
        c25.p(str, "name");
        Date d = d(str);
        if (d != null) {
            return d.toInstant();
        }
        return null;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof yq5) && Arrays.equals(this.t, ((yq5) obj).t);
    }

    @NotNull
    public final String h(int i) {
        return this.t[i * 2];
    }

    public int hashCode() {
        return Arrays.hashCode(this.t);
    }

    @NotNull
    public final Set<String> i() {
        TreeSet treeSet = new TreeSet(b95.S1(j35.a));
        int size = size();
        for (int i = 0; i < size; i++) {
            treeSet.add(h(i));
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(treeSet);
        c25.o(unmodifiableSet, "Collections.unmodifiableSet(result)");
        return unmodifiableSet;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<hp4<? extends String, ? extends String>> iterator() {
        int size = size();
        hp4[] hp4VarArr = new hp4[size];
        for (int i = 0; i < size; i++) {
            hp4VarArr[i] = cq4.a(h(i), t(i));
        }
        return a15.a(hp4VarArr);
    }

    @NotNull
    public final a m() {
        a aVar = new a();
        os4.q0(aVar.k(), this.t);
        return aVar;
    }

    @NotNull
    public final Map<String, List<String>> p() {
        TreeMap treeMap = new TreeMap(b95.S1(j35.a));
        int size = size();
        for (int i = 0; i < size; i++) {
            String h = h(i);
            Locale locale = Locale.US;
            c25.o(locale, "Locale.US");
            Objects.requireNonNull(h, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = h.toLowerCase(locale);
            c25.o(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(t(i));
        }
        return treeMap;
    }

    @fz4(name = ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE)
    public final int size() {
        return this.t.length / 2;
    }

    @NotNull
    public final String t(int i) {
        return this.t[(i * 2) + 1];
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            sb.append(h(i));
            sb.append(": ");
            sb.append(t(i));
            sb.append("\n");
        }
        String sb2 = sb.toString();
        c25.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @NotNull
    public final List<String> u(@NotNull String str) {
        c25.p(str, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if (b95.K1(str, h(i), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(t(i));
            }
        }
        if (arrayList != null) {
            List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
            c25.o(unmodifiableList, "Collections.unmodifiableList(result)");
            return unmodifiableList;
        }
        return js4.F();
    }

    public /* synthetic */ yq5(String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(strArr);
    }
}