package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import org.xbill.DNS.Flags;

/* loaded from: assets/audience_network.dex */
public final class TL implements C5X {
    public static byte[] A03;
    public static String[] A04;
    public final QB A01;
    public Set<InterfaceC04085a> A00 = new HashSet();
    public final List<C5Z> A02 = new ArrayList();

    static {
        A03();
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 107);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{-72, -72, -67, Flags.CD, -46, -72, -67, Flags.CD, 41, 59, 59, 45, 60, 59};
    }

    public static void A03() {
        A04 = new String[]{"Yyt8Jrp", "FvQHlihhdkZe9tXm7YLHdG4gIBqm", "h7ITXytSbKbsxwMfZDKdUPEvMsTrizAq", "0TuNzKSIMRKA8K3EzRQL94hbriXTa7QT", "ySuQOOQJHVodSpCznPaDLfXVVxuxvbGA", "XYB8XYCfCTfWBGtKG07Wi1HuHmIQx2qC", "71D0xe3tljOi7f3b0iOVOXaXnoSWhNo4", "dwdYeokke3ChTNA3vTF4hdqHGwVronGN"};
    }

    public TL(QN qn) {
        this.A01 = qn.A4N(QC.A0B);
        this.A01.A3I(new TK(this));
        A04();
    }

    @Nullable
    public static Set<InterfaceC04085a> A01(JSONObject jSONObject) {
        TM A00;
        HashSet hashSet = new HashSet();
        JSONArray optJSONArray = jSONObject.optJSONArray(A00(8, 6, 93));
        if (optJSONArray == null) {
            return null;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject assetJson = optJSONArray.optJSONObject(i);
            if (assetJson == null || (A00 = TM.A00(assetJson)) == null) {
                return null;
            }
            hashSet.add(A00);
            int i2 = A04[1].length();
            if (i2 == 21) {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[6] = "2zeGpFgTpOohtr7xv9EhLTO87hKhrQIZ";
            strArr[3] = "Z45Lb0RXWpRaUi2IX7mXCACeVe5qt7dU";
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A04() {
        if (!this.A01.A7i()) {
            BuildConfigApi.isDebug();
            return;
        }
        Set<InterfaceC04085a> A01 = A01(this.A01.A5x());
        if (!this.A00.equals(A01) && A01 != null) {
            this.A00 = A01;
            for (C5Z listener : this.A02) {
                listener.A3T();
            }
        }
        if (BuildConfigApi.isDebug()) {
            for (InterfaceC04085a interfaceC04085a : this.A00) {
                String.format(Locale.US, A00(0, 8, 45), interfaceC04085a.A7B(), interfaceC04085a.getUrl());
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C5X
    public final void A3G(C5Z c5z) {
        this.A02.add(c5z);
    }

    @Override // com.facebook.ads.redexgen.X.C5X
    public final synchronized Set<InterfaceC04085a> A5O() {
        return new HashSet(this.A00);
    }
}