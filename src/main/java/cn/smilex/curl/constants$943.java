// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$943 {

    static final FunctionDescriptor SCardReadCacheW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SCardReadCacheW$MH = RuntimeHelper.downcallHandle(
        "SCardReadCacheW",
        constants$943.SCardReadCacheW$FUNC
    );
    static final FunctionDescriptor SCardWriteCacheA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SCardWriteCacheA$MH = RuntimeHelper.downcallHandle(
        "SCardWriteCacheA",
        constants$943.SCardWriteCacheA$FUNC
    );
    static final FunctionDescriptor SCardWriteCacheW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SCardWriteCacheW$MH = RuntimeHelper.downcallHandle(
        "SCardWriteCacheW",
        constants$943.SCardWriteCacheW$FUNC
    );
    static final FunctionDescriptor SCardGetReaderIconA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SCardGetReaderIconA$MH = RuntimeHelper.downcallHandle(
        "SCardGetReaderIconA",
        constants$943.SCardGetReaderIconA$FUNC
    );
    static final FunctionDescriptor SCardGetReaderIconW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SCardGetReaderIconW$MH = RuntimeHelper.downcallHandle(
        "SCardGetReaderIconW",
        constants$943.SCardGetReaderIconW$FUNC
    );
    static final FunctionDescriptor SCardGetDeviceTypeIdA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SCardGetDeviceTypeIdA$MH = RuntimeHelper.downcallHandle(
        "SCardGetDeviceTypeIdA",
        constants$943.SCardGetDeviceTypeIdA$FUNC
    );
}

