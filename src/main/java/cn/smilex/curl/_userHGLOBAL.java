// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _userHGLOBAL {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("fContext"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.unionLayout(
            Constants$root.C_LONG$LAYOUT.withName("hInproc"),
            Constants$root.C_POINTER$LAYOUT.withName("hRemote"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("hInproc64")
        ).withName("u")
    ).withName("_userHGLOBAL");
    public static MemoryLayout $LAYOUT() {
        return _userHGLOBAL.$struct$LAYOUT;
    }
    static final VarHandle fContext$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fContext"));
    public static VarHandle fContext$VH() {
        return _userHGLOBAL.fContext$VH;
    }
    public static int fContext$get(MemorySegment seg) {
        return (int)_userHGLOBAL.fContext$VH.get(seg);
    }
    public static void fContext$set( MemorySegment seg, int x) {
        _userHGLOBAL.fContext$VH.set(seg, x);
    }
    public static int fContext$get(MemorySegment seg, long index) {
        return (int)_userHGLOBAL.fContext$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fContext$set(MemorySegment seg, long index, int x) {
        _userHGLOBAL.fContext$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static class __MIDL_IWinTypes_0003 {

        static final  GroupLayout __MIDL_IWinTypes_0003$union$LAYOUT = MemoryLayout.unionLayout(
            Constants$root.C_LONG$LAYOUT.withName("hInproc"),
            Constants$root.C_POINTER$LAYOUT.withName("hRemote"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("hInproc64")
        ).withName("__MIDL_IWinTypes_0003");
        public static MemoryLayout $LAYOUT() {
            return __MIDL_IWinTypes_0003.__MIDL_IWinTypes_0003$union$LAYOUT;
        }
        static final VarHandle hInproc$VH = __MIDL_IWinTypes_0003$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hInproc"));
        public static VarHandle hInproc$VH() {
            return __MIDL_IWinTypes_0003.hInproc$VH;
        }
        public static int hInproc$get(MemorySegment seg) {
            return (int)__MIDL_IWinTypes_0003.hInproc$VH.get(seg);
        }
        public static void hInproc$set( MemorySegment seg, int x) {
            __MIDL_IWinTypes_0003.hInproc$VH.set(seg, x);
        }
        public static int hInproc$get(MemorySegment seg, long index) {
            return (int)__MIDL_IWinTypes_0003.hInproc$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void hInproc$set(MemorySegment seg, long index, int x) {
            __MIDL_IWinTypes_0003.hInproc$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle hRemote$VH = __MIDL_IWinTypes_0003$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hRemote"));
        public static VarHandle hRemote$VH() {
            return __MIDL_IWinTypes_0003.hRemote$VH;
        }
        public static MemoryAddress hRemote$get(MemorySegment seg) {
            return (java.lang.foreign.MemoryAddress)__MIDL_IWinTypes_0003.hRemote$VH.get(seg);
        }
        public static void hRemote$set( MemorySegment seg, MemoryAddress x) {
            __MIDL_IWinTypes_0003.hRemote$VH.set(seg, x);
        }
        public static MemoryAddress hRemote$get(MemorySegment seg, long index) {
            return (java.lang.foreign.MemoryAddress)__MIDL_IWinTypes_0003.hRemote$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void hRemote$set(MemorySegment seg, long index, MemoryAddress x) {
            __MIDL_IWinTypes_0003.hRemote$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle hInproc64$VH = __MIDL_IWinTypes_0003$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hInproc64"));
        public static VarHandle hInproc64$VH() {
            return __MIDL_IWinTypes_0003.hInproc64$VH;
        }
        public static long hInproc64$get(MemorySegment seg) {
            return (long)__MIDL_IWinTypes_0003.hInproc64$VH.get(seg);
        }
        public static void hInproc64$set( MemorySegment seg, long x) {
            __MIDL_IWinTypes_0003.hInproc64$VH.set(seg, x);
        }
        public static long hInproc64$get(MemorySegment seg, long index) {
            return (long)__MIDL_IWinTypes_0003.hInproc64$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void hInproc64$set(MemorySegment seg, long index, long x) {
            __MIDL_IWinTypes_0003.hInproc64$VH.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
    }

    public static MemorySegment u$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


