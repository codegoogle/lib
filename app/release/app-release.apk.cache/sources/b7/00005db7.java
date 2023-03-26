package com.p7700g.p99005;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.anchorfree.ucr.UCRContentProvider;
import com.anchorfree.ucr.UCRService;
import com.p7700g.p99005.r91;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: EventsStorage.java */
/* loaded from: classes2.dex */
public class t91 {
    private static final kj1 a = kj1.b("EventHelper");
    @x1
    private static final String b = "NULL";
    @x1
    private final ReentrantReadWriteLock c;
    @x1
    private final Lock d;
    @x1
    private Context e;
    @x1
    private final Executor f;

    /* compiled from: EventsStorage.java */
    /* loaded from: classes2.dex */
    public class a implements Runnable {
        @x1
        private final Bundle s;
        @x1
        private final String t;
        @x1
        private final String u;
        @x1
        private final String v;

        public a(@x1 Bundle bundle, @x1 String str, @x1 String str2, @x1 String str3) {
            this.s = bundle;
            this.t = str;
            this.u = str3;
            this.v = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            t91.this.i(this.t, this.s, this.u, this.v);
        }
    }

    /* compiled from: EventsStorage.java */
    /* loaded from: classes2.dex */
    public class b implements Runnable {
        @x1
        public final String s;
        @x1
        public final String t;
        @x1
        public final int u;

        public b(@x1 String str, @x1 String str2, int i) {
            this.s = str;
            this.t = str2;
            this.u = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            ContentValues contentValues = new ContentValues();
            contentValues.put("data", this.s);
            contentValues.put("timestamp", Long.valueOf(System.currentTimeMillis()));
            contentValues.put("response", this.t);
            contentValues.put(r91.b.d, Integer.valueOf(this.u));
            try {
                ContentResolver contentResolver = t91.this.e.getContentResolver();
                contentResolver.insert(UCRContentProvider.c(t91.this.e), contentValues);
                contentResolver.delete(UCRContentProvider.c(t91.this.e), "timestamp < ?", new String[]{String.valueOf(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L))});
            } catch (Throwable th) {
                t91.a.f(th);
            }
        }
    }

    public t91(@x1 Context context, @x1 Executor executor) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.c = reentrantReadWriteLock;
        this.d = reentrantReadWriteLock.writeLock();
        this.e = context;
        this.f = executor;
    }

    @x1
    private Map<String, List<v91>> e(@z1 Cursor cursor) {
        HashMap hashMap = new HashMap();
        if (cursor != null) {
            while (cursor.moveToNext()) {
                String string = cursor.getString(cursor.getColumnIndexOrThrow("_id"));
                String string2 = cursor.getString(cursor.getColumnIndexOrThrow("action"));
                Long valueOf = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow("timestamp")));
                byte[] blob = cursor.getBlob(cursor.getColumnIndexOrThrow(r91.a.d));
                String string3 = cursor.getString(cursor.getColumnIndexOrThrow(r91.a.f));
                if (!TextUtils.isEmpty(string2) && !b.equals(string2)) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("time", valueOf);
                    if (blob != null) {
                        Parcel obtain = Parcel.obtain();
                        try {
                            obtain.unmarshall(blob, 0, blob.length);
                            obtain.setDataPosition(0);
                            Bundle bundle = (Bundle) Bundle.CREATOR.createFromParcel(obtain);
                            bundle.setClassLoader(UCRService.class.getClassLoader());
                            try {
                                for (String str : bundle.keySet()) {
                                    Object obj = bundle.get(str);
                                    if (obj != null) {
                                        hashMap2.put(str, obj);
                                    }
                                }
                                obtain.recycle();
                            } catch (Throwable unused) {
                            }
                        } finally {
                            obtain.recycle();
                        }
                    }
                    v91 v91Var = new v91(string, string2.toLowerCase(Locale.getDefault()), hashMap2);
                    List list = (List) hashMap.get(string3);
                    if (list == null) {
                        list = new ArrayList();
                    }
                    list.add(v91Var);
                    hashMap.put(string3, list);
                }
            }
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(@x1 String str, @x1 Bundle bundle, @x1 String str2, @x1 String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str2)) {
            return;
        }
        Iterator it = new ArrayList(bundle.keySet()).iterator();
        while (it.hasNext()) {
            String str4 = (String) it.next();
            if (bundle.get(str4) == null) {
                bundle.remove(str4);
            }
        }
        Parcel obtain = Parcel.obtain();
        try {
            bundle.writeToParcel(obtain, 0);
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            ContentValues contentValues = new ContentValues();
            contentValues.put("action", str);
            long currentTimeMillis = System.currentTimeMillis();
            contentValues.put("timestamp", Long.valueOf(currentTimeMillis));
            contentValues.put(r91.a.d, marshall);
            contentValues.put(r91.a.f, str2);
            contentValues.put(r91.a.e, str3);
            a.c("Track\naction: %s\ntimestamp:%s\nprops: %s", str, Long.valueOf(currentTimeMillis), bundle);
            this.d.lock();
            try {
                this.e.getContentResolver().insert(UCRContentProvider.b(this.e), contentValues);
            } finally {
                try {
                } finally {
                }
            }
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    public void d(@x1 String str) {
        this.e.getContentResolver().delete(Uri.withAppendedPath(UCRContentProvider.b(this.e), str), null, null);
    }

    public List<Map<String, String>> f() {
        Cursor cursor = null;
        try {
            cursor = this.e.getContentResolver().query(UCRContentProvider.c(this.e), null, null, null, "timestamp desc");
            ArrayList arrayList = new ArrayList();
            while (cursor != null) {
                if (!cursor.moveToNext()) {
                    break;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("_id", String.valueOf(cursor.getLong(cursor.getColumnIndex("_id"))));
                hashMap.put("timestamp", String.valueOf(cursor.getLong(cursor.getColumnIndex("timestamp"))));
                hashMap.put(r91.b.d, String.valueOf(cursor.getLong(cursor.getColumnIndex(r91.b.d))));
                hashMap.put("data", cursor.getString(cursor.getColumnIndex("data")));
                hashMap.put("response", cursor.getString(cursor.getColumnIndex("response")));
                arrayList.add(hashMap);
            }
            return arrayList;
        } catch (Throwable th) {
            try {
                a.f(th);
                if (cursor != null) {
                    cursor.close();
                }
                return Collections.emptyList();
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }
    }

    @x1
    public Map<String, List<v91>> g() {
        Cursor cursor = null;
        try {
            cursor = this.e.getContentResolver().query(UCRContentProvider.b(this.e), null, null, null, null);
            return e(cursor);
        } catch (Throwable th) {
            try {
                a.f(th);
                if (cursor != null) {
                    cursor.close();
                }
                return Collections.emptyMap();
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }
    }

    @x1
    public Map<String, List<v91>> h(@x1 String str) {
        Cursor cursor = null;
        try {
            cursor = this.e.getContentResolver().query(UCRContentProvider.b(this.e), null, "_tracker=?", new String[]{str}, null);
            return e(cursor);
        } catch (Throwable th) {
            try {
                a.f(th);
                if (cursor != null) {
                    cursor.close();
                }
                return Collections.emptyMap();
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }
    }

    public void j(@x1 String str, @x1 Bundle bundle, @x1 String str2, @x1 String str3) {
        this.f.execute(new a(bundle, str, str2, str3));
    }

    public void k(@x1 String str, @x1 String str2, int i) {
        this.f.execute(new b(str, str2, i));
    }
}