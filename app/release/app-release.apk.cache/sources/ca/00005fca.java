package com.p7700g.p99005;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.List;

/* compiled from: NetworkTypeSource.java */
/* loaded from: classes2.dex */
public class uc1 {
    public static final int a = -1;
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    @x1
    private final ma1 e;

    public uc1(@x1 Context context) {
        this.e = new ma1(context);
    }

    @x1
    private sc1 a(int i) {
        switch (i) {
            case 1:
                return sc1.GPRS;
            case 2:
                return sc1.EDGE;
            case 3:
                return sc1.UMTS;
            case 4:
                return sc1.CDMA;
            case 5:
                return sc1.EVDO_0;
            case 6:
                return sc1.EVDO_A;
            case 7:
                return sc1.xRTT;
            case 8:
                return sc1.HSDPA;
            case 9:
                return sc1.HSUPA;
            case 10:
                return sc1.HSPA;
            case 11:
                return sc1.IDEN;
            case 12:
                return sc1.EVDO_B;
            case 13:
                return sc1.LTE;
            case 14:
                return sc1.EHRPD;
            case 15:
                return sc1.HSPAP;
            case 16:
                return sc1.GSM;
            case 17:
                return sc1.TD_SCDMA;
            case 18:
                return sc1.IWLAN;
            default:
                return sc1.UNKNOWN;
        }
    }

    @z1
    private NetworkInfo b(@z1 Intent intent) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager a2 = this.e.a();
        if (a2 == null || (activeNetworkInfo = a2.getActiveNetworkInfo()) == null) {
            if (intent != null) {
                return (NetworkInfo) intent.getParcelableExtra("networkInfo");
            }
            return null;
        }
        return activeNetworkInfo;
    }

    private boolean j() {
        WifiInfo connectionInfo;
        List<WifiConfiguration> configuredNetworks;
        WifiManager c2 = this.e.c();
        if (c2 == null || (connectionInfo = c2.getConnectionInfo()) == null || TextUtils.isEmpty(connectionInfo.getSSID()) || (configuredNetworks = c2.getConfiguredNetworks()) == null) {
            return false;
        }
        for (WifiConfiguration wifiConfiguration : configuredNetworks) {
            if (connectionInfo.getNetworkId() == wifiConfiguration.networkId && (wifiConfiguration.allowedKeyManagement.get(2) || wifiConfiguration.allowedKeyManagement.get(1))) {
                return true;
            }
        }
        return false;
    }

    public int c(@z1 Intent intent) {
        NetworkInfo b2 = b(intent);
        if (b2 == null || b2.getState() != NetworkInfo.State.CONNECTED) {
            return -1;
        }
        int type = b2.getType();
        if (type != 0) {
            int i = 1;
            if (type != 1) {
                i = 2;
                if (type == 2 || type == 4 || type == 5 || type == 6) {
                    return 0;
                }
            }
            return i;
        }
        return 0;
    }

    @x1
    public sc1 d() {
        ConnectivityManager a2 = this.e.a();
        if (a2 == null) {
            return sc1.UNKNOWN;
        }
        NetworkInfo activeNetworkInfo = a2.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.getState() == NetworkInfo.State.CONNECTED) {
            int type = activeNetworkInfo.getType();
            if (type != 0) {
                if (type == 1) {
                    return sc1.WiFi;
                }
                if (type != 2 && type != 3 && type != 4 && type != 5) {
                    return sc1.UNKNOWN;
                }
            }
            return a(activeNetworkInfo.getSubtype());
        }
        return sc1.NO_CONNECTION;
    }

    public int e(@z1 Intent intent) {
        NetworkInfo b2 = b(intent);
        if (b2 == null || b2.getState() != NetworkInfo.State.CONNECTED) {
            return -1;
        }
        return b2.getType();
    }

    public int f() {
        WifiManager c2;
        if (d() != sc1.WiFi || (c2 = this.e.c()) == null) {
            return 0;
        }
        return WifiManager.calculateSignalLevel(c2.getConnectionInfo().getRssi(), 5);
    }

    public boolean g(@z1 Intent intent) {
        return (!i() || n(intent) || m(intent)) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000e A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:5:0x0008, B:7:0x000e, B:8:0x0018, B:10:0x001e, B:12:0x002a, B:15:0x0032, B:19:0x003a), top: B:29:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean h() {
        boolean z;
        boolean z2;
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            z = false;
            z2 = false;
            while (!networkInterfaces.hasMoreElements()) {
                try {
                    Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                    while (true) {
                        if (inetAddresses.hasMoreElements()) {
                            InetAddress nextElement = inetAddresses.nextElement();
                            if (!nextElement.isLoopbackAddress() && !nextElement.isLinkLocalAddress()) {
                                if (!z && (nextElement instanceof Inet4Address)) {
                                    z = true;
                                } else if (!z2 && (nextElement instanceof Inet6Address)) {
                                    z2 = true;
                                }
                            }
                        }
                    }
                    if (!networkInterfaces.hasMoreElements()) {
                    }
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
            z = false;
            z2 = false;
        }
        return z2 && !z;
    }

    public boolean i() {
        return c(null) != -1;
    }

    public boolean k(@z1 Intent intent) {
        return n(intent) && j() && !m(intent);
    }

    public boolean l(@z1 Intent intent) {
        return (!n(intent) || j() || m(intent)) ? false : true;
    }

    public boolean m(@z1 Intent intent) {
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            return extras.getInt("networkType", 0) == 17;
        }
        NetworkInfo b2 = b(intent);
        return b2 != null && b2.getTypeName().equalsIgnoreCase("VPN");
    }

    public boolean n(@z1 Intent intent) {
        return c(intent) == 1;
    }

    public boolean o() {
        return c(null) == 1;
    }
}