// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$936 {

    static final FunctionDescriptor SCardSetCardTypeProviderNameW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SCardSetCardTypeProviderNameW$MH = RuntimeHelper.downcallHandle(
        "SCardSetCardTypeProviderNameW",
        constants$936.SCardSetCardTypeProviderNameW$FUNC
    );
    static final FunctionDescriptor SCardForgetCardTypeA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SCardForgetCardTypeA$MH = RuntimeHelper.downcallHandle(
        "SCardForgetCardTypeA",
        constants$936.SCardForgetCardTypeA$FUNC
    );
    static final FunctionDescriptor SCardForgetCardTypeW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SCardForgetCardTypeW$MH = RuntimeHelper.downcallHandle(
        "SCardForgetCardTypeW",
        constants$936.SCardForgetCardTypeW$FUNC
    );
    static final FunctionDescriptor SCardFreeMemory$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SCardFreeMemory$MH = RuntimeHelper.downcallHandle(
        "SCardFreeMemory",
        constants$936.SCardFreeMemory$FUNC
    );
    static final FunctionDescriptor SCardAccessStartedEvent$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle SCardAccessStartedEvent$MH = RuntimeHelper.downcallHandle(
        "SCardAccessStartedEvent",
        constants$936.SCardAccessStartedEvent$FUNC
    );
    static final FunctionDescriptor SCardReleaseStartedEvent$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle SCardReleaseStartedEvent$MH = RuntimeHelper.downcallHandle(
        "SCardReleaseStartedEvent",
        constants$936.SCardReleaseStartedEvent$FUNC
    );
}

