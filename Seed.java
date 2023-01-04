package Seed;

public class Seed {
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

	// 0x00112233

	// p[0] = 0x00, p[1] = 0x11...

	public static short[] ADD(short[] p1, short[] p2) {

		short[] p3 = { 0, 0, 0, 0 };

		p3[3] += (short) (p1[3] + p2[3]);

		if (p3[3] / 256 == 1) {

			p3[2] += 1;

			p3[3] %= 256;

		}

		p3[2] += (short) (p1[2] + p2[2]);

		if (p3[2] / 256 == 1) {

			p3[1] += 1;

			p3[2] %= 256;

		}

		p3[1] += (short) (p1[1] + p2[1]);

		if (p3[1] / 256 == 1) {

			p3[0] += 1;

			p3[1] %= 256;

		}

		p3[0] += (short) (p1[0] + p2[0]);

		if (p3[0] / 256 == 1) {

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

	// INPUT : 4bytes

	// OPUPUT: 4bytes

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

		// [ KR[4*round_num+0], KR[4*round_num+1], KR[4*round_num+2], KR[4*round_num+3]
		// ]

		// [ KL[4*round_num+0], KL[4*round_num+1], KL[4*round_num+2], KL[4*round_num+3]
		// ]

		for (byte i = 0; i < 4; i++) {

			buf_KL[i] = KL[4 * round_num + i];

			buf_KR[i] = KR[4 * round_num + i];

		}

		buf_L = SXOR(C, buf_KL);

		buf_R = G_func(SXOR(buf_L, SXOR(D, buf_KR)));

		buf_L = G_func(ADD(buf_L, buf_R));

		buf_R = G_func(ADD(buf_L, buf_R));

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

		// A0 A1 A2 A3 B0 B1 B2 B3 -> B3 A0 A1 A2 A3 B0 B1 B2

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

		// A0 A1 A2 A3 B0 B1 B2 B3 -> A1 A2 A3 B0 B1 B2 B3 A0

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

	// KL / KR / input:MK 16byte [4/4/4/4]

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
			
			// KL
			ADD_buf = ADD(A, C);
			MIN_buf = MINUS(ADD_buf, KC_buf);
			round_key_buf = G_func(MIN_buf);
			
			
			for (byte bufcopy = 0; bufcopy < 4; bufcopy++)

			{

				KL_buf[bufcopy] = round_key_buf[bufcopy];

			}

			// KR
			MIN_buf = MINUS(B, D);
			ADD_buf = ADD(MIN_buf, KC_buf);
			round_key_buf = G_func(ADD_buf);
			// round_key_buf = G_func(ADD(MINUS(B,D),KC_buf));

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
		
		// return ABCD

		short[] ABCD = new short[16];

		// SHORT 8BYTE l0+r0

		short[] result = new short[8];

		// short C = int #1 short D = int #1

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
//			System.out.print("A: ");
//			for (byte k = 0; k < 4; k++) {
//				System.out.print(Integer.toHexString(A[k]));
//			}
//			System.out.println();
//
//			System.out.print("B: ");
//			for (byte k = 0; k < 4; k++) {
//				System.out.print(Integer.toHexString(B[k]));
//			}
//			System.out.println();
//			System.out.print("C: ");
//			for (byte k = 0; k < 4; k++) {
//				System.out.print(Integer.toHexString(C[k]));
//			}
//			System.out.println();
//			System.out.print("D: ");
//			for (byte k = 0; k < 4; k++) {
//				System.out.print(Integer.toHexString(D[k]));
//			}
//			System.out.println();
			
			result = F_func(C, D, nowround);

			
			//A_buf = A;
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

			ABCD[i] =  C[i];

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

}