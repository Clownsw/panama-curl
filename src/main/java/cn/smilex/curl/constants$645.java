// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$645 {

    static final FunctionDescriptor RegCloseKey$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegCloseKey$MH = RuntimeHelper.downcallHandle(
        "RegCloseKey",
        constants$645.RegCloseKey$FUNC
    );
    static final FunctionDescriptor RegOverridePredefKey$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegOverridePredefKey$MH = RuntimeHelper.downcallHandle(
        "RegOverridePredefKey",
        constants$645.RegOverridePredefKey$FUNC
    );
    static final FunctionDescriptor RegOpenUserClassesRoot$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegOpenUserClassesRoot$MH = RuntimeHelper.downcallHandle(
        "RegOpenUserClassesRoot",
        constants$645.RegOpenUserClassesRoot$FUNC
    );
    static final FunctionDescriptor RegOpenCurrentUser$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegOpenCurrentUser$MH = RuntimeHelper.downcallHandle(
        "RegOpenCurrentUser",
        constants$645.RegOpenCurrentUser$FUNC
    );
    static final FunctionDescriptor RegDisablePredefinedCache$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle RegDisablePredefinedCache$MH = RuntimeHelper.downcallHandle(
        "RegDisablePredefinedCache",
        constants$645.RegDisablePredefinedCache$FUNC
    );
    static final FunctionDescriptor RegDisablePredefinedCacheEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle RegDisablePredefinedCacheEx$MH = RuntimeHelper.downcallHandle(
        "RegDisablePredefinedCacheEx",
        constants$645.RegDisablePredefinedCacheEx$FUNC
    );
}


