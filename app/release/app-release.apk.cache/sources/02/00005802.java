package com.p7700g.p99005;

import android.content.Context;
import com.anchorfree.hdr.AFHydra;
import com.anchorfree.hdr.HydraConnInfo;
import com.anchorfree.hdr.HydraHeaderListener;
import com.anchorfree.hdr.Ptm;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: HydraApi.java */
/* loaded from: classes2.dex */
public class qg1 {
    private static final qg1 a = new qg1();
    private static volatile boolean b = false;

    private qg1() {
    }

    @x1
    public static qg1 g() {
        return a;
    }

    public void a() {
        Ptm.NativeAbortPtm();
    }

    public void b() {
        AFHydra.NativeCLC();
    }

    @x1
    public List<HydraConnInfo> c(int i) {
        ArrayList<HydraConnInfo> NativeCI = AFHydra.NativeCI(i);
        return NativeCI != null ? NativeCI : Collections.emptyList();
    }

    @x1
    public String d() {
        String NativeCLG = AFHydra.NativeCLG();
        return NativeCLG != null ? NativeCLG : "";
    }

    public int e() {
        return AFHydra.NativeE();
    }

    public int f() {
        return AFHydra.NativeI();
    }

    public int h() {
        return AFHydra.NativeCC();
    }

    public int i(@x1 String str) {
        return AFHydra.NativeCCL(str);
    }

    public int j() {
        return AFHydra.NativeCCS();
    }

    @x1
    public String k() {
        String version = AFHydra.getVersion();
        return version != null ? version : "";
    }

    public void l(@x1 Context context) {
        if (b) {
            return;
        }
        synchronized (xg1.class) {
            if (!b) {
                hu0.b(context.getApplicationContext(), "hydra");
                b = true;
            }
        }
    }

    public void m(int i) {
        AFHydra.NativeNW(i);
    }

    public int n() {
        return AFHydra.NativeCCR();
    }

    public boolean o(@x1 String str, boolean z, boolean z2, boolean z3, @x1 String str2, @z1 String str3, @x1 HydraHeaderListener hydraHeaderListener) {
        return AFHydra.NativeA(hydraHeaderListener, str, z, z2, z3, str2, (String) r81.a(str3));
    }

    public void p(@x1 String str, @x1 String str2) {
        Ptm.NativeStartPtm(str, str2);
    }

    public int q() {
        return AFHydra.NativeB();
    }

    public void r(@x1 String str) {
        AFHydra.NativeUpRu(str);
    }
}