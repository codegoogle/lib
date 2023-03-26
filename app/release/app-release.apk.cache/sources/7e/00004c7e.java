package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.nf;
import com.p7700g.p99005.tg;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: NotificationCompat.java */
/* loaded from: classes.dex */
public class kg {
    @SuppressLint({"ActionValue"})
    public static final String A = "android.title";
    public static final String A0 = "sys";
    @SuppressLint({"ActionValue"})
    public static final String B = "android.title.big";
    public static final String B0 = "service";
    @SuppressLint({"ActionValue"})
    public static final String C = "android.text";
    public static final String C0 = "reminder";
    @SuppressLint({"ActionValue"})
    public static final String D = "android.subText";
    public static final String D0 = "recommendation";
    @SuppressLint({"ActionValue"})
    public static final String E = "android.remoteInputHistory";
    public static final String E0 = "status";
    @SuppressLint({"ActionValue"})
    public static final String F = "android.infoText";
    public static final String F0 = "workout";
    @SuppressLint({"ActionValue"})
    public static final String G = "android.summaryText";
    public static final String G0 = "location_sharing";
    @SuppressLint({"ActionValue"})
    public static final String H = "android.bigText";
    public static final String H0 = "stopwatch";
    @SuppressLint({"ActionValue"})
    public static final String I = "android.icon";
    public static final String I0 = "missed_call";
    @SuppressLint({"ActionValue"})
    public static final String J = "android.largeIcon";
    public static final int J0 = 0;
    @SuppressLint({"ActionValue"})
    public static final String K = "android.largeIcon.big";
    public static final int K0 = 1;
    @SuppressLint({"ActionValue"})
    public static final String L = "android.progress";
    public static final int L0 = 2;
    @SuppressLint({"ActionValue"})
    public static final String M = "android.progressMax";
    public static final int M0 = 0;
    @SuppressLint({"ActionValue"})
    public static final String N = "android.progressIndeterminate";
    public static final int N0 = 1;
    @SuppressLint({"ActionValue"})
    public static final String O = "android.showChronometer";
    public static final int O0 = 2;
    @SuppressLint({"ActionValue"})
    public static final String P = "android.chronometerCountDown";
    public static final String P0 = "silent";
    @SuppressLint({"ActionValue"})
    public static final String Q = "android.colorized";
    public static final int Q0 = 0;
    @SuppressLint({"ActionValue"})
    public static final String R = "android.showWhen";
    public static final int R0 = 1;
    @SuppressLint({"ActionValue"})
    public static final String S = "android.picture";
    public static final int S0 = 2;
    @SuppressLint({"ActionValue"})
    public static final String T = "android.pictureContentDescription";
    @SuppressLint({"ActionValue"})
    public static final String U = "android.showBigPictureWhenCollapsed";
    @SuppressLint({"ActionValue"})
    public static final String V = "android.textLines";
    @SuppressLint({"ActionValue"})
    public static final String W = "android.template";
    public static final String X = "androidx.core.app.extra.COMPAT_TEMPLATE";
    @SuppressLint({"ActionValue"})
    @Deprecated
    public static final String Y = "android.people";
    @SuppressLint({"ActionValue"})
    public static final String Z = "android.people.list";
    @SuppressLint({"ActionValue"})
    public static final String a = "android.intent.category.NOTIFICATION_PREFERENCES";
    @SuppressLint({"ActionValue"})
    public static final String a0 = "android.backgroundImageUri";
    @SuppressLint({"ActionValue"})
    public static final String b = "android.intent.extra.CHANNEL_ID";
    @SuppressLint({"ActionValue"})
    public static final String b0 = "android.mediaSession";
    @SuppressLint({"ActionValue"})
    public static final String c = "android.intent.extra.CHANNEL_GROUP_ID";
    @SuppressLint({"ActionValue"})
    public static final String c0 = "android.compactActions";
    @SuppressLint({"ActionValue"})
    public static final String d = "android.intent.extra.NOTIFICATION_TAG";
    @SuppressLint({"ActionValue"})
    public static final String d0 = "android.selfDisplayName";
    @SuppressLint({"ActionValue"})
    public static final String e = "android.intent.extra.NOTIFICATION_ID";
    @SuppressLint({"ActionValue"})
    public static final String e0 = "android.messagingStyleUser";
    public static final int f = -1;
    @SuppressLint({"ActionValue"})
    public static final String f0 = "android.conversationTitle";
    public static final int g = 1;
    @SuppressLint({"ActionValue"})
    public static final String g0 = "android.messages";
    public static final int h = 2;
    @SuppressLint({"ActionValue"})
    public static final String h0 = "android.messages.historic";
    public static final int i = 4;
    @SuppressLint({"ActionValue"})
    public static final String i0 = "android.isGroupConversation";
    public static final int j = -1;
    @SuppressLint({"ActionValue"})
    public static final String j0 = "android.hiddenConversationTitle";
    public static final int k = 1;
    @SuppressLint({"ActionValue"})
    public static final String k0 = "android.audioContents";
    public static final int l = 2;
    @w0
    public static final int l0 = 0;
    public static final int m = 4;
    public static final int m0 = 1;
    public static final int n = 8;
    public static final int n0 = 0;
    public static final int o = 16;
    public static final int o0 = -1;
    public static final int p = 32;
    public static final String p0 = "call";
    public static final int q = 64;
    public static final String q0 = "navigation";
    @Deprecated
    public static final int r = 128;
    public static final String r0 = "msg";
    public static final int s = 256;
    public static final String s0 = "email";
    public static final int t = 512;
    public static final String t0 = "event";
    public static final int u = 4096;
    public static final String u0 = "promo";
    public static final int v = 0;
    public static final String v0 = "alarm";
    public static final int w = -1;
    public static final String w0 = "progress";
    public static final int x = -2;
    public static final String x0 = "social";
    public static final int y = 1;
    public static final String y0 = "err";
    public static final int z = 2;
    public static final String z0 = "transport";

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public static class b {
        public static final int a = 0;
        public static final int b = 1;
        public static final int c = 2;
        public static final int d = 3;
        public static final int e = 4;
        public static final int f = 5;
        public static final int g = 6;
        public static final int h = 7;
        public static final int i = 8;
        public static final int j = 9;
        public static final int k = 10;
        public static final String l = "android.support.action.showsUserInterface";
        public static final String m = "android.support.action.semanticAction";
        public final Bundle n;
        @z1
        private IconCompat o;
        private final vg[] p;
        private final vg[] q;
        private boolean r;
        public boolean s;
        private final int t;
        private final boolean u;
        @Deprecated
        public int v;
        public CharSequence w;
        public PendingIntent x;
        private boolean y;

        /* compiled from: NotificationCompat.java */
        /* loaded from: classes.dex */
        public static final class a {
            private final IconCompat a;
            private final CharSequence b;
            private final PendingIntent c;
            private boolean d;
            private final Bundle e;
            private ArrayList<vg> f;
            private int g;
            private boolean h;
            private boolean i;
            private boolean j;

            public a(@z1 IconCompat iconCompat, @z1 CharSequence charSequence, @z1 PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            private void d() {
                if (this.i) {
                    Objects.requireNonNull(this.c, "Contextual Actions must contain a valid PendingIntent");
                }
            }

            @e2(19)
            @i2({i2.a.LIBRARY_GROUP_PREFIX})
            @x1
            public static a f(@x1 Notification.Action action) {
                a aVar;
                if (Build.VERSION.SDK_INT >= 23 && action.getIcon() != null) {
                    aVar = new a(IconCompat.n(action.getIcon()), action.title, action.actionIntent);
                } else {
                    aVar = new a(action.icon, action.title, action.actionIntent);
                }
                RemoteInput[] remoteInputs = action.getRemoteInputs();
                if (remoteInputs != null && remoteInputs.length != 0) {
                    for (RemoteInput remoteInput : remoteInputs) {
                        aVar.b(vg.e(remoteInput));
                    }
                }
                int i = Build.VERSION.SDK_INT;
                if (i >= 24) {
                    aVar.d = action.getAllowGeneratedReplies();
                }
                if (i >= 28) {
                    aVar.k(action.getSemanticAction());
                }
                if (i >= 29) {
                    aVar.j(action.isContextual());
                }
                if (i >= 31) {
                    aVar.i(action.isAuthenticationRequired());
                }
                return aVar;
            }

            @x1
            public a a(@z1 Bundle bundle) {
                if (bundle != null) {
                    this.e.putAll(bundle);
                }
                return this;
            }

            @x1
            public a b(@z1 vg vgVar) {
                if (this.f == null) {
                    this.f = new ArrayList<>();
                }
                if (vgVar != null) {
                    this.f.add(vgVar);
                }
                return this;
            }

            @x1
            public b c() {
                d();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<vg> arrayList3 = this.f;
                if (arrayList3 != null) {
                    Iterator<vg> it = arrayList3.iterator();
                    while (it.hasNext()) {
                        vg next = it.next();
                        if (next.r()) {
                            arrayList.add(next);
                        } else {
                            arrayList2.add(next);
                        }
                    }
                }
                vg[] vgVarArr = arrayList.isEmpty() ? null : (vg[]) arrayList.toArray(new vg[arrayList.size()]);
                return new b(this.a, this.b, this.c, this.e, arrayList2.isEmpty() ? null : (vg[]) arrayList2.toArray(new vg[arrayList2.size()]), vgVarArr, this.d, this.g, this.h, this.i, this.j);
            }

            @x1
            public a e(@x1 InterfaceC0203b interfaceC0203b) {
                interfaceC0203b.a(this);
                return this;
            }

            @x1
            public Bundle g() {
                return this.e;
            }

            @x1
            public a h(boolean z) {
                this.d = z;
                return this;
            }

            @x1
            public a i(boolean z) {
                this.j = z;
                return this;
            }

            @x1
            public a j(boolean z) {
                this.i = z;
                return this;
            }

            @x1
            public a k(int i) {
                this.g = i;
                return this;
            }

            @x1
            public a l(boolean z) {
                this.h = z;
                return this;
            }

            public a(int i, @z1 CharSequence charSequence, @z1 PendingIntent pendingIntent) {
                this(i != 0 ? IconCompat.y(null, "", i) : null, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            public a(@x1 b bVar) {
                this(bVar.f(), bVar.w, bVar.x, new Bundle(bVar.n), bVar.g(), bVar.b(), bVar.h(), bVar.s, bVar.l(), bVar.k());
            }

            private a(@z1 IconCompat iconCompat, @z1 CharSequence charSequence, @z1 PendingIntent pendingIntent, @x1 Bundle bundle, @z1 vg[] vgVarArr, boolean z, int i, boolean z2, boolean z3, boolean z4) {
                this.d = true;
                this.h = true;
                this.a = iconCompat;
                this.b = g.A(charSequence);
                this.c = pendingIntent;
                this.e = bundle;
                this.f = vgVarArr == null ? null : new ArrayList<>(Arrays.asList(vgVarArr));
                this.d = z;
                this.g = i;
                this.h = z2;
                this.i = z3;
                this.j = z4;
            }
        }

        /* compiled from: NotificationCompat.java */
        /* renamed from: com.p7700g.p99005.kg$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public interface InterfaceC0203b {
            @x1
            a a(@x1 a aVar);
        }

        /* compiled from: NotificationCompat.java */
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes.dex */
        public @interface c {
        }

        public b(int i2, @z1 CharSequence charSequence, @z1 PendingIntent pendingIntent) {
            this(i2 != 0 ? IconCompat.y(null, "", i2) : null, charSequence, pendingIntent);
        }

        @z1
        public PendingIntent a() {
            return this.x;
        }

        public boolean b() {
            return this.r;
        }

        @z1
        public vg[] c() {
            return this.q;
        }

        @x1
        public Bundle d() {
            return this.n;
        }

        @Deprecated
        public int e() {
            return this.v;
        }

        @z1
        public IconCompat f() {
            int i2;
            if (this.o == null && (i2 = this.v) != 0) {
                this.o = IconCompat.y(null, "", i2);
            }
            return this.o;
        }

        @z1
        public vg[] g() {
            return this.p;
        }

        public int h() {
            return this.t;
        }

        public boolean i() {
            return this.s;
        }

        @z1
        public CharSequence j() {
            return this.w;
        }

        public boolean k() {
            return this.y;
        }

        public boolean l() {
            return this.u;
        }

        /* compiled from: NotificationCompat.java */
        /* loaded from: classes.dex */
        public static final class d implements InterfaceC0203b {
            private static final String a = "android.wearable.EXTENSIONS";
            private static final String b = "flags";
            private static final String c = "inProgressLabel";
            private static final String d = "confirmLabel";
            private static final String e = "cancelLabel";
            private static final int f = 1;
            private static final int g = 2;
            private static final int h = 4;
            private static final int i = 1;
            private int j;
            private CharSequence k;
            private CharSequence l;
            private CharSequence m;

            public d() {
                this.j = 1;
            }

            private void l(int i2, boolean z) {
                if (z) {
                    this.j = i2 | this.j;
                    return;
                }
                this.j = (~i2) & this.j;
            }

            @Override // com.p7700g.p99005.kg.b.InterfaceC0203b
            @x1
            public a a(@x1 a aVar) {
                Bundle bundle = new Bundle();
                int i2 = this.j;
                if (i2 != 1) {
                    bundle.putInt(b, i2);
                }
                CharSequence charSequence = this.k;
                if (charSequence != null) {
                    bundle.putCharSequence(c, charSequence);
                }
                CharSequence charSequence2 = this.l;
                if (charSequence2 != null) {
                    bundle.putCharSequence(d, charSequence2);
                }
                CharSequence charSequence3 = this.m;
                if (charSequence3 != null) {
                    bundle.putCharSequence(e, charSequence3);
                }
                aVar.g().putBundle(a, bundle);
                return aVar;
            }

            @x1
            /* renamed from: b */
            public d clone() {
                d dVar = new d();
                dVar.j = this.j;
                dVar.k = this.k;
                dVar.l = this.l;
                dVar.m = this.m;
                return dVar;
            }

            @z1
            @Deprecated
            public CharSequence c() {
                return this.m;
            }

            @z1
            @Deprecated
            public CharSequence d() {
                return this.l;
            }

            public boolean e() {
                return (this.j & 4) != 0;
            }

            public boolean f() {
                return (this.j & 2) != 0;
            }

            @z1
            @Deprecated
            public CharSequence g() {
                return this.k;
            }

            public boolean h() {
                return (this.j & 1) != 0;
            }

            @x1
            public d i(boolean z) {
                l(1, z);
                return this;
            }

            @x1
            @Deprecated
            public d j(@z1 CharSequence charSequence) {
                this.m = charSequence;
                return this;
            }

            @x1
            @Deprecated
            public d k(@z1 CharSequence charSequence) {
                this.l = charSequence;
                return this;
            }

            @x1
            public d m(boolean z) {
                l(4, z);
                return this;
            }

            @x1
            public d n(boolean z) {
                l(2, z);
                return this;
            }

            @x1
            @Deprecated
            public d o(@z1 CharSequence charSequence) {
                this.k = charSequence;
                return this;
            }

            public d(@x1 b bVar) {
                this.j = 1;
                Bundle bundle = bVar.d().getBundle(a);
                if (bundle != null) {
                    this.j = bundle.getInt(b, 1);
                    this.k = bundle.getCharSequence(c);
                    this.l = bundle.getCharSequence(d);
                    this.m = bundle.getCharSequence(e);
                }
            }
        }

        public b(@z1 IconCompat iconCompat, @z1 CharSequence charSequence, @z1 PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), (vg[]) null, (vg[]) null, true, 0, true, false, false);
        }

        public b(int i2, @z1 CharSequence charSequence, @z1 PendingIntent pendingIntent, @z1 Bundle bundle, @z1 vg[] vgVarArr, @z1 vg[] vgVarArr2, boolean z, int i3, boolean z2, boolean z3, boolean z4) {
            this(i2 != 0 ? IconCompat.y(null, "", i2) : null, charSequence, pendingIntent, bundle, vgVarArr, vgVarArr2, z, i3, z2, z3, z4);
        }

        public b(@z1 IconCompat iconCompat, @z1 CharSequence charSequence, @z1 PendingIntent pendingIntent, @z1 Bundle bundle, @z1 vg[] vgVarArr, @z1 vg[] vgVarArr2, boolean z, int i2, boolean z2, boolean z3, boolean z4) {
            this.s = true;
            this.o = iconCompat;
            if (iconCompat != null && iconCompat.D() == 2) {
                this.v = iconCompat.A();
            }
            this.w = g.A(charSequence);
            this.x = pendingIntent;
            this.n = bundle == null ? new Bundle() : bundle;
            this.p = vgVarArr;
            this.q = vgVarArr2;
            this.r = z;
            this.t = i2;
            this.s = z2;
            this.u = z3;
            this.y = z4;
        }
    }

    /* compiled from: NotificationCompat.java */
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface c {
    }

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public static class d extends q {
        private static final String e = "androidx.core.app.NotificationCompat$BigPictureStyle";
        private Bitmap f;
        private IconCompat g;
        private boolean h;
        private CharSequence i;
        private boolean j;

        /* compiled from: NotificationCompat.java */
        @e2(16)
        /* loaded from: classes.dex */
        public static class a {
            private a() {
            }

            @e2(16)
            public static void a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }

            @e2(16)
            public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }
        }

