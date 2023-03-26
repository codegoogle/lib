package com.p7700g.p99005;

import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.utils.crypto.CryptoConstants;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/* compiled from: UriComponent.java */
/* loaded from: classes3.dex */
public class ms3 {
    private static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final String[] b = {"0-9", "A-Z", "a-z", ya2.z, "-", CryptoConstants.ALIAS_SEPARATOR};
    private static final String[] c = {"0-9", "A-Z", "a-z", "-", CryptoConstants.ALIAS_SEPARATOR, "_", "~"};
    private static final String[] d = {"!", "$", "&", "'", "(", ")", tm4.g, ya2.z, ",", AppCenter.PAIR_DELIMITER, AppCenter.KEY_VALUE_DELIMITER};
    private static final boolean[][] e = B();
    private static final Charset f = Charset.forName("UTF-8");
    private static final int[] g = C();

    /* compiled from: UriComponent.java */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            c.values();
            int[] iArr = new int[12];
            a = iArr;
            try {
                iArr[c.HOST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.QUERY_PARAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: UriComponent.java */
    /* loaded from: classes3.dex */
    public static final class b implements wm4 {
        private static final wm4 a = new b("", false);
        private final String b;
        private final um4<String, String> c;

        public b(String str, boolean z) {
            this(str, z, new fx3());
        }

        @Override // com.p7700g.p99005.wm4
        public um4<String, String> a() {
            return this.c;
        }

        @Override // com.p7700g.p99005.wm4
        public String getPath() {
            return this.b;
        }

        public String toString() {
            return this.b;
        }

        public b(String str, boolean z, um4<String, String> um4Var) {
            this.b = z ? ms3.h(str, c.PATH_SEGMENT) : str;
            this.c = um4Var;
        }
    }

    /* compiled from: UriComponent.java */
    /* loaded from: classes3.dex */
    public enum c {
        UNRESERVED,
        SCHEME,
        AUTHORITY,
        USER_INFO,
        HOST,
        PORT,
        PATH,
        PATH_SEGMENT,
        MATRIX_PARAM,
        QUERY,
        QUERY_PARAM,
        FRAGMENT
    }

    private ms3() {
    }

    private static boolean[] A(List<String> list) {
        boolean[] zArr = new boolean[128];
        for (String str : list) {
            if (str.length() == 1) {
                zArr[str.charAt(0)] = true;
            } else if (str.length() == 3 && str.charAt(1) == '-') {
                for (int charAt = str.charAt(0); charAt <= str.charAt(2); charAt++) {
                    zArr[charAt] = true;
                }
            }
        }
        return zArr;
    }

    private static boolean[][] B() {
        c.values();
        boolean[][] zArr = new boolean[12];
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(b));
        zArr[c.SCHEME.ordinal()] = A(arrayList);
        arrayList.clear();
        arrayList.addAll(Arrays.asList(c));
        zArr[c.UNRESERVED.ordinal()] = A(arrayList);
        arrayList.addAll(Arrays.asList(d));
        zArr[c.HOST.ordinal()] = A(arrayList);
        zArr[c.PORT.ordinal()] = A(Arrays.asList("0-9"));
        arrayList.add(":");
        zArr[c.USER_INFO.ordinal()] = A(arrayList);
        arrayList.add("@");
        zArr[c.AUTHORITY.ordinal()] = A(arrayList);
        c cVar = c.PATH_SEGMENT;
        zArr[cVar.ordinal()] = A(arrayList);
        zArr[cVar.ordinal()][59] = false;
        c cVar2 = c.MATRIX_PARAM;
        zArr[cVar2.ordinal()] = (boolean[]) zArr[cVar.ordinal()].clone();
        zArr[cVar2.ordinal()][61] = false;
        arrayList.add("/");
        zArr[c.PATH.ordinal()] = A(arrayList);
        arrayList.add("?");
        c cVar3 = c.QUERY;
        zArr[cVar3.ordinal()] = A(arrayList);
        zArr[c.FRAGMENT.ordinal()] = zArr[cVar3.ordinal()];
        c cVar4 = c.QUERY_PARAM;
        zArr[cVar4.ordinal()] = A(arrayList);
        zArr[cVar4.ordinal()][61] = false;
        zArr[cVar4.ordinal()][43] = false;
        zArr[cVar4.ordinal()][38] = false;
        return zArr;
    }

    private static int[] C() {
        int[] iArr = new int[128];
        Arrays.fill(iArr, -1);
        for (char c2 = '0'; c2 <= '9'; c2 = (char) (c2 + 1)) {
            iArr[c2] = c2 - '0';
        }
        for (char c3 = 'A'; c3 <= 'F'; c3 = (char) (c3 + 1)) {
            iArr[c3] = (c3 - 'A') + 10;
        }
        for (char c4 = 'a'; c4 <= 'f'; c4 = (char) (c4 + 1)) {
            iArr[c4] = (c4 - 'a') + 10;
        }
        return iArr;
    }

    public static boolean D(char c2) {
        return c2 < 128 && g[c2] != -1;
    }

    public static boolean E(String str, c cVar) {
        return F(str, cVar, false);
    }

    public static boolean F(String str, c cVar, boolean z) {
        return b(str, cVar, z) == -1;
    }

    public static void G(String str, c cVar) {
        H(str, cVar, false);
    }

    public static void H(String str, c cVar, boolean z) {
        int b2 = b(str, cVar, z);
        if (b2 <= -1) {
            return;
        }
        throw new IllegalArgumentException("The string '" + str + "' for the URI component " + cVar + " contains an invalid character, '" + str.charAt(b2) + "', at index " + b2);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String a(String str, c cVar, boolean z, boolean z2) {
        int i;
        boolean[] zArr = e[cVar.ordinal()];
        StringBuilder sb = null;
        int i2 = 0;
        boolean z3 = false;
        while (i2 < str.length()) {
            int codePointAt = str.codePointAt(i2);
            if (codePointAt >= 128 || !zArr[codePointAt]) {
                if (z) {
                    boolean z4 = true;
                    if (codePointAt == 123) {
                        z3 = true;
                    } else if (codePointAt == 125) {
                        z3 = false;
                        if (!z3 || z4) {
                            if (sb == null) {
                                sb.append(Character.toChars(codePointAt));
                            }
                        }
                    }
                    z4 = false;
                    if (!z3) {
                    }
                    if (sb == null) {
                    }
                }
                if (z2 && codePointAt == 37 && (i = i2 + 2) < str.length()) {
                    int i3 = i2 + 1;
                    if (D(str.charAt(i3)) && D(str.charAt(i))) {
                        if (sb != null) {
                            sb.append('%');
                            sb.append(str.charAt(i3));
                            sb.append(str.charAt(i));
                        }
                        i2 = i;
                    }
                }
                if (sb == null) {
                    sb = new StringBuilder();
                    sb.append(str.substring(0, i2));
                }
                if (codePointAt < 128) {
                    if (codePointAt == 32 && cVar == c.QUERY_PARAM) {
                        sb.append('+');
                    } else {
                        c(sb, (char) codePointAt);
                    }
                } else {
                    d(sb, codePointAt);
                }
            } else if (sb != null) {
                sb.append((char) codePointAt);
            }
            i2 += Character.charCount(codePointAt);
        }
        return sb == null ? str : sb.toString();
    }

    private static int b(String str, c cVar, boolean z) {
        boolean[] zArr = e[cVar.ordinal()];
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (((charAt < 128 && charAt != '%' && !zArr[charAt]) || charAt >= 128) && (!z || (charAt != '{' && charAt != '}'))) {
                return i;
            }
        }
        return -1;
    }

    private static void c(StringBuilder sb, int i) {
        sb.append('%');
        char[] cArr = a;
        sb.append(cArr[i >> 4]);
        sb.append(cArr[i & 15]);
    }

    private static void d(StringBuilder sb, int i) {
        ByteBuffer encode = f.encode(CharBuffer.wrap(Character.toChars(i)));
        while (encode.hasRemaining()) {
            c(sb, encode.get() & 255);
        }
    }

    public static String e(String str, c cVar) {
        return a(str, cVar, false, true);
    }

    public static String f(String str, c cVar, boolean z) {
        return a(str, cVar, z, true);
    }

    private static String g(String str, int i) {
        StringBuilder sb = new StringBuilder(i);
        ByteBuffer byteBuffer = null;
        int i2 = 0;
        while (i2 < i) {
            int i3 = i2 + 1;
            char charAt = str.charAt(i2);
            if (charAt != '%') {
                sb.append(charAt);
                i2 = i3;
            } else {
                byteBuffer = r(str, i3, byteBuffer);
                i2 = n(i3, byteBuffer, sb);
            }
        }
        return sb.toString();
    }

    public static String h(String str, c cVar) {
        if (str != null) {
            int length = str.length();
            if (length == 0) {
                return str;
            }
            if (str.indexOf(37) < 0) {
                if (cVar != c.QUERY_PARAM || str.indexOf(43) < 0) {
                    return str;
                }
            } else if (length >= 2) {
                int i = length - 2;
                if (str.charAt(i) == '%') {
                    throw new IllegalArgumentException(wo1.l("Malformed percent-encoded octet at index ", i));
                }
            } else {
                throw new IllegalArgumentException("Malformed percent-encoded octet at index 1");
            }
            if (cVar == null) {
                return g(str, length);
            }
            int ordinal = cVar.ordinal();
            if (ordinal != 4) {
                if (ordinal != 10) {
                    return g(str, length);
                }
                return v(str, length);
            }
            return k(str, length);
        }
        throw new IllegalArgumentException();
    }

    private static int i(char c2) {
        if (c2 < 128) {
            return g[c2];
        }
        return -1;
    }

    private static int j(String str, int i) {
        int i2 = i(str.charAt(i));
        if (i2 != -1) {
            return i2;
        }
        StringBuilder H = wo1.H("Malformed percent-encoded octet at index ", i, ", invalid hexadecimal digit '");
        H.append(str.charAt(i));
        H.append("'");
        throw new IllegalArgumentException(H.toString());
    }

    private static String k(String str, int i) {
        StringBuilder sb = new StringBuilder(i);
        ByteBuffer byteBuffer = null;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            int i3 = i2 + 1;
            char charAt = str.charAt(i2);
            if (charAt == '[') {
                z = true;
            } else if (z && charAt == ']') {
                z = false;
            }
            if (charAt == '%' && !z) {
                byteBuffer = r(str, i3, byteBuffer);
                i2 = n(i3, byteBuffer, sb);
            } else {
                sb.append(charAt);
                i2 = i3;
            }
        }
        return sb.toString();
    }

