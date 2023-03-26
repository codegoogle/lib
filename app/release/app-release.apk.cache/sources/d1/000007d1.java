package com.anythink.expressad.foundation.c;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.anythink.expressad.foundation.d.q;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.out.j;

/* loaded from: classes2.dex */
public final class d extends com.anythink.expressad.foundation.c.a<j> {
    private static d b;

    /* loaded from: classes2.dex */
    public static class a {
        public static final String A = "ad_url_list";
        public static final String B = "video_url";
        public static final String C = "pregeress_size";
        public static final String D = "total_size";
        public static final String E = "endcard_click_result";
        public static final String F = "video_state";
        public static final String G = "video_download_start";
        public static final String H = "ad_bid_token";
        public static final String I = "video_path";
        public static final String J = "CREATE TABLE IF NOT EXISTS video (id TEXT,unitid TEXT,tab INTEGER,package_name TEXT,app_name TEXT,app_desc TEXT,app_size TEXT,image_size TEXT,icon_url TEXT,image_url TEXT,impression_url TEXT,notice_url TEXT,download_url TEXT,only_impression TEXT,template INTEGER,landing_type TEXT,link_type INTEGER,click_mode TEXT,cti INTEGER,star TEXT,level INTEGER,adSource INTEGER,fc_a INTEGER,ad_call TEXT,ad_url_list TEXT,ad_bid_token TEXT,video_url TEXT,pregeress_size INTEGER,total_size INTEGER,video_download_start INTEGER,video_state INTEGER,video_path TEXT,endcard_click_result INTEGER,ts INTEGER  )";
        public static final String a = "video";
        public static final String b = "id";
        public static final String c = "unitid";
        public static final String d = "tab";
        public static final String e = "package_name";
        public static final String f = "app_name";
        public static final String g = "app_desc";
        public static final String h = "app_size";
        public static final String i = "image_size";
        public static final String j = "icon_url";
        public static final String k = "image_url";
        public static final String l = "impression_url";
        public static final String m = "notice_url";
        public static final String n = "download_url";
        public static final String o = "only_impression";
        public static final String p = "template";
        public static final String q = "landing_type";
        public static final String r = "link_type";
        public static final String s = "click_mode";
        public static final String t = "star";
        public static final String u = "cti";
        public static final String v = "ts";
        public static final String w = "level";
        public static final String x = "adSource";
        public static final String y = "ad_call";
        public static final String z = "fc_a";
    }

    private d(b bVar) {
        super(bVar);
    }

    public static synchronized d a(b bVar) {
        d dVar;
        synchronized (d.class) {
            if (b == null) {
                b = new d(bVar);
            }
            dVar = b;
        }
        return dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0088, code lost:
        if (r1 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008a, code lost:
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0095, code lost:
        if (r1 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0099, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized q b(String str) {
        Cursor cursor = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        q qVar = new q();
        try {
            cursor = a().query(a.a, null, "video_url=?", new String[]{str}, null, null, null);
            if (cursor != null && cursor.getCount() > 0) {
                while (cursor.moveToNext()) {
                    qVar.a(cursor.getString(cursor.getColumnIndex("video_url")));
                    qVar.b(cursor.getInt(cursor.getColumnIndex(a.F)));
                    qVar.b(cursor.getLong(cursor.getColumnIndex(a.C)));
                    qVar.a(cursor.getInt(cursor.getColumnIndex(a.D)));
                    qVar.b(cursor.getString(cursor.getColumnIndex(a.I)));
                    qVar.a(cursor.getLong(cursor.getColumnIndex(a.G)) * 1000);
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final synchronized void c(String str) {
        try {
            String str2 = "video_url = '" + str + "'";
            if (b() == null) {
                return;
            }
            b().delete(a.a, str2, null);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.anythink.expressad.foundation.d.q] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized q a(String str) {
        q qVar;
        Exception e;
        Cursor cursor;
        q qVar2 = 0;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            cursor = a().query(a.a, null, "video_url=?", new String[]{str}, null, null, null);
            if (cursor != null) {
                try {
                    try {
                        if (cursor.getCount() > 0) {
                            qVar = new q();
                            while (cursor.moveToNext()) {
                                try {
                                    qVar.a(cursor.getString(cursor.getColumnIndex("video_url")));
                                    qVar.b(cursor.getInt(cursor.getColumnIndex(a.F)));
                                    qVar.b(cursor.getLong(cursor.getColumnIndex(a.C)));
                                    qVar.a(cursor.getInt(cursor.getColumnIndex(a.D)));
                                    qVar.b(cursor.getString(cursor.getColumnIndex(a.I)));
                                    qVar.a(cursor.getLong(cursor.getColumnIndex(a.G)) * 1000);
                                } catch (Exception e2) {
                                    e = e2;
                                    n.d("VideoDao", e.getLocalizedMessage());
                                    if (cursor != null) {
                                        try {
                                            cursor.close();
                                        } catch (Exception unused) {
                                        }
                                    }
                                    qVar2 = qVar;
                                    return qVar2;
                                }
                            }
                            qVar2 = qVar;
                        }
                    } catch (Throwable th) {
                        th = th;
                        qVar2 = cursor;
                        if (qVar2 != null) {
                            try {
                                qVar2.close();
                            } catch (Exception unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (Exception e3) {
                    e = e3;
                    qVar = null;
                }
            }
            if (cursor != null) {
                try {
                    cursor.close();
                } catch (Exception unused3) {
                }
            }
        } catch (Exception e4) {
            qVar = null;
            e = e4;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (qVar2 != null) {
            }
            throw th;
        }
        return qVar2;
    }

    private synchronized void c() {
    }

    public final synchronized void a(String str, long j) {
        if (j == 0) {
            return;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(a.G, Long.valueOf(j / 1000));
            if (a(str, "")) {
                b().update(a.a, contentValues, "video_url = '" + str + "'", null);
            }
        } catch (Exception unused) {
        }
    }

    public final synchronized long a(com.anythink.expressad.foundation.d.c cVar, long j, String str, int i) {
        if (cVar == null) {
            return 0L;
        }
        try {
            if (b() == null) {
                return -1L;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put(a.c, cVar.I());
            contentValues.put("id", cVar.aZ());
            contentValues.put("package_name", cVar.ba());
            contentValues.put(a.f, cVar.bb());
            contentValues.put(a.g, cVar.bc());
            contentValues.put("app_size", cVar.bh());
            contentValues.put("image_size", cVar.an());
            contentValues.put("icon_url", cVar.bd());
            contentValues.put("image_url", cVar.be());
            contentValues.put("impression_url", cVar.ai());
            contentValues.put("notice_url", cVar.aj());
            contentValues.put(a.n, cVar.af());
            contentValues.put(a.o, cVar.ak());
            contentValues.put("ts", Long.valueOf(cVar.bg()));
            contentValues.put("template", Integer.valueOf(cVar.am()));
            contentValues.put("click_mode", cVar.ac());
            contentValues.put("landing_type", cVar.ad());
            contentValues.put("link_type", Integer.valueOf(cVar.P()));
            contentValues.put(a.t, Double.valueOf(cVar.aX()));
            contentValues.put(a.u, Integer.valueOf(cVar.Y()));
            contentValues.put(a.w, Integer.valueOf(cVar.U()));
            contentValues.put(a.x, Integer.valueOf(cVar.bf()));
            contentValues.put(a.y, cVar.cS);
            contentValues.put(a.z, Integer.valueOf(cVar.ae()));
            contentValues.put("ad_url_list", cVar.K());
            contentValues.put("video_url", cVar.R());
            contentValues.put(a.D, Long.valueOf(j));
            contentValues.put(a.F, Integer.valueOf(i));
            contentValues.put(a.G, Long.valueOf(System.currentTimeMillis() / 1000));
            contentValues.put(a.H, cVar.z());
            if (!TextUtils.isEmpty(str)) {
                contentValues.put(a.I, str);
            }
            if (a(cVar.R(), cVar.aZ())) {
                return 0L;
            }
            return b().insert(a.a, null, contentValues);
        } catch (Exception unused) {
            return -1L;
        }
    }

    private synchronized boolean a(String str, String str2) {
        String str3;
        String[] strArr;
        if (TextUtils.isEmpty(str2)) {
            str3 = "video_url=?";
            strArr = new String[]{str};
        } else {
            str3 = "video_url=? AND id=?";
            strArr = new String[]{str, str2};
        }
        Cursor query = a().query(a.a, new String[]{"id"}, str3, strArr, null, null, null);
        if (query != null && query.getCount() > 0) {
            try {
                query.close();
            } catch (Exception unused) {
            }
            return true;
        }
        if (query != null) {
            query.close();
        }
        return false;
    }

    public final synchronized long a(String str, long j, int i) {
        int i2 = -1;
        if (b() == null) {
            return -1L;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(a.C, Long.valueOf(j));
        contentValues.put(a.F, Integer.valueOf(i));
        if (a(str, "")) {
            String str2 = "video_url = '" + str + "'";
            synchronized (new Object()) {
                i2 = b().update(a.a, contentValues, str2, null);
            }
        }
        return i2;
    }
}