        /* compiled from: NotificationCompat.java */
        @e2(23)
        /* loaded from: classes.dex */
        public static class b {
            private b() {
            }

            @e2(23)
            public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* compiled from: NotificationCompat.java */
        @e2(31)
        /* loaded from: classes.dex */
        public static class c {
            private c() {
            }

            @e2(31)
            public static void a(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            @e2(31)
            public static void b(Notification.BigPictureStyle bigPictureStyle, boolean z) {
                bigPictureStyle.showBigPictureWhenCollapsed(z);
            }
        }

        public d() {
        }

        @z1
        private static IconCompat A(@z1 Parcelable parcelable) {
            if (parcelable != null) {
                if (Build.VERSION.SDK_INT >= 23 && (parcelable instanceof Icon)) {
                    return IconCompat.n((Icon) parcelable);
                }
                if (parcelable instanceof Bitmap) {
                    return IconCompat.t((Bitmap) parcelable);
                }
                return null;
            }
            return null;
        }

        @x1
        public d B(@z1 Bitmap bitmap) {
            this.g = bitmap == null ? null : IconCompat.t(bitmap);
            this.h = true;
            return this;
        }

        @x1
        public d C(@z1 Bitmap bitmap) {
            this.f = bitmap;
            return this;
        }

        @x1
        public d D(@z1 CharSequence charSequence) {
            this.b = g.A(charSequence);
            return this;
        }

        @e2(31)
        @x1
        public d E(@z1 CharSequence charSequence) {
            this.i = charSequence;
            return this;
        }

        @x1
        public d F(@z1 CharSequence charSequence) {
            this.c = g.A(charSequence);
            this.d = true;
            return this;
        }

        @e2(31)
        @x1
        public d G(boolean z) {
            this.j = z;
            return this;
        }

        @Override // com.p7700g.p99005.kg.q
        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        public void b(hg hgVar) {
            int i = Build.VERSION.SDK_INT;
            Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(hgVar.a()).setBigContentTitle(this.b).bigPicture(this.f);
            if (this.h) {
                IconCompat iconCompat = this.g;
                if (iconCompat == null) {
                    a.a(bigPicture, null);
                } else if (i >= 23) {
                    b.a(bigPicture, this.g.M(hgVar instanceof lg ? ((lg) hgVar).f() : null));
                } else if (iconCompat.D() == 1) {
                    a.a(bigPicture, this.g.z());
                } else {
                    a.a(bigPicture, null);
                }
            }
            if (this.d) {
                a.b(bigPicture, this.c);
            }
            if (i >= 31) {
                c.b(bigPicture, this.j);
                c.a(bigPicture, this.i);
            }
        }

        @Override // com.p7700g.p99005.kg.q
        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        public void g(@x1 Bundle bundle) {
            super.g(bundle);
            bundle.remove(kg.K);
            bundle.remove(kg.S);
            bundle.remove(kg.U);
        }

        @Override // com.p7700g.p99005.kg.q
        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        @x1
        public String t() {
            return e;
        }

        @Override // com.p7700g.p99005.kg.q
        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        public void y(@x1 Bundle bundle) {
            super.y(bundle);
            if (bundle.containsKey(kg.K)) {
                this.g = A(bundle.getParcelable(kg.K));
                this.h = true;
            }
            this.f = (Bitmap) bundle.getParcelable(kg.S);
            this.j = bundle.getBoolean(kg.U);
        }

