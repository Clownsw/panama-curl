// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _RemotableHandle {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("fContext"),
        MemoryLayout.unionLayout(
            Constants$root.C_LONG$LAYOUT.withName("hInproc"),
            Constants$root.C_LONG$LAYOUT.withName("hRemote")
        ).withName("u")
    ).withName("_RemotableHandle");
    public static MemoryLayout $LAYOUT() {
        return _RemotableHandle.$struct$LAYOUT;
    }
    static final VarHandle fContext$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fContext"));
    public static VarHandle fContext$VH() {
        return _RemotableHandle.fContext$VH;
    }
    public static int fContext$get(MemorySegment seg) {
        return (int)_RemotableHandle.fContext$VH.get(seg);
    }
    public static void fContext$set( MemorySegment seg, int x) {
        _RemotableHandle.fContext$VH.set(seg, x);
    }
    public static int fContext$get(MemorySegment seg, long index) {
        return (int)_RemotableHandle.fContext$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fContext$set(MemorySegment seg, long index, int x) {
        _RemotableHandle.fContext$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static class __MIDL_IWinTypes_0009 {

        static final  GroupLayout __MIDL_IWinTypes_0009$union$LAYOUT = MemoryLayout.unionLayout(
            Constants$root.C_LONG$LAYOUT.withName("hInproc"),
            Constants$root.C_LONG$LAYOUT.withName("hRemote")
        ).withName("__MIDL_IWinTypes_0009");
        public static MemoryLayout $LAYOUT() {
            return __MIDL_IWinTypes_0009.__MIDL_IWinTypes_0009$union$LAYOUT;
        }
        static final VarHandle hInproc$VH = __MIDL_IWinTypes_0009$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hInproc"));
        public static VarHandle hInproc$VH() {
            return __MIDL_IWinTypes_0009.hInproc$VH;
        }
        public static int hInproc$get(MemorySegment seg) {
            return (int)__MIDL_IWinTypes_0009.hInproc$VH.get(seg);
        }
        public static void hInproc$set( MemorySegment seg, int x) {
            __MIDL_IWinTypes_0009.hInproc$VH.set(seg, x);
        }
        public static int hInproc$get(MemorySegment seg, long index) {
            return (int)__MIDL_IWinTypes_0009.hInproc$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void hInproc$set(MemorySegment seg, long index, int x) {
            __MIDL_IWinTypes_0009.hInproc$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle hRemote$VH = __MIDL_IWinTypes_0009$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hRemote"));
        public static VarHandle hRemote$VH() {
            return __MIDL_IWinTypes_0009.hRemote$VH;
        }
        public static int hRemote$get(MemorySegment seg) {
            return (int)__MIDL_IWinTypes_0009.hRemote$VH.get(seg);
        }
        public static void hRemote$set( MemorySegment seg, int x) {
            __MIDL_IWinTypes_0009.hRemote$VH.set(seg, x);
        }
        public static int hRemote$get(MemorySegment seg, long index) {
            return (int)__MIDL_IWinTypes_0009.hRemote$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void hRemote$set(MemorySegment seg, long index, int x) {
            __MIDL_IWinTypes_0009.hRemote$VH.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
    }

    public static MemorySegment u$slice(MemorySegment seg) {
        return seg.asSlice(4, 4);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


