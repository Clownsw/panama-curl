// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$674 {

    static final FunctionDescriptor DdeQueryStringW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DdeQueryStringW$MH = RuntimeHelper.downcallHandle(
        "DdeQueryStringW",
        constants$674.DdeQueryStringW$FUNC
    );
    static final FunctionDescriptor DdeFreeStringHandle$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DdeFreeStringHandle$MH = RuntimeHelper.downcallHandle(
        "DdeFreeStringHandle",
        constants$674.DdeFreeStringHandle$FUNC
    );
    static final FunctionDescriptor DdeKeepStringHandle$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DdeKeepStringHandle$MH = RuntimeHelper.downcallHandle(
        "DdeKeepStringHandle",
        constants$674.DdeKeepStringHandle$FUNC
    );
    static final FunctionDescriptor DdeCmpStringHandles$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DdeCmpStringHandles$MH = RuntimeHelper.downcallHandle(
        "DdeCmpStringHandles",
        constants$674.DdeCmpStringHandles$FUNC
    );
    static final FunctionDescriptor LZStart$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle LZStart$MH = RuntimeHelper.downcallHandle(
        "LZStart",
        constants$674.LZStart$FUNC
    );
    static final FunctionDescriptor LZDone$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle LZDone$MH = RuntimeHelper.downcallHandle(
        "LZDone",
        constants$674.LZDone$FUNC
    );
}


