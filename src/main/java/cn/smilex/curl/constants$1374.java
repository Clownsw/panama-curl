// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1374 {

    static final FunctionDescriptor IN6_SET_ADDR_LOOPBACK$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IN6_SET_ADDR_LOOPBACK$MH = RuntimeHelper.downcallHandle(
        "IN6_SET_ADDR_LOOPBACK",
        constants$1374.IN6_SET_ADDR_LOOPBACK$FUNC
    );
    static final FunctionDescriptor IN6ADDR_SETANY$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IN6ADDR_SETANY$MH = RuntimeHelper.downcallHandle(
        "IN6ADDR_SETANY",
        constants$1374.IN6ADDR_SETANY$FUNC
    );
    static final FunctionDescriptor IN6ADDR_SETLOOPBACK$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IN6ADDR_SETLOOPBACK$MH = RuntimeHelper.downcallHandle(
        "IN6ADDR_SETLOOPBACK",
        constants$1374.IN6ADDR_SETLOOPBACK$FUNC
    );
    static final FunctionDescriptor IN6ADDR_ISANY$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IN6ADDR_ISANY$MH = RuntimeHelper.downcallHandle(
        "IN6ADDR_ISANY",
        constants$1374.IN6ADDR_ISANY$FUNC
    );
    static final FunctionDescriptor IN6ADDR_ISLOOPBACK$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IN6ADDR_ISLOOPBACK$MH = RuntimeHelper.downcallHandle(
        "IN6ADDR_ISLOOPBACK",
        constants$1374.IN6ADDR_ISLOOPBACK$FUNC
    );
    static final FunctionDescriptor IN6ADDR_ISEQUAL$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IN6ADDR_ISEQUAL$MH = RuntimeHelper.downcallHandle(
        "IN6ADDR_ISEQUAL",
        constants$1374.IN6ADDR_ISEQUAL$FUNC
    );
}


