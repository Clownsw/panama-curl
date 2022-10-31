// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _SERVICE_NOTIFY_2W {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwVersion"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pfnNotifyCallback"),
        Constants$root.C_POINTER$LAYOUT.withName("pContext"),
        Constants$root.C_LONG$LAYOUT.withName("dwNotificationStatus"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("dwServiceType"),
            Constants$root.C_LONG$LAYOUT.withName("dwCurrentState"),
            Constants$root.C_LONG$LAYOUT.withName("dwControlsAccepted"),
            Constants$root.C_LONG$LAYOUT.withName("dwWin32ExitCode"),
            Constants$root.C_LONG$LAYOUT.withName("dwServiceSpecificExitCode"),
            Constants$root.C_LONG$LAYOUT.withName("dwCheckPoint"),
            Constants$root.C_LONG$LAYOUT.withName("dwWaitHint"),
            Constants$root.C_LONG$LAYOUT.withName("dwProcessId"),
            Constants$root.C_LONG$LAYOUT.withName("dwServiceFlags")
        ).withName("ServiceStatus"),
        Constants$root.C_LONG$LAYOUT.withName("dwNotificationTriggered"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pszServiceNames")
    ).withName("_SERVICE_NOTIFY_2W");
    public static MemoryLayout $LAYOUT() {
        return _SERVICE_NOTIFY_2W.$struct$LAYOUT;
    }
    static final VarHandle dwVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwVersion"));
    public static VarHandle dwVersion$VH() {
        return _SERVICE_NOTIFY_2W.dwVersion$VH;
    }
    public static int dwVersion$get(MemorySegment seg) {
        return (int)_SERVICE_NOTIFY_2W.dwVersion$VH.get(seg);
    }
    public static void dwVersion$set( MemorySegment seg, int x) {
        _SERVICE_NOTIFY_2W.dwVersion$VH.set(seg, x);
    }
    public static int dwVersion$get(MemorySegment seg, long index) {
        return (int)_SERVICE_NOTIFY_2W.dwVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwVersion$set(MemorySegment seg, long index, int x) {
        _SERVICE_NOTIFY_2W.dwVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pfnNotifyCallback$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pfnNotifyCallback"));
    public static VarHandle pfnNotifyCallback$VH() {
        return _SERVICE_NOTIFY_2W.pfnNotifyCallback$VH;
    }
    public static MemoryAddress pfnNotifyCallback$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_SERVICE_NOTIFY_2W.pfnNotifyCallback$VH.get(seg);
    }
    public static void pfnNotifyCallback$set( MemorySegment seg, MemoryAddress x) {
        _SERVICE_NOTIFY_2W.pfnNotifyCallback$VH.set(seg, x);
    }
    public static MemoryAddress pfnNotifyCallback$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_SERVICE_NOTIFY_2W.pfnNotifyCallback$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pfnNotifyCallback$set(MemorySegment seg, long index, MemoryAddress x) {
        _SERVICE_NOTIFY_2W.pfnNotifyCallback$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static PFN_SC_NOTIFY_CALLBACK pfnNotifyCallback (MemorySegment segment, MemorySession session) {
        return PFN_SC_NOTIFY_CALLBACK.ofAddress(pfnNotifyCallback$get(segment), session);
    }
    static final VarHandle pContext$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pContext"));
    public static VarHandle pContext$VH() {
        return _SERVICE_NOTIFY_2W.pContext$VH;
    }
    public static MemoryAddress pContext$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_SERVICE_NOTIFY_2W.pContext$VH.get(seg);
    }
    public static void pContext$set( MemorySegment seg, MemoryAddress x) {
        _SERVICE_NOTIFY_2W.pContext$VH.set(seg, x);
    }
    public static MemoryAddress pContext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_SERVICE_NOTIFY_2W.pContext$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pContext$set(MemorySegment seg, long index, MemoryAddress x) {
        _SERVICE_NOTIFY_2W.pContext$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwNotificationStatus$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwNotificationStatus"));
    public static VarHandle dwNotificationStatus$VH() {
        return _SERVICE_NOTIFY_2W.dwNotificationStatus$VH;
    }
    public static int dwNotificationStatus$get(MemorySegment seg) {
        return (int)_SERVICE_NOTIFY_2W.dwNotificationStatus$VH.get(seg);
    }
    public static void dwNotificationStatus$set( MemorySegment seg, int x) {
        _SERVICE_NOTIFY_2W.dwNotificationStatus$VH.set(seg, x);
    }
    public static int dwNotificationStatus$get(MemorySegment seg, long index) {
        return (int)_SERVICE_NOTIFY_2W.dwNotificationStatus$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwNotificationStatus$set(MemorySegment seg, long index, int x) {
        _SERVICE_NOTIFY_2W.dwNotificationStatus$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ServiceStatus$slice(MemorySegment seg) {
        return seg.asSlice(28, 36);
    }
    static final VarHandle dwNotificationTriggered$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwNotificationTriggered"));
    public static VarHandle dwNotificationTriggered$VH() {
        return _SERVICE_NOTIFY_2W.dwNotificationTriggered$VH;
    }
    public static int dwNotificationTriggered$get(MemorySegment seg) {
        return (int)_SERVICE_NOTIFY_2W.dwNotificationTriggered$VH.get(seg);
    }
    public static void dwNotificationTriggered$set( MemorySegment seg, int x) {
        _SERVICE_NOTIFY_2W.dwNotificationTriggered$VH.set(seg, x);
    }
    public static int dwNotificationTriggered$get(MemorySegment seg, long index) {
        return (int)_SERVICE_NOTIFY_2W.dwNotificationTriggered$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwNotificationTriggered$set(MemorySegment seg, long index, int x) {
        _SERVICE_NOTIFY_2W.dwNotificationTriggered$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pszServiceNames$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszServiceNames"));
    public static VarHandle pszServiceNames$VH() {
        return _SERVICE_NOTIFY_2W.pszServiceNames$VH;
    }
    public static MemoryAddress pszServiceNames$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_SERVICE_NOTIFY_2W.pszServiceNames$VH.get(seg);
    }
    public static void pszServiceNames$set( MemorySegment seg, MemoryAddress x) {
        _SERVICE_NOTIFY_2W.pszServiceNames$VH.set(seg, x);
    }
    public static MemoryAddress pszServiceNames$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_SERVICE_NOTIFY_2W.pszServiceNames$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszServiceNames$set(MemorySegment seg, long index, MemoryAddress x) {
        _SERVICE_NOTIFY_2W.pszServiceNames$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


