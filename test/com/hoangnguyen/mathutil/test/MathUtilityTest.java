/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoangnguyen.mathutil.test;

import com.hoangnguyen.mathutil.MathUtility;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ADMIN
 */
public class MathUtilityTest {
    
    //đặt tên hàm theo chuẩn dân test phần mềm, QA/QC
    @Test       //biến hàm này thành main(). Shift F6 để chạy
    public void testFactorialGivenRightArgumentReturnsGoodResult(){
        int n = 5;
        long expected = 120;
        long actual = MathUtility.getFactorial(n);
        
        assertEquals(expected, actual);
        assertEquals(720, MathUtility.getFactorial(6));         // 6! đúng là 720 hông
        assertEquals(24, MathUtility.getFactorial(4));         
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(1, MathUtility.getFactorial(0));
        //màu đỏ đến theo 2 nghĩa
        //hàm tính đúng, kì vọng sai
        //hàm tính sai, kì vọng đúng
        //mỗi lời gọi hàm ở trên được gọi là 1 test cáe
        //một tình huống test hàm, với 1 đàu vào và nhận đầu ra   
    }
    
    //Test ngoại lệ thì như thế nào ?????
    //vì khi ngoại lệ xảy ra app dừng liền, màu đỏ vì có điều ko ổn
    //thêm nữa ngoại lệ ko phải là 1 value để so sánh, ko biết nó là số mấy
    //ngoại lệ chỉ có thể ước lượng nó, chạm nó khi xảy ra
    //test ngoại lệ nên đc đọc/diễn giải như sau:
    //tui đưa vào các tính huống dữ liệu cà chớn, vd - 5, 22, 40 
    //tui muốn nhìn xem ngoại lệ có xảy râ hay không trong tình huống này
    //nếu có xảy ra, thì mừng lắm luôn, vì app/hàm chạy đúng như thiết kế
    //tức là nếu getFactorial(-5) mà ném ra ngoại lệ
    //IllegalArgumentException, có nghĩa là hàm đúng
    //có nghĩa là màu xanh (đừng bối rối)
    //XANH vì thiết kế nói rằng tình huống -5 phải có ngoại lệ
    //và nếu ngoại lệ xanh, thì hàm đúng
    
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialGivenWrongArgumentThrowsException(){
        MathUtility.getFactorial(-5);        //chạy hàm thôi, chưa test
        MathUtility.getFactorial(21);       // biết thừa hàm nếm ra exception ta phải bắt nó lại
        MathUtility.getFactorial(-1);       // nếu có thật, hàm đúng
        MathUtility.getFactorial(4);       // Xanh
        
        
        
    }
    
    
}
//Việc test dungf màu sắc, dùng thư viện Unit Test có quy ước
//Nếu tất cả các cặp expected và actual khớp nhau(equals)
//thì co như hàm chạy đúng mọi tình huonngs đã test => xanh

//nếu trong tất cả các cặp mà tâ test, có ít nhất 1 cặp
//ko khớp nhau - ít nhất 1 màu đỏ, coi như hàm ko ổn -> Đỏ
//Điều này để đảm bảo rằng, phàm hàm mà đã test các tình huống
//thì phải đúng hết các tình huống đã test
//Nói cách khác, những gì ta chủ động liệt kê,
//thì ra phải thấy đúng