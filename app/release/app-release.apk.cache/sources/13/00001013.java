package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.UUID;

/* loaded from: assets/audience_network.dex */
public interface CF {
    byte[] executeKeyRequest(UUID uuid, C6 c6, @Nullable String str) throws Exception;

    byte[] executeProvisionRequest(UUID uuid, CA ca) throws Exception;
}