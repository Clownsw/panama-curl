// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1396 {

    static final FunctionDescriptor curl_lock_function$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle curl_lock_function$MH = RuntimeHelper.downcallHandle(
        constants$1396.curl_lock_function$FUNC
    );
    static final FunctionDescriptor curl_unlock_function$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle curl_unlock_function$MH = RuntimeHelper.downcallHandle(
        constants$1396.curl_unlock_function$FUNC
    );
    static final FunctionDescriptor curl_share_init$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle curl_share_init$MH = RuntimeHelper.downcallHandle(
        "curl_share_init",
        constants$1396.curl_share_init$FUNC
    );
    static final FunctionDescriptor curl_share_setopt$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle curl_share_setopt$MH = RuntimeHelper.downcallHandleVariadic(
        "curl_share_setopt",
        constants$1396.curl_share_setopt$FUNC
    );
    static final FunctionDescriptor curl_share_cleanup$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle curl_share_cleanup$MH = RuntimeHelper.downcallHandle(
        "curl_share_cleanup",
        constants$1396.curl_share_cleanup$FUNC
    );
}

