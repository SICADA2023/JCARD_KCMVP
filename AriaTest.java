package com.etri.applet;

public class AriaTest {
	
	/*
	 * 
	 * This code have KCMVP(ARIA, SEED, LEA).
	 * only one class. :(
	 * You should modify some..
	 * YOU must thinking 3 points.
	 * 1. putkey in KCMVPApplet.java
	 * 2. seedEncrypt in KCMVPApplet.java
	 * 3. AriaTest in AriaTest.java
	 * 
	 * It should be modifie the version you want.
	 * 
	 * */
/* ARIA CRYPTOSYSTEM*/
	
	 public static final byte[] s_0={
	        
	        (byte)0x63, (byte)0x7c, (byte)0x77, (byte)0x7b, (byte)0xf2, (byte)0x6b, (byte)0x6f, (byte)0xc5, (byte)0x30, (byte)0x01, (byte)0x67, (byte)0x2b, (byte)0xfe, (byte)0xd7, (byte)0xab, (byte)0x76,
	        (byte)0xca, (byte)0x82, (byte)0xc9, (byte)0x7d, (byte)0xfa, (byte)0x59, (byte)0x47, (byte)0xf0, (byte)0xad, (byte)0xd4, (byte)0xa2, (byte)0xaf, (byte)0x9c, (byte)0xa4, (byte)0x72, (byte)0xc0,
	        (byte)0xb7, (byte)0xfd, (byte)0x93, (byte)0x26, (byte)0x36, (byte)0x3f, (byte)0xf7, (byte)0xcc, (byte)0x34, (byte)0xa5, (byte)0xe5, (byte)0xf1, (byte)0x71, (byte)0xd8, (byte)0x31, (byte)0x15,
	        (byte)0x04, (byte)0xc7, (byte)0x23, (byte)0xc3, (byte)0x18, (byte)0x96, (byte)0x05, (byte)0x9a, (byte)0x07, (byte)0x12, (byte)0x80, (byte)0xe2, (byte)0xeb, (byte)0x27, (byte)0xb2, (byte)0x75,
	        (byte)0x09, (byte)0x83, (byte)0x2c, (byte)0x1a, (byte)0x1b, (byte)0x6e, (byte)0x5a, (byte)0xa0, (byte)0x52, (byte)0x3b, (byte)0xd6, (byte)0xb3, (byte)0x29, (byte)0xe3, (byte)0x2f, (byte)0x84,
	        (byte)0x53, (byte)0xd1, (byte)0x00, (byte)0xed, (byte)0x20, (byte)0xfc, (byte)0xb1, (byte)0x5b, (byte)0x6a, (byte)0xcb, (byte)0xbe, (byte)0x39, (byte)0x4a, (byte)0x4c, (byte)0x58, (byte)0xcf,
	        (byte)0xd0, (byte)0xef, (byte)0xaa, (byte)0xfb, (byte)0x43, (byte)0x4d, (byte)0x33, (byte)0x85, (byte)0x45, (byte)0xf9, (byte)0x02, (byte)0x7f, (byte)0x50, (byte)0x3c, (byte)0x9f, (byte)0xa8,
	        (byte)0x51, (byte)0xa3, (byte)0x40, (byte)0x8f, (byte)0x92, (byte)0x9d, (byte)0x38, (byte)0xf5, (byte)0xbc, (byte)0xb6, (byte)0xda, (byte)0x21, (byte)0x10, (byte)0xff, (byte)0xf3, (byte)0xd2,
	        (byte)0xcd, (byte)0x0c, (byte)0x13, (byte)0xec, (byte)0x5f, (byte)0x97, (byte)0x44, (byte)0x17, (byte)0xc4, (byte)0xa7, (byte)0x7e, (byte)0x3d, (byte)0x64, (byte)0x5d, (byte)0x19, (byte)0x73,
	        (byte)0x60, (byte)0x81, (byte)0x4f, (byte)0xdc, (byte)0x22, (byte)0x2a, (byte)0x90, (byte)0x88, (byte)0x46, (byte)0xee, (byte)0xb8, (byte)0x14, (byte)0xde, (byte)0x5e, (byte)0x0b, (byte)0xdb,
	        (byte)0xe0, (byte)0x32, (byte)0x3a, (byte)0x0a, (byte)0x49, (byte)0x06, (byte)0x24, (byte)0x5c, (byte)0xc2, (byte)0xd3, (byte)0xac, (byte)0x62, (byte)0x91, (byte)0x95, (byte)0xe4, (byte)0x79,
	        (byte)0xe7, (byte)0xc8, (byte)0x37, (byte)0x6d, (byte)0x8d, (byte)0xd5, (byte)0x4e, (byte)0xa9, (byte)0x6c, (byte)0x56, (byte)0xf4, (byte)0xea, (byte)0x65, (byte)0x7a, (byte)0xae, (byte)0x08,
	        (byte)0xba, (byte)0x78, (byte)0x25, (byte)0x2e, (byte)0x1c, (byte)0xa6, (byte)0xb4, (byte)0xc6, (byte)0xe8, (byte)0xdd, (byte)0x74, (byte)0x1f, (byte)0x4b, (byte)0xbd, (byte)0x8b, (byte)0x8a,
	        (byte)0x70, (byte)0x3e, (byte)0xb5, (byte)0x66, (byte)0x48, (byte)0x03, (byte)0xf6, (byte)0x0e, (byte)0x61, (byte)0x35, (byte)0x57, (byte)0xb9, (byte)0x86, (byte)0xc1, (byte)0x1d, (byte)0x9e,
	        (byte)0xe1, (byte)0xf8, (byte)0x98, (byte)0x11, (byte)0x69, (byte)0xd9, (byte)0x8e, (byte)0x94, (byte)0x9b, (byte)0x1e, (byte)0x87, (byte)0xe9, (byte)0xce, (byte)0x55, (byte)0x28, (byte)0xdf,
	        (byte)0x8c, (byte)0xa1, (byte)0x89, (byte)0x0d, (byte)0xbf, (byte)0xe6, (byte)0x42, (byte)0x68, (byte)0x41, (byte)0x99, (byte)0x2d, (byte)0x0f, (byte)0xb0, (byte)0x54, (byte)0xbb, (byte)0x16
	    };
	        
	    public static byte[]s_1={
	        (byte)0xe2, (byte)0x4e, (byte)0x54, (byte)0xfc, (byte)0x94, (byte)0xc2, (byte)0x4a, (byte)0xcc, (byte)0x62, (byte)0x0d, (byte)0x6a, (byte)0x46, (byte)0x3c, (byte)0x4d, (byte)0x8b, (byte)0xd1,
	        (byte)0x5e, (byte)0xfa, (byte)0x64, (byte)0xcb, (byte)0xb4, (byte)0x97, (byte)0xbe, (byte)0x2b, (byte)0xbc, (byte)0x77, (byte)0x2e, (byte)0x03, (byte)0xd3, (byte)0x19, (byte)0x59, (byte)0xc1,
	        (byte)0x1d, (byte)0x06, (byte)0x41, (byte)0x6b, (byte)0x55, (byte)0xf0, (byte)0x99, (byte)0x69, (byte)0xea, (byte)0x9c, (byte)0x18, (byte)0xae, (byte)0x63, (byte)0xdf, (byte)0xe7, (byte)0xbb,
	        (byte)0x00, (byte)0x73, (byte)0x66, (byte)0xfb, (byte)0x96, (byte)0x4c, (byte)0x85, (byte)0xe4, (byte)0x3a, (byte)0x09, (byte)0x45, (byte)0xaa, (byte)0x0f, (byte)0xee, (byte)0x10, (byte)0xeb,
	        (byte)0x2d, (byte)0x7f, (byte)0xf4, (byte)0x29, (byte)0xac, (byte)0xcf, (byte)0xad, (byte)0x91, (byte)0x8d, (byte)0x78, (byte)0xc8, (byte)0x95, (byte)0xf9, (byte)0x2f, (byte)0xce, (byte)0xcd,
	        (byte)0x08, (byte)0x7a, (byte)0x88, (byte)0x38, (byte)0x5c, (byte)0x83, (byte)0x2a, (byte)0x28, (byte)0x47, (byte)0xdb, (byte)0xb8, (byte)0xc7, (byte)0x93, (byte)0xa4, (byte)0x12, (byte)0x53,
	        (byte)0xff, (byte)0x87, (byte)0x0e, (byte)0x31, (byte)0x36, (byte)0x21, (byte)0x58, (byte)0x48, (byte)0x01, (byte)0x8e, (byte)0x37, (byte)0x74, (byte)0x32, (byte)0xca, (byte)0xe9, (byte)0xb1,
	        (byte)0xb7, (byte)0xab, (byte)0x0c, (byte)0xd7, (byte)0xc4, (byte)0x56, (byte)0x42, (byte)0x26, (byte)0x07, (byte)0x98, (byte)0x60, (byte)0xd9, (byte)0xb6, (byte)0xb9, (byte)0x11, (byte)0x40,
	        (byte)0xec, (byte)0x20, (byte)0x8c, (byte)0xbd, (byte)0xa0, (byte)0xc9, (byte)0x84, (byte)0x04, (byte)0x49, (byte)0x23, (byte)0xf1, (byte)0x4f, (byte)0x50, (byte)0x1f, (byte)0x13, (byte)0xdc,
	        (byte)0xd8, (byte)0xc0, (byte)0x9e, (byte)0x57, (byte)0xe3, (byte)0xc3, (byte)0x7b, (byte)0x65, (byte)0x3b, (byte)0x02, (byte)0x8f, (byte)0x3e, (byte)0xe8, (byte)0x25, (byte)0x92, (byte)0xe5,
	        (byte)0x15, (byte)0xdd, (byte)0xfd, (byte)0x17, (byte)0xa9, (byte)0xbf, (byte)0xd4, (byte)0x9a, (byte)0x7e, (byte)0xc5, (byte)0x39, (byte)0x67, (byte)0xfe, (byte)0x76, (byte)0x9d, (byte)0x43,
	        (byte)0xa7, (byte)0xe1, (byte)0xd0, (byte)0xf5, (byte)0x68, (byte)0xf2, (byte)0x1b, (byte)0x34, (byte)0x70, (byte)0x05, (byte)0xa3, (byte)0x8a, (byte)0xd5, (byte)0x79, (byte)0x86, (byte)0xa8,
	        (byte)0x30, (byte)0xc6, (byte)0x51, (byte)0x4b, (byte)0x1e, (byte)0xa6, (byte)0x27, (byte)0xf6, (byte)0x35, (byte)0xd2, (byte)0x6e, (byte)0x24, (byte)0x16, (byte)0x82, (byte)0x5f, (byte)0xda,
	        (byte)0xe6, (byte)0x75, (byte)0xa2, (byte)0xef, (byte)0x2c, (byte)0xb2, (byte)0x1c, (byte)0x9f, (byte)0x5d, (byte)0x6f, (byte)0x80, (byte)0x0a, (byte)0x72, (byte)0x44, (byte)0x9b, (byte)0x6c,
	        (byte)0x90, (byte)0x0b, (byte)0x5b, (byte)0x33, (byte)0x7d, (byte)0x5a, (byte)0x52, (byte)0xf3, (byte)0x61, (byte)0xa1, (byte)0xf7, (byte)0xb0, (byte)0xd6, (byte)0x3f, (byte)0x7c, (byte)0x6d,
	        (byte)0xed, (byte)0x14, (byte)0xe0, (byte)0xa5, (byte)0x3d, (byte)0x22, (byte)0xb3, (byte)0xf8, (byte)0x89, (byte)0xde, (byte)0x71, (byte)0x1a, (byte)0xaf, (byte)0xba, (byte)0xb5, (byte)0x81 
	    };

