package com.p7700g.p99005;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.kg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: NotificationCompatBuilder.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class lg implements hg {
    private final Context a;
    private final Notification.Builder b;
    private final kg.g c;
    private RemoteViews d;
    private RemoteViews e;
    private final List<Bundle> f = new ArrayList();
    private final Bundle g = new Bundle();
    private int h;
    private RemoteViews i;

    public lg(kg.g gVar) {
        List<String> list;
        int i;
        Icon icon;
        this.c = gVar;
        this.a = gVar.b;
        if (Build.VERSION.SDK_INT >= 26) {
            this.b = new Notification.Builder(gVar.b, gVar.M);
        } else {
            this.b = new Notification.Builder(gVar.b);
        }
        Notification notification = gVar.V;
        this.b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, gVar.j).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(gVar.f).setContentText(gVar.g).setContentInfo(gVar.l).setContentIntent(gVar.h).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(gVar.i, (notification.flags & 128) != 0).setLargeIcon(gVar.k).setNumber(gVar.m).setProgress(gVar.v, gVar.w, gVar.x);
        this.b.setSubText(gVar.s).setUsesChronometer(gVar.p).setPriority(gVar.n);
        Iterator<kg.b> it = gVar.c.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
        Bundle bundle = gVar.F;
        if (bundle != null) {
            this.g.putAll(bundle);
        }
        int i2 = Build.VERSION.SDK_INT;
        this.d = gVar.J;
        this.e = gVar.K;
        this.b.setShowWhen(gVar.o);
        this.b.setLocalOnly(gVar.B).setGroup(gVar.y).setGroupSummary(gVar.z).setSortKey(gVar.A);
        this.h = gVar.R;
        this.b.setCategory(gVar.E).setColor(gVar.G).setVisibility(gVar.H).setPublicVersion(gVar.I).setSound(notification.sound, notification.audioAttributes);
        if (i2 < 28) {
            list = e(g(gVar.d), gVar.Y);
        } else {
            list = gVar.Y;
        }
        if (list != null && !list.isEmpty()) {
            for (String str : list) {
                this.b.addPerson(str);
            }
        }
        this.i = gVar.L;
        if (gVar.e.size() > 0) {
            Bundle bundle2 = gVar.t().getBundle(kg.h.a);
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i3 = 0; i3 < gVar.e.size(); i3++) {
                bundle4.putBundle(Integer.toString(i3), ng.j(gVar.e.get(i3)));
            }
            bundle2.putBundle(kg.h.e, bundle4);
            bundle3.putBundle(kg.h.e, bundle4);
            gVar.t().putBundle(kg.h.a, bundle2);
            this.g.putBundle(kg.h.a, bundle3);
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 23 && (icon = gVar.X) != null) {
            this.b.setSmallIcon(icon);
        }
        if (i4 >= 24) {
            this.b.setExtras(gVar.F).setRemoteInputHistory(gVar.u);
            RemoteViews remoteViews = gVar.J;
            if (remoteViews != null) {
                this.b.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = gVar.K;
            if (remoteViews2 != null) {
                this.b.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = gVar.L;
            if (remoteViews3 != null) {
                this.b.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (i4 >= 26) {
            this.b.setBadgeIconType(gVar.N).setSettingsText(gVar.t).setShortcutId(gVar.O).setTimeoutAfter(gVar.Q).setGroupAlertBehavior(gVar.R);
            if (gVar.D) {
                this.b.setColorized(gVar.C);
            }
            if (!TextUtils.isEmpty(gVar.M)) {
                this.b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i4 >= 28) {
            Iterator<tg> it2 = gVar.d.iterator();
            while (it2.hasNext()) {
                this.b.addPerson(it2.next().k());
            }
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 29) {
            this.b.setAllowSystemGeneratedContextualActions(gVar.T);
            this.b.setBubbleMetadata(kg.f.k(gVar.U));
            kh khVar = gVar.P;
            if (khVar != null) {
                this.b.setLocusId(khVar.c());
            }
        }
        if (i5 >= 31 && (i = gVar.S) != 0) {
            this.b.setForegroundServiceBehavior(i);
        }
        if (gVar.W) {
            if (this.c.z) {
                this.h = 2;
            } else {
                this.h = 1;
            }
            this.b.setVibrate(null);
            this.b.setSound(null);
            int i6 = notification.defaults & (-2);
            notification.defaults = i6;
            int i7 = i6 & (-3);
            notification.defaults = i7;
            this.b.setDefaults(i7);
            if (i5 >= 26) {
                if (TextUtils.isEmpty(this.c.y)) {
                    this.b.setGroup(kg.P0);
                }
                this.b.setGroupAlertBehavior(this.h);
            }
        }
    }

    private void b(kg.b bVar) {
        Notification.Action.Builder builder;
        Bundle bundle;
        int i = Build.VERSION.SDK_INT;
        IconCompat f = bVar.f();
        if (i >= 23) {
            builder = new Notification.Action.Builder(f != null ? f.L() : null, bVar.j(), bVar.a());
        } else {
            builder = new Notification.Action.Builder(f != null ? f.A() : 0, bVar.j(), bVar.a());
        }
        if (bVar.g() != null) {
            for (RemoteInput remoteInput : vg.d(bVar.g())) {
                builder.addRemoteInput(remoteInput);
            }
        }
        if (bVar.d() != null) {
            bundle = new Bundle(bVar.d());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean(ng.c, bVar.b());
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 24) {
            builder.setAllowGeneratedReplies(bVar.b());
        }
        bundle.putInt(kg.b.m, bVar.h());
        if (i2 >= 28) {
            builder.setSemanticAction(bVar.h());
        }
        if (i2 >= 29) {
            builder.setContextual(bVar.l());
        }
        if (i2 >= 31) {
            builder.setAuthenticationRequired(bVar.k());
        }
        bundle.putBoolean(kg.b.l, bVar.i());
        builder.addExtras(bundle);
        this.b.addAction(builder.build());
    }

    @z1
    private static List<String> e(@z1 List<String> list, @z1 List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        r7 r7Var = new r7(list2.size() + list.size());
        r7Var.addAll(list);
        r7Var.addAll(list2);
        return new ArrayList(r7Var);
    }

    @z1
    private static List<String> g(@z1 List<tg> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (tg tgVar : list) {
            arrayList.add(tgVar.j());
        }
        return arrayList;
    }

    private void h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        int i = notification.defaults & (-2);
        notification.defaults = i;
        notification.defaults = i & (-3);
    }

    @Override // com.p7700g.p99005.hg
    public Notification.Builder a() {
        return this.b;
    }

    public Notification c() {
        Bundle n;
        RemoteViews x;
        RemoteViews v;
        kg.q qVar = this.c.r;
        if (qVar != null) {
            qVar.b(this);
        }
        RemoteViews w = qVar != null ? qVar.w(this) : null;
        Notification d = d();
        if (w != null) {
            d.contentView = w;
        } else {
            RemoteViews remoteViews = this.c.J;
            if (remoteViews != null) {
                d.contentView = remoteViews;
            }
        }
        if (qVar != null && (v = qVar.v(this)) != null) {
            d.bigContentView = v;
        }
        if (qVar != null && (x = this.c.r.x(this)) != null) {
            d.headsUpContentView = x;
        }
        if (qVar != null && (n = kg.n(d)) != null) {
            qVar.a(n);
        }
        return d;
    }

    public Notification d() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return this.b.build();
        }
        if (i >= 24) {
            Notification build = this.b.build();
            if (this.h != 0) {
                if (build.getGroup() != null && (build.flags & 512) != 0 && this.h == 2) {
                    h(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && this.h == 1) {
                    h(build);
                }
            }
            return build;
        }
        this.b.setExtras(this.g);
        Notification build2 = this.b.build();
        RemoteViews remoteViews = this.d;
        if (remoteViews != null) {
            build2.contentView = remoteViews;
        }
        RemoteViews remoteViews2 = this.e;
        if (remoteViews2 != null) {
            build2.bigContentView = remoteViews2;
        }
        RemoteViews remoteViews3 = this.i;
        if (remoteViews3 != null) {
            build2.headsUpContentView = remoteViews3;
        }
        if (this.h != 0) {
            if (build2.getGroup() != null && (build2.flags & 512) != 0 && this.h == 2) {
                h(build2);
            }
            if (build2.getGroup() != null && (build2.flags & 512) == 0 && this.h == 1) {
                h(build2);
            }
        }
        return build2;
    }

    public Context f() {
        return this.a;
    }
}