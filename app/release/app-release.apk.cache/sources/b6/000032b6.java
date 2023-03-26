package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.p7700g.p99005.ew2;
import com.p7700g.p99005.jw2;
import com.p7700g.p99005.lx2;
import com.p7700g.p99005.nx2;
import com.p7700g.p99005.px2;
import com.p7700g.p99005.qx2;
import com.p7700g.p99005.wo1;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* loaded from: classes3.dex */
public final class SqlDateTypeAdapter extends TypeAdapter<Date> {
    public static final jw2 a = new jw2() { // from class: com.google.gson.internal.sql.SqlDateTypeAdapter.1
        @Override // com.p7700g.p99005.jw2
        public <T> TypeAdapter<T> create(Gson gson, lx2<T> lx2Var) {
            if (lx2Var.f() == Date.class) {
                return new SqlDateTypeAdapter();
            }
            return null;
        }
    };
    private final DateFormat b;

    @Override // com.google.gson.TypeAdapter
    /* renamed from: a */
    public Date read(nx2 nx2Var) throws IOException {
        java.util.Date parse;
        if (nx2Var.Y() == px2.NULL) {
            nx2Var.P();
            return null;
        }
        String W = nx2Var.W();
        try {
            synchronized (this) {
                parse = this.b.parse(W);
            }
            return new Date(parse.getTime());
        } catch (ParseException e) {
            StringBuilder M = wo1.M("Failed parsing '", W, "' as SQL Date; at path ");
            M.append(nx2Var.m());
            throw new ew2(M.toString(), e);
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: b */
    public void write(qx2 qx2Var, Date date) throws IOException {
        String format;
        if (date == null) {
            qx2Var.w();
            return;
        }
        synchronized (this) {
            format = this.b.format((java.util.Date) date);
        }
        qx2Var.d1(format);
    }

    private SqlDateTypeAdapter() {
        this.b = new SimpleDateFormat("MMM d, yyyy");
    }
}