package com.anythink.core.common.c;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class f extends com.anythink.core.common.c.a<com.anythink.core.common.a.f> {
    private static f d;
    private final String b;
    private final long c;

    /* loaded from: classes2.dex */
    public static class a {
        public static final String a = "dsp_offer_show_record";
        public static final String b = "dsp_id";
        public static final String c = "dsp_offer_id";
        public static final String d = "show_limit";
        public static final String e = "show_count";
        public static final String f = "create_time";
        public static final String g = "last_update_time";
        public static final String h = "CREATE TABLE IF NOT EXISTS dsp_offer_show_record(dsp_id TEXT ,dsp_offer_id TEXT ,show_limit INTEGER ,show_count INTEGER ,create_time INTEGER ,last_update_time INTEGER)";
    }

    private f(b bVar) {
        super(bVar);
        this.b = f.class.getName();
        this.c = com.anythink.expressad.foundation.g.a.bV;
    }

    public static f a(b bVar) {
        if (d == null) {
            d = new f(bVar);
        }
        return d;
    }

    public final synchronized long b(com.anythink.core.common.a.f fVar) {
        if (b() == null) {
            return -1L;
        }
        if (fVar.c() <= 0) {
            return -1L;
        }
        com.anythink.core.common.a.f a2 = a(fVar.a(), fVar.b());
        if (a2 != null) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("dsp_id", fVar.a());
                contentValues.put("dsp_offer_id", fVar.b());
                contentValues.put(a.d, Integer.valueOf(fVar.c()));
                contentValues.put("show_count", Integer.valueOf(a2.d() + 1));
                contentValues.put("last_update_time", Long.valueOf(System.currentTimeMillis()));
                String str = this.b;
                com.anythink.core.common.j.e.a(str, "updateDspOfferShowRecord--update dspid:" + fVar.a() + ",dspOfferId:" + fVar.b() + ",cur show count:" + (a2.d() + 1) + ",limit show cap:" + fVar.c());
                return b().update(a.a, contentValues, "dsp_id = ? and dsp_offer_id = ? ", new String[]{fVar.a(), fVar.b()});
            } catch (Exception unused) {
            }
        }
        return -1L;
    }

    public final void c() {
        try {
            String str = "create_time < " + (System.currentTimeMillis() - com.anythink.expressad.foundation.g.a.bV);
            if (b() == null) {
                return;
            }
            b().delete(a.a, str, null);
        } catch (Exception unused) {
        }
    }

    public final synchronized long a(com.anythink.core.common.a.f fVar) {
        if (b() == null) {
            return -1L;
        }
        if (fVar.c() <= 0) {
            return -1L;
        }
        if (a(fVar.a(), fVar.b()) == null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("dsp_id", fVar.a());
            contentValues.put("dsp_offer_id", fVar.b());
            contentValues.put(a.d, Integer.valueOf(fVar.c()));
            contentValues.put("show_count", (Integer) 0);
            contentValues.put(a.f, Long.valueOf(System.currentTimeMillis()));
            contentValues.put("last_update_time", Long.valueOf(System.currentTimeMillis()));
            String str = this.b;
            com.anythink.core.common.j.e.a(str, "insertDspOfferShowRecord--insert dspid:" + fVar.a() + ",dspOfferId:" + fVar.b());
            return b().insert(a.a, null, contentValues);
        }
        String str2 = this.b;
        com.anythink.core.common.j.e.a(str2, "insertDspOfferShowRecord--had inserted...,dspid:" + fVar.a() + ",dspOfferId:" + fVar.b());
        return -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
        if (r11 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
        if (r11 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
        if (r11 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004f, code lost:
        if (r11 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0056, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized com.anythink.core.common.a.f a(String str, String str2) {
        Cursor cursor;
        try {
            cursor = a().query(a.a, null, "dsp_id = ?  AND dsp_offer_id = ? ", new String[]{str, str2}, null, null, null);
            try {
                List<com.anythink.core.common.a.f> a2 = a(cursor);
                if (a2.size() > 0) {
                    com.anythink.core.common.a.f fVar = a2.get(0);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return fVar;
                }
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

    private synchronized List<com.anythink.core.common.a.f> a(Cursor cursor) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        if (cursor != null) {
            if (cursor.getCount() > 0) {
                while (cursor.moveToNext()) {
                    try {
                        com.anythink.core.common.a.f fVar = new com.anythink.core.common.a.f();
                        fVar.a(cursor.getString(cursor.getColumnIndex("dsp_id")));
                        fVar.b(cursor.getString(cursor.getColumnIndex("dsp_offer_id")));
                        fVar.a(cursor.getInt(cursor.getColumnIndex(a.d)));
                        fVar.b(cursor.getInt(cursor.getColumnIndex("show_count")));
                        arrayList.add(fVar);
                    } catch (Throwable unused) {
                    }
                }
                cursor.close();
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
        if (r1 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
        if (r1 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
        if (r1 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003f, code lost:
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
            cursor = a().query(a.a, null, "show_count > show_limit", null, null, null, "last_update_time DESC", String.valueOf(i));
            List<com.anythink.core.common.a.f> a2 = a(cursor);
            String str = this.b;
            com.anythink.core.common.j.e.a(str, "get limit show cap record list size:" + a2.size());
            arrayList.addAll(a2);
        } catch (Exception unused) {
        } catch (OutOfMemoryError unused2) {
            System.gc();
        } catch (Throwable unused3) {
        }
    }
}