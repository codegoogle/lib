package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public interface HM {
    @Nullable
    Uri A7C();

    long ABP(HQ hq) throws IOException;

    void close() throws IOException;

    int read(byte[] bArr, int i, int i2) throws IOException;
}