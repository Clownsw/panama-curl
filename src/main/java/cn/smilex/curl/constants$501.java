// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$501 {

    static final FunctionDescriptor BeginDeferWindowPos$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle BeginDeferWindowPos$MH = RuntimeHelper.downcallHandle(
        "BeginDeferWindowPos",
        constants$501.BeginDeferWindowPos$FUNC
    );
    static final FunctionDescriptor DeferWindowPos$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DeferWindowPos$MH = RuntimeHelper.downcallHandle(
        "DeferWindowPos",
        constants$501.DeferWindowPos$FUNC
    );
    static final FunctionDescriptor EndDeferWindowPos$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EndDeferWindowPos$MH = RuntimeHelper.downcallHandle(
        "EndDeferWindowPos",
        constants$501.EndDeferWindowPos$FUNC
    );
    static final FunctionDescriptor IsWindowVisible$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IsWindowVisible$MH = RuntimeHelper.downcallHandle(
        "IsWindowVisible",
        constants$501.IsWindowVisible$FUNC
    );
    static final FunctionDescriptor IsIconic$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IsIconic$MH = RuntimeHelper.downcallHandle(
        "IsIconic",
        constants$501.IsIconic$FUNC
    );
    static final FunctionDescriptor AnyPopup$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle AnyPopup$MH = RuntimeHelper.downcallHandle(
        "AnyPopup",
        constants$501.AnyPopup$FUNC
    );
}