	    public static byte[]s_2 ={
	        (byte)0x52, (byte)0x09, (byte)0x6a, (byte)0xd5, (byte)0x30, (byte)0x36, (byte)0xa5, (byte)0x38, (byte)0xbf, (byte)0x40, (byte)0xa3, (byte)0x9e, (byte)0x81, (byte)0xf3, (byte)0xd7, (byte)0xfb,
	        (byte)0x7c, (byte)0xe3, (byte)0x39, (byte)0x82, (byte)0x9b, (byte)0x2f, (byte)0xff, (byte)0x87, (byte)0x34, (byte)0x8e, (byte)0x43, (byte)0x44, (byte)0xc4, (byte)0xde, (byte)0xe9, (byte)0xcb,
	        (byte)0x54, (byte)0x7b, (byte)0x94, (byte)0x32, (byte)0xa6, (byte)0xc2, (byte)0x23, (byte)0x3d, (byte)0xee, (byte)0x4c, (byte)0x95, (byte)0x0b, (byte)0x42, (byte)0xfa, (byte)0xc3, (byte)0x4e,
	        (byte)0x08, (byte)0x2e, (byte)0xa1, (byte)0x66, (byte)0x28, (byte)0xd9, (byte)0x24, (byte)0xb2, (byte)0x76, (byte)0x5b, (byte)0xa2, (byte)0x49, (byte)0x6d, (byte)0x8b, (byte)0xd1, (byte)0x25,
	        (byte)0x72, (byte)0xf8, (byte)0xf6, (byte)0x64, (byte)0x86, (byte)0x68, (byte)0x98, (byte)0x16, (byte)0xd4, (byte)0xa4, (byte)0x5c, (byte)0xcc, (byte)0x5d, (byte)0x65, (byte)0xb6, (byte)0x92,
	        (byte)0x6c, (byte)0x70, (byte)0x48, (byte)0x50, (byte)0xfd, (byte)0xed, (byte)0xb9, (byte)0xda, (byte)0x5e, (byte)0x15, (byte)0x46, (byte)0x57, (byte)0xa7, (byte)0x8d, (byte)0x9d, (byte)0x84,
	        (byte)0x90, (byte)0xd8, (byte)0xab, (byte)0x00, (byte)0x8c, (byte)0xbc, (byte)0xd3, (byte)0x0a, (byte)0xf7, (byte)0xe4, (byte)0x58, (byte)0x05, (byte)0xb8, (byte)0xb3, (byte)0x45, (byte)0x06,
	        (byte)0xd0, (byte)0x2c, (byte)0x1e, (byte)0x8f, (byte)0xca, (byte)0x3f, (byte)0x0f, (byte)0x02, (byte)0xc1, (byte)0xaf, (byte)0xbd, (byte)0x03, (byte)0x01, (byte)0x13, (byte)0x8a, (byte)0x6b,
	        (byte)0x3a, (byte)0x91, (byte)0x11, (byte)0x41, (byte)0x4f, (byte)0x67, (byte)0xdc, (byte)0xea, (byte)0x97, (byte)0xf2, (byte)0xcf, (byte)0xce, (byte)0xf0, (byte)0xb4, (byte)0xe6, (byte)0x73,
	        (byte)0x96, (byte)0xac, (byte)0x74, (byte)0x22, (byte)0xe7, (byte)0xad, (byte)0x35, (byte)0x85, (byte)0xe2, (byte)0xf9, (byte)0x37, (byte)0xe8, (byte)0x1c, (byte)0x75, (byte)0xdf, (byte)0x6e,
	        (byte)0x47, (byte)0xf1, (byte)0x1a, (byte)0x71, (byte)0x1d, (byte)0x29, (byte)0xc5, (byte)0x89, (byte)0x6f, (byte)0xb7, (byte)0x62, (byte)0x0e, (byte)0xaa, (byte)0x18, (byte)0xbe, (byte)0x1b,
	        (byte)0xfc, (byte)0x56, (byte)0x3e, (byte)0x4b, (byte)0xc6, (byte)0xd2, (byte)0x79, (byte)0x20, (byte)0x9a, (byte)0xdb, (byte)0xc0, (byte)0xfe, (byte)0x78, (byte)0xcd, (byte)0x5a, (byte)0xf4,
	        (byte)0x1f, (byte)0xdd, (byte)0xa8, (byte)0x33, (byte)0x88, (byte)0x07, (byte)0xc7, (byte)0x31, (byte)0xb1, (byte)0x12, (byte)0x10, (byte)0x59, (byte)0x27, (byte)0x80, (byte)0xec, (byte)0x5f,
	        (byte)0x60, (byte)0x51, (byte)0x7f, (byte)0xa9, (byte)0x19, (byte)0xb5, (byte)0x4a, (byte)0x0d, (byte)0x2d, (byte)0xe5, (byte)0x7a, (byte)0x9f, (byte)0x93, (byte)0xc9, (byte)0x9c, (byte)0xef,
	        (byte)0xa0, (byte)0xe0, (byte)0x3b, (byte)0x4d, (byte)0xae, (byte)0x2a, (byte)0xf5, (byte)0xb0, (byte)0xc8, (byte)0xeb, (byte)0xbb, (byte)0x3c, (byte)0x83, (byte)0x53, (byte)0x99, (byte)0x61,
	        (byte)0x17, (byte)0x2b, (byte)0x04, (byte)0x7e, (byte)0xba, (byte)0x77, (byte)0xd6, (byte)0x26, (byte)0xe1, (byte)0x69, (byte)0x14, (byte)0x63, (byte)0x55, (byte)0x21, (byte)0x0c, (byte)0x7d
	    };
	    public static byte[] s_3 ={
	        (byte)0x30, (byte)0x68, (byte)0x99, (byte)0x1b, (byte)0x87, (byte)0xb9, (byte)0x21, (byte)0x78, (byte)0x50, (byte)0x39, (byte)0xdb, (byte)0xe1, (byte)0x72, (byte)0x09, (byte)0x62, (byte)0x3c,
	        (byte)0x3e, (byte)0x7e, (byte)0x5e, (byte)0x8e, (byte)0xf1, (byte)0xa0, (byte)0xcc, (byte)0xa3, (byte)0x2a, (byte)0x1d, (byte)0xfb, (byte)0xb6, (byte)0xd6, (byte)0x20, (byte)0xc4, (byte)0x8d,
	        (byte)0x81, (byte)0x65, (byte)0xf5, (byte)0x89, (byte)0xcb, (byte)0x9d, (byte)0x77, (byte)0xc6, (byte)0x57, (byte)0x43, (byte)0x56, (byte)0x17, (byte)0xd4, (byte)0x40, (byte)0x1a, (byte)0x4d,
	        (byte)0xc0, (byte)0x63, (byte)0x6c, (byte)0xe3, (byte)0xb7, (byte)0xc8, (byte)0x64, (byte)0x6a, (byte)0x53, (byte)0xaa, (byte)0x38, (byte)0x98, (byte)0x0c, (byte)0xf4, (byte)0x9b, (byte)0xed,
	        (byte)0x7f, (byte)0x22, (byte)0x76, (byte)0xaf, (byte)0xdd, (byte)0x3a, (byte)0x0b, (byte)0x58, (byte)0x67, (byte)0x88, (byte)0x06, (byte)0xc3, (byte)0x35, (byte)0x0d, (byte)0x01, (byte)0x8b,
	        (byte)0x8c, (byte)0xc2, (byte)0xe6, (byte)0x5f, (byte)0x02, (byte)0x24, (byte)0x75, (byte)0x93, (byte)0x66, (byte)0x1e, (byte)0xe5, (byte)0xe2, (byte)0x54, (byte)0xd8, (byte)0x10, (byte)0xce,
	        (byte)0x7a, (byte)0xe8, (byte)0x08, (byte)0x2c, (byte)0x12, (byte)0x97, (byte)0x32, (byte)0xab, (byte)0xb4, (byte)0x27, (byte)0x0a, (byte)0x23, (byte)0xdf, (byte)0xef, (byte)0xca, (byte)0xd9,
	        (byte)0xb8, (byte)0xfa, (byte)0xdc, (byte)0x31, (byte)0x6b, (byte)0xd1, (byte)0xad, (byte)0x19, (byte)0x49, (byte)0xbd, (byte)0x51, (byte)0x96, (byte)0xee, (byte)0xe4, (byte)0xa8, (byte)0x41,
	        (byte)0xda, (byte)0xff, (byte)0xcd, (byte)0x55, (byte)0x86, (byte)0x36, (byte)0xbe, (byte)0x61, (byte)0x52, (byte)0xf8, (byte)0xbb, (byte)0x0e, (byte)0x82, (byte)0x48, (byte)0x69, (byte)0x9a,
	        (byte)0xe0, (byte)0x47, (byte)0x9e, (byte)0x5c, (byte)0x04, (byte)0x4b, (byte)0x34, (byte)0x15, (byte)0x79, (byte)0x26, (byte)0xa7, (byte)0xde, (byte)0x29, (byte)0xae, (byte)0x92, (byte)0xd7,
	        (byte)0x84, (byte)0xe9, (byte)0xd2, (byte)0xba, (byte)0x5d, (byte)0xf3, (byte)0xc5, (byte)0xb0, (byte)0xbf, (byte)0xa4, (byte)0x3b, (byte)0x71, (byte)0x44, (byte)0x46, (byte)0x2b, (byte)0xfc,
	        (byte)0xeb, (byte)0x6f, (byte)0xd5, (byte)0xf6, (byte)0x14, (byte)0xfe, (byte)0x7c, (byte)0x70, (byte)0x5a, (byte)0x7d, (byte)0xfd, (byte)0x2f, (byte)0x18, (byte)0x83, (byte)0x16, (byte)0xa5,
	        (byte)0x91, (byte)0x1f, (byte)0x05, (byte)0x95, (byte)0x74, (byte)0xa9, (byte)0xc1, (byte)0x5b, (byte)0x4a, (byte)0x85, (byte)0x6d, (byte)0x13, (byte)0x07, (byte)0x4f, (byte)0x4e, (byte)0x45,
	        (byte)0xb2, (byte)0x0f, (byte)0xc9, (byte)0x1c, (byte)0xa6, (byte)0xbc, (byte)0xec, (byte)0x73, (byte)0x90, (byte)0x7b, (byte)0xcf, (byte)0x59, (byte)0x8f, (byte)0xa1, (byte)0xf9, (byte)0x2d,
	        (byte)0xf2, (byte)0xb1, (byte)0x00, (byte)0x94, (byte)0x37, (byte)0x9f, (byte)0xd0, (byte)0x2e, (byte)0x9c, (byte)0x6e, (byte)0x28, (byte)0x3f, (byte)0x80, (byte)0xf0, (byte)0x3d, (byte)0xd3,
	        (byte)0x25, (byte)0x8a, (byte)0xb5, (byte)0xe7, (byte)0x42, (byte)0xb3, (byte)0xc7, (byte)0xea, (byte)0xf7, (byte)0x4c, (byte)0x11, (byte)0x33, (byte)0x03, (byte)0xa2, (byte)0xac, (byte)0x60};
	    
	    public static final byte[] KRK_0 = {
	    (byte)0x51, (byte)0x7c, (byte)0xc1, (byte)0xb7, (byte)0x27, (byte)0x22, (byte)0x0a, (byte)0x94, (byte)0xfe, (byte)0x13, (byte)0xab, (byte)0xe8, (byte)0xfa, (byte)0x9a, (byte)0x6e, (byte)0xe0}; 
	    
	    public static final byte[] KRK_1={(byte)0x6d, (byte)0xb1, (byte)0x4a, (byte)0xcc, (byte)0x9e, (byte)0x21, (byte)0xc8, (byte)0x20, (byte)0xff, (byte)0x28, (byte)0xb1, (byte)0xd5, (byte)0xef, (byte)0x5d, (byte)0xe2, (byte)0xb0};
	    
