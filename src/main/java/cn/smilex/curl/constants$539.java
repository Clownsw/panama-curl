// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$539 {

    static final FunctionDescriptor SetMenuDefaultItem$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetMenuDefaultItem$MH = RuntimeHelper.downcallHandle(
        "SetMenuDefaultItem",
        constants$539.SetMenuDefaultItem$FUNC
    );
    static final FunctionDescriptor GetMenuItemRect$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetMenuItemRect$MH = RuntimeHelper.downcallHandle(
        "GetMenuItemRect",
        constants$539.GetMenuItemRect$FUNC
    );
    static final FunctionDescriptor MenuItemFromPoint$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("x"),
            Constants$root.C_LONG$LAYOUT.withName("y")
        ).withName("tagPOINT")
    );
    static final MethodHandle MenuItemFromPoint$MH = RuntimeHelper.downcallHandle(
        "MenuItemFromPoint",
        constants$539.MenuItemFromPoint$FUNC
    );
    static final FunctionDescriptor DragObject$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DragObject$MH = RuntimeHelper.downcallHandle(
        "DragObject",
        constants$539.DragObject$FUNC
    );
    static final FunctionDescriptor DragDetect$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("x"),
            Constants$root.C_LONG$LAYOUT.withName("y")
        ).withName("tagPOINT")
    );
    static final MethodHandle DragDetect$MH = RuntimeHelper.downcallHandle(
        "DragDetect",
        constants$539.DragDetect$FUNC
    );
    static final FunctionDescriptor DrawIcon$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DrawIcon$MH = RuntimeHelper.downcallHandle(
        "DrawIcon",
        constants$539.DrawIcon$FUNC
    );
}


