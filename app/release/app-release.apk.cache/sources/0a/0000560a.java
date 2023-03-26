package com.p7700g.p99005;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.AbstractC1270b;
import com.ironsource.mediationsdk.L;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public abstract class pe3 {
    public int h;
    public AbstractC1270b j;
    public AbstractC1270b k;
    public String l;
    public String m;
    public Boolean p;
    public boolean q;
    private String a = "reason";
    private String b = "status";
    private String c = "placement";
    private String d = IronSourceConstants.EVENTS_REWARD_NAME;
    private String e = IronSourceConstants.EVENTS_REWARD_AMOUNT;
    private String f = "providerPriority";
    public boolean o = false;
    public boolean r = true;
    public final CopyOnWriteArrayList<AbstractC1270b> i = new CopyOnWriteArrayList<>();
    public IronSourceLoggerManager n = IronSourceLoggerManager.getLogger();
    public com.ironsource.mediationsdk.utils.e g = null;

    public abstract void a(Context context, boolean z);

    public final void b(AbstractC1270b abstractC1270b) {
        this.i.add(abstractC1270b);
        com.ironsource.mediationsdk.utils.e eVar = this.g;
        if (eVar != null) {
            synchronized (eVar) {
                try {
                    if (abstractC1270b.m != 99) {
                        eVar.a.put(eVar.d(abstractC1270b), Integer.valueOf(abstractC1270b.m));
                    }
                } catch (Exception e) {
                    eVar.c.logException(IronSourceLogger.IronSourceTag.INTERNAL, "addSmash", e);
                }
            }
        }
    }

    public final synchronized boolean h() {
        return this.r;
    }

    public synchronized void i() {
        this.r = false;
    }

    public final void j(AbstractC1270b abstractC1270b) {
        try {
            String str = L.a().v;
            if (!TextUtils.isEmpty(str) && abstractC1270b.b != null) {
                IronSourceLoggerManager ironSourceLoggerManager = abstractC1270b.s;
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_API;
                ironSourceLoggerManager.log(ironSourceTag, abstractC1270b.j() + ":setMediationSegment(segment:" + str + ")", 1);
                abstractC1270b.b.setMediationSegment(str);
            }
            String pluginType = ConfigFile.getConfigFile().getPluginType();
            if (TextUtils.isEmpty(pluginType)) {
                return;
            }
            String pluginFrameworkVersion = ConfigFile.getConfigFile().getPluginFrameworkVersion();
            AbstractAdapter abstractAdapter = abstractC1270b.b;
            if (abstractAdapter != null) {
                abstractAdapter.setPluginData(pluginType, pluginFrameworkVersion);
            }
        } catch (Exception e) {
            IronSourceLoggerManager ironSourceLoggerManager2 = this.n;
            IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager2.log(ironSourceTag2, ":setCustomParams():" + e.toString(), 3);
        }
    }
}