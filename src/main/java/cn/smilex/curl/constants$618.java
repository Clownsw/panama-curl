// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$618 {

    static final FunctionDescriptor GetUILanguageInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetUILanguageInfo$MH = RuntimeHelper.downcallHandle(
        "GetUILanguageInfo",
        constants$618.GetUILanguageInfo$FUNC
    );
    static final FunctionDescriptor SetThreadPreferredUILanguages2$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetThreadPreferredUILanguages2$MH = RuntimeHelper.downcallHandle(
        "SetThreadPreferredUILanguages2",
        constants$618.SetThreadPreferredUILanguages2$FUNC
    );
    static final FunctionDescriptor RestoreThreadPreferredUILanguages$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RestoreThreadPreferredUILanguages$MH = RuntimeHelper.downcallHandle(
        "RestoreThreadPreferredUILanguages",
        constants$618.RestoreThreadPreferredUILanguages$FUNC
    );
    static final FunctionDescriptor NotifyUILanguageChange$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle NotifyUILanguageChange$MH = RuntimeHelper.downcallHandle(
        "NotifyUILanguageChange",
        constants$618.NotifyUILanguageChange$FUNC
    );
    static final FunctionDescriptor GetStringTypeExA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetStringTypeExA$MH = RuntimeHelper.downcallHandle(
        "GetStringTypeExA",
        constants$618.GetStringTypeExA$FUNC
    );
    static final FunctionDescriptor GetStringTypeA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetStringTypeA$MH = RuntimeHelper.downcallHandle(
        "GetStringTypeA",
        constants$618.GetStringTypeA$FUNC
    );
}

