// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$368 {

    static final FunctionDescriptor FindFirstStreamTransactedW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FindFirstStreamTransactedW$MH = RuntimeHelper.downcallHandle(
        "FindFirstStreamTransactedW",
        constants$368.FindFirstStreamTransactedW$FUNC
    );
    static final FunctionDescriptor FindFirstFileNameTransactedW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FindFirstFileNameTransactedW$MH = RuntimeHelper.downcallHandle(
        "FindFirstFileNameTransactedW",
        constants$368.FindFirstFileNameTransactedW$FUNC
    );
    static final FunctionDescriptor CreateNamedPipeA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateNamedPipeA$MH = RuntimeHelper.downcallHandle(
        "CreateNamedPipeA",
        constants$368.CreateNamedPipeA$FUNC
    );
    static final FunctionDescriptor GetNamedPipeHandleStateA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetNamedPipeHandleStateA$MH = RuntimeHelper.downcallHandle(
        "GetNamedPipeHandleStateA",
        constants$368.GetNamedPipeHandleStateA$FUNC
    );
    static final FunctionDescriptor CallNamedPipeA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CallNamedPipeA$MH = RuntimeHelper.downcallHandle(
        "CallNamedPipeA",
        constants$368.CallNamedPipeA$FUNC
    );
    static final FunctionDescriptor WaitNamedPipeA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WaitNamedPipeA$MH = RuntimeHelper.downcallHandle(
        "WaitNamedPipeA",
        constants$368.WaitNamedPipeA$FUNC
    );
}

