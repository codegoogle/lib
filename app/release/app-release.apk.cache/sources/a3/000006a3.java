package com.anythink.core.common.j.a;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class f {
    public final int a;
    public final ViewTreeObserver.OnPreDrawListener b;
    private int c;
    private final ArrayList<View> d;
    private long e;
    private final Map<View, a> f;
    private final b g;
    private d h;
    private final c i;
    private final Handler j;
    private boolean k;

    /* loaded from: classes2.dex */
    public static class a {
        public int a;
        public int b;
        public long c;
        public View d;
        public Integer e;
    }

    /* loaded from: classes2.dex */
    public static class b {
        private final Rect a = new Rect();

        private static boolean a(long j, int i) {
            return SystemClock.uptimeMillis() - j >= ((long) i);
        }

        public final boolean a(View view, View view2, int i, Integer num) {
            if (view2 != null && view2.getVisibility() == 0 && view.getParent() != null && view2.getWindowVisibility() == 0 && view2.getGlobalVisibleRect(this.a)) {
                long height = this.a.height() * this.a.width();
                long height2 = view2.getHeight() * view2.getWidth();
                if (height2 <= 0) {
                    return false;
                }
                return (num == null || num.intValue() <= 0) ? height * 100 >= ((long) i) * height2 : height >= ((long) num.intValue());
            }
            return false;
        }
    }

    /* loaded from: classes2.dex */
    public class c implements Runnable {
        private final ArrayList<View> c = new ArrayList<>();
        private final ArrayList<View> b = new ArrayList<>();

        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            for (Map.Entry entry : f.this.f.entrySet()) {
                View view = (View) entry.getKey();
                int i = ((a) entry.getValue()).a;
                int i2 = ((a) entry.getValue()).b;
                Integer num = ((a) entry.getValue()).e;
                View view2 = ((a) entry.getValue()).d;
                if (!f.this.g.a(view2, view, i, num)) {
                    if (!f.this.g.a(view2, view, i2, null)) {
                        this.c.add(view);
                    }
                } else {
                    this.b.add(view);
                    try {
                        view.getViewTreeObserver().removeOnPreDrawListener(f.this.b);
                    } catch (Throwable unused) {
                    }
                }
            }
            if (f.this.h != null) {
                f.this.h.a(this.b);
            }
            this.b.clear();
            this.c.clear();
            f.this.k = false;
        }
    }

    /* loaded from: classes2.dex */
    public interface d {
        void a(List<View> list);
    }

    public f() {
        this(new WeakHashMap(10), new b(), new Handler(Looper.getMainLooper()));
    }

    public final void a(d dVar) {
        this.h = dVar;
    }

    public final void b() {
        a();
        this.h = null;
    }

    public final void c() {
        if (this.k) {
            return;
        }
        this.k = true;
        this.j.postDelayed(this.i, this.c);
    }

    private void a(View view, View view2, int i, Integer num) {
        a(view, view2, i, i, num);
    }

    public f(int i) {
        this(new WeakHashMap(10), new b(), new Handler(Looper.getMainLooper()));
        this.c = i;
    }

    public final void a(View view, View view2, int i, int i2, Integer num) {
        try {
            if (a(view2.getContext(), view2)) {
                a aVar = this.f.get(view2);
                if (aVar == null) {
                    aVar = new a();
                    this.f.put(view2, aVar);
                    c();
                }
                int min = Math.min(i2, i);
                aVar.d = view;
                aVar.a = i;
                aVar.b = min;
                aVar.c = this.e;
                aVar.e = num;
                view2.getViewTreeObserver().addOnPreDrawListener(this.b);
                long j = this.e + 1;
                this.e = j;
                if (j % 50 == 0) {
                    a(j - 50);
                }
            }
        } catch (Throwable unused) {
        }
    }

    private f(Map<View, a> map, b bVar, Handler handler) {
        this.c = 500;
        this.a = 50;
        this.e = 0L;
        this.f = map;
        this.g = bVar;
        this.j = handler;
        this.i = new c();
        this.d = new ArrayList<>(50);
        this.b = new ViewTreeObserver.OnPreDrawListener() { // from class: com.anythink.core.common.j.a.f.1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                f.this.c();
                return true;
            }
        };
    }

    private void a(long j) {
        for (Map.Entry<View, a> entry : this.f.entrySet()) {
            if (entry.getValue().c < j) {
                this.d.add(entry.getKey());
            }
        }
        Iterator<View> it = this.d.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        this.d.clear();
    }

    public final void a(View view) {
        this.f.remove(view);
    }

    public final void a() {
        this.f.clear();
        this.j.removeMessages(0);
        this.k = false;
    }

    private static boolean a(Context context, View view) {
        View rootView;
        View view2 = null;
        View findViewById = !(context instanceof Activity) ? null : ((Activity) context).getWindow().getDecorView().findViewById(16908290);
        if (view != null && (rootView = view.getRootView()) != null && (view2 = rootView.findViewById(16908290)) == null) {
            view2 = rootView;
        }
        if (findViewById == null) {
            findViewById = view2;
        }
        if (findViewById == null) {
            com.anythink.core.common.j.e.a("VisibilityTracker", "Unable to set Visibility Tracker due to no available root view.");
            return false;
        } else if (findViewById.getViewTreeObserver().isAlive()) {
            return true;
        } else {
            com.anythink.core.common.j.e.c("VisibilityTracker", "Visibility Tracker was unable to track views because the root view tree observer was not alive");
            return false;
        }
    }

    private void a(View view, int i, Integer num) {
        a(view, view, i, i, num);
    }
}