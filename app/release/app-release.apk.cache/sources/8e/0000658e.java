package com.p7700g.p99005;

import android.app.Activity;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Html;
import android.text.Spanned;
import android.view.ActionProvider;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ShareActionProvider;
import com.microsoft.appcenter.AppCenter;
import java.util.ArrayList;

/* compiled from: ShareCompat.java */
/* loaded from: classes.dex */
public final class xg {
    public static final String a = "androidx.core.app.EXTRA_CALLING_PACKAGE";
    public static final String b = "android.support.v4.app.EXTRA_CALLING_PACKAGE";
    public static final String c = "androidx.core.app.EXTRA_CALLING_ACTIVITY";
    public static final String d = "android.support.v4.app.EXTRA_CALLING_ACTIVITY";
    private static final String e = ".sharecompat_";

    /* compiled from: ShareCompat.java */
    @e2(16)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static String a(CharSequence charSequence) {
            return Html.escapeHtml(charSequence);
        }

        @e1
        public static void b(@x1 Intent intent, @x1 ArrayList<Uri> arrayList) {
            ClipData clipData = new ClipData(null, new String[]{intent.getType()}, new ClipData.Item(intent.getCharSequenceExtra("android.intent.extra.TEXT"), intent.getStringExtra(jh.b), null, arrayList.get(0)));
            int size = arrayList.size();
            for (int i = 1; i < size; i++) {
                clipData.addItem(new ClipData.Item(arrayList.get(i)));
            }
            intent.setClipData(clipData);
            intent.addFlags(1);
        }

