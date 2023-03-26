package com.anythink.basead.b;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class c {
    private static c a;
    private Context b;

    /* loaded from: classes2.dex */
    public static class a {
        public static final String a = "my_offer_cap_pacing";
        public static final String b = "offer_id";
        public static final String c = "offer_cap";
        public static final String d = "offer_pacing";
        public static final String e = "show_num";
        public static final String f = "show_time";
        public static final String g = "record_date";
        public static final String h = "CREATE TABLE IF NOT EXISTS my_offer_cap_pacing (offer_id TEXT,offer_cap INTEGER,offer_pacing INTEGER,show_num INTEGER,show_time INTEGER,record_date INTEGER )";
    }

    private c(Context context) {
        this.b = context;
    }

    public static c a(Context context) {
        if (a == null) {
            a = new c(context);
        }
        return a;
    }

    private synchronized boolean d(String str) {
        Cursor query = b.a(this.b).getReadableDatabase().query(a.a, new String[]{"offer_id"}, "offer_id=?", new String[]{str}, null, null, null);
        if (query != null && query.getCount() > 0) {
            query.close();
            return true;
        }
        if (query != null) {
            query.close();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
        if (r11 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
        if (r11 == null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
        if (r11 == null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0063, code lost:
        if (r11 == null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006a, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized List<com.anythink.basead.c.c> b(String str) {
        Cursor cursor;
        try {
            cursor = b.a(this.b).getReadableDatabase().query(a.a, null, "offer_cap <= show_num AND record_date=? AND offer_cap !=?", new String[]{str, "-1"}, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.getCount() > 0) {
                        ArrayList arrayList = new ArrayList();
                        while (cursor.moveToNext()) {
                            arrayList.add(a(cursor));
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
        } catch (Exception unused4) {
            cursor = null;
        } catch (OutOfMemoryError unused5) {
            cursor = null;
        } catch (Throwable unused6) {
            cursor = null;
        }
    }

    public final synchronized void c(String str) {
        String str2;
        synchronized (this) {
            try {
                str2 = "record_date != '" + str + "'";
            } catch (Exception unused) {
            }
            if (b.a(this.b).getWritableDatabase() == null) {
                return;
            }
            b.a(this.b).getWritableDatabase().delete(a.a, str2, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
        if (r11 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
        if (r11 == null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
        if (r11 == null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0052, code lost:
        if (r11 == null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0059, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized com.anythink.basead.c.c a(String str) {
        Cursor cursor;
        try {
            cursor = b.a(this.b).getReadableDatabase().query(a.a, null, "offer_id=?", new String[]{str}, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.getCount() > 0) {
                        cursor.moveToNext();
                        com.anythink.basead.c.c a2 = a(cursor);
                        cursor.close();
                        cursor.close();
                        return a2;
                    }
                } catch (Exception unused) {
                } catch (OutOfMemoryError unused2) {
                    System.gc();
                } catch (Throwable unused3) {
                }
            }
        } catch (Exception unused4) {
            cursor = null;
        } catch (OutOfMemoryError unused5) {
            cursor = null;
        } catch (Throwable unused6) {
            cursor = null;
        }
    }

    public final synchronized long a(com.anythink.basead.c.c cVar) {
        synchronized (this) {
            if (cVar == null) {
                return 0L;
            }
            try {
                if (b.a(this.b).getWritableDatabase() == null) {
                    return -1L;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("offer_id", cVar.a);
                contentValues.put(a.e, Integer.valueOf(cVar.d));
                contentValues.put("show_time", Long.valueOf(cVar.e));
                contentValues.put(a.g, cVar.f);
                contentValues.put(a.c, Integer.valueOf(cVar.b));
                contentValues.put(a.d, Long.valueOf(cVar.c));
                if (d(cVar.a)) {
                    return b.a(this.b).getWritableDatabase().update(a.a, contentValues, "offer_id = '" + cVar.a + "'", null);
                }
                return b.a(this.b).getWritableDatabase().insert(a.a, null, contentValues);
            } catch (Exception e) {
                e.printStackTrace();
                return -1L;
            }
        }
    }

    private static com.anythink.basead.c.c a(Cursor cursor) {
        com.anythink.basead.c.c cVar = new com.anythink.basead.c.c();
        cVar.a = cursor.getString(cursor.getColumnIndex("offer_id"));
        cVar.d = cursor.getInt(cursor.getColumnIndex(a.e));
        cVar.e = cursor.getLong(cursor.getColumnIndex("show_time"));
        cVar.f = cursor.getString(cursor.getColumnIndex(a.g));
        cVar.b = cursor.getInt(cursor.getColumnIndex(a.c));
        cVar.c = cursor.getLong(cursor.getColumnIndex(a.d));
        return cVar;
    }
}