// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$932 {

    static final FunctionDescriptor SCardListReadersW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SCardListReadersW$MH = RuntimeHelper.downcallHandle(
        "SCardListReadersW",
        constants$932.SCardListReadersW$FUNC
    );
    static final FunctionDescriptor SCardListCardsA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SCardListCardsA$MH = RuntimeHelper.downcallHandle(
        "SCardListCardsA",
        constants$932.SCardListCardsA$FUNC
    );
    static final FunctionDescriptor SCardListCardsW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SCardListCardsW$MH = RuntimeHelper.downcallHandle(
        "SCardListCardsW",
        constants$932.SCardListCardsW$FUNC
    );
    static final FunctionDescriptor SCardListInterfacesA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SCardListInterfacesA$MH = RuntimeHelper.downcallHandle(
        "SCardListInterfacesA",
        constants$932.SCardListInterfacesA$FUNC
    );
    static final FunctionDescriptor SCardListInterfacesW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SCardListInterfacesW$MH = RuntimeHelper.downcallHandle(
        "SCardListInterfacesW",
        constants$932.SCardListInterfacesW$FUNC
    );
    static final FunctionDescriptor SCardGetProviderIdA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SCardGetProviderIdA$MH = RuntimeHelper.downcallHandle(
        "SCardGetProviderIdA",
        constants$932.SCardGetProviderIdA$FUNC
    );
}


