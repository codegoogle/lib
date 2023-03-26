package com.p7700g.p99005;

import android.app.Notification;
import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;
import com.p7700g.p99005.b20;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.kg;

/* compiled from: NotificationCompat.java */
/* loaded from: classes.dex */
public class e20 {

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public static class a extends b {
        private void L(RemoteViews remoteViews) {
            int color;
            if (this.a.r() != 0) {
                color = this.a.r();
            } else {
                color = this.a.b.getResources().getColor(b20.b.c);
            }
            remoteViews.setInt(b20.e.z, "setBackgroundColor", color);
        }

        @Override // com.p7700g.p99005.e20.b
        public int E(int i) {
            return i <= 3 ? b20.g.h : b20.g.f;
        }

        @Override // com.p7700g.p99005.e20.b
        public int F() {
            return this.a.s() != null ? b20.g.m : super.F();
        }

        @Override // com.p7700g.p99005.e20.b, com.p7700g.p99005.kg.q
        @i2({i2.a.LIBRARY_GROUP})
        public void b(hg hgVar) {
            if (Build.VERSION.SDK_INT >= 24) {
                hgVar.a().setStyle(A(new Notification.DecoratedMediaCustomViewStyle()));
            } else {
                super.b(hgVar);
            }
        }

        @Override // com.p7700g.p99005.e20.b, com.p7700g.p99005.kg.q
        @i2({i2.a.LIBRARY_GROUP})
        public RemoteViews v(hg hgVar) {
            RemoteViews s;
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            if (this.a.p() != null) {
                s = this.a.p();
            } else {
                s = this.a.s();
            }
            if (s == null) {
                return null;
            }
            RemoteViews B = B();
            e(B, s);
            L(B);
            return B;
        }

        @Override // com.p7700g.p99005.e20.b, com.p7700g.p99005.kg.q
        @i2({i2.a.LIBRARY_GROUP})
        public RemoteViews w(hg hgVar) {
            RemoteViews remoteViews = null;
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            boolean z = true;
            boolean z2 = this.a.s() != null;
            if (!z2 && this.a.p() == null) {
                z = false;
            }
            if (z) {
                remoteViews = C();
                if (z2) {
                    e(remoteViews, this.a.s());
                }
                L(remoteViews);
            }
            return remoteViews;
        }

        @Override // com.p7700g.p99005.kg.q
        @i2({i2.a.LIBRARY_GROUP})
        public RemoteViews x(hg hgVar) {
            RemoteViews s;
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            if (this.a.w() != null) {
                s = this.a.w();
            } else {
                s = this.a.s();
            }
            if (s == null) {
                return null;
            }
            RemoteViews B = B();
            e(B, s);
            L(B);
            return B;
        }
    }

    private e20() {
    }

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public static class b extends kg.q {
        private static final int e = 3;
        private static final int f = 5;
        public int[] g = null;
        public MediaSessionCompat.Token h;
        public boolean i;
        public PendingIntent j;

        public b() {
        }

        private RemoteViews D(kg.b bVar) {
            boolean z = bVar.a() == null;
            RemoteViews remoteViews = new RemoteViews(this.a.b.getPackageName(), b20.g.c);
            int i = b20.e.a;
            remoteViews.setImageViewResource(i, bVar.e());
            if (!z) {
                remoteViews.setOnClickPendingIntent(i, bVar.a());
            }
            remoteViews.setContentDescription(i, bVar.j());
            return remoteViews;
        }

        public static MediaSessionCompat.Token G(Notification notification) {
            Parcelable parcelable;
            Bundle n = kg.n(notification);
            if (n == null || (parcelable = n.getParcelable(kg.b0)) == null) {
                return null;
            }
            return MediaSessionCompat.Token.d(parcelable);
        }

        @e2(21)
        public Notification.MediaStyle A(Notification.MediaStyle mediaStyle) {
            int[] iArr = this.g;
            if (iArr != null) {
                mediaStyle.setShowActionsInCompactView(iArr);
            }
            MediaSessionCompat.Token token = this.h;
            if (token != null) {
                mediaStyle.setMediaSession((MediaSession.Token) token.j());
            }
            return mediaStyle;
        }

        public RemoteViews B() {
            int min = Math.min(this.a.c.size(), 5);
            RemoteViews c = c(false, E(min), false);
            c.removeAllViews(b20.e.s);
            if (min > 0) {
                for (int i = 0; i < min; i++) {
                    c.addView(b20.e.s, D(this.a.c.get(i)));
                }
            }
            if (this.i) {
                int i2 = b20.e.i;
                c.setViewVisibility(i2, 0);
                c.setInt(i2, "setAlpha", this.a.b.getResources().getInteger(b20.f.a));
                c.setOnClickPendingIntent(i2, this.j);
            } else {
                c.setViewVisibility(b20.e.i, 8);
            }
            return c;
        }

        public RemoteViews C() {
            RemoteViews c = c(false, F(), true);
            int size = this.a.c.size();
            int[] iArr = this.g;
            int min = iArr == null ? 0 : Math.min(iArr.length, 3);
            c.removeAllViews(b20.e.s);
            if (min > 0) {
                for (int i = 0; i < min; i++) {
                    if (i < size) {
                        c.addView(b20.e.s, D(this.a.c.get(this.g[i])));
                    } else {
                        throw new IllegalArgumentException(String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", Integer.valueOf(i), Integer.valueOf(size - 1)));
                    }
                }
            }
            if (this.i) {
                c.setViewVisibility(b20.e.k, 8);
                int i2 = b20.e.i;
                c.setViewVisibility(i2, 0);
                c.setOnClickPendingIntent(i2, this.j);
                c.setInt(i2, "setAlpha", this.a.b.getResources().getInteger(b20.f.a));
            } else {
                c.setViewVisibility(b20.e.k, 0);
                c.setViewVisibility(b20.e.i, 8);
            }
            return c;
        }

        public int E(int i) {
            return i <= 3 ? b20.g.g : b20.g.e;
        }

        public int F() {
            return b20.g.l;
        }

        public b H(PendingIntent pendingIntent) {
            this.j = pendingIntent;
            return this;
        }

        public b I(MediaSessionCompat.Token token) {
            this.h = token;
            return this;
        }

        public b J(int... iArr) {
            this.g = iArr;
            return this;
        }

        public b K(boolean z) {
            return this;
        }

        @Override // com.p7700g.p99005.kg.q
        @i2({i2.a.LIBRARY_GROUP})
        public void b(hg hgVar) {
            hgVar.a().setStyle(A(new Notification.MediaStyle()));
        }

        @Override // com.p7700g.p99005.kg.q
        @i2({i2.a.LIBRARY_GROUP})
        public RemoteViews v(hg hgVar) {
            return null;
        }

        @Override // com.p7700g.p99005.kg.q
        @i2({i2.a.LIBRARY_GROUP})
        public RemoteViews w(hg hgVar) {
            return null;
        }

        public b(kg.g gVar) {
            z(gVar);
        }
    }
}