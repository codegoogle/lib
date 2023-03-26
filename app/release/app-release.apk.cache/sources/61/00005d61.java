package com.p7700g.p99005;

import android.view.View;
import com.facebook.ads.MediaView;
import com.greedygame.mystique2.models.FacebookAdViewTypes;
import com.p7700g.p99005.hd3;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class t33 extends hd3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t33(@NotNull hd3.a aVar) {
        super(aVar);
        c25.p(aVar, "builder");
    }

    @Override // com.p7700g.p99005.hd3
    @NotNull
    public View o() {
        MediaView mediaView = new MediaView(c());
        mediaView.setTag(FacebookAdViewTypes.MEDIA_VIEW.getString());
        return mediaView;
    }
}