package org.xbill.DNS;

import java.io.IOException;
import java.util.Date;
import org.xbill.DNS.utils.base64;

/* loaded from: classes4.dex */
public class TKEYRecord extends Record {
    public static final int DELETE = 5;
    public static final int DIFFIEHELLMAN = 2;
    public static final int GSSAPI = 3;
    public static final int RESOLVERASSIGNED = 4;
    public static final int SERVERASSIGNED = 1;
    private static final long serialVersionUID = 8828458121926391756L;
    private Name alg;
    private int error;
    private byte[] key;
    private int mode;
    private byte[] other;
    private Date timeExpire;
    private Date timeInception;

    public TKEYRecord() {
    }

    public Name getAlgorithm() {
        return this.alg;
    }

    public int getError() {
        return this.error;
    }

    public byte[] getKey() {
        return this.key;
    }

    public int getMode() {
        return this.mode;
    }

    @Override // org.xbill.DNS.Record
    public Record getObject() {
        return new TKEYRecord();
    }

    public byte[] getOther() {
        return this.other;
    }

    public Date getTimeExpire() {
        return this.timeExpire;
    }

    public Date getTimeInception() {
        return this.timeInception;
    }

    public String modeString() {
        int i = this.mode;
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? Integer.toString(i) : "DELETE" : "RESOLVERASSIGNED" : "GSSAPI" : "DIFFIEHELLMAN" : "SERVERASSIGNED";
    }

    @Override // org.xbill.DNS.Record
    public void rdataFromString(Tokenizer tokenizer, Name name) throws IOException {
        throw tokenizer.exception("no text format defined for TKEY");
    }

    @Override // org.xbill.DNS.Record
    public void rrFromWire(DNSInput dNSInput) throws IOException {
        this.alg = new Name(dNSInput);
        this.timeInception = new Date(dNSInput.readU32() * 1000);
        this.timeExpire = new Date(dNSInput.readU32() * 1000);
        this.mode = dNSInput.readU16();
        this.error = dNSInput.readU16();
        int readU16 = dNSInput.readU16();
        if (readU16 > 0) {
            this.key = dNSInput.readByteArray(readU16);
        } else {
            this.key = null;
        }
        int readU162 = dNSInput.readU16();
        if (readU162 > 0) {
            this.other = dNSInput.readByteArray(readU162);
        } else {
            this.other = null;
        }
    }

    @Override // org.xbill.DNS.Record
    public String rrToString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.alg);
        stringBuffer.append(" ");
        if (Options.check("multiline")) {
            stringBuffer.append("(\n\t");
        }
        stringBuffer.append(FormattedTime.format(this.timeInception));
        stringBuffer.append(" ");
        stringBuffer.append(FormattedTime.format(this.timeExpire));
        stringBuffer.append(" ");
        stringBuffer.append(modeString());
        stringBuffer.append(" ");
        stringBuffer.append(Rcode.TSIGstring(this.error));
        if (Options.check("multiline")) {
            stringBuffer.append("\n");
            byte[] bArr = this.key;
            if (bArr != null) {
                stringBuffer.append(base64.formatString(bArr, 64, "\t", false));
                stringBuffer.append("\n");
            }
            byte[] bArr2 = this.other;
            if (bArr2 != null) {
                stringBuffer.append(base64.formatString(bArr2, 64, "\t", false));
            }
            stringBuffer.append(" )");
        } else {
            stringBuffer.append(" ");
            byte[] bArr3 = this.key;
            if (bArr3 != null) {
                stringBuffer.append(base64.toString(bArr3));
                stringBuffer.append(" ");
            }
            byte[] bArr4 = this.other;
            if (bArr4 != null) {
                stringBuffer.append(base64.toString(bArr4));
            }
        }
        return stringBuffer.toString();
    }

    @Override // org.xbill.DNS.Record
    public void rrToWire(DNSOutput dNSOutput, Compression compression, boolean z) {
        this.alg.toWire(dNSOutput, null, z);
        dNSOutput.writeU32(this.timeInception.getTime() / 1000);
        dNSOutput.writeU32(this.timeExpire.getTime() / 1000);
        dNSOutput.writeU16(this.mode);
        dNSOutput.writeU16(this.error);
        byte[] bArr = this.key;
        if (bArr != null) {
            dNSOutput.writeU16(bArr.length);
            dNSOutput.writeByteArray(this.key);
        } else {
            dNSOutput.writeU16(0);
        }
        byte[] bArr2 = this.other;
        if (bArr2 != null) {
            dNSOutput.writeU16(bArr2.length);
            dNSOutput.writeByteArray(this.other);
            return;
        }
        dNSOutput.writeU16(0);
    }

    public TKEYRecord(Name name, int i, long j, Name name2, Date date, Date date2, int i2, int i3, byte[] bArr, byte[] bArr2) {
        super(name, Type.TKEY, i, j);
        this.alg = Record.checkName("alg", name2);
        this.timeInception = date;
        this.timeExpire = date2;
        this.mode = Record.checkU16("mode", i2);
        this.error = Record.checkU16("error", i3);
        this.key = bArr;
        this.other = bArr2;
    }
}