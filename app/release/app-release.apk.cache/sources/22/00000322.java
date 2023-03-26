package com.anchorfree.sdk;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.anchorfree.sdk.fireshield.FireshieldConfig;
import com.p7700g.p99005.a81;
import com.p7700g.p99005.co1;
import com.p7700g.p99005.gn1;
import com.p7700g.p99005.kg;
import com.p7700g.p99005.mw2;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.xu0;
import com.p7700g.p99005.z1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class SessionConfig implements Parcelable {
    @x1
    @Deprecated
    public static final String ACTION_BLOCK = "block_dns";
    @x1
    public static final String ACTION_BLOCK_ALERT_PAGE = "block_alert_page";
    @x1
    public static final String ACTION_BLOCK_DNS = "block_dns";
    @x1
    public static final String ACTION_BLOCK_PKT = "block_pkt";
    @x1
    public static final String ACTION_BYPASS = "bypass";
    @x1
    public static final String ACTION_PROXY_PEER = "proxy_peer";
    @x1
    public static final String ACTION_VPN = "vpn";
    @x1
    public static final Parcelable.Creator<SessionConfig> CREATOR = new a();
    @x1
    public static final String DEFAULT_TRANSPORT = "";
    @x1
    @mw2("app-policy")
    private final co1 appPolicy;
    @mw2("captive-portal-block-bypass")
    private boolean captivePortalBlockBypass;
    @mw2("fireshield-config")
    @z1
    private final FireshieldConfig config;
    @x1
    @mw2("virtual-location")
    private final String country;
    @mw2("dns-config")
    @z1
    private final List<a81> dnsConfig;
    @mw2("extras")
    @z1
    private final Map<String, String> extras;
    @mw2("keep-service")
    private boolean keepVpnOnReconnect;
    @x1
    @mw2("virtual-location-location")
    private final String location;
    @x1
    @mw2("private-group")
    private final String privateGroup;
    @mw2("proxy-config")
    @z1
    private final List<a81> proxyRules;
    @x1
    @mw2("reason")
    private String reason;
    @x1
    @mw2("session-id")
    private String sessionId;
    @x1
    @mw2(kg.z0)
    private final String transport;
    @mw2("transport-fallbacks")
    @z1
    private List<String> transportFallbacks;
    @x1
    @mw2("vpn-params")
    private gn1 vpnParams;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<SessionConfig> {
        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: a */
        public SessionConfig createFromParcel(@x1 Parcel parcel) {
            return new SessionConfig(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: b */
        public SessionConfig[] newArray(int i) {
            return new SessionConfig[i];
        }
    }

    public /* synthetic */ SessionConfig(b bVar, a aVar) {
        this(bVar);
    }

    @x1
    public static SessionConfig empty() {
        return new b().E(xu0.e.d).I("").s();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @x1
    public b edit() {
        return new b(this);
    }

    @x1
    public co1 getAppPolicy() {
        return this.appPolicy;
    }

    @z1
    public FireshieldConfig getConfig() {
        FireshieldConfig fireshieldConfig = this.config;
        return fireshieldConfig == null ? FireshieldConfig.Builder.empty() : fireshieldConfig;
    }

    @x1
    public String getCountry() {
        return this.country;
    }

    @x1
    public List<a81> getDnsRules() {
        List<a81> list = this.dnsConfig;
        if (list == null) {
            list = Collections.emptyList();
        }
        return Collections.unmodifiableList(list);
    }

    @x1
    public Map<String, String> getExtras() {
        Map<String, String> map = this.extras;
        return map == null ? Collections.emptyMap() : map;
    }

    @x1
    public String getLocation() {
        return this.location;
    }

    @x1
    public String getPrivateGroup() {
        String str = this.privateGroup;
        return str != null ? str : "";
    }

    @x1
    public List<a81> getProxyRules() {
        List<a81> list = this.proxyRules;
        if (list == null) {
            list = Collections.emptyList();
        }
        return Collections.unmodifiableList(list);
    }

    @x1
    public String getReason() {
        return this.reason;
    }

    @x1
    public String getSessionId() {
        return this.sessionId;
    }

    @x1
    public String getTransport() {
        return this.transport;
    }

    @x1
    public List<String> getTransportFallbacks() {
        List<String> list = this.transportFallbacks;
        return list == null ? new ArrayList() : list;
    }

    @x1
    public gn1 getVpnParams() {
        return this.vpnParams;
    }

    public boolean isCaptivePortalBlockBypass() {
        return this.captivePortalBlockBypass;
    }

    public boolean isKeepVpnOnReconnect() {
        return this.keepVpnOnReconnect;
    }

    public String toString() {
        StringBuilder G = wo1.G("SessionConfig{location='");
        wo1.d0(G, this.location, '\'', ", country=");
        G.append(this.country);
        G.append(", config=");
        G.append(this.config);
        G.append(", dnsConfig=");
        G.append(this.dnsConfig);
        G.append(", appPolicy=");
        G.append(this.appPolicy);
        G.append(", extras=");
        G.append(this.extras);
        G.append(", transport='");
        wo1.d0(G, this.transport, '\'', ", reason='");
        wo1.d0(G, this.reason, '\'', ", sessionId='");
        wo1.d0(G, this.sessionId, '\'', ", vpnParams='");
        G.append(this.vpnParams);
        G.append('\'');
        G.append(", privateGroup='");
        wo1.d0(G, this.privateGroup, '\'', ", keepOnReconnect='");
        G.append(this.keepVpnOnReconnect);
        G.append('\'');
        G.append(", captivePortalBlockBypass='");
        G.append(this.captivePortalBlockBypass);
        G.append('\'');
        G.append('}');
        return G.toString();
    }

    public void updateReason(@x1 String str) {
        this.reason = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@x1 Parcel parcel, int i) {
        parcel.writeString(this.country);
        parcel.writeString(this.location);
        parcel.writeString(this.reason);
        parcel.writeParcelable(this.config, i);
        parcel.writeParcelable(this.appPolicy, i);
        parcel.writeTypedList(this.dnsConfig);
        parcel.writeTypedList(this.proxyRules);
        parcel.writeString(this.transport);
        parcel.writeString(this.sessionId);
        parcel.writeString(this.privateGroup);
        parcel.writeParcelable(this.vpnParams, i);
        parcel.writeStringList(this.transportFallbacks);
        if (Build.VERSION.SDK_INT < 29) {
            parcel.writeInt(this.keepVpnOnReconnect ? 1 : 0);
            parcel.writeInt(this.captivePortalBlockBypass ? 1 : 0);
            return;
        }
        parcel.writeBoolean(this.keepVpnOnReconnect);
        parcel.writeBoolean(this.captivePortalBlockBypass);
    }

    private SessionConfig(@x1 b bVar) {
        this.country = bVar.e;
        this.location = bVar.f;
        this.reason = bVar.d;
        this.config = bVar.a;
        this.appPolicy = bVar.h;
        this.dnsConfig = bVar.b;
        this.extras = bVar.j;
        this.sessionId = bVar.k;
        this.transport = bVar.i;
        this.privateGroup = bVar.g;
        this.vpnParams = bVar.l;
        this.proxyRules = bVar.c;
        this.transportFallbacks = bVar.o;
        this.keepVpnOnReconnect = bVar.m;
        this.captivePortalBlockBypass = bVar.n;
    }

    /* loaded from: classes.dex */
    public static final class b {
        @z1
        private FireshieldConfig a;
        @x1
        private List<a81> b;
        @x1
        private List<a81> c;
        @x1
        private String d;
        @x1
        private String e;
        @x1
        private String f;
        @x1
        private String g;
        @x1
        private co1 h;
        @x1
        private String i;
        @x1
        private Map<String, String> j;
        @x1
        private String k;
        @x1
        private gn1 l;
        private boolean m;
        private boolean n;
        @x1
        private List<String> o;

        public b() {
            this.e = "";
            this.f = "";
            this.h = co1.c();
            this.d = xu0.e.d;
            this.b = new ArrayList();
            this.c = new ArrayList();
            this.i = "";
            this.j = new HashMap();
            this.g = "";
            this.k = "";
            this.l = gn1.g().d();
            this.o = new ArrayList();
            this.m = false;
            this.n = false;
        }

        @x1
        public b A(@x1 FireshieldConfig fireshieldConfig) {
            this.a = fireshieldConfig;
            return this;
        }

        @x1
        public b B(@x1 String str) {
            this.e = "";
            this.f = str;
            return this;
        }

        @x1
        public b C(@x1 co1 co1Var) {
            this.h = co1Var;
            return this;
        }

        @x1
        public b D(@x1 String str) {
            this.g = str;
            return this;
        }

        @x1
        public b E(@x1 @xu0.d String str) {
            this.d = str;
            return this;
        }

        @x1
        public b F(@x1 String str) {
            this.k = str;
            return this;
        }

        @x1
        public b G(@x1 String str) {
            this.i = str;
            return this;
        }

        @x1
        public b H(@x1 List<String> list) {
            this.o.clear();
            this.o.addAll(list);
            return this;
        }

        @x1
        @Deprecated
        public b I(@x1 String str) {
            return z(str);
        }

        @x1
        public b J(@x1 gn1 gn1Var) {
            this.l = gn1Var;
            return this;
        }

        @x1
        public b p(@x1 a81 a81Var) {
            this.b.add(a81Var);
            return this;
        }

        @x1
        public b q(@x1 String str, @x1 String str2) {
            this.j.put(str, str2);
            return this;
        }

        @x1
        public b r(@x1 a81 a81Var) {
            this.c.add(a81Var);
            return this;
        }

        @x1
        public SessionConfig s() {
            return new SessionConfig(this, null);
        }

        @x1
        public b t(boolean z) {
            this.n = z;
            return this;
        }

        @x1
        public b u() {
            this.b.clear();
            return this;
        }

        @x1
        public b v() {
            this.c.clear();
            return this;
        }

        @x1
        public b w(@x1 List<String> list) {
            this.h = co1.g().c(list).e(2).d();
            return this;
        }

        @x1
        public b x(@x1 List<String> list) {
            this.h = co1.g().c(list).e(1).d();
            return this;
        }

        @x1
        public b y(boolean z) {
            this.m = z;
            return this;
        }

        @x1
        public b z(@x1 String str) {
            this.e = str;
            this.f = "";
            return this;
        }

        public b(@x1 SessionConfig sessionConfig) {
            this.k = sessionConfig.sessionId;
            this.e = sessionConfig.country;
            this.f = sessionConfig.location;
            this.h = sessionConfig.appPolicy;
            this.d = sessionConfig.reason;
            this.b = new ArrayList(sessionConfig.getDnsRules());
            this.c = new ArrayList(sessionConfig.getProxyRules());
            this.a = sessionConfig.config;
            this.i = sessionConfig.transport;
            this.j = new HashMap(sessionConfig.getExtras());
            this.g = sessionConfig.privateGroup;
            this.l = sessionConfig.vpnParams;
            this.o = sessionConfig.getTransportFallbacks();
            this.m = sessionConfig.keepVpnOnReconnect;
            this.n = sessionConfig.captivePortalBlockBypass;
        }
    }

    public SessionConfig(@x1 Parcel parcel) {
        this.country = parcel.readString();
        this.location = parcel.readString();
        this.reason = parcel.readString();
        this.config = (FireshieldConfig) parcel.readParcelable(FireshieldConfig.class.getClassLoader());
        this.appPolicy = (co1) parcel.readParcelable(co1.class.getClassLoader());
        Parcelable.Creator<a81> creator = a81.CREATOR;
        this.dnsConfig = parcel.createTypedArrayList(creator);
        this.proxyRules = parcel.createTypedArrayList(creator);
        this.transport = parcel.readString();
        this.extras = parcel.readHashMap(SessionConfig.class.getClassLoader());
        this.sessionId = parcel.readString();
        this.privateGroup = parcel.readString();
        this.vpnParams = (gn1) parcel.readParcelable(gn1.class.getClassLoader());
        ArrayList arrayList = new ArrayList();
        this.transportFallbacks = arrayList;
        parcel.readStringList(arrayList);
        if (Build.VERSION.SDK_INT < 29) {
            this.keepVpnOnReconnect = parcel.readInt() == 1;
            this.captivePortalBlockBypass = parcel.readInt() == 1;
            return;
        }
        this.keepVpnOnReconnect = parcel.readBoolean();
        this.captivePortalBlockBypass = parcel.readBoolean();
    }
}