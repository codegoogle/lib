package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import com.anythink.core.api.ATAdConst;
import com.p7700g.p99005.rs2;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Objects;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Buffer.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002Ù\u0001B\b¢\u0006\u0005\bä\u0001\u0010sJ'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u0017J\u000f\u0010\u001c\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u001c\u0010\u0017J\u000f\u0010\u001d\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0001H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0005H\u0016¢\u0006\u0004\b%\u0010&J+\u0010)\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u00182\b\b\u0002\u0010(\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b)\u0010*J'\u0010+\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u00002\b\b\u0002\u0010(\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b+\u0010,J\u001f\u0010-\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u00002\b\b\u0002\u0010(\u001a\u00020\u0007¢\u0006\u0004\b-\u0010.J!\u0010/\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u00182\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b/\u00100J\u0015\u00101\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b1\u00102J\u001d\u00103\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\u0007¢\u0006\u0004\b5\u00106J\u000f\u00108\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109J\u0018\u0010;\u001a\u0002072\u0006\u0010:\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0004\b;\u0010<J\u000f\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u0007H\u0016¢\u0006\u0004\bC\u00106J\u000f\u0010D\u001a\u00020=H\u0016¢\u0006\u0004\bD\u0010?J\u000f\u0010E\u001a\u00020@H\u0016¢\u0006\u0004\bE\u0010BJ\u000f\u0010F\u001a\u00020\u0007H\u0016¢\u0006\u0004\bF\u00106J\u000f\u0010G\u001a\u00020\u0007H\u0016¢\u0006\u0004\bG\u00106J\u000f\u0010H\u001a\u00020\u0007H\u0016¢\u0006\u0004\bH\u00106J\u000f\u0010I\u001a\u00020\u0010H\u0016¢\u0006\u0004\bI\u0010JJ\u0017\u0010K\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\bK\u0010LJ\u0017\u0010O\u001a\u00020@2\u0006\u0010N\u001a\u00020MH\u0016¢\u0006\u0004\bO\u0010PJ\u001f\u0010R\u001a\u00020\u000b2\u0006\u0010Q\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\bR\u0010SJ\u0017\u0010U\u001a\u00020\u00072\u0006\u0010Q\u001a\u00020TH\u0016¢\u0006\u0004\bU\u0010VJ\u000f\u0010W\u001a\u00020\u000eH\u0016¢\u0006\u0004\bW\u0010XJ\u0017\u0010Y\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\bY\u0010ZJ\u0017\u0010]\u001a\u00020\u000e2\u0006\u0010\\\u001a\u00020[H\u0016¢\u0006\u0004\b]\u0010^J\u001f\u0010_\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\\\u001a\u00020[H\u0016¢\u0006\u0004\b_\u0010`J\u0011\u0010a\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\ba\u0010XJ\u000f\u0010b\u001a\u00020\u000eH\u0016¢\u0006\u0004\bb\u0010XJ\u0017\u0010d\u001a\u00020\u000e2\u0006\u0010c\u001a\u00020\u0007H\u0016¢\u0006\u0004\bd\u0010ZJ\u000f\u0010e\u001a\u00020@H\u0016¢\u0006\u0004\be\u0010BJ\u000f\u0010g\u001a\u00020fH\u0016¢\u0006\u0004\bg\u0010hJ\u0017\u0010i\u001a\u00020f2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\bi\u0010jJ\u0017\u0010k\u001a\u00020@2\u0006\u0010Q\u001a\u00020fH\u0016¢\u0006\u0004\bk\u0010lJ\u0017\u0010m\u001a\u00020\u000b2\u0006\u0010Q\u001a\u00020fH\u0016¢\u0006\u0004\bm\u0010nJ'\u0010k\u001a\u00020@2\u0006\u0010Q\u001a\u00020f2\u0006\u0010(\u001a\u00020@2\u0006\u0010\b\u001a\u00020@H\u0016¢\u0006\u0004\bk\u0010oJ\u0017\u0010k\u001a\u00020@2\u0006\u0010Q\u001a\u00020pH\u0016¢\u0006\u0004\bk\u0010qJ\r\u0010r\u001a\u00020\u000b¢\u0006\u0004\br\u0010sJ\u0017\u0010t\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\bt\u0010 J\u0017\u0010v\u001a\u00020\u00002\u0006\u0010u\u001a\u00020\u0010H\u0016¢\u0006\u0004\bv\u0010wJ'\u0010x\u001a\u00020\u00002\u0006\u0010u\u001a\u00020\u00102\u0006\u0010(\u001a\u00020@2\u0006\u0010\b\u001a\u00020@H\u0016¢\u0006\u0004\bx\u0010yJ\u0017\u0010{\u001a\u00020\u00002\u0006\u0010z\u001a\u00020\u000eH\u0016¢\u0006\u0004\b{\u0010|J(\u0010\u007f\u001a\u00020\u00002\u0006\u0010z\u001a\u00020\u000e2\u0006\u0010}\u001a\u00020@2\u0006\u0010~\u001a\u00020@H\u0016¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u001b\u0010\u0082\u0001\u001a\u00020\u00002\u0007\u0010\u0081\u0001\u001a\u00020@H\u0016¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\"\u0010\u0084\u0001\u001a\u00020\u00002\u0006\u0010z\u001a\u00020\u000e2\u0006\u0010\\\u001a\u00020[H\u0016¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J2\u0010\u0086\u0001\u001a\u00020\u00002\u0006\u0010z\u001a\u00020\u000e2\u0006\u0010}\u001a\u00020@2\u0006\u0010~\u001a\u00020@2\u0006\u0010\\\u001a\u00020[H\u0016¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u001b\u0010\u0089\u0001\u001a\u00020\u00002\u0007\u0010\u0088\u0001\u001a\u00020fH\u0016¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J+\u0010\u008b\u0001\u001a\u00020\u00002\u0007\u0010\u0088\u0001\u001a\u00020f2\u0006\u0010(\u001a\u00020@2\u0006\u0010\b\u001a\u00020@H\u0016¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u001a\u0010\u008d\u0001\u001a\u00020@2\u0007\u0010\u0088\u0001\u001a\u00020pH\u0016¢\u0006\u0005\b\u008d\u0001\u0010qJ\u001c\u0010\u008f\u0001\u001a\u00020\u00072\b\u0010\u0088\u0001\u001a\u00030\u008e\u0001H\u0016¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J$\u0010\u0091\u0001\u001a\u00020\u00002\b\u0010\u0088\u0001\u001a\u00030\u008e\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u001b\u0010\u0094\u0001\u001a\u00020\u00002\u0007\u0010\u0093\u0001\u001a\u00020@H\u0016¢\u0006\u0006\b\u0094\u0001\u0010\u0083\u0001J\u001b\u0010\u0096\u0001\u001a\u00020\u00002\u0007\u0010\u0095\u0001\u001a\u00020@H\u0016¢\u0006\u0006\b\u0096\u0001\u0010\u0083\u0001J\u001b\u0010\u0097\u0001\u001a\u00020\u00002\u0007\u0010\u0095\u0001\u001a\u00020@H\u0016¢\u0006\u0006\b\u0097\u0001\u0010\u0083\u0001J\u001b\u0010\u0099\u0001\u001a\u00020\u00002\u0007\u0010\u0098\u0001\u001a\u00020@H\u0016¢\u0006\u0006\b\u0099\u0001\u0010\u0083\u0001J\u001b\u0010\u009a\u0001\u001a\u00020\u00002\u0007\u0010\u0098\u0001\u001a\u00020@H\u0016¢\u0006\u0006\b\u009a\u0001\u0010\u0083\u0001J\u001b\u0010\u009c\u0001\u001a\u00020\u00002\u0007\u0010\u009b\u0001\u001a\u00020\u0007H\u0016¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J\u001b\u0010\u009e\u0001\u001a\u00020\u00002\u0007\u0010\u009b\u0001\u001a\u00020\u0007H\u0016¢\u0006\u0006\b\u009e\u0001\u0010\u009d\u0001J\u001b\u0010\u009f\u0001\u001a\u00020\u00002\u0007\u0010\u009b\u0001\u001a\u00020\u0007H\u0016¢\u0006\u0006\b\u009f\u0001\u0010\u009d\u0001J\u001b\u0010 \u0001\u001a\u00020\u00002\u0007\u0010\u009b\u0001\u001a\u00020\u0007H\u0016¢\u0006\u0006\b \u0001\u0010\u009d\u0001J\u001c\u0010£\u0001\u001a\u00030¢\u00012\u0007\u0010¡\u0001\u001a\u00020@H\u0000¢\u0006\u0006\b£\u0001\u0010¤\u0001J\"\u0010\u008d\u0001\u001a\u00020\u000b2\u0007\u0010\u0088\u0001\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0005\b\u008d\u0001\u0010SJ \u0010k\u001a\u00020\u00072\u0006\u0010Q\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0005\bk\u0010¥\u0001J\u001b\u0010¦\u0001\u001a\u00020\u00072\u0007\u0010\u0093\u0001\u001a\u000207H\u0016¢\u0006\u0006\b¦\u0001\u0010§\u0001J$\u0010©\u0001\u001a\u00020\u00072\u0007\u0010\u0093\u0001\u001a\u0002072\u0007\u0010¨\u0001\u001a\u00020\u0007H\u0016¢\u0006\u0006\b©\u0001\u0010ª\u0001J-\u0010¬\u0001\u001a\u00020\u00072\u0007\u0010\u0093\u0001\u001a\u0002072\u0007\u0010¨\u0001\u001a\u00020\u00072\u0007\u0010«\u0001\u001a\u00020\u0007H\u0016¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001J\u001b\u0010¯\u0001\u001a\u00020\u00072\u0007\u0010®\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0006\b¯\u0001\u0010°\u0001J$\u0010\u0098\u0001\u001a\u00020\u00072\u0007\u0010®\u0001\u001a\u00020\u00102\u0007\u0010¨\u0001\u001a\u00020\u0007H\u0016¢\u0006\u0006\b\u0098\u0001\u0010±\u0001J\u001b\u0010³\u0001\u001a\u00020\u00072\u0007\u0010²\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0006\b³\u0001\u0010°\u0001J$\u0010´\u0001\u001a\u00020\u00072\u0007\u0010²\u0001\u001a\u00020\u00102\u0007\u0010¨\u0001\u001a\u00020\u0007H\u0016¢\u0006\u0006\b´\u0001\u0010±\u0001J#\u0010µ\u0001\u001a\u00020\t2\u0006\u0010(\u001a\u00020\u00072\u0007\u0010®\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0006\bµ\u0001\u0010¶\u0001J4\u0010¸\u0001\u001a\u00020\t2\u0006\u0010(\u001a\u00020\u00072\u0007\u0010®\u0001\u001a\u00020\u00102\u0007\u0010·\u0001\u001a\u00020@2\u0006\u0010\b\u001a\u00020@H\u0016¢\u0006\u0006\b¸\u0001\u0010¹\u0001J\u0011\u0010º\u0001\u001a\u00020\u000bH\u0016¢\u0006\u0005\bº\u0001\u0010sJ\u0011\u0010»\u0001\u001a\u00020\tH\u0016¢\u0006\u0005\b»\u0001\u0010\u001eJ\u0011\u0010¼\u0001\u001a\u00020\u000bH\u0016¢\u0006\u0005\b¼\u0001\u0010sJ\u0013\u0010¾\u0001\u001a\u00030½\u0001H\u0016¢\u0006\u0006\b¾\u0001\u0010¿\u0001J\u000f\u0010À\u0001\u001a\u00020\u0010¢\u0006\u0005\bÀ\u0001\u0010JJ\u000f\u0010Á\u0001\u001a\u00020\u0010¢\u0006\u0005\bÁ\u0001\u0010JJ\u000f\u0010Â\u0001\u001a\u00020\u0010¢\u0006\u0005\bÂ\u0001\u0010JJ\u000f\u0010Ã\u0001\u001a\u00020\u0010¢\u0006\u0005\bÃ\u0001\u0010JJ\u0018\u0010Ä\u0001\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0006\bÄ\u0001\u0010Å\u0001J\u0018\u0010Æ\u0001\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0006\bÆ\u0001\u0010Å\u0001J\u0018\u0010Ç\u0001\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0006\bÇ\u0001\u0010Å\u0001J\u001f\u0010Ê\u0001\u001a\u00020\t2\n\u0010É\u0001\u001a\u0005\u0018\u00010È\u0001H\u0096\u0002¢\u0006\u0006\bÊ\u0001\u0010Ë\u0001J\u0011\u0010Ì\u0001\u001a\u00020@H\u0016¢\u0006\u0005\bÌ\u0001\u0010BJ\u0011\u0010Í\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0005\bÍ\u0001\u0010XJ\u000f\u0010Î\u0001\u001a\u00020\u0000¢\u0006\u0005\bÎ\u0001\u0010\u0017J\u0011\u0010Ï\u0001\u001a\u00020\u0000H\u0016¢\u0006\u0005\bÏ\u0001\u0010\u0017J\u000f\u0010Ð\u0001\u001a\u00020\u0010¢\u0006\u0005\bÐ\u0001\u0010JJ\u0018\u0010Ñ\u0001\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020@¢\u0006\u0006\bÑ\u0001\u0010Ò\u0001J\u001f\u0010Õ\u0001\u001a\u00030Ó\u00012\n\b\u0002\u0010Ô\u0001\u001a\u00030Ó\u0001H\u0007¢\u0006\u0006\bÕ\u0001\u0010Ö\u0001J\u001f\u0010×\u0001\u001a\u00030Ó\u00012\n\b\u0002\u0010Ô\u0001\u001a\u00030Ó\u0001H\u0007¢\u0006\u0006\b×\u0001\u0010Ö\u0001J\u001a\u0010Ù\u0001\u001a\u0002072\u0007\u0010Ø\u0001\u001a\u00020\u0007H\u0007¢\u0006\u0005\bÙ\u0001\u0010<J\u0011\u0010\u0093\u0001\u001a\u00020\u0007H\u0007¢\u0006\u0005\b\u0093\u0001\u00106R\u0018\u0010Û\u0001\u001a\u00020\u00008V@\u0016X\u0096\u0004¢\u0006\u0007\u001a\u0005\bÚ\u0001\u0010\u0017R\u001c\u0010Ý\u0001\u001a\u0005\u0018\u00010¢\u00018\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010Ü\u0001R0\u0010ã\u0001\u001a\u00020\u00072\u0007\u0010Þ\u0001\u001a\u00020\u00078G@@X\u0086\u000e¢\u0006\u0016\n\u0006\bß\u0001\u0010à\u0001\u001a\u0005\bá\u0001\u00106\"\u0005\bâ\u0001\u0010 ¨\u0006å\u0001"}, d2 = {"Lcom/p7700g/p99005/sv5;", "Lcom/p7700g/p99005/uv5;", "Lcom/p7700g/p99005/tv5;", "", "Ljava/nio/channels/ByteChannel;", "Ljava/io/InputStream;", "input", "", "byteCount", "", "forever", "Lcom/p7700g/p99005/yq4;", "q2", "(Ljava/io/InputStream;JZ)V", "", "algorithm", "Lcom/p7700g/p99005/vv5;", "a2", "(Ljava/lang/String;)Lcom/p7700g/p99005/vv5;", "key", "e2", "(Ljava/lang/String;Lcom/p7700g/p99005/vv5;)Lcom/p7700g/p99005/vv5;", "n", "()Lcom/p7700g/p99005/sv5;", "Ljava/io/OutputStream;", "S1", "()Ljava/io/OutputStream;", "c2", "b2", "f0", "()Z", "P1", "(J)V", "i1", "(J)Z", "p", "()Lcom/p7700g/p99005/uv5;", "W1", "()Ljava/io/InputStream;", "out", "offset", "P", "(Ljava/io/OutputStream;JJ)Lcom/p7700g/p99005/sv5;", "X", "(Lcom/p7700g/p99005/sv5;JJ)Lcom/p7700g/p99005/sv5;", "U", "(Lcom/p7700g/p99005/sv5;J)Lcom/p7700g/p99005/sv5;", "e3", "(Ljava/io/OutputStream;J)Lcom/p7700g/p99005/sv5;", "o2", "(Ljava/io/InputStream;)Lcom/p7700g/p99005/sv5;", com.anythink.core.common.g.c.U, "(Ljava/io/InputStream;J)Lcom/p7700g/p99005/sv5;", "f", "()J", "", "readByte", "()B", "pos", com.anythink.expressad.foundation.g.a.O, "(J)B", "", "readShort", "()S", "", "readInt", "()I", "readLong", "z1", "o1", AFHydra.STATUS_CONNECTED, "q0", "V1", "f1", "()Lcom/p7700g/p99005/vv5;", "D", "(J)Lcom/p7700g/p99005/vv5;", "Lcom/p7700g/p99005/mw5;", "options", "X1", "(Lcom/p7700g/p99005/mw5;)I", "sink", "l0", "(Lcom/p7700g/p99005/sv5;J)V", "Lcom/p7700g/p99005/vw5;", "F1", "(Lcom/p7700g/p99005/vw5;)J", "u1", "()Ljava/lang/String;", com.anythink.basead.d.g.i, "(J)Ljava/lang/String;", "Ljava/nio/charset/Charset;", "charset", "R0", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "x1", "(JLjava/nio/charset/Charset;)Ljava/lang/String;", "o0", "m1", "limit", "t0", "Y0", "", "b0", "()[B", "r1", "(J)[B", "read", "([B)I", "readFully", "([B)V", "([BII)I", "Ljava/nio/ByteBuffer;", "(Ljava/nio/ByteBuffer;)I", "d", "()V", "skip", "byteString", "F2", "(Lcom/p7700g/p99005/vv5;)Lcom/p7700g/p99005/sv5;", "G2", "(Lcom/p7700g/p99005/vv5;II)Lcom/p7700g/p99005/sv5;", "string", "h3", "(Ljava/lang/String;)Lcom/p7700g/p99005/sv5;", "beginIndex", "endIndex", "i3", "(Ljava/lang/String;II)Lcom/p7700g/p99005/sv5;", "codePoint", "j3", "(I)Lcom/p7700g/p99005/sv5;", "b3", "(Ljava/lang/String;Ljava/nio/charset/Charset;)Lcom/p7700g/p99005/sv5;", "Z2", "(Ljava/lang/String;IILjava/nio/charset/Charset;)Lcom/p7700g/p99005/sv5;", rs2.f.b, "I2", "([B)Lcom/p7700g/p99005/sv5;", "N2", "([BII)Lcom/p7700g/p99005/sv5;", "write", "Lcom/p7700g/p99005/xw5;", "b1", "(Lcom/p7700g/p99005/xw5;)J", "H2", "(Lcom/p7700g/p99005/xw5;J)Lcom/p7700g/p99005/sv5;", "b", "P2", "s", "X2", "Y2", "i", "S2", "T2", com.ironsource.sdk.controller.v.a, "V2", "(J)Lcom/p7700g/p99005/sv5;", "W2", "Q2", "R2", "minimumCapacity", "Lcom/p7700g/p99005/sw5;", "D2", "(I)Lcom/p7700g/p99005/sw5;", "(Lcom/p7700g/p99005/sv5;J)J", "U1", "(B)J", "fromIndex", "k0", "(BJ)J", "toIndex", "m0", "(BJJ)J", "bytes", "d0", "(Lcom/p7700g/p99005/vv5;)J", "(Lcom/p7700g/p99005/vv5;J)J", "targetBytes", "n0", "N1", "Q0", "(JLcom/p7700g/p99005/vv5;)Z", "bytesOffset", "p1", "(JLcom/p7700g/p99005/vv5;II)Z", "flush", "isOpen", com.anythink.expressad.foundation.d.c.cd, "Lcom/p7700g/p99005/zw5;", "timeout", "()Lcom/p7700g/p99005/zw5;", "j2", "w2", "x2", "y2", "f2", "(Lcom/p7700g/p99005/vv5;)Lcom/p7700g/p99005/vv5;", "g2", "i2", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "h", "e", "A2", "C2", "(I)Lcom/p7700g/p99005/vv5;", "Lcom/p7700g/p99005/sv5$a;", "unsafeCursor", "s2", "(Lcom/p7700g/p99005/sv5$a;)Lcom/p7700g/p99005/sv5$a;", "l2", la1.l, "a", ij3.b, "buffer", "Lcom/p7700g/p99005/sw5;", "head", "<set-?>", "t", "J", "z2", qh3.x, ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, "<init>", "okio"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes3.dex */
public final class sv5 implements uv5, tv5, Cloneable, ByteChannel {
    @cz4
    @Nullable
    public sw5 s;
    private long t;

    /* compiled from: Buffer.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b-\u0010\u0011J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R$\u0010 \u001a\u0004\u0018\u00010\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b+\u0010\u0013¨\u0006."}, d2 = {"com/p7700g/p99005/sv5$a", "Ljava/io/Closeable;", "", "d", "()I", "", "offset", "f", "(J)I", "newSize", "e", "(J)J", "minByteCount", "a", "(I)J", "Lcom/p7700g/p99005/yq4;", com.anythink.expressad.foundation.d.c.cd, "()V", "y", AFHydra.STATUS_IDLE, "end", "", "t", "Z", "readWrite", "Lcom/p7700g/p99005/sw5;", "u", "Lcom/p7700g/p99005/sw5;", "b", "()Lcom/p7700g/p99005/sw5;", "h", "(Lcom/p7700g/p99005/sw5;)V", "segment", "", "w", "[B", "data", "Lcom/p7700g/p99005/sv5;", "s", "Lcom/p7700g/p99005/sv5;", "buffer", com.ironsource.sdk.controller.v.a, "J", "x", com.anythink.expressad.foundation.d.c.bR, "<init>", "okio"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes3.dex */
    public static final class a implements Closeable {
        @cz4
        @Nullable
        public sv5 s;
        @cz4
        public boolean t;
        @Nullable
        private sw5 u;
        @cz4
        @Nullable
        public byte[] w;
        @cz4
        public long v = -1;
        @cz4
        public int x = -1;
        @cz4
        public int y = -1;

        public final long a(int i) {
            if (i > 0) {
                if (i <= 8192) {
                    sv5 sv5Var = this.s;
                    if (sv5Var != null) {
                        if (this.t) {
                            long z2 = sv5Var.z2();
                            sw5 D2 = sv5Var.D2(i);
                            int i2 = 8192 - D2.f;
                            D2.f = 8192;
                            long j = i2;
                            sv5Var.v2(z2 + j);
                            h(D2);
                            this.v = z2;
                            this.w = D2.d;
                            this.x = 8192 - i2;
                            this.y = 8192;
                            return j;
                        }
                        throw new IllegalStateException("expandBuffer() only permitted for read/write buffers".toString());
                    }
                    throw new IllegalStateException("not attached to a buffer".toString());
                }
                throw new IllegalArgumentException(wo1.l("minByteCount > Segment.SIZE: ", i).toString());
            }
            throw new IllegalArgumentException(wo1.l("minByteCount <= 0: ", i).toString());
        }

        @Nullable
        public final sw5 b() {
            return this.u;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.s != null) {
                this.s = null;
                h(null);
                this.v = -1L;
                this.w = null;
                this.x = -1;
                this.y = -1;
                return;
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }

        public final int d() {
            long j = this.v;
            sv5 sv5Var = this.s;
            c25.m(sv5Var);
            if (j != sv5Var.z2()) {
                long j2 = this.v;
                return f(j2 == -1 ? 0L : j2 + (this.y - this.x));
            }
            throw new IllegalStateException("no more bytes".toString());
        }

        public final long e(long j) {
            sv5 sv5Var = this.s;
            if (sv5Var != null) {
                if (this.t) {
                    long z2 = sv5Var.z2();
                    int i = 1;
                    int i2 = (j > z2 ? 1 : (j == z2 ? 0 : -1));
                    if (i2 <= 0) {
                        if (j >= 0) {
                            long j2 = z2 - j;
                            while (true) {
                                if (j2 <= 0) {
                                    break;
                                }
                                sw5 sw5Var = sv5Var.s;
                                c25.m(sw5Var);
                                sw5 sw5Var2 = sw5Var.j;
                                c25.m(sw5Var2);
                                int i3 = sw5Var2.f;
                                long j3 = i3 - sw5Var2.e;
                                if (j3 <= j2) {
                                    sv5Var.s = sw5Var2.b();
                                    tw5.d(sw5Var2);
                                    j2 -= j3;
                                } else {
                                    sw5Var2.f = i3 - ((int) j2);
                                    break;
                                }
                            }
                            h(null);
                            this.v = j;
                            this.w = null;
                            this.x = -1;
                            this.y = -1;
                        } else {
                            throw new IllegalArgumentException(wo1.p("newSize < 0: ", j).toString());
                        }
                    } else if (i2 > 0) {
                        long j4 = j - z2;
                        boolean z = true;
                        while (j4 > 0) {
                            sw5 D2 = sv5Var.D2(i);
                            int min = (int) Math.min(j4, 8192 - D2.f);
                            D2.f += min;
                            j4 -= min;
                            if (z) {
                                h(D2);
                                this.v = z2;
                                this.w = D2.d;
                                int i4 = D2.f;
                                this.x = i4 - min;
                                this.y = i4;
                                z = false;
                            }
                            i = 1;
                        }
                    }
                    sv5Var.v2(j);
                    return z2;
                }
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }

        public final int f(long j) {
            sw5 sw5Var;
            sv5 sv5Var = this.s;
            if (sv5Var != null) {
                if (j >= -1 && j <= sv5Var.z2()) {
                    if (j != -1 && j != sv5Var.z2()) {
                        long j2 = 0;
                        long z2 = sv5Var.z2();
                        sw5 sw5Var2 = sv5Var.s;
                        if (b() != null) {
                            long j3 = this.v;
                            int i = this.x;
                            sw5 b = b();
                            c25.m(b);
                            long j4 = j3 - (i - b.e);
                            if (j4 > j) {
                                sw5Var2 = b();
                                z2 = j4;
                                sw5Var = sw5Var2;
                            } else {
                                sw5Var = b();
                                j2 = j4;
                            }
                        } else {
                            sw5Var = sw5Var2;
                        }
                        if (z2 - j > j - j2) {
                            while (true) {
                                c25.m(sw5Var);
                                int i2 = sw5Var.f;
                                int i3 = sw5Var.e;
                                if (j < (i2 - i3) + j2) {
                                    break;
                                }
                                j2 += i2 - i3;
                                sw5Var = sw5Var.i;
                            }
                        } else {
                            while (z2 > j) {
                                c25.m(sw5Var2);
                                sw5Var2 = sw5Var2.j;
                                c25.m(sw5Var2);
                                z2 -= sw5Var2.f - sw5Var2.e;
                            }
                            j2 = z2;
                            sw5Var = sw5Var2;
                        }
                        if (this.t) {
                            c25.m(sw5Var);
                            if (sw5Var.g) {
                                sw5 f = sw5Var.f();
                                if (sv5Var.s == sw5Var) {
                                    sv5Var.s = f;
                                }
                                sw5Var = sw5Var.c(f);
                                sw5 sw5Var3 = sw5Var.j;
                                c25.m(sw5Var3);
                                sw5Var3.b();
                            }
                        }
                        h(sw5Var);
                        this.v = j;
                        c25.m(sw5Var);
                        this.w = sw5Var.d;
                        int i4 = sw5Var.e + ((int) (j - j2));
                        this.x = i4;
                        int i5 = sw5Var.f;
                        this.y = i5;
                        return i5 - i4;
                    }
                    h(null);
                    this.v = j;
                    this.w = null;
                    this.x = -1;
                    this.y = -1;
                    return -1;
                }
                throw new ArrayIndexOutOfBoundsException("offset=" + j + " > size=" + sv5Var.z2());
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }

        public final void h(@Nullable sw5 sw5Var) {
            this.u = sw5Var;
        }
    }

    /* compiled from: Buffer.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"com/p7700g/p99005/sv5$c", "Ljava/io/OutputStream;", "", "b", "Lcom/p7700g/p99005/yq4;", "write", "(I)V", "", "data", "offset", "byteCount", "([BII)V", "flush", "()V", com.anythink.expressad.foundation.d.c.cd, "", "toString", "()Ljava/lang/String;", "okio"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes3.dex */
    public static final class c extends OutputStream {
        public c() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        @NotNull
        public String toString() {
            return sv5.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            sv5.this.g0(i);
        }

        @Override // java.io.OutputStream
        public void write(@NotNull byte[] bArr, int i, int i2) {
            c25.p(bArr, "data");
            sv5.this.V0(bArr, i, i2);
        }
    }

    public static /* synthetic */ sv5 Y1(sv5 sv5Var, sv5 sv5Var2, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        return sv5Var.U(sv5Var2, j);
    }

    public static /* synthetic */ sv5 Z(sv5 sv5Var, OutputStream outputStream, long j, long j2, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = sv5Var.t - j3;
        }
        return sv5Var.P(outputStream, j3, j2);
    }

    public static /* synthetic */ sv5 Z1(sv5 sv5Var, sv5 sv5Var2, long j, long j2, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        return sv5Var.X(sv5Var2, j, j2);
    }

    private final vv5 a2(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        sw5 sw5Var = this.s;
        if (sw5Var != null) {
            byte[] bArr = sw5Var.d;
            int i = sw5Var.e;
            messageDigest.update(bArr, i, sw5Var.f - i);
            sw5 sw5Var2 = sw5Var.i;
            c25.m(sw5Var2);
            while (sw5Var2 != sw5Var) {
                byte[] bArr2 = sw5Var2.d;
                int i2 = sw5Var2.e;
                messageDigest.update(bArr2, i2, sw5Var2.f - i2);
                sw5Var2 = sw5Var2.i;
                c25.m(sw5Var2);
            }
        }
        byte[] digest = messageDigest.digest();
        c25.o(digest, "messageDigest.digest()");
        return new vv5(digest);
    }

    private final vv5 e2(String str, vv5 vv5Var) {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(vv5Var.T(), str));
            sw5 sw5Var = this.s;
            if (sw5Var != null) {
                byte[] bArr = sw5Var.d;
                int i = sw5Var.e;
                mac.update(bArr, i, sw5Var.f - i);
                sw5 sw5Var2 = sw5Var.i;
                c25.m(sw5Var2);
                while (sw5Var2 != sw5Var) {
                    byte[] bArr2 = sw5Var2.d;
                    int i2 = sw5Var2.e;
                    mac.update(bArr2, i2, sw5Var2.f - i2);
                    sw5Var2 = sw5Var2.i;
                    c25.m(sw5Var2);
                }
            }
            byte[] doFinal = mac.doFinal();
            c25.o(doFinal, "mac.doFinal()");
            return new vv5(doFinal);
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static /* synthetic */ sv5 g3(sv5 sv5Var, OutputStream outputStream, long j, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            j = sv5Var.t;
        }
        return sv5Var.e3(outputStream, j);
    }

    public static /* synthetic */ a m2(sv5 sv5Var, a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = new a();
        }
        return sv5Var.l2(aVar);
    }

    private final void q2(InputStream inputStream, long j, boolean z) throws IOException {
        while (true) {
            if (j <= 0 && !z) {
                return;
            }
            sw5 D2 = D2(1);
            int read = inputStream.read(D2.d, D2.f, (int) Math.min(j, 8192 - D2.f));
            if (read == -1) {
                if (D2.e == D2.f) {
                    this.s = D2.b();
                    tw5.d(D2);
                }
                if (!z) {
                    throw new EOFException();
                }
                return;
            }
            D2.f += read;
            long j2 = read;
            this.t += j2;
            j -= j2;
        }
    }

    public static /* synthetic */ a u2(sv5 sv5Var, a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = new a();
        }
        return sv5Var.s2(aVar);
    }

    @gz4
    @NotNull
    public final sv5 A(@NotNull OutputStream outputStream) throws IOException {
        return Z(this, outputStream, 0L, 0L, 6, null);
    }

    @NotNull
    public final vv5 A2() {
        if (z2() <= ((long) Integer.MAX_VALUE)) {
            return C2((int) z2());
        }
        StringBuilder G = wo1.G("size > Int.MAX_VALUE: ");
        G.append(z2());
        throw new IllegalStateException(G.toString().toString());
    }

    @Override // com.p7700g.p99005.uv5
    public long C1() throws EOFException {
        return pv5.j(readLong());
    }

    @NotNull
    public final vv5 C2(int i) {
        if (i == 0) {
            return vv5.t;
        }
        pv5.e(z2(), 0L, i);
        sw5 sw5Var = this.s;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            c25.m(sw5Var);
            int i5 = sw5Var.f;
            int i6 = sw5Var.e;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                sw5Var = sw5Var.i;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i4];
        int[] iArr = new int[i4 * 2];
        sw5 sw5Var2 = this.s;
        int i7 = 0;
        while (i2 < i) {
            c25.m(sw5Var2);
            bArr[i7] = sw5Var2.d;
            i2 += sw5Var2.f - sw5Var2.e;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = sw5Var2.e;
            sw5Var2.g = true;
            i7++;
            sw5Var2 = sw5Var2.i;
        }
        return new uw5(bArr, iArr);
    }

    @Override // com.p7700g.p99005.uv5
    @NotNull
    public vv5 D(long j) throws EOFException {
        if (j >= 0 && j <= ((long) Integer.MAX_VALUE)) {
            if (z2() >= j) {
                if (j >= 4096) {
                    vv5 C2 = C2((int) j);
                    skip(j);
                    return C2;
                }
                return new vv5(r1(j));
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(wo1.p("byteCount: ", j).toString());
    }

    @NotNull
    public final sw5 D2(int i) {
        boolean z = true;
        if ((i < 1 || i > 8192) ? false : false) {
            sw5 sw5Var = this.s;
            if (sw5Var == null) {
                sw5 e = tw5.e();
                this.s = e;
                e.j = e;
                e.i = e;
                return e;
            }
            c25.m(sw5Var);
            sw5 sw5Var2 = sw5Var.j;
            c25.m(sw5Var2);
            return (sw5Var2.f + i > 8192 || !sw5Var2.h) ? sw5Var2.c(tw5.e()) : sw5Var2;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    @gz4
    @NotNull
    public final sv5 E(@NotNull OutputStream outputStream, long j) throws IOException {
        return Z(this, outputStream, j, 0L, 4, null);
    }

    @Override // com.p7700g.p99005.uv5
    public long F1(@NotNull vw5 vw5Var) throws IOException {
        c25.p(vw5Var, "sink");
        long z2 = z2();
        if (z2 > 0) {
            vw5Var.write(this, z2);
        }
        return z2;
    }

    @Override // com.p7700g.p99005.tv5
    @NotNull
    /* renamed from: F2 */
    public sv5 y1(@NotNull vv5 vv5Var) {
        c25.p(vv5Var, "byteString");
        vv5Var.w4(this, 0, vv5Var.C3());
        return this;
    }

    @Override // com.p7700g.p99005.tv5
    @NotNull
    /* renamed from: G2 */
    public sv5 Q(@NotNull vv5 vv5Var, int i, int i2) {
        c25.p(vv5Var, "byteString");
        vv5Var.w4(this, i, i2);
        return this;
    }

    @Override // com.p7700g.p99005.tv5
    @NotNull
    /* renamed from: H2 */
    public sv5 j1(@NotNull xw5 xw5Var, long j) throws IOException {
        c25.p(xw5Var, rs2.f.b);
        while (j > 0) {
            long read = xw5Var.read(this, j);
            if (read == -1) {
                throw new EOFException();
            }
            j -= read;
        }
        return this;
    }

    @Override // com.p7700g.p99005.tv5
    @NotNull
    /* renamed from: I2 */
    public sv5 w1(@NotNull byte[] bArr) {
        c25.p(bArr, rs2.f.b);
        return V0(bArr, 0, bArr.length);
    }

    @Override // com.p7700g.p99005.uv5
    public long N1(@NotNull vv5 vv5Var, long j) {
        int i;
        int i2;
        c25.p(vv5Var, "targetBytes");
        long j2 = 0;
        if (j >= 0) {
            sw5 sw5Var = this.s;
            if (sw5Var != null) {
                if (z2() - j < j) {
                    j2 = z2();
                    while (j2 > j) {
                        sw5Var = sw5Var.j;
                        c25.m(sw5Var);
                        j2 -= sw5Var.f - sw5Var.e;
                    }
                    if (vv5Var.C3() == 2) {
                        byte A = vv5Var.A(0);
                        byte A2 = vv5Var.A(1);
                        while (j2 < z2()) {
                            byte[] bArr = sw5Var.d;
                            i = (int) ((sw5Var.e + j) - j2);
                            int i3 = sw5Var.f;
                            while (i < i3) {
                                byte b2 = bArr[i];
                                if (b2 != A && b2 != A2) {
                                    i++;
                                }
                                i2 = sw5Var.e;
                            }
                            j2 += sw5Var.f - sw5Var.e;
                            sw5Var = sw5Var.i;
                            c25.m(sw5Var);
                            j = j2;
                        }
                        return -1L;
                    }
                    byte[] T = vv5Var.T();
                    while (j2 < z2()) {
                        byte[] bArr2 = sw5Var.d;
                        i = (int) ((sw5Var.e + j) - j2);
                        int i4 = sw5Var.f;
                        while (i < i4) {
                            byte b3 = bArr2[i];
                            for (byte b4 : T) {
                                if (b3 == b4) {
                                    i2 = sw5Var.e;
                                }
                            }
                            i++;
                        }
                        j2 += sw5Var.f - sw5Var.e;
                        sw5Var = sw5Var.i;
                        c25.m(sw5Var);
                        j = j2;
                    }
                    return -1L;
                }
                while (true) {
                    long j3 = (sw5Var.f - sw5Var.e) + j2;
                    if (j3 > j) {
                        break;
                    }
                    sw5Var = sw5Var.i;
                    c25.m(sw5Var);
                    j2 = j3;
                }
                if (vv5Var.C3() == 2) {
                    byte A3 = vv5Var.A(0);
                    byte A4 = vv5Var.A(1);
                    while (j2 < z2()) {
                        byte[] bArr3 = sw5Var.d;
                        i = (int) ((sw5Var.e + j) - j2);
                        int i5 = sw5Var.f;
                        while (i < i5) {
                            byte b5 = bArr3[i];
                            if (b5 != A3 && b5 != A4) {
                                i++;
                            }
                            i2 = sw5Var.e;
                        }
                        j2 += sw5Var.f - sw5Var.e;
                        sw5Var = sw5Var.i;
                        c25.m(sw5Var);
                        j = j2;
                    }
                    return -1L;
                }
                byte[] T2 = vv5Var.T();
                while (j2 < z2()) {
                    byte[] bArr4 = sw5Var.d;
                    i = (int) ((sw5Var.e + j) - j2);
                    int i6 = sw5Var.f;
                    while (i < i6) {
                        byte b6 = bArr4[i];
                        for (byte b7 : T2) {
                            if (b6 == b7) {
                                i2 = sw5Var.e;
                            }
                        }
                        i++;
                    }
                    j2 += sw5Var.f - sw5Var.e;
                    sw5Var = sw5Var.i;
                    c25.m(sw5Var);
                    j = j2;
                }
                return -1L;
                return (i - i2) + j2;
            }
            return -1L;
        }
        throw new IllegalArgumentException(wo1.p("fromIndex < 0: ", j).toString());
    }

    @Override // com.p7700g.p99005.tv5
    @NotNull
    /* renamed from: N2 */
    public sv5 V0(@NotNull byte[] bArr, int i, int i2) {
        c25.p(bArr, rs2.f.b);
        long j = i2;
        pv5.e(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            sw5 D2 = D2(1);
            int min = Math.min(i3 - i, 8192 - D2.f);
            int i4 = i + min;
            zr4.W0(bArr, D2.d, D2.f, i, i4);
            D2.f += min;
            i = i4;
        }
        v2(z2() + j);
        return this;
    }

    @gz4
    @NotNull
    public final sv5 P(@NotNull OutputStream outputStream, long j, long j2) throws IOException {
        int i;
        c25.p(outputStream, "out");
        pv5.e(this.t, j, j2);
        if (j2 == 0) {
            return this;
        }
        sw5 sw5Var = this.s;
        while (true) {
            c25.m(sw5Var);
            int i2 = sw5Var.f;
            int i3 = sw5Var.e;
            if (j < i2 - i3) {
                break;
            }
            j -= i2 - i3;
            sw5Var = sw5Var.i;
        }
        while (j2 > 0) {
            c25.m(sw5Var);
            int min = (int) Math.min(sw5Var.f - i, j2);
            outputStream.write(sw5Var.d, (int) (sw5Var.e + j), min);
            j2 -= min;
            sw5Var = sw5Var.i;
            j = 0;
        }
        return this;
    }

    @Override // com.p7700g.p99005.uv5
    public void P1(long j) throws EOFException {
        if (this.t < j) {
            throw new EOFException();
        }
    }

    @Override // com.p7700g.p99005.tv5
    @NotNull
    /* renamed from: P2 */
    public sv5 g0(int i) {
        sw5 D2 = D2(1);
        byte[] bArr = D2.d;
        int i2 = D2.f;
        D2.f = i2 + 1;
        bArr[i2] = (byte) i;
        v2(z2() + 1);
        return this;
    }

    @Override // com.p7700g.p99005.uv5
    public boolean Q0(long j, @NotNull vv5 vv5Var) {
        c25.p(vv5Var, "bytes");
        return p1(j, vv5Var, 0, vv5Var.C3());
    }

    @Override // com.p7700g.p99005.tv5
    @NotNull
    /* renamed from: Q2 */
    public sv5 Q1(long j) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0) {
            return g0(48);
        }
        boolean z = false;
        int i2 = 1;
        if (i < 0) {
            j = -j;
            if (j < 0) {
                return K0("-9223372036854775808");
            }
            z = true;
        }
        if (j >= 100000000) {
            i2 = j < 1000000000000L ? j < ls5.e ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= gc0.c) {
            i2 = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i2 = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i2 = 2;
        }
        if (z) {
            i2++;
        }
        sw5 D2 = D2(i2);
        byte[] bArr = D2.d;
        int i3 = D2.f + i2;
        while (j != 0) {
            long j2 = 10;
            i3--;
            bArr[i3] = bx5.g0()[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr[i3 - 1] = (byte) 45;
        }
        D2.f += i2;
        v2(z2() + i2);
        return this;
    }

    @Override // com.p7700g.p99005.uv5
    @NotNull
    public String R0(@NotNull Charset charset) {
        c25.p(charset, "charset");
        return x1(this.t, charset);
    }

    @Override // com.p7700g.p99005.tv5
    @NotNull
    /* renamed from: R2 */
    public sv5 e1(long j) {
        if (j == 0) {
            return g0(48);
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        sw5 D2 = D2(i);
        byte[] bArr = D2.d;
        int i2 = D2.f;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = bx5.g0()[(int) (15 & j)];
            j >>>= 4;
        }
        D2.f += i;
        v2(z2() + i);
        return this;
    }

    @Override // com.p7700g.p99005.tv5
    @NotNull
    public OutputStream S1() {
        return new c();
    }

    @Override // com.p7700g.p99005.tv5
    @NotNull
    /* renamed from: S2 */
    public sv5 S(int i) {
        sw5 D2 = D2(4);
        byte[] bArr = D2.d;
        int i2 = D2.f;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        D2.f = i5 + 1;
        v2(z2() + 4);
        return this;
    }

    @Override // com.p7700g.p99005.tv5
    @NotNull
    /* renamed from: T2 */
    public sv5 e0(int i) {
        return S(pv5.i(i));
    }

    @NotNull
    public final sv5 U(@NotNull sv5 sv5Var, long j) {
        c25.p(sv5Var, "out");
        return X(sv5Var, j, this.t - j);
    }

    @Override // com.p7700g.p99005.uv5
    public long U1(byte b2) {
        return m0(b2, 0L, Long.MAX_VALUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a5 A[EDGE_INSN: B:42:0x00a5->B:37:0x00a5 ?: BREAK  , SYNTHETIC] */
    @Override // com.p7700g.p99005.uv5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long V1() throws EOFException {
        int i;
        if (z2() != 0) {
            int i2 = 0;
            boolean z = false;
            long j = 0;
            do {
                sw5 sw5Var = this.s;
                c25.m(sw5Var);
                byte[] bArr = sw5Var.d;
                int i3 = sw5Var.e;
                int i4 = sw5Var.f;
                while (i3 < i4) {
                    byte b2 = bArr[i3];
                    byte b3 = (byte) 48;
                    if (b2 < b3 || b2 > ((byte) 57)) {
                        byte b4 = (byte) 97;
                        if ((b2 >= b4 && b2 <= ((byte) 102)) || (b2 >= (b4 = (byte) 65) && b2 <= ((byte) 70))) {
                            i = (b2 - b4) + 10;
                        } else if (i2 == 0) {
                            StringBuilder G = wo1.G("Expected leading [0-9a-fA-F] character but was 0x");
                            G.append(pv5.o(b2));
                            throw new NumberFormatException(G.toString());
                        } else {
                            z = true;
                            if (i3 != i4) {
                                this.s = sw5Var.b();
                                tw5.d(sw5Var);
                            } else {
                                sw5Var.e = i3;
                            }
                            if (!z) {
                                break;
                            }
                        }
                    } else {
                        i = b2 - b3;
                    }
                    if (((-1152921504606846976L) & j) != 0) {
                        sv5 g0 = new sv5().e1(j).g0(b2);
                        StringBuilder G2 = wo1.G("Number too large: ");
                        G2.append(g0.u1());
                        throw new NumberFormatException(G2.toString());
                    }
                    j = (j << 4) | i;
                    i3++;
                    i2++;
                }
                if (i3 != i4) {
                }
                if (!z) {
                }
            } while (this.s != null);
            v2(z2() - i2);
            return j;
        }
        throw new EOFException();
    }

    @Override // com.p7700g.p99005.tv5
    @NotNull
    /* renamed from: V2 */
    public sv5 O1(long j) {
        sw5 D2 = D2(8);
        byte[] bArr = D2.d;
        int i = D2.f;
        int i2 = i + 1;
        bArr[i] = (byte) ((j >>> 56) & 255);
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((j >>> 48) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((j >>> 40) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((j >>> 32) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((j >>> 24) & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((j >>> 16) & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((j >>> 8) & 255);
        bArr[i8] = (byte) (j & 255);
        D2.f = i8 + 1;
        v2(z2() + 8);
        return this;
    }

    @Override // com.p7700g.p99005.uv5
    @NotNull
    public InputStream W1() {
        return new b();
    }

    @Override // com.p7700g.p99005.tv5
    @NotNull
    /* renamed from: W2 */
    public sv5 V(long j) {
        return O1(pv5.j(j));
    }

    @NotNull
    public final sv5 X(@NotNull sv5 sv5Var, long j, long j2) {
        c25.p(sv5Var, "out");
        pv5.e(z2(), j, j2);
        if (j2 != 0) {
            sv5Var.v2(sv5Var.z2() + j2);
            sw5 sw5Var = this.s;
            while (true) {
                c25.m(sw5Var);
                int i = sw5Var.f;
                int i2 = sw5Var.e;
                if (j < i - i2) {
                    break;
                }
                j -= i - i2;
                sw5Var = sw5Var.i;
            }
            while (j2 > 0) {
                c25.m(sw5Var);
                sw5 d = sw5Var.d();
                int i3 = d.e + ((int) j);
                d.e = i3;
                d.f = Math.min(i3 + ((int) j2), d.f);
                sw5 sw5Var2 = sv5Var.s;
                if (sw5Var2 == null) {
                    d.j = d;
                    d.i = d;
                    sv5Var.s = d;
                } else {
                    c25.m(sw5Var2);
                    sw5 sw5Var3 = sw5Var2.j;
                    c25.m(sw5Var3);
                    sw5Var3.c(d);
                }
                j2 -= d.f - d.e;
                sw5Var = sw5Var.i;
                j = 0;
            }
        }
        return this;
    }

    @Override // com.p7700g.p99005.uv5
    public int X1(@NotNull mw5 mw5Var) {
        c25.p(mw5Var, "options");
        int l0 = bx5.l0(this, mw5Var, false, 2, null);
        if (l0 == -1) {
            return -1;
        }
        skip(mw5Var.d()[l0].C3());
        return l0;
    }

    @Override // com.p7700g.p99005.tv5
    @NotNull
    /* renamed from: X2 */
    public sv5 M(int i) {
        sw5 D2 = D2(2);
        byte[] bArr = D2.d;
        int i2 = D2.f;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        D2.f = i3 + 1;
        v2(z2() + 2);
        return this;
    }

    @Override // com.p7700g.p99005.uv5
    public int Y0() throws EOFException {
        int i;
        int i2;
        int i3;
        if (z2() != 0) {
            byte d2 = d2(0L);
            if ((d2 & g15.b) == 0) {
                i = d2 & g15.c;
                i2 = 1;
                i3 = 0;
            } else if ((d2 & 224) == 192) {
                i = d2 & 31;
                i2 = 2;
                i3 = 128;
            } else if ((d2 & 240) == 224) {
                i = d2 & 15;
                i2 = 3;
                i3 = 2048;
            } else if ((d2 & 248) != 240) {
                skip(1L);
                return ax5.c;
            } else {
                i = d2 & 7;
                i2 = 4;
                i3 = 65536;
            }
            long j = i2;
            if (z2() >= j) {
                for (int i4 = 1; i4 < i2; i4++) {
                    long j2 = i4;
                    byte d22 = d2(j2);
                    if ((d22 & 192) != 128) {
                        skip(j2);
                        return ax5.c;
                    }
                    i = (i << 6) | (d22 & ax5.a);
                }
                skip(j);
                return i > 1114111 ? ax5.c : ((55296 <= i && 57343 >= i) || i < i3) ? ax5.c : i;
            }
            StringBuilder H = wo1.H("size < ", i2, ": ");
            H.append(z2());
            H.append(" (to read code point prefixed 0x");
            H.append(pv5.o(d2));
            H.append(')');
            throw new EOFException(H.toString());
        }
        throw new EOFException();
    }

    @Override // com.p7700g.p99005.tv5
    @NotNull
    /* renamed from: Y2 */
    public sv5 G0(int i) {
        return M(pv5.k((short) i));
    }

    @Override // com.p7700g.p99005.tv5
    @NotNull
    /* renamed from: Z2 */
    public sv5 M1(@NotNull String str, int i, int i2, @NotNull Charset charset) {
        c25.p(str, "string");
        c25.p(charset, "charset");
        if (i >= 0) {
            if (i2 >= i) {
                if (i2 <= str.length()) {
                    if (c25.g(charset, f85.b)) {
                        return a1(str, i, i2);
                    }
                    String substring = str.substring(i, i2);
                    c25.o(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    Objects.requireNonNull(substring, "null cannot be cast to non-null type java.lang.String");
                    byte[] bytes = substring.getBytes(charset);
                    c25.o(bytes, "(this as java.lang.String).getBytes(charset)");
                    return V0(bytes, 0, bytes.length);
                }
                StringBuilder H = wo1.H("endIndex > string.length: ", i2, " > ");
                H.append(str.length());
                throw new IllegalArgumentException(H.toString().toString());
            }
            throw new IllegalArgumentException(wo1.o("endIndex < beginIndex: ", i2, " < ", i).toString());
        }
        throw new IllegalArgumentException(wo1.l("beginIndex < 0: ", i).toString());
    }

    @fz4(name = "-deprecated_getByte")
    @xn4(level = zn4.ERROR, message = "moved to operator function", replaceWith = @op4(expression = "this[index]", imports = {}))
    public final byte a(long j) {
        return d2(j);
    }

    @fz4(name = "-deprecated_size")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, imports = {}))
    public final long b() {
        return this.t;
    }

    @Override // com.p7700g.p99005.uv5
    @NotNull
    public byte[] b0() {
        return r1(z2());
    }

    @Override // com.p7700g.p99005.tv5
    public long b1(@NotNull xw5 xw5Var) throws IOException {
        c25.p(xw5Var, rs2.f.b);
        long j = 0;
        while (true) {
            long read = xw5Var.read(this, 8192);
            if (read == -1) {
                return j;
            }
            j += read;
        }
    }

    @Override // com.p7700g.p99005.tv5
    @NotNull
    /* renamed from: b2 */
    public sv5 L() {
        return this;
    }

    @Override // com.p7700g.p99005.tv5
    @NotNull
    /* renamed from: b3 */
    public sv5 g1(@NotNull String str, @NotNull Charset charset) {
        c25.p(str, "string");
        c25.p(charset, "charset");
        return M1(str, 0, str.length(), charset);
    }

    @Override // com.p7700g.p99005.tv5
    @NotNull
    /* renamed from: c2 */
    public sv5 p0() {
        return this;
    }

    @Override // com.p7700g.p99005.xw5, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final void d() {
        skip(z2());
    }

    @Override // com.p7700g.p99005.uv5
    public long d0(@NotNull vv5 vv5Var) throws IOException {
        c25.p(vv5Var, "bytes");
        return i(vv5Var, 0L);
    }

    @fz4(name = "getByte")
    public final byte d2(long j) {
        pv5.e(z2(), j, 1L);
        sw5 sw5Var = this.s;
        if (sw5Var != null) {
            if (z2() - j < j) {
                long z2 = z2();
                while (z2 > j) {
                    sw5Var = sw5Var.j;
                    c25.m(sw5Var);
                    z2 -= sw5Var.f - sw5Var.e;
                }
                c25.m(sw5Var);
                return sw5Var.d[(int) ((sw5Var.e + j) - z2)];
            }
            long j2 = 0;
            while (true) {
                long j3 = (sw5Var.f - sw5Var.e) + j2;
                if (j3 > j) {
                    c25.m(sw5Var);
                    return sw5Var.d[(int) ((sw5Var.e + j) - j2)];
                }
                sw5Var = sw5Var.i;
                c25.m(sw5Var);
                j2 = j3;
            }
        } else {
            c25.m(null);
            throw null;
        }
    }

    @gz4
    @NotNull
    public final sv5 d3(@NotNull OutputStream outputStream) throws IOException {
        return g3(this, outputStream, 0L, 2, null);
    }

    @NotNull
    /* renamed from: e */
    public sv5 clone() {
        return h();
    }

    @gz4
    @NotNull
    public final sv5 e3(@NotNull OutputStream outputStream, long j) throws IOException {
        c25.p(outputStream, "out");
        pv5.e(this.t, 0L, j);
        sw5 sw5Var = this.s;
        while (j > 0) {
            c25.m(sw5Var);
            int min = (int) Math.min(j, sw5Var.f - sw5Var.e);
            outputStream.write(sw5Var.d, sw5Var.e, min);
            int i = sw5Var.e + min;
            sw5Var.e = i;
            long j2 = min;
            this.t -= j2;
            j -= j2;
            if (i == sw5Var.f) {
                sw5 b2 = sw5Var.b();
                this.s = b2;
                tw5.d(sw5Var);
                sw5Var = b2;
            }
        }
        return this;
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (!(obj instanceof sv5)) {
                return false;
            }
            sv5 sv5Var = (sv5) obj;
            if (z2() != sv5Var.z2()) {
                return false;
            }
            if (z2() != 0) {
                sw5 sw5Var = this.s;
                c25.m(sw5Var);
                sw5 sw5Var2 = sv5Var.s;
                c25.m(sw5Var2);
                int i = sw5Var.e;
                int i2 = sw5Var2.e;
                long j = 0;
                while (j < z2()) {
                    long min = Math.min(sw5Var.f - i, sw5Var2.f - i2);
                    long j2 = 0;
                    while (j2 < min) {
                        int i3 = i + 1;
                        int i4 = i2 + 1;
                        if (sw5Var.d[i] != sw5Var2.d[i2]) {
                            return false;
                        }
                        j2++;
                        i = i3;
                        i2 = i4;
                    }
                    if (i == sw5Var.f) {
                        sw5Var = sw5Var.i;
                        c25.m(sw5Var);
                        i = sw5Var.e;
                    }
                    if (i2 == sw5Var2.f) {
                        sw5Var2 = sw5Var2.i;
                        c25.m(sw5Var2);
                        i2 = sw5Var2.e;
                    }
                    j += min;
                }
            }
        }
        return true;
    }

    public final long f() {
        long z2 = z2();
        if (z2 == 0) {
            return 0L;
        }
        sw5 sw5Var = this.s;
        c25.m(sw5Var);
        sw5 sw5Var2 = sw5Var.j;
        c25.m(sw5Var2);
        int i = sw5Var2.f;
        if (i < 8192 && sw5Var2.h) {
            z2 -= i - sw5Var2.e;
        }
        return z2;
    }

    @Override // com.p7700g.p99005.uv5
    public boolean f0() {
        return this.t == 0;
    }

    @Override // com.p7700g.p99005.uv5
    @NotNull
    public vv5 f1() {
        return D(z2());
    }

    @NotNull
    public final vv5 f2(@NotNull vv5 vv5Var) {
        c25.p(vv5Var, "key");
        return e2("HmacSHA1", vv5Var);
    }

    @Override // com.p7700g.p99005.tv5, com.p7700g.p99005.vw5, java.io.Flushable
    public void flush() {
    }

    @Override // com.p7700g.p99005.uv5
    @NotNull
    public String g(long j) throws EOFException {
        return x1(j, f85.b);
    }

    @NotNull
    public final vv5 g2(@NotNull vv5 vv5Var) {
        c25.p(vv5Var, "key");
        return e2("HmacSHA256", vv5Var);
    }

    @NotNull
    public final sv5 h() {
        sv5 sv5Var = new sv5();
        if (z2() != 0) {
            sw5 sw5Var = this.s;
            c25.m(sw5Var);
            sw5 d = sw5Var.d();
            sv5Var.s = d;
            d.j = d;
            d.i = d;
            for (sw5 sw5Var2 = sw5Var.i; sw5Var2 != sw5Var; sw5Var2 = sw5Var2.i) {
                sw5 sw5Var3 = d.j;
                c25.m(sw5Var3);
                c25.m(sw5Var2);
                sw5Var3.c(sw5Var2.d());
            }
            sv5Var.v2(z2());
        }
        return sv5Var;
    }

    @Override // com.p7700g.p99005.tv5
    @NotNull
    /* renamed from: h3 */
    public sv5 K0(@NotNull String str) {
        c25.p(str, "string");
        return a1(str, 0, str.length());
    }

    public int hashCode() {
        sw5 sw5Var = this.s;
        if (sw5Var != null) {
            int i = 1;
            do {
                int i2 = sw5Var.f;
                for (int i3 = sw5Var.e; i3 < i2; i3++) {
                    i = (i * 31) + sw5Var.d[i3];
                }
                sw5Var = sw5Var.i;
                c25.m(sw5Var);
            } while (sw5Var != this.s);
            return i;
        }
        return 0;
    }

    @Override // com.p7700g.p99005.uv5
    public long i(@NotNull vv5 vv5Var, long j) throws IOException {
        int i;
        c25.p(vv5Var, "bytes");
        if (vv5Var.C3() > 0) {
            long j2 = 0;
            if (j >= 0) {
                sw5 sw5Var = this.s;
                if (sw5Var != null) {
                    if (z2() - j < j) {
                        j2 = z2();
                        while (j2 > j) {
                            sw5Var = sw5Var.j;
                            c25.m(sw5Var);
                            j2 -= sw5Var.f - sw5Var.e;
                        }
                        byte[] T = vv5Var.T();
                        byte b2 = T[0];
                        int C3 = vv5Var.C3();
                        long z2 = (z2() - C3) + 1;
                        while (j2 < z2) {
                            byte[] bArr = sw5Var.d;
                            int min = (int) Math.min(sw5Var.f, (sw5Var.e + z2) - j2);
                            i = (int) ((sw5Var.e + j) - j2);
                            while (i < min) {
                                if (bArr[i] == b2 && bx5.h0(sw5Var, i + 1, T, 1, C3)) {
                                    return (i - sw5Var.e) + j2;
                                }
                                i++;
                            }
                            j2 += sw5Var.f - sw5Var.e;
                            sw5Var = sw5Var.i;
                            c25.m(sw5Var);
                            j = j2;
                        }
                    } else {
                        while (true) {
                            long j3 = (sw5Var.f - sw5Var.e) + j2;
                            if (j3 > j) {
                                break;
                            }
                            sw5Var = sw5Var.i;
                            c25.m(sw5Var);
                            j2 = j3;
                        }
                        byte[] T2 = vv5Var.T();
                        byte b3 = T2[0];
                        int C32 = vv5Var.C3();
                        long z22 = (z2() - C32) + 1;
                        while (j2 < z22) {
                            byte[] bArr2 = sw5Var.d;
                            int min2 = (int) Math.min(sw5Var.f, (sw5Var.e + z22) - j2);
                            i = (int) ((sw5Var.e + j) - j2);
                            while (i < min2) {
                                if (bArr2[i] == b3 && bx5.h0(sw5Var, i + 1, T2, 1, C32)) {
                                    return (i - sw5Var.e) + j2;
                                }
                                i++;
                            }
                            j2 += sw5Var.f - sw5Var.e;
                            sw5Var = sw5Var.i;
                            c25.m(sw5Var);
                            j = j2;
                        }
                    }
                }
                return -1L;
            }
            throw new IllegalArgumentException(wo1.p("fromIndex < 0: ", j).toString());
        }
        throw new IllegalArgumentException("bytes is empty".toString());
    }

    @Override // com.p7700g.p99005.uv5
    public boolean i1(long j) {
        return this.t >= j;
    }

    @NotNull
    public final vv5 i2(@NotNull vv5 vv5Var) {
        c25.p(vv5Var, "key");
        return e2("HmacSHA512", vv5Var);
    }

    @Override // com.p7700g.p99005.tv5
    @NotNull
    /* renamed from: i3 */
    public sv5 a1(@NotNull String str, int i, int i2) {
        char charAt;
        c25.p(str, "string");
        if (i >= 0) {
            if (i2 >= i) {
                if (!(i2 <= str.length())) {
                    StringBuilder H = wo1.H("endIndex > string.length: ", i2, " > ");
                    H.append(str.length());
                    throw new IllegalArgumentException(H.toString().toString());
                }
                while (i < i2) {
                    char charAt2 = str.charAt(i);
                    if (charAt2 < 128) {
                        sw5 D2 = D2(1);
                        byte[] bArr = D2.d;
                        int i3 = D2.f - i;
                        int min = Math.min(i2, 8192 - i3);
                        int i4 = i + 1;
                        bArr[i + i3] = (byte) charAt2;
                        while (true) {
                            i = i4;
                            if (i >= min || (charAt = str.charAt(i)) >= 128) {
                                break;
                            }
                            i4 = i + 1;
                            bArr[i + i3] = (byte) charAt;
                        }
                        int i5 = D2.f;
                        int i6 = (i3 + i) - i5;
                        D2.f = i5 + i6;
                        v2(z2() + i6);
                    } else {
                        if (charAt2 < 2048) {
                            sw5 D22 = D2(2);
                            byte[] bArr2 = D22.d;
                            int i7 = D22.f;
                            bArr2[i7] = (byte) ((charAt2 >> 6) | yg1.K);
                            bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                            D22.f = i7 + 2;
                            v2(z2() + 2);
                        } else if (charAt2 >= 55296 && charAt2 <= 57343) {
                            int i8 = i + 1;
                            char charAt3 = i8 < i2 ? str.charAt(i8) : (char) 0;
                            if (charAt2 <= 56319 && 56320 <= charAt3 && 57343 >= charAt3) {
                                int i9 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                                sw5 D23 = D2(4);
                                byte[] bArr3 = D23.d;
                                int i10 = D23.f;
                                bArr3[i10] = (byte) ((i9 >> 18) | 240);
                                bArr3[i10 + 1] = (byte) (((i9 >> 12) & 63) | 128);
                                bArr3[i10 + 2] = (byte) (((i9 >> 6) & 63) | 128);
                                bArr3[i10 + 3] = (byte) ((i9 & 63) | 128);
                                D23.f = i10 + 4;
                                v2(z2() + 4);
                                i += 2;
                            } else {
                                g0(63);
                                i = i8;
                            }
                        } else {
                            sw5 D24 = D2(3);
                            byte[] bArr4 = D24.d;
                            int i11 = D24.f;
                            bArr4[i11] = (byte) ((charAt2 >> '\f') | 224);
                            bArr4[i11 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                            bArr4[i11 + 2] = (byte) ((charAt2 & '?') | 128);
                            D24.f = i11 + 3;
                            v2(z2() + 3);
                        }
                        i++;
                    }
                }
                return this;
            }
            throw new IllegalArgumentException(wo1.o("endIndex < beginIndex: ", i2, " < ", i).toString());
        }
        throw new IllegalArgumentException(wo1.l("beginIndex < 0: ", i).toString());
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @NotNull
    public final vv5 j2() {
        return a2("MD5");
    }

    @Override // com.p7700g.p99005.tv5
    @NotNull
    /* renamed from: j3 */
    public sv5 O(int i) {
        if (i < 128) {
            g0(i);
        } else if (i < 2048) {
            sw5 D2 = D2(2);
            byte[] bArr = D2.d;
            int i2 = D2.f;
            bArr[i2] = (byte) ((i >> 6) | yg1.K);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            D2.f = i2 + 2;
            v2(z2() + 2);
        } else if (55296 <= i && 57343 >= i) {
            g0(63);
        } else if (i < 65536) {
            sw5 D22 = D2(3);
            byte[] bArr2 = D22.d;
            int i3 = D22.f;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            D22.f = i3 + 3;
            v2(z2() + 3);
        } else if (i <= 1114111) {
            sw5 D23 = D2(4);
            byte[] bArr3 = D23.d;
            int i4 = D23.f;
            bArr3[i4] = (byte) ((i >> 18) | 240);
            bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i4 + 3] = (byte) ((i & 63) | 128);
            D23.f = i4 + 4;
            v2(z2() + 4);
        } else {
            StringBuilder G = wo1.G("Unexpected code point: 0x");
            G.append(pv5.p(i));
            throw new IllegalArgumentException(G.toString());
        }
        return this;
    }

    @Override // com.p7700g.p99005.uv5
    public long k0(byte b2, long j) {
        return m0(b2, j, Long.MAX_VALUE);
    }

    @gz4
    @NotNull
    public final a k2() {
        return m2(this, null, 1, null);
    }

    @Override // com.p7700g.p99005.uv5
    public void l0(@NotNull sv5 sv5Var, long j) throws EOFException {
        c25.p(sv5Var, "sink");
        if (z2() >= j) {
            sv5Var.write(this, j);
        } else {
            sv5Var.write(this, z2());
            throw new EOFException();
        }
    }

    @gz4
    @NotNull
    public final a l2(@NotNull a aVar) {
        c25.p(aVar, "unsafeCursor");
        return bx5.s(this, aVar);
    }

    @Override // com.p7700g.p99005.uv5
    public long m0(byte b2, long j, long j2) {
        sw5 sw5Var;
        int i;
        long j3 = 0;
        if (0 <= j && j2 >= j) {
            if (j2 > z2()) {
                j2 = z2();
            }
            if (j == j2 || (sw5Var = this.s) == null) {
                return -1L;
            }
            if (z2() - j < j) {
                j3 = z2();
                while (j3 > j) {
                    sw5Var = sw5Var.j;
                    c25.m(sw5Var);
                    j3 -= sw5Var.f - sw5Var.e;
                }
                while (j3 < j2) {
                    byte[] bArr = sw5Var.d;
                    int min = (int) Math.min(sw5Var.f, (sw5Var.e + j2) - j3);
                    i = (int) ((sw5Var.e + j) - j3);
                    while (i < min) {
                        if (bArr[i] != b2) {
                            i++;
                        }
                    }
                    j3 += sw5Var.f - sw5Var.e;
                    sw5Var = sw5Var.i;
                    c25.m(sw5Var);
                    j = j3;
                }
                return -1L;
            }
            while (true) {
                long j4 = (sw5Var.f - sw5Var.e) + j3;
                if (j4 > j) {
                    break;
                }
                sw5Var = sw5Var.i;
                c25.m(sw5Var);
                j3 = j4;
            }
            while (j3 < j2) {
                byte[] bArr2 = sw5Var.d;
                int min2 = (int) Math.min(sw5Var.f, (sw5Var.e + j2) - j3);
                i = (int) ((sw5Var.e + j) - j3);
                while (i < min2) {
                    if (bArr2[i] != b2) {
                        i++;
                    }
                }
                j3 += sw5Var.f - sw5Var.e;
                sw5Var = sw5Var.i;
                c25.m(sw5Var);
                j = j3;
            }
            return -1L;
            return (i - sw5Var.e) + j3;
        }
        StringBuilder G = wo1.G("size=");
        G.append(z2());
        G.append(" fromIndex=");
        G.append(j);
        G.append(" toIndex=");
        G.append(j2);
        throw new IllegalArgumentException(G.toString().toString());
    }

    @Override // com.p7700g.p99005.uv5
    @NotNull
    public String m1() throws EOFException {
        return t0(Long.MAX_VALUE);
    }

    @Override // com.p7700g.p99005.uv5
    @NotNull
    public sv5 n() {
        return this;
    }

    @Override // com.p7700g.p99005.uv5
    public long n0(@NotNull vv5 vv5Var) {
        c25.p(vv5Var, "targetBytes");
        return N1(vv5Var, 0L);
    }

    @Override // com.p7700g.p99005.uv5
    @NotNull
    public sv5 o() {
        return this;
    }

    @Override // com.p7700g.p99005.uv5
    @Nullable
    public String o0() throws EOFException {
        long U1 = U1((byte) 10);
        if (U1 != -1) {
            return bx5.i0(this, U1);
        }
        if (z2() != 0) {
            return g(z2());
        }
        return null;
    }

    @Override // com.p7700g.p99005.uv5
    public int o1() throws EOFException {
        return pv5.i(readInt());
    }

    @NotNull
    public final sv5 o2(@NotNull InputStream inputStream) throws IOException {
        c25.p(inputStream, "input");
        q2(inputStream, Long.MAX_VALUE, true);
        return this;
    }

    @Override // com.p7700g.p99005.uv5
    @NotNull
    public uv5 p() {
        return jw5.d(new ow5(this));
    }

    @Override // com.p7700g.p99005.uv5
    public boolean p1(long j, @NotNull vv5 vv5Var, int i, int i2) {
        c25.p(vv5Var, "bytes");
        if (j < 0 || i < 0 || i2 < 0 || z2() - j < i2 || vv5Var.C3() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (d2(i3 + j) != vv5Var.A(i + i3)) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public final sv5 p2(@NotNull InputStream inputStream, long j) throws IOException {
        c25.p(inputStream, "input");
        if (j >= 0) {
            q2(inputStream, j, false);
            return this;
        }
        throw new IllegalArgumentException(wo1.p("byteCount < 0: ", j).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ab A[EDGE_INSN: B:45:0x00ab->B:38:0x00ab ?: BREAK  , SYNTHETIC] */
    @Override // com.p7700g.p99005.uv5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long q0() throws EOFException {
        long j = 0;
        if (z2() != 0) {
            long j2 = -7;
            int i = 0;
            boolean z = false;
            boolean z2 = false;
            do {
                sw5 sw5Var = this.s;
                c25.m(sw5Var);
                byte[] bArr = sw5Var.d;
                int i2 = sw5Var.e;
                int i3 = sw5Var.f;
                while (i2 < i3) {
                    byte b2 = bArr[i2];
                    byte b3 = (byte) 48;
                    if (b2 >= b3 && b2 <= ((byte) 57)) {
                        int i4 = b3 - b2;
                        int i5 = (j > bx5.c ? 1 : (j == bx5.c ? 0 : -1));
                        if (i5 < 0 || (i5 == 0 && i4 < j2)) {
                            sv5 g0 = new sv5().Q1(j).g0(b2);
                            if (!z) {
                                g0.readByte();
                            }
                            StringBuilder G = wo1.G("Number too large: ");
                            G.append(g0.u1());
                            throw new NumberFormatException(G.toString());
                        }
                        j = (j * 10) + i4;
                    } else if (b2 == ((byte) 45) && i == 0) {
                        j2--;
                        z = true;
                    } else if (i == 0) {
                        StringBuilder G2 = wo1.G("Expected leading [0-9] or '-' character but was 0x");
                        G2.append(pv5.o(b2));
                        throw new NumberFormatException(G2.toString());
                    } else {
                        z2 = true;
                        if (i2 != i3) {
                            this.s = sw5Var.b();
                            tw5.d(sw5Var);
                        } else {
                            sw5Var.e = i2;
                        }
                        if (!z2) {
                            break;
                        }
                    }
                    i2++;
                    i++;
                }
                if (i2 != i3) {
                }
                if (!z2) {
                }
            } while (this.s != null);
            v2(z2() - i);
            return z ? j : -j;
        }
        throw new EOFException();
    }

    @Override // com.p7700g.p99005.uv5
    @NotNull
    public byte[] r1(long j) throws EOFException {
        if (j >= 0 && j <= ((long) Integer.MAX_VALUE)) {
            if (z2() >= j) {
                byte[] bArr = new byte[(int) j];
                readFully(bArr);
                return bArr;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(wo1.p("byteCount: ", j).toString());
    }

    @gz4
    @NotNull
    public final a r2() {
        return u2(this, null, 1, null);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(@NotNull ByteBuffer byteBuffer) throws IOException {
        c25.p(byteBuffer, "sink");
        sw5 sw5Var = this.s;
        if (sw5Var != null) {
            int min = Math.min(byteBuffer.remaining(), sw5Var.f - sw5Var.e);
            byteBuffer.put(sw5Var.d, sw5Var.e, min);
            int i = sw5Var.e + min;
            sw5Var.e = i;
            this.t -= min;
            if (i == sw5Var.f) {
                this.s = sw5Var.b();
                tw5.d(sw5Var);
            }
            return min;
        }
        return -1;
    }

    @Override // com.p7700g.p99005.uv5
    public byte readByte() throws EOFException {
        if (z2() != 0) {
            sw5 sw5Var = this.s;
            c25.m(sw5Var);
            int i = sw5Var.e;
            int i2 = sw5Var.f;
            int i3 = i + 1;
            byte b2 = sw5Var.d[i];
            v2(z2() - 1);
            if (i3 == i2) {
                this.s = sw5Var.b();
                tw5.d(sw5Var);
            } else {
                sw5Var.e = i3;
            }
            return b2;
        }
        throw new EOFException();
    }

    @Override // com.p7700g.p99005.uv5
    public void readFully(@NotNull byte[] bArr) throws EOFException {
        c25.p(bArr, "sink");
        int i = 0;
        while (i < bArr.length) {
            int read = read(bArr, i, bArr.length - i);
            if (read == -1) {
                throw new EOFException();
            }
            i += read;
        }
    }

    @Override // com.p7700g.p99005.uv5
    public int readInt() throws EOFException {
        if (z2() >= 4) {
            sw5 sw5Var = this.s;
            c25.m(sw5Var);
            int i = sw5Var.e;
            int i2 = sw5Var.f;
            if (i2 - i < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = sw5Var.d;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
            int i6 = i4 + 1;
            int i7 = i5 | ((bArr[i4] & 255) << 8);
            int i8 = i6 + 1;
            int i9 = i7 | (bArr[i6] & 255);
            v2(z2() - 4);
            if (i8 == i2) {
                this.s = sw5Var.b();
                tw5.d(sw5Var);
            } else {
                sw5Var.e = i8;
            }
            return i9;
        }
        throw new EOFException();
    }

    @Override // com.p7700g.p99005.uv5
    public long readLong() throws EOFException {
        if (z2() >= 8) {
            sw5 sw5Var = this.s;
            c25.m(sw5Var);
            int i = sw5Var.e;
            int i2 = sw5Var.f;
            if (i2 - i < 8) {
                return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
            }
            byte[] bArr = sw5Var.d;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = i4 + 1;
            long j = ((bArr[i] & 255) << 56) | ((bArr[i3] & 255) << 48) | ((bArr[i4] & 255) << 40);
            int i6 = i5 + 1;
            long j2 = ((bArr[i5] & 255) << 32) | j;
            int i7 = i6 + 1;
            int i8 = i7 + 1;
            long j3 = j2 | ((bArr[i6] & 255) << 24) | ((bArr[i7] & 255) << 16);
            int i9 = i8 + 1;
            int i10 = i9 + 1;
            long j4 = j3 | ((bArr[i8] & 255) << 8) | (bArr[i9] & 255);
            v2(z2() - 8);
            if (i10 == i2) {
                this.s = sw5Var.b();
                tw5.d(sw5Var);
            } else {
                sw5Var.e = i10;
            }
            return j4;
        }
        throw new EOFException();
    }

    @Override // com.p7700g.p99005.uv5
    public short readShort() throws EOFException {
        if (z2() >= 2) {
            sw5 sw5Var = this.s;
            c25.m(sw5Var);
            int i = sw5Var.e;
            int i2 = sw5Var.f;
            if (i2 - i < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = sw5Var.d;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            v2(z2() - 2);
            if (i4 == i2) {
                this.s = sw5Var.b();
                tw5.d(sw5Var);
            } else {
                sw5Var.e = i4;
            }
            return (short) i5;
        }
        throw new EOFException();
    }

    @gz4
    @NotNull
    public final a s2(@NotNull a aVar) {
        c25.p(aVar, "unsafeCursor");
        return bx5.F(this, aVar);
    }

    @Override // com.p7700g.p99005.uv5
    public void skip(long j) throws EOFException {
        while (j > 0) {
            sw5 sw5Var = this.s;
            if (sw5Var != null) {
                int min = (int) Math.min(j, sw5Var.f - sw5Var.e);
                long j2 = min;
                v2(z2() - j2);
                j -= j2;
                int i = sw5Var.e + min;
                sw5Var.e = i;
                if (i == sw5Var.f) {
                    this.s = sw5Var.b();
                    tw5.d(sw5Var);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // com.p7700g.p99005.uv5
    @NotNull
    public String t0(long j) throws EOFException {
        if (j >= 0) {
            long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
            byte b2 = (byte) 10;
            long m0 = m0(b2, 0L, j2);
            if (m0 != -1) {
                return bx5.i0(this, m0);
            }
            if (j2 < z2() && d2(j2 - 1) == ((byte) 13) && d2(j2) == b2) {
                return bx5.i0(this, j2);
            }
            sv5 sv5Var = new sv5();
            X(sv5Var, 0L, Math.min(32, z2()));
            StringBuilder G = wo1.G("\\n not found: limit=");
            G.append(Math.min(z2(), j));
            G.append(" content=");
            G.append(sv5Var.f1().H());
            G.append(h95.F);
            throw new EOFException(G.toString());
        }
        throw new IllegalArgumentException(wo1.p("limit < 0: ", j).toString());
    }

    @Override // com.p7700g.p99005.xw5
    @NotNull
    public zw5 timeout() {
        return zw5.a;
    }

    @NotNull
    public String toString() {
        return A2().toString();
    }

    @Override // com.p7700g.p99005.uv5
    @NotNull
    public String u1() {
        return x1(this.t, f85.b);
    }

    public final void v2(long j) {
        this.t = j;
    }

    @NotNull
    public final vv5 w2() {
        return a2("SHA-1");
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(@NotNull ByteBuffer byteBuffer) throws IOException {
        c25.p(byteBuffer, rs2.f.b);
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            sw5 D2 = D2(1);
            int min = Math.min(i, 8192 - D2.f);
            byteBuffer.get(D2.d, D2.f, min);
            i -= min;
            D2.f += min;
        }
        this.t += remaining;
        return remaining;
    }

    @Override // com.p7700g.p99005.uv5
    @NotNull
    public String x1(long j, @NotNull Charset charset) throws EOFException {
        c25.p(charset, "charset");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0 && j <= ((long) Integer.MAX_VALUE)) {
            if (this.t >= j) {
                if (i == 0) {
                    return "";
                }
                sw5 sw5Var = this.s;
                c25.m(sw5Var);
                int i2 = sw5Var.e;
                if (i2 + j > sw5Var.f) {
                    return new String(r1(j), charset);
                }
                int i3 = (int) j;
                String str = new String(sw5Var.d, i2, i3, charset);
                int i4 = sw5Var.e + i3;
                sw5Var.e = i4;
                this.t -= j;
                if (i4 == sw5Var.f) {
                    this.s = sw5Var.b();
                    tw5.d(sw5Var);
                }
                return str;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(wo1.p("byteCount: ", j).toString());
    }

    @NotNull
    public final vv5 x2() {
        return a2("SHA-256");
    }

    @NotNull
    public final vv5 y2() {
        return a2("SHA-512");
    }

    @Override // com.p7700g.p99005.uv5
    public short z1() throws EOFException {
        return pv5.k(readShort());
    }

    @fz4(name = ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE)
    public final long z2() {
        return this.t;
    }

    /* compiled from: Buffer.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"com/p7700g/p99005/sv5$b", "Ljava/io/InputStream;", "", "read", "()I", "", "sink", "offset", "byteCount", "([BII)I", "available", "Lcom/p7700g/p99005/yq4;", com.anythink.expressad.foundation.d.c.cd, "()V", "", "toString", "()Ljava/lang/String;", "okio"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes3.dex */
    public static final class b extends InputStream {
        public b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(sv5.this.z2(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            if (sv5.this.z2() > 0) {
                return sv5.this.readByte() & 255;
            }
            return -1;
        }

        @NotNull
        public String toString() {
            return sv5.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(@NotNull byte[] bArr, int i, int i2) {
            c25.p(bArr, "sink");
            return sv5.this.read(bArr, i, i2);
        }
    }

    @Override // com.p7700g.p99005.vw5
    public void write(@NotNull sv5 sv5Var, long j) {
        sw5 sw5Var;
        sw5 sw5Var2;
        c25.p(sv5Var, rs2.f.b);
        if (sv5Var != this) {
            pv5.e(sv5Var.z2(), 0L, j);
            while (j > 0) {
                sw5 sw5Var3 = sv5Var.s;
                c25.m(sw5Var3);
                int i = sw5Var3.f;
                c25.m(sv5Var.s);
                if (j < i - sw5Var.e) {
                    sw5 sw5Var4 = this.s;
                    if (sw5Var4 != null) {
                        c25.m(sw5Var4);
                        sw5Var2 = sw5Var4.j;
                    } else {
                        sw5Var2 = null;
                    }
                    if (sw5Var2 != null && sw5Var2.h) {
                        if ((sw5Var2.f + j) - (sw5Var2.g ? 0 : sw5Var2.e) <= 8192) {
                            sw5 sw5Var5 = sv5Var.s;
                            c25.m(sw5Var5);
                            sw5Var5.g(sw5Var2, (int) j);
                            sv5Var.v2(sv5Var.z2() - j);
                            v2(z2() + j);
                            return;
                        }
                    }
                    sw5 sw5Var6 = sv5Var.s;
                    c25.m(sw5Var6);
                    sv5Var.s = sw5Var6.e((int) j);
                }
                sw5 sw5Var7 = sv5Var.s;
                c25.m(sw5Var7);
                long j2 = sw5Var7.f - sw5Var7.e;
                sv5Var.s = sw5Var7.b();
                sw5 sw5Var8 = this.s;
                if (sw5Var8 == null) {
                    this.s = sw5Var7;
                    sw5Var7.j = sw5Var7;
                    sw5Var7.i = sw5Var7;
                } else {
                    c25.m(sw5Var8);
                    sw5 sw5Var9 = sw5Var8.j;
                    c25.m(sw5Var9);
                    sw5Var9.c(sw5Var7).a();
                }
                sv5Var.v2(sv5Var.z2() - j2);
                v2(z2() + j2);
                j -= j2;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    @Override // com.p7700g.p99005.uv5
    public int read(@NotNull byte[] bArr) {
        c25.p(bArr, "sink");
        return read(bArr, 0, bArr.length);
    }

    @Override // com.p7700g.p99005.uv5
    public int read(@NotNull byte[] bArr, int i, int i2) {
        c25.p(bArr, "sink");
        pv5.e(bArr.length, i, i2);
        sw5 sw5Var = this.s;
        if (sw5Var != null) {
            int min = Math.min(i2, sw5Var.f - sw5Var.e);
            byte[] bArr2 = sw5Var.d;
            int i3 = sw5Var.e;
            zr4.W0(bArr2, bArr, i, i3, i3 + min);
            sw5Var.e += min;
            v2(z2() - min);
            if (sw5Var.e == sw5Var.f) {
                this.s = sw5Var.b();
                tw5.d(sw5Var);
                return min;
            }
            return min;
        }
        return -1;
    }

    @Override // com.p7700g.p99005.xw5
    public long read(@NotNull sv5 sv5Var, long j) {
        c25.p(sv5Var, "sink");
        if (j >= 0) {
            if (z2() == 0) {
                return -1L;
            }
            if (j > z2()) {
                j = z2();
            }
            sv5Var.write(this, j);
            return j;
        }
        throw new IllegalArgumentException(wo1.p("byteCount < 0: ", j).toString());
    }
}