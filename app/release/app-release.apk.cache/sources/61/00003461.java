package com.ironsource.mediationsdk.a;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.p7700g.p99005.vo4;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@vo4(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\b\u0010\n\u001a\u00020\u000bH\u0014J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0014J\u0018\u0010\u000f\u001a\u00020\u000b2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0011H\u0014J\u0012\u0010\u0012\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\u0012\u0010\u0013\u001a\u00020\r2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\u0012\u0010\u0014\u001a\u00020\r2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\u0012\u0010\u0015\u001a\u00020\r2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\u0012\u0010\u0016\u001a\u00020\r2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014¨\u0006\u0017"}, d2 = {"Lcom/ironsource/mediationsdk/events/PixelEventsManager;", "Lcom/ironsource/mediationsdk/events/BaseEventsManager;", "()V", "getCurrentPlacement", "", "eventId", "", "getSessionDepth", "event", "Lcom/ironsource/eventsmodule/EventData;", "initConnectivitySensitiveEventsSet", "", "isTriggerEvent", "", "currentEvent", "saveCombinedEventListInCaseOfError", "combinedEventList", "Ljava/util/ArrayList;", "setCurrentPlacement", "shouldAddConnectionType", "shouldAddSessionDepth", "shouldExtractCurrentPlacement", "shouldIncludeCurrentPlacement", "mediationsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g extends b {
    @NotNull
    public static final g w;

    static {
        g gVar = new g();
        w = gVar;
        gVar.I = "outcome";
        gVar.H = 0;
        gVar.J = IronSourceConstants.PIXEL_EVENT_TYPE;
        gVar.e();
    }

    private g() {
    }

    @Override // com.ironsource.mediationsdk.a.b
    public final void i(@Nullable ArrayList<c> arrayList) {
    }

    @Override // com.ironsource.mediationsdk.a.b
    public final void n() {
    }

    @Override // com.ironsource.mediationsdk.a.b
    public final boolean p(@Nullable c cVar) {
        return false;
    }

    @Override // com.ironsource.mediationsdk.a.b
    @NotNull
    public final String q(int i) {
        return "";
    }

    @Override // com.ironsource.mediationsdk.a.b
    public final boolean s(@Nullable c cVar) {
        return true;
    }

    @Override // com.ironsource.mediationsdk.a.b
    public final int u(@Nullable c cVar) {
        return 1;
    }

    @Override // com.ironsource.mediationsdk.a.b
    public final boolean v(@Nullable c cVar) {
        return false;
    }

    @Override // com.ironsource.mediationsdk.a.b
    public final boolean w(@Nullable c cVar) {
        return false;
    }
}