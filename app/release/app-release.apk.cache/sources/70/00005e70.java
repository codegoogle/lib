package com.p7700g.p99005;

import android.location.GnssStatus;
import android.os.Build;
import com.p7700g.p99005.i2;

/* compiled from: GnssStatusWrapper.java */
@e2(24)
@i2({i2.a.LIBRARY})
/* loaded from: classes.dex */
public class tl extends sl {
    private final GnssStatus i;

    /* compiled from: GnssStatusWrapper.java */
    @e2(26)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static float a(GnssStatus gnssStatus, int i) {
            return gnssStatus.getCarrierFrequencyHz(i);
        }

        @e1
        public static boolean b(GnssStatus gnssStatus, int i) {
            return gnssStatus.hasCarrierFrequencyHz(i);
        }
    }

    /* compiled from: GnssStatusWrapper.java */
    @e2(30)
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @e1
        public static float a(GnssStatus gnssStatus, int i) {
            return gnssStatus.getBasebandCn0DbHz(i);
        }

        @e1
        public static boolean b(GnssStatus gnssStatus, int i) {
            return gnssStatus.hasBasebandCn0DbHz(i);
        }
    }

    public tl(Object obj) {
        this.i = (GnssStatus) jp.l((GnssStatus) obj);
    }

    @Override // com.p7700g.p99005.sl
    public float a(int i) {
        return this.i.getAzimuthDegrees(i);
    }

    @Override // com.p7700g.p99005.sl
    public float b(int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            return b.a(this.i, i);
        }
        throw new UnsupportedOperationException();
    }

    @Override // com.p7700g.p99005.sl
    public float c(int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            return a.a(this.i, i);
        }
        throw new UnsupportedOperationException();
    }

    @Override // com.p7700g.p99005.sl
    public float d(int i) {
        return this.i.getCn0DbHz(i);
    }

    @Override // com.p7700g.p99005.sl
    public int e(int i) {
        return this.i.getConstellationType(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tl) {
            return this.i.equals(((tl) obj).i);
        }
        return false;
    }

    @Override // com.p7700g.p99005.sl
    public float f(int i) {
        return this.i.getElevationDegrees(i);
    }

    @Override // com.p7700g.p99005.sl
    public int g() {
        return this.i.getSatelliteCount();
    }

    @Override // com.p7700g.p99005.sl
    public int h(int i) {
        return this.i.getSvid(i);
    }

    public int hashCode() {
        return this.i.hashCode();
    }

    @Override // com.p7700g.p99005.sl
    public boolean i(int i) {
        return this.i.hasAlmanacData(i);
    }

    @Override // com.p7700g.p99005.sl
    public boolean j(int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            return b.b(this.i, i);
        }
        return false;
    }

    @Override // com.p7700g.p99005.sl
    public boolean k(int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            return a.b(this.i, i);
        }
        return false;
    }

    @Override // com.p7700g.p99005.sl
    public boolean l(int i) {
        return this.i.hasEphemerisData(i);
    }

    @Override // com.p7700g.p99005.sl
    public boolean m(int i) {
        return this.i.usedInFix(i);
    }
}