package com.microsoft.appcenter;

import com.microsoft.appcenter.utils.AppCenterLog;
import com.p7700g.p99005.r2;
import com.p7700g.p99005.wo1;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class CustomProperties {
    private static final Pattern KEY_PATTERN = Pattern.compile("^[a-zA-Z][a-zA-Z0-9]*$");
    @r2
    public static final int MAX_PROPERTIES_COUNT = 60;
    @r2
    public static final int MAX_PROPERTY_KEY_LENGTH = 128;
    private static final int MAX_PROPERTY_VALUE_LENGTH = 128;
    private static final String VALUE_NULL_ERROR_MESSAGE = "Custom property value cannot be null, did you mean to call clear?";
    private final Map<String, Object> mProperties = new HashMap();

    private void addProperty(String str, Object obj) {
        if (!this.mProperties.containsKey(str) && this.mProperties.size() >= 60) {
            AppCenterLog.error("AppCenter", "Custom properties cannot contain more than 60 items");
        } else {
            this.mProperties.put(str, obj);
        }
    }

    private boolean isValidKey(String str) {
        if (str != null && KEY_PATTERN.matcher(str).matches()) {
            if (str.length() > 128) {
                AppCenterLog.error("AppCenter", "Custom property \"" + str + "\" length cannot be longer than 128 characters.");
                return false;
            } else if (this.mProperties.containsKey(str)) {
                AppCenterLog.warn("AppCenter", "Custom property \"" + str + "\" is already set or cleared and will be overridden.");
                return true;
            } else {
                return true;
            }
        }
        StringBuilder M = wo1.M("Custom property \"", str, "\" must match \"");
        M.append(KEY_PATTERN);
        M.append("\"");
        AppCenterLog.error("AppCenter", M.toString());
        return false;
    }

    private boolean isValidNumberValue(String str, Number number) {
        if (number == null) {
            AppCenterLog.error("AppCenter", VALUE_NULL_ERROR_MESSAGE);
            return false;
        }
        double doubleValue = number.doubleValue();
        if (Double.isInfinite(doubleValue) || Double.isNaN(doubleValue)) {
            AppCenterLog.error("AppCenter", "Custom property \"" + str + "\" value cannot be NaN or infinite.");
            return false;
        }
        return true;
    }

    private boolean isValidStringValue(String str, String str2) {
        if (str2 == null) {
            AppCenterLog.error("AppCenter", VALUE_NULL_ERROR_MESSAGE);
            return false;
        } else if (str2.length() > 128) {
            AppCenterLog.error("AppCenter", "Custom property \"" + str + "\" value length cannot be longer than 128 characters.");
            return false;
        } else {
            return true;
        }
    }

    public synchronized CustomProperties clear(String str) {
        if (isValidKey(str)) {
            addProperty(str, null);
        }
        return this;
    }

    public synchronized Map<String, Object> getProperties() {
        return new HashMap(this.mProperties);
    }

    public synchronized CustomProperties set(String str, String str2) {
        if (isValidKey(str) && isValidStringValue(str, str2)) {
            addProperty(str, str2);
        }
        return this;
    }

    public synchronized CustomProperties set(String str, Date date) {
        if (isValidKey(str)) {
            if (date != null) {
                addProperty(str, date);
            } else {
                AppCenterLog.error("AppCenter", VALUE_NULL_ERROR_MESSAGE);
            }
        }
        return this;
    }

    public synchronized CustomProperties set(String str, Number number) {
        if (isValidKey(str) && isValidNumberValue(str, number)) {
            addProperty(str, number);
        }
        return this;
    }

    public synchronized CustomProperties set(String str, boolean z) {
        if (isValidKey(str)) {
            addProperty(str, Boolean.valueOf(z));
        }
        return this;
    }
}