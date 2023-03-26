package org.xbill.DNS;

import com.p7700g.p99005.hx5;
import com.p7700g.p99005.kj1;
import java.net.Inet4Address;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/* loaded from: classes4.dex */
public abstract class BaseResolverConfigProvider implements ResolverConfigProvider {
    private static final boolean ipv4only = Boolean.getBoolean("java.net.preferIPv4Stack");
    private static final boolean ipv6first = Boolean.getBoolean("java.net.preferIPv6Addresses");
    private final List<InetSocketAddress> nameservers = new ArrayList(3);
    public final kj1 log = kj1.b("BaseResolverConfigProvider");
    public List<Name> searchlist = new ArrayList(1);

    public void addNameserver(InetSocketAddress inetSocketAddress) {
        if (this.nameservers.contains(inetSocketAddress)) {
            return;
        }
        this.nameservers.add(inetSocketAddress);
        this.log.c("Added {} to nameservers", inetSocketAddress);
    }

    public void addSearchPath(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        try {
            Name fromString = Name.fromString(str, Name.root);
            if (this.searchlist.contains(fromString)) {
                return;
            }
            this.searchlist.add(fromString);
            this.log.c("Added {} to search paths", fromString);
        } catch (TextParseException unused) {
            this.log.n("Could not parse search path %s as a dns name, ignoring ", str);
        }
    }

    public int parseNdots(String str) {
        if (str == null || str.isEmpty()) {
            return 1;
        }
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt >= 0) {
                if (parseInt > 15) {
                    return 15;
                }
                return parseInt;
            }
            return 1;
        } catch (NumberFormatException unused) {
            return 1;
        }
    }

    public void parseSearchPathList(String str, String str2) {
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, str2);
            while (stringTokenizer.hasMoreTokens()) {
                addSearchPath(stringTokenizer.nextToken());
            }
        }
    }

    @Override // org.xbill.DNS.ResolverConfigProvider
    public final List<Name> searchPaths() {
        return Collections.unmodifiableList(this.searchlist);
    }

    @Override // org.xbill.DNS.ResolverConfigProvider
    public final List<InetSocketAddress> servers() {
        if (ipv6first) {
            ArrayList arrayList = new ArrayList(this.nameservers);
            Collections.sort(arrayList, hx5.s);
            return arrayList;
        } else if (ipv4only) {
            ArrayList arrayList2 = new ArrayList();
            for (InetSocketAddress inetSocketAddress : this.nameservers) {
                if (inetSocketAddress.getAddress() instanceof Inet4Address) {
                    arrayList2.add(inetSocketAddress);
                }
            }
            return arrayList2;
        } else {
            return Collections.unmodifiableList(this.nameservers);
        }
    }
}