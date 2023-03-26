package com.anythink.expressad.video.dynview.h.a;

import android.graphics.Bitmap;
import android.view.View;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.video.dynview.c;
import com.anythink.expressad.video.dynview.f.a;
import com.anythink.expressad.video.dynview.h.b;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class a {
    private static volatile a a;
    private View b;
    private Bitmap c;
    private Bitmap d;

    private a() {
    }

    public static a a() {
        a aVar;
        if (a == null) {
            synchronized (a.class) {
                if (a == null) {
                    a = new a();
                }
                aVar = a;
            }
            return aVar;
        }
        return a;
    }

    public final void b() {
        if (this.b != null) {
            this.b = null;
        }
        Bitmap bitmap = this.c;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.c.recycle();
            this.c = null;
        }
        Bitmap bitmap2 = this.d;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        this.d.recycle();
        this.d = null;
    }

    public final void a(Map map, c cVar, View view) {
        Bitmap bitmap;
        List<com.anythink.expressad.foundation.d.c> g;
        this.b = view;
        int e = cVar.e();
        float d = cVar.d();
        float c = cVar.c();
        if (map != null && map.size() > 1 && (g = cVar.g()) != null && g.size() > 1) {
            if (map.get(o.a(g.get(0).be())) != null && (map.get(o.a(g.get(0).be())) instanceof Bitmap)) {
                Bitmap bitmap2 = (Bitmap) map.get(o.a(g.get(0).be()));
                if (g.get(0) != null && bitmap2 != null && !bitmap2.isRecycled()) {
                    b.a();
                    this.c = b.a(bitmap2, 0);
                }
            }
            if (map.get(o.a(g.get(1).be())) != null && (map.get(o.a(g.get(1).be())) instanceof Bitmap)) {
                Bitmap bitmap3 = (Bitmap) map.get(o.a(g.get(1).be()));
                if (g.get(1) != null && !bitmap3.isRecycled()) {
                    b.a();
                    this.d = b.a(bitmap3, 1);
                }
            }
        }
        Bitmap bitmap4 = this.c;
        if (bitmap4 == null || bitmap4.isRecycled() || (bitmap = this.d) == null || bitmap.isRecycled()) {
            return;
        }
        a(e, d, c, this.c, this.d);
    }

    private synchronized void a(int i, float f, float f2, Bitmap bitmap, Bitmap bitmap2) {
        a.C0079a a2 = com.anythink.expressad.video.dynview.f.a.a();
        a2.a(i).a(bitmap).b(bitmap2);
        if (i != 2) {
            a2.a(f).b(f2);
        } else if (f > f2) {
            a2.a(f).b(f2);
        } else {
            a2.a(f2).b(f);
        }
        this.b.setBackgroundDrawable(a2.b());
    }
}