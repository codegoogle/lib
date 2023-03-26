package com.google.ads.mediation.admob;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.p7700g.p99005.x1;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
@Keep
/* loaded from: classes2.dex */
public final class AdMobAdapter extends AbstractAdViewAdapter {
    public static final String AD_JSON_PARAMETER = "adJson";
    public static final String AD_PARAMETER = "_ad";
    public static final String HOUSE_ADS_PARAMETER = "mad_hac";
    @x1
    public static final String NEW_BUNDLE = "_newBundle";

    @Override // com.google.ads.mediation.AbstractAdViewAdapter
    @x1
    public Bundle buildExtrasBundle(@x1 Bundle bundle, @x1 Bundle bundle2) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (bundle.getBoolean(NEW_BUNDLE)) {
            bundle = new Bundle(bundle);
        }
        bundle.putInt("gw", 1);
        bundle.putString(HOUSE_ADS_PARAMETER, bundle2.getString(HOUSE_ADS_PARAMETER));
        if (!TextUtils.isEmpty(bundle2.getString(AD_JSON_PARAMETER))) {
            bundle.putString(AD_PARAMETER, bundle2.getString(AD_JSON_PARAMETER));
        }
        bundle.putBoolean("_noRefresh", true);
        return bundle;
    }
}