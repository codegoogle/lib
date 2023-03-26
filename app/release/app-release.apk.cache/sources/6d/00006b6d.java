package org.xbill.DNS;

import com.p7700g.p99005.wo1;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class SetResponse {
    public static final int CNAME = 4;
    public static final int DELEGATION = 3;
    public static final int DNAME = 5;
    public static final int NXDOMAIN = 1;
    public static final int NXRRSET = 2;
    public static final int SUCCESSFUL = 6;
    public static final int UNKNOWN = 0;
    private Object data;
    private int type;
    private static final SetResponse unknown = new SetResponse(0);
    private static final SetResponse nxdomain = new SetResponse(1);
    private static final SetResponse nxrrset = new SetResponse(2);

    private SetResponse() {
    }

    public static SetResponse ofType(int i) {
        switch (i) {
            case 0:
                return unknown;
            case 1:
                return nxdomain;
            case 2:
                return nxrrset;
            case 3:
            case 4:
            case 5:
            case 6:
                SetResponse setResponse = new SetResponse();
                setResponse.type = i;
                setResponse.data = null;
                return setResponse;
            default:
                throw new IllegalArgumentException("invalid type");
        }
    }

    public void addRRset(RRset rRset) {
        if (this.data == null) {
            this.data = new ArrayList();
        }
        ((List) this.data).add(rRset);
    }

    public RRset[] answers() {
        if (this.type != 6) {
            return null;
        }
        List list = (List) this.data;
        return (RRset[]) list.toArray(new RRset[list.size()]);
    }

    public CNAMERecord getCNAME() {
        return (CNAMERecord) ((RRset) this.data).first();
    }

    public DNAMERecord getDNAME() {
        return (DNAMERecord) ((RRset) this.data).first();
    }

    public RRset getNS() {
        return (RRset) this.data;
    }

    public boolean isCNAME() {
        return this.type == 4;
    }

    public boolean isDNAME() {
        return this.type == 5;
    }

    public boolean isDelegation() {
        return this.type == 3;
    }

    public boolean isNXDOMAIN() {
        return this.type == 1;
    }

    public boolean isNXRRSET() {
        return this.type == 2;
    }

    public boolean isSuccessful() {
        return this.type == 6;
    }

    public boolean isUnknown() {
        return this.type == 0;
    }

    public String toString() {
        switch (this.type) {
            case 0:
                return "unknown";
            case 1:
                return "NXDOMAIN";
            case 2:
                return "NXRRSET";
            case 3:
                StringBuilder G = wo1.G("delegation: ");
                G.append(this.data);
                return G.toString();
            case 4:
                StringBuilder G2 = wo1.G("CNAME: ");
                G2.append(this.data);
                return G2.toString();
            case 5:
                StringBuilder G3 = wo1.G("DNAME: ");
                G3.append(this.data);
                return G3.toString();
            case 6:
                return "successful";
            default:
                throw new IllegalStateException();
        }
    }

    public SetResponse(int i, RRset rRset) {
        if (i >= 0 && i <= 6) {
            this.type = i;
            this.data = rRset;
            return;
        }
        throw new IllegalArgumentException("invalid type");
    }

    public SetResponse(int i) {
        if (i >= 0 && i <= 6) {
            this.type = i;
            this.data = null;
            return;
        }
        throw new IllegalArgumentException("invalid type");
    }
}