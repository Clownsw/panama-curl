// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$532 {

    static final FunctionDescriptor LoadMenuIndirectW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LoadMenuIndirectW$MH = RuntimeHelper.downcallHandle(
        "LoadMenuIndirectW",
        constants$532.LoadMenuIndirectW$FUNC
    );
    static final FunctionDescriptor GetMenu$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetMenu$MH = RuntimeHelper.downcallHandle(
        "GetMenu",
        constants$532.GetMenu$FUNC
    );
    static final FunctionDescriptor SetMenu$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetMenu$MH = RuntimeHelper.downcallHandle(
        "SetMenu",
        constants$532.SetMenu$FUNC
    );
    static final FunctionDescriptor ChangeMenuA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ChangeMenuA$MH = RuntimeHelper.downcallHandle(
        "ChangeMenuA",
        constants$532.ChangeMenuA$FUNC
    );
    static final FunctionDescriptor ChangeMenuW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ChangeMenuW$MH = RuntimeHelper.downcallHandle(
        "ChangeMenuW",
        constants$532.ChangeMenuW$FUNC
    );
    static final FunctionDescriptor HiliteMenuItem$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle HiliteMenuItem$MH = RuntimeHelper.downcallHandle(
        "HiliteMenuItem",
        constants$532.HiliteMenuItem$FUNC
    );
}


