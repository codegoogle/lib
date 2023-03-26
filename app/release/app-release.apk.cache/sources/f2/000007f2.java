package com.anythink.expressad.foundation.f;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.anythink.core.common.b.m;
import com.anythink.expressad.foundation.f.a.a;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.s;
import com.anythink.expressad.widget.FeedBackButton;
import com.anythink.expressad.widget.a.c;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class b {
    public static int a = -2;
    public static int b = -2;
    public static volatile boolean c = false;
    private final ConcurrentHashMap<String, com.anythink.expressad.foundation.f.a.a> d;
    private final RelativeLayout.LayoutParams e;
    private com.anythink.expressad.d.a f;

    /* loaded from: classes2.dex */
    public static class a {
        private static final b a = new b((byte) 0);
    }

    public /* synthetic */ b(byte b2) {
        this();
    }

    public static b a() {
        return a.a;
    }

    private static boolean b(Context context, c cVar) {
        Activity a2 = a(context);
        if (a2 == null || cVar == null || a2.isDestroyed()) {
            return false;
        }
        try {
            if (cVar.isShowing() || a2.isFinishing()) {
                return false;
            }
            cVar.show();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private void c(String str, int i) {
        com.anythink.expressad.foundation.f.a.a a2 = a(str);
        if (i == 1) {
            a2.b();
        } else {
            a2.a();
        }
    }

    private com.anythink.expressad.foundation.f.a.a d(String str) {
        if (TextUtils.isEmpty(str)) {
            str = com.anythink.expressad.foundation.b.a.b().e();
        }
        if (this.d.containsKey(str)) {
            return this.d.get(str);
        }
        return null;
    }

    private void e(String str) {
        a(str);
    }

    private b() {
        this.d = new ConcurrentHashMap<>();
        this.e = new RelativeLayout.LayoutParams(a, b);
    }

    public static Activity a(Context context) {
        Activity activity;
        Context h = com.anythink.expressad.foundation.b.a.b().h();
        Activity activity2 = null;
        try {
            Activity activity3 = h instanceof Activity ? (Activity) h : null;
            try {
                if ((context instanceof Activity) && !((Activity) context).isDestroyed()) {
                    activity3 = (Activity) context;
                }
                WeakReference<Activity> g = com.anythink.expressad.foundation.b.a.b().g();
                if (g != null && (activity = g.get()) != null && !activity.isFinishing() && !activity.isDestroyed()) {
                    activity3 = activity;
                }
                if (activity3 == null || activity3.isFinishing()) {
                    return null;
                }
                if (activity3.isDestroyed()) {
                    return null;
                }
                return activity3;
            } catch (Exception e) {
                e = e;
                activity2 = activity3;
                e.printStackTrace();
                return activity2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public final void c(String str) {
        try {
            String e = TextUtils.isEmpty(str) ? com.anythink.expressad.foundation.b.a.b().e() : str;
            com.anythink.expressad.foundation.f.a.a aVar = this.d.containsKey(e) ? this.d.get(e) : null;
            if (aVar != null) {
                aVar.d();
            }
            this.d.remove(str);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void b(String str, Context context, ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        a(str, context, viewGroup, layoutParams);
    }

    public final boolean b() {
        com.anythink.expressad.d.b.a();
        com.anythink.expressad.d.a c2 = com.anythink.expressad.d.b.c();
        this.f = c2;
        return c2.L() != 0;
    }

    public final void b(String str, int i) {
        a(str).c(i);
    }

    public final FeedBackButton b(String str) {
        return a(str).c();
    }

    public static boolean a(Context context, c cVar) {
        if (cVar == null) {
            n.b("", "mbAlertDialog  is null");
            return false;
        }
        return b(context, cVar);
    }

    private void a(String str, int i, ViewGroup viewGroup) {
        com.anythink.expressad.foundation.f.a.a a2 = a(str);
        if (a2.c() != null) {
            a2.a(i);
            if (i == 0) {
                a(str, m.a().e(), viewGroup, null);
            }
        }
    }

    private void a(String str, int i, int i2, int i3, float f, float f2, float f3, String str2, String str3) {
        com.anythink.expressad.foundation.f.a.a a2 = a(str);
        Context e = m.a().e();
        a2.a(s.b(e, f), s.b(e, f2), s.b(e, i), s.b(e, i2), s.b(e, i3), f3, str2, str3);
    }

    public final void a(String str, com.anythink.expressad.foundation.f.a aVar) {
        a(str).a(new a.C0062a(str, aVar));
    }

    public final void a(String str, Context context, ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        FeedBackButton c2;
        if (b() && (c2 = a(str).c()) != null) {
            if (layoutParams == null) {
                int b2 = s.b(m.a().e(), 10.0f);
                this.e.setMargins(b2, b2, b2, b2);
                layoutParams = this.e;
            }
            ViewGroup viewGroup2 = (ViewGroup) c2.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(c2);
            }
            Activity a2 = a(context);
            if (a2 != null && viewGroup == null) {
                viewGroup = (ViewGroup) a2.findViewById(16908290);
            }
            if (viewGroup != null) {
                viewGroup.removeView(c2);
                viewGroup.addView(c2, layoutParams);
            }
        }
    }

    public final void a(String str, com.anythink.expressad.foundation.d.c cVar) {
        a(str).a(cVar);
    }

    public final void a(String str, int i) {
        a(str).b(i);
    }

    public final com.anythink.expressad.foundation.f.a.a a(String str) {
        com.anythink.expressad.foundation.f.a.a aVar;
        if (TextUtils.isEmpty(str)) {
            str = com.anythink.expressad.foundation.b.a.b().e();
        }
        if (!this.d.containsKey(str)) {
            aVar = new com.anythink.expressad.foundation.f.a.a(str);
            this.d.put(str, aVar);
        } else {
            aVar = this.d.get(str);
        }
        if (aVar == null) {
            com.anythink.expressad.foundation.f.a.a aVar2 = new com.anythink.expressad.foundation.f.a.a(str);
            this.d.put(str, aVar2);
            return aVar2;
        }
        return aVar;
    }

    public final void a(String str, FeedBackButton feedBackButton) {
        a(str).a(feedBackButton);
    }
}