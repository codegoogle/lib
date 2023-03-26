package com.p7700g.p99005;

import android.view.View;
import com.google.android.gms.ads.nativead.MediaView;
import com.p7700g.p99005.hd3;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class id3 extends hd3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public id3(@NotNull hd3.a aVar) {
        super(aVar);
        c25.p(aVar, "builder");
    }

    @Override // com.p7700g.p99005.hd3
    @NotNull
    public View o() {
        return new MediaView(c());
    }
}