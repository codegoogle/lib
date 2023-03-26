package com.p7700g.p99005;

import com.anythink.expressad.foundation.c.d;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: RequiresOptIn.kt */
@Target({ElementType.ANNOTATION_TYPE})
@vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/p7700g/p99005/g2;", "", "Lcom/p7700g/p99005/g2$a;", d.a.w, "()Lcom/p7700g/p99005/g2$a;", "<init>", "(Lcom/p7700g/p99005/g2$a;)V", "a", "annotation-experimental_release"}, k = 1, mv = {1, 4, 2})
@kr4(allowedTargets = {gr4.t})
@Retention(RetentionPolicy.CLASS)
@jr4(fr4.BINARY)
/* loaded from: classes.dex */
public @interface g2 {

    /* compiled from: RequiresOptIn.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/p7700g/p99005/g2$a", "", "Lcom/p7700g/p99005/g2$a;", "<init>", "(Ljava/lang/String;I)V", "WARNING", "ERROR", "annotation-experimental_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public enum a {
        WARNING,
        ERROR
    }

    a level() default a.ERROR;
}