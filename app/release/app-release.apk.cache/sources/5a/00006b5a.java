package org.xbill.DNS;

import android.content.Context;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.util.List;

/* loaded from: classes4.dex */
public class ResolverConfig {
    private static ResolverConfig currentConfig;
    private String[] servers;
    private Name[] searchlist = null;
    private int ndots = -1;

    public ResolverConfig(Context context) {
        AndroidResolverConfigProvider androidResolverConfigProvider = new AndroidResolverConfigProvider(context);
        androidResolverConfigProvider.initialize();
        List<InetSocketAddress> servers = androidResolverConfigProvider.servers();
        this.servers = new String[servers.size()];
        for (int i = 0; i < servers.size(); i++) {
            this.servers[i] = servers.get(i).getAddress().getHostAddress();
        }
    }

    private void addSearch(String str, List list) {
        if (Options.check("verbose")) {
            PrintStream printStream = System.out;
            printStream.println("adding search " + str);
        }
        try {
            Name fromString = Name.fromString(str, Name.root);
            if (list.contains(fromString)) {
                return;
            }
            list.add(fromString);
        } catch (TextParseException unused) {
        }
    }

    private void addServer(String str, List list) {
        if (list.contains(str)) {
            return;
        }
        if (Options.check("verbose")) {
            PrintStream printStream = System.out;
            printStream.println("adding server " + str);
        }
        list.add(str);
    }

    private void configureFromLists(List list, List list2) {
        if (this.servers == null && list.size() > 0) {
            this.servers = (String[]) list.toArray(new String[0]);
        }
        if (this.searchlist != null || list2.size() <= 0) {
            return;
        }
        this.searchlist = (Name[]) list2.toArray(new Name[0]);
    }

    private void configureNdots(int i) {
        if (this.ndots >= 0 || i <= 0) {
            return;
        }
        this.ndots = i;
    }

    public static synchronized ResolverConfig getCurrentConfig() {
        ResolverConfig resolverConfig;
        synchronized (ResolverConfig.class) {
            resolverConfig = currentConfig;
        }
        return resolverConfig;
    }

    private int parseNdots(String str) {
        String substring = str.substring(6);
        try {
            int parseInt = Integer.parseInt(substring);
            if (parseInt >= 0) {
                if (Options.check("verbose")) {
                    PrintStream printStream = System.out;
                    printStream.println("setting ndots " + substring);
                }
                return parseInt;
            }
            return -1;
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static void refresh(Context context) {
        if (currentConfig == null) {
            ResolverConfig resolverConfig = new ResolverConfig(context);
            synchronized (ResolverConfig.class) {
                currentConfig = resolverConfig;
            }
        }
    }

    public int ndots() {
        int i = this.ndots;
        if (i < 0) {
            return 1;
        }
        return i;
    }

    public Name[] searchPath() {
        return this.searchlist;
    }

    public String server() {
        String[] strArr = this.servers;
        if (strArr == null) {
            return null;
        }
        return strArr[0];
    }

    public String[] servers() {
        return this.servers;
    }
}