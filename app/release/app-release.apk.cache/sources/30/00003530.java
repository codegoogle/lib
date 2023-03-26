package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.a;
import java.util.HashSet;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class s {
    private HashSet<ImpressionDataListener> a;
    public a b = new a();
    public IronSourceSegment c;
    public AdInfo d;

    public s(HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) {
        this.a = new HashSet<>();
        this.a = hashSet;
        this.c = ironSourceSegment;
    }

    public static String d() {
        return "fallback_" + System.currentTimeMillis();
    }

    public final void a(IronSource.AD_UNIT ad_unit) {
        this.b.a(ad_unit, false);
    }

    public final void a(IronSourceSegment ironSourceSegment) {
        this.c = ironSourceSegment;
    }

    public final void a(ImpressionData impressionData) {
        if (impressionData != null) {
            this.d = new AdInfo(impressionData);
        }
    }

    public final void a(@NotNull ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.a.add(impressionDataListener);
        }
    }

    public final void a_() {
        this.d = null;
    }

    public final void b() {
        synchronized (this) {
            this.a.clear();
        }
    }

    public final void b(@NotNull ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.a.remove(impressionDataListener);
        }
    }

    public final void b(com.ironsource.mediationsdk.server.b bVar, String str) {
        if (bVar == null) {
            IronLog.INTERNAL.verbose("no auctionResponseItem or listener");
            return;
        }
        ImpressionData a = bVar.a(str);
        if (a != null) {
            Iterator<ImpressionDataListener> it = this.a.iterator();
            while (it.hasNext()) {
                ImpressionDataListener next = it.next();
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onImpressionSuccess " + next.getClass().getSimpleName() + ": " + a);
                next.onImpressionSuccess(a);
            }
        }
    }

    public final void c(JSONObject jSONObject, IronSource.AD_UNIT ad_unit) {
        this.b.a(ad_unit, jSONObject != null ? jSONObject.optBoolean("isAdUnitCapped", false) : false);
    }
}