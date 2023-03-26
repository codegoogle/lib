package com.anythink.core.common.res;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.anchorfree.hdr.AFHydra;
import com.anythink.core.common.b.m;
import com.anythink.core.common.j.f;
import com.anythink.core.common.res.image.a;
import java.io.FileInputStream;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class b {
    private static final String b = "ImageLoader";
    private static b c;
    public Context a;
    private Map<String, Integer> d;
    private c<String, SoftReference<Bitmap>> e;
    private final Object f = new Object();
    private LinkedHashMap<String, List<a>> g = new LinkedHashMap<>();

    /* renamed from: com.anythink.core.common.res.b$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ Bitmap a;
        public final /* synthetic */ a b;
        public final /* synthetic */ String c;

        public AnonymousClass1(Bitmap bitmap, a aVar, String str) {
            this.a = bitmap;
            this.b = aVar;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Bitmap bitmap = this.a;
            if (bitmap != null) {
                this.b.onSuccess(this.c, bitmap);
            } else {
                this.b.onFail(this.c, "Bitmap load fail");
            }
        }
    }

    /* renamed from: com.anythink.core.common.res.b$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 implements Runnable {
        public final /* synthetic */ a a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public AnonymousClass2(a aVar, String str, String str2) {
            this.a = aVar;
            this.b = str;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.a.onFail(this.b, this.c);
        }
    }

    /* loaded from: classes2.dex */
    public interface a {
        void onFail(String str, String str2);

        void onSuccess(String str, Bitmap bitmap);
    }

    private b(Context context) {
        this.a = context.getApplicationContext();
        int maxMemory = ((int) Runtime.getRuntime().maxMemory()) / 5;
        com.anythink.core.common.j.e.d(b, "ImageLoad init cache size: " + maxMemory + AFHydra.EV_BYTECOUNT);
        this.e = new c<String, SoftReference<Bitmap>>(maxMemory) { // from class: com.anythink.core.common.res.b.3
            @Override // com.anythink.core.common.res.c
            public final /* synthetic */ int a(String str, SoftReference<Bitmap> softReference) {
                String str2 = str;
                SoftReference<Bitmap> softReference2 = softReference;
                Bitmap bitmap = softReference2 != null ? softReference2.get() : null;
                if (b.this.d == null) {
                    b.this.d = new HashMap(8);
                }
                if (bitmap == null) {
                    Integer num = (Integer) b.this.d.get(str2);
                    if (num != null) {
                        return num.intValue();
                    }
                    return 0;
                }
                int height = bitmap.getHeight() * bitmap.getRowBytes();
                b.this.d.put(str2, Integer.valueOf(height));
                return height;
            }

            @Override // com.anythink.core.common.res.c
            public final /* synthetic */ void a(boolean z, String str, SoftReference<Bitmap> softReference, SoftReference<Bitmap> softReference2) {
                Bitmap bitmap;
                String str2 = str;
                SoftReference<Bitmap> softReference3 = softReference;
                SoftReference<Bitmap> softReference4 = softReference2;
                super.a(z, (boolean) str2, softReference3, softReference4);
                if (softReference3 != null) {
                    try {
                        bitmap = softReference3.get();
                    } catch (Exception unused) {
                        return;
                    }
                } else {
                    bitmap = null;
                }
                if (bitmap == null) {
                    com.anythink.core.common.j.e.d(b.b, "entryRemoved: Bitmap has been release.");
                }
                if (b.this.d != null) {
                    b.this.d.remove(str2);
                }
                if (softReference3 == null || softReference3.equals(softReference4) || bitmap == null || bitmap.isRecycled()) {
                    return;
                }
                bitmap.recycle();
                com.anythink.core.common.j.e.d(b.b, "entryRemoved: Bitmap recycle.");
            }

            /* renamed from: a  reason: avoid collision after fix types in other method */
            private int a2(String str, SoftReference<Bitmap> softReference) {
                Bitmap bitmap = softReference != null ? softReference.get() : null;
                if (b.this.d == null) {
                    b.this.d = new HashMap(8);
                }
                if (bitmap == null) {
                    Integer num = (Integer) b.this.d.get(str);
                    if (num != null) {
                        return num.intValue();
                    }
                    return 0;
                }
                int height = bitmap.getHeight() * bitmap.getRowBytes();
                b.this.d.put(str, Integer.valueOf(height));
                return height;
            }

            /* renamed from: a  reason: avoid collision after fix types in other method */
            private void a2(boolean z, String str, SoftReference<Bitmap> softReference, SoftReference<Bitmap> softReference2) {
                Bitmap bitmap;
                super.a(z, (boolean) str, softReference, softReference2);
                if (softReference != null) {
                    try {
                        bitmap = softReference.get();
                    } catch (Exception unused) {
                        return;
                    }
                } else {
                    bitmap = null;
                }
                if (bitmap == null) {
                    com.anythink.core.common.j.e.d(b.b, "entryRemoved: Bitmap has been release.");
                }
                if (b.this.d != null) {
                    b.this.d.remove(str);
                }
                if (softReference == null || softReference.equals(softReference2) || bitmap == null || bitmap.isRecycled()) {
                    return;
                }
                bitmap.recycle();
                com.anythink.core.common.j.e.d(b.b, "entryRemoved: Bitmap recycle.");
            }
        };
    }

    private void b(String str, Bitmap bitmap) {
        synchronized (this.g) {
            LinkedList linkedList = (LinkedList) this.g.remove(str);
            if (linkedList != null) {
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    a aVar = (a) it.next();
                    if (aVar != null) {
                        m.a().a(new AnonymousClass1(bitmap, aVar, str));
                    }
                }
            }
        }
    }

    private void a(String str, String str2) {
        synchronized (this.g) {
            LinkedList linkedList = (LinkedList) this.g.remove(str);
            if (linkedList != null) {
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    a aVar = (a) it.next();
                    if (aVar != null) {
                        m.a().a(new AnonymousClass2(aVar, str, str2));
                    }
                }
            }
        }
    }

    /* renamed from: com.anythink.core.common.res.b$5  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass5 implements a.InterfaceC0051a {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ e c;

        public AnonymousClass5(int i, int i2, e eVar) {
            this.a = i;
            this.b = i2;
            this.c = eVar;
        }

        @Override // com.anythink.core.common.res.image.a.InterfaceC0051a
        public final void a(e eVar) {
            com.anythink.core.common.j.e.d(b.b, "Load Success:" + eVar.e);
            Bitmap a = b.this.a(eVar, this.a, this.b);
            if (a != null) {
                b.this.a(eVar.e, a);
            }
            b.a(b.this, this.c.e, a);
        }

        @Override // com.anythink.core.common.res.image.a.InterfaceC0051a
        public final void a(e eVar, String str) {
            b.a(b.this, eVar.e, str);
        }
    }

    private void b(e eVar, int i, int i2, a aVar) {
        synchronized (this.g) {
            if (!this.g.containsKey(eVar.e)) {
                LinkedList linkedList = new LinkedList();
                linkedList.add(aVar);
                this.g.put(eVar.e, linkedList);
                com.anythink.core.common.res.image.a aVar2 = new com.anythink.core.common.res.image.a(eVar);
                aVar2.a(new AnonymousClass5(i, i2, eVar));
                aVar2.d();
            } else {
                LinkedList linkedList2 = (LinkedList) this.g.get(eVar.e);
                if (linkedList2 != null && !linkedList2.contains(aVar)) {
                    linkedList2.add(aVar);
                }
            }
        }
    }

    public final void a(String str, Bitmap bitmap) {
        if (a(str) != null || bitmap == null) {
            return;
        }
        this.e.b(str, new SoftReference<>(bitmap));
    }

    private Bitmap a(String str) {
        SoftReference<Bitmap> a2 = this.e.a((c<String, SoftReference<Bitmap>>) str);
        if (a2 != null) {
            return a2.get();
        }
        return null;
    }

    public final Bitmap a(e eVar, int i, int i2) {
        Bitmap bitmap = null;
        if (eVar == null || TextUtils.isEmpty(eVar.e)) {
            return null;
        }
        String a2 = f.a(eVar.e);
        if (i <= 0) {
            try {
                i = this.a.getResources().getDisplayMetrics().widthPixels;
            } catch (Throwable unused) {
            }
        }
        if (i2 <= 0) {
            i2 = this.a.getResources().getDisplayMetrics().heightPixels;
        }
        synchronized (this.f) {
            FileInputStream a3 = d.a(this.a).a(eVar.d, a2);
            if (a3 == null) {
                return null;
            }
            try {
                bitmap = com.anythink.core.common.j.b.a(a3.getFD(), i, i2);
            } catch (Throwable unused2) {
            }
            try {
                a3.close();
            } catch (Exception unused3) {
            }
            return bitmap;
        }
    }

    public static synchronized b a(Context context) {
        b bVar;
        synchronized (b.class) {
            if (c == null) {
                c = new b(context);
            }
            bVar = c;
        }
        return bVar;
    }

    public final void a(e eVar, a aVar) {
        a(eVar, -1, -1, aVar);
    }

    public final void a(final e eVar, final int i, final int i2, final a aVar) {
        if (eVar == null || TextUtils.isEmpty(eVar.e)) {
            if (aVar != null) {
                aVar.onFail("", "No url info.");
                return;
            }
            return;
        }
        Bitmap a2 = a(eVar.e);
        if (a2 != null) {
            aVar.onSuccess(eVar.e, a2);
        } else {
            com.anythink.core.common.j.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.res.b.4
                @Override // java.lang.Runnable
                public final void run() {
                    Bitmap a3 = b.this.a(eVar, i, i2);
                    if (a3 != null) {
                        com.anythink.core.common.j.e.a(b.b, "url image [" + eVar.e + "] is downloaded");
                        b.this.a(eVar.e, a3);
                        LinkedList linkedList = new LinkedList();
                        linkedList.add(aVar);
                        b.this.g.put(eVar.e, linkedList);
                        b.a(b.this, eVar.e, a3);
                        return;
                    }
                    b.a(b.this, eVar, i, i2, aVar);
                }
            });
        }
    }

    private void a() {
        try {
            c<String, SoftReference<Bitmap>> cVar = this.e;
            if (cVar != null) {
                cVar.a();
            }
            LinkedHashMap<String, List<a>> linkedHashMap = this.g;
            if (linkedHashMap != null) {
                linkedHashMap.clear();
            }
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ void a(b bVar, String str, Bitmap bitmap) {
        synchronized (bVar.g) {
            LinkedList linkedList = (LinkedList) bVar.g.remove(str);
            if (linkedList != null) {
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    a aVar = (a) it.next();
                    if (aVar != null) {
                        m.a().a(new AnonymousClass1(bitmap, aVar, str));
                    }
                }
            }
        }
    }

    public static /* synthetic */ void a(b bVar, e eVar, int i, int i2, a aVar) {
        synchronized (bVar.g) {
            if (!bVar.g.containsKey(eVar.e)) {
                LinkedList linkedList = new LinkedList();
                linkedList.add(aVar);
                bVar.g.put(eVar.e, linkedList);
                com.anythink.core.common.res.image.a aVar2 = new com.anythink.core.common.res.image.a(eVar);
                aVar2.a(new AnonymousClass5(i, i2, eVar));
                aVar2.d();
            } else {
                LinkedList linkedList2 = (LinkedList) bVar.g.get(eVar.e);
                if (linkedList2 != null && !linkedList2.contains(aVar)) {
                    linkedList2.add(aVar);
                }
            }
        }
    }

    public static /* synthetic */ void a(b bVar, String str, String str2) {
        synchronized (bVar.g) {
            LinkedList linkedList = (LinkedList) bVar.g.remove(str);
            if (linkedList != null) {
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    a aVar = (a) it.next();
                    if (aVar != null) {
                        m.a().a(new AnonymousClass2(aVar, str, str2));
                    }
                }
            }
        }
    }
}