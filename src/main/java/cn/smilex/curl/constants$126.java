// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$126 {

    static final FunctionDescriptor GET_RUNTIME_FUNCTION_CALLBACK$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GET_RUNTIME_FUNCTION_CALLBACK$MH = RuntimeHelper.downcallHandle(
        constants$126.GET_RUNTIME_FUNCTION_CALLBACK$FUNC
    );
    static final FunctionDescriptor PGET_RUNTIME_FUNCTION_CALLBACK$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PGET_RUNTIME_FUNCTION_CALLBACK$MH = RuntimeHelper.downcallHandle(
        constants$126.PGET_RUNTIME_FUNCTION_CALLBACK$FUNC
    );
    static final FunctionDescriptor OUT_OF_PROCESS_FUNCTION_TABLE_CALLBACK$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OUT_OF_PROCESS_FUNCTION_TABLE_CALLBACK$MH = RuntimeHelper.downcallHandle(
        constants$126.OUT_OF_PROCESS_FUNCTION_TABLE_CALLBACK$FUNC
    );
    static final FunctionDescriptor POUT_OF_PROCESS_FUNCTION_TABLE_CALLBACK$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
}


