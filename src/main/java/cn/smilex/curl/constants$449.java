// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$449 {

    static final FunctionDescriptor SetWorldTransform$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetWorldTransform$MH = RuntimeHelper.downcallHandle(
        "SetWorldTransform",
        constants$449.SetWorldTransform$FUNC
    );
    static final FunctionDescriptor ModifyWorldTransform$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ModifyWorldTransform$MH = RuntimeHelper.downcallHandle(
        "ModifyWorldTransform",
        constants$449.ModifyWorldTransform$FUNC
    );
    static final FunctionDescriptor CombineTransform$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CombineTransform$MH = RuntimeHelper.downcallHandle(
        "CombineTransform",
        constants$449.CombineTransform$FUNC
    );
    static final FunctionDescriptor CreateDIBSection$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateDIBSection$MH = RuntimeHelper.downcallHandle(
        "CreateDIBSection",
        constants$449.CreateDIBSection$FUNC
    );
    static final FunctionDescriptor GetDIBColorTable$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetDIBColorTable$MH = RuntimeHelper.downcallHandle(
        "GetDIBColorTable",
        constants$449.GetDIBColorTable$FUNC
    );
    static final FunctionDescriptor SetDIBColorTable$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetDIBColorTable$MH = RuntimeHelper.downcallHandle(
        "SetDIBColorTable",
        constants$449.SetDIBColorTable$FUNC
    );
}


