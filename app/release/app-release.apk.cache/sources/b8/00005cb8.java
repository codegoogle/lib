package com.p7700g.p99005;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferEncoder.java */
/* loaded from: classes2.dex */
public class st1 implements dq1<ByteBuffer> {
    private static final String a = "ByteBufferEncoder";

    @Override // com.p7700g.p99005.dq1
    /* renamed from: c */
    public boolean a(@x1 ByteBuffer byteBuffer, @x1 File file, @x1 jq1 jq1Var) {
        try {
            l02.f(byteBuffer, file);
            return true;
        } catch (IOException unused) {
            Log.isLoggable(a, 3);
            return false;
        }
    }
}