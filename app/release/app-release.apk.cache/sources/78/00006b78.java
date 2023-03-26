package org.xbill.DNS;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.xbill.DNS.utils.base64;

/* loaded from: classes4.dex */
public class TSIG {
    public static final short FUDGE = 300;
    public static final Name HMAC;
    public static final Name HMAC_MD5;
    public static final Name HMAC_SHA1;
    public static final Name HMAC_SHA224;
    public static final Name HMAC_SHA256;
    public static final Name HMAC_SHA384;
    public static final Name HMAC_SHA512;
    private static Map algMap;
    private Name alg;
    private Mac hmac;
    private Name name;

    /* loaded from: classes4.dex */
    public static class StreamVerifier {
        private TSIG key;
        private TSIGRecord lastTSIG;
        private int lastsigned;
        private int nresponses = 0;
        private Mac verifier;

        public StreamVerifier(TSIG tsig, TSIGRecord tSIGRecord) {
            this.key = tsig;
            this.verifier = tsig.hmac;
            this.lastTSIG = tSIGRecord;
        }

        public int verify(Message message, byte[] bArr) {
            int i;
            int length;
            TSIGRecord tsig = message.getTSIG();
            int i2 = this.nresponses + 1;
            this.nresponses = i2;
            if (i2 == 1) {
                int verify = this.key.verify(message, bArr, this.lastTSIG);
                if (verify == 0) {
                    byte[] signature = tsig.getSignature();
                    DNSOutput dNSOutput = new DNSOutput();
                    dNSOutput.writeU16(signature.length);
                    this.verifier.update(dNSOutput.toByteArray());
                    this.verifier.update(signature);
                }
                this.lastTSIG = tsig;
                return verify;
            }
            if (tsig != null) {
                message.getHeader().decCount(3);
            }
            byte[] wire = message.getHeader().toWire();
            if (tsig != null) {
                message.getHeader().incCount(3);
            }
            this.verifier.update(wire);
            if (tsig == null) {
                i = bArr.length;
                length = wire.length;
            } else {
                i = message.tsigstart;
                length = wire.length;
            }
            this.verifier.update(bArr, wire.length, i - length);
            if (tsig != null) {
                this.lastsigned = this.nresponses;
                this.lastTSIG = tsig;
                if (tsig.getName().equals(this.key.name) && tsig.getAlgorithm().equals(this.key.alg)) {
                    DNSOutput dNSOutput2 = new DNSOutput();
                    long time = tsig.getTimeSigned().getTime() / 1000;
                    dNSOutput2.writeU16((int) (time >> 32));
                    dNSOutput2.writeU32(time & 4294967295L);
                    dNSOutput2.writeU16(tsig.getFudge());
                    this.verifier.update(dNSOutput2.toByteArray());
                    if (!TSIG.verify(this.verifier, tsig.getSignature())) {
                        if (Options.check("verbose")) {
                            System.err.println("BADSIG failure");
                        }
                        message.tsigState = 4;
                        return 16;
                    }
                    this.verifier.reset();
                    DNSOutput dNSOutput3 = new DNSOutput();
                    dNSOutput3.writeU16(tsig.getSignature().length);
                    this.verifier.update(dNSOutput3.toByteArray());
                    this.verifier.update(tsig.getSignature());
                    message.tsigState = 1;
                    return 0;
                }
                if (Options.check("verbose")) {
                    System.err.println("BADKEY failure");
                }
                message.tsigState = 4;
                return 17;
            }
            if (this.nresponses - this.lastsigned >= 100) {
                message.tsigState = 4;
                return 1;
            }
            message.tsigState = 2;
            return 0;
        }
    }

    static {
        Name fromConstantString = Name.fromConstantString("HMAC-MD5.SIG-ALG.REG.INT.");
        HMAC_MD5 = fromConstantString;
        HMAC = fromConstantString;
        Name fromConstantString2 = Name.fromConstantString("hmac-sha1.");
        HMAC_SHA1 = fromConstantString2;
        Name fromConstantString3 = Name.fromConstantString("hmac-sha224.");
        HMAC_SHA224 = fromConstantString3;
        Name fromConstantString4 = Name.fromConstantString("hmac-sha256.");
        HMAC_SHA256 = fromConstantString4;
        Name fromConstantString5 = Name.fromConstantString("hmac-sha384.");
        HMAC_SHA384 = fromConstantString5;
        Name fromConstantString6 = Name.fromConstantString("hmac-sha512.");
        HMAC_SHA512 = fromConstantString6;
        HashMap hashMap = new HashMap();
        hashMap.put(fromConstantString, "HmacMD5");
        hashMap.put(fromConstantString2, "HmacSHA1");
        hashMap.put(fromConstantString3, "HmacSHA224");
        hashMap.put(fromConstantString4, "HmacSHA256");
        hashMap.put(fromConstantString5, "HmacSHA384");
        hashMap.put(fromConstantString6, "HmacSHA512");
        algMap = Collections.unmodifiableMap(hashMap);
    }

