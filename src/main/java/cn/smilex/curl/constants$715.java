// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$715 {

    static final FunctionDescriptor RpcMgmtInqComTimeout$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcMgmtInqComTimeout$MH = RuntimeHelper.downcallHandle(
        "RpcMgmtInqComTimeout",
        constants$715.RpcMgmtInqComTimeout$FUNC
    );
    static final FunctionDescriptor RpcMgmtSetComTimeout$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RpcMgmtSetComTimeout$MH = RuntimeHelper.downcallHandle(
        "RpcMgmtSetComTimeout",
        constants$715.RpcMgmtSetComTimeout$FUNC
    );
    static final FunctionDescriptor RpcMgmtSetCancelTimeout$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RpcMgmtSetCancelTimeout$MH = RuntimeHelper.downcallHandle(
        "RpcMgmtSetCancelTimeout",
        constants$715.RpcMgmtSetCancelTimeout$FUNC
    );
    static final FunctionDescriptor RpcNetworkInqProtseqsA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcNetworkInqProtseqsA$MH = RuntimeHelper.downcallHandle(
        "RpcNetworkInqProtseqsA",
        constants$715.RpcNetworkInqProtseqsA$FUNC
    );
    static final FunctionDescriptor RpcNetworkInqProtseqsW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcNetworkInqProtseqsW$MH = RuntimeHelper.downcallHandle(
        "RpcNetworkInqProtseqsW",
        constants$715.RpcNetworkInqProtseqsW$FUNC
    );
    static final FunctionDescriptor RpcObjectInqType$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcObjectInqType$MH = RuntimeHelper.downcallHandle(
        "RpcObjectInqType",
        constants$715.RpcObjectInqType$FUNC
    );
}


