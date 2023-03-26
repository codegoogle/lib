package com.facebook.ads.redexgen.X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import com.p7700g.p99005.bx;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.2F */
/* loaded from: assets/audience_network.dex */
public final class C2F {
    public static C2F A05;
    public static byte[] A06;
    public static String[] A07;
    public static final Object A08;
    public final Context A00;
    public final Handler A01;
    public final HashMap<BroadcastReceiver, ArrayList<C2E>> A04 = new HashMap<>();
    public final HashMap<String, ArrayList<C2E>> A03 = new HashMap<>();
    public final ArrayList<C2D> A02 = new ArrayList<>();

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 80);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A06 = new byte[]{-116, -116, -78, -43, -40, -32, -47, -34, -116, -48, -43, -48, -116, -38, -37, -32, -116, bx.l7, -51, -32, -49, -44, -90, -116, -111, -111, -73, -38, -35, -27, -42, -29, -111, -34, -46, -27, -44, bx.l7, -42, -43, -110, -111, -111, -34, -46, -27, -44, bx.l7, -82, -95, -23, -102, -23, -32, -102, -29, -24, -18, -33, -24, -18, -102, 126, -47, -63, -58, -61, -53, -61, 126, -88, -54, -37, -48, -42, -43, -121, -45, -48, -38, -37, -95, -121, 27, 62, 50, 48, 59, 17, 65, 62, 48, 51, 50, 48, 66, 67, 28, 48, 61, 48, 54, 52, 65, -51, bx.j7, -12, -29, -24, -23, -18, -25, -96, bx.j7, -25, bx.j7, -23, -18, -13, -12, -96, -26, -23, -20, -12, -27, -14, -96, -80, -61, -47, -51, -54, -44, -57, -52, -59, 126, -46, -41, -50, -61, 126, -19, -17, 0, -11, -5, -6, -3, -5, 14, -1, 1, 9, 12, 19, 9, 6, 25, 6, 29, 34, 25, 14, -53, -60, -63, -60, -59, -51, -60, 118, -56, -69, -73, -55, -59, -60};
    }

    public static void A04() {
        A07 = new String[]{"JAgQ2spdQpH8xKgxtQcQLLz6sgGCkpe2", "SMfU9IuS4ycu6Y2ZHRBSqn3aWPXKMTOT", "55l84Ag1V6wgeVOPN73gijnv7nIwTIEx", "eOq258YlCb1TEbA", "VJMc46I8NXWnx7x8GW3WGk3ASQlYYFHT", "LoC5Exa7K60en74lmCNTJxDot4v0o8bM", "KRpLxkqJYlgWqGJZ48eoA1wpDd5KWG89", "Gt8Vn0C4eF81I9TsnyjdaH21jMiVX3Ky"};
    }

    static {
        A04();
        A03();
        A08 = new Object();
    }

    public C2F(Context context) {
        this.A00 = context;
        this.A01 = new Handler(context.getMainLooper()) { // from class: com.facebook.ads.redexgen.X.2C
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                if (message.what != 1) {
                    super.handleMessage(message);
                } else {
                    C2F.A05(C2F.this);
                }
            }
        };
    }

    public static C2F A00(Context context) {
        C2F c2f;
        synchronized (A08) {
            if (A05 == null) {
                A05 = new C2F(context.getApplicationContext());
            }
            c2f = A05;
        }
        return c2f;
    }

    public void A02() {
        C2D[] c2dArr;
        while (true) {
            synchronized (this.A04) {
                int size = this.A02.size();
                if (size > 0) {
                    c2dArr = new C2D[size];
                    this.A02.toArray(c2dArr);
                    this.A02.clear();
                } else {
                    return;
                }
            }
            for (C2D c2d : c2dArr) {
                int size2 = c2d.A01.size();
                for (int i = 0; i < size2; i++) {
                    C2E c2e = c2d.A01.get(i);
                    if (!c2e.A01) {
                        c2e.A02.onReceive(this.A00, c2d.A00);
                    }
                }
            }
        }
    }

    public static /* synthetic */ void A05(C2F c2f) {
        c2f.A02();
    }

    public final void A06(BroadcastReceiver broadcastReceiver) {
        synchronized (this.A04) {
            ArrayList<C2E> remove = this.A04.remove(broadcastReceiver);
            if (remove == null) {
                return;
            }
            for (int size = remove.size() - 1; size >= 0; size--) {
                C2E c2e = remove.get(size);
                c2e.A01 = true;
                for (int i = 0; i < c2e.A03.countActions(); i++) {
                    String action = c2e.A03.getAction(i);
                    ArrayList<C2E> arrayList = this.A03.get(action);
                    if (arrayList != null) {
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            C2E c2e2 = arrayList.get(size2);
                            if (c2e2.A02 == broadcastReceiver) {
                                c2e2.A01 = true;
                                arrayList.remove(size2);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.A03.remove(action);
                        }
                    }
                }
            }
        }
    }

    public final void A07(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.A04) {
            C2E c2e = new C2E(intentFilter, broadcastReceiver);
            ArrayList<C2E> arrayList = this.A04.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.A04.put(broadcastReceiver, arrayList);
            }
            arrayList.add(c2e);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList<C2E> arrayList2 = this.A03.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.A03.put(action, arrayList2);
                }
                arrayList2.add(c2e);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x014b, code lost:
        if (r10 != (-2)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x014e, code lost:
        if (r10 == (-1)) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x015d, code lost:
        if (r10 != (-2)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0160, code lost:
        r11 = A01(161, 4, 89);
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x016a, code lost:
        r11 = A01(157, 4, 85);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0189, code lost:
        r11 = A01(165, 14, 6);
     */
    /* JADX WARN: Incorrect condition in loop: B:150:0x01be */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean A08(Intent intent) {
        String str;
        String A01;
        synchronized (this.A04) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.A00.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            int flags = intent.getFlags() & 8;
            if (A07[6].length() != 32) {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[6] = "lSfbUYFGweUQuNG8Rfx6KTKomP6ZXnHe";
            strArr[6] = "lSfbUYFGweUQuNG8Rfx6KTKomP6ZXnHe";
            int i = 0;
            boolean z = flags != 0;
            if (z) {
                String str2 = A01(128, 15, 14) + resolveTypeIfNeeded + A01(62, 8, 14) + scheme + A01(51, 11, 42) + intent;
            }
            ArrayList<C2E> arrayList = this.A03.get(intent.getAction());
            if (arrayList != null) {
                if (z) {
                    String str3 = A01(70, 13, 23) + arrayList;
                }
                ArrayList arrayList2 = null;
                while (i < arrayList.size()) {
                    C2E c2e = arrayList.get(i);
                    if (z) {
                        String str4 = A01(104, 24, 48) + c2e.A03;
                    }
                    if (!c2e.A00) {
                        str = resolveTypeIfNeeded;
                        int match = c2e.A03.match(action, resolveTypeIfNeeded, scheme, data, categories, A01(83, 21, 127));
                        if (match >= 0) {
                            if (z) {
                                String str5 = A01(24, 27, 33) + Integer.toHexString(match);
                            }
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(c2e);
                            c2e.A00 = true;
                        } else if (z) {
                            if (match == -4) {
                                A01 = A01(149, 8, 74);
                            } else if (match != -3) {
                                String[] strArr2 = A07;
                                String str6 = strArr2[5];
                                String str7 = strArr2[2];
                                int charAt = str6.charAt(2);
                                int i2 = str7.charAt(2);
                                if (charAt != i2) {
                                    String[] strArr3 = A07;
                                    strArr3[0] = "5qzuR4qMoPZls20V66WxKiW3T4KGbQbj";
                                    strArr3[7] = "kEPjeIL3mafX6U4jTmCqSP6sjLKd9gyj";
                                } else {
                                    String[] strArr4 = A07;
                                    strArr4[4] = "h3Qfzc7N3anSG7kgVWb3yo3aGUD4IV89";
                                    strArr4[1] = "BfvHQ0l05ZHpmgj3Y5mpmM31eUnVsDmR";
                                }
                            } else {
                                A01 = A01(143, 6, 60);
                            }
                            String str8 = A01(0, 24, 28) + A01;
                        }
                    } else if (z) {
                        str = resolveTypeIfNeeded;
                    } else {
                        str = resolveTypeIfNeeded;
                    }
                    i++;
                    resolveTypeIfNeeded = str;
                }
                if (arrayList2 != null) {
                    for (int i3 = 0; i3 < i; i3++) {
                        ((C2E) arrayList2.get(i3)).A00 = false;
                    }
                    this.A02.add(new C2D(intent, arrayList2));
                    if (!this.A01.hasMessages(1)) {
                        this.A01.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }
}