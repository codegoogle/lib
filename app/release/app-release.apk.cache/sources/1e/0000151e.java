package com.facebook.ads.redexgen.X;

import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.util.common.Preconditions;
import com.p7700g.p99005.aa;
import com.p7700g.p99005.bx;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
import org.xbill.DNS.Flags;
import org.xbill.DNS.WKSRecord;

/* loaded from: assets/audience_network.dex */
public final class XO implements C9O {
    public static byte[] A03;
    public static final String A04;
    public final C1081Wi A00;
    public final C9Z<JB> A01;
    public final C9Z<JB> A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 70);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{102, 100, 43, 34, 100, 48, 61, 52, 33, 126, 100, 24, 61, 28, 47, 60, 55, 45, 10, 45, 54, 43, 56, 62, 60, Flags.CD, 60, 58, 54, 43, 61, 29, 56, 45, 56, 59, 56, bx.W5, 60, 105, 72, 65, 72, 89, 72, 73, 13, 72, 91, 72, 67, 89, 23, 13, 15, 66, 101, 109, 104, 97, 96, 36, 112, 107, 36, 103, 104, 97, 101, 118, 36, 97, 114, 97, 106, 112, 119, 36, 119, 112, 107, 118, 101, 99, 97, 97, 70, 78, 75, 66, 67, 7, 83, 72, 7, 67, 66, 84, 66, 85, 78, 70, 75, 78, 93, 66, 7, 70, 73, 7, 66, 81, 66, 73, 83, 7, 65, 85, 72, 74, 7, 67, 70, 83, 70, 69, 70, 84, 66, 7, 107, 76, 68, 65, 72, 73, 13, 89, 66, 13, 64, 66, 91, 72, 13, 72, 91, 72, 67, 89, 94, 13, 75, 95, 66, 64, 13, 68, 67, 0, 75, 65, 68, 74, 69, 89, 13, 94, 89, 66, 95, 76, 74, 72, 13, 79, 76, 78, 70, 13, 89, 66, 13, 72, 91, 72, 67, 89, 94, 13, 73, 76, 89, 76, 79, 76, 94, 72, 118, 81, 89, 92, 85, 84, 16, 68, 95, 16, 64, 81, 66, 67, 85, 16, 81, 94, 16, 85, 70, 85, 94, 68, 16, 86, 66, 95, 93, 16, 89, 94, 29, 86, 92, 89, 87, 88, 68, 16, 67, 68, 95, 66, 81, 87, 85, 123, 92, 84, 81, 88, 89, 29, 73, 82, 29, 79, 88, 92, 89, 29, 73, 85, 88, 29, 83, 72, 80, 95, 88, 79, 29, 82, 91, 29, 88, 75, 88, 83, 73, 78, 29, 91, 79, 82, 80, 29, 89, 92, 73, 92, 95, 92, 78, 88, 12, 43, 35, 38, 47, 46, 106, 62, 37, 106, 57, 47, 56, 35, 43, 38, 35, 48, 47, 106, 43, 46, 106, 47, 60, 47, 36, 62, 105, 78, 70, 76, 73, 71, 72, 84, 13, 97, 68, 101, 86, 69, 78, 84, 115, 84, 79, 82, 65, 71, 69, 114, 69, 67, 79, 82, 68, 100, 65, 84, 65, 66, 65, 83, 69, 56, 15, 9, 5, 24, 14, 74, 14, Flags.CD, 30, Flags.CD, 8, Flags.CD, 25, 15, 74, 12, Flags.CD, 3, 6, 31, 24, 15, 74, 5, 9, 9, 31, 24, 24, 15, 14, 74, 29, 2, 15, 4, 74, 24, 15, Flags.CD, 14, 3, 4, 13, 74, 15, 28, 15, 4, 30, 25, 68, 61, 40, 40, 57, 49, 44, 40, 28, 25, 12, 25, 47, 34, 95, 72, 78, 66, 95, 73, 114, 73, 76, 89, 76, 79, 76, 94, 72, 65, 87, 65, 65, 91, 93, 92, 109, 91, 86, 46, 56, 46, 46, 52, 50, 51, 2, 41, 52, 48, 56, 100, 121, 125, 117, 49, bx.W5, 46, 32, 43, 88, 85, 92, 73, 12, 23, 18, 23, 22, 14, 23};
    }

    static {
        A03();
        A04 = XO.class.getSimpleName();
    }

    public XO(C1081Wi c1081Wi) throws IOException {
        this.A00 = c1081Wi;
        this.A01 = new XW(C9W.A00(A00(11, 28, 31), c1081Wi), new XM(this));
        this.A02 = new XW(C9W.A00(A00(322, 37, 102), c1081Wi), new XN(this));
    }

    private List<JSONObject> A01(List<JSONObject> list, byte[] bArr, int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            if (i2 == 0) {
                break;
            }
            try {
                list.add(A02(bArr, i, i2));
            } catch (JSONException e) {
                if (BuildConfigApi.isDebug()) {
                    Log.e(A04, A00(85, 45, 97), e);
                }
                A05(C04848i.A21, e);
            }
            i += i2;
        }
        return list;
    }

    public static JSONObject A02(byte[] bArr, int i, int i2) throws JSONException {
        return new JSONObject(new String(Arrays.copyOfRange(bArr, i, i + i2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(int i, String str) {
        C04858j c04858j = new C04858j(str);
        c04858j.A03(1);
        this.A00.A04().A83(A00(aa.c.w, 15, 107), i, c04858j);
    }

    private void A05(int i, Throwable th) {
        this.A00.A04().A82(A00(aa.c.w, 15, 107), i, new C04858j(th));
    }

    public static byte[] A07(String str, JB jb) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A00(aa.c.u, 2, 0), str);
            jSONObject.put(A00(466, 5, 3), jb.A09());
            jSONObject.put(A00(471, 4, 106), jb.A07().toString());
            jSONObject.put(A00(462, 4, 86), LW.A02(jb.A05()));
            jSONObject.put(A00(450, 12, 27), LW.A02(jb.A04()));
            jSONObject.put(A00(440, 10, 116), jb.A08());
            jSONObject.put(A00(419, 4, 62), new JSONObject(jb.A0A()));
            jSONObject.put(A00(412, 7, 26), 0);
        } catch (JSONException e) {
            if (BuildConfigApi.isDebug()) {
                Log.e(A04, A00(294, 28, 12), e);
            }
        }
        return jSONObject.toString().getBytes();
    }

    public static byte[] A09(JSONObject jSONObject) {
        return jSONObject.toString().getBytes();
    }

    public final int A0A() {
        try {
            return this.A01.A6p();
        } catch (C05109i e) {
            if (BuildConfigApi.isDebug()) {
                Log.e(A04, A00(WKSRecord.Service.LINK, 49, 123), e);
                return 0;
            }
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00e0 A[Catch: 9i -> 0x0126, TryCatch #5 {9i -> 0x0126, blocks: (B:33:0x00da, B:35:0x00e0, B:36:0x00ef, B:22:0x0088, B:24:0x008e, B:26:0x0094, B:27:0x00d0, B:39:0x00f8, B:40:0x00fc, B:42:0x0102, B:43:0x0112, B:44:0x0116, B:46:0x011c), top: B:61:0x00da }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int A0B(int i, Set<String> set, Set<String> set2) {
        String A00 = A00(412, 7, 26);
        int i2 = 0;
        int[] iArr = new int[30];
        byte[] bArr = new byte[30000];
        LinkedList linkedList = new LinkedList();
        try {
            linkedList.add(this.A02.A53(bArr, iArr));
            List<JSONObject> A01 = A01(new LinkedList(), bArr, iArr);
            while (((C9Y) linkedList.getLast()).A8T()) {
                Arrays.fill(iArr, 0);
                linkedList.add(this.A02.A53(bArr, iArr));
                A01 = A01(A01, bArr, iArr);
            }
            Iterator<JSONObject> it = A01.iterator();
            while (it.hasNext()) {
                JSONObject next = it.next();
                try {
                    String string = next.getString(A00(aa.c.u, 2, 0));
                    try {
                        if (set.contains(string)) {
                            int i3 = next.getInt(A00) + 1;
                            if (i3 >= i) {
                                i2++;
                            } else {
                                try {
                                    next.put(A00, i3);
                                    this.A01.ADQ(A09(next));
                                } catch (C05109i e) {
                                    e = e;
                                    if (BuildConfigApi.isDebug()) {
                                    }
                                    A05(C04848i.A1x, e);
                                    return i2;
                                } catch (JSONException e2) {
                                    e = e2;
                                    try {
                                        if (BuildConfigApi.isDebug()) {
                                        }
                                        A05(C04848i.A21, e);
                                    } catch (C05109i e3) {
                                        e = e3;
                                        if (BuildConfigApi.isDebug()) {
                                            Log.e(A04, A00(WKSRecord.Service.CISCO_FNA, 68, 107), e);
                                        }
                                        A05(C04848i.A1x, e);
                                        return i2;
                                    }
                                }
                            }
                            it.remove();
                        } else {
                            try {
                                if (set2.contains(string)) {
                                    if (BuildConfigApi.isDebug()) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(A00(39, 16, 107));
                                        sb.append(string);
                                        sb.append(A00(0, 11, 2));
                                        String A002 = A00(471, 4, 106);
                                        String eventId = A00(475, 7, 63);
                                        sb.append(next.optString(A002, eventId));
                                        sb.toString();
                                    }
                                    it.remove();
                                }
                            } catch (JSONException e4) {
                                e = e4;
                                if (BuildConfigApi.isDebug()) {
                                    String str = A04;
                                    String eventId2 = A00(198, 47, 118);
                                    Log.e(str, eventId2, e);
                                }
                                A05(C04848i.A21, e);
                            }
                        }
                    } catch (C05109i e5) {
                        e = e5;
                    } catch (JSONException e6) {
                        e = e6;
                    }
                } catch (JSONException e7) {
                    e = e7;
                }
            }
            for (JSONObject jSONObject : A01) {
                this.A02.ADQ(A09(jSONObject));
            }
            Iterator it2 = linkedList.iterator();
            while (it2.hasNext()) {
                ((C9Y) it2.next()).A4f();
            }
        } catch (C05109i e8) {
            e = e8;
        }
        return i2;
    }

    public final List<JSONObject> A0C(int i) {
        boolean z = false;
        if (i == -1) {
            z = true;
            i = 30;
        }
        int[] iArr = new int[i];
        byte[] bArr = new byte[i * 1000];
        List<JSONObject> linkedList = new LinkedList<>();
        LinkedList linkedList2 = new LinkedList();
        try {
            C9Y lastFetch = this.A01.A53(bArr, iArr);
            linkedList2.add(lastFetch);
            int A54 = lastFetch.A54();
            linkedList = A01(linkedList, bArr, iArr);
            while (lastFetch.A8T() && (A54 < i || z)) {
                if (!z) {
                    iArr = new int[i - A54];
                } else {
                    Arrays.fill(iArr, 0);
                }
                lastFetch = this.A01.A53(bArr, iArr);
                linkedList2.add(lastFetch);
                linkedList = A01(linkedList, bArr, iArr);
            }
            for (JSONObject jSONObject : linkedList) {
                this.A02.ADQ(A09(jSONObject));
            }
            Iterator it = linkedList2.iterator();
            while (it.hasNext()) {
                ((C9Y) it.next()).A4f();
            }
        } catch (C05109i e) {
            if (BuildConfigApi.isDebug()) {
                Log.e(A04, A00(359, 53, 44), e);
            }
            A05(C04848i.A1y, e);
        }
        return linkedList;
    }

    @Override // com.facebook.ads.redexgen.X.C9O
    public final void A40() {
        try {
            this.A01.clear();
            this.A02.clear();
        } catch (C05109i e) {
            if (BuildConfigApi.isDebug()) {
                Log.e(A04, A00(55, 30, 66), e);
            }
            A05(C04848i.A1v, e);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9L != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<java.lang.String> */
    @Override // com.facebook.ads.redexgen.X.C9O
    public final void ADv(final JB jb, final C9L<String> c9l) {
        Executor executor = ExecutorC0800Lj.A07;
        final C9Z<JB> c9z = this.A01;
        final C1081Wi c1081Wi = this.A00;
        C0797Lg.A00(executor, new AsyncTask<Void, Void, String>(jb, c9l, c9z, c1081Wi) { // from class: com.facebook.ads.redexgen.X.9P
            public static byte[] A05;
            public static String[] A06;
            @Nullable
            public C05109i A00;
            public final C8H A01;
            public final C9L<String> A02;
            public final C9Z<JB> A03;
            public final JB A04;

            static {
                A03();
                A02();
            }

            public static String A00(int i, int i2, int i3) {
                byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
                for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                    copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 55);
                }
                return new String(copyOfRange);
            }

            public static void A02() {
                A05 = new byte[]{26, 40, 31, 31, 2, 31, 77, 0, 8, 30, 30, 12, 10, 8, 77, 14, 12, 3, 3, 2, 25, 77, 15, 8, 77, 3, 24, 1, 1, 13, 46, 38, 38, 40, 47, 38, 97, 36, 55, 36, 47, 53, 123, 97, 9, 30, 24, 20, 9, 31, 36, 31, 26, 15, 26, 25, 26, 8, 30};
            }

            public static void A03() {
                A06 = new String[]{"eZRg0", "9V6E8W", "xj5QhV", "OA95VIvTvwhgOpg1JzD5APn5ld4Fxl09", "KVXKxw3vFVm2nsonOqXLQ2M9", "1wiEXg5TWKy6aTJl", "hr3sX5JQ1zlqribj", "Vt9t5ut5ZgjhHbMTByjzA5y3IT5Rov5"};
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9L != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<java.lang.String> */
            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9Z != com.facebook.ads.internal.eventstorage.record.RecordDatabase<com.facebook.ads.internal.logging.AdEvent> */
            {
                this.A04 = jb;
                this.A03 = c9z;
                this.A02 = c9l;
                this.A01 = c1081Wi;
            }

            @Nullable
            private final String A01(Void... voidArr) {
                String eventId;
                byte[] A07;
                if (KU.A02(this)) {
                    return null;
                }
                String str = null;
                try {
                    try {
                        str = UUID.randomUUID().toString();
                        InterfaceC04838h A042 = this.A01.A04();
                        String eventId2 = this.A04.A07().toString();
                        A042.A7N(eventId2);
                        eventId = this.A04.A09();
                    } catch (C05109i e) {
                        this.A00 = e;
                        this.A01.A04().A82(A00(44, 15, 76), C04848i.A1z, new C04858j(e));
                    }
                    if (TextUtils.isEmpty(eventId)) {
                        return null;
                    }
                    if (BuildConfigApi.isDebug()) {
                        StringBuilder sb = new StringBuilder();
                        String eventId3 = A00(29, 15, 118);
                        sb.append(eventId3);
                        String eventId4 = this.A04.A07().toString();
                        sb.append(eventId4);
                        String eventId5 = A00(0, 1, 13);
                        sb.append(eventId5);
                        String eventId6 = this.A04.A0A().toString();
                        sb.append(eventId6);
                        sb.toString();
                    }
                    C9Z<JB> c9z2 = this.A03;
                    A07 = XO.A07(str, this.A04);
                    c9z2.ADQ(A07);
                    return str;
                } catch (Throwable th) {
                    KU.A00(th, this);
                    return null;
                }
            }

            private final void A04(String str) {
                if (KU.A02(this)) {
                    return;
                }
                try {
                    if (this.A00 == null) {
                        this.A02.A03(str);
                    } else {
                        this.A02.A02(0, (String) Preconditions.checkNotNull(this.A00.getMessage(), A00(1, 28, 90)));
                    }
                } catch (Throwable th) {
                    KU.A00(th, this);
                }
            }

            @Override // android.os.AsyncTask
            @Nullable
            public final /* bridge */ /* synthetic */ String doInBackground(Void[] voidArr) {
                if (KU.A02(this)) {
                    return null;
                }
                try {
                    return A01(voidArr);
                } catch (Throwable th) {
                    KU.A00(th, this);
                    if (A06[7].length() != 31) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A06;
                    strArr[1] = bx.C4;
                    strArr[1] = bx.C4;
                    return null;
                }
            }

            @Override // android.os.AsyncTask
            public final /* bridge */ /* synthetic */ void onPostExecute(String str) {
                if (KU.A02(this)) {
                    return;
                }
                try {
                    A04(str);
                } catch (Throwable th) {
                    KU.A00(th, this);
                }
            }
        }, new Void[0]);
    }
}