// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$767 {

    static final FunctionDescriptor RpcNsBindingImportBeginA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcNsBindingImportBeginA$MH = RuntimeHelper.downcallHandle(
        "RpcNsBindingImportBeginA",
        constants$767.RpcNsBindingImportBeginA$FUNC
    );
    static final FunctionDescriptor RpcNsBindingImportBeginW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcNsBindingImportBeginW$MH = RuntimeHelper.downcallHandle(
        "RpcNsBindingImportBeginW",
        constants$767.RpcNsBindingImportBeginW$FUNC
    );
    static final FunctionDescriptor RpcNsBindingImportNext$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcNsBindingImportNext$MH = RuntimeHelper.downcallHandle(
        "RpcNsBindingImportNext",
        constants$767.RpcNsBindingImportNext$FUNC
    );
    static final FunctionDescriptor RpcNsBindingImportDone$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcNsBindingImportDone$MH = RuntimeHelper.downcallHandle(
        "RpcNsBindingImportDone",
        constants$767.RpcNsBindingImportDone$FUNC
    );
    static final FunctionDescriptor RpcNsBindingSelect$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcNsBindingSelect$MH = RuntimeHelper.downcallHandle(
        "RpcNsBindingSelect",
        constants$767.RpcNsBindingSelect$FUNC
    );
    static final FunctionDescriptor RPCNOTIFICATION_ROUTINE$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
}

