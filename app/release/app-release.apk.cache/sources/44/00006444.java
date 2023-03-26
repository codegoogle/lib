package com.p7700g.p99005;

import com.squareup.moshi.adapters.Iso8601Utils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: HttpDateFormat.java */
/* loaded from: classes3.dex */
public class ws3 {
    private static final String a = "EEE, dd MMM yyyy HH:mm:ss zzz";
    private static final String b = "EEEE, dd-MMM-yy HH:mm:ss zzz";
    private static final String c = "EEE MMM d HH:mm:ss yyyy";
    private static ThreadLocal<List<SimpleDateFormat>> d = new a();

    /* compiled from: HttpDateFormat.java */
    /* loaded from: classes3.dex */
    public static class a extends ThreadLocal<List<SimpleDateFormat>> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public synchronized List<SimpleDateFormat> initialValue() {
            return ws3.b();
        }
    }

    private ws3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<SimpleDateFormat> b() {
        Locale locale = Locale.US;
        SimpleDateFormat[] simpleDateFormatArr = {new SimpleDateFormat(a, locale), new SimpleDateFormat(b, locale), new SimpleDateFormat(c, locale)};
        TimeZone timeZone = TimeZone.getTimeZone(Iso8601Utils.GMT_ID);
        simpleDateFormatArr[0].setTimeZone(timeZone);
        simpleDateFormatArr[1].setTimeZone(timeZone);
        simpleDateFormatArr[2].setTimeZone(timeZone);
        return Collections.unmodifiableList(Arrays.asList(simpleDateFormatArr));
    }

    public static List<SimpleDateFormat> c() {
        return d.get();
    }

    public static SimpleDateFormat d() {
        return d.get().get(0);
    }

    public static Date e(String str) throws ParseException {
        ParseException parseException = null;
        for (SimpleDateFormat simpleDateFormat : c()) {
            try {
                return simpleDateFormat.parse(str);
            } catch (ParseException e) {
                if (parseException == null) {
                    parseException = e;
                }
            }
        }
        throw parseException;
    }
}