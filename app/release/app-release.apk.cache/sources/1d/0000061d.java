package com.anythink.core.common.c;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class e extends com.anythink.core.common.c.a<com.anythink.core.common.a.e> {
    private static e c;
    private final String b;

    /* loaded from: classes2.dex */
    public static class a {
        public static final String a = "dsp_offer_install_record";
        public static final String b = "dsp_id";
        public static final String c = "dsp_offer_id";
        public static final String d = "package_name";
        public static final String e = "last_update_time";
        public static final String f = "CREATE TABLE IF NOT EXISTS dsp_offer_install_record(dsp_id TEXT ,dsp_offer_id TEXT ,package_name TEXT ,last_update_time INTEGER)";
    }

    private e(b bVar) {
        super(bVar);
        this.b = e.class.getName();
    }

    public static e a(b bVar) {
        if (c == null) {
            c = new e(bVar);
        }
        return c;
    }

    public final synchronized long a(com.anythink.core.common.a.e eVar) {
        if (b() == null) {
            return -1L;
        }
        if (!a(eVar.a(), eVar.b())) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("dsp_id", eVar.a());
                contentValues.put("dsp_offer_id", eVar.b());
                contentValues.put("package_name", eVar.c());
                contentValues.put("last_update_time", Long.valueOf(System.currentTimeMillis()));
                String str = this.b;
                com.anythink.core.common.j.e.a(str, "insertDspOfferInstallRecord--insert,dspid:" + eVar.a() + ",dspoferrId:" + eVar.b() + ",packagename:" + eVar.c());
                return b().insert(a.a, null, contentValues);
            } catch (Exception unused) {
            }
        } else {
            String str2 = this.b;
            com.anythink.core.common.j.e.a(str2, "insertDspOfferInstallRecord--had inserted...,dspid:" + eVar.a() + ",dspoferrId:" + eVar.b() + ",packagename:" + eVar.c());
        }
        return -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
        if (r1 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r1 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
        if (r1 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0045, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized boolean a(String str, String str2) {
        Cursor cursor = null;
        try {
            cursor = a().query(a.a, null, "dsp_id = ?  AND dsp_offer_id = ? ", new String[]{str, str2}, null, null, null);
            boolean z = cursor.getCount() > 0;
            cursor.close();
            return z;
        } catch (Exception unused) {
        } catch (OutOfMemoryError unused2) {
            System.gc();
        } catch (Throwable unused3) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
        if (r1 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
        if (r1 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
        if (r1 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003e, code lost:
        if (r1 != null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized List<com.anythink.core.common.a.d> a(int i) {
        ArrayList arrayList = new ArrayList();
        if (i <= 0) {
            return arrayList;
        }
        Cursor cursor = null;
        try {
            cursor = a().query(a.a, null, null, null, null, null, "last_update_time DESC", String.valueOf(i));
            List<com.anythink.core.common.a.e> a2 = a(cursor);
            String str = this.b;
            com.anythink.core.common.j.e.a(str, "get limit install record list size:" + a2.size());
            arrayList.addAll(a2);
        } catch (Exception unused) {
        } catch (OutOfMemoryError unused2) {
            System.gc();
        } catch (Throwable unused3) {
        }
    }

    private synchronized List<com.anythink.core.common.a.e> a(Cursor cursor) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        if (cursor != null) {
            if (cursor.getCount() > 0) {
                while (cursor.moveToNext()) {
                    try {
                        com.anythink.core.common.a.e eVar = new com.anythink.core.common.a.e();
                        eVar.a(cursor.getString(cursor.getColumnIndex("dsp_id")));
                        eVar.b(cursor.getString(cursor.getColumnIndex("dsp_offer_id")));
                        eVar.c(cursor.getString(cursor.getColumnIndex("package_name")));
                        arrayList.add(eVar);
                    } catch (Throwable unused) {
                    }
                }
                cursor.close();
            }
        }
        return arrayList;
    }
}