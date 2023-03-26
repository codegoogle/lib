package com.p7700g.p99005;

/* compiled from: DesignTool.java */
/* loaded from: classes.dex */
public interface ke {
    long a();

    int b(int cmd, String type, Object viewObject, float[] in, int inLength, float[] out, int outLength);

    boolean c(Object view, int position, int type, float x, float y);

    void d(float position);

    Boolean e(Object keyFrame, Object view, float x, float y, String[] attribute, float[] value);

    void f(Object view, int position, String name, Object value);

    void g(int dpi, String constraintSetId, Object opaqueView, Object opaqueAttributes);

    float h(Object view, int type, float x, float y);

    Object i(Object viewObject, float x, float y);
}