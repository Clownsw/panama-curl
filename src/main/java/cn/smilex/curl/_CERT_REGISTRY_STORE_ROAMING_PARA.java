// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CERT_REGISTRY_STORE_ROAMING_PARA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("hKey"),
        Constants$root.C_POINTER$LAYOUT.withName("pwszStoreDirectory")
    ).withName("_CERT_REGISTRY_STORE_ROAMING_PARA");
    public static MemoryLayout $LAYOUT() {
        return _CERT_REGISTRY_STORE_ROAMING_PARA.$struct$LAYOUT;
    }
    static final VarHandle hKey$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hKey"));
    public static VarHandle hKey$VH() {
        return _CERT_REGISTRY_STORE_ROAMING_PARA.hKey$VH;
    }
    public static MemoryAddress hKey$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CERT_REGISTRY_STORE_ROAMING_PARA.hKey$VH.get(seg);
    }
    public static void hKey$set( MemorySegment seg, MemoryAddress x) {
        _CERT_REGISTRY_STORE_ROAMING_PARA.hKey$VH.set(seg, x);
    }
    public static MemoryAddress hKey$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CERT_REGISTRY_STORE_ROAMING_PARA.hKey$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hKey$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_REGISTRY_STORE_ROAMING_PARA.hKey$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pwszStoreDirectory$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pwszStoreDirectory"));
    public static VarHandle pwszStoreDirectory$VH() {
        return _CERT_REGISTRY_STORE_ROAMING_PARA.pwszStoreDirectory$VH;
    }
    public static MemoryAddress pwszStoreDirectory$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CERT_REGISTRY_STORE_ROAMING_PARA.pwszStoreDirectory$VH.get(seg);
    }
    public static void pwszStoreDirectory$set( MemorySegment seg, MemoryAddress x) {
        _CERT_REGISTRY_STORE_ROAMING_PARA.pwszStoreDirectory$VH.set(seg, x);
    }
    public static MemoryAddress pwszStoreDirectory$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CERT_REGISTRY_STORE_ROAMING_PARA.pwszStoreDirectory$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pwszStoreDirectory$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_REGISTRY_STORE_ROAMING_PARA.pwszStoreDirectory$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

