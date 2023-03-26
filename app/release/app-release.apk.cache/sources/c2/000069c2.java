package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.ads.RequestConfiguration;
import com.microsoft.appcenter.utils.crypto.CryptoConstants;
import com.p7700g.p99005.kg;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xbill.DNS.Type;
import org.xbill.DNS.WKSRecord;

/* compiled from: HttpUrl.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\"\n\u0002\b2\u0018\u0000 52\u00020\u0001:\u0002:+Bc\b\u0000\u0012\u0006\u0010@\u001a\u00020\b\u0012\u0006\u0010L\u001a\u00020\b\u0012\u0006\u0010N\u001a\u00020\b\u0012\u0006\u0010f\u001a\u00020\b\u0012\u0006\u0010=\u001a\u00020\u000f\u0012\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\b0\f\u0012\u0010\u0010F\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\f\u0012\b\u0010T\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010X\u001a\u00020\b¢\u0006\u0004\bg\u0010hJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\f2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0012J\r\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\bH\u0016¢\u0006\u0004\b$\u0010\u0015J\u000f\u0010%\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b%\u0010\u0015J\u000f\u0010&\u001a\u00020\u0002H\u0007¢\u0006\u0004\b&\u0010\u0004J\u000f\u0010'\u001a\u00020\u0005H\u0007¢\u0006\u0004\b'\u0010\u0007J\u000f\u0010(\u001a\u00020\bH\u0007¢\u0006\u0004\b(\u0010\u0015J\u000f\u0010)\u001a\u00020\bH\u0007¢\u0006\u0004\b)\u0010\u0015J\u000f\u0010*\u001a\u00020\bH\u0007¢\u0006\u0004\b*\u0010\u0015J\u000f\u0010+\u001a\u00020\bH\u0007¢\u0006\u0004\b+\u0010\u0015J\u000f\u0010,\u001a\u00020\bH\u0007¢\u0006\u0004\b,\u0010\u0015J\u000f\u0010-\u001a\u00020\bH\u0007¢\u0006\u0004\b-\u0010\u0015J\u000f\u0010.\u001a\u00020\u000fH\u0007¢\u0006\u0004\b.\u0010#J\u000f\u0010/\u001a\u00020\u000fH\u0007¢\u0006\u0004\b/\u0010#J\u000f\u00100\u001a\u00020\bH\u0007¢\u0006\u0004\b0\u0010\u0015J\u0015\u00101\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0007¢\u0006\u0004\b1\u00102J\u0015\u00103\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0007¢\u0006\u0004\b3\u00102J\u0011\u00104\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b4\u0010\u0015J\u0011\u00105\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b5\u0010\u0015J\u000f\u00106\u001a\u00020\u000fH\u0007¢\u0006\u0004\b6\u0010#J\u0015\u00108\u001a\b\u0012\u0004\u0012\u00020\b07H\u0007¢\u0006\u0004\b8\u00109J\u0011\u0010:\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b:\u0010\u0015J\u0011\u0010;\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b;\u0010\u0015R\u0019\u0010=\u001a\u00020\u000f8\u0007@\u0006¢\u0006\f\n\u0004\b*\u0010\u001c\u001a\u0004\b<\u0010#R\u0019\u0010@\u001a\u00020\b8\u0007@\u0006¢\u0006\f\n\u0004\b6\u0010>\u001a\u0004\b?\u0010\u0015R\u0019\u0010C\u001a\u00020\u001f8\u0006@\u0006¢\u0006\f\n\u0004\b8\u0010\u0006\u001a\u0004\bA\u0010BR \u0010F\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0015\u0010H\u001a\u0004\u0018\u00010\b8G@\u0006¢\u0006\u0006\u001a\u0004\bG\u0010\u0015R\u0013\u0010J\u001a\u00020\b8G@\u0006¢\u0006\u0006\u001a\u0004\bI\u0010\u0015R\u0019\u0010L\u001a\u00020\b8\u0007@\u0006¢\u0006\f\n\u0004\b(\u0010>\u001a\u0004\bK\u0010\u0015R\u0019\u0010N\u001a\u00020\b8\u0007@\u0006¢\u0006\f\n\u0004\b'\u0010>\u001a\u0004\bM\u0010\u0015R\u0013\u0010P\u001a\u00020\u000f8G@\u0006¢\u0006\u0006\u001a\u0004\bO\u0010#R\u0013\u0010R\u001a\u00020\b8G@\u0006¢\u0006\u0006\u001a\u0004\bQ\u0010\u0015R\u001b\u0010T\u001a\u0004\u0018\u00010\b8\u0007@\u0006¢\u0006\f\n\u0004\bG\u0010>\u001a\u0004\bS\u0010\u0015R\u001f\u0010W\u001a\b\u0012\u0004\u0012\u00020\b0\f8\u0007@\u0006¢\u0006\f\n\u0004\bU\u0010E\u001a\u0004\bV\u00102R\u0016\u0010X\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010>R\u0013\u0010Z\u001a\u00020\b8G@\u0006¢\u0006\u0006\u001a\u0004\bY\u0010\u0015R\u0015\u0010\\\u001a\u0004\u0018\u00010\b8G@\u0006¢\u0006\u0006\u001a\u0004\b[\u0010\u0015R\u0019\u0010^\u001a\b\u0012\u0004\u0012\u00020\b0\f8G@\u0006¢\u0006\u0006\u001a\u0004\b]\u00102R\u0013\u0010`\u001a\u00020\u000f8G@\u0006¢\u0006\u0006\u001a\u0004\b_\u0010#R\u0019\u0010b\u001a\b\u0012\u0004\u0012\u00020\b078G@\u0006¢\u0006\u0006\u001a\u0004\ba\u00109R\u0015\u0010d\u001a\u0004\u0018\u00010\b8G@\u0006¢\u0006\u0006\u001a\u0004\bc\u0010\u0015R\u0019\u0010f\u001a\u00020\b8\u0007@\u0006¢\u0006\f\n\u0004\b&\u0010>\u001a\u0004\be\u0010\u0015¨\u0006i"}, d2 = {"Lcom/p7700g/p99005/zq5;", "", "Ljava/net/URL;", "a0", "()Ljava/net/URL;", "Ljava/net/URI;", "Z", "()Ljava/net/URI;", "", "name", "P", "(Ljava/lang/String;)Ljava/lang/String;", "", "T", "(Ljava/lang/String;)Ljava/util/List;", "", la1.l, "Q", "(I)Ljava/lang/String;", "S", bx.C4, "()Ljava/lang/String;", "link", bx.y4, "(Ljava/lang/String;)Lcom/p7700g/p99005/zq5;", "Lcom/p7700g/p99005/zq5$a;", "H", "()Lcom/p7700g/p99005/zq5$a;", AFHydra.STATUS_IDLE, "(Ljava/lang/String;)Lcom/p7700g/p99005/zq5$a;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Y", "r", "q", "p", "f", "s", "b", "i", "h", "l", "k", "c", "d", "()Ljava/util/List;", "j", "e", com.anythink.expressad.d.a.b.dH, ij3.b, "", "n", "()Ljava/util/Set;", "a", com.anythink.basead.d.g.i, "N", "port", "Ljava/lang/String;", "X", "scheme", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "()Z", "isHttps", "u", "Ljava/util/List;", "queryNamesAndValues", com.ironsource.sdk.controller.v.a, "encodedFragment", "x", "encodedPath", "b0", "username", "K", "password", "M", "pathSize", "w", "encodedPassword", AFHydra.EV_BYTECOUNT, "fragment", "t", "L", "pathSegments", "url", bx.B4, "encodedUsername", "O", SearchIntents.EXTRA_QUERY, "y", "encodedPathSegments", "U", "querySize", "R", "queryParameterNames", "z", "encodedQuery", "F", "host", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class zq5 {
    @NotNull
    public static final String b = " \"':;<=>@[]^`{}|/\\?#";
    @NotNull
    public static final String c = " \"':;<=>@[]^`{}|/\\?#";
    @NotNull
    public static final String d = " \"<>^`{}|/\\?#";
    @NotNull
    public static final String e = "[]";
    @NotNull
    public static final String f = " \"'<>#";
    @NotNull
    public static final String g = " \"'<>#&=";
    @NotNull
    public static final String h = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";
    @NotNull
    public static final String i = "\\^`{|}";
    @NotNull
    public static final String j = " \"':;<=>@[]^`{}|/\\?#&!$(),~";
    @NotNull
    public static final String k = "";
    @NotNull
    public static final String l = " \"#<>\\^`{|}";
    private final boolean n;
    @NotNull
    private final String o;
    @NotNull
    private final String p;
    @NotNull
    private final String q;
    @NotNull
    private final String r;
    private final int s;
    @NotNull
    private final List<String> t;
    private final List<String> u;
    @Nullable
    private final String v;
    private final String w;
    public static final b m = new b(null);
    private static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* compiled from: HttpUrl.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bC\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010!\n\u0002\b\u000e\u0018\u0000 42\u00020\u0001:\u00012B\u0007¢\u0006\u0004\bo\u0010\u001dJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u0005¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\t2\u0006\u0010!\u001a\u00020\u0005¢\u0006\u0004\b\"\u0010 J\u0015\u0010$\u001a\u00020\t2\u0006\u0010#\u001a\u00020\u0005¢\u0006\u0004\b$\u0010 J\u0015\u0010&\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u0005¢\u0006\u0004\b&\u0010 J\u0015\u0010(\u001a\u00020\t2\u0006\u0010'\u001a\u00020\u0005¢\u0006\u0004\b(\u0010 J\u0015\u0010*\u001a\u00020\t2\u0006\u0010)\u001a\u00020\u0005¢\u0006\u0004\b*\u0010 J\u0015\u0010,\u001a\u00020\t2\u0006\u0010+\u001a\u00020\u0002¢\u0006\u0004\b,\u0010-J\u0015\u0010/\u001a\u00020\t2\u0006\u0010.\u001a\u00020\u0005¢\u0006\u0004\b/\u0010 J\u0015\u00100\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b0\u0010 J\u0015\u00102\u001a\u00020\t2\u0006\u00101\u001a\u00020\u0005¢\u0006\u0004\b2\u0010 J\u0015\u00104\u001a\u00020\t2\u0006\u00103\u001a\u00020\u0005¢\u0006\u0004\b4\u0010 J\u001d\u00106\u001a\u00020\t2\u0006\u00105\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u0005¢\u0006\u0004\b6\u00107J\u001d\u00108\u001a\u00020\t2\u0006\u00105\u001a\u00020\u00022\u0006\u00101\u001a\u00020\u0005¢\u0006\u0004\b8\u00107J\u0015\u00109\u001a\u00020\t2\u0006\u00105\u001a\u00020\u0002¢\u0006\u0004\b9\u0010-J\u0015\u0010;\u001a\u00020\t2\u0006\u0010:\u001a\u00020\u0005¢\u0006\u0004\b;\u0010 J\u0017\u0010=\u001a\u00020\t2\b\u0010<\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b=\u0010 J\u0017\u0010?\u001a\u00020\t2\b\u0010>\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b?\u0010 J\u001f\u0010B\u001a\u00020\t2\u0006\u0010@\u001a\u00020\u00052\b\u0010A\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\bB\u0010CJ\u001f\u0010F\u001a\u00020\t2\u0006\u0010D\u001a\u00020\u00052\b\u0010E\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\bF\u0010CJ\u001f\u0010G\u001a\u00020\t2\u0006\u0010@\u001a\u00020\u00052\b\u0010A\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\bG\u0010CJ\u001f\u0010H\u001a\u00020\t2\u0006\u0010D\u001a\u00020\u00052\b\u0010E\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\bH\u0010CJ\u0015\u0010I\u001a\u00020\t2\u0006\u0010@\u001a\u00020\u0005¢\u0006\u0004\bI\u0010 J\u0015\u0010J\u001a\u00020\t2\u0006\u0010D\u001a\u00020\u0005¢\u0006\u0004\bJ\u0010 J\u0017\u0010L\u001a\u00020\t2\b\u0010K\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\bL\u0010 J\u0017\u0010N\u001a\u00020\t2\b\u0010M\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\bN\u0010 J\u000f\u0010O\u001a\u00020\tH\u0000¢\u0006\u0004\bO\u0010PJ\r\u0010R\u001a\u00020Q¢\u0006\u0004\bR\u0010SJ\u000f\u0010T\u001a\u00020\u0005H\u0016¢\u0006\u0004\bT\u0010UJ!\u0010W\u001a\u00020\t2\b\u0010V\u001a\u0004\u0018\u00010Q2\u0006\u0010\u0010\u001a\u00020\u0005H\u0000¢\u0006\u0004\bW\u0010XR$\u0010)\u001a\u0004\u0018\u00010\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010Y\u001a\u0004\bZ\u0010U\"\u0004\b[\u0010\u000fR\"\u0010#\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u0010Y\u001a\u0004\b\\\u0010U\"\u0004\b]\u0010\u000fR\"\u0010'\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u0010Y\u001a\u0004\b^\u0010U\"\u0004\b_\u0010\u000fR$\u0010M\u001a\u0004\u0018\u00010\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bN\u0010Y\u001a\u0004\b`\u0010U\"\u0004\ba\u0010\u000fR,\u0010h\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\"\u00103\u001a\b\u0012\u0004\u0012\u00020\u00050b8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\bR\u0010c\u001a\u0004\bi\u0010eR$\u0010\u001e\u001a\u0004\u0018\u00010\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bF\u0010Y\u001a\u0004\bj\u0010U\"\u0004\bk\u0010\u000fR\"\u0010+\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bB\u0010J\u001a\u0004\bl\u0010\u0004\"\u0004\bm\u0010n¨\u0006p"}, d2 = {"com/p7700g/p99005/zq5$a", "", "", "i", "()I", "", "pathSegments", "", "alreadyEncoded", "Lcom/p7700g/p99005/zq5$a;", "f", "(Ljava/lang/String;Z)Lcom/p7700g/p99005/zq5$a;", "canonicalName", "Lcom/p7700g/p99005/yq4;", "H", "(Ljava/lang/String;)V", "input", "startPos", "limit", "L", "(Ljava/lang/String;II)V", "pos", "addTrailingSlash", "E", "(Ljava/lang/String;IIZZ)V", "y", "(Ljava/lang/String;)Z", "z", "C", "()V", "scheme", "M", "(Ljava/lang/String;)Lcom/p7700g/p99005/zq5$a;", "username", "Y", "encodedUsername", "n", "password", AFHydra.EV_BYTECOUNT, "encodedPassword", "k", "host", "x", "port", "D", "(I)Lcom/p7700g/p99005/zq5$a;", "pathSegment", "d", "e", "encodedPathSegment", "a", "encodedPathSegments", "b", la1.l, "U", "(ILjava/lang/String;)Lcom/p7700g/p99005/zq5$a;", "P", "K", "encodedPath", "l", SearchIntents.EXTRA_QUERY, "F", "encodedQuery", com.anythink.expressad.d.a.b.dH, "name", "value", com.anythink.basead.d.g.i, "(Ljava/lang/String;Ljava/lang/String;)Lcom/p7700g/p99005/zq5$a;", "encodedName", "encodedValue", "c", bx.y4, "R", "J", AFHydra.STATUS_IDLE, "fragment", ij3.b, "encodedFragment", "j", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "()Lcom/p7700g/p99005/zq5$a;", "Lcom/p7700g/p99005/zq5;", "h", "()Lcom/p7700g/p99005/zq5;", "toString", "()Ljava/lang/String;", "base", bx.B4, "(Lcom/p7700g/p99005/zq5;Ljava/lang/String;)Lcom/p7700g/p99005/zq5$a;", "Ljava/lang/String;", "u", "T", "t", "S", "q", "O", "p", "N", "", "Ljava/util/List;", "s", "()Ljava/util/List;", "Q", "(Ljava/util/List;)V", "encodedQueryNamesAndValues", "r", "w", "X", com.ironsource.sdk.controller.v.a, bx.C4, "(I)V", "<init>", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        @NotNull
        public static final String a = "Invalid URL host";
        public static final C0280a b = new C0280a(null);
        @Nullable
        private String c;
        @Nullable
        private String f;
        @NotNull
        private final List<String> h;
        @Nullable
        private List<String> i;
        @Nullable
        private String j;
        @NotNull
        private String d = "";
        @NotNull
        private String e = "";
        private int g = -1;

        /* compiled from: HttpUrl.kt */
        @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\t\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ'\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ'\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\bR\u0016\u0010\f\u001a\u00020\u00028\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"com/p7700g/p99005/zq5$a$a", "", "", "input", "", "pos", "limit", com.anythink.basead.d.g.i, "(Ljava/lang/String;II)I", "h", "f", "e", "INVALID_HOST", "Ljava/lang/String;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* renamed from: com.p7700g.p99005.zq5$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0280a {
            private C0280a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int e(String str, int i, int i2) {
                try {
                    int parseInt = Integer.parseInt(b.f(zq5.m, str, i, i2, "", false, false, false, false, null, 248, null));
                    if (1 <= parseInt && 65535 >= parseInt) {
                        return parseInt;
                    }
                    return -1;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int f(String str, int i, int i2) {
                while (i < i2) {
                    char charAt = str.charAt(i);
                    if (charAt == ':') {
                        return i;
                    }
                    if (charAt == '[') {
                        do {
                            i++;
                            if (i < i2) {
                            }
                        } while (str.charAt(i) != ']');
                    }
                    i++;
                }
                return i2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int g(String str, int i, int i2) {
                if (i2 - i < 2) {
                    return -1;
                }
                char charAt = str.charAt(i);
                if ((c25.t(charAt, 97) < 0 || c25.t(charAt, 122) > 0) && (c25.t(charAt, 65) < 0 || c25.t(charAt, 90) > 0)) {
                    return -1;
                }
                while (true) {
                    i++;
                    if (i >= i2) {
                        return -1;
                    }
                    char charAt2 = str.charAt(i);
                    if ('a' > charAt2 || 'z' < charAt2) {
                        if ('A' > charAt2 || 'Z' < charAt2) {
                            if ('0' > charAt2 || '9' < charAt2) {
                                if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                    if (charAt2 == ':') {
                                        return i;
                                    }
                                    return -1;
                                }
                            }
                        }
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int h(String str, int i, int i2) {
                int i3 = 0;
                while (i < i2) {
                    char charAt = str.charAt(i);
                    if (charAt != '\\' && charAt != '/') {
                        break;
                    }
                    i3++;
                    i++;
                }
                return i3;
            }

            public /* synthetic */ C0280a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public a() {
            ArrayList arrayList = new ArrayList();
            this.h = arrayList;
            arrayList.add("");
        }

        private final void C() {
            List<String> list = this.h;
            if ((list.remove(list.size() - 1).length() == 0) && (!this.h.isEmpty())) {
                List<String> list2 = this.h;
                list2.set(list2.size() - 1, "");
                return;
            }
            this.h.add("");
        }

        private final void E(String str, int i, int i2, boolean z, boolean z2) {
            String f = b.f(zq5.m, str, i, i2, zq5.d, z2, false, false, false, null, 240, null);
            if (y(f)) {
                return;
            }
            if (z(f)) {
                C();
                return;
            }
            List<String> list = this.h;
            if (list.get(list.size() - 1).length() == 0) {
                List<String> list2 = this.h;
                list2.set(list2.size() - 1, f);
            } else {
                this.h.add(f);
            }
            if (z) {
                this.h.add("");
            }
        }

        private final void H(String str) {
            List<String> list = this.i;
            c25.m(list);
            a55 e1 = i55.e1(i55.W(list.size() - 2, 0), 2);
            int e = e1.e();
            int h = e1.h();
            int i = e1.i();
            if (i >= 0) {
                if (e > h) {
                    return;
                }
            } else if (e < h) {
                return;
            }
            while (true) {
                List<String> list2 = this.i;
                c25.m(list2);
                if (c25.g(str, list2.get(e))) {
                    List<String> list3 = this.i;
                    c25.m(list3);
                    list3.remove(e + 1);
                    List<String> list4 = this.i;
                    c25.m(list4);
                    list4.remove(e);
                    List<String> list5 = this.i;
                    c25.m(list5);
                    if (list5.isEmpty()) {
                        this.i = null;
                        return;
                    }
                }
                if (e == h) {
                    return;
                }
                e += i;
            }
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
            */
        /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0044 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0041 -> B:11:0x0029). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final void L(java.lang.String r11, int r12, int r13) {
            /*
                r10 = this;
                if (r12 != r13) goto L3
                return
            L3:
                char r0 = r11.charAt(r12)
                r1 = 47
                java.lang.String r2 = ""
                r3 = 1
                if (r0 == r1) goto L1e
                r1 = 92
                if (r0 != r1) goto L13
                goto L1e
            L13:
                java.util.List<java.lang.String> r0 = r10.h
                int r1 = r0.size()
                int r1 = r1 - r3
                r0.set(r1, r2)
                goto L29
            L1e:
                java.util.List<java.lang.String> r0 = r10.h
                r0.clear()
                java.util.List<java.lang.String> r0 = r10.h
                r0.add(r2)
                goto L41
            L29:
                r6 = r12
                if (r6 >= r13) goto L44
                java.lang.String r12 = "/\\"
                int r12 = com.p7700g.p99005.sr5.q(r11, r12, r6, r13)
                if (r12 >= r13) goto L36
                r0 = 1
                goto L37
            L36:
                r0 = 0
            L37:
                r9 = 1
                r4 = r10
                r5 = r11
                r7 = r12
                r8 = r0
                r4.E(r5, r6, r7, r8, r9)
                if (r0 == 0) goto L29
            L41:
                int r12 = r12 + 1
                goto L29
            L44:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p7700g.p99005.zq5.a.L(java.lang.String, int, int):void");
        }

        private final a f(String str, boolean z) {
            int i = 0;
            do {
                int q = sr5.q(str, "/\\", i, str.length());
                E(str, i, q, q < str.length(), z);
                i = q + 1;
            } while (i <= str.length());
            return this;
        }

        private final int i() {
            int i = this.g;
            if (i != -1) {
                return i;
            }
            b bVar = zq5.m;
            String str = this.c;
            c25.m(str);
            return bVar.g(str);
        }

        private final boolean y(String str) {
            return c25.g(str, CryptoConstants.ALIAS_SEPARATOR) || b95.K1(str, "%2e", true);
        }

        private final boolean z(String str) {
            return c25.g(str, "..") || b95.K1(str, "%2e.", true) || b95.K1(str, ".%2e", true) || b95.K1(str, "%2e%2e", true);
        }

        @NotNull
        public final a A(@Nullable zq5 zq5Var, @NotNull String str) {
            int q;
            int i;
            String str2;
            int i2;
            int i3;
            String str3;
            c25.p(str, "input");
            int D = sr5.D(str, 0, 0, 3, null);
            int F = sr5.F(str, D, 0, 2, null);
            C0280a c0280a = b;
            int g = c0280a.g(str, D, F);
            String str4 = "(this as java.lang.Strin…ing(startIndex, endIndex)";
            char c = 65535;
            if (g != -1) {
                if (b95.r2(str, "https:", D, true)) {
                    this.c = "https";
                    D += 6;
                } else if (b95.r2(str, "http:", D, true)) {
                    this.c = "http";
                    D += 5;
                } else {
                    StringBuilder G = wo1.G("Expected URL scheme 'http' or 'https' but was '");
                    String substring = str.substring(0, g);
                    c25.o(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    G.append(substring);
                    G.append("'");
                    throw new IllegalArgumentException(G.toString());
                }
            } else if (zq5Var != null) {
                this.c = zq5Var.X();
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int h = c0280a.h(str, D, F);
            char c2 = '?';
            char c3 = '#';
            if (h < 2 && zq5Var != null && !(!c25.g(zq5Var.X(), this.c))) {
                this.d = zq5Var.A();
                this.e = zq5Var.w();
                this.f = zq5Var.F();
                this.g = zq5Var.N();
                this.h.clear();
                this.h.addAll(zq5Var.y());
                if (D == F || str.charAt(D) == '#') {
                    m(zq5Var.z());
                }
                i = F;
            } else {
                int i4 = D + h;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    q = sr5.q(str, "@/\\?#", i4, F);
                    char charAt = q != F ? str.charAt(q) : (char) 65535;
                    if (charAt == c || charAt == c3 || charAt == '/' || charAt == '\\' || charAt == c2) {
                        break;
                    }
                    if (charAt != '@') {
                        i2 = F;
                        str3 = str4;
                    } else {
                        if (!z) {
                            int p = sr5.p(str, ':', i4, q);
                            b bVar = zq5.m;
                            i2 = F;
                            i3 = q;
                            String f = b.f(bVar, str, i4, p, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z2) {
                                f = wo1.D(new StringBuilder(), this.d, "%40", f);
                            }
                            this.d = f;
                            if (p != i3) {
                                this.e = b.f(bVar, str, p + 1, i3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z = true;
                            }
                            z2 = true;
                            str3 = str4;
                        } else {
                            i2 = F;
                            i3 = q;
                            StringBuilder sb = new StringBuilder();
                            sb.append(this.e);
                            sb.append("%40");
                            str3 = str4;
                            sb.append(b.f(zq5.m, str, i4, i3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.e = sb.toString();
                        }
                        i4 = i3 + 1;
                    }
                    c3 = '#';
                    c2 = '?';
                    c = 65535;
                    str4 = str3;
                    F = i2;
                }
                i = F;
                String str5 = str4;
                C0280a c0280a2 = b;
                int f2 = c0280a2.f(str, i4, q);
                int i5 = f2 + 1;
                if (i5 < q) {
                    this.f = pr5.e(b.n(zq5.m, str, i4, f2, false, 4, null));
                    int e = c0280a2.e(str, i5, q);
                    this.g = e;
                    if (!(e != -1)) {
                        StringBuilder G2 = wo1.G("Invalid URL port: \"");
                        String substring2 = str.substring(i5, q);
                        c25.o(substring2, str5);
                        G2.append(substring2);
                        G2.append(h95.b);
                        throw new IllegalArgumentException(G2.toString().toString());
                    }
                    str2 = str5;
                } else {
                    str2 = str5;
                    b bVar2 = zq5.m;
                    this.f = pr5.e(b.n(bVar2, str, i4, f2, false, 4, null));
                    String str6 = this.c;
                    c25.m(str6);
                    this.g = bVar2.g(str6);
                }
                if (!(this.f != null)) {
                    StringBuilder G3 = wo1.G("Invalid URL host: \"");
                    String substring3 = str.substring(i4, f2);
                    c25.o(substring3, str2);
                    G3.append(substring3);
                    G3.append(h95.b);
                    throw new IllegalArgumentException(G3.toString().toString());
                }
                D = q;
            }
            int i6 = i;
            int q2 = sr5.q(str, "?#", D, i6);
            L(str, D, q2);
            if (q2 < i6 && str.charAt(q2) == '?') {
                int p2 = sr5.p(str, '#', q2, i6);
                b bVar3 = zq5.m;
                this.i = bVar3.p(b.f(bVar3, str, q2 + 1, p2, zq5.f, true, false, true, false, null, 208, null));
                q2 = p2;
            }
            if (q2 < i6 && str.charAt(q2) == '#') {
                this.j = b.f(zq5.m, str, q2 + 1, i6, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        @NotNull
        public final a B(@NotNull String str) {
            c25.p(str, "password");
            this.e = b.f(zq5.m, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, Type.IXFR, null);
            return this;
        }

        @NotNull
        public final a D(int i) {
            boolean z = true;
            if ((1 > i || 65535 < i) ? false : false) {
                this.g = i;
                return this;
            }
            throw new IllegalArgumentException(wo1.l("unexpected port: ", i).toString());
        }

        @NotNull
        public final a F(@Nullable String str) {
            List<String> list;
            if (str != null) {
                b bVar = zq5.m;
                String f = b.f(bVar, str, 0, 0, zq5.f, false, false, true, false, null, 219, null);
                if (f != null) {
                    list = bVar.p(f);
                    this.i = list;
                    return this;
                }
            }
            list = null;
            this.i = list;
            return this;
        }

        @NotNull
        public final a G() {
            String str = this.f;
            this.f = str != null ? new o85("[\"<>^`{|}]").p(str, "") : null;
            int size = this.h.size();
            for (int i = 0; i < size; i++) {
                List<String> list = this.h;
                list.set(i, b.f(zq5.m, list.get(i), 0, 0, zq5.e, true, true, false, false, null, 227, null));
            }
            List<String> list2 = this.i;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str2 = list2.get(i2);
                    list2.set(i2, str2 != null ? b.f(zq5.m, str2, 0, 0, zq5.i, true, true, true, false, null, yg1.N, null) : null);
                }
            }
            String str3 = this.j;
            this.j = str3 != null ? b.f(zq5.m, str3, 0, 0, zq5.l, true, true, false, true, null, 163, null) : null;
            return this;
        }

        @NotNull
        public final a I(@NotNull String str) {
            c25.p(str, "encodedName");
            if (this.i == null) {
                return this;
            }
            H(b.f(zq5.m, str, 0, 0, zq5.g, true, false, true, false, null, 211, null));
            return this;
        }

        @NotNull
        public final a J(@NotNull String str) {
            c25.p(str, "name");
            if (this.i == null) {
                return this;
            }
            H(b.f(zq5.m, str, 0, 0, zq5.h, false, false, true, false, null, 219, null));
            return this;
        }

        @NotNull
        public final a K(int i) {
            this.h.remove(i);
            if (this.h.isEmpty()) {
                this.h.add("");
            }
            return this;
        }

        @NotNull
        public final a M(@NotNull String str) {
            c25.p(str, "scheme");
            if (b95.K1(str, "http", true)) {
                this.c = "http";
            } else if (!b95.K1(str, "https", true)) {
                throw new IllegalArgumentException(wo1.t("unexpected scheme: ", str));
            } else {
                this.c = "https";
            }
            return this;
        }

        public final void N(@Nullable String str) {
            this.j = str;
        }

        public final void O(@NotNull String str) {
            c25.p(str, "<set-?>");
            this.e = str;
        }

        @NotNull
        public final a P(int i, @NotNull String str) {
            c25.p(str, "encodedPathSegment");
            String f = b.f(zq5.m, str, 0, 0, zq5.d, true, false, false, false, null, WKSRecord.Service.SUR_MEAS, null);
            this.h.set(i, f);
            if ((y(f) || z(f)) ? false : true) {
                return this;
            }
            throw new IllegalArgumentException(wo1.t("unexpected path segment: ", str).toString());
        }

        public final void Q(@Nullable List<String> list) {
            this.i = list;
        }

        @NotNull
        public final a R(@NotNull String str, @Nullable String str2) {
            c25.p(str, "encodedName");
            I(str);
            c(str, str2);
            return this;
        }

        public final void S(@NotNull String str) {
            c25.p(str, "<set-?>");
            this.d = str;
        }

        public final void T(@Nullable String str) {
            this.f = str;
        }

        @NotNull
        public final a U(int i, @NotNull String str) {
            c25.p(str, "pathSegment");
            String f = b.f(zq5.m, str, 0, 0, zq5.d, false, false, false, false, null, Type.IXFR, null);
            if ((y(f) || z(f)) ? false : true) {
                this.h.set(i, f);
                return this;
            }
            throw new IllegalArgumentException(wo1.t("unexpected path segment: ", str).toString());
        }

        public final void V(int i) {
            this.g = i;
        }

        @NotNull
        public final a W(@NotNull String str, @Nullable String str2) {
            c25.p(str, "name");
            J(str);
            g(str, str2);
            return this;
        }

        public final void X(@Nullable String str) {
            this.c = str;
        }

        @NotNull
        public final a Y(@NotNull String str) {
            c25.p(str, "username");
            this.d = b.f(zq5.m, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, Type.IXFR, null);
            return this;
        }

        @NotNull
        public final a a(@NotNull String str) {
            c25.p(str, "encodedPathSegment");
            E(str, 0, str.length(), false, true);
            return this;
        }

        @NotNull
        public final a b(@NotNull String str) {
            c25.p(str, "encodedPathSegments");
            return f(str, true);
        }

        @NotNull
        public final a c(@NotNull String str, @Nullable String str2) {
            c25.p(str, "encodedName");
            if (this.i == null) {
                this.i = new ArrayList();
            }
            List<String> list = this.i;
            c25.m(list);
            b bVar = zq5.m;
            list.add(b.f(bVar, str, 0, 0, zq5.g, true, false, true, false, null, 211, null));
            List<String> list2 = this.i;
            c25.m(list2);
            list2.add(str2 != null ? b.f(bVar, str2, 0, 0, zq5.g, true, false, true, false, null, 211, null) : null);
            return this;
        }

        @NotNull
        public final a d(@NotNull String str) {
            c25.p(str, "pathSegment");
            E(str, 0, str.length(), false, false);
            return this;
        }

        @NotNull
        public final a e(@NotNull String str) {
            c25.p(str, "pathSegments");
            return f(str, false);
        }

        @NotNull
        public final a g(@NotNull String str, @Nullable String str2) {
            c25.p(str, "name");
            if (this.i == null) {
                this.i = new ArrayList();
            }
            List<String> list = this.i;
            c25.m(list);
            b bVar = zq5.m;
            list.add(b.f(bVar, str, 0, 0, zq5.h, false, false, true, false, null, 219, null));
            List<String> list2 = this.i;
            c25.m(list2);
            list2.add(str2 != null ? b.f(bVar, str2, 0, 0, zq5.h, false, false, true, false, null, 219, null) : null);
            return this;
        }

        @NotNull
        public final zq5 h() {
            ArrayList arrayList;
            String str = this.c;
            if (str != null) {
                b bVar = zq5.m;
                String n = b.n(bVar, this.d, 0, 0, false, 7, null);
                String n2 = b.n(bVar, this.e, 0, 0, false, 7, null);
                String str2 = this.f;
                if (str2 != null) {
                    int i = i();
                    List<String> list = this.h;
                    ArrayList arrayList2 = new ArrayList(ks4.Z(list, 10));
                    for (String str3 : list) {
                        arrayList2.add(b.n(zq5.m, str3, 0, 0, false, 7, null));
                    }
                    List<String> list2 = this.i;
                    if (list2 != null) {
                        arrayList = new ArrayList(ks4.Z(list2, 10));
                        for (String str4 : list2) {
                            arrayList.add(str4 != null ? b.n(zq5.m, str4, 0, 0, true, 3, null) : null);
                        }
                    } else {
                        arrayList = null;
                    }
                    String str5 = this.j;
                    return new zq5(str, n, n2, str2, i, arrayList2, arrayList, str5 != null ? b.n(zq5.m, str5, 0, 0, false, 7, null) : null, toString());
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        @NotNull
        public final a j(@Nullable String str) {
            this.j = str != null ? b.f(zq5.m, str, 0, 0, "", true, false, false, true, null, 179, null) : null;
            return this;
        }

        @NotNull
        public final a k(@NotNull String str) {
            c25.p(str, "encodedPassword");
            this.e = b.f(zq5.m, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, WKSRecord.Service.SUR_MEAS, null);
            return this;
        }

        @NotNull
        public final a l(@NotNull String str) {
            c25.p(str, "encodedPath");
            if (b95.u2(str, "/", false, 2, null)) {
                L(str, 0, str.length());
                return this;
            }
            throw new IllegalArgumentException(wo1.t("unexpected encodedPath: ", str).toString());
        }

        @NotNull
        public final a m(@Nullable String str) {
            List<String> list;
            if (str != null) {
                b bVar = zq5.m;
                String f = b.f(bVar, str, 0, 0, zq5.f, true, false, true, false, null, 211, null);
                if (f != null) {
                    list = bVar.p(f);
                    this.i = list;
                    return this;
                }
            }
            list = null;
            this.i = list;
            return this;
        }

        @NotNull
        public final a n(@NotNull String str) {
            c25.p(str, "encodedUsername");
            this.d = b.f(zq5.m, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, WKSRecord.Service.SUR_MEAS, null);
            return this;
        }

        @NotNull
        public final a o(@Nullable String str) {
            this.j = str != null ? b.f(zq5.m, str, 0, 0, "", false, false, false, true, null, 187, null) : null;
            return this;
        }

        @Nullable
        public final String p() {
            return this.j;
        }

        @NotNull
        public final String q() {
            return this.e;
        }

        @NotNull
        public final List<String> r() {
            return this.h;
        }

        @Nullable
        public final List<String> s() {
            return this.i;
        }

        @NotNull
        public final String t() {
            return this.d;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
            if ((r6.e.length() > 0) != false) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0091, code lost:
            if (r1 != r3.g(r2)) goto L36;
         */
        @NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.c;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (!(this.d.length() > 0)) {
            }
            sb.append(this.d);
            if (this.e.length() > 0) {
                sb.append(':');
                sb.append(this.e);
            }
            sb.append('@');
            String str2 = this.f;
            if (str2 != null) {
                c25.m(str2);
                if (c95.U2(str2, ':', false, 2, null)) {
                    sb.append(f14.u);
                    sb.append(this.f);
                    sb.append(f14.v);
                } else {
                    sb.append(this.f);
                }
            }
            if (this.g != -1 || this.c != null) {
                int i = i();
                String str3 = this.c;
                if (str3 != null) {
                    b bVar = zq5.m;
                    c25.m(str3);
                }
                sb.append(':');
                sb.append(i);
            }
            b bVar2 = zq5.m;
            bVar2.o(this.h, sb);
            if (this.i != null) {
                sb.append('?');
                List<String> list = this.i;
                c25.m(list);
                bVar2.q(list, sb);
            }
            if (this.j != null) {
                sb.append('#');
                sb.append(this.j);
            }
            String sb2 = sb.toString();
            c25.o(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }

        @Nullable
        public final String u() {
            return this.f;
        }

        public final int v() {
            return this.g;
        }

        @Nullable
        public final String w() {
            return this.c;
        }

        @NotNull
        public final a x(@NotNull String str) {
            c25.p(str, "host");
            String e = pr5.e(b.n(zq5.m, str, 0, 0, false, 7, null));
            if (e != null) {
                this.f = e;
                return this;
            }
            throw new IllegalArgumentException(wo1.t("unexpected host: ", str));
        }
    }

    /* compiled from: HttpUrl.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0019\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bH\u0010IJ3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\r\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000eJ]\u0010\u0016\u001a\u00020\n*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001f\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\u00030\u001b2\n\u0010\u001e\u001a\u00060\u001cj\u0002`\u001dH\u0000¢\u0006\u0004\b\u001f\u0010 J'\u0010!\u001a\u00020\n*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001b2\n\u0010\u001e\u001a\u00060\u001cj\u0002`\u001dH\u0000¢\u0006\u0004\b!\u0010 J\u001b\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\"*\u00020\u0003H\u0000¢\u0006\u0004\b#\u0010$J\u0013\u0010&\u001a\u00020%*\u00020\u0003H\u0007¢\u0006\u0004\b&\u0010'J\u0015\u0010(\u001a\u0004\u0018\u00010%*\u00020\u0003H\u0007¢\u0006\u0004\b(\u0010'J\u0015\u0010*\u001a\u0004\u0018\u00010%*\u00020)H\u0007¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u0004\u0018\u00010%*\u00020,H\u0007¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020%2\u0006\u0010/\u001a\u00020\u0003H\u0007¢\u0006\u0004\b0\u0010'J\u0019\u00101\u001a\u0004\u0018\u00010%2\u0006\u0010/\u001a\u00020\u0003H\u0007¢\u0006\u0004\b1\u0010'J\u0019\u00102\u001a\u0004\u0018\u00010%2\u0006\u0010/\u001a\u00020)H\u0007¢\u0006\u0004\b2\u0010+J\u0019\u00104\u001a\u0004\u0018\u00010%2\u0006\u00103\u001a\u00020,H\u0007¢\u0006\u0004\b4\u0010.J1\u00105\u001a\u00020\u0003*\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b5\u00106Jc\u00107\u001a\u00020\u0003*\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0000¢\u0006\u0004\b7\u00108R\u0016\u00109\u001a\u00020\u00038\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\u00038\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b;\u0010:R\u0016\u0010<\u001a\u00020\u00038\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b<\u0010:R\u0016\u0010>\u001a\u00020=8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010@\u001a\u00020\u00038\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b@\u0010:R\u0016\u0010A\u001a\u00020\u00038\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bA\u0010:R\u0016\u0010B\u001a\u00020\u00038\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bB\u0010:R\u0016\u0010C\u001a\u00020\u00038\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bC\u0010:R\u0016\u0010D\u001a\u00020\u00038\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bD\u0010:R\u0016\u0010E\u001a\u00020\u00038\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bE\u0010:R\u0016\u0010F\u001a\u00020\u00038\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bF\u0010:R\u0016\u0010G\u001a\u00020\u00038\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bG\u0010:¨\u0006J"}, d2 = {"com/p7700g/p99005/zq5$b", "", "Lcom/p7700g/p99005/sv5;", "", "encoded", "", "pos", "limit", "", "plusIsSpace", "Lcom/p7700g/p99005/yq4;", "s", "(Lcom/p7700g/p99005/sv5;Ljava/lang/String;IIZ)V", "k", "(Ljava/lang/String;II)Z", "input", "encodeSet", "alreadyEncoded", "strict", "unicodeAllowed", "Ljava/nio/charset/Charset;", "charset", "r", "(Lcom/p7700g/p99005/sv5;Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)V", "scheme", com.anythink.basead.d.g.i, "(Ljava/lang/String;)I", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "out", ij3.b, "(Ljava/util/List;Ljava/lang/StringBuilder;)V", "q", "", "p", "(Ljava/lang/String;)Ljava/util/List;", "Lcom/p7700g/p99005/zq5;", "h", "(Ljava/lang/String;)Lcom/p7700g/p99005/zq5;", "l", "Ljava/net/URL;", "j", "(Ljava/net/URL;)Lcom/p7700g/p99005/zq5;", "Ljava/net/URI;", "i", "(Ljava/net/URI;)Lcom/p7700g/p99005/zq5;", "url", "a", "d", "c", kg.m.a.e, "b", com.anythink.expressad.d.a.b.dH, "(Ljava/lang/String;IIZ)Ljava/lang/String;", "e", "(Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)Ljava/lang/String;", "FORM_ENCODE_SET", "Ljava/lang/String;", "FRAGMENT_ENCODE_SET", "FRAGMENT_ENCODE_SET_URI", "", "HEX_DIGITS", "[C", "PASSWORD_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET_URI", "QUERY_COMPONENT_ENCODE_SET", "QUERY_COMPONENT_ENCODE_SET_URI", "QUERY_COMPONENT_REENCODE_SET", "QUERY_ENCODE_SET", "USERNAME_ENCODE_SET", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public static /* synthetic */ String f(b bVar, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset, int i3, Object obj) {
            return bVar.e(str, (i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? str.length() : i2, str2, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? false : z2, (i3 & 32) != 0 ? false : z3, (i3 & 64) != 0 ? false : z4, (i3 & 128) != 0 ? null : charset);
        }

        private final boolean k(String str, int i, int i2) {
            int i3 = i + 2;
            return i3 < i2 && str.charAt(i) == '%' && sr5.N(str.charAt(i + 1)) != -1 && sr5.N(str.charAt(i3)) != -1;
        }

        public static /* synthetic */ String n(b bVar, String str, int i, int i2, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = str.length();
            }
            if ((i3 & 4) != 0) {
                z = false;
            }
            return bVar.m(str, i, i2, z);
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x0065, code lost:
            if (k(r16, r5, r18) == false) goto L39;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final void r(sv5 sv5Var, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
            int i3 = i;
            sv5 sv5Var2 = null;
            while (i3 < i2) {
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                int codePointAt = str.codePointAt(i3);
                if (!z || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                    if (codePointAt == 43 && z3) {
                        sv5Var.K0(z ? ya2.z : "%2B");
                    } else {
                        if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || z4)) {
                            if (!c95.U2(str2, (char) codePointAt, false, 2, null)) {
                                if (codePointAt == 37) {
                                    if (z) {
                                        if (z2) {
                                        }
                                    }
                                }
                                sv5Var.O(codePointAt);
                                i3 += Character.charCount(codePointAt);
                            }
                        }
                        if (sv5Var2 == null) {
                            sv5Var2 = new sv5();
                        }
                        if (charset != null && !c25.g(charset, StandardCharsets.UTF_8)) {
                            sv5Var2.M1(str, i3, Character.charCount(codePointAt) + i3, charset);
                        } else {
                            sv5Var2.O(codePointAt);
                        }
                        while (!sv5Var2.f0()) {
                            int readByte = sv5Var2.readByte() & 255;
                            sv5Var.g0(37);
                            sv5Var.g0(zq5.a[(readByte >> 4) & 15]);
                            sv5Var.g0(zq5.a[readByte & 15]);
                        }
                        i3 += Character.charCount(codePointAt);
                    }
                }
                i3 += Character.charCount(codePointAt);
            }
        }

        private final void s(sv5 sv5Var, String str, int i, int i2, boolean z) {
            int i3;
            while (i < i2) {
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                int codePointAt = str.codePointAt(i);
                if (codePointAt == 37 && (i3 = i + 2) < i2) {
                    int N = sr5.N(str.charAt(i + 1));
                    int N2 = sr5.N(str.charAt(i3));
                    if (N != -1 && N2 != -1) {
                        sv5Var.g0((N << 4) + N2);
                        i = Character.charCount(codePointAt) + i3;
                    }
                    sv5Var.O(codePointAt);
                    i += Character.charCount(codePointAt);
                } else {
                    if (codePointAt == 43 && z) {
                        sv5Var.g0(32);
                        i++;
                    }
                    sv5Var.O(codePointAt);
                    i += Character.charCount(codePointAt);
                }
            }
        }

        @fz4(name = "-deprecated_get")
        @xn4(level = zn4.ERROR, message = "moved to extension function", replaceWith = @op4(expression = "url.toHttpUrl()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrl"}))
        @NotNull
        public final zq5 a(@NotNull String str) {
            c25.p(str, "url");
            return h(str);
        }

        @fz4(name = "-deprecated_get")
        @xn4(level = zn4.ERROR, message = "moved to extension function", replaceWith = @op4(expression = "uri.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        @Nullable
        public final zq5 b(@NotNull URI uri) {
            c25.p(uri, kg.m.a.e);
            return i(uri);
        }

        @fz4(name = "-deprecated_get")
        @xn4(level = zn4.ERROR, message = "moved to extension function", replaceWith = @op4(expression = "url.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        @Nullable
        public final zq5 c(@NotNull URL url) {
            c25.p(url, "url");
            return j(url);
        }

        @fz4(name = "-deprecated_parse")
        @xn4(level = zn4.ERROR, message = "moved to extension function", replaceWith = @op4(expression = "url.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        @Nullable
        public final zq5 d(@NotNull String str) {
            c25.p(str, "url");
            return l(str);
        }

        @NotNull
        public final String e(@NotNull String str, int i, int i2, @NotNull String str2, boolean z, boolean z2, boolean z3, boolean z4, @Nullable Charset charset) {
            c25.p(str, "$this$canonicalize");
            c25.p(str2, "encodeSet");
            int i3 = i;
            while (i3 < i2) {
                int codePointAt = str.codePointAt(i3);
                if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || z4) && !c95.U2(str2, (char) codePointAt, false, 2, null))) {
                    if (codePointAt == 37) {
                        if (z) {
                            if (z2) {
                                if (!k(str, i3, i2)) {
                                    sv5 sv5Var = new sv5();
                                    sv5Var.a1(str, i, i3);
                                    r(sv5Var, str, i3, i2, str2, z, z2, z3, z4, charset);
                                    return sv5Var.u1();
                                }
                                if (codePointAt == 43 || !z3) {
                                    i3 += Character.charCount(codePointAt);
                                } else {
                                    sv5 sv5Var2 = new sv5();
                                    sv5Var2.a1(str, i, i3);
                                    r(sv5Var2, str, i3, i2, str2, z, z2, z3, z4, charset);
                                    return sv5Var2.u1();
                                }
                            }
                        }
                    }
                    if (codePointAt == 43) {
                    }
                    i3 += Character.charCount(codePointAt);
                }
                sv5 sv5Var22 = new sv5();
                sv5Var22.a1(str, i, i3);
                r(sv5Var22, str, i3, i2, str2, z, z2, z3, z4, charset);
                return sv5Var22.u1();
            }
            String substring = str.substring(i, i2);
            c25.o(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        @jz4
        public final int g(@NotNull String str) {
            c25.p(str, "scheme");
            int hashCode = str.hashCode();
            if (hashCode != 3213448) {
                if (hashCode == 99617003 && str.equals("https")) {
                    return 443;
                }
            } else if (str.equals("http")) {
                return 80;
            }
            return -1;
        }

        @fz4(name = "get")
        @jz4
        @NotNull
        public final zq5 h(@NotNull String str) {
            c25.p(str, "$this$toHttpUrl");
            return new a().A(null, str).h();
        }

        @fz4(name = "get")
        @jz4
        @Nullable
        public final zq5 i(@NotNull URI uri) {
            c25.p(uri, "$this$toHttpUrlOrNull");
            String uri2 = uri.toString();
            c25.o(uri2, "toString()");
            return l(uri2);
        }

        @fz4(name = "get")
        @jz4
        @Nullable
        public final zq5 j(@NotNull URL url) {
            c25.p(url, "$this$toHttpUrlOrNull");
            String url2 = url.toString();
            c25.o(url2, "toString()");
            return l(url2);
        }

        @fz4(name = "parse")
        @jz4
        @Nullable
        public final zq5 l(@NotNull String str) {
            c25.p(str, "$this$toHttpUrlOrNull");
            try {
                return h(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @NotNull
        public final String m(@NotNull String str, int i, int i2, boolean z) {
            c25.p(str, "$this$percentDecode");
            for (int i3 = i; i3 < i2; i3++) {
                char charAt = str.charAt(i3);
                if (charAt == '%' || (charAt == '+' && z)) {
                    sv5 sv5Var = new sv5();
                    sv5Var.a1(str, i, i3);
                    s(sv5Var, str, i3, i2, z);
                    return sv5Var.u1();
                }
            }
            String substring = str.substring(i, i2);
            c25.o(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        public final void o(@NotNull List<String> list, @NotNull StringBuilder sb) {
            c25.p(list, "$this$toPathString");
            c25.p(sb, "out");
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb.append(j14.P);
                sb.append(list.get(i));
            }
        }

        @NotNull
        public final List<String> p(@NotNull String str) {
            c25.p(str, "$this$toQueryNamesAndValues");
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= str.length()) {
                int q3 = c95.q3(str, h95.d, i, false, 4, null);
                if (q3 == -1) {
                    q3 = str.length();
                }
                int i2 = q3;
                int q32 = c95.q3(str, '=', i, false, 4, null);
                if (q32 != -1 && q32 <= i2) {
                    String substring = str.substring(i, q32);
                    c25.o(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    String substring2 = str.substring(q32 + 1, i2);
                    c25.o(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                } else {
                    String substring3 = str.substring(i, i2);
                    c25.o(substring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring3);
                    arrayList.add(null);
                }
                i = i2 + 1;
            }
            return arrayList;
        }

        public final void q(@NotNull List<String> list, @NotNull StringBuilder sb) {
            c25.p(list, "$this$toQueryString");
            c25.p(sb, "out");
            a55 e1 = i55.e1(i55.z1(0, list.size()), 2);
            int e = e1.e();
            int h = e1.h();
            int i = e1.i();
            if (i >= 0) {
                if (e > h) {
                    return;
                }
            } else if (e < h) {
                return;
            }
            while (true) {
                String str = list.get(e);
                String str2 = list.get(e + 1);
                if (e > 0) {
                    sb.append(h95.d);
                }
                sb.append(str);
                if (str2 != null) {
                    sb.append('=');
                    sb.append(str2);
                }
                if (e == h) {
                    return;
                }
                e += i;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public zq5(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i2, @NotNull List<String> list, @Nullable List<String> list2, @Nullable String str5, @NotNull String str6) {
        c25.p(str, "scheme");
        c25.p(str2, "username");
        c25.p(str3, "password");
        c25.p(str4, "host");
        c25.p(list, "pathSegments");
        c25.p(str6, "url");
        this.o = str;
        this.p = str2;
        this.q = str3;
        this.r = str4;
        this.s = i2;
        this.t = list;
        this.u = list2;
        this.v = str5;
        this.w = str6;
        this.n = c25.g(str, "https");
    }

    @fz4(name = "get")
    @jz4
    @NotNull
    public static final zq5 C(@NotNull String str) {
        return m.h(str);
    }

    @fz4(name = "get")
    @jz4
    @Nullable
    public static final zq5 D(@NotNull URI uri) {
        return m.i(uri);
    }

    @fz4(name = "get")
    @jz4
    @Nullable
    public static final zq5 E(@NotNull URL url) {
        return m.j(url);
    }

    @fz4(name = "parse")
    @jz4
    @Nullable
    public static final zq5 J(@NotNull String str) {
        return m.l(str);
    }

    @jz4
    public static final int u(@NotNull String str) {
        return m.g(str);
    }

    @fz4(name = "encodedUsername")
    @NotNull
    public final String A() {
        if (this.p.length() == 0) {
            return "";
        }
        int length = this.o.length() + 3;
        String str = this.w;
        int q = sr5.q(str, ":@", length, str.length());
        String str2 = this.w;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String substring = str2.substring(length, q);
        c25.o(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    @fz4(name = "fragment")
    @Nullable
    public final String B() {
        return this.v;
    }

    @fz4(name = "host")
    @NotNull
    public final String F() {
        return this.r;
    }

    public final boolean G() {
        return this.n;
    }

    @NotNull
    public final a H() {
        a aVar = new a();
        aVar.X(this.o);
        aVar.S(A());
        aVar.O(w());
        aVar.T(this.r);
        aVar.V(this.s != m.g(this.o) ? this.s : -1);
        aVar.r().clear();
        aVar.r().addAll(y());
        aVar.m(z());
        aVar.N(v());
        return aVar;
    }

    @Nullable
    public final a I(@NotNull String str) {
        c25.p(str, "link");
        try {
            return new a().A(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @fz4(name = "password")
    @NotNull
    public final String K() {
        return this.q;
    }

    @fz4(name = "pathSegments")
    @NotNull
    public final List<String> L() {
        return this.t;
    }

    @fz4(name = "pathSize")
    public final int M() {
        return this.t.size();
    }

    @fz4(name = "port")
    public final int N() {
        return this.s;
    }

    @fz4(name = SearchIntents.EXTRA_QUERY)
    @Nullable
    public final String O() {
        if (this.u == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        m.q(this.u, sb);
        return sb.toString();
    }

    @Nullable
    public final String P(@NotNull String str) {
        c25.p(str, "name");
        List<String> list = this.u;
        if (list == null) {
            return null;
        }
        a55 e1 = i55.e1(i55.z1(0, list.size()), 2);
        int e2 = e1.e();
        int h2 = e1.h();
        int i2 = e1.i();
        if (i2 < 0 ? e2 >= h2 : e2 <= h2) {
            while (!c25.g(str, this.u.get(e2))) {
                if (e2 != h2) {
                    e2 += i2;
                }
            }
            return this.u.get(e2 + 1);
        }
        return null;
    }

    @NotNull
    public final String Q(int i2) {
        List<String> list = this.u;
        if (list != null) {
            String str = list.get(i2 * 2);
            c25.m(str);
            return str;
        }
        throw new IndexOutOfBoundsException();
    }

    @fz4(name = "queryParameterNames")
    @NotNull
    public final Set<String> R() {
        if (this.u == null) {
            return yt4.k();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        a55 e1 = i55.e1(i55.z1(0, this.u.size()), 2);
        int e2 = e1.e();
        int h2 = e1.h();
        int i2 = e1.i();
        if (i2 < 0 ? e2 >= h2 : e2 <= h2) {
            while (true) {
                String str = this.u.get(e2);
                c25.m(str);
                linkedHashSet.add(str);
                if (e2 == h2) {
                    break;
                }
                e2 += i2;
            }
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        c25.o(unmodifiableSet, "Collections.unmodifiableSet(result)");
        return unmodifiableSet;
    }

    @Nullable
    public final String S(int i2) {
        List<String> list = this.u;
        if (list != null) {
            return list.get((i2 * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    @NotNull
    public final List<String> T(@NotNull String str) {
        c25.p(str, "name");
        if (this.u == null) {
            return js4.F();
        }
        ArrayList arrayList = new ArrayList();
        a55 e1 = i55.e1(i55.z1(0, this.u.size()), 2);
        int e2 = e1.e();
        int h2 = e1.h();
        int i2 = e1.i();
        if (i2 < 0 ? e2 >= h2 : e2 <= h2) {
            while (true) {
                if (c25.g(str, this.u.get(e2))) {
                    arrayList.add(this.u.get(e2 + 1));
                }
                if (e2 == h2) {
                    break;
                }
                e2 += i2;
            }
        }
        List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
        c25.o(unmodifiableList, "Collections.unmodifiableList(result)");
        return unmodifiableList;
    }

    @fz4(name = "querySize")
    public final int U() {
        List<String> list = this.u;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    @NotNull
    public final String V() {
        a I = I("/...");
        c25.m(I);
        return I.Y("").B("").h().toString();
    }

    @Nullable
    public final zq5 W(@NotNull String str) {
        c25.p(str, "link");
        a I = I(str);
        if (I != null) {
            return I.h();
        }
        return null;
    }

    @fz4(name = "scheme")
    @NotNull
    public final String X() {
        return this.o;
    }

    @Nullable
    public final String Y() {
        if (sr5.h(this.r)) {
            return null;
        }
        return PublicSuffixDatabase.f.c().e(this.r);
    }

    @fz4(name = kg.m.a.e)
    @NotNull
    public final URI Z() {
        String aVar = H().G().toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e2) {
            try {
                URI create = URI.create(new o85("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").p(aVar, ""));
                c25.o(create, "try {\n        val stripp…e) // Unexpected!\n      }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e2);
            }
        }
    }

    @fz4(name = "-deprecated_encodedFragment")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "encodedFragment", imports = {}))
    @Nullable
    public final String a() {
        return v();
    }

    @fz4(name = "url")
    @NotNull
    public final URL a0() {
        try {
            return new URL(this.w);
        } catch (MalformedURLException e2) {
            throw new RuntimeException(e2);
        }
    }

    @fz4(name = "-deprecated_encodedPassword")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "encodedPassword", imports = {}))
    @NotNull
    public final String b() {
        return w();
    }

    @fz4(name = "username")
    @NotNull
    public final String b0() {
        return this.p;
    }

    @fz4(name = "-deprecated_encodedPath")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "encodedPath", imports = {}))
    @NotNull
    public final String c() {
        return x();
    }

    @fz4(name = "-deprecated_encodedPathSegments")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "encodedPathSegments", imports = {}))
    @NotNull
    public final List<String> d() {
        return y();
    }

    @fz4(name = "-deprecated_encodedQuery")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "encodedQuery", imports = {}))
    @Nullable
    public final String e() {
        return z();
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof zq5) && c25.g(((zq5) obj).w, this.w);
    }

    @fz4(name = "-deprecated_encodedUsername")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "encodedUsername", imports = {}))
    @NotNull
    public final String f() {
        return A();
    }

    @fz4(name = "-deprecated_fragment")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "fragment", imports = {}))
    @Nullable
    public final String g() {
        return this.v;
    }

    @fz4(name = "-deprecated_host")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "host", imports = {}))
    @NotNull
    public final String h() {
        return this.r;
    }

    public int hashCode() {
        return this.w.hashCode();
    }

    @fz4(name = "-deprecated_password")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "password", imports = {}))
    @NotNull
    public final String i() {
        return this.q;
    }

    @fz4(name = "-deprecated_pathSegments")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "pathSegments", imports = {}))
    @NotNull
    public final List<String> j() {
        return this.t;
    }

    @fz4(name = "-deprecated_pathSize")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "pathSize", imports = {}))
    public final int k() {
        return M();
    }

    @fz4(name = "-deprecated_port")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "port", imports = {}))
    public final int l() {
        return this.s;
    }

    @fz4(name = "-deprecated_query")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = SearchIntents.EXTRA_QUERY, imports = {}))
    @Nullable
    public final String m() {
        return O();
    }

    @fz4(name = "-deprecated_queryParameterNames")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "queryParameterNames", imports = {}))
    @NotNull
    public final Set<String> n() {
        return R();
    }

    @fz4(name = "-deprecated_querySize")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "querySize", imports = {}))
    public final int o() {
        return U();
    }

    @fz4(name = "-deprecated_scheme")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "scheme", imports = {}))
    @NotNull
    public final String p() {
        return this.o;
    }

    @fz4(name = "-deprecated_uri")
    @xn4(level = zn4.ERROR, message = "moved to toUri()", replaceWith = @op4(expression = "toUri()", imports = {}))
    @NotNull
    public final URI q() {
        return Z();
    }

    @fz4(name = "-deprecated_url")
    @xn4(level = zn4.ERROR, message = "moved to toUrl()", replaceWith = @op4(expression = "toUrl()", imports = {}))
    @NotNull
    public final URL r() {
        return a0();
    }

    @fz4(name = "-deprecated_username")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "username", imports = {}))
    @NotNull
    public final String s() {
        return this.p;
    }

    @NotNull
    public String toString() {
        return this.w;
    }

    @fz4(name = "encodedFragment")
    @Nullable
    public final String v() {
        if (this.v == null) {
            return null;
        }
        String str = this.w;
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(c95.q3(this.w, '#', 0, false, 6, null) + 1);
        c25.o(substring, "(this as java.lang.String).substring(startIndex)");
        return substring;
    }

    @fz4(name = "encodedPassword")
    @NotNull
    public final String w() {
        if (this.q.length() == 0) {
            return "";
        }
        int q3 = c95.q3(this.w, '@', 0, false, 6, null);
        String str = this.w;
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(c95.q3(this.w, ':', this.o.length() + 3, false, 4, null) + 1, q3);
        c25.o(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    @fz4(name = "encodedPath")
    @NotNull
    public final String x() {
        int q3 = c95.q3(this.w, j14.P, this.o.length() + 3, false, 4, null);
        String str = this.w;
        int q = sr5.q(str, "?#", q3, str.length());
        String str2 = this.w;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String substring = str2.substring(q3, q);
        c25.o(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    @fz4(name = "encodedPathSegments")
    @NotNull
    public final List<String> y() {
        int q3 = c95.q3(this.w, j14.P, this.o.length() + 3, false, 4, null);
        String str = this.w;
        int q = sr5.q(str, "?#", q3, str.length());
        ArrayList arrayList = new ArrayList();
        while (q3 < q) {
            int i2 = q3 + 1;
            int p = sr5.p(this.w, j14.P, i2, q);
            String str2 = this.w;
            Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
            String substring = str2.substring(i2, p);
            c25.o(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            arrayList.add(substring);
            q3 = p;
        }
        return arrayList;
    }

    @fz4(name = "encodedQuery")
    @Nullable
    public final String z() {
        if (this.u == null) {
            return null;
        }
        int q3 = c95.q3(this.w, '?', 0, false, 6, null) + 1;
        String str = this.w;
        int p = sr5.p(str, '#', q3, str.length());
        String str2 = this.w;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String substring = str2.substring(q3, p);
        c25.o(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }
}