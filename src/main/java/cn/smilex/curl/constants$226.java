// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$226 {

    static final FunctionDescriptor HeapSetInformation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle HeapSetInformation$MH = RuntimeHelper.downcallHandle(
        "HeapSetInformation",
        constants$226.HeapSetInformation$FUNC
    );
    static final FunctionDescriptor HeapValidate$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle HeapValidate$MH = RuntimeHelper.downcallHandle(
        "HeapValidate",
        constants$226.HeapValidate$FUNC
    );
    static final FunctionDescriptor HeapSummary$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle HeapSummary$MH = RuntimeHelper.downcallHandle(
        "HeapSummary",
        constants$226.HeapSummary$FUNC
    );
    static final FunctionDescriptor GetProcessHeaps$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetProcessHeaps$MH = RuntimeHelper.downcallHandle(
        "GetProcessHeaps",
        constants$226.GetProcessHeaps$FUNC
    );
    static final FunctionDescriptor HeapLock$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle HeapLock$MH = RuntimeHelper.downcallHandle(
        "HeapLock",
        constants$226.HeapLock$FUNC
    );
    static final FunctionDescriptor HeapUnlock$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle HeapUnlock$MH = RuntimeHelper.downcallHandle(
        "HeapUnlock",
        constants$226.HeapUnlock$FUNC
    );
}


