package com.google.android.gms.ads.search;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.p7700g.p99005.pc5;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class DynamicHeightSearchAdRequest {
    private final SearchAdRequest zza;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
    /* loaded from: classes2.dex */
    public static final class Builder {
        private final zzb zza = new zzb();
        private final Bundle zzb = new Bundle();

        @x1
        public Builder addCustomEventExtrasBundle(@x1 Class<? extends CustomEvent> cls, @x1 Bundle bundle) {
            this.zza.zzb(cls, bundle);
            return this;
        }

        @x1
        public Builder addNetworkExtras(@x1 NetworkExtras networkExtras) {
            this.zza.zzc(networkExtras);
            return this;
        }

        @x1
        public Builder addNetworkExtrasBundle(@x1 Class<? extends MediationAdapter> cls, @x1 Bundle bundle) {
            this.zza.zzd(cls, bundle);
            return this;
        }

        @x1
        public DynamicHeightSearchAdRequest build() {
            this.zza.zzd(AdMobAdapter.class, this.zzb);
            return new DynamicHeightSearchAdRequest(this, null);
        }

        @x1
        public Builder setAdBorderSelectors(@x1 String str) {
            this.zzb.putString("csa_adBorderSelectors", str);
            return this;
        }

        @x1
        public Builder setAdTest(boolean z) {
            this.zzb.putString("csa_adtest", true != z ? pc5.e : pc5.d);
            return this;
        }

        @x1
        public Builder setAdjustableLineHeight(int i) {
            this.zzb.putString("csa_adjustableLineHeight", Integer.toString(i));
            return this;
        }

        @x1
        public Builder setAdvancedOptionValue(@x1 String str, @x1 String str2) {
            this.zzb.putString(str, str2);
            return this;
        }

        @x1
        public Builder setAttributionSpacingBelow(int i) {
            this.zzb.putString("csa_attributionSpacingBelow", Integer.toString(i));
            return this;
        }

        @x1
        public Builder setBorderSelections(@x1 String str) {
            this.zzb.putString("csa_borderSelections", str);
            return this;
        }

        @x1
        public Builder setChannel(@x1 String str) {
            this.zzb.putString("csa_channel", str);
            return this;
        }

        @x1
        public Builder setColorAdBorder(@x1 String str) {
            this.zzb.putString("csa_colorAdBorder", str);
            return this;
        }

        @x1
        public Builder setColorAdSeparator(@x1 String str) {
            this.zzb.putString("csa_colorAdSeparator", str);
            return this;
        }

        @x1
        public Builder setColorAnnotation(@x1 String str) {
            this.zzb.putString("csa_colorAnnotation", str);
            return this;
        }

        @x1
        public Builder setColorAttribution(@x1 String str) {
            this.zzb.putString("csa_colorAttribution", str);
            return this;
        }

        @x1
        public Builder setColorBackground(@x1 String str) {
            this.zzb.putString("csa_colorBackground", str);
            return this;
        }

        @x1
        public Builder setColorBorder(@x1 String str) {
            this.zzb.putString("csa_colorBorder", str);
            return this;
        }

        @x1
        public Builder setColorDomainLink(@x1 String str) {
            this.zzb.putString("csa_colorDomainLink", str);
            return this;
        }

        @x1
        public Builder setColorText(@x1 String str) {
            this.zzb.putString("csa_colorText", str);
            return this;
        }

        @x1
        public Builder setColorTitleLink(@x1 String str) {
            this.zzb.putString("csa_colorTitleLink", str);
            return this;
        }

        @x1
        public Builder setCssWidth(int i) {
            this.zzb.putString("csa_width", Integer.toString(i));
            return this;
        }

        @x1
        public Builder setDetailedAttribution(boolean z) {
            this.zzb.putString("csa_detailedAttribution", Boolean.toString(z));
            return this;
        }

        @x1
        public Builder setFontFamily(@x1 String str) {
            this.zzb.putString("csa_fontFamily", str);
            return this;
        }

        @x1
        public Builder setFontFamilyAttribution(@x1 String str) {
            this.zzb.putString("csa_fontFamilyAttribution", str);
            return this;
        }

        @x1
        public Builder setFontSizeAnnotation(int i) {
            this.zzb.putString("csa_fontSizeAnnotation", Integer.toString(i));
            return this;
        }

        @x1
        public Builder setFontSizeAttribution(int i) {
            this.zzb.putString("csa_fontSizeAttribution", Integer.toString(i));
            return this;
        }

        @x1
        public Builder setFontSizeDescription(int i) {
            this.zzb.putString("csa_fontSizeDescription", Integer.toString(i));
            return this;
        }

        @x1
        public Builder setFontSizeDomainLink(int i) {
            this.zzb.putString("csa_fontSizeDomainLink", Integer.toString(i));
            return this;
        }

        @x1
        public Builder setFontSizeTitle(int i) {
            this.zzb.putString("csa_fontSizeTitle", Integer.toString(i));
            return this;
        }

        @x1
        public Builder setHostLanguage(@x1 String str) {
            this.zzb.putString("csa_hl", str);
            return this;
        }

        @x1
        public Builder setIsClickToCallEnabled(boolean z) {
            this.zzb.putString("csa_clickToCall", Boolean.toString(z));
            return this;
        }

        @x1
        public Builder setIsLocationEnabled(boolean z) {
            this.zzb.putString("csa_location", Boolean.toString(z));
            return this;
        }

        @x1
        public Builder setIsPlusOnesEnabled(boolean z) {
            this.zzb.putString("csa_plusOnes", Boolean.toString(z));
            return this;
        }

        @x1
        public Builder setIsSellerRatingsEnabled(boolean z) {
            this.zzb.putString("csa_sellerRatings", Boolean.toString(z));
            return this;
        }

        @x1
        public Builder setIsSiteLinksEnabled(boolean z) {
            this.zzb.putString("csa_siteLinks", Boolean.toString(z));
            return this;
        }

        @x1
        public Builder setIsTitleBold(boolean z) {
            this.zzb.putString("csa_titleBold", Boolean.toString(z));
            return this;
        }

        @x1
        public Builder setIsTitleUnderlined(boolean z) {
            this.zzb.putString("csa_noTitleUnderline", Boolean.toString(!z));
            return this;
        }

        @x1
        public Builder setLocationColor(@x1 String str) {
            this.zzb.putString("csa_colorLocation", str);
            return this;
        }

        @x1
        public Builder setLocationFontSize(int i) {
            this.zzb.putString("csa_fontSizeLocation", Integer.toString(i));
            return this;
        }

        @x1
        public Builder setLongerHeadlines(boolean z) {
            this.zzb.putString("csa_longerHeadlines", Boolean.toString(z));
            return this;
        }

        @x1
        public Builder setNumber(int i) {
            this.zzb.putString("csa_number", Integer.toString(i));
            return this;
        }

        @x1
        public Builder setPage(int i) {
            this.zzb.putString("csa_adPage", Integer.toString(i));
            return this;
        }

        @x1
        public Builder setQuery(@x1 String str) {
            this.zza.zze(str);
            return this;
        }

        @x1
        public Builder setStyleId(@x1 String str) {
            this.zzb.putString("csa_styleId", str);
            return this;
        }

        @x1
        public Builder setVerticalSpacing(int i) {
            this.zzb.putString("csa_verticalSpacing", Integer.toString(i));
            return this;
        }
    }

    public /* synthetic */ DynamicHeightSearchAdRequest(Builder builder, zza zzaVar) {
        this.zza = new SearchAdRequest(builder.zza, null);
    }

    @z1
    public <T extends CustomEvent> Bundle getCustomEventExtrasBundle(@x1 Class<T> cls) {
        return this.zza.getCustomEventExtrasBundle(cls);
    }

    @z1
    public <T extends MediationAdapter> Bundle getNetworkExtrasBundle(@x1 Class<T> cls) {
        return this.zza.getNetworkExtrasBundle(cls);
    }

    @x1
    public String getQuery() {
        return this.zza.getQuery();
    }

    public boolean isTestDevice(@x1 Context context) {
        return this.zza.isTestDevice(context);
    }

    public final zzdr zza() {
        return this.zza.zza();
    }
}