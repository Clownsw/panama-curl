// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1307 {

    static final FunctionDescriptor OleTranslateAccelerator$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OleTranslateAccelerator$MH = RuntimeHelper.downcallHandle(
        "OleTranslateAccelerator",
        constants$1307.OleTranslateAccelerator$FUNC
    );
    static final FunctionDescriptor OleDuplicateData$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle OleDuplicateData$MH = RuntimeHelper.downcallHandle(
        "OleDuplicateData",
        constants$1307.OleDuplicateData$FUNC
    );
    static final FunctionDescriptor OleDraw$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OleDraw$MH = RuntimeHelper.downcallHandle(
        "OleDraw",
        constants$1307.OleDraw$FUNC
    );
    static final FunctionDescriptor OleRun$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OleRun$MH = RuntimeHelper.downcallHandle(
        "OleRun",
        constants$1307.OleRun$FUNC
    );
    static final FunctionDescriptor OleIsRunning$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OleIsRunning$MH = RuntimeHelper.downcallHandle(
        "OleIsRunning",
        constants$1307.OleIsRunning$FUNC
    );
    static final FunctionDescriptor OleLockRunning$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle OleLockRunning$MH = RuntimeHelper.downcallHandle(
        "OleLockRunning",
        constants$1307.OleLockRunning$FUNC
    );
}


