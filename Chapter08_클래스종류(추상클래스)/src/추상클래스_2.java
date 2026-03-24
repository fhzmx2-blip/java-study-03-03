
abstract class 도형{
	public abstract void draw();
}
class 사각형 extends 도형{
	@Override
	public void draw() {
		System.out.println("사각형을 그린다");
	}
}
class 삼각형 extends 도형{
	@Override
	public void draw() {
		System.out.println("삼각형을 그린다");
	}
}
class 원 extends 도형{
	@Override
	public void draw() {
		System.out.println("원을 그린다");
	}
}

abstract class DBDriver{
	public abstract void connection();//연결
	public abstract void preparedStatement();//SQL 문장
	public abstract void disConnection();//닫기
	public abstract void getResultSet();//결과
}
class Oracle extends DBDriver{
	@Override
	public void connection(){
		System.out.println("오라클 연결");
	}
	@Override
	public void preparedStatement() {
		System.out.println("Select 문장 전송");
	}
	@Override
	public void disConnection() {
		System.out.println("오라클 연결 종료");
	}
	@Override
	public void getResultSet() {
		System.out.println("읽은 데이터 저장:브라우저 전송");
	}
}
class MySQL extends DBDriver{
	@Override
	public void connection(){
		System.out.println("MySQL 연결");
	}
	@Override
	public void preparedStatement() {
		System.out.println("Select 문장 전송");
	}
	@Override
	public void disConnection() {
		System.out.println("MySQL 연결 종료");
	}
	@Override
	public void getResultSet() {
		System.out.println("읽은 데이터 저장:브라우저 전송");
	}
}
class MariaDB{
	
}
class MSSQL{
	
}
class DB2{
	
}

public class 추상클래스_2 {
	public static void main(String[] args) {
//		도형 a=new 사각형();
//		a.draw();
//		
//		a=new 삼각형();
//		a.draw();
//		
//		a=new 원();
//		a.draw();
		
		DBDriver db=new Oracle();
		db.connection();
		db.preparedStatement();
		db.disConnection();
		db.getResultSet();
		db=new MySQL();
		db.connection();
		db.preparedStatement();
		db.disConnection();
		db.getResultSet();
	}
}
