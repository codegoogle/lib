package com.anchorfree.hdr;

import com.p7700g.p99005.x1;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class HydraConnInfo {
    private final String domain;
    private final ArrayList<String> ips;

    public HydraConnInfo() {
        this.ips = new ArrayList<>();
        this.domain = "";
    }

    public boolean addIp(String str) {
        return this.ips.add(str);
    }

    @x1
    public ArrayList<String> getAllIps() {
        return this.ips;
    }

    @x1
    public String getDomain() {
        return this.domain;
    }

    @x1
    public String getIp() {
        return this.ips.isEmpty() ? "" : this.ips.get(0);
    }

    public boolean isEmpty() {
        return this.ips.isEmpty();
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject.put("domain", this.domain);
            Iterator<String> it = this.ips.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            jSONObject.put("ips", jSONArray);
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "{}";
        }
    }

    public HydraConnInfo(@x1 String str) {
        this.ips = new ArrayList<>();
        this.domain = str;
    }
}