// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$933 {

    static final FunctionDescriptor SCardGetProviderIdW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SCardGetProviderIdW$MH = RuntimeHelper.downcallHandle(
        "SCardGetProviderIdW",
        constants$933.SCardGetProviderIdW$FUNC
    );
    static final FunctionDescriptor SCardGetCardTypeProviderNameA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SCardGetCardTypeProviderNameA$MH = RuntimeHelper.downcallHandle(
        "SCardGetCardTypeProviderNameA",
        constants$933.SCardGetCardTypeProviderNameA$FUNC
    );
    static final FunctionDescriptor SCardGetCardTypeProviderNameW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SCardGetCardTypeProviderNameW$MH = RuntimeHelper.downcallHandle(
        "SCardGetCardTypeProviderNameW",
        constants$933.SCardGetCardTypeProviderNameW$FUNC
    );
    static final FunctionDescriptor SCardIntroduceReaderGroupA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SCardIntroduceReaderGroupA$MH = RuntimeHelper.downcallHandle(
        "SCardIntroduceReaderGroupA",
        constants$933.SCardIntroduceReaderGroupA$FUNC
    );
    static final FunctionDescriptor SCardIntroduceReaderGroupW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SCardIntroduceReaderGroupW$MH = RuntimeHelper.downcallHandle(
        "SCardIntroduceReaderGroupW",
        constants$933.SCardIntroduceReaderGroupW$FUNC
    );
    static final FunctionDescriptor SCardForgetReaderGroupA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SCardForgetReaderGroupA$MH = RuntimeHelper.downcallHandle(
        "SCardForgetReaderGroupA",
        constants$933.SCardForgetReaderGroupA$FUNC
    );
}

