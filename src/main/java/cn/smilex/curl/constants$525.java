// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$525 {

    static final FunctionDescriptor EnableMouseInPointer$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle EnableMouseInPointer$MH = RuntimeHelper.downcallHandle(
        "EnableMouseInPointer",
        constants$525.EnableMouseInPointer$FUNC
    );
    static final FunctionDescriptor IsMouseInPointerEnabled$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle IsMouseInPointerEnabled$MH = RuntimeHelper.downcallHandle(
        "IsMouseInPointerEnabled",
        constants$525.IsMouseInPointerEnabled$FUNC
    );
    static final FunctionDescriptor EnableMouseInPointerForThread$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle EnableMouseInPointerForThread$MH = RuntimeHelper.downcallHandle(
        "EnableMouseInPointerForThread",
        constants$525.EnableMouseInPointerForThread$FUNC
    );
    static final FunctionDescriptor RegisterTouchHitTestingWindow$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RegisterTouchHitTestingWindow$MH = RuntimeHelper.downcallHandle(
        "RegisterTouchHitTestingWindow",
        constants$525.RegisterTouchHitTestingWindow$FUNC
    );
    static final FunctionDescriptor EvaluateProximityToRect$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EvaluateProximityToRect$MH = RuntimeHelper.downcallHandle(
        "EvaluateProximityToRect",
        constants$525.EvaluateProximityToRect$FUNC
    );
    static final FunctionDescriptor EvaluateProximityToPolygon$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EvaluateProximityToPolygon$MH = RuntimeHelper.downcallHandle(
        "EvaluateProximityToPolygon",
        constants$525.EvaluateProximityToPolygon$FUNC
    );
}

