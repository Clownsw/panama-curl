// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _SHNAMEMAPPINGW {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pszOldPath"),
        Constants$root.C_POINTER$LAYOUT.withName("pszNewPath"),
        Constants$root.C_LONG$LAYOUT.withName("cchOldPath"),
        Constants$root.C_LONG$LAYOUT.withName("cchNewPath")
    ).withName("_SHNAMEMAPPINGW");
    public static MemoryLayout $LAYOUT() {
        return _SHNAMEMAPPINGW.$struct$LAYOUT;
    }
    static final VarHandle pszOldPath$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszOldPath"));
    public static VarHandle pszOldPath$VH() {
        return _SHNAMEMAPPINGW.pszOldPath$VH;
    }
    public static MemoryAddress pszOldPath$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_SHNAMEMAPPINGW.pszOldPath$VH.get(seg);
    }
    public static void pszOldPath$set( MemorySegment seg, MemoryAddress x) {
        _SHNAMEMAPPINGW.pszOldPath$VH.set(seg, x);
    }
    public static MemoryAddress pszOldPath$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_SHNAMEMAPPINGW.pszOldPath$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszOldPath$set(MemorySegment seg, long index, MemoryAddress x) {
        _SHNAMEMAPPINGW.pszOldPath$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pszNewPath$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszNewPath"));
    public static VarHandle pszNewPath$VH() {
        return _SHNAMEMAPPINGW.pszNewPath$VH;
    }
    public static MemoryAddress pszNewPath$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_SHNAMEMAPPINGW.pszNewPath$VH.get(seg);
    }
    public static void pszNewPath$set( MemorySegment seg, MemoryAddress x) {
        _SHNAMEMAPPINGW.pszNewPath$VH.set(seg, x);
    }
    public static MemoryAddress pszNewPath$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_SHNAMEMAPPINGW.pszNewPath$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszNewPath$set(MemorySegment seg, long index, MemoryAddress x) {
        _SHNAMEMAPPINGW.pszNewPath$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cchOldPath$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cchOldPath"));
    public static VarHandle cchOldPath$VH() {
        return _SHNAMEMAPPINGW.cchOldPath$VH;
    }
    public static int cchOldPath$get(MemorySegment seg) {
        return (int)_SHNAMEMAPPINGW.cchOldPath$VH.get(seg);
    }
    public static void cchOldPath$set( MemorySegment seg, int x) {
        _SHNAMEMAPPINGW.cchOldPath$VH.set(seg, x);
    }
    public static int cchOldPath$get(MemorySegment seg, long index) {
        return (int)_SHNAMEMAPPINGW.cchOldPath$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cchOldPath$set(MemorySegment seg, long index, int x) {
        _SHNAMEMAPPINGW.cchOldPath$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cchNewPath$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cchNewPath"));
    public static VarHandle cchNewPath$VH() {
        return _SHNAMEMAPPINGW.cchNewPath$VH;
    }
    public static int cchNewPath$get(MemorySegment seg) {
        return (int)_SHNAMEMAPPINGW.cchNewPath$VH.get(seg);
    }
    public static void cchNewPath$set( MemorySegment seg, int x) {
        _SHNAMEMAPPINGW.cchNewPath$VH.set(seg, x);
    }
    public static int cchNewPath$get(MemorySegment seg, long index) {
        return (int)_SHNAMEMAPPINGW.cchNewPath$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cchNewPath$set(MemorySegment seg, long index, int x) {
        _SHNAMEMAPPINGW.cchNewPath$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

