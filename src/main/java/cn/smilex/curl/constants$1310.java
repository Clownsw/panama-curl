// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1310 {

    static final FunctionDescriptor OleConvertOLESTREAMToIStorage$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OleConvertOLESTREAMToIStorage$MH = RuntimeHelper.downcallHandle(
        "OleConvertOLESTREAMToIStorage",
        constants$1310.OleConvertOLESTREAMToIStorage$FUNC
    );
    static final FunctionDescriptor OleConvertIStorageToOLESTREAM$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OleConvertIStorageToOLESTREAM$MH = RuntimeHelper.downcallHandle(
        "OleConvertIStorageToOLESTREAM",
        constants$1310.OleConvertIStorageToOLESTREAM$FUNC
    );
    static final FunctionDescriptor OleDoAutoConvert$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OleDoAutoConvert$MH = RuntimeHelper.downcallHandle(
        "OleDoAutoConvert",
        constants$1310.OleDoAutoConvert$FUNC
    );
    static final FunctionDescriptor OleGetAutoConvert$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OleGetAutoConvert$MH = RuntimeHelper.downcallHandle(
        "OleGetAutoConvert",
        constants$1310.OleGetAutoConvert$FUNC
    );
    static final FunctionDescriptor OleSetAutoConvert$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OleSetAutoConvert$MH = RuntimeHelper.downcallHandle(
        "OleSetAutoConvert",
        constants$1310.OleSetAutoConvert$FUNC
    );
    static final FunctionDescriptor SetConvertStg$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetConvertStg$MH = RuntimeHelper.downcallHandle(
        "SetConvertStg",
        constants$1310.SetConvertStg$FUNC
    );
}


