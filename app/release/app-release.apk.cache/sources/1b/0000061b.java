package com.anythink.core.common.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.anythink.core.common.e.ac;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class d extends com.anythink.core.common.c.a<ac> {
    private static final String b = "com.anythink.core.common.c.d";
    private static d c;

    /* loaded from: classes2.dex */
    public static class a {
        public static final String a = "sdkconfig";
        public static final String b = "key";
        public static final String c = "type";
        public static final String d = "value";
        public static final String e = "lastupdatetime";
        public static final String f = "CREATE TABLE IF NOT EXISTS sdkconfig(key TEXT ,type TEXT ,lastupdatetime TEXT ,value TEXT )";
    }

    private d(b bVar) {
        super(bVar);
    }

    public static d a(b bVar) {
        if (c == null) {
            c = new d(bVar);
        }
        return c;
    }

    private synchronized boolean b(String str, String str2) {
        Cursor query = a().query(a.a, new String[]{"key"}, "key=? AND type=?", new String[]{str, str2}, null, null, null);
        if (query != null && query.getCount() > 0) {
            query.close();
            return true;
        }
        if (query != null) {
            query.close();
        }
        return false;
    }

    private synchronized void c(String str, String str2) {
        List<ac> c2 = c(str, str2, ac.a.a);
        if (c2 != null && c2.size() > 0) {
            com.anythink.core.common.j.e.a(b, "update---->".concat(String.valueOf(str)));
            for (ac acVar : c2) {
                StringBuilder sb = new StringBuilder();
                sb.append(Integer.parseInt(acVar.d()) + 1);
                acVar.d(sb.toString());
                a(acVar);
            }
            return;
        }
        com.anythink.core.common.j.e.a(b, "insert---->".concat(String.valueOf(str)));
        ac acVar2 = new ac();
        acVar2.a(str2);
        acVar2.d("1");
        acVar2.c(ac.a.a);
        acVar2.b(str);
        a(acVar2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r10 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
        if (r10 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0040, code lost:
        if (r10 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0047, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized List<ac> d(String str, String str2) {
        Cursor cursor;
        try {
            cursor = a().query(a.a, null, "key != ? and type = ?", new String[]{str, str2}, null, null, null);
            try {
                List<ac> a2 = a(cursor);
                if (cursor != null) {
                    cursor.close();
                }
                return a2;
            } catch (Exception unused) {
            } catch (OutOfMemoryError unused2) {
                System.gc();
            } catch (Throwable unused3) {
            }
        } catch (Exception unused4) {
            cursor = null;
        } catch (OutOfMemoryError unused5) {
            cursor = null;
        } catch (Throwable unused6) {
            cursor = null;
        }
    }

    public final synchronized long a(String str, String str2, String str3) {
        if (b() == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("key", str);
            contentValues.put("type", str3);
            contentValues.put("value", str2);
            StringBuilder sb = new StringBuilder();
            sb.append(System.currentTimeMillis());
            contentValues.put(a.e, sb.toString());
            if (b(str, str3)) {
                com.anythink.core.common.j.e.a(b, "insertOrUpdate-->Update");
                return b().update(a.a, contentValues, "key = ? AND type = ?", new String[]{str, str3});
            }
            com.anythink.core.common.j.e.a(b, "insertOrUpdate-->insert");
            return b().insert(a.a, null, contentValues);
        } catch (Exception unused) {
            return -1L;
        }
    }

    private synchronized boolean b(String str, String str2, String str3) {
        Cursor query = a().query(a.a, new String[]{"key"}, "key=? AND type=? AND lastupdatetime=?", new String[]{str, str3, str2}, null, null, null);
        if (query != null && query.getCount() > 0) {
            query.close();
            return true;
        }
        if (query != null) {
            query.close();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
        if (r10 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
        if (r10 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003d, code lost:
        if (r10 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0044, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized List<ac> b(String str) {
        Cursor cursor;
        try {
            cursor = a().query(a.a, null, "type = ?", new String[]{str}, null, null, null);
            try {
                List<ac> a2 = a(cursor);
                if (cursor != null) {
                    cursor.close();
                }
                return a2;
            } catch (Exception unused) {
            } catch (OutOfMemoryError unused2) {
                System.gc();
            } catch (Throwable unused3) {
            }
        } catch (Exception unused4) {
            cursor = null;
        } catch (OutOfMemoryError unused5) {
            cursor = null;
        } catch (Throwable unused6) {
            cursor = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
        if (r10 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
        if (r10 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
        if (r10 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004a, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized List<ac> c(String str, String str2, String str3) {
        Cursor cursor;
        try {
            cursor = a().query(a.a, null, "key = ? and type = ? and lastupdatetime = ?", new String[]{str, str3, str2}, null, null, null);
        } catch (Exception unused) {
            cursor = null;
        } catch (OutOfMemoryError unused2) {
            cursor = null;
        } catch (Throwable unused3) {
            cursor = null;
        }
        try {
            List<ac> a2 = a(cursor);
            if (cursor != null) {
                cursor.close();
            }
            return a2;
        } catch (Exception unused4) {
        } catch (OutOfMemoryError unused5) {
            System.gc();
        } catch (Throwable unused6) {
        }
    }

    private synchronized long a(ac acVar) {
        if (b() == null || acVar == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("key", acVar.b());
            contentValues.put("type", acVar.c());
            contentValues.put("value", acVar.d());
            contentValues.put(a.e, acVar.a());
            if (b(acVar.b(), acVar.a(), acVar.c())) {
                com.anythink.core.common.j.e.a(b, "existsByTime--update");
                return b().update(a.a, contentValues, "key = ? AND type = ? AND lastupdatetime = ?  ", new String[]{acVar.b(), acVar.c(), acVar.a()});
            }
            com.anythink.core.common.j.e.a(b, "existsByTime--insert");
            return b().insert(a.a, null, contentValues);
        } catch (Exception unused) {
            return -1L;
        }
    }

    private synchronized List<ac> a(Cursor cursor) {
        if (cursor != null) {
            if (cursor.getCount() > 0) {
                ArrayList arrayList = new ArrayList();
                while (cursor.moveToNext()) {
                    ac acVar = new ac();
                    acVar.b(cursor.getString(cursor.getColumnIndex("key")));
                    acVar.c(cursor.getString(cursor.getColumnIndex("type")));
                    acVar.d(cursor.getString(cursor.getColumnIndex("value")));
                    acVar.a(cursor.getString(cursor.getColumnIndex(a.e)));
                    arrayList.add(acVar);
                }
                cursor.close();
                return arrayList;
            }
        }
        return null;
    }

    private synchronized void a(String str) {
        try {
            if (b() == null) {
                return;
            }
            b().delete(a.a, "lastupdatetime< ? and type = ?", new String[]{str, ac.a.a});
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r10 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
        if (r10 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0040, code lost:
        if (r10 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0047, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized List<ac> a(String str, String str2) {
        Cursor cursor;
        try {
            cursor = a().query(a.a, null, "key = ? and type = ?", new String[]{str, str2}, null, null, null);
            try {
                List<ac> a2 = a(cursor);
                if (cursor != null) {
                    cursor.close();
                }
                return a2;
            } catch (Exception unused) {
            } catch (OutOfMemoryError unused2) {
                System.gc();
            } catch (Throwable unused3) {
            }
        } catch (Exception unused4) {
            cursor = null;
        } catch (OutOfMemoryError unused5) {
            cursor = null;
        } catch (Throwable unused6) {
            cursor = null;
        }
    }
}