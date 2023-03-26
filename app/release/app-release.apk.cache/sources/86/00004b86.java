package com.p7700g.p99005;

import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.internal.sql.SqlDateTypeAdapter;
import com.google.gson.internal.sql.SqlTimeTypeAdapter;
import com.google.gson.internal.sql.SqlTimestampTypeAdapter;
import java.sql.Timestamp;
import java.util.Date;

/* compiled from: SqlTypesSupport.java */
/* loaded from: classes3.dex */
public final class jx2 {
    public static final boolean a;
    public static final DefaultDateTypeAdapter.b<? extends Date> b;
    public static final DefaultDateTypeAdapter.b<? extends Date> c;
    public static final jw2 d;
    public static final jw2 e;
    public static final jw2 f;

    /* compiled from: SqlTypesSupport.java */
    /* loaded from: classes3.dex */
    public class a extends DefaultDateTypeAdapter.b<java.sql.Date> {
        public a(Class cls) {
            super(cls);
        }

        @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.b
        /* renamed from: g */
        public java.sql.Date f(Date date) {
            return new java.sql.Date(date.getTime());
        }
    }

    /* compiled from: SqlTypesSupport.java */
    /* loaded from: classes3.dex */
    public class b extends DefaultDateTypeAdapter.b<Timestamp> {
        public b(Class cls) {
            super(cls);
        }

        @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.b
        /* renamed from: g */
        public Timestamp f(Date date) {
            return new Timestamp(date.getTime());
        }
    }

    static {
        boolean z;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        a = z;
        if (z) {
            b = new a(java.sql.Date.class);
            c = new b(Timestamp.class);
            d = SqlDateTypeAdapter.a;
            e = SqlTimeTypeAdapter.a;
            f = SqlTimestampTypeAdapter.a;
            return;
        }
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
    }

    private jx2() {
    }
}