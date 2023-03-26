package com.microsoft.appcenter.utils.context;

import android.text.TextUtils;
import com.microsoft.appcenter.utils.AppCenterLog;
import com.p7700g.p99005.r2;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class UserIdContext {
    private static final String CUSTOM_PREFIX = "c";
    @r2
    public static final int USER_ID_APP_CENTER_MAX_LENGTH = 256;
    private static UserIdContext sInstance;
    private final Set<Listener> mListeners = Collections.newSetFromMap(new ConcurrentHashMap());
    private String mUserId;

    /* loaded from: classes3.dex */
    public interface Listener {
        void onNewUserId(String str);
    }

    public static boolean checkUserIdValidForAppCenter(String str) {
        if (str == null || str.length() <= 256) {
            return true;
        }
        AppCenterLog.error("AppCenter", "userId is limited to 256 characters.");
        return false;
    }

    public static boolean checkUserIdValidForOneCollector(String str) {
        if (str == null) {
            return true;
        }
        if (str.isEmpty()) {
            AppCenterLog.error("AppCenter", "userId must not be empty.");
            return false;
        }
        int indexOf = str.indexOf(":");
        if (indexOf >= 0) {
            String substring = str.substring(0, indexOf);
            if (!substring.equals("c")) {
                AppCenterLog.error("AppCenter", String.format("userId prefix must be '%s%s', '%s%s' is not supported.", "c", ":", substring, ":"));
                return false;
            } else if (indexOf == str.length() - 1) {
                AppCenterLog.error("AppCenter", "userId must not be empty.");
                return false;
            }
        }
        return true;
    }

    public static synchronized UserIdContext getInstance() {
        UserIdContext userIdContext;
        synchronized (UserIdContext.class) {
            if (sInstance == null) {
                sInstance = new UserIdContext();
            }
            userIdContext = sInstance;
        }
        return userIdContext;
    }

    public static String getPrefixedUserId(String str) {
        return (str == null || str.contains(":")) ? str : wo1.t("c:", str);
    }

    @r2
    public static synchronized void unsetInstance() {
        synchronized (UserIdContext.class) {
            sInstance = null;
        }
    }

    private synchronized boolean updateUserId(String str) {
        if (TextUtils.equals(this.mUserId, str)) {
            return false;
        }
        this.mUserId = str;
        return true;
    }

    public void addListener(@x1 Listener listener) {
        this.mListeners.add(listener);
    }

    public synchronized String getUserId() {
        return this.mUserId;
    }

    public void removeListener(@x1 Listener listener) {
        this.mListeners.remove(listener);
    }

    public void setUserId(String str) {
        if (updateUserId(str)) {
            for (Listener listener : this.mListeners) {
                listener.onNewUserId(this.mUserId);
            }
        }
    }
}