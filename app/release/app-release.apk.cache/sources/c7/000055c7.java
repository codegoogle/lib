package com.p7700g.p99005;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.p42;
import com.p7700g.p99005.u92;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: SQLiteEventStore.java */
@rl4
@s2
/* loaded from: classes2.dex */
public class p92 implements i92, u92 {
    private static final String s = "SQLiteEventStore";
    public static final int t = 16;
    private static final int u = 50;
    private static final b32 v = b32.b("proto");
    private final r92 w;
    private final v92 x;
    private final v92 y;
    private final j92 z;

    /* compiled from: SQLiteEventStore.java */
    /* loaded from: classes2.dex */
    public interface b<T, U> {
        U apply(T t);
    }

    /* compiled from: SQLiteEventStore.java */
    /* loaded from: classes2.dex */
    public static class c {
        public final String a;
        public final String b;

        private c(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    /* compiled from: SQLiteEventStore.java */
    /* loaded from: classes2.dex */
    public interface d<T> {
        T a();
    }

    @ml4
    public p92(@ca2 v92 v92Var, @w92 v92 v92Var2, j92 j92Var, r92 r92Var) {
        this.w = r92Var;
        this.x = v92Var;
        this.y = v92Var2;
        this.z = j92Var;
    }

    public static /* synthetic */ Long A(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    public static /* synthetic */ Object D1(String str, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    public static /* synthetic */ Long E(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    /* renamed from: F */
    public /* synthetic */ Boolean K(v42 v42Var, SQLiteDatabase sQLiteDatabase) {
        Long k = k(sQLiteDatabase, v42Var);
        if (k == null) {
            return Boolean.FALSE;
        }
        return (Boolean) d2(h().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{k.toString()}), e92.a);
    }

    public static /* synthetic */ Object J1(long j, v42 v42Var, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{v42Var.b(), String.valueOf(ea2.a(v42Var.d()))}) < 1) {
            contentValues.put("backend_name", v42Var.b());
            contentValues.put("priority", Integer.valueOf(ea2.a(v42Var.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    private List<o92> K1(SQLiteDatabase sQLiteDatabase, final v42 v42Var) {
        final ArrayList arrayList = new ArrayList();
        Long k = k(sQLiteDatabase, v42Var);
        if (k == null) {
            return arrayList;
        }
        d2(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", CallMraidJS.k}, "context_id = ?", new String[]{k.toString()}, null, null, null, String.valueOf(this.z.d())), new b() { // from class: com.p7700g.p99005.y82
            @Override // com.p7700g.p99005.p92.b
            public final Object apply(Object obj) {
                p92.this.Z(arrayList, v42Var, (Cursor) obj);
                return null;
            }
        });
        return arrayList;
    }

    public static /* synthetic */ List P(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(v42.a().b(cursor.getString(1)).d(ea2.b(cursor.getInt(2))).c(Y1(cursor.getString(3))).a());
        }
        return arrayList;
    }

    private Map<Long, Set<c>> T1(SQLiteDatabase sQLiteDatabase, List<o92> list) {
        final HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).c());
            if (i < list.size() - 1) {
                sb.append(e14.f0);
            }
        }
        sb.append(')');
        d2(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null), new b() { // from class: com.p7700g.p99005.u82
            @Override // com.p7700g.p99005.p92.b
            public final Object apply(Object obj) {
                p92.x0(hashMap, (Cursor) obj);
                return null;
            }
        });
        return hashMap;
    }

    public static /* synthetic */ List U(SQLiteDatabase sQLiteDatabase) {
        return (List) d2(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), s82.a);
    }

    private /* synthetic */ List W(v42 v42Var, SQLiteDatabase sQLiteDatabase) {
        List<o92> K1 = K1(sQLiteDatabase, v42Var);
        return q(K1, T1(sQLiteDatabase, K1));
    }

    /* renamed from: X0 */
    public /* synthetic */ Long c1(v42 v42Var, p42 p42Var, SQLiteDatabase sQLiteDatabase) {
        if (m()) {
            return -1L;
        }
        long e = e(sQLiteDatabase, v42Var);
        int e2 = this.z.e();
        byte[] a2 = p42Var.e().a();
        boolean z = a2.length <= e2;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(e));
        contentValues.put("transport_name", p42Var.l());
        contentValues.put("timestamp_ms", Long.valueOf(p42Var.f()));
        contentValues.put("uptime_ms", Long.valueOf(p42Var.m()));
        contentValues.put("payload_encoding", p42Var.e().b().a());
        contentValues.put("code", p42Var.d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put(CallMraidJS.k, Boolean.valueOf(z));
        contentValues.put("payload", z ? a2 : new byte[0]);
        long insert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z) {
            int ceil = (int) Math.ceil(a2.length / e2);
            for (int i = 1; i <= ceil; i++) {
                byte[] copyOfRange = Arrays.copyOfRange(a2, (i - 1) * e2, Math.min(i * e2, a2.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry<String, String> entry : p42Var.i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put("name", entry.getKey());
            contentValues3.put("value", entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    private /* synthetic */ Object Y(List list, v42 v42Var, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            boolean z = cursor.getInt(7) != 0;
            p42.a k = p42.a().j(cursor.getString(1)).i(cursor.getLong(2)).k(cursor.getLong(3));
            if (z) {
                k.h(new o42(b2(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                k.h(new o42(b2(cursor.getString(4)), Z1(j)));
            }
            if (!cursor.isNull(6)) {
                k.g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(o92.a(j, v42Var, k.d()));
        }
        return null;
    }

    private static byte[] Y1(@z1 String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    private byte[] Z1(long j) {
        return (byte[]) d2(h().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num"), k82.a);
    }

    private <T> T a2(d<T> dVar, b<Throwable, T> bVar) {
        long a2 = this.y.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e) {
                if (this.y.a() >= this.z.b() + a2) {
                    return bVar.apply(e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    private static b32 b2(@z1 String str) {
        if (str == null) {
            return v;
        }
        return b32.b(str);
    }

    private static String c2(Iterable<o92> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<o92> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().c());
            if (it.hasNext()) {
                sb.append(e14.f0);
            }
        }
        sb.append(')');
        return sb.toString();
    }

    private void d(final SQLiteDatabase sQLiteDatabase) {
        a2(new d() { // from class: com.p7700g.p99005.p82
            @Override // com.p7700g.p99005.p92.d
            public final Object a() {
                p92.v(sQLiteDatabase);
                return null;
            }
        }, m82.a);
    }

    public static /* synthetic */ byte[] d1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i += blob.length;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            byte[] bArr2 = (byte[]) arrayList.get(i3);
            System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
            i2 += bArr2.length;
        }
        return bArr;
    }

    @r2
    public static <T> T d2(Cursor cursor, b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    private long e(SQLiteDatabase sQLiteDatabase, v42 v42Var) {
        Long k = k(sQLiteDatabase, v42Var);
        if (k != null) {
            return k.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", v42Var.b());
        contentValues.put("priority", Integer.valueOf(ea2.a(v42Var.d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (v42Var.c() != null) {
            contentValues.put("extras", Base64.encodeToString(v42Var.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    private long j() {
        return h().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    @z1
    private Long k(SQLiteDatabase sQLiteDatabase, v42 v42Var) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(v42Var.b(), String.valueOf(ea2.a(v42Var.d()))));
        if (v42Var.c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(v42Var.c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) d2(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), v82.a);
    }

    private boolean m() {
        return j() * s0() >= this.z.f();
    }

    private List<o92> q(List<o92> list, Map<Long, Set<c>> map) {
        ListIterator<o92> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            o92 next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.c()))) {
                p42.a n = next.b().n();
                for (c cVar : map.get(Long.valueOf(next.c()))) {
                    n.c(cVar.a, cVar.b);
                }
                listIterator.set(o92.a(next.c(), next.d(), n.d()));
            }
        }
        return list;
    }

    public static /* synthetic */ Integer r(long j, SQLiteDatabase sQLiteDatabase) {
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", new String[]{String.valueOf(j)}));
    }

    public static /* synthetic */ Object s(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.delete("events", null, new String[0]);
        sQLiteDatabase.delete("transport_contexts", null, new String[0]);
        return null;
    }

    private long s0() {
        return h().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    public static /* synthetic */ Object v(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    public static /* synthetic */ Object w(Throwable th) {
        throw new t92("Timed out while trying to acquire the lock.", th);
    }

    public static /* synthetic */ Object x0(Map map, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j), set);
            }
            set.add(new c(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    public static /* synthetic */ SQLiteDatabase z(Throwable th) {
        throw new t92("Timed out while trying to open db.", th);
    }

    @Override // com.p7700g.p99005.i92
    public long A1(v42 v42Var) {
        return ((Long) d2(h().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{v42Var.b(), String.valueOf(ea2.a(v42Var.d()))}), w82.a)).longValue();
    }

    @Override // com.p7700g.p99005.i92
    public boolean G1(final v42 v42Var) {
        return ((Boolean) l(new b() { // from class: com.p7700g.p99005.r82
            @Override // com.p7700g.p99005.p92.b
            public final Object apply(Object obj) {
                return p92.this.K(v42Var, (SQLiteDatabase) obj);
            }
        })).booleanValue();
    }

    @Override // com.p7700g.p99005.i92
    public void L1(Iterable<o92> iterable) {
        if (iterable.iterator().hasNext()) {
            StringBuilder G = wo1.G("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ");
            G.append(c2(iterable));
            final String sb = G.toString();
            l(new b() { // from class: com.p7700g.p99005.o82
                @Override // com.p7700g.p99005.p92.b
                public final Object apply(Object obj) {
                    p92.D1(sb, (SQLiteDatabase) obj);
                    return null;
                }
            });
        }
    }

    @Override // com.p7700g.p99005.i92
    public Iterable<o92> T(final v42 v42Var) {
        return (Iterable) l(new b() { // from class: com.p7700g.p99005.t82
            @Override // com.p7700g.p99005.p92.b
            public final Object apply(Object obj) {
                return p92.this.X(v42Var, (SQLiteDatabase) obj);
            }
        });
    }

    public /* synthetic */ List X(v42 v42Var, SQLiteDatabase sQLiteDatabase) {
        List<o92> K1 = K1(sQLiteDatabase, v42Var);
        return q(K1, T1(sQLiteDatabase, K1));
    }

    public /* synthetic */ Object Z(List list, v42 v42Var, Cursor cursor) {
        Y(list, v42Var, cursor);
        return null;
    }

    @Override // com.p7700g.p99005.u92
    public <T> T a(u92.a<T> aVar) {
        SQLiteDatabase h = h();
        d(h);
        try {
            T w0 = aVar.w0();
            h.setTransactionSuccessful();
            return w0;
        } finally {
            h.endTransaction();
        }
    }

    @i2({i2.a.TESTS})
    public void b() {
        l(z82.a);
    }

    @Override // com.p7700g.p99005.i92
    public void c0(final v42 v42Var, final long j) {
        l(new b() { // from class: com.p7700g.p99005.q82
            @Override // com.p7700g.p99005.p92.b
            public final Object apply(Object obj) {
                p92.J1(j, v42Var, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.w.close();
    }

    @r2
    public long f() {
        return j() * s0();
    }

    @r2
    public SQLiteDatabase h() {
        final r92 r92Var = this.w;
        Objects.requireNonNull(r92Var);
        return (SQLiteDatabase) a2(new d() { // from class: com.p7700g.p99005.f92
            @Override // com.p7700g.p99005.p92.d
            public final Object a() {
                return r92.this.getWritableDatabase();
            }
        }, j82.a);
    }

    @Override // com.p7700g.p99005.i92
    public Iterable<v42> j0() {
        return (Iterable) l(x82.a);
    }

    @r2
    public <T> T l(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase h = h();
        h.beginTransaction();
        try {
            T apply = bVar.apply(h);
            h.setTransactionSuccessful();
            return apply;
        } finally {
            h.endTransaction();
        }
    }

    @Override // com.p7700g.p99005.i92
    public int u() {
        final long a2 = this.x.a() - this.z.c();
        return ((Integer) l(new b() { // from class: com.p7700g.p99005.l82
            @Override // com.p7700g.p99005.p92.b
            public final Object apply(Object obj) {
                return p92.r(a2, (SQLiteDatabase) obj);
            }
        })).intValue();
    }

    @Override // com.p7700g.p99005.i92
    @z1
    public o92 v1(final v42 v42Var, final p42 p42Var) {
        d72.d(s, "Storing event with priority=%s, name=%s for destination %s", v42Var.d(), p42Var.l(), v42Var.b());
        long longValue = ((Long) l(new b() { // from class: com.p7700g.p99005.n82
            @Override // com.p7700g.p99005.p92.b
            public final Object apply(Object obj) {
                return p92.this.c1(v42Var, p42Var, (SQLiteDatabase) obj);
            }
        })).longValue();
        if (longValue < 1) {
            return null;
        }
        return o92.a(longValue, v42Var, p42Var);
    }

    @Override // com.p7700g.p99005.i92
    public void x(Iterable<o92> iterable) {
        if (iterable.iterator().hasNext()) {
            StringBuilder G = wo1.G("DELETE FROM events WHERE _id in ");
            G.append(c2(iterable));
            h().compileStatement(G.toString()).execute();
        }
    }
}