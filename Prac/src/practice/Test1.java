package practice;

public class Test1 {
    public void sayNick(String nick) {
        try {
            if("fool".equals(nick)) {
                throw new FoolException();
            }
            System.out.println("����� ������ "+nick+" �Դϴ�.");
        }catch(FoolException e) {
            System.err.println("FoolException�� �߻��߽��ϴ�.");
        }
    }

    public static void main(String[] args) {
        Test1 test = new Test1();
        test.sayNick("fool");
        test.sayNick("genious");
    }
}
