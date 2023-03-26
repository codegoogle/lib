package org.xbill.DNS;

import java.net.InetSocketAddress;
import java.util.List;

/* loaded from: classes4.dex */
public interface ResolverConfigProvider {
    void initialize();

    int ndots();

    List<Name> searchPaths();

    List<InetSocketAddress> servers();
}