package com.ironsource.mediationsdk.logger;

import com.ironsource.mediationsdk.logger.IronSourceLogger;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class IronSourceLoggerManager extends IronSourceLogger implements LogListener {
    private static IronSourceLoggerManager d;
    private ArrayList<IronSourceLogger> e;

    private IronSourceLoggerManager(String str) {
        super(str);
        ArrayList<IronSourceLogger> arrayList = new ArrayList<>();
        this.e = arrayList;
        arrayList.add(new a(0));
    }

    public static synchronized IronSourceLoggerManager getLogger() {
        IronSourceLoggerManager ironSourceLoggerManager;
        synchronized (IronSourceLoggerManager.class) {
            if (d == null) {
                d = new IronSourceLoggerManager(IronSourceLoggerManager.class.getSimpleName());
            }
            ironSourceLoggerManager = d;
        }
        return ironSourceLoggerManager;
    }

    public static synchronized IronSourceLoggerManager getLogger(int i) {
        IronSourceLoggerManager ironSourceLoggerManager;
        synchronized (IronSourceLoggerManager.class) {
            IronSourceLoggerManager ironSourceLoggerManager2 = d;
            if (ironSourceLoggerManager2 == null) {
                d = new IronSourceLoggerManager(IronSourceLoggerManager.class.getSimpleName());
            } else {
                ironSourceLoggerManager2.a = i;
            }
            ironSourceLoggerManager = d;
        }
        return ironSourceLoggerManager;
    }

    public void addLogger(IronSourceLogger ironSourceLogger) {
        this.e.add(ironSourceLogger);
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public synchronized void log(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i) {
        if (i < this.a) {
            return;
        }
        Iterator<IronSourceLogger> it = this.e.iterator();
        while (it.hasNext()) {
            IronSourceLogger next = it.next();
            if (next.a <= i) {
                next.log(ironSourceTag, str, i);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public synchronized void logException(IronSourceLogger.IronSourceTag ironSourceTag, String str, Throwable th) {
        if (th == null) {
            Iterator<IronSourceLogger> it = this.e.iterator();
            while (it.hasNext()) {
                it.next().log(ironSourceTag, str, 3);
            }
            return;
        }
        Iterator<IronSourceLogger> it2 = this.e.iterator();
        while (it2.hasNext()) {
            it2.next().logException(ironSourceTag, str, th);
        }
    }

    @Override // com.ironsource.mediationsdk.logger.LogListener
    public synchronized void onLog(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i) {
        log(ironSourceTag, str, i);
    }

    public void setLoggerDebugLevel(String str, int i) {
        if (str == null) {
            return;
        }
        IronSourceLogger ironSourceLogger = null;
        Iterator<IronSourceLogger> it = this.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            IronSourceLogger next = it.next();
            if (next.b.equals(str)) {
                ironSourceLogger = next;
                break;
            }
        }
        if (ironSourceLogger == null) {
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            log(ironSourceTag, "Failed to find logger:setLoggerDebugLevel(loggerName:" + str + " ,debugLevel:" + i + ")", 0);
        } else if (i < 0 || i > 3) {
            this.e.remove(ironSourceLogger);
        } else {
            IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.NATIVE;
            log(ironSourceTag2, "setLoggerDebugLevel(loggerName:" + str + " ,debugLevel:" + i + ")", 0);
            ironSourceLogger.setDebugLevel(i);
        }
    }
}