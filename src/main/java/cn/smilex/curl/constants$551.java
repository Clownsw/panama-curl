// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$551 {

    static final FunctionDescriptor AdjustWindowRect$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle AdjustWindowRect$MH = RuntimeHelper.downcallHandle(
        "AdjustWindowRect",
        constants$551.AdjustWindowRect$FUNC
    );
    static final FunctionDescriptor AdjustWindowRectEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle AdjustWindowRectEx$MH = RuntimeHelper.downcallHandle(
        "AdjustWindowRectEx",
        constants$551.AdjustWindowRectEx$FUNC
    );
    static final FunctionDescriptor AdjustWindowRectExForDpi$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle AdjustWindowRectExForDpi$MH = RuntimeHelper.downcallHandle(
        "AdjustWindowRectExForDpi",
        constants$551.AdjustWindowRectExForDpi$FUNC
    );
    static final FunctionDescriptor SetWindowContextHelpId$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetWindowContextHelpId$MH = RuntimeHelper.downcallHandle(
        "SetWindowContextHelpId",
        constants$551.SetWindowContextHelpId$FUNC
    );
    static final FunctionDescriptor GetWindowContextHelpId$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetWindowContextHelpId$MH = RuntimeHelper.downcallHandle(
        "GetWindowContextHelpId",
        constants$551.GetWindowContextHelpId$FUNC
    );
    static final FunctionDescriptor SetMenuContextHelpId$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetMenuContextHelpId$MH = RuntimeHelper.downcallHandle(
        "SetMenuContextHelpId",
        constants$551.SetMenuContextHelpId$FUNC
    );
}