        public d(@z1 g gVar) {
            z(gVar);
        }
    }

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public static class e extends q {
        private static final String e = "androidx.core.app.NotificationCompat$BigTextStyle";
        private CharSequence f;

        public e() {
        }

        @x1
        public e A(@z1 CharSequence charSequence) {
            this.f = g.A(charSequence);
            return this;
        }

        @x1
        public e B(@z1 CharSequence charSequence) {
            this.b = g.A(charSequence);
            return this;
        }

        @x1
        public e C(@z1 CharSequence charSequence) {
            this.c = g.A(charSequence);
            this.d = true;
            return this;
        }

        @Override // com.p7700g.p99005.kg.q
        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        public void a(@x1 Bundle bundle) {
            super.a(bundle);
        }

        @Override // com.p7700g.p99005.kg.q
        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        public void b(hg hgVar) {
            Notification.BigTextStyle bigText = new Notification.BigTextStyle(hgVar.a()).setBigContentTitle(this.b).bigText(this.f);
            if (this.d) {
                bigText.setSummaryText(this.c);
            }
        }

        @Override // com.p7700g.p99005.kg.q
        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        public void g(@x1 Bundle bundle) {
            super.g(bundle);
            bundle.remove(kg.H);
        }

        @Override // com.p7700g.p99005.kg.q
        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        @x1
        public String t() {
            return e;
        }

        @Override // com.p7700g.p99005.kg.q
        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        public void y(@x1 Bundle bundle) {
            super.y(bundle);
            this.f = bundle.getCharSequence(kg.H);
        }

        public e(@z1 g gVar) {
            z(gVar);
        }
    }

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public static final class f {
        private static final int a = 1;
        private static final int b = 2;
        private PendingIntent c;
        private PendingIntent d;
        private IconCompat e;
        private int f;
        @a1
        private int g;
        private int h;
        private String i;

        /* compiled from: NotificationCompat.java */
        @e2(29)
        /* loaded from: classes.dex */
        public static class a {
            private a() {
            }

            @e2(29)
            @z1
            public static f a(@z1 Notification.BubbleMetadata bubbleMetadata) {
                if (bubbleMetadata == null || bubbleMetadata.getIntent() == null) {
                    return null;
                }
                c i = new c(bubbleMetadata.getIntent(), IconCompat.n(bubbleMetadata.getIcon())).b(bubbleMetadata.getAutoExpandBubble()).c(bubbleMetadata.getDeleteIntent()).i(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    i.d(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    i.e(bubbleMetadata.getDesiredHeightResId());
                }
                return i.a();
            }

            @e2(29)
            @z1
            public static Notification.BubbleMetadata b(@z1 f fVar) {
                if (fVar == null || fVar.g() == null) {
                    return null;
                }
                Notification.BubbleMetadata.Builder suppressNotification = new Notification.BubbleMetadata.Builder().setIcon(fVar.f().L()).setIntent(fVar.g()).setDeleteIntent(fVar.c()).setAutoExpandBubble(fVar.b()).setSuppressNotification(fVar.i());
                if (fVar.d() != 0) {
                    suppressNotification.setDesiredHeight(fVar.d());
                }
                if (fVar.e() != 0) {
                    suppressNotification.setDesiredHeightResId(fVar.e());
                }
                return suppressNotification.build();
            }
        }

        /* compiled from: NotificationCompat.java */
        @e2(30)
        /* loaded from: classes.dex */
        public static class b {
            private b() {
            }

            @e2(30)
            @z1
            public static f a(@z1 Notification.BubbleMetadata bubbleMetadata) {
                c cVar;
                if (bubbleMetadata == null) {
                    return null;
                }
                if (bubbleMetadata.getShortcutId() != null) {
                    cVar = new c(bubbleMetadata.getShortcutId());
                } else {
                    cVar = new c(bubbleMetadata.getIntent(), IconCompat.n(bubbleMetadata.getIcon()));
                }
                cVar.b(bubbleMetadata.getAutoExpandBubble()).c(bubbleMetadata.getDeleteIntent()).i(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    cVar.d(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    cVar.e(bubbleMetadata.getDesiredHeightResId());
                }
                return cVar.a();
            }

            @e2(30)
            @z1
            public static Notification.BubbleMetadata b(@z1 f fVar) {
                Notification.BubbleMetadata.Builder builder;
                if (fVar == null) {
                    return null;
                }
                if (fVar.h() != null) {
                    builder = new Notification.BubbleMetadata.Builder(fVar.h());
                } else {
                    builder = new Notification.BubbleMetadata.Builder(fVar.g(), fVar.f().L());
                }
                builder.setDeleteIntent(fVar.c()).setAutoExpandBubble(fVar.b()).setSuppressNotification(fVar.i());
                if (fVar.d() != 0) {
                    builder.setDesiredHeight(fVar.d());
                }
                if (fVar.e() != 0) {
                    builder.setDesiredHeightResId(fVar.e());
                }
                return builder.build();
            }
        }

        /* compiled from: NotificationCompat.java */
        /* loaded from: classes.dex */
        public static final class c {
            private PendingIntent a;
            private IconCompat b;
            private int c;
            @a1
            private int d;
            private int e;
            private PendingIntent f;
            private String g;

            @Deprecated
            public c() {
            }

            @x1
            private c f(int i, boolean z) {
                if (z) {
                    this.e = i | this.e;
                } else {
                    this.e = (~i) & this.e;
                }
                return this;
            }

            @x1
            @SuppressLint({"SyntheticAccessor"})
            public f a() {
                String str = this.g;
                if (str == null) {
                    Objects.requireNonNull(this.a, "Must supply pending intent or shortcut to bubble");
                }
                if (str == null) {
                    Objects.requireNonNull(this.b, "Must supply an icon or shortcut for the bubble");
                }
                f fVar = new f(this.a, this.f, this.b, this.c, this.d, this.e, str);
                fVar.j(this.e);
                return fVar;
            }

            @x1
            public c b(boolean z) {
                f(1, z);
                return this;
            }

            @x1
            public c c(@z1 PendingIntent pendingIntent) {
                this.f = pendingIntent;
                return this;
            }

            @x1
            public c d(@b1(unit = 0) int i) {
                this.c = Math.max(i, 0);
                this.d = 0;
                return this;
            }

            @x1
            public c e(@a1 int i) {
                this.d = i;
                this.c = 0;
                return this;
            }

            @x1
            public c g(@x1 IconCompat iconCompat) {
                if (this.g == null) {
                    Objects.requireNonNull(iconCompat, "Bubbles require non-null icon");
                    this.b = iconCompat;
                    return this;
                }
                throw new IllegalStateException("Created as a shortcut bubble, cannot set an Icon. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
            }

            @x1
            public c h(@x1 PendingIntent pendingIntent) {
                if (this.g == null) {
                    Objects.requireNonNull(pendingIntent, "Bubble requires non-null pending intent");
                    this.a = pendingIntent;
                    return this;
                }
                throw new IllegalStateException("Created as a shortcut bubble, cannot set a PendingIntent. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
            }

            @x1
            public c i(boolean z) {
                f(2, z);
                return this;
            }

            @e2(30)
            public c(@x1 String str) {
                if (!TextUtils.isEmpty(str)) {
                    this.g = str;
                    return;
                }
                throw new NullPointerException("Bubble requires a non-null shortcut id");
            }

            public c(@x1 PendingIntent pendingIntent, @x1 IconCompat iconCompat) {
                Objects.requireNonNull(pendingIntent, "Bubble requires non-null pending intent");
                Objects.requireNonNull(iconCompat, "Bubbles require non-null icon");
                this.a = pendingIntent;
                this.b = iconCompat;
            }
        }

        @z1
        public static f a(@z1 Notification.BubbleMetadata bubbleMetadata) {
            if (bubbleMetadata == null) {
                return null;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                return b.a(bubbleMetadata);
            }
            if (i == 29) {
                return a.a(bubbleMetadata);
            }
            return null;
        }

        @z1
        public static Notification.BubbleMetadata k(@z1 f fVar) {
            if (fVar == null) {
                return null;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                return b.b(fVar);
            }
            if (i == 29) {
                return a.b(fVar);
            }
            return null;
        }

        public boolean b() {
            return (this.h & 1) != 0;
        }

        @z1
        public PendingIntent c() {
            return this.d;
        }

        @b1(unit = 0)
        public int d() {
            return this.f;
        }

        @a1
        public int e() {
            return this.g;
        }

        @z1
        @SuppressLint({"InvalidNullConversion"})
        public IconCompat f() {
            return this.e;
        }

        @z1
        @SuppressLint({"InvalidNullConversion"})
        public PendingIntent g() {
            return this.c;
        }

        @z1
        public String h() {
            return this.i;
        }

        public boolean i() {
            return (this.h & 2) != 0;
        }

        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        public void j(int i) {
            this.h = i;
        }

        private f(@z1 PendingIntent pendingIntent, @z1 PendingIntent pendingIntent2, @z1 IconCompat iconCompat, int i, @a1 int i2, int i3, @z1 String str) {
            this.c = pendingIntent;
            this.e = iconCompat;
            this.f = i;
            this.g = i2;
            this.d = pendingIntent2;
            this.h = i3;
            this.i = str;
        }
    }

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public static class i extends q {
        private static final String e = "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
        private static final int f = 3;

        private RemoteViews A(RemoteViews remoteViews, boolean z) {
            int min;
            boolean z2 = true;
            RemoteViews c = c(true, nf.g.d, false);
            c.removeAllViews(nf.e.L);
            List<b> C = C(this.a.c);
            if (!z || C == null || (min = Math.min(C.size(), 3)) <= 0) {
                z2 = false;
            } else {
                for (int i = 0; i < min; i++) {
                    c.addView(nf.e.L, B(C.get(i)));
                }
            }
            int i2 = z2 ? 0 : 8;
            c.setViewVisibility(nf.e.L, i2);
            c.setViewVisibility(nf.e.I, i2);
            e(c, remoteViews);
            return c;
        }

        private RemoteViews B(b bVar) {
            int i;
            boolean z = bVar.x == null;
            String packageName = this.a.b.getPackageName();
            if (z) {
                i = nf.g.c;
            } else {
                i = nf.g.b;
            }
            RemoteViews remoteViews = new RemoteViews(packageName, i);
            IconCompat f2 = bVar.f();
            if (f2 != null) {
                remoteViews.setImageViewBitmap(nf.e.J, o(f2, this.a.b.getResources().getColor(nf.b.c)));
            }
            remoteViews.setTextViewText(nf.e.K, bVar.w);
            if (!z) {
                remoteViews.setOnClickPendingIntent(nf.e.H, bVar.x);
            }
            remoteViews.setContentDescription(nf.e.H, bVar.w);
            return remoteViews;
        }

        private static List<b> C(List<b> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (b bVar : list) {
                if (!bVar.l()) {
                    arrayList.add(bVar);
                }
            }
            return arrayList;
        }

        @Override // com.p7700g.p99005.kg.q
        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        public void b(hg hgVar) {
            if (Build.VERSION.SDK_INT >= 24) {
                hgVar.a().setStyle(new Notification.DecoratedCustomViewStyle());
            }
        }

        @Override // com.p7700g.p99005.kg.q
        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        public boolean r() {
            return true;
        }

        @Override // com.p7700g.p99005.kg.q
        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        @x1
        public String t() {
            return e;
        }

        @Override // com.p7700g.p99005.kg.q
        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews v(hg hgVar) {
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews p = this.a.p();
            if (p == null) {
                p = this.a.s();
            }
            if (p == null) {
                return null;
            }
            return A(p, true);
        }

        @Override // com.p7700g.p99005.kg.q
        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews w(hg hgVar) {
            if (Build.VERSION.SDK_INT < 24 && this.a.s() != null) {
                return A(this.a.s(), false);
            }
            return null;
        }

        @Override // com.p7700g.p99005.kg.q
        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews x(hg hgVar) {
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews w = this.a.w();
            RemoteViews s = w != null ? w : this.a.s();
            if (w == null) {
                return null;
            }
            return A(s, true);
        }
    }

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public interface j {
        @x1
        g a(@x1 g gVar);
    }

    /* compiled from: NotificationCompat.java */
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface k {
    }

    /* compiled from: NotificationCompat.java */
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface n {
    }

    /* compiled from: NotificationCompat.java */
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface o {
    }

    /* compiled from: NotificationCompat.java */
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface p {
    }

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public static abstract class q {
        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        public g a;
        public CharSequence b;
        public CharSequence c;
        public boolean d = false;

        private int f() {
            Resources resources = this.a.b.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(nf.c.u);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(nf.c.v);
            float h = (h(resources.getConfiguration().fontScale, 1.0f, 1.3f) - 1.0f) / 0.29999995f;
            return Math.round((h * dimensionPixelSize2) + ((1.0f - h) * dimensionPixelSize));
        }

        private static float h(float f, float f2, float f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }

        @z1
        public static q i(@z1 String str) {
            if (str != null) {
                char c = 65535;
                switch (str.hashCode()) {
                    case -716705180:
                        if (str.equals("androidx.core.app.NotificationCompat$DecoratedCustomViewStyle")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -171946061:
                        if (str.equals("androidx.core.app.NotificationCompat$BigPictureStyle")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 912942987:
                        if (str.equals("androidx.core.app.NotificationCompat$InboxStyle")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 919595044:
                        if (str.equals("androidx.core.app.NotificationCompat$BigTextStyle")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 2090799565:
                        if (str.equals("androidx.core.app.NotificationCompat$MessagingStyle")) {
                            c = 4;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        return new i();
                    case 1:
                        return new d();
                    case 2:
                        return new l();
                    case 3:
                        return new e();
                    case 4:
                        return new m();
                    default:
                        return null;
                }
            }
            return null;
        }

        @z1
        private static q j(@z1 String str) {
            if (str == null) {
                return null;
            }
            int i = Build.VERSION.SDK_INT;
            if (str.equals(Notification.BigPictureStyle.class.getName())) {
                return new d();
            }
            if (str.equals(Notification.BigTextStyle.class.getName())) {
                return new e();
            }
            if (str.equals(Notification.InboxStyle.class.getName())) {
                return new l();
            }
            if (i >= 24) {
                if (str.equals(Notification.MessagingStyle.class.getName())) {
                    return new m();
                }
                if (str.equals(Notification.DecoratedCustomViewStyle.class.getName())) {
                    return new i();
                }
            }
            return null;
        }

        @z1
        public static q k(@x1 Bundle bundle) {
            q i = i(bundle.getString(kg.X));
            if (i != null) {
                return i;
            }
            if (!bundle.containsKey(kg.d0) && !bundle.containsKey(kg.e0)) {
                if (bundle.containsKey(kg.S)) {
                    return new d();
                }
                if (bundle.containsKey(kg.H)) {
                    return new e();
                }
                if (bundle.containsKey(kg.V)) {
                    return new l();
                }
                return j(bundle.getString(kg.W));
            }
            return new m();
        }

        @z1
        public static q l(@x1 Bundle bundle) {
            q k = k(bundle);
            if (k == null) {
                return null;
            }
            try {
                k.y(bundle);
                return k;
            } catch (ClassCastException unused) {
                return null;
            }
        }

        private Bitmap n(int i, int i2, int i3) {
            return p(IconCompat.x(this.a.b, i), i2, i3);
        }

        private Bitmap p(@x1 IconCompat iconCompat, int i, int i2) {
            Drawable G = iconCompat.G(this.a.b);
            int intrinsicWidth = i2 == 0 ? G.getIntrinsicWidth() : i2;
            if (i2 == 0) {
                i2 = G.getIntrinsicHeight();
            }
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, i2, Bitmap.Config.ARGB_8888);
            G.setBounds(0, 0, intrinsicWidth, i2);
            if (i != 0) {
                G.mutate().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
            }
            G.draw(new Canvas(createBitmap));
            return createBitmap;
        }

        private Bitmap q(int i, int i2, int i3, int i4) {
            int i5 = nf.d.h;
            if (i4 == 0) {
                i4 = 0;
            }
            Bitmap n = n(i5, i4, i2);
            Canvas canvas = new Canvas(n);
            Drawable mutate = this.a.b.getResources().getDrawable(i).mutate();
            mutate.setFilterBitmap(true);
            int i6 = (i2 - i3) / 2;
            int i7 = i3 + i6;
            mutate.setBounds(i6, i6, i7, i7);
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            mutate.draw(canvas);
            return n;
        }

        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        @z1
        public static q s(@x1 Notification notification) {
            Bundle n = kg.n(notification);
            if (n == null) {
                return null;
            }
            return l(n);
        }

        private void u(RemoteViews remoteViews) {
            remoteViews.setViewVisibility(nf.e.t0, 8);
            remoteViews.setViewVisibility(nf.e.r0, 8);
            remoteViews.setViewVisibility(nf.e.q0, 8);
        }

        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        public void a(@x1 Bundle bundle) {
            if (this.d) {
                bundle.putCharSequence(kg.G, this.c);
            }
            CharSequence charSequence = this.b;
            if (charSequence != null) {
                bundle.putCharSequence(kg.B, charSequence);
            }
            String t = t();
            if (t != null) {
                bundle.putString(kg.X, t);
            }
        }

        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        public void b(hg hgVar) {
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0100  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x011d  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0141  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0185  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x018a  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x018c  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0196  */
        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        @x1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public RemoteViews c(boolean z, int i, boolean z2) {
            boolean z3;
            boolean z4;
            CharSequence charSequence;
            boolean z5;
            Resources resources = this.a.b.getResources();
            RemoteViews remoteViews = new RemoteViews(this.a.b.getPackageName(), i);
            this.a.y();
            int i2 = Build.VERSION.SDK_INT;
            g gVar = this.a;
            if (gVar.k != null) {
                int i3 = nf.e.R;
                remoteViews.setViewVisibility(i3, 0);
                remoteViews.setImageViewBitmap(i3, this.a.k);
                if (z && this.a.V.icon != 0) {
                    int dimensionPixelSize = resources.getDimensionPixelSize(nf.c.p);
                    g gVar2 = this.a;
                    Bitmap q = q(gVar2.V.icon, dimensionPixelSize, dimensionPixelSize - (resources.getDimensionPixelSize(nf.c.r) * 2), gVar2.r());
                    int i4 = nf.e.b0;
                    remoteViews.setImageViewBitmap(i4, q);
                    remoteViews.setViewVisibility(i4, 0);
                }
            } else if (z && gVar.V.icon != 0) {
                int i5 = nf.e.R;
                remoteViews.setViewVisibility(i5, 0);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(nf.c.m) - resources.getDimensionPixelSize(nf.c.j);
                int dimensionPixelSize3 = resources.getDimensionPixelSize(nf.c.s);
                g gVar3 = this.a;
                remoteViews.setImageViewBitmap(i5, q(gVar3.V.icon, dimensionPixelSize2, dimensionPixelSize3, gVar3.r()));
            }
            CharSequence charSequence2 = this.a.f;
            if (charSequence2 != null) {
                remoteViews.setTextViewText(nf.e.t0, charSequence2);
            }
            CharSequence charSequence3 = this.a.g;
            boolean z6 = true;
            if (charSequence3 != null) {
                remoteViews.setTextViewText(nf.e.q0, charSequence3);
                z3 = true;
            } else {
                z3 = false;
            }
            g gVar4 = this.a;
            CharSequence charSequence4 = gVar4.l;
            if (charSequence4 != null) {
                int i6 = nf.e.T;
                remoteViews.setTextViewText(i6, charSequence4);
                remoteViews.setViewVisibility(i6, 0);
            } else if (gVar4.m > 0) {
                if (this.a.m > resources.getInteger(nf.f.a)) {
                    remoteViews.setTextViewText(nf.e.T, resources.getString(nf.h.a));
                } else {
                    remoteViews.setTextViewText(nf.e.T, NumberFormat.getIntegerInstance().format(this.a.m));
                }
                remoteViews.setViewVisibility(nf.e.T, 0);
            } else {
                remoteViews.setViewVisibility(nf.e.T, 8);
                z4 = false;
                charSequence = this.a.s;
                if (charSequence != null) {
                    remoteViews.setTextViewText(nf.e.q0, charSequence);
                    CharSequence charSequence5 = this.a.g;
                    if (charSequence5 != null) {
                        int i7 = nf.e.r0;
                        remoteViews.setTextViewText(i7, charSequence5);
                        remoteViews.setViewVisibility(i7, 0);
                        z5 = true;
                        if (z5) {
                            if (z2) {
                                remoteViews.setTextViewTextSize(nf.e.q0, 0, resources.getDimensionPixelSize(nf.c.t));
                            }
                            remoteViews.setViewPadding(nf.e.V, 0, 0, 0, 0);
                        }
                        if (this.a.z() == 0) {
                            z6 = z4;
                        } else if (this.a.p) {
                            int i8 = nf.e.O;
                            remoteViews.setViewVisibility(i8, 0);
                            remoteViews.setLong(i8, "setBase", (SystemClock.elapsedRealtime() - System.currentTimeMillis()) + this.a.z());
                            remoteViews.setBoolean(i8, "setStarted", true);
                            boolean z7 = this.a.q;
                            if (z7 && i2 >= 24) {
                                remoteViews.setChronometerCountDown(i8, z7);
                            }
                        } else {
                            int i9 = nf.e.s0;
                            remoteViews.setViewVisibility(i9, 0);
                            remoteViews.setLong(i9, "setTime", this.a.z());
                        }
                        remoteViews.setViewVisibility(nf.e.c0, z6 ? 0 : 8);
                        remoteViews.setViewVisibility(nf.e.W, z3 ? 0 : 8);
                        return remoteViews;
                    }
                    remoteViews.setViewVisibility(nf.e.r0, 8);
                }
                z5 = false;
                if (z5) {
                }
                if (this.a.z() == 0) {
                }
                remoteViews.setViewVisibility(nf.e.c0, z6 ? 0 : 8);
                remoteViews.setViewVisibility(nf.e.W, z3 ? 0 : 8);
                return remoteViews;
            }
            z3 = true;
            z4 = true;
            charSequence = this.a.s;
            if (charSequence != null) {
            }
            z5 = false;
            if (z5) {
            }
            if (this.a.z() == 0) {
            }
            remoteViews.setViewVisibility(nf.e.c0, z6 ? 0 : 8);
            remoteViews.setViewVisibility(nf.e.W, z3 ? 0 : 8);
            return remoteViews;
        }

        @z1
        public Notification d() {
            g gVar = this.a;
            if (gVar != null) {
                return gVar.h();
            }
            return null;
        }

        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        public void e(RemoteViews remoteViews, RemoteViews remoteViews2) {
            u(remoteViews);
            int i = nf.e.Z;
            remoteViews.removeAllViews(i);
            remoteViews.addView(i, remoteViews2.clone());
            remoteViews.setViewVisibility(i, 0);
            remoteViews.setViewPadding(nf.e.a0, 0, f(), 0, 0);
        }

        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        public void g(@x1 Bundle bundle) {
            bundle.remove(kg.G);
            bundle.remove(kg.B);
            bundle.remove(kg.X);
        }

        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        public Bitmap m(int i, int i2) {
            return n(i, i2, 0);
        }

        public Bitmap o(@x1 IconCompat iconCompat, int i) {
            return p(iconCompat, i, 0);
        }

        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        public boolean r() {
            return false;
        }

        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        @z1
        public String t() {
            return null;
        }

        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews v(hg hgVar) {
            return null;
        }

        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews w(hg hgVar) {
            return null;
        }

        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews x(hg hgVar) {
            return null;
        }

        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        public void y(@x1 Bundle bundle) {
            if (bundle.containsKey(kg.G)) {
                this.c = bundle.getCharSequence(kg.G);
                this.d = true;
            }
            this.b = bundle.getCharSequence(kg.B);
        }

        public void z(@z1 g gVar) {
            if (this.a != gVar) {
                this.a = gVar;
                if (gVar != null) {
                    gVar.z0(this);
                }
            }
        }
    }

    @z1
    public static String A(@x1 Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getShortcutId();
        }
        return null;
    }

    @e2(19)
    public static boolean B(@x1 Notification notification) {
        return notification.extras.getBoolean(R);
    }

    @z1
    public static String C(@x1 Notification notification) {
        return notification.getSortKey();
    }

    @e2(19)
    @z1
    public static CharSequence D(@x1 Notification notification) {
        return notification.extras.getCharSequence(D);
    }

    public static long E(@x1 Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getTimeoutAfter();
        }
        return 0L;
    }

    @e2(19)
    public static boolean F(@x1 Notification notification) {
        return notification.extras.getBoolean(O);
    }

    public static int G(@x1 Notification notification) {
        return notification.visibility;
    }

    public static boolean H(@x1 Notification notification) {
        return (notification.flags & 512) != 0;
    }

    @z1
    public static b a(@x1 Notification notification, int i2) {
        return b(notification.actions[i2]);
    }

    @e2(20)
    @x1
    public static b b(@x1 Notification.Action action) {
        vg[] vgVarArr;
        boolean z2;
        int i2;
        int i3;
        RemoteInput[] remoteInputs = action.getRemoteInputs();
        if (remoteInputs == null) {
            vgVarArr = null;
        } else {
            vg[] vgVarArr2 = new vg[remoteInputs.length];
            for (int i4 = 0; i4 < remoteInputs.length; i4++) {
                RemoteInput remoteInput = remoteInputs[i4];
                vgVarArr2[i4] = new vg(remoteInput.getResultKey(), remoteInput.getLabel(), remoteInput.getChoices(), remoteInput.getAllowFreeFormInput(), Build.VERSION.SDK_INT >= 29 ? remoteInput.getEditChoicesBeforeSending() : 0, remoteInput.getExtras(), null);
            }
            vgVarArr = vgVarArr2;
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 24) {
            z2 = action.getExtras().getBoolean(ng.c) || action.getAllowGeneratedReplies();
        } else {
            z2 = action.getExtras().getBoolean(ng.c);
        }
        boolean z3 = z2;
        boolean z4 = action.getExtras().getBoolean(b.l, true);
        if (i5 >= 28) {
            i2 = action.getSemanticAction();
        } else {
            i2 = action.getExtras().getInt(b.m, 0);
        }
        int i6 = i2;
        boolean isContextual = i5 >= 29 ? action.isContextual() : false;
        boolean isAuthenticationRequired = i5 >= 31 ? action.isAuthenticationRequired() : false;
        if (i5 >= 23) {
            if (action.getIcon() == null && (i3 = action.icon) != 0) {
                return new b(i3, action.title, action.actionIntent, action.getExtras(), vgVarArr, (vg[]) null, z3, i6, z4, isContextual, isAuthenticationRequired);
            }
            return new b(action.getIcon() != null ? IconCompat.o(action.getIcon()) : null, action.title, action.actionIntent, action.getExtras(), vgVarArr, (vg[]) null, z3, i6, z4, isContextual, isAuthenticationRequired);
        }
        return new b(action.icon, action.title, action.actionIntent, action.getExtras(), vgVarArr, (vg[]) null, z3, i6, z4, isContextual, isAuthenticationRequired);
    }

    public static int c(@x1 Notification notification) {
        Notification.Action[] actionArr = notification.actions;
        if (actionArr != null) {
            return actionArr.length;
        }
        return 0;
    }

    public static boolean d(@x1 Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            return notification.getAllowSystemGeneratedContextualActions();
        }
        return false;
    }

    public static boolean e(@x1 Notification notification) {
        return (notification.flags & 16) != 0;
    }

    public static int f(@x1 Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getBadgeIconType();
        }
        return 0;
    }

    @z1
    public static f g(@x1 Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            return f.a(notification.getBubbleMetadata());
        }
        return null;
    }

    @z1
    public static String h(@x1 Notification notification) {
        return notification.category;
    }

    @z1
    public static String i(@x1 Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getChannelId();
        }
        return null;
    }

    public static int j(@x1 Notification notification) {
        return notification.color;
    }

    @e2(19)
    @z1
    public static CharSequence k(@x1 Notification notification) {
        return notification.extras.getCharSequence(F);
    }

    @e2(19)
    @z1
    public static CharSequence l(@x1 Notification notification) {
        return notification.extras.getCharSequence(C);
    }

    @e2(19)
    @z1
    public static CharSequence m(@x1 Notification notification) {
        return notification.extras.getCharSequence(A);
    }

    @z1
    public static Bundle n(@x1 Notification notification) {
        return notification.extras;
    }

    @z1
    public static String o(@x1 Notification notification) {
        return notification.getGroup();
    }

    public static int p(@x1 Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getGroupAlertBehavior();
        }
        return 0;
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public static boolean q(@x1 Notification notification) {
        return (notification.flags & 128) != 0;
    }

    @e2(21)
    @x1
    public static List<b> r(@x1 Notification notification) {
        Bundle bundle;
        ArrayList arrayList = new ArrayList();
        Bundle bundle2 = notification.extras.getBundle(h.a);
        if (bundle2 != null && (bundle = bundle2.getBundle(h.e)) != null) {
            for (int i2 = 0; i2 < bundle.size(); i2++) {
                arrayList.add(ng.g(bundle.getBundle(Integer.toString(i2))));
            }
        }
        return arrayList;
    }

    public static boolean s(@x1 Notification notification) {
        return (notification.flags & 256) != 0;
    }

    @z1
    public static kh t(@x1 Notification notification) {
        LocusId locusId;
        if (Build.VERSION.SDK_INT < 29 || (locusId = notification.getLocusId()) == null) {
            return null;
        }
        return kh.d(locusId);
    }

    @x1
    public static Notification[] u(@x1 Bundle bundle, @x1 String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if (!(parcelableArray instanceof Notification[]) && parcelableArray != null) {
            Notification[] notificationArr = new Notification[parcelableArray.length];
            for (int i2 = 0; i2 < parcelableArray.length; i2++) {
                notificationArr[i2] = (Notification) parcelableArray[i2];
            }
            bundle.putParcelableArray(str, notificationArr);
            return notificationArr;
        }
        return (Notification[]) parcelableArray;
    }

    public static boolean v(@x1 Notification notification) {
        return (notification.flags & 2) != 0;
    }

    public static boolean w(@x1 Notification notification) {
        return (notification.flags & 8) != 0;
    }

    @x1
    public static List<tg> x(@x1 Notification notification) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 28) {
            ArrayList parcelableArrayList = notification.extras.getParcelableArrayList(Z);
            if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    arrayList.add(tg.a((Person) it.next()));
                }
            }
        } else {
            String[] stringArray = notification.extras.getStringArray(Y);
            if (stringArray != null && stringArray.length != 0) {
                for (String str : stringArray) {
                    arrayList.add(new tg.c().g(str).a());
                }
            }
        }
        return arrayList;
    }

