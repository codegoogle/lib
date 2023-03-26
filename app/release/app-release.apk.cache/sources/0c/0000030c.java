package com.anchorfree.pingtool;

import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.text.DecimalFormat;
import java.util.Locale;

/* loaded from: classes.dex */
public class PingResult {
    public static final PingResult EMPTY_RESULT = new PingResult("", 0, 0, 0, 0, 0, 0);
    private final double avgRtt;
    @x1
    private final String isAddess;
    private final double maxRtt;
    private final double mdevRtt;
    private final double minRtt;
    private final long received;
    private final long transmitted;

    public PingResult(@z1 String str, long j, long j2, long j3, long j4, long j5, long j6) {
        this.isAddess = str == null ? "" : str;
        this.transmitted = j;
        this.received = j2;
        this.minRtt = j3 / 1000.0d;
        this.avgRtt = j4 / 1000.0d;
        this.maxRtt = j5 / 1000.0d;
        this.mdevRtt = j6 / 1000.0d;
    }

    public boolean equals(@z1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PingResult pingResult = (PingResult) obj;
        if (this.transmitted == pingResult.transmitted && this.received == pingResult.received && Double.compare(pingResult.minRtt, this.minRtt) == 0 && Double.compare(pingResult.avgRtt, this.avgRtt) == 0 && Double.compare(pingResult.maxRtt, this.maxRtt) == 0 && Double.compare(pingResult.mdevRtt, this.mdevRtt) == 0) {
            return this.isAddess.equals(pingResult.isAddess);
        }
        return false;
    }

    @x1
    public String formatResult() {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        StringBuilder G = wo1.G("--- ping statistics ---\n");
        Locale locale = Locale.US;
        G.append(String.format(locale, "%d packets transmitted, ", Long.valueOf(this.transmitted)));
        G.append(String.format(locale, "%d received", Long.valueOf(this.received)));
        long j = this.transmitted;
        G.append(String.format(locale, ", %d%% packet loss\n", Long.valueOf(((j - this.received) * 100) / j)));
        G.append(String.format(locale, "rtt min/avg/max/mdev = %s/%s/%s/%s ms", decimalFormat.format(this.minRtt), decimalFormat.format(this.avgRtt), decimalFormat.format(this.maxRtt), decimalFormat.format(this.mdevRtt)));
        return G.toString();
    }

    public double getAvgRtt() {
        return this.avgRtt;
    }

    @x1
    public String getIsAddess() {
        return this.isAddess;
    }

    public double getMaxRtt() {
        return this.maxRtt;
    }

    public double getMdevRtt() {
        return this.mdevRtt;
    }

    public double getMinRtt() {
        return this.minRtt;
    }

    public long getReceived() {
        return this.received;
    }

    public long getTransmitted() {
        return this.transmitted;
    }

    public int hashCode() {
        long j = this.transmitted;
        long j2 = this.received;
        long doubleToLongBits = Double.doubleToLongBits(this.minRtt);
        long doubleToLongBits2 = Double.doubleToLongBits(this.avgRtt);
        long doubleToLongBits3 = Double.doubleToLongBits(this.maxRtt);
        long doubleToLongBits4 = Double.doubleToLongBits(this.mdevRtt);
        return (((((((((((this.isAddess.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)));
    }

    @x1
    public String toString() {
        StringBuilder G = wo1.G("PingResult{isAddess='");
        wo1.d0(G, this.isAddess, '\'', ", transmitted=");
        G.append(this.transmitted);
        G.append(", received=");
        G.append(this.received);
        G.append(", minRtt=");
        G.append(this.minRtt);
        G.append(", avgRtt=");
        G.append(this.avgRtt);
        G.append(", maxRtt=");
        G.append(this.maxRtt);
        G.append(", mdevRtt=");
        G.append(this.mdevRtt);
        G.append('}');
        return G.toString();
    }
}