package com.p7700g.p99005;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.core.graphics.drawable.IconCompat;
import com.p7700g.p99005.ai;
import com.p7700g.p99005.bi;
import com.p7700g.p99005.i2;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: ShortcutManagerCompat.java */
/* loaded from: classes.dex */
public class ci {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 4;
    public static final int d = 8;
    @r2
    public static final String e = "com.android.launcher.action.INSTALL_SHORTCUT";
    @r2
    public static final String f = "com.android.launcher.permission.INSTALL_SHORTCUT";
    private static final int g = 96;
    private static final int h = 48;
    public static final String i = "android.intent.extra.shortcut.ID";
    private static volatile bi<?> j = null;
    private static volatile List<zh> k = null;
    private static final String l = "androidx.core.content.pm.SHORTCUT_LISTENER";
    private static final String m = "androidx.core.content.pm.shortcut_listener_impl";

    /* compiled from: ShortcutManagerCompat.java */
    /* loaded from: classes.dex */
    public class a extends BroadcastReceiver {
        public final /* synthetic */ IntentSender a;

        public a(IntentSender intentSender) {
            this.a = intentSender;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                this.a.sendIntent(context, 0, null, null, null);
            } catch (IntentSender.SendIntentException unused) {
            }
        }
    }

    /* compiled from: ShortcutManagerCompat.java */
    @e2(25)
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        public static String a(@x1 List<ShortcutInfo> list) {
            int i = -1;
            String str = null;
            for (ShortcutInfo shortcutInfo : list) {
                if (shortcutInfo.getRank() > i) {
                    str = shortcutInfo.getId();
                    i = shortcutInfo.getRank();
                }
            }
            return str;
        }
    }

    /* compiled from: ShortcutManagerCompat.java */
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface c {
    }

    private ci() {
    }

    @r2
    public static void A(List<zh> list) {
        k = list;
    }

    @r2
    public static void B(bi<Void> biVar) {
        j = biVar;
    }

    public static boolean C(@x1 Context context, @x1 List<ai> list) {
        List<ai> w = w(list, 1);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 <= 29) {
            c(context, w);
        }
        if (i2 >= 25) {
            ArrayList arrayList = new ArrayList();
            for (ai aiVar : w) {
                arrayList.add(aiVar.H());
            }
            if (!((ShortcutManager) context.getSystemService(ShortcutManager.class)).updateShortcuts(arrayList)) {
                return false;
            }
        }
        o(context).a(w);
        for (zh zhVar : n(context)) {
            zhVar.d(list);
        }
        return true;
    }

    public static boolean a(@x1 Context context, @x1 List<ai> list) {
        List<ai> w = w(list, 1);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 <= 29) {
            c(context, w);
        }
        if (i2 >= 25) {
            ArrayList arrayList = new ArrayList();
            for (ai aiVar : w) {
                arrayList.add(aiVar.H());
            }
            if (!((ShortcutManager) context.getSystemService(ShortcutManager.class)).addDynamicShortcuts(arrayList)) {
                return false;
            }
        }
        o(context).a(w);
        for (zh zhVar : n(context)) {
            zhVar.b(list);
        }
        return true;
    }

    @r2
    public static boolean b(@x1 Context context, @x1 ai aiVar) {
        Bitmap decodeStream;
        IconCompat t;
        IconCompat iconCompat = aiVar.o;
        if (iconCompat == null) {
            return false;
        }
        int i2 = iconCompat.x;
        if (i2 == 6 || i2 == 4) {
            InputStream F = iconCompat.F(context);
            if (F == null || (decodeStream = BitmapFactory.decodeStream(F)) == null) {
                return false;
            }
            if (i2 == 6) {
                t = IconCompat.q(decodeStream);
            } else {
                t = IconCompat.t(decodeStream);
            }
            aiVar.o = t;
            return true;
        }
        return true;
    }

    @r2
    public static void c(@x1 Context context, @x1 List<ai> list) {
        Iterator it = new ArrayList(list).iterator();
        while (it.hasNext()) {
            ai aiVar = (ai) it.next();
            if (!b(context, aiVar)) {
                list.remove(aiVar);
            }
        }
    }

    @x1
    public static Intent d(@x1 Context context, @x1 ai aiVar) {
        Intent createShortcutResultIntent = Build.VERSION.SDK_INT >= 26 ? ((ShortcutManager) context.getSystemService(ShortcutManager.class)).createShortcutResultIntent(aiVar.H()) : null;
        if (createShortcutResultIntent == null) {
            createShortcutResultIntent = new Intent();
        }
        return aiVar.a(createShortcutResultIntent);
    }

    public static void e(@x1 Context context, @x1 List<String> list, @z1 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 25) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).disableShortcuts(list, charSequence);
        }
        o(context).d(list);
        for (zh zhVar : n(context)) {
            zhVar.c(list);
        }
    }

    public static void f(@x1 Context context, @x1 List<ai> list) {
        List<ai> w = w(list, 1);
        if (Build.VERSION.SDK_INT >= 25) {
            ArrayList arrayList = new ArrayList(list.size());
            for (ai aiVar : w) {
                arrayList.add(aiVar.h);
            }
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).enableShortcuts(arrayList);
        }
        o(context).a(w);
        for (zh zhVar : n(context)) {
            zhVar.b(list);
        }
    }

    @x1
    public static List<ai> g(@x1 Context context) {
        if (Build.VERSION.SDK_INT >= 25) {
            List<ShortcutInfo> dynamicShortcuts = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getDynamicShortcuts();
            ArrayList arrayList = new ArrayList(dynamicShortcuts.size());
            for (ShortcutInfo shortcutInfo : dynamicShortcuts) {
                arrayList.add(new ai.a(context, shortcutInfo).c());
            }
            return arrayList;
        }
        try {
            return o(context).b();
        } catch (Exception unused) {
            return new ArrayList();
        }
    }

    private static int h(@x1 Context context, boolean z) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        int max = Math.max(1, activityManager == null || activityManager.isLowRamDevice() ? 48 : 96);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return (int) (max * ((z ? displayMetrics.xdpi : displayMetrics.ydpi) / 160.0f));
    }

    public static int i(@x1 Context context) {
        jp.l(context);
        if (Build.VERSION.SDK_INT >= 25) {
            return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getIconMaxHeight();
        }
        return h(context, false);
    }

    public static int j(@x1 Context context) {
        jp.l(context);
        if (Build.VERSION.SDK_INT >= 25) {
            return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getIconMaxWidth();
        }
        return h(context, true);
    }

    public static int k(@x1 Context context) {
        jp.l(context);
        if (Build.VERSION.SDK_INT >= 25) {
            return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getMaxShortcutCountPerActivity();
        }
        return 5;
    }

    @r2
    public static List<zh> l() {
        return k;
    }

    private static String m(@x1 List<ai> list) {
        int i2 = -1;
        String str = null;
        for (ai aiVar : list) {
            if (aiVar.v() > i2) {
                str = aiVar.k();
                i2 = aiVar.v();
            }
        }
        return str;
    }

    private static List<zh> n(Context context) {
        Bundle bundle;
        String string;
        if (k == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent(l);
            intent.setPackage(context.getPackageName());
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 128)) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (activityInfo != null && (bundle = activityInfo.metaData) != null && (string = bundle.getString(m)) != null) {
                    try {
                        arrayList.add((zh) Class.forName(string, false, ci.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context));
                    } catch (Exception unused) {
                    }
                }
            }
            if (k == null) {
                k = arrayList;
            }
        }
        return k;
    }

    private static bi<?> o(Context context) {
        if (j == null) {
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    j = (bi) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, ci.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
                } catch (Exception unused) {
                }
            }
            if (j == null) {
                j = new bi.a();
            }
        }
        return j;
    }

    @x1
    public static List<ai> p(@x1 Context context, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30) {
            return ai.c(context, ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getShortcuts(i2));
        }
        if (i3 >= 25) {
            ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
            ArrayList arrayList = new ArrayList();
            if ((i2 & 1) != 0) {
                arrayList.addAll(shortcutManager.getManifestShortcuts());
            }
            if ((i2 & 2) != 0) {
                arrayList.addAll(shortcutManager.getDynamicShortcuts());
            }
            if ((i2 & 4) != 0) {
                arrayList.addAll(shortcutManager.getPinnedShortcuts());
            }
            return ai.c(context, arrayList);
        }
        if ((i2 & 2) != 0) {
            try {
                return o(context).b();
            } catch (Exception unused) {
            }
        }
        return Collections.emptyList();
    }

    public static boolean q(@x1 Context context) {
        jp.l(context);
        if (Build.VERSION.SDK_INT >= 25) {
            return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).isRateLimitingActive();
        }
        return p(context, 3).size() == k(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean r(@x1 Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).isRequestPinShortcutSupported();
        }
        if (gh.a(context, f) != 0) {
            return false;
        }
        for (ResolveInfo resolveInfo : context.getPackageManager().queryBroadcastReceivers(new Intent(e), 0)) {
            String str = resolveInfo.activityInfo.permission;
            if (TextUtils.isEmpty(str) || f.equals(str)) {
                return true;
            }
            while (r4.hasNext()) {
            }
        }
        return false;
    }

    public static boolean s(@x1 Context context, @x1 ai aiVar) {
        jp.l(context);
        jp.l(aiVar);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 <= 31 && aiVar.E(1)) {
            for (zh zhVar : n(context)) {
                zhVar.b(Collections.singletonList(aiVar));
            }
            return true;
        }
        int k2 = k(context);
        if (k2 == 0) {
            return false;
        }
        if (i2 <= 29) {
            b(context, aiVar);
        }
        if (i2 >= 30) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).pushDynamicShortcut(aiVar.H());
        } else if (i2 >= 25) {
            ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
            if (shortcutManager.isRateLimitingActive()) {
                return false;
            }
            List<ShortcutInfo> dynamicShortcuts = shortcutManager.getDynamicShortcuts();
            if (dynamicShortcuts.size() >= k2) {
                shortcutManager.removeDynamicShortcuts(Arrays.asList(b.a(dynamicShortcuts)));
            }
            shortcutManager.addDynamicShortcuts(Arrays.asList(aiVar.H()));
        }
        bi<?> o = o(context);
        try {
            List<ai> b2 = o.b();
            if (b2.size() >= k2) {
                o.d(Arrays.asList(m(b2)));
            }
            o.a(Arrays.asList(aiVar));
            for (zh zhVar2 : n(context)) {
                zhVar2.b(Collections.singletonList(aiVar));
            }
            x(context, aiVar.k());
            return true;
        } catch (Exception unused) {
            for (zh zhVar3 : n(context)) {
                zhVar3.b(Collections.singletonList(aiVar));
            }
            x(context, aiVar.k());
            return false;
        } catch (Throwable th) {
            for (zh zhVar4 : n(context)) {
                zhVar4.b(Collections.singletonList(aiVar));
            }
            x(context, aiVar.k());
            throw th;
        }
    }

    public static void t(@x1 Context context) {
        if (Build.VERSION.SDK_INT >= 25) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeAllDynamicShortcuts();
        }
        o(context).c();
        for (zh zhVar : n(context)) {
            zhVar.a();
        }
    }

    public static void u(@x1 Context context, @x1 List<String> list) {
        if (Build.VERSION.SDK_INT >= 25) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeDynamicShortcuts(list);
        }
        o(context).d(list);
        for (zh zhVar : n(context)) {
            zhVar.c(list);
        }
    }

    public static void v(@x1 Context context, @x1 List<String> list) {
        if (Build.VERSION.SDK_INT < 30) {
            u(context, list);
            return;
        }
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeLongLivedShortcuts(list);
        o(context).d(list);
        for (zh zhVar : n(context)) {
            zhVar.c(list);
        }
    }

    @x1
    private static List<ai> w(@x1 List<ai> list, int i2) {
        Objects.requireNonNull(list);
        if (Build.VERSION.SDK_INT > 31) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        for (ai aiVar : list) {
            if (aiVar.E(i2)) {
                arrayList.remove(aiVar);
            }
        }
        return arrayList;
    }

    public static void x(@x1 Context context, @x1 String str) {
        jp.l(context);
        jp.l(str);
        if (Build.VERSION.SDK_INT >= 25) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).reportShortcutUsed(str);
        }
        for (zh zhVar : n(context)) {
            zhVar.e(Collections.singletonList(str));
        }
    }

    public static boolean y(@x1 Context context, @x1 ai aiVar, @z1 IntentSender intentSender) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 > 31 || !aiVar.E(1)) {
            if (i2 >= 26) {
                return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).requestPinShortcut(aiVar.H(), intentSender);
            }
            if (r(context)) {
                Intent a2 = aiVar.a(new Intent(e));
                if (intentSender == null) {
                    context.sendBroadcast(a2);
                    return true;
                }
                context.sendOrderedBroadcast(a2, null, new a(intentSender), null, -1, null, null);
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean z(@x1 Context context, @x1 List<ai> list) {
        jp.l(context);
        jp.l(list);
        List<ai> w = w(list, 1);
        if (Build.VERSION.SDK_INT >= 25) {
            ArrayList arrayList = new ArrayList(w.size());
            for (ai aiVar : w) {
                arrayList.add(aiVar.H());
            }
            if (!((ShortcutManager) context.getSystemService(ShortcutManager.class)).setDynamicShortcuts(arrayList)) {
                return false;
            }
        }
        o(context).c();
        o(context).a(w);
        for (zh zhVar : n(context)) {
            zhVar.a();
            zhVar.b(list);
        }
        return true;
    }
}