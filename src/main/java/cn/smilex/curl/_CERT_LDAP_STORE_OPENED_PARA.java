// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CERT_LDAP_STORE_OPENED_PARA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pvLdapSessionHandle"),
        Constants$root.C_POINTER$LAYOUT.withName("pwszLdapUrl")
    ).withName("_CERT_LDAP_STORE_OPENED_PARA");
    public static MemoryLayout $LAYOUT() {
        return _CERT_LDAP_STORE_OPENED_PARA.$struct$LAYOUT;
    }
    static final VarHandle pvLdapSessionHandle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pvLdapSessionHandle"));
    public static VarHandle pvLdapSessionHandle$VH() {
        return _CERT_LDAP_STORE_OPENED_PARA.pvLdapSessionHandle$VH;
    }
    public static MemoryAddress pvLdapSessionHandle$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CERT_LDAP_STORE_OPENED_PARA.pvLdapSessionHandle$VH.get(seg);
    }
    public static void pvLdapSessionHandle$set( MemorySegment seg, MemoryAddress x) {
        _CERT_LDAP_STORE_OPENED_PARA.pvLdapSessionHandle$VH.set(seg, x);
    }
    public static MemoryAddress pvLdapSessionHandle$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CERT_LDAP_STORE_OPENED_PARA.pvLdapSessionHandle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pvLdapSessionHandle$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_LDAP_STORE_OPENED_PARA.pvLdapSessionHandle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pwszLdapUrl$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pwszLdapUrl"));
    public static VarHandle pwszLdapUrl$VH() {
        return _CERT_LDAP_STORE_OPENED_PARA.pwszLdapUrl$VH;
    }
    public static MemoryAddress pwszLdapUrl$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CERT_LDAP_STORE_OPENED_PARA.pwszLdapUrl$VH.get(seg);
    }
    public static void pwszLdapUrl$set( MemorySegment seg, MemoryAddress x) {
        _CERT_LDAP_STORE_OPENED_PARA.pwszLdapUrl$VH.set(seg, x);
    }
    public static MemoryAddress pwszLdapUrl$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CERT_LDAP_STORE_OPENED_PARA.pwszLdapUrl$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pwszLdapUrl$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_LDAP_STORE_OPENED_PARA.pwszLdapUrl$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


