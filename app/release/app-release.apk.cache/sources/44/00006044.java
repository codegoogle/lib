package com.p7700g.p99005;

import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.os.Build;
import com.p7700g.p99005.i2;
import java.util.Iterator;

/* compiled from: GpsStatusWrapper.java */
@i2({i2.a.LIBRARY})
/* loaded from: classes.dex */
public class ul extends sl {
    private static final int i = 0;
    private static final int j = 32;
    private static final int k = 33;
    private static final int l = 64;
    private static final int m = -87;
    private static final int n = 64;
    private static final int o = 24;
    private static final int p = 193;
    private static final int q = 200;
    private static final int r = 200;
    private static final int s = 35;
    private final GpsStatus t;
    @k1("mWrapped")
    private int u;
    @k1("mWrapped")
    private Iterator<GpsSatellite> v;
    @k1("mWrapped")
    private int w;
    @k1("mWrapped")
    private GpsSatellite x;

    public ul(GpsStatus gpsStatus) {
        GpsStatus gpsStatus2 = (GpsStatus) jp.l(gpsStatus);
        this.t = gpsStatus2;
        this.u = -1;
        this.v = gpsStatus2.getSatellites().iterator();
        this.w = -1;
        this.x = null;
    }

    private static int p(int i2) {
        if (i2 <= 0 || i2 > 32) {
            if (i2 < 33 || i2 > 64) {
                if (i2 <= 64 || i2 > 88) {
                    if (i2 <= 200 || i2 > 235) {
                        return (i2 < 193 || i2 > 200) ? 0 : 4;
                    }
                    return 5;
                }
                return 3;
            }
            return 2;
        }
        return 1;
    }

    private GpsSatellite q(int i2) {
        GpsSatellite gpsSatellite;
        synchronized (this.t) {
            if (i2 < this.w) {
                this.v = this.t.getSatellites().iterator();
                this.w = -1;
            }
            while (true) {
                int i3 = this.w;
                if (i3 >= i2) {
                    break;
                }
                this.w = i3 + 1;
                if (!this.v.hasNext()) {
                    this.x = null;
                    break;
                }
                this.x = this.v.next();
            }
            gpsSatellite = this.x;
        }
        return (GpsSatellite) jp.l(gpsSatellite);
    }

    private static int r(int i2) {
        int p2 = p(i2);
        return p2 != 2 ? p2 != 3 ? p2 != 5 ? i2 : i2 - 200 : i2 - 64 : i2 + 87;
    }

    @Override // com.p7700g.p99005.sl
    public float a(int i2) {
        return q(i2).getAzimuth();
    }

    @Override // com.p7700g.p99005.sl
    public float b(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.p7700g.p99005.sl
    public float c(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.p7700g.p99005.sl
    public float d(int i2) {
        return q(i2).getSnr();
    }

    @Override // com.p7700g.p99005.sl
    public int e(int i2) {
        if (Build.VERSION.SDK_INT < 24) {
            return 1;
        }
        return p(q(i2).getPrn());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ul) {
            return this.t.equals(((ul) obj).t);
        }
        return false;
    }

    @Override // com.p7700g.p99005.sl
    public float f(int i2) {
        return q(i2).getElevation();
    }

    @Override // com.p7700g.p99005.sl
    public int g() {
        int i2;
        synchronized (this.t) {
            if (this.u == -1) {
                for (GpsSatellite gpsSatellite : this.t.getSatellites()) {
                    this.u++;
                }
                this.u++;
            }
            i2 = this.u;
        }
        return i2;
    }

    @Override // com.p7700g.p99005.sl
    public int h(int i2) {
        if (Build.VERSION.SDK_INT < 24) {
            return q(i2).getPrn();
        }
        return r(q(i2).getPrn());
    }

    public int hashCode() {
        return this.t.hashCode();
    }

    @Override // com.p7700g.p99005.sl
    public boolean i(int i2) {
        return q(i2).hasAlmanac();
    }

    @Override // com.p7700g.p99005.sl
    public boolean j(int i2) {
        return false;
    }

    @Override // com.p7700g.p99005.sl
    public boolean k(int i2) {
        return false;
    }

    @Override // com.p7700g.p99005.sl
    public boolean l(int i2) {
        return q(i2).hasEphemeris();
    }

    @Override // com.p7700g.p99005.sl
    public boolean m(int i2) {
        return q(i2).usedInFix();
    }
}