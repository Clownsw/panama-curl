// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$534 {

    static final FunctionDescriptor CreatePopupMenu$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle CreatePopupMenu$MH = RuntimeHelper.downcallHandle(
        "CreatePopupMenu",
        constants$534.CreatePopupMenu$FUNC
    );
    static final FunctionDescriptor DestroyMenu$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DestroyMenu$MH = RuntimeHelper.downcallHandle(
        "DestroyMenu",
        constants$534.DestroyMenu$FUNC
    );
    static final FunctionDescriptor CheckMenuItem$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CheckMenuItem$MH = RuntimeHelper.downcallHandle(
        "CheckMenuItem",
        constants$534.CheckMenuItem$FUNC
    );
    static final FunctionDescriptor EnableMenuItem$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle EnableMenuItem$MH = RuntimeHelper.downcallHandle(
        "EnableMenuItem",
        constants$534.EnableMenuItem$FUNC
    );
    static final FunctionDescriptor GetSubMenu$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetSubMenu$MH = RuntimeHelper.downcallHandle(
        "GetSubMenu",
        constants$534.GetSubMenu$FUNC
    );
    static final FunctionDescriptor GetMenuItemID$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetMenuItemID$MH = RuntimeHelper.downcallHandle(
        "GetMenuItemID",
        constants$534.GetMenuItemID$FUNC
    );
}


