// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$546 {

    static final FunctionDescriptor ValidateRgn$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ValidateRgn$MH = RuntimeHelper.downcallHandle(
        "ValidateRgn",
        constants$546.ValidateRgn$FUNC
    );
    static final FunctionDescriptor RedrawWindow$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RedrawWindow$MH = RuntimeHelper.downcallHandle(
        "RedrawWindow",
        constants$546.RedrawWindow$FUNC
    );
    static final FunctionDescriptor LockWindowUpdate$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LockWindowUpdate$MH = RuntimeHelper.downcallHandle(
        "LockWindowUpdate",
        constants$546.LockWindowUpdate$FUNC
    );
    static final FunctionDescriptor ScrollWindow$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ScrollWindow$MH = RuntimeHelper.downcallHandle(
        "ScrollWindow",
        constants$546.ScrollWindow$FUNC
    );
    static final FunctionDescriptor ScrollDC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ScrollDC$MH = RuntimeHelper.downcallHandle(
        "ScrollDC",
        constants$546.ScrollDC$FUNC
    );
    static final FunctionDescriptor ScrollWindowEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ScrollWindowEx$MH = RuntimeHelper.downcallHandle(
        "ScrollWindowEx",
        constants$546.ScrollWindowEx$FUNC
    );
}

