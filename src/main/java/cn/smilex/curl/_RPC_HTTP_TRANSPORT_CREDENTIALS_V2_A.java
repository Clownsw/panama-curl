// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _RPC_HTTP_TRANSPORT_CREDENTIALS_V2_A {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("TransportCredentials"),
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        Constants$root.C_LONG$LAYOUT.withName("AuthenticationTarget"),
        Constants$root.C_LONG$LAYOUT.withName("NumberOfAuthnSchemes"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("AuthnSchemes"),
        Constants$root.C_POINTER$LAYOUT.withName("ServerCertificateSubject"),
        Constants$root.C_POINTER$LAYOUT.withName("ProxyCredentials"),
        Constants$root.C_LONG$LAYOUT.withName("NumberOfProxyAuthnSchemes"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("ProxyAuthnSchemes")
    ).withName("_RPC_HTTP_TRANSPORT_CREDENTIALS_V2_A");
    public static MemoryLayout $LAYOUT() {
        return _RPC_HTTP_TRANSPORT_CREDENTIALS_V2_A.$struct$LAYOUT;
    }
    static final VarHandle TransportCredentials$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TransportCredentials"));
    public static VarHandle TransportCredentials$VH() {
        return _RPC_HTTP_TRANSPORT_CREDENTIALS_V2_A.TransportCredentials$VH;
    }
    public static MemoryAddress TransportCredentials$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_RPC_HTTP_TRANSPORT_CREDENTIALS_V2_A.TransportCredentials$VH.get(seg);
    }
    public static void TransportCredentials$set( MemorySegment seg, MemoryAddress x) {
        _RPC_HTTP_TRANSPORT_CREDENTIALS_V2_A.TransportCredentials$VH.set(seg, x);
    }
    public static MemoryAddress TransportCredentials$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_RPC_HTTP_TRANSPORT_CREDENTIALS_V2_A.TransportCredentials$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TransportCredentials$set(MemorySegment seg, long index, MemoryAddress x) {
        _RPC_HTTP_TRANSPORT_CREDENTIALS_V2_A.TransportCredentials$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _RPC_HTTP_TRANSPORT_CREDENTIALS_V2_A.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)_RPC_HTTP_TRANSPORT_CREDENTIALS_V2_A.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        _RPC_HTTP_TRANSPORT_CREDENTIALS_V2_A.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_RPC_HTTP_TRANSPORT_CREDENTIALS_V2_A.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _RPC_HTTP_TRANSPORT_CREDENTIALS_V2_A.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle AuthenticationTarget$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AuthenticationTarget"));
    public static VarHandle AuthenticationTarget$VH() {
        return _RPC_HTTP_TRANSPORT_CREDENTIALS_V2_A.AuthenticationTarget$VH;
    }
    public static int AuthenticationTarget$get(MemorySegment seg) {
        return (int)_RPC_HTTP_TRANSPORT_CREDENTIALS_V2_A.AuthenticationTarget$VH.get(seg);
    }
    public static void AuthenticationTarget$set( MemorySegment seg, int x) {
        _RPC_HTTP_TRANSPORT_CREDENTIALS_V2_A.AuthenticationTarget$VH.set(seg, x);
    }
    public static int AuthenticationTarget$get(MemorySegment seg, long index) {
        return (int)_RPC_HTTP_TRANSPORT_CREDENTIALS_V2_A.AuthenticationTarget$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AuthenticationTarget$set(MemorySegment seg, long index, int x) {
        _RPC_HTTP_TRANSPORT_CREDENTIALS_V2_A.AuthenticationTarget$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberOfAuthnSchemes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfAuthnSchemes"));
    public static VarHandle NumberOfAuthnSchemes$VH() {
        return _RPC_HTTP_TRANSPORT_CREDENTIALS_V2_A.NumberOfAuthnSchemes$VH;
    }
    public static int NumberOfAuthnSchemes$get(MemorySegment seg) {
        return (int)_RPC_HTTP_TRANSPORT_CREDENTIALS_V2_A.NumberOfAuthnSchemes$VH.get(seg);
    }
    public static void NumberOfAuthnSchemes$set( MemorySegment seg, int x) {
        _RPC_HTTP_TRANSPORT_CREDENTIALS_V2_A.NumberOfAuthnSchemes$VH.set(seg, x);
    }
    public static int NumberOfAuthnSchemes$get(MemorySegment seg, long index) {
        return (int)_RPC_HTTP_TRANSPORT_CREDENTIALS_V2_A.NumberOfAuthnSchemes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfAuthnSchemes$set(MemorySegment seg, long index, int x) {
        _RPC_HTTP_TRANSPORT_CREDENTIALS_V2_A.NumberOfAuthnSchemes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle AuthnSchemes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AuthnSchemes"));
    public static VarHandle AuthnSchemes$VH() {
        return _RPC_HTTP_TRANSPORT_CREDENTIALS_V2_A.AuthnSchemes$VH;
    }
    public static MemoryAddress AuthnSchemes$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_RPC_HTTP_TRANSPORT_CREDENTIALS_V2_A.AuthnSchemes$VH.get(seg);
    }
    public static void AuthnSchemes$set( MemorySegment seg, MemoryAddress x) {
        _RPC_HTTP_TRANSPORT_CREDENTIALS_V2_A.AuthnSchemes$VH.set(seg, x);
    }
    public static MemoryAddress AuthnSchemes$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_RPC_HTTP_TRANSPORT_CREDENTIALS_V2_A.AuthnSchemes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AuthnSchemes$set(MemorySegment seg, long index, MemoryAddress x) {
        _RPC_HTTP_TRANSPORT_CREDENTIALS_V2_A.AuthnSchemes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ServerCertificateSubject$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ServerCertificateSubject"));
    public static VarHandle ServerCertificateSubject$VH() {
        return _RPC_HTTP_TRANSPORT_CREDENTIALS_V2_A.ServerCertificateSubject$VH;
    }
    public static MemoryAddress ServerCertificateSubject$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_RPC_HTTP_TRANSPORT_CREDENTIALS_V2_A.ServerCertificateSubject$VH.get(seg);
    }
    public static void ServerCertificateSubject$set( MemorySegment seg, MemoryAddress x) {
        _RPC_HTTP_TRANSPORT_CREDENTIALS_V2_A.ServerCertificateSubject$VH.set(seg, x);
    }
    public static MemoryAddress ServerCertificateSubject$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_RPC_HTTP_TRANSPORT_CREDENTIALS_V2_A.ServerCertificateSubject$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ServerCertificateSubject$set(MemorySegment seg, long index, MemoryAddress x) {
        _RPC_HTTP_TRANSPORT_CREDENTIALS_V2_A.ServerCertificateSubject$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ProxyCredentials$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ProxyCredentials"));
    public static VarHandle ProxyCredentials$VH() {
        return _RPC_HTTP_TRANSPORT_CREDENTIALS_V2_A.ProxyCredentials$VH;
    }
    public static MemoryAddress ProxyCredentials$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_RPC_HTTP_TRANSPORT_CREDENTIALS_V2_A.ProxyCredentials$VH.get(seg);
    }
    public static void ProxyCredentials$set( MemorySegment seg, MemoryAddress x) {
        _RPC_HTTP_TRANSPORT_CREDENTIALS_V2_A.ProxyCredentials$VH.set(seg, x);
    }
    public static MemoryAddress ProxyCredentials$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_RPC_HTTP_TRANSPORT_CREDENTIALS_V2_A.ProxyCredentials$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ProxyCredentials$set(MemorySegment seg, long index, MemoryAddress x) {
        _RPC_HTTP_TRANSPORT_CREDENTIALS_V2_A.ProxyCredentials$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberOfProxyAuthnSchemes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfProxyAuthnSchemes"));
    public static VarHandle NumberOfProxyAuthnSchemes$VH() {
        return _RPC_HTTP_TRANSPORT_CREDENTIALS_V2_A.NumberOfProxyAuthnSchemes$VH;
    }
    public static int NumberOfProxyAuthnSchemes$get(MemorySegment seg) {
        return (int)_RPC_HTTP_TRANSPORT_CREDENTIALS_V2_A.NumberOfProxyAuthnSchemes$VH.get(seg);
    }
    public static void NumberOfProxyAuthnSchemes$set( MemorySegment seg, int x) {
        _RPC_HTTP_TRANSPORT_CREDENTIALS_V2_A.NumberOfProxyAuthnSchemes$VH.set(seg, x);
    }
    public static int NumberOfProxyAuthnSchemes$get(MemorySegment seg, long index) {
        return (int)_RPC_HTTP_TRANSPORT_CREDENTIALS_V2_A.NumberOfProxyAuthnSchemes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfProxyAuthnSchemes$set(MemorySegment seg, long index, int x) {
        _RPC_HTTP_TRANSPORT_CREDENTIALS_V2_A.NumberOfProxyAuthnSchemes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ProxyAuthnSchemes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ProxyAuthnSchemes"));
    public static VarHandle ProxyAuthnSchemes$VH() {
        return _RPC_HTTP_TRANSPORT_CREDENTIALS_V2_A.ProxyAuthnSchemes$VH;
    }
    public static MemoryAddress ProxyAuthnSchemes$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_RPC_HTTP_TRANSPORT_CREDENTIALS_V2_A.ProxyAuthnSchemes$VH.get(seg);
    }
    public static void ProxyAuthnSchemes$set( MemorySegment seg, MemoryAddress x) {
        _RPC_HTTP_TRANSPORT_CREDENTIALS_V2_A.ProxyAuthnSchemes$VH.set(seg, x);
    }
    public static MemoryAddress ProxyAuthnSchemes$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_RPC_HTTP_TRANSPORT_CREDENTIALS_V2_A.ProxyAuthnSchemes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ProxyAuthnSchemes$set(MemorySegment seg, long index, MemoryAddress x) {
        _RPC_HTTP_TRANSPORT_CREDENTIALS_V2_A.ProxyAuthnSchemes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


