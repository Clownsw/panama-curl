// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$735 {

    static final FunctionDescriptor RpcMgmtEpEltInqNextW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcMgmtEpEltInqNextW$MH = RuntimeHelper.downcallHandle(
        "RpcMgmtEpEltInqNextW",
        constants$735.RpcMgmtEpEltInqNextW$FUNC
    );
    static final FunctionDescriptor RpcMgmtEpUnregister$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcMgmtEpUnregister$MH = RuntimeHelper.downcallHandle(
        "RpcMgmtEpUnregister",
        constants$735.RpcMgmtEpUnregister$FUNC
    );
    static final FunctionDescriptor RPC_MGMT_AUTHORIZATION_FN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RPC_MGMT_AUTHORIZATION_FN$MH = RuntimeHelper.downcallHandle(
        constants$735.RPC_MGMT_AUTHORIZATION_FN$FUNC
    );
    static final FunctionDescriptor RpcMgmtSetAuthorizationFn$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcMgmtSetAuthorizationFn$MH = RuntimeHelper.downcallHandle(
        "RpcMgmtSetAuthorizationFn",
        constants$735.RpcMgmtSetAuthorizationFn$FUNC
    );
    static final FunctionDescriptor RpcExceptionFilter$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RpcExceptionFilter$MH = RuntimeHelper.downcallHandle(
        "RpcExceptionFilter",
        constants$735.RpcExceptionFilter$FUNC
    );
}


