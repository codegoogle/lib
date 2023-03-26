package org.xbill.DNS;

import com.p7700g.p99005.md2;
import com.p7700g.p99005.wo1;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* loaded from: classes4.dex */
public final class FormattedTime {
    private static NumberFormat w2;
    private static NumberFormat w4;

    static {
        DecimalFormat decimalFormat = new DecimalFormat();
        w2 = decimalFormat;
        decimalFormat.setMinimumIntegerDigits(2);
        DecimalFormat decimalFormat2 = new DecimalFormat();
        w4 = decimalFormat2;
        decimalFormat2.setMinimumIntegerDigits(4);
        w4.setGroupingUsed(false);
    }

    private FormattedTime() {
    }

    public static String format(Date date) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone(md2.a));
        StringBuffer stringBuffer = new StringBuffer();
        gregorianCalendar.setTime(date);
        stringBuffer.append(w4.format(gregorianCalendar.get(1)));
        stringBuffer.append(w2.format(gregorianCalendar.get(2) + 1));
        stringBuffer.append(w2.format(gregorianCalendar.get(5)));
        stringBuffer.append(w2.format(gregorianCalendar.get(11)));
        stringBuffer.append(w2.format(gregorianCalendar.get(12)));
        stringBuffer.append(w2.format(gregorianCalendar.get(13)));
        return stringBuffer.toString();
    }

    public static Date parse(String str) throws TextParseException {
        if (str.length() == 14) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone(md2.a));
            gregorianCalendar.clear();
            try {
                gregorianCalendar.set(Integer.parseInt(str.substring(0, 4)), Integer.parseInt(str.substring(4, 6)) - 1, Integer.parseInt(str.substring(6, 8)), Integer.parseInt(str.substring(8, 10)), Integer.parseInt(str.substring(10, 12)), Integer.parseInt(str.substring(12, 14)));
                return gregorianCalendar.getTime();
            } catch (NumberFormatException unused) {
                throw new TextParseException(wo1.t("Invalid time encoding: ", str));
            }
        }
        throw new TextParseException(wo1.t("Invalid time encoding: ", str));
    }
}