    public static um4<String, String> l(String str, boolean z) {
        fx3 fx3Var = new fx3();
        int indexOf = str.indexOf(59) + 1;
        if (indexOf != 0 && indexOf != str.length()) {
            do {
                int indexOf2 = str.indexOf(59, indexOf);
                if (indexOf2 == -1) {
                    m(fx3Var, str.substring(indexOf), z);
                } else if (indexOf2 > indexOf) {
                    m(fx3Var, str.substring(indexOf, indexOf2), z);
                }
                indexOf = indexOf2 + 1;
                if (indexOf <= 0) {
                    break;
                }
            } while (indexOf < str.length());
        }
        return fx3Var;
    }

    private static void m(um4<String, String> um4Var, String str, boolean z) {
        int indexOf = str.indexOf(61);
        if (indexOf > 0) {
            String substring = str.substring(0, indexOf);
            c cVar = c.MATRIX_PARAM;
            String h = h(substring, cVar);
            String substring2 = str.substring(indexOf + 1);
            if (z) {
                substring2 = h(substring2, cVar);
            }
            um4Var.d(h, substring2);
        } else if (indexOf != 0 && str.length() > 0) {
            um4Var.d(h(str, c.MATRIX_PARAM), "");
        }
    }

    private static int n(int i, ByteBuffer byteBuffer, StringBuilder sb) {
        if (byteBuffer.limit() == 1 && (byteBuffer.get(0) & 255) < 128) {
            sb.append((char) byteBuffer.get(0));
            return i + 2;
        }
        sb.append(f.decode(byteBuffer).toString());
        return ((byteBuffer.limit() * 3) + i) - 1;
    }

