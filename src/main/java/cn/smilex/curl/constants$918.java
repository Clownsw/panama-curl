// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$918 {

    static final FunctionDescriptor NdrAllocate$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle NdrAllocate$MH = RuntimeHelper.downcallHandle(
        "NdrAllocate",
        constants$918.NdrAllocate$FUNC
    );
    static final FunctionDescriptor NdrClearOutParameters$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle NdrClearOutParameters$MH = RuntimeHelper.downcallHandle(
        "NdrClearOutParameters",
        constants$918.NdrClearOutParameters$FUNC
    );
    static final FunctionDescriptor NdrOleAllocate$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle NdrOleAllocate$MH = RuntimeHelper.downcallHandle(
        "NdrOleAllocate",
        constants$918.NdrOleAllocate$FUNC
    );
    static final FunctionDescriptor NdrOleFree$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle NdrOleFree$MH = RuntimeHelper.downcallHandle(
        "NdrOleFree",
        constants$918.NdrOleFree$FUNC
    );
    static final FunctionDescriptor NdrGetUserMarshalInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle NdrGetUserMarshalInfo$MH = RuntimeHelper.downcallHandle(
        "NdrGetUserMarshalInfo",
        constants$918.NdrGetUserMarshalInfo$FUNC
    );
    static final FunctionDescriptor NdrCreateServerInterfaceFromStub$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle NdrCreateServerInterfaceFromStub$MH = RuntimeHelper.downcallHandle(
        "NdrCreateServerInterfaceFromStub",
        constants$918.NdrCreateServerInterfaceFromStub$FUNC
    );
}


