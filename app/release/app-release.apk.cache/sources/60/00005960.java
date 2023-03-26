package com.p7700g.p99005;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Message;
import android.os.Messenger;
import android.text.TextUtils;
import com.anchorfree.sdk.NotificationConfig;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: UnifiedSDKNotificationManager.java */
/* loaded from: classes.dex */
public class r51 implements c21 {
    public static final int a = 3333;
    @x1
    public static final String b = "anchorfree:sdk:extra:notification";
    @x1
    private final Context d;
    @x1
    private final o21 e;
    @x1
    private final o51 f;
    @x1
    private final a41 g;
    @x1
    private final Executor h;
    @x1
    private final kj1 c = kj1.b("NotificationManager");
    @x1
    private en1 i = en1.IDLE;

    /* compiled from: UnifiedSDKNotificationManager.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            en1.values();
            int[] iArr = new int[9];
            a = iArr;
            try {
                iArr[en1.CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[en1.PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[en1.CONNECTING_VPN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[en1.IDLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: UnifiedSDKNotificationManager.java */
    /* loaded from: classes.dex */
    public static class b {
        @x1
        public final CharSequence a;
        @x1
        public final CharSequence b;
        public final int c;
        @x1
        public final String d;
        @z1
        public final PendingIntent e;
        @z1
        public final Bitmap f;

        public b(@x1 CharSequence charSequence, @x1 CharSequence charSequence2, int i, @x1 String str, @z1 PendingIntent pendingIntent, @z1 Bitmap bitmap) {
            this.a = charSequence;
            this.b = charSequence2;
            this.c = i;
            this.d = str;
            this.e = pendingIntent;
            this.f = bitmap;
        }

        public String toString() {
            StringBuilder G = wo1.G("NotificationUI{title=");
            G.append((Object) this.a);
            G.append(", text=");
            G.append((Object) this.b);
            G.append(", smallIcon=");
            G.append(this.c);
            G.append(", channel='");
            G.append(this.d);
            G.append('\'');
            G.append('}');
            return G.toString();
        }
    }

    public r51(@x1 Context context, @x1 o21 o21Var, @x1 h31 h31Var, @x1 o51 o51Var, @x1 a41 a41Var, @x1 Executor executor) {
        this.d = context;
        this.h = executor;
        this.e = o21Var;
        this.f = o51Var;
        this.g = a41Var;
        h31Var.f(this);
    }

    @x1
    private Notification b(@x1 Notification.Builder builder) {
        return builder.build();
    }

    @z1
    private Notification c(@z1 b bVar) {
        Notification.Builder builder;
        if (bVar == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (bVar.d.length() == 0) {
                this.c.e("Achtung - will get empty channel on O", new Object[0]);
                return null;
            }
            builder = new Notification.Builder(this.d, bVar.d);
        } else {
            builder = new Notification.Builder(this.d);
        }
        builder.setSmallIcon(bVar.c).setContentTitle(bVar.a).setContentText(bVar.b).setContentIntent(bVar.e).setLargeIcon(bVar.f).setOnlyAlertOnce(true).setOngoing(true);
        builder.setStyle(new Notification.BigTextStyle().bigText(bVar.b));
        return b(builder);
    }

    @z1
    private String d(@x1 en1 en1Var) {
        int ordinal = en1Var.ordinal();
        if (ordinal == 1) {
            Context context = this.d;
            return context.getString(t41.a(context.getResources(), this.d.getPackageName(), "string", "default_notification_connected_message"));
        } else if (ordinal != 3) {
            return null;
        } else {
            Context context2 = this.d;
            return context2.getString(t41.a(context2.getResources(), this.d.getPackageName(), "string", "default_notification_paused_message"));
        }
    }

    @z1
    private PendingIntent e(@x1 NotificationConfig notificationConfig, @x1 Context context) {
        try {
            int i = Build.VERSION.SDK_INT >= 23 ? 201326592 : 134217728;
            if (!TextUtils.isEmpty(notificationConfig.getClickAction())) {
                Intent intent = new Intent(notificationConfig.getClickAction());
                intent.addFlags(603979776);
                intent.putExtra(b, true);
                return PendingIntent.getActivity(context, 0, intent, i);
            }
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getApplicationContext().getPackageName());
            if (launchIntentForPackage != null) {
                launchIntentForPackage.addFlags(603979776);
                launchIntentForPackage.putExtra(b, true);
                return PendingIntent.getActivity(context, 0, launchIntentForPackage, i);
            }
            return null;
        } catch (Exception e) {
            this.c.f(e);
            return null;
        }
    }

    @z1
    private NotificationConfig.StateNotification f(@x1 NotificationConfig notificationConfig, @x1 en1 en1Var) {
        NotificationConfig.StateNotification idleConfig;
        int ordinal = en1Var.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                try {
                    dq0<Boolean> b2 = this.e.b();
                    b2.Y();
                    if (Boolean.TRUE.equals(b2.F())) {
                        idleConfig = notificationConfig.getCnlConfig();
                    } else {
                        idleConfig = notificationConfig.getIdleConfig();
                    }
                    return idleConfig;
                } catch (Throwable th) {
                    this.c.f(th);
                }
            } else if (ordinal == 3) {
                return notificationConfig.getPausedConfig();
            } else {
                if (ordinal == 6) {
                    return notificationConfig.getConnectingConfig();
                }
            }
            return null;
        }
        return notificationConfig.getConnectedConfig();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ dq0 h(en1 en1Var, dq0 dq0Var) throws Exception {
        return s((NotificationConfig) dq0Var.F(), en1Var);
    }

    private /* synthetic */ Object i(b bVar, dq0 dq0Var) throws Exception {
        Messenger messenger = (Messenger) dq0Var.F();
        if (messenger != null) {
            Notification c = c(bVar);
            this.c.c("Sending notification to service %s", c);
            messenger.send(Message.obtain(null, 1, c));
        } else {
            this.c.e("Failed to bind to notification service", new Object[0]);
        }
        return null;
    }

    private /* synthetic */ Object k(dq0 dq0Var) throws Exception {
        final b bVar = (b) dq0Var.F();
        this.c.c("Got notification UI: %s", bVar);
        this.g.e().q(new aq0() { // from class: com.p7700g.p99005.t11
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var2) {
                r51.this.j(bVar, dq0Var2);
                return null;
            }
        });
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ b n(en1 en1Var, NotificationConfig notificationConfig) throws Exception {
        this.c.c("manageNotification: state %s", en1Var.toString());
        en1 p = p(en1Var);
        if (notificationConfig == null || notificationConfig.isDisabled()) {
            return null;
        }
        NotificationConfig.StateNotification f = f(notificationConfig, p);
        CharSequence r = r(notificationConfig, f);
        CharSequence q = q(f, p);
        int u = u(notificationConfig);
        PendingIntent e = e(notificationConfig, this.d);
        Bitmap icon = notificationConfig.icon();
        if (TextUtils.isEmpty(r) && TextUtils.isEmpty(q)) {
            return null;
        }
        return new b(r, (CharSequence) r81.f(q), u, notificationConfig.getChannelID(), e, icon);
    }

    private void o(@x1 final en1 en1Var) {
        t().w(new aq0() { // from class: com.p7700g.p99005.r11
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return r51.this.h(en1Var, dq0Var);
            }
        }, this.h).q(new aq0() { // from class: com.p7700g.p99005.q11
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                r51.this.l(dq0Var);
                return null;
            }
        });
    }

    @x1
    private en1 p(@x1 en1 en1Var) {
        return (en1Var == en1.CONNECTING_PERMISSIONS || en1Var == en1.CONNECTING_CREDENTIALS || en1Var == en1.CONNECTING_VPN) ? en1.CONNECTING_VPN : en1Var;
    }

    @z1
    private CharSequence q(@z1 NotificationConfig.StateNotification stateNotification, @x1 en1 en1Var) {
        if (stateNotification != null && !TextUtils.isEmpty(stateNotification.getMessage())) {
            return stateNotification.getMessage();
        }
        return d(en1Var);
    }

    @x1
    private CharSequence r(@x1 NotificationConfig notificationConfig, @z1 NotificationConfig.StateNotification stateNotification) {
        if (stateNotification != null && !TextUtils.isEmpty(stateNotification.getTitle())) {
            return stateNotification.getTitle();
        }
        String title = notificationConfig.title();
        return title != null ? title : d81.d(this.d);
    }

    private dq0<b> s(@z1 final NotificationConfig notificationConfig, @x1 final en1 en1Var) {
        return dq0.e(new Callable() { // from class: com.p7700g.p99005.s11
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return r51.this.n(en1Var, notificationConfig);
            }
        }, this.h);
    }

    @x1
    private dq0<NotificationConfig> t() {
        return this.f.p0();
    }

    private int u(@x1 NotificationConfig notificationConfig) {
        if (notificationConfig.smallIconId() != 0) {
            return notificationConfig.smallIconId();
        }
        return t41.a(this.d.getResources(), this.d.getPackageName(), com.anythink.expressad.foundation.h.h.c, "ic_vpn");
    }

    @Override // com.p7700g.p99005.c21
    public void a(@x1 Object obj) {
        if (obj instanceof b41) {
            o(this.i);
        }
        if (obj instanceof w51) {
            en1 c = ((w51) obj).c();
            this.i = c;
            o(c);
        }
    }

    public /* synthetic */ Object j(b bVar, dq0 dq0Var) {
        i(bVar, dq0Var);
        return null;
    }

    public /* synthetic */ Object l(dq0 dq0Var) {
        k(dq0Var);
        return null;
    }
}