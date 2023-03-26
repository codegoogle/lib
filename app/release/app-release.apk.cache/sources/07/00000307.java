package com.anchorfree.partner.api;

import android.text.TextUtils;
import com.p7700g.p99005.mw2;
import com.p7700g.p99005.tt0;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class ClientInfo {
    private static final String CARRIER_ID = "carrier_id";
    @x1
    @mw2("baseUrl")
    private final String baseUrl;
    @x1
    @mw2("carrierId")
    private final String carrierId;
    @mw2("urls")
    @z1
    private final List<String> urls;

    /* loaded from: classes.dex */
    public static final class b {
        @x1
        private String a;
        @x1
        private List<String> b;

        @x1
        public b c(@x1 String str) {
            this.b.add(str);
            return this;
        }

        @x1
        public b d(@x1 List<String> list) {
            this.b.addAll(list);
            return this;
        }

        @x1
        @Deprecated
        public b e(@x1 String str) {
            this.b.add(str);
            return this;
        }

        @x1
        public ClientInfo f() {
            if (!TextUtils.isEmpty(this.a)) {
                return new ClientInfo(this);
            }
            throw new IllegalArgumentException("Carrier id is required");
        }

        @x1
        public b g(@x1 String str) {
            this.a = str;
            return this;
        }

        private b() {
            this.a = "";
            this.b = new ArrayList();
        }
    }

    @x1
    public static b newBuilder() {
        return new b();
    }

    @x1
    public Map<String, String> asMap() {
        HashMap hashMap = new HashMap();
        tt0.a(hashMap, CARRIER_ID, this.carrierId);
        return hashMap;
    }

    @x1
    @Deprecated
    public String getBaseUrl() {
        List<String> urls = getUrls();
        return urls.size() == 0 ? this.baseUrl : urls.get(0);
    }

    public String getCarrierId() {
        return this.carrierId;
    }

    @x1
    public List<String> getUrls() {
        List<String> list = this.urls;
        return list == null ? Collections.singletonList(this.baseUrl) : list;
    }

    public String toString() {
        StringBuilder G = wo1.G("ClientInfo{carrierId='");
        wo1.d0(G, this.carrierId, '\'', ", urls=");
        G.append(this.urls);
        G.append('}');
        return G.toString();
    }

    private ClientInfo(@x1 String str, @x1 String str2) {
        this.carrierId = str;
        ArrayList arrayList = new ArrayList();
        this.urls = arrayList;
        this.baseUrl = str2;
        arrayList.add(str2);
    }

    private ClientInfo(@x1 b bVar) {
        this.carrierId = bVar.a;
        if (bVar.b.size() != 0) {
            this.baseUrl = (String) bVar.b.get(0);
        } else {
            this.baseUrl = "";
        }
        this.urls = new ArrayList(bVar.b);
    }
}