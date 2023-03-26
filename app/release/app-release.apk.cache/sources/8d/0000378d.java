package com.microsoft.appcenter.utils;

import com.p7700g.p99005.r2;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class TicketCache {
    private static final Map<String, String> sTickets = new HashMap();

    @r2
    public static void clear() {
        sTickets.clear();
    }

    public static String getTicket(String str) {
        return sTickets.get(str);
    }

    public static void putTicket(String str, String str2) {
        sTickets.put(str, str2);
    }
}