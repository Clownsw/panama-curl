// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1384 {

    static final FunctionDescriptor curl_read_callback$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle curl_read_callback$MH = RuntimeHelper.downcallHandle(
        constants$1384.curl_read_callback$FUNC
    );
    static final FunctionDescriptor curl_trailer_callback$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle curl_trailer_callback$MH = RuntimeHelper.downcallHandle(
        constants$1384.curl_trailer_callback$FUNC
    );
    static final FunctionDescriptor curl_sockopt_callback$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle curl_sockopt_callback$MH = RuntimeHelper.downcallHandle(
        constants$1384.curl_sockopt_callback$FUNC
    );
}


