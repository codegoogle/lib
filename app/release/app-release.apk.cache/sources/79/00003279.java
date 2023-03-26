package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.p7700g.p99005.ew2;
import com.p7700g.p99005.gx2;
import com.p7700g.p99005.jw2;
import com.p7700g.p99005.nx2;
import com.p7700g.p99005.px2;
import com.p7700g.p99005.qw2;
import com.p7700g.p99005.qx2;
import com.p7700g.p99005.uw2;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.zw2;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class DefaultDateTypeAdapter<T extends Date> extends TypeAdapter<T> {
    private static final String a = "DefaultDateTypeAdapter";
    private final b<T> b;
    private final List<DateFormat> c;

    /* loaded from: classes3.dex */
    public static abstract class b<T extends Date> {
        public static final b<Date> a = new a(Date.class);
        private final Class<T> b;

        /* loaded from: classes3.dex */
        public class a extends b<Date> {
            public a(Class cls) {
                super(cls);
            }

            @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.b
            public Date f(Date date) {
                return date;
            }
        }

        public b(Class<T> cls) {
            this.b = cls;
        }

        private final jw2 e(DefaultDateTypeAdapter<T> defaultDateTypeAdapter) {
            return TypeAdapters.b(this.b, defaultDateTypeAdapter);
        }

        public final jw2 a(int i) {
            return e(new DefaultDateTypeAdapter<>(this, i));
        }

        public final jw2 b(int i, int i2) {
            return e(new DefaultDateTypeAdapter<>(this, i, i2));
        }

        public final jw2 c(String str) {
            return e(new DefaultDateTypeAdapter<>(this, str));
        }

        public final jw2 d() {
            return e(new DefaultDateTypeAdapter<>(this, 2, 2));
        }

        public abstract T f(Date date);
    }

    private Date a(nx2 nx2Var) throws IOException {
        String W = nx2Var.W();
        synchronized (this.c) {
            for (DateFormat dateFormat : this.c) {
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
    public T read(nx2 nx2Var) throws IOException {
        if (nx2Var.Y() == px2.NULL) {
            nx2Var.P();
            return null;
        }
        return this.b.f(a(nx2Var));
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: c */
    public void write(qx2 qx2Var, Date date) throws IOException {
        String format;
        if (date == null) {
            qx2Var.w();
            return;
        }
        DateFormat dateFormat = this.c.get(0);
        synchronized (this.c) {
            format = dateFormat.format(date);
        }
        qx2Var.d1(format);
    }

    public String toString() {
        DateFormat dateFormat = this.c.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            StringBuilder G = wo1.G("DefaultDateTypeAdapter(");
            G.append(((SimpleDateFormat) dateFormat).toPattern());
            G.append(')');
            return G.toString();
        }
        StringBuilder G2 = wo1.G("DefaultDateTypeAdapter(");
        G2.append(dateFormat.getClass().getSimpleName());
        G2.append(')');
        return G2.toString();
    }

    private DefaultDateTypeAdapter(b<T> bVar, String str) {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.b = (b) qw2.b(bVar);
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (Locale.getDefault().equals(locale)) {
            return;
        }
        arrayList.add(new SimpleDateFormat(str));
    }

    private DefaultDateTypeAdapter(b<T> bVar, int i) {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.b = (b) qw2.b(bVar);
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateInstance(i, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateInstance(i));
        }
        if (uw2.e()) {
            arrayList.add(zw2.d(i));
        }
    }

    private DefaultDateTypeAdapter(b<T> bVar, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.b = (b) qw2.b(bVar);
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i, i2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (uw2.e()) {
            arrayList.add(zw2.e(i, i2));
        }
    }
}