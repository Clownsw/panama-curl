// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$65 {

    static final FunctionDescriptor tzset$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle tzset$MH = RuntimeHelper.downcallHandle(
        "tzset",
        constants$65.tzset$FUNC
    );
    static final FunctionDescriptor __C_specific_handler$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle __C_specific_handler$MH = RuntimeHelper.downcallHandle(
        "__C_specific_handler",
        constants$65.__C_specific_handler$FUNC
    );
    static final FunctionDescriptor _exception_code$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle _exception_code$MH = RuntimeHelper.downcallHandle(
        "_exception_code",
        constants$65._exception_code$FUNC
    );
    static final FunctionDescriptor _exception_info$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle _exception_info$MH = RuntimeHelper.downcallHandle(
        "_exception_info",
        constants$65._exception_info$FUNC
    );
    static final FunctionDescriptor _abnormal_termination$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle _abnormal_termination$MH = RuntimeHelper.downcallHandle(
        "_abnormal_termination",
        constants$65._abnormal_termination$FUNC
    );
    static final FunctionDescriptor __pctype_func$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle __pctype_func$MH = RuntimeHelper.downcallHandle(
        "__pctype_func",
        constants$65.__pctype_func$FUNC
    );
}


