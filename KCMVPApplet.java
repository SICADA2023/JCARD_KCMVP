
package com.etri.applet;

import javacard.framework.APDU;
import javacard.framework.ISO7816;
import javacard.framework.Applet;
import javacard.framework.ISOException;
import javacard.framework.Util;

/**
 * @author ADMIN
 *
 */

public class KCMVPApplet extends Applet {
	
//	//	CLA
//	private static final byte CLA_APDU_DEMO = (byte)0x00;
//	// INS
//	private static final byte INS_PUT_KEY = (byte) 0xC1;
//	private static final byte INS_GET_KEY = (byte) 0xC2;
//	private static final byte INS_ENCRYPT = (byte) 0xC3;
//	private static final byte INS_DECRYPT = (byte) 0xC4;
//	
//	private final static byte KEY_SIZE_128 = (byte)16;
//	private final static byte KEY_SIZE_192 = (byte)24;
//	private final static byte KEY_SIZE_256 = (byte)32;
//	
//	private final static byte BLOCK_SIZE = (byte)16;
//	
//	private final static byte TAG_SEED128 = (byte)0x80;
//	private final static byte TAG_ARIA128 = (byte)0x81;
//	private final static byte TAG_ARIA192 = (byte)0x82;
//	private final static byte TAG_ARIA256 = (byte)0x83;
//	private final static byte TAG_LEA128 = (byte)0x84;
//	private final static byte TAG_LEA192 = (byte)0x85;
//	private final static byte TAG_LEA256 = (byte)0x86;
//	
//	private final static byte P1_SEED = (byte)0x02;
//	private final static byte P1_ARIA = (byte)0x04;
//	private final static byte P1_LEA = (byte)0x08;
//	
//	
//	//public short[] rk_aria={212, 21, 167, 92, 121, 75, 133, 197, 224, 210, 160, 179, 203, 121, 59, 246, 54, 156, 101, 228, 177, 23, 119, 171, 113, 58, 62, 30, 102, 1, 184, 244, 3, 104, 212, 241, 61, 20, 73, 123, 101, 41, 
//    //         173, 122, 200, 9, 231, 208, 198, 68, 85, 43, 84, 154, 38, 63, 184, 208, 181, 9, 6, 34, 158, 236, 95, 156, 67, 73, 81, 242, 210, 239, 52, 39, 135, 177, 167, 129, 121, 76, 175, 234, 44, 12, 231, 29, 182, 222, 66, 164, 116, 97, 244, 50, 60, 84, 50, 66, 134, 219, 68, 186, 77, 182, 196, 74, 195, 6, 242, 168, 75, 44, 127, 159, 169, 53, 116, 216, 66, 185, 16, 26, 88, 6, 55, 113, 235, 123, 170, 185, 197, 119, 49, 252, 210, 19, 173, 86, 119, 69, 143, 207, 230, 212, 47, 68, 35, 187, 6, 70, 90, 186, 218, 86, 148, 161, 158, 184, 132, 89, 159, 135, 114, 128, 143, 93, 88, 13, 129, 14, 248, 221, 172, 19, 171, 235, 134, 132, 148, 106, 21, 91, 231, 126, 248, 16, 116, 72, 71, 227, 95, 173, 15, 10, 161, 109, 174, 230, 27, 215, 223, 238, 90, 89, 153, 112, 251, 53, 0, 0, 0, 0, 0, 0, 0, 
//    //         0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
//    public short[] rk_aria;
//  //  AriaTest aria = new AriaTest();
//    AriaTest dolphin = new AriaTest();
//	private byte[] keySEED;
//	private byte sizeSEED;
//	private boolean presentSEED;
//	
//	private KCMVPApplet()
//	{
//		keySEED = new byte[32];
//		presentSEED = false;
//		sizeSEED = KEY_SIZE_128;
//	}
//	public static void install(byte[] bArray, short bOffset, byte bLength) {
//		// GP-compliant JavaCard applet registration
//		new KCMVPApplet().register(bArray, (short) (bOffset + 1),
//				bArray[bOffset]);
//	}
//
//	public void process(APDU apdu) {
//		// Good practice: Return 9000 on SELECT
//		if (selectingApplet()) {
//			return;
//		}
//
//		byte[] buf = apdu.getBuffer();
//		switch (buf[ISO7816.OFFSET_INS]) {
//		case INS_PUT_KEY:
//			putKey(apdu);
//			break;
//		case INS_GET_KEY:			
//			getKey(apdu);
//			break;
//		case INS_ENCRYPT:
//			encrypt(apdu);
//			break;
//		case INS_DECRYPT:
//			decrypt(apdu);
//			break;
//		default:
//			// good practice: If you don't know the INStruction, say so:
//			ISOException.throwIt(ISO7816.SW_INS_NOT_SUPPORTED);
//		}
//	}
//	
//	private void putKey(APDU apdu)
//	{
//		byte[] apduBuffer = apdu.getBuffer();
//		byte nLcByte = apduBuffer[ISO7816.OFFSET_LC];
//		short recvBuffer = apdu.setIncomingAndReceive();
//		
//		if(nLcByte < 1)
//			ISOException.throwIt(ISO7816.SW_WRONG_LENGTH);
//		
//		byte tag = apduBuffer[ISO7816.OFFSET_CDATA];
//		byte len = apduBuffer[ISO7816.OFFSET_CDATA + 1];
//		
//		//TAG
//		switch (tag) {
//		
//		case TAG_SEED128:
//			if(len != KEY_SIZE_128)
//				ISOException.throwIt(ISO7816.SW_WRONG_LENGTH);
//			if(keySEED == null)
//				ISOException.throwIt(ISO7816.SW_WRONG_DATA);
//			
//			Util.arrayCopyNonAtomic(apduBuffer, (short)(ISO7816.OFFSET_CDATA + 2), keySEED, (short)0, (short)KEY_SIZE_128);
//			presentSEED = true;
//			sizeSEED = KEY_SIZE_128;
//			//rk_aria = new short[24*24];
//			short[] mk = new short[16];
//			for(byte i = 0 ;i<16;i++) mk[i] = (short)(keySEED[i]);
//			
//			//aria.EncKeySetup(mk,rk_aria,(short)128);
//
//			
//			dolphin.LEA_enc_key(mk);
//		
//			
//			//seed
//			//dolphin.SEED_KeySchedKey(mk);
//			
//			break;
//			
//		case TAG_ARIA128:
//			break;
//		case TAG_LEA128:
//			break;		
//		case TAG_ARIA192:
//			break;
//		case TAG_LEA192:			
//			break;		
//		case TAG_ARIA256:
//			break;
//		case TAG_LEA256:			
//			break;
//		}		
//	}
//	
//	private void getKey(APDU apdu)
//	{
//		byte[] apduBuffer = apdu.getBuffer();		
//		short lenSend = 0;
//				
//		switch(apduBuffer[ISO7816.OFFSET_P1])
//		{
//		case P1_SEED:
//			if(presentSEED == false)
//				ISOException.throwIt(ISO7816.SW_CONDITIONS_NOT_SATISFIED);
//			
//			short le = apdu.setOutgoing();
//			if(le < (sizeSEED+2))
//				ISOException.throwIt(ISO7816.SW_WRONG_LENGTH);
//			apdu.setOutgoingLength( (short)(sizeSEED + 2) );
//			
//			apduBuffer[0] = TAG_SEED128;
//			apduBuffer[1] = sizeSEED;
//			
//			if(keySEED == null)
//				ISOException.throwIt(ISO7816.SW_WRONG_DATA);
//			Util.arrayCopyNonAtomic(keySEED, (short)0, apduBuffer, (short)2, (short)sizeSEED);
//			lenSend = (short)(sizeSEED + 2);		
//			
//			break;
//		case P1_ARIA:
//			break;
//		case P1_LEA:
//			break;
//		default:
//			ISOException.throwIt(ISO7816.SW_INCORRECT_P1P2);				
//		}
//				
//		apdu.sendBytes((short)0, (short)lenSend);		
//		//apdu.sendBytes((short)0, (short)10);
//	}
//	private void encrypt(APDU apdu)
//	{
//		byte[] apduBuffer = apdu.getBuffer();
//		byte[] plain = new byte[16];
//		byte[] cipher = new byte[16];
//		switch(apduBuffer[ISO7816.OFFSET_P1])
//		{
//		case P1_SEED:
//			if(presentSEED == false)
//				ISOException.throwIt(ISO7816.SW_CONDITIONS_NOT_SATISFIED);
//			
//			byte nLcByte = apduBuffer[ISO7816.OFFSET_LC];
//			short recvBuffer = apdu.setIncomingAndReceive();
//			
//			if(nLcByte < BLOCK_SIZE)
//				ISOException.throwIt(ISO7816.SW_WRONG_LENGTH);
//			
//			Util.arrayCopyNonAtomic(apduBuffer, (short)ISO7816.OFFSET_CDATA, plain, (short)0, (short)BLOCK_SIZE);
//			
//			seedEncrypt(plain, cipher);
//			
//			apdu.setOutgoing();			
//			apdu.setOutgoingLength( (short)BLOCK_SIZE);
//			apdu.sendBytesLong(cipher, (short)0, (short)cipher.length);			
//			
//			break;
//		case P1_ARIA:
//			break;
//		case P1_LEA:
//			break;
//		default:
//			ISOException.throwIt(ISO7816.SW_INCORRECT_P1P2);				
//		}
//		
//	}
//	private void decrypt(APDU apdu)
//	{
//		byte[] apduBuffer = apdu.getBuffer();
//		byte[] plain = new byte[16];
//		byte[] cipher = new byte[16];
//		switch(apduBuffer[ISO7816.OFFSET_P1])
//		{
//		case P1_SEED:
//			if(presentSEED == false)
//				ISOException.throwIt(ISO7816.SW_CONDITIONS_NOT_SATISFIED);
//			
//			byte nLcByte = apduBuffer[ISO7816.OFFSET_LC];
//			short recvBuffer = apdu.setIncomingAndReceive();
//			
//			if(nLcByte < BLOCK_SIZE)
//				ISOException.throwIt(ISO7816.SW_WRONG_LENGTH);
//			
//			Util.arrayCopyNonAtomic(apduBuffer, (short)ISO7816.OFFSET_CDATA, cipher, (short)0, (short)BLOCK_SIZE);
//			
//			seedDecrypt(cipher, plain);
//			
//			apdu.setOutgoing();			
//			apdu.setOutgoingLength( (short)BLOCK_SIZE);
//			apdu.sendBytesLong(plain, (short)0, (short)plain.length);			
//			
//			break;
//		case P1_ARIA:
//			break;
//		case P1_LEA:
//			break;
//		default:
//			ISOException.throwIt(ISO7816.SW_INCORRECT_P1P2);				
//		}
//	}
//	
//	
//	private void seedEncrypt(byte[] plain, byte[] cipher)
//	{
//		
//		//short[] rk=new short[16*17];
//        short[] c=new short[16];
//        //short[] mk=new short[16];
//        short[] p=new short[16];
//        for(short i=0;i<16;i++){
//        	//mk[i]=(short)keySEED[i];
//        	p[i]=(short)plain[i];
//        }
//       
//        //seed
//        //c = dolphin.SEED_encrypt(p);
//        
//        //short R = aria.EncKeySetup(mk,rk,(short)128);
//        
//        //short j=0;
//        //short R = aria.EncKeySetup(mk,rk,(short)128);
//        
//        //aria.Crypt(p, (short)12, rk_aria, c,j);
//        
//        //LEA_encrypt(short[] p, short[] rk, short rk_num, short[] c)
//        
//        for(short i=0;i<24;i++){
//        	   dolphin.LEA_encrypt(p,rk_aria,i,c);
//        }
//        
//        
////        for(byte i=0;i<4;i++){
////        	c[i]= dolphin.KR[4*14+i];
////        	c[4+i] = dolphin.KR[4*15+i];
////        	c[8+i] = dolphin.KL[4*14+i];
////        	c[12+i] = dolphin.KL[4*15+i];
////        	
////        }
//        
//        for(short i=0;i<16;i++){
//        	cipher[i] = (byte)c[i];
//        	//cipher[i+8] = (byte)(c[i]>>8);
//        }
//        
//	}
//
//	/*
//	private void seedEncrypt(byte[] plain, byte[] cipher)
//	{
//		
//		Aes aes = new Aes();
//		byte[] state = new byte[16];
//		byte[] keyset = new byte[16];
//		for(byte i = 0 ; i<16;i++){keyset[i] = keySEED[i]; state[i] = plain[i];}
//		state = aes.ADDROUND(state,keyset);
//		for(byte i = 0;i<9;i++)
//		{
//			keyset = aes.generateRoundKeys(keyset,i);
//			state = aes.ROUND(state,keyset);
//		}
//		//keyset = aes.generateRoundKeys(keyset,(byte)10);
//		//state = aes.SUBBYTE(state);
//		   
//        //state = aes.SHIFTROW(state);
//        //state = aes.ADDROUND(state,keyset);
//         
//        for(byte i =0;i<16;i++) cipher[i] = state[i];
//	}
//	
//	*/
//	private void seedDecrypt(byte[] cipher, byte[] plain)
//	{
//		for(short i = 0; i < cipher.length; i++)
//			plain[i] = (byte)(cipher[i] ^ keySEED[i]);
//	}
	
	
//	CLA
	private static final byte CLA_APDU_DEMO = (byte)0x00;
	// INS
	private static final byte INS_PUT_KEY = (byte) 0xC1;
	private static final byte INS_GET_KEY = (byte) 0xC2;
	private static final byte INS_ENCRYPT = (byte) 0xC3;
	private static final byte INS_DECRYPT = (byte) 0xC4;
	
	private final static byte KEY_SIZE_128 = (byte)16;
	private final static byte KEY_SIZE_192 = (byte)24;
	private final static byte KEY_SIZE_256 = (byte)32;
	
	private final static byte BLOCK_SIZE = (byte)16;
	
	private final static byte TAG_SEED128 = (byte)0x80;
	private final static byte TAG_ARIA128 = (byte)0x81;
	private final static byte TAG_ARIA192 = (byte)0x82;
	private final static byte TAG_ARIA256 = (byte)0x83;
	private final static byte TAG_LEA128 = (byte)0x84;
	private final static byte TAG_LEA192 = (byte)0x85;
	private final static byte TAG_LEA256 = (byte)0x86;
	
	private final static byte P1_SEED = (byte)0x02;
	private final static byte P1_ARIA = (byte)0x04;
	private final static byte P1_LEA = (byte)0x08;
	
	
	//public short[] rk_aria={212, 21, 167, 92, 121, 75, 133, 197, 224, 210, 160, 179, 203, 121, 59, 246, 54, 156, 101, 228, 177, 23, 119, 171, 113, 58, 62, 30, 102, 1, 184, 244, 3, 104, 212, 241, 61, 20, 73, 123, 101, 41, 
    //         173, 122, 200, 9, 231, 208, 198, 68, 85, 43, 84, 154, 38, 63, 184, 208, 181, 9, 6, 34, 158, 236, 95, 156, 67, 73, 81, 242, 210, 239, 52, 39, 135, 177, 167, 129, 121, 76, 175, 234, 44, 12, 231, 29, 182, 222, 66, 164, 116, 97, 244, 50, 60, 84, 50, 66, 134, 219, 68, 186, 77, 182, 196, 74, 195, 6, 242, 168, 75, 44, 127, 159, 169, 53, 116, 216, 66, 185, 16, 26, 88, 6, 55, 113, 235, 123, 170, 185, 197, 119, 49, 252, 210, 19, 173, 86, 119, 69, 143, 207, 230, 212, 47, 68, 35, 187, 6, 70, 90, 186, 218, 86, 148, 161, 158, 184, 132, 89, 159, 135, 114, 128, 143, 93, 88, 13, 129, 14, 248, 221, 172, 19, 171, 235, 134, 132, 148, 106, 21, 91, 231, 126, 248, 16, 116, 72, 71, 227, 95, 173, 15, 10, 161, 109, 174, 230, 27, 215, 223, 238, 90, 89, 153, 112, 251, 53, 0, 0, 0, 0, 0, 0, 0, 
    //         0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    public short[] rk_aria;
    AriaTest aria = new AriaTest();
	private byte[] keySEED;
	private byte sizeSEED;
	private boolean presentSEED;
	
	private KCMVPApplet()
	{
		keySEED = new byte[32];
		presentSEED = false;
		sizeSEED = KEY_SIZE_128;
	}
	public static void install(byte[] bArray, short bOffset, byte bLength) {
		// GP-compliant JavaCard applet registration
		new KCMVPApplet().register(bArray, (short) (bOffset + 1),
				bArray[bOffset]);
	}

	public void process(APDU apdu) {
		// Good practice: Return 9000 on SELECT
		if (selectingApplet()) {
			return;
		}

		byte[] buf = apdu.getBuffer();
		switch (buf[ISO7816.OFFSET_INS]) {
		case INS_PUT_KEY:
			putKey(apdu);
			break;
		case INS_GET_KEY:			
			getKey(apdu);
			break;
		case INS_ENCRYPT:
			encrypt(apdu);
			break;
		case INS_DECRYPT:
			decrypt(apdu);
			break;
		default:
			// good practice: If you don't know the INStruction, say so:
			ISOException.throwIt(ISO7816.SW_INS_NOT_SUPPORTED);
		}
	}
	
	private void putKey(APDU apdu)
	{
		byte[] apduBuffer = apdu.getBuffer();
		byte nLcByte = apduBuffer[ISO7816.OFFSET_LC];
		short recvBuffer = apdu.setIncomingAndReceive();
		
		if(nLcByte < 1)
			ISOException.throwIt(ISO7816.SW_WRONG_LENGTH);
		
		byte tag = apduBuffer[ISO7816.OFFSET_CDATA];
		byte len = apduBuffer[ISO7816.OFFSET_CDATA + 1];
		
		//TAG
		switch (tag) {
		
		case TAG_SEED128:
			if(len != KEY_SIZE_128)
				ISOException.throwIt(ISO7816.SW_WRONG_LENGTH);
			if(keySEED == null)
				ISOException.throwIt(ISO7816.SW_WRONG_DATA);
			
			Util.arrayCopyNonAtomic(apduBuffer, (short)(ISO7816.OFFSET_CDATA + 2), keySEED, (short)0, (short)KEY_SIZE_128);
			presentSEED = true;
			sizeSEED = KEY_SIZE_128;

			
			/*ARIA CRYPTOSYSTEM*/
			
			rk_aria = new short[16*17];
			short[] mk = new short[16];
			for(byte i=0;i<16;i++) mk[i] = (short)(keySEED[i]);
			aria.EncKeySetup(mk,rk_aria,(short)128);
			
			/*SEED CRYPTOSYSTEM*/
			
/*
			short[] mk = new short[16];
			for(byte i = 0 ;i<16;i++) mk[i] = (short)(keySEED[i]);
			aria.SEED_KeySchedKey(mk);
*/

		
		
			
			
			
			
			
			
			/*  LEA CRYPTOSYSTEM  */
			
/*
			
		       rk_aria= new short[24*24];
		       short[] rk1 = new short[16];
		        for(short i=0; i<(short)4;i++){
		            rk1[0+i*4]=keySEED[3+i*4];
		            rk1[1+i*4]=keySEED[2+i*4];
		            rk1[2+i*4]=keySEED[1+i*4];
		            rk1[3+i*4]=keySEED[0+i*4];
		        }
		        rk_aria = aria.LEA_enc_key(rk1);
*/
		        
		        
			break;
			
		case TAG_ARIA128:
			break;
		case TAG_LEA128:
			break;		
		case TAG_ARIA192:
			break;
		case TAG_LEA192:			
			break;		
		case TAG_ARIA256:
			break;
		case TAG_LEA256:			
			break;
		}		
	}
	
