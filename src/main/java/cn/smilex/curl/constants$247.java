// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$247 {

    static final FunctionDescriptor OpenThreadToken$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OpenThreadToken$MH = RuntimeHelper.downcallHandle(
        "OpenThreadToken",
        constants$247.OpenThreadToken$FUNC
    );
    static final FunctionDescriptor SetPriorityClass$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetPriorityClass$MH = RuntimeHelper.downcallHandle(
        "SetPriorityClass",
        constants$247.SetPriorityClass$FUNC
    );
    static final FunctionDescriptor GetPriorityClass$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetPriorityClass$MH = RuntimeHelper.downcallHandle(
        "GetPriorityClass",
        constants$247.GetPriorityClass$FUNC
    );
    static final FunctionDescriptor SetThreadStackGuarantee$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetThreadStackGuarantee$MH = RuntimeHelper.downcallHandle(
        "SetThreadStackGuarantee",
        constants$247.SetThreadStackGuarantee$FUNC
    );
    static final FunctionDescriptor ProcessIdToSessionId$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ProcessIdToSessionId$MH = RuntimeHelper.downcallHandle(
        "ProcessIdToSessionId",
        constants$247.ProcessIdToSessionId$FUNC
    );
    static final FunctionDescriptor GetProcessId$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetProcessId$MH = RuntimeHelper.downcallHandle(
        "GetProcessId",
        constants$247.GetProcessId$FUNC
    );
}

