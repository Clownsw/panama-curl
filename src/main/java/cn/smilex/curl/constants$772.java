// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$772 {

    static final FunctionDescriptor RpcServerInqCallAttributesA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcServerInqCallAttributesA$MH = RuntimeHelper.downcallHandle(
        "RpcServerInqCallAttributesA",
        constants$772.RpcServerInqCallAttributesA$FUNC
    );
    static final FunctionDescriptor RpcServerSubscribeForNotification$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcServerSubscribeForNotification$MH = RuntimeHelper.downcallHandle(
        "RpcServerSubscribeForNotification",
        constants$772.RpcServerSubscribeForNotification$FUNC
    );
    static final FunctionDescriptor RpcServerUnsubscribeForNotification$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcServerUnsubscribeForNotification$MH = RuntimeHelper.downcallHandle(
        "RpcServerUnsubscribeForNotification",
        constants$772.RpcServerUnsubscribeForNotification$FUNC
    );
    static final FunctionDescriptor RpcBindingBind$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcBindingBind$MH = RuntimeHelper.downcallHandle(
        "RpcBindingBind",
        constants$772.RpcBindingBind$FUNC
    );
    static final FunctionDescriptor RpcBindingUnbind$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcBindingUnbind$MH = RuntimeHelper.downcallHandle(
        "RpcBindingUnbind",
        constants$772.RpcBindingUnbind$FUNC
    );
    static final FunctionDescriptor I_RpcAsyncSetHandle$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcAsyncSetHandle$MH = RuntimeHelper.downcallHandle(
        "I_RpcAsyncSetHandle",
        constants$772.I_RpcAsyncSetHandle$FUNC
    );
}