    public TSIG(Name name, Name name2, byte[] bArr) {
        this.name = name2;
        this.alg = name;
        String nameToAlgorithm = nameToAlgorithm(name);
        init_hmac(nameToAlgorithm, new SecretKeySpec(bArr, nameToAlgorithm));
    }

    public static Name algorithmToName(String str) {
        for (Map.Entry entry : algMap.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getValue())) {
                return (Name) entry.getKey();
            }
        }
        throw new IllegalArgumentException("Unknown algorithm");
    }

    public static TSIG fromString(String str) {
        String[] split = str.split("[:/]", 3);
        if (split.length >= 2) {
            if (split.length == 3) {
                try {
                    return new TSIG(split[0], split[1], split[2]);
                } catch (IllegalArgumentException unused) {
                    split = str.split("[:/]", 2);
                }
            }
            return new TSIG(HMAC_MD5, split[0], split[1]);
        }
        throw new IllegalArgumentException("Invalid TSIG key specification");
    }

    private void init_hmac(String str, SecretKey secretKey) {
        try {
            Mac mac = Mac.getInstance(str);
            this.hmac = mac;
            mac.init(secretKey);
        } catch (GeneralSecurityException unused) {
            throw new IllegalArgumentException("Caught security exception setting up HMAC.");
        }
    }

    public static String nameToAlgorithm(Name name) {
        String str = (String) algMap.get(name);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Unknown algorithm");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean verify(Mac mac, byte[] bArr) {
        return verify(mac, bArr, false);
    }

    public void apply(Message message, int i, TSIGRecord tSIGRecord) {
        message.addRecord(generate(message, message.toWire(), i, tSIGRecord), 3);
        message.tsigState = 3;
    }

    public void applyStream(Message message, TSIGRecord tSIGRecord, boolean z) {
        if (z) {
            apply(message, tSIGRecord);
            return;
        }
        Date date = new Date();
        this.hmac.reset();
        int intValue = Options.intValue("tsigfudge");
        int i = (intValue < 0 || intValue > 32767) ? 300 : intValue;
        DNSOutput dNSOutput = new DNSOutput();
        dNSOutput.writeU16(tSIGRecord.getSignature().length);
        this.hmac.update(dNSOutput.toByteArray());
        this.hmac.update(tSIGRecord.getSignature());
        this.hmac.update(message.toWire());
        DNSOutput dNSOutput2 = new DNSOutput();
        long time = date.getTime() / 1000;
        dNSOutput2.writeU16((int) (time >> 32));
        dNSOutput2.writeU32(time & 4294967295L);
        dNSOutput2.writeU16(i);
        this.hmac.update(dNSOutput2.toByteArray());
        message.addRecord(new TSIGRecord(this.name, 255, 0L, this.alg, date, i, this.hmac.doFinal(), message.getHeader().getID(), 0, null), 3);
        message.tsigState = 3;
    }

    public TSIGRecord generate(Message message, byte[] bArr, int i, TSIGRecord tSIGRecord) {
        Date timeSigned;
        boolean z;
        byte[] bArr2;
        if (i != 18) {
            timeSigned = new Date();
        } else {
            timeSigned = tSIGRecord.getTimeSigned();
        }
        Date date = timeSigned;
        if (i == 0 || i == 18) {
            z = true;
            this.hmac.reset();
        } else {
            z = false;
        }
        int intValue = Options.intValue("tsigfudge");
        int i2 = (intValue < 0 || intValue > 32767) ? 300 : intValue;
        if (tSIGRecord != null) {
            DNSOutput dNSOutput = new DNSOutput();
            dNSOutput.writeU16(tSIGRecord.getSignature().length);
            if (z) {
                this.hmac.update(dNSOutput.toByteArray());
                this.hmac.update(tSIGRecord.getSignature());
            }
        }
        if (z) {
            this.hmac.update(bArr);
        }
        DNSOutput dNSOutput2 = new DNSOutput();
        this.name.toWireCanonical(dNSOutput2);
        dNSOutput2.writeU16(255);
        dNSOutput2.writeU32(0L);
        this.alg.toWireCanonical(dNSOutput2);
        long time = date.getTime() / 1000;
        dNSOutput2.writeU16((int) (time >> 32));
        dNSOutput2.writeU32(time & 4294967295L);
        dNSOutput2.writeU16(i2);
        dNSOutput2.writeU16(i);
        dNSOutput2.writeU16(0);
        if (z) {
            this.hmac.update(dNSOutput2.toByteArray());
        }
        byte[] doFinal = z ? this.hmac.doFinal() : new byte[0];
        if (i == 18) {
            DNSOutput dNSOutput3 = new DNSOutput();
            long time2 = new Date().getTime() / 1000;
            dNSOutput3.writeU16((int) (time2 >> 32));
            dNSOutput3.writeU32(time2 & 4294967295L);
            bArr2 = dNSOutput3.toByteArray();
        } else {
            bArr2 = null;
        }
        return new TSIGRecord(this.name, 255, 0L, this.alg, date, i2, doFinal, message.getHeader().getID(), i, bArr2);
    }

    public int recordLength() {
        return this.alg.length() + this.name.length() + 10 + 8 + 18 + 4 + 8;
    }

    private static boolean verify(Mac mac, byte[] bArr, boolean z) {
        byte[] doFinal = mac.doFinal();
        if (z && bArr.length < doFinal.length) {
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(doFinal, 0, bArr2, 0, length);
            doFinal = bArr2;
        }
        return Arrays.equals(bArr, doFinal);
    }

    public void apply(Message message, TSIGRecord tSIGRecord) {
        apply(message, 0, tSIGRecord);
    }

    public TSIG(Name name, Name name2, SecretKey secretKey) {
        this.name = name2;
        this.alg = name;
        init_hmac(nameToAlgorithm(name), secretKey);
    }

    public byte verify(Message message, byte[] bArr, int i, TSIGRecord tSIGRecord) {
        message.tsigState = 4;
        TSIGRecord tsig = message.getTSIG();
        this.hmac.reset();
        if (tsig == null) {
            return (byte) 1;
        }
        if (tsig.getName().equals(this.name) && tsig.getAlgorithm().equals(this.alg)) {
            if (Math.abs(System.currentTimeMillis() - tsig.getTimeSigned().getTime()) > tsig.getFudge() * 1000) {
                if (Options.check("verbose")) {
                    System.err.println("BADTIME failure");
                    return (byte) 18;
                }
                return (byte) 18;
            }
            if (tSIGRecord != null && tsig.getError() != 17 && tsig.getError() != 16) {
                DNSOutput dNSOutput = new DNSOutput();
                dNSOutput.writeU16(tSIGRecord.getSignature().length);
                this.hmac.update(dNSOutput.toByteArray());
                this.hmac.update(tSIGRecord.getSignature());
            }
            message.getHeader().decCount(3);
            byte[] wire = message.getHeader().toWire();
            message.getHeader().incCount(3);
            this.hmac.update(wire);
            this.hmac.update(bArr, wire.length, message.tsigstart - wire.length);
            DNSOutput dNSOutput2 = new DNSOutput();
            tsig.getName().toWireCanonical(dNSOutput2);
            dNSOutput2.writeU16(tsig.dclass);
            dNSOutput2.writeU32(tsig.ttl);
            tsig.getAlgorithm().toWireCanonical(dNSOutput2);
            long time = tsig.getTimeSigned().getTime() / 1000;
            dNSOutput2.writeU16((int) (time >> 32));
            dNSOutput2.writeU32(time & 4294967295L);
            dNSOutput2.writeU16(tsig.getFudge());
            dNSOutput2.writeU16(tsig.getError());
            if (tsig.getOther() != null) {
                dNSOutput2.writeU16(tsig.getOther().length);
                dNSOutput2.writeByteArray(tsig.getOther());
            } else {
                dNSOutput2.writeU16(0);
            }
            this.hmac.update(dNSOutput2.toByteArray());
            byte[] signature = tsig.getSignature();
            int macLength = this.hmac.getMacLength();
            int i2 = this.hmac.getAlgorithm().toLowerCase(Locale.US).contains("md5") ? 10 : macLength / 2;
            if (signature.length > macLength) {
                if (Options.check("verbose")) {
                    System.err.println("BADSIG: signature too long");
                }
                return (byte) 16;
            } else if (signature.length < i2) {
                if (Options.check("verbose")) {
                    System.err.println("BADSIG: signature too short");
                }
                return (byte) 16;
            } else if (!verify(this.hmac, signature, true)) {
                if (Options.check("verbose")) {
                    System.err.println("BADSIG: signature verification");
                }
                return (byte) 16;
            } else {
                message.tsigState = 1;
                return (byte) 0;
            }
        }
        if (Options.check("verbose")) {
            System.err.println("BADKEY failure");
        }
        return (byte) 17;
    }

    public TSIG(Mac mac, Name name) {
        this.name = name;
        this.hmac = mac;
        this.alg = algorithmToName(mac.getAlgorithm());
    }

    public TSIG(Name name, byte[] bArr) {
        this(HMAC_MD5, name, bArr);
    }

    public TSIG(Name name, String str, String str2) {
        byte[] fromString = base64.fromString(str2);
        if (fromString != null) {
            try {
                this.name = Name.fromString(str, Name.root);
                this.alg = name;
                String nameToAlgorithm = nameToAlgorithm(name);
                init_hmac(nameToAlgorithm, new SecretKeySpec(fromString, nameToAlgorithm));
                return;
            } catch (TextParseException unused) {
                throw new IllegalArgumentException("Invalid TSIG key name");
            }
        }
        throw new IllegalArgumentException("Invalid TSIG key string");
    }

    public TSIG(String str, String str2, String str3) {
        this(algorithmToName(str), str2, str3);
    }

    public TSIG(String str, String str2) {
        this(HMAC_MD5, str, str2);
    }

    public int verify(Message message, byte[] bArr, TSIGRecord tSIGRecord) {
        return verify(message, bArr, bArr.length, tSIGRecord);
    }
}