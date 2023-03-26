package com.p7700g.p99005;

import android.net.Uri;
import java.net.URI;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class i73 {
    @NotNull
    public static final a a = new a(null);
    private boolean b;
    private boolean c = true;
    private boolean d;
    private boolean e;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final Map<String, String> a(URI uri) {
        Uri parse = Uri.parse(uri.toString());
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : queryParameterNames) {
            c25.o(str, "param");
            String queryParameter = parse.getQueryParameter(str);
            if (queryParameter == null) {
                queryParameter = "";
            }
            linkedHashMap.put(str, queryParameter);
        }
        return linkedHashMap;
    }

    private final boolean c(String str, String str2, boolean z) {
        if (str == null || str2 == null) {
            return str == str2;
        } else if (z) {
            return c25.g(str, str2);
        } else {
            return b95.K1(str, str2, true);
        }
    }

    private final boolean d(URI uri, URI uri2) {
        int port = uri.getPort();
        int port2 = uri2.getPort();
        if (port == port2) {
            return true;
        }
        if (port == -1) {
            String scheme = uri.getScheme() == null ? "http" : uri.getScheme();
            c25.o(scheme, "if (uri1.scheme == null) \"http\" else uri1.scheme");
            String lowerCase = scheme.toLowerCase();
            c25.o(lowerCase, "(this as java.lang.String).toLowerCase()");
            port = c25.g(lowerCase, "http") ? 80 : 443;
        }
        if (port2 == -1) {
            String scheme2 = uri2.getScheme() == null ? "http" : uri2.getScheme();
            c25.o(scheme2, "if (uri2.scheme == null) \"http\" else uri2.scheme");
            String lowerCase2 = scheme2.toLowerCase();
            c25.o(lowerCase2, "(this as java.lang.String).toLowerCase()");
            port2 = c25.g(lowerCase2, "http") ? 80 : 443;
        }
        return port == port2;
    }

    private final boolean e(Map<String, String> map, Map<String, String> map2, boolean z) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (!c(entry.getValue(), map2.get(entry.getKey()), z)) {
                return false;
            }
        }
        for (Map.Entry<String, String> entry2 : map2.entrySet()) {
            if (!c(map2.get(entry2.getKey()), entry2.getValue(), z)) {
                return false;
            }
        }
        return true;
    }

    public final boolean b(@NotNull String str, @NotNull String str2) {
        c25.p(str, "url1");
        c25.p(str2, "url2");
        try {
            if (c25.g(str, str2)) {
                return true;
            }
            URI uri = new URI(str);
            URI uri2 = new URI(str2);
            String path = uri.getPath();
            String path2 = (c25.g(uri.getPath(), "/") && c25.g(uri2.getPath(), "")) ? "/" : uri2.getPath();
            URI uri3 = new URI(uri.getScheme(), null, uri.getHost(), uri.getPort(), (c25.g(uri2.getPath(), "/") && c25.g(uri.getPath(), "")) ? "/" : path, uri.getQuery(), uri.getFragment());
            URI uri4 = new URI(uri2.getScheme(), null, uri2.getHost(), uri2.getPort(), path2, uri2.getQuery(), uri2.getFragment());
            if (!e(a(uri3), a(uri4), this.d)) {
                xz2.c("UrlComp", "Query not equal");
                return false;
            } else if (!c(uri3.getScheme(), uri4.getScheme(), this.e)) {
                xz2.c("UrlComp", "Scheme not equal");
                return false;
            } else if (!c(uri3.getPath(), uri4.getPath(), this.c)) {
                xz2.c("UrlComp", "Path not equal");
                return false;
            } else if (!d(uri3, uri4)) {
                xz2.c("UrlComp", "Port not equal");
                return false;
            } else if (c(uri3.getHost(), uri4.getHost(), this.b)) {
                return true;
            } else {
                xz2.c("UrlComp", "Host not equal");
                return false;
            }
        } catch (Exception e) {
            xz2.b("UrlComp", "[Error] Uri not valid: ", e);
            return false;
        }
    }
}