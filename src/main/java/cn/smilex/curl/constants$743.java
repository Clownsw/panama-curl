// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$743 {

    static final FunctionDescriptor I_RpcStopMonitorAssociation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcStopMonitorAssociation$MH = RuntimeHelper.downcallHandle(
        "I_RpcStopMonitorAssociation",
        constants$743.I_RpcStopMonitorAssociation$FUNC
    );
    static final FunctionDescriptor I_RpcGetCurrentCallHandle$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle I_RpcGetCurrentCallHandle$MH = RuntimeHelper.downcallHandle(
        "I_RpcGetCurrentCallHandle",
        constants$743.I_RpcGetCurrentCallHandle$FUNC
    );
    static final FunctionDescriptor I_RpcGetAssociationContext$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcGetAssociationContext$MH = RuntimeHelper.downcallHandle(
        "I_RpcGetAssociationContext",
        constants$743.I_RpcGetAssociationContext$FUNC
    );
    static final FunctionDescriptor I_RpcGetServerContextList$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcGetServerContextList$MH = RuntimeHelper.downcallHandle(
        "I_RpcGetServerContextList",
        constants$743.I_RpcGetServerContextList$FUNC
    );
    static final FunctionDescriptor I_RpcSetServerContextList$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcSetServerContextList$MH = RuntimeHelper.downcallHandle(
        "I_RpcSetServerContextList",
        constants$743.I_RpcSetServerContextList$FUNC
    );
    static final FunctionDescriptor I_RpcNsInterfaceExported$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcNsInterfaceExported$MH = RuntimeHelper.downcallHandle(
        "I_RpcNsInterfaceExported",
        constants$743.I_RpcNsInterfaceExported$FUNC
    );
}


