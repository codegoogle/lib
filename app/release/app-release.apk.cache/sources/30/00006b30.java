package org.xbill.DNS;

import com.anythink.core.api.ATAdConst;
import com.anythink.expressad.d.a.b;
import com.microsoft.appcenter.utils.crypto.CryptoConstants;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.zg2;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import org.xbill.DNS.Tokenizer;

/* loaded from: classes4.dex */
public class LOCRecord extends Record {
    private static final long serialVersionUID = 9058224788126750409L;
    private static NumberFormat w2;
    private static NumberFormat w3;
    private long altitude;
    private long hPrecision;
    private long latitude;
    private long longitude;
    private long size;
    private long vPrecision;

    static {
        DecimalFormat decimalFormat = new DecimalFormat();
        w2 = decimalFormat;
        decimalFormat.setMinimumIntegerDigits(2);
        DecimalFormat decimalFormat2 = new DecimalFormat();
        w3 = decimalFormat2;
        decimalFormat2.setMinimumIntegerDigits(3);
    }

    public LOCRecord() {
    }

    private long parseDouble(Tokenizer tokenizer, String str, boolean z, long j, long j2, long j3) throws IOException {
        Tokenizer.Token token = tokenizer.get();
        if (token.isEOL()) {
            if (!z) {
                tokenizer.unget();
                return j3;
            }
            throw wo1.X("Invalid LOC ", str, tokenizer);
        }
        String str2 = token.value;
        if (str2.length() > 1 && str2.charAt(str2.length() - 1) == 'm') {
            str2 = str2.substring(0, str2.length() - 1);
        }
        try {
            long parseFixedPoint = (long) (parseFixedPoint(str2) * 100.0d);
            if (parseFixedPoint < j || parseFixedPoint > j2) {
                throw tokenizer.exception("Invalid LOC " + str);
            }
            return parseFixedPoint;
        } catch (NumberFormatException unused) {
            throw wo1.X("Invalid LOC ", str, tokenizer);
        }
    }

    private double parseFixedPoint(String str) {
        if (str.matches("^-?\\d+$")) {
            return Integer.parseInt(str);
        }
        if (str.matches("^-?\\d+\\.\\d*$")) {
            String[] split = str.split("\\.");
            double parseInt = Integer.parseInt(split[0]);
            double parseInt2 = Integer.parseInt(split[1]);
            if (parseInt < zg2.s) {
                parseInt2 *= -1.0d;
            }
            return (parseInt2 / Math.pow(10.0d, split[1].length())) + parseInt;
        }
        throw new NumberFormatException();
    }

    private static long parseLOCformat(int i) throws WireParseException {
        long j = i >> 4;
        int i2 = i & 15;
        if (j > 9 || i2 > 9) {
            throw new WireParseException("Invalid LOC Encoding");
        }
        while (true) {
            int i3 = i2 - 1;
            if (i2 <= 0) {
                return j;
            }
            j *= 10;
            i2 = i3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private long parsePosition(Tokenizer tokenizer, String str) throws IOException {
        int i;
        double d;
        boolean equals = str.equals("latitude");
        int uInt16 = tokenizer.getUInt16();
        if (uInt16 <= 180 && (uInt16 <= 90 || !equals)) {
            String string = tokenizer.getString();
            double d2 = zg2.s;
            try {
                i = Integer.parseInt(string);
            } catch (NumberFormatException unused) {
                i = 0;
            }
            if (i >= 0 && i <= 59) {
                try {
                    string = tokenizer.getString();
                    d = parseFixedPoint(string);
                    try {
                    } catch (NumberFormatException unused2) {
                        d2 = d;
                        d = d2;
                        if (string.length() != 1) {
                        }
                    }
                } catch (NumberFormatException unused3) {
                }
                if (d >= zg2.s && d < 60.0d) {
                    string = tokenizer.getString();
                    if (string.length() != 1) {
                        long j = (long) ((d + (((uInt16 * 60) + i) * 60)) * 1000.0d);
                        char upperCase = Character.toUpperCase(string.charAt(0));
                        if ((equals && upperCase == 'S') || (!equals && upperCase == 'W')) {
                            j = -j;
                        } else if ((equals && upperCase != 'N') || (!equals && upperCase != 'E')) {
                            throw wo1.X("Invalid LOC ", str, tokenizer);
                        }
                        return j + 2147483648L;
                    }
                    throw wo1.X("Invalid LOC ", str, tokenizer);
                }
                throw tokenizer.exception("Invalid LOC " + str + " seconds");
            }
            throw tokenizer.exception("Invalid LOC " + str + " minutes");
        }
        throw tokenizer.exception("Invalid LOC " + str + " degrees");
    }

    private String positionToString(long j, char c, char c2) {
        StringBuffer stringBuffer = new StringBuffer();
        long j2 = j - 2147483648L;
        if (j2 < 0) {
            j2 = -j2;
            c = c2;
        }
        stringBuffer.append(j2 / 3600000);
        long j3 = j2 % 3600000;
        stringBuffer.append(" ");
        stringBuffer.append(j3 / 60000);
        stringBuffer.append(" ");
        renderFixedPoint(stringBuffer, w3, j3 % 60000, 1000L);
        stringBuffer.append(" ");
        stringBuffer.append(c);
        return stringBuffer.toString();
    }

    private void renderFixedPoint(StringBuffer stringBuffer, NumberFormat numberFormat, long j, long j2) {
        stringBuffer.append(j / j2);
        long j3 = j % j2;
        if (j3 != 0) {
            stringBuffer.append(CryptoConstants.ALIAS_SEPARATOR);
            stringBuffer.append(numberFormat.format(j3));
        }
    }

    private int toLOCformat(long j) {
        byte b = 0;
        while (j > 9) {
            b = (byte) (b + 1);
            j /= 10;
        }
        return (int) ((j << 4) + b);
    }

    public double getAltitude() {
        return (this.altitude - 10000000) / 100.0d;
    }

    public double getHPrecision() {
        return this.hPrecision / 100.0d;
    }

    public double getLatitude() {
        return (this.latitude - 2147483648L) / 3600000.0d;
    }

    public double getLongitude() {
        return (this.longitude - 2147483648L) / 3600000.0d;
    }

    @Override // org.xbill.DNS.Record
    public Record getObject() {
        return new LOCRecord();
    }

    public double getSize() {
        return this.size / 100.0d;
    }

    public double getVPrecision() {
        return this.vPrecision / 100.0d;
    }

    @Override // org.xbill.DNS.Record
    public void rdataFromString(Tokenizer tokenizer, Name name) throws IOException {
        this.latitude = parsePosition(tokenizer, "latitude");
        this.longitude = parsePosition(tokenizer, "longitude");
        this.altitude = parseDouble(tokenizer, "altitude", true, -10000000L, 4284967295L, 0L) + 10000000;
        this.size = parseDouble(tokenizer, ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, false, 0L, 9000000000L, 100L);
        this.hPrecision = parseDouble(tokenizer, "horizontal precision", false, 0L, 9000000000L, 1000000L);
        this.vPrecision = parseDouble(tokenizer, "vertical precision", false, 0L, 9000000000L, 1000L);
    }

    @Override // org.xbill.DNS.Record
    public void rrFromWire(DNSInput dNSInput) throws IOException {
        if (dNSInput.readU8() == 0) {
            this.size = parseLOCformat(dNSInput.readU8());
            this.hPrecision = parseLOCformat(dNSInput.readU8());
            this.vPrecision = parseLOCformat(dNSInput.readU8());
            this.latitude = dNSInput.readU32();
            this.longitude = dNSInput.readU32();
            this.altitude = dNSInput.readU32();
            return;
        }
        throw new WireParseException("Invalid LOC version");
    }

    @Override // org.xbill.DNS.Record
    public String rrToString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(positionToString(this.latitude, 'N', 'S'));
        stringBuffer.append(" ");
        stringBuffer.append(positionToString(this.longitude, 'E', 'W'));
        stringBuffer.append(" ");
        renderFixedPoint(stringBuffer, w2, this.altitude - 10000000, 100L);
        stringBuffer.append("m ");
        renderFixedPoint(stringBuffer, w2, this.size, 100L);
        stringBuffer.append("m ");
        renderFixedPoint(stringBuffer, w2, this.hPrecision, 100L);
        stringBuffer.append("m ");
        renderFixedPoint(stringBuffer, w2, this.vPrecision, 100L);
        stringBuffer.append(b.dH);
        return stringBuffer.toString();
    }

    @Override // org.xbill.DNS.Record
    public void rrToWire(DNSOutput dNSOutput, Compression compression, boolean z) {
        dNSOutput.writeU8(0);
        dNSOutput.writeU8(toLOCformat(this.size));
        dNSOutput.writeU8(toLOCformat(this.hPrecision));
        dNSOutput.writeU8(toLOCformat(this.vPrecision));
        dNSOutput.writeU32(this.latitude);
        dNSOutput.writeU32(this.longitude);
        dNSOutput.writeU32(this.altitude);
    }

    public LOCRecord(Name name, int i, long j, double d, double d2, double d3, double d4, double d5, double d6) {
        super(name, 29, i, j);
        this.latitude = (long) ((d * 3600.0d * 1000.0d) + 2.147483648E9d);
        this.longitude = (long) ((3600.0d * d2 * 1000.0d) + 2.147483648E9d);
        this.altitude = (long) ((d3 + 100000.0d) * 100.0d);
        this.size = (long) (d4 * 100.0d);
        this.hPrecision = (long) (d5 * 100.0d);
        this.vPrecision = (long) (d6 * 100.0d);
    }
}