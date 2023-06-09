package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import com.p7700g.p99005.bx;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.Kq  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0783Kq {
    public static byte[] A00;
    public static String[] A01;
    public static final Package A02;
    public static final String A03;
    public static final String A04;
    public static final String A05;
    public static final Set<C1080Wh> A06;
    public static final AtomicReference<InterfaceC0786Ku> A07;

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 18);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{-111, -92, -89, -79, -70, -62, -92, -89, -62, -78, -91, -83, -62, -84, -89, -62, -82, -88, -68, -68, -49, -46, -36, -27, -19, -35, -32, -41, -43, -41, -36, -49, -38, -19, -45, -26, -30, -32, -49, bx.j7, 102, 121, 124, -122, -113, -105, -117, 121, -114, 125, 124, -105, -117, -116, 121, -116, 125, -105, 124, 121, -116, 121, -57, -43, -22, bx.l7, -40, -108, -25, -24, -43, -24, bx.l7, -108, -42, -23, -30, -40, -32, bx.l7, -108, -35, -25, -108, bx.l7, bx.j7, -28, -24, -19, -107};
    }

    public static void A08() {
        A01 = new String[]{"R2O7PMYP6nkOeNui3I4WlXx4fu7rpRKA", "y", "n9RLgUbY6qPVyxnn4C2MCNq6tOX6tKMu", "KtI8XvYnNiAs4lVQz", "VIjGruAAxxfbDEfj8", "jnPluIPOifq7BY1vqnqKLiUetY3DHsfM", "J5aiTqmsNT2689NKU", "zCaDldCe0EtEl2h3W"};
    }

    static {
        A08();
        A07();
        A02 = C0783Kq.class.getPackage();
        A04 = A02 + A06(40, 22, 38);
        A03 = A02 + A06(0, 19, 81);
        A05 = A02 + A06(19, 21, 124);
        A06 = Collections.newSetFromMap(new WeakHashMap());
        A07 = new AtomicReference<>();
    }

    public static Intent A00(Intent cloneIntent) {
        Intent cloneFilter = cloneIntent.cloneFilter();
        cloneFilter.setFlags(cloneIntent.getFlags());
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(cloneIntent.getExtras());
        cloneFilter.putExtra(A05, obtain.marshall());
        obtain.recycle();
        return cloneFilter;
    }

    public static Intent A01(Intent startIntent, ClassLoader classLoader) {
        Intent cloneFilter = startIntent.cloneFilter();
        cloneFilter.setFlags(startIntent.getFlags());
        Bundle bundle = new Bundle();
        Parcel obtain = Parcel.obtain();
        byte[] byteArrayExtra = startIntent.getByteArrayExtra(A05);
        if (byteArrayExtra != null) {
            obtain.unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
            obtain.setDataPosition(0);
            bundle = obtain.readBundle(classLoader);
            obtain.recycle();
        }
        cloneFilter.putExtras(bundle);
        return cloneFilter;
    }

    public static Bundle A02(Bundle bundle, ClassLoader classLoader) {
        Parcel obtain = Parcel.obtain();
        byte[] byteArray = bundle.getByteArray(A04);
        if (byteArray != null) {
            obtain.unmarshall(byteArray, 0, byteArray.length);
            obtain.setDataPosition(0);
            Bundle readBundle = obtain.readBundle(classLoader);
            obtain.recycle();
            String[] strArr = A01;
            if (strArr[6].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "08vXapB5qdF8q1e2g";
            strArr2[3] = "bPV7EQI3jYdBWJzP2";
            return readBundle;
        }
        throw new IllegalStateException(A06(62, 28, 98));
    }

    @Nullable
    public static C1080Wh A03(Intent intent) {
        String adId = intent.getStringExtra(A03);
        if (adId != null) {
            for (C1080Wh c1080Wh : A06) {
                if (adId.equals(c1080Wh.A0A().getId())) {
                    return c1080Wh;
                }
            }
            return null;
        }
        return null;
    }

    public static AdActivityIntent A04(C1080Wh c1080Wh) {
        AdActivityIntent adActivityIntent = new AdActivityIntent(c1080Wh.getApplicationContext(), A05());
        adActivityIntent.putExtra(A03, c1080Wh.A0A().getId());
        A06.add(c1080Wh);
        return adActivityIntent;
    }

    public static Class A05() {
        if (A01[1].length() != 1) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[4] = "4NnM5dRGBMW0KGxzs";
        strArr[3] = "N6FCbEqQMIqNBYuck";
        return AudienceNetworkActivity.class;
    }

    public static void A09(Bundle bundle, Bundle bundle2) {
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle2);
        bundle.putByteArray(A04, obtain.marshall());
        obtain.recycle();
    }

    public static void A0A(C1080Wh c1080Wh, AdActivityIntent adActivityIntent) {
        c1080Wh.getApplicationContext().startActivity(A00(adActivityIntent));
    }

    public static boolean A0B(Intent intent, Set<String> set) {
        Uri data = intent.getData();
        if (data == null) {
            return false;
        }
        String prefix = data.toString();
        for (String url : set) {
            if (prefix.startsWith(url)) {
                return true;
            }
        }
        return false;
    }

    public static boolean A0C(C1080Wh c1080Wh, Intent intent) {
        return A0D(c1080Wh, intent, A07.get());
    }

    @VisibleForTesting
    public static boolean A0D(C1080Wh c1080Wh, Intent intent, @Nullable InterfaceC0786Ku interfaceC0786Ku) {
        if (A0B(intent, J8.A0U(c1080Wh))) {
            return false;
        }
        Activity activity = c1080Wh;
        String[] strArr = A01;
        if (strArr[6].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[1] = bx.y4;
        strArr2[1] = bx.y4;
        Activity A09 = c1080Wh.A09();
        if (A09 != null) {
            activity = A09;
        } else {
            intent.addFlags(268435456);
        }
        if (interfaceC0786Ku == null || A0B(intent, J8.A0W(c1080Wh))) {
            activity.startActivity(intent);
            return true;
        }
        return interfaceC0786Ku.startActivity(activity, intent);
    }
}