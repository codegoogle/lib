package com.p7700g.p99005;

import java.io.IOException;

/* compiled from: ObjectEncoderContext.java */
/* loaded from: classes3.dex */
public interface vp2 {
    @x1
    vp2 add(@x1 tp2 tp2Var, double d) throws IOException;

    @x1
    vp2 add(@x1 tp2 tp2Var, float f) throws IOException;

    @x1
    vp2 add(@x1 tp2 tp2Var, int i) throws IOException;

    @x1
    vp2 add(@x1 tp2 tp2Var, long j) throws IOException;

    @x1
    vp2 add(@x1 tp2 tp2Var, @z1 Object obj) throws IOException;

    @x1
    vp2 add(@x1 tp2 tp2Var, boolean z) throws IOException;

    @x1
    @Deprecated
    vp2 add(@x1 String str, double d) throws IOException;

    @x1
    @Deprecated
    vp2 add(@x1 String str, int i) throws IOException;

    @x1
    @Deprecated
    vp2 add(@x1 String str, long j) throws IOException;

    @x1
    @Deprecated
    vp2 add(@x1 String str, @z1 Object obj) throws IOException;

    @x1
    @Deprecated
    vp2 add(@x1 String str, boolean z) throws IOException;

    @x1
    vp2 inline(@z1 Object obj) throws IOException;

    @x1
    vp2 nested(@x1 tp2 tp2Var) throws IOException;

    @x1
    vp2 nested(@x1 String str) throws IOException;
}