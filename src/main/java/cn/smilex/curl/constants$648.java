// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$648 {

    static final FunctionDescriptor RegDeleteKeyExA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RegDeleteKeyExA$MH = RuntimeHelper.downcallHandle(
        "RegDeleteKeyExA",
        constants$648.RegDeleteKeyExA$FUNC
    );
    static final FunctionDescriptor RegDeleteKeyExW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RegDeleteKeyExW$MH = RuntimeHelper.downcallHandle(
        "RegDeleteKeyExW",
        constants$648.RegDeleteKeyExW$FUNC
    );
    static final FunctionDescriptor RegDeleteKeyTransactedA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegDeleteKeyTransactedA$MH = RuntimeHelper.downcallHandle(
        "RegDeleteKeyTransactedA",
        constants$648.RegDeleteKeyTransactedA$FUNC
    );
    static final FunctionDescriptor RegDeleteKeyTransactedW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegDeleteKeyTransactedW$MH = RuntimeHelper.downcallHandle(
        "RegDeleteKeyTransactedW",
        constants$648.RegDeleteKeyTransactedW$FUNC
    );
    static final FunctionDescriptor RegDisableReflectionKey$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegDisableReflectionKey$MH = RuntimeHelper.downcallHandle(
        "RegDisableReflectionKey",
        constants$648.RegDisableReflectionKey$FUNC
    );
    static final FunctionDescriptor RegEnableReflectionKey$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegEnableReflectionKey$MH = RuntimeHelper.downcallHandle(
        "RegEnableReflectionKey",
        constants$648.RegEnableReflectionKey$FUNC
    );
}


