package com.p7700g.p99005;

import com.p7700g.p99005.ie;

/* compiled from: TransitionBuilder.java */
/* loaded from: classes.dex */
public class ne {
    private static final String a = "TransitionBuilder";

    public static ie.b a(ie scene, int transitionId, int startConstraintSetId, af startConstraintSet, int endConstraintSetId, af endConstraintSet) {
        ie.b bVar = new ie.b(transitionId, scene, startConstraintSetId, endConstraintSetId);
        b(scene, bVar, startConstraintSet, endConstraintSet);
        return bVar;
    }

    private static void b(ie scene, ie.b transition, af startConstraintSet, af endConstraintSet) {
        int I = transition.I();
        int B = transition.B();
        scene.j0(I, startConstraintSet);
        scene.j0(B, endConstraintSet);
    }

    public static void c(ge layout) {
        ie ieVar = layout.R0;
        if (ieVar != null) {
            if (ieVar.s0(layout)) {
                if (ieVar.E == null || ieVar.s().isEmpty()) {
                    throw new RuntimeException("Invalid motion layout. Motion Scene doesn't have any transition.");
                }
                return;
            }
            throw new RuntimeException("MotionLayout doesn't have the right motion scene.");
        }
        throw new RuntimeException("Invalid motion layout. Layout missing Motion Scene.");
    }
}