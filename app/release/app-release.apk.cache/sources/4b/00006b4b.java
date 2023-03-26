package org.xbill.DNS;

import com.anythink.expressad.foundation.g.a;
import com.p7700g.p99005.av5;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public class OPTRecord extends Record {
    private static final long serialVersionUID = -6254521894809367938L;
    private List options;

    public OPTRecord() {
    }

    @Override // org.xbill.DNS.Record
    public boolean equals(Object obj) {
        return super.equals(obj) && this.ttl == ((OPTRecord) obj).ttl;
    }

    public int getExtendedRcode() {
        return (int) (this.ttl >>> 24);
    }

    public int getFlags() {
        return (int) (this.ttl & av5.s);
    }

    @Override // org.xbill.DNS.Record
    public Record getObject() {
        return new OPTRecord();
    }

    public List getOptions() {
        List list = this.options;
        if (list == null) {
            return Collections.EMPTY_LIST;
        }
        return Collections.unmodifiableList(list);
    }

    public int getPayloadSize() {
        return this.dclass;
    }

    public int getVersion() {
        return (int) ((this.ttl >>> 16) & 255);
    }

    @Override // org.xbill.DNS.Record
    public void rdataFromString(Tokenizer tokenizer, Name name) throws IOException {
        throw tokenizer.exception("no text format defined for OPT");
    }

    @Override // org.xbill.DNS.Record
    public void rrFromWire(DNSInput dNSInput) throws IOException {
        if (dNSInput.remaining() > 0) {
            this.options = new ArrayList();
        }
        while (dNSInput.remaining() > 0) {
            this.options.add(EDNSOption.fromWire(dNSInput));
        }
    }

    @Override // org.xbill.DNS.Record
    public String rrToString() {
        StringBuffer stringBuffer = new StringBuffer();
        List list = this.options;
        if (list != null) {
            stringBuffer.append(list);
            stringBuffer.append(" ");
        }
        stringBuffer.append(" ; payload ");
        stringBuffer.append(getPayloadSize());
        stringBuffer.append(", xrcode ");
        stringBuffer.append(getExtendedRcode());
        stringBuffer.append(", version ");
        stringBuffer.append(getVersion());
        stringBuffer.append(", flags ");
        stringBuffer.append(getFlags());
        return stringBuffer.toString();
    }

    @Override // org.xbill.DNS.Record
    public void rrToWire(DNSOutput dNSOutput, Compression compression, boolean z) {
        List<EDNSOption> list = this.options;
        if (list == null) {
            return;
        }
        for (EDNSOption eDNSOption : list) {
            eDNSOption.toWire(dNSOutput);
        }
    }

    public OPTRecord(int i, int i2, int i3, int i4, List list) {
        super(Name.root, 41, i, 0L);
        Record.checkU16("payloadSize", i);
        Record.checkU8("xrcode", i2);
        Record.checkU8(a.h, i3);
        Record.checkU16("flags", i4);
        this.ttl = (i2 << 24) + (i3 << 16) + i4;
        if (list != null) {
            this.options = new ArrayList(list);
        }
    }

    public List getOptions(int i) {
        List<EDNSOption> list = this.options;
        if (list == null) {
            return Collections.EMPTY_LIST;
        }
        List list2 = Collections.EMPTY_LIST;
        for (EDNSOption eDNSOption : list) {
            if (eDNSOption.getCode() == i) {
                if (list2 == Collections.EMPTY_LIST) {
                    list2 = new ArrayList();
                }
                list2.add(eDNSOption);
            }
        }
        return list2;
    }

    public OPTRecord(int i, int i2, int i3, int i4) {
        this(i, i2, i3, i4, null);
    }

    public OPTRecord(int i, int i2, int i3) {
        this(i, i2, i3, 0, null);
    }
}