	    public static final byte[] KRK_2={(byte)0xdb, (byte)0x92, (byte)0x37, (byte)0x1d, (byte)0x21, (byte)0x26, (byte)0xe9, (byte)0x70, (byte)0x03, (byte)0x24, (byte)0x97, (byte)0x75, (byte)0x04, (byte)0xe8, (byte)0xc9, (byte)0x0e};
	    
	    public static void DL(short[] i, short num1, short[] o, short num2){
	        short T;      
	        T = (short)(i[num1+3] ^ i[num1+4] ^ i[num1+9] ^ i[num1+14]);
	        o[num2+ 0] = (short)(i[num1+ 6] ^ i[num1+ 8] ^ i[num1+13] ^ T);
	        o[num2+ 5] = (short)(i[num1+ 1] ^ i[num1+10] ^ i[num1+15] ^ T);
	        o[num2+11] = (short)(i[num1+ 2] ^ i[num1+ 7] ^ i[num1+12] ^ T);
	        o[num2+14] = (short)(i[num1+ 0] ^ i[num1+ 5] ^ i[num1+11] ^ T);
	        T =     (short)(i[num1+ 2] ^ i[num1+ 5] ^ i[num1+ 8] ^ i[num1+15]);
	        o[num2+ 1] = (short)(i[num1+ 7] ^ i[num1+ 9] ^ i[num1+12] ^ T);
	        o[num2+ 4] = (short)(i[num1+ 0] ^ i[num1+11] ^ i[num1+14] ^ T);
	        o[num2+10] = (short)(i[num1+ 3] ^ i[num1+ 6] ^ i[num1+13] ^ T);
	        o[num2+15] = (short)(i[num1+ 1] ^ i[num1+ 4] ^ i[num1+10] ^ T);
	        T =     (short)(i[num1+ 1] ^ i[num1+ 6] ^ i[num1+11] ^ i[num1+12]);
	        o[num2+ 2] = (short)(i[num1+ 4] ^ i[num1+10] ^ i[num1+15] ^ T);
	        o[num2+ 7] = (short)(i[num1+ 3] ^ i[num1+ 8] ^ i[num1+13] ^ T);
	        o[num2+ 9] = (short)(i[num1+ 0] ^ i[num1+ 5] ^ i[num1+14] ^ T);
	        o[num2+12] = (short)(i[num1+ 2] ^ i[num1+ 7] ^ i[num1+ 9] ^ T);
	        T =     (short)(i[num1+ 0] ^ i[num1+ 7] ^ i[num1+10] ^ i[num1+13]);
	        o[num2+ 3] = (short)(i[num1+ 5] ^ i[num1+11] ^ i[num1+14] ^ T);
	        o[num2+ 6] = (short)(i[num1+ 2] ^ i[num1+ 9] ^ i[num1+12] ^ T);
	        o[num2+ 8] = (short)(i[num1+ 1] ^ i[num1+ 4] ^ i[num1+15] ^ T);
	        o[num2+13] = (short)(i[num1+ 3] ^ i[num1+ 6] ^ i[num1+ 8] ^ T);
	    }

	    public static void RotXOR(short [] S, short n, short[] t, short rott){
	        short i, q;
	        q=(short)(n/8);
	        n %= 8;
	        for(i=0;i<16;i++){
	            t[rott+(((q+i)%16))]^=(S[i]>>n);
	            if(n!=0){
	                t[rott+((q+i+1) % 16)] ^= ((S[i] << (8-n))%256);
	            }
	        }
	    }

	    public static short power_2(byte a){
	        short b=1;
	        for(short i=0;i<a;i++){
	            b*=2;
	        }
	        return b;
	    }

	    public static short s_to_u(byte a){
	        short b=0, c;
	        for(short i=0;i<8;i++){
	            c=(short)(a>>(7 - i) & 1);
	            if(c==1){
	                b+=power_2((byte)(7-i));
	            }
	        }
	        return b;
	    }
	    public static short EncKeySetup(short[] w0, short[] e, short keyBits){
	  
	        short i, R=(short)((keyBits+256)/32), q;
	        short[] t= new short[16];
	        short[] w1= new short[16];
	        short[] w2= new short[16];
	        short[] w3= new short[16];
	        q=(short)((keyBits - 128)/ 64);
	        short m;
	        for(i=0;i<16;i++){
	            if(q==0){
	                m=(short)((KRK_0[i])^w0[i]);
	            }
	            else if(q==1){
	                m=(short)((KRK_1[i])^w0[i]);
	            }
	            else{
	                m=(short)((KRK_2[i])^w0[i]);
	            }
	            m=s_to_u((byte)m);
	            if(i%4==0){
	                t[i]=(short)s_0[m];
	                
	            }
	            else if(i%4==1){
	                t[i]=(short)s_1[m];
	            }
	            else if(i%4==2){
	                t[i]=(short)s_2[m];
	            }
	            else{
	                t[i]=(short)s_3[m];
	            }
	            t[i]=s_to_u((byte)t[i]);
	        }
	        DL(t,(short)0,w1,(short)0); 
	        if(R==14){
	            for (i = 0; i <  8; i++) w1[i] ^= w0[16+i];
	        }
	        else if (R==16){
			for (i = 0; i < 16; i++) w1[i] ^= w0[16+i];
	        }
	        if(q==2){
	            q=0;
	        }
	        else{
	            q+=1;
	        }
	        for (i = 0; i < 16; i++){ 
	            if(q==0){
	                m=(short)(KRK_0[i]^w1[i]);
	            }
	            else if(q==1){
	                m=(short)(KRK_1[i]^w1[i]);
	            }
	            else{
	                m=(short)(KRK_2[i]^w1[i]);
	            }
	            m=s_to_u((byte)m);
	            if((2+i)%4==0){
	                t[i]=(short)s_0[m];
	            }
	            else if((2+i)%4==1){
	                t[i]=(short)s_1[m];
	            }
	            else if((2+i)%4==2){
	                t[i]=(short)s_2[m];
	            }
	            else{
	                t[i]=(short)s_3[m];
	            }
	            t[i]=s_to_u((byte)t[i]);
	        }
	        DL(t,(short)0, w2, (short)0); 
	        for (i = 0; i < 16; i++) w2[i] ^= w0[i];   
	        if(q==2){
	            q=0;
	        }
	        else{
	            q+=1;
	        }
	        for (i = 0; i < 16; i++){ 
	            if(q==0){
	                m=(short)(KRK_0[i]^w2[i]);
	            }
	            else if(q==1){
	                m=(short)(KRK_1[i]^w2[i]);
	            }
	            else{
	                m=(short)(KRK_2[i]^w2[i]);
	            }
	            m=s_to_u((byte)m);
	            if(i%4==0){
	                t[i]=(short)s_0[m];
	            }
	            else if(i%4==1){
	                t[i]=(short)s_1[m];
	            }
	            else if(i%4==2){
	                t[i]=(short)s_2[m];
	            }
	            else{
	                t[i]=(short)s_3[m];
	            }
	            t[i]=s_to_u((byte)t[i]);
	        }
	        
		    DL (t, (short)0,w3, (short)0);
		    for (i = 0; i < 16; i++) w3[i] ^= w1[i];      
	        for (i = 0; i < 16*(R+1); i++) e[i] = 0;

	        RotXOR(w0, (short)0, e ,(short)0 );         
	        RotXOR (w1, (short)19, e,(short)0 ); 
	        RotXOR (w1, (short)0, e ,  (short)16);
	       
	        RotXOR (w2,  (short)19, e ,  (short)16);
	        RotXOR (w2, (short)0, e ,  (short)32); 
	        RotXOR (w3,  (short)19, e ,  (short)32);
	        RotXOR (w3, (short)0, e ,  (short)48); 
	        RotXOR (w0,  (short)19, e ,  (short)48);
	        RotXOR (w0, (short)0, e , (short)64); 
	        RotXOR (w1,  (short)31, e ,  (short)64);
	        RotXOR (w1, (short)0, e ,  (short)80); 
	        RotXOR (w2,  (short)31, e , (short)80);
	        RotXOR (w2, (short)0, e , (short)96); 
	        RotXOR (w3,  (short)31, e , (short)96);
	        RotXOR (w3, (short)0, e , (short)112); 
	        RotXOR (w0,  (short)31, e , (short)112);
	        RotXOR (w0, (short)0, e , (short)128); 
	        RotXOR (w1,  (short)67, e , (short)128);
	        RotXOR (w1, (short)0, e , (short)144); 
	        RotXOR (w2,  (short)67, e , (short)144);
	        RotXOR (w2, (short)0, e , (short)160); 
	        RotXOR (w3,  (short)67, e , (short)160);
	        RotXOR (w3, (short)0, e , (short)176); 
	        RotXOR (w0,  (short)67, e , (short)176);
	        RotXOR (w0, (short)0, e , (short)192); 
	        RotXOR (w1,  (short)97, e , (short)192);
	        
	        if (R > 12) {
	            RotXOR (w1, (short)0, e , (short)208); RotXOR (w2,  (short)97, e , (short)208);
	            RotXOR (w2, (short)0, e , (short)224); RotXOR (w3,  (short)97, e , (short) 224);
	        }
	        if (R > 14) {
	            RotXOR (w3, (short)0, e , (short)240); RotXOR (w0, (short) 97, e , (short)240);
	            RotXOR (w0, (short)0, e , (short)256); RotXOR (w1, (short)109, e , (short)256);
	        }
	       
	        return R;

	    }

	    public static short DecKeySetup(short[]w0, short[]d, short keyBits) {
	        short  i, j, R;
	        short[] t= new short[16];
	      
	        R=EncKeySetup(w0, d, keyBits);
	        for (j = 0; j < 16; j++){
	            t[j] = d[j];
	            d[j] = d[16*R + j];
	            d[16*R + j] = t[j];
	        }
	        for (i = 1; i <= R/2; i++){
	            DL (d , (short)(i*16), t, (short)0);
	            
	            DL (d , (short)((R-i)*16), d , (short)(i*16));
	            for (j = 0; j < 16; j++) d[(R-i)*16 + j] = t[j];
	        }
	        return R;
	    }

	    public static void Crypt(short[] p, short R, short[] e, short[] c, short a){
	    
	        short i, j, k;
	        short[] t=new short[16];
	        for (j = 0; j < 16; j++) c[j] = p[j];
	        for (i = 0; i < R/2; i++){
	            for (j = 0; j < 16; j++){
	                k=(short)(e[j+a] ^ c[j]);
	                k=s_to_u((byte)k);
	                if(j%4==0){
	                    t[j]=s_0[k];
	                }
	                else if(j%4==1){
	                    t[j]=s_1[k];
	                }
	                else if(j%4==2){
	                    t[j]=s_2[k];
	                }
	                else{
	                    t[j]=s_3[k];
	                }
	                t[j]=s_to_u((byte)t[j]);
	            }
	            
	            DL(t,(short)0, c, (short)0); 
	            
	            a += 16;
	            for (j = 0; j < 16; j++){ 
	                k=(short)(e[j+a] ^ c[j]);
	                k=s_to_u((byte)k);
	                if((2 + j) % 4==0){
	                    t[j]=s_0[k];
	                }
	                else if((2 + j) % 4==1){
	                    t[j]=s_1[k];
	                }
	                else if((2 + j) % 4==2){
	                    t[j]=s_2[k];
	                }
	                else{
	                    t[j]=s_3[k];
	                }
	                t[j]=s_to_u((byte)t[j]);
	            }
	            DL(t,(short)0, c, (short)0);
	            a += 16;
	        }
	        DL(c,(short)0, t, (short)0);
	        for (j = 0; j < 16; j++){
	            k=(short)(e[j+a] ^ t[j]);
	            k=s_to_u((byte)k);
	            c[j] = (short)(k);
	        } 
	    }
	
	
	

/* SEED CRYPTOSYSTEM */
	
