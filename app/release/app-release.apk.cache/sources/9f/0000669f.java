package com.p7700g.p99005;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.anchorfree.sdk.DBProvider;
import com.p7700g.p99005.x31;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* compiled from: KeyValueStorageImpl.java */
/* loaded from: classes.dex */
public class y31 implements x31 {
    @x1
    private static final kj1 a = kj1.b("DBStoreHelper");
    @x1
    private final Context b;
    @x1
    private final Uri c;

    /* compiled from: KeyValueStorageImpl.java */
    /* loaded from: classes.dex */
    public static class b implements x31.a {
        @z1
        private y31 d;
        @x1
        private final Map<String, String> a = new HashMap();
        @x1
        private final List<String> c = new ArrayList();
        @x1
        private final Map<String, Long> b = new HashMap();

        public b(@x1 y31 y31Var) {
            this.d = y31Var;
        }

        @Override // com.p7700g.p99005.x31.a
        public void a() {
            d();
        }

        @Override // com.p7700g.p99005.x31.a
        @x1
        public x31.a b(@x1 String str, @z1 String str2) {
            if (str2 != null) {
                this.a.put(str, str2);
            } else {
                this.a.put(str, "");
            }
            return this;
        }

        @Override // com.p7700g.p99005.x31.a
        @x1
        public x31.a c(@x1 String str, long j) {
            this.b.put(str, Long.valueOf(j));
            return this;
        }

        @Override // com.p7700g.p99005.x31.a
        public void d() {
            if (this.d != null) {
                for (String str : this.a.keySet()) {
                    y31 y31Var = this.d;
                    String str2 = this.a.get(str);
                    Objects.requireNonNull(str2);
                    y31Var.l(str, str2);
                }
                for (String str3 : this.b.keySet()) {
                    Long l = this.b.get(str3);
                    if (l != null) {
                        this.d.k(str3, l.longValue());
                    }
                }
                for (String str4 : this.c) {
                    this.d.o(str4);
                }
                this.d = null;
            }
        }

        @Override // com.p7700g.p99005.x31.a
        @x1
        public x31.a e(@x1 String str, long j) {
            this.b.put(str, Long.valueOf(j));
            return this;
        }

        @Override // com.p7700g.p99005.x31.a
        @x1
        public x31.a remove(@x1 String str) {
            this.c.add(str);
            return this;
        }
    }

    /* compiled from: KeyValueStorageImpl.java */
    /* loaded from: classes.dex */
    public static class c implements z31 {
        @x1
        private final Context a;
        private final ContentObserver b;

        /* compiled from: KeyValueStorageImpl.java */
        /* loaded from: classes.dex */
        public class a extends ContentObserver {
            public final /* synthetic */ String a;
            public final /* synthetic */ c31 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Handler handler, String str, c31 c31Var) {
                super(handler);
                this.a = str;
                this.b = c31Var;
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z, @x1 Uri uri) {
                super.onChange(z, uri);
                String str = this.a;
                if (str == null || str.equals(uri.getLastPathSegment())) {
                    this.b.a(uri.getLastPathSegment());
                }
            }
        }

        @Override // com.p7700g.p99005.z31
        public void cancel() {
            this.a.getContentResolver().unregisterContentObserver(this.b);
        }

        private c(@x1 Context context, @x1 Uri uri, @x1 c31 c31Var, @z1 String str) {
            this.a = context;
            a aVar = new a(new Handler(Looper.getMainLooper()), str, c31Var);
            this.b = aVar;
            context.getContentResolver().registerContentObserver(uri, true, aVar);
        }
    }

    public y31(@x1 Context context) {
        this.b = context;
        StringBuilder G = wo1.G("content://");
        G.append(DBProvider.a(context));
        this.c = Uri.withAppendedPath(Uri.parse(G.toString()), DBProvider.s);
    }

    @x1
    private ContentResolver i() {
        return this.b.getContentResolver();
    }

    @x1
    private Uri j() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(@x1 String str, long j) {
        m(str, String.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void l(@x1 String str, @x1 String str2) {
        m(str, str2);
    }

    private void m(@x1 String str, @x1 String str2) {
        ContentResolver i = i();
        ContentValues contentValues = new ContentValues();
        contentValues.put(b31.t, str);
        contentValues.put(b31.u, str2);
        i.insert(j(), contentValues);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
        if (r8 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:
        if (r8 == null) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0046 A[Catch: all -> 0x004a, TRY_ENTER, TryCatch #4 {, blocks: (B:3:0x0001, B:14:0x0030, B:28:0x0046, B:29:0x0049), top: B:36:0x0001 }] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r6v2 */
    @z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized String n(@x1 String str) {
        Cursor cursor;
        String str2;
        ?? r6 = 0;
        str2 = null;
        str2 = null;
        str2 = null;
        str2 = null;
        try {
            try {
                cursor = i().query(j(), null, "_key=?", new String[]{str}, null);
                if (cursor != null) {
                    try {
                        if (cursor.moveToFirst()) {
                            str2 = cursor.getString(cursor.getColumnIndex(b31.u));
                        }
                    } catch (Exception e) {
                        e = e;
                        a.f(e);
                    }
                }
            } catch (Exception e2) {
                e = e2;
                cursor = null;
            } catch (Throwable th) {
                th = th;
                if (r6 != 0) {
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            r6 = str;
            if (r6 != 0) {
                r6.close();
            }
            throw th;
        }
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(@x1 String str) {
        i().delete(Uri.withAppendedPath(j(), str), "_key=?", new String[]{str});
    }

    @Override // com.p7700g.p99005.x31
    public long a(@x1 String str, long j) {
        String n = n(str);
        if (n == null) {
            return j;
        }
        try {
            return Long.parseLong(n);
        } catch (Exception e) {
            a.f(e);
            return j;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
        if (r7 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0040, code lost:
        if (r7 != null) goto L12;
     */
    @Override // com.p7700g.p99005.x31
    @x1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<String> b(@x1 String str) {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = i().query(j(), null, "_key like ?", new String[]{String.format(Locale.US, "%s%%", str)}, null);
                while (cursor != null) {
                    if (!cursor.moveToNext()) {
                        break;
                    }
                    arrayList.add(cursor.getString(cursor.getColumnIndex(b31.t)));
                }
            } catch (Exception e) {
                a.f(e);
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @Override // com.p7700g.p99005.x31
    @x1
    public x31.a c() {
        return new b(this);
    }

    @Override // com.p7700g.p99005.x31
    @x1
    public z31 d(@z1 String str, @x1 c31 c31Var) {
        return new c(this.b, j(), c31Var, str);
    }

    @Override // com.p7700g.p99005.x31
    @x1
    public synchronized String e(@x1 String str, @x1 String str2) {
        String n = n(str);
        if (n != null) {
            str2 = n;
        }
        return str2;
    }
}