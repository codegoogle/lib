package com.anythink.core.common.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.anythink.core.common.e.o;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class g extends com.anythink.core.common.c.a<o> {
    private static final String b = "com.anythink.core.common.c.g";
    private static g c;
    private int d;

    /* loaded from: classes2.dex */
    public static class a {
        public static final String a = "request_info";
        public static final String b = "id";
        public static final String c = "req_type";
        public static final String d = "req_url";
        public static final String e = "req_head";
        public static final String f = "req_content";
        public static final String g = "time";
        public static final String h = "CREATE TABLE IF NOT EXISTS request_info(id TEXT, req_type INTEGER, req_url TEXT, req_head TEXT, req_content TEXT, time INTEGER )";
    }

    private g(b bVar) {
        super(bVar);
        this.d = 1000;
    }

    public static g a(b bVar) {
        if (c == null) {
            c = new g(bVar);
        }
        return c;
    }

    private synchronized void d() {
        try {
            if (b() == null) {
                return;
            }
            b().delete(a.a, null, null);
        } catch (Exception unused) {
        }
    }

    public final synchronized int b(o oVar) {
        if (b() == null || oVar == null) {
            return -1;
        }
        try {
            return b().delete(a.a, "id=?", new String[]{oVar.a});
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008d, code lost:
        if (r1 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
        if (r1 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0096, code lost:
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a2, code lost:
        if (r1 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a9, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized List<o> c() {
        Cursor cursor;
        try {
            cursor = a().query(a.a, null, null, null, null, null, "time", "10");
            if (cursor != null) {
                try {
                    if (cursor.getCount() > 0) {
                        ArrayList arrayList = new ArrayList();
                        while (cursor.moveToNext()) {
                            o oVar = new o();
                            oVar.a = cursor.getString(cursor.getColumnIndex("id"));
                            oVar.b = cursor.getInt(cursor.getColumnIndex(a.c));
                            oVar.d = cursor.getString(cursor.getColumnIndex(a.d));
                            oVar.c = cursor.getString(cursor.getColumnIndex(a.e));
                            oVar.e = cursor.getString(cursor.getColumnIndex(a.f));
                            oVar.f = cursor.getLong(cursor.getColumnIndex("time"));
                            arrayList.add(oVar);
                        }
                        cursor.close();
                        cursor.close();
                        return arrayList;
                    }
                } catch (Exception unused) {
                } catch (OutOfMemoryError unused2) {
                    System.gc();
                } catch (Throwable unused3) {
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Exception unused4) {
            cursor = null;
        } catch (OutOfMemoryError unused5) {
            cursor = null;
        } catch (Throwable unused6) {
            cursor = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0036, code lost:
        if (r3 == null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized long a(o oVar) {
        Cursor cursor;
        if (b() == null) {
            return -1L;
        }
        Cursor cursor2 = null;
        try {
            cursor = a().query(a.a, null, null, null, null, null, null);
        } catch (Exception unused) {
            cursor = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (cursor.getCount() >= this.d) {
                d();
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
            cursor2 = cursor;
            if (cursor2 != null) {
                try {
                    cursor2.close();
                } catch (Exception unused3) {
                }
            }
            throw th;
        }
        try {
            cursor.close();
        } catch (Exception unused4) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("id", oVar.a);
                contentValues.put(a.c, Integer.valueOf(oVar.b));
                contentValues.put(a.d, oVar.d);
                contentValues.put(a.e, oVar.c);
                contentValues.put(a.f, oVar.e);
                contentValues.put("time", Long.valueOf(oVar.f));
                return b().insert(a.a, null, contentValues);
            } catch (Exception unused5) {
                return -1L;
            }
        }
    }
}