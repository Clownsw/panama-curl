// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$524 {

    static final FunctionDescriptor UnregisterPointerInputTarget$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle UnregisterPointerInputTarget$MH = RuntimeHelper.downcallHandle(
        "UnregisterPointerInputTarget",
        constants$524.UnregisterPointerInputTarget$FUNC
    );
    static final FunctionDescriptor RegisterPointerInputTargetEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RegisterPointerInputTargetEx$MH = RuntimeHelper.downcallHandle(
        "RegisterPointerInputTargetEx",
        constants$524.RegisterPointerInputTargetEx$FUNC
    );
    static final FunctionDescriptor UnregisterPointerInputTargetEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle UnregisterPointerInputTargetEx$MH = RuntimeHelper.downcallHandle(
        "UnregisterPointerInputTargetEx",
        constants$524.UnregisterPointerInputTargetEx$FUNC
    );
    static final FunctionDescriptor CreateSyntheticPointerDevice$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateSyntheticPointerDevice$MH = RuntimeHelper.downcallHandle(
        "CreateSyntheticPointerDevice",
        constants$524.CreateSyntheticPointerDevice$FUNC
    );
    static final FunctionDescriptor InjectSyntheticPointerInput$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle InjectSyntheticPointerInput$MH = RuntimeHelper.downcallHandle(
        "InjectSyntheticPointerInput",
        constants$524.InjectSyntheticPointerInput$FUNC
    );
    static final FunctionDescriptor DestroySyntheticPointerDevice$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DestroySyntheticPointerDevice$MH = RuntimeHelper.downcallHandle(
        "DestroySyntheticPointerDevice",
        constants$524.DestroySyntheticPointerDevice$FUNC
    );
}


