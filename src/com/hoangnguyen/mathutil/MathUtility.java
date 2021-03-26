/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoangnguyen.mathutil;

/**
 *
 * @author ADMIN
 */
public class MathUtility {
    //ta sẽ tạo các hàm trong class này fake y chang class Math của JDk
    //các hàm sẽ xài chung ở hiều nơi, làm tiện ích dùng chung
    //phàm cái gì dùng chung thì ta suy nghĩ đến static
    
    public static final double PI = 3.1415;     //y chang Math.PI
                                                //lát hoiofMathutility.PI
    //hàm tính n! = 1.2.3.4.5.6.....n
    //Quy ước: 0! = 1! = 1;
    //ko có giai thừa âm
    //vì giai thừa tăng cực nhanh về giá trị, 21 tràn kiểu long
    //long: 10^18, 18 con số 0 tối đa
//    public static long getFactorial(int n){
//        if(n < 0 || n > 20)
//            throw new IllegalArgumentException("Invalid argument. n must be between 0..20");
//        if(n < 2)
//            return 1;   //0! = 1! = 1 tính luôn cho nhanh
//        
//        //đến đoạn này sure n từ 2..20
//        //return n * getFactorial(n - 1);
//        long result = 1;    //cố tình heng, lát tính tiếp
//        for (int i = 2; i <= n; i++) {
//            result = result * i;
//        }
//        return result;
//    }
    
    public static long getFactorial(int n){
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument. n must be between 0..20");
        if(n == 0 || n == 1)
                return 1;       //0! = 1! = 1 tính luôn cho nhanh
        return n * getFactorial(n - 1);         //mình thừa biết n! = n * ( n - 1)!
    }
}
