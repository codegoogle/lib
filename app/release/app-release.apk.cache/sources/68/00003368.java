package com.iab.omid.library.ironsrc.adsession;

import com.iab.omid.library.ironsrc.adsession.media.VastProperties;
import com.iab.omid.library.ironsrc.d.e;
import com.p7700g.p99005.x1;

/* loaded from: classes3.dex */
public final class AdEvents {
    private final a adSession;

    private AdEvents(a aVar) {
        this.adSession = aVar;
    }

    public static AdEvents createAdEvents(AdSession adSession) {
        a aVar = (a) adSession;
        e.a(adSession, "AdSession is null");
        e.d(aVar);
        e.b(aVar);
        AdEvents adEvents = new AdEvents(aVar);
        aVar.getAdSessionStatePublisher().a(adEvents);
        return adEvents;
    }

    public final void impressionOccurred() {
        e.b(this.adSession);
        e.f(this.adSession);
        if (!this.adSession.e()) {
            try {
                this.adSession.start();
            } catch (Exception unused) {
            }
        }
        if (this.adSession.e()) {
            this.adSession.b();
        }
    }

    public final void loaded() {
        e.c(this.adSession);
        e.f(this.adSession);
        this.adSession.c();
    }

    public final void loaded(@x1 VastProperties vastProperties) {
        e.a(vastProperties, "VastProperties is null");
        e.c(this.adSession);
        e.f(this.adSession);
        this.adSession.a(vastProperties.a());
    }
}