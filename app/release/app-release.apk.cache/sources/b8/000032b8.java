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
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes3.dex */
public final class SqlTimeTypeAdapter extends TypeAdapter<Time> {
    public static final jw2 a = new jw2() { // from class: com.google.gson.internal.sql.SqlTimeTypeAdapter.1
        @Override // com.p7700g.p99005.jw2
        public <T> TypeAdapter<T> create(Gson gson, lx2<T> lx2Var) {
            if (lx2Var.f() == Time.class) {
                return new SqlTimeTypeAdapter();
            }
            return null;
        }
    };
    private final DateFormat b;

    @Override // com.google.gson.TypeAdapter
    /* renamed from: a */
    public Time read(nx2 nx2Var) throws IOException {
        Time time;
        if (nx2Var.Y() == px2.NULL) {
            nx2Var.P();
            return null;
        }
        String W = nx2Var.W();
        try {
            synchronized (this) {
                time = new Time(this.b.parse(W).getTime());
            }
            return time;
        } catch (ParseException e) {
            StringBuilder M = wo1.M("Failed parsing '", W, "' as SQL Time; at path ");
            M.append(nx2Var.m());
            throw new ew2(M.toString(), e);
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: b */
    public void write(qx2 qx2Var, Time time) throws IOException {
        String format;
        if (time == null) {
            qx2Var.w();
            return;
        }
        synchronized (this) {
            format = this.b.format((Date) time);
        }
        qx2Var.d1(format);
    }

    private SqlTimeTypeAdapter() {
        this.b = new SimpleDateFormat("hh:mm:ss a");
    }
}