        @e1
        public static void c(@x1 Intent intent) {
            intent.setClipData(null);
            intent.setFlags(intent.getFlags() & (-2));
        }
    }

    /* compiled from: ShareCompat.java */
    /* loaded from: classes.dex */
    public static class b {
        @x1
        private final Context a;
        @x1
        private final Intent b;
        @z1
        private CharSequence c;
        @z1
        private ArrayList<String> d;
        @z1
        private ArrayList<String> e;
        @z1
        private ArrayList<String> f;
        @z1
        private ArrayList<Uri> g;

        public b(@x1 Context context) {
            Activity activity;
            this.a = (Context) jp.l(context);
            Intent action = new Intent().setAction("android.intent.action.SEND");
            this.b = action;
            action.putExtra(xg.a, context.getPackageName());
            action.putExtra(xg.b, context.getPackageName());
            action.addFlags(524288);
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity != null) {
                ComponentName componentName = activity.getComponentName();
                this.b.putExtra(xg.c, componentName);
                this.b.putExtra(xg.d, componentName);
            }
        }

        private void h(String str, ArrayList<String> arrayList) {
            String[] stringArrayExtra = this.b.getStringArrayExtra(str);
            int length = stringArrayExtra != null ? stringArrayExtra.length : 0;
            String[] strArr = new String[arrayList.size() + length];
            arrayList.toArray(strArr);
            if (stringArrayExtra != null) {
                System.arraycopy(stringArrayExtra, 0, strArr, arrayList.size(), length);
            }
            this.b.putExtra(str, strArr);
        }

        private void i(@z1 String str, @x1 String[] strArr) {
            Intent m = m();
            String[] stringArrayExtra = m.getStringArrayExtra(str);
            int length = stringArrayExtra != null ? stringArrayExtra.length : 0;
            String[] strArr2 = new String[strArr.length + length];
            if (stringArrayExtra != null) {
                System.arraycopy(stringArrayExtra, 0, strArr2, 0, length);
            }
            System.arraycopy(strArr, 0, strArr2, length, strArr.length);
            m.putExtra(str, strArr2);
        }

        @x1
        @Deprecated
        public static b k(@x1 Activity activity) {
            return new b(activity);
        }

        @x1
        public b a(@x1 String str) {
            if (this.f == null) {
                this.f = new ArrayList<>();
            }
            this.f.add(str);
            return this;
        }

        @x1
        public b b(@x1 String[] strArr) {
            i("android.intent.extra.BCC", strArr);
            return this;
        }

        @x1
        public b c(@x1 String str) {
            if (this.e == null) {
                this.e = new ArrayList<>();
            }
            this.e.add(str);
            return this;
        }

        @x1
        public b d(@x1 String[] strArr) {
            i("android.intent.extra.CC", strArr);
            return this;
        }

        @x1
        public b e(@x1 String str) {
            if (this.d == null) {
                this.d = new ArrayList<>();
            }
            this.d.add(str);
            return this;
        }

        @x1
        public b f(@x1 String[] strArr) {
            i("android.intent.extra.EMAIL", strArr);
            return this;
        }

        @x1
        public b g(@x1 Uri uri) {
            if (this.g == null) {
                this.g = new ArrayList<>();
            }
            this.g.add(uri);
            return this;
        }

        @x1
        public Intent j() {
            return Intent.createChooser(m(), this.c);
        }

        @x1
        public Context l() {
            return this.a;
        }

        @x1
        public Intent m() {
            ArrayList<String> arrayList = this.d;
            if (arrayList != null) {
                h("android.intent.extra.EMAIL", arrayList);
                this.d = null;
            }
            ArrayList<String> arrayList2 = this.e;
            if (arrayList2 != null) {
                h("android.intent.extra.CC", arrayList2);
                this.e = null;
            }
            ArrayList<String> arrayList3 = this.f;
            if (arrayList3 != null) {
                h("android.intent.extra.BCC", arrayList3);
                this.f = null;
            }
            ArrayList<Uri> arrayList4 = this.g;
            boolean z = true;
            if (!((arrayList4 == null || arrayList4.size() <= 1) ? false : false)) {
                this.b.setAction("android.intent.action.SEND");
                ArrayList<Uri> arrayList5 = this.g;
                if (arrayList5 != null && !arrayList5.isEmpty()) {
                    this.b.putExtra("android.intent.extra.STREAM", this.g.get(0));
                    a.b(this.b, this.g);
                } else {
                    this.b.removeExtra("android.intent.extra.STREAM");
                    a.c(this.b);
                }
            } else {
                this.b.setAction("android.intent.action.SEND_MULTIPLE");
                this.b.putParcelableArrayListExtra("android.intent.extra.STREAM", this.g);
                a.b(this.b, this.g);
            }
            return this.b;
        }

        @x1
        public b n(@l2 int i) {
            return o(this.a.getText(i));
        }

        @x1
        public b o(@z1 CharSequence charSequence) {
            this.c = charSequence;
            return this;
        }

        @x1
        public b p(@z1 String[] strArr) {
            this.b.putExtra("android.intent.extra.BCC", strArr);
            return this;
        }

        @x1
        public b q(@z1 String[] strArr) {
            this.b.putExtra("android.intent.extra.CC", strArr);
            return this;
        }

        @x1
        public b r(@z1 String[] strArr) {
            if (this.d != null) {
                this.d = null;
            }
            this.b.putExtra("android.intent.extra.EMAIL", strArr);
            return this;
        }

        @x1
        public b s(@z1 String str) {
            this.b.putExtra(jh.b, str);
            if (!this.b.hasExtra("android.intent.extra.TEXT")) {
                v(Html.fromHtml(str));
            }
            return this;
        }

        @x1
        public b t(@z1 Uri uri) {
            this.g = null;
            if (uri != null) {
                g(uri);
            }
            return this;
        }

        @x1
        public b u(@z1 String str) {
            this.b.putExtra("android.intent.extra.SUBJECT", str);
            return this;
        }

        @x1
        public b v(@z1 CharSequence charSequence) {
            this.b.putExtra("android.intent.extra.TEXT", charSequence);
            return this;
        }

        @x1
        public b w(@z1 String str) {
            this.b.setType(str);
            return this;
        }

        public void x() {
            this.a.startActivity(j());
        }
    }

    /* compiled from: ShareCompat.java */
    /* loaded from: classes.dex */
    public static class c {
        private static final String a = "IntentReader";
        @x1
        private final Context b;
        @x1
        private final Intent c;
        @z1
        private final String d;
        @z1
        private final ComponentName e;
        @z1
        private ArrayList<Uri> f;

        public c(@x1 Activity activity) {
            this((Context) jp.l(activity), activity.getIntent());
        }

        @x1
        @Deprecated
        public static c a(@x1 Activity activity) {
            return new c(activity);
        }

        private static void t(StringBuilder sb, CharSequence charSequence, int i, int i2) {
            while (i < i2) {
                char charAt = charSequence.charAt(i);
                if (charAt == '<') {
                    sb.append("&lt;");
                } else if (charAt == '>') {
                    sb.append("&gt;");
                } else if (charAt == '&') {
                    sb.append("&amp;");
                } else if (charAt > '~' || charAt < ' ') {
                    sb.append("&#");
                    sb.append((int) charAt);
                    sb.append(AppCenter.PAIR_DELIMITER);
                } else if (charAt == ' ') {
                    while (true) {
                        int i3 = i + 1;
                        if (i3 >= i2 || charSequence.charAt(i3) != ' ') {
                            break;
                        }
                        sb.append("&nbsp;");
                        i = i3;
                    }
                    sb.append(gl4.R);
                } else {
                    sb.append(charAt);
                }
                i++;
            }
        }

        @z1
        public ComponentName b() {
            return this.e;
        }

        @z1
        public Drawable c() {
            if (this.e == null) {
                return null;
            }
            try {
                return this.b.getPackageManager().getActivityIcon(this.e);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        @z1
        public Drawable d() {
            if (this.d == null) {
                return null;
            }
            try {
                return this.b.getPackageManager().getApplicationIcon(this.d);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        @z1
        public CharSequence e() {
            if (this.d == null) {
                return null;
            }
            PackageManager packageManager = this.b.getPackageManager();
            try {
                return packageManager.getApplicationLabel(packageManager.getApplicationInfo(this.d, 0));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        @z1
        public String f() {
            return this.d;
        }

        @z1
        public String[] g() {
            return this.c.getStringArrayExtra("android.intent.extra.BCC");
        }

        @z1
        public String[] h() {
            return this.c.getStringArrayExtra("android.intent.extra.CC");
        }

        @z1
        public String[] i() {
            return this.c.getStringArrayExtra("android.intent.extra.EMAIL");
        }

        @z1
        public String j() {
            String stringExtra = this.c.getStringExtra(jh.b);
            if (stringExtra == null) {
                CharSequence o = o();
                if (o instanceof Spanned) {
                    return Html.toHtml((Spanned) o);
                }
                return o != null ? a.a(o) : stringExtra;
            }
            return stringExtra;
        }

        @z1
        public Uri k() {
            return (Uri) this.c.getParcelableExtra("android.intent.extra.STREAM");
        }

        @z1
        public Uri l(int i) {
            if (this.f == null && q()) {
                this.f = this.c.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            ArrayList<Uri> arrayList = this.f;
            if (arrayList != null) {
                return arrayList.get(i);
            }
            if (i == 0) {
                return (Uri) this.c.getParcelableExtra("android.intent.extra.STREAM");
            }
            StringBuilder G = wo1.G("Stream items available: ");
            G.append(m());
            G.append(" index requested: ");
            G.append(i);
            throw new IndexOutOfBoundsException(G.toString());
        }

        public int m() {
            if (this.f == null && q()) {
                this.f = this.c.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            ArrayList<Uri> arrayList = this.f;
            if (arrayList != null) {
                return arrayList.size();
            }
            return this.c.hasExtra("android.intent.extra.STREAM") ? 1 : 0;
        }

        @z1
        public String n() {
            return this.c.getStringExtra("android.intent.extra.SUBJECT");
        }

        @z1
        public CharSequence o() {
            return this.c.getCharSequenceExtra("android.intent.extra.TEXT");
        }

        @z1
        public String p() {
            return this.c.getType();
        }

        public boolean q() {
            return "android.intent.action.SEND_MULTIPLE".equals(this.c.getAction());
        }

        public boolean r() {
            String action = this.c.getAction();
            return "android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action);
        }

        public boolean s() {
            return "android.intent.action.SEND".equals(this.c.getAction());
        }

        public c(@x1 Context context, @x1 Intent intent) {
            this.b = (Context) jp.l(context);
            this.c = (Intent) jp.l(intent);
            this.d = xg.f(intent);
            this.e = xg.d(intent);
        }
    }

    private xg() {
    }

    @Deprecated
    public static void a(@x1 Menu menu, @m1 int i, @x1 b bVar) {
        MenuItem findItem = menu.findItem(i);
        if (findItem != null) {
            b(findItem, bVar);
            return;
        }
        throw new IllegalArgumentException(wo1.n("Could not find menu item with id ", i, " in the supplied menu"));
    }

    @Deprecated
    public static void b(@x1 MenuItem menuItem, @x1 b bVar) {
        ShareActionProvider shareActionProvider;
        ActionProvider actionProvider = menuItem.getActionProvider();
        if (!(actionProvider instanceof ShareActionProvider)) {
            shareActionProvider = new ShareActionProvider(bVar.l());
        } else {
            shareActionProvider = (ShareActionProvider) actionProvider;
        }
        StringBuilder G = wo1.G(e);
        G.append(bVar.l().getClass().getName());
        shareActionProvider.setShareHistoryFileName(G.toString());
        shareActionProvider.setShareIntent(bVar.m());
        menuItem.setActionProvider(shareActionProvider);
    }

    @z1
    public static ComponentName c(@x1 Activity activity) {
        Intent intent = activity.getIntent();
        ComponentName callingActivity = activity.getCallingActivity();
        return callingActivity == null ? d(intent) : callingActivity;
    }

    @z1
    public static ComponentName d(@x1 Intent intent) {
        ComponentName componentName = (ComponentName) intent.getParcelableExtra(c);
        return componentName == null ? (ComponentName) intent.getParcelableExtra(d) : componentName;
    }

    @z1
    public static String e(@x1 Activity activity) {
        Intent intent = activity.getIntent();
        String callingPackage = activity.getCallingPackage();
        return (callingPackage != null || intent == null) ? callingPackage : f(intent);
    }

    @z1
    public static String f(@x1 Intent intent) {
        String stringExtra = intent.getStringExtra(a);
        return stringExtra == null ? intent.getStringExtra(b) : stringExtra;
    }
}