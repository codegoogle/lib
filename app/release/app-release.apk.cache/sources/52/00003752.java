package com.microsoft.appcenter.ingestion.models;

import com.microsoft.appcenter.ingestion.models.json.JSONUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;

/* loaded from: classes3.dex */
public class Device extends WrapperSdk {
    private static final String APP_BUILD = "appBuild";
    private static final String APP_NAMESPACE = "appNamespace";
    private static final String APP_VERSION = "appVersion";
    private static final String CARRIER_COUNTRY = "carrierCountry";
    private static final String CARRIER_NAME = "carrierName";
    private static final String LOCALE = "locale";
    private static final String MODEL = "model";
    private static final String OEM_NAME = "oemName";
    private static final String OS_API_LEVEL = "osApiLevel";
    private static final String OS_BUILD = "osBuild";
    private static final String OS_NAME = "osName";
    private static final String OS_VERSION = "osVersion";
    private static final String SCREEN_SIZE = "screenSize";
    private static final String SDK_NAME = "sdkName";
    private static final String SDK_VERSION = "sdkVersion";
    private static final String TIME_ZONE_OFFSET = "timeZoneOffset";
    private String appBuild;
    private String appNamespace;
    private String appVersion;
    private String carrierCountry;
    private String carrierName;
    private String locale;
    private String model;
    private String oemName;
    private Integer osApiLevel;
    private String osBuild;
    private String osName;
    private String osVersion;
    private String screenSize;
    private String sdkName;
    private String sdkVersion;
    private Integer timeZoneOffset;

    @Override // com.microsoft.appcenter.ingestion.models.WrapperSdk
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && super.equals(obj)) {
            Device device = (Device) obj;
            String str = this.sdkName;
            if (str == null ? device.sdkName == null : str.equals(device.sdkName)) {
                String str2 = this.sdkVersion;
                if (str2 == null ? device.sdkVersion == null : str2.equals(device.sdkVersion)) {
                    String str3 = this.model;
                    if (str3 == null ? device.model == null : str3.equals(device.model)) {
                        String str4 = this.oemName;
                        if (str4 == null ? device.oemName == null : str4.equals(device.oemName)) {
                            String str5 = this.osName;
                            if (str5 == null ? device.osName == null : str5.equals(device.osName)) {
                                String str6 = this.osVersion;
                                if (str6 == null ? device.osVersion == null : str6.equals(device.osVersion)) {
                                    String str7 = this.osBuild;
                                    if (str7 == null ? device.osBuild == null : str7.equals(device.osBuild)) {
                                        Integer num = this.osApiLevel;
                                        if (num == null ? device.osApiLevel == null : num.equals(device.osApiLevel)) {
                                            String str8 = this.locale;
                                            if (str8 == null ? device.locale == null : str8.equals(device.locale)) {
                                                Integer num2 = this.timeZoneOffset;
                                                if (num2 == null ? device.timeZoneOffset == null : num2.equals(device.timeZoneOffset)) {
                                                    String str9 = this.screenSize;
                                                    if (str9 == null ? device.screenSize == null : str9.equals(device.screenSize)) {
                                                        String str10 = this.appVersion;
                                                        if (str10 == null ? device.appVersion == null : str10.equals(device.appVersion)) {
                                                            String str11 = this.carrierName;
                                                            if (str11 == null ? device.carrierName == null : str11.equals(device.carrierName)) {
                                                                String str12 = this.carrierCountry;
                                                                if (str12 == null ? device.carrierCountry == null : str12.equals(device.carrierCountry)) {
                                                                    String str13 = this.appBuild;
                                                                    if (str13 == null ? device.appBuild == null : str13.equals(device.appBuild)) {
                                                                        String str14 = this.appNamespace;
                                                                        String str15 = device.appNamespace;
                                                                        return str14 != null ? str14.equals(str15) : str15 == null;
                                                                    }
                                                                    return false;
                                                                }
                                                                return false;
                                                            }
                                                            return false;
                                                        }
                                                        return false;
                                                    }
                                                    return false;
                                                }
                                                return false;
                                            }
                                            return false;
                                        }
                                        return false;
                                    }
                                    return false;
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public String getAppBuild() {
        return this.appBuild;
    }

    public String getAppNamespace() {
        return this.appNamespace;
    }

    public String getAppVersion() {
        return this.appVersion;
    }

    public String getCarrierCountry() {
        return this.carrierCountry;
    }

    public String getCarrierName() {
        return this.carrierName;
    }

    public String getLocale() {
        return this.locale;
    }

    public String getModel() {
        return this.model;
    }

    public String getOemName() {
        return this.oemName;
    }

    public Integer getOsApiLevel() {
        return this.osApiLevel;
    }

    public String getOsBuild() {
        return this.osBuild;
    }

    public String getOsName() {
        return this.osName;
    }

    public String getOsVersion() {
        return this.osVersion;
    }

    public String getScreenSize() {
        return this.screenSize;
    }

    public String getSdkName() {
        return this.sdkName;
    }

    public String getSdkVersion() {
        return this.sdkVersion;
    }

    public Integer getTimeZoneOffset() {
        return this.timeZoneOffset;
    }

    @Override // com.microsoft.appcenter.ingestion.models.WrapperSdk
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.sdkName;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.sdkVersion;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.model;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.oemName;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.osName;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.osVersion;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.osBuild;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        Integer num = this.osApiLevel;
        int hashCode9 = (hashCode8 + (num != null ? num.hashCode() : 0)) * 31;
        String str8 = this.locale;
        int hashCode10 = (hashCode9 + (str8 != null ? str8.hashCode() : 0)) * 31;
        Integer num2 = this.timeZoneOffset;
        int hashCode11 = (hashCode10 + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str9 = this.screenSize;
        int hashCode12 = (hashCode11 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.appVersion;
        int hashCode13 = (hashCode12 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.carrierName;
        int hashCode14 = (hashCode13 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.carrierCountry;
        int hashCode15 = (hashCode14 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.appBuild;
        int hashCode16 = (hashCode15 + (str13 != null ? str13.hashCode() : 0)) * 31;
        String str14 = this.appNamespace;
        return hashCode16 + (str14 != null ? str14.hashCode() : 0);
    }

    @Override // com.microsoft.appcenter.ingestion.models.WrapperSdk, com.microsoft.appcenter.ingestion.models.Model
    public void read(JSONObject jSONObject) throws JSONException {
        super.read(jSONObject);
        setSdkName(jSONObject.getString(SDK_NAME));
        setSdkVersion(jSONObject.getString(SDK_VERSION));
        setModel(jSONObject.getString("model"));
        setOemName(jSONObject.getString(OEM_NAME));
        setOsName(jSONObject.getString(OS_NAME));
        setOsVersion(jSONObject.getString(OS_VERSION));
        setOsBuild(jSONObject.optString(OS_BUILD, null));
        setOsApiLevel(JSONUtils.readInteger(jSONObject, OS_API_LEVEL));
        setLocale(jSONObject.getString(LOCALE));
        setTimeZoneOffset(Integer.valueOf(jSONObject.getInt(TIME_ZONE_OFFSET)));
        setScreenSize(jSONObject.getString(SCREEN_SIZE));
        setAppVersion(jSONObject.getString(APP_VERSION));
        setCarrierName(jSONObject.optString(CARRIER_NAME, null));
        setCarrierCountry(jSONObject.optString(CARRIER_COUNTRY, null));
        setAppBuild(jSONObject.getString(APP_BUILD));
        setAppNamespace(jSONObject.optString(APP_NAMESPACE, null));
    }

    public void setAppBuild(String str) {
        this.appBuild = str;
    }

    public void setAppNamespace(String str) {
        this.appNamespace = str;
    }

    public void setAppVersion(String str) {
        this.appVersion = str;
    }

    public void setCarrierCountry(String str) {
        this.carrierCountry = str;
    }

    public void setCarrierName(String str) {
        this.carrierName = str;
    }

    public void setLocale(String str) {
        this.locale = str;
    }

    public void setModel(String str) {
        this.model = str;
    }

    public void setOemName(String str) {
        this.oemName = str;
    }

    public void setOsApiLevel(Integer num) {
        this.osApiLevel = num;
    }

    public void setOsBuild(String str) {
        this.osBuild = str;
    }

    public void setOsName(String str) {
        this.osName = str;
    }

    public void setOsVersion(String str) {
        this.osVersion = str;
    }

    public void setScreenSize(String str) {
        this.screenSize = str;
    }

    public void setSdkName(String str) {
        this.sdkName = str;
    }

    public void setSdkVersion(String str) {
        this.sdkVersion = str;
    }

    public void setTimeZoneOffset(Integer num) {
        this.timeZoneOffset = num;
    }

    @Override // com.microsoft.appcenter.ingestion.models.WrapperSdk, com.microsoft.appcenter.ingestion.models.Model
    public void write(JSONStringer jSONStringer) throws JSONException {
        super.write(jSONStringer);
        jSONStringer.key(SDK_NAME).value(getSdkName());
        jSONStringer.key(SDK_VERSION).value(getSdkVersion());
        jSONStringer.key("model").value(getModel());
        jSONStringer.key(OEM_NAME).value(getOemName());
        jSONStringer.key(OS_NAME).value(getOsName());
        jSONStringer.key(OS_VERSION).value(getOsVersion());
        JSONUtils.write(jSONStringer, OS_BUILD, getOsBuild());
        JSONUtils.write(jSONStringer, OS_API_LEVEL, getOsApiLevel());
        jSONStringer.key(LOCALE).value(getLocale());
        jSONStringer.key(TIME_ZONE_OFFSET).value(getTimeZoneOffset());
        jSONStringer.key(SCREEN_SIZE).value(getScreenSize());
        jSONStringer.key(APP_VERSION).value(getAppVersion());
        JSONUtils.write(jSONStringer, CARRIER_NAME, getCarrierName());
        JSONUtils.write(jSONStringer, CARRIER_COUNTRY, getCarrierCountry());
        jSONStringer.key(APP_BUILD).value(getAppBuild());
        JSONUtils.write(jSONStringer, APP_NAMESPACE, getAppNamespace());
    }
}