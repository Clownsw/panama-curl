// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$334 {

    static final FunctionDescriptor SetCommState$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetCommState$MH = RuntimeHelper.downcallHandle(
        "SetCommState",
        constants$334.SetCommState$FUNC
    );
    static final FunctionDescriptor SetCommTimeouts$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetCommTimeouts$MH = RuntimeHelper.downcallHandle(
        "SetCommTimeouts",
        constants$334.SetCommTimeouts$FUNC
    );
    static final FunctionDescriptor TransmitCommChar$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle TransmitCommChar$MH = RuntimeHelper.downcallHandle(
        "TransmitCommChar",
        constants$334.TransmitCommChar$FUNC
    );
    static final FunctionDescriptor WaitCommEvent$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WaitCommEvent$MH = RuntimeHelper.downcallHandle(
        "WaitCommEvent",
        constants$334.WaitCommEvent$FUNC
    );
    static final FunctionDescriptor OpenCommPort$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle OpenCommPort$MH = RuntimeHelper.downcallHandle(
        "OpenCommPort",
        constants$334.OpenCommPort$FUNC
    );
    static final FunctionDescriptor GetCommPorts$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCommPorts$MH = RuntimeHelper.downcallHandle(
        "GetCommPorts",
        constants$334.GetCommPorts$FUNC
    );
}