    @z1
    public static Notification y(@x1 Notification notification) {
        return notification.publicVersion;
    }

    @z1
    public static CharSequence z(@x1 Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getSettingsText();
        }
        return null;
    }

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public static final class h implements j {
        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        public static final String a = "android.car.EXTENSIONS";
        private static final String b = "large_icon";
        private static final String c = "car_conversation";
        private static final String d = "app_color";
        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        public static final String e = "invisible_actions";
        private static final String f = "author";
        private static final String g = "text";
        private static final String h = "messages";
        private static final String i = "remote_input";
        private static final String j = "on_reply";
        private static final String k = "on_read";
        private static final String l = "participants";
        private static final String m = "timestamp";
        private Bitmap n;
        private a o;
        private int p;

        /* compiled from: NotificationCompat.java */
        @Deprecated
        /* loaded from: classes.dex */
        public static class a {
            private final String[] a;
            private final vg b;
            private final PendingIntent c;
            private final PendingIntent d;
            private final String[] e;
            private final long f;

            /* compiled from: NotificationCompat.java */
            /* renamed from: com.p7700g.p99005.kg$h$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static class C0204a {
                private final List<String> a = new ArrayList();
                private final String b;
                private vg c;
                private PendingIntent d;
                private PendingIntent e;
                private long f;

                public C0204a(@x1 String str) {
                    this.b = str;
                }

                @x1
                public C0204a a(@z1 String str) {
                    if (str != null) {
                        this.a.add(str);
                    }
                    return this;
                }

                @x1
                public a b() {
                    List<String> list = this.a;
                    return new a((String[]) list.toArray(new String[list.size()]), this.c, this.e, this.d, new String[]{this.b}, this.f);
                }

                @x1
                public C0204a c(long j) {
                    this.f = j;
                    return this;
                }

                @x1
                public C0204a d(@z1 PendingIntent pendingIntent) {
                    this.d = pendingIntent;
                    return this;
                }

                @x1
                public C0204a e(@z1 PendingIntent pendingIntent, @z1 vg vgVar) {
                    this.c = vgVar;
                    this.e = pendingIntent;
                    return this;
                }
            }

            public a(@z1 String[] strArr, @z1 vg vgVar, @z1 PendingIntent pendingIntent, @z1 PendingIntent pendingIntent2, @z1 String[] strArr2, long j) {
                this.a = strArr;
                this.b = vgVar;
                this.d = pendingIntent2;
                this.c = pendingIntent;
                this.e = strArr2;
                this.f = j;
            }

            public long a() {
                return this.f;
            }

            @z1
            public String[] b() {
                return this.a;
            }

            @z1
            public String c() {
                String[] strArr = this.e;
                if (strArr.length > 0) {
                    return strArr[0];
                }
                return null;
            }

            @z1
            public String[] d() {
                return this.e;
            }

            @z1
            public PendingIntent e() {
                return this.d;
            }

            @z1
            public vg f() {
                return this.b;
            }

            @z1
            public PendingIntent g() {
                return this.c;
            }
        }

        public h() {
            this.p = 0;
        }

        @e2(21)
        private static Bundle b(@x1 a aVar) {
            Bundle bundle = new Bundle();
            String str = (aVar.d() == null || aVar.d().length <= 1) ? null : aVar.d()[0];
            int length = aVar.b().length;
            Parcelable[] parcelableArr = new Parcelable[length];
            for (int i2 = 0; i2 < length; i2++) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("text", aVar.b()[i2]);
                bundle2.putString(f, str);
                parcelableArr[i2] = bundle2;
            }
            bundle.putParcelableArray(h, parcelableArr);
            vg f2 = aVar.f();
            if (f2 != null) {
                bundle.putParcelable(i, new RemoteInput.Builder(f2.o()).setLabel(f2.n()).setChoices(f2.h()).setAllowFreeFormInput(f2.f()).addExtras(f2.m()).build());
            }
            bundle.putParcelable(j, aVar.g());
            bundle.putParcelable(k, aVar.e());
            bundle.putStringArray(l, aVar.d());
            bundle.putLong("timestamp", aVar.a());
            return bundle;
        }

        @e2(21)
        private static a f(@z1 Bundle bundle) {
            String[] strArr;
            boolean z;
            vg vgVar = null;
            if (bundle == null) {
                return null;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray(h);
            if (parcelableArray != null) {
                int length = parcelableArray.length;
                String[] strArr2 = new String[length];
                for (int i2 = 0; i2 < length; i2++) {
                    if (parcelableArray[i2] instanceof Bundle) {
                        strArr2[i2] = ((Bundle) parcelableArray[i2]).getString("text");
                        if (strArr2[i2] != null) {
                        }
                    }
                    z = false;
                    break;
                }
                z = true;
                if (!z) {
                    return null;
                }
                strArr = strArr2;
            } else {
                strArr = null;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(k);
            PendingIntent pendingIntent2 = (PendingIntent) bundle.getParcelable(j);
            RemoteInput remoteInput = (RemoteInput) bundle.getParcelable(i);
            String[] stringArray = bundle.getStringArray(l);
            if (stringArray == null || stringArray.length != 1) {
                return null;
            }
            if (remoteInput != null) {
                vgVar = new vg(remoteInput.getResultKey(), remoteInput.getLabel(), remoteInput.getChoices(), remoteInput.getAllowFreeFormInput(), Build.VERSION.SDK_INT >= 29 ? remoteInput.getEditChoicesBeforeSending() : 0, remoteInput.getExtras(), null);
            }
            return new a(strArr, vgVar, pendingIntent2, pendingIntent, stringArray, bundle.getLong("timestamp"));
        }

        @Override // com.p7700g.p99005.kg.j
        @x1
        public g a(@x1 g gVar) {
            Bundle bundle = new Bundle();
            Bitmap bitmap = this.n;
            if (bitmap != null) {
                bundle.putParcelable(b, bitmap);
            }
            int i2 = this.p;
            if (i2 != 0) {
                bundle.putInt(d, i2);
            }
            a aVar = this.o;
            if (aVar != null) {
                bundle.putBundle(c, b(aVar));
            }
            gVar.t().putBundle(a, bundle);
            return gVar;
        }

        @w0
        public int c() {
            return this.p;
        }

        @z1
        public Bitmap d() {
            return this.n;
        }

        @z1
        @Deprecated
        public a e() {
            return this.o;
        }

        @x1
        public h g(@w0 int i2) {
            this.p = i2;
            return this;
        }

        @x1
        public h h(@z1 Bitmap bitmap) {
            this.n = bitmap;
            return this;
        }

        @x1
        @Deprecated
        public h i(@z1 a aVar) {
            this.o = aVar;
            return this;
        }

        public h(@x1 Notification notification) {
            this.p = 0;
            Bundle bundle = kg.n(notification) == null ? null : kg.n(notification).getBundle(a);
            if (bundle != null) {
                this.n = (Bitmap) bundle.getParcelable(b);
                this.p = bundle.getInt(d, 0);
                this.o = f(bundle.getBundle(c));
            }
        }
    }

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public static class l extends q {
        private static final String e = "androidx.core.app.NotificationCompat$InboxStyle";
        private ArrayList<CharSequence> f = new ArrayList<>();

        public l() {
        }

        @x1
        public l A(@z1 CharSequence charSequence) {
            if (charSequence != null) {
                this.f.add(g.A(charSequence));
            }
            return this;
        }

        @x1
        public l B(@z1 CharSequence charSequence) {
            this.b = g.A(charSequence);
            return this;
        }

        @x1
        public l C(@z1 CharSequence charSequence) {
            this.c = g.A(charSequence);
            this.d = true;
            return this;
        }

        @Override // com.p7700g.p99005.kg.q
        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        public void b(hg hgVar) {
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(hgVar.a()).setBigContentTitle(this.b);
            if (this.d) {
                bigContentTitle.setSummaryText(this.c);
            }
            Iterator<CharSequence> it = this.f.iterator();
            while (it.hasNext()) {
                bigContentTitle.addLine(it.next());
            }
        }

        @Override // com.p7700g.p99005.kg.q
        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        public void g(@x1 Bundle bundle) {
            super.g(bundle);
            bundle.remove(kg.V);
        }

        @Override // com.p7700g.p99005.kg.q
        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        @x1
        public String t() {
            return e;
        }

        @Override // com.p7700g.p99005.kg.q
        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        public void y(@x1 Bundle bundle) {
            super.y(bundle);
            this.f.clear();
            if (bundle.containsKey(kg.V)) {
                Collections.addAll(this.f, bundle.getCharSequenceArray(kg.V));
            }
        }

        public l(@z1 g gVar) {
            z(gVar);
        }
    }

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public static class m extends q {
        private static final String e = "androidx.core.app.NotificationCompat$MessagingStyle";
        public static final int f = 25;
        private final List<a> g = new ArrayList();
        private final List<a> h = new ArrayList();
        private tg i;
        @z1
        private CharSequence j;
        @z1
        private Boolean k;

        public m() {
        }

        @z1
        public static m E(@x1 Notification notification) {
            q s = q.s(notification);
            if (s instanceof m) {
                return (m) s;
            }
            return null;
        }

        @z1
        private a F() {
            List<a> list;
            for (int size = this.g.size() - 1; size >= 0; size--) {
                a aVar = this.g.get(size);
                if (aVar.g() != null && !TextUtils.isEmpty(aVar.g().f())) {
                    return aVar;
                }
            }
            if (this.g.isEmpty()) {
                return null;
            }
            return this.g.get(list.size() - 1);
        }

        private boolean L() {
            for (int size = this.g.size() - 1; size >= 0; size--) {
                a aVar = this.g.get(size);
                if (aVar.g() != null && aVar.g().f() == null) {
                    return true;
                }
            }
            return false;
        }

        @x1
        private TextAppearanceSpan N(int i) {
            return new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i), null);
        }

        private CharSequence O(@x1 a aVar) {
            zn c = zn.c();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i = 1 != 0 ? sr.t : -1;
            String f2 = aVar.g() == null ? "" : aVar.g().f();
            if (TextUtils.isEmpty(f2)) {
                f2 = this.i.f();
                if (1 != 0 && this.a.r() != 0) {
                    i = this.a.r();
                }
            }
            CharSequence m = c.m(f2);
            spannableStringBuilder.append(m);
            spannableStringBuilder.setSpan(N(i), spannableStringBuilder.length() - m.length(), spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) g54.A).append(c.m(aVar.i() != null ? aVar.i() : ""));
            return spannableStringBuilder;
        }

        @x1
        public m A(@z1 a aVar) {
            if (aVar != null) {
                this.h.add(aVar);
                if (this.h.size() > 25) {
                    this.h.remove(0);
                }
            }
            return this;
        }

        @x1
        public m B(@z1 a aVar) {
            if (aVar != null) {
                this.g.add(aVar);
                if (this.g.size() > 25) {
                    this.g.remove(0);
                }
            }
            return this;
        }

        @x1
        public m C(@z1 CharSequence charSequence, long j, @z1 tg tgVar) {
            B(new a(charSequence, j, tgVar));
            return this;
        }

        @x1
        @Deprecated
        public m D(@z1 CharSequence charSequence, long j, @z1 CharSequence charSequence2) {
            this.g.add(new a(charSequence, j, new tg.c().f(charSequence2).a()));
            if (this.g.size() > 25) {
                this.g.remove(0);
            }
            return this;
        }

        @z1
        public CharSequence G() {
            return this.j;
        }

        @x1
        public List<a> H() {
            return this.h;
        }

        @x1
        public List<a> I() {
            return this.g;
        }

        @x1
        public tg J() {
            return this.i;
        }

        @z1
        @Deprecated
        public CharSequence K() {
            return this.i.f();
        }

        public boolean M() {
            g gVar = this.a;
            if (gVar != null && gVar.b.getApplicationInfo().targetSdkVersion < 28 && this.k == null) {
                return this.j != null;
            }
            Boolean bool = this.k;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        @x1
        public m P(@z1 CharSequence charSequence) {
            this.j = charSequence;
            return this;
        }

        @x1
        public m Q(boolean z) {
            this.k = Boolean.valueOf(z);
            return this;
        }

        @Override // com.p7700g.p99005.kg.q
        public void a(@x1 Bundle bundle) {
            super.a(bundle);
            bundle.putCharSequence(kg.d0, this.i.f());
            bundle.putBundle(kg.e0, this.i.m());
            bundle.putCharSequence(kg.j0, this.j);
            if (this.j != null && this.k.booleanValue()) {
                bundle.putCharSequence(kg.f0, this.j);
            }
            if (!this.g.isEmpty()) {
                bundle.putParcelableArray(kg.g0, a.a(this.g));
            }
            if (!this.h.isEmpty()) {
                bundle.putParcelableArray(kg.h0, a.a(this.h));
            }
            Boolean bool = this.k;
            if (bool != null) {
                bundle.putBoolean(kg.i0, bool.booleanValue());
            }
        }

        @Override // com.p7700g.p99005.kg.q
        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        public void b(hg hgVar) {
            CharSequence i;
            Notification.MessagingStyle messagingStyle;
            Q(M());
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 24) {
                if (i2 >= 28) {
                    messagingStyle = new Notification.MessagingStyle(this.i.k());
                } else {
                    messagingStyle = new Notification.MessagingStyle(this.i.f());
                }
                for (a aVar : this.g) {
                    messagingStyle.addMessage(aVar.l());
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    for (a aVar2 : this.h) {
                        messagingStyle.addHistoricMessage(aVar2.l());
                    }
                }
                if (this.k.booleanValue() || Build.VERSION.SDK_INT >= 28) {
                    messagingStyle.setConversationTitle(this.j);
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    messagingStyle.setGroupConversation(this.k.booleanValue());
                }
                messagingStyle.setBuilder(hgVar.a());
                return;
            }
            a F = F();
            if (this.j != null && this.k.booleanValue()) {
                hgVar.a().setContentTitle(this.j);
            } else if (F != null) {
                hgVar.a().setContentTitle("");
                if (F.g() != null) {
                    hgVar.a().setContentTitle(F.g().f());
                }
            }
            if (F != null) {
                Notification.Builder a2 = hgVar.a();
                if (this.j != null) {
                    i = O(F);
                } else {
                    i = F.i();
                }
                a2.setContentText(i);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            boolean z = this.j != null || L();
            for (int size = this.g.size() - 1; size >= 0; size--) {
                a aVar3 = this.g.get(size);
                CharSequence O = z ? O(aVar3) : aVar3.i();
                if (size != this.g.size() - 1) {
                    spannableStringBuilder.insert(0, (CharSequence) "\n");
                }
                spannableStringBuilder.insert(0, O);
            }
            new Notification.BigTextStyle(hgVar.a()).setBigContentTitle(null).bigText(spannableStringBuilder);
        }

        @Override // com.p7700g.p99005.kg.q
        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        public void g(@x1 Bundle bundle) {
            super.g(bundle);
            bundle.remove(kg.e0);
            bundle.remove(kg.d0);
            bundle.remove(kg.f0);
            bundle.remove(kg.j0);
            bundle.remove(kg.g0);
            bundle.remove(kg.h0);
            bundle.remove(kg.i0);
        }

        @Override // com.p7700g.p99005.kg.q
        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        @x1
        public String t() {
            return e;
        }

        @Override // com.p7700g.p99005.kg.q
        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        public void y(@x1 Bundle bundle) {
            super.y(bundle);
            this.g.clear();
            if (bundle.containsKey(kg.e0)) {
                this.i = tg.b(bundle.getBundle(kg.e0));
            } else {
                this.i = new tg.c().f(bundle.getString(kg.d0)).a();
            }
            CharSequence charSequence = bundle.getCharSequence(kg.f0);
            this.j = charSequence;
            if (charSequence == null) {
                this.j = bundle.getCharSequence(kg.j0);
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray(kg.g0);
            if (parcelableArray != null) {
                this.g.addAll(a.f(parcelableArray));
            }
            Parcelable[] parcelableArray2 = bundle.getParcelableArray(kg.h0);
            if (parcelableArray2 != null) {
                this.h.addAll(a.f(parcelableArray2));
            }
            if (bundle.containsKey(kg.i0)) {
                this.k = Boolean.valueOf(bundle.getBoolean(kg.i0));
            }
        }

        @Deprecated
        public m(@x1 CharSequence charSequence) {
            this.i = new tg.c().f(charSequence).a();
        }

        /* compiled from: NotificationCompat.java */
        /* loaded from: classes.dex */
        public static final class a {
            public static final String a = "text";
            public static final String b = "time";
            public static final String c = "sender";
            public static final String d = "type";
            public static final String e = "uri";
            public static final String f = "extras";
            public static final String g = "person";
            public static final String h = "sender_person";
            private final CharSequence i;
            private final long j;
            @z1
            private final tg k;
            private Bundle l;
            @z1
            private String m;
            @z1
            private Uri n;

            public a(@z1 CharSequence charSequence, long j, @z1 tg tgVar) {
                this.l = new Bundle();
                this.i = charSequence;
                this.j = j;
                this.k = tgVar;
            }

            @x1
            public static Bundle[] a(@x1 List<a> list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    bundleArr[i] = list.get(i).m();
                }
                return bundleArr;
            }

            @z1
            public static a e(@x1 Bundle bundle) {
                tg a2;
                try {
                    if (bundle.containsKey("text") && bundle.containsKey("time")) {
                        if (bundle.containsKey(g)) {
                            a2 = tg.b(bundle.getBundle(g));
                        } else if (bundle.containsKey(h) && Build.VERSION.SDK_INT >= 28) {
                            a2 = tg.a((Person) bundle.getParcelable(h));
                        } else {
                            a2 = bundle.containsKey(c) ? new tg.c().f(bundle.getCharSequence(c)).a() : null;
                        }
                        a aVar = new a(bundle.getCharSequence("text"), bundle.getLong("time"), a2);
                        if (bundle.containsKey("type") && bundle.containsKey(e)) {
                            aVar.k(bundle.getString("type"), (Uri) bundle.getParcelable(e));
                        }
                        if (bundle.containsKey("extras")) {
                            aVar.d().putAll(bundle.getBundle("extras"));
                        }
                        return aVar;
                    }
                } catch (ClassCastException unused) {
                }
                return null;
            }

            @x1
            public static List<a> f(@x1 Parcelable[] parcelableArr) {
                a e2;
                ArrayList arrayList = new ArrayList(parcelableArr.length);
                for (int i = 0; i < parcelableArr.length; i++) {
                    if ((parcelableArr[i] instanceof Bundle) && (e2 = e((Bundle) parcelableArr[i])) != null) {
                        arrayList.add(e2);
                    }
                }
                return arrayList;
            }

            @x1
            private Bundle m() {
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.i;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong("time", this.j);
                tg tgVar = this.k;
                if (tgVar != null) {
                    bundle.putCharSequence(c, tgVar.f());
                    if (Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable(h, this.k.k());
                    } else {
                        bundle.putBundle(g, this.k.m());
                    }
                }
                String str = this.m;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = this.n;
                if (uri != null) {
                    bundle.putParcelable(e, uri);
                }
                Bundle bundle2 = this.l;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                return bundle;
            }

            @z1
            public String b() {
                return this.m;
            }

            @z1
            public Uri c() {
                return this.n;
            }

            @x1
            public Bundle d() {
                return this.l;
            }

            @z1
            public tg g() {
                return this.k;
            }

            @z1
            @Deprecated
            public CharSequence h() {
                tg tgVar = this.k;
                if (tgVar == null) {
                    return null;
                }
                return tgVar.f();
            }

            @z1
            public CharSequence i() {
                return this.i;
            }

            public long j() {
                return this.j;
            }

            @x1
            public a k(@z1 String str, @z1 Uri uri) {
                this.m = str;
                this.n = uri;
                return this;
            }

            @e2(24)
            @i2({i2.a.LIBRARY_GROUP_PREFIX})
            @x1
            public Notification.MessagingStyle.Message l() {
                Notification.MessagingStyle.Message message;
                tg g2 = g();
                if (Build.VERSION.SDK_INT >= 28) {
                    message = new Notification.MessagingStyle.Message(i(), j(), g2 != null ? g2.k() : null);
                } else {
                    message = new Notification.MessagingStyle.Message(i(), j(), g2 != null ? g2.f() : null);
                }
                if (b() != null) {
                    message.setData(b(), c());
                }
                return message;
            }

            @Deprecated
            public a(@z1 CharSequence charSequence, long j, @z1 CharSequence charSequence2) {
                this(charSequence, j, new tg.c().f(charSequence2).a());
            }
        }

        public m(@x1 tg tgVar) {
            if (!TextUtils.isEmpty(tgVar.f())) {
                this.i = tgVar;
                return;
            }
            throw new IllegalArgumentException("User's name must not be empty.");
        }
    }

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public static final class r implements j {
        private static final int A = 4;
        private static final int B = 8;
        private static final int C = 16;
        private static final int D = 32;
        private static final int E = 64;
        private static final int F = 1;
        private static final int G = 8388613;
        private static final int H = 80;
        public static final int a = -1;
        @Deprecated
        public static final int b = 0;
        @Deprecated
        public static final int c = 1;
        @Deprecated
        public static final int d = 2;
        @Deprecated
        public static final int e = 3;
        @Deprecated
        public static final int f = 4;
        @Deprecated
        public static final int g = 5;
        @Deprecated
        public static final int h = 0;
        @Deprecated
        public static final int i = -1;
        private static final String j = "android.wearable.EXTENSIONS";
        private static final String k = "actions";
        private static final String l = "flags";
        private static final String m = "displayIntent";
        private static final String n = "pages";
        private static final String o = "background";
        private static final String p = "contentIcon";
        private static final String q = "contentIconGravity";
        private static final String r = "contentActionIndex";
        private static final String s = "customSizePreset";
        private static final String t = "customContentHeight";
        private static final String u = "gravity";
        private static final String v = "hintScreenTimeout";
        private static final String w = "dismissalId";
        private static final String x = "bridgeTag";
        private static final int y = 1;
        private static final int z = 2;
        private ArrayList<b> I;
        private int J;
        private PendingIntent K;
        private ArrayList<Notification> L;
        private Bitmap M;
        private int N;
        private int O;
        private int P;
        private int Q;
        private int R;
        private int S;
        private int T;
        private String U;
        private String V;

        public r() {
            this.I = new ArrayList<>();
            this.J = 1;
            this.L = new ArrayList<>();
            this.O = 8388613;
            this.P = -1;
            this.Q = 0;
            this.S = 80;
        }

        private void N(int i2, boolean z2) {
            if (z2) {
                this.J = i2 | this.J;
                return;
            }
            this.J = (~i2) & this.J;
        }

        @e2(20)
        private static Notification.Action i(b bVar) {
            Notification.Action.Builder builder;
            Bundle bundle;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 23) {
                IconCompat f2 = bVar.f();
                builder = new Notification.Action.Builder(f2 == null ? null : f2.L(), bVar.j(), bVar.a());
            } else {
                IconCompat f3 = bVar.f();
                builder = new Notification.Action.Builder((f3 == null || f3.D() != 2) ? 0 : f3.A(), bVar.j(), bVar.a());
            }
            if (bVar.d() != null) {
                bundle = new Bundle(bVar.d());
            } else {
                bundle = new Bundle();
            }
            bundle.putBoolean(ng.c, bVar.b());
            if (i2 >= 24) {
                builder.setAllowGeneratedReplies(bVar.b());
            }
            if (i2 >= 31) {
                builder.setAuthenticationRequired(bVar.k());
            }
            builder.addExtras(bundle);
            vg[] g2 = bVar.g();
            if (g2 != null) {
                for (RemoteInput remoteInput : vg.d(g2)) {
                    builder.addRemoteInput(remoteInput);
                }
            }
            return builder.build();
        }

        @Deprecated
        public boolean A() {
            return (this.J & 4) != 0;
        }

        @x1
        @Deprecated
        public List<Notification> B() {
            return this.L;
        }

        public boolean C() {
            return (this.J & 8) != 0;
        }

        @x1
        @Deprecated
        public r D(@z1 Bitmap bitmap) {
            this.M = bitmap;
            return this;
        }

        @x1
        public r E(@z1 String str) {
            this.V = str;
            return this;
        }

        @x1
        public r F(int i2) {
            this.P = i2;
            return this;
        }

        @x1
        @Deprecated
        public r G(int i2) {
            this.N = i2;
            return this;
        }

        @x1
        @Deprecated
        public r H(int i2) {
            this.O = i2;
            return this;
        }

        @x1
        public r I(boolean z2) {
            N(1, z2);
            return this;
        }

        @x1
        @Deprecated
        public r J(int i2) {
            this.R = i2;
            return this;
        }

        @x1
        @Deprecated
        public r K(int i2) {
            this.Q = i2;
            return this;
        }

        @x1
        public r L(@z1 String str) {
            this.U = str;
            return this;
        }

        @x1
        @Deprecated
        public r M(@z1 PendingIntent pendingIntent) {
            this.K = pendingIntent;
            return this;
        }

        @x1
        @Deprecated
        public r O(int i2) {
            this.S = i2;
            return this;
        }

        @x1
        @Deprecated
        public r P(boolean z2) {
            N(32, z2);
            return this;
        }

        @x1
        @Deprecated
        public r Q(boolean z2) {
            N(16, z2);
            return this;
        }

        @x1
        public r R(boolean z2) {
            N(64, z2);
            return this;
        }

        @x1
        @Deprecated
        public r S(boolean z2) {
            N(2, z2);
            return this;
        }

        @x1
        @Deprecated
        public r T(int i2) {
            this.T = i2;
            return this;
        }

        @x1
        @Deprecated
        public r U(boolean z2) {
            N(4, z2);
            return this;
        }

        @x1
        public r V(boolean z2) {
            N(8, z2);
            return this;
        }

        @Override // com.p7700g.p99005.kg.j
        @x1
        public g a(@x1 g gVar) {
            Bundle bundle = new Bundle();
            if (!this.I.isEmpty()) {
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.I.size());
                Iterator<b> it = this.I.iterator();
                while (it.hasNext()) {
                    arrayList.add(i(it.next()));
                }
                bundle.putParcelableArrayList(k, arrayList);
            }
            int i2 = this.J;
            if (i2 != 1) {
                bundle.putInt(l, i2);
            }
            PendingIntent pendingIntent = this.K;
            if (pendingIntent != null) {
                bundle.putParcelable(m, pendingIntent);
            }
            if (!this.L.isEmpty()) {
                ArrayList<Notification> arrayList2 = this.L;
                bundle.putParcelableArray(n, (Parcelable[]) arrayList2.toArray(new Notification[arrayList2.size()]));
            }
            Bitmap bitmap = this.M;
            if (bitmap != null) {
                bundle.putParcelable(o, bitmap);
            }
            int i3 = this.N;
            if (i3 != 0) {
                bundle.putInt(p, i3);
            }
            int i4 = this.O;
            if (i4 != 8388613) {
                bundle.putInt(q, i4);
            }
            int i5 = this.P;
            if (i5 != -1) {
                bundle.putInt(r, i5);
            }
            int i6 = this.Q;
            if (i6 != 0) {
                bundle.putInt(s, i6);
            }
            int i7 = this.R;
            if (i7 != 0) {
                bundle.putInt(t, i7);
            }
            int i8 = this.S;
            if (i8 != 80) {
                bundle.putInt(u, i8);
            }
            int i9 = this.T;
            if (i9 != 0) {
                bundle.putInt(v, i9);
            }
            String str = this.U;
            if (str != null) {
                bundle.putString(w, str);
            }
            String str2 = this.V;
            if (str2 != null) {
                bundle.putString(x, str2);
            }
            gVar.t().putBundle(j, bundle);
            return gVar;
        }

        @x1
        public r b(@x1 b bVar) {
            this.I.add(bVar);
            return this;
        }

        @x1
        public r c(@x1 List<b> list) {
            this.I.addAll(list);
            return this;
        }

        @x1
        @Deprecated
        public r d(@x1 Notification notification) {
            this.L.add(notification);
            return this;
        }

        @x1
        @Deprecated
        public r e(@x1 List<Notification> list) {
            this.L.addAll(list);
            return this;
        }

        @x1
        public r f() {
            this.I.clear();
            return this;
        }

        @x1
        @Deprecated
        public r g() {
            this.L.clear();
            return this;
        }

        @x1
        /* renamed from: h */
        public r clone() {
            r rVar = new r();
            rVar.I = new ArrayList<>(this.I);
            rVar.J = this.J;
            rVar.K = this.K;
            rVar.L = new ArrayList<>(this.L);
            rVar.M = this.M;
            rVar.N = this.N;
            rVar.O = this.O;
            rVar.P = this.P;
            rVar.Q = this.Q;
            rVar.R = this.R;
            rVar.S = this.S;
            rVar.T = this.T;
            rVar.U = this.U;
            rVar.V = this.V;
            return rVar;
        }

        @x1
        public List<b> j() {
            return this.I;
        }

        @z1
        @Deprecated
        public Bitmap k() {
            return this.M;
        }

        @z1
        public String l() {
            return this.V;
        }

        public int m() {
            return this.P;
        }

        @Deprecated
        public int n() {
            return this.N;
        }

        @Deprecated
        public int o() {
            return this.O;
        }

        public boolean p() {
            return (this.J & 1) != 0;
        }

        @Deprecated
        public int q() {
            return this.R;
        }

        @Deprecated
        public int r() {
            return this.Q;
        }

        @z1
        public String s() {
            return this.U;
        }

        @z1
        @Deprecated
        public PendingIntent t() {
            return this.K;
        }

        @Deprecated
        public int u() {
            return this.S;
        }

        @Deprecated
        public boolean v() {
            return (this.J & 32) != 0;
        }

        @Deprecated
        public boolean w() {
            return (this.J & 16) != 0;
        }

        public boolean x() {
            return (this.J & 64) != 0;
        }

        @Deprecated
        public boolean y() {
            return (this.J & 2) != 0;
        }

        @Deprecated
        public int z() {
            return this.T;
        }

        public r(@x1 Notification notification) {
            this.I = new ArrayList<>();
            this.J = 1;
            this.L = new ArrayList<>();
            this.O = 8388613;
            this.P = -1;
            this.Q = 0;
            this.S = 80;
            Bundle n2 = kg.n(notification);
            Bundle bundle = n2 != null ? n2.getBundle(j) : null;
            if (bundle != null) {
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(k);
                if (parcelableArrayList != null) {
                    int size = parcelableArrayList.size();
                    b[] bVarArr = new b[size];
                    for (int i2 = 0; i2 < size; i2++) {
                        bVarArr[i2] = kg.b((Notification.Action) parcelableArrayList.get(i2));
                    }
                    Collections.addAll(this.I, bVarArr);
                }
                this.J = bundle.getInt(l, 1);
                this.K = (PendingIntent) bundle.getParcelable(m);
                Notification[] u2 = kg.u(bundle, n);
                if (u2 != null) {
                    Collections.addAll(this.L, u2);
                }
                this.M = (Bitmap) bundle.getParcelable(o);
                this.N = bundle.getInt(p);
                this.O = bundle.getInt(q, 8388613);
                this.P = bundle.getInt(r, -1);
                this.Q = bundle.getInt(s, 0);
                this.R = bundle.getInt(t);
                this.S = bundle.getInt(u, 80);
                this.T = bundle.getInt(v);
                this.U = bundle.getString(w);
                this.V = bundle.getString(x);
            }
        }
    }

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public static class g {
        private static final int a = 5120;
        public String A;
        public boolean B;
        public boolean C;
        public boolean D;
        public String E;
        public Bundle F;
        public int G;
        public int H;
        public Notification I;
        public RemoteViews J;
        public RemoteViews K;
        public RemoteViews L;
        public String M;
        public int N;
        public String O;
        public kh P;
        public long Q;
        public int R;
        public int S;
        public boolean T;
        public f U;
        public Notification V;
        public boolean W;
        public Icon X;
        @Deprecated
        public ArrayList<String> Y;
        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        public Context b;
        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        public ArrayList<b> c;
        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        @x1
        public ArrayList<tg> d;
        public ArrayList<b> e;
        public CharSequence f;
        public CharSequence g;
        public PendingIntent h;
        public PendingIntent i;
        public RemoteViews j;
        public Bitmap k;
        public CharSequence l;
        public int m;
        public int n;
        public boolean o;
        public boolean p;
        public boolean q;
        public q r;
        public CharSequence s;
        public CharSequence t;
        public CharSequence[] u;
        public int v;
        public int w;
        public boolean x;
        public String y;
        public boolean z;

        @e2(19)
        public g(@x1 Context context, @x1 Notification notification) {
            this(context, kg.i(notification));
            ArrayList parcelableArrayList;
            Bundle bundle = notification.extras;
            q s = q.s(notification);
            P(kg.m(notification)).O(kg.l(notification)).M(kg.k(notification)).A0(kg.D(notification)).o0(kg.z(notification)).z0(s).N(notification.contentIntent).Z(kg.o(notification)).b0(kg.H(notification)).f0(kg.t(notification)).H0(notification.when).r0(kg.B(notification)).E0(kg.F(notification)).D(kg.e(notification)).j0(kg.w(notification)).i0(kg.v(notification)).e0(kg.s(notification)).c0(notification.largeIcon).E(kg.f(notification)).G(kg.h(notification)).F(kg.g(notification)).h0(notification.number).B0(notification.tickerText).N(notification.contentIntent).U(notification.deleteIntent).Y(notification.fullScreenIntent, kg.q(notification)).y0(notification.sound, notification.audioStreamType).F0(notification.vibrate).d0(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).T(notification.defaults).k0(notification.priority).J(kg.j(notification)).G0(kg.G(notification)).m0(kg.y(notification)).w0(kg.C(notification)).D0(kg.E(notification)).p0(kg.A(notification)).l0(bundle.getInt(kg.M), bundle.getInt(kg.L), bundle.getBoolean(kg.N)).C(kg.d(notification)).u0(notification.icon, notification.iconLevel).c(u(notification, s));
            if (Build.VERSION.SDK_INT >= 23) {
                this.X = notification.getSmallIcon();
            }
            Notification.Action[] actionArr = notification.actions;
            if (actionArr != null && actionArr.length != 0) {
                for (Notification.Action action : actionArr) {
                    b(b.a.f(action).c());
                }
            }
            List<b> r = kg.r(notification);
            if (!r.isEmpty()) {
                for (b bVar : r) {
                    e(bVar);
                }
            }
            String[] stringArray = notification.extras.getStringArray(kg.Y);
            if (stringArray != null && stringArray.length != 0) {
                for (String str : stringArray) {
                    g(str);
                }
            }
            if (Build.VERSION.SDK_INT >= 28 && (parcelableArrayList = notification.extras.getParcelableArrayList(kg.Z)) != null && !parcelableArrayList.isEmpty()) {
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    f(tg.a((Person) it.next()));
                }
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 24 && bundle.containsKey(kg.P)) {
                I(bundle.getBoolean(kg.P));
            }
            if (i < 26 || !bundle.containsKey(kg.Q)) {
                return;
            }
            K(bundle.getBoolean(kg.Q));
        }

        @z1
        public static CharSequence A(@z1 CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > a) ? charSequence.subSequence(0, a) : charSequence;
        }

        @z1
        private Bitmap B(@z1 Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.b.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(nf.c.g);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(nf.c.f);
            if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
            }
            return bitmap;
        }

        private boolean I0() {
            q qVar = this.r;
            return qVar == null || !qVar.r();
        }

        private void W(int i, boolean z) {
            if (z) {
                Notification notification = this.V;
                notification.flags = i | notification.flags;
                return;
            }
            Notification notification2 = this.V;
            notification2.flags = (~i) & notification2.flags;
        }

        @e2(19)
        @z1
        private static Bundle u(@x1 Notification notification, @z1 q qVar) {
            if (notification.extras == null) {
                return null;
            }
            Bundle bundle = new Bundle(notification.extras);
            bundle.remove(kg.A);
            bundle.remove(kg.C);
            bundle.remove(kg.F);
            bundle.remove(kg.D);
            bundle.remove(kg.b);
            bundle.remove(kg.c);
            bundle.remove(kg.R);
            bundle.remove(kg.L);
            bundle.remove(kg.M);
            bundle.remove(kg.N);
            bundle.remove(kg.P);
            bundle.remove(kg.Q);
            bundle.remove(kg.Z);
            bundle.remove(kg.Y);
            bundle.remove(mg.d);
            bundle.remove(mg.b);
            bundle.remove(mg.c);
            bundle.remove(mg.a);
            bundle.remove(mg.e);
            Bundle bundle2 = bundle.getBundle(h.a);
            if (bundle2 != null) {
                Bundle bundle3 = new Bundle(bundle2);
                bundle3.remove(h.e);
                bundle.putBundle(h.a, bundle3);
            }
            if (qVar != null) {
                qVar.g(bundle);
            }
            return bundle;
        }

        @x1
        public g A0(@z1 CharSequence charSequence) {
            this.s = A(charSequence);
            return this;
        }

        @x1
        public g B0(@z1 CharSequence charSequence) {
            this.V.tickerText = A(charSequence);
            return this;
        }

        @x1
        public g C(boolean z) {
            this.T = z;
            return this;
        }

        @x1
        @Deprecated
        public g C0(@z1 CharSequence charSequence, @z1 RemoteViews remoteViews) {
            this.V.tickerText = A(charSequence);
            this.j = remoteViews;
            return this;
        }

        @x1
        public g D(boolean z) {
            W(16, z);
            return this;
        }

        @x1
        public g D0(long j) {
            this.Q = j;
            return this;
        }

        @x1
        public g E(int i) {
            this.N = i;
            return this;
        }

        @x1
        public g E0(boolean z) {
            this.p = z;
            return this;
        }

        @x1
        public g F(@z1 f fVar) {
            this.U = fVar;
            return this;
        }

        @x1
        public g F0(@z1 long[] jArr) {
            this.V.vibrate = jArr;
            return this;
        }

        @x1
        public g G(@z1 String str) {
            this.E = str;
            return this;
        }

        @x1
        public g G0(int i) {
            this.H = i;
            return this;
        }

        @x1
        public g H(@x1 String str) {
            this.M = str;
            return this;
        }

        @x1
        public g H0(long j) {
            this.V.when = j;
            return this;
        }

        @e2(24)
        @x1
        public g I(boolean z) {
            this.q = z;
            t().putBoolean(kg.P, z);
            return this;
        }

        @x1
        public g J(@w0 int i) {
            this.G = i;
            return this;
        }

        @x1
        public g K(boolean z) {
            this.C = z;
            this.D = true;
            return this;
        }

        @x1
        public g L(@z1 RemoteViews remoteViews) {
            this.V.contentView = remoteViews;
            return this;
        }

        @x1
        public g M(@z1 CharSequence charSequence) {
            this.l = A(charSequence);
            return this;
        }

        @x1
        public g N(@z1 PendingIntent pendingIntent) {
            this.h = pendingIntent;
            return this;
        }

        @x1
        public g O(@z1 CharSequence charSequence) {
            this.g = A(charSequence);
            return this;
        }

        @x1
        public g P(@z1 CharSequence charSequence) {
            this.f = A(charSequence);
            return this;
        }

        @x1
        public g Q(@z1 RemoteViews remoteViews) {
            this.K = remoteViews;
            return this;
        }

        @x1
        public g R(@z1 RemoteViews remoteViews) {
            this.J = remoteViews;
            return this;
        }

        @x1
        public g S(@z1 RemoteViews remoteViews) {
            this.L = remoteViews;
            return this;
        }

        @x1
        public g T(int i) {
            Notification notification = this.V;
            notification.defaults = i;
            if ((i & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        @x1
        public g U(@z1 PendingIntent pendingIntent) {
            this.V.deleteIntent = pendingIntent;
            return this;
        }

        @x1
        public g V(@z1 Bundle bundle) {
            this.F = bundle;
            return this;
        }

        @x1
        public g X(int i) {
            this.S = i;
            return this;
        }

        @x1
        public g Y(@z1 PendingIntent pendingIntent, boolean z) {
            this.i = pendingIntent;
            W(128, z);
            return this;
        }

        @x1
        public g Z(@z1 String str) {
            this.y = str;
            return this;
        }

        @x1
        public g a(int i, @z1 CharSequence charSequence, @z1 PendingIntent pendingIntent) {
            this.c.add(new b(i, charSequence, pendingIntent));
            return this;
        }

        @x1
        public g a0(int i) {
            this.R = i;
            return this;
        }

        @x1
        public g b(@z1 b bVar) {
            if (bVar != null) {
                this.c.add(bVar);
            }
            return this;
        }

        @x1
        public g b0(boolean z) {
            this.z = z;
            return this;
        }

        @x1
        public g c(@z1 Bundle bundle) {
            if (bundle != null) {
                Bundle bundle2 = this.F;
                if (bundle2 == null) {
                    this.F = new Bundle(bundle);
                } else {
                    bundle2.putAll(bundle);
                }
            }
            return this;
        }

        @x1
        public g c0(@z1 Bitmap bitmap) {
            this.k = B(bitmap);
            return this;
        }

        @e2(21)
        @x1
        public g d(int i, @z1 CharSequence charSequence, @z1 PendingIntent pendingIntent) {
            this.e.add(new b(i, charSequence, pendingIntent));
            return this;
        }

        @x1
        public g d0(@w0 int i, int i2, int i3) {
            Notification notification = this.V;
            notification.ledARGB = i;
            notification.ledOnMS = i2;
            notification.ledOffMS = i3;
            notification.flags = ((i2 == 0 || i3 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        @e2(21)
        @x1
        public g e(@z1 b bVar) {
            if (bVar != null) {
                this.e.add(bVar);
            }
            return this;
        }

        @x1
        public g e0(boolean z) {
            this.B = z;
            return this;
        }

        @x1
        public g f(@z1 tg tgVar) {
            if (tgVar != null) {
                this.d.add(tgVar);
            }
            return this;
        }

        @x1
        public g f0(@z1 kh khVar) {
            this.P = khVar;
            return this;
        }

        @x1
        @Deprecated
        public g g(@z1 String str) {
            if (str != null && !str.isEmpty()) {
                this.Y.add(str);
            }
            return this;
        }

        @x1
        @Deprecated
        public g g0() {
            this.W = true;
            return this;
        }

        @x1
        public Notification h() {
            return new lg(this).c();
        }

        @x1
        public g h0(int i) {
            this.m = i;
            return this;
        }

        @x1
        public g i() {
            this.c.clear();
            return this;
        }

        @x1
        public g i0(boolean z) {
            W(2, z);
            return this;
        }

        @x1
        public g j() {
            this.e.clear();
            Bundle bundle = this.F.getBundle(h.a);
            if (bundle != null) {
                Bundle bundle2 = new Bundle(bundle);
                bundle2.remove(h.e);
                this.F.putBundle(h.a, bundle2);
            }
            return this;
        }

        @x1
        public g j0(boolean z) {
            W(8, z);
            return this;
        }

        @x1
        public g k() {
            this.d.clear();
            this.Y.clear();
            return this;
        }

        @x1
        public g k0(int i) {
            this.n = i;
            return this;
        }

        @z1
        @SuppressLint({"BuilderSetStyle"})
        public RemoteViews l() {
            RemoteViews v;
            int i = Build.VERSION.SDK_INT;
            if (this.K != null && I0()) {
                return this.K;
            }
            lg lgVar = new lg(this);
            q qVar = this.r;
            if (qVar == null || (v = qVar.v(lgVar)) == null) {
                Notification c = lgVar.c();
                if (i >= 24) {
                    return Notification.Builder.recoverBuilder(this.b, c).createBigContentView();
                }
                return c.bigContentView;
            }
            return v;
        }

        @x1
        public g l0(int i, int i2, boolean z) {
            this.v = i;
            this.w = i2;
            this.x = z;
            return this;
        }

        @z1
        @SuppressLint({"BuilderSetStyle"})
        public RemoteViews m() {
            RemoteViews w;
            if (this.J != null && I0()) {
                return this.J;
            }
            lg lgVar = new lg(this);
            q qVar = this.r;
            if (qVar == null || (w = qVar.w(lgVar)) == null) {
                Notification c = lgVar.c();
                if (Build.VERSION.SDK_INT >= 24) {
                    return Notification.Builder.recoverBuilder(this.b, c).createContentView();
                }
                return c.contentView;
            }
            return w;
        }

        @x1
        public g m0(@z1 Notification notification) {
            this.I = notification;
            return this;
        }

        @z1
        @SuppressLint({"BuilderSetStyle"})
        public RemoteViews n() {
            RemoteViews x;
            int i = Build.VERSION.SDK_INT;
            if (this.L != null && I0()) {
                return this.L;
            }
            lg lgVar = new lg(this);
            q qVar = this.r;
            if (qVar == null || (x = qVar.x(lgVar)) == null) {
                Notification c = lgVar.c();
                if (i >= 24) {
                    return Notification.Builder.recoverBuilder(this.b, c).createHeadsUpContentView();
                }
                return c.headsUpContentView;
            }
            return x;
        }

        @x1
        public g n0(@z1 CharSequence[] charSequenceArr) {
            this.u = charSequenceArr;
            return this;
        }

        @x1
        public g o(@x1 j jVar) {
            jVar.a(this);
            return this;
        }

        @x1
        public g o0(@z1 CharSequence charSequence) {
            this.t = A(charSequence);
            return this;
        }

        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews p() {
            return this.K;
        }

        @x1
        public g p0(@z1 String str) {
            this.O = str;
            return this;
        }

        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        @z1
        public f q() {
            return this.U;
        }

        @x1
        public g q0(@z1 ai aiVar) {
            if (aiVar == null) {
                return this;
            }
            this.O = aiVar.k();
            if (this.P == null) {
                if (aiVar.o() != null) {
                    this.P = aiVar.o();
                } else if (aiVar.k() != null) {
                    this.P = new kh(aiVar.k());
                }
            }
            if (this.f == null) {
                P(aiVar.w());
            }
            return this;
        }

        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        @w0
        public int r() {
            return this.G;
        }

        @x1
        public g r0(boolean z) {
            this.o = z;
            return this;
        }

        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews s() {
            return this.J;
        }

        @x1
        public g s0(boolean z) {
            this.W = z;
            return this;
        }

        @x1
        public Bundle t() {
            if (this.F == null) {
                this.F = new Bundle();
            }
            return this.F;
        }

        @x1
        public g t0(int i) {
            this.V.icon = i;
            return this;
        }

        @x1
        public g u0(int i, int i2) {
            Notification notification = this.V;
            notification.icon = i;
            notification.iconLevel = i2;
            return this;
        }

        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        public int v() {
            return this.S;
        }

        @e2(23)
        @x1
        public g v0(@x1 IconCompat iconCompat) {
            this.X = iconCompat.M(this.b);
            return this;
        }

        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews w() {
            return this.L;
        }

        @x1
        public g w0(@z1 String str) {
            this.A = str;
            return this;
        }

        @x1
        @Deprecated
        public Notification x() {
            return h();
        }

        @x1
        public g x0(@z1 Uri uri) {
            Notification notification = this.V;
            notification.sound = uri;
            notification.audioStreamType = -1;
            notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            return this;
        }

        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        public int y() {
            return this.n;
        }

        @x1
        public g y0(@z1 Uri uri, int i) {
            Notification notification = this.V;
            notification.sound = uri;
            notification.audioStreamType = i;
            notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setLegacyStreamType(i).build();
            return this;
        }

        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        public long z() {
            if (this.o) {
                return this.V.when;
            }
            return 0L;
        }

        @x1
        public g z0(@z1 q qVar) {
            if (this.r != qVar) {
                this.r = qVar;
                if (qVar != null) {
                    qVar.z(this);
                }
            }
            return this;
        }

        public g(@x1 Context context, @x1 String str) {
            this.c = new ArrayList<>();
            this.d = new ArrayList<>();
            this.e = new ArrayList<>();
            this.o = true;
            this.B = false;
            this.G = 0;
            this.H = 0;
            this.N = 0;
            this.R = 0;
            this.S = 0;
            Notification notification = new Notification();
            this.V = notification;
            this.b = context;
            this.M = str;
            notification.when = System.currentTimeMillis();
            this.V.audioStreamType = -1;
            this.n = 0;
            this.Y = new ArrayList<>();
            this.T = true;
        }

        @Deprecated
        public g(@x1 Context context) {
            this(context, (String) null);
        }
    }
}