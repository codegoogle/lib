package com.p7700g.p99005;

import java.io.Serializable;
import java.math.BigInteger;

/* compiled from: AddressItem.java */
/* loaded from: classes3.dex */
public interface l24 extends Comparable<l24>, Serializable {
    int A0();

    byte[] A3();

    boolean B3(int i);

    BigInteger C1();

    byte[] C2(byte[] bArr, int i);

    boolean H0();

    boolean P3();

    boolean V1();

    Integer X3();

    boolean Y2(int i);

    int b3();

    @Override // java.lang.Comparable
    /* bridge */ /* synthetic */ int compareTo(l24 l24Var);

    int g3();

    BigInteger getCount();

    BigInteger getValue();

    BigInteger h1(int i);

    byte[] l1(byte[] bArr);

    byte[] m1();

    int m4(l24 l24Var);

    byte[] t4(byte[] bArr);

    boolean v1();

    byte[] v3(byte[] bArr, int i);

    boolean x1();

    boolean z3();
}