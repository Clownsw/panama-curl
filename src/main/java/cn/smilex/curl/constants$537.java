// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$537 {

    static final FunctionDescriptor TrackPopupMenuEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle TrackPopupMenuEx$MH = RuntimeHelper.downcallHandle(
        "TrackPopupMenuEx",
        constants$537.TrackPopupMenuEx$FUNC
    );
    static final FunctionDescriptor CalculatePopupWindowPosition$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CalculatePopupWindowPosition$MH = RuntimeHelper.downcallHandle(
        "CalculatePopupWindowPosition",
        constants$537.CalculatePopupWindowPosition$FUNC
    );
    static final FunctionDescriptor GetMenuInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetMenuInfo$MH = RuntimeHelper.downcallHandle(
        "GetMenuInfo",
        constants$537.GetMenuInfo$FUNC
    );
    static final FunctionDescriptor SetMenuInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetMenuInfo$MH = RuntimeHelper.downcallHandle(
        "SetMenuInfo",
        constants$537.SetMenuInfo$FUNC
    );
    static final FunctionDescriptor EndMenu$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle EndMenu$MH = RuntimeHelper.downcallHandle(
        "EndMenu",
        constants$537.EndMenu$FUNC
    );
    static final FunctionDescriptor InsertMenuItemA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle InsertMenuItemA$MH = RuntimeHelper.downcallHandle(
        "InsertMenuItemA",
        constants$537.InsertMenuItemA$FUNC
    );
}

