// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$547 {

    static final FunctionDescriptor SetScrollPos$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetScrollPos$MH = RuntimeHelper.downcallHandle(
        "SetScrollPos",
        constants$547.SetScrollPos$FUNC
    );
    static final FunctionDescriptor GetScrollPos$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetScrollPos$MH = RuntimeHelper.downcallHandle(
        "GetScrollPos",
        constants$547.GetScrollPos$FUNC
    );
    static final FunctionDescriptor SetScrollRange$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetScrollRange$MH = RuntimeHelper.downcallHandle(
        "SetScrollRange",
        constants$547.SetScrollRange$FUNC
    );
    static final FunctionDescriptor GetScrollRange$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetScrollRange$MH = RuntimeHelper.downcallHandle(
        "GetScrollRange",
        constants$547.GetScrollRange$FUNC
    );
    static final FunctionDescriptor ShowScrollBar$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ShowScrollBar$MH = RuntimeHelper.downcallHandle(
        "ShowScrollBar",
        constants$547.ShowScrollBar$FUNC
    );
    static final FunctionDescriptor EnableScrollBar$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle EnableScrollBar$MH = RuntimeHelper.downcallHandle(
        "EnableScrollBar",
        constants$547.EnableScrollBar$FUNC
    );
}


