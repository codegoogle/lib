package com.p7700g.p99005;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import com.p7700g.p99005.rs2;
import java.util.WeakHashMap;

/* compiled from: DisplayManagerCompat.java */
/* loaded from: classes.dex */
public final class qk {
    private static final WeakHashMap<Context, qk> a = new WeakHashMap<>();
    public static final String b = "android.hardware.display.category.PRESENTATION";
    private final Context c;

    /* compiled from: DisplayManagerCompat.java */
    @e2(17)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static Display a(DisplayManager displayManager, int i) {
            return displayManager.getDisplay(i);
        }

        @e1
        public static Display[] b(DisplayManager displayManager) {
            return displayManager.getDisplays();
        }
    }

    private qk(Context context) {
        this.c = context;
    }

    @x1
    public static qk d(@x1 Context context) {
        qk qkVar;
        WeakHashMap<Context, qk> weakHashMap = a;
        synchronized (weakHashMap) {
            qkVar = weakHashMap.get(context);
            if (qkVar == null) {
                qkVar = new qk(context);
                weakHashMap.put(context, qkVar);
            }
        }
        return qkVar;
    }

    @z1
    public Display a(int i) {
        return a.a((DisplayManager) this.c.getSystemService(rs2.f.a.v0), i);
    }

    @x1
    public Display[] b() {
        return a.b((DisplayManager) this.c.getSystemService(rs2.f.a.v0));
    }

    @x1
    public Display[] c(@z1 String str) {
        return a.b((DisplayManager) this.c.getSystemService(rs2.f.a.v0));
    }
}