package org.xbill.DNS;

import com.p7700g.p99005.wo1;
import java.io.IOException;
import java.security.PublicKey;
import org.xbill.DNS.DNSSEC;

/* loaded from: classes4.dex */
public class DNSKEYRecord extends KEYBase {
    private static final long serialVersionUID = -8679800040426675002L;

    /* loaded from: classes4.dex */
    public static class Flags {
        public static final int REVOKE = 128;
        public static final int SEP_KEY = 1;
        public static final int ZONE_KEY = 256;

        private Flags() {
        }
    }

    /* loaded from: classes4.dex */
    public static class Protocol {
        public static final int DNSSEC = 3;

        private Protocol() {
        }
    }

    public DNSKEYRecord() {
    }

    @Override // org.xbill.DNS.KEYBase
    public /* bridge */ /* synthetic */ int getAlgorithm() {
        return super.getAlgorithm();
    }

    @Override // org.xbill.DNS.KEYBase
    public /* bridge */ /* synthetic */ int getFlags() {
        return super.getFlags();
    }

    @Override // org.xbill.DNS.KEYBase
    public /* bridge */ /* synthetic */ int getFootprint() {
        return super.getFootprint();
    }

    @Override // org.xbill.DNS.KEYBase
    public /* bridge */ /* synthetic */ byte[] getKey() {
        return super.getKey();
    }

    @Override // org.xbill.DNS.Record
    public Record getObject() {
        return new DNSKEYRecord();
    }

    @Override // org.xbill.DNS.KEYBase
    public /* bridge */ /* synthetic */ int getProtocol() {
        return super.getProtocol();
    }

    @Override // org.xbill.DNS.KEYBase
    public /* bridge */ /* synthetic */ PublicKey getPublicKey() throws DNSSEC.DNSSECException {
        return super.getPublicKey();
    }

    @Override // org.xbill.DNS.Record
    public void rdataFromString(Tokenizer tokenizer, Name name) throws IOException {
        this.flags = tokenizer.getUInt16();
        this.proto = tokenizer.getUInt8();
        String string = tokenizer.getString();
        int value = DNSSEC.Algorithm.value(string);
        this.alg = value;
        if (value >= 0) {
            this.key = tokenizer.getBase64();
            return;
        }
        throw wo1.X("Invalid algorithm: ", string, tokenizer);
    }

    public DNSKEYRecord(Name name, int i, long j, int i2, int i3, int i4, byte[] bArr) {
        super(name, 48, i, j, i2, i3, i4, bArr);
    }

    public DNSKEYRecord(Name name, int i, long j, int i2, int i3, int i4, PublicKey publicKey) throws DNSSEC.DNSSECException {
        super(name, 48, i, j, i2, i3, i4, DNSSEC.fromPublicKey(publicKey, i4));
        this.publicKey = publicKey;
    }
}