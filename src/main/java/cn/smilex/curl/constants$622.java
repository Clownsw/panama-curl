// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$622 {

    static final FunctionDescriptor GetLocaleInfoEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetLocaleInfoEx$MH = RuntimeHelper.downcallHandle(
        "GetLocaleInfoEx",
        constants$622.GetLocaleInfoEx$FUNC
    );
    static final FunctionDescriptor GetCalendarInfoEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCalendarInfoEx$MH = RuntimeHelper.downcallHandle(
        "GetCalendarInfoEx",
        constants$622.GetCalendarInfoEx$FUNC
    );
    static final FunctionDescriptor GetNumberFormatEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetNumberFormatEx$MH = RuntimeHelper.downcallHandle(
        "GetNumberFormatEx",
        constants$622.GetNumberFormatEx$FUNC
    );
    static final FunctionDescriptor GetCurrencyFormatEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetCurrencyFormatEx$MH = RuntimeHelper.downcallHandle(
        "GetCurrencyFormatEx",
        constants$622.GetCurrencyFormatEx$FUNC
    );
    static final FunctionDescriptor GetUserDefaultLocaleName$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetUserDefaultLocaleName$MH = RuntimeHelper.downcallHandle(
        "GetUserDefaultLocaleName",
        constants$622.GetUserDefaultLocaleName$FUNC
    );
    static final FunctionDescriptor GetSystemDefaultLocaleName$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetSystemDefaultLocaleName$MH = RuntimeHelper.downcallHandle(
        "GetSystemDefaultLocaleName",
        constants$622.GetSystemDefaultLocaleName$FUNC
    );
}


