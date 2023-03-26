package com.ironsource.mediationsdk.utils;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AbstractC1270b;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.p7700g.p99005.md2;
import com.p7700g.p99005.wo1;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.TimeZone;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes3.dex */
public final class e {
    private String e;
    public d g;
    private Timer f = null;
    public Map<String, Integer> a = new HashMap();
    private Map<String, Integer> b = new HashMap();
    private Map<String, String> d = new HashMap();
    public IronSourceLoggerManager c = IronSourceLoggerManager.getLogger();

    /* loaded from: classes3.dex */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            e eVar = e.this;
            synchronized (eVar) {
                try {
                    for (String str : eVar.a.keySet()) {
                        eVar.b(str);
                    }
                    eVar.g.g();
                    eVar.a();
                } catch (Exception e) {
                    eVar.c.logException(IronSourceLogger.IronSourceTag.INTERNAL, "onTimerTick", e);
                }
            }
        }
    }

    public e(String str, d dVar) {
        this.e = str;
        this.g = dVar;
        a();
    }

    private void c(String str, int i) {
        this.b.put(str, Integer.valueOf(i));
        this.d.put(str, f());
        IronSourceUtils.n(ContextProvider.getInstance().getApplicationContext(), i(str), i);
        IronSourceUtils.p(ContextProvider.getInstance().getApplicationContext(), j(str), f());
    }

    private int d(String str) {
        if (!f().equalsIgnoreCase(g(str))) {
            b(str);
        }
        return h(str);
    }

    private static Date e() {
        Random random = new Random();
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone(md2.a), Locale.US);
        gregorianCalendar.set(11, 0);
        gregorianCalendar.set(12, random.nextInt(10));
        gregorianCalendar.set(13, random.nextInt(60));
        gregorianCalendar.set(14, random.nextInt(1000));
        gregorianCalendar.add(5, 1);
        return gregorianCalendar.getTime();
    }

    private static String f() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(md2.a));
        return simpleDateFormat.format(new Date());
    }

    private String g(String str) {
        if (this.d.containsKey(str)) {
            return this.d.get(str);
        }
        String k = IronSourceUtils.k(ContextProvider.getInstance().getApplicationContext(), j(str), f());
        this.d.put(str, k);
        return k;
    }

    private int h(String str) {
        if (this.b.containsKey(str)) {
            return this.b.get(str).intValue();
        }
        int i = IronSourceUtils.i(ContextProvider.getInstance().getApplicationContext(), i(str), 0);
        this.b.put(str, Integer.valueOf(i));
        return i;
    }

    private static String i(String str) {
        return wo1.t(str, "_counter");
    }

    private static String j(String str) {
        return wo1.t(str, "_day");
    }

    public void a() {
        Timer timer = this.f;
        if (timer != null) {
            timer.cancel();
        }
        Timer timer2 = new Timer();
        this.f = timer2;
        timer2.schedule(new a(), e());
    }

    public final void a(AbstractC1270b abstractC1270b) {
        String d;
        synchronized (this) {
            try {
                d = d(abstractC1270b);
            } catch (Exception e) {
                this.c.logException(IronSourceLogger.IronSourceTag.INTERNAL, "increaseShowCounter", e);
            }
            if (this.a.containsKey(d)) {
                c(d, d(d) + 1);
            }
        }
    }

    public void b(String str) {
        this.b.put(str, 0);
        this.d.put(str, f());
        IronSourceUtils.n(ContextProvider.getInstance().getApplicationContext(), i(str), 0);
        IronSourceUtils.p(ContextProvider.getInstance().getApplicationContext(), j(str), f());
    }

    public final boolean b(AbstractC1270b abstractC1270b) {
        synchronized (this) {
            try {
                try {
                    String d = d(abstractC1270b);
                    if (this.a.containsKey(d)) {
                        if (f().equalsIgnoreCase(g(d))) {
                            return false;
                        }
                        return this.a.get(d).intValue() <= h(d);
                    }
                    return false;
                } catch (Exception e) {
                    this.c.logException(IronSourceLogger.IronSourceTag.INTERNAL, "shouldSendCapReleasedEvent", e);
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c(AbstractC1270b abstractC1270b) {
        synchronized (this) {
            try {
                try {
                    String d = d(abstractC1270b);
                    if (this.a.containsKey(d)) {
                        return this.a.get(d).intValue() <= d(d);
                    }
                    return false;
                } catch (Exception e) {
                    this.c.logException(IronSourceLogger.IronSourceTag.INTERNAL, "isCapped", e);
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String d(AbstractC1270b abstractC1270b) {
        return this.e + "_" + abstractC1270b.f + "_" + abstractC1270b.j();
    }
}