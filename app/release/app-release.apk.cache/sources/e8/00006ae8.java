package org.xbill.DNS;

import com.microsoft.appcenter.utils.crypto.CryptoConstants;
import com.p7700g.p99005.wo1;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* loaded from: classes4.dex */
public final class Address {
    public static final int IPv4 = 1;
    public static final int IPv6 = 2;

    private Address() {
    }

    private static InetAddress addrFromRecord(String str, Record record) throws UnknownHostException {
        InetAddress address;
        if (record instanceof ARecord) {
            address = ((ARecord) record).getAddress();
        } else {
            address = ((AAAARecord) record).getAddress();
        }
        return InetAddress.getByAddress(str, address.getAddress());
    }

    public static int addressLength(int i) {
        if (i == 1) {
            return 4;
        }
        if (i == 2) {
            return 16;
        }
        throw new IllegalArgumentException("unknown address family");
    }

    public static int familyOf(InetAddress inetAddress) {
        if (inetAddress instanceof Inet4Address) {
            return 1;
        }
        if (inetAddress instanceof Inet6Address) {
            return 2;
        }
        throw new IllegalArgumentException("unknown address family");
    }

    public static InetAddress[] getAllByName(String str) throws UnknownHostException {
        try {
            return new InetAddress[]{getByAddress(str)};
        } catch (UnknownHostException unused) {
            Record[] lookupHostName = lookupHostName(str, true);
            InetAddress[] inetAddressArr = new InetAddress[lookupHostName.length];
            for (int i = 0; i < lookupHostName.length; i++) {
                inetAddressArr[i] = addrFromRecord(str, lookupHostName[i]);
            }
            return inetAddressArr;
        }
    }

    public static InetAddress getByAddress(String str) throws UnknownHostException {
        byte[] byteArray = toByteArray(str, 1);
        if (byteArray != null) {
            return InetAddress.getByAddress(str, byteArray);
        }
        byte[] byteArray2 = toByteArray(str, 2);
        if (byteArray2 != null) {
            return InetAddress.getByAddress(str, byteArray2);
        }
        throw new UnknownHostException(wo1.t("Invalid address: ", str));
    }

    public static InetAddress getByName(String str) throws UnknownHostException {
        try {
            return getByAddress(str);
        } catch (UnknownHostException unused) {
            return addrFromRecord(str, lookupHostName(str, false)[0]);
        }
    }

    public static String getHostName(InetAddress inetAddress) throws UnknownHostException {
        Record[] run = new Lookup(ReverseMap.fromAddress(inetAddress), 12).run();
        if (run != null) {
            return ((PTRRecord) run[0]).getTarget().toString();
        }
        throw new UnknownHostException("unknown address");
    }

    public static boolean isDottedQuad(String str) {
        return toByteArray(str, 1) != null;
    }

    private static Record[] lookupHostName(String str, boolean z) throws UnknownHostException {
        Record[] run;
        Record[] run2;
        try {
            Lookup lookup = new Lookup(str, 1);
            Record[] run3 = lookup.run();
            if (run3 == null) {
                if (lookup.getResult() != 4 || (run2 = new Lookup(str, 28).run()) == null) {
                    throw new UnknownHostException("unknown host");
                }
                return run2;
            } else if (z && (run = new Lookup(str, 28).run()) != null) {
                Record[] recordArr = new Record[run3.length + run.length];
                System.arraycopy(run3, 0, recordArr, 0, run3.length);
                System.arraycopy(run, 0, recordArr, run3.length, run.length);
                return recordArr;
            } else {
                return run3;
            }
        } catch (TextParseException unused) {
            throw new UnknownHostException("invalid name");
        }
    }

    private static byte[] parseV4(String str) {
        byte[] bArr = new byte[4];
        int length = str.length();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = str.charAt(i4);
            if (charAt < '0' || charAt > '9') {
                if (charAt != '.' || i == 3 || i2 == 0) {
                    return null;
                }
                bArr[i] = (byte) i3;
                i++;
                i2 = 0;
                i3 = 0;
            } else if (i2 == 3) {
                return null;
            } else {
                if (i2 > 0 && i3 == 0) {
                    return null;
                }
                i2++;
                int i5 = (charAt - '0') + (i3 * 10);
                if (i5 > 255) {
                    return null;
                }
                i3 = i5;
            }
        }
        if (i == 3 && i2 != 0) {
            bArr[i] = (byte) i3;
            return bArr;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00bb, code lost:
        if (r8 >= 16) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00bd, code lost:
        if (r3 >= 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00bf, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c0, code lost:
        if (r3 < 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c2, code lost:
        r12 = (16 - r8) + r3;
        java.lang.System.arraycopy(r1, r3, r1, r12, r8 - r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c9, code lost:
        if (r3 >= r12) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00cb, code lost:
        r1[r3] = 0;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d0, code lost:
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static byte[] parseV6(String str) {
        int i;
        byte[] byteArray;
        byte[] bArr = new byte[16];
        int i2 = -1;
        String[] split = str.split(":", -1);
        int length = split.length - 1;
        if (split[0].length() != 0) {
            i = 0;
        } else if (length + 0 <= 0 || split[1].length() != 0) {
            return null;
        } else {
            i = 1;
        }
        if (split[length].length() == 0) {
            if (length - i <= 0 || split[length - 1].length() != 0) {
                return null;
            }
            length--;
        }
        if ((length - i) + 1 > 8) {
            return null;
        }
        int i3 = 0;
        while (true) {
            if (i > length) {
                break;
            }
            if (split[i].length() != 0) {
                if (split[i].indexOf(46) < 0) {
                    for (int i4 = 0; i4 < split[i].length(); i4++) {
                        try {
                            if (Character.digit(split[i].charAt(i4), 16) < 0) {
                                return null;
                            }
                        } catch (NumberFormatException unused) {
                        }
                    }
                    int parseInt = Integer.parseInt(split[i], 16);
                    if (parseInt > 65535 || parseInt < 0) {
                        break;
                    }
                    int i5 = i3 + 1;
                    bArr[i3] = (byte) (parseInt >>> 8);
                    i3 = i5 + 1;
                    bArr[i5] = (byte) (parseInt & 255);
                } else if (i < length || i > 6 || (byteArray = toByteArray(split[i], 1)) == null) {
                    return null;
                } else {
                    int i6 = 0;
                    while (i6 < 4) {
                        bArr[i3] = byteArray[i6];
                        i6++;
                        i3++;
                    }
                }
            } else if (i2 >= 0) {
                return null;
            } else {
                i2 = i3;
            }
            i++;
        }
        return null;
    }

    public static int[] toArray(String str, int i) {
        byte[] byteArray = toByteArray(str, i);
        if (byteArray == null) {
            return null;
        }
        int[] iArr = new int[byteArray.length];
        for (int i2 = 0; i2 < byteArray.length; i2++) {
            iArr[i2] = byteArray[i2] & 255;
        }
        return iArr;
    }

    public static byte[] toByteArray(String str, int i) {
        if (i == 1) {
            return parseV4(str);
        }
        if (i == 2) {
            return parseV6(str);
        }
        throw new IllegalArgumentException("unknown address family");
    }

    public static String toDottedQuad(byte[] bArr) {
        return (bArr[0] & 255) + CryptoConstants.ALIAS_SEPARATOR + (bArr[1] & 255) + CryptoConstants.ALIAS_SEPARATOR + (bArr[2] & 255) + CryptoConstants.ALIAS_SEPARATOR + (bArr[3] & 255);
    }

    public static InetAddress truncate(InetAddress inetAddress, int i) {
        int i2;
        int addressLength = addressLength(familyOf(inetAddress)) * 8;
        if (i < 0 || i > addressLength) {
            throw new IllegalArgumentException("invalid mask length");
        }
        if (i == addressLength) {
            return inetAddress;
        }
        byte[] address = inetAddress.getAddress();
        int i3 = i / 8;
        int i4 = i3 + 1;
        while (true) {
            if (i4 >= address.length) {
                break;
            }
            address[i4] = 0;
            i4++;
        }
        int i5 = 0;
        for (i2 = 0; i2 < i % 8; i2++) {
            i5 |= 1 << (7 - i2);
        }
        address[i3] = (byte) (address[i3] & i5);
        try {
            return InetAddress.getByAddress(address);
        } catch (UnknownHostException unused) {
            throw new IllegalArgumentException("invalid address");
        }
    }

    public static String toDottedQuad(int[] iArr) {
        return iArr[0] + CryptoConstants.ALIAS_SEPARATOR + iArr[1] + CryptoConstants.ALIAS_SEPARATOR + iArr[2] + CryptoConstants.ALIAS_SEPARATOR + iArr[3];
    }

    public static int[] toArray(String str) {
        return toArray(str, 1);
    }

    public static InetAddress getByAddress(String str, int i) throws UnknownHostException {
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException("unknown address family");
        }
        byte[] byteArray = toByteArray(str, i);
        if (byteArray != null) {
            return InetAddress.getByAddress(str, byteArray);
        }
        throw new UnknownHostException(wo1.t("Invalid address: ", str));
    }
}