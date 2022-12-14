// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class RPC_INTERFACE_TEMPLATEW {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("IfSpec"),
        Constants$root.C_POINTER$LAYOUT.withName("MgrTypeUuid"),
        Constants$root.C_POINTER$LAYOUT.withName("MgrEpv"),
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        Constants$root.C_LONG$LAYOUT.withName("MaxCalls"),
        Constants$root.C_LONG$LAYOUT.withName("MaxRpcSize"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("IfCallback"),
        Constants$root.C_POINTER$LAYOUT.withName("UuidVector"),
        Constants$root.C_POINTER$LAYOUT.withName("Annotation"),
        Constants$root.C_POINTER$LAYOUT.withName("SecurityDescriptor")
    );
    public static MemoryLayout $LAYOUT() {
        return RPC_INTERFACE_TEMPLATEW.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return RPC_INTERFACE_TEMPLATEW.Version$VH;
    }
    public static int Version$get(MemorySegment seg) {
        return (int)RPC_INTERFACE_TEMPLATEW.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, int x) {
        RPC_INTERFACE_TEMPLATEW.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)RPC_INTERFACE_TEMPLATEW.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        RPC_INTERFACE_TEMPLATEW.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle IfSpec$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("IfSpec"));
    public static VarHandle IfSpec$VH() {
        return RPC_INTERFACE_TEMPLATEW.IfSpec$VH;
    }
    public static MemoryAddress IfSpec$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)RPC_INTERFACE_TEMPLATEW.IfSpec$VH.get(seg);
    }
    public static void IfSpec$set( MemorySegment seg, MemoryAddress x) {
        RPC_INTERFACE_TEMPLATEW.IfSpec$VH.set(seg, x);
    }
    public static MemoryAddress IfSpec$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)RPC_INTERFACE_TEMPLATEW.IfSpec$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void IfSpec$set(MemorySegment seg, long index, MemoryAddress x) {
        RPC_INTERFACE_TEMPLATEW.IfSpec$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MgrTypeUuid$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MgrTypeUuid"));
    public static VarHandle MgrTypeUuid$VH() {
        return RPC_INTERFACE_TEMPLATEW.MgrTypeUuid$VH;
    }
    public static MemoryAddress MgrTypeUuid$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)RPC_INTERFACE_TEMPLATEW.MgrTypeUuid$VH.get(seg);
    }
    public static void MgrTypeUuid$set( MemorySegment seg, MemoryAddress x) {
        RPC_INTERFACE_TEMPLATEW.MgrTypeUuid$VH.set(seg, x);
    }
    public static MemoryAddress MgrTypeUuid$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)RPC_INTERFACE_TEMPLATEW.MgrTypeUuid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MgrTypeUuid$set(MemorySegment seg, long index, MemoryAddress x) {
        RPC_INTERFACE_TEMPLATEW.MgrTypeUuid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MgrEpv$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MgrEpv"));
    public static VarHandle MgrEpv$VH() {
        return RPC_INTERFACE_TEMPLATEW.MgrEpv$VH;
    }
    public static MemoryAddress MgrEpv$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)RPC_INTERFACE_TEMPLATEW.MgrEpv$VH.get(seg);
    }
    public static void MgrEpv$set( MemorySegment seg, MemoryAddress x) {
        RPC_INTERFACE_TEMPLATEW.MgrEpv$VH.set(seg, x);
    }
    public static MemoryAddress MgrEpv$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)RPC_INTERFACE_TEMPLATEW.MgrEpv$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MgrEpv$set(MemorySegment seg, long index, MemoryAddress x) {
        RPC_INTERFACE_TEMPLATEW.MgrEpv$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return RPC_INTERFACE_TEMPLATEW.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)RPC_INTERFACE_TEMPLATEW.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        RPC_INTERFACE_TEMPLATEW.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)RPC_INTERFACE_TEMPLATEW.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        RPC_INTERFACE_TEMPLATEW.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MaxCalls$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MaxCalls"));
    public static VarHandle MaxCalls$VH() {
        return RPC_INTERFACE_TEMPLATEW.MaxCalls$VH;
    }
    public static int MaxCalls$get(MemorySegment seg) {
        return (int)RPC_INTERFACE_TEMPLATEW.MaxCalls$VH.get(seg);
    }
    public static void MaxCalls$set( MemorySegment seg, int x) {
        RPC_INTERFACE_TEMPLATEW.MaxCalls$VH.set(seg, x);
    }
    public static int MaxCalls$get(MemorySegment seg, long index) {
        return (int)RPC_INTERFACE_TEMPLATEW.MaxCalls$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MaxCalls$set(MemorySegment seg, long index, int x) {
        RPC_INTERFACE_TEMPLATEW.MaxCalls$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MaxRpcSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MaxRpcSize"));
    public static VarHandle MaxRpcSize$VH() {
        return RPC_INTERFACE_TEMPLATEW.MaxRpcSize$VH;
    }
    public static int MaxRpcSize$get(MemorySegment seg) {
        return (int)RPC_INTERFACE_TEMPLATEW.MaxRpcSize$VH.get(seg);
    }
    public static void MaxRpcSize$set( MemorySegment seg, int x) {
        RPC_INTERFACE_TEMPLATEW.MaxRpcSize$VH.set(seg, x);
    }
    public static int MaxRpcSize$get(MemorySegment seg, long index) {
        return (int)RPC_INTERFACE_TEMPLATEW.MaxRpcSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MaxRpcSize$set(MemorySegment seg, long index, int x) {
        RPC_INTERFACE_TEMPLATEW.MaxRpcSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final FunctionDescriptor IfCallback$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IfCallback$MH = RuntimeHelper.downcallHandle(
        RPC_INTERFACE_TEMPLATEW.IfCallback$FUNC
    );
    public interface IfCallback {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(IfCallback fi, MemorySession session) {
            return RuntimeHelper.upcallStub(IfCallback.class, fi, RPC_INTERFACE_TEMPLATEW.IfCallback$FUNC, session);
        }
        static IfCallback ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)RPC_INTERFACE_TEMPLATEW.IfCallback$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle IfCallback$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("IfCallback"));
    public static VarHandle IfCallback$VH() {
        return RPC_INTERFACE_TEMPLATEW.IfCallback$VH;
    }
    public static MemoryAddress IfCallback$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)RPC_INTERFACE_TEMPLATEW.IfCallback$VH.get(seg);
    }
    public static void IfCallback$set( MemorySegment seg, MemoryAddress x) {
        RPC_INTERFACE_TEMPLATEW.IfCallback$VH.set(seg, x);
    }
    public static MemoryAddress IfCallback$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)RPC_INTERFACE_TEMPLATEW.IfCallback$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void IfCallback$set(MemorySegment seg, long index, MemoryAddress x) {
        RPC_INTERFACE_TEMPLATEW.IfCallback$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static IfCallback IfCallback (MemorySegment segment, MemorySession session) {
        return IfCallback.ofAddress(IfCallback$get(segment), session);
    }
    static final VarHandle UuidVector$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("UuidVector"));
    public static VarHandle UuidVector$VH() {
        return RPC_INTERFACE_TEMPLATEW.UuidVector$VH;
    }
    public static MemoryAddress UuidVector$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)RPC_INTERFACE_TEMPLATEW.UuidVector$VH.get(seg);
    }
    public static void UuidVector$set( MemorySegment seg, MemoryAddress x) {
        RPC_INTERFACE_TEMPLATEW.UuidVector$VH.set(seg, x);
    }
    public static MemoryAddress UuidVector$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)RPC_INTERFACE_TEMPLATEW.UuidVector$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void UuidVector$set(MemorySegment seg, long index, MemoryAddress x) {
        RPC_INTERFACE_TEMPLATEW.UuidVector$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Annotation$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Annotation"));
    public static VarHandle Annotation$VH() {
        return RPC_INTERFACE_TEMPLATEW.Annotation$VH;
    }
    public static MemoryAddress Annotation$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)RPC_INTERFACE_TEMPLATEW.Annotation$VH.get(seg);
    }
    public static void Annotation$set( MemorySegment seg, MemoryAddress x) {
        RPC_INTERFACE_TEMPLATEW.Annotation$VH.set(seg, x);
    }
    public static MemoryAddress Annotation$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)RPC_INTERFACE_TEMPLATEW.Annotation$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Annotation$set(MemorySegment seg, long index, MemoryAddress x) {
        RPC_INTERFACE_TEMPLATEW.Annotation$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SecurityDescriptor$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SecurityDescriptor"));
    public static VarHandle SecurityDescriptor$VH() {
        return RPC_INTERFACE_TEMPLATEW.SecurityDescriptor$VH;
    }
    public static MemoryAddress SecurityDescriptor$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)RPC_INTERFACE_TEMPLATEW.SecurityDescriptor$VH.get(seg);
    }
    public static void SecurityDescriptor$set( MemorySegment seg, MemoryAddress x) {
        RPC_INTERFACE_TEMPLATEW.SecurityDescriptor$VH.set(seg, x);
    }
    public static MemoryAddress SecurityDescriptor$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)RPC_INTERFACE_TEMPLATEW.SecurityDescriptor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SecurityDescriptor$set(MemorySegment seg, long index, MemoryAddress x) {
        RPC_INTERFACE_TEMPLATEW.SecurityDescriptor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