    public static List<wm4> o(String str, boolean z) {
        int i;
        LinkedList linkedList = new LinkedList();
        if (str == null) {
            return linkedList;
        }
        int i2 = -1;
        while (true) {
            i = i2 + 1;
            int indexOf = str.indexOf(47, i);
            if (indexOf > i) {
                q(linkedList, str.substring(i, indexOf), z);
            } else if (indexOf == i) {
                linkedList.add(b.a);
            }
            if (indexOf == -1) {
                break;
            }
            i2 = indexOf;
        }
        if (i >= str.length()) {
            linkedList.add(b.a);
        } else {
            q(linkedList, str.substring(i), z);
        }
        return linkedList;
    }

    public static List<wm4> p(URI uri, boolean z) {
        String rawPath = uri.getRawPath();
        if (rawPath != null && rawPath.length() > 0 && rawPath.charAt(0) == '/') {
            rawPath = rawPath.substring(1);
        }
        return o(rawPath, z);
    }

    public static void q(List<wm4> list, String str, boolean z) {
        int indexOf = str.indexOf(59);
        if (indexOf != -1) {
            list.add(new b(indexOf == 0 ? "" : str.substring(0, indexOf), z, l(str, z)));
        } else {
            list.add(new b(str, z));
        }
    }

    private static ByteBuffer r(String str, int i, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            byteBuffer = ByteBuffer.allocate(1);
        } else {
            byteBuffer.clear();
        }
        while (true) {
            int i2 = i + 1;
            int i3 = i2 + 1;
            byteBuffer.put((byte) ((j(str, i) << 4) | j(str, i2)));
            if (i3 == str.length()) {
                break;
            }
            i = i3 + 1;
            if (str.charAt(i3) != '%') {
                break;
            } else if (byteBuffer.position() == byteBuffer.capacity()) {
                byteBuffer.flip();
                ByteBuffer allocate = ByteBuffer.allocate(str.length() / 3);
                allocate.put(byteBuffer);
                byteBuffer = allocate;
            }
        }
        byteBuffer.flip();
        return byteBuffer;
    }

    public static um4<String, String> s(String str, boolean z) {
        return t(str, true, z);
    }

    public static um4<String, String> t(String str, boolean z, boolean z2) {
        fx3 fx3Var = new fx3();
        if (str != null && str.length() != 0) {
            int i = 0;
            do {
                int indexOf = str.indexOf(38, i);
                if (indexOf == -1) {
                    w(fx3Var, str.substring(i), z, z2);
                } else if (indexOf > i) {
                    w(fx3Var, str.substring(i, indexOf), z, z2);
                }
                i = indexOf + 1;
                if (i <= 0) {
                    break;
                }
            } while (i < str.length());
        }
        return fx3Var;
    }

    public static um4<String, String> u(URI uri, boolean z) {
        return s(uri.getRawQuery(), z);
    }

    private static String v(String str, int i) {
        StringBuilder sb = new StringBuilder(i);
        ByteBuffer byteBuffer = null;
        int i2 = 0;
        while (i2 < i) {
            int i3 = i2 + 1;
            char charAt = str.charAt(i2);
            if (charAt != '%') {
                if (charAt != '+') {
                    sb.append(charAt);
                } else {
                    sb.append(gl4.R);
                }
                i2 = i3;
            } else {
                byteBuffer = r(str, i3, byteBuffer);
                i2 = n(i3, byteBuffer, sb);
            }
        }
        return sb.toString();
    }

    private static void w(um4<String, String> um4Var, String str, boolean z, boolean z2) {
        try {
            int indexOf = str.indexOf(61);
            if (indexOf > 0) {
                String decode = z ? URLDecoder.decode(str.substring(0, indexOf), "UTF-8") : str.substring(0, indexOf);
                int i = indexOf + 1;
                um4Var.d(decode, z2 ? URLDecoder.decode(str.substring(i), "UTF-8") : str.substring(i));
            } else if (indexOf != 0 && str.length() > 0) {
                um4Var.d(URLDecoder.decode(str, "UTF-8"), "");
            }
        } catch (UnsupportedEncodingException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static String x(String str, c cVar) {
        return a(str, cVar, false, false);
    }

    public static String y(String str, c cVar, boolean z) {
        return a(str, cVar, z, false);
    }

    public static String z(String str) {
        if (str.indexOf(123) != -1) {
            str = str.replace("{", "%7B");
        }
        return str.indexOf(125) != -1 ? str.replace("}", "%7D") : str;
    }
}