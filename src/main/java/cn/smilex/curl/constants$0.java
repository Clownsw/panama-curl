// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$0 {

    static final FunctionDescriptor __va_start$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle __va_start$MH = RuntimeHelper.downcallHandleVariadic(
        "__va_start",
        constants$0.__va_start$FUNC
    );
    static final FunctionDescriptor __security_init_cookie$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle __security_init_cookie$MH = RuntimeHelper.downcallHandle(
        "__security_init_cookie",
        constants$0.__security_init_cookie$FUNC
    );
    static final FunctionDescriptor __security_check_cookie$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle __security_check_cookie$MH = RuntimeHelper.downcallHandle(
        "__security_check_cookie",
        constants$0.__security_check_cookie$FUNC
    );
    static final FunctionDescriptor __report_gsfailure$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle __report_gsfailure$MH = RuntimeHelper.downcallHandle(
        "__report_gsfailure",
        constants$0.__report_gsfailure$FUNC
    );
    static final  OfLong __security_cookie$LAYOUT = Constants$root.C_LONG_LONG$LAYOUT;
    static final VarHandle __security_cookie$VH = constants$0.__security_cookie$LAYOUT.varHandle();
    static final MemorySegment __security_cookie$SEGMENT = RuntimeHelper.lookupGlobalVariable("__security_cookie", constants$0.__security_cookie$LAYOUT);
    static final FunctionDescriptor _invalid_parameter_noinfo$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _invalid_parameter_noinfo$MH = RuntimeHelper.downcallHandle(
        "_invalid_parameter_noinfo",
        constants$0._invalid_parameter_noinfo$FUNC
    );
}


