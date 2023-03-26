package com.anchorfree.sdk.exceptions;

import com.p7700g.p99005.gc1;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;

/* loaded from: classes.dex */
public class PartnerApiException extends gc1 {
    @x1
    public static final String CODE_DEVICES_EXCEED = "DEVICES_EXCEED";
    @x1
    public static final String CODE_INTERNAL_SERVER_ERROR = "INTERNAL_SERVER_ERROR";
    @x1
    public static final String CODE_INVALID = "INVALID";
    @x1
    public static final String CODE_NOT_AUTHORIZED = "NOT_AUTHORIZED";
    @x1
    public static final String CODE_OAUTH_ERROR = "OAUTH_ERROR";
    @x1
    public static final String CODE_PARSE_EXCEPTION = "PARSE_EXCEPTION";
    @x1
    public static final String CODE_SERVER_UNAVAILABLE = "SERVER_UNAVAILABLE";
    @x1
    public static final String CODE_SESSIONS_EXCEED = "SESSIONS_EXCEED";
    @x1
    public static final String CODE_TRAFFIC_EXCEED = "TRAFFIC_EXCEED";
    @x1
    public static final String CODE_USER_SUSPENDED = "USER_SUSPENDED";
    private final int code;
    @x1
    private final String content;

    public PartnerApiException(int i, @x1 String str) {
        super(str);
        this.code = i;
        this.content = "";
    }

    public int getCode() {
        return this.code;
    }

    @x1
    public String getContent() {
        return this.content;
    }

    @Override // java.lang.Throwable
    @x1
    public String toString() {
        StringBuilder G = wo1.G("PartnerApiException{code=");
        G.append(this.code);
        G.append("message=");
        G.append(getMessage());
        G.append("content=");
        G.append(getContent());
        G.append('}');
        return G.toString();
    }

    @Override // com.p7700g.p99005.gc1
    @x1
    public String toTrackerName() {
        StringBuilder G = wo1.G("PartnerApiException:");
        G.append(this.code);
        G.append(":");
        G.append(this.content);
        return G.toString();
    }

    public PartnerApiException(int i, @x1 String str, @x1 String str2) {
        super(str2);
        this.code = i;
        this.content = str;
    }
}