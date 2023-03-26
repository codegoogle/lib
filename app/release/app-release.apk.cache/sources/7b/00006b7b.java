package org.xbill.DNS;

import com.p7700g.p99005.bx;

/* loaded from: classes4.dex */
public final class TTL {
    public static final long MAX_VALUE = 2147483647L;

    private TTL() {
    }

    public static void check(long j) {
        if (j < 0 || j > MAX_VALUE) {
            throw new InvalidTTLException(j);
        }
    }

    public static String format(long j) {
        check(j);
        StringBuffer stringBuffer = new StringBuffer();
        long j2 = j % 60;
        long j3 = j / 60;
        long j4 = j3 % 60;
        long j5 = j3 / 60;
        long j6 = j5 % 24;
        long j7 = j5 / 24;
        long j8 = j7 % 7;
        long j9 = j7 / 7;
        int i = (j9 > 0L ? 1 : (j9 == 0L ? 0 : -1));
        if (i > 0) {
            stringBuffer.append(j9 + bx.y4);
        }
        int i2 = (j8 > 0L ? 1 : (j8 == 0L ? 0 : -1));
        if (i2 > 0) {
            stringBuffer.append(j8 + "D");
        }
        int i3 = (j6 > 0L ? 1 : (j6 == 0L ? 0 : -1));
        if (i3 > 0) {
            stringBuffer.append(j6 + "H");
        }
        int i4 = (j4 > 0L ? 1 : (j4 == 0L ? 0 : -1));
        if (i4 > 0) {
            stringBuffer.append(j4 + "M");
        }
        if (j2 > 0 || (i == 0 && i2 == 0 && i3 == 0 && i4 == 0)) {
            stringBuffer.append(j2 + "S");
        }
        return stringBuffer.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x007a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long parse(String str, boolean z) {
        if (str != null && str.length() != 0) {
            if (Character.isDigit(str.charAt(0))) {
                long j = 0;
                long j2 = 0;
                for (int i = 0; i < str.length(); i++) {
                    char charAt = str.charAt(i);
                    if (Character.isDigit(charAt)) {
                        long numericValue = (10 * j2) + Character.getNumericValue(charAt);
                        if (numericValue < j2) {
                            throw new NumberFormatException();
                        }
                        j2 = numericValue;
                    } else {
                        char upperCase = Character.toUpperCase(charAt);
                        if (upperCase != 'D') {
                            if (upperCase != 'H') {
                                if (upperCase != 'M') {
                                    if (upperCase != 'S') {
                                        if (upperCase != 'W') {
                                            throw new NumberFormatException();
                                        }
                                        j2 *= 7;
                                    }
                                    j += j2;
                                    if (j <= 4294967295L) {
                                        throw new NumberFormatException();
                                    }
                                    j2 = 0;
                                }
                                j2 *= 60;
                                j += j2;
                                if (j <= 4294967295L) {
                                }
                            }
                            j2 *= 60;
                            j2 *= 60;
                            j += j2;
                            if (j <= 4294967295L) {
                            }
                        }
                        j2 *= 24;
                        j2 *= 60;
                        j2 *= 60;
                        j += j2;
                        if (j <= 4294967295L) {
                        }
                    }
                }
                if (j == 0) {
                    j = j2;
                }
                if (j <= 4294967295L) {
                    return (j <= MAX_VALUE || !z) ? j : MAX_VALUE;
                }
                throw new NumberFormatException();
            }
        }
        throw new NumberFormatException();
    }

    public static long parseTTL(String str) {
        return parse(str, true);
    }
}