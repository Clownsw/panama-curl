// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1366 {

    static final FunctionDescriptor WSASetServiceA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WSASetServiceA$MH = RuntimeHelper.downcallHandle(
        "WSASetServiceA",
        constants$1366.WSASetServiceA$FUNC
    );
    static final FunctionDescriptor WSASetServiceW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WSASetServiceW$MH = RuntimeHelper.downcallHandle(
        "WSASetServiceW",
        constants$1366.WSASetServiceW$FUNC
    );
    static final FunctionDescriptor WSAProviderConfigChange$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WSAProviderConfigChange$MH = RuntimeHelper.downcallHandle(
        "WSAProviderConfigChange",
        constants$1366.WSAProviderConfigChange$FUNC
    );
    static final FunctionDescriptor WSAPoll$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WSAPoll$MH = RuntimeHelper.downcallHandle(
        "WSAPoll",
        constants$1366.WSAPoll$FUNC
    );
    static final  GroupLayout scopeid_unspecified$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    MemoryLayout.paddingLayout(28).withName("Zone"),
                    MemoryLayout.paddingLayout(4).withName("Level")
                )
            ).withName("$anon$0"),
            Constants$root.C_LONG$LAYOUT.withName("Value")
        ).withName("$anon$0")
    );
    static final MemorySegment scopeid_unspecified$SEGMENT = RuntimeHelper.lookupGlobalVariable("scopeid_unspecified", constants$1366.scopeid_unspecified$LAYOUT);
    static final  GroupLayout in4addr_any$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_CHAR$LAYOUT.withName("s_b1"),
                Constants$root.C_CHAR$LAYOUT.withName("s_b2"),
                Constants$root.C_CHAR$LAYOUT.withName("s_b3"),
                Constants$root.C_CHAR$LAYOUT.withName("s_b4")
            ).withName("S_un_b"),
            MemoryLayout.structLayout(
                Constants$root.C_SHORT$LAYOUT.withName("s_w1"),
                Constants$root.C_SHORT$LAYOUT.withName("s_w2")
            ).withName("S_un_w"),
            Constants$root.C_LONG$LAYOUT.withName("S_addr")
        ).withName("S_un")
    ).withName("in_addr");
    static final MemorySegment in4addr_any$SEGMENT = RuntimeHelper.lookupGlobalVariable("in4addr_any", constants$1366.in4addr_any$LAYOUT);
}


