package com.anythink.core.common.c;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.anythink.core.common.e.ab;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class j extends com.anythink.core.common.c.a<ab> {
    private static j c;
    private final String b;

    /* loaded from: classes2.dex */
    public static class a {
        public static final String a = "placement_ad_impression";
        public static final String b = "format";
        public static final String c = "placement_id";
        public static final String d = "adsource_id";
        public static final String e = "hour_time";
        public static final String f = "hour_imp";
        public static final String g = "date_time";
        public static final String h = "date_imp";
        public static final String i = "show_time";
        public static final String j = "CREATE TABLE IF NOT EXISTS placement_ad_impression(format INTEGER ,placement_id TEXT ,adsource_id TEXT ,hour_time TEXT ,hour_imp INTEGER ,date_time TEXT ,date_imp INTEGER , show_time INTEGER)";
    }

    private j(b bVar) {
        super(bVar);
        this.b = j.class.getName();
    }

    public static j a(b bVar) {
        if (c == null) {
            c = new j(bVar);
        }
        return c;
    }

    private boolean b(String str) {
        Cursor query = a().query(a.a, new String[]{"adsource_id"}, "adsource_id=?", new String[]{str}, "adsource_id", null, null);
        if (query != null && query.getCount() > 0) {
            query.close();
            return true;
        }
        if (query != null) {
            query.close();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ec, code lost:
        if (r1 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ee, code lost:
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f2, code lost:
        if (r1 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f8, code lost:
        if (r1 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0102, code lost:
        if (r1 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0106, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized Map<String, ab> a(int i, String str, String str2) {
        HashMap hashMap = new HashMap();
        Cursor cursor = null;
        try {
            cursor = a().query(a.a, null, "format=?", new String[]{String.valueOf(i)}, null, null, null);
            if (cursor != null && cursor.getCount() > 0) {
                while (cursor.moveToNext()) {
                    String string = cursor.getString(cursor.getColumnIndex(a.c));
                    ab abVar = (ab) hashMap.get(string);
                    if (abVar == null) {
                        abVar = new ab();
                        abVar.b = string;
                        abVar.a = cursor.getInt(cursor.getColumnIndex("format"));
                        abVar.f = new ConcurrentHashMap<>();
                        hashMap.put(string, abVar);
                    }
                    ab.a aVar = new ab.a();
                    aVar.a = cursor.getString(cursor.getColumnIndex("adsource_id"));
                    aVar.b = cursor.getString(cursor.getColumnIndex(a.e));
                    aVar.c = cursor.getString(cursor.getColumnIndex(a.g));
                    if (!TextUtils.equals(aVar.b, str2)) {
                        aVar.e = 0;
                    } else {
                        aVar.e = cursor.getInt(cursor.getColumnIndex(a.f));
                    }
                    abVar.d += aVar.e;
                    if (!TextUtils.equals(aVar.c, str)) {
                        aVar.d = 0;
                    } else {
                        aVar.d = cursor.getInt(cursor.getColumnIndex(a.h));
                    }
                    abVar.c += aVar.d;
                    long j = cursor.getLong(cursor.getColumnIndex("show_time"));
                    aVar.f = j;
                    if (j >= abVar.e) {
                        abVar.e = j;
                    }
                    abVar.f.put(aVar.a, aVar);
                }
                cursor.close();
                cursor.close();
                return hashMap;
            }
        } catch (Exception unused) {
        } catch (OutOfMemoryError unused2) {
            System.gc();
        } catch (Throwable unused3) {
        }
    }

    private static ab.a b(Cursor cursor, String str, String str2) {
        if (cursor == null || cursor.getCount() <= 0) {
            return null;
        }
        cursor.moveToNext();
        ab.a aVar = new ab.a();
        aVar.a = cursor.getString(cursor.getColumnIndex("adsource_id"));
        aVar.b = cursor.getString(cursor.getColumnIndex(a.e));
        aVar.c = cursor.getString(cursor.getColumnIndex(a.g));
        if (!TextUtils.equals(aVar.b, str2)) {
            aVar.e = 0;
        } else {
            aVar.e = cursor.getInt(cursor.getColumnIndex(a.f));
        }
        if (!TextUtils.equals(aVar.c, str)) {
            aVar.d = 0;
        } else {
            aVar.d = cursor.getInt(cursor.getColumnIndex(a.h));
        }
        aVar.f = cursor.getLong(cursor.getColumnIndex("show_time"));
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00dd, code lost:
        if (r11 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e4, code lost:
        if (r11 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e6, code lost:
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f2, code lost:
        if (r11 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f9, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized ab a(String str, String str2, String str3) {
        Cursor cursor;
        ab abVar = null;
        try {
            cursor = a().query(a.a, null, "placement_id=?", new String[]{str}, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.getCount() > 0) {
                        ab abVar2 = new ab();
                        abVar2.f = new ConcurrentHashMap<>();
                        while (cursor.moveToNext()) {
                            abVar2.a = cursor.getInt(cursor.getColumnIndex("format"));
                            abVar2.b = cursor.getString(cursor.getColumnIndex(a.c));
                            ab.a aVar = new ab.a();
                            aVar.a = cursor.getString(cursor.getColumnIndex("adsource_id"));
                            aVar.b = cursor.getString(cursor.getColumnIndex(a.e));
                            aVar.c = cursor.getString(cursor.getColumnIndex(a.g));
                            if (!TextUtils.equals(aVar.b, str3)) {
                                aVar.e = 0;
                            } else {
                                aVar.e = cursor.getInt(cursor.getColumnIndex(a.f));
                            }
                            abVar2.d += aVar.e;
                            if (!TextUtils.equals(aVar.c, str2)) {
                                aVar.d = 0;
                            } else {
                                aVar.d = cursor.getInt(cursor.getColumnIndex(a.h));
                            }
                            abVar2.c += aVar.d;
                            long j = cursor.getLong(cursor.getColumnIndex("show_time"));
                            aVar.f = j;
                            if (j >= abVar2.e) {
                                abVar2.e = j;
                            }
                            abVar2.f.put(aVar.a, aVar);
                        }
                        cursor.close();
                        abVar = abVar2;
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
            return abVar;
        } catch (Exception unused4) {
            cursor = null;
        } catch (OutOfMemoryError unused5) {
            cursor = null;
        } catch (Throwable unused6) {
            cursor = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0097, code lost:
        if (r11 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009e, code lost:
        if (r11 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a0, code lost:
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ac, code lost:
        if (r11 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b3, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized ab.a a(String str, String str2, String str3, String str4) {
        Cursor cursor;
        ab.a aVar = null;
        try {
            cursor = a().query(a.a, null, "adsource_id=? AND placement_id=?", new String[]{str2, str}, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.getCount() > 0) {
                        cursor.moveToNext();
                        ab.a aVar2 = new ab.a();
                        aVar2.a = cursor.getString(cursor.getColumnIndex("adsource_id"));
                        aVar2.b = cursor.getString(cursor.getColumnIndex(a.e));
                        aVar2.c = cursor.getString(cursor.getColumnIndex(a.g));
                        if (!TextUtils.equals(aVar2.b, str4)) {
                            aVar2.e = 0;
                        } else {
                            aVar2.e = cursor.getInt(cursor.getColumnIndex(a.f));
                        }
                        if (!TextUtils.equals(aVar2.c, str3)) {
                            aVar2.d = 0;
                        } else {
                            aVar2.d = cursor.getInt(cursor.getColumnIndex(a.h));
                        }
                        aVar2.f = cursor.getLong(cursor.getColumnIndex("show_time"));
                        aVar = aVar2;
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
            return aVar;
        } catch (Exception unused4) {
            cursor = null;
        } catch (OutOfMemoryError unused5) {
            cursor = null;
        } catch (Throwable unused6) {
            cursor = null;
        }
    }

    public final synchronized long a(int i, String str, ab.a aVar) {
        boolean z;
        if (b() == null || aVar == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("format", Integer.valueOf(i));
            contentValues.put(a.c, str);
            contentValues.put("adsource_id", aVar.a);
            contentValues.put(a.e, aVar.b);
            contentValues.put(a.f, Integer.valueOf(aVar.e));
            contentValues.put(a.g, aVar.c);
            contentValues.put(a.h, Integer.valueOf(aVar.d));
            contentValues.put("show_time", Long.valueOf(aVar.f));
            Cursor query = a().query(a.a, new String[]{"adsource_id"}, "adsource_id=?", new String[]{aVar.a}, "adsource_id", null, null);
            if (query == null || query.getCount() <= 0) {
                if (query != null) {
                    query.close();
                }
                z = false;
            } else {
                query.close();
                z = true;
            }
            if (z) {
                com.anythink.core.common.j.e.a(this.b, "existsByTime--update");
                return b().update(a.a, contentValues, "adsource_id = ? ", new String[]{aVar.a});
            }
            com.anythink.core.common.j.e.a(this.b, "existsByTime--insert");
            return b().insert(a.a, null, contentValues);
        } catch (Exception unused) {
            return -1L;
        }
    }

    private static ab a(Cursor cursor, String str, String str2) {
        if (cursor == null || cursor.getCount() <= 0) {
            return null;
        }
        ab abVar = new ab();
        abVar.f = new ConcurrentHashMap<>();
        while (cursor.moveToNext()) {
            abVar.a = cursor.getInt(cursor.getColumnIndex("format"));
            abVar.b = cursor.getString(cursor.getColumnIndex(a.c));
            ab.a aVar = new ab.a();
            aVar.a = cursor.getString(cursor.getColumnIndex("adsource_id"));
            aVar.b = cursor.getString(cursor.getColumnIndex(a.e));
            aVar.c = cursor.getString(cursor.getColumnIndex(a.g));
            if (!TextUtils.equals(aVar.b, str2)) {
                aVar.e = 0;
            } else {
                aVar.e = cursor.getInt(cursor.getColumnIndex(a.f));
            }
            abVar.d += aVar.e;
            if (!TextUtils.equals(aVar.c, str)) {
                aVar.d = 0;
            } else {
                aVar.d = cursor.getInt(cursor.getColumnIndex(a.h));
            }
            abVar.c += aVar.d;
            long j = cursor.getLong(cursor.getColumnIndex("show_time"));
            aVar.f = j;
            if (j >= abVar.e) {
                abVar.e = j;
            }
            abVar.f.put(aVar.a, aVar);
        }
        cursor.close();
        return abVar;
    }

    public final void a(String str) {
        String str2;
        synchronized (this) {
            try {
                str2 = "date_time!='" + str + "'";
            } catch (Exception unused) {
            }
            if (b() == null) {
                return;
            }
            b().delete(a.a, str2, null);
        }
    }
}