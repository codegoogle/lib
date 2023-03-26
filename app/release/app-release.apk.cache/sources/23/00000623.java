package com.anythink.core.common.c;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.anythink.core.common.e.u;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class h extends com.anythink.core.common.c.a<u> {
    private static h c;
    private final String b;

    /* loaded from: classes2.dex */
    public static class a {
        public static final String a = "offer_action_record";
        public static final String b = "adsource_id";
        public static final String c = "type";
        public static final String d = "unit_id";
        public static final String e = "click_count";
        public static final String f = "show_count";
        public static final String g = "expire_time";
        public static final String h = "CREATE TABLE IF NOT EXISTS offer_action_record(adsource_id TEXT ,type INTEGER ,unit_id TEXT ,click_count INTEGER ,show_count INTEGER ,expire_time INTEGER )";
    }

    private h(b bVar) {
        super(bVar);
        this.b = h.class.getName();
    }

    public static h a(b bVar) {
        if (c == null) {
            c = new h(bVar);
        }
        return c;
    }

    private static String b(int i) {
        if (i > 0) {
            StringBuilder sb = new StringBuilder((i * 2) - 1);
            sb.append("?");
            for (int i2 = 1; i2 < i; i2++) {
                sb.append(",?");
            }
            return sb.toString();
        }
        throw new RuntimeException("No placeholders");
    }

    private boolean c(String str, int i, String str2) {
        Cursor query = a().query(a.a, null, "adsource_id = ? and type = ? and unit_id = ?", new String[]{str, String.valueOf(i), str2}, null, null, null);
        if (query != null && query.getCount() > 0) {
            query.close();
            return true;
        }
        if (query != null) {
            query.close();
        }
        return false;
    }

    public final synchronized void a(int i, String str, int i2, int i3) {
        u a2 = a(i, str);
        if (a2 != null) {
            a2.b(a2.d() + i2);
            a2.a(a2.c() + i3);
            a(a2);
        }
    }

    private synchronized long b(String str, int i, String str2) {
        if (b() == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("adsource_id", str);
            contentValues.put("type", Integer.valueOf(i));
            contentValues.put("unit_id", str2);
            u a2 = a(i, str2);
            if (a2 != null) {
                contentValues.put(a.e, Integer.valueOf(a2.d()));
                contentValues.put("show_count", Integer.valueOf(a2.c()));
                contentValues.put("expire_time", Long.valueOf(a2.b()));
            } else {
                contentValues.put(a.e, (Integer) 0);
                contentValues.put("show_count", (Integer) 0);
                contentValues.put("expire_time", (Integer) (-1));
            }
            com.anythink.core.common.j.e.a(this.b, "existsByTime--insert");
            return b().insert(a.a, null, contentValues);
        } catch (Exception unused) {
            return -1L;
        }
    }

    public final synchronized void a(int i, String str, long j) {
        u a2 = a(i, str);
        if (a2 != null) {
            a2.a(System.currentTimeMillis() + j);
            a(a2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0078, code lost:
        if (r1 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007a, code lost:
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007e, code lost:
        if (r1 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
        if (r1 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008e, code lost:
        if (r1 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized List<u> a(int i) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = a().query(a.a, null, "type = ? and expire_time > ?", new String[]{String.valueOf(i), String.valueOf(System.currentTimeMillis())}, null, null, null);
            if (cursor != null && cursor.getCount() > 0) {
                while (cursor.moveToNext()) {
                    u uVar = new u(i, cursor.getString(cursor.getColumnIndex("unit_id")));
                    uVar.b(cursor.getInt(cursor.getColumnIndex(a.e)));
                    uVar.a(cursor.getInt(cursor.getColumnIndex("show_count")));
                    uVar.a(cursor.getLong(cursor.getColumnIndex("expire_time")));
                    arrayList.add(uVar);
                }
            }
        } catch (Exception unused) {
        } catch (OutOfMemoryError unused2) {
            System.gc();
        } catch (Throwable unused3) {
        }
        return arrayList;
    }

    private boolean b(int i, String str) {
        Cursor query = a().query(a.a, null, "type = ? and unit_id = ?", new String[]{String.valueOf(i), str}, null, null, null);
        if (query != null && query.getCount() > 0) {
            query.close();
            return true;
        }
        if (query != null) {
            query.close();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b8, code lost:
        if (r1 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ba, code lost:
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00be, code lost:
        if (r1 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c4, code lost:
        if (r1 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ce, code lost:
        if (r1 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized List<u> a(List<String> list, int i) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder("SELECT * FROM offer_action_record WHERE adsource_id IN (");
        sb.append(b(list.size()));
        sb.append(") and type = ? and expire_time > ?");
        Cursor cursor = null;
        try {
            String[] strArr = new String[list.size() + 2];
            list.toArray(strArr);
            strArr[list.size()] = String.valueOf(i);
            strArr[list.size() + 1] = String.valueOf(System.currentTimeMillis());
            SQLiteDatabase a2 = a();
            cursor = a2.query(a.a, null, "adsource_id IN (" + b(list.size()) + ") and type = ? and expire_time > ?", strArr, null, null, null);
            if (cursor != null && cursor.getCount() > 0) {
                while (cursor.moveToNext()) {
                    u uVar = new u(i, cursor.getString(cursor.getColumnIndex("unit_id")));
                    uVar.b(cursor.getInt(cursor.getColumnIndex(a.e)));
                    uVar.a(cursor.getInt(cursor.getColumnIndex("show_count")));
                    uVar.a(cursor.getLong(cursor.getColumnIndex("expire_time")));
                    arrayList.add(uVar);
                }
            }
        } catch (Exception unused) {
        } catch (OutOfMemoryError unused2) {
            System.gc();
        } catch (Throwable unused3) {
        }
        return arrayList;
    }

    private synchronized long a(u uVar) {
        if (b() == null || uVar == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("type", Integer.valueOf(uVar.e()));
            contentValues.put("unit_id", uVar.a());
            contentValues.put(a.e, Integer.valueOf(uVar.d()));
            contentValues.put("show_count", Integer.valueOf(uVar.c()));
            contentValues.put("expire_time", Long.valueOf(uVar.b()));
            com.anythink.core.common.j.e.a(this.b, "existsByTime--update");
            return b().update(a.a, contentValues, "type = ? and unit_id = ?", new String[]{String.valueOf(uVar.e()), uVar.a()});
        } catch (Exception unused) {
            return -1L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
        if (r1 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
        if (r1 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0073, code lost:
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
        if (r1 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized u a(int i, String str) {
        Cursor cursor;
        try {
            cursor = a().query(a.a, null, "type=? and unit_id = ?", new String[]{String.valueOf(i), str}, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.getCount() > 0) {
                        cursor.moveToNext();
                        u uVar = new u(i, str);
                        uVar.b(cursor.getInt(cursor.getColumnIndex(a.e)));
                        uVar.a(cursor.getInt(cursor.getColumnIndex("show_count")));
                        uVar.a(cursor.getLong(cursor.getColumnIndex("expire_time")));
                        cursor.close();
                        cursor.close();
                        return uVar;
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

    public final synchronized void a(String str, int i, String str2) {
        boolean z = false;
        Cursor query = a().query(a.a, null, "adsource_id = ? and type = ? and unit_id = ?", new String[]{str, String.valueOf(i), str2}, null, null, null);
        if (query != null && query.getCount() > 0) {
            query.close();
            z = true;
        } else if (query != null) {
            query.close();
        }
        if (!z) {
            b(str, i, str2);
        }
    }
}