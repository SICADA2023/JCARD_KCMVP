package ARIA2;

import java.util.Arrays;

public class lea {

    public static short[] LEA_Add(short[] p1, short[] p2){
        short[] p3={0,0,0,0};
        p3[3]+=(short)(p1[3]+p2[3]);
        
        if(p3[3]/256==1){
            p3[2]+=1;
            p3[3]%=256;
        }
        p3[2]+=(short)(p1[2]+p2[2]);
        
        if(p3[2]/256==1){
            p3[1]+=1;
            p3[2]%=256;
        }
        
        p3[1]+=(short)(p1[1]+p2[1]);
        
        if(p3[1]/256==1){
            p3[0]+=1;
            p3[1]%=256;
        }
        p3[0]+=(short)(p1[0]+p2[0]);
      
        if(p3[0]/256==1){
            p3[0]%=256;
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
        t_6=LEA_Add(t_0, t_1);
        
        c[1]=(short)(((t_6[2]<<1) | (t_6[3]>>7))%256);
        c[2]=(short)(((t_6[3]<<1) | (t_6[0]>>7))%256);
        c[3]=(short)(((t_6[0]<<1) | (t_6[1]>>7))%256);
        c[0]=(short)(((t_6[1]<<1) | (t_6[2]>>7))%256);

        t_6=LEA_Add(t_2, t_3);
        c[4]=(short)(((t_6[0]>>5) | (t_6[3]<<3))%256);
        c[5]=(short)(((t_6[1]>>5) | (t_6[0]<<3))%256);
        c[6]=(short)(((t_6[2]>>5) | (t_6[1]<<3))%256);
        c[7]=(short)(((t_6[3]>>5) | (t_6[2]<<3))%256);

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
                tt=LEA_ROL(delta_0, i);
                
                t_0=LEA_Add(t_0, tt);
                t_0=LEA_ROL(t_0,(short)1);
                
                tt=LEA_ROL(delta_0, (short)(i+1));
                t_1=LEA_Add(t_1, tt);
                t_1=LEA_ROL(t_1,(short)3);

                tt=LEA_ROL(delta_0, (short)(i+2));
                t_2=LEA_Add(t_2, tt);
                t_2=LEA_ROL(t_2,(short)6);

                tt=LEA_ROL(delta_0, (short)(i+3));
                t_3=LEA_Add(t_3, tt);
                t_3=LEA_ROL(t_3,(short)11);
            }
            else if(i%4==1){
                tt=LEA_ROL(delta_1, i);
                t_0=LEA_Add(t_0, tt);
                t_0=LEA_ROL(t_0,(short)1);

                tt=LEA_ROL(delta_1, (short)(i+1));
                t_1=LEA_Add(t_1, tt);
                t_1=LEA_ROL(t_1,(short)3);

                tt=LEA_ROL(delta_1, (short)(i+2));
                t_2=LEA_Add(t_2, tt);
                t_2=LEA_ROL(t_2,(short)6);

                tt=LEA_ROL(delta_1, (short)(i+3));
                t_3=LEA_Add(t_3, tt);
                t_3=LEA_ROL(t_3,(short)11);
            }
            else if(i%4==2){
                tt=LEA_ROL(delta_2, i);
                t_0=LEA_Add(t_0, tt);
                t_0=LEA_ROL(t_0,(short)1);

                tt=LEA_ROL(delta_2, (short)(i+1));
                t_1=LEA_Add(t_1, tt);
                t_1=LEA_ROL(t_1,(short)3);

                tt=LEA_ROL(delta_2, (short)(i+2));
                t_2=LEA_Add(t_2, tt);
                t_2=LEA_ROL(t_2,(short)6);

                tt=LEA_ROL(delta_2, (short)(i+3));
                t_3=LEA_Add(t_3, tt);
                t_3=LEA_ROL(t_3,(short)11);
            }
            else{
                tt=LEA_ROL(delta_3, i);
                t_0=LEA_Add(t_0, tt);
                t_0=LEA_ROL(t_0,(short)1);

                tt=LEA_ROL(delta_3, (short)(i+1));
                t_1=LEA_Add(t_1, tt);
                t_1=LEA_ROL(t_1,(short)3);

                tt=LEA_ROL(delta_3, (short)(i+2));
                t_2=LEA_Add(t_2, tt);
                t_2=LEA_ROL(t_2,(short)6);

                tt=LEA_ROL(delta_3, (short)(i+3));
                t_3=LEA_Add(t_3, tt);
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
    public static void LEA_test(){
        short[] p={0x10, 0x11, 0x12, 0x13, 0x14, 0x15 ,0x16, 0x17, 0x18, 0x19, 0x1a, 0x1b, 0x1c, 0x1d, 0x1e, 0x1f};
        short[] k={0x0f, 0x1e, 0x2d, 0x3c, 0x4b, 0x5a, 0x69, 0x78, 0x87, 0x96, 0xa5, 0xb4, 0xc3, 0xd2, 0xe1, 0xf0};
        short[] k2=new short[16];
        for(short i=0; i<(short)4;i++){
            k2[0+i*4]=k[3+i*4];
            k2[1+i*4]=k[2+i*4];
            k2[2+i*4]=k[1+i*4];
            k2[3+i*4]=k[0+i*4];
        }
        short[] rk2= new short[24*24];
        rk2=LEA_enc_key(k2);  
        short[] t= new short[16];
        for(short i=0; i<(short)4;i++){
            t[0+i*4]=p[3+i*4];
            t[1+i*4]=p[2+i*4];
            t[2+i*4]=p[1+i*4];
            t[3+i*4]=p[0+i*4];
        }

        for(short i=0;i<16;i++){
            p[i]=t[i];
        }
        short[] c=new short[16];
        for(short i=0;i<(short)24;i++){
            LEA_encrypt(p, rk2,i, c);
          
            for(short j=0;j<(short)16;j++){
                p[j]=c[j];
            }        
        }
        for(short i=0; i<(short)4;i++){
            t[0+i*4]=c[3+i*4];
            t[1+i*4]=c[2+i*4];
            t[2+i*4]=c[1+i*4];
            t[3+i*4]=c[0+i*4];
        }
        for(short i=0;i<16;i++){
            c[i]=t[i];
        }
        System.out.println(Arrays.toString(c));  
    }

    public static void main(String[] args) { 
        LEA_test();
    }
}
