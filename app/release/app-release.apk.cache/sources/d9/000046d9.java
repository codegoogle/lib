package com.p7700g.p99005;

import android.net.Uri;

/* compiled from: UriCompat.java */
/* loaded from: classes.dex */
public final class hm {
    private hm() {
    }

    @x1
    public static String a(@x1 Uri uri) {
        String scheme = uri.getScheme();
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        if (scheme != null) {
            if (!scheme.equalsIgnoreCase("tel") && !scheme.equalsIgnoreCase("sip") && !scheme.equalsIgnoreCase("sms") && !scheme.equalsIgnoreCase("smsto") && !scheme.equalsIgnoreCase("mailto") && !scheme.equalsIgnoreCase("nfc")) {
                if (scheme.equalsIgnoreCase("http") || scheme.equalsIgnoreCase("https") || scheme.equalsIgnoreCase("ftp") || scheme.equalsIgnoreCase("rtsp")) {
                    StringBuilder G = wo1.G("//");
                    String str = "";
                    G.append(uri.getHost() != null ? uri.getHost() : "");
                    if (uri.getPort() != -1) {
                        StringBuilder G2 = wo1.G(":");
                        G2.append(uri.getPort());
                        str = G2.toString();
                    }
                    schemeSpecificPart = wo1.C(G, str, "/...");
                }
            } else {
                StringBuilder sb = new StringBuilder(64);
                sb.append(scheme);
                sb.append(':');
                if (schemeSpecificPart != null) {
                    for (int i = 0; i < schemeSpecificPart.length(); i++) {
                        char charAt = schemeSpecificPart.charAt(i);
                        if (charAt != '-' && charAt != '@' && charAt != '.') {
                            sb.append('x');
                        } else {
                            sb.append(charAt);
                        }
                    }
                }
                return sb.toString();
            }
        }
        StringBuilder sb2 = new StringBuilder(64);
        if (scheme != null) {
            sb2.append(scheme);
            sb2.append(':');
        }
        if (schemeSpecificPart != null) {
            sb2.append(schemeSpecificPart);
        }
        return sb2.toString();
    }
}