// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1242 {

    static final FunctionDescriptor SafeArrayCreate$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SafeArrayCreate$MH = RuntimeHelper.downcallHandle(
        "SafeArrayCreate",
        constants$1242.SafeArrayCreate$FUNC
    );
    static final FunctionDescriptor SafeArrayCreateEx$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SafeArrayCreateEx$MH = RuntimeHelper.downcallHandle(
        "SafeArrayCreateEx",
        constants$1242.SafeArrayCreateEx$FUNC
    );
    static final FunctionDescriptor SafeArrayCopyData$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SafeArrayCopyData$MH = RuntimeHelper.downcallHandle(
        "SafeArrayCopyData",
        constants$1242.SafeArrayCopyData$FUNC
    );
    static final FunctionDescriptor SafeArrayReleaseDescriptor$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SafeArrayReleaseDescriptor$MH = RuntimeHelper.downcallHandle(
        "SafeArrayReleaseDescriptor",
        constants$1242.SafeArrayReleaseDescriptor$FUNC
    );
    static final FunctionDescriptor SafeArrayDestroyDescriptor$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SafeArrayDestroyDescriptor$MH = RuntimeHelper.downcallHandle(
        "SafeArrayDestroyDescriptor",
        constants$1242.SafeArrayDestroyDescriptor$FUNC
    );
    static final FunctionDescriptor SafeArrayReleaseData$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SafeArrayReleaseData$MH = RuntimeHelper.downcallHandle(
        "SafeArrayReleaseData",
        constants$1242.SafeArrayReleaseData$FUNC
    );
}


