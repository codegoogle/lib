package com.squareup.moshi;

import com.p7700g.p99005.jw5;
import com.p7700g.p99005.pg1;
import com.p7700g.p99005.sv5;
import com.p7700g.p99005.uv5;
import com.p7700g.p99005.vv5;
import com.p7700g.p99005.wo1;
import com.squareup.moshi.JsonReader;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Objects;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public final class JsonUtf8Reader extends JsonReader {
    private static final long MIN_INCOMPLETE_INTEGER = -922337203685477580L;
    private static final int NUMBER_CHAR_DECIMAL = 3;
    private static final int NUMBER_CHAR_DIGIT = 2;
    private static final int NUMBER_CHAR_EXP_DIGIT = 7;
    private static final int NUMBER_CHAR_EXP_E = 5;
    private static final int NUMBER_CHAR_EXP_SIGN = 6;
    private static final int NUMBER_CHAR_FRACTION_DIGIT = 4;
    private static final int NUMBER_CHAR_NONE = 0;
    private static final int NUMBER_CHAR_SIGN = 1;
    private static final int PEEKED_BEGIN_ARRAY = 3;
    private static final int PEEKED_BEGIN_OBJECT = 1;
    private static final int PEEKED_BUFFERED = 11;
    private static final int PEEKED_BUFFERED_NAME = 15;
    private static final int PEEKED_DOUBLE_QUOTED = 9;
    private static final int PEEKED_DOUBLE_QUOTED_NAME = 13;
    private static final int PEEKED_END_ARRAY = 4;
    private static final int PEEKED_END_OBJECT = 2;
    private static final int PEEKED_EOF = 18;
    private static final int PEEKED_FALSE = 6;
    private static final int PEEKED_LONG = 16;
    private static final int PEEKED_NONE = 0;
    private static final int PEEKED_NULL = 7;
    private static final int PEEKED_NUMBER = 17;
    private static final int PEEKED_SINGLE_QUOTED = 8;
    private static final int PEEKED_SINGLE_QUOTED_NAME = 12;
    private static final int PEEKED_TRUE = 5;
    private static final int PEEKED_UNQUOTED = 10;
    private static final int PEEKED_UNQUOTED_NAME = 14;
    private final sv5 buffer;
    private int peeked;
    private long peekedLong;
    private int peekedNumberLength;
    @Nullable
    private String peekedString;
    private final uv5 source;
    @Nullable
    private JsonValueSource valueSource;
    private static final vv5 SINGLE_QUOTE_OR_SLASH = vv5.u("'\\");
    private static final vv5 DOUBLE_QUOTE_OR_SLASH = vv5.u("\"\\");
    private static final vv5 UNQUOTED_STRING_TERMINALS = vv5.u("{}[]:, \n\t\r\f/\\;#=");
    private static final vv5 LINEFEED_OR_CARRIAGE_RETURN = vv5.u("\n\r");
    private static final vv5 CLOSING_BLOCK_COMMENT = vv5.u("*/");

    public JsonUtf8Reader(uv5 uv5Var) {
        this.peeked = 0;
        Objects.requireNonNull(uv5Var, "source == null");
        this.source = uv5Var;
        this.buffer = uv5Var.o();
        pushScope(6);
    }

    private void checkLenient() throws IOException {
        if (!this.lenient) {
            throw syntaxError("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private int doPeek() throws IOException {
        int[] iArr = this.scopes;
        int i = this.stackSize;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int nextNonWhitespace = nextNonWhitespace(true);
            this.buffer.readByte();
            if (nextNonWhitespace != 44) {
                if (nextNonWhitespace != 59) {
                    if (nextNonWhitespace == 93) {
                        this.peeked = 4;
                        return 4;
                    }
                    throw syntaxError("Unterminated array");
                }
                checkLenient();
            }
        } else if (i2 == 3 || i2 == 5) {
            iArr[i - 1] = 4;
            if (i2 == 5) {
                int nextNonWhitespace2 = nextNonWhitespace(true);
                this.buffer.readByte();
                if (nextNonWhitespace2 != 44) {
                    if (nextNonWhitespace2 != 59) {
                        if (nextNonWhitespace2 == 125) {
                            this.peeked = 2;
                            return 2;
                        }
                        throw syntaxError("Unterminated object");
                    }
                    checkLenient();
                }
            }
            int nextNonWhitespace3 = nextNonWhitespace(true);
            if (nextNonWhitespace3 == 34) {
                this.buffer.readByte();
                this.peeked = 13;
                return 13;
            } else if (nextNonWhitespace3 == 39) {
                this.buffer.readByte();
                checkLenient();
                this.peeked = 12;
                return 12;
            } else if (nextNonWhitespace3 != 125) {
                checkLenient();
                if (isLiteral((char) nextNonWhitespace3)) {
                    this.peeked = 14;
                    return 14;
                }
                throw syntaxError("Expected name");
            } else if (i2 != 5) {
                this.buffer.readByte();
                this.peeked = 2;
                return 2;
            } else {
                throw syntaxError("Expected name");
            }
        } else if (i2 == 4) {
            iArr[i - 1] = 5;
            int nextNonWhitespace4 = nextNonWhitespace(true);
            this.buffer.readByte();
            if (nextNonWhitespace4 != 58) {
                if (nextNonWhitespace4 == 61) {
                    checkLenient();
                    if (this.source.i1(1L) && this.buffer.d2(0L) == 62) {
                        this.buffer.readByte();
                    }
                } else {
                    throw syntaxError("Expected ':'");
                }
            }
        } else if (i2 == 6) {
            iArr[i - 1] = 7;
        } else if (i2 == 7) {
            if (nextNonWhitespace(false) == -1) {
                this.peeked = 18;
                return 18;
            }
            checkLenient();
        } else if (i2 == 9) {
            this.valueSource.discard();
            this.valueSource = null;
            this.stackSize--;
            return doPeek();
        } else if (i2 == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int nextNonWhitespace5 = nextNonWhitespace(true);
        if (nextNonWhitespace5 == 34) {
            this.buffer.readByte();
            this.peeked = 9;
            return 9;
        } else if (nextNonWhitespace5 == 39) {
            checkLenient();
            this.buffer.readByte();
            this.peeked = 8;
            return 8;
        } else {
            if (nextNonWhitespace5 != 44 && nextNonWhitespace5 != 59) {
                if (nextNonWhitespace5 == 91) {
                    this.buffer.readByte();
                    this.peeked = 3;
                    return 3;
                } else if (nextNonWhitespace5 != 93) {
                    if (nextNonWhitespace5 != 123) {
                        int peekKeyword = peekKeyword();
                        if (peekKeyword != 0) {
                            return peekKeyword;
                        }
                        int peekNumber = peekNumber();
                        if (peekNumber != 0) {
                            return peekNumber;
                        }
                        if (isLiteral(this.buffer.d2(0L))) {
                            checkLenient();
                            this.peeked = 10;
                            return 10;
                        }
                        throw syntaxError("Expected value");
                    }
                    this.buffer.readByte();
                    this.peeked = 1;
                    return 1;
                } else if (i2 == 1) {
                    this.buffer.readByte();
                    this.peeked = 4;
                    return 4;
                }
            }
            if (i2 != 1 && i2 != 2) {
                throw syntaxError("Unexpected value");
            }
            checkLenient();
            this.peeked = 7;
            return 7;
        }
    }

    private int findName(String str, JsonReader.Options options) {
        int length = options.strings.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(options.strings[i])) {
                this.peeked = 0;
                this.pathNames[this.stackSize - 1] = str;
                return i;
            }
        }
        return -1;
    }

    private int findString(String str, JsonReader.Options options) {
        int length = options.strings.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(options.strings[i])) {
                this.peeked = 0;
                int[] iArr = this.pathIndices;
                int i2 = this.stackSize - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
        }
        return -1;
    }

    private boolean isLiteral(int i) throws IOException {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        checkLenient();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
        r6.buffer.skip(r3 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
        if (r1 != 47) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
        if (r6.source.i1(2) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
        checkLenient();
        r3 = r6.buffer.d2(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
        if (r3 == 42) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
        if (r3 == 47) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
        r6.buffer.readByte();
        r6.buffer.readByte();
        skipToEndOfLine();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
        r6.buffer.readByte();
        r6.buffer.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
        if (skipToEndOfBlockComment() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0073, code lost:
        throw syntaxError("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
        if (r1 != 35) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0078, code lost:
        checkLenient();
        skipToEndOfLine();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007f, code lost:
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int nextNonWhitespace(boolean z) throws IOException {
        while (true) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (!this.source.i1(i2)) {
                    if (z) {
                        throw new EOFException("End of input");
                    }
                    return -1;
                }
                byte d2 = this.buffer.d2(i);
                if (d2 != 10 && d2 != 32 && d2 != 13 && d2 != 9) {
                    break;
                }
                i = i2;
            }
        }
    }

    private String nextQuotedValue(vv5 vv5Var) throws IOException {
        StringBuilder sb = null;
        while (true) {
            long n0 = this.source.n0(vv5Var);
            if (n0 != -1) {
                if (this.buffer.d2(n0) != 92) {
                    if (sb == null) {
                        String g = this.buffer.g(n0);
                        this.buffer.readByte();
                        return g;
                    }
                    sb.append(this.buffer.g(n0));
                    this.buffer.readByte();
                    return sb.toString();
                }
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append(this.buffer.g(n0));
                this.buffer.readByte();
                sb.append(readEscapeCharacter());
            } else {
                throw syntaxError("Unterminated string");
            }
        }
    }

    private String nextUnquotedValue() throws IOException {
        long n0 = this.source.n0(UNQUOTED_STRING_TERMINALS);
        return n0 != -1 ? this.buffer.g(n0) : this.buffer.u1();
    }

    private int peekKeyword() throws IOException {
        int i;
        String str;
        String str2;
        byte d2 = this.buffer.d2(0L);
        if (d2 == 116 || d2 == 84) {
            i = 5;
            str = "true";
            str2 = "TRUE";
        } else if (d2 == 102 || d2 == 70) {
            i = 6;
            str = "false";
            str2 = "FALSE";
        } else if (d2 != 110 && d2 != 78) {
            return 0;
        } else {
            i = 7;
            str = pg1.d;
            str2 = "NULL";
        }
        int length = str.length();
        int i2 = 1;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (!this.source.i1(i3)) {
                return 0;
            }
            byte d22 = this.buffer.d2(i2);
            if (d22 != str.charAt(i2) && d22 != str2.charAt(i2)) {
                return 0;
            }
            i2 = i3;
        }
        if (this.source.i1(length + 1) && isLiteral(this.buffer.d2(length))) {
            return 0;
        }
        this.buffer.skip(length);
        this.peeked = i;
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0087, code lost:
        if (isLiteral(r11) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0089, code lost:
        if (r6 != 2) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008b, code lost:
        if (r7 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0091, code lost:
        if (r8 != Long.MIN_VALUE) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0093, code lost:
        if (r10 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0097, code lost:
        if (r8 != 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0099, code lost:
        if (r10 != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009b, code lost:
        if (r10 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x009e, code lost:
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x009f, code lost:
        r16.peekedLong = r8;
        r16.buffer.skip(r5);
        r16.peeked = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ab, code lost:
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ac, code lost:
        if (r6 == 2) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00af, code lost:
        if (r6 == 4) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00b2, code lost:
        if (r6 != 7) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b5, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00b7, code lost:
        r16.peekedNumberLength = r5;
        r16.peeked = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00bd, code lost:
        return 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00be, code lost:
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int peekNumber() throws IOException {
        char c = 1;
        int i = 0;
        long j = 0;
        int i2 = 0;
        char c2 = 0;
        boolean z = true;
        boolean z2 = false;
        while (true) {
            int i3 = i2 + 1;
            if (!this.source.i1(i3)) {
                break;
            }
            byte d2 = this.buffer.d2(i2);
            if (d2 != 43) {
                if (d2 == 69 || d2 == 101) {
                    if (c2 != 2 && c2 != 4) {
                        return i;
                    }
                    c2 = 5;
                } else if (d2 != 45) {
                    if (d2 != 46) {
                        if (d2 < 48 || d2 > 57) {
                            break;
                        } else if (c2 == c || c2 == 0) {
                            j = -(d2 - 48);
                            i = 0;
                            c2 = 2;
                        } else {
                            if (c2 == 2) {
                                if (j == 0) {
                                    return i;
                                }
                                long j2 = (10 * j) - (d2 - 48);
                                int i4 = (j > (-922337203685477580L) ? 1 : (j == (-922337203685477580L) ? 0 : -1));
                                z &= i4 > 0 || (i4 == 0 && j2 < j);
                                j = j2;
                            } else if (c2 == 3) {
                                i = 0;
                                c2 = 4;
                            } else if (c2 == 5 || c2 == 6) {
                                i = 0;
                                c2 = 7;
                            }
                            i = 0;
                        }
                    } else if (c2 != 2) {
                        return i;
                    } else {
                        c2 = 3;
                    }
                } else if (c2 == 0) {
                    c2 = 1;
                    z2 = true;
                } else if (c2 != 5) {
                    return i;
                }
                i2 = i3;
                c = 1;
            } else if (c2 != 5) {
                return i;
            }
            c2 = 6;
            i2 = i3;
            c = 1;
        }
    }

    private char readEscapeCharacter() throws IOException {
        int i;
        int i2;
        if (this.source.i1(1L)) {
            byte readByte = this.buffer.readByte();
            if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
                return (char) readByte;
            }
            if (readByte != 98) {
                if (readByte != 102) {
                    if (readByte != 110) {
                        if (readByte != 114) {
                            if (readByte != 116) {
                                if (readByte != 117) {
                                    if (this.lenient) {
                                        return (char) readByte;
                                    }
                                    StringBuilder G = wo1.G("Invalid escape sequence: \\");
                                    G.append((char) readByte);
                                    throw syntaxError(G.toString());
                                } else if (this.source.i1(4L)) {
                                    char c = 0;
                                    for (int i3 = 0; i3 < 4; i3++) {
                                        byte d2 = this.buffer.d2(i3);
                                        char c2 = (char) (c << 4);
                                        if (d2 < 48 || d2 > 57) {
                                            if (d2 >= 97 && d2 <= 102) {
                                                i = d2 - 97;
                                            } else if (d2 < 65 || d2 > 70) {
                                                StringBuilder G2 = wo1.G("\\u");
                                                G2.append(this.buffer.g(4L));
                                                throw syntaxError(G2.toString());
                                            } else {
                                                i = d2 - 65;
                                            }
                                            i2 = i + 10;
                                        } else {
                                            i2 = d2 - 48;
                                        }
                                        c = (char) (i2 + c2);
                                    }
                                    this.buffer.skip(4L);
                                    return c;
                                } else {
                                    StringBuilder G3 = wo1.G("Unterminated escape sequence at path ");
                                    G3.append(getPath());
                                    throw new EOFException(G3.toString());
                                }
                            }
                            return '\t';
                        }
                        return '\r';
                    }
                    return '\n';
                }
                return '\f';
            }
            return '\b';
        }
        throw syntaxError("Unterminated escape sequence");
    }

    private void skipQuotedValue(vv5 vv5Var) throws IOException {
        while (true) {
            long n0 = this.source.n0(vv5Var);
            if (n0 != -1) {
                if (this.buffer.d2(n0) == 92) {
                    this.buffer.skip(n0 + 1);
                    readEscapeCharacter();
                } else {
                    this.buffer.skip(n0 + 1);
                    return;
                }
            } else {
                throw syntaxError("Unterminated string");
            }
        }
    }

    private boolean skipToEndOfBlockComment() throws IOException {
        uv5 uv5Var = this.source;
        vv5 vv5Var = CLOSING_BLOCK_COMMENT;
        long d0 = uv5Var.d0(vv5Var);
        boolean z = d0 != -1;
        sv5 sv5Var = this.buffer;
        sv5Var.skip(z ? d0 + vv5Var.C3() : sv5Var.z2());
        return z;
    }

    private void skipToEndOfLine() throws IOException {
        long n0 = this.source.n0(LINEFEED_OR_CARRIAGE_RETURN);
        sv5 sv5Var = this.buffer;
        sv5Var.skip(n0 != -1 ? n0 + 1 : sv5Var.z2());
    }

    private void skipUnquotedValue() throws IOException {
        long n0 = this.source.n0(UNQUOTED_STRING_TERMINALS);
        sv5 sv5Var = this.buffer;
        if (n0 == -1) {
            n0 = sv5Var.z2();
        }
        sv5Var.skip(n0);
    }

    @Override // com.squareup.moshi.JsonReader
    public void beginArray() throws IOException {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 3) {
            pushScope(1);
            this.pathIndices[this.stackSize - 1] = 0;
            this.peeked = 0;
            return;
        }
        StringBuilder G = wo1.G("Expected BEGIN_ARRAY but was ");
        G.append(peek());
        G.append(" at path ");
        G.append(getPath());
        throw new JsonDataException(G.toString());
    }

    @Override // com.squareup.moshi.JsonReader
    public void beginObject() throws IOException {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 1) {
            pushScope(3);
            this.peeked = 0;
            return;
        }
        StringBuilder G = wo1.G("Expected BEGIN_OBJECT but was ");
        G.append(peek());
        G.append(" at path ");
        G.append(getPath());
        throw new JsonDataException(G.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.peeked = 0;
        this.scopes[0] = 8;
        this.stackSize = 1;
        this.buffer.d();
        this.source.close();
    }

    @Override // com.squareup.moshi.JsonReader
    public void endArray() throws IOException {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 4) {
            int i2 = this.stackSize - 1;
            this.stackSize = i2;
            int[] iArr = this.pathIndices;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.peeked = 0;
            return;
        }
        StringBuilder G = wo1.G("Expected END_ARRAY but was ");
        G.append(peek());
        G.append(" at path ");
        G.append(getPath());
        throw new JsonDataException(G.toString());
    }

    @Override // com.squareup.moshi.JsonReader
    public void endObject() throws IOException {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 2) {
            int i2 = this.stackSize - 1;
            this.stackSize = i2;
            this.pathNames[i2] = null;
            int[] iArr = this.pathIndices;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.peeked = 0;
            return;
        }
        StringBuilder G = wo1.G("Expected END_OBJECT but was ");
        G.append(peek());
        G.append(" at path ");
        G.append(getPath());
        throw new JsonDataException(G.toString());
    }

    @Override // com.squareup.moshi.JsonReader
    public boolean hasNext() throws IOException {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        return (i == 2 || i == 4 || i == 18) ? false : true;
    }

    @Override // com.squareup.moshi.JsonReader
    public boolean nextBoolean() throws IOException {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 5) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i2 = this.stackSize - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.peeked = 0;
            int[] iArr2 = this.pathIndices;
            int i3 = this.stackSize - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            StringBuilder G = wo1.G("Expected a boolean but was ");
            G.append(peek());
            G.append(" at path ");
            G.append(getPath());
            throw new JsonDataException(G.toString());
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public double nextDouble() throws IOException {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 16) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i2 = this.stackSize - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.peekedLong;
        }
        if (i == 17) {
            this.peekedString = this.buffer.g(this.peekedNumberLength);
        } else if (i == 9) {
            this.peekedString = nextQuotedValue(DOUBLE_QUOTE_OR_SLASH);
        } else if (i == 8) {
            this.peekedString = nextQuotedValue(SINGLE_QUOTE_OR_SLASH);
        } else if (i == 10) {
            this.peekedString = nextUnquotedValue();
        } else if (i != 11) {
            StringBuilder G = wo1.G("Expected a double but was ");
            G.append(peek());
            G.append(" at path ");
            G.append(getPath());
            throw new JsonDataException(G.toString());
        }
        this.peeked = 11;
        try {
            double parseDouble = Double.parseDouble(this.peekedString);
            if (!this.lenient && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
                throw new JsonEncodingException("JSON forbids NaN and infinities: " + parseDouble + " at path " + getPath());
            }
            this.peekedString = null;
            this.peeked = 0;
            int[] iArr2 = this.pathIndices;
            int i3 = this.stackSize - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            StringBuilder G2 = wo1.G("Expected a double but was ");
            G2.append(this.peekedString);
            G2.append(" at path ");
            G2.append(getPath());
            throw new JsonDataException(G2.toString());
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public int nextInt() throws IOException {
        String nextQuotedValue;
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 16) {
            long j = this.peekedLong;
            int i2 = (int) j;
            if (j == i2) {
                this.peeked = 0;
                int[] iArr = this.pathIndices;
                int i3 = this.stackSize - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            StringBuilder G = wo1.G("Expected an int but was ");
            G.append(this.peekedLong);
            G.append(" at path ");
            G.append(getPath());
            throw new JsonDataException(G.toString());
        }
        if (i == 17) {
            this.peekedString = this.buffer.g(this.peekedNumberLength);
        } else if (i == 9 || i == 8) {
            if (i == 9) {
                nextQuotedValue = nextQuotedValue(DOUBLE_QUOTE_OR_SLASH);
            } else {
                nextQuotedValue = nextQuotedValue(SINGLE_QUOTE_OR_SLASH);
            }
            this.peekedString = nextQuotedValue;
            try {
                int parseInt = Integer.parseInt(nextQuotedValue);
                this.peeked = 0;
                int[] iArr2 = this.pathIndices;
                int i4 = this.stackSize - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            StringBuilder G2 = wo1.G("Expected an int but was ");
            G2.append(peek());
            G2.append(" at path ");
            G2.append(getPath());
            throw new JsonDataException(G2.toString());
        }
        this.peeked = 11;
        try {
            double parseDouble = Double.parseDouble(this.peekedString);
            int i5 = (int) parseDouble;
            if (i5 == parseDouble) {
                this.peekedString = null;
                this.peeked = 0;
                int[] iArr3 = this.pathIndices;
                int i6 = this.stackSize - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            StringBuilder G3 = wo1.G("Expected an int but was ");
            G3.append(this.peekedString);
            G3.append(" at path ");
            G3.append(getPath());
            throw new JsonDataException(G3.toString());
        } catch (NumberFormatException unused2) {
            StringBuilder G4 = wo1.G("Expected an int but was ");
            G4.append(this.peekedString);
            G4.append(" at path ");
            G4.append(getPath());
            throw new JsonDataException(G4.toString());
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public long nextLong() throws IOException {
        String nextQuotedValue;
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 16) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i2 = this.stackSize - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.peekedLong;
        }
        if (i == 17) {
            this.peekedString = this.buffer.g(this.peekedNumberLength);
        } else if (i == 9 || i == 8) {
            if (i == 9) {
                nextQuotedValue = nextQuotedValue(DOUBLE_QUOTE_OR_SLASH);
            } else {
                nextQuotedValue = nextQuotedValue(SINGLE_QUOTE_OR_SLASH);
            }
            this.peekedString = nextQuotedValue;
            try {
                long parseLong = Long.parseLong(nextQuotedValue);
                this.peeked = 0;
                int[] iArr2 = this.pathIndices;
                int i3 = this.stackSize - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            StringBuilder G = wo1.G("Expected a long but was ");
            G.append(peek());
            G.append(" at path ");
            G.append(getPath());
            throw new JsonDataException(G.toString());
        }
        this.peeked = 11;
        try {
            long longValueExact = new BigDecimal(this.peekedString).longValueExact();
            this.peekedString = null;
            this.peeked = 0;
            int[] iArr3 = this.pathIndices;
            int i4 = this.stackSize - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return longValueExact;
        } catch (ArithmeticException | NumberFormatException unused2) {
            StringBuilder G2 = wo1.G("Expected a long but was ");
            G2.append(this.peekedString);
            G2.append(" at path ");
            G2.append(getPath());
            throw new JsonDataException(G2.toString());
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public String nextName() throws IOException {
        String str;
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 14) {
            str = nextUnquotedValue();
        } else if (i == 13) {
            str = nextQuotedValue(DOUBLE_QUOTE_OR_SLASH);
        } else if (i == 12) {
            str = nextQuotedValue(SINGLE_QUOTE_OR_SLASH);
        } else if (i == 15) {
            str = this.peekedString;
            this.peekedString = null;
        } else {
            StringBuilder G = wo1.G("Expected a name but was ");
            G.append(peek());
            G.append(" at path ");
            G.append(getPath());
            throw new JsonDataException(G.toString());
        }
        this.peeked = 0;
        this.pathNames[this.stackSize - 1] = str;
        return str;
    }

    @Override // com.squareup.moshi.JsonReader
    @Nullable
    public <T> T nextNull() throws IOException {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 7) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i2 = this.stackSize - 1;
            iArr[i2] = iArr[i2] + 1;
            return null;
        }
        StringBuilder G = wo1.G("Expected null but was ");
        G.append(peek());
        G.append(" at path ");
        G.append(getPath());
        throw new JsonDataException(G.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00ba  */
    @Override // com.squareup.moshi.JsonReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public uv5 nextSource() throws IOException {
        vv5 vv5Var;
        int i;
        int i2 = this.peeked;
        if (i2 == 0) {
            i2 = doPeek();
        }
        sv5 sv5Var = new sv5();
        vv5 vv5Var2 = JsonValueSource.STATE_END_OF_JSON;
        if (i2 == 3) {
            sv5Var.K0("[");
            vv5Var = JsonValueSource.STATE_JSON;
        } else if (i2 == 1) {
            sv5Var.K0("{");
            vv5Var = JsonValueSource.STATE_JSON;
        } else {
            if (i2 == 9) {
                sv5Var.K0("\"");
                vv5Var2 = JsonValueSource.STATE_DOUBLE_QUOTED;
            } else if (i2 == 8) {
                sv5Var.K0("'");
                vv5Var2 = JsonValueSource.STATE_SINGLE_QUOTED;
            } else if (i2 == 17 || i2 == 16 || i2 == 10) {
                sv5Var.K0(nextString());
            } else if (i2 == 5) {
                sv5Var.K0("true");
            } else if (i2 == 6) {
                sv5Var.K0("false");
            } else if (i2 == 7) {
                sv5Var.K0(pg1.d);
            } else if (i2 == 11) {
                String nextString = nextString();
                JsonWriter of = JsonWriter.of(sv5Var);
                try {
                    of.value(nextString);
                    of.close();
                } catch (Throwable th) {
                    if (of != null) {
                        try {
                            of.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } else {
                StringBuilder G = wo1.G("Expected a value but was ");
                G.append(peek());
                G.append(" at path ");
                G.append(getPath());
                throw new JsonDataException(G.toString());
            }
            vv5Var = vv5Var2;
            i = 0;
            if (this.peeked != 0) {
                int[] iArr = this.pathIndices;
                int i3 = this.stackSize - 1;
                iArr[i3] = iArr[i3] + 1;
                this.peeked = 0;
            }
            this.valueSource = new JsonValueSource(this.source, sv5Var, vv5Var, i);
            pushScope(9);
            return jw5.d(this.valueSource);
        }
        i = 1;
        if (this.peeked != 0) {
        }
        this.valueSource = new JsonValueSource(this.source, sv5Var, vv5Var, i);
        pushScope(9);
        return jw5.d(this.valueSource);
    }

    @Override // com.squareup.moshi.JsonReader
    public String nextString() throws IOException {
        String g;
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 10) {
            g = nextUnquotedValue();
        } else if (i == 9) {
            g = nextQuotedValue(DOUBLE_QUOTE_OR_SLASH);
        } else if (i == 8) {
            g = nextQuotedValue(SINGLE_QUOTE_OR_SLASH);
        } else if (i == 11) {
            g = this.peekedString;
            this.peekedString = null;
        } else if (i == 16) {
            g = Long.toString(this.peekedLong);
        } else if (i == 17) {
            g = this.buffer.g(this.peekedNumberLength);
        } else {
            StringBuilder G = wo1.G("Expected a string but was ");
            G.append(peek());
            G.append(" at path ");
            G.append(getPath());
            throw new JsonDataException(G.toString());
        }
        this.peeked = 0;
        int[] iArr = this.pathIndices;
        int i2 = this.stackSize - 1;
        iArr[i2] = iArr[i2] + 1;
        return g;
    }

    @Override // com.squareup.moshi.JsonReader
    public JsonReader.Token peek() throws IOException {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        switch (i) {
            case 1:
                return JsonReader.Token.BEGIN_OBJECT;
            case 2:
                return JsonReader.Token.END_OBJECT;
            case 3:
                return JsonReader.Token.BEGIN_ARRAY;
            case 4:
                return JsonReader.Token.END_ARRAY;
            case 5:
            case 6:
                return JsonReader.Token.BOOLEAN;
            case 7:
                return JsonReader.Token.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonReader.Token.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return JsonReader.Token.NAME;
            case 16:
            case 17:
                return JsonReader.Token.NUMBER;
            case 18:
                return JsonReader.Token.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public JsonReader peekJson() {
        return new JsonUtf8Reader(this);
    }

    @Override // com.squareup.moshi.JsonReader
    public void promoteNameToValue() throws IOException {
        if (hasNext()) {
            this.peekedString = nextName();
            this.peeked = 11;
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public int selectName(JsonReader.Options options) throws IOException {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return findName(this.peekedString, options);
        }
        int X1 = this.source.X1(options.doubleQuoteSuffix);
        if (X1 != -1) {
            this.peeked = 0;
            this.pathNames[this.stackSize - 1] = options.strings[X1];
            return X1;
        }
        String str = this.pathNames[this.stackSize - 1];
        String nextName = nextName();
        int findName = findName(nextName, options);
        if (findName == -1) {
            this.peeked = 15;
            this.peekedString = nextName;
            this.pathNames[this.stackSize - 1] = str;
        }
        return findName;
    }

    @Override // com.squareup.moshi.JsonReader
    public int selectString(JsonReader.Options options) throws IOException {
        int[] iArr;
        int i;
        int i2 = this.peeked;
        if (i2 == 0) {
            i2 = doPeek();
        }
        if (i2 < 8 || i2 > 11) {
            return -1;
        }
        if (i2 == 11) {
            return findString(this.peekedString, options);
        }
        int X1 = this.source.X1(options.doubleQuoteSuffix);
        if (X1 != -1) {
            this.peeked = 0;
            int[] iArr2 = this.pathIndices;
            int i3 = this.stackSize - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return X1;
        }
        String nextString = nextString();
        int findString = findString(nextString, options);
        if (findString == -1) {
            this.peeked = 11;
            this.peekedString = nextString;
            this.pathIndices[this.stackSize - 1] = iArr[i] - 1;
        }
        return findString;
    }

    @Override // com.squareup.moshi.JsonReader
    public void skipName() throws IOException {
        if (!this.failOnUnknown) {
            int i = this.peeked;
            if (i == 0) {
                i = doPeek();
            }
            if (i == 14) {
                skipUnquotedValue();
            } else if (i == 13) {
                skipQuotedValue(DOUBLE_QUOTE_OR_SLASH);
            } else if (i == 12) {
                skipQuotedValue(SINGLE_QUOTE_OR_SLASH);
            } else if (i != 15) {
                StringBuilder G = wo1.G("Expected a name but was ");
                G.append(peek());
                G.append(" at path ");
                G.append(getPath());
                throw new JsonDataException(G.toString());
            }
            this.peeked = 0;
            this.pathNames[this.stackSize - 1] = pg1.d;
            return;
        }
        JsonReader.Token peek = peek();
        nextName();
        throw new JsonDataException("Cannot skip unexpected " + peek + " at " + getPath());
    }

    @Override // com.squareup.moshi.JsonReader
    public void skipValue() throws IOException {
        if (!this.failOnUnknown) {
            int i = 0;
            do {
                int i2 = this.peeked;
                if (i2 == 0) {
                    i2 = doPeek();
                }
                if (i2 == 3) {
                    pushScope(1);
                } else if (i2 == 1) {
                    pushScope(3);
                } else {
                    if (i2 == 4) {
                        i--;
                        if (i >= 0) {
                            this.stackSize--;
                        } else {
                            StringBuilder G = wo1.G("Expected a value but was ");
                            G.append(peek());
                            G.append(" at path ");
                            G.append(getPath());
                            throw new JsonDataException(G.toString());
                        }
                    } else if (i2 == 2) {
                        i--;
                        if (i >= 0) {
                            this.stackSize--;
                        } else {
                            StringBuilder G2 = wo1.G("Expected a value but was ");
                            G2.append(peek());
                            G2.append(" at path ");
                            G2.append(getPath());
                            throw new JsonDataException(G2.toString());
                        }
                    } else if (i2 == 14 || i2 == 10) {
                        skipUnquotedValue();
                    } else if (i2 == 9 || i2 == 13) {
                        skipQuotedValue(DOUBLE_QUOTE_OR_SLASH);
                    } else if (i2 == 8 || i2 == 12) {
                        skipQuotedValue(SINGLE_QUOTE_OR_SLASH);
                    } else if (i2 == 17) {
                        this.buffer.skip(this.peekedNumberLength);
                    } else if (i2 == 18) {
                        StringBuilder G3 = wo1.G("Expected a value but was ");
                        G3.append(peek());
                        G3.append(" at path ");
                        G3.append(getPath());
                        throw new JsonDataException(G3.toString());
                    }
                    this.peeked = 0;
                }
                i++;
                this.peeked = 0;
            } while (i != 0);
            int[] iArr = this.pathIndices;
            int i3 = this.stackSize;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.pathNames[i3 - 1] = pg1.d;
            return;
        }
        StringBuilder G4 = wo1.G("Cannot skip unexpected ");
        G4.append(peek());
        G4.append(" at ");
        G4.append(getPath());
        throw new JsonDataException(G4.toString());
    }

    public String toString() {
        StringBuilder G = wo1.G("JsonReader(");
        G.append(this.source);
        G.append(")");
        return G.toString();
    }

    public JsonUtf8Reader(JsonUtf8Reader jsonUtf8Reader) {
        super(jsonUtf8Reader);
        this.peeked = 0;
        uv5 p = jsonUtf8Reader.source.p();
        this.source = p;
        this.buffer = p.o();
        this.peeked = jsonUtf8Reader.peeked;
        this.peekedLong = jsonUtf8Reader.peekedLong;
        this.peekedNumberLength = jsonUtf8Reader.peekedNumberLength;
        this.peekedString = jsonUtf8Reader.peekedString;
        try {
            p.P1(jsonUtf8Reader.buffer.z2());
        } catch (IOException unused) {
            throw new AssertionError();
        }
    }
}