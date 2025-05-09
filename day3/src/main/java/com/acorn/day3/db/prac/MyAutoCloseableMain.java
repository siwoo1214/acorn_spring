package com.acorn.day3.db.prac;

public class MyAutoCloseableMain {
	public static void main(String[] args) {
		Myconnection con = new Myconnection();
		MyPreparedStatement pst = new MyPreparedStatement();
		MyResultSet rs = new MyResultSet();

		close3(con, pst, rs);

		Myconnection con2 = new Myconnection();
		MyPreparedStatement pst2 = new MyPreparedStatement();
		close2(con2, pst2);
	}

	// 메소드
	public static void close0(Myconnection a, MyPreparedStatement b, MyResultSet c) {

	}

	public static void close1(MyAutoCloseable a, MyAutoCloseable b, MyAutoCloseable c) {

	}

	public static void close2(MyAutoCloseable a, MyAutoCloseable b) {

	}

	//가변인자
	public static void close3(MyAutoCloseable... qwer) { // 가변인자 쓸 때는 타입이 다 같아야함
		for (MyAutoCloseable items : qwer) {
			items.close();
		}
	}
}
