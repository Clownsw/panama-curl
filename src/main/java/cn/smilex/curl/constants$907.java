// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$907 {

    static final FunctionDescriptor NdrDcomAsyncClientCall$FUNC = FunctionDescriptor.of(MemoryLayout.unionLayout(
        Constants$root.C_POINTER$LAYOUT.withName("Pointer"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("Simple")
    ).withName("_CLIENT_CALL_RETURN"),
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle NdrDcomAsyncClientCall$MH = RuntimeHelper.downcallHandleVariadic(
        "NdrDcomAsyncClientCall",
        constants$907.NdrDcomAsyncClientCall$FUNC
    );
    static final FunctionDescriptor NdrAsyncServerCall$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle NdrAsyncServerCall$MH = RuntimeHelper.downcallHandle(
        "NdrAsyncServerCall",
        constants$907.NdrAsyncServerCall$FUNC
    );
    static final FunctionDescriptor NdrAsyncStubCall$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle NdrAsyncStubCall$MH = RuntimeHelper.downcallHandle(
        "NdrAsyncStubCall",
        constants$907.NdrAsyncStubCall$FUNC
    );
    static final FunctionDescriptor NdrDcomAsyncStubCall$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle NdrDcomAsyncStubCall$MH = RuntimeHelper.downcallHandle(
        "NdrDcomAsyncStubCall",
        constants$907.NdrDcomAsyncStubCall$FUNC
    );
    static final FunctionDescriptor NdrStubCall2$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle NdrStubCall2$MH = RuntimeHelper.downcallHandle(
        "NdrStubCall2",
        constants$907.NdrStubCall2$FUNC
    );
    static final FunctionDescriptor NdrServerCall2$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle NdrServerCall2$MH = RuntimeHelper.downcallHandle(
        "NdrServerCall2",
        constants$907.NdrServerCall2$FUNC
    );
}

