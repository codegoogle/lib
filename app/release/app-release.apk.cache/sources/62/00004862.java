package com.p7700g.p99005;

import android.app.Notification;
import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;

/* compiled from: NotificationChannelCompat.java */
/* loaded from: classes.dex */
public class ig {
    public static final String a = "miscellaneous";
    private static final boolean b = true;
    private static final int c = 0;
    @x1
    public final String d;
    public CharSequence e;
    public int f;
    public String g;
    public String h;
    public boolean i;
    public Uri j;
    public AudioAttributes k;
    public boolean l;
    public int m;
    public boolean n;
    public long[] o;
    public String p;
    public String q;
    private boolean r;
    private int s;
    private boolean t;
    private boolean u;

    /* compiled from: NotificationChannelCompat.java */
    /* loaded from: classes.dex */
    public static class a {
        private final ig a;

        public a(@x1 String str, int i) {
            this.a = new ig(str, i);
        }

        @x1
        public ig a() {
            return this.a;
        }

        @x1
        public a b(@x1 String str, @x1 String str2) {
            if (Build.VERSION.SDK_INT >= 30) {
                ig igVar = this.a;
                igVar.p = str;
                igVar.q = str2;
            }
            return this;
        }

        @x1
        public a c(@z1 String str) {
            this.a.g = str;
            return this;
        }

        @x1
        public a d(@z1 String str) {
            this.a.h = str;
            return this;
        }

        @x1
        public a e(int i) {
            this.a.f = i;
            return this;
        }

        @x1
        public a f(int i) {
            this.a.m = i;
            return this;
        }

        @x1
        public a g(boolean z) {
            this.a.l = z;
            return this;
        }

        @x1
        public a h(@z1 CharSequence charSequence) {
            this.a.e = charSequence;
            return this;
        }

        @x1
        public a i(boolean z) {
            this.a.i = z;
            return this;
        }

        @x1
        public a j(@z1 Uri uri, @z1 AudioAttributes audioAttributes) {
            ig igVar = this.a;
            igVar.j = uri;
            igVar.k = audioAttributes;
            return this;
        }

        @x1
        public a k(boolean z) {
            this.a.n = z;
            return this;
        }

        @x1
        public a l(@z1 long[] jArr) {
            ig igVar = this.a;
            igVar.n = jArr != null && jArr.length > 0;
            igVar.o = jArr;
            return this;
        }
    }

    public ig(@x1 String str, int i) {
        this.i = true;
        this.j = Settings.System.DEFAULT_NOTIFICATION_URI;
        this.m = 0;
        this.d = (String) jp.l(str);
        this.f = i;
        this.k = Notification.AUDIO_ATTRIBUTES_DEFAULT;
    }

    public boolean a() {
        return this.t;
    }

    public boolean b() {
        return this.r;
    }

    public boolean c() {
        return this.i;
    }

    @z1
    public AudioAttributes d() {
        return this.k;
    }

    @z1
    public String e() {
        return this.q;
    }

    @z1
    public String f() {
        return this.g;
    }

    @z1
    public String g() {
        return this.h;
    }

    @x1
    public String h() {
        return this.d;
    }

    public int i() {
        return this.f;
    }

    public int j() {
        return this.m;
    }

    public int k() {
        return this.s;
    }

    @z1
    public CharSequence l() {
        return this.e;
    }

    public NotificationChannel m() {
        String str;
        String str2;
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return null;
        }
        NotificationChannel notificationChannel = new NotificationChannel(this.d, this.e, this.f);
        notificationChannel.setDescription(this.g);
        notificationChannel.setGroup(this.h);
        notificationChannel.setShowBadge(this.i);
        notificationChannel.setSound(this.j, this.k);
        notificationChannel.enableLights(this.l);
        notificationChannel.setLightColor(this.m);
        notificationChannel.setVibrationPattern(this.o);
        notificationChannel.enableVibration(this.n);
        if (i >= 30 && (str = this.p) != null && (str2 = this.q) != null) {
            notificationChannel.setConversationId(str, str2);
        }
        return notificationChannel;
    }

    @z1
    public String n() {
        return this.p;
    }

    @z1
    public Uri o() {
        return this.j;
    }

    @z1
    public long[] p() {
        return this.o;
    }

    public boolean q() {
        return this.u;
    }

    public boolean r() {
        return this.l;
    }

    public boolean s() {
        return this.n;
    }

    @x1
    public a t() {
        return new a(this.d, this.f).h(this.e).c(this.g).d(this.h).i(this.i).j(this.j, this.k).g(this.l).f(this.m).k(this.n).l(this.o).b(this.p, this.q);
    }

    @e2(26)
    public ig(@x1 NotificationChannel notificationChannel) {
        this(notificationChannel.getId(), notificationChannel.getImportance());
        this.e = notificationChannel.getName();
        this.g = notificationChannel.getDescription();
        this.h = notificationChannel.getGroup();
        this.i = notificationChannel.canShowBadge();
        this.j = notificationChannel.getSound();
        this.k = notificationChannel.getAudioAttributes();
        this.l = notificationChannel.shouldShowLights();
        this.m = notificationChannel.getLightColor();
        this.n = notificationChannel.shouldVibrate();
        this.o = notificationChannel.getVibrationPattern();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.p = notificationChannel.getParentChannelId();
            this.q = notificationChannel.getConversationId();
        }
        this.r = notificationChannel.canBypassDnd();
        this.s = notificationChannel.getLockscreenVisibility();
        if (i >= 29) {
            this.t = notificationChannel.canBubble();
        }
        if (i >= 30) {
            this.u = notificationChannel.isImportantConversation();
        }
    }
}