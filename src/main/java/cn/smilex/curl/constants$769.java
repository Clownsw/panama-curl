// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$769 {

    static final FunctionDescriptor RpcAsyncCompleteCall$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcAsyncCompleteCall$MH = RuntimeHelper.downcallHandle(
        "RpcAsyncCompleteCall",
        constants$769.RpcAsyncCompleteCall$FUNC
    );
    static final FunctionDescriptor RpcAsyncAbortCall$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RpcAsyncAbortCall$MH = RuntimeHelper.downcallHandle(
        "RpcAsyncAbortCall",
        constants$769.RpcAsyncAbortCall$FUNC
    );
    static final FunctionDescriptor RpcAsyncCancelCall$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RpcAsyncCancelCall$MH = RuntimeHelper.downcallHandle(
        "RpcAsyncCancelCall",
        constants$769.RpcAsyncCancelCall$FUNC
    );
    static final FunctionDescriptor RpcErrorStartEnumeration$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcErrorStartEnumeration$MH = RuntimeHelper.downcallHandle(
        "RpcErrorStartEnumeration",
        constants$769.RpcErrorStartEnumeration$FUNC
    );
    static final FunctionDescriptor RpcErrorGetNextRecord$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcErrorGetNextRecord$MH = RuntimeHelper.downcallHandle(
        "RpcErrorGetNextRecord",
        constants$769.RpcErrorGetNextRecord$FUNC
    );
    static final FunctionDescriptor RpcErrorEndEnumeration$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcErrorEndEnumeration$MH = RuntimeHelper.downcallHandle(
        "RpcErrorEndEnumeration",
        constants$769.RpcErrorEndEnumeration$FUNC
    );
}

