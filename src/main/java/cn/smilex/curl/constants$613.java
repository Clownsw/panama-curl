// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$613 {

    static final FunctionDescriptor GetNLSVersion$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetNLSVersion$MH = RuntimeHelper.downcallHandle(
        "GetNLSVersion",
        constants$613.GetNLSVersion$FUNC
    );
    static final FunctionDescriptor IsValidLocale$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle IsValidLocale$MH = RuntimeHelper.downcallHandle(
        "IsValidLocale",
        constants$613.IsValidLocale$FUNC
    );
    static final FunctionDescriptor GetGeoInfoA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle GetGeoInfoA$MH = RuntimeHelper.downcallHandle(
        "GetGeoInfoA",
        constants$613.GetGeoInfoA$FUNC
    );
    static final FunctionDescriptor GetGeoInfoW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle GetGeoInfoW$MH = RuntimeHelper.downcallHandle(
        "GetGeoInfoW",
        constants$613.GetGeoInfoW$FUNC
    );
    static final FunctionDescriptor GetGeoInfoEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetGeoInfoEx$MH = RuntimeHelper.downcallHandle(
        "GetGeoInfoEx",
        constants$613.GetGeoInfoEx$FUNC
    );
    static final FunctionDescriptor EnumSystemGeoID$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EnumSystemGeoID$MH = RuntimeHelper.downcallHandle(
        "EnumSystemGeoID",
        constants$613.EnumSystemGeoID$FUNC
    );
}


