// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$609 {

    static final FunctionDescriptor GetCalendarInfoW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCalendarInfoW$MH = RuntimeHelper.downcallHandle(
        "GetCalendarInfoW",
        constants$609.GetCalendarInfoW$FUNC
    );
    static final FunctionDescriptor SetCalendarInfoA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetCalendarInfoA$MH = RuntimeHelper.downcallHandle(
        "SetCalendarInfoA",
        constants$609.SetCalendarInfoA$FUNC
    );
    static final FunctionDescriptor SetCalendarInfoW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetCalendarInfoW$MH = RuntimeHelper.downcallHandle(
        "SetCalendarInfoW",
        constants$609.SetCalendarInfoW$FUNC
    );
    static final FunctionDescriptor LoadStringByReference$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LoadStringByReference$MH = RuntimeHelper.downcallHandle(
        "LoadStringByReference",
        constants$609.LoadStringByReference$FUNC
    );
    static final FunctionDescriptor IsDBCSLeadByte$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle IsDBCSLeadByte$MH = RuntimeHelper.downcallHandle(
        "IsDBCSLeadByte",
        constants$609.IsDBCSLeadByte$FUNC
    );
    static final FunctionDescriptor IsDBCSLeadByteEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle IsDBCSLeadByteEx$MH = RuntimeHelper.downcallHandle(
        "IsDBCSLeadByteEx",
        constants$609.IsDBCSLeadByteEx$FUNC
    );
}

