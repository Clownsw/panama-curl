// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$610 {

    static final FunctionDescriptor LocaleNameToLCID$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle LocaleNameToLCID$MH = RuntimeHelper.downcallHandle(
        "LocaleNameToLCID",
        constants$610.LocaleNameToLCID$FUNC
    );
    static final FunctionDescriptor LCIDToLocaleName$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle LCIDToLocaleName$MH = RuntimeHelper.downcallHandle(
        "LCIDToLocaleName",
        constants$610.LCIDToLocaleName$FUNC
    );
    static final FunctionDescriptor GetDurationFormat$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetDurationFormat$MH = RuntimeHelper.downcallHandle(
        "GetDurationFormat",
        constants$610.GetDurationFormat$FUNC
    );
    static final FunctionDescriptor GetNumberFormatA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetNumberFormatA$MH = RuntimeHelper.downcallHandle(
        "GetNumberFormatA",
        constants$610.GetNumberFormatA$FUNC
    );
    static final FunctionDescriptor GetNumberFormatW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetNumberFormatW$MH = RuntimeHelper.downcallHandle(
        "GetNumberFormatW",
        constants$610.GetNumberFormatW$FUNC
    );
    static final FunctionDescriptor GetCurrencyFormatA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetCurrencyFormatA$MH = RuntimeHelper.downcallHandle(
        "GetCurrencyFormatA",
        constants$610.GetCurrencyFormatA$FUNC
    );
}


