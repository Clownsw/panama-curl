// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$389 {

    static final FunctionDescriptor GetDynamicTimeZoneInformation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetDynamicTimeZoneInformation$MH = RuntimeHelper.downcallHandle(
        "GetDynamicTimeZoneInformation",
        constants$389.GetDynamicTimeZoneInformation$FUNC
    );
    static final FunctionDescriptor GetTimeZoneInformationForYear$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetTimeZoneInformationForYear$MH = RuntimeHelper.downcallHandle(
        "GetTimeZoneInformationForYear",
        constants$389.GetTimeZoneInformationForYear$FUNC
    );
    static final FunctionDescriptor EnumDynamicTimeZoneInformation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EnumDynamicTimeZoneInformation$MH = RuntimeHelper.downcallHandle(
        "EnumDynamicTimeZoneInformation",
        constants$389.EnumDynamicTimeZoneInformation$FUNC
    );
    static final FunctionDescriptor GetDynamicTimeZoneInformationEffectiveYears$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetDynamicTimeZoneInformationEffectiveYears$MH = RuntimeHelper.downcallHandle(
        "GetDynamicTimeZoneInformationEffectiveYears",
        constants$389.GetDynamicTimeZoneInformationEffectiveYears$FUNC
    );
    static final FunctionDescriptor SystemTimeToTzSpecificLocalTimeEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SystemTimeToTzSpecificLocalTimeEx$MH = RuntimeHelper.downcallHandle(
        "SystemTimeToTzSpecificLocalTimeEx",
        constants$389.SystemTimeToTzSpecificLocalTimeEx$FUNC
    );
    static final FunctionDescriptor TzSpecificLocalTimeToSystemTimeEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle TzSpecificLocalTimeToSystemTimeEx$MH = RuntimeHelper.downcallHandle(
        "TzSpecificLocalTimeToSystemTimeEx",
        constants$389.TzSpecificLocalTimeToSystemTimeEx$FUNC
    );
}


