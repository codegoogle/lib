package com.p7700g.p99005;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.SparseArray;
import android.widget.RemoteViews;
import com.p7700g.p99005.d6;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.x5;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/* compiled from: CustomTabsIntent.java */
/* loaded from: classes.dex */
public final class a6 {
    public static final int A = 2;
    private static final int B = 2;
    public static final String C = "androidx.browser.customtabs.extra.SHARE_STATE";
    @Deprecated
    public static final String D = "android.support.customtabs.extra.SHARE_MENU_ITEM";
    public static final String E = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS";
    public static final String F = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS";
    public static final String G = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT";
    public static final String H = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_CLICKED_ID";
    public static final String I = "android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS";
    public static final String J = "androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS";
    public static final String K = "androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR";
    public static final String L = "androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR";
    public static final String M = "android.support.customtabs.customaction.ID";
    public static final int N = 0;
    private static final int O = 5;
    private static final String a = "android.support.customtabs.extra.user_opt_out";
    public static final String b = "android.support.customtabs.extra.SESSION";
    @i2({i2.a.LIBRARY})
    public static final String c = "android.support.customtabs.extra.SESSION_ID";
    public static final int d = 0;
    public static final int e = 1;
    public static final int f = 2;
    private static final int g = 2;
    public static final String h = "androidx.browser.customtabs.extra.COLOR_SCHEME";
    public static final String i = "android.support.customtabs.extra.TOOLBAR_COLOR";
    public static final String j = "android.support.customtabs.extra.ENABLE_URLBAR_HIDING";
    public static final String k = "android.support.customtabs.extra.CLOSE_BUTTON_ICON";
    public static final String l = "android.support.customtabs.extra.TITLE_VISIBILITY";
    public static final int m = 0;
    public static final int n = 1;
    public static final String o = "android.support.customtabs.extra.ACTION_BUTTON_BUNDLE";
    public static final String p = "android.support.customtabs.extra.TOOLBAR_ITEMS";
    public static final String q = "android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR";
    public static final String r = "android.support.customtabs.customaction.ICON";
    public static final String s = "android.support.customtabs.customaction.DESCRIPTION";
    public static final String t = "android.support.customtabs.customaction.PENDING_INTENT";
    public static final String u = "android.support.customtabs.extra.TINT_ACTION_BUTTON";
    public static final String v = "android.support.customtabs.extra.MENU_ITEMS";
    public static final String w = "android.support.customtabs.customaction.MENU_ITEM_TITLE";
    public static final String x = "android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE";
    public static final int y = 0;
    public static final int z = 1;
    @x1
    public final Intent P;
    @z1
    public final Bundle Q;

    /* compiled from: CustomTabsIntent.java */
    @i2({i2.a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface b {
    }

    /* compiled from: CustomTabsIntent.java */
    @i2({i2.a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface c {
    }

    public a6(@x1 Intent intent, @z1 Bundle bundle) {
        this.P = intent;
        this.Q = bundle;
    }

    @x1
    public static x5 a(@x1 Intent intent, int i2) {
        Bundle bundle;
        if (i2 >= 0 && i2 <= 2 && i2 != 0) {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                return x5.a(null);
            }
            x5 a2 = x5.a(extras);
            SparseArray sparseParcelableArray = extras.getSparseParcelableArray(J);
            return (sparseParcelableArray == null || (bundle = (Bundle) sparseParcelableArray.get(i2)) == null) ? a2 : x5.a(bundle).c(a2);
        }
        throw new IllegalArgumentException(wo1.l("Invalid colorScheme: ", i2));
    }

    public static int b() {
        return 5;
    }

    @x1
    public static Intent d(@z1 Intent intent) {
        if (intent == null) {
            intent = new Intent("android.intent.action.VIEW");
        }
        intent.addFlags(268435456);
        intent.putExtra(a, true);
        return intent;
    }

    public static boolean e(@x1 Intent intent) {
        return intent.getBooleanExtra(a, false) && (intent.getFlags() & 268435456) != 0;
    }

    public void c(@x1 Context context, @x1 Uri uri) {
        this.P.setData(uri);
        gh.t(context, this.P, this.Q);
    }

    /* compiled from: CustomTabsIntent.java */
    /* loaded from: classes.dex */
    public static final class a {
        @z1
        private ArrayList<Bundle> c;
        @z1
        private Bundle d;
        @z1
        private ArrayList<Bundle> e;
        @z1
        private SparseArray<Bundle> f;
        @z1
        private Bundle g;
        private final Intent a = new Intent("android.intent.action.VIEW");
        private final x5.a b = new x5.a();
        private int h = 0;
        private boolean i = true;

        public a() {
        }

        private void u(@z1 IBinder iBinder, @z1 PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            ag.b(bundle, a6.b, iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable(a6.c, pendingIntent);
            }
            this.a.putExtras(bundle);
        }

        @x1
        @Deprecated
        public a a() {
            v(1);
            return this;
        }

        @x1
        public a b(@x1 String str, @x1 PendingIntent pendingIntent) {
            if (this.c == null) {
                this.c = new ArrayList<>();
            }
            Bundle bundle = new Bundle();
            bundle.putString(a6.w, str);
            bundle.putParcelable(a6.t, pendingIntent);
            this.c.add(bundle);
            return this;
        }

        @x1
        @Deprecated
        public a c(int i, @x1 Bitmap bitmap, @x1 String str, @x1 PendingIntent pendingIntent) throws IllegalStateException {
            if (this.e == null) {
                this.e = new ArrayList<>();
            }
            if (this.e.size() < 5) {
                Bundle bundle = new Bundle();
                bundle.putInt(a6.M, i);
                bundle.putParcelable(a6.r, bitmap);
                bundle.putString(a6.s, str);
                bundle.putParcelable(a6.t, pendingIntent);
                this.e.add(bundle);
                return this;
            }
            throw new IllegalStateException("Exceeded maximum toolbar item count of 5");
        }

        @x1
        public a6 d() {
            if (!this.a.hasExtra(a6.b)) {
                u(null, null);
            }
            ArrayList<Bundle> arrayList = this.c;
            if (arrayList != null) {
                this.a.putParcelableArrayListExtra(a6.v, arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.e;
            if (arrayList2 != null) {
                this.a.putParcelableArrayListExtra(a6.p, arrayList2);
            }
            this.a.putExtra(a6.I, this.i);
            this.a.putExtras(this.b.a().b());
            Bundle bundle = this.g;
            if (bundle != null) {
                this.a.putExtras(bundle);
            }
            if (this.f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray(a6.J, this.f);
                this.a.putExtras(bundle2);
            }
            this.a.putExtra(a6.C, this.h);
            return new a6(this.a, this.d);
        }

        @x1
        @Deprecated
        public a e() {
            this.a.putExtra(a6.j, true);
            return this;
        }

        @x1
        public a f(@x1 Bitmap bitmap, @x1 String str, @x1 PendingIntent pendingIntent) {
            return g(bitmap, str, pendingIntent, false);
        }

        @x1
        public a g(@x1 Bitmap bitmap, @x1 String str, @x1 PendingIntent pendingIntent, boolean z) {
            Bundle bundle = new Bundle();
            bundle.putInt(a6.M, 0);
            bundle.putParcelable(a6.r, bitmap);
            bundle.putString(a6.s, str);
            bundle.putParcelable(a6.t, pendingIntent);
            this.a.putExtra(a6.o, bundle);
            this.a.putExtra(a6.u, z);
            return this;
        }

        @x1
        public a h(@x1 Bitmap bitmap) {
            this.a.putExtra(a6.k, bitmap);
            return this;
        }

        @x1
        public a i(int i) {
            if (i >= 0 && i <= 2) {
                this.a.putExtra(a6.h, i);
                return this;
            }
            throw new IllegalArgumentException("Invalid value for the colorScheme argument");
        }

        @x1
        public a j(int i, @x1 x5 x5Var) {
            if (i >= 0 && i <= 2 && i != 0) {
                if (this.f == null) {
                    this.f = new SparseArray<>();
                }
                this.f.put(i, x5Var.b());
                return this;
            }
            throw new IllegalArgumentException(wo1.l("Invalid colorScheme: ", i));
        }

        @x1
        public a k(@x1 x5 x5Var) {
            this.g = x5Var.b();
            return this;
        }

        @x1
        @Deprecated
        public a l(boolean z) {
            if (z) {
                v(1);
            } else {
                v(2);
            }
            return this;
        }

        @x1
        public a m(@x1 Context context, @l0 int i, @l0 int i2) {
            this.a.putExtra(a6.x, uf.d(context, i, i2).l());
            return this;
        }

        @x1
        public a n(boolean z) {
            this.i = z;
            return this;
        }

        @x1
        @Deprecated
        public a o(@w0 int i) {
            this.b.b(i);
            return this;
        }

        @x1
        @Deprecated
        public a p(@w0 int i) {
            this.b.c(i);
            return this;
        }

        @i2({i2.a.LIBRARY})
        @x1
        public a q(@x1 d6.b bVar) {
            u(null, bVar.b());
            return this;
        }

        @x1
        @Deprecated
        public a r(@w0 int i) {
            this.b.d(i);
            return this;
        }

        @x1
        public a s(@x1 RemoteViews remoteViews, @z1 int[] iArr, @z1 PendingIntent pendingIntent) {
            this.a.putExtra(a6.E, remoteViews);
            this.a.putExtra(a6.F, iArr);
            this.a.putExtra(a6.G, pendingIntent);
            return this;
        }

        @x1
        public a t(@x1 d6 d6Var) {
            this.a.setPackage(d6Var.e().getPackageName());
            u(d6Var.d(), d6Var.f());
            return this;
        }

        @x1
        public a v(int i) {
            if (i >= 0 && i <= 2) {
                this.h = i;
                if (i == 1) {
                    this.a.putExtra(a6.D, true);
                } else if (i == 2) {
                    this.a.putExtra(a6.D, false);
                } else {
                    this.a.removeExtra(a6.D);
                }
                return this;
            }
            throw new IllegalArgumentException("Invalid value for the shareState argument");
        }

        @x1
        public a w(boolean z) {
            this.a.putExtra(a6.l, z ? 1 : 0);
            return this;
        }

        @x1
        public a x(@x1 Context context, @l0 int i, @l0 int i2) {
            this.d = uf.d(context, i, i2).l();
            return this;
        }

        @x1
        @Deprecated
        public a y(@w0 int i) {
            this.b.e(i);
            return this;
        }

        @x1
        public a z(boolean z) {
            this.a.putExtra(a6.j, z);
            return this;
        }

        public a(@z1 d6 d6Var) {
            if (d6Var != null) {
                t(d6Var);
            }
        }
    }
}