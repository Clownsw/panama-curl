// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class OPENCARD_SEARCH_CRITERIAW {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwStructSize"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lpstrGroupNames"),
        Constants$root.C_LONG$LAYOUT.withName("nMaxGroupNames"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("rgguidInterfaces"),
        Constants$root.C_LONG$LAYOUT.withName("cguidInterfaces"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lpstrCardNames"),
        Constants$root.C_LONG$LAYOUT.withName("nMaxCardNames"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lpfnCheck"),
        Constants$root.C_POINTER$LAYOUT.withName("lpfnConnect"),
        Constants$root.C_POINTER$LAYOUT.withName("lpfnDisconnect"),
        Constants$root.C_POINTER$LAYOUT.withName("pvUserData"),
        Constants$root.C_LONG$LAYOUT.withName("dwShareMode"),
        Constants$root.C_LONG$LAYOUT.withName("dwPreferredProtocols")
    );
    public static MemoryLayout $LAYOUT() {
        return OPENCARD_SEARCH_CRITERIAW.$struct$LAYOUT;
    }
    static final VarHandle dwStructSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwStructSize"));
    public static VarHandle dwStructSize$VH() {
        return OPENCARD_SEARCH_CRITERIAW.dwStructSize$VH;
    }
    public static int dwStructSize$get(MemorySegment seg) {
        return (int)OPENCARD_SEARCH_CRITERIAW.dwStructSize$VH.get(seg);
    }
    public static void dwStructSize$set( MemorySegment seg, int x) {
        OPENCARD_SEARCH_CRITERIAW.dwStructSize$VH.set(seg, x);
    }
    public static int dwStructSize$get(MemorySegment seg, long index) {
        return (int)OPENCARD_SEARCH_CRITERIAW.dwStructSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwStructSize$set(MemorySegment seg, long index, int x) {
        OPENCARD_SEARCH_CRITERIAW.dwStructSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpstrGroupNames$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpstrGroupNames"));
    public static VarHandle lpstrGroupNames$VH() {
        return OPENCARD_SEARCH_CRITERIAW.lpstrGroupNames$VH;
    }
    public static MemoryAddress lpstrGroupNames$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)OPENCARD_SEARCH_CRITERIAW.lpstrGroupNames$VH.get(seg);
    }
    public static void lpstrGroupNames$set( MemorySegment seg, MemoryAddress x) {
        OPENCARD_SEARCH_CRITERIAW.lpstrGroupNames$VH.set(seg, x);
    }
    public static MemoryAddress lpstrGroupNames$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)OPENCARD_SEARCH_CRITERIAW.lpstrGroupNames$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrGroupNames$set(MemorySegment seg, long index, MemoryAddress x) {
        OPENCARD_SEARCH_CRITERIAW.lpstrGroupNames$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nMaxGroupNames$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nMaxGroupNames"));
    public static VarHandle nMaxGroupNames$VH() {
        return OPENCARD_SEARCH_CRITERIAW.nMaxGroupNames$VH;
    }
    public static int nMaxGroupNames$get(MemorySegment seg) {
        return (int)OPENCARD_SEARCH_CRITERIAW.nMaxGroupNames$VH.get(seg);
    }
    public static void nMaxGroupNames$set( MemorySegment seg, int x) {
        OPENCARD_SEARCH_CRITERIAW.nMaxGroupNames$VH.set(seg, x);
    }
    public static int nMaxGroupNames$get(MemorySegment seg, long index) {
        return (int)OPENCARD_SEARCH_CRITERIAW.nMaxGroupNames$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nMaxGroupNames$set(MemorySegment seg, long index, int x) {
        OPENCARD_SEARCH_CRITERIAW.nMaxGroupNames$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgguidInterfaces$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgguidInterfaces"));
    public static VarHandle rgguidInterfaces$VH() {
        return OPENCARD_SEARCH_CRITERIAW.rgguidInterfaces$VH;
    }
    public static MemoryAddress rgguidInterfaces$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)OPENCARD_SEARCH_CRITERIAW.rgguidInterfaces$VH.get(seg);
    }
    public static void rgguidInterfaces$set( MemorySegment seg, MemoryAddress x) {
        OPENCARD_SEARCH_CRITERIAW.rgguidInterfaces$VH.set(seg, x);
    }
    public static MemoryAddress rgguidInterfaces$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)OPENCARD_SEARCH_CRITERIAW.rgguidInterfaces$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgguidInterfaces$set(MemorySegment seg, long index, MemoryAddress x) {
        OPENCARD_SEARCH_CRITERIAW.rgguidInterfaces$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cguidInterfaces$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cguidInterfaces"));
    public static VarHandle cguidInterfaces$VH() {
        return OPENCARD_SEARCH_CRITERIAW.cguidInterfaces$VH;
    }
    public static int cguidInterfaces$get(MemorySegment seg) {
        return (int)OPENCARD_SEARCH_CRITERIAW.cguidInterfaces$VH.get(seg);
    }
    public static void cguidInterfaces$set( MemorySegment seg, int x) {
        OPENCARD_SEARCH_CRITERIAW.cguidInterfaces$VH.set(seg, x);
    }
    public static int cguidInterfaces$get(MemorySegment seg, long index) {
        return (int)OPENCARD_SEARCH_CRITERIAW.cguidInterfaces$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cguidInterfaces$set(MemorySegment seg, long index, int x) {
        OPENCARD_SEARCH_CRITERIAW.cguidInterfaces$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpstrCardNames$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpstrCardNames"));
    public static VarHandle lpstrCardNames$VH() {
        return OPENCARD_SEARCH_CRITERIAW.lpstrCardNames$VH;
    }
    public static MemoryAddress lpstrCardNames$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)OPENCARD_SEARCH_CRITERIAW.lpstrCardNames$VH.get(seg);
    }
    public static void lpstrCardNames$set( MemorySegment seg, MemoryAddress x) {
        OPENCARD_SEARCH_CRITERIAW.lpstrCardNames$VH.set(seg, x);
    }
    public static MemoryAddress lpstrCardNames$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)OPENCARD_SEARCH_CRITERIAW.lpstrCardNames$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrCardNames$set(MemorySegment seg, long index, MemoryAddress x) {
        OPENCARD_SEARCH_CRITERIAW.lpstrCardNames$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nMaxCardNames$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nMaxCardNames"));
    public static VarHandle nMaxCardNames$VH() {
        return OPENCARD_SEARCH_CRITERIAW.nMaxCardNames$VH;
    }
    public static int nMaxCardNames$get(MemorySegment seg) {
        return (int)OPENCARD_SEARCH_CRITERIAW.nMaxCardNames$VH.get(seg);
    }
    public static void nMaxCardNames$set( MemorySegment seg, int x) {
        OPENCARD_SEARCH_CRITERIAW.nMaxCardNames$VH.set(seg, x);
    }
    public static int nMaxCardNames$get(MemorySegment seg, long index) {
        return (int)OPENCARD_SEARCH_CRITERIAW.nMaxCardNames$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nMaxCardNames$set(MemorySegment seg, long index, int x) {
        OPENCARD_SEARCH_CRITERIAW.nMaxCardNames$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpfnCheck$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpfnCheck"));
    public static VarHandle lpfnCheck$VH() {
        return OPENCARD_SEARCH_CRITERIAW.lpfnCheck$VH;
    }
    public static MemoryAddress lpfnCheck$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)OPENCARD_SEARCH_CRITERIAW.lpfnCheck$VH.get(seg);
    }
    public static void lpfnCheck$set( MemorySegment seg, MemoryAddress x) {
        OPENCARD_SEARCH_CRITERIAW.lpfnCheck$VH.set(seg, x);
    }
    public static MemoryAddress lpfnCheck$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)OPENCARD_SEARCH_CRITERIAW.lpfnCheck$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpfnCheck$set(MemorySegment seg, long index, MemoryAddress x) {
        OPENCARD_SEARCH_CRITERIAW.lpfnCheck$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static LPOCNCHKPROC lpfnCheck (MemorySegment segment, MemorySession session) {
        return LPOCNCHKPROC.ofAddress(lpfnCheck$get(segment), session);
    }
    static final VarHandle lpfnConnect$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpfnConnect"));
    public static VarHandle lpfnConnect$VH() {
        return OPENCARD_SEARCH_CRITERIAW.lpfnConnect$VH;
    }
    public static MemoryAddress lpfnConnect$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)OPENCARD_SEARCH_CRITERIAW.lpfnConnect$VH.get(seg);
    }
    public static void lpfnConnect$set( MemorySegment seg, MemoryAddress x) {
        OPENCARD_SEARCH_CRITERIAW.lpfnConnect$VH.set(seg, x);
    }
    public static MemoryAddress lpfnConnect$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)OPENCARD_SEARCH_CRITERIAW.lpfnConnect$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpfnConnect$set(MemorySegment seg, long index, MemoryAddress x) {
        OPENCARD_SEARCH_CRITERIAW.lpfnConnect$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static LPOCNCONNPROCW lpfnConnect (MemorySegment segment, MemorySession session) {
        return LPOCNCONNPROCW.ofAddress(lpfnConnect$get(segment), session);
    }
    static final VarHandle lpfnDisconnect$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpfnDisconnect"));
    public static VarHandle lpfnDisconnect$VH() {
        return OPENCARD_SEARCH_CRITERIAW.lpfnDisconnect$VH;
    }
    public static MemoryAddress lpfnDisconnect$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)OPENCARD_SEARCH_CRITERIAW.lpfnDisconnect$VH.get(seg);
    }
    public static void lpfnDisconnect$set( MemorySegment seg, MemoryAddress x) {
        OPENCARD_SEARCH_CRITERIAW.lpfnDisconnect$VH.set(seg, x);
    }
    public static MemoryAddress lpfnDisconnect$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)OPENCARD_SEARCH_CRITERIAW.lpfnDisconnect$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpfnDisconnect$set(MemorySegment seg, long index, MemoryAddress x) {
        OPENCARD_SEARCH_CRITERIAW.lpfnDisconnect$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static LPOCNDSCPROC lpfnDisconnect (MemorySegment segment, MemorySession session) {
        return LPOCNDSCPROC.ofAddress(lpfnDisconnect$get(segment), session);
    }
    static final VarHandle pvUserData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pvUserData"));
    public static VarHandle pvUserData$VH() {
        return OPENCARD_SEARCH_CRITERIAW.pvUserData$VH;
    }
    public static MemoryAddress pvUserData$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)OPENCARD_SEARCH_CRITERIAW.pvUserData$VH.get(seg);
    }
    public static void pvUserData$set( MemorySegment seg, MemoryAddress x) {
        OPENCARD_SEARCH_CRITERIAW.pvUserData$VH.set(seg, x);
    }
    public static MemoryAddress pvUserData$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)OPENCARD_SEARCH_CRITERIAW.pvUserData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pvUserData$set(MemorySegment seg, long index, MemoryAddress x) {
        OPENCARD_SEARCH_CRITERIAW.pvUserData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwShareMode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwShareMode"));
    public static VarHandle dwShareMode$VH() {
        return OPENCARD_SEARCH_CRITERIAW.dwShareMode$VH;
    }
    public static int dwShareMode$get(MemorySegment seg) {
        return (int)OPENCARD_SEARCH_CRITERIAW.dwShareMode$VH.get(seg);
    }
    public static void dwShareMode$set( MemorySegment seg, int x) {
        OPENCARD_SEARCH_CRITERIAW.dwShareMode$VH.set(seg, x);
    }
    public static int dwShareMode$get(MemorySegment seg, long index) {
        return (int)OPENCARD_SEARCH_CRITERIAW.dwShareMode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwShareMode$set(MemorySegment seg, long index, int x) {
        OPENCARD_SEARCH_CRITERIAW.dwShareMode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwPreferredProtocols$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwPreferredProtocols"));
    public static VarHandle dwPreferredProtocols$VH() {
        return OPENCARD_SEARCH_CRITERIAW.dwPreferredProtocols$VH;
    }
    public static int dwPreferredProtocols$get(MemorySegment seg) {
        return (int)OPENCARD_SEARCH_CRITERIAW.dwPreferredProtocols$VH.get(seg);
    }
    public static void dwPreferredProtocols$set( MemorySegment seg, int x) {
        OPENCARD_SEARCH_CRITERIAW.dwPreferredProtocols$VH.set(seg, x);
    }
    public static int dwPreferredProtocols$get(MemorySegment seg, long index) {
        return (int)OPENCARD_SEARCH_CRITERIAW.dwPreferredProtocols$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwPreferredProtocols$set(MemorySegment seg, long index, int x) {
        OPENCARD_SEARCH_CRITERIAW.dwPreferredProtocols$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


