// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$726 {

    static final FunctionDescriptor RPC_NEW_HTTP_PROXY_CHANNEL$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RPC_NEW_HTTP_PROXY_CHANNEL$MH = RuntimeHelper.downcallHandle(
        constants$726.RPC_NEW_HTTP_PROXY_CHANNEL$FUNC
    );
    static final FunctionDescriptor RPC_HTTP_PROXY_FREE_STRING$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RPC_HTTP_PROXY_FREE_STRING$MH = RuntimeHelper.downcallHandle(
        constants$726.RPC_HTTP_PROXY_FREE_STRING$FUNC
    );
    static final FunctionDescriptor RpcImpersonateClient$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcImpersonateClient$MH = RuntimeHelper.downcallHandle(
        "RpcImpersonateClient",
        constants$726.RpcImpersonateClient$FUNC
    );
    static final FunctionDescriptor RpcImpersonateClient2$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcImpersonateClient2$MH = RuntimeHelper.downcallHandle(
        "RpcImpersonateClient2",
        constants$726.RpcImpersonateClient2$FUNC
    );
}


