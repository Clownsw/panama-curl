// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$723 {

    static final FunctionDescriptor RpcMgmtStopServerListening$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcMgmtStopServerListening$MH = RuntimeHelper.downcallHandle(
        "RpcMgmtStopServerListening",
        constants$723.RpcMgmtStopServerListening$FUNC
    );
    static final FunctionDescriptor RpcMgmtWaitServerListen$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle RpcMgmtWaitServerListen$MH = RuntimeHelper.downcallHandle(
        "RpcMgmtWaitServerListen",
        constants$723.RpcMgmtWaitServerListen$FUNC
    );
    static final FunctionDescriptor RpcMgmtSetServerStackSize$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RpcMgmtSetServerStackSize$MH = RuntimeHelper.downcallHandle(
        "RpcMgmtSetServerStackSize",
        constants$723.RpcMgmtSetServerStackSize$FUNC
    );
    static final FunctionDescriptor RpcSsDontSerializeContext$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle RpcSsDontSerializeContext$MH = RuntimeHelper.downcallHandle(
        "RpcSsDontSerializeContext",
        constants$723.RpcSsDontSerializeContext$FUNC
    );
    static final FunctionDescriptor RpcMgmtEnableIdleCleanup$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle RpcMgmtEnableIdleCleanup$MH = RuntimeHelper.downcallHandle(
        "RpcMgmtEnableIdleCleanup",
        constants$723.RpcMgmtEnableIdleCleanup$FUNC
    );
    static final FunctionDescriptor RpcMgmtInqIfIds$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcMgmtInqIfIds$MH = RuntimeHelper.downcallHandle(
        "RpcMgmtInqIfIds",
        constants$723.RpcMgmtInqIfIds$FUNC
    );
}


