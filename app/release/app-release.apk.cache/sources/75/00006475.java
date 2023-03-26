package com.p7700g.p99005;

import android.util.Log;
import java.io.File;
import java.io.IOException;

/* compiled from: GifDrawableEncoder.java */
/* loaded from: classes2.dex */
public class ww1 implements mq1<vw1> {
    private static final String a = "GifEncoder";

    @Override // com.p7700g.p99005.mq1
    @x1
    public cq1 b(@x1 jq1 jq1Var) {
        return cq1.SOURCE;
    }

    @Override // com.p7700g.p99005.dq1
    /* renamed from: c */
    public boolean a(@x1 cs1<vw1> cs1Var, @x1 File file, @x1 jq1 jq1Var) {
        try {
            l02.f(cs1Var.get().f(), file);
            return true;
        } catch (IOException unused) {
            Log.isLoggable(a, 5);
            return false;
        }
    }
}