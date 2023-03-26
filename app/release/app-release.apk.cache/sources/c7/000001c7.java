package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.graphics.drawable.Icon;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;
import com.p7700g.p99005.e1;
import com.p7700g.p99005.e2;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.jp;
import com.p7700g.p99005.oa0;
import com.p7700g.p99005.x1;

/* loaded from: classes.dex */
public final class RemoteActionCompat implements oa0 {
    @i2({i2.a.LIBRARY_GROUP})
    @x1
    public IconCompat a;
    @i2({i2.a.LIBRARY_GROUP})
    @x1
    public CharSequence b;
    @i2({i2.a.LIBRARY_GROUP})
    @x1
    public CharSequence c;
    @i2({i2.a.LIBRARY_GROUP})
    @x1
    public PendingIntent d;
    @i2({i2.a.LIBRARY_GROUP})
    public boolean e;
    @i2({i2.a.LIBRARY_GROUP})
    public boolean f;

    @e2(26)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static RemoteAction a(Icon icon, CharSequence charSequence, CharSequence charSequence2, PendingIntent pendingIntent) {
            return new RemoteAction(icon, charSequence, charSequence2, pendingIntent);
        }

        @e1
        public static PendingIntent b(RemoteAction remoteAction) {
            return remoteAction.getActionIntent();
        }

        @e1
        public static CharSequence c(RemoteAction remoteAction) {
            return remoteAction.getContentDescription();
        }

        @e1
        public static Icon d(RemoteAction remoteAction) {
            return remoteAction.getIcon();
        }

        @e1
        public static CharSequence e(RemoteAction remoteAction) {
            return remoteAction.getTitle();
        }

        @e1
        public static boolean f(RemoteAction remoteAction) {
            return remoteAction.isEnabled();
        }

        @e1
        public static void g(RemoteAction remoteAction, boolean z) {
            remoteAction.setEnabled(z);
        }
    }

    @e2(28)
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @e1
        public static void a(RemoteAction remoteAction, boolean z) {
            remoteAction.setShouldShowIcon(z);
        }

        @e1
        public static boolean b(RemoteAction remoteAction) {
            return remoteAction.shouldShowIcon();
        }
    }

    public RemoteActionCompat(@x1 IconCompat iconCompat, @x1 CharSequence charSequence, @x1 CharSequence charSequence2, @x1 PendingIntent pendingIntent) {
        this.a = (IconCompat) jp.l(iconCompat);
        this.b = (CharSequence) jp.l(charSequence);
        this.c = (CharSequence) jp.l(charSequence2);
        this.d = (PendingIntent) jp.l(pendingIntent);
        this.e = true;
        this.f = true;
    }

    @e2(26)
    @x1
    public static RemoteActionCompat h(@x1 RemoteAction remoteAction) {
        jp.l(remoteAction);
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat(IconCompat.n(a.d(remoteAction)), a.e(remoteAction), a.c(remoteAction), a.b(remoteAction));
        remoteActionCompat.n(a.f(remoteAction));
        if (Build.VERSION.SDK_INT >= 28) {
            remoteActionCompat.o(b.b(remoteAction));
        }
        return remoteActionCompat;
    }

    @x1
    public PendingIntent i() {
        return this.d;
    }

    @x1
    public CharSequence j() {
        return this.c;
    }

    @x1
    public IconCompat k() {
        return this.a;
    }

    @x1
    public CharSequence l() {
        return this.b;
    }

    public boolean m() {
        return this.e;
    }

    public void n(boolean z) {
        this.e = z;
    }

    public void o(boolean z) {
        this.f = z;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public boolean p() {
        return this.f;
    }

    @e2(26)
    @x1
    public RemoteAction q() {
        RemoteAction a2 = a.a(this.a.L(), this.b, this.c, this.d);
        a.g(a2, m());
        if (Build.VERSION.SDK_INT >= 28) {
            b.a(a2, p());
        }
        return a2;
    }

    @i2({i2.a.LIBRARY_GROUP})
    public RemoteActionCompat() {
    }

    public RemoteActionCompat(@x1 RemoteActionCompat remoteActionCompat) {
        jp.l(remoteActionCompat);
        this.a = remoteActionCompat.a;
        this.b = remoteActionCompat.b;
        this.c = remoteActionCompat.c;
        this.d = remoteActionCompat.d;
        this.e = remoteActionCompat.e;
        this.f = remoteActionCompat.f;
    }
}