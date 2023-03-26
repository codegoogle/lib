package com.ironsource.mediationsdk.adunit.b;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.p7700g.p99005.wo1;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class d {
    public g a;
    public h b;
    public e c;
    public com.ironsource.mediationsdk.adunit.b.a d;
    public i e;
    private final int f = -1;
    private IronSource.AD_UNIT g;
    private b h;
    private c i;
    private com.ironsource.mediationsdk.a.b j;
    private Map<com.ironsource.mediationsdk.adunit.b.b, a> k;
    private Map<com.ironsource.mediationsdk.adunit.b.b, a> l;

    /* loaded from: classes3.dex */
    public class a {
        private int a;
        private int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final int a(b bVar) {
            return b.MEDIATION.equals(bVar) ? this.a : this.b;
        }
    }

    /* loaded from: classes3.dex */
    public enum b {
        MEDIATION,
        PROVIDER
    }

    public d(IronSource.AD_UNIT ad_unit, b bVar, c cVar) {
        this.g = ad_unit;
        this.h = bVar;
        this.i = cVar;
        this.j = (ad_unit.equals(IronSource.AD_UNIT.REWARDED_VIDEO) || ad_unit.equals(IronSource.AD_UNIT.OFFERWALL)) ? com.ironsource.mediationsdk.a.h.d() : com.ironsource.mediationsdk.a.d.d();
        HashMap hashMap = new HashMap();
        this.k = hashMap;
        com.ironsource.mediationsdk.adunit.b.b bVar2 = com.ironsource.mediationsdk.adunit.b.b.INIT_STARTED;
        hashMap.put(bVar2, new a(IronSourceConstants.IS_MANAGER_INIT_STARTED, -1));
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map = this.k;
        com.ironsource.mediationsdk.adunit.b.b bVar3 = com.ironsource.mediationsdk.adunit.b.b.INIT_ENDED;
        wo1.a0(this, IronSourceConstants.IS_MANAGER_INIT_ENDED, -1, map, bVar3);
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map2 = this.k;
        com.ironsource.mediationsdk.adunit.b.b bVar4 = com.ironsource.mediationsdk.adunit.b.b.SESSION_CAPPED;
        wo1.a0(this, -1, IronSourceConstants.IS_CAP_SESSION, map2, bVar4);
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map3 = this.k;
        com.ironsource.mediationsdk.adunit.b.b bVar5 = com.ironsource.mediationsdk.adunit.b.b.PLACEMENT_CAPPED;
        wo1.a0(this, IronSourceConstants.IS_CAP_PLACEMENT, -1, map3, bVar5);
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map4 = this.k;
        com.ironsource.mediationsdk.adunit.b.b bVar6 = com.ironsource.mediationsdk.adunit.b.b.AUCTION_REQUEST;
        wo1.a0(this, 2000, -1, map4, bVar6);
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map5 = this.k;
        com.ironsource.mediationsdk.adunit.b.b bVar7 = com.ironsource.mediationsdk.adunit.b.b.AUCTION_SUCCESS;
        wo1.a0(this, IronSourceConstants.IS_AUCTION_SUCCESS, -1, map5, bVar7);
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map6 = this.k;
        com.ironsource.mediationsdk.adunit.b.b bVar8 = com.ironsource.mediationsdk.adunit.b.b.AUCTION_FAILED;
        wo1.a0(this, IronSourceConstants.IS_AUCTION_FAILED, -1, map6, bVar8);
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map7 = this.k;
        com.ironsource.mediationsdk.adunit.b.b bVar9 = com.ironsource.mediationsdk.adunit.b.b.AUCTION_REQUEST_WATERFALL;
        wo1.a0(this, IronSourceConstants.IS_AUCTION_REQUEST_WATERFALL, -1, map7, bVar9);
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map8 = this.k;
        com.ironsource.mediationsdk.adunit.b.b bVar10 = com.ironsource.mediationsdk.adunit.b.b.AUCTION_RESULT_WATERFALL;
        wo1.a0(this, IronSourceConstants.IS_RESULT_WATERFALL, -1, map8, bVar10);
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map9 = this.k;
        com.ironsource.mediationsdk.adunit.b.b bVar11 = com.ironsource.mediationsdk.adunit.b.b.INIT_SUCCESS;
        wo1.a0(this, -1, -1, map9, bVar11);
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map10 = this.k;
        com.ironsource.mediationsdk.adunit.b.b bVar12 = com.ironsource.mediationsdk.adunit.b.b.INIT_FAILED;
        wo1.a0(this, -1, -1, map10, bVar12);
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map11 = this.k;
        com.ironsource.mediationsdk.adunit.b.b bVar13 = com.ironsource.mediationsdk.adunit.b.b.SHOW_AD_SUCCESS;
        wo1.a0(this, -1, IronSourceConstants.IS_INSTANCE_SHOW_SUCCESS, map11, bVar13);
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map12 = this.k;
        com.ironsource.mediationsdk.adunit.b.b bVar14 = com.ironsource.mediationsdk.adunit.b.b.AD_OPENED;
        wo1.a0(this, -1, IronSourceConstants.IS_INSTANCE_OPENED, map12, bVar14);
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map13 = this.k;
        com.ironsource.mediationsdk.adunit.b.b bVar15 = com.ironsource.mediationsdk.adunit.b.b.AD_CLOSED;
        wo1.a0(this, -1, IronSourceConstants.IS_INSTANCE_CLOSED, map13, bVar15);
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map14 = this.k;
        com.ironsource.mediationsdk.adunit.b.b bVar16 = com.ironsource.mediationsdk.adunit.b.b.AD_CLICKED;
        wo1.a0(this, -1, 2006, map14, bVar16);
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map15 = this.k;
        com.ironsource.mediationsdk.adunit.b.b bVar17 = com.ironsource.mediationsdk.adunit.b.b.LOAD_AD;
        wo1.a0(this, 2001, 2002, map15, bVar17);
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map16 = this.k;
        com.ironsource.mediationsdk.adunit.b.b bVar18 = com.ironsource.mediationsdk.adunit.b.b.LOAD_AD_SUCCESS;
        wo1.a0(this, 2004, 2003, map16, bVar18);
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map17 = this.k;
        com.ironsource.mediationsdk.adunit.b.b bVar19 = com.ironsource.mediationsdk.adunit.b.b.LOAD_AD_FAILED_WITH_REASON;
        wo1.a0(this, IronSourceConstants.IS_CALLBACK_LOAD_ERROR, IronSourceConstants.IS_INSTANCE_LOAD_FAILED, map17, bVar19);
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map18 = this.k;
        com.ironsource.mediationsdk.adunit.b.b bVar20 = com.ironsource.mediationsdk.adunit.b.b.LOAD_AD_NO_FILL;
        wo1.a0(this, -1, IronSourceConstants.IS_INSTANCE_LOAD_NO_FILL, map18, bVar20);
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map19 = this.k;
        com.ironsource.mediationsdk.adunit.b.b bVar21 = com.ironsource.mediationsdk.adunit.b.b.SHOW_AD;
        wo1.a0(this, 2100, IronSourceConstants.IS_INSTANCE_SHOW, map19, bVar21);
        wo1.a0(this, -1, IronSourceConstants.IS_INSTANCE_SHOW_SUCCESS, this.k, bVar13);
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map20 = this.k;
        com.ironsource.mediationsdk.adunit.b.b bVar22 = com.ironsource.mediationsdk.adunit.b.b.SHOW_AD_FAILED;
        wo1.a0(this, IronSourceConstants.IS_CALLBACK_AD_SHOW_ERROR, IronSourceConstants.IS_INSTANCE_SHOW_FAILED, map20, bVar22);
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map21 = this.k;
        com.ironsource.mediationsdk.adunit.b.b bVar23 = com.ironsource.mediationsdk.adunit.b.b.AD_UNIT_CAPPED;
        wo1.a0(this, IronSourceConstants.IS_AD_UNIT_CAPPED, -1, map21, bVar23);
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map22 = this.k;
        com.ironsource.mediationsdk.adunit.b.b bVar24 = com.ironsource.mediationsdk.adunit.b.b.TROUBLESHOOT_NETWORK_ADAPTER_NOT_AVAILABLE;
        wo1.a0(this, IronSourceConstants.TROUBLESHOOTING_IS_NETWORK_ADAPTER_NOT_AVAILABLE, IronSourceConstants.TROUBLESHOOTING_IS_NETWORK_ADAPTER_NOT_AVAILABLE, map22, bVar24);
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map23 = this.k;
        com.ironsource.mediationsdk.adunit.b.b bVar25 = com.ironsource.mediationsdk.adunit.b.b.TROUBLESHOOT_AD_ADAPTER_NOT_AVAILABLE;
        wo1.a0(this, IronSourceConstants.TROUBLESHOOTING_IS_AD_ADAPTER_NOT_AVAILABLE, IronSourceConstants.TROUBLESHOOTING_IS_AD_ADAPTER_NOT_AVAILABLE, map23, bVar25);
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map24 = this.k;
        com.ironsource.mediationsdk.adunit.b.b bVar26 = com.ironsource.mediationsdk.adunit.b.b.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING;
        wo1.a0(this, IronSourceConstants.TROUBLESHOOTING_IS_PROVIDER_SETTINGS_MISSING, IronSourceConstants.TROUBLESHOOTING_IS_PROVIDER_SETTINGS_MISSING, map24, bVar26);
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map25 = this.k;
        com.ironsource.mediationsdk.adunit.b.b bVar27 = com.ironsource.mediationsdk.adunit.b.b.TROUBLESHOOT_BIDDING_DATA_MISSING;
        wo1.a0(this, IronSourceConstants.TROUBLESHOOTING_IS_BIDDING_DATA_MISSING, IronSourceConstants.TROUBLESHOOTING_IS_BIDDING_DATA_MISSING, map25, bVar27);
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map26 = this.k;
        com.ironsource.mediationsdk.adunit.b.b bVar28 = com.ironsource.mediationsdk.adunit.b.b.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS;
        wo1.a0(this, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_INIT_SUCCESS, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_INIT_SUCCESS, map26, bVar28);
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map27 = this.k;
        com.ironsource.mediationsdk.adunit.b.b bVar29 = com.ironsource.mediationsdk.adunit.b.b.TROUBLESHOOT_UNEXPECTED_INIT_FAILED;
        wo1.a0(this, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_INIT_FAILED, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_INIT_FAILED, map27, bVar29);
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map28 = this.k;
        com.ironsource.mediationsdk.adunit.b.b bVar30 = com.ironsource.mediationsdk.adunit.b.b.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS;
        wo1.a0(this, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_SUCCESS, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_SUCCESS, map28, bVar30);
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map29 = this.k;
        com.ironsource.mediationsdk.adunit.b.b bVar31 = com.ironsource.mediationsdk.adunit.b.b.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED;
        wo1.a0(this, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_FAILED, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_FAILED, map29, bVar31);
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map30 = this.k;
        com.ironsource.mediationsdk.adunit.b.b bVar32 = com.ironsource.mediationsdk.adunit.b.b.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS;
        wo1.a0(this, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_SUCCESS, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_SUCCESS, map30, bVar32);
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map31 = this.k;
        com.ironsource.mediationsdk.adunit.b.b bVar33 = com.ironsource.mediationsdk.adunit.b.b.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED;
        wo1.a0(this, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_FAILED, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_FAILED, map31, bVar33);
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map32 = this.k;
        com.ironsource.mediationsdk.adunit.b.b bVar34 = com.ironsource.mediationsdk.adunit.b.b.TROUBLESHOOT_UNEXPECTED_SHOW_FAILED;
        wo1.a0(this, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_SHOW_FAILED, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_SHOW_FAILED, map32, bVar34);
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map33 = this.k;
        com.ironsource.mediationsdk.adunit.b.b bVar35 = com.ironsource.mediationsdk.adunit.b.b.TROUBLESHOOT_UNEXPECTED_CLOSED;
        wo1.a0(this, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_CLOSED, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_CLOSED, map33, bVar35);
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map34 = this.k;
        com.ironsource.mediationsdk.adunit.b.b bVar36 = com.ironsource.mediationsdk.adunit.b.b.TROUBLESHOOT_UNEXPECTED_TIMEOUT;
        wo1.a0(this, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_TIMEOUT, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_TIMEOUT, map34, bVar36);
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map35 = this.k;
        com.ironsource.mediationsdk.adunit.b.b bVar37 = com.ironsource.mediationsdk.adunit.b.b.TROUBLESHOOT_INTERNAL_ERROR;
        wo1.a0(this, IronSourceConstants.TROUBLESHOOTING_IS_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_IS_INTERNAL_ERROR, map35, bVar37);
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map36 = this.k;
        com.ironsource.mediationsdk.adunit.b.b bVar38 = com.ironsource.mediationsdk.adunit.b.b.TROUBLESHOOT_ADAPTER_BRIDGE_INTERNAL_ERROR;
        wo1.a0(this, IronSourceConstants.TROUBLESHOOTING_ADAPTER_BRIDGE_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_ADAPTER_BRIDGE_INTERNAL_ERROR, map36, bVar38);
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map37 = this.k;
        com.ironsource.mediationsdk.adunit.b.b bVar39 = com.ironsource.mediationsdk.adunit.b.b.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        wo1.a0(this, IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, map37, bVar39);
        wo1.a0(this, IronSourceConstants.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, IronSourceConstants.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, this.k, com.ironsource.mediationsdk.adunit.b.b.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR);
        Map<com.ironsource.mediationsdk.adunit.b.b, a> map38 = this.k;
        com.ironsource.mediationsdk.adunit.b.b bVar40 = com.ironsource.mediationsdk.adunit.b.b.TROUBLESHOOT_NOTIFICATION_ERROR;
        map38.put(bVar40, new a(IronSourceConstants.TROUBLESHOOTING_IS_NOTIFICATIONS_ERROR, -1));
        HashMap hashMap2 = new HashMap();
        this.l = hashMap2;
        hashMap2.put(bVar2, new a(IronSourceConstants.RV_MANAGER_INIT_STARTED, -1));
        wo1.a0(this, IronSourceConstants.RV_MANAGER_INIT_ENDED, -1, this.l, bVar3);
        wo1.a0(this, -1, IronSourceConstants.RV_CAP_SESSION, this.l, bVar4);
        wo1.a0(this, IronSourceConstants.RV_CAP_PLACEMENT, -1, this.l, bVar5);
        wo1.a0(this, IronSourceConstants.RV_AUCTION_REQUEST, -1, this.l, bVar6);
        wo1.a0(this, IronSourceConstants.RV_AUCTION_SUCCESS, -1, this.l, bVar7);
        wo1.a0(this, IronSourceConstants.RV_AUCTION_FAILED, -1, this.l, bVar8);
        wo1.a0(this, IronSourceConstants.RV_AUCTION_REQUEST_WATERFALL, -1, this.l, bVar9);
        wo1.a0(this, IronSourceConstants.RV_AUCTION_RESPONSE_WATERFALL, -1, this.l, bVar10);
        wo1.a0(this, -1, -1, this.l, bVar11);
        wo1.a0(this, -1, -1, this.l, bVar12);
        wo1.a0(this, -1, IronSourceConstants.RV_INSTANCE_VISIBLE, this.l, com.ironsource.mediationsdk.adunit.b.b.AD_VISIBLE);
        wo1.a0(this, -1, 1005, this.l, bVar14);
        wo1.a0(this, -1, IronSourceConstants.RV_INSTANCE_CLOSED, this.l, bVar15);
        wo1.a0(this, -1, IronSourceConstants.RV_INSTANCE_STARTED, this.l, com.ironsource.mediationsdk.adunit.b.b.AD_STARTED);
        wo1.a0(this, -1, IronSourceConstants.RV_INSTANCE_ENDED, this.l, com.ironsource.mediationsdk.adunit.b.b.AD_ENDED);
        wo1.a0(this, -1, 1006, this.l, bVar16);
        wo1.a0(this, -1, 1010, this.l, com.ironsource.mediationsdk.adunit.b.b.AD_REWARDED);
        wo1.a0(this, IronSourceConstants.RV_CALLBACK_AVAILABILITY_TRUE, IronSourceConstants.RV_INSTANCE_AVAILABILITY_TRUE, this.l, com.ironsource.mediationsdk.adunit.b.b.AD_AVAILABILITY_CHANGED_TRUE);
        wo1.a0(this, IronSourceConstants.RV_CALLBACK_AVAILABILITY_FALSE, IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE, this.l, com.ironsource.mediationsdk.adunit.b.b.AD_AVAILABILITY_CHANGED_FALSE);
        wo1.a0(this, 1000, 1001, this.l, bVar17);
        wo1.a0(this, 1003, 1002, this.l, bVar18);
        wo1.a0(this, -1, IronSourceConstants.RV_INSTANCE_LOAD_FAILED, this.l, com.ironsource.mediationsdk.adunit.b.b.LOAD_AD_FAILED);
        wo1.a0(this, IronSourceConstants.RV_MEDIATION_LOAD_ERROR, IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, this.l, bVar19);
        wo1.a0(this, -1, IronSourceConstants.RV_INSTANCE_LOAD_NO_FILL, this.l, bVar20);
        wo1.a0(this, IronSourceConstants.RV_API_SHOW_CALLED, IronSourceConstants.RV_INSTANCE_SHOW, this.l, bVar21);
        wo1.a0(this, -1, IronSourceConstants.RV_INSTANCE_SHOW_CHANCE, this.l, com.ironsource.mediationsdk.adunit.b.b.SHOW_AD_CHANCE);
        wo1.a0(this, IronSourceConstants.RV_CALLBACK_SHOW_FAILED, IronSourceConstants.RV_INSTANCE_SHOW_FAILED, this.l, bVar22);
        wo1.a0(this, IronSourceConstants.RV_AD_UNIT_CAPPED, -1, this.l, bVar23);
        wo1.a0(this, IronSourceConstants.TROUBLESHOOTING_RV_NETWORK_ADAPTER_NOT_AVAILABLE, IronSourceConstants.TROUBLESHOOTING_RV_NETWORK_ADAPTER_NOT_AVAILABLE, this.l, bVar24);
        wo1.a0(this, IronSourceConstants.TROUBLESHOOTING_RV_AD_ADAPTER_NOT_AVAILABLE, IronSourceConstants.TROUBLESHOOTING_RV_AD_ADAPTER_NOT_AVAILABLE, this.l, bVar25);
        wo1.a0(this, IronSourceConstants.TROUBLESHOOTING_RV_PROVIDER_SETTINGS_MISSING, IronSourceConstants.TROUBLESHOOTING_RV_PROVIDER_SETTINGS_MISSING, this.l, bVar26);
        wo1.a0(this, IronSourceConstants.TROUBLESHOOTING_RV_BIDDING_DATA_MISSING, IronSourceConstants.TROUBLESHOOTING_RV_BIDDING_DATA_MISSING, this.l, bVar27);
        wo1.a0(this, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_INIT_SUCCESS, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_INIT_SUCCESS, this.l, bVar28);
        wo1.a0(this, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_INIT_FAILED, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_INIT_FAILED, this.l, bVar29);
        wo1.a0(this, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_SUCCESS, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_SUCCESS, this.l, bVar30);
        wo1.a0(this, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_FAILED, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_FAILED, this.l, bVar31);
        wo1.a0(this, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_SUCCESS, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_SUCCESS, this.l, bVar32);
        wo1.a0(this, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_FAILED, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_FAILED, this.l, bVar33);
        wo1.a0(this, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_SHOW_FAILED, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_SHOW_FAILED, this.l, bVar34);
        wo1.a0(this, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_TIMEOUT, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_TIMEOUT, this.l, bVar36);
        wo1.a0(this, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_CLOSED, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_CLOSED, this.l, bVar35);
        wo1.a0(this, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_TIMEOUT, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_TIMEOUT, this.l, bVar36);
        wo1.a0(this, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_TIMEOUT, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_TIMEOUT, this.l, bVar36);
        wo1.a0(this, IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, this.l, com.ironsource.mediationsdk.adunit.b.b.TROUBLESHOOT_LOAD_FAILED);
        wo1.a0(this, IronSourceConstants.TROUBLESHOOTING_RV_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_RV_INTERNAL_ERROR, this.l, bVar37);
        wo1.a0(this, IronSourceConstants.TROUBLESHOOTING_ADAPTER_BRIDGE_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_ADAPTER_BRIDGE_INTERNAL_ERROR, this.l, bVar38);
        wo1.a0(this, IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, this.l, bVar39);
        wo1.a0(this, IronSourceConstants.TROUBLESHOOTING_RV_WATERFALL_OVERHEAD, IronSourceConstants.TROUBLESHOOTING_RV_WATERFALL_OVERHEAD, this.l, com.ironsource.mediationsdk.adunit.b.b.TROUBLESHOOTING_WATERFALL_OVERHEAD);
        this.l.put(bVar40, new a(IronSourceConstants.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, -1));
        this.a = new g(this);
        this.b = new h(this);
        this.c = new e(this);
        this.d = new com.ironsource.mediationsdk.adunit.b.a(this);
        this.e = new i(this);
    }

    private int a(com.ironsource.mediationsdk.adunit.b.b bVar) {
        try {
            if (IronSource.AD_UNIT.INTERSTITIAL.equals(this.g) && this.k.containsKey(bVar)) {
                return this.k.get(bVar).a(this.h);
            }
            if (IronSource.AD_UNIT.REWARDED_VIDEO.equals(this.g) && this.l.containsKey(bVar)) {
                return this.l.get(bVar).a(this.h);
            }
            return -1;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public final void a() {
        this.i = null;
        this.c = null;
        this.a = null;
        this.b = null;
        this.d = null;
        this.e = null;
    }

    public final void b(com.ironsource.mediationsdk.adunit.b.b bVar, Map<String, Object> map) {
        c(bVar, map, System.currentTimeMillis());
    }

    public final void c(com.ironsource.mediationsdk.adunit.b.b bVar, Map<String, Object> map, long j) {
        int a2 = a(bVar);
        if (-1 == a2) {
            return;
        }
        HashMap hashMap = new HashMap();
        c cVar = this.i;
        if (cVar != null) {
            hashMap.putAll(cVar.a(bVar));
        }
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        this.j.b(new com.ironsource.mediationsdk.a.c(a2, j, new JSONObject(hashMap)));
    }
}