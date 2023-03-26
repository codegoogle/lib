package com.microsoft.appcenter.analytics;

import com.microsoft.appcenter.utils.AppCenterLog;
import com.microsoft.appcenter.utils.HashUtils;
import com.microsoft.appcenter.utils.TicketCache;
import com.p7700g.p99005.wo1;
import java.util.Date;

/* loaded from: classes3.dex */
public class AuthenticationProvider {
    private static final long REFRESH_THRESHOLD = 600000;
    private AuthenticationCallback mCallback;
    private Date mExpiryDate;
    private final String mTicketKey;
    private final String mTicketKeyHash;
    private final TokenProvider mTokenProvider;
    private final Type mType;

    /* loaded from: classes3.dex */
    public interface AuthenticationCallback {
        void onAuthenticationResult(String str, Date date);
    }

    /* loaded from: classes3.dex */
    public interface TokenProvider {
        void acquireToken(String str, AuthenticationCallback authenticationCallback);
    }

    /* loaded from: classes3.dex */
    public enum Type {
        MSA_COMPACT("p"),
        MSA_DELEGATE("d");
        
        private final String mTokenPrefix;

        Type(String str) {
            this.mTokenPrefix = wo1.t(str, ":");
        }
    }

    public AuthenticationProvider(Type type, String str, TokenProvider tokenProvider) {
        this.mType = type;
        this.mTicketKey = str;
        this.mTicketKeyHash = str == null ? null : HashUtils.sha256(str);
        this.mTokenProvider = tokenProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void handleTokenUpdate(String str, Date date, AuthenticationCallback authenticationCallback) {
        if (this.mCallback != authenticationCallback) {
            AppCenterLog.debug(Analytics.LOG_TAG, "Ignore duplicate authentication callback calls, provider=" + this.mType);
            return;
        }
        this.mCallback = null;
        AppCenterLog.debug(Analytics.LOG_TAG, "Got result back from token provider=" + this.mType);
        if (str == null) {
            AppCenterLog.error(Analytics.LOG_TAG, "Authentication failed for ticketKey=" + this.mTicketKey);
        } else if (date == null) {
            AppCenterLog.error(Analytics.LOG_TAG, "No expiry date provided for ticketKey=" + this.mTicketKey);
        } else {
            String str2 = this.mTicketKeyHash;
            TicketCache.putTicket(str2, this.mType.mTokenPrefix + str);
            this.mExpiryDate = date;
        }
    }

    public synchronized void acquireTokenAsync() {
        if (this.mCallback != null) {
            return;
        }
        AppCenterLog.debug(Analytics.LOG_TAG, "Calling token provider=" + this.mType + " callback.");
        AuthenticationCallback authenticationCallback = new AuthenticationCallback() { // from class: com.microsoft.appcenter.analytics.AuthenticationProvider.1
            @Override // com.microsoft.appcenter.analytics.AuthenticationProvider.AuthenticationCallback
            public void onAuthenticationResult(String str, Date date) {
                AuthenticationProvider.this.handleTokenUpdate(str, date, this);
            }
        };
        this.mCallback = authenticationCallback;
        this.mTokenProvider.acquireToken(this.mTicketKey, authenticationCallback);
    }

    public synchronized void checkTokenExpiry() {
        Date date = this.mExpiryDate;
        if (date != null && date.getTime() <= System.currentTimeMillis() + 600000) {
            acquireTokenAsync();
        }
    }

    public String getTicketKey() {
        return this.mTicketKey;
    }

    public String getTicketKeyHash() {
        return this.mTicketKeyHash;
    }

    public TokenProvider getTokenProvider() {
        return this.mTokenProvider;
    }

    public Type getType() {
        return this.mType;
    }
}