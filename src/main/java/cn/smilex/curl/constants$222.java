// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$222 {

    static final FunctionDescriptor IsThreadAFiber$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle IsThreadAFiber$MH = RuntimeHelper.downcallHandle(
        "IsThreadAFiber",
        constants$222.IsThreadAFiber$FUNC
    );
    static final FunctionDescriptor CreatePipe$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreatePipe$MH = RuntimeHelper.downcallHandle(
        "CreatePipe",
        constants$222.CreatePipe$FUNC
    );
    static final FunctionDescriptor ConnectNamedPipe$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ConnectNamedPipe$MH = RuntimeHelper.downcallHandle(
        "ConnectNamedPipe",
        constants$222.ConnectNamedPipe$FUNC
    );
    static final FunctionDescriptor DisconnectNamedPipe$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DisconnectNamedPipe$MH = RuntimeHelper.downcallHandle(
        "DisconnectNamedPipe",
        constants$222.DisconnectNamedPipe$FUNC
    );
    static final FunctionDescriptor SetNamedPipeHandleState$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetNamedPipeHandleState$MH = RuntimeHelper.downcallHandle(
        "SetNamedPipeHandleState",
        constants$222.SetNamedPipeHandleState$FUNC
    );
    static final FunctionDescriptor PeekNamedPipe$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PeekNamedPipe$MH = RuntimeHelper.downcallHandle(
        "PeekNamedPipe",
        constants$222.PeekNamedPipe$FUNC
    );
}

