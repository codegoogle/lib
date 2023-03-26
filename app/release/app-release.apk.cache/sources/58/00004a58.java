package com.p7700g.p99005;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: NotificationChannelGroupCompat.java */
/* loaded from: classes.dex */
public class jg {
    public final String a;
    public CharSequence b;
    public String c;
    private boolean d;
    private List<ig> e;

    /* compiled from: NotificationChannelGroupCompat.java */
    /* loaded from: classes.dex */
    public static class a {
        public final jg a;

        public a(@x1 String str) {
            this.a = new jg(str);
        }

        @x1
        public jg a() {
            return this.a;
        }

        @x1
        public a b(@z1 String str) {
            this.a.c = str;
            return this;
        }

        @x1
        public a c(@z1 CharSequence charSequence) {
            this.a.b = charSequence;
            return this;
        }
    }

    public jg(@x1 String str) {
        this.e = Collections.emptyList();
        this.a = (String) jp.l(str);
    }

    @e2(26)
    private List<ig> b(List<NotificationChannel> list) {
        ArrayList arrayList = new ArrayList();
        for (NotificationChannel notificationChannel : list) {
            if (this.a.equals(notificationChannel.getGroup())) {
                arrayList.add(new ig(notificationChannel));
            }
        }
        return arrayList;
    }

    @x1
    public List<ig> a() {
        return this.e;
    }

    @z1
    public String c() {
        return this.c;
    }

    @x1
    public String d() {
        return this.a;
    }

    @z1
    public CharSequence e() {
        return this.b;
    }

    public NotificationChannelGroup f() {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return null;
        }
        NotificationChannelGroup notificationChannelGroup = new NotificationChannelGroup(this.a, this.b);
        if (i >= 28) {
            notificationChannelGroup.setDescription(this.c);
        }
        return notificationChannelGroup;
    }

    public boolean g() {
        return this.d;
    }

    @x1
    public a h() {
        return new a(this.a).c(this.b).b(this.c);
    }

    @e2(28)
    public jg(@x1 NotificationChannelGroup notificationChannelGroup) {
        this(notificationChannelGroup, Collections.emptyList());
    }

    @e2(26)
    public jg(@x1 NotificationChannelGroup notificationChannelGroup, @x1 List<NotificationChannel> list) {
        this(notificationChannelGroup.getId());
        this.b = notificationChannelGroup.getName();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.c = notificationChannelGroup.getDescription();
        }
        if (i >= 28) {
            this.d = notificationChannelGroup.isBlocked();
            this.e = b(notificationChannelGroup.getChannels());
            return;
        }
        this.e = b(list);
    }
}