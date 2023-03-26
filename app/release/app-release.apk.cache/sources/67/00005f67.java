package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.p7700g.p99005.i2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: BrowserActionsIntent.java */
@Deprecated
/* loaded from: classes.dex */
public class u5 {
    private static final String a = "BrowserActions";
    private static final String b = "https://www.example.com";
    public static final String c = "androidx.browser.browseractions.APP_ID";
    public static final String d = "androidx.browser.browseractions.browser_action_open";
    public static final String e = "androidx.browser.browseractions.ICON_ID";
    private static final String f = "androidx.browser.browseractions.ICON_URI";
    public static final String g = "androidx.browser.browseractions.TITLE";
    public static final String h = "androidx.browser.browseractions.ACTION";
    public static final String i = "androidx.browser.browseractions.extra.TYPE";
    public static final String j = "androidx.browser.browseractions.extra.MENU_ITEMS";
    public static final String k = "androidx.browser.browseractions.extra.SELECTED_ACTION_PENDING_INTENT";
    @SuppressLint({"MinMaxConstant"})
    public static final int l = 5;
    public static final int m = 0;
    public static final int n = 1;
    public static final int o = 2;
    public static final int p = 3;
    public static final int q = 4;
    public static final int r = 5;
    public static final int s = -1;
    public static final int t = 0;
    public static final int u = 1;
    public static final int v = 2;
    public static final int w = 3;
    public static final int x = 4;
    @z1
    private static a y;
    @x1
    private final Intent z;

    /* compiled from: BrowserActionsIntent.java */
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @r2
    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    /* compiled from: BrowserActionsIntent.java */
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface b {
    }

    /* compiled from: BrowserActionsIntent.java */
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface c {
    }

    /* compiled from: BrowserActionsIntent.java */
    /* loaded from: classes.dex */
    public static final class d {
        private Context b;
        private Uri c;
        private final Intent a = new Intent(u5.d);
        private int d = 0;
        private ArrayList<Bundle> e = new ArrayList<>();
        @z1
        private PendingIntent f = null;
        private List<Uri> g = new ArrayList();

        public d(@x1 Context context, @x1 Uri uri) {
            this.b = context;
            this.c = uri;
        }

        @x1
        private Bundle b(@x1 q5 q5Var) {
            Bundle bundle = new Bundle();
            bundle.putString(u5.g, q5Var.e());
            bundle.putParcelable(u5.h, q5Var.a());
            if (q5Var.b() != 0) {
                bundle.putInt(u5.e, q5Var.b());
            }
            if (q5Var.c() != null) {
                bundle.putParcelable(u5.f, q5Var.c());
            }
            return bundle;
        }

        @x1
        public u5 a() {
            this.a.setData(this.c);
            this.a.putExtra(u5.i, this.d);
            this.a.putParcelableArrayListExtra(u5.j, this.e);
            this.a.putExtra(u5.c, PendingIntent.getActivity(this.b, 0, new Intent(), 67108864));
            PendingIntent pendingIntent = this.f;
            if (pendingIntent != null) {
                this.a.putExtra(u5.k, pendingIntent);
            }
            v5.k(this.a, this.g, this.b);
            return new u5(this.a);
        }

        @x1
        public d c(@x1 ArrayList<q5> arrayList) {
            if (arrayList.size() <= 5) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (!TextUtils.isEmpty(arrayList.get(i).e()) && arrayList.get(i).a() != null) {
                        this.e.add(b(arrayList.get(i)));
                        if (arrayList.get(i).c() != null) {
                            this.g.add(arrayList.get(i).c());
                        }
                    } else {
                        throw new IllegalArgumentException("Custom item should contain a non-empty title and non-null intent.");
                    }
                }
                return this;
            }
            throw new IllegalStateException("Exceeded maximum toolbar item count of 5");
        }

        @x1
        public d d(@x1 q5... q5VarArr) {
            return c(new ArrayList<>(Arrays.asList(q5VarArr)));
        }

        @x1
        public d e(@x1 PendingIntent pendingIntent) {
            this.f = pendingIntent;
            return this;
        }

        @x1
        public d f(int i) {
            this.d = i;
            return this;
        }
    }

    public u5(@x1 Intent intent) {
        this.z = intent;
    }

    @i2({i2.a.LIBRARY})
    @x1
    public static List<ResolveInfo> a(@x1 Context context) {
        return context.getPackageManager().queryIntentActivities(new Intent(d, Uri.parse(b)), 131072);
    }

    @z1
    @Deprecated
    public static String b(@x1 Intent intent) {
        return d(intent);
    }

    @z1
    public static String d(@x1 Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra(c);
        if (pendingIntent != null) {
            return pendingIntent.getCreatorPackage();
        }
        return null;
    }

    public static void e(@x1 Context context, @x1 Intent intent) {
        f(context, intent, a(context));
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @r2
    public static void f(Context context, Intent intent, List<ResolveInfo> list) {
        if (list != null && list.size() != 0) {
            int i2 = 0;
            if (list.size() == 1) {
                intent.setPackage(list.get(0).activityInfo.packageName);
            } else {
                ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(b)), 65536);
                if (resolveActivity != null) {
                    String str = resolveActivity.activityInfo.packageName;
                    while (true) {
                        if (i2 >= list.size()) {
                            break;
                        } else if (str.equals(list.get(i2).activityInfo.packageName)) {
                            intent.setPackage(str);
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
            gh.t(context, intent, null);
            return;
        }
        i(context, intent);
    }

    public static void g(@x1 Context context, @x1 Uri uri) {
        e(context, new d(context, uri).a().c());
    }

    public static void h(@x1 Context context, @x1 Uri uri, int i2, @x1 ArrayList<q5> arrayList, @x1 PendingIntent pendingIntent) {
        e(context, new d(context, uri).f(i2).c(arrayList).e(pendingIntent).a().c());
    }

    private static void i(Context context, Intent intent) {
        Uri data = intent.getData();
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra(j);
        j(context, data, parcelableArrayListExtra != null ? k(parcelableArrayListExtra) : null);
    }

    private static void j(Context context, Uri uri, List<q5> list) {
        new t5(context, uri, list).e();
        a aVar = y;
        if (aVar != null) {
            aVar.a();
        }
    }

    @x1
    public static List<q5> k(@x1 ArrayList<Bundle> arrayList) {
        q5 q5Var;
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Bundle bundle = arrayList.get(i2);
            String string = bundle.getString(g);
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(h);
            int i3 = bundle.getInt(e);
            Uri uri = (Uri) bundle.getParcelable(f);
            if (!TextUtils.isEmpty(string) && pendingIntent != null) {
                if (i3 != 0) {
                    q5Var = new q5(string, pendingIntent, i3);
                } else {
                    q5Var = new q5(string, pendingIntent, uri);
                }
                arrayList2.add(q5Var);
            } else {
                throw new IllegalArgumentException("Custom item should contain a non-empty title and non-null intent.");
            }
        }
        return arrayList2;
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @r2
    public static void l(a aVar) {
        y = aVar;
    }

    @x1
    public Intent c() {
        return this.z;
    }
}