// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$480 {

    static final FunctionDescriptor CreateDesktopExW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateDesktopExW$MH = RuntimeHelper.downcallHandle(
        "CreateDesktopExW",
        constants$480.CreateDesktopExW$FUNC
    );
    static final FunctionDescriptor OpenDesktopA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle OpenDesktopA$MH = RuntimeHelper.downcallHandle(
        "OpenDesktopA",
        constants$480.OpenDesktopA$FUNC
    );
    static final FunctionDescriptor OpenDesktopW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle OpenDesktopW$MH = RuntimeHelper.downcallHandle(
        "OpenDesktopW",
        constants$480.OpenDesktopW$FUNC
    );
    static final FunctionDescriptor OpenInputDesktop$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle OpenInputDesktop$MH = RuntimeHelper.downcallHandle(
        "OpenInputDesktop",
        constants$480.OpenInputDesktop$FUNC
    );
    static final FunctionDescriptor EnumDesktopsA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle EnumDesktopsA$MH = RuntimeHelper.downcallHandle(
        "EnumDesktopsA",
        constants$480.EnumDesktopsA$FUNC
    );
    static final FunctionDescriptor EnumDesktopsW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle EnumDesktopsW$MH = RuntimeHelper.downcallHandle(
        "EnumDesktopsW",
        constants$480.EnumDesktopsW$FUNC
    );
}