	private void getKey(APDU apdu)
	{
		byte[] apduBuffer = apdu.getBuffer();		
		short lenSend = 0;
				
		switch(apduBuffer[ISO7816.OFFSET_P1])
		{
		case P1_SEED:
			if(presentSEED == false)
				ISOException.throwIt(ISO7816.SW_CONDITIONS_NOT_SATISFIED);
			
			short le = apdu.setOutgoing();
			if(le < (sizeSEED+2))
				ISOException.throwIt(ISO7816.SW_WRONG_LENGTH);
			apdu.setOutgoingLength( (short)(sizeSEED + 2) );
			
			apduBuffer[0] = TAG_SEED128;
			apduBuffer[1] = sizeSEED;
			
			if(keySEED == null)
				ISOException.throwIt(ISO7816.SW_WRONG_DATA);
			Util.arrayCopyNonAtomic(keySEED, (short)0, apduBuffer, (short)2, (short)sizeSEED);
			lenSend = (short)(sizeSEED + 2);		
			
			break;
		case P1_ARIA:
			break;
		case P1_LEA:
			break;
		default:
			ISOException.throwIt(ISO7816.SW_INCORRECT_P1P2);				
		}
				
		apdu.sendBytes((short)0, (short)lenSend);		
		//apdu.sendBytes((short)0, (short)10);
	}
	private void encrypt(APDU apdu)
	{
		byte[] apduBuffer = apdu.getBuffer();
		byte[] plain = new byte[16];
		byte[] cipher = new byte[16];
		switch(apduBuffer[ISO7816.OFFSET_P1])
		{
		case P1_SEED:
			if(presentSEED == false)
				ISOException.throwIt(ISO7816.SW_CONDITIONS_NOT_SATISFIED);
			
			byte nLcByte = apduBuffer[ISO7816.OFFSET_LC];
			short recvBuffer = apdu.setIncomingAndReceive();
			
			if(nLcByte < BLOCK_SIZE)
				ISOException.throwIt(ISO7816.SW_WRONG_LENGTH);
			
			Util.arrayCopyNonAtomic(apduBuffer, (short)ISO7816.OFFSET_CDATA, plain, (short)0, (short)BLOCK_SIZE);
			
			seedEncrypt(plain, cipher);
			
			apdu.setOutgoing();			
			apdu.setOutgoingLength( (short)BLOCK_SIZE);
			apdu.sendBytesLong(cipher, (short)0, (short)cipher.length);			
			
			break;
		case P1_ARIA:
			break;
		case P1_LEA:
			break;
		default:
			ISOException.throwIt(ISO7816.SW_INCORRECT_P1P2);				
		}
		
	}
	private void decrypt(APDU apdu)
	{
		byte[] apduBuffer = apdu.getBuffer();
		byte[] plain = new byte[16];
		byte[] cipher = new byte[16];
		switch(apduBuffer[ISO7816.OFFSET_P1])
		{
		case P1_SEED:
			if(presentSEED == false)
				ISOException.throwIt(ISO7816.SW_CONDITIONS_NOT_SATISFIED);
			
			byte nLcByte = apduBuffer[ISO7816.OFFSET_LC];
			short recvBuffer = apdu.setIncomingAndReceive();
			
			if(nLcByte < BLOCK_SIZE)
				ISOException.throwIt(ISO7816.SW_WRONG_LENGTH);
			
			Util.arrayCopyNonAtomic(apduBuffer, (short)ISO7816.OFFSET_CDATA, cipher, (short)0, (short)BLOCK_SIZE);
			
			seedDecrypt(cipher, plain);
			
			apdu.setOutgoing();			
			apdu.setOutgoingLength( (short)BLOCK_SIZE);
			apdu.sendBytesLong(plain, (short)0, (short)plain.length);			
			
			break;
		case P1_ARIA:
			break;
		case P1_LEA:
			break;
		default:
			ISOException.throwIt(ISO7816.SW_INCORRECT_P1P2);				
		}
	}
	
	
	private void seedEncrypt(byte[] plain, byte[] cipher)
	{
		
		/*ARIA CRYPTOSYSTEM*/
		
		short[] p = new short[16];
		short[] c = new short[16];
		for(byte i = 0;i<16;i++)p[i] = plain[i];
		
		short ki = 0;
		aria.Crypt(p,(short)12,rk_aria,c,ki);
		for(byte i=0;i<16;i++) cipher[i] = (byte)c[i];
        
       
        /*SEED CRYPTOSYSTEM*/
/*
        short[] p = new short[16];
        short[] c = new short[16];
       
        
        for(byte i =0;i<16;i++)
        {
        	p[i] = plain[i];
        }
        c = aria.SEED_encrypt(p);
        
        for(byte i=0;i<16;i++)
        {
        	cipher[i] = (byte)c[i];
        }
        
*/
		
        
        
        
        
       /*LEA CRYPTOSYSTEM*/
        
        
/*       
        short[] c=new short[16];
        
        short[] p=new short[16];
        
        for(short i=0; i<(short)4;i++){
            p[0+i*4]=(short)plain[3+i*4];
            p[1+i*4]=(short)plain[2+i*4];
            p[2+i*4]=(short)plain[1+i*4];
            p[3+i*4]=(short)plain[0+i*4];
        }
        
        for(short i=0;i<24;i++){
        	
        	   aria.LEA_encrypt(p,rk_aria,i,c);
        	   for(byte j =0;j<16;j++)p[j] = c[j];
        }
        
        for(short i=0; i<(short)4;i++){
            cipher[0+i*4]=(byte)c[3+i*4];
            cipher[1+i*4]=(byte)c[2+i*4];
            cipher[2+i*4]=(byte)c[1+i*4];
            cipher[3+i*4]=(byte)c[0+i*4];
        }
*/
        
	}

	
	private void seedDecrypt(byte[] cipher, byte[] plain)
	{
		for(short i = 0; i < cipher.length; i++)
			plain[i] = (byte)(cipher[i] ^ keySEED[i]);
	}
}