// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$709 {

    static final FunctionDescriptor joyGetPos$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle joyGetPos$MH = RuntimeHelper.downcallHandle(
        "joyGetPos",
        constants$709.joyGetPos$FUNC
    );
    static final FunctionDescriptor joyGetThreshold$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle joyGetThreshold$MH = RuntimeHelper.downcallHandle(
        "joyGetThreshold",
        constants$709.joyGetThreshold$FUNC
    );
    static final FunctionDescriptor joyReleaseCapture$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle joyReleaseCapture$MH = RuntimeHelper.downcallHandle(
        "joyReleaseCapture",
        constants$709.joyReleaseCapture$FUNC
    );
    static final FunctionDescriptor joySetCapture$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle joySetCapture$MH = RuntimeHelper.downcallHandle(
        "joySetCapture",
        constants$709.joySetCapture$FUNC
    );
    static final FunctionDescriptor joySetThreshold$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle joySetThreshold$MH = RuntimeHelper.downcallHandle(
        "joySetThreshold",
        constants$709.joySetThreshold$FUNC
    );
    static final FunctionDescriptor joyConfigChanged$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle joyConfigChanged$MH = RuntimeHelper.downcallHandle(
        "joyConfigChanged",
        constants$709.joyConfigChanged$FUNC
    );
}


