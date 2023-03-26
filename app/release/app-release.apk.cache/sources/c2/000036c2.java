package com.microsoft.appcenter;

import com.microsoft.appcenter.utils.AppCenterLog;
import com.microsoft.appcenter.utils.InstrumentationRegistryHelper;
import com.p7700g.p99005.r2;

/* loaded from: classes3.dex */
public class ServiceInstrumentationUtils {
    @r2
    public static final String DISABLE_ALL_SERVICES = "All";
    @r2
    public static final String DISABLE_SERVICES = "APP_CENTER_DISABLE";

    public static boolean isServiceDisabledByInstrumentation(String str) {
        try {
            String string = InstrumentationRegistryHelper.getArguments().getString(DISABLE_SERVICES);
            if (string == null) {
                return false;
            }
            for (String str2 : string.split(",")) {
                String trim = str2.trim();
                if (trim.equals(DISABLE_ALL_SERVICES) || trim.equals(str)) {
                    return true;
                }
            }
            return false;
        } catch (IllegalStateException | LinkageError unused) {
            AppCenterLog.debug("AppCenter", "Cannot read instrumentation variables in a non-test environment.");
            return false;
        }
    }
}