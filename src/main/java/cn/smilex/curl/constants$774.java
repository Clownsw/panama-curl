// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$774 {

    static final FunctionDescriptor DragQueryPoint$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DragQueryPoint$MH = RuntimeHelper.downcallHandle(
        "DragQueryPoint",
        constants$774.DragQueryPoint$FUNC
    );
    static final FunctionDescriptor DragFinish$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DragFinish$MH = RuntimeHelper.downcallHandle(
        "DragFinish",
        constants$774.DragFinish$FUNC
    );
    static final FunctionDescriptor DragAcceptFiles$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DragAcceptFiles$MH = RuntimeHelper.downcallHandle(
        "DragAcceptFiles",
        constants$774.DragAcceptFiles$FUNC
    );
    static final FunctionDescriptor ShellExecuteA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ShellExecuteA$MH = RuntimeHelper.downcallHandle(
        "ShellExecuteA",
        constants$774.ShellExecuteA$FUNC
    );
    static final FunctionDescriptor ShellExecuteW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ShellExecuteW$MH = RuntimeHelper.downcallHandle(
        "ShellExecuteW",
        constants$774.ShellExecuteW$FUNC
    );
    static final FunctionDescriptor FindExecutableA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FindExecutableA$MH = RuntimeHelper.downcallHandle(
        "FindExecutableA",
        constants$774.FindExecutableA$FUNC
    );
}


