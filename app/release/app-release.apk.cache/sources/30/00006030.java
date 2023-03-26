package com.p7700g.p99005;

import com.p7700g.p99005.jm3;
import java.util.Timer;
import java.util.TimerTask;

/* compiled from: OSDynamicTriggerTimer.java */
/* loaded from: classes3.dex */
public class uj3 {
    public static void a(TimerTask timerTask, String str, long j) {
        jm3.u0 u0Var = jm3.u0.DEBUG;
        jm3.P1(u0Var, "scheduleTrigger: " + str + " delay: " + j);
        new Timer(wo1.t("trigger_timer:", str)).schedule(timerTask, j);
    }
}