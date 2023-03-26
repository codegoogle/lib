package com.p7700g.p99005;

import com.microsoft.appcenter.utils.crypto.CryptoConstants;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: hostnames.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\u001a\u0013\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a7\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"", "e", "(Ljava/lang/String;)Ljava/lang/String;", "", "a", "(Ljava/lang/String;)Z", "input", "", "pos", "limit", "Ljava/net/InetAddress;", "c", "(Ljava/lang/String;II)Ljava/net/InetAddress;", "", "address", "addressOffset", "b", "(Ljava/lang/String;II[BI)Z", "d", "([B)Ljava/lang/String;", "okhttp"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class pr5 {
    private static final boolean a(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (c25.t(charAt, 31) <= 0 || c25.t(charAt, 127) >= 0 || c95.q3(" #%/:?@[\\]", charAt, 0, false, 6, null) != -1) {
                return true;
            }
        }
        return false;
    }

    private static final boolean b(String str, int i, int i2, byte[] bArr, int i3) {
        int i4 = i3;
        while (i < i2) {
            if (i4 == bArr.length) {
                return false;
            }
            if (i4 != i3) {
                if (str.charAt(i) != '.') {
                    return false;
                }
                i++;
            }
            int i5 = i;
            int i6 = 0;
            while (i5 < i2) {
                char charAt = str.charAt(i5);
                if (c25.t(charAt, 48) < 0 || c25.t(charAt, 57) > 0) {
                    break;
                } else if ((i6 == 0 && i != i5) || (i6 = ((i6 * 10) + charAt) - 48) > 255) {
                    return false;
                } else {
                    i5++;
                }
            }
            if (i5 - i == 0) {
                return false;
            }
            bArr[i4] = (byte) i6;
            i4++;
            i = i5;
        }
        return i4 == i3 + 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
        if (r13 == 16) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0099, code lost:
        if (r14 != (-1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009b, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009c, code lost:
        r0 = r13 - r14;
        java.lang.System.arraycopy(r9, r14, r9, 16 - r0, r0);
        java.util.Arrays.fill(r9, r14, (16 - r13) + r14, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ae, code lost:
        return java.net.InetAddress.getByAddress(r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final InetAddress c(String str, int i, int i2) {
        int i3;
        byte[] bArr = new byte[16];
        int i4 = i;
        int i5 = 0;
        int i6 = -1;
        int i7 = -1;
        while (true) {
            if (i4 < i2) {
                if (i5 != 16) {
                    int i8 = i4 + 2;
                    if (i8 <= i2 && b95.t2(str, "::", i4, false, 4, null)) {
                        if (i6 == -1) {
                            i5 += 2;
                            if (i8 != i2) {
                                i7 = i8;
                                i6 = i5;
                                i4 = i7;
                                int i9 = 0;
                                while (i4 < i2) {
                                }
                                i3 = i4 - i7;
                                if (i3 == 0) {
                                    break;
                                }
                                break;
                            }
                            i6 = i5;
                            break;
                        }
                        return null;
                    }
                    if (i5 != 0) {
                        if (b95.t2(str, ":", i4, false, 4, null)) {
                            i4++;
                        } else if (!b95.t2(str, CryptoConstants.ALIAS_SEPARATOR, i4, false, 4, null) || !b(str, i7, i2, bArr, i5 - 2)) {
                            return null;
                        } else {
                            i5 += 2;
                        }
                    }
                    i7 = i4;
                    i4 = i7;
                    int i92 = 0;
                    while (i4 < i2) {
                        int N = sr5.N(str.charAt(i4));
                        if (N == -1) {
                            break;
                        }
                        i92 = (i92 << 4) + N;
                        i4++;
                    }
                    i3 = i4 - i7;
                    if (i3 == 0 || i3 > 4) {
                        break;
                    }
                    int i10 = i5 + 1;
                    bArr[i5] = (byte) ((i92 >>> 8) & 255);
                    i5 = i10 + 1;
                    bArr[i10] = (byte) (i92 & 255);
                } else {
                    return null;
                }
            } else {
                break;
            }
        }
        return null;
    }

    private static final String d(byte[] bArr) {
        int i = 0;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < bArr.length) {
            int i5 = i3;
            while (i5 < 16 && bArr[i5] == 0 && bArr[i5 + 1] == 0) {
                i5 += 2;
            }
            int i6 = i5 - i3;
            if (i6 > i4 && i6 >= 4) {
                i2 = i3;
                i4 = i6;
            }
            i3 = i5 + 2;
        }
        sv5 sv5Var = new sv5();
        while (i < bArr.length) {
            if (i == i2) {
                sv5Var.g0(58);
                i += i4;
                if (i == 16) {
                    sv5Var.g0(58);
                }
            } else {
                if (i > 0) {
                    sv5Var.g0(58);
                }
                sv5Var.e1((sr5.b(bArr[i], 255) << 8) | sr5.b(bArr[i + 1], 255));
                i += 2;
            }
        }
        return sv5Var.u1();
    }

    @Nullable
    public static final String e(@NotNull String str) {
        InetAddress c;
        c25.p(str, "$this$toCanonicalHost");
        if (c95.V2(str, ":", false, 2, null)) {
            if (b95.u2(str, "[", false, 2, null) && b95.J1(str, "]", false, 2, null)) {
                c = c(str, 1, str.length() - 1);
            } else {
                c = c(str, 0, str.length());
            }
            if (c != null) {
                byte[] address = c.getAddress();
                if (address.length == 16) {
                    c25.o(address, "address");
                    return d(address);
                } else if (address.length == 4) {
                    return c.getHostAddress();
                } else {
                    throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
                }
            }
            return null;
        }
        try {
            String ascii = IDN.toASCII(str);
            c25.o(ascii, "IDN.toASCII(host)");
            Locale locale = Locale.US;
            c25.o(locale, "Locale.US");
            if (ascii != null) {
                String lowerCase = ascii.toLowerCase(locale);
                c25.o(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                if (!(lowerCase.length() == 0) && !a(lowerCase)) {
                    return lowerCase;
                }
                return null;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}