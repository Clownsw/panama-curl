// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$252 {

    static final FunctionDescriptor GetCurrentProcessorNumberEx$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCurrentProcessorNumberEx$MH = RuntimeHelper.downcallHandle(
        "GetCurrentProcessorNumberEx",
        constants$252.GetCurrentProcessorNumberEx$FUNC
    );
    static final FunctionDescriptor GetProcessPriorityBoost$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetProcessPriorityBoost$MH = RuntimeHelper.downcallHandle(
        "GetProcessPriorityBoost",
        constants$252.GetProcessPriorityBoost$FUNC
    );
    static final FunctionDescriptor SetProcessPriorityBoost$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetProcessPriorityBoost$MH = RuntimeHelper.downcallHandle(
        "SetProcessPriorityBoost",
        constants$252.SetProcessPriorityBoost$FUNC
    );
    static final FunctionDescriptor GetThreadIOPendingFlag$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetThreadIOPendingFlag$MH = RuntimeHelper.downcallHandle(
        "GetThreadIOPendingFlag",
        constants$252.GetThreadIOPendingFlag$FUNC
    );
    static final FunctionDescriptor GetSystemTimes$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetSystemTimes$MH = RuntimeHelper.downcallHandle(
        "GetSystemTimes",
        constants$252.GetSystemTimes$FUNC
    );
    static final FunctionDescriptor GetThreadInformation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetThreadInformation$MH = RuntimeHelper.downcallHandle(
        "GetThreadInformation",
        constants$252.GetThreadInformation$FUNC
    );
}


