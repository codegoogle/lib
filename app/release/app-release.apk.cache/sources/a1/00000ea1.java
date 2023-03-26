package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.internal.bridge.gms.AdvertisingId;
import com.p7700g.p99005.bx;
import com.p7700g.p99005.g15;
import java.lang.reflect.Method;
import java.util.Arrays;
import org.xbill.DNS.Flags;

/* renamed from: com.facebook.ads.redexgen.X.5l  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C04185l {
    public static byte[] A00;
    public static String[] A01;
    public static final String A02;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 58);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        byte[] bArr = {112, 82, 93, 93, 92, 71, 19, 84, 86, 71, 19, 82, 87, 69, 86, 65, 71, 90, 64, 90, 93, 84, 19, 90, 93, 85, 92, 19, 92, 93, 19, 94, 82, 90, 93, 19, 71, 91, 65, 86, 82, 87, 29, 91, 87, 85, 22, 95, 87, 87, 95, 84, 93, 22, 89, 86, 92, 74, 87, 81, 92, 22, 95, 85, 75, 82, 94, 92, 31, 86, 94, 94, 86, 93, 84, 31, 80, 95, 85, 67, 94, 88, 85, 31, 86, 92, 66, 31, 80, 85, 66, 31, 88, 85, 84, 95, 69, 88, 87, 88, 84, 67, 31, 112, 85, 71, 84, 67, 69, 88, 66, 88, 95, 86, 120, 85, 114, 93, 88, 84, 95, 69, 109, 97, 99, 32, 105, 97, 97, 105, 98, 107, 32, 111, 96, 106, 124, 97, 103, 106, 32, 105, 99, 125, 32, 111, 106, 125, 32, 103, 106, 107, 96, 122, 103, 104, 103, 107, 124, 32, 125, 107, 124, 120, 103, 109, 107, 32, 93, 90, 79, 92, 90, 18, 30, 28, 95, 22, 30, 30, 22, 29, 20, 95, 16, 31, 21, 3, 30, 24, 21, 95, 22, 28, 2, 95, 18, 30, 28, 28, 30, 31, 95, 54, 30, 30, 22, 29, 20, 33, 29, 16, 8, 34, 20, 3, 7, 24, 18, 20, 2, 36, 5, 24, 29, 67, 65, 74, 65, 86, 77, 71, 106, 104, 121, 76, 105, 123, 104, g15.c, 121, 100, 126, 100, 99, 106, 68, 105, 68, 99, 107, 98, 123, 121, 104, 85, 120, 33, 59, 15, 39, 39, 47, 36, 45, 24, 36, 41, 49, 27, 45, 58, 62, 33, 43, 45, 59, 9, 62, 41, 33, 36, 41, bx.W5, 36, 45, 43, 49, 14, 43, 47, 43, 54, 3, 38, 22, 48, 35, 33, 41, 43, 44, 37, 7, 44, 35, 32, 46, 39, 38};
        if (A01[0].charAt(25) != 'L') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[7] = "5c2qL4dH8BvO0Uzn9h0t1hzuT";
        strArr[3] = "iopOujFX2mYmGwDZvEry";
        A00 = bArr;
    }

    public static void A06() {
        A01 = new String[]{"o8zuart55Bmx3Pw0EGryupigSLJoPiZx", "bq35BXrVyo2MmN2pvK0AAoIbsBJXmHFn", "Ag4UQwTEuL9TJhKNxG6", "PmxOul6ExA7xevKGmIJ7", "bJjslG0QPgIDYXjJzGe0RXJuWF5PAt6I", "GLZoSVJacutm5kJ9CSmVpuybEaBnhneX", "dIwLXajRtHFv7I4e8IdUhcaSFtkhp8vw", "TtnuuoV6cihzxwpt43jVepBLS"};
    }

    static {
        A06();
        A05();
        A02 = C04115d.class.getSimpleName();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
        if (r3 != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C04115d A00(C8H c8h) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            C04115d A012 = A01(c8h);
            if (A012 != null) {
                boolean isEmpty = TextUtils.isEmpty(A012.A03());
                if (A01[0].charAt(25) != 'L') {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[4] = "uy9l7RLQ2P1HyKRuXc5qKTdvpqbxTZwF";
                strArr[4] = "uy9l7RLQ2P1HyKRuXc5qKTdvpqbxTZwF";
            }
            A012 = A02(c8h);
            if (A012 == null || TextUtils.isEmpty(A012.A03())) {
                return A03(c8h);
            }
            return A012;
        }
        throw new IllegalStateException(A04(0, 43, 9));
    }

    @Nullable
    @VisibleForTesting
    public static C04115d A01(C8H c8h) {
        AdvertisingId advertisingIdInfoDirectly = AdvertisingId.getAdvertisingIdInfoDirectly(c8h);
        if (advertisingIdInfoDirectly != null) {
            return new C04115d(advertisingIdInfoDirectly.getId(), advertisingIdInfoDirectly.isLimitAdTracking(), EnumC04105c.A03);
        }
        return null;
    }

    @Nullable
    @VisibleForTesting
    public static C04115d A02(C8H c8h) {
        Object A002;
        Method A022;
        Object A003;
        boolean z = true;
        Method A023 = C04195m.A02(A04(173, 52, 75), A04(257, 29, 114), Context.class);
        if (A023 == null || (A002 = C04195m.A00(null, A023, c8h)) == null || ((Integer) A002).intValue() != 0 || (A022 = C04195m.A02(A04(65, 57, 11), A04(232, 20, 55), Context.class)) == null || (A003 = C04195m.A00(null, A022, c8h)) == null) {
            return null;
        }
        Method A012 = C04195m.A01(A003.getClass(), A04(252, 5, 38), new Class[0]);
        Method A013 = C04195m.A01(A003.getClass(), A04(286, 24, 120), new Class[0]);
        if (A012 == null || A013 == null) {
            return null;
        }
        String id = (String) C04195m.A00(A003, A012, new Object[0]);
        Boolean bool = (Boolean) C04195m.A00(A003, A013, new Object[0]);
        if (id == null) {
            return null;
        }
        return new C04115d(id, (bool == null || !bool.booleanValue()) ? false : false, EnumC04105c.A07);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.facebook.ads.internal.attribution.GmsAttributionProvider$GoogleAdInfo] */
    @SuppressLint({"CatchGeneralException"})
    @VisibleForTesting
    public static C04115d A03(C8H c8h) {
        ServiceConnectionC04175k serviceConnectionC04175k = new ServiceConnectionC04175k();
        Intent intent = new Intent(A04(122, 51, 52));
        intent.setPackage(A04(43, 22, 2));
        if (c8h.bindService(intent, serviceConnectionC04175k, 1)) {
            try {
                ?? r1 = new IInterface(serviceConnectionC04175k.A02()) { // from class: com.facebook.ads.internal.attribution.GmsAttributionProvider$GoogleAdInfo
                    public static byte[] A01;
                    public static String[] A02;
                    public IBinder A00;

                    static {
                        A02();
                        A01();
                    }

                    public static String A00(int i, int i2, int i3) {
                        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
                        int i4 = 0;
                        while (true) {
                            int length = copyOfRange.length;
                            String[] strArr = A02;
                            if (strArr[5].length() != strArr[0].length()) {
                                throw new RuntimeException();
                            }
                            String[] strArr2 = A02;
                            strArr2[3] = "";
                            strArr2[3] = "";
                            if (i4 >= length) {
                                return new String(copyOfRange);
                            }
                            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 80);
                            i4++;
                        }
                    }

                    public static void A01() {
                        A01 = new byte[]{Flags.CD, 23, 21, -42, 15, 23, 23, 15, 20, 13, -42, 9, 22, 12, 26, 23, 17, 12, -42, 15, 21, 27, -42, 9, 12, 27, -42, 17, 12, 13, 22, 28, 17, 14, 17, 13, 26, -42, 17, 22, 28, 13, 26, 22, 9, 20, -42, -15, -23, 12, 30, 13, 26, 28, 17, 27, 17, 22, 15, -15, 12, -5, 13, 26, 30, 17, Flags.CD, 13};
                    }

                    public static void A02() {
                        A02 = new String[]{"", "dlCQJjSx2v0yIAE7uR5", "YVJONne7N3U8xm", "", "eKTK4BSI8P33PVYq98zfXeBzSnXDY", "", "Oc9p6kWmaRe51UGQv0AehnzsYEIJ", "vamZVSY5oxMc9Fm9XA4FwhL"};
                    }

                    {
                        this.A00 = r1;
                    }

                    public final String A03() throws RemoteException {
                        Parcel reply = Parcel.obtain();
                        Parcel obtain = Parcel.obtain();
                        try {
                            reply.writeInterfaceToken(A00(0, 68, 88));
                            this.A00.transact(1, reply, obtain, 0);
                            obtain.readException();
                            return obtain.readString();
                        } finally {
                            obtain.recycle();
                            reply.recycle();
                        }
                    }

                    public final boolean A04() throws RemoteException {
                        Parcel reply = Parcel.obtain();
                        Parcel obtain = Parcel.obtain();
                        try {
                            reply.writeInterfaceToken(A00(0, 68, 88));
                            boolean z = true;
                            reply.writeInt(1);
                            this.A00.transact(2, reply, obtain, 0);
                            obtain.readException();
                            if (obtain.readInt() == 0) {
                                z = false;
                            }
                            return z;
                        } finally {
                            obtain.recycle();
                            reply.recycle();
                        }
                    }

                    @Override // android.os.IInterface
                    public final IBinder asBinder() {
                        return this.A00;
                    }
                };
                return new C04115d(r1.A03(), r1.A04(), EnumC04105c.A08);
            } catch (Throwable th) {
                try {
                    c8h.A04().A82(A04(225, 7, 30), C04848i.A18, new C04858j(th));
                } finally {
                    c8h.unbindService(serviceConnectionC04175k);
                }
            }
        }
        return null;
    }
}