// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1382 {

    static final FunctionDescriptor curl_write_callback$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle curl_write_callback$MH = RuntimeHelper.downcallHandle(
        constants$1382.curl_write_callback$FUNC
    );
    static final FunctionDescriptor curl_resolver_start_callback$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle curl_resolver_start_callback$MH = RuntimeHelper.downcallHandle(
        constants$1382.curl_resolver_start_callback$FUNC
    );
    static final FunctionDescriptor curl_chunk_bgn_callback$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle curl_chunk_bgn_callback$MH = RuntimeHelper.downcallHandle(
        constants$1382.curl_chunk_bgn_callback$FUNC
    );
}


