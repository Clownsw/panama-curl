// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$947 {

    static final FunctionDescriptor LPFNADDPROPSHEETPAGE$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle LPFNADDPROPSHEETPAGE$MH = RuntimeHelper.downcallHandle(
        constants$947.LPFNADDPROPSHEETPAGE$FUNC
    );
    static final FunctionDescriptor LPFNADDPROPSHEETPAGES$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle LPFNADDPROPSHEETPAGES$MH = RuntimeHelper.downcallHandle(
        constants$947.LPFNADDPROPSHEETPAGES$FUNC
    );
    static final FunctionDescriptor EnumPrintersA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EnumPrintersA$MH = RuntimeHelper.downcallHandle(
        "EnumPrintersA",
        constants$947.EnumPrintersA$FUNC
    );
    static final FunctionDescriptor EnumPrintersW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EnumPrintersW$MH = RuntimeHelper.downcallHandle(
        "EnumPrintersW",
        constants$947.EnumPrintersW$FUNC
    );
    static final FunctionDescriptor GetSpoolFileHandle$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetSpoolFileHandle$MH = RuntimeHelper.downcallHandle(
        "GetSpoolFileHandle",
        constants$947.GetSpoolFileHandle$FUNC
    );
}


