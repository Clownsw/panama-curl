// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$948 {

    static final FunctionDescriptor CommitSpoolData$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CommitSpoolData$MH = RuntimeHelper.downcallHandle(
        "CommitSpoolData",
        constants$948.CommitSpoolData$FUNC
    );
    static final FunctionDescriptor CloseSpoolFileHandle$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CloseSpoolFileHandle$MH = RuntimeHelper.downcallHandle(
        "CloseSpoolFileHandle",
        constants$948.CloseSpoolFileHandle$FUNC
    );
    static final FunctionDescriptor OpenPrinterA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OpenPrinterA$MH = RuntimeHelper.downcallHandle(
        "OpenPrinterA",
        constants$948.OpenPrinterA$FUNC
    );
    static final FunctionDescriptor OpenPrinterW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OpenPrinterW$MH = RuntimeHelper.downcallHandle(
        "OpenPrinterW",
        constants$948.OpenPrinterW$FUNC
    );
    static final FunctionDescriptor ResetPrinterA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ResetPrinterA$MH = RuntimeHelper.downcallHandle(
        "ResetPrinterA",
        constants$948.ResetPrinterA$FUNC
    );
    static final FunctionDescriptor ResetPrinterW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ResetPrinterW$MH = RuntimeHelper.downcallHandle(
        "ResetPrinterW",
        constants$948.ResetPrinterW$FUNC
    );
}

