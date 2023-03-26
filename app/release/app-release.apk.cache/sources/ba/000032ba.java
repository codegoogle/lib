package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.p7700g.p99005.jw2;
import com.p7700g.p99005.lx2;
import com.p7700g.p99005.nx2;
import com.p7700g.p99005.qx2;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

/* loaded from: classes3.dex */
public class SqlTimestampTypeAdapter extends TypeAdapter<Timestamp> {
    public static final jw2 a = new jw2() { // from class: com.google.gson.internal.sql.SqlTimestampTypeAdapter.1
        @Override // com.p7700g.p99005.jw2
        public <T> TypeAdapter<T> create(Gson gson, lx2<T> lx2Var) {
            if (lx2Var.f() == Timestamp.class) {
                return new SqlTimestampTypeAdapter(gson.q(Date.class));
            }
            return null;
        }
    };
    private final TypeAdapter<Date> b;

    @Override // com.google.gson.TypeAdapter
    /* renamed from: a */
    public Timestamp read(nx2 nx2Var) throws IOException {
        Date read = this.b.read(nx2Var);
        if (read != null) {
            return new Timestamp(read.getTime());
        }
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: b */
    public void write(qx2 qx2Var, Timestamp timestamp) throws IOException {
        this.b.write(qx2Var, timestamp);
    }

    private SqlTimestampTypeAdapter(TypeAdapter<Date> typeAdapter) {
        this.b = typeAdapter;
    }
}