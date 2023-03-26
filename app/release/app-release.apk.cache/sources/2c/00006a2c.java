package com.p7700g.p99005;

import com.p7700g.p99005.vy3;
import java.util.Iterator;
import java.util.Vector;

/* compiled from: VpnStatus.java */
/* loaded from: classes3.dex */
public class zy3 {
    private static b b = b.LEVEL_NOTCONNECTED;
    private static Vector<c> a = new Vector<>();

    /* compiled from: VpnStatus.java */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            vy3.a.values();
            int[] iArr = new int[3];
            a = iArr;
            try {
                iArr[vy3.a.noNetwork.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[vy3.a.screenOff.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[vy3.a.userPause.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: VpnStatus.java */
    /* loaded from: classes3.dex */
    public enum b {
        LEVEL_CONNECTED,
        LEVEL_VPNPAUSED,
        LEVEL_CONNECTING_SERVER_REPLIED,
        LEVEL_CONNECTING_NO_SERVER_REPLY_YET,
        LEVEL_NONETWORK,
        LEVEL_NOTCONNECTED,
        LEVEL_AUTH_FAILED,
        LEVEL_WAITING_FOR_USER_INPUT,
        UNKNOWN_LEVEL
    }

    /* compiled from: VpnStatus.java */
    /* loaded from: classes3.dex */
    public interface c {
        void a(String str, String str2, b bVar);
    }

    @x1
    public static b a(@x1 String str) {
        String[] strArr = {"CONNECTING", "WAIT", "RECONNECTING", "RESOLVE", "TCP_CONNECT"};
        String[] strArr2 = {"AUTH", "GET_CONFIG", "ASSIGN_IP", "ADD_ROUTES"};
        String[] strArr3 = {qh3.u};
        String[] strArr4 = {"STARTERROR", qh3.y, "DISCONNECTED", "EXITING"};
        for (int i = 0; i < 5; i++) {
            if (str.equals(strArr[i])) {
                return b.LEVEL_CONNECTING_NO_SERVER_REPLY_YET;
            }
        }
        for (int i2 = 0; i2 < 4; i2++) {
            if (str.equals(strArr2[i2])) {
                return b.LEVEL_CONNECTING_SERVER_REPLIED;
            }
        }
        for (int i3 = 0; i3 < 1; i3++) {
            if (str.equals(strArr3[i3])) {
                return b.LEVEL_CONNECTED;
            }
        }
        for (int i4 = 0; i4 < 4; i4++) {
            if (str.equals(strArr4[i4])) {
                return b.LEVEL_NOTCONNECTED;
            }
        }
        return b.UNKNOWN_LEVEL;
    }

    public static void b(vy3.a aVar) {
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            c("NONETWORK", "", b.LEVEL_NONETWORK);
        } else if (ordinal == 1) {
            c("USERPAUSE", "", b.LEVEL_VPNPAUSED);
        } else if (ordinal != 2) {
        } else {
            c("SCREENOFF", "", b.LEVEL_VPNPAUSED);
        }
    }

    public static synchronized void c(@x1 String str, String str2, b bVar) {
        synchronized (zy3.class) {
            if (b == b.LEVEL_CONNECTED && ("WAIT".equals(str) || "AUTH".equals(str))) {
                return;
            }
            b = bVar;
            Iterator<c> it = a.iterator();
            while (it.hasNext()) {
                it.next().a(str, str2, bVar);
            }
        }
    }
}