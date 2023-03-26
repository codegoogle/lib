package com.facebook.ads.redexgen.X;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import com.p7700g.p99005.pg;

/* renamed from: com.facebook.ads.redexgen.X.En  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0633En {
    public final HJ A00;
    public final HL A01;
    public final HL A02;
    public final InterfaceC0705Hl A03;
    public final IU A04;

    public C0633En(InterfaceC0705Hl interfaceC0705Hl, HL hl) {
        this(interfaceC0705Hl, hl, null, null, null);
    }

    public C0633En(InterfaceC0705Hl interfaceC0705Hl, HL hl, @Nullable HL hl2, @Nullable HJ hj, @Nullable IU iu) {
        I1.A01(hl);
        this.A03 = interfaceC0705Hl;
        this.A02 = hl;
        this.A01 = hl2;
        this.A00 = hj;
        this.A04 = iu;
    }

    public final InterfaceC0705Hl A00() {
        return this.A03;
    }

    public final C1231aw A01(boolean z) {
        HM cacheReadDataSource;
        HK c1229au;
        HL hl = this.A01;
        if (hl != null) {
            cacheReadDataSource = hl.A4D();
        } else {
            cacheReadDataSource = new C1213ae();
        }
        if (z) {
            return new C1231aw(this.A03, C1212ad.A02, cacheReadDataSource, null, 1, null);
        }
        HJ hj = this.A00;
        if (hj != null) {
            c1229au = hj.createDataSink();
        } else {
            c1229au = new C1229au(this.A03, PlaybackStateCompat.N);
        }
        HM A4D = this.A02.A4D();
        IU iu = this.A04;
        if (iu != null) {
            A4D = new C1223ao(A4D, iu, pg.o);
        }
        return new C1231aw(this.A03, A4D, cacheReadDataSource, c1229au, 1, null);
    }

    public final IU A02() {
        IU iu = this.A04;
        return iu != null ? iu : new IU();
    }
}