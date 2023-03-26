package com.p7700g.p99005;

import com.squareup.moshi.adapters.Iso8601Utils;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: ISO8601Utils.java */
/* loaded from: classes3.dex */
public class gx2 {
    private static final String a = "UTC";
    private static final TimeZone b = TimeZone.getTimeZone("UTC");

    private static boolean a(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    public static String b(Date date) {
        return d(date, false, b);
    }

    public static String c(Date date, boolean z) {
        return d(date, z, b);
    }

    public static String d(Date date, boolean z, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(19 + (z ? 4 : 0) + (timeZone.getRawOffset() == 0 ? 1 : 6));
        f(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        f(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        f(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        f(sb, gregorianCalendar.get(11), 2);
        sb.append(':');
        f(sb, gregorianCalendar.get(12), 2);
        sb.append(':');
        f(sb, gregorianCalendar.get(13), 2);
        if (z) {
            sb.append('.');
            f(sb, gregorianCalendar.get(14), 3);
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i = offset / 60000;
            int abs = Math.abs(i / 60);
            int abs2 = Math.abs(i % 60);
            sb.append(offset >= 0 ? '+' : '-');
            f(sb, abs, 2);
            sb.append(':');
            f(sb, abs2, 2);
        } else {
            sb.append('Z');
        }
        return sb.toString();
    }

    private static int e(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt < '0' || charAt > '9') {
                return i;
            }
            i++;
        }
        return str.length();
    }

    private static void f(StringBuilder sb, int i, int i2) {
        String num = Integer.toString(i);
        for (int length = i2 - num.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(num);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00d7 A[Catch: IllegalArgumentException -> 0x01c4, NumberFormatException -> 0x01c6, IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01c8, TryCatch #2 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01c8, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0036, B:13:0x003c, B:17:0x0054, B:19:0x0064, B:20:0x0066, B:22:0x0072, B:23:0x0074, B:25:0x007a, B:29:0x0084, B:34:0x0094, B:36:0x009c, B:48:0x00d1, B:50:0x00d7, B:52:0x00de, B:76:0x018b, B:56:0x00e8, B:57:0x0103, B:58:0x0104, B:62:0x0120, B:64:0x012d, B:67:0x0136, B:69:0x0155, B:72:0x0164, B:73:0x0186, B:75:0x0189, B:61:0x010f, B:78:0x01bc, B:79:0x01c3, B:40:0x00b4, B:41:0x00b7), top: B:95:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01bc A[Catch: IllegalArgumentException -> 0x01c4, NumberFormatException -> 0x01c6, IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01c8, TryCatch #2 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01c8, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0036, B:13:0x003c, B:17:0x0054, B:19:0x0064, B:20:0x0066, B:22:0x0072, B:23:0x0074, B:25:0x007a, B:29:0x0084, B:34:0x0094, B:36:0x009c, B:48:0x00d1, B:50:0x00d7, B:52:0x00de, B:76:0x018b, B:56:0x00e8, B:57:0x0103, B:58:0x0104, B:62:0x0120, B:64:0x012d, B:67:0x0136, B:69:0x0155, B:72:0x0164, B:73:0x0186, B:75:0x0189, B:61:0x010f, B:78:0x01bc, B:79:0x01c3, B:40:0x00b4, B:41:0x00b7), top: B:95:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Date g(String str, ParsePosition parsePosition) throws ParseException {
        String str2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int length;
        TimeZone timeZone;
        char charAt;
        try {
            int index = parsePosition.getIndex();
            int i9 = index + 4;
            int h = h(str, index, i9);
            if (a(str, i9, '-')) {
                i9++;
            }
            int i10 = i9 + 2;
            int h2 = h(str, i9, i10);
            if (a(str, i10, '-')) {
                i10++;
            }
            int i11 = i10 + 2;
            int h3 = h(str, i10, i11);
            boolean a2 = a(str, i11, 'T');
            if (!a2 && str.length() <= i11) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(h, h2 - 1, h3);
                gregorianCalendar.setLenient(false);
                parsePosition.setIndex(i11);
                return gregorianCalendar.getTime();
            }
            if (a2) {
                int i12 = i11 + 1;
                int i13 = i12 + 2;
                i6 = h(str, i12, i13);
                if (a(str, i13, ':')) {
                    i13++;
                }
                int i14 = i13 + 2;
                i7 = h(str, i13, i14);
                if (a(str, i14, ':')) {
                    i14++;
                }
                if (str.length() <= i14 || (charAt = str.charAt(i14)) == 'Z' || charAt == '+' || charAt == '-') {
                    i2 = i7;
                    i3 = 0;
                    i = i6;
                    i11 = i14;
                } else {
                    i5 = i14 + 2;
                    i4 = h(str, i14, i5);
                    if (i4 > 59 && i4 < 63) {
                        i4 = 59;
                    }
                    if (a(str, i5, '.')) {
                        int i15 = i5 + 1;
                        int e = e(str, i15 + 1);
                        int min = Math.min(e, i15 + 3);
                        i3 = h(str, i15, min);
                        int i16 = min - i15;
                        if (i16 == 1) {
                            i3 *= 100;
                        } else if (i16 == 2) {
                            i3 *= 10;
                        }
                        i5 = e;
                        i8 = i3;
                        if (str.length() > i5) {
                            char charAt2 = str.charAt(i5);
                            if (charAt2 == 'Z') {
                                timeZone = b;
                                length = i5 + 1;
                            } else {
                                if (charAt2 != '+' && charAt2 != '-') {
                                    throw new IndexOutOfBoundsException("Invalid time zone indicator '" + charAt2 + "'");
                                }
                                String substring = str.substring(i5);
                                if (substring.length() < 5) {
                                    substring = substring + "00";
                                }
                                length = i5 + substring.length();
                                if (!"+0000".equals(substring) && !"+00:00".equals(substring)) {
                                    String str3 = Iso8601Utils.GMT_ID + substring;
                                    TimeZone timeZone2 = TimeZone.getTimeZone(str3);
                                    String id = timeZone2.getID();
                                    if (!id.equals(str3) && !id.replace(":", "").equals(str3)) {
                                        throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str3 + " given, resolves to " + timeZone2.getID());
                                    }
                                    timeZone = timeZone2;
                                }
                                timeZone = b;
                            }
                            GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
                            gregorianCalendar2.setLenient(false);
                            gregorianCalendar2.set(1, h);
                            gregorianCalendar2.set(2, h2 - 1);
                            gregorianCalendar2.set(5, h3);
                            gregorianCalendar2.set(11, i6);
                            gregorianCalendar2.set(12, i7);
                            gregorianCalendar2.set(13, i4);
                            gregorianCalendar2.set(14, i8);
                            parsePosition.setIndex(length);
                            return gregorianCalendar2.getTime();
                        }
                        throw new IllegalArgumentException("No time zone indicator");
                    }
                    i8 = 0;
                    if (str.length() > i5) {
                    }
                }
            } else {
                i = 0;
                i2 = 0;
                i3 = 0;
            }
            i4 = 0;
            i5 = i11;
            i6 = i;
            i7 = i2;
            i8 = i3;
            if (str.length() > i5) {
            }
        } catch (IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException e2) {
            if (str == null) {
                str2 = null;
            } else {
                str2 = h95.b + str + h95.b;
            }
            String message = e2.getMessage();
            if (message == null || message.isEmpty()) {
                StringBuilder G = wo1.G("(");
                G.append(e2.getClass().getName());
                G.append(")");
                message = G.toString();
            }
            ParseException parseException = new ParseException(wo1.v("Failed to parse date [", str2, "]: ", message), parsePosition.getIndex());
            parseException.initCause(e2);
            throw parseException;
        }
    }

    private static int h(String str, int i, int i2) throws NumberFormatException {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int digit = Character.digit(str.charAt(i), 10);
            if (digit < 0) {
                StringBuilder G = wo1.G("Invalid number: ");
                G.append(str.substring(i, i2));
                throw new NumberFormatException(G.toString());
            }
            i3 = -digit;
        } else {
            i3 = 0;
            i4 = i;
        }
        while (i4 < i2) {
            int i5 = i4 + 1;
            int digit2 = Character.digit(str.charAt(i4), 10);
            if (digit2 < 0) {
                StringBuilder G2 = wo1.G("Invalid number: ");
                G2.append(str.substring(i, i2));
                throw new NumberFormatException(G2.toString());
            }
            i3 = (i3 * 10) - digit2;
            i4 = i5;
        }
        return -i3;
    }
}