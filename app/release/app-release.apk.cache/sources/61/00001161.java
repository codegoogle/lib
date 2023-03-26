package com.facebook.ads.redexgen.X;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.util.NavigableSet;

/* renamed from: com.facebook.ads.redexgen.X.Hl  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public interface InterfaceC0705Hl {
    void A3Q(String str, C0717Hx c0717Hx) throws C0703Hj;

    void A44(File file) throws C0703Hj;

    long A5Z();

    long A5a(String str, long j, long j2);

    @NonNull
    NavigableSet<C0709Hp> A5b(String str);

    long A5m(String str);

    InterfaceC0715Hv A5n(String str);

    void ACH(C0709Hp c0709Hp);

    void ACO(C0709Hp c0709Hp) throws C0703Hj;

    void ACu(String str, long j) throws C0703Hj;

    File ADJ(String str, long j, long j2) throws C0703Hj;

    C0709Hp ADL(String str, long j) throws InterruptedException, C0703Hj;

    @Nullable
    C0709Hp ADM(String str, long j) throws C0703Hj;
}