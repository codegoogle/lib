package com.p7700g.p99005;

/* compiled from: ConnectionType.java */
/* loaded from: classes.dex */
public enum nr0 {
    HYDRA_TCP(a.a),
    OPENVPN_TCP(a.b),
    OPENVPN_UDP(a.c),
    OPENVPN_AUTO(a.d);
    
    @x1
    private final String x;

    /* compiled from: ConnectionType.java */
    /* loaded from: classes.dex */
    public static class a {
        @x1
        public static final String a = "hydra-tcp";
        @x1
        public static final String b = "openvpn-tcp";
        @x1
        public static final String c = "openvpn-udp";
        @x1
        public static final String d = "openvpn";
    }

    nr0(@x1 String str) {
        this.x = str;
    }

    @x1
    public static nr0 a(@or0 @x1 String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1263171990:
                if (str.equals(a.d)) {
                    c = 0;
                    break;
                }
                break;
            case -1200720386:
                if (str.equals(a.b)) {
                    c = 1;
                    break;
                }
                break;
            case -1200719394:
                if (str.equals(a.c)) {
                    c = 2;
                    break;
                }
                break;
            case -954202506:
                if (str.equals(a.a)) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return OPENVPN_AUTO;
            case 1:
                return OPENVPN_TCP;
            case 2:
                return OPENVPN_UDP;
            case 3:
                return HYDRA_TCP;
            default:
                return HYDRA_TCP;
        }
    }

    @x1
    public String f() {
        return this.x;
    }

    @Override // java.lang.Enum
    @x1
    public String toString() {
        return this.x;
    }
}