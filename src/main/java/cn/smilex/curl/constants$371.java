// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$371 {

    static final FunctionDescriptor BackupEventLogW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle BackupEventLogW$MH = RuntimeHelper.downcallHandle(
        "BackupEventLogW",
        constants$371.BackupEventLogW$FUNC
    );
    static final FunctionDescriptor CloseEventLog$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CloseEventLog$MH = RuntimeHelper.downcallHandle(
        "CloseEventLog",
        constants$371.CloseEventLog$FUNC
    );
    static final FunctionDescriptor DeregisterEventSource$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeregisterEventSource$MH = RuntimeHelper.downcallHandle(
        "DeregisterEventSource",
        constants$371.DeregisterEventSource$FUNC
    );
    static final FunctionDescriptor NotifyChangeEventLog$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle NotifyChangeEventLog$MH = RuntimeHelper.downcallHandle(
        "NotifyChangeEventLog",
        constants$371.NotifyChangeEventLog$FUNC
    );
    static final FunctionDescriptor GetNumberOfEventLogRecords$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetNumberOfEventLogRecords$MH = RuntimeHelper.downcallHandle(
        "GetNumberOfEventLogRecords",
        constants$371.GetNumberOfEventLogRecords$FUNC
    );
    static final FunctionDescriptor GetOldestEventLogRecord$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetOldestEventLogRecord$MH = RuntimeHelper.downcallHandle(
        "GetOldestEventLogRecord",
        constants$371.GetOldestEventLogRecord$FUNC
    );
}


