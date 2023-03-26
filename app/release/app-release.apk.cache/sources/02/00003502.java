package com.ironsource.mediationsdk.metadata;

import com.ironsource.mediationsdk.metadata.MetaData;
import com.p7700g.p99005.k21;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public class MetaDataUtils {
    public static String checkMetaDataKeyValidity(String str) {
        return (str == null || str.length() > 64 || !str.matches("[A-Za-z0-9_\\-.]+")) ? "The MetaData key you entered is invalid. Please enter a key of maximum 64 characters that consists of only letters, digits and the following characters: . - _" : "";
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String checkMetaDataValueValidity(List<String> list) {
        if (list.size() == 0) {
            return "The MetaData list should include at least one element.";
        }
        for (String str : list) {
            if (str == null || str.length() > 64 || !str.matches("[A-Za-z0-9_\\-.]+")) {
                return "The MetaData value(s) you entered is invalid. Please enter a value of maximum 64 characters that consists of only letters, digits and the following characters: . - _";
            }
            while (r3.hasNext()) {
            }
        }
        return "";
    }

    public static MetaData formatMetaData(String str, List<String> list) {
        if (isKnownKey(str)) {
            String lowerCase = str.toLowerCase(Locale.ENGLISH);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (String str2 : list) {
                MetaData.MetaDataValueTypes valueTypeForKey = getValueTypeForKey(lowerCase);
                String formatValueForType = formatValueForType(str2, valueTypeForKey);
                arrayList.add(valueTypeForKey);
                arrayList2.add(formatValueForType);
            }
            return new MetaData(lowerCase, arrayList2, arrayList);
        }
        return new MetaData(str, list);
    }

    public static String formatValueForType(String str, MetaData.MetaDataValueTypes metaDataValueTypes) {
        return metaDataValueTypes == MetaData.MetaDataValueTypes.META_DATA_VALUE_BOOLEAN ? (str.equalsIgnoreCase("true") || str.equalsIgnoreCase(k21.g)) ? "true" : (str.equalsIgnoreCase("false") || str.equalsIgnoreCase(k21.h)) ? "false" : "" : str;
    }

    public static boolean getMetaDataBooleanValue(String str) {
        return !str.equals("false");
    }

    public static MetaData.MetaDataValueTypes getValueTypeForKey(String str) {
        return (str.equalsIgnoreCase("do_not_sell") || str.equalsIgnoreCase("is_child_directed") || str.equalsIgnoreCase("is_deviceid_optout")) ? MetaData.MetaDataValueTypes.META_DATA_VALUE_BOOLEAN : MetaData.MetaDataValueTypes.META_DATA_VALUE_STRING;
    }

    public static boolean isKnownKey(String str) {
        return str.equalsIgnoreCase("do_not_sell") || str.equalsIgnoreCase("is_child_directed") || str.equalsIgnoreCase("is_deviceid_optout");
    }

    public static boolean isMediationKeysBeforeInit(String str) {
        return str.equalsIgnoreCase("is_deviceid_optout");
    }

    public static boolean isMediationOnlyKey(String str) {
        return str.equalsIgnoreCase("is_child_directed") || str.equalsIgnoreCase("is_deviceid_optout");
    }

    public static boolean isValidCCPAMetaData(String str, String str2) {
        return str.equals("do_not_sell") && str2.length() > 0;
    }
}