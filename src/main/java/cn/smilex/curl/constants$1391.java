// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1391 {

    static final FunctionDescriptor curl_mime_addpart$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle curl_mime_addpart$MH = RuntimeHelper.downcallHandle(
        "curl_mime_addpart",
        constants$1391.curl_mime_addpart$FUNC
    );
    static final FunctionDescriptor curl_mime_name$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle curl_mime_name$MH = RuntimeHelper.downcallHandle(
        "curl_mime_name",
        constants$1391.curl_mime_name$FUNC
    );
    static final FunctionDescriptor curl_mime_filename$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle curl_mime_filename$MH = RuntimeHelper.downcallHandle(
        "curl_mime_filename",
        constants$1391.curl_mime_filename$FUNC
    );
    static final FunctionDescriptor curl_mime_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle curl_mime_type$MH = RuntimeHelper.downcallHandle(
        "curl_mime_type",
        constants$1391.curl_mime_type$FUNC
    );
    static final FunctionDescriptor curl_mime_encoder$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle curl_mime_encoder$MH = RuntimeHelper.downcallHandle(
        "curl_mime_encoder",
        constants$1391.curl_mime_encoder$FUNC
    );
    static final FunctionDescriptor curl_mime_data$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle curl_mime_data$MH = RuntimeHelper.downcallHandle(
        "curl_mime_data",
        constants$1391.curl_mime_data$FUNC
    );
}


