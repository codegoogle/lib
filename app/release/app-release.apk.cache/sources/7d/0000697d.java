package com.p7700g.p99005;

import java.util.Arrays;
import java.util.HashSet;

/* compiled from: OSTaskRemoteController.java */
/* loaded from: classes3.dex */
public class zl3 extends yl3 {
    public static final String A = "pauseInAppMessages()";
    public static final String B = "setInAppMessageLifecycleHandler()";
    private final nl3 H;
    public static final String f = "getTags()";
    public static final String g = "setSMSNumber()";
    public static final String h = "setEmail()";
    public static final String i = "logoutSMSNumber()";
    public static final String j = "logoutEmail()";
    public static final String k = "syncHashedEmail()";
    public static final String l = "setExternalUserId()";
    public static final String m = "setLanguage()";
    public static final String n = "setSubscription()";
    public static final String o = "promptLocation()";
    public static final String p = "idsAvailable()";
    public static final String q = "sendTag()";
    public static final String r = "sendTags()";
    public static final String s = "setLocationShared()";
    public static final String t = "setDisableGMSMissingPrompt()";
    public static final String u = "setRequiresUserPrivacyConsent()";
    public static final String v = "unsubscribeWhenNotificationsAreDisabled()";
    public static final String w = "handleNotificationOpen()";
    public static final String C = "onAppLostFocus()";
    public static final String D = "sendOutcome()";
    public static final String E = "sendUniqueOutcome()";
    public static final String F = "sendOutcomeWithValue()";
    public static final String y = "removeGroupedNotifications()";
    public static final String z = "removeNotification()";
    public static final String x = "clearOneSignalNotifications()";
    public static final HashSet<String> G = new HashSet<>(Arrays.asList(f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, C, D, E, F, y, z, x));

    public zl3(nl3 nl3Var, tk3 tk3Var) {
        super(tk3Var);
        this.H = nl3Var;
    }

    public boolean i(String str) {
        return !this.H.n() && G.contains(str);
    }
}