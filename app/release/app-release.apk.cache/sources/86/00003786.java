package com.microsoft.appcenter.utils;

import com.microsoft.appcenter.utils.storage.SharedPreferencesManager;
import com.p7700g.p99005.x1;
import java.util.UUID;

/* loaded from: classes3.dex */
public class IdHelper {
    @x1
    public static UUID getInstallId() {
        try {
            return UUID.fromString(SharedPreferencesManager.getString(PrefStorageConstants.KEY_INSTALL_ID, ""));
        } catch (Exception unused) {
            AppCenterLog.warn("AppCenter", "Unable to get installID from Shared Preferences");
            UUID randomUUID = UUID.randomUUID();
            SharedPreferencesManager.putString(PrefStorageConstants.KEY_INSTALL_ID, randomUUID.toString());
            return randomUUID;
        }
    }
}