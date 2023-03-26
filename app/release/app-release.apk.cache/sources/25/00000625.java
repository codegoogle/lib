package com.anythink.core.common.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.anythink.core.common.b.m;

/* loaded from: classes2.dex */
public class i extends com.anythink.core.common.c.a<com.anythink.core.common.a.h> {
    private static i c;
    private final String b;

    /* loaded from: classes2.dex */
    public static class a {
        public static final String a = "offer_data_cache";
        public static final String b = "bid_id";
        public static final String c = "adsource_id";
        public static final String d = "network_firm_id";
        public static final String e = "offer_data";
        public static final String f = "CREATE TABLE IF NOT EXISTS offer_data_cache(bid_id TEXT ,adsource_id TEXT ,network_firm_id INTEGER ,offer_data TEXT)";
    }

    private i(b bVar) {
        super(bVar);
        this.b = i.class.getName();
    }

    public static i a(b bVar) {
        if (c == null) {
            c = new i(bVar);
        }
        return c;
    }

    public final synchronized String b(String str) {
        com.anythink.core.common.j.e.a(this.b, "OfferDataCache getOfferData BidId:".concat(String.valueOf(str)));
        Cursor query = a().query(a.a, new String[]{a.e}, "bid_id=?", new String[]{str}, null, null, null);
        if (query != null && query.getCount() > 0) {
            query.moveToNext();
            String string = query.getString(0);
            query.close();
            com.anythink.core.common.j.e.a(this.b, "OfferDataCache getOfferData OfferData:".concat(String.valueOf(string)));
            return string;
        }
        com.anythink.core.common.j.e.a(this.b, "OfferDataCache getOfferData no cache");
        return "";
    }

    public final synchronized void a(String str) {
        try {
            com.anythink.core.common.j.e.a(this.b, "OfferDataCache remove cache BidId:".concat(String.valueOf(str)));
            b().delete(a.a, "bid_id = ? ", new String[]{str});
        } catch (Throwable th) {
            com.anythink.core.common.i.c.a("Error_SQL_DELETE", th.getMessage(), m.a().p());
        }
    }

    public final synchronized long a(com.anythink.core.common.a.h hVar) {
        if (b() == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(a.b, hVar.a());
            contentValues.put("adsource_id", hVar.b());
            contentValues.put(a.d, hVar.a());
            contentValues.put(a.e, hVar.d());
            if (b(hVar)) {
                if (hVar.c() == 67) {
                    String str = this.b;
                    com.anythink.core.common.j.e.a(str, "OfferDataCache update(Directly) new BidId:" + hVar.a() + ",old adSourceId:" + hVar.b());
                    return b().update(a.a, contentValues, "adsource_id = ? ", new String[]{hVar.b()});
                }
                String str2 = this.b;
                com.anythink.core.common.j.e.a(str2, "OfferDataCache update(Adx) BidId:" + hVar.a());
                return b().update(a.a, contentValues, "bid_id = ? ", new String[]{hVar.a()});
            }
            String str3 = this.b;
            com.anythink.core.common.j.e.a(str3, "OfferDataCache insert BidId:" + hVar.a() + ",adSourceId:" + hVar.b());
            return b().insert(a.a, null, contentValues);
        } catch (Exception unused) {
            return -1L;
        }
    }

    private synchronized boolean b(com.anythink.core.common.a.h hVar) {
        Cursor query;
        if (hVar == null) {
            return false;
        }
        if (hVar.c() == 67) {
            query = a().query(a.a, new String[]{a.e}, "adsource_id=?", new String[]{hVar.b()}, null, null, null);
        } else {
            query = a().query(a.a, new String[]{a.e}, "bid_id=?", new String[]{hVar.a()}, null, null, null);
        }
        if (query != null && query.getCount() > 0) {
            query.close();
            return true;
        }
        if (query != null) {
            query.close();
        }
        return false;
    }
}