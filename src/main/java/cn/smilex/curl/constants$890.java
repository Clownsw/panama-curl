// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$890 {

    static final FunctionDescriptor NdrCorrelationInitialize$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle NdrCorrelationInitialize$MH = RuntimeHelper.downcallHandle(
        "NdrCorrelationInitialize",
        constants$890.NdrCorrelationInitialize$FUNC
    );
    static final FunctionDescriptor NdrCorrelationPass$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle NdrCorrelationPass$MH = RuntimeHelper.downcallHandle(
        "NdrCorrelationPass",
        constants$890.NdrCorrelationPass$FUNC
    );
    static final FunctionDescriptor NdrCorrelationFree$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle NdrCorrelationFree$MH = RuntimeHelper.downcallHandle(
        "NdrCorrelationFree",
        constants$890.NdrCorrelationFree$FUNC
    );
    static final FunctionDescriptor NdrPointerUnmarshall$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle NdrPointerUnmarshall$MH = RuntimeHelper.downcallHandle(
        "NdrPointerUnmarshall",
        constants$890.NdrPointerUnmarshall$FUNC
    );
    static final FunctionDescriptor NdrSimpleStructUnmarshall$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle NdrSimpleStructUnmarshall$MH = RuntimeHelper.downcallHandle(
        "NdrSimpleStructUnmarshall",
        constants$890.NdrSimpleStructUnmarshall$FUNC
    );
    static final FunctionDescriptor NdrConformantStructUnmarshall$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle NdrConformantStructUnmarshall$MH = RuntimeHelper.downcallHandle(
        "NdrConformantStructUnmarshall",
        constants$890.NdrConformantStructUnmarshall$FUNC
    );
}


