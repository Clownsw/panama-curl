// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$786 {

    static final FunctionDescriptor PM_COLLECT_PROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PM_COLLECT_PROC$MH = RuntimeHelper.downcallHandle(
        constants$786.PM_COLLECT_PROC$FUNC
    );
    static final FunctionDescriptor PM_CLOSE_PROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle PM_CLOSE_PROC$MH = RuntimeHelper.downcallHandle(
        constants$786.PM_CLOSE_PROC$FUNC
    );
    static final FunctionDescriptor PM_QUERY_PROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PM_QUERY_PROC$MH = RuntimeHelper.downcallHandle(
        constants$786.PM_QUERY_PROC$FUNC
    );
}


