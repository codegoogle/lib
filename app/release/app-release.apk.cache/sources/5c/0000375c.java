package com.microsoft.appcenter.ingestion.models.json;

import com.p7700g.p99005.md2;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class JSONDateUtils {
    private static final ThreadLocal<DateFormat> DATE_FORMAT = new ThreadLocal<DateFormat>() { // from class: com.microsoft.appcenter.ingestion.models.json.JSONDateUtils.1
        @Override // java.lang.ThreadLocal
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(md2.a));
            return simpleDateFormat;
        }
    };

    private static void checkNull(Object obj) throws JSONException {
        if (obj == null) {
            throw new JSONException("date cannot be null");
        }
    }

    public static Date toDate(String str) throws JSONException {
        checkNull(str);
        try {
            return DATE_FORMAT.get().parse(str);
        } catch (ParseException e) {
            throw new JSONException(e.getMessage());
        }
    }

    public static String toString(Date date) throws JSONException {
        checkNull(date);
        return DATE_FORMAT.get().format(date);
    }
}