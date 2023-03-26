package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.net.ConnectivityManager;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.p7700g.p99005.q71;
import java.util.List;

/* compiled from: CompatNetworkStatusProvider.java */
/* loaded from: classes.dex */
public class p71 extends o71 {
    public p71(@z1 WifiManager wifiManager, @z1 ConnectivityManager connectivityManager) {
        super(wifiManager, connectivityManager);
    }

    @Override // com.p7700g.p99005.o71
    @x1
    @SuppressLint({"MissingPermission"})
    public q71.a d(@x1 WifiInfo wifiInfo) {
        WifiManager wifiManager = this.b;
        if (wifiManager == null) {
            return q71.a.UNKNOWN;
        }
        List<WifiConfiguration> configuredNetworks = wifiManager.getConfiguredNetworks();
        if (configuredNetworks != null) {
            for (WifiConfiguration wifiConfiguration : configuredNetworks) {
                if (wifiInfo.getNetworkId() == wifiConfiguration.networkId) {
                    if (wifiConfiguration.allowedKeyManagement.get(0)) {
                        return q71.a.OPEN;
                    }
                    return q71.a.SECURE;
                }
            }
        }
        return q71.a.UNKNOWN;
    }
}