package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.base.R;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import com.p7700g.p99005.om;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.y7;
import com.p7700g.p99005.z1;
import java.util.Locale;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public final class zac {
    @GuardedBy("sCache")
    private static final y7<String, String> zaa = new y7<>();
    @GuardedBy("sCache")
    @z1
    private static Locale zab;

    public static String zaa(Context context) {
        String packageName = context.getPackageName();
        try {
            return Wrappers.packageManager(context).getApplicationLabel(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String zab(Context context) {
        return context.getResources().getString(R.string.common_google_play_services_notification_channel_name);
    }

    @x1
    public static String zac(Context context, int i) {
        Resources resources = context.getResources();
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return resources.getString(17039370);
                }
                return resources.getString(R.string.common_google_play_services_enable_button);
            }
            return resources.getString(R.string.common_google_play_services_update_button);
        }
        return resources.getString(R.string.common_google_play_services_install_button);
    }

    @x1
    public static String zad(Context context, int i) {
        Resources resources = context.getResources();
        String zaa2 = zaa(context);
        if (i != 1) {
            if (i == 2) {
                return DeviceProperties.isWearableWithoutPlayStore(context) ? resources.getString(R.string.common_google_play_services_wear_update_text) : resources.getString(R.string.common_google_play_services_update_text, zaa2);
            } else if (i != 3) {
                if (i != 5) {
                    if (i != 7) {
                        if (i != 9) {
                            if (i != 20) {
                                switch (i) {
                                    case 16:
                                        return zah(context, "common_google_play_services_api_unavailable_text", zaa2);
                                    case 17:
                                        return zah(context, "common_google_play_services_sign_in_failed_text", zaa2);
                                    case 18:
                                        return resources.getString(R.string.common_google_play_services_updating_text, zaa2);
                                    default:
                                        return resources.getString(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue, zaa2);
                                }
                            }
                            return zah(context, "common_google_play_services_restricted_profile_text", zaa2);
                        }
                        return resources.getString(R.string.common_google_play_services_unsupported_text, zaa2);
                    }
                    return zah(context, "common_google_play_services_network_error_text", zaa2);
                }
                return zah(context, "common_google_play_services_invalid_account_text", zaa2);
            } else {
                return resources.getString(R.string.common_google_play_services_enable_text, zaa2);
            }
        }
        return resources.getString(R.string.common_google_play_services_install_text, zaa2);
    }

    @x1
    public static String zae(Context context, int i) {
        if (i != 6 && i != 19) {
            return zad(context, i);
        }
        return zah(context, "common_google_play_services_resolution_required_text", zaa(context));
    }

    @x1
    public static String zaf(Context context, int i) {
        String zag;
        if (i == 6) {
            zag = zai(context, "common_google_play_services_resolution_required_title");
        } else {
            zag = zag(context, i);
        }
        return zag == null ? context.getResources().getString(R.string.common_google_play_services_notification_ticker) : zag;
    }

    @z1
    public static String zag(Context context, int i) {
        Resources resources = context.getResources();
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 5) {
                        if (i != 7) {
                            if (i != 17) {
                                if (i != 20) {
                                    return null;
                                }
                                return zai(context, "common_google_play_services_restricted_profile_title");
                            }
                            return zai(context, "common_google_play_services_sign_in_failed_title");
                        }
                        return zai(context, "common_google_play_services_network_error_title");
                    }
                    return zai(context, "common_google_play_services_invalid_account_title");
                }
                return resources.getString(R.string.common_google_play_services_enable_title);
            }
            return resources.getString(R.string.common_google_play_services_update_title);
        }
        return resources.getString(R.string.common_google_play_services_install_title);
    }

    private static String zah(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String zai = zai(context, str);
        if (zai == null) {
            zai = resources.getString(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, zai, str2);
    }

    @z1
    private static String zai(Context context, String str) {
        y7<String, String> y7Var = zaa;
        synchronized (y7Var) {
            Locale d = om.a(context.getResources().getConfiguration()).d(0);
            if (!d.equals(zab)) {
                y7Var.clear();
                zab = d;
            }
            String str2 = y7Var.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources remoteResource = GooglePlayServicesUtil.getRemoteResource(context);
            if (remoteResource == null) {
                return null;
            }
            int identifier = remoteResource.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                if (str.length() != 0) {
                    "Missing resource: ".concat(str);
                } else {
                    new String("Missing resource: ");
                }
                return null;
            }
            String string = remoteResource.getString(identifier);
            if (!TextUtils.isEmpty(string)) {
                y7Var.put(str, string);
                return string;
            }
            if (str.length() != 0) {
                "Got empty resource: ".concat(str);
            } else {
                new String("Got empty resource: ");
            }
            return null;
        }
    }
}