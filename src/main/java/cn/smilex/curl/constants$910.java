// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$910 {

    static final FunctionDescriptor RpcSsFree$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcSsFree$MH = RuntimeHelper.downcallHandle(
        "RpcSsFree",
        constants$910.RpcSsFree$FUNC
    );
    static final FunctionDescriptor RpcSsGetThreadHandle$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle RpcSsGetThreadHandle$MH = RuntimeHelper.downcallHandle(
        "RpcSsGetThreadHandle",
        constants$910.RpcSsGetThreadHandle$FUNC
    );
    static final FunctionDescriptor RpcSsSetClientAllocFree$ClientAlloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle RpcSsSetClientAllocFree$ClientAlloc$MH = RuntimeHelper.downcallHandle(
        constants$910.RpcSsSetClientAllocFree$ClientAlloc$FUNC
    );
    static final FunctionDescriptor RpcSsSetClientAllocFree$ClientFree$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcSsSetClientAllocFree$ClientFree$MH = RuntimeHelper.downcallHandle(
        constants$910.RpcSsSetClientAllocFree$ClientFree$FUNC
    );
}

