package com.p7700g.p99005;

import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Parcel;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.anythink.basead.ui.BannerAdView;
import com.anythink.basead.ui.PanelView;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.ironsource.mediationsdk.adunit.b.d;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.xbill.DNS.TextParseException;
import org.xbill.DNS.Tokenizer;

/* compiled from: outline */
/* loaded from: classes2.dex */
public class wo1 {
    public static String A(StringBuilder sb, int i, String str, String str2) {
        sb.append(i);
        return str.replaceAll(str2, sb.toString());
    }

    public static String B(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    public static String C(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String D(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static String E(Throwable th, StringBuilder sb) {
        sb.append(th.getLocalizedMessage());
        return sb.toString();
    }

    public static StringBuilder F(char c) {
        StringBuilder sb = new StringBuilder();
        sb.append(c);
        return sb;
    }

    public static StringBuilder G(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static StringBuilder H(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static int I(jq4 jq4Var, int i) {
        return jq4.h(jq4Var.n1() + i);
    }

    public static StringBuilder J(String str, int i, String str2, int i2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder K(String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder L(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder M(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder N(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static StringBuilder O(StringBuilder sb, String str, String str2, StringBuffer stringBuffer, String str3) {
        sb.append(str);
        sb.append(str2);
        stringBuffer.append(sb.toString());
        return new StringBuilder(str3);
    }

    public static ArrayList P(LinkedHashMap linkedHashMap, Object obj) {
        ArrayList arrayList = new ArrayList();
        linkedHashMap.put(obj, arrayList);
        return arrayList;
    }

    public static ArrayList Q(Map map, Object obj) {
        ArrayList arrayList = new ArrayList();
        map.put(obj, arrayList);
        return arrayList;
    }

    public static HashMap R(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(str, str2);
        return hashMap;
    }

    public static Iterator S(Iterable iterable, String str, f05 f05Var, String str2) {
        c25.p(iterable, str);
        c25.p(f05Var, str2);
        return iterable.iterator();
    }

    public static long T() {
        return new Date().getTime();
    }

    public static Iterator U(g75 g75Var, String str, f05 f05Var, String str2) {
        c25.p(g75Var, str);
        c25.p(f05Var, str2);
        return g75Var.iterator();
    }

    public static lo4 V() {
        ri5.b1();
        return new lo4();
    }

    public static ft4 W(int i, int i2) {
        return new c55(i, i2).iterator();
    }

    public static TextParseException X(String str, String str2, Tokenizer tokenizer) {
        return tokenizer.exception(str + str2);
    }

    public static void Y(int i, Canvas canvas, int i2, int i3) {
        z15.d(i);
        canvas.restoreToCount(i2);
        z15.c(i3);
    }

    public static void Z(int i, String str, String str2) {
        com.anythink.expressad.foundation.h.n.a(str2, str.concat(String.valueOf(i)));
    }

    public static float a(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    public static void a0(com.ironsource.mediationsdk.adunit.b.d dVar, int i, int i2, Map map, com.ironsource.mediationsdk.adunit.b.b bVar) {
        map.put(bVar, new d.a(i, i2));
    }

    public static int b(int i, int i2, int i3, int i4) {
        return ((i * i2) / i3) + i4;
    }

    public static void b0(String str, TextView textView) {
        textView.setTextColor(Color.parseColor(yg3.e(str)));
    }

    public static IObjectWrapper c(Parcel parcel) {
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
        parcel.recycle();
        return asInterface;
    }

    public static void c0(String str, String str2, String str3, String str4) {
        Logger.i(str4, str + str2 + str3);
    }

    public static JsonAdapter d(Moshi moshi, Class cls, String str, String str2) {
        JsonAdapter adapter = moshi.adapter(cls, yt4.k(), str);
        c25.o(adapter, str2);
        return adapter;
    }

    public static void d0(StringBuilder sb, String str, char c, String str2) {
        sb.append(str);
        sb.append(c);
        sb.append(str2);
    }

    public static Object e(CharSequence charSequence, int i, f05 f05Var) {
        return f05Var.M(Character.valueOf(charSequence.charAt(i)));
    }

    public static View e0(BannerAdView bannerAdView, String str, String str2) {
        return bannerAdView.findViewById(com.anythink.core.common.j.h.a(bannerAdView.getContext(), str, str2));
    }

    public static Object f(byte[] bArr, int i, f05 f05Var) {
        return f05Var.M(fq4.b(gq4.o(bArr, i)));
    }

    public static void f0(StringBuilder sb, String str, String str2, IronLog ironLog) {
        sb.append(str);
        sb.append(str2);
        ironLog.verbose(sb.toString());
    }

    public static Object g(int[] iArr, int i, f05 f05Var) {
        return f05Var.M(jq4.b(kq4.o(iArr, i)));
    }

    public static void g0(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static Object h(long[] jArr, int i, f05 f05Var) {
        return f05Var.M(nq4.b(oq4.o(jArr, i)));
    }

    public static void h0(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static Object i(short[] sArr, int i, f05 f05Var) {
        return f05Var.M(tq4.b(uq4.o(sArr, i)));
    }

    public static void i0(Throwable th, StringBuilder sb, String str) {
        sb.append(th.getMessage());
        com.anythink.expressad.foundation.h.n.a(str, sb.toString());
    }

    public static String j(long j, SimpleDateFormat simpleDateFormat) {
        return simpleDateFormat.format(new Date(j));
    }

    public static void j0(AtomicInteger atomicInteger, StringBuilder sb, String str) {
        sb.append(atomicInteger.get());
        sb.append(str);
    }

    public static String k(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.W());
        return sb.toString();
    }

    public static View k0(PanelView panelView, String str, String str2, View view) {
        return view.findViewById(com.anythink.core.common.j.h.a(panelView.getContext(), str, str2));
    }

    public static String l(String str, int i) {
        return str + i;
    }

    public static com.anythink.core.c.a l0(com.anythink.core.c.b bVar) {
        return bVar.b(com.anythink.core.common.b.m.a().n());
    }

    public static int m(CharSequence charSequence, String str, f05 f05Var, String str2) {
        c25.p(charSequence, str);
        c25.p(f05Var, str2);
        return charSequence.length();
    }

    public static com.anythink.expressad.foundation.g.d.b m0() {
        return com.anythink.expressad.foundation.g.d.b.a(com.anythink.core.common.b.m.a().e());
    }

    public static String n(String str, int i, String str2) {
        return str + i + str2;
    }

    public static String o(String str, int i, String str2, int i2) {
        return str + i + str2 + i2;
    }

    public static String p(String str, long j) {
        return str + j;
    }

    public static String q(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static String r(String str, File file) {
        return str + file;
    }

    public static String s(String str, String str2) {
        return str + str2;
    }

    public static String t(String str, String str2) {
        return str + str2;
    }

    public static String u(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String v(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String w(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static int x(String str, int i, int i2) {
        return (str.hashCode() + i) * i2;
    }

    public static String y(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    public static String z(StringBuilder sb, int i, String str) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }
}