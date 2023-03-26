package com.squareup.moshi.adapters;

import com.p7700g.p99005.wo1;
import com.squareup.moshi.JsonDataException;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes3.dex */
public final class Iso8601Utils {
    public static final String GMT_ID = "GMT";
    public static final TimeZone TIMEZONE_Z = TimeZone.getTimeZone(GMT_ID);

    private static boolean checkOffset(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    public static String format(Date date) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TIMEZONE_Z, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(24);
        padInt(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        padInt(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        padInt(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        padInt(sb, gregorianCalendar.get(11), 2);
        sb.append(':');
        padInt(sb, gregorianCalendar.get(12), 2);
        sb.append(':');
        padInt(sb, gregorianCalendar.get(13), 2);
        sb.append('.');
        padInt(sb, gregorianCalendar.get(14), 3);
        sb.append('Z');
        return sb.toString();
    }

    private static int indexOfNonDigit(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt < '0' || charAt > '9') {
                return i;
            }
            i++;
        }
        return str.length();
    }

    private static void padInt(StringBuilder sb, int i, int i2) {
        String num = Integer.toString(i);
        for (int length = i2 - num.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(num);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c8 A[Catch: IllegalArgumentException -> 0x0198, IllegalArgumentException | IndexOutOfBoundsException -> 0x019a, TryCatch #2 {IllegalArgumentException | IndexOutOfBoundsException -> 0x019a, blocks: (B:3:0x0004, B:6:0x0011, B:8:0x001d, B:9:0x001f, B:11:0x002e, B:13:0x0034, B:17:0x0045, B:19:0x0055, B:20:0x0057, B:22:0x0063, B:23:0x0065, B:25:0x006b, B:29:0x0075, B:34:0x0085, B:36:0x008d, B:41:0x00c2, B:43:0x00c8, B:45:0x00ce, B:67:0x0161, B:51:0x00db, B:52:0x00f6, B:53:0x00f7, B:55:0x0103, B:58:0x010c, B:60:0x012b, B:63:0x013a, B:64:0x015c, B:66:0x015f, B:69:0x0190, B:70:0x0197), top: B:76:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0190 A[Catch: IllegalArgumentException -> 0x0198, IllegalArgumentException | IndexOutOfBoundsException -> 0x019a, TryCatch #2 {IllegalArgumentException | IndexOutOfBoundsException -> 0x019a, blocks: (B:3:0x0004, B:6:0x0011, B:8:0x001d, B:9:0x001f, B:11:0x002e, B:13:0x0034, B:17:0x0045, B:19:0x0055, B:20:0x0057, B:22:0x0063, B:23:0x0065, B:25:0x006b, B:29:0x0075, B:34:0x0085, B:36:0x008d, B:41:0x00c2, B:43:0x00c8, B:45:0x00ce, B:67:0x0161, B:51:0x00db, B:52:0x00f6, B:53:0x00f7, B:55:0x0103, B:58:0x010c, B:60:0x012b, B:63:0x013a, B:64:0x015c, B:66:0x015f, B:69:0x0190, B:70:0x0197), top: B:76:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Date parse(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        TimeZone timeZone;
        char charAt;
        try {
            int parseInt = parseInt(str, 0, 4);
            int i9 = checkOffset(str, 4, '-') ? 5 : 4;
            int i10 = i9 + 2;
            int parseInt2 = parseInt(str, i9, i10);
            if (checkOffset(str, i10, '-')) {
                i10++;
            }
            int i11 = i10 + 2;
            int parseInt3 = parseInt(str, i10, i11);
            boolean checkOffset = checkOffset(str, i11, 'T');
            if (!checkOffset && str.length() <= i11) {
                return new GregorianCalendar(parseInt, parseInt2 - 1, parseInt3).getTime();
            }
            if (checkOffset) {
                int i12 = i11 + 1;
                int i13 = i12 + 2;
                i7 = parseInt(str, i12, i13);
                if (checkOffset(str, i13, ':')) {
                    i13++;
                }
                int i14 = i13 + 2;
                i8 = parseInt(str, i13, i14);
                if (checkOffset(str, i14, ':')) {
                    i14++;
                }
                if (str.length() > i14 && (charAt = str.charAt(i14)) != 'Z' && charAt != '+' && charAt != '-') {
                    i6 = i14 + 2;
                    i4 = parseInt(str, i14, i6);
                    if (i4 > 59 && i4 < 63) {
                        i4 = 59;
                    }
                    if (checkOffset(str, i6, '.')) {
                        int i15 = i6 + 1;
                        int indexOfNonDigit = indexOfNonDigit(str, i15 + 1);
                        int min = Math.min(indexOfNonDigit, i15 + 3);
                        i5 = (int) (Math.pow(10.0d, 3 - (min - i15)) * parseInt(str, i15, min));
                        i6 = indexOfNonDigit;
                    } else {
                        i5 = 0;
                    }
                    if (str.length() <= i6) {
                        char charAt2 = str.charAt(i6);
                        if (charAt2 == 'Z') {
                            timeZone = TIMEZONE_Z;
                        } else {
                            if (charAt2 != '+' && charAt2 != '-') {
                                throw new IndexOutOfBoundsException("Invalid time zone indicator '" + charAt2 + "'");
                            }
                            String substring = str.substring(i6);
                            if (!"+0000".equals(substring) && !"+00:00".equals(substring)) {
                                String str2 = GMT_ID + substring;
                                TimeZone timeZone2 = TimeZone.getTimeZone(str2);
                                String id = timeZone2.getID();
                                if (!id.equals(str2) && !id.replace(":", "").equals(str2)) {
                                    throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str2 + " given, resolves to " + timeZone2.getID());
                                }
                                timeZone = timeZone2;
                            }
                            timeZone = TIMEZONE_Z;
                        }
                        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
                        gregorianCalendar.setLenient(false);
                        gregorianCalendar.set(1, parseInt);
                        gregorianCalendar.set(2, parseInt2 - 1);
                        gregorianCalendar.set(5, parseInt3);
                        gregorianCalendar.set(11, i7);
                        gregorianCalendar.set(12, i8);
                        gregorianCalendar.set(13, i4);
                        gregorianCalendar.set(14, i5);
                        return gregorianCalendar.getTime();
                    }
                    throw new IllegalArgumentException("No time zone indicator");
                }
                i = 0;
                i3 = i8;
                i2 = i7;
                i11 = i14;
            } else {
                i = 0;
                i2 = 0;
                i3 = 0;
            }
            i4 = 0;
            int i16 = i3;
            i5 = i;
            i6 = i11;
            i7 = i2;
            i8 = i16;
            if (str.length() <= i6) {
            }
        } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
            throw new JsonDataException(wo1.t("Not an RFC 3339 date: ", str), e);
        }
    }

    private static int parseInt(String str, int i, int i2) throws NumberFormatException {
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