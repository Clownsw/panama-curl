// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$397 {

    static final FunctionDescriptor GetNumaProcessorNode$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetNumaProcessorNode$MH = RuntimeHelper.downcallHandle(
        "GetNumaProcessorNode",
        constants$397.GetNumaProcessorNode$FUNC
    );
    static final FunctionDescriptor GetNumaNodeNumberFromHandle$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetNumaNodeNumberFromHandle$MH = RuntimeHelper.downcallHandle(
        "GetNumaNodeNumberFromHandle",
        constants$397.GetNumaNodeNumberFromHandle$FUNC
    );
    static final FunctionDescriptor GetNumaProcessorNodeEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetNumaProcessorNodeEx$MH = RuntimeHelper.downcallHandle(
        "GetNumaProcessorNodeEx",
        constants$397.GetNumaProcessorNodeEx$FUNC
    );
    static final FunctionDescriptor GetNumaNodeProcessorMask$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetNumaNodeProcessorMask$MH = RuntimeHelper.downcallHandle(
        "GetNumaNodeProcessorMask",
        constants$397.GetNumaNodeProcessorMask$FUNC
    );
    static final FunctionDescriptor GetNumaAvailableMemoryNode$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetNumaAvailableMemoryNode$MH = RuntimeHelper.downcallHandle(
        "GetNumaAvailableMemoryNode",
        constants$397.GetNumaAvailableMemoryNode$FUNC
    );
    static final FunctionDescriptor GetNumaAvailableMemoryNodeEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetNumaAvailableMemoryNodeEx$MH = RuntimeHelper.downcallHandle(
        "GetNumaAvailableMemoryNodeEx",
        constants$397.GetNumaAvailableMemoryNodeEx$FUNC
    );
}

