package org.xbill.DNS;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.os.Build;
import com.p7700g.p99005.e2;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.Map;

/* loaded from: classes4.dex */
public class AndroidResolverConfigProvider extends BaseResolverConfigProvider {
    private Context context;

    public AndroidResolverConfigProvider(Context context) {
        this.context = context;
    }

    @e2(api = 23)
    private void initializeApi26Nameservers() {
        LinkProperties linkProperties;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.context.getSystemService(ConnectivityManager.class);
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null || (linkProperties = connectivityManager.getLinkProperties(activeNetwork)) == null) {
            return;
        }
        for (InetAddress inetAddress : linkProperties.getDnsServers()) {
            addNameserver(new InetSocketAddress(inetAddress, 53));
        }
        parseSearchPathList(linkProperties.getDomains(), ",");
    }

    private void initializeNameservers() {
        for (int i = 1; i <= 4; i++) {
            Map<String, String> map = System.getenv();
            String str = map.get("net.dns" + i);
            if (str != null && !str.isEmpty()) {
                addNameserver(new InetSocketAddress(str, 53));
            }
        }
    }

    @Override // org.xbill.DNS.ResolverConfigProvider
    public void initialize() {
        if (Build.VERSION.SDK_INT >= 26) {
            initializeApi26Nameservers();
        } else {
            initializeNameservers();
        }
    }

    @Override // org.xbill.DNS.ResolverConfigProvider
    public int ndots() {
        return -1;
    }
}