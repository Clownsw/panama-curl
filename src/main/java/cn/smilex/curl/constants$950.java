// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$950 {

    static final FunctionDescriptor AddPrinterA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddPrinterA$MH = RuntimeHelper.downcallHandle(
        "AddPrinterA",
        constants$950.AddPrinterA$FUNC
    );
    static final FunctionDescriptor AddPrinterW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddPrinterW$MH = RuntimeHelper.downcallHandle(
        "AddPrinterW",
        constants$950.AddPrinterW$FUNC
    );
    static final FunctionDescriptor DeletePrinter$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeletePrinter$MH = RuntimeHelper.downcallHandle(
        "DeletePrinter",
        constants$950.DeletePrinter$FUNC
    );
    static final FunctionDescriptor SetPrinterA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetPrinterA$MH = RuntimeHelper.downcallHandle(
        "SetPrinterA",
        constants$950.SetPrinterA$FUNC
    );
    static final FunctionDescriptor SetPrinterW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetPrinterW$MH = RuntimeHelper.downcallHandle(
        "SetPrinterW",
        constants$950.SetPrinterW$FUNC
    );
    static final FunctionDescriptor GetPrinterA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetPrinterA$MH = RuntimeHelper.downcallHandle(
        "GetPrinterA",
        constants$950.GetPrinterA$FUNC
    );
}


