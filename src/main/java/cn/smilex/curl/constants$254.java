// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$254 {

    static final FunctionDescriptor GetProcessInformation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetProcessInformation$MH = RuntimeHelper.downcallHandle(
        "GetProcessInformation",
        constants$254.GetProcessInformation$FUNC
    );
    static final FunctionDescriptor GetSystemCpuSetInformation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetSystemCpuSetInformation$MH = RuntimeHelper.downcallHandle(
        "GetSystemCpuSetInformation",
        constants$254.GetSystemCpuSetInformation$FUNC
    );
    static final FunctionDescriptor GetProcessDefaultCpuSets$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetProcessDefaultCpuSets$MH = RuntimeHelper.downcallHandle(
        "GetProcessDefaultCpuSets",
        constants$254.GetProcessDefaultCpuSets$FUNC
    );
    static final FunctionDescriptor SetProcessDefaultCpuSets$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetProcessDefaultCpuSets$MH = RuntimeHelper.downcallHandle(
        "SetProcessDefaultCpuSets",
        constants$254.SetProcessDefaultCpuSets$FUNC
    );
    static final FunctionDescriptor GetThreadSelectedCpuSets$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetThreadSelectedCpuSets$MH = RuntimeHelper.downcallHandle(
        "GetThreadSelectedCpuSets",
        constants$254.GetThreadSelectedCpuSets$FUNC
    );
    static final FunctionDescriptor SetThreadSelectedCpuSets$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetThreadSelectedCpuSets$MH = RuntimeHelper.downcallHandle(
        "SetThreadSelectedCpuSets",
        constants$254.SetThreadSelectedCpuSets$FUNC
    );
}

