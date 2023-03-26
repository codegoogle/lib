package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.metadata.emsg.EventMessage;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class ZN implements InterfaceC0618Dy {
    @Override // com.facebook.ads.redexgen.X.InterfaceC0618Dy
    public final Metadata A4e(CC cc) {
        ByteBuffer buffer = cc.A01;
        byte[] array = buffer.array();
        int size = buffer.limit();
        IQ iq = new IQ(array, size);
        String A0R = iq.A0R();
        String A0R2 = iq.A0R();
        long A0N = iq.A0N();
        long timescale = C0726Ig.A0F(iq.A0N(), 1000000L, A0N);
        long presentationTimeUs = iq.A0N();
        long id = C0726Ig.A0F(presentationTimeUs, 1000L, A0N);
        return new Metadata(new EventMessage(A0R, A0R2, id, iq.A0N(), Arrays.copyOfRange(array, iq.A07(), size), timescale));
    }
}