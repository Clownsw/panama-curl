// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$931 {

    static final FunctionDescriptor SCardEstablishContext$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SCardEstablishContext$MH = RuntimeHelper.downcallHandle(
        "SCardEstablishContext",
        constants$931.SCardEstablishContext$FUNC
    );
    static final FunctionDescriptor SCardReleaseContext$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle SCardReleaseContext$MH = RuntimeHelper.downcallHandle(
        "SCardReleaseContext",
        constants$931.SCardReleaseContext$FUNC
    );
    static final FunctionDescriptor SCardIsValidContext$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle SCardIsValidContext$MH = RuntimeHelper.downcallHandle(
        "SCardIsValidContext",
        constants$931.SCardIsValidContext$FUNC
    );
    static final FunctionDescriptor SCardListReaderGroupsA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SCardListReaderGroupsA$MH = RuntimeHelper.downcallHandle(
        "SCardListReaderGroupsA",
        constants$931.SCardListReaderGroupsA$FUNC
    );
    static final FunctionDescriptor SCardListReaderGroupsW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SCardListReaderGroupsW$MH = RuntimeHelper.downcallHandle(
        "SCardListReaderGroupsW",
        constants$931.SCardListReaderGroupsW$FUNC
    );
    static final FunctionDescriptor SCardListReadersA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SCardListReadersA$MH = RuntimeHelper.downcallHandle(
        "SCardListReadersA",
        constants$931.SCardListReadersA$FUNC
    );
}


