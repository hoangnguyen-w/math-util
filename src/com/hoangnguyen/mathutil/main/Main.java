/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoangnguyen.mathutil.main;

import com.hoangnguyen.mathutil.MathUtility;

/**
 *
 * @author ADMIN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //tui muốn test 5! = 120 hay hông?
        int n = 5;      //5!  coi bằng mấy
        long expected = 120;    //tui hy vọng bạn/hàm tính ra 120
        long actual = MathUtility.getFactorial(n);
        
        System.out.println("5! expected: " + expected + "; actual " + actual);
        // xét trường hợp 2!: 0! bằng mấy
        n = 0;      //5!  coi bằng mấy
        expected = 1;    //tui hy vọng bạn/hàm tính ra 120
        actual = MathUtility.getFactorial(n);
        
        System.out.println("0! expected: " + expected + "; actual " + actual);
    }
    
}

//trong quy trình làm phần mềm, dân dev phải có trách nhiệm test từng hàm 
//từng class mà mình viết ra trước khi đóng gói gửi cho bên QA/QC Test
//đọc lập từng hàm, từng class phải được test cẩn thận trước khi chungs
//được dùng để phối hợp với các class khác, test ngay mức hàm, mức class
//vừa hoàn thiện, chưa thèm bàn về Ui, thì mức độ test sớm này gọi là
//UNIT TEST LEVEL - TEST từng đơn thể, đơn vị code

//vậy làm sao đẻ test từng hàm, từng class
//có nhiều cách dể test từng hàm từng class.
//1. dùng sout(gọi hàm cần test()) để in ra giá trị xử lý của hàm --> môn OOP
//2. dùng JoptionPane của môn java desktop để pop-up một cửa sổ in ra kết quả xử lý hàm để KT coi đúng hay sai
//3. Dùng log file, trang web in ra kết quả xử lý của hàm(môn Java Web)

//dù là cách nào thì ta cũng cần phải in ra giấ trị hàm đã xử lý
//gọi là ACTUAL VALUE
//rồi ta đi so sánh cái giá trị trả về của hàm có giống như ta tính toán
//trước đó hay ko, cái ta hy vọng hàm sẽ trả về - gọi là EXPECTED VALUE

// nếu ACTUAL VALUE == EXPECTED VALUE -> hàm chạy ngon
//                              khác  -> hàm sai
//Nguyên tắc của việc test: so sánh ACTUAL với EXPECTED

//3 cách này cùng 1 nguyên tắc:
//gọi hàm để xử lý ra kết quả mấy
//sau đó dùng mắt để so sánh ACTUAL và EXPECTED rồi ta tự kết luận
//cách này tiềm ẩn sai xót khi ta phải xem kết quả quá nhiều cắp VALUE
//ví dụ hàm GTHUA() phải test trường hợp < 0, = 0, = 1, 18, 19, 20 (biên), 21, 22, 23, ... 3tr

//Mỗi n để test ta gọi là 1 tình huống xài hàm, 1 tình huống test
//TEST CASE

//4. Hông thèm nhìn bằng mắt từng trường hợpexpected vs actual
//nhờ máy nhìn giùm luôn, vì máy dư sức biết cách so sánh
//máy quét qua tất cả các cặp expected vs actual 
//nếu tất cả đều khớp báo tao màu xanh - đường thông code tốt
//nếu có xuất hiện ít nhất 1 thằng ko khớp actual vs ễpcted
//báo tao màu đỏ, đường kẹt do code có trục trặc tính toán
//Java: JUnit, TestNG
//C# : NUnit, MSTest, xUnit
//PHP: PHPUnit
//..mọi ngôn ngữ đều có thư viện XANH ĐỎ giúp cảnh báo hàm tốt hay ko
