// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$754 {

    static final FunctionDescriptor I_RpcProxyGetConnectionTimeoutFn$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcProxyGetConnectionTimeoutFn$MH = RuntimeHelper.downcallHandle(
        constants$754.I_RpcProxyGetConnectionTimeoutFn$FUNC
    );
    static final FunctionDescriptor I_RpcPerformCalloutFn$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle I_RpcPerformCalloutFn$MH = RuntimeHelper.downcallHandle(
        constants$754.I_RpcPerformCalloutFn$FUNC
    );
    static final FunctionDescriptor I_RpcFreeCalloutStateFn$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcFreeCalloutStateFn$MH = RuntimeHelper.downcallHandle(
        constants$754.I_RpcFreeCalloutStateFn$FUNC
    );
}

