// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$914 {

    static final FunctionDescriptor RpcSmSetClientAllocFree$ClientAlloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle RpcSmSetClientAllocFree$ClientAlloc$MH = RuntimeHelper.downcallHandle(
        constants$914.RpcSmSetClientAllocFree$ClientAlloc$FUNC
    );
    static final FunctionDescriptor RpcSmSetClientAllocFree$ClientFree$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcSmSetClientAllocFree$ClientFree$MH = RuntimeHelper.downcallHandle(
        constants$914.RpcSmSetClientAllocFree$ClientFree$FUNC
    );
    static final FunctionDescriptor RpcSmSetClientAllocFree$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcSmSetClientAllocFree$MH = RuntimeHelper.downcallHandle(
        "RpcSmSetClientAllocFree",
        constants$914.RpcSmSetClientAllocFree$FUNC
    );
    static final FunctionDescriptor RpcSmSetThreadHandle$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcSmSetThreadHandle$MH = RuntimeHelper.downcallHandle(
        "RpcSmSetThreadHandle",
        constants$914.RpcSmSetThreadHandle$FUNC
    );
}

