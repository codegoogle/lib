package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.p7700g.p99005.ew2;
import com.p7700g.p99005.gx2;
import com.p7700g.p99005.jw2;
import com.p7700g.p99005.lx2;
import com.p7700g.p99005.nx2;
import com.p7700g.p99005.px2;
import com.p7700g.p99005.qx2;
import com.p7700g.p99005.uw2;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.zw2;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class DateTypeAdapter extends TypeAdapter<Date> {
    public static final jw2 a = new jw2() { // from class: com.google.gson.internal.bind.DateTypeAdapter.1
        @Override // com.p7700g.p99005.jw2
        public <T> TypeAdapter<T> create(Gson gson, lx2<T> lx2Var) {
            if (lx2Var.f() == Date.class) {
                return new DateTypeAdapter();
            }
            return null;
        }
    };
    private final List<DateFormat> b;

    public DateTypeAdapter() {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (uw2.e()) {
            arrayList.add(zw2.e(2, 2));
        }
    }

    private Date a(nx2 nx2Var) throws IOException {
        String W = nx2Var.W();
        synchronized (this.b) {
            for (DateFormat dateFormat : this.b) {
                try {
                    return dateFormat.parse(W);
                } catch (ParseException unused) {
                }
            }
            try {
                return gx2.g(W, new ParsePosition(0));
            } catch (ParseException e) {
                StringBuilder M = wo1.M("Failed parsing '", W, "' as Date; at path ");
                M.append(nx2Var.m());
                throw new ew2(M.toString(), e);
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: b */
    public Date read(nx2 nx2Var) throws IOException {
        if (nx2Var.Y() == px2.NULL) {
            nx2Var.P();
            return null;
        }
        return a(nx2Var);
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: c */
    public void write(qx2 qx2Var, Date date) throws IOException {
        String format;
        if (date == null) {
            qx2Var.w();
            return;
        }
        DateFormat dateFormat = this.b.get(0);
        synchronized (this.b) {
            format = dateFormat.format(date);
        }
        qx2Var.d1(format);
    }
}