// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1241 {

    static final FunctionDescriptor VariantTimeToDosDateTime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VariantTimeToDosDateTime$MH = RuntimeHelper.downcallHandle(
        "VariantTimeToDosDateTime",
        constants$1241.VariantTimeToDosDateTime$FUNC
    );
    static final FunctionDescriptor SystemTimeToVariantTime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SystemTimeToVariantTime$MH = RuntimeHelper.downcallHandle(
        "SystemTimeToVariantTime",
        constants$1241.SystemTimeToVariantTime$FUNC
    );
    static final FunctionDescriptor VariantTimeToSystemTime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VariantTimeToSystemTime$MH = RuntimeHelper.downcallHandle(
        "VariantTimeToSystemTime",
        constants$1241.VariantTimeToSystemTime$FUNC
    );
    static final FunctionDescriptor SafeArrayAllocDescriptor$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SafeArrayAllocDescriptor$MH = RuntimeHelper.downcallHandle(
        "SafeArrayAllocDescriptor",
        constants$1241.SafeArrayAllocDescriptor$FUNC
    );
    static final FunctionDescriptor SafeArrayAllocDescriptorEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SafeArrayAllocDescriptorEx$MH = RuntimeHelper.downcallHandle(
        "SafeArrayAllocDescriptorEx",
        constants$1241.SafeArrayAllocDescriptorEx$FUNC
    );
    static final FunctionDescriptor SafeArrayAllocData$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SafeArrayAllocData$MH = RuntimeHelper.downcallHandle(
        "SafeArrayAllocData",
        constants$1241.SafeArrayAllocData$FUNC
    );
}