	/*
	This is SEED in JAVA for javacard. Data type is only short or byte.
	So, we should make int_addition and int_minus.
	addition algorithm is very simple.
	Input: short[4] array1, short[4] array2.
	Ouput: short[4] outarray.
	
	we used to byte data in short buffer.
	It only used low 8-bit.
	
*/	

/*
	public static short power_2(byte a) {

		short b = 1;

		for (short i = 0; i < a; i++) {

		b *= 2;

		}

		return b;

		}

		public static short s_to_u(byte a) {

		short b = 0, c;

		for (short i = 0; i < 8; i++) {

		c = (short) (a >> (7 - i) & 1);

		if (c == 1) {

		b += power_2((byte) (7 - i));

		}

		}

		return b;

		}

		private final static byte[] SBox1 = {

		(byte) 169, (byte) 133, (byte) 214, (byte) 211, (byte) 84, (byte) 29, (byte) 172, (byte) 37,

		(byte) 93, (byte) 67, (byte) 24, (byte) 30, (byte) 81, (byte) 252, (byte) 202, (byte) 99,

		(byte) 40, (byte) 68, (byte) 32, (byte) 157, (byte) 224, (byte) 226, (byte) 200, (byte) 23,

		(byte) 165, (byte) 143, (byte) 3, (byte) 123, (byte) 187, (byte) 19, (byte) 210, (byte) 238,

		(byte) 112, (byte) 140, (byte) 63, (byte) 168, (byte) 50, (byte) 221, (byte) 246, (byte) 116,

		(byte) 236, (byte) 149, (byte) 11, (byte) 87, (byte) 92, (byte) 91, (byte) 189, (byte) 1,

		(byte) 36, (byte) 28, (byte) 115, (byte) 152, (byte) 16, (byte) 204, (byte) 242, (byte) 217,

		(byte) 44, (byte) 231, (byte) 114, (byte) 131, (byte) 155, (byte) 209, (byte) 134, (byte) 201,

		(byte) 96, (byte) 80, (byte) 163, (byte) 235, (byte) 13, (byte) 182, (byte) 158, (byte) 79,

		(byte) 183, (byte) 90, (byte) 198, (byte) 120, (byte) 166, (byte) 18, (byte) 175, (byte) 213,

		(byte) 97, (byte) 195, (byte) 180, (byte) 65, (byte) 82, (byte) 125, (byte) 141, (byte) 8,

		(byte) 31, (byte) 153, (byte) 0, (byte) 25, (byte) 4, (byte) 83, (byte) 247, (byte) 225,

		(byte) 253, (byte) 118, (byte) 47, (byte) 39, (byte) 176, (byte) 139, (byte) 14, (byte) 171,

		(byte) 162, (byte) 110, (byte) 147, (byte) 77, (byte) 105, (byte) 124, (byte) 9, (byte) 10,

		(byte) 191, (byte) 239, (byte) 243, (byte) 197, (byte) 135, (byte) 20, (byte) 254, (byte) 100,

		(byte) 222, (byte) 46, (byte) 75, (byte) 26, (byte) 6, (byte) 33, (byte) 107, (byte) 102,

		(byte) 2, (byte) 245, (byte) 146, (byte) 138, (byte) 12, (byte) 179, (byte) 126, (byte) 208,

		(byte) 122, (byte) 71, (byte) 150, (byte) 229, (byte) 38, (byte) 128, (byte) 173, (byte) 223,

		(byte) 161, (byte) 48, (byte) 55, (byte) 174, (byte) 54, (byte) 21, (byte) 34, (byte) 56,

		(byte) 244, (byte) 167, (byte) 69, (byte) 76, (byte) 129, (byte) 233, (byte) 132, (byte) 151,

		(byte) 53, (byte) 203, (byte) 206, (byte) 60, (byte) 113, (byte) 17, (byte) 199, (byte) 137,

		(byte) 117, (byte) 251, (byte) 218, (byte) 248, (byte) 148, (byte) 89, (byte) 130, (byte) 196,

		(byte) 255, (byte) 73, (byte) 57, (byte) 103, (byte) 192, (byte) 207, (byte) 215, (byte) 184,

		(byte) 15, (byte) 142, (byte) 66, (byte) 35, (byte) 145, (byte) 108, (byte) 219, (byte) 164,

		(byte) 52, (byte) 241, (byte) 72, (byte) 194, (byte) 111, (byte) 61, (byte) 45, (byte) 64,

		(byte) 190, (byte) 62, (byte) 188, (byte) 193, (byte) 170, (byte) 186, (byte) 78, (byte) 85,

		(byte) 59, (byte) 220, (byte) 104, (byte) 127, (byte) 156, (byte) 216, (byte) 74, (byte) 86,

		(byte) 119, (byte) 160, (byte) 237, (byte) 70, (byte) 181, (byte) 43, (byte) 101, (byte) 250,

		(byte) 227, (byte) 185, (byte) 177, (byte) 159, (byte) 94, (byte) 249, (byte) 230, (byte) 178,

		(byte) 49, (byte) 234, (byte) 109, (byte) 95, (byte) 228, (byte) 240, (byte) 205, (byte) 136,

		(byte) 22, (byte) 58, (byte) 88, (byte) 212, (byte) 98, (byte) 41, (byte) 7, (byte) 51,

		(byte) 232, (byte) 27, (byte) 5, (byte) 121, (byte) 144, (byte) 106, (byte) 42, (byte) 154

		};

		private final static byte[] SBox2 = {

		(byte) 56, (byte) 232, (byte) 45, (byte) 166, (byte) 207, (byte) 222, (byte) 179, (byte) 184,

		(byte) 175, (byte) 96, (byte) 85, (byte) 199, (byte) 68, (byte) 111, (byte) 107, (byte) 91,

		(byte) 195, (byte) 98, (byte) 51, (byte) 181, (byte) 41, (byte) 160, (byte) 226, (byte) 167,

		(byte) 211, (byte) 145, (byte) 17, (byte) 6, (byte) 28, (byte) 188, (byte) 54, (byte) 75,

		(byte) 239, (byte) 136, (byte) 108, (byte) 168, (byte) 23, (byte) 196, (byte) 22, (byte) 244,

		(byte) 194, (byte) 69, (byte) 225, (byte) 214, (byte) 63, (byte) 61, (byte) 142, (byte) 152,

		(byte) 40, (byte) 78, (byte) 246, (byte) 62, (byte) 165, (byte) 249, (byte) 13, (byte) 223,

		(byte) 216, (byte) 43, (byte) 102, (byte) 122, (byte) 39, (byte) 47, (byte) 241, (byte) 114,

		(byte) 66, (byte) 212, (byte) 65, (byte) 192, (byte) 115, (byte) 103, (byte) 172, (byte) 139,

		(byte) 247, (byte) 173, (byte) 128, (byte) 31, (byte) 202, (byte) 44, (byte) 170, (byte) 52,

		(byte) 210, (byte) 11, (byte) 238, (byte) 233, (byte) 93, (byte) 148, (byte) 24, (byte) 248,

		(byte) 87, (byte) 174, (byte) 8, (byte) 197, (byte) 19, (byte) 205, (byte) 134, (byte) 185,

		(byte) 255, (byte) 125, (byte) 193, (byte) 49, (byte) 245, (byte) 138, (byte) 106, (byte) 177,

		(byte) 209, (byte) 32, (byte) 215, (byte) 2, (byte) 34, (byte) 4, (byte) 104, (byte) 113,

		(byte) 7, (byte) 219, (byte) 157, (byte) 153, (byte) 97, (byte) 190, (byte) 230, (byte) 89,

		(byte) 221, (byte) 81, (byte) 144, (byte) 220, (byte) 154, (byte) 163, (byte) 171, (byte) 208,

		(byte) 129, (byte) 15, (byte) 71, (byte) 26, (byte) 227, (byte) 236, (byte) 141, (byte) 191,

		(byte) 150, (byte) 123, (byte) 92, (byte) 162, (byte) 161, (byte) 99, (byte) 35, (byte) 77,

		(byte) 200, (byte) 158, (byte) 156, (byte) 58, (byte) 12, (byte) 46, (byte) 186, (byte) 110,

		(byte) 159, (byte) 90, (byte) 242, (byte) 146, (byte) 243, (byte) 73, (byte) 120, (byte) 204,

		(byte) 21, (byte) 251, (byte) 112, (byte) 117, (byte) 127, (byte) 53, (byte) 16, (byte) 3,

		(byte) 100, (byte) 109, (byte) 198, (byte) 116, (byte) 213, (byte) 180, (byte) 234, (byte) 9,

		(byte) 118, (byte) 25, (byte) 254, (byte) 64, (byte) 18, (byte) 224, (byte) 189, (byte) 5,

		(byte) 250, (byte) 1, (byte) 240, (byte) 42, (byte) 94, (byte) 169, (byte) 86, (byte) 67,

		(byte) 133, (byte) 20, (byte) 137, (byte) 155, (byte) 176, (byte) 229, (byte) 72, (byte) 121,

		(byte) 151, (byte) 252, (byte) 30, (byte) 130, (byte) 33, (byte) 140, (byte) 27, (byte) 95,

		(byte) 119, (byte) 84, (byte) 178, (byte) 29, (byte) 37, (byte) 79, (byte) 0, (byte) 70,

		(byte) 237, (byte) 88, (byte) 82, (byte) 235, (byte) 126, (byte) 218, (byte) 201, (byte) 253,

		(byte) 48, (byte) 149, (byte) 101, (byte) 60, (byte) 182, (byte) 228, (byte) 187, (byte) 124,

		(byte) 14, (byte) 80, (byte) 57, (byte) 38, (byte) 50, (byte) 132, (byte) 105, (byte) 147,

		(byte) 55, (byte) 231, (byte) 36, (byte) 164, (byte) 203, (byte) 83, (byte) 10, (byte) 135,

		(byte) 217, (byte) 76, (byte) 131, (byte) 143, (byte) 206, (byte) 59, (byte) 74, (byte) 183

		};

		public static short[] MINUS(short[] p1, short[] p2) {

		short[] p3 = { 0, 0, 0, 0 };

		p3[3] += (short) (p1[3] - p2[3]);

		if (p3[3] < 0) {

		p3[2] -= 1;

		p3[3] += 256;

		}

		p3[2] += (short) (p1[2] - p2[2]);

		if (p3[2] < 0) {

		p3[1] -= 1;

		p3[2] += 256;

		}

		p3[1] += (short) (p1[1] - p2[1]);

		if (p3[1] < 0) {

		p3[0] -= 1;

		p3[1] += 256;

		}

		p3[0] += (short) (p1[0] - p2[0]);

		if (p3[0] < 0) {

		p3[0] += 256;

		}

		return p3;

		}

//		 0x00112233

//		 p[0] = 0x00, p[1] = 0x11...

		public static short[] ADD(short[] p1, short[] p2) {

		short[] p3 = { 0, 0, 0, 0 };

		short a;

		a=(short)((p1[3]+p2[3])/256);

		p3[3] += (short) (p1[3] + p2[3]);

		a=(short)(p3[3]/256);

		if (a == 1) {

		p3[2] += 1;

		p3[3] %= 256;

		}

		p3[2] += (short) (p1[2] + p2[2]);

		a=0;

		a=(short)(p3[2]/256);

		if (a == 1) {

		p3[1] += 1;

		p3[2] %= 256;

		}

		p3[1] += (short) (p1[1] + p2[1]);

		a=0;

		a=(short)(p3[1]/256);

		if (a == 1) {

		p3[0] += 1;

		p3[1] %= 256;

		}

		p3[0] += (short) (p1[0] + p2[0]);

		a=0;

		a=(short)(p3[0]/256);

		if (a== 1) {

		p3[0] %= 256;

		}

		return p3;

		}

		public static short[] ROR(short[] p, short num) {

		short[] c = new short[4];

		if (num >= 0 && num < 8) {

		c[0] = (short) (((p[0] >> num) | (p[1] << (8 - num))) % 256);

		c[1] = (short) (((p[1] >> num) | (p[2] << (8 - num))) % 256);

		c[2] = (short) (((p[2] >> num) | (p[3] << (8 - num))) % 256);

		c[3] = (short) (((p[3] >> num) | (p[0] << (8 - num))) % 256);

		}

		else if (num >= 8 && num < 16) {

		num -= 8;

		c[0] = (short) (((p[1] >> num) | (p[2] << (8 - num))) % 256);

		c[1] = (short) (((p[2] >> num) | (p[3] << (8 - num))) % 256);

		c[2] = (short) (((p[3] >> num) | (p[0] << (8 - num))) % 256);

		c[3] = (short) (((p[0] >> num) | (p[1] << (8 - num))) % 256);

		}

		else if (num >= 16 && num < 24) {

		num -= 16;

		c[0] = (short) (((p[2] >> num) | (p[3] << (8 - num))) % 256);

		c[1] = (short) (((p[3] >> num) | (p[0] << (8 - num))) % 256);

		c[2] = (short) (((p[0] >> num) | (p[1] << (8 - num))) % 256);

		c[3] = (short) (((p[1] >> num) | (p[2] << (8 - num))) % 256);

		}

		else {

		num -= 24;

		c[0] = (short) (((p[3] >> num) | (p[0] << (8 - num))) % 256);

		c[1] = (short) (((p[0] >> num) | (p[1] << (8 - num))) % 256);

		c[2] = (short) (((p[1] >> num) | (p[2] << (8 - num))) % 256);

		c[3] = (short) (((p[2] >> num) | (p[3] << (8 - num))) % 256);

		}

		return c;

		}

		public static short[] ROL(short[] p, short num) {

		short[] c = new short[4];

		if (num >= 0 && num < 8) {

		c[0] = (short) (((p[0] << num) | (p[1] >> (8 - num))) % 256);

		c[1] = (short) (((p[1] << num) | (p[2] >> (8 - num))) % 256);

		c[2] = (short) (((p[2] << num) | (p[3] >> (8 - num))) % 256);

		c[3] = (short) (((p[3] << num) | (p[0] >> (8 - num))) % 256);

		}

		else if (num >= 8 && num < 16) {

		num -= 8;

		c[0] = (short) (((p[1] << num) | (p[2] >> (8 - num))) % 256);

		c[1] = (short) (((p[2] << num) | (p[3] >> (8 - num))) % 256);

		c[2] = (short) (((p[3] << num) | (p[0] >> (8 - num))) % 256);

		c[3] = (short) (((p[0] << num) | (p[1] >> (8 - num))) % 256);

		}

		else if (num >= 16 && num < 24) {

		num -= 16;

		c[0] = (short) (((p[2] << num) | (p[3] >> (8 - num))) % 256);

		c[1] = (short) (((p[3] << num) | (p[0] >> (8 - num))) % 256);

		c[2] = (short) (((p[0] << num) | (p[1] >> (8 - num))) % 256);

		c[3] = (short) (((p[1] << num) | (p[2] >> (8 - num))) % 256);

		}

		else {

		num -= 24;

		c[0] = (short) (((p[3] << num) | (p[0] >> (8 - num))) % 256);

		c[1] = (short) (((p[0] << num) | (p[1] >> (8 - num))) % 256);

		c[2] = (short) (((p[1] << num) | (p[2] >> (8 - num))) % 256);

		c[3] = (short) (((p[2] << num) | (p[3] >> (8 - num))) % 256);

		}

		return c;

		}

//		 INPUT : 4bytes

//		 OPUPUT: 4bytes

		public static final short[] G_func(short[] X) {

		short[] Z = new short[4];

		short m0 = 0xfc;

		short m1 = 0xf3;

		short m2 = 0xcf;

		short m3 = 0x3f;

		short[] Y = new short[4];

		X[0] = s_to_u((byte)X[0]);

		Y[3] = (short)(SBox2[X[0]]);

		X[1] = s_to_u((byte)X[1]);

		Y[2] = (short)(SBox1[X[1]]);

		X[2] = s_to_u((byte)X[2]);

		Y[1] = (short)(SBox2[X[2]]);

		X[3] = s_to_u((byte)X[3]);

		Y[0] = (short)(SBox1[X[3]]);

		Z[0] = (short)((Y[0]&m3)^(Y[1]&m0)^(Y[2]&m1)^(Y[3]&m2));

		Z[1] = (short)((Y[0]&m2)^(Y[1]&m3)^(Y[2]&m0)^(Y[3]&m1));

		Z[2] = (short)((Y[0]&m1)^(Y[1]&m2)^(Y[2]&m3)^(Y[3]&m0));

		Z[3] = (short)((Y[0]&m0)^(Y[1]&m1)^(Y[2]&m2)^(Y[3]&m3));

		return Z;

		}

		public static final short[] SXOR(short[] a, short[] b)

		{

		short[] buf = new short[4];

		for (byte i = 0; i < 4; i++) {

		buf[i] = (short) (a[i] ^ b[i]);

		}

		return buf;

		}

		public static final short[] F_func(short C[], short D[], short round_num)

		{

		short[] buf_L = new short[4];

		short[] buf_R = new short[4];

		short[] buf_KL = new short[4];

		short[] buf_KR = new short[4];

		byte[] byte_L = new byte[4];

		byte[] byte_R = new byte[4];

		for (byte i = 0; i < 4; i++) {

		buf_KL[i] = KL[4 * round_num + i];

		buf_KR[i] = KR[4 * round_num + i];

		}

		buf_L = SXOR(C, buf_KL);

		short [] temp=new short[4];

		temp=SXOR(D, buf_KR);

		temp=SXOR(buf_L, temp);

		buf_R = G_func(temp);

		for(byte i = 0 ;i<4;i++) {

		byte_L[i] = (byte)(buf_L[i]&0xff);

		byte_R[i] = (byte)(buf_R[i]&0xff);

		}

		for(byte i = 0 ;i<4;i++) {

		buf_L[i] = (short)(byte_L[i]&0x00ff);

		buf_R[i] = (short)(byte_R[i]&0x00ff);

		}

		temp=ADD(buf_L, buf_R);

		buf_L = G_func(temp);

		for(byte i = 0 ;i<4;i++) {

		byte_L[i] = (byte)(buf_L[i]&0xff);

		byte_R[i] = (byte)(buf_R[i]&0xff);

		}

		for(byte i = 0 ;i<4;i++) {

		buf_L[i] = (short)(byte_L[i]&0x00ff);

		buf_R[i] = (short)(byte_R[i]&0x00ff);

		}

		temp=ADD(buf_L, buf_R);

		buf_R = G_func(temp);

		for(byte i = 0 ;i<4;i++) {

		byte_L[i] = (byte)(buf_L[i]&0xff);

		byte_R[i] = (byte)(buf_R[i]&0xff);

		}

		for(byte i = 0 ;i<4;i++) {

		buf_L[i] = (short)(byte_L[i]&0x00ff);

		buf_R[i] = (short)(byte_R[i]&0x00ff);

		}

		buf_L = ADD(buf_L, buf_R);

		short[] TEMP = new short[4 + 4];

		for (byte i = 0; i < 4; i++)

		{

		TEMP[i] = buf_L[i];

		TEMP[i + 4] = buf_R[i];

		}

		return TEMP;

		}

		public static final short[] ABshift(short[] A, short[] B)

		{

//		 A0 A1 A2 A3 B0 B1 B2 B3 -> B3 A0 A1 A2 A3 B0 B1 B2

		short tempB3 = B[3];

		short[] AB = new short[8];

		B[3] = B[2];

		B[2] = B[1];

		B[1] = B[0];

		B[0] = A[3];

		A[3] = A[2];

		A[2] = A[1];

		A[1] = A[0];

		A[0] = tempB3;

		for (byte i = 0; i < 4; i++)

		{

		AB[i] = A[i];

		AB[4 + i] = B[i];

		}

		return AB;

		}

		public static final short[] CDshift(short[] A, short[] B)

		{

//		 A0 A1 A2 A3 B0 B1 B2 B3 -> A1 A2 A3 B0 B1 B2 B3 A0

		short tempA0 = A[0];

		short[] AB = new short[8];

		A[0] = A[1];

		A[1] = A[2];

		A[2] = A[3];

		A[3] = B[0];

		B[0] = B[1];

		B[1] = B[2];

		B[2] = B[3];

		B[3] = tempA0;

		for (byte i = 0; i < 4; i++)

		{

		AB[i] = A[i];

		AB[4 + i] = B[i];

		}

		return AB;

		}

//		 KL / KR / input:MK 16byte [4/4/4/4]

		public static short[] KR;

		public static short[] KL;

		public static final void SEED_KeySchedKey(short[] MK) {

		short[] A = new short[4];

		short[] B = new short[4];

		short[] C = new short[4];

		short[] D = new short[4];

		short[] round_key_buf = new short[4];

		KL = new short[16 * 4];

		KR = new short[16 * 4];

		for (byte i = 0; i < 4; i++)

		{

		A[i] = MK[i + 0];

		B[i] = MK[i + 4];

		C[i] = MK[i + 8];

		D[i] = MK[i + 12];

		}

		short[] result = new short[4];

		short[] KL_buf = new short[4];

		short[] KR_buf = new short[4];

		short[] ABTEMP = new short[8];

		short[] KC_buf = new short[4];

		short[] ADD_buf = new short[4];

		short[] MIN_buf = new short[4];

		for (byte i = 0; i < 16; i++)

		{

		for (byte readbuf = 0; readbuf < 4; readbuf++)

		{

		KC_buf[readbuf] = KC[4 * i + readbuf];

		}

//		 KL

		ADD_buf = ADD(A, C);

		MIN_buf = MINUS(ADD_buf, KC_buf);

		round_key_buf = G_func(MIN_buf);

		for (byte bufcopy = 0; bufcopy < 4; bufcopy++)

		{

		KL_buf[bufcopy] = round_key_buf[bufcopy];

		}

//		 KR

		MIN_buf = MINUS(B, D);

		ADD_buf = ADD(MIN_buf, KC_buf);

		round_key_buf = G_func(ADD_buf);

//		 round_key_buf = G_func(ADD(MINUS(B,D),KC_buf));

		for (byte bufcopy = 0; bufcopy < 4; bufcopy++)

		{

		KR_buf[bufcopy] = round_key_buf[bufcopy];

		}

		for (byte j = 0; j < 4; j++)

		{

		KL[i * 4 + j] = KL_buf[j];

		KR[i * 4 + j] = KR_buf[j];

		}

		if (i % 2 == 0) {

		ABTEMP = ABshift(A, B);

		for (byte index = 0; index < 4; index++)

		{

		A[index] = ABTEMP[index];

		B[index] = ABTEMP[index + 4];

		}

		}

		else {

		ABTEMP = CDshift(C, D);

		for (byte index = 0; index < 4; index++)

		{

		C[index] = ABTEMP[index];

		D[index] = ABTEMP[index + 4];

		}

		}

		}

		}

		public static final short[] SEED_encrypt(short[] plain)

		{

		short[] L0 = new short[8]; short[] R0 = new short[8];

		for(byte index = 0;index<8;index++)

		{

		L0[index] = plain[index];

		R0[index] = plain[8+index];

		}

//		 return ABCD

		short[] ABCD = new short[16];

//		 SHORT 8BYTE l0+r0

		short[] result = new short[8];

//		 short C = int #1 short D = int #1

		short[] C = new short[4];

		short[] D = new short[4];

		short[] A = new short[4];

		short[] B = new short[4];

		short[] A_buf = new short[4];

		short[] B_buf = new short[4];

		for (byte index = 0; index < 4; index++)

		{

		A[index] = L0[index];

		B[index] = L0[4 + index];

		C[index] = R0[index];

		D[index] = R0[4 + index];

		}

		for (byte nowround = 0; nowround < 16; nowround++)

		{

		result = F_func(C, D, nowround);

//		A_buf = A;

		for(byte kl=0;kl<4;kl++)

		{

		A_buf[kl] = A[kl];

		B_buf[kl] = B[kl];

		}

		for (byte index = 0; index < 4; index++)

		{

		A[index] = C[index];

		B[index] = D[index];

		C[index] = (short) (A_buf[index] ^ result[index]);

		D[index] = (short) (B_buf[index] ^ result[4 + index]);

		}

		}

		for (byte i = 0; i < 4; i++)

		{

		ABCD[i] = C[i];

		ABCD[4 + i] = D[i];

		ABCD[8 + i] =A[i];

		ABCD[12 + i] = B[i];

		}

		return ABCD;

		}

		private static final short[] KC = {

		0x9e, 0x37, 0x79, 0xb9, 0x3c, 0x6e, 0xf3, 0x73, 0x78, 0xdd, 0xe6, 0xe6, 0xf1, 0xbb, 0xcd, 0xcc, 0xe3, 0x77,

		0x9b, 0x99, 0xc6, 0xef, 0x37, 0x33,

		0x8d, 0xde, 0x6e, 0x67, 0x1b, 0xbc, 0xdc, 0xcf, 0x37, 0x79, 0xb9, 0x9e, 0x6e, 0xf3, 0x73, 0x3c, 0xdd, 0xe6,

		0xe6, 0x78, 0xbb, 0xcd, 0xcc, 0xf1,

		0x77, 0x9b, 0x99, 0xe3, 0xef, 0x37, 0x33, 0xc6, 0xde, 0x6e, 0x67, 0x8d, 0xbc, 0xdc, 0xcf, 0x1b

		};
*/
	
	
	
	/* LEA CRYPTOSYSTEM  */
/*
	This is LEA in JAVA for javacard. Data type is only short or byte.
	So, we should make int_addition and int_rotation_shift (ROR, ROL).
	addition algorithm is very simple.
	Input: short[4] array1, short[4] array2.
	Ouput: short[4] outarray.
	
	we used to byte data in short buffer.
	It only used low 8-bit.
	
*/	
	
/*
	public static short[] LEA_Add(short[] p1, short[] p2) {

	      short[] p3 = { 0, 0, 0, 0 };
	      short a;

	      p3[3] += (short) (p1[3] + p2[3]);
	 
	      a=(short)(p3[3]/256);
	      if (a == 1) {

	         p3[2] += 1;

	         p3[3] %= 256;

	      }
	      
	      p3[2] += (short) (p1[2] + p2[2]);
	      a=0;
	      a=(short)(p3[2]/256);
	      if (a == 1) {

	         p3[1] += 1;

	         p3[2] %= 256;

	      }

	      p3[1] += (short) (p1[1] + p2[1]);
	      a=0;
	      a=(short)(p3[1]/256);
	      if (a == 1) {

	         p3[0] += 1;

	         p3[1] %= 256;

	      }

	      p3[0] += (short) (p1[0] + p2[0]);
	      a=0;
	      a=(short)(p3[0]/256);
	      if (a== 1) {

	         p3[0] %= 256;

	      }

	      return p3;

	   }


    public static short[] LEA_Sub(short[] p1, short[] p2){
        short[] p3={0,0,0,0};
        p3[3]+=(short)(p1[3]-p2[3]);
        
        if(p3[3]<0){
            p3[2]-=1;
            p3[3]+=256;
        }
        p3[2]+=(short)(p1[2]-p2[2]);
        
        if(p3[2]<0){
            p3[1]-=1;
            p3[2]+=256;
        }
        
        p3[1]+=(short)(p1[1]-p2[1]);
        
        if(p3[1]<0){
            p3[0]-=1;
            p3[1]+=256;
        }
        p3[0]+=(short)(p1[0]-p2[0]);

        if(p3[0]<0){
            p3[0]+=256;
        }
        return p3;
    }

    public static short[] LEA_ROR(short[] p, short num){
        short[] c= new short[4];
        if(num>=0 && num<8){
            c[0]=(short)(((p[0]>>num) | (p[1]<<(8-num)))%256);
            c[1]=(short)(((p[1]>>num) | (p[2]<<(8-num)))%256);
            c[2]=(short)(((p[2]>>num) | (p[3]<<(8-num)))%256);
            c[3]=(short)(((p[3]>>num) | (p[0]<<(8-num)))%256);
        }
        else if(num>=8 && num<16){
            num-=8;
            c[0]=(short)(((p[1]>>num) | (p[2]<<(8-num)))%256);
            c[1]=(short)(((p[2]>>num) | (p[3]<<(8-num)))%256);
            c[2]=(short)(((p[3]>>num) | (p[0]<<(8-num)))%256);
            c[3]=(short)(((p[0]>>num) | (p[1]<<(8-num)))%256);
        }
        else if(num>=16 && num<24){
            num-=16;
            c[0]=(short)(((p[2]>>num) | (p[3]<<(8-num)))%256);
            c[1]=(short)(((p[3]>>num) | (p[0]<<(8-num)))%256);
            c[2]=(short)(((p[0]>>num) | (p[1]<<(8-num)))%256);
            c[3]=(short)(((p[1]>>num) | (p[2]<<(8-num)))%256);
        }
        else{
            num-=24;
            c[0]=(short)(((p[3]>>num) | (p[0]<<(8-num)))%256);
            c[1]=(short)(((p[0]>>num) | (p[1]<<(8-num)))%256);
            c[2]=(short)(((p[1]>>num) | (p[2]<<(8-num)))%256);
            c[3]=(short)(((p[2]>>num) | (p[3]<<(8-num)))%256);
        }

        return c;
    }

    public static short[] LEA_ROL(short[] p, short num){
    	
        short[] c= new short[4];
        if(num>=0 && num<8){
            c[0]=(short)(((p[0]<<num) | (p[1]>>(8-num)))%256);
            c[1]=(short)(((p[1]<<num) | (p[2]>>(8-num)))%256);
            c[2]=(short)(((p[2]<<num) | (p[3]>>(8-num)))%256);
            c[3]=(short)(((p[3]<<num) | (p[0]>>(8-num)))%256);
        }
        else if(num>=8 && num<16){
            num-=8;
            c[0]=(short)(((p[1]<<num) | (p[2]>>(8-num)))%256);
            c[1]=(short)(((p[2]<<num) | (p[3]>>(8-num)))%256);
            c[2]=(short)(((p[3]<<num) | (p[0]>>(8-num)))%256);
            c[3]=(short)(((p[0]<<num) | (p[1]>>(8-num)))%256);
        }
        else if(num>=16 && num<24){
            num-=16;
            c[0]=(short)(((p[2]<<num) | (p[3]>>(8-num)))%256);
            c[1]=(short)(((p[3]<<num) | (p[0]>>(8-num)))%256);
            c[2]=(short)(((p[0]<<num) | (p[1]>>(8-num)))%256);
            c[3]=(short)(((p[1]<<num) | (p[2]>>(8-num)))%256);
        }
        else{
            num-=24;
            c[0]=(short)(((p[3]<<num) | (p[0]>>(8-num)))%256);
            c[1]=(short)(((p[0]<<num) | (p[1]>>(8-num)))%256);
            c[2]=(short)(((p[1]<<num) | (p[2]>>(8-num)))%256);
            c[3]=(short)(((p[2]<<num) | (p[3]>>(8-num)))%256);
        }

        return c;
    }

    public static void LEA_encrypt(short[] p, short[] rk, short rk_num, short[] c){
        for(short i=12; i<16;i++){
            c[i]=p[i-12];
        }
        
        byte[] byte_L = new byte[4];
        byte[] byte_R = new byte[4];
        
        short[] t_0=new short[4];
        short[] t_1=new short[4];
        short[] t_2=new short[4];
        short[] t_3=new short[4];
        short[] t_4=new short[4];
        short[] t_5=new short[4];
        for(short i=0;i<4;i++){
            t_0[i]=(short)(p[i]^rk[i+rk_num*24]);
            t_1[i]=(short)(p[i+4]^rk[i+rk_num*24+4]);
            t_2[i]=(short)(p[i+4]^rk[i+rk_num*24+8]);
            t_3[i]=(short)(p[i+8]^rk[i+rk_num*24+12]);
            t_4[i]=(short)(p[i+8]^rk[i+rk_num*24+16]);
            t_5[i]=(short)(p[i+12]^rk[i+rk_num*24+20]);
        }
        short[] t_6=new short[4];    
        
       for(byte b = 0 ;b<4;b++) {
         byte_L[b] = (byte)(t_0[b]&0xff);                                   
         byte_R[b] = (byte)(t_1[b]&0xff);
      }
      
      for(byte b = 0 ;b<4;b++) {
         t_0[b] = (short)(byte_L[b]&0x00ff);
         t_1[b] = (short)(byte_R[b]&0x00ff);
      }
        t_6=LEA_Add(t_0, t_1);
        
        c[1]=(short)(((t_6[2]<<1) | (t_6[3]>>7))%256);
        c[2]=(short)(((t_6[3]<<1) | (t_6[0]>>7))%256);
        c[3]=(short)(((t_6[0]<<1) | (t_6[1]>>7))%256);
        c[0]=(short)(((t_6[1]<<1) | (t_6[2]>>7))%256);

       for(byte b = 0 ;b<4;b++) {
         byte_L[b] = (byte)(t_2[b]&0xff);                                   
         byte_R[b] = (byte)(t_3[b]&0xff);
      }
      
      for(byte b = 0 ;b<4;b++) {
         t_2[b] = (short)(byte_L[b]&0x00ff);
         t_3[b] = (short)(byte_R[b]&0x00ff);
      }
        t_6=LEA_Add(t_2, t_3);
        c[4]=(short)(((t_6[0]>>5) | (t_6[3]<<3))%256);
        c[5]=(short)(((t_6[1]>>5) | (t_6[0]<<3))%256);
        c[6]=(short)(((t_6[2]>>5) | (t_6[1]<<3))%256);
        c[7]=(short)(((t_6[3]>>5) | (t_6[2]<<3))%256);

        
       for(byte b = 0 ;b<4;b++) {
         byte_L[b] = (byte)(t_4[b]&0xff);                                   
         byte_R[b] = (byte)(t_5[b]&0xff);
      }
      
      for(byte b = 0 ;b<4;b++) {
         t_4[b] = (short)(byte_L[b]&0x00ff);
         t_5[b] = (short)(byte_R[b]&0x00ff);
      }
        t_6=LEA_Add(t_4, t_5);
        c[8]=(short)(((t_6[0]>>3) | (t_6[3]<<5))%256);
        c[9]=(short)(((t_6[1]>>3) | (t_6[0]<<5))%256);
        c[10]=(short)(((t_6[2]>>3) | (t_6[1]<<5))%256);
        c[11]=(short)(((t_6[3]>>3) | (t_6[2]<<5))%256);

    }
   
    public static short[] LEA_enc_key(short[] mk){
        short[] rk=new short[24*24];
        short[] t_0=new short[4];
        short[] t_1=new short[4];
        short[] t_2=new short[4];
        short[] t_3=new short[4];
        short[] bag = new short[4];
        byte[] byte_L = new byte[4];
    	byte[] byte_R = new byte[4];
        short[] delta_0={0xc3, 0xef, 0xe9, 0xdb};
        short[] delta_1={0x44, 0x62, 0x6b, 0x02};
        short[] delta_2={0x79, 0xe2, 0x7c, 0x8a};
        short[] delta_3={0x78, 0xdf, 0x30, 0xec};
        for(short i=0;i<(short)4;i++){   
            t_0[i]=mk[i];
            t_1[i]=mk[i+4];
            t_2[i]=mk[i+8];
            t_3[i]=mk[i+12];
        }
        short[] tt=new short[4];
        short a=0;
        for(short i=0;i<24;i++){
            if(i%4==0){
            	
            	for(byte b = 0 ;b<4;b++) {
                    byte_L[b] = (byte)(delta_0[b]&0xff);                                   
                   // byte_R[b] = (byte)(t_5[b]&0xff);
                 }
                 
                 for(byte b = 0 ;b<4;b++) {
                	 delta_0[b] = (short)(byte_L[b]&0x00ff);
                    //t_5[b] = (short)(byte_R[b]&0x00ff);
                 }

                 
                tt=LEA_ROL(delta_0, i);
                
                
                for(byte b = 0 ;b<4;b++) {
                    byte_L[b] = (byte)(t_0[b]&0xff);                                   
                    byte_R[b] = (byte)(tt[b]&0xff);
                 }
                 
                 for(byte b = 0 ;b<4;b++) {
                	 t_0[b] = (short)(byte_L[b]&0x00ff);
                	 tt[b] = (short)(byte_R[b]&0x00ff);
                 }
                 
                 
                t_0=LEA_Add(t_0, tt);
               
                for(byte b = 0 ;b<4;b++) {
                    byte_L[b] = (byte)(t_0[b]&0xff);                                   
                   // byte_R[b] = (byte)(t_5[b]&0xff);
                 }
                 
                 for(byte b = 0 ;b<4;b++) {
                	 t_0[b] = (short)(byte_L[b]&0x00ff);
                    //t_5[b] = (short)(byte_R[b]&0x00ff);
                 }
                t_0=LEA_ROL(t_0,(short)1);
                
                for(byte b = 0 ;b<4;b++) {
                    byte_L[b] = (byte)(delta_0[b]&0xff);                                   
                   // byte_R[b] = (byte)(t_5[b]&0xff);
                 }
                 
                 for(byte b = 0 ;b<4;b++) {
                	 delta_0[b] = (short)(byte_L[b]&0x00ff);
                    //t_5[b] = (short)(byte_R[b]&0x00ff);
                 }
                tt=LEA_ROL(delta_0, (short)(i+1));
                
                for(byte b = 0 ;b<4;b++) {
                    byte_L[b] = (byte)(t_1[b]&0xff);                                   
                    byte_R[b] = (byte)(tt[b]&0xff);
                 }
                 
                 for(byte b = 0 ;b<4;b++) {
                	 t_1[b] = (short)(byte_L[b]&0x00ff);
                	 tt[b] = (short)(byte_R[b]&0x00ff);
                 }
                t_1=LEA_Add(t_1, tt);
                
                for(byte b = 0 ;b<4;b++) {
                    byte_L[b] = (byte)(t_1[b]&0xff);                                   
                   // byte_R[b] = (byte)(tt[b]&0xff);
                 }
                 
                 for(byte b = 0 ;b<4;b++) {
                	 t_1[b] = (short)(byte_L[b]&0x00ff);
                	// tt[b] = (short)(byte_R[b]&0x00ff);
                 }
                t_1=LEA_ROL(t_1,(short)3);
                
                for(byte b = 0 ;b<4;b++) {
                    byte_L[b] = (byte)(delta_0[b]&0xff);                                   
                   // byte_R[b] = (byte)(tt[b]&0xff);
                 }
                 
                 for(byte b = 0 ;b<4;b++) {
                	 delta_0[b] = (short)(byte_L[b]&0x00ff);
                	// tt[b] = (short)(byte_R[b]&0x00ff);
                 }
                tt=LEA_ROL(delta_0, (short)(i+2));
                
                for(byte b = 0 ;b<4;b++) {
                    byte_L[b] = (byte)(t_2[b]&0xff);                                   
                    byte_R[b] = (byte)(tt[b]&0xff);
                 }
                 
                 for(byte b = 0 ;b<4;b++) {
                	 tt[b] = (short)(byte_L[b]&0x00ff);
                	 t_2[b] = (short)(byte_R[b]&0x00ff);
                 }
                t_2=LEA_Add(t_2, tt);
                for(byte b = 0 ;b<4;b++) {
                    byte_L[b] = (byte)(t_2[b]&0xff);                                   
                    //byte_R[b] = (byte)(tt[b]&0xff);
                 }
                 
                 for(byte b = 0 ;b<4;b++) {
                	 t_2[b] = (short)(byte_L[b]&0x00ff);
                	// t_2[b] = (short)(byte_R[b]&0x00ff);
                 }
                t_2=LEA_ROL(t_2,(short)6);

                for(byte b = 0 ;b<4;b++) {
                    byte_L[b] = (byte)(delta_0[b]&0xff);                                   
                    //byte_R[b] = (byte)(tt[b]&0xff);
                 }
                 
                 for(byte b = 0 ;b<4;b++) {
                	 delta_0[b] = (short)(byte_L[b]&0x00ff);
                	// t_2[b] = (short)(byte_R[b]&0x00ff);
                 }
                tt=LEA_ROL(delta_0, (short)(i+3));
                for(byte b = 0 ;b<4;b++) {
                    byte_L[b] = (byte)(t_3[b]&0xff);                                   
                    byte_R[b] = (byte)(tt[b]&0xff);
                 }
                 
                 for(byte b = 0 ;b<4;b++) {
                	 t_3[b] = (short)(byte_L[b]&0x00ff);
                	 tt[b] = (short)(byte_R[b]&0x00ff);
                 }
                t_3=LEA_Add(t_3, tt);
                for(byte b = 0 ;b<4;b++) {
                    byte_L[b] = (byte)(t_3[b]&0xff);                                   
                    //byte_R[b] = (byte)(tt[b]&0xff);
                 }
                 
                 for(byte b = 0 ;b<4;b++) {
                	 t_3[b] = (short)(byte_L[b]&0x00ff);
                	// tt[b] = (short)(byte_R[b]&0x00ff);
                 }
                t_3=LEA_ROL(t_3,(short)11);
                
            }
            else if(i%4==1){
            	for(byte b = 0 ;b<4;b++) {
                    byte_L[b] = (byte)(delta_1[b]&0xff);                                   
                   // byte_R[b] = (byte)(tt[b]&0xff);
                 }
                 
                 for(byte b = 0 ;b<4;b++) {
                	 delta_1[b] = (short)(byte_L[b]&0x00ff);
                	 //tt[b] = (short)(byte_R[b]&0x00ff);
                 }
                tt=LEA_ROL(delta_1, i);
                for(byte b = 0 ;b<4;b++) {
                    byte_L[b] = (byte)(t_0[b]&0xff);                                   
                    byte_R[b] = (byte)(tt[b]&0xff);
                 }
                 
                 for(byte b = 0 ;b<4;b++) {
                	 t_0[b] = (short)(byte_L[b]&0x00ff);
                	 tt[b] = (short)(byte_R[b]&0x00ff);
                 }
                t_0=LEA_Add(t_0, tt);
                for(byte b = 0 ;b<4;b++) {
                    byte_L[b] = (byte)(t_0[b]&0xff);                                   
                    //byte_R[b] = (byte)(tt[b]&0xff);
                 }
                 
                 for(byte b = 0 ;b<4;b++) {
                	 t_0[b] = (short)(byte_L[b]&0x00ff);
                	 //tt[b] = (short)(byte_R[b]&0x00ff);
                 }
                t_0=LEA_ROL(t_0,(short)1);
                for(byte b = 0 ;b<4;b++) {
                    byte_L[b] = (byte)(delta_1[b]&0xff);                                   
                    //byte_R[b] = (byte)(tt[b]&0xff);
                 }
                 
                 for(byte b = 0 ;b<4;b++) {
                	 delta_1[b] = (short)(byte_L[b]&0x00ff);
                	 //tt[b] = (short)(byte_R[b]&0x00ff);
                 }
                tt=LEA_ROL(delta_1, (short)(i+1));
                for(byte b = 0 ;b<4;b++) {
                    byte_L[b] = (byte)(t_1[b]&0xff);                                   
                    byte_R[b] = (byte)(tt[b]&0xff);
                 }
                 
                 for(byte b = 0 ;b<4;b++) {
                	 t_1[b] = (short)(byte_L[b]&0x00ff);
                	 tt[b] = (short)(byte_R[b]&0x00ff);
                 }
                t_1=LEA_Add(t_1, tt);
                for(byte b = 0 ;b<4;b++) {
                    byte_L[b] = (byte)(t_1[b]&0xff);                                   
                    //byte_R[b] = (byte)(tt[b]&0xff);
                 }
                 
                 for(byte b = 0 ;b<4;b++) {
                	 t_1[b] = (short)(byte_L[b]&0x00ff);
                	// tt[b] = (short)(byte_R[b]&0x00ff);
                 }
                t_1=LEA_ROL(t_1,(short)3);
                for(byte b = 0 ;b<4;b++) {
                    byte_L[b] = (byte)(delta_1[b]&0xff);                                   
                    //byte_R[b] = (byte)(tt[b]&0xff);
                 }
                 
                 for(byte b = 0 ;b<4;b++) {
                	 delta_1[b] = (short)(byte_L[b]&0x00ff);
                	// tt[b] = (short)(byte_R[b]&0x00ff);
                 }
                tt=LEA_ROL(delta_1, (short)(i+2));
                for(byte b = 0 ;b<4;b++) {
                    byte_L[b] = (byte)(t_2[b]&0xff);                                   
                    byte_R[b] = (byte)(tt[b]&0xff);
                 }
                 
                 for(byte b = 0 ;b<4;b++) {
                	 t_2[b] = (short)(byte_L[b]&0x00ff);
                	 tt[b] = (short)(byte_R[b]&0x00ff);
                 }
                t_2=LEA_Add(t_2, tt);
                for(byte b = 0 ;b<4;b++) {
                    byte_L[b] = (byte)(t_2[b]&0xff);                                   
                   // byte_R[b] = (byte)(tt[b]&0xff);
                 }
                 
                 for(byte b = 0 ;b<4;b++) {
                	 t_2[b] = (short)(byte_L[b]&0x00ff);
                	// tt[b] = (short)(byte_R[b]&0x00ff);
                 }
                t_2=LEA_ROL(t_2,(short)6);
                for(byte b = 0 ;b<4;b++) {
                    byte_L[b] = (byte)(delta_1[b]&0xff);                                   
                   // byte_R[b] = (byte)(tt[b]&0xff);
                 }
                 
                 for(byte b = 0 ;b<4;b++) {
                	 delta_1[b] = (short)(byte_L[b]&0x00ff);
                	// tt[b] = (short)(byte_R[b]&0x00ff);
                 }
                tt=LEA_ROL(delta_1, (short)(i+3));
                for(byte b = 0 ;b<4;b++) {
                    byte_L[b] = (byte)(t_3[b]&0xff);                                   
                    byte_R[b] = (byte)(tt[b]&0xff);
                 }
                 
                 for(byte b = 0 ;b<4;b++) {
                	 t_3[b] = (short)(byte_L[b]&0x00ff);
                	 tt[b] = (short)(byte_R[b]&0x00ff);
                 }
                t_3=LEA_Add(t_3, tt);
                for(byte b = 0 ;b<4;b++) {
                    byte_L[b] = (byte)(t_3[b]&0xff);                                   
                    //byte_R[b] = (byte)(tt[b]&0xff);
                 }
                 
                 for(byte b = 0 ;b<4;b++) {
                	 t_3[b] = (short)(byte_L[b]&0x00ff);
                	 //tt[b] = (short)(byte_R[b]&0x00ff);
                 }
                t_3=LEA_ROL(t_3,(short)11);
                for(byte b = 0 ;b<4;b++) {
                    byte_L[b] = (byte)(t_3[b]&0xff);                                   
                    //byte_R[b] = (byte)(tt[b]&0xff);
                 }
                 
                 for(byte b = 0 ;b<4;b++) {
                	 t_3[b] = (short)(byte_L[b]&0x00ff);
                	 //tt[b] = (short)(byte_R[b]&0x00ff);
                 }
            }
            else if(i%4==2){
            	for(byte b = 0 ;b<4;b++) {
                    byte_L[b] = (byte)(delta_2[b]&0xff);                                   
                   // byte_R[b] = (byte)(tt[b]&0xff);
                 }
                 
                 for(byte b = 0 ;b<4;b++) {
                	 delta_2[b] = (short)(byte_L[b]&0x00ff);
                	 //tt[b] = (short)(byte_R[b]&0x00ff);
                 }
                tt=LEA_ROL(delta_2, i);
                for(byte b = 0 ;b<4;b++) {
                    byte_L[b] = (byte)(t_0[b]&0xff);                                   
                    byte_R[b] = (byte)(tt[b]&0xff);
                 }
                 
                 for(byte b = 0 ;b<4;b++) {
                	 t_0[b] = (short)(byte_L[b]&0x00ff);
                	 tt[b] = (short)(byte_R[b]&0x00ff);
                 }
                t_0=LEA_Add(t_0, tt);
                
                for(byte b = 0 ;b<4;b++) {
                    byte_L[b] = (byte)(t_0[b]&0xff);                                   
                    //byte_R[b] = (byte)(tt[b]&0xff);
                 }
                 
                 for(byte b = 0 ;b<4;b++) {
                	 t_0[b] = (short)(byte_L[b]&0x00ff);
                	 //tt[b] = (short)(byte_R[b]&0x00ff);
                 }
                t_0=LEA_ROL(t_0,(short)1);

                for(byte b = 0 ;b<4;b++) {
                    byte_L[b] = (byte)(delta_2[b]&0xff);                                   
                    //byte_R[b] = (byte)(tt[b]&0xff);
                 }
                 
                 for(byte b = 0 ;b<4;b++) {
                	 delta_2[b] = (short)(byte_L[b]&0x00ff);
                	 //tt[b] = (short)(byte_R[b]&0x00ff);
                 }
                tt=LEA_ROL(delta_2, (short)(i+1));
                
                for(byte b = 0 ;b<4;b++) {
                    byte_L[b] = (byte)(t_1[b]&0xff);                                   
                    byte_R[b] = (byte)(tt[b]&0xff);
                 }
                 
                 for(byte b = 0 ;b<4;b++) {
                	 t_1[b] = (short)(byte_L[b]&0x00ff);
                	 tt[b] = (short)(byte_R[b]&0x00ff);
                 }
                t_1=LEA_Add(t_1, tt);
                

                for(byte b = 0 ;b<4;b++) {
                    byte_L[b] = (byte)(t_1[b]&0xff);                                   
                    //byte_R[b] = (byte)(tt[b]&0xff);
                 }
                 
                 for(byte b = 0 ;b<4;b++) {
                	 t_1[b] = (short)(byte_L[b]&0x00ff);
                	 //tt[b] = (short)(byte_R[b]&0x00ff);
                 }
                t_1=LEA_ROL(t_1,(short)3);

                
                for(byte b = 0 ;b<4;b++) {
                    byte_L[b] = (byte)(delta_2[b]&0xff);                                   
                    //byte_R[b] = (byte)(tt[b]&0xff);
                 }
                 
                 for(byte b = 0 ;b<4;b++) {
                	 delta_2[b] = (short)(byte_L[b]&0x00ff);
                	 //tt[b] = (short)(byte_R[b]&0x00ff);
                 }
                tt=LEA_ROL(delta_2, (short)(i+2));
                
                for(byte b = 0 ;b<4;b++) {
                    byte_L[b] = (byte)(t_2[b]&0xff);                                   
                    byte_R[b] = (byte)(tt[b]&0xff);
                 }
                 
                 for(byte b = 0 ;b<4;b++) {
                	 t_2[b] = (short)(byte_L[b]&0x00ff);
                	 tt[b] = (short)(byte_R[b]&0x00ff);
                 }
                t_2=LEA_Add(t_2, tt);
                
                for(byte b = 0 ;b<4;b++) {
                    byte_L[b] = (byte)(t_2[b]&0xff);                                   
                    //byte_R[b] = (byte)(tt[b]&0xff);
                 }
                 
                 for(byte b = 0 ;b<4;b++) {
                	 t_2[b] = (short)(byte_L[b]&0x00ff);
                	 //tt[b] = (short)(byte_R[b]&0x00ff);
                 }
                t_2=LEA_ROL(t_2,(short)6);

                
                for(byte b = 0 ;b<4;b++) {
                    byte_L[b] = (byte)(delta_2[b]&0xff);                                   
                    //byte_R[b] = (byte)(tt[b]&0xff);
                 }
                 
                 for(byte b = 0 ;b<4;b++) {
                	 delta_2[b] = (short)(byte_L[b]&0x00ff);
                	 //tt[b] = (short)(byte_R[b]&0x00ff);
                 }
                tt=LEA_ROL(delta_2, (short)(i+3));
                
                for(byte b = 0 ;b<4;b++) {
                    byte_L[b] = (byte)(t_3[b]&0xff);                                   
                    byte_R[b] = (byte)(tt[b]&0xff);
                 }
                 
                 for(byte b = 0 ;b<4;b++) {
                	 t_3[b] = (short)(byte_L[b]&0x00ff);
                	 tt[b] = (short)(byte_R[b]&0x00ff);
                 }
                t_3=LEA_Add(t_3, tt);
                
                for(byte b = 0 ;b<4;b++) {
                    byte_L[b] = (byte)(t_3[b]&0xff);                                   
                    //byte_R[b] = (byte)(tt[b]&0xff);
                 }
                 
                 for(byte b = 0 ;b<4;b++) {
                	 t_3[b] = (short)(byte_L[b]&0x00ff);
                	 //tt[b] = (short)(byte_R[b]&0x00ff);
                 }
                t_3=LEA_ROL(t_3,(short)11);
                for(byte b = 0 ;b<4;b++) {
                    byte_L[b] = (byte)(t_3[b]&0xff);                                   
                    //byte_R[b] = (byte)(tt[b]&0xff);
                 }
                 
                 for(byte b = 0 ;b<4;b++) {
                	 t_3[b] = (short)(byte_L[b]&0x00ff);
                	 //tt[b] = (short)(byte_R[b]&0x00ff);
                 }
            }
            else{
            	
            	for(byte b = 0 ;b<4;b++) {
            		byte_L[b] = (byte)(delta_3[b]&0xff);                                   
                    //byte_R[b] = (byte)(tt[b]&0xff);
                   }
                   
                for(byte b = 0 ;b<4;b++) {
                	delta_3[b] = (short)(byte_L[b]&0x00ff);
                  	//tt[b] = (short)(byte_R[b]&0x00ff);
                   }
                tt=LEA_ROL(delta_3, i);
                
                for(byte b = 0 ;b<4;b++) {
            		byte_L[b] = (byte)(t_0[b]&0xff);                                   
                    byte_R[b] = (byte)(tt[b]&0xff);
                   }
                   
                for(byte b = 0 ;b<4;b++) {
                	t_0[b] = (short)(byte_L[b]&0x00ff);
                  	tt[b] = (short)(byte_R[b]&0x00ff);
                   }
                t_0=LEA_Add(t_0, tt);
                
                for(byte b = 0 ;b<4;b++) {
            		byte_L[b] = (byte)(t_0[b]&0xff);                                   
                    //byte_R[b] = (byte)(tt[b]&0xff);
                   }
                   
                for(byte b = 0 ;b<4;b++) {
                	t_0[b] = (short)(byte_L[b]&0x00ff);
                  	//tt[b] = (short)(byte_R[b]&0x00ff);
                   }
                t_0=LEA_ROL(t_0,(short)1);

                for(byte b = 0 ;b<4;b++) {
            		byte_L[b] = (byte)(delta_3[b]&0xff);                                   
                    //byte_R[b] = (byte)(tt[b]&0xff);
                   }
                   
                for(byte b = 0 ;b<4;b++) {
                	delta_3[b] = (short)(byte_L[b]&0x00ff);
                  	//tt[b] = (short)(byte_R[b]&0x00ff);
                   }
                tt=LEA_ROL(delta_3, (short)(i+1));
                
                for(byte b = 0 ;b<4;b++) {
            		byte_L[b] = (byte)(t_1[b]&0xff);                                   
                    byte_R[b] = (byte)(tt[b]&0xff);
                   }
                   
                for(byte b = 0 ;b<4;b++) {
                	t_1[b] = (short)(byte_L[b]&0x00ff);
                  	tt[b] = (short)(byte_R[b]&0x00ff);
                   }
                t_1=LEA_Add(t_1, tt);
                
                for(byte b = 0 ;b<4;b++) {
            		byte_L[b] = (byte)(t_1[b]&0xff);                                   
                    //byte_R[b] = (byte)(tt[b]&0xff);
                   }
                   
                for(byte b = 0 ;b<4;b++) {
                	t_1[b] = (short)(byte_L[b]&0x00ff);
                  	//tt[b] = (short)(byte_R[b]&0x00ff);
                   }
                t_1=LEA_ROL(t_1,(short)3);

                for(byte b = 0 ;b<4;b++) {
            		byte_L[b] = (byte)(delta_3[b]&0xff);                                   
                    //byte_R[b] = (byte)(tt[b]&0xff);
                   }
                   
                for(byte b = 0 ;b<4;b++) {
                	delta_3[b] = (short)(byte_L[b]&0x00ff);
                  	//tt[b] = (short)(byte_R[b]&0x00ff);
                   }
                tt=LEA_ROL(delta_3, (short)(i+2));
                
                for(byte b = 0 ;b<4;b++) {
            		byte_L[b] = (byte)(t_2[b]&0xff);                                   
                    byte_R[b] = (byte)(tt[b]&0xff);
                   }
                   
                for(byte b = 0 ;b<4;b++) {
                	t_2[b] = (short)(byte_L[b]&0x00ff);
                  	tt[b] = (short)(byte_R[b]&0x00ff);
                   }
                t_2=LEA_Add(t_2, tt);
                
                for(byte b = 0 ;b<4;b++) {
            		byte_L[b] = (byte)(t_2[b]&0xff);                                   
                    //byte_R[b] = (byte)(tt[b]&0xff);
                   }
                   
                for(byte b = 0 ;b<4;b++) {
                	t_2[b] = (short)(byte_L[b]&0x00ff);
                  	//tt[b] = (short)(byte_R[b]&0x00ff);
                   }
                t_2=LEA_ROL(t_2,(short)6);

                for(byte b = 0 ;b<4;b++) {
            		byte_L[b] = (byte)(delta_3[b]&0xff);                                   
                    //byte_R[b] = (byte)(tt[b]&0xff);
                   }
                   
                for(byte b = 0 ;b<4;b++) {
                	delta_3[b] = (short)(byte_L[b]&0x00ff);
                  	//tt[b] = (short)(byte_R[b]&0x00ff);
                   }
                tt=LEA_ROL(delta_3, (short)(i+3));
                
                for(byte b = 0 ;b<4;b++) {
            		byte_L[b] = (byte)(t_3[b]&0xff);                                   
                    byte_R[b] = (byte)(tt[b]&0xff);
                   }
                   
                for(byte b = 0 ;b<4;b++) {
                	t_3[b] = (short)(byte_L[b]&0x00ff);
                  	tt[b] = (short)(byte_R[b]&0x00ff);
                   }
                t_3=LEA_Add(t_3, tt);
                
                for(byte b = 0 ;b<4;b++) {
            		byte_L[b] = (byte)(t_3[b]&0xff);                                   
                    //byte_R[b] = (byte)(tt[b]&0xff);
                   }
                   
                for(byte b = 0 ;b<4;b++) {
                	t_3[b] = (short)(byte_L[b]&0x00ff);
                  	//tt[b] = (short)(byte_R[b]&0x00ff);
                   }
                t_3=LEA_ROL(t_3,(short)11);
            }
            for(short j=0;j<4;j++){
                rk[a+j]=t_0[j];
                rk[a+j+4]=t_1[j];
                rk[a+j+8]=t_2[j];
                rk[a+j+12]=t_1[j];
                rk[a+j+16]=t_3[j];
                rk[a+j+20]=t_1[j];    
            }
            a+=24;
        }
        return rk;
    }

*/